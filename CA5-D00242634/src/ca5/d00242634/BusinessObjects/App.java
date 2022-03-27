package ca5.d00242634.BusinessObjects;


import ca5.d00242634.DAOs.MySqlRingDao;
import ca5.d00242634.DAOs.RingDaoInterface;
import ca5.d00242634.DTOs.Ring;
import ca5.d00242634.Exceptions.DaoException;
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
            int ID  = 100;
            double price = 35;
            Ring ring = IRingDao.findRingByIDPrice(ID, price);

            if( ring != null )
                System.out.println("Ring found: " + ring);
            else
                System.out.println("Ringname with that password not found");

            ID = 2;
            price = 23;
            ring = IRingDao.findRingByIDPrice(ID, price);
            if(ring != null)
                System.out.println("Ringname: " + ID + " was found: " + ring);
            else
                System.out.println("ID: " + ID + ", price: " + price +" is not valid.");
        }
        catch( DaoException e )
        {
            e.printStackTrace();
        }
    }
}
