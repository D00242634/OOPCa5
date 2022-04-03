package com.dkit.oop.sd2.BusinessObjects;

import com.dkit.oop.sd2.DAOs.MySqlRingDao;
import com.dkit.oop.sd2.DAOs.RingDaoInterface;
import com.dkit.oop.sd2.DTOs.Ring;
import com.dkit.oop.sd2.Exceptions.DaoException;
import java.util.List;

public class App
{
    public static void main(String[] args)
    {
        RingDaoInterface IRingDao = new MySqlRingDao(); 

        try
        {
            System.out.println("\nCall findAllRings()");
            List<Ring> rings = IRingDao.findAllRings();  

            if( rings.isEmpty() )
                System.out.println("There are no Rings");
            else {
                for (Ring ring : rings)
                    System.out.println("Ring: " + ring.toString());
            }

            System.out.println("\nCall: findRingByRingnamePassword()");
            String ringname = "smithj";
            String password = "password";
            Ring ring = IRingDao.findRingByRingnamePassword(ringname, password);

            if( ring != null ) // null returned if ringid and password not valid
                System.out.println("Ring found: " + ring);
            else
                System.out.println("Ringname with that password not found");

            // test dao - with an invalid ringname (i.e. not in database)
            ringname = "madmax";
            password = "thunderdome";
            ring = IRingDao.findRingByRingnamePassword(ringname, password);
            if(ring != null)
                System.out.println("Ringname: " + ringname + " was found: " + ring);
            else
                System.out.println("Ringname: " + ringname + ", password: " + password +" is not valid.");
        }
        catch( DaoException e )
        {
            e.printStackTrace();
        }
    }
}
