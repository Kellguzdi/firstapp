package mx.edu.utez.firstapp.models.category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
//Crea la tabla
@Table(name= "categories")

//Crean los constructores automaticamente
@AllArgsConstructor
@NoArgsConstructor
//Creacion de setters y getters
@Setter
@Getter

public class Category {
    //Se dice que será la primary key
    @Id
    //Auto-increment en el id de la base de datos
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    //Configuración de la columna
    @Column(unique = true,nullable = false,length = 150)
    private String name;
    @Column(name="status",nullable = false,columnDefinition = "tinyint default 1")
    private boolean status;

}
