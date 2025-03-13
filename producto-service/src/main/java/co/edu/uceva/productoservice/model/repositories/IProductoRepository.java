package co.edu.uceva.productoservice.model.repositories;

import co.edu.uceva.productoservice.model.entities.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IProductoRepository extends CrudRepository<Producto, Long> {

}
