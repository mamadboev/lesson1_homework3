package config;

import models.List;

import java.sql.*;

public class Db_config {
   private String url = "jdbc:postgresql://localhost:5432/computer_db";
   private String db_user = "db_user";
   private String db_password = "db_password";

   public void getList(String TableName){
      try {
         Connection connection = DriverManager.getConnection(url,db_user,db_password);
         Statement statement = connection.createStatement();
         String sql = "select product.maker, "+TableName+".model, "+TableName+".price from "+TableName+
                 " join product on product.model="+TableName+".model order by "+TableName+".price";

         ResultSet resultSet = statement.executeQuery(sql);
         while(resultSet.next()){
            String maker = resultSet.getString(1);
            String model = resultSet.getString(2);
            String price = resultSet.getString(3);
            List list = new List(maker, model, price);
            System.out.println(list);
         }
      } catch (SQLException throwables) {
         throwables.printStackTrace();
      }

   }

}
