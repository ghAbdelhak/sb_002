package dz.ibnrochd.master14;

import dz.ibnrochd.master14.Service.ConsultationService;
import dz.ibnrochd.master14.Service.PatientService;
import dz.ibnrochd.master14.Service.TraitementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sb002Application implements CommandLineRunner {

    @Autowired
    PatientService patientService;

    @Autowired
    ConsultationService consultationService;

    @Autowired
    TraitementService traitementService;


    public static void main(String[] args) {
        SpringApplication.run(Sb002Application.class, args);
    }

    @Override
    public void run(String... args) {
//        // TODO : récupérer la liste de tous les patients puis afficher leurs noms
//        List<Patient> patients = patientService.getAllPatients();
//        for (Patient patient : patients) {
//            System.out.println(patient.getNom());
//        }
//        // TODO : rechercher les patients ayant le nom "Yahi" puis leurs prénoms
//        List<Patient> patientsBynames = patientService.getPatientByNom("Yahi");
//        if (patientsBynames.isEmpty()) {
//            System.out.println("EMPTY ");
//        } else {
//            for (Patient patient : patientsBynames) {
//                System.out.println("hello : " + patient.getNom() + " " + patient.getPrenom());
//            }
//        }
//        // TODO : créer un nouveau patient (valeurs au choix)  PUIS enregistrer-le
//        String[] names = {"Adam", "Alex", "Ben", "Charlie", "David", "Edward", "Frank", "George", "Harry", "Ian"};
//        String[] surnames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez"};
//        int nameIndex = ThreadLocalRandom.current().nextInt(0, names.length);
//        int surnameIndex = ThreadLocalRandom.current().nextInt(0, surnames.length);
//        String name = names[nameIndex];
//        String surname = surnames[surnameIndex];
//        String sexe = "m";
//        Date dateNaissance = new Date(ThreadLocalRandom.current().nextLong(System.currentTimeMillis()));
//        String numeroTelephone = "05" + ThreadLocalRandom.current().nextInt(10000000, 99999999);
//        String adresse = "C.N.T.S.I.D";
//        Patient newPatient = new Patient(name, surname, sexe, dateNaissance, numeroTelephone, adresse);
//        patientService.createPatient(newPatient);
//        // TODO : rechercher la consultation ayant id=3
//        int consId = 3;
//        Optional<Consultation> consultation = Optional.ofNullable(consultationService.getConsultationById(consId));
//        // TODO : parcourir les lignes de la consultation trouvée et afficher les noms des médicaments
//        if (consultation.isPresent()) {
//            Consultation foundConsultation = consultation.get();
//            System.out.println("Consultation trouvée : " + foundConsultation.getId());
//            System.out.println("motif : " + foundConsultation.getMotif());
//            System.out.println("Date : " + foundConsultation.getDateConsult());
//            List<LigneConsultation> lignesConsultation = foundConsultation.getLignesConsultation();
//            if (!lignesConsultation.isEmpty()) {
//                for (LigneConsultation ligne : lignesConsultation) {
//                    System.out.println("Médicaments de la ligne de consultation : " + ligne.getTraitement().getNom() + " " + ligne.getQuantite());
//                }
//            }
//        } else {
//            System.out.println("Consultation non trouvée avec l'ID : " + consId);
//        }


    }

}
