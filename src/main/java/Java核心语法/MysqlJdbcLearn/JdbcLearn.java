package Java核心语法.MysqlJdbcLearn;

import java.sql.*;

public class JdbcLearn {

    public static void main(String[] args) {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            con = Java核心语法.MysqlJdbcLearn.MysqlUtil.getConnection();
            String sql = "select * from demo";
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            System.out.println("查询结果:");
            while (rs.next()) {

                String tolal_rate = rs.getString("name");
                System.out.println(tolal_rate);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Java核心语法.MysqlJdbcLearn.MysqlUtil.close(con, stm, rs);
        }
    }
}
