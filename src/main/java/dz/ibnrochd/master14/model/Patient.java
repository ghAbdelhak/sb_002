package dz.ibnrochd.master14.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Patient implements Serializable {

    @Serial
    private static final long serialVersionUID = -3415388341943341473L;

    private int id;

    private String nom;

    private String prenom;

    private String sexe;

    private Date dateNaissance;

    private String numeroTelephone;

    private String adresse;

    private List<Consultation> consultations = new ArrayList<>();

    private List<RendezVous> rendezVous = new ArrayList<>();

    public Patient() {

    }


    public Patient(String nom, String prenom, String sexe, Date dateNaissance, String numeroTelephone,
                   String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.numeroTelephone = numeroTelephone;
        this.adresse = adresse;
    }


}
