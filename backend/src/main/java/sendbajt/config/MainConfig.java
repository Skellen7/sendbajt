package sendbajt.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;



@EnableWs
@Configuration
public class MainConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/sendbajt/*");
    }

    @Bean(name = "jobs")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema jobsSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("Jobs");
        wsdl11Definition.setLocationUri("sendbajt");
        wsdl11Definition.setTargetNamespace("sendbajt/jobs/");
        wsdl11Definition.setSchema(jobsSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema jobsSchema() {
        return new SimpleXsdSchema(new ClassPathResource("jobs.xsd"));
    }

//    @Bean(name = "users")
//    public DefaultWsdl11Definition defaultWsdl11Definition(@Qualifier("Users") XsdSchema usersSchema) {
//        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
//        wsdl11Definition.setPortTypeName("Users");
//        wsdl11Definition.setLocationUri("sendbajt");
//        wsdl11Definition.setTargetNamespace("sendbajt/users/");
//        wsdl11Definition.setSchema(usersSchema);
//        return wsdl11Definition;
//    }
//
//    @Bean
//    public XsdSchema usersSchema() {
//        return new SimpleXsdSchema(new ClassPathResource("users.xsd"));
//    }

}
