package com.portfolio1.mgb.Security.Service;


import com.portfolio1.mgb.Security.Entity.Rol;
import com.portfolio1.mgb.Security.Enums.RolNombre;
import com.portfolio1.mgb.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolName(rolNombre);
            }
    
    public void save(Rol rol) {
        irolRepository.save(rol);
    }
    
}
