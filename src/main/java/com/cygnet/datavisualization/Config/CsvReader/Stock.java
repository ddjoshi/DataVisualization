package com.cygnet.datavisualization.Config.CsvReader;
import javax.persistence.Id;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
//import java.util.Date;

public class Stock {
	private String Dates;
	private String Open;
	private String High;
	private String Low;
	private String Close;
	public String Adj_close;
	public String Volume;


   /* Date date=new SimpleDateFormat("dd/MM/yyyy").parse(Dates);*/

	public String getDates() {
		return Dates;
	}
	public void setDates(String Dates) {
		this.Dates = Dates;
	}

	public String getOpen() {
		return Open;
	}
	public void setOpen(String Open) {
		this.Open = Open;
	}

	public String getHigh() {
		return High;
	}
	public void setHigh(String High) {
		this.High = High;
	}

	public String getLow() {
		return Low;
	}
	public void setLow(String Low) {
		this.Low = Low;
	}

	public String getClose() { return Close; }
	public void setClose(String Close) {
		this.Close = Close;
	}

	public String getAdj_close() {
		return Adj_close;
	}
	public void setAdj_close(String Adj_close) {
		this.Adj_close = Adj_close;
	}

	public String getVolume() {
		return Volume;
	}
	public void setVolume(String Volume) {
		this.Volume = Volume;
	}


    /*String qui =  insert into stock (adj_close, close, date, high, low, open, volume)
    values (getAdj_close(), getClose(), getDates(), getHigh(), getLow() , getOpen() , getVolume() );*/

   /* String query = " insert into stock (adj_close, close, date, high, low, open, volume)"
            + " values ("+ getAdj_close() + "," +getClose()+","+ getDates()+","+ getHigh()+"," +getLow() +"," +getOpen()+ "," +getVolume()+" )";




    {
        try {
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/datavisualization", "root", "");
            Statement st;
            st = conn.createStatement();
            st.executeUpdate(query);
            System.out.println("Hi");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
   }*/








    @Override
	public String toString(){


        return "\nDate="+getDates()+"::Open="+getOpen()+"::High="+getHigh()+"::Low="+getLow()+"::Close="+getClose()+"::Adj_close="+getAdj_close()+"::Volume="+getVolume();


    }



}
