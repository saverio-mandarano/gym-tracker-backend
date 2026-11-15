package io.github.saveriomandarano.gymtracker.repository;

import io.github.saveriomandarano.gymtracker.model.Workout;
import org.springframework.stereotype.Repository;

import java.util.*;

//Implementazione temporanea, i dati si perdono al riavvio del server.
@Repository
public class WorkoutRepositoryImpl implements WorkoutRepository {

  private final Map<Integer, Workout> store = new HashMap<>();
  private Integer workoutIds = 0;
  private Integer childIds = 0;

  @Override
  public List<Workout> findAll() {
    List<Workout> list = new ArrayList<>(store.values());
    list.sort((a, b) -> b.getDate().compareTo(a.getDate()));
    return list;
  }

  @Override
  public Optional<Workout> findById(Integer id) {
    return Optional.ofNullable(store.get(id));
  }

  @Override
  public Workout save(Workout workout) {
    if (workout.getId() == null) {
      workoutIds++;
      workout.setId(workoutIds);
    }
    // Assegna id a esercizi e serie, come farebbe un database
    workout.getExercises().forEach(exercise -> {
      if (exercise.getId() == null) {
        childIds++;
        exercise.setId(childIds);
      }
      exercise.getSets().forEach(setLog -> {
        if (setLog.getId() == null) {
          childIds++;
          setLog.setId(childIds);
        }
      });
    });
    store.put(workout.getId(), workout);
    return workout;
  }

  @Override
  public boolean deleteById(Integer id) {
    return store.remove(id) != null;
  }
}
