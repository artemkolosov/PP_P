package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;


public class Util {
    private static final String URL = "jdbc:mysql://89.111.152.140:3306/testdb";
    // адрес удаленной БД на виртуальном облачном сервере
    private static final String USERNAME = "otello";
    private static final String PASSWORD = "otello";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    //подключение к БД
    public static Connection connect() {
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Удаленная БД подключена");
            return connection;
        } catch (Exception e) {
            throw new RuntimeException("Хьюстон! У нас проблемы!   " + e.getMessage());
        }

    }

}


