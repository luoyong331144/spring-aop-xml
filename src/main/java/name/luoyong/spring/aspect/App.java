package name.luoyong.spring.aspect;


import name.luoyong.spring.aspect.animal.Fox;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Fox fox = ctx.getBean(Fox.class);
    	fox.findChicken();
    	fox.stealChicken();
    	
    }
}
