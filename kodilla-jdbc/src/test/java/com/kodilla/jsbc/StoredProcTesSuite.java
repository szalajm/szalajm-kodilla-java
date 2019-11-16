package com.kodilla.jsbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcTesSuite   {

    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "CALL UpdateVipLevel()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL = \"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if(rs.next()){
            howMany = rs.getInt("HOW_MANY");
        }
        Assert.assertEquals(0, howMany);
    }

    @Test
    public void testUpdateBestsellers () throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER= false";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "CALL UpdateBestseller()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER = false";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if(rs.next()){
            howMany = rs.getInt("HOW_MANY");
        }
        Assert.assertEquals(1, howMany);

    }


}
