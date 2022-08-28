package id.co.template.svc;

import java.util.List;

import id.co.template.model.dto.TestDto;

/**
 * 
 * @author Joseph Tarigan
 *
 */
public interface TestSvc {

	public List<String> getTestList ();
	
	public List<TestDto> getListTestDto ();
}
