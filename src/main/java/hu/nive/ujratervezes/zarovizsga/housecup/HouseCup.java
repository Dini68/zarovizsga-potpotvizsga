package hu.nive.ujratervezes.zarovizsga.housecup;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HouseCup {

    private DataSource dataSource = new MariaDbDataSource();

    public HouseCup(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public long getPointsOfHouse(String house) {
        long result = 0;
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("SELECT points_earned FROM house_points " +
                        "WHERE house_name = ?");
        ) {
            return getPointsOfHouse(house, result, ps);
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot select country", se);
        }
    }

    private long getPointsOfHouse(String house, long result, PreparedStatement ps) throws SQLException {
        ps.setString(1, house);
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                result += rs.getLong("points_earned");
            }
        }
        return result;
    }

}
