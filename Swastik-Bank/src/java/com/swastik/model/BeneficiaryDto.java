package com.swastik.model;

import com.swastik.service.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
<<<<<<< HEAD
import java.sql.SQLException;
=======
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35

/**
 *
 * @author Sohan_Maali
 */
public class BeneficiaryDto {

    public boolean addBeneficiary(BeneficiaryDao bDao) {
        boolean flag = false;
        Connection con = GetConnection.getConnectin();
        if (con != null) {
            try {
<<<<<<< HEAD
                String query = "insert into Beneficiary(Beneficiary_Name, Bank, ifsc, Account_Num, Limit) values(?, ?, ?, ?, ?)";
=======
                String query = "INSERT INTO Beneficiary (Beneficiary_Name, Bank, `ifsc`, Account_Num, `Limit`)VALUES (?, ?, ?, ?, ?)";
>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
                PreparedStatement psmt = con.prepareStatement(query);
                psmt.setString(1, bDao.getName());
                psmt.setString(2, bDao.getBank());
                psmt.setString(3, bDao.getIfsc());
                psmt.setString(4, bDao.getAccNum());
                psmt.setString(5, bDao.getLimit());
                psmt.executeUpdate();
                flag = true;
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
<<<<<<< HEAD
        System.out.println(flag+"--------beni");
=======
        System.out.println(flag + "--------beni");
        return flag;
    }

    public boolean getAllBeneficiary(ArrayList<BeneficiaryDao> beneficiaryDao) {
        boolean flag = false;
        Connection con = GetConnection.getConnectin();

        if (con != null) {
            try {
                String query = "select * from Beneficiary";
                PreparedStatement psmt = con.prepareStatement(query);
                ResultSet set = psmt.executeQuery();
                while (set.next()) {
                    BeneficiaryDao bDao = new BeneficiaryDao();
                    bDao.setBeneId(set.getInt("Beneficiary_Id"));
                    bDao.setName(set.getString("Beneficiary_Name"));
                    bDao.setBank(set.getString("Bank"));
                    bDao.setIfsc(set.getString("ifsc"));
                    bDao.setAccNum(set.getString("Account_Num"));
                    bDao.setLimit(set.getString("Limit"));
                    beneficiaryDao.add(bDao);
                    flag = true;
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
        return flag;
    }

    public boolean deleteBeneficiary(BeneficiaryDao bDao) {
        //Wrong
        boolean flag = false;
        Connection con = GetConnection.getConnectin();
        if (con != null) {
            try {
<<<<<<< HEAD
                String query = "insert into Beneficiary(Beneficiary_Id) values(?, ?, ?, ?, ?,)";
                PreparedStatement psmt = con.prepareStatement(query);
                psmt.setString(1, bDao.getName());
                psmt.executeUpdate();
                flag = true;
=======
                String query = "DELETE FROM Beneficiary WHERE Account_Num = ? AND Beneficiary_Id = ?";
                PreparedStatement psmt = con.prepareStatement(query);
                psmt.setString(1, bDao.getAccNum());
                psmt.setInt(2, bDao.getBeneId());

                if (psmt.executeUpdate() > 0) {
                    flag = true;
                }
>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return flag;
    }
}
