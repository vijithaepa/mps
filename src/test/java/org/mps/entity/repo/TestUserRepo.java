package org.mps.entity.repo;

import org.junit.Assert;
import org.junit.Test;
import org.mps.entity.User;
import org.mps.entity.enums.UserRole;
import org.mps.mps.MpsApplicationTests;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by vepa on 22/9/17.
 */
public class TestUserRepo extends MpsApplicationTests {

  @Autowired
  UserRepo userRepo;

  @Test
  public void testAddUser() {
    User user = new User();
    user.setActive(true);
    user.setAddress("301 Melbourne");
    user.setEmail("a@b.c");
    user.setRole(UserRole.DONOR);
    user.setName("sam");
    user.setPasswordHash("SDSDSD");
    userRepo.save(user);

    Assert.assertNotNull(user.getId());
  }
}
