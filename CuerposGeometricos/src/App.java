import java.util.Scanner;
public class App {

    static Scanner entrada = new Scanner(System.in);

    static int repeticiones = 0;
    static int cantidadLados;
    static double longitudLados, altura, radio;
    static double perimetroBase, generatriz, arista;
    static double areaLateral, areaTotal, radioMayor, radioMenor; 
    static double alfa, apotema, areaBase, apotemaBase, apotemaPiramide;
    static double area, volumen, grado;
    static double  husoAreaEsferico, cuñaVolumenEsferica;
    static double altitud, radioBaseMayor, radioBaseMenor; 
    static double areaZonaEsferica, volumenZonaEsferica, areaCasqueteEsferico, volumenCasqueteEsferico ;
    static double  alturaCaraLateral, longitudBaseMayor, longitudBaseMenor;
    static double areaBaseMayor, areaBaseMenor;
    
    public static void main(String[] args) throws Exception {

        do{

            System.out.println("Bienvenidos al calculo de areas y volumen.");
            System.out.println("...............................");
            System.out.println(".     Cuerpos Geometricos     .");
            System.out.println("...............................");
            System.out.println("");
            System.out.println("................................");
            System.out.println(".       Menu de opciones:      .");
            System.out.println("................................");
            System.out.println(".      1) Cilindro             .");
            System.out.println(".      2) Cono                 .");
            System.out.println(".      3) Dodecaedro           .");
            System.out.println(".      4) Esfera               .");
            System.out.println(".      5) Hexaedro             .");
            System.out.println(".     6) Huso Cuña Esferica    .");
            System.out.println(".      7) Icosaedro            .");
            System.out.println(".      8) Octaedro             .");
            System.out.println(".      9) Piramide             .");
            System.out.println(".      10) Prisma              .");
            System.out.println(" 11) Segmento Esferico Truncado.");
            System.out.println(".      12) Tetraedro           .");
            System.out.println(".      13) Tronco Cono         .");
            System.out.println(".      14) Tronco Piramide     .");
            System.out.println("................................");
            System.out.println("");
            System.out.println("¿Que opcion elije?");
            int  opcion = entrada.nextInt();

            if(opcion >= 1 && opcion <= 14){

                calculosGeometricos(opcion);

            }else{

                System.out.println("Esta opcion no existe.");
                System.out.println("");

                repeticiones++;

                if(repeticiones == 3){

                   System.out.println("Error! se intento varias veces.");

                }
            }

        }while(repeticiones < 3);

        entrada.close();
        
    }

