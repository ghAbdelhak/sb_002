package dz.ibnrochd.master14.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter

public class RendezVous implements Serializable {

	@Serial
	private static final Long serialVersionUID = -7275578697948165342L;

    private int id;

    private Date dateRdv;

    private Patient patient;

    
}
