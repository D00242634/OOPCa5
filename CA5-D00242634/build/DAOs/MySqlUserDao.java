package com.dkit.oop.sd2.DAOs;

import com.dkit.oop.sd2.DTOs.Ring;
import com.dkit.oop.sd2.Exceptions.DaoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MySqlRingDao extends MySqlDao implements RingDaoInterface
{

    @Override
    public List<Ring> findAllRings() throws DaoException
    {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        List<Ring> ringsList = new ArrayList<>();

        try
        {
            connection = this.getConnection();

            String query = "SELECT * FROM USER";
            ps = connection.prepareStatement(query);

            resultSet = ps.executeQuery();
            while (resultSet.next())
            {
                int ID = resultSet.getInt("ID");
                String materials = resultSet.getString("materials");
                String available = resultSet.getString("available");
                double price = resultSet.getDouble("price");
                double sizes = resultSet.getDouble("Sizes");
                Ring u = new Ring(ID, materials, available, price, sizes);
                ringsList.add(u);
            }
        } catch (SQLException e)
        {
            throw new DaoException("findAllRingesultSet() " + e.getMessage());
        } finally
        {
            try
            {
                if (resultSet != null)
                {
                    resultSet.close();
                }
                if (ps != null)
                {
                    ps.close();
                }
                if (connection != null)
                {
                    freeConnection(connection);
                }
            } catch (SQLException e)
            {
                throw new DaoException("findAllRings() " + e.getMessage());
            }
        }
        return ringsList;
    }

    @Override
    public Ring findRingByIDPrice(int ID, double price) throws DaoException
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Ring ring = null;
        try
        {
            connection = this.getConnection();

            String query = "SELECT * FROM USER WHERE USERNAME = ? AND PASSWORD = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, ID);
            preparedStatement.setDouble(2, price);

            resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                int ringID = resultSet.getInt("ID");
                String materials = resultSet.getString("materials");
                String available = resultSet.getString("available");
                double ringprice = resultSet.getDouble("price");
                double sizes = resultSet.getDouble("Sizes");

                ring = new Ring(ringId, materials, available, ringprice, sizes);
            }
        } catch (SQLException e)
        {
            throw new DaoException("findRingByRingnamePassword() " + e.getMessage());
        } finally
        {
            try
            {
                if (resultSet != null)
                {
                    resultSet.close();
                }
                if (preparedStatement != null)
                {
                    preparedStatement.close();
                }
                if (connection != null)
                {
                    freeConnection(connection);
                }
            } catch (SQLException e)
            {
                throw new DaoException("findRingByRingnamePassword() " + e.getMessage());
            }
        }
        return ring;
    }
}

