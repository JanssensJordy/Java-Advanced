package be.ap.javadv.collections;
import java.time.LocalDate;

public class Link <v extends Person>{
    private LocalDate startDate;
    private String link;
    private v personA;
    private v personB;

    public Link(v a, v b, String link) {
        setStartDate(LocalDate.now());
        setLink(link);
        this.personA = a;
        this.personB = b;
    }
    /**
     * @param link the link to set
     */
    public void setLink(String link) {
        this.link = link;
    }
    /**
     * @return the personA
     */
    public v getPersonA() {
        return personA;
    }
    /**
     * @return the personB
     */
    public v getPersonB() {
        return personB;
    }
    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    /**
     * @return the link
     */
    public String getLink() {
        return link;
    }
    /**
     * @return the startDate
     */
    public LocalDate getStartDate() {
        return startDate;
    }
    @Override
    public String toString(){
        return this.link;
    }
}