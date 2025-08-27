package taller;

public class CasoC {
    public static void main(String[] args) {
         // km
        double d1 = 65.0;
         System.out.println("d1 = " + d1);

        double d2 = 48.5 ;
        System.out.println("d2 = " + d2);

        double d3 = 75.2;
        System.out.println("d3 = " + d3);

        // tiempo
         double t1 = 1.2;
        System.out.println("t1 = " + t1);

        double t2 =   0.95 ;
         System.out.println("t2 = " + t2);

        double t3 = 1.6;
        System.out.println("t3 = " + t3);

        //litros
        double l1 = 6.8 ;
        System.out.println("l1 = " + l1);

        double l2 =  5.5 ;
        System.out.println("l2 = " + l2);

        double l3 = 9.1;
        System.out.println("l3 = " + l3);

        //otros datos 

        double preciolitro = 1.55;
        System.out.println("preciolitro = " + preciolitro);

        double masacargakg = 1800.0;
        System.out.println("masacargakg = " + masacargakg);

        double largo = 2.6;
        System.out.println("largo = " + largo);
        double ancho = 1.5;
        System.out.println("ancho = " + ancho);

        double alto = 1.4;
        System.out.println("alto = " + alto);

        //peajes

        double p1 = 3.5;
        System.out.println("p1 = " + p1);

        double p2 = 2.9;
        System.out.println("p2 = " + p2);

        double p3 = 3.7;
        System.out.println("p3 = " + p3);

        double deprecporkm = 0.12;
        System.out.println("deprecporkm = " + deprecporkm);

        double volcamionM3 =15.0;
        System.out.println("volcamionM3 = " + volcamionM3);

        double Fco2 = 2.75; 
        System.out.println("Fco2 = " + Fco2);

        double galPorlitro = 0.264172;
        System.out.println("galPorlitro = " + galPorlitro);

        double vmin  = 25;
        System.out.println("vmin = " + vmin);

        double vmax = 85;
        System.out.println("vmax = " + vmax);

        double va =35;
        System.out.println("va = " + va);

        double vb =85;
       System.out.println("vb = " + vb);

        double ca=0.007;
        System.out.println("ca = " + ca);

        double cb=0.11;
        System.out.println("cb = " + cb);

        double a = -0.0001;
        System.out.println("a = " + a);

        double b = 0.0065;
        System.out.println("b = " + b);

        double c = 4.3;
        System.out.println("c = " + c); 

          // velocidades 
        double v1 = d1 / t1;
        System.out.println("v1 = " + v1);

        double v2 = d2 / t2;
        System.out.println("v2 = " + v2);

        double v3 = d3 / t3;
        System.out.println("v3 = " + v3);

        double vprom = (d1 * v1 + d2 * v2 + d3 * v3) / (d1 + d2 + d3);
        System.out.println("vprom = " + vprom);

        // Rendimiento por tramo 
        double kml1 = d1/ l1;
        System.out.println("kml1 = " + kml1);

        double kml2 = d2/ l2;
        System.out.println("kml2 = " + kml2);

        double kml3 = d3/ l3;
        System.out.println("kml3 = " + kml3);

        double kmltotal = (d1 + d2 + d3) / (l1 + l2 + l3);
        System.out.println("kmltotal = " + kmltotal);

        //Costos directos 
        double costoComb=(l1 + l2 + l3) *preciolitro;
        System.out.println("costoComb = " + costoComb);


        double deprec = (d1 + d2 + d3) *deprecporkm;
        System.out.println("deprec = " + deprec);

        double peajes = p1 + p2 + p3; 
        System.out.println("peajes = " + peajes);

        double costoDirecto = costoComb + deprec + peajes;
        System.out.println("costoDirecto = " + costoDirecto);

        double costoPorKm = costoDirecto/(d1+d2+d3);
        System.out.println("costoPorKm = " + costoPorKm);

        //volumen 
        double volumenM3 = largo *ancho* alto;
        System.out.println("volumenM3 = " + volumenM3);

        double densidad = masacargakg / volumenM3;
        System.out.println("densidad = " + densidad);

        double ocupacion = volumenM3 / volcamionM3;
        System.out.println("ocupacion = " + ocupacion);

        //Emisiones de CO2
        double coa2total = (l1+l2+l3)*Fco2;
        System.out.println("coa2total = " + coa2total);

        double co2PorKm = coa2total / (d1 + d2 + d3);
        System.out.println("co2PorKm = " + co2PorKm); 

        //Conversiones y normalizacion

        double v_Ms_prom = vprom * 1000 / 3600; 
        System.out.println("v_Ms_prom = " + v_Ms_prom);

        
        double galTot = (l1 + l2 + l3)*galPorlitro;
        System.out.println("galTot = " + galTot);

        double vnorm = (vprom-vmin)/(vmax-vmin);
        System.out.println("vnorm = " + vnorm);

        //promedios Y dispersion 
        double vmedia = (v1 + v2 + v3)/3;
        System.out.println("vmedia = " + vmedia);

        double vpond_t = (t1 * v1 + t2 * v2 + t3 * v3) / (t1 + t2 + t3);
        System.out.println("vpond_t = " + vpond_t);


        double sigma =  Math.sqrt(((v1 - vmedia) * (v1 - vmedia) +(v2 - vmedia) * (v2 - vmedia) +(v3 - vmedia) * (v3 - vmedia)) / 3); 
         System.out.println("sigma = " + sigma);

        // interpolacion lineal
         
        double cvprom = ca + (cb - ca) * ((vprom - va) / (vb - va));
         System.out.println("cvprom = " + cvprom);

        double costoMant = cvprom * (d1 + d2 + d3);
        System.out.println("costoMant = " + costoMant);

        // modelo polinomico de rendimiento
        
        double kml_v = a * vprom * vprom + b * vprom + c;
        System.out.println("kml_v = " + kml_v);

       double kmlModelo = kml_v;
       System.out.println("kmlModelo = " + kmlModelo);

       double litrosModelo = (d1 + d2 + d3) / kmlModelo;
       System.out.println("litrosModelo = " + litrosModelo);

       //indice de eficiencia 

         double w1 = 0.25;
         System.out.println("w1 = " + w1);
         double w2 = 0.25;
         System.out.println("w2 = " + w2);
         double w3 = 0.25;
         System.out.println("w3 = " + w3);
         double w4 = 0.25;
         System.out.println("w4 = " + w4);
         double pesos = w1 + w2 + w3 + w4;
         System.out.println("pesos = " + pesos);

    double score =  w1 * (1 / costoPorKm) +w2 * kmltotal + w3 * (1 / co2PorKm) +w4 * (1 / (1 + sigma));
    System.out.println("score = " + score); 
    }
}
