package co.edu.iudigital.helpmeiud.model;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "roles")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "nombre", nullable = false)
    String nombre;

    @Column
    String descripcion;

    //Si quiero haer la relación bidireccional
    @ManyToMany(mappedBy = "roles")
    List<Usuario> usuarios;
}
