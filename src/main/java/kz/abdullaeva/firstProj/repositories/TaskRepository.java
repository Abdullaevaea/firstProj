package kz.abdullaeva.firstProj.repositories;

import jakarta.transaction.Transactional;
import kz.abdullaeva.firstProj.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface TaskRepository extends JpaRepository<Task, Long> {
Task findAllById(long id);
}
