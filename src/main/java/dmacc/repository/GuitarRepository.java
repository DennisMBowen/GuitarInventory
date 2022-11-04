package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Guitar;

/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Oct 31, 2022
 */
@Repository
public interface GuitarRepository extends JpaRepository<Guitar, Long>{ }
