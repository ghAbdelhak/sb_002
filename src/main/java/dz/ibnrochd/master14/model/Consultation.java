package dz.ibnrochd.master14.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


@Getter
@Setter
public class Consultation implements Serializable {

	@Serial
	private static final Long serialVersionUID = -3669998604878710274L;


	private int id;


	private Timestamp dateConsult;


	private List<LigneConsultation> lignesConsultation;

	private String motif;

	private Patient patient;

}
