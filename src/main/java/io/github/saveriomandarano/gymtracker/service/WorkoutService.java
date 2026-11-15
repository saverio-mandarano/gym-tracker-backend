package io.github.saveriomandarano.gymtracker.service;

import io.github.saveriomandarano.gymtracker.model.Workout;
import io.github.saveriomandarano.gymtracker.repository.WorkoutRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkoutService {

  private final WorkoutRepository repository;

  public WorkoutService(WorkoutRepository repository) {
    this.repository = repository;
  }

  public List<Workout> findAll() {
    return repository.findAll();
  }

  public Workout findById(Integer id) {
    return repository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Allenamento non trovato"));
  }

  public Workout create(Workout workout) {
    workout.setId(null); // l'id lo faccio generare al server, ignoro un eventuale id in arrivo dal client che potrebbe sovrascrivere un allenamento.
    return repository.save(workout);
  }

  public Workout update(Integer id, Workout workout) {
    findById(id); // lancia 404 se non esiste
    workout.setId(id);
    return repository.save(workout);
  }

  public void delete(Integer id) {
    if (!repository.deleteById(id)) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Allenamento non trovato");
    }
  }
}
