package zooAnimales;

public class Pez extends Animal{
    private ArrayList<Pez> listado = new ArrayList<>();
    public int salmones;
    public int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(){
        listado.add(this);
    }
    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
        super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
    }

    @override
    public String movimiento(){
        return("nadar");
    }

    public Pez[] getListado(){
        return(this.listado);
    }
    public void setListado(Pez[] listado){
        this.listado = listado;
    }

    public String getColorEscamas(){
        return(this.colorEscamas);
    }
    public void setColorEscamas(String colorEscamas){
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas(){
        return(this.cantidadAletas);
    }
    public void setCantidadAletas(int cantidadAletas){
        this.cantidadAletas = cantidadAletas;
    }

    public void cantidadPeces(){

    }

    public void movimiento(){

    }

    public void crearSalmon(){

    }

    public void crearBacalao(){

    }
}