package com.DataJPAauditing.Config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<String>{

	@Override
	public Optional<String> getCurrentAuditor() {
		// In spring security
		// securityContextHolder
		// get the principal
		// get the user (Name)
		return Optional.of("Bandar");
	}

}
