package io.github.seondongpyo.data;

import static org.assertj.core.api.Assertions.*;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import io.github.seondongpyo.viliage.domain.Village;

class ParseJsonTest {

	private final ObjectMapper objectMapper = new ObjectMapper();

	@Test
	void parse() throws Exception {
		objectMapper.registerModule(new JavaTimeModule());
		Map<String, Object> dataMap = objectMapper.readValue(new File("src/main/resources/data.json"), Map.class);
		Object records = dataMap.get("records");
		List<Village> villages = objectMapper.convertValue(records, TypeFactory.defaultInstance().constructCollectionType(List.class, Village.class));
		assertThat(villages).hasSize(1959);
	}
}
