package org.boot.activiti.poc.activiti_poc_boot;

import java.util.ArrayList;
import java.util.List;

import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessEndpPointController {

    @Autowired
    private ProcessService myService;
    
    @RequestMapping(value="/process", method= RequestMethod.POST)
    public void startProcessInstance(@RequestBody RequestRep startProcessRepresentation) {
        myService.startProcess(startProcessRepresentation);
    }

    @RequestMapping(value="/tasks", method= RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public List<TaskRepresentation> getTasks() {
        List<Task> tasks = myService.getTasks();
        List<TaskRepresentation> dtos = new ArrayList<TaskRepresentation>();
        for (Task task : tasks) {
            dtos.add(new TaskRepresentation(task.getId(), task.getName()));
        }
        return dtos;
    }
    @RequestMapping(value="/achServiceCall",method=RequestMethod.POST,consumes= {MediaType.APPLICATION_JSON_VALUE})
    public String achServiceCall(@RequestBody RequestRep request)
    {
    	System.err.println("Request recieved for service call.... ");
    	return "Successfully called....";
    	
    }
    
    @RequestMapping(value="updateAchWF",method=RequestMethod.POST,consumes= {MediaType.APPLICATION_JSON_VALUE})
    public void updateAchWF(@RequestBody ProcessUpdateReq processReq)
    {
    	System.err.println("ACH WF updated for process id:::"+processReq.getProcessId()+"::"+processReq.getStatus());
    }

}