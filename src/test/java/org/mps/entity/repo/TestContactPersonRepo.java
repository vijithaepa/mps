package org.mps.entity.repo;

import org.junit.Assert;
import org.junit.Test;
import org.mps.entity.ContactPerson;
import org.mps.entity.enums.RelationshipType;
import org.mps.mps.MpsApplicationTests;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

/**
 * Created by vepa on 26/9/17.
 */
public class TestContactPersonRepo extends MpsApplicationTests {

  @Autowired
  ContactPersonRepo contactPersonRepo;

  @Autowired
  MemberRepo memberRepo;

  @Transactional
  @Test public void testSaveContactPerson() {

    ContactPerson contactPerson = new ContactPerson();
    contactPerson.setEmail("ab@b.c");
    contactPerson.setAddress("Pint cook 2");
    contactPerson.setName("John 2");
    contactPerson.setPhone("02893840234");
    contactPerson.setRelationshipType(RelationshipType.RALATIVE);

    contactPerson.addMember(memberRepo.findOne(1L));
    contactPerson.addMember(memberRepo.findOne(98304L));
//    member.setContactPerson(contactPerson);

    contactPersonRepo.save(contactPerson);

    Assert.assertNotNull(contactPerson.getId());
  }
}
