package org.SpringFrameWorkDemo.DependancyInjectionExample;

import org.springframework.stereotype.Component;

@Component
public class AssistanceExample implements PharmacyStaff{
    @Override
    public void assist() {
        System.out.println("Assisting The Pharmacist");
    }
}
