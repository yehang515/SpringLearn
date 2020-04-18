package com.enjoy.cap2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;

import com.enjoy.cap2.config.CustomTypeFilter;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;


@Configuration
@ComponentScan(value = "com.enjoy.cap2", includeFilters = {
		@Filter(type = FilterType.CUSTOM, classes = {CustomTypeFilter.class})
}, useDefaultFilters = false)
public class Cap2MainConfig {
	
	

}
