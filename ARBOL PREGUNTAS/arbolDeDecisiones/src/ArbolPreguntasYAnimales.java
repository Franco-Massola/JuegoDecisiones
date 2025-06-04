class ArbolPreguntasYAnimales{
    

    private String[] preguntasYAnimales;
    private int [] posicionesAnimales = {7,8,9,21,22,11,12,13,29,61,62};


    public ArbolPreguntasYAnimales(){
        preguntasYAnimales = new String[63];
        Inicializar();
    }

    public String[] GetPreguntasYAnimales(){
        return preguntasYAnimales;
    } 

    public int[] GetPosicionesAnimales(){
        return posicionesAnimales;
    }

    public void Inicializar(){
        preguntasYAnimales [0] = "¿Es un mamifero?";
        preguntasYAnimales [1] = "¿Suele ser utilizado para transporte?";
        preguntasYAnimales [2] = "¿Este animal pasa mucho tiempo en el agua?";
        preguntasYAnimales [3] = "¿Tiene orejas y dientes grandes?";
        preguntasYAnimales [4] = "¿Produce leche?";
        preguntasYAnimales [5] = "¿Vive en el agua salada?";
        preguntasYAnimales [6] = "¿Este animal puede volar?";
        preguntasYAnimales [7] = "Burro";
        preguntasYAnimales [8] = "Caballo";
        preguntasYAnimales [9] = "Vaca";
        preguntasYAnimales [10] = "¿Produce Lana?";
        preguntasYAnimales [21] = "Oveja";
        preguntasYAnimales [22] = "Cabra";    
        preguntasYAnimales [11] = "Tiburon";
        preguntasYAnimales [12] = "Rana";
        preguntasYAnimales [13] = "Condor";
        preguntasYAnimales [14] = "¿Tiene escamas?";
        preguntasYAnimales [29] = "Serpiente";
        preguntasYAnimales [30] = "¿Tiene Caparazon?";
        preguntasYAnimales [61] = "Tortuga";
        preguntasYAnimales [62] = "Cocodrilo";
    }

}


    
