package co.guazi.dubbo.web;

import com.guazi.dubbo.model.User;
import com.guazi.dubbo.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class SomeController {
    @Autowired
    private SomeService someService;


    @RequestMapping("/hello")
    public String hello(Model model){
        String hello=someService.hello();
        model.addAttribute("hello",hello);
        return "hello";
    }

    @RequestMapping(value = "/user/detail")
    public String userdetail(Model model,Integer id){
        User user = someService.queryUserByID(id);
        model.addAttribute("user",user);
        return "userDetail";
    }
}
