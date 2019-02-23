package app;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Vrouw {
    private LocalDate geboorteDatum;
    private String name;
    private int leeftijd;

    public Vrouw(String naam, LocalDate geboorte) {
        this.name = naam;
        this.geboorteDatum = geboorte;
        this.leeftijd = this.getAge();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    private int getAge(){
        return Period.between(this.geboorteDatum, LocalDate.now()).getYears();
    }

    public String praat(){
        return "Je hebt gelijk Jordy!";
    }

    private long getDaysTillBirthday(){
        long dagen;
        LocalDate thisYearsBirthday =  LocalDate.of(LocalDate.now().getYear(),this.geboorteDatum.getMonth(),this.geboorteDatum.getDayOfMonth());
        if (LocalDate.now().isBefore(thisYearsBirthday)) {
            dagen = ChronoUnit.DAYS.between(LocalDate.now(),thisYearsBirthday);
        }
        else{
            dagen = ChronoUnit.DAYS.between(LocalDate.now() , LocalDate.of(LocalDate.now().getYear() + 1,this.geboorteDatum.getMonth(),this.geboorteDatum.getDayOfMonth()));
        }
        return dagen;
    }

    public String tel(){
        
        return "Nog " + this.getDaysTillBirthday() + " dagen tot mijn verjaardag!";
    }

    @Override
    public String toString() {
        return this.name + " is momenteel " + this.leeftijd + " jaar oud.";
    }
    
}