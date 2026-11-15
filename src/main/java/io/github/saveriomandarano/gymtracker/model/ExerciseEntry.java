package io.github.saveriomandarano.gymtracker.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

public class ExerciseEntry {
  private Integer id;
  private String plannedSets; // stringa per ammettere valori in range: (2+3)
  private String plannedReps;   // stringa per ammettere valore in range: 6-10
  private String notes;

  @NotBlank
  private String name;

  @Min(0) //voglio vietare valori negativi
  private int restSeconds;

  @Valid
  private List<SetLog> sets = new ArrayList<>();

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPlannedSets() {
    return plannedSets;
  }

  public void setPlannedSets(String plannedSets) {
    this.plannedSets = plannedSets;
  }

  public String getPlannedReps() {
    return plannedReps;
  }

  public void setPlannedReps(String plannedReps) {
    this.plannedReps = plannedReps;
  }

  public int getRestSeconds() {
    return restSeconds;
  }

  public void setRestSeconds(int restSeconds) {
    this.restSeconds = restSeconds;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public List<SetLog> getSets() {
    return sets;
  }

  public void setSets(List<SetLog> sets) {
    this.sets = sets;
  }
}
