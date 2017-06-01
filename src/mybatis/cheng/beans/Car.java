package mybatis.cheng.beans;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/5/25 0025.
 */

public class Car  implements Serializable{
    public  Integer id;
     public  String name;
    public  Integer price;
    public  Integer companyid;
    public Car(String name){
        this.name=name;

    }
    //这个必须写，不然初始化不成功！！！
    public Car(){


    }
    public Car(Integer id,String name,Integer price,Integer companyid){
        this.price=price;
        this.id=id;
        this.companyid=companyid;
        this.name=name;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", companyid=" + companyid +
                '}';
    }
}
