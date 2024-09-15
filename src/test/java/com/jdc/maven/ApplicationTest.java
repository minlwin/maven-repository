package com.jdc.maven;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({
	"testing",
})
@SpringBootConfiguration
@Import(value = ApplicationConfig.class)
@EnableAutoConfiguration
public class ApplicationTest {

	@Test
	void test() {
		
	}
}
