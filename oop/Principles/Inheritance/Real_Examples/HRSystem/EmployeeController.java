package oop.Principles.Inheritance.Real_Examples.HRSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @GetMapping("/employeeForm")
    public String employeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employeeForm";
    }

    @PostMapping("/employeeForm")
    public String processEmployeeForm(Employee employee) {
        // Handle form submission, e.g., save the employee data to a database
        return "redirect:/employeeForm";
    }
}
