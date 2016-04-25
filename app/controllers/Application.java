package controllers;

import play.*;
import play.data.validation.Validation;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void showAvailabilities(String date) {
        renderArgs.put("date", date);
        render();
    }

    public static void doAvailabilities (String date) {
        validation.required(date);
        if(Validation.hasErrors()){
            flash.put("warning","Select a date");
            index();
        }
        Logger.info("->"+date);

        showAvailabilities(date);
    }

}