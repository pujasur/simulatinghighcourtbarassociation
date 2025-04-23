package mainpkg.highcourt.operationofhighcourtbarassociation.Register;

import java.io.Serializable;
import java.time.LocalDate;

public class Licence implements Serializable {
    int licenceid;
    String status;
    LocalDate date;

    public Licence(int licenceid, String status, LocalDate date) {
        this.licenceid = licenceid;
        this.status = status;
        this.date = date;
    }

    public int getLicenceid() {
        return licenceid;
    }

    public void setLicenceid(int licenceid) {
        this.licenceid = licenceid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Licence{" +
                "licenceid=" + licenceid +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}
