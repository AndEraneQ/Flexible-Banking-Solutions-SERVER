<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>

<!-- Card: transfer Card -->
      <div class="card transfer-card">
        <!-- Card Body -->
        <div class="card-body">
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
            <label for="">Enter deposit Amount</label>
            <input type="text" name="transfer_amount" class="form-control" placeholder="Enter Transfer Amount">
          </div>
          <!-- End Of Form Group -->

          <!-- Form Group -->
          <div class="form-group mb-2">
            <button id="transact-btn" class="btn btn-md ">deposit</button>
          </div>
          <!-- End Of Form Group -->

        </div>
        <!-- End Of Card Body -->

      </div>
      <!-- End Of Card: Transfer Card -->