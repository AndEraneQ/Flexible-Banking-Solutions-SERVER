<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>

<!-- Card: Payment Card -->
      <div class="card payment-card">
        <!-- Card Body -->
        <div class="card-body">
          <!-- Form Group -->
          <div class="form-group mb-2">
            <label for=""> Account Holder / Beneficiary</label>
            <input type="text" name="beneficiary" class="form-control"
              placeholder="Enter Account holder / Beneficiary name">
          </div>
          <!-- End Of Form Group -->

          <!-- Form Group -->
          <div class="form-group mb-2">
            <label for=""> Beneficiary Account Number</label>
            <input type="text" name="account_number" class="form-control" placeholder="Enter Beneficiary Account No">
          </div>
          <!-- End Of Form Group -->

          <!-- Form Group -->
          <div class="form-group">
            <label for="">Select Account</label>
            <!-- Select Account Option -->
            <select name="account_id" class="form-control" id="">
              <option value="">-- Select Account --</option>
            </select>
            <!-- End Of Select Account Option -->

          </div>
          <!-- End Of Form Group -->

          <!-- Form Group -->
          <div class="form-group mb-2">
            <label for="">Reference</label>
            <input type="text" name="reference" class="form-control" placeholder="Enter Reference">
          </div>
          <!-- End Of Form Group -->

          <!-- Form Group -->
          <div class="form-group mb-2">
            <label for="">Enter Payment Amount</label>
            <input type="text" name="payment_amount" class="form-control" placeholder="Enter Payment Amount">
          </div>
          <!-- End Of Form Group -->

          <!-- Form Group -->
          <div class="form-group mb-2">
            <button id="transact-btn" class="btn btn-md">Pay</button>
          </div>
          <!-- End Of Form Group -->


        </div>
        <!-- End Of Card Body -->

      </div>
      <!-- End Of Card: Payment Card -->