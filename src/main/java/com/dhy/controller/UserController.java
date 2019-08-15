package com.dhy.controller;

import com.dhy.bean.TbUser;
import com.dhy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by szy
 * 2019/8/13 9:19
 */
@RequestMapping("user")
@Controller
public class UserController {

    @Autowired
    private IUserService iUserService;

    //跳转到登录界面
    @RequestMapping("login")
    public String login(){
        return "/user_login";
    }

    @RequestMapping("findAll.do")
    public ModelAndView findAll(){
        List<TbUser> users = iUserService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("us",users);
        mv.setViewName("allUser");
        return mv;
    }

    //用户登陆的表单提交验证
    @RequestMapping(value = "/verify.do",method = RequestMethod.POST)
    public String index(Model model,
                        @RequestParam("username") String username,
                        @RequestParam("password") String password){
        if(!iUserService.isUserExist(username)){
            model.addAttribute("error","此账号不存在");
            return "/user_login";
        }   else {
            if(password.equals(iUserService.getPasswordByUsername(username))){
                model.addAttribute("error","登陆成功");
                return "redirect:/user/findAll.do";
            }
            else{
                model.addAttribute("error","密码错误");
                return "/user_login";
            }
        }
    }

    @RequestMapping("deleteById.do/{userId}")
    public String deleteUser(@PathVariable("userId") int userId) {
        iUserService.deleteById(userId);
        return "redirect:/user/findAll.do";
    }

    @RequestMapping("toAddUser.do")
    public String toAddUser(){
        return "addUser";
    }

    @RequestMapping("save.do")
    public String addUser(TbUser tbUser) {
        iUserService.addUser(tbUser);
        return "redirect:/user/findAll.do";
    }


    @RequestMapping("toUpdate.do")
    public String toUpdatePaper(Model model, int id) {
        model.addAttribute("userInfo", iUserService.queryById(id));
        return "updateUser";
    }

    @RequestMapping("update.do")
    public String updateUser(int id,TbUser tbUser) {
        iUserService.updateUser(tbUser);
        return "redirect:/user/findAll.do";
    }


}
