package com.sales.management.Controller;

import com.sales.management.BaseResponse.BaseResponse;
import com.sales.management.DTO.SparepartstypeDTO;
import com.sales.management.Model.Sparepartstype;
import com.sales.management.ServiceImpl.SparepartstypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/sparepartstype")
@RestController
public class SparepartstypeController {

    @Autowired
    private SparepartstypeServiceImpl sparpartstypeserviceimpl;

    @PostMapping("/add")
    public BaseResponse addsparepartstype(@RequestBody SparepartstypeDTO sparepartstypeDTO) {
        return sparpartstypeserviceimpl.addSparepartstype(sparepartstypeDTO);
    }

    @PutMapping("/update")
    public BaseResponse updatesparepartstype(@RequestBody SparepartstypeDTO sparepartstypeDTO) {
        return sparpartstypeserviceimpl.updateSparepartstype(sparepartstypeDTO);
    }

    @GetMapping("/getAll")
    public List<Sparepartstype> list(){
        return sparpartstypeserviceimpl.listall();
    }

    @PutMapping("/delete")
    public BaseResponse deletesparepartstype(@RequestBody SparepartstypeDTO sparepartstypeDTO) {
        return sparpartstypeserviceimpl.deleteSparepartstype(sparepartstypeDTO);
    }
}
