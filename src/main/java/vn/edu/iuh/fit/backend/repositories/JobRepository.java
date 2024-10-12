package vn.edu.iuh.fit.backend.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class JobRepository {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public void create(String description) {
        String sql = "insert into Job (description) values (?)";
        jdbcTemplateObject.update(sql, description);
        System.out.printf("Created Record Description = %s\n", description);
        return;
    }
}
