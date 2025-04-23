package mainpkg.highcourt.operationofhighcourtbarassociation.Register;

import java.io.Serializable;
import java.time.LocalDate;

public class Records implements Serializable {
    int recordid;
    String description;
    LocalDate date;

    public Records(LocalDate date, int recordid, String description) {
        this.date = date;
        this.recordid = recordid;
        this.description = description;
    }

    public int getRecordid() {
        return recordid;
    }

    public void setRecordid(int recordid) {
        this.recordid = recordid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Records{" +
                "recordid=" + recordid +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
