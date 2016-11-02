package edu.matc.mytags;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import java.io.IOException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Created by student on 11/2/16.
 */
public class HelloWorldTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        out.println("Hello world!");
    }
}