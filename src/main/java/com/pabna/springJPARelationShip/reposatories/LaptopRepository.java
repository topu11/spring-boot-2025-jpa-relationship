package com.pabna.springJPARelationShip.reposatories;

import com.pabna.springJPARelationShip.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Integer> {
}
