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
"category",
"type",
"difficulty",
"question",
"correct_answer",
"incorrect_answers"
})
@Generated("jsonschema2pojo")
public class ServerResult {

@JsonProperty("category")
private String category;
@JsonProperty("type")
private String type;
@JsonProperty("difficulty")
private String difficulty;
@JsonProperty("question")
private String question;
@JsonProperty("correct_answer")
private String correctAnswer;
@JsonProperty("incorrect_answers")
private List<String> incorrectAnswers = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("category")
public String getCategory() {
return category;
}

@JsonProperty("category")
public void setCategory(String category) {
this.category = category;
}

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

@JsonProperty("correct_answer")
public String getCorrectAnswer() {
return correctAnswer;
}

@JsonProperty("correct_answer")
public void setCorrectAnswer(String correctAnswer) {
this.correctAnswer = correctAnswer;
}

@JsonProperty("incorrect_answers")
public List<String> getIncorrectAnswers() {
return incorrectAnswers;
}

@JsonProperty("incorrect_answers")
public void setIncorrectAnswers(List<String> incorrectAnswers) {
this.incorrectAnswers = incorrectAnswers;
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