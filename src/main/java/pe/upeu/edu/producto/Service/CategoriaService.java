package pe.upeu.edu.producto.Service;

import pe.upeu.edu.producto.Domain.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    Categoria create(Categoria c);
    Categoria update(Categoria c);
    void delete(Long id);
    Optional<Categoria> read(Long id);
    List<Categoria> readAll();
}
