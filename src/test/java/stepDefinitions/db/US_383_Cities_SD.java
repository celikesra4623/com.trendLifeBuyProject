package stepDefinitions.db;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

public class US_383_Cities_SD {
    @When("Verify if the desired brand {string} is in the Cities table")
    public void verifyIfTheDesiredBrandIsInTheCitiesTable(String cityName) {
        String query2="SELECT name FROM u480337000_tlb_training.cities WHERE name like 'R%'";
        List<Object> citiesStarWithA = DBUtils.getColumnData(query2, "name");

        for (int i = 0; i < citiesStarWithA.size(); i++) {
            Assert.assertTrue(((String) citiesStarWithA.get(i)).toLowerCase().startsWith("r"));
        }
 //       System.out.println("R ile baslayan sehirler :"  + citiesStarWithA);

    }
}
