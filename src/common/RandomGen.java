/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import DBConnection.DBConnect;
import com.db4o.ObjectSet;
import java.util.Random;
import model.Employee;

/**
 *
 * @author harsh
 */
public class RandomGen {
    public long rand()
    {
        int min = 100000;
        int max = 10000000;
        if (min > max || (max - min + 1 > Long.MAX_VALUE)) {
            throw new IllegalArgumentException("Invalid range");
        }
 
        return new Random().nextLong(max - min + 1) + min;
    }
     
    public long getRandomEmployeeId()
    {
        long newID;
        boolean isNotUnique = true;
        DBConnect dbConnect = new DBConnect();
        dbConnect.open();
        ObjectSet result = dbConnect.queryByExample(Employee.class);
        
        do {
            newID = rand();
            for(Object o : result) {

                Employee e = (Employee) o;
                if(e.getEmployeeId() == rand()) {
                    isNotUnique = false;
                    break;
                }
                else {
                    isNotUnique = true;
                }
            }
        } while(!isNotUnique);
        
        dbConnect.close();
        return newID;

    }
}
