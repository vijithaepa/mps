package org.mps.entity.repo;

import org.mps.entity.ContactPerson;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vepa on 22/9/17.
 */
public interface ContactPersonRepo extends JpaRepository<ContactPerson, Long> {
}
