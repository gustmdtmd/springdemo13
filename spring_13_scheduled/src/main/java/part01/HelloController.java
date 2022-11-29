package part01;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import scheduler.SchedulerBean;

// http://localhost:8090/myapp/main.do

@Controller
public class HelloController {

	@RequestMapping("/main.do")
	public String execute() {
		return "part01/form";
	}
	
	//특정페이지에서 스케줄러를 출력하겠다하면 아래와 같이 하면된다.
	//@Scheduled(fixedDelay=1000)
	public void scheduledProcess() {
		System.out.println(new Date() + "스케줄링 처리완료" );
	}
	
}
