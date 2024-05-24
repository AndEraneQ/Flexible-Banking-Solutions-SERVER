package com.demo_bank_v1.controllers;

import com.demo_bank_v1.models.User;
import com.demo_bank_v1.repository.AccountRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/transact")
public class TransactController {

    @Autowired
    private AccountRepository accountRepository;

    private User user;
    private double currentBalance;
    private double newBalance;

    @PostMapping("/deposit")
    public String deposit(@RequestParam("deposit_amount")String depositAmount,
                          @RequestParam("account_id")String accountID,
                          HttpSession session,
                          RedirectAttributes redirectAttributes){

        // TODO: CHECK FOR EMPTY STRINGS:
        if(depositAmount.isEmpty() || accountID.isEmpty()){
            redirectAttributes.addFlashAttribute("error","Deposit Amount or Account Depositing to Cannot Be Empty");
            return "redirect:/app/dashboard";
        }
        // TODO: GET LOGGED IN USER:
        user = (User)session.getAttribute("user");

        // TODO: GET CURRENT ACCOUNT BALANCE:
        int acc_id = Integer.parseInt(accountID);
        double depositAmountValue = Double.parseDouble(depositAmount);
        currentBalance = accountRepository.getAccountBalance(user.getUser_id(), acc_id);

        // TODO: CHECK IF DEPOSIT AMOUNT IS 0:

        if(depositAmountValue == 0){
            redirectAttributes.addFlashAttribute("error","Deposit Amount Cannot Be of 0 Value");
            return "redirect:/app/dashboard";
        }

        // TODO: UPDATE BALANCE:
        newBalance = currentBalance + depositAmountValue;
        accountRepository.changeAccountBalanceById(newBalance,acc_id);

        redirectAttributes.addFlashAttribute("success","Amount Deposited Successfully");
        return "redirect:/app/dashboard";

    }
    @PostMapping("/transfer")
    public String transfer(@RequestParam("transfer_from") String transfer_from,
                           @RequestParam("transfer_to") String transfer_to,
                           @RequestParam("transfer_amount") String transfer_amount,
                           HttpSession session,
                           RedirectAttributes redirectAttributes){

        // TODO: CHECK FOR EMPTY FIELDS:
        if(transfer_from.isEmpty() || transfer_to.isEmpty() || transfer_amount.isEmpty()){
            redirectAttributes.addFlashAttribute("error","You need to complete all fields!");
            return "redirect:/app/dashboard";
        }
        // TODO: CONVERT VARIABLES:
        int transferFromId = Integer.parseInt(transfer_from);
        int transferToId = Integer.parseInt(transfer_to);
        double transferAmount = Double.parseDouble(transfer_amount);

        //TODO: CHECK IF TRANSFERRING INTO THE SAME ACCOUNT:

        if(transferFromId == transferToId){
            redirectAttributes.addFlashAttribute("error","Cannot Transfer Into The Same Account!");
            return "redirect:/app/dashboard";
        }

        // TODO: CHECK FOR 0 VALUES:
        if(transferAmount == 0){
            redirectAttributes.addFlashAttribute("error","You Cannot Transfer Amount of 0 Value");
            return "redirect:/app/dashboard";
        }

        //TODO: GET LOGGED IN USER:
        user = (User)session.getAttribute("user");

        // TODO: GET CURRENT BALANCE
        double currentBalanceOfAccountTrasferringFrom = accountRepository.getAccountBalance(user.getUser_id(), transferFromId);
        double currentBalanceOfAccountTrasferringTo = accountRepository.getAccountBalance(user.getUser_id(), transferToId);

        // TODO: SET NEW BALANCE
        double newBalanceOfAccountTransferringFrom = currentBalanceOfAccountTrasferringFrom-transferAmount;
        double newBalanceOfAccountTransferringTo = currentBalanceOfAccountTrasferringTo + transferAmount;

        // Change The Balance Of The Account Transferring from
        accountRepository.changeAccountBalanceById(newBalanceOfAccountTransferringFrom,transferFromId);

        // Change The Balance Of The Account Transferring to
        accountRepository.changeAccountBalanceById(newBalanceOfAccountTransferringTo,transferToId);

        redirectAttributes.addFlashAttribute("success","Amount Transferred Successfully!");
        return "redirect:/app/dashboard";
    }

    @PostMapping("/withdraw")
    public String withdraw(@RequestParam("withdraw_amount")String withdraw_amount,
                           @RequestParam("account_id") String account_id,
                           HttpSession session,
                           RedirectAttributes redirectAttributes){

        // TODO: CHECK FOR EMPTY VALUES:
        if(withdraw_amount.isEmpty() || account_id.isEmpty()){
            redirectAttributes.addFlashAttribute("error","You need to complete all fields!");
            return "redirect:/app/dashboard";
        }
        // TODO: COVERT VARIABLES:
        double withdrawalAmount = Double.parseDouble(withdraw_amount);
        int accountID = Integer.parseInt(account_id);

        // TODO: CHECK FOR 0 VALUES:
        if(withdrawalAmount==0){
            redirectAttributes.addFlashAttribute("error","You Cannot Withdraw Amount of 0 Value");
            return "redirect:/app/dashboard";
        }
        // TODO: GET LOGGED IN USER
        user = (User) session.getAttribute("user");

        // TODO: GET CURRENT BALANCE
        currentBalance = accountRepository.getAccountBalance(user.getUser_id(),accountID);

        // TODO: SET NEW BALANCE;
        newBalance = currentBalance - withdrawalAmount;
        accountRepository.changeAccountBalanceById(newBalance,accountID);

        redirectAttributes.addFlashAttribute("success","Withdrawal Successfully!");
        return "redirect:/app/dashboard";
    }
}
