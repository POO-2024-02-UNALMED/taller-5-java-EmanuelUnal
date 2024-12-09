package zooAnimales;

public class Animal{
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(){
        totalAnimales++;
    }
    public Animal(String nombre, int edad, String habitat, String genero, Zona zona){
        this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		totalAnimales++;
    }

    
    public String movimiento(){
        return("desplazarse");
    }

    public void totalPorTipo(){
        int mamifero = Mamifero.listado.size()
        int ave = Aves.listado.size()
        int anfibio = Anfibio.listado.size()
        int reptil = Reptil.listado.size()
        int pez = Pez.listado.size()

        return("Mamíferos: "+mamifero + "\nAves: "+ave+ "\nReptiles:"+reptil+ "\nPeces: "+pez+ "\nAnfibios"+anfibio);
    }

    public String toString(){
        if (this.zona != null) {
			return ("Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+zona.getNombre()+" en el "+zona.getZoo().getNombre());
		}
		else {
			return ("Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero);
		}
    }

    public static int getTotalAnimales(){
        return(this.totalAnimales);
    }
    public static void setTotalAnimales(int totalAnimales){
        this.totalAnimales = totalAnimales;
    }

    public String getNombre(){
        return(this.nombre);
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return(this.edad);
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getHabitat(){
        return(this.habitat);
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }

    public String getGenero(){
        return(this.genero);
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public Zona getZona(){
        return(this.zona);
    }
    public void setZona(Zona zona){
        this.zona = zona;
    }

}