package com.cygnet.datavisualization.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="stock")
public class Stockdata
{



    @Id
    @GeneratedValue
    @Column(name="stock_id")
    private Long id;

    @Column(name="date")
    private String Dates;

    @Column(name="open")
    private String Open;

    @Column(name="high")
    private String High;

    @Column(name="low")
    private String Low;

    @Column(name="close")
    private String Close;

    @Column(name="adj_close")
    private String Adj_close;

    @Column(name="volume")
    private String Volume;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   /* public String getDates() {
        return Dates;
    }*/

    public void setDates(String dates) {
        this.Dates = dates;
    }

    /*public String getOpen() {
        return Open;
    }*/

    public void setOpen(String open) {
        this.Open = open;
    }

    /*public String getHigh() {
        return High;
    }*/

    public void setHigh(String high) {
        this.High = high;
    }

    /*public String getLow() {
        return Low;
    }
*/
    public void setLow(String low) {
        this.Low = low;
    }

  /*  public boolean isClose() {
        return Close;
    }*/

    public void setClose(String close) {
        this.Close = close;
    }

   /* public boolean isAdj_close() {
        return Adj_close;
    }*/

    public void setAdj_close(String adj_close) {
        this.Adj_close = adj_close;
    }

    /*public boolean isVolume() {
        return Volume;
    }*/

    public void setVolume(String volume) {
        this.Volume = volume;
    }
}
