package com.trent.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: Trent
 * @Date: 2022/8/26 15:09
 * @program: spring
 * @Description:
 */
@Configuration
@ComponentScan(basePackages = "com.trent")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfigurationBean{

}
