package pe.upeu.edu.producto.Service;

import pe.upeu.edu.producto.Domain.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    Producto create(Producto p);
    Producto update(Producto p);
    void delete(Long id);
    Optional<Producto> read(Long id);
    List<Producto> readAll();
}
