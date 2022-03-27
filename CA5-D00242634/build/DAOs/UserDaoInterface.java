package com.dkit.oop.sd2.DAOs;

import com.dkit.oop.sd2.DTOs.Ring;
import com.dkit.oop.sd2.Exceptions.DaoException;
import java.util.List;

public interface RingDaoInterface
{
    public List<Ring> findAllRings() throws DaoException;

    public Ring findRingByIDPrice(int ID, double price) throws DaoException;

}

