package vn.edu.neu.fitx_first_spring_boot.api.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// giống class Diagram
// mapping tới DB, giao tiếp với DB
//@Getter
//@Setter
@Data //-> auto có cả get và set   =@Getter + @Setter
// hỗ trợ tự tạo get và set thay vì code chay

public class Device {
    private Long id;
    private String name;
    private Double price;
    private String manufacture;

    public Device() {}

    public Device(Long id, String name, Double price, String manufacture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacture = manufacture;
    }

}
