package zooAnimales;

public class Ave extends Animal{
    private ArrayList<Ave> listado = new ArrayList<>();
    public int halcones;
    public int aguilas;
    private String colorPlumas;

    public Ave(){
        listado.add(this);
    }
    public Ave(String nombre, int edad, String habitat, String genero,  String colorPlumas){
        super(nombre,edad,habitat,genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
    }

    @override
    public String movimiento(){
        return("volar");
    }

    public static int cantidadAves(){
        int totl = listado.size();
        return(totl);
    }

    public static Ave crearHalcon(String nombre, int edad, String genero){
        Ave halcon = new Ave();
        halcon.setNombre(nombre);
        halcon.setEdad(edad);
        halcon.setGenero(genero);
        halcon.setColorPlumas("café glorioso");
        halcon.setHabitat("montañas");
        halcones++;
        return(halcon);
    }

    public static Ave crearAguila(String nombre, int edad, String genero){
        Ave aguila = new Ave();
        aguila.setNombre(nombre);
        aguila.setEdad(edad);
        aguila.setGenero(genero);
        aguila.setColorPlumas("blanco y amarillo");
        aguila.setHabitat("montañas");
        aguilas++;
        return(aguila);
        
    }
    
    public Ave[] getListado(){
        return(this.listado);
    }
    public void setListado(Ave[] listado){
        this.listado = listado;
    }

    public String getColorPlumas(){
        return(this.colorPlumas);
    }
    public void setColorPlumas(String colorPlumas){
        this.colorPlumas = colorPlumas;
    }

    public void cantidadAves(){

    }

    public void crearHalcon(){

    }

    public void crearAguila(){

    }
}