package mybatis.cheng.dao;
import mybatis.cheng.beans.Company;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/1 0001.
 */
public interface CompanyMappe {

    public Company getCompByID(int i);
    //4.插入后返回的是long类型的数字1代表插入成功，0没有
    public long insertCompany(Company company);
    //4.删除返回的是boolean类型
    public boolean delectCompany(int id);
    //4.test long 返回的是数字类型，1代表更新成功，0，没有更新成功
    public long  updateCompany (Company company);
    //5.test获取自增的id,但是传入的参数类型必须是对象
    public void insertCompayAutoID(Company company);
    //6.当我们传入参数的时候，框架会自动把参数封装成Map<param1,Obejct>,Map<param2,Obejct>
    //我们必须通过@param("")把parma1 的key的名称定义为#{name},#{price},这样参数会映射到sql中
    //相对应这样会传入到把参数的值传入到sql中
    //因为mabatis会把多个参数封装成一个map，而map的key值是param1,param2....我们需要用@param来指定map的key的名字
    public long insertCompanyParam(@Param("name")String name,@Param("price")int price);
    //7test.鉴于6,我们直接封装，直接是传入的map类型就省去框架的封装了。key值要与#{name} 对应
    public boolean insertCompanyMap(Map<String,Object> map);
    //8.查询list+动态绑定模糊查询,当用动态绑定的时候，单个参数也必须用@param绑定，不然就用param1
    public List<Company> selectCompanyList(@Param("name")String name);
    //9.1返回的参数封装成map,把返回的列封装成map列名为key,value为值
    public  Map<String,Object> selectCompanyMap(int id);
    //9.2.返回的参数封装成map,把返回的列封装成map列名为key,value为值
    //当返回的是一列多值得情况下，测试看看，答案是不能
    public  Map<String,Object> selectCompanyMapManyreturn(String name);
    //10.返回一个对象map,指定列为key,MapKey是返是回一个map集合，里面装着对象，
    @MapKey("id")//指定返回那一列为map的key值
    public Map<String,Object> selectMapCompany(String name);
    //11.当驼峰命名法关闭的时候，用自定义的map
    public Company selectMyMapCompany(int id);

    //12.关联查询切记！关联查询，beans一定要写空构造器，框架都是通过空构造器，创建beans
    public Company selectMyMapCompanyAndCar(int id);
    //12.关联查询
    public Company selectMyMapCompanyAndCar2(int id);
    //13.关联查询,多个
    public Company selectMyMapCompanyAndCarList(int id);
    //14.关联分步多个sql查询,Company 的查询sql
    public Company selectCompanyAndCarListSqlUni(@Param("id")int id);

    //15.批量插入数据，用foreach 循环,如果想自动获取自增的id,必须用list名，命名
    public  void  insertmanyCompany(List<Company> list);


}