    public static void calculosGeometricos(int opcion){

        switch(opcion){
            case 1: System.out.println("Usted eligio el Cilindro.");
                    System.out.println("");

                    do{
                        System.out.println("Ingrese la altura: ");
                        altura = entrada.nextDouble();
                        System.out.println("Ingrese el radio: ");
                        radio = entrada.nextDouble();

                        if(altura >= 1 && radio >= 1){

                            System.out.println("El area lateral del cilindro es: " + calcularAreaLateral(altura, radio));
                            System.out.println("El area total del cilindro es: " + calcularAreaTotal(altura, radio));
                            System.out.println("El volumen del cilindro es: " + calcularvolumen(altura, radio));
                         
                            repeticiones = 3;

                        }else{

                            System.out.println("No se ingresan numeros negativos.");

                            repeticiones++;

                            if(repeticiones == 3){
                               System.out.println("Error! se intento varias veces.");
                            }

                        }

                    }while(repeticiones < 3);

                break;

            case 2: System.out.println("Usted eligio el Cono.");
                    System.out.println("");

                    do{
                        
                        System.out.println("Ingrese la altura del cono: ");
                        altura = entrada.nextDouble();
                        System.out.println("Ingrese el radio del cono: ");
                        radio = entrada.nextDouble();
                        System.out.println("Ingrese la generatriz del cono: ");
                        generatriz = entrada.nextDouble();


                        if(radio >= 1 && altura >= 1 && generatriz >= 1){

                            System.out.println("El area lateral del cono es: " + calcularAreaLateral(altura, radio, generatriz));
                            System.out.println("El area total del cono es: " + calcularAreaTotal(altura, radio, generatriz));
                            System.out.println("El volumen del cono es: " + calcularvolumen(altura, radio, generatriz));

                            repeticiones = 3;

                        }else{

                            System.out.println("No se ingresan nuemros negativos.");

                            repeticiones++;

                            if(repeticiones == 3){
                               System.out.println("Error! se intento varias veces.");
                            }

                        }

                    }while(repeticiones < 3);

                break;

            case 3: System.out.println("Usted eligio el Dodecaedro.");
                    System.out.println("");

                    do{
                        System.out.println("Ingrese la arista:");
                        arista = entrada.nextDouble();

                        if(arista >= 1){

                            System.out.println("El area de el dodecaedro es: " + calcularArea(arista) + "centimetros cuadrados.");
                            System.out.println("El volumen de el dodecaedro es: " + calcularvolumen(arista)+ "centimetros cubicos.");

                            repeticiones = 3;

                        }else{

                            System.out.println("No se ingresan numeros negativos.");

                            repeticiones++;

                            if(repeticiones == 3){
                               System.out.println("Error! se intento varias veces.");
                            }
                        }

                    }while(repeticiones < 3);

                break;

            case 4: System.out.println("Usted eligio el Esfera.");
                    System.out.println("");

                    do{
                        System.out.println("Ingrese el radio de la esfera");
                        radio = entrada.nextDouble();

                        if(radio >= 1){

                            System.out.println("El area de la esfera es: " + calcArea(radio));
                            System.out.println("El volumen de la esfera es: " + calcVolumen(radio));

                            repeticiones = 3;

                        }else{

                            System.out.println("No se ingresan numeros negativos.");

                            repeticiones++;

                            if(repeticiones == 3){
                               System.out.println("Error! se intento varias veces.");
                            }

                        }

                    }while(repeticiones < 3);

                break;

            case 5: System.out.println("Usted eligio el Hexaedro.");
                    System.out.println("");

                    do{
                        System.out.println("Ingrese la arista: ");
                        arista = entrada.nextDouble();

                        if(arista >= 1){

                            System.out.println("El area del exaedro es: " + area(arista));
                            System.out.println("La diagonal del exaedro es: " + calcularDiagonal(arista));
                            System.out.println("El volumen del exaedro es: " + volumen(arista));

                           repeticiones = 3;

                        }else{

                            System.out.println("No se ingresan numeros negativos.");

                            repeticiones++;

                            if(repeticiones == 3){
                               System.out.println("Error! se intento varias veces.");
                            }

                        }

                    }while(repeticiones < 3);

                break;

            case 6: System.out.println("Usted eligio el Huso Cuña Esferica .");
                    System.out.println("");

                    do{
                        System.out.println("Ingrese el radio:");
                        radio = entrada.nextDouble();
                        System.out.println("Ingrese el angulo:");
                        grado = entrada.nextDouble();

                        if(radio >= 1 && grado >= 1){

                            System.out.println("El huso esferico es: " +area(radio, grado)  + "Centimetros cubicos");
                            System.out.println("La cuña esferica es: " +volumen(radio, grado) + "centimetros cubicos");                            

                            repeticiones = 3;

                        }else{

                            System.out.println("No se ingresan numeros negativos.");

                            repeticiones++;

                            if(repeticiones == 3){
                               System.out.println("Error! se intento varias veces.");
                            }

                        }
              

                    }while(repeticiones < 3);

                break;

            case 7: System.out.println("Usted eligio el Icosaedro.");
                    System.out.println("");

                    do{

                        System.out.println("Ingrese la arista:");
                        arista = entrada.nextDouble();

                        if(arista >= 1){

                            System.out.println("El area del icosaedro es: " + Area(arista) + "centimetros cuadrados.");
                            System.out.println("El volumen del icosaedro es: " + Volumen(arista) + "centimetros cubicos.");

                            repeticiones = 3;

                        }else{

                            System.out.println("No se ingresan numeros negativos.");

                            repeticiones++;

                            if(repeticiones == 3){
                              System.out.println("Error! se intento varias veces.");
                            }

                        }

                    }while(repeticiones  < 3);

                break;

            case 8: System.out.println("Usted eligio el Octaedro.");
                    System.out.println("");

                    do{

                        System.out.println("Ingrese el arista:");
                        arista = entrada.nextDouble();

                        if(arista >= 1){

                            System.out.println("El area del octaedro es: " + calcularArea() + "centimetros cuadrados.");
                            System.out.println("El volumen del octaedro es: " + calcularvolumen()+ "centimetros cubicos.");

                            repeticiones = 3;

                        }else{

                            System.out.println("No se ingresan numeros negativos.");

                            repeticiones++;

                            if(repeticiones == 3){
                               System.out.println("Error! se intento varias veces.");
                            }

                        }

                    }while(repeticiones < 3);

                break;

            case 9: System.out.println("Usted eligio el Piramide.");
                    System.out.println("");

                    do{

                        System.out.println("Ingrese la cantidad de lados: ");
                        cantidadLados = entrada.nextInt();
                        System.out.println("Ingrese la medida de los lados: ");
                        longitudLados = entrada.nextDouble();
                        System.out.println("Ingrese la altura: ");
                        altura = entrada.nextDouble();
                        System.out.println("Ingrese el apotema de la base: ");
                        apotemaBase = entrada.nextDouble();

                        if(cantidadLados >= 1 && longitudLados >= 1 && altura >= 1 && apotemaBase >= 1){

                            System.out.println("El area lateral de la piramide es: "+ calcularAreaLateral(cantidadLados, longitudLados, altura, apotemaBase));
                            System.out.println("El area total de la piramide es: "+ calcularAreaTotal(cantidadLados, longitudLados, altura, apotemaBase));
                            System.out.println("El volumen de la piramide es: "+ calcularvolumen(cantidadLados, longitudLados, altura, apotemaBase));

                            repeticiones = 3;

                        }else{

                            System.out.println("No se ingresan numeros negativos.");

                            repeticiones++;

                            if(repeticiones == 3){
                               System.out.println("Error! se intento varias veces.");
                            }

                        }

                    }while(repeticiones < 3);

                break;
 
            case 10: System.out.println("Usted eligio el Prisma.");
                     System.out.println("");

                    do{
                        
                        System.out.println("Cantidad de lados: ");
                        cantidadLados = entrada.nextInt();
                        System.out.println("Longitud de lados: ");
                        longitudLados = entrada.nextDouble();
                        System.out.println("Altura: ");   
                        altura = entrada.nextInt();


                        if(cantidadLados >= 1 && longitudLados >= 1 && altura >= 1){

                         System.out.println("El area lateral del prisma es de : " + calcularAreaLateral(cantidadLados, longitudLados, altura) + " unidades cuadradas.");
                         System.out.println("El area total del prisma es de : " + calcularAreaTotal(cantidadLados, longitudLados, volumen) + " unidades cuadradas.");
                         System.out.println("El volumne del prisma es de : " + calcularvolumen(cantidadLados, longitudLados, altura)+ " unidades cubicas");
              
                         repeticiones = 3;

                        }else{

                            System.out.println("No se ingresan numeros negativos.");

                            repeticiones++;

                            if(repeticiones == 3){
                               System.out.println("Error! se intento varias veces.");
                            }
                        }

                    }while(repeticiones < 3);
                     
                break;

            case 11: System.out.println("Usted eligio el Segmento Esferico Truncado.");
                     System.out.println("");

                     do{

                        System.out.println("Ingrese el radio");
                        radio = entrada.nextDouble();
                        System.out.println("Ingrese la altitud");
                        altitud = entrada.nextDouble();
                        System.out.println("Ingrese el radio mayor");
                        radioBaseMayor = entrada.nextDouble();
                        System.out.println("Ingrese el radio menor");
                        radioBaseMenor = entrada.nextDouble();

                        if(radio >=1 && altitud >= 1 && radioBaseMayor >= 1 && radio >= 1){

                            System.out.println("El area de la zona esferica es: " + calcularAreaZonaEsferica(radio, altitud));
                            System.out.println("El volumen de la zona esferica es: " + calcularVolumenZonaEsferico(altitud, radioBaseMayor, radioBaseMenor));
                            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                            System.out.println("El area del casquete esferico es: " + calcularAreaCasqueteEsferico(radio, altitud));
                            System.out.println("El volumen del casquete esferico es: " + calcularVolumenCasqueteEsferico(radio, altitud));
                    

                            repeticiones = 3;

                        }else{

                            System.out.println("No se ingresan numeros negativos.");

                            repeticiones++;

                            if(repeticiones == 3){
                               System.out.println("Error! se intento varias veces.");
                            }

                        }

                     }while(repeticiones < 3);



                break;

            case 12: System.out.println("Usted eligio el Tetraedro.");
                     System.out.println("");

                    do{

                        System.out.println("Ingrese el arista:");
                        arista = entrada.nextDouble();

                        if(arista >= 1){

                            System.out.println("El area del tetraedro es: " + area() + "centimetros cuadrados");
                            System.out.println("La altura del tetraedro es: " + altura() + "centimetros");
                            System.out.println("El volumen del tetraedro es: " + volumen()+ "centimetros cubicos");
              
                            repeticiones = 3;

                        }else{

                            System.out.println("No se ingresan numeros negativos.");

                            repeticiones++;

                            if(repeticiones == 3){
                              System.out.println("Error! se intento varias veces.");
                            }

                        }
                       

                    }while(repeticiones < 3);

                break;

            case 13: System.out.println("Usted eligio el Tronco Cono.");
                     System.out.println("");

                     do{

                        System.out.println("Ingrese la altura");
                        altura= entrada.nextDouble();
                        System.out.println("Ingrese el radio menor");
                        radioMenor = entrada.nextDouble();
                        System.out.println("Ingrese el radio mayor");
                        radioMayor = entrada.nextDouble();

                        if(altura >= 1 && radioMenor >= 1 && radioMayor >= 1){

                            System.out.println("El area lateral del tronco de cono es: " + areaLateralTroncoCono(altura, radioMenor, radioMayor));
                            System.out.println("El area total del tronco de cono es: " + areaTotalTroncoCono(altura, radioMenor, radioMayor));
                            System.out.println("El volumen del tronco de cono es: " + volumenTroncoCono(altura, radioMenor, radioMayor));

                            repeticiones = 3;

                        }else{

                            System.out.println("No se ingresan numeros negativos.");

                            repeticiones++;

                            if(repeticiones == 3){
                               System.out.println("Error! se intento varias veces.");
                            }

                        }

                    }while(repeticiones < 3);

                break;

            case 14: System.out.println("Usted eligio el Tronco Piramide.");
                     System.out.println("");

                    do{

                        System.out.println("Ingrese el altura");
                        altura = entrada.nextDouble();
                        System.out.println("Ingrese la altura de la cara lateral:");
                        alturaCaraLateral = entrada.nextDouble();
                        System.out.println("Ingrese la medidad de la base menor");
                        longitudBaseMenor = entrada.nextDouble();
                        System.out.println("Ingrese la medida la base mayor");
                        longitudBaseMayor = entrada.nextDouble();

                        if(altura >= 1 && alturaCaraLateral >= 1 && longitudBaseMayor >= 1 && longitudBaseMenor >= 1){

                            System.out.println("El area lateral del tronco de piramide es: " + areaLateralTroncoPiramide(longitudBaseMenor, longitudBaseMayor, alturaCaraLateral) + "centimetro cubicos.");
                            System.out.println("El area total del tronco de piramide es: " + areaTotalTroncoPiramide(longitudBaseMenor, longitudBaseMayor, alturaCaraLateral) + "centimetros cubicos.");
                            System.out.println("El volumen del tronco de piramide es: " + volumenTroncoPiramide(altura)+ "centimetros cubicos.");
                           

                            repeticiones = 3;

                        }else{

                            System.out.println("No se ingresan numeros negativos.");

                            repeticiones++;

                            if(repeticiones == 3){
                               System.out.println("Errorse intento varias veces.");
                            }

                        }


                    }while(repeticiones < 3);

                break;

            default: System.out.println("La opcion no esta disponible");

               break;

        }

    }

