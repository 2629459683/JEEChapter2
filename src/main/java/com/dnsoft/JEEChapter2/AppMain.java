package com.dnsoft.JEEChapter2;

import com.dnsoft.JEEChapter2.instance.constructor.bean1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
  public static void main (String[] args){
    // String xmlPath="com/dnsoft/JEEChapter2/instance/constructor/bean1.xml";
      ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans1.xml");
      bean1 bean=(bean1) applicationContext.getBean("bean1");
      bean.say();
  }
}
