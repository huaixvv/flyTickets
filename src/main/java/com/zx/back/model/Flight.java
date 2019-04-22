package com.zx.back.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Flight {


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flight.fid
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    private String fid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flight.fBegin
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    private String fbegin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flight.fEnd
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    private String fend;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flight.sTime
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    private Date stime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flight.eTime
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    private Date etime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flight.price
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column flight.
seatsum
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    private Integer seatsum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flight.fid
     *
     * @return the value of flight.fid
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    public String getFid() {
        return fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flight.fid
     *
     * @param fid the value for flight.fid
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flight.fBegin
     *
     * @return the value of flight.fBegin
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    public String getFbegin() {
        return fbegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flight.fBegin
     *
     * @param fbegin the value for flight.fBegin
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    public void setFbegin(String fbegin) {
        this.fbegin = fbegin == null ? null : fbegin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flight.fEnd
     *
     * @return the value of flight.fEnd
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    public String getFend() {
        return fend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flight.fEnd
     *
     * @param fend the value for flight.fEnd
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    public void setFend(String fend) {
        this.fend = fend == null ? null : fend.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flight.sTime
     *
     * @return the value of flight.sTime
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    public Date getStime() {
        return stime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flight.sTime
     *
     * @param stime the value for flight.sTime
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    public void setStime(Date stime) {
        this.stime = stime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flight.eTime
     *
     * @return the value of flight.eTime
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    public Date getEtime() {
        return etime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flight.eTime
     *
     * @param etime the value for flight.eTime
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    public void setEtime(Date etime) {
        this.etime = etime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flight.price
     *
     * @return the value of flight.price
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flight.price
     *
     * @param price the value for flight.price
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column flight.seatsum
     *
     * @return the value of flight.seatsum
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    public Integer getseatsum() {
        return seatsum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column flight.seatsum
     *
     * @paramseatsum the value for flight.seatsum
     *
     * @mbggenerated Fri Apr 12 17:51:48 CST 2019
     */
    public void setseatsum(Integer seatsum) {
        this.seatsum = seatsum;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "fid='" + fid + '\'' +
                ", fbegin='" + fbegin + '\'' +
                ", fend='" + fend + '\'' +
                ", stime=" + stime +
                ", etime=" + etime +
                ", price=" + price +
                ", seatsum=" + seatsum +
                '}';
    }

//    //格式化日期
//    public String fomatstime(Date stime){
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//        return dateFormat.format(stime);
//    }
//
//    public String fomatetime(Date etime){
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//        return dateFormat.format(etime);
//    }
}