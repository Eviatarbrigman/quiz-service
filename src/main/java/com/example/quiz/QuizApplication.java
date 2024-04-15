package com.example.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QuizApplication {
//	@Autowired
//	QuizService quizService;


    public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);

	}
//	@Component
//	public class init implements CommandLineRunner {
//
//		@Override
//		public void run(String... args) throws Exception {
//			QuizDto quizDto = new QuizDto();
//			quizService.createQuiz(quizDto);
//		}
//	}

}
