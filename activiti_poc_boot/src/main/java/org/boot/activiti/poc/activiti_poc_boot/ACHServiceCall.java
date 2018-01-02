package org.boot.activiti.poc.activiti_poc_boot;

import java.net.URI;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class ACHServiceCall implements JavaDelegate{
	@Autowired
	ProcessService ps;
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<String> entity=restTemplate.postForEntity(new URI("http://localhost:8085/achServiceCall"), new RequestRep(), String.class);
		System.err.println("Http Status code after ach serviceservice call..::"+entity.getStatusCodeValue());
		
		System.err.println("ACHServiceCall:execute..."+execution.getVariableNames());	
		
		System.err.println("ACHServiceCall::::  called  ...sub process dims wf...");
		
		String processId=execution.getEngineServices().getRuntimeService().startProcessInstanceByKey("dims_wf").getProcessInstanceId();
				
		System.err.println("Sub Process Started...with id"+processId);
		
		System.err.println("ACHServiceCall Completed........."+execution.getProcessInstanceId());
		
	}

}
