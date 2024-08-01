package stepDefinitions.db;

import com.mysql.cj.result.RowList;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import queries.Q_Countries;
import utilities.DBUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class US_385_Compares_SD {
    @Then("Save and verify customer id {int} {string} {string} {string} {string} {string} {string} in a list")
    public void saveAndVerifyCustomerIdInAList(int givenId, String customer_id, String product_sku_id, String data_type,
                                               String product_type, String created_at, String updated_at) throws SQLException {
       String query="SELECT * FROM u480337000_tlb_training.compares";
       ResultSet resultSet = DBUtils.executeQuery(query);
        List<List<Object>> queryResultList = DBUtils.getQueryResultList(query);


     System.out.println("****************************************************");
        String queryId="SELECT * FROM u480337000_tlb_training.compares where id=7";
        List<Object> rowList = DBUtils.getRowList(queryId);
        System.out.println(rowList);

        Assert.assertTrue(queryResultList.contains(rowList));

    }
}
