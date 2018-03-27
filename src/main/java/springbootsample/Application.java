package springbootsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class Application {

	@Bean
	WebMvcConfigurer configurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addResourceHandlers(ResourceHandlerRegistry registry) {
				registry.addResourceHandler("/img/**").addResourceLocations("/WEB-INF/static/");
				registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/static/css/");
				registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/static/js/");
				registry.addResourceHandler("/fonts/**").addResourceLocations("/WEB-INF/static/fonts/");
				registry.addResourceHandler("/ckeditor/**").addResourceLocations("/WEB-INF/static/ckeditor/");
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
