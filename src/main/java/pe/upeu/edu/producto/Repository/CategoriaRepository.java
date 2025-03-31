package pe.upeu.edu.producto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upeu.edu.producto.Domain.Categoria;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
