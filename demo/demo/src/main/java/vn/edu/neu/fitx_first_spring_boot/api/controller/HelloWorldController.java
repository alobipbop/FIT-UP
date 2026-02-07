package vn.edu.neu.fitx_first_spring_boot.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.neu.fitx_first_spring_boot.api.service.HelloWorldService;

@RestController //nơi request đi vào, bước 1-4
@RequestMapping("/hello")
public class HelloWorldController {
    HelloWorldService helloWorldService;
    // duoi day la contructor
    // sringboot giúp làm ngắn code, bỏ qua dependency, ko cần new helloWController
    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/hi") // => GET /hello/hi  -> tạo url
    public String sayHello() {return helloWorldService.sayHello();
    }

}