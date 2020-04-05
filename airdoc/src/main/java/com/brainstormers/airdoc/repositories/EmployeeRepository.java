package com.brainstormers.airdoc.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.brainstormers.airdoc.models.Employee;

/**
 * implementation de {@link MongoRepository MongoRepository.class}
 * @author Mustapha de BrainStormers
 * @since 13-03-2020
 * 
 */
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	 

		@Query("{'firstname': {$regex: ?0 }, 'city': {$regex: ?1} }")
		List<Employee> findAll(String query, String city, Sort sort);

		Employee findByEmail(String email);
		Employee findByUsername(String username);

		boolean existsByEmail(String Email);
		boolean existsByUsername(String username);
		
		void deleteByEmail(String email);

}