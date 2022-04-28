package org.edacy.rssfeeds.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

/**@author ndiane*/

@Configuration
public class WebConfig extends AcceptHeaderLocaleResolver implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedMethods("HEAD", "OPTIONS", "GET", "POST", "PUT", "PATCH",
				"DELETE");
		// .maxAge(maxAgeSecs);
	}

}
