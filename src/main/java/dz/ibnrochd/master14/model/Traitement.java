package dz.ibnrochd.master14.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter

public class Traitement implements Serializable {

    @Serial
    private static final Long serialVersionUID = 8248365590951840055L;

    private int id;

    private String nom;
}
