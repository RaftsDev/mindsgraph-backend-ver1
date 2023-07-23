package com.mindsgraph.backend.mindsgraphbackendver1.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {


    //Logger
    private Logger logger = LoggerFactory.getLogger(getClass());

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
}
