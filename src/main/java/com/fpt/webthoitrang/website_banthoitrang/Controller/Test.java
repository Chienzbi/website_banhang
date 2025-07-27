package com.fpt.webthoitrang.website_banthoitrang.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test-db")
public class Test {

    private final JdbcTemplate jdbcTemplate;

    public Test(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/connection")
    public ResponseEntity<String> testConnection() {
        try {
            jdbcTemplate.execute("SELECT 1");
            return ResponseEntity.ok("Kết nối cơ sở dữ liệu thành công!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Lỗi kết nối cơ sở dữ liệu: " + e.getMessage());
        }
    }
}