    //..........................Cilindro................................

    public static double calcularAreaLateral(double altura, double radio){

        perimetroBase = 2 * 3.14 * radio;
        areaLateral = perimetroBase * altura;

      return areaLateral;
    }

    public static double calcularAreaTotal(double altura, double radio){

        perimetroBase = 2 * Math.PI * radio;
        areaLateral = perimetroBase * altura;
        
        areaBase = Math.PI * (radio * radio);
        areaTotal = areaLateral + 2 * areaBase;


      return areaTotal;
    }

    public static double calcularvolumen(double altura, double radio){

        perimetroBase = 2 * Math.PI * radio;
        areaLateral = perimetroBase * altura;
        
        areaBase = Math.PI * (radio * radio);
        areaTotal = areaLateral + 2 * areaBase;

        volumen = areaBase * altura;
       
      return volumen;
    }

    //......................................Cono...........................................

    public static double calcularAreaLateral(double altura, double radio, double generatriz){

        areaLateral = Math.PI * radio * generatriz;

        return areaLateral;
    }

    public static double calcularAreaTotal(double altura, double radio, double generatriz){

        areaLateral = Math.PI * radio * generatriz;

        areaBase = Math.PI * (radio * radio);
        areaTotal =  areaLateral + areaBase;
        
      return areaTotal;
    }

