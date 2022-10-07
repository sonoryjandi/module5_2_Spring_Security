package ru.amalysheva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.amalysheva.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
