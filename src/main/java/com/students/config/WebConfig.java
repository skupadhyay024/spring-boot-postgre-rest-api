
  package com.students.config;
  
  import org.springframework.context.annotation.Configuration; import
  org.springframework.web.servlet.config.annotation.CorsRegistry; import
  org.springframework.web.servlet.config.annotation.EnableWebMvc; import
  org.springframework.web.servlet.config.annotation.WebMvcConfigurer; //Enable while using with ui
  
  @Configuration
  
  @EnableWebMvc public class WebConfig implements WebMvcConfigurer {
  
  @Override public void addCorsMappings(CorsRegistry registry) {
  registry.addMapping("/**"); } }
 