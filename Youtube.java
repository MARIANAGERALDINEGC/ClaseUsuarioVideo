public class Youtube {
    public static void main(String[] args) {
        Usuario usuario=new Usuario(" Geraldine");
        Video video=new Video(" aprendiendo a programar ",2400,"http;//geraldine.com");
        usuario.setsubirVideo(video);
        usuario.mostrarInfoUsuario();

        Usuario usuario2=new Usuario("Perla ");
        Comentario comment1=new Comentario("Asco de pagina", usuario2);
        System.out.println("El usuario "+ usuario2.getNombre()+ "publico el comentario "+ comment1.getContenido());
    }
}