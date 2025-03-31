package pe.upeu.edu.producto.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upeu.edu.producto.Domain.Marca;
import pe.upeu.edu.producto.Repository.MarcaRepository;
import pe.upeu.edu.producto.Service.MarcaService;

import java.util.List;
import java.util.Optional;
@Service
public class MarcaServiceImpl implements MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    @Override
    public Marca create(Marca m) {
        return marcaRepository.save(m);
    }

    @Override
    public Marca update(Marca m) {
        return marcaRepository.save(m);
    }

    @Override
    public void delete(Long id) {
        marcaRepository.deleteById(id);
    }

    @Override
    public Optional<Marca> read(Long id) {
        return marcaRepository.findById(id);
    }

    @Override
    public List<Marca> readAll() {
        return marcaRepository.findAll();
    }
}
