package apitest;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
public class Demo {
    @Test
    public void testSql() {
        {
            String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//            String driverName = "com.mysql.jdbc.Driver";

            String dbURL = "jdbc:sqlserver://192.168.9.129;databaseName=ComBeziWfs";
//            String dbURL = "jdbc:mysql://tttttt.com:6823/footballday?characterEncoding=utf8";

            String userName = "writeuser";

            String userPwd = "write@520";

            try

            {

                Class.forName(driverName);

                Connection dbConn = DriverManager.getConnection(dbURL, userName, userPwd);

                System.out.println("连接数据库成功");

            } catch (Exception e)

            {

                e.printStackTrace();

                System.out.print("连接失败");

            }
        }
    }

    @Test
    public void testSql2() {
        {
            String driverName = "net.sourceforge.jtds.jdbc.Driver";

            String dbURL = "jdbc:jtds:sqlserver://192.168.9.129;databaseName=ComBeziWfs";

            String userName = "writeuser";

            String userPwd = "write@520";

            try

            {

                Class.forName(driverName);

                Connection dbConn = DriverManager.getConnection(dbURL, userName, userPwd);

                System.out.println("连接数据库成功");

            } catch (Exception e)

            {

                e.printStackTrace();

                System.out.print("连接失败");

            }
        }
    }
}
