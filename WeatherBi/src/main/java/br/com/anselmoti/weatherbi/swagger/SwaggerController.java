package br.com.anselmoti.weatherbi.swagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaggerController {
    @RequestMapping("/api-doc")
    public String getRedirectUrl() {
        return "redirect:swagger-ui/";
    }
}