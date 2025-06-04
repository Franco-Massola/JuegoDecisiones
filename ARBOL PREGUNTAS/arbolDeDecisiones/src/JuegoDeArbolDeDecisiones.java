import java.util.Scanner;

public class JuegoDeArbolDeDecisiones {


   private ArbolPreguntasYAnimales arbol = new ArbolPreguntasYAnimales();

    private int SiNo (int decision, int posicionOriginal){
        return decision == 1 ? 2 * posicionOriginal + 1 : 2 * posicionOriginal + 2;
    }

    /**
     * Este metodo nos devuelve verdadero o falso si la posicion recibida es de un animal o no.
     * El metodo imprime por consola el nombre del animal cuando en esa posicion hay un animal.
     * 
     * @param posicion indice indicando una posicion de mi arreglo de arbol de preguntas y animales
     * @return boolean esAnimal : TRUE si la posicion hay un animal FALSE si la posicion no es un animal 
     */
    private boolean EsAnimal(int posicion){       
        boolean esAnimal = false;
        for (int i = 0; i < arbol.GetPosicionesAnimales().length; i++) {
    
            if (arbol.GetPosicionesAnimales()[i] == posicion){
                esAnimal = true;
                
                System.out.println(arbol.GetPreguntasYAnimales()[posicion]);
                
                
                break;
            }
            else esAnimal = false;
        }
    
        return esAnimal;
    }
    
    private void ImprimirAnimales(){

        for (int i = 0; i < arbol.GetPreguntasYAnimales().length; i++) {
            
            EsAnimal(i);

        }

    }


    public void Jugar(){
        
        Scanner scanner = new Scanner(System.in);
        int posicionActual = 0;
        int contadorPreguntas = 1;
        int posicionAnterior = posicionActual;
        int respuesta = 0;
        boolean salir = true;
        arbol.Inicializar();
    
        while(salir){
            posicionActual = 0;
            ImprimirAnimales();
            do {
                
                System.out.println("-------------------------------");
                System.out.println("Pregunta " + contadorPreguntas + ":");
                System.out.println(arbol.GetPreguntasYAnimales()[posicionActual]);
                System.out.println("1. Si");
                System.out.println("2. No");
                System.out.println("3. Volver a la pregunta anterior");
                System.out.println("4. Salir");               
                System.out.println("-------------------------------");
                respuesta = scanner.nextInt();
                
                if(respuesta == 4){
                    break;
                }
        
                if (respuesta == 3) {
                    posicionActual = posicionAnterior;
                    contadorPreguntas--;
                }
        
                else{
                    contadorPreguntas++;
                    posicionAnterior = posicionActual;
                    posicionActual = SiNo(respuesta, posicionActual);
                }
            
            } while (!EsAnimal(posicionActual));
            System.out.println("-------------------------------");
            System.out.println("Deseas seguir jugando?");
            System.out.println("1. Si");
            System.out.println("2. No");
            respuesta = scanner.nextInt();
            
            switch (respuesta) {
                case 1:
                    posicionActual = 0;
                    posicionAnterior = posicionActual;
                    contadorPreguntas = 1;

                    break;
                case 2:

                    System.out.println("Gracias por jugar!");
                    salir = false;
                    
                break;
            
                default:
                System.out.println("Ingrese una opcion valida");
                    break;
            }
            
            
        };
    
    
    }
    
    public static void main(String[] args) throws Exception {

        JuegoDeArbolDeDecisiones juego = new JuegoDeArbolDeDecisiones();
        
        System.out.println("-------------------------------");
        System.out.println("Bienvenido");
        System.out.println("Este juego consiste en que tu pensaras en un animal");
        System.out.println("y yo por medio de preguntas de si o no tratare de adivinar tu animal");
        System.out.println("-------------------------------");

        juego.Jugar();
    }
}
