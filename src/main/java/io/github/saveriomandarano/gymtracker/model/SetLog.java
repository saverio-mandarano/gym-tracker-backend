package io.github.saveriomandarano.gymtracker.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class SetLog {

  private Integer id;

  @NotNull
  @Min(0)
  private Integer reps;

  @NotNull
  @Min(0)
  private Double weightKg;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getReps() {
    return reps;
  }

  public void setReps(Integer reps) {
    this.reps = reps;
  }

  public Double getWeightKg() {
    return weightKg;
  }

  public void setWeightKg(Double weightKg) {
    this.weightKg = weightKg;
  }
}
