package chap02.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "meals")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meal_id")
    private int mealId;

    @Column(name = "menu_name", nullable = false)
    private String menuName;

    @Column(name = "weight_gram",nullable = false)
    private int weightGram;

    @Column(name = "eat_at",nullable = false)
    private LocalDateTime eatAt;

    protected Meal(){

    }

    public Meal( String menuName, int weightGram, LocalDateTime eatAt) {

        this.menuName = menuName;
        this.weightGram = weightGram;
        this.eatAt = eatAt;
    }




    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getWeightGram() {
        return weightGram;
    }

    public void setWeightGram(int weightGram) {
        this.weightGram = weightGram;
    }

    public LocalDateTime getEatAt() {
        return eatAt;
    }

    public void setEatAt(LocalDateTime eatAt) {
        this.eatAt = eatAt;
    }

    @Override
    public String toString() {
        return "Meal{" + "mealId=" + mealId + ", menuName='" + menuName + '\'' + ", weightGram="
                + weightGram + ", eatAt=" + eatAt + '}';
    }
}
