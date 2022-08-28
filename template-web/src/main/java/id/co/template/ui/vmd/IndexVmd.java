package id.co.template.ui.vmd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.annotation.WireVariable;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import id.co.template.model.dto.TestDto;
import id.co.template.ui.vmd.common.CommonVmd;

/**
 * 
 * @author Joseph Tarigan
 *
 */
public class IndexVmd extends CommonVmd {

	@WireVariable
	RestTemplate restTemplate;
	@WireVariable
	ObjectMapper objectMapper;
	
	private List<TestDto> testDtoList;
	
	@Init
	public void init () throws IOException {
		
		ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/template-api/test/testListDto", HttpMethod.GET, null, String.class);
		CollectionType listType = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, TestDto.class);
		testDtoList = objectMapper.readValue(response.getBody(), listType);
	}

	public List<TestDto> getTestDtoList() {
		return testDtoList;
	}

	public void setTestDtoList(List<TestDto> testDtoList) {
		this.testDtoList = testDtoList;
	}
}
