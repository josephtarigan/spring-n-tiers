package id.co.template.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import id.co.template.model.dto.TestDto;
import id.co.template.svc.TestSvc;

/**
 * 
 * @author Joseph Tarigan
 *
 */
@RestController
@RequestMapping("/test")
public class TestRest {
	
	@Autowired
	TestSvc testSvc;

	@RequestMapping(value="test", method=RequestMethod.GET)
	public Map<String, Object> test () {
		Map<String, Object> value = new HashMap<>();
		value.put("test1", "value1");
		value.put("test2", "value2");
		
		return value;
	}
	
	@RequestMapping(value="testList", method=RequestMethod.GET)
	public List<String> testList () {
		return testSvc.getTestList();
	}
	
	@RequestMapping(value="testListDto", method=RequestMethod.GET)
	public List<TestDto> testListDto () {
		return testSvc.getListTestDto();
	}
}