    public static double calcularvolumen(double altura, double radio, double generatriz){

        areaLateral = Math.PI* radio * generatriz;

        areaBase = Math.PI * (radio * radio);
        areaTotal =  areaLateral + areaBase;
        
        volumen = (areaBase * altura) / 3;
        
     return volumen;
    }

    //................Dodecaedro.....................

    public static double calcularArea(double arista){

        area = 3 * arista * arista * Math.sqrt(25 + 10 * Math.sqrt(5));

      return area;
    }

    public static double calcularvolumen(double arista){

        volumen = (Math.pow(arista, 3)) / 4 * (15 + 7 * Math.sqrt(5));

      return volumen;
    }

    //...............Esfera.....................

    public static double calcArea(double radio){

        area = (4 * Math.PI )* (radio * radio);

      return area;
    }

    public static double calcVolumen(double radio){

        volumen = ((4 * Math.PI) * (radio * radio * radio)) / 3;

      return volumen;
    }

    //.............Hexaedro..................

    public static double area(double arista){

        area = 6 * (arista * arista);
             
       return area;
    }

    public static double volumen(double arista){

        volumen = Math.pow(arista, 3);
        
        return volumen;
    }

    public static double calcularDiagonal(double arista){

       double diagonal = arista *  Math.sqrt(3);

       return diagonal;
    }

