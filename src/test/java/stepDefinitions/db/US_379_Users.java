package stepDefinitions.db;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.DBUtils;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class US_379_Users {
    @Then("verify the ID, name, surname, email and role_id of the user whose {string} is given")
    public void verify_the_id_name_surname_email_and_role_id_of_the_user_whose_is_given(String string) throws SQLException {
        String query= ConfigReader.getProperty("mbicerQuery");

        ResultSet resultSet = DBUtils.executeQuery(query);
        resultSet.next();

        //System.out.println("actRowIDList = " + actRowIDList);
        List<Object> expIDlist= Arrays.asList(new BigInteger("2"),"Admin","User","admin@gmail.com",new BigInteger("1"));
        System.out.println("expIDlist = " + expIDlist);

        //Assert.assertEquals("actList does not contain explist",expIDlist,actRowIDList);

        for (int i = 0; i < expIDlist.size(); i++) {
            Object object = resultSet.getObject(i + 1);
            Assert.assertEquals((expIDlist.get(i)),object);
        }
    }
}
