package Entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

@Getter
@Setter
@Entity
public class Product {
    private Long id;
    private String name;
    private int price;
}
