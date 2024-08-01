package queries;

import utilities.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Q_Countries {

    public static ResultSet selectCountryById(int id) {
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement prepStatment = connection.prepareStatement("SELECT * FROM u480337000_tlb_training.countries where id=?");
            prepStatment.setInt(1, id);
            return prepStatment.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static ResultSet selectCitiesById(int id) {
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement prepStatment = connection.prepareStatement("SELECT * FROM u480337000_tlb_training.cities where id=?");
            prepStatment.setInt(1, id);
            return prepStatment.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);

        }
    }
}