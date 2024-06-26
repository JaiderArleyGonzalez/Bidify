package edu.arep.bidify.repository;

import edu.arep.bidify.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, Integer> {
    Usuario findByUserNameAndPassword(String userName, String password);
    boolean existsByUserName(String nombre);
    boolean existsById(int id);
    void deleteByUserName(String userName);
}
