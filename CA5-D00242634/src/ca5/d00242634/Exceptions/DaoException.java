package ca5.d00242634.Exceptions;

import java.sql.SQLException;

public class DaoException extends SQLException
{
    public DaoException()
    {

    }

    public DaoException(String aMessage)
    {
        super(aMessage);
    }
}
