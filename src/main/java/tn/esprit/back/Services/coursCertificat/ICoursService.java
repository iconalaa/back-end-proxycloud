package tn.esprit.back.Services.coursCertificat;

import org.springframework.web.multipart.MultipartFile;
import tn.esprit.back.Entities.coursCertificat.Cours;
import tn.esprit.back.Entities.coursCertificat.Test;

import java.io.IOException;
import java.util.List;

public interface ICoursService {
    Cours addCours(Cours cours);
    Cours updateCours(Cours cours);
    void deleteCours(long idcours);
    List<Cours> getAllCours();
    Cours getCoursById(long idcours);

    public Cours affectCertificatToCours(long idCours, long idCertificat);
    Cours addCoursAndAffectCertificat(Cours cours, long idCertificat);

    public Cours affectTestToCours(long idCours, long idTest);
    Cours addCoursAndAffectTest(Cours cours, long idTest);

    public String saveImage(MultipartFile file) throws IOException;
    public String saveDocument(MultipartFile file) throws IOException;

    Cours getCoursByTestId(long testId);

}
