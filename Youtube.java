public class Youtube {
    public static void main(String[] args) {
        Usuario usuario=new Usuario(" Geraldine");
        Video video=new Video(" aprendiendo a programar ",2400,"http;//geraldine.com");
        usuario.setsubirVideo(video);
        usuario.mostrarInfoUsuario();
    }
}