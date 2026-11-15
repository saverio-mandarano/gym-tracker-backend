package io.github.saveriomandarano.gymtracker.controller;

import io.github.saveriomandarano.gymtracker.model.Workout;
import io.github.saveriomandarano.gymtracker.service.WorkoutService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

  private final WorkoutService service;

  public WorkoutController(WorkoutService service) {
    this.service = service;
  }

  @GetMapping
  public List<Workout> getAll() {
    return service.findAll();
  }

  @GetMapping("/{id}")
  public Workout getById(@PathVariable Integer id) {
    return service.findById(id);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Workout create(@Valid @RequestBody Workout workout) {
    return service.create(workout);
  }

  @PutMapping("/{id}")
  public Workout update(@PathVariable Integer id, @Valid @RequestBody Workout workout) {
    return service.update(id, workout);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Integer id) {
    service.delete(id);
  }
}
