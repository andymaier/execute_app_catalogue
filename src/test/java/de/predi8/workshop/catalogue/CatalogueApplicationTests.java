package de.predi8.workshop.catalogue;

import de.predi8.workshop.catalogue.event.Operation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest("spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration")
//@ActiveProfiles("test")
public class CatalogueApplicationTests {

	//@Mock
	KafkaTemplate<String, Operation>  kafkaTemplate = Mockito.mock(KafkaTemplate.class);

	//@Test
	public void contextLoads() {

		MockitoAnnotations.initMocks(this);
	}

}
