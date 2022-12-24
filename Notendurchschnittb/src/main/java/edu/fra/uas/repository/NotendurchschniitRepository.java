package edu.fra.uas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.fra.uas.model.StudentAccount;

@Repository
public interface  NotendurchschniitRepository extends JpaRepository<StudentAccount, Long>{
	

}
