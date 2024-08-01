package stepDefinitions.db;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

public class US_380_Brands_SD {
    @Then("Verify if the desired brand {string} is in the Brand table")
    public void verify_if_the_desired_brand_is_in_the_brand_table(String marka) {
        String query="SELECT name FROM u480337000_tlb_training.brands";
        List<Object> markaList = DBUtils.getColumnData(query, "name");
 //       System.out.println(markaList);
        Assert.assertTrue(markaList.contains(marka));

    }
}
