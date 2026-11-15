package io.github.saveriomandarano.gymtracker.repository;

import io.github.saveriomandarano.gymtracker.model.Workout;

import java.util.List;
import java.util.Optional;

public interface WorkoutRepository {
  List<Workout> findAll();

  Optional<Workout> findById(Integer id);

  Workout save(Workout workout);

  boolean deleteById(Integer id);
}
