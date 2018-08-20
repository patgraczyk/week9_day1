import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static spark.Spark.get;

public class CohortController {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        Cohort cohort = new Cohort("E22");


        get("/random", (req, res) -> {
            Student result = cohort.mixedStudents();
            HashMap<String, Object> model = new HashMap<>();
            model.put("randomStudent", result);
            model.put("template", "random.vtl");
            return new ModelAndView(model, "layout.vtl");
        },velocityTemplateEngine);


        get("/pair", (req, res) -> {
            List<Student> students = cohort.pairOfStudents();
            HashMap<String, Object> model = new HashMap<>();
            model.put("students", students);
            model.put("template", "pair.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);


        get("/group", (req, res) -> {
            List<Student> students = cohort.groupOfFiveStudents();
            HashMap<String, Object> model = new HashMap<>();
            model.put("groupOfFive", students);
            model.put("template", "randomGroup.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);


        get("/group/:size", (req, res) -> {
            Integer groupSize = Integer.parseInt(req.params(":size"));
            List<Student> students = cohort.groupOfRandomFive(groupSize);
            HashMap<String, Object> model = new HashMap<>();
            model.put("groupOfFive", students);
            model.put("template", "randomGroupFive.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);



    }
}