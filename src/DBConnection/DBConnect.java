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
import java.util.ArrayList;
import javax.swing.JFrame;

public class DBConnect {

    ObjectContainer db;
    
    public DBConnect(JFrame frame) {
        db = Db4o.openFile("./db.yap");
//        if (db != null) {
//            Car Obj = new Car();
//            getListOf(Obj);
//        }

    

    }
    
    /**
     *
     * @param <T>
     * @param Obj
     * @return
     */
    public <T> ArrayList<T> getListOf(T Obj){
        
        ObjectSet result = db.queryByExample(Obj);
//        System.out.println(result.size());

        ArrayList<T> list = new ArrayList<T>();
        for (Object o : result.toArray()) {
            T newObj = (T) o;
            list.add(newObj);
        }
        System.out.println(list.toString());
        return list;
    }
    
    
    /**
     *
     * @param <T>
     * @param Obj
     * @return
     */
    public <T> ArrayList<T> addEntity(T Obj){
        
        ObjectSet result = db.queryByExample(Obj);
//        System.out.println(result.size());

        ArrayList<T> list = new ArrayList<T>();
        for (Object o : result.toArray()) {
            T newObj = (T) o;
            list.add(newObj);
        }
        System.out.println(list.toString());
        return list;
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
}
