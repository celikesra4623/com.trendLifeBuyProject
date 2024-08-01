package stepDefinitions.db;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class US_376_Users {
    @When("DB user creates a user in the user table with the {string} First Name, {string} Last Name, {string} User Name," +
            " {int} Role ID, {string} Email, {string} Password information")
    public void db_user_creates_a_user_in_the_user_table_with_the_first_name_last_name_user_name_role_id_role_id_email_password_information
            (String firstName, String lastName, String userName, int roleID, String email, String password) {
        int resultCode = DBUtils.insertUser(firstName, lastName, userName, String.valueOf(roleID), email, password);
        Assert.assertEquals(1, resultCode);
    }

    @Then("DB user verify that last created user who has {string} username and {string} email addressis is exists")
    public void db_user_verify_that_last_created_user_who_has_username_and_email_addressis_is_exists(String string, String string2) throws SQLException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        String querySelect = "SELECT username, email, created_at FROM u480337000_tlb_training.users where username = 'emins' and email = 'powercoders35@gmail.com' order by created_at desc;";
        ResultSet resultSet = DBUtils.executeQuery(querySelect);
        resultSet.next();

        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);
        String expectedValue = now.format(formatter);

        String actualValue = resultSet.getString("created_at");
        Assert.assertTrue(actualValue.contains(expectedValue));

        String queryDelete = "DELETE FROM u480337000_tlb_training.users where username = 'emins' and email = 'powercoders35@gmail.com'";
        DBUtils.executeUpdate(queryDelete);
    }


}
