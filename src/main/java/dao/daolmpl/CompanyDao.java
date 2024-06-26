package dao;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import entity.Company;

import java.util.List;

public interface CompanyDao {
    boolean addCompany(Company company);
    boolean updateCompany(Company company);
    boolean deleteCompany(int id);

    Company findCompanyByName(String name);

    List<Company> showCompanies();
    Company findCompanyById(int id);
    //Эта запись указывает на то, что name
    //является строковым значением (String) в базе данных MySQL.
}
