/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnection;

/**
 *
 * @author dell
 */
/*import java.util.*;*/
import com.db4o.*;
import com.db4o.ext.ExtObjectSet;
import java.util.ArrayList;
import javax.swing.JFrame;

public class DBConnect {

    ObjectContainer db;

    public DBConnect() {
//        db = Db4o.openFile("./src/DBConnection/db.yap");
//        if (db != null) {
//            Car Obj = new Car();
//            getListOf(Obj);
//        }

    }
    
    public void open()
    {
        db = Db4o.openFile("./src/DBConnection/db.yap");
    }
    

    /**
     *
     * @param <T>
     * @param Obj
     * @return
     */
    public <T> ArrayList<T> getListOf(T Obj) {

        ArrayList<T> list = new ArrayList<>();
        try {
//            db = Db4o.openFile("./src/DBConnection/db.yap");
            ObjectSet result = db.queryByExample(Obj);
    //        System.out.println(result.size());

            list = new ArrayList<>();
            for (Object o : result.toArray()) {
                T newObj = (T) o;
                list.add(newObj);
            }
            System.out.println(list.toString());

//            db.close();
           
        } catch (Exception e) {
            System.err.println("Exception:" + e.getMessage());
            System.err.println("Exception:" + e.getStackTrace());
//            db.close();
        }
        return list;
    }

    /**
     *
     * @param <T>
     * @param Obj
     * @return
     */
    public <T> ObjectSet queryByExample(T Obj) {

        ObjectSet result;
        try {
//            db = Db4o.openFile("./src/DBConnection/db.yap");
            result = db.queryByExample(Obj);

//            db.close();
            return result;
           
        } catch (Exception e) {
            System.err.println("Exception:" + e.getMessage());
            System.err.println("Exception:" + e.getStackTrace());
//            db.close();
            return null;
        }
    }

    /**
     *
     * @param <T>
     * @param Obj
     */
    public <T> void setEntity(T Obj) {
        try {
//        db = Db4o.openFile("./src/DBConnection/db.yap");
        System.out.println(Obj);
        db.store(Obj);
        
//        db.close();
        }
        catch (Exception e) 
        {
            
            System.err.println("Exception:" + e.getMessage());
            System.err.println("Exception:" + e.getStackTrace());
        }
    }

//    public <T> void updateEntity(T Obj){
//        db
//    }
    public <T> ArrayList<T> deleteEntity(T Obj) {
//        db = Db4o.openFile("./src/DBConnection/db.yap");
        ObjectSet result = db.queryByExample(Obj);
        T match = (T) result.next();
        if (match != null) {
            db.delete(match);
            System.out.println("Deleted " + match);
        }
        T item = (T) new Object();
//        db.close();
        return getListOf(item);
        
    }
    public void close()
    {
        db.close();
    }

//    public static void storeFirstCar(ObjectContainer db) {
//        Car car1 = new Car("Ferrari");
//        db.store(car1);
//    }
//
//    public static void retrieveAllCarsQBE(ObjectContainer db) {
//
//        Car proto = new Car(null);
//        ObjectSet result = db.queryByExample(proto);
//        System.out.println(result.size());
//
//        ArrayList<Car> list = new ArrayList<Car>();
//        for (Object o : result.toArray()) {
//            Car newCar = new Car();
//            newCar = (Car) o;
//            list.add(newCar);
//        }
//    }
//    private static class Car {
//
//        public Car(String name) {
//            this.name = name;
//        }
//
//        public Car() {
//        }
//
//        public String name;
//
//        public String getName() {
//            return name;
//        }
//    }
//    below are one time run functions
//    private void addCity(){
//        
//    }
//    private void addUserRole(){
//        
//    }
//    private void addGender() {
//        
//    }
}
