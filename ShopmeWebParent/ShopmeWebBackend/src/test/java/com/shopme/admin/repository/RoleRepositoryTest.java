package com.shopme.admin.repository;

import com.shopme.common.entity.Role;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class RoleRepositoryTest {

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void testCreateFirstRole(){
        Role roleAdmin = new Role("Admin","ManageEverything");
        Role savedRole = roleRepository.save(roleAdmin);
        assertTrue(savedRole.getId() > 0);
    }

    @Test
    public void testCreateRestRoles(){
        Role roleSalesPerson = new Role("Salesperson","manage product price, customers, shippping, order and sales reports");
        Role roleEditor = new Role("Editor","manage categories, brands, products and articles");
        Role roleShipper = new Role("Shipper","view products, view orders and update order status");
        Role roleAssistant = new Role("Assistant","manage questions and reviews");

        roleRepository.saveAll(List.of(roleSalesPerson, roleEditor, roleShipper, roleAssistant));
    }


}
