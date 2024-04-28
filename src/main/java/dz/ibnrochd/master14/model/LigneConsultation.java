package dz.ibnrochd.master14.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;


@Getter
@Setter

public class LigneConsultation implements Serializable {

    @Serial
    private static final Long serialVersionUID = -1882485395538957648L;

    private int id;

    private String posologie;

    private String uniteTemps;

    private String quantite;


    private Traitement traitement;

    private Consultation consultation;

}

