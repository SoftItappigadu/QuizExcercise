package com.org;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"type",
"difficulty",
"question",
"all_answers",
"correct_answer"
})
@Generated("jsonschema2pojo")
public class Result {

@JsonProperty("type")
private String type;
@JsonProperty("difficulty")
private String difficulty;
@JsonProperty("question")
private String question;
@JsonProperty("all_answers")
private List<String> allAnswers = null;
@JsonProperty("correct_answer")
private String correctAnswer;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("type")
public String getType() {
return type;
}

@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

@JsonProperty("difficulty")
public String getDifficulty() {
return difficulty;
}

@JsonProperty("difficulty")
public void setDifficulty(String difficulty) {
this.difficulty = difficulty;
}

@JsonProperty("question")
public String getQuestion() {
return question;
}

@JsonProperty("question")
public void setQuestion(String question) {
this.question = question;
}

@JsonProperty("all_answers")
public List<String> getAllAnswers() {
return allAnswers;
}

@JsonProperty("all_answers")
public void setAllAnswers(List<String> allAnswers) {
this.allAnswers = allAnswers;
}

@JsonProperty("correct_answer")
public String getCorrectAnswer() {
return correctAnswer;
}

@JsonProperty("correct_answer")
public void setCorrectAnswer(String correctAnswer) {
this.correctAnswer = correctAnswer;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}