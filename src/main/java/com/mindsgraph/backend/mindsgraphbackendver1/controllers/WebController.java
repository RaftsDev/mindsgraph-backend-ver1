package com.mindsgraph.backend.mindsgraphbackendver1.controllers;

import com.mindsgraph.backend.mindsgraphbackendver1.entities.Task;
import com.mindsgraph.backend.mindsgraphbackendver1.entities.User;
import com.mindsgraph.backend.mindsgraphbackendver1.repository.TaskJpaRepository;
import com.mindsgraph.backend.mindsgraphbackendver1.repository.UserJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WebController {


    //Logger
    private Logger logger = LoggerFactory.getLogger(getClass());

    //Wiring UserJpaRepository
    public WebController(UserJpaRepository userJpaRepository, TaskJpaRepository taskJpaRepository ) {
        super();
        this.userJpaRepository = userJpaRepository;
        this.taskJpaRepository = taskJpaRepository;
    }
    private UserJpaRepository userJpaRepository;
    private TaskJpaRepository taskJpaRepository;
    @RequestMapping("/")
    @ResponseBody
    public String mainPage() {
        return "Project Mindsgraph-backend-ver1";
    }

    @RequestMapping("landing-page")
    @ResponseBody
    public String landingPage() {

        logger.debug("Debug level of message. User got on Landing page. Time:{}");
        logger.info("Info level of message. User got on Landing page. Time:{}");
        logger.warn("Warn level of message. User got on Landing page. Time:{}");
        return "Landing page of Mindsgraph-backend-ver1";
    }

    @RequestMapping("landing-page-html")
    @ResponseBody
    public String landingPageHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>");
        sb.append("landing-page-html");
        sb.append("</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("Mindsgraph-backend-ver1.");
        sb.append("Landing - page - html");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }
    @RequestMapping("landingPageJsp")
    public String landingPageJsp() {
        return "jsp-file";
    }

    @RequestMapping("raw-users")
    public String rawUsers(ModelMap model) {
        List<User> users = userJpaRepository.findAll();
        model.addAttribute("users", users);
        return "raw-users";
    }

    @RequestMapping("users")
    public String users(ModelMap model) {
        List<User> users = userJpaRepository.findAll();
        model.addAttribute("users", users);
        return "users";
    }

    @RequestMapping("raw-tasks")
    public String rawTasks(ModelMap model) {
        List<Task> tasks = taskJpaRepository.findAll();
        model.addAttribute("tasks", tasks);
        return "raw-tasks";
    }

    @RequestMapping("tasks")
    public String tasks(ModelMap model) {
        List<Task> tasks = taskJpaRepository.findAll();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
}
