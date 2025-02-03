package com.ypkim.modulith;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;
import org.springframework.modulith.test.ApplicationModuleTest;

@ApplicationModuleTest
class ModulithApplicationTests {

	@Test
	void moduleTest() {
		ApplicationModules modules = ApplicationModules.of(ModulithApplication.class).verify();
		modules.forEach(System.out::println);

		new Documenter(modules)
			.writeDocumentation()
			.writeIndividualModulesAsPlantUml();
	}

}
