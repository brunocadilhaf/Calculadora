public class Calculo {
    private double num1;
    private double num2;
    private String tipo;
    private double resultado;

    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void somar() {
        this.tipo = "Soma";
        this.resultado = this.num1 + this.num2;
    }

    public void subtrair() {
        this.tipo = "Subtração";
        this.resultado = this.num1 - this.num2;
    }

    public void multiplicar() {
        this.tipo = "Multiplicação";
        this.resultado = this.num1 * this.num2;
    }

    public void dividir() {
        this.tipo = "Divisão";
        this.resultado = this.num1 / this.num2;
    }
}
