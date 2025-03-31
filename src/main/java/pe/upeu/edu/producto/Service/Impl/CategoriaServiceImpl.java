package pe.upeu.edu.producto.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upeu.edu.producto.Domain.Categoria;
import pe.upeu.edu.producto.Repository.CategoriaRepository;
import pe.upeu.edu.producto.Service.CategoriaService;

import java.util.List;
import java.util.Optional;
@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria create(Categoria c) {
        return categoriaRepository.save(c);
    }

    @Override
    public Categoria update(Categoria c) {
        return categoriaRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        categoriaRepository.deleteById(id);
    }

    @Override
    public Optional<Categoria> read(Long id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public List<Categoria> readAll() {
        return categoriaRepository.findAll();
    }
}
