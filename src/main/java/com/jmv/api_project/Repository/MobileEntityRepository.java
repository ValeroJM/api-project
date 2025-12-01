package com.jmv.api_project.Repository;

import com.jmv.api_project.Model.Entity.MobileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MobileEntityRepository extends JpaRepository<MobileEntity, Long> {
    MobileEntity findBymobileID(Long id);
}
