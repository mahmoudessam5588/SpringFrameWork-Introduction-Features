package org.SpringFrameWorkDemo.MainApp;

import org.SpringFrameWorkDemo.DependancyInjectionExample.AssistanceExample;
import org.SpringFrameWorkDemo.DependancyInjectionExample.PharmacistExample;
import org.SpringFrameWorkDemo.DependancyInjectionExample.PharmacyStaff;
import org.SpringFrameWorkDemo.JavaBasedConfig.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //start application --spring load-->All Created Beans --> to be stored in the container
        //through two interfaces available:
        //A)ApplicationContext -extends-> B)BeanFactory --> application context have more features

        //XML BASED CONFIGURATION
        /*ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        PharmacyStaff pharmacistExample = xmlApplicationContext.getBean(PharmacistExample.class);
        PharmacyStaff assistanceExample = xmlApplicationContext.getBean(AssistanceExample.class);
        pharmacistExample.assist();
        assistanceExample.assist();
        PharmacistExample bean = xmlApplicationContext.getBean(PharmacistExample.class);*/

        //Java Based Config
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);
        PharmacistExample pharmacistExample = context.getBean(PharmacistExample.class);
        pharmacistExample.assist();
        AssistanceExample assistanceExample = context.getBean(AssistanceExample.class);
        assistanceExample.assist();
        //Singleton Design Pattern {Spring Bean & Component Scope} + Prototype according to @scope Annotation
        pharmacistExample.setQualification("Pharma.D");
        System.out.println(pharmacistExample);
        PharmacistExample pharmacistExample1 = context.getBean(PharmacistExample.class);
        System.out.println(pharmacistExample1);
    }
}