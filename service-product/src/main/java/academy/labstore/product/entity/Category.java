package academy.labstore.product.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_categories")
@AllArgsConstructor     //creador de constructor
@NoArgsConstructor  //constructor sin argumentos
@Builder    //construye nueva instancia de nuestra entidad
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
