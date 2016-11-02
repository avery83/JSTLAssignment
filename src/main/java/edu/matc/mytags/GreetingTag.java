package edu.matc.mytags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by student on 11/2/16.
 */
public class GreetingTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();

        String greeting = "";
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        int timeOfDay = calendar.get(Calendar.HOUR_OF_DAY);



        if (timeOfDay > 0 && timeOfDay < 12 ) {
            greeting = "Good Morning";
        } else if (timeOfDay >= 12 && timeOfDay < 18) {
            greeting = "Good Afternoon";
        } else if (timeOfDay >= 18 && timeOfDay <= 24) {
            greeting = "Good Night";
        }




        if (calendar.get(Calendar.MONTH) == 11 && calendar.get(Calendar.DAY_OF_MONTH) == 2) {
            greeting = "Tonight is Game 7 of the World Series! Go Cubs!";
        }

        JspWriter out = getJspContext().getOut();
        out.println(greeting);


    }
}

