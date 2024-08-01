package stepDefinitions.db;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import queries.Q_Countries;

import java.sql.ResultSet;
import java.sql.SQLException;

public class US_382_Countries {

    @Then("Verify country name is {string} and phone code is {int} by given id {int} from country table")
    public void verify_country_name_is_and_phone_code_is_by_given_id_from_country_table(String countryName, int phoneCode, Integer id) throws SQLException {

        ResultSet rs = Q_Countries.selectCountryById(id);
        rs.next();
        Assert.assertEquals(countryName, rs.getString("name"));
        Assert.assertEquals(phoneCode, rs.getInt("phonecode"));
    }

}
