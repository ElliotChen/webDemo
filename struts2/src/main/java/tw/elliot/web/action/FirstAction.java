package tw.elliot.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import tw.elliot.web.service.DemoService;

import com.opensymphony.xwork2.ActionSupport;

@Scope("prototype")
@Action("firstAction")
public class FirstAction extends ActionSupport {
	private String name;

	@Autowired
	private DemoService demoService;
	
	
	public FirstAction() {
		super();
		System.out.println("New Action " + this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public DemoService getDemoService() {
		return demoService;
	}

	public void setDemoService(DemoService demoService) {
		System.out.println("set service " + this);
		this.demoService = demoService;
	}

	public String firstMethod() {
		System.out.println("Method " + this);
		this.demoService.doSomething();
		return ActionSupport.SUCCESS;
	}
	
	
}
