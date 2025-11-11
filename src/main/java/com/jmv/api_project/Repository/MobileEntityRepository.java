package com.jmv.api_project.Repository;

import com.jmv.api_project.Model.Entity.MobileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileEntityRepository extends JpaRepository<MobileEntity, Long> {
}
