
package com.portfolio1.mgb.Security.Repository;

import com.portfolio1.mgb.Security.Entity.Rol;
import com.portfolio1.mgb.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolName(RolNombre rolNombre);
}
