package org.javers.spring.boot.sql;

import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author pawelszymczyk
 */
@JaversSpringDataAuditable
public interface DummyEntityRepository extends JpaRepository<DummyEntity, Integer> {
}
