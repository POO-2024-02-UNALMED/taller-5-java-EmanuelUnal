package gestion;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<>();

    public Zoologico(){}

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
		this.ubicacion = ubicacion;
    } 

    public void agregarZonas(Zona zona){
        zonas.add(zona)
    }

    public int cantidadTotalAnimales(){
        int ttl = 0;
		for (int i=0;i<zonas.size();i++) {
			ttl += zonas.get(i).cantidadAnimales();
		}
		return ttl;
    }

    public String getNombre(){
        return(this.nombre);
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getUbicacion(){
        return(this.ubicacion);
    }
    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    public Zona getZonas(){
        return(this.zonas);
    }
    public void setZonas(Zona zonas){
        this.zonas = zonas;
    }

   
}