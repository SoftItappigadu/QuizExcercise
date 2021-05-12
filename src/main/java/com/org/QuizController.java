package com.org;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class QuizController {
	@GetMapping("/coding/exercise/quiz")
	public Example getQuizResults() {
		List<Quiz> quiz = new ArrayList<Quiz>();
		String uri1 = "https://opentdb.com/api.php?amount=5&category=11";
	    RestTemplate restTemplate1 = new RestTemplate();
	    Response serverResponse1 = restTemplate1.getForObject(uri1, Response.class);
	    Quiz quiz1 = new Quiz();
	    quiz1.setCategory("Entertainment: Film");
	    List<Result> results1 = new ArrayList<Result>();
	    List<ServerResult> serverResults1 = serverResponse1.getResults();
	    for(ServerResult serverResult1 : serverResults1) {
	    	Result result1 = new Result();
	    	result1.setType(serverResult1.getType());
	    	result1.setDifficulty(serverResult1.getDifficulty());
	    	result1.setQuestion(serverResult1.getQuestion());
	    	List<String> all_answers1 = new ArrayList<String>();
	    	all_answers1.addAll(serverResult1.getIncorrectAnswers());
	    	all_answers1.add(serverResult1.getCorrectAnswer());
	    	result1.setAllAnswers(all_answers1);
	    	result1.setCorrectAnswer(serverResult1.getCorrectAnswer());
	    	results1.add(result1);
	    }
	    quiz1.setResults(results1);
	    quiz.add(quiz1);
	    
	    String uri2 = "https://opentdb.com/api.php?amount=5&category=12";
	    RestTemplate restTemplate2 = new RestTemplate();
	    Response serverResponse2 = restTemplate2.getForObject(uri2, Response.class);
	    Quiz quiz2 = new Quiz();
	    quiz2.setCategory("Entertainment: Music");
	    List<Result> results2 = new ArrayList<Result>();
	    List<ServerResult> serverResults2 = serverResponse2.getResults();
	    for(ServerResult serverResult2 : serverResults2) {
	    	Result result2 = new Result();
	    	result2.setType(serverResult2.getType());
	    	result2.setDifficulty(serverResult2.getDifficulty());
	    	result2.setQuestion(serverResult2.getQuestion());
	    	List<String> all_answers2 = new ArrayList<String>();
	    	all_answers2.addAll(serverResult2.getIncorrectAnswers());
	    	all_answers2.add(serverResult2.getCorrectAnswer());
	    	result2.setAllAnswers(all_answers2);
	    	result2.setCorrectAnswer(serverResult2.getCorrectAnswer());
	    	results2.add(result2);
	    }
	    quiz2.setResults(results2);
	    quiz.add(quiz2);
	    Example example = new Example();
	    example.setQuiz(quiz);
	    return example;
	}
	
//	public static void main(String args[]) {
//		String uri = "https://opentdb.com/api.php?amount=5&category=11";
//	    RestTemplate restTemplate = new RestTemplate();
//	    Object result = restTemplate.getForObject(uri, Object.class);
//	    System.out.println(result);
//	}

}
