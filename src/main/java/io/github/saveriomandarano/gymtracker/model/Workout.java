package io.github.saveriomandarano.gymtracker.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Workout {

  private Integer id;
  private String notes;

  @NotNull
  private LocalDate date;

  @NotNull
  private String title;

  @Valid
  private List<ExerciseEntry> exercises = new ArrayList<>();

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public List<ExerciseEntry> getExercises() {
    return exercises;
  }

  public void setExercises(List<ExerciseEntry> exercises) {
    this.exercises = exercises;
  }
}
