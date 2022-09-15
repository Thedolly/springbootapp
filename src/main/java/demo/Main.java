package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Doctor staff = context.getBean(Doctor.class);
      //  Staff staff1 = context.getBean(Nurse.class);
        staff.assist();
        System.out.println(staff.getQualificaion());
       // staff1.assist();

    }
}
