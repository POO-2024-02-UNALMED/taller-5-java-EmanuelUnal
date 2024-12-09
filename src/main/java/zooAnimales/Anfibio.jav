package zooAnimales;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public int ranas;
    public int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(){
        listado.add(this);
    }

    public Anfibio(int totalAnimales, String nombre, int edad, String habitat, String genero,  String colorPiel, boolean venenoso){
        super(nombre,edad,habitat,genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
    }
    
    @override
    public String movimiento(){
        return("saltar");
    }
    public Anfibio[] getListado(){
        return(this.listado);
    }
    public void setListado(Anfibio[] listado){
        this.listado = listado;
    }

    public String getColorPiel(){
        return(this.colorPiel);
    }
    public void setColorPiel(String colorPiel){
        this.colorPiel = colorPiel;
    }

    public boolean getVenenoso(){
        return(this.venenoso);
    }
    public void setVenenoso(boolean venenoso){
        this.venenoso = venenoso;
    }

    public void cantidadAnfibios(){

    }

    public void movimiento(){

    }

    public void crearRana(){

    }

    public void crearSalamandra(){

    }
}