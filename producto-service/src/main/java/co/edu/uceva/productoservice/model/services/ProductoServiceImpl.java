package co.edu.uceva.productoservice.model.services;

import co.edu.uceva.productoservice.model.entities.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Override
    public Producto save(Producto producto) {
        return null;
    }

    @Override
    public void delete(Producto producto) {

    }

    @Override
    public Producto findById(Long id) {
        return null;
    }

    @Override
    public Producto update(Producto producto) {
        return null;
    }

    @Override
    public List<Producto> findAll() {
        return List.of();
    }
}
