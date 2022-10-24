package org.example.data.repository;

import org.example.entities.RecipeInstruction;
import org.springframework.data.repository.CrudRepository;

public interface RecipeInStructionRepository extends CrudRepository<RecipeInstruction, Integer> {
    
}
