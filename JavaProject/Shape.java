// Όνομα: [Το Όνομά Σας]
// ΑΜ: [Ο Αριθμός Μητρώου Σας]

public abstract class Shape {
    private String type; //τύπος του σχήματος
    private double accessMethodForSquare; //εμβαδόν περιβάλλοντος τετραγώνου

    public Shape(String type, double accessMethodForSquare) {
        this.type = type; //αρχικοποίηση του τύπου
        this.accessMethodForSquare = accessMethodForSquare; //αρχικοποίηση του εμβαδόν του περιβάλλοντος τετραγώνου
    }

    public abstract double computeArea(); //αφηρημένη μέθοδος computeArea η οποία επιστρέφει το εμβαδόν του σχήματος (double) 

    public double computePoints() { //μέθοδος computePoints η οποία υπολογίζει τους πόντους που δίνει το σχήμα
        return computeArea(); //υπολογίζει τους πόντους με βάση το εμβαδόν του σχήματος
    }

    public boolean sameArea(Shape other) { //μέθοδος sameArea η οποία παίρνει σαν όρισμα ένα άλλο σχήμα και συγκρίνει αν έχουν το ίδιο εμβαδόν
        return this.computeArea() == other.computeArea(); //ελέγχει αν το τρέχον σχήμα έχει το ίδιο εμβαδόν με ένα άλλο σχήμα
    }

    public boolean sameType(Shape other) { //μέθοδος sameType η οποία παίρνει σαν όρισμα ένα άλλο σχήμα και συγκρίνει αν έχουν τον ίδιο τύπο
        return this.type.equals(other.type); //ελέγχει αν το τρέχον σχήμα έχει τον ίδιο τύπο με ένα άλλο σχήμα
    }

    @Override
    public String toString() { //μέθοδος toString η οποία επιστρέφει ένα String με τον τύπο και εμβαδόν του σχήματος
        return type + ": " + computeArea();
    }

    public double getAccessMethodForSquare() { //μέθοδος πρόσβασης για το εμβαδόν του περιβάλλοντος τετραγώνου
        return accessMethodForSquare;
    }
}
