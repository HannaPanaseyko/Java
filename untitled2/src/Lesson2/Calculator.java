package Lesson2;

public class Calculator {
    private float first;
    private float second;

    public Calculator(float first, float second) {
        this.first = first;
        this.second = second;
    }

    public void sum() {
        System.out.println(this.first + this.second);
    }

    public float sumReturn() {
        return first + second;
    }

    public void diversity() {
        System.out.println(this.first - this.second);
    }

    public float diversityReturn() {
        return first - second;
    }

    public void multiply() {
        System.out.println(this.first * this.second);
    }

    public float multiplyReturn() {
        return first * second;
    }

    public void division() {
        System.out.println(this.first / this.second);
    }

    public float divisionReturn() {
        return first / second;
    }

    public void krtn() {
        System.out.println(this.first % this.second);
    }

    public float krtnReturn() {
        return first % second;
    }


}