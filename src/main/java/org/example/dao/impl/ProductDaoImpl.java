package org.example.dao.impl;

import org.example.Product;
import org.example.dao.BaseDao;
import org.example.dao.ProductDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl extends BaseDao implements ProductDao {
    @Override
    public int addProduct(Product product) {
        String sql = "insert into products values(?,?,?,?)";
        Object[] objects = {product.getProd_id(),product.getPname(),product.getPrice(),product.getStock()};
        return excuteUpdate(sql,objects);
    }

    @Override
    public Product getSingleProduct(String prod_id) {
        Product product = new Product();
        String sql = "select * from products where prod_id=?";

        ResultSet rs = null;
        try {
            rs = getResultSet(sql,prod_id);

            while (rs.next()){
                try {
                    product.setProd_id(rs.getString("prod_id"));
                    product.setPrice(rs.getDouble("price"));
                    product.setPname(rs.getString("pname"));
                    product.setStock(rs.getInt("stock"));
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return product;
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from products";

        ResultSet rs = null;
        try {
            rs = getResultSet(sql,null);
            while (rs.next()){
                Product product = new Product();
                try {
                    product.setProd_id(rs.getString("prod_id"));
                    product.setPrice(rs.getDouble("price"));
                    product.setPname(rs.getString("pname"));
                    product.setStock(rs.getInt("stock"));
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                list.add(product);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
    }

    @Override
    public int deleteProduct(String prod_id) {
        String sql = "delete from products where prod_id=?";
        Object[] objects = {prod_id};
        return excuteUpdate(sql,objects);
    }
}
