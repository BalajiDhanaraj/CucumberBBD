package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHooks {

    @Before
    public void beforescenario(){
        System.out.println("before scenario");
    }
    @After
    public void afterscenario(){
        System.out.println("after scenerio");
    }
    @Before("@First,@Second")
    public void beforefirst(){
        System.out.println("before first");
    }
    @After("@First,@Second")
    public void afterfirst(){
        System.out.println("after first");
    }
//    @Before("@Second")
//    public void beforesecond(){
//        System.out.println("before second");
//    }
//    @After("@Second")
//    public void aftersecond(){
//        System.out.println("after second");
//    }
}
