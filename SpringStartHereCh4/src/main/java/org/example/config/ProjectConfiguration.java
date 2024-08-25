package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example"})
//@ComponentScan(basePackages = {"org.example", "org.example.proxies", "org.example.services", "org.example.repositories"})
@EnableAspectJAutoProxy
public class ProjectConfiguration {

}
