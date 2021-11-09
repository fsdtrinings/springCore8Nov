package com.rapipay.elapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.rapipay.elapp")
@PropertySource("CustomerProperty.properties")
public class CustomerConfig {

}
