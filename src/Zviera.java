public abstract class Zviera {
    private String aMeno;

    public Zviera(String aMeno) {
        this.aMeno = aMeno;
    }

    public String getaMeno() {
        return aMeno;
    }

    public void setaMeno(String aMeno) {
        this.aMeno = aMeno;
    }

    public abstract void vydajZvuk();


}
