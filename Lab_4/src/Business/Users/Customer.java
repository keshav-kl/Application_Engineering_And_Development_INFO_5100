/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.ProductDirectory;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer extends User implements Comparable<Customer>{
    
    private Date date;
    
    private ProductDirectory prodDir;
    
    public Customer(String password, String userName)
    {
        super(password,userName, "Customer");
        prodDir = new ProductDirectory();
        date = new Date();
    }
    
    public ProductDirectory getDirectory()
    {
        return prodDir;
    }
    
    public void setDirectory(ProductDirectory prodDir)
    {
        this.prodDir = prodDir;
    }

    @Override
    public int compareTo(Customer c)
    {
        return c.getUserName().compareTo(this.getUserName());
    }
    
    @Override
    public String toString()
    {
        return getUserName();
    }
    
    
    
    public boolean verify(String password) {
       if(password.equals(getPassword()))
       {
           return true;
       }
            return false;//To change body of generated methods, choose Tools | Templates.
    }

    public Date getDate()
    {
        return this.date;
    }
    
}
