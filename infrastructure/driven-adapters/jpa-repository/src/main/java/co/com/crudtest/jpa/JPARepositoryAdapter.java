package co.com.crudtest.jpa;

import co.com.crudtest.jpa.entities.ProductEntity;
import co.com.crudtest.jpa.helper.AdapterOperations;
import co.com.crudtest.model.product.Product;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<Product, ProductEntity, String, JPARepository>
// implements ModelRepository from domain
{

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {

        super(repository, mapper, d -> mapper.map(d, Product.class));
    }
}
