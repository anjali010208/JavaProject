package com.mycompany.pack1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Comparator;

public class pqueue_Comparator implements Comparator<User> {
    @Override 
    public int compare(User u1, User u2)  
    {
        try{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date d1_s = sdf.parse(u1.std);
        Date d1_r = sdf.parse(u1.rtd);
        Date d2_s = sdf.parse(u2.std);
        Date d2_r = sdf.parse(u2.rtd);
        if(d1_s.equals(d2_s) && d1_r.equals(d2_r))
        {
            if(Integer.parseInt(u1.dep.replace(",", ""))==Integer.parseInt(u2.dep.replace(",", "")))
                return 0;
            if(Integer.parseInt(u1.dep.replace(",", ""))<Integer.parseInt(u2.dep.replace(",", "")))
                return 1;
            if(Integer.parseInt(u1.dep.replace(",", ""))>Integer.parseInt(u2.dep.replace(",", "")))
                return -1;
        }
        else if(u1.difference()<u2.difference())
        {
            return -1;
        }
        else if(u1.difference()>u2.difference())
        {
            return 1;
        }  
      }
        catch(ParseException E) {}
        return 0;
    }
}
