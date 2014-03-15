package SpringThirdExample;

import org.omg.CosNaming._NamingContextExtStub;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new FileSystemXmlApplicationContext("src\\main\\java\\spring-config.xml");
        Car car=(Car)context.getBean("car");
        car.setColor("White");
        Car car2=(Car)context.getBean("car");
        if(car.equals(car2))
            System.out.println("Same car!");
        else
            System.out.println("Different cars!");
        System.out.println(car2.toString());
        System.out.println(car.toString());

        System.out.println((Car)context.getBean("car1"));
        System.out.println((Car)context.getBean("car2"));
        System.out.println((Car)context.getBean("car3"));

        context.registerShutdownHook();
    }
}
