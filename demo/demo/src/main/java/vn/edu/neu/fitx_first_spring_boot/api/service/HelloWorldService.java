package vn.edu.neu.fitx_first_spring_boot.api.service;

import org.springframework.stereotype.Service;
// tại sao phải tách service để xử lý: ở Pj lớn hơn, phải kết nối đến DB, bên thứ 3,... cần nhiều logic -> cần tách file service ra
@Service //annotation trong Jv
public class HelloWorldService {
    public String sayHello() {
        return "Hello, FitUp Spring Boot!";
    }
}