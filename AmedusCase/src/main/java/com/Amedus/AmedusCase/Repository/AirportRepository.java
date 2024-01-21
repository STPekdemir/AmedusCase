package com.Amedus.AmedusCase.Repository;


import com.Amedus.AmedusCase.Entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Integer> {
}
