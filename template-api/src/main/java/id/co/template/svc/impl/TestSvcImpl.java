package id.co.template.svc.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.co.template.model.dto.TestDto;
import id.co.template.persistence.test.TestMapper;
import id.co.template.svc.TestSvc;

/**
 * 
 * @author Joseph Tarigan
 *
 */
@Service
public class TestSvcImpl implements TestSvc {

	@Autowired
	TestMapper testMapper;
	
	@Override
	public List<String> getTestList() {
		List<String> testList = new ArrayList<String>();
		
		testList.add("1");
		testList.add("222");
		testList.add("3333");
		
		return testList;
	}

	@Override
	public List<TestDto> getListTestDto() {
		return testMapper.getListTestDto();
	}
}
