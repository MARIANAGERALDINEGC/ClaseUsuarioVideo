public class Usuario {
    public String nombre;
    public Video videoSubido;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Video getVideoSubido() {
        return videoSubido;
    }

    public void setsubirVideo(Video videoSubido) {
        this.videoSubido = videoSubido;
    }
    
    public void mostrarInfoUsuario(){
        System.out.println("Usuario"+ nombre );
        if(videoSubido !=null){
            System.out.println("Ultimo video subido"+videoSubido.getTitulo());
        
        }else{
            System.out.println("Aun no se han subido videos");
       }
    }
}