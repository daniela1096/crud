package co.com.crudtest.jpa;

import co.com.crudtest.jpa.entities.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<ProductEntity, String>, QueryByExampleExecutor<ProductEntity> {
}