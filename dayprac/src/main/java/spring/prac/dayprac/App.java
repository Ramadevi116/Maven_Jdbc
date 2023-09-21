package spring.prac.dayprac;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.prac.dayprac.BussinessLayer.PracBussinessLayer;
import spring.prac.dayprac.BussinessLayer.PracBussinessLayerImpl;
import spring.prac.dayprac.dto.Prac;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
    	PracBussinessLayer pracBussinessLayer=(PracBussinessLayerImpl) context.getBean("pracBussinessLayer");
    	List<Prac> prac=pracBussinessLayer.printDetails();
    	System.out.println(prac);
    }
}
