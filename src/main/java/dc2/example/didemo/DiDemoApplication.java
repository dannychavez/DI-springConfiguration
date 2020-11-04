package dc2.example.didemo;

import dc2.example.didemo.controllers.ConstructorInjectedController;
import dc2.example.didemo.controllers.MyController;
import dc2.example.didemo.controllers.PropertyInjectedController;
import dc2.example.didemo.controllers.SetterInjectedController;
import dc2.example.didemo.examplebeans.FakeDataSource;
import dc2.example.didemo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(DiDemoApplication.class, args);
		MyController myController=(MyController)ctx.getBean("myController");
		/*System.out.println(ctx.getBean(MyController.class).getMessage());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());*/

		//myController.getMessage();

		FakeDataSource fakeDataSource=(FakeDataSource)ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getDburl());

		FakeJmsBroker fakeJmsBroker=(FakeJmsBroker)ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUserjms());
		System.out.println(fakeJmsBroker.getPasswordjms());
		System.out.println(fakeJmsBroker.getDburljms());
	}

}
