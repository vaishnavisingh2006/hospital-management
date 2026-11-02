package com.smsk.hospital.management.controller;

import com.smsk.hospital.management.entity.patient;
import com.smsk.hospital.management.service.patientSer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class patientcontroller {
    private final patientSer Controller;

    @GetMapping("/getall")
    public List<patient>getall(){
        return Controller.getall();
    }
    @GetMapping("/getbyid/{id}")
    public patient getbyid(@PathVariable Long id){
        return Controller.getbyId(id);
    }
    @PostMapping("add")
    public patient add(@RequestBody patient data){
        return Controller.add(data);
    }
    @PutMapping("/update/{id}")
    public patient update(@RequestBody patient new_data,@PathVariable Long id){
        return Controller.update(id,new_data);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        Controller.delete(id);
    }
}
