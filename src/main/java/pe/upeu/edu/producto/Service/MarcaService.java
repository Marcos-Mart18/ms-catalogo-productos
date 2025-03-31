package pe.upeu.edu.producto.Service;

import pe.upeu.edu.producto.Domain.Marca;

import java.util.List;
import java.util.Optional;

public interface MarcaService {
    Marca create(Marca m);
    Marca update(Marca m);
    void delete(Long id);
    Optional<Marca> read(Long id);
    List<Marca> readAll();
}
