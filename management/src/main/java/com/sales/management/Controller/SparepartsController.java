package com.sales.management.Controller;

import com.sales.management.BaseResponse.APIResponse;
import com.sales.management.BaseResponse.BaseResponse;
import com.sales.management.DTO.SparepartsDTO;
import com.sales.management.Model.Spareparts;
import com.sales.management.ServiceImpl.SparepartsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/spareparts")
@RestController
public class SparepartsController {

    @Autowired
    private SparepartsServiceImpl sparepartsserviceimpl;

    @PostMapping("/add")
    public BaseResponse addspareparts(@RequestBody SparepartsDTO sparepartsDTO) {
        return sparepartsserviceimpl.addSpareparts(sparepartsDTO);
    }

   @GetMapping("/{offset}/{pageSize}/{sparepartsName}")
   private APIResponse<Spareparts> getSparepartsWithPagination(@PathVariable int offset, @PathVariable int pageSize, @PathVariable String sparepartsName) {
       return sparepartsserviceimpl.GetSparepartsWithPagination(offset, pageSize, sparepartsName);
   }


    @PutMapping("/update")
    public BaseResponse updatespareparts(@RequestBody SparepartsDTO sparepartsDTO) {
        return sparepartsserviceimpl.updateSpareparts(sparepartsDTO);
    }

    @GetMapping("/{id}")
    public BaseResponse<Spareparts> findsparepartsById(@PathVariable int id) {
        return sparepartsserviceimpl.findSparepartsById(id);
    }

    @PutMapping("/delete")
    public BaseResponse deletespareparts(@RequestBody SparepartsDTO sparepartsDTO) {
        return sparepartsserviceimpl.deleteSpareparts(sparepartsDTO);
    }

}
