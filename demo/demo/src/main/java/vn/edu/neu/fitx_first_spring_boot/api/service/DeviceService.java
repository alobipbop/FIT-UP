package vn.edu.neu.fitx_first_spring_boot.api.service;

import org.springframework.stereotype.Service;
import vn.edu.neu.fitx_first_spring_boot.api.entity.Device;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class DeviceService {
    private final Map<Long, Device> devices = new HashMap<>();
    // tạo id gen tự động tăng dần
    private final AtomicLong idGenerator = new AtomicLong(1);

    public List<Device> getAllDevices() {
        return new ArrayList<>(devices.values());
        // trả vể array là một dãy các value của map device
    }

    public DeviceService(){
        //tạo sample
        devices.put(idGenerator.getAndIncrement(), new Device(1L, "Device A", 199.99, "Manufacture A"));
        devices.put(idGenerator.getAndIncrement(), new Device(2L, "Device B", 299.99, "Manufacture B"));
        devices.put(idGenerator.getAndIncrement(), new Device(3L, "Device C", 399.99, "Manufacture C"));
    }

    public Device getDeviceById(Long id) {
        return devices.get(id);
    }

    public Device createDevice(Device device) {
        Long id = idGenerator.getAndIncrement();
        device.setId(id);
        devices.put(id, device);
        return device;
    }

    public Device updateDevice(Long id, Device device) {
        if (!devices.containsKey(id)) return null;
        device.setId(id);
        devices.put(id, device);
        return device;
    }

    public boolean deleteDevice(Long id) {
        return devices.remove(id) != null;
    }
}