package vn.edu.iuh.fit.backend.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Date;

@Repository
public class CandidateRepository {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    @Autowired
    public void setDataSource(DataSource dataSource, JdbcTemplate jdbcTemplateObject) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public void create(String lastName, String middleName, String firstName, Date dob, String email, String address, String phone) {
        String sql = "insert into Candidate (lastName, middleName, firstName, dob, email, address, phone) values (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplateObject.update(sql, lastName, middleName, firstName, dob, email, address, phone);
        System.out.printf("Created Record Name = %s %s %s\n", firstName, middleName, lastName);
        return;
    }
}
