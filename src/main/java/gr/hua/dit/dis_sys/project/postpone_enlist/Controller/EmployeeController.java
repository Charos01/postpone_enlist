package gr.hua.dit.dis_sys.project.postpone_enlist.Controller;

import gr.hua.dit.dis_sys.project.postpone_enlist.Entity.Application;
import gr.hua.dit.dis_sys.project.postpone_enlist.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/empl")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @RequestMapping("")
    String welcome() {
        return "Welcome Employee";
    }
    @GetMapping("/apps")
    List<Application> all() {
        return employeeService.findAll();
    }

    @GetMapping("/apps/{id}")
    EntityModel<Application> app (@PathVariable int id) {
        Application app = employeeService.getApplication(id);
        return EntityModel.of(app, linkTo(methodOn(EmployeeController.class).app(id)).withSelfRel(), linkTo(methodOn(EmployeeController.class).all()).withRel("Applications"));
    }

    @PutMapping("/apps/{id}/approve")
    Application approve (@PathVariable int id) {
        return employeeService.validateApplication(id);
    }

    @PutMapping("/apps/{id}/reject")
    Application reject (@PathVariable int id) {
        return employeeService.rejectApplication(id);
    }
}