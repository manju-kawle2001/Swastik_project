<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.swastik.model;

=======
package com.swastik.model;

import com.swastik.service.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
/**
 *
 * @author Sohan_Maali
 */
public class BranchDto {
<<<<<<< HEAD
    
=======

    public boolean getAllBranch(ArrayList<BranchDao> branchDao) {
        boolean flag = false;
        Connection con = GetConnection.getConnectin();

        if (con != null) {
            try {
                String query = "select * from Branch";
                PreparedStatement psmt = con.prepareStatement(query);
                ResultSet set = psmt.executeQuery();
                while (set.next()) {
                    BranchDao bDao = new BranchDao();
                    bDao.setBranchId(set.getInt("Branchid"));
                    bDao.setIfscCode(set.getString("ifsc"));
                    bDao.setBranchName(set.getString("Branch_name"));
                    bDao.setBranchAddess(set.getString("Branch_Address"));
                    branchDao.add(bDao);
                    flag = true;
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return flag;
    }
>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
}
