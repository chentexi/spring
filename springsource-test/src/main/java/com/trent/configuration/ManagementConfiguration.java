package com.trent.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


/**
 * 配置类
 */
@Configuration

/**
 *组件扫描
 */
@ComponentScan(basePackages = "com.trent")
/**
 * 使用注解开启事务管理
 */
@EnableTransactionManagement
@Scope()
public class ManagementConfiguration{
	
	
	/**
	 * 配置数据源
	 *
	 * @return
	 */
	@Bean
	public DruidDataSource getDruidDataSource(){
		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setDriverClassName("");
		druidDataSource.setUrl("");
		druidDataSource.setUsername("");
		druidDataSource.setPassword("");
		return druidDataSource;
	}
	
	/**
	 * 配置jdbcTemplate
	 */
	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource dataSource){
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		return jdbcTemplate;
	}
	
	/**
	 * 配置事务管理里器
	 */
	@Bean
	public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
		DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
		dataSourceTransactionManager.setDataSource(dataSource);
		return dataSourceTransactionManager;
	}
}
