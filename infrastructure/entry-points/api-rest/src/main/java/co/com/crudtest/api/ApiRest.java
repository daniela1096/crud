package co.com.crudtest.api;
import co.com.crudtest.model.product.Product;
import co.com.crudtest.usecase.crudproduct.CrudProductUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping(value = "/api/product", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final CrudProductUseCase crudProductUseCase;

    @GetMapping(path = "/{id}")
    public Product read(@PathVariable String id) {
        return crudProductUseCase.read(id);
    }

    @PostMapping
    public void create(@RequestBody Product product) {
        crudProductUseCase.create(product);
    }

    @PutMapping(path = "/{id}")
    public void update(@PathVariable String id, @RequestBody Product product) {
        try {
            crudProductUseCase.update(id, product);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable String id) {
        crudProductUseCase.delete(id);
    }

    @GetMapping
    public List<Product> getAll() {
        return crudProductUseCase.getAll();
    }
}
