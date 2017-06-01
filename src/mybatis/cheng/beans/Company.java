package mybatis.cheng.beans;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/5/18 0018.
 */
//实现序列化接口，实现缓存。
public class Company   implements Serializable{
    public String name;
    public  int price;
    public  int id;
    public List<Car> listcar;



    public Car car;
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
public Company(int id,String name,int price,Car car){
    this.id=id;
    this.name=name;
    this.price=price;
    this.car=car;
}
    public List<Car> getListcar() {
        return listcar;
    }

    public void setListcar(List<Car> listcar) {
        this.listcar = listcar;
    }





    public Company(){



    }
    public Company(String name,int price){


        this.name=name;this.price=price;
    }
    public Company(String name,int price,int id){
        this.name=name;this.price=price;
        this.id=id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }



    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", listcar=" + listcar +
                ", car=" + car +
                '}';
    }
}