    //...............Huso Cuña Esferica...................  

    public static double area(double radio, double grado){

        husoAreaEsferico = (4 * Math.PI * radio * radio * grado) / 360;
              
       return husoAreaEsferico;
    }

    public static double volumen(double radio, double grado){

         cuñaVolumenEsferica = ((4 * Math.PI * radio * radio * radio * grado)) / (3 * 360);
    

        return cuñaVolumenEsferica;
    }

    //..............Icosaedro................

    public static double Area(double arista){

        area = 5 * Math.sqrt(3) * Math.pow(arista, 2);

        return area;
    }

    public static double Volumen(double arista){

        volumen = (5 * Math.pow(arista, 3)) / 12 * (3 + Math.sqrt(5));

        return volumen;
    }

    //............Octaedro..............

    public static double calcularArea(){

        area = 2 * arista * arista * Math.sqrt(3);

        return area;
    }

    public static double calcularvolumen(){

        volumen = (Math.pow(arista, 3) * Math.sqrt(2)) / 3;

        return volumen;
    }

    //....................Piramide.............................

    public static double calcularAreaLateral(double cantidadLados, double longitudLados, double altura, double apotemaBase){

        perimetroBase = cantidadLados * longitudLados;
        apotemaPiramide = (Math.sqrt(altura * altura) + (apotemaBase * apotemaBase));
        areaLateral = (perimetroBase * apotemaPiramide) / 2;
               
        return areaLateral;
    }

    public static double calcularAreaTotal(double cantidadLados, double longitudLados, double altura, double apotemaBase){
        
        perimetroBase = cantidadLados * longitudLados;
        apotemaPiramide = (Math.sqrt(altura * altura) + (apotemaBase * apotemaBase));
        areaLateral = (perimetroBase * apotemaPiramide) / 2;

        areaBase = perimetroBase * 2 * (apotemaBase + apotemaPiramide);
        areaTotal = areaLateral + areaBase;
              
        return areaTotal;
    }

    public static double calcularvolumen(double cantidadLados, double longitudLados, double altura, double apotemaBase){
         
        perimetroBase = cantidadLados * longitudLados;
        apotemaPiramide = (Math.sqrt(altura * altura) + (apotemaBase * apotemaBase));
        areaLateral = (perimetroBase * apotemaPiramide) / 2;

        areaBase = perimetroBase * 2 * (apotemaBase + apotemaPiramide);
        areaTotal = areaLateral + areaBase;
              
        volumen = (areaBase * altura) / 3;

        return volumen;
    }

    //..................Prisma..................

    public static double calcularAreaLateral(int cantidadLados, double longitudLados, double altura){

        perimetroBase = cantidadLados * longitudLados;
        areaLateral = perimetroBase * altura;

      return areaLateral;
    }

    public static double calcularAreaTotal(int cantidadLados, double longitudLados, double altura){
 
        perimetroBase = cantidadLados * longitudLados;
        areaLateral = perimetroBase * altura;

        alfa = (Math.PI/180) * (360/cantidadLados);
        apotema = longitudLados / (2 * Math.tan((alfa)/ 2));
        areaBase = (perimetroBase * apotema)/ 2;
        areaTotal = areaLateral + 2 * areaBase; 

      return areaTotal;
    }

