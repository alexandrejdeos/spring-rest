package br.com.sayit.web.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "br.com.sayit.web.bean.page"})
public class WebConfig{

}
