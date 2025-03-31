package pe.upeu.edu.producto.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upeu.edu.producto.Domain.Producto;
import pe.upeu.edu.producto.Repository.ProductoRepository;
import pe.upeu.edu.producto.Service.ProductoService;

import java.util.List;
import java.util.Optional;
@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto create(Producto p) {
        return productoRepository.save(p);
    }

    @Override
    public Producto update(Producto p) {
        return productoRepository.save(p);
    }

    @Override
    public void delete(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public Optional<Producto> read(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public List<Producto> readAll() {
        return productoRepository.findAll();
    }
}
