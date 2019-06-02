package Lesson11.Rada;

import java.util.List;
import java.util.Objects;

public class Partia {
    private List<Deputy> deputies;


    public Partia(List<Deputy> deputies) {
        this.deputies = deputies;

    }

    public List<Deputy> getDeputies() {
        return deputies;
    }

    public void setDeputies(List<Deputy> deputies) {
        this.deputies = deputies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Partia)) return false;
        Partia partia = (Partia) o;
        return Objects.equals(deputies, partia.deputies);
    }

    @Override
    public int hashCode() {

        return Objects.hash(deputies);
    }

    @Override
    public String toString() {
        return "Partia{" +
                "deputies=" + deputies +
                '}';
    }
}
