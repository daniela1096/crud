package co.com.crudtest.model.product;
import lombok.*;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String id;
    private String name;
    private long price;
}
