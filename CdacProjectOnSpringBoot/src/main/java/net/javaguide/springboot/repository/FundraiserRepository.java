package net.javaguide.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguide.springboot.model.Fundraiser;
@Repository
public interface FundraiserRepository extends JpaRepository<Fundraiser, Long> {

}
