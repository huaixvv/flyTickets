package com.zx.back.model;

import java.util.Date;
import java.util.List;

public class Orders {

    private List<Flight> flights;

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.oid
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    private Integer oid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.oTime
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    private Date otime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.uno
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    private String uno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.fno
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    private String fno;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.oid
     *
     * @return the value of orders.oid
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.oid
     *
     * @param oid the value for orders.oid
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.oTime
     *
     * @return the value of orders.oTime
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public Date getOtime() {
        return otime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.oTime
     *
     * @param otime the value for orders.oTime
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public void setOtime(Date otime) {
        this.otime = otime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.uno
     *
     * @return the value of orders.uno
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public String getUno() {
        return uno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.uno
     *
     * @param uno the value for orders.uno
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public void setUno(String uno) {
        this.uno = uno == null ? null : uno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.fno
     *
     * @return the value of orders.fno
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public String getFno() {
        return fno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.fno
     *
     * @param fno the value for orders.fno
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public void setFno(String fno) {
        this.fno = fno == null ? null : fno.trim();
    }

    @Override
    public String toString() {
        return "Orders{" +
                "otime=" + otime +
                ", fno='" + fno + '\'' +
                '}';
    }

}