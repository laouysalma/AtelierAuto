package entities;

import java.util.Date;

public class Reparation {
    private int id_reparation;
    private String type;
    private double cout;
    private Date date;
    private String immatricule;
    

    public Reparation() {}

    public Reparation(String type, double cout, Date date, String immatricule) {
        this.type = type;
        this.cout = cout;
        this.date = date;
        this.immatricule = immatricule;
    }

    public Reparation(int id_reparation, String immatricule, Date date, String type, double cout) {
        this.id_reparation = id_reparation;
        this.immatricule = immatricule;
        this.date = date;
        this.type = type;
        this.cout = cout;
    }

    public int getId_reparation() { return id_reparation; }
    public String getType() { return type; }
    public double getCout() { return cout; }
    public Date getDate() { return date; }
    public String getImmatricule() { return immatricule; }

    public void setType(String type) { this.type = type; }
    public void setCout(double cout) { this.cout = cout; }
    public void setDate(Date date) { this.date = date; }
    public void setImmatricule(String immatricule) { this.immatricule = immatricule; }

    @Override
    public String toString() {
        return "Reparation{" + "id=" + id_reparation + ", type=" + type + ", cout=" + cout + ", immat=" + immatricule + ", date=" + date + '}';
    }
}