package edu.arep.bidify.repository;
import edu.arep.bidify.model.Producto;
import edu.arep.bidify.model.Subasta;
import edu.arep.bidify.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface SubastaRepository extends MongoRepository<Subasta, Integer> {
    Optional<Subasta> findBySubastador(Usuario subastador);
    Optional<Subasta> findByProducto(Producto producto);
    Optional<Subasta> findById(int id);
}
