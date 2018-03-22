package com.cygnet.datavisualization.Config.CsvReader;
import java.sql.Connection;
import java.sql.PreparedStatement;


import java.sql.*;

public class Dbconn extends Stock {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3307/datavisualization";

    static final String USER = "root";
    static final String PASS = "";

    public void dbconn()
    {



        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            if(conn!= null) {
                System.out.println("Connected database successfully...");
            }
            else
            {
                System.out.print("error in connection");
            }
            //STEP 4: Execute a query
            System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();
//zest id bol skype pr

            String sql = "INSERT INTO stock (adj_close,close, date,high,low,open,volume) VALUES (?, ?, ?, ?,?,?,?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            final int batchSize = 5333;
            int count = 0;
             {
                statement.setString(1, getAdj_close());
                statement.setString(2, getClose());
                statement.setString(3, getDates());
                statement.setString(4, getHigh());
                statement.setString(5, getLow());
                statement.setString(6, getOpen());
                statement.setString(7, getVolume());
                statement.addBatch();

                 if(++count % batchSize == 0) {
                     statement.executeBatch();
                 }
            }
                statement.executeBatch();
                statement.close();
                conn.close();

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
            else
            {
                System.out.println("erroe in insert");//run
            }

//run kr

           // String sql = "INSERT INTO stock " +
             //       "VALUES ('"+ getAdj_close() + "','" +getClose()+"','"+ getDates()+"','"+ getHigh()+"','" +getLow() +"','" +getOpen()+ "','" +getVolume()+"' )";

 /* String query = " insert into stock (adj_close, close, date, high, low, open, volume)"
            + " values ("+ getAdj_close() + "," +getClose()+","+ getDates()+","+ getHigh()+"," +getLow() +"," +getOpen()+ "," +getVolume()+" )";*/

            //sql ni syntax barabar che?

           // stmt.executeUpdate(sql);

            //stmt.executeUpdate(sql);
            //System.out.println("Inserted records into the table...");

        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }// do nothing
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }
}
