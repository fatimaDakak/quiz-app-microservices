package com.example.quizservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class QuizDto {
    @JsonProperty("CategoryName")
    private String categoryName;

    @JsonProperty("NumQuestions")
    private Integer numQuestions;

    @JsonProperty("title")
    private String title;
}
