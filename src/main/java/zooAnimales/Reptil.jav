package zooAnimales;

public class Reptil extends Animal{
    private ArrayList<Reptil> listado = new ArrayList<>();
    public int iguanas;
    public int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(){
        listado.add(this);
    }
    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
    }

    @override
    public String movimiento(){
        return("reptar");
    }

    public Reptil[] getListado(){
        return(this.listado);
    }
    public void setListado(Reptil[] listado){
        this.listado = listado;
    }

    public String getColorEscamas(){
        return(this.colorEscamas);
    }
    public void setColorEscamas(String colorEscamas){
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola(){
        return(this.largoCola);
    }
    public void setLargoCola(int largoCola){
        this.largoCola = largoCola;
    }

    public void cantidadReptiles(){

    }

    public void movimiento(){

    }

    public void crearIguana(){

    }

    public void crearSerpientes(){

    }
}