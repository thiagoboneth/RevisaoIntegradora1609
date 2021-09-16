package Exercicio3;

public class Retangulo {

    private double area;

    public void calculaArea(double ladoA, double ladoB){

        this.area = ladoA * ladoB;
        System.out.println("Area calculada de lado A "+ ladoA + " calculado de lado B "+ ladoB + " é de " + area + " m-quadrado!");

    }

    public void calculaPerimetro(double ladoA, double ladoB){
        this.area =2* ( ladoA + ladoB);
        System.out.println("Area calculada de lado A "+ ladoA + " calculado de lado B "+ ladoB + " tem o perimetro " + area + " metros!");
    }
    public void quantidadePiso(double areaLajota, double areaTotal){

        this.area = areaTotal / areaLajota;
        System.out.println("O perimetro calculada da area da lajota "+ areaLajota + " calculado com a area  "+ areaTotal + " vai precisar de  " + area + " lajotas!");
    }


    public void quantidadeRodape(double cumprimentoLajota, double perimetro){
        area = perimetro / cumprimentoLajota   ;
        System.out.println("O comprimetro da lajota é de "+ cumprimentoLajota + " calculado com o perimetro  "+ perimetro + " vai precisar de  " + area + " pisos!");
    }
}
