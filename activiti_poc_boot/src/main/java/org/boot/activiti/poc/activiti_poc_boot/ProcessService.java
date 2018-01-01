package org.boot.activiti.poc.activiti_poc_boot;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProcessService {

	@Autowired
	private RuntimeService runtimeService;

	@Autowired
	private TaskService taskService;

	@Autowired
	private PersonRepository personRepository;

	public void startProcess(RequestRep requestRep) {
		System.err.println("Process Started.............");
		runtimeService.startProcessInstanceByKey("ach_process_flow", getVariabalesOfRequest(requestRep));
	}

	public List<Task> getTasks() {
		return taskService.createTaskQuery().list();
	}

	private Map<String, Object> getVariabalesOfRequest(RequestRep requestRep) {
		Map<String, Object> variables = new HashMap<>();
		variables.put("requestId", requestRep.getRequestId());
		variables.put("name", requestRep.getRequestName());
		variables.put("timeOfRequest", requestRep.getRequestTime());
		return variables;

	}

	public void createDemoUsers() {
		if (personRepository.findAll().size() == 0) {
			personRepository.save(new Person("Ravi101", "Ravi", "Yadav", new Date()));
			personRepository.save(new Person("Susheel102", "Abhi", "Yadav", new Date()));
			for (Person per : personRepository.findAll())
				System.err.print("Person Saved Details....." + per.getId() + "::" + per.getFirstName() + "::"
						+ per.getLastName() + "::" + per.getBirthDate());
		}
	}

}
