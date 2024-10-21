package ar.edu.unq.unidad3.modelo;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public final class Item implements Serializable {


    private Long id;

    private String nombre;
    private Integer peso;

    private Personaje owner;

    public Item(@NonNull String nombre,  @NonNull Integer peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
}