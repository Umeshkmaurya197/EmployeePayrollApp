package com.git.employeepayrollapp.controller;

import com.git.employeepayrollapp.dto.EmployeePayrollDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    //Curl - http://localhost:8080/employeepayrollservice/get
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<String> getEmployeePayrollData() {
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    //Curl - http://localhost:8080/employeepayrollservice/get/1
    @GetMapping("/get/{empId}")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId")int empid){
        return new ResponseEntity<String>("Get Call SuccessFor id:"+empid,HttpStatus.OK);
    }

    //Curl - http://localhost:8080/employeepayrollservice/create
    @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
        return new ResponseEntity<String>("Created Employee PayrollData For :"+employeePayrollDTO,HttpStatus.OK);
    }
    //Curl - http://localhost:8080/employeepayrollservice/update
    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayrollDTO(@RequestBody EmployeePayrollDTO employeePayrollDTO){
        return new ResponseEntity<String>("Updated Employee Payroll Data for :"+employeePayrollDTO,HttpStatus.OK);
    }
    //Curl - http://localhost:8080/employeepayrollservice/delete/1
    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId){
        return new ResponseEntity<>("Delete Call Success For id :"+empId,HttpStatus.OK);
    }

}
