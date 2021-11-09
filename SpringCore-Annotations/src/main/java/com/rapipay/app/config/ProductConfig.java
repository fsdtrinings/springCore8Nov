package com.rapipay.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.rapipay.app")
@PropertySource("ProductInfo.properties")
public class ProductConfig {

}
