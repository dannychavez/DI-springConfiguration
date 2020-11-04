package dc2.example.didemo.config;

import dc2.example.didemo.examplebeans.FakeDataSource;
import dc2.example.didemo.examplebeans.FakeJmsBroker;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
/*@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})*/
public class propertyConfig {


    @Value("${dc2.username}")
     String user;
    @Value("${dc2.password}")
     String password;
    @Value("${dc2.dburl}")
     String url;

    @Value("${dc2.jms.username}")
    String jmsuser;
    @Value("${dc2.jms.password}")
    String jmspassword;
    @Value("${dc2.jms.dburl}")
    String jmsurl;

    @Bean
    public FakeDataSource getDataSource(){
        FakeDataSource fakeDataSource=new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setDburl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker getFakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker=new FakeJmsBroker();
        fakeJmsBroker.setUserjms(jmsuser);
        fakeJmsBroker.setPasswordjms(jmspassword);
        fakeJmsBroker.setDburljms(jmsurl);
        return fakeJmsBroker;
    }

   /* @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer=new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }*/

}
