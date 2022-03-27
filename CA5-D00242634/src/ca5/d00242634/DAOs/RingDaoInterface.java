package ca5.d00242634.DAOs;

import ca5.d00242634.DTOs.Ring;
import ca5.d00242634.Exceptions.DaoException;
import java.util.List;

public interface RingDaoInterface
{
    public List<Ring> findAllRings() throws DaoException;

    public Ring findRingByIDPrice(int ID, double price) throws DaoException;

}

