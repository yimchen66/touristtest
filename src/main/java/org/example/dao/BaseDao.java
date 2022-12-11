package org.example.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class BaseDao {

    private static String driver;
    private static String url;
    private static String username;
    private static String password;
    private static final String TAG = "chen";

    //从配置文件读取数据库信息
    static {
        Properties params = new Properties();
        String configfile = "database.properties";

        InputStream is = BaseDao.class.getClassLoader().getResourceAsStream(configfile);
        try {
            params.load(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        driver = params.getProperty("driver");
//        url = params.getProperty("url") + params.getProperty("dbname");
//        username = params.getProperty("username");
//        password = params.getProperty("password");
        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/postgres?useSSL=false";
        username = "root";
        password = "root";
    }

    //获取数据库连接
    public Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //执行数据库
    public int excuteUpdate(String sql,Object...objects) {
        int count = 0;
        Connection connection = getConnection();
        PreparedStatement ps = null;

        try {
            //设置SQL参数
            ps = connection.prepareStatement(sql);

            for(int i=0;i<objects.length;i++)
                ps.setObject(i+1,objects[i]);

            count = ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return count;
    }

    public ResultSet getResultSet(String sql,Object...objects) {
        ResultSet resultSet = null;
        Connection connection = getConnection();
        PreparedStatement ps = null;

        try {
            //设置SQL参数
            ps = connection.prepareStatement(sql);

            if(objects != null)
                for(int i=0;i<objects.length;i++)
                    ps.setObject(i+1,objects[i]);

            resultSet = ps.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return resultSet;
    }

    //释放连接
    public void closeAll(ResultSet rs, Statement stmt, Connection con) {
        if(null != rs) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(null != stmt) {
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(null != con) {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }


}

