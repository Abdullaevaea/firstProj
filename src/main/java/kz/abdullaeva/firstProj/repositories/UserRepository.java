package kz.abdullaeva.firstProj.repositories;


import jakarta.transaction.Transactional;
import kz.abdullaeva.firstProj.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
User findAllById(long id);
}
