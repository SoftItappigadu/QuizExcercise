package com.org;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"response_code",
"results"
})
@Generated("jsonschema2pojo")
public class Response {
	@JsonProperty("response_code")
	private String response_code;
	@JsonProperty("results")
	private List<ServerResult> results = null;
	public String getResponse_code() {
		return response_code;
	}
	public void setResponse_code(String response_code) {
		this.response_code = response_code;
	}
	public List<ServerResult> getResults() {
		return results;
	}
	public void setResults(List<ServerResult> results) {
		this.results = results;
	}
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
