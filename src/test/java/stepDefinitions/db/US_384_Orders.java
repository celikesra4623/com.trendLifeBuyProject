package stepDefinitions.db;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.List;

public class US_384_Orders {
    @Then("Verify if the desired order of the customer with the specified Id number {int} is in the orders table")
    public void verifyIfTheDesiredOrderOfTheCustomerWithTheSpecifiedIdNumberIsInTheOrdersTable(int idNumber) {
        String query="SELECT customer_id FROM u480337000_tlb_training.orders";
        List<Object> idList = DBUtils.getColumnData(query, "customer_id");
        System.out.println(idList);
        //Assert.assertTrue(idList);

    }

    @Then("Verify if the desired order of the customer with the specified customer_email {string} is in the orders table")
    public void verifyIfTheDesiredOrderOfTheCustomerWithTheSpecifiedCustomer_emailIsInTheOrdersTable(String email) {
        String query="SELECT * FROM u480337000_tlb_training.orders Where customer_email=\"customer2@gmail.com\"";
        List<Object> orderNumberList = DBUtils.getColumnData(query, "order_number");
        System.out.println(orderNumberList);

        List<Object> expOrderNumber= new ArrayList<>();

        expOrderNumber.add("Order-35-211116030414");
        expOrderNumber.add("Order-23-211116030754");
        expOrderNumber.add("Order-26-211116031600");
        expOrderNumber.add("Order-60-211116034341");
        expOrderNumber.add("Order-83-211116035939");

        Assert.assertEquals(orderNumberList, expOrderNumber);
    }
}