package Main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Main.Model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
