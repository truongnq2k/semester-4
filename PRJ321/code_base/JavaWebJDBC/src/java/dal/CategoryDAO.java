/*
 * The MIT License
 *
 * Copyright 2021 admin.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Category;

/**
 *
 * @author admin
 */
public class CategoryDAO extends DBContext {

    // Get all
    public List<Category> getAll() {
        List<Category> list = new ArrayList<>();
        String sql = "SELECT * FROM   categories";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category c = new Category();
                c.setId(rs.getString(1));
                c.setName(rs.getString(2));
                c.setDescribe(rs.getString(3));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    // Delete a category
    public void delete(String id) {
        String sql = "DELETE  FROM  categories WHERE ID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // Check id existed => return false if id exsited
    public boolean check(String id) {
        String sql = "SELECT * FROM  categories  WHERE ID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    // add new category
    public void insert(Category c) {
        String sql = "INSERT INTO categories VALUES(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getId());
            ps.setString(2, c.getName());
            ps.setString(3, c.getDescribe());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // lay du lieu goc dien vao bang chinh sua
    public Category getCatByID(String id) {
        String sql = "SELECT * FROM categories WHERE ID=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Category(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    // edit data
    public void update(Category c) {
        String sql = "UPDATE categories SET name=?, describe=? WHERE ID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getName());
            ps.setString(2, c.getDescribe());
            ps.setString(3, c.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // Main to test connection
    public static void main(String[] args) {
        CategoryDAO c = new CategoryDAO();
        List<Category> list = c.getAll();
        System.out.println(list.get(0).getName());
    }
}
