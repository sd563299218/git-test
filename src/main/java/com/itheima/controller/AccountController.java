package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import com.itheima.service.impl.AccountServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/save",produces = "text/html;charset=UTF-8")
    @ResponseBody
    //保存
    public String save(Account account){
        accountService.save(account);

        return "保存成功";
    }


    @RequestMapping("/findAll")
    @ResponseBody
    //查询
    public ModelAndView findAll(){
        List<Account> accountList = accountService.findAll();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("accountList",accountList);
        modelAndView.setViewName("accountList");
        return modelAndView;
    }


}
