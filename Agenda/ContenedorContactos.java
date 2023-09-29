package Programacion2Java.Agenda;

public class ContenedorContactos {
    private int cantContactos;
    private Contacto[] Contactos;

    public ContenedorContactos(int tope){
        this.cantContactos = 0;
        this.Contactos = new Contacto[tope];
    }

    public int getCantContactos(){
        return this.cantContactos;
    }

    public int getTope() {
		int tope = this.Contactos.length;
		return tope ;
	}

    public boolean hayLugar() {
		
		boolean hayLugar= this.getCantContactos() < this.getTope();
		return hayLugar;
	}

    public boolean agregar(Contacto contacto) {
		
		boolean pudoAgregar = this.hayLugar();
		
		if(pudoAgregar) {
			int primerPosLibre = this.getCantContactos();
			this.Contactos[primerPosLibre] = contacto;
			this.incrementarCantidad();				
		}
		
		return pudoAgregar;
	}
    
    private void incrementarCantidad() {
		this.cantContactos++;
	}
}