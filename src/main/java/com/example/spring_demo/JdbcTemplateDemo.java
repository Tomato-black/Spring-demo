package com.example.spring_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class JdbcTemplateDemo {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void initDataSource(){
        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS `runoob_tbl`(\n" +
                "   `runoob_id` INT UNSIGNED AUTO_INCREMENT,\n" +
                "   `runoob_title` VARCHAR(100) NOT NULL,\n" +
                "   `runoob_author` VARCHAR(40) NOT NULL,\n" +
                "   `submission_date` DATE,\n" +
                "   PRIMARY KEY ( `runoob_id` )\n" +
                ")ENGINE=InnoDB DEFAULT CHARSET=utf8;");
    }

    public void insertValue(){
        jdbcTemplate.execute("insert runoob_tbl(runoob_id,runoob_title,runoob_author) value (1,'test','test')");
        jdbcTemplate.execute("insert runoob_tbl(runoob_id,runoob_title,runoob_author) value (1,'test','test')");
    }
}
