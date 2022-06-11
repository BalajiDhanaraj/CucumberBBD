package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.bs.A;

public class Background_tag {

    @Before(order = 1)
    public void before(){
        System.out.println("before");
    }
    @After(order = 0)
    public void after(){
        System.out.println("after");
    }
}
