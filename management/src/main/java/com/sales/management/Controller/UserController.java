package com.sales.management.Controller;


import com.sales.management.BaseResponse.APIResponse;
import com.sales.management.BaseResponse.BaseResponse;
import com.sales.management.DTO.UserDTO;
import com.sales.management.Model.User;
import com.sales.management.ServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userServiceimpl;

    @PostMapping("/add")
    public BaseResponse adduserdetail(@Valid @RequestBody UserDTO userDTO) {
        return userServiceimpl.addUserdetail(userDTO);

    }

     @GetMapping("/{offset}/{pageSize}/{userName}")
     private APIResponse<User> getUserWithPagination(@PathVariable int offset, @PathVariable int pageSize, @PathVariable String userName) {
     return userServiceimpl.GetUserWithPagination(offset, pageSize, userName);
    }

   @PutMapping("/updater")
    public BaseResponse updateuser(@RequestBody UserDTO userDTO) {
        return userServiceimpl.updateUser(userDTO);
    }

    @GetMapping("/{id}")
    public BaseResponse<User> findByUserId(@PathVariable int id) {
        return userServiceimpl.FindByUserId(id);
    }

    @PutMapping("/delete")
    public BaseResponse deletesoft(@RequestBody UserDTO userDTO) {
        return userServiceimpl.deleteSoft(userDTO);
    }




}
