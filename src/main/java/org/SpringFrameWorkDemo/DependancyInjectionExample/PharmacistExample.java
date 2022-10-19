package org.SpringFrameWorkDemo.DependancyInjectionExample;

import lombok.Data;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Data
@Component
@Scope(scopeName = "prototype")
public class PharmacistExample implements PharmacyStaff , BeanNameAware {
    //it will be troublesome if there are different fields coming from other classes  and different methods
    //added to the class above which is tightly coupled to this class
    //to achieve loosely coupling class with other objects we use dependency injection
    //dependency-injection inversion of control is done via
    // a) xml based config
    // b) java based config
    // c) annotation based config
    private String qualification;
    @Override
    public void assist(){
        System.out.println("Pharmacist Assistance Is Assisting The Pharmacist");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Set Bean Method Is Called");
    }
    @PostConstruct
    public void postConstructor(){
        System.out.println("Post Constructor Method IS Called");
    }
}
