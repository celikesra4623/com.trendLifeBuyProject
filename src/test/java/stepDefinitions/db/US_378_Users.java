package stepDefinitions.db;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

public class US_378_Users {
    List<Object> allPhoneInList;

    @When("DB User saves all phone numbers from Users table in a List")
    public void db_user_saves_all_phone_numbers_from_users_table_in_a_list() {
        String query = "SELECT distinct phone FROM u480337000_tlb_training.users";
        allPhoneInList = DBUtils.getColumnData(query, "phone");
    }

    @Then("Verify that {string} phone number exist in the list")
    public void verify_that_phone_number_exist_in_the_list(String phoneNumber) {
        Assert.assertTrue(allPhoneInList.contains(phoneNumber));
    }

}
