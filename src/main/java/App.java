import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHelloWorld1 = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld beanHelloWorld2 = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat beanCat1 = applicationContext.getBean("cat", Cat.class);
        Cat beanCat2 = applicationContext.getBean("cat", Cat.class);
//        System.out.println(bean1.getMessage());
        System.out.println(beanHelloWorld1 == beanHelloWorld2);
        System.out.println(beanCat1 == beanCat2);
    }
}