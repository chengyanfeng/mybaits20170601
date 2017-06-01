package mybatis.yan.dao;

import mybatis.cheng.beans.Company;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2017/5/27 0027.
 */
public interface CompanyAnntion {
    //这个是注解版本的接口，一般不用
    @Select("select * from company where id=#{id}")
    public Company getCompanybyId(int id);
}
