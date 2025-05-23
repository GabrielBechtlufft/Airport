/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.gabriel.airports.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author ppjata
 */
@Entity
@Table(name="airport")
public class Airport {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String city;
    private String country;
    
    @Column(name = "iatacode")
    private String iataCode;
    
    @Column(name="icaocode")
    private String icaocode;
    
    private double latitude;
    private double longitude;
    private double altitude;
    
    @Column(name = "offsetutc")
    private double offsetFromUTC;
    
    @Column(name = "dstcode")
    private String dstCode;
    private String timezone;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public void setIcaocode(String icaocode) {
        this.icaocode = icaocode;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public void setOffsetFromUTC(double offsetFromUTC) {
        this.offsetFromUTC = offsetFromUTC;
    }

    public void setDstCode(String dstCode) {
        this.dstCode = dstCode;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getIataCode() {
        return iataCode;
    }

    public String getIcaocode() {
        return icaocode;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public double getOffsetFromUTC() {
        return offsetFromUTC;
    }

    public String getDstCode() {
        return dstCode;
    }

    public String getTimezone() {
        return timezone;
    }
}
