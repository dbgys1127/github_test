package be.githubprac.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevBranchController {

    @GetMapping("/")
    public String homeworkAuth() {
        return "Pull Request I'm done !";
    }
}
