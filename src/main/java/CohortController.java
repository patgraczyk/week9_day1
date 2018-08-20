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
            model.put("student", result);
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


    }
}