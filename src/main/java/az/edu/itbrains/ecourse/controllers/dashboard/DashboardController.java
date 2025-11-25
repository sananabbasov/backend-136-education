package az.edu.itbrains.ecourse.controllers.dashboard;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/admin")
    public String getAdminPage(){
        return "dashboard/index.html";
    }
    @GetMapping("/admin/categories")
    public String category(){
        return "dashboard/category.html";
    }
}
