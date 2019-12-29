package com.shl.springboot.projectTemplate.controller;


import com.shl.springboot.projectTemplate.dto.param.PageForm;
import com.shl.springboot.projectTemplate.dto.result.TestProjectTemplateDTO;
import com.shl.springboot.projectTemplate.dto.result.page.MyPage;
import com.shl.springboot.projectTemplate.service.TestService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController：
 *      这个类的所有方法返回的数据直接写给浏览器，（如果是对象转为json数据）
 *      由@Controller和@ResponseBody组成
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick!";
    }


    @Resource
    private TestService testService;


    /**
     * testPage
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "page", method= RequestMethod.GET)
    public MyPage<TestProjectTemplateDTO> testPage(HttpServletRequest request,
            HttpServletResponse response,
            PageForm form){

        return this.testService.testPage(form);

    }
}