    public static double calcularvolumen(int cantidadLados, double longitudLados, double altura){

        perimetroBase = cantidadLados * longitudLados;
        areaLateral = perimetroBase * altura;

        alfa = (Math.PI/180) * (360/cantidadLados);
        apotema = longitudLados / (2 * Math.tan((alfa)/ 2));
        areaBase = (perimetroBase * apotema)/ 2;
        areaTotal = areaLateral + 2 * areaBase; 

        volumen = areaBase * altura;

      return volumen;
    }

    
    //.......................Segmento Esferico Truncado.........................

    public static double calcularAreaZonaEsferica(double radio, double altitud){

        areaZonaEsferica  =  2 * Math.PI * radio * altitud;

      return areaZonaEsferica;
    }

    public static double calcularVolumenZonaEsferico(double altitud, double radioBaseMayor, double radioBaseMenor){
    
        volumenZonaEsferica = (Math.PI * altitud * (altitud * altitud + (3 * radioBaseMayor * radioBaseMayor) + (3 * radioBaseMenor * radioBaseMenor))) / 6;
              

       return volumenZonaEsferica;
    }

    public static double calcularAreaCasqueteEsferico(double radio, double altitud){

        areaCasqueteEsferico = 2 * Math.PI * radio * altitud;
              
       return areaCasqueteEsferico;
    }

    public static double calcularVolumenCasqueteEsferico(double radio, double altitud){
        
         volumenCasqueteEsferico = (Math.PI * altitud * altitud * (3 * radio - altitud)) / 3;

        return volumenCasqueteEsferico;
    }

    //...................Tetraedro..................

    public static double area(){

        area = Math.sqrt(3) * Math.pow(arista, 2);

        return area;
    }

    public static double volumen(){

        volumen = (Math.pow(arista, 3) * Math.sqrt(2)) / 12;

        return volumen;
    }

    public static double altura(){

        altura = (arista * Math.sqrt(6)) / 3;

        return altura;
    }

    //..............................Trono Cono......................................

    public static double areaLateralTroncoCono(double altura, double radioMenor, double radioMayor){

        double elevacion = radioMayor - radioMenor;
        generatriz = Math.sqrt ((altura * altura) + (Math.pow(elevacion, 2)));
        areaLateral =Math.PI * (generatriz) * ((radioMayor + radioMenor));

        return areaLateral;
    }

    public static double areaTotalTroncoCono(double altura, double radioMenor, double radioMayor){

        double elevacion = radioMayor - radioMenor;
        generatriz = Math.sqrt ((altura * altura) + (Math.pow(elevacion, 2)));
        areaLateral =Math.PI * (generatriz) * ((radioMayor + radioMenor));

        areaTotal = areaLateral + (Math.PI *(radioMayor * radioMayor)) + (Math.PI *(radioMenor * radioMenor));
              
        return areaTotal;
    }

    public static double volumenTroncoCono(double altura, double radioMenor, double radioMayor){

        volumen = Math.PI * altura * ((radioMayor * radioMayor) + (radioMenor * radioMenor) + Math.sqrt((radioMayor * radioMayor) * (radioMenor * radioMenor))) / 3;
              
        return volumen;
    }
    
    //.................................Tronco Piramide..........................................

    public static double areaLateralTroncoPiramide(double longitudBaseMenor, double longitudBaseMayor, double alturaCaraLateral){

        areaLateral = (4 *(longitudBaseMayor + longitudBaseMenor) * alturaCaraLateral) / 2;
              
        return areaLateral;
    }

    public static double areaTotalTroncoPiramide(double longitudBaseMenor, double longitudBaseMayor, double alturaCaraLateral){

        areaLateral = (4 *(longitudBaseMayor + longitudBaseMenor) * alturaCaraLateral) / 2;

        areaBaseMayor = longitudBaseMayor * longitudBaseMayor;
        areaBaseMenor = longitudBaseMenor * longitudBaseMenor;
        areaTotal = areaLateral + areaBaseMayor + areaBaseMenor;
    
        return areaTotal;
    }

    public static double volumenTroncoPiramide(double altura){

        volumen = (altura / 3 ) * (areaBaseMayor + areaBaseMenor + (Math.sqrt(areaBaseMayor * areaBaseMenor)));
        
        return volumen;
    }
    
}
