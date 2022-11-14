package com.sagar.springmvcmaster.configuration;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.sagar.springmvcmaster.interceptor.MyLoginInterceptor;

@SuppressWarnings("deprecation")
@Configuration
public class SpringConfig extends WebMvcConfigurerAdapter {
	@Bean
	public MessageSource messageSoures() {
		ResourceBundleMessageSource rs = new ResourceBundleMessageSource();
		rs.setBasename("messages");
		return rs;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/img/**").addResourceLocations("/resources/images/");
		registry.addResourceHandler("/pdf/**").addResourceLocations("/resources/pdf/");

	}
	
	/*
	 * @Override public void addViewControllers(ViewControllerRegistry registry) {
	 * registry.addRedirectViewController("/", "/api/swagger-ui.html"); }
	 */

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addRedirectViewController("/", "/normal/home");
	}

	@Bean
	public CommonsMultipartResolver commonsMultipartResolver()

	{
		final CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
		commonsMultipartResolver.setDefaultEncoding("utf-8");

		return commonsMultipartResolver;
	}
	
	@Bean("localeResolver")
	public LocaleResolver localeResolver()
	{
		SessionLocaleResolver resolver=new SessionLocaleResolver();
		resolver.setDefaultLocale(new Locale("en"));
		return resolver;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	//registry.addInterceptor(new MyLoginInterceptor());
	LocaleChangeInterceptor localeInterceptor=new LocaleChangeInterceptor();
	localeInterceptor.setParamName("language");
	registry.addInterceptor(localeInterceptor);
	}
	

}
