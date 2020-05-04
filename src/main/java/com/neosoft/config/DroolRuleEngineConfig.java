package com.neosoft.config;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolRuleEngineConfig {
	
	@Value("${kie-session-name}")
	private String kieSessionName;
	
	@Bean
	public KieSession initializeKieSession() {
		KieServices kieService = KieServices.Factory.get();
		KieContainer kieContainer = kieService.getKieClasspathContainer();
		KieSession kieSession = kieContainer.newKieSession(this.kieSessionName);
		return kieSession;
	}

}
