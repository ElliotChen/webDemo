package tw.elliot.web.service;

import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoService {
	public DemoService() {
		System.out.println("New Service:"+this);
	}
	public void doSomething() {
		System.out.println("Do Something!");
	}
}
