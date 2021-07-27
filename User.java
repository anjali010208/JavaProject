package com.mycompany.pack1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class User{
    public String nameU, std, rtd, dep, phnum, bikeNo, brand;
    public User(String nameU, String std, String rtd, String dep, String phnum)
    {
        this.nameU = nameU;
        this.std = std;
        this.rtd = rtd;
        this.dep = dep;
        this.phnum = phnum;
    }
    public String BikeNo(String bikeNo)
    {
        this.bikeNo = bikeNo;
        return bikeNo;
    }
    public String Brand(String brand)
    {
        this.brand= brand;
        return brand;
    }
    protected long difference() throws ParseException
    {
        long diff = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date d1_s = sdf.parse(std);
        Date d1_r = sdf.parse(rtd);
        long t_diff = d1_r.getTime() - d1_s.getTime();
        diff = (t_diff/(1000*60*60*24))%365;
        return diff;
    } 
    public String getName()
    { 
        return nameU; 
    }
    public String display()
    {
        return("Name : " + nameU + "\nStart Date : " + std + "\nReturn Date : " + rtd + "\nDeposit : " + dep + "\nBike Alloted : Reg No - " + bikeNo + " Brand : " + brand + "\n\n\n" );
    }
}

