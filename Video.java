public class Video {
    public String titulo;
    public int duracionSegundos;
    public String url;

    public Video(String titulo, int duracionSegundos, String url) {
        this.titulo = titulo;
        this.duracionSegundos = duracionSegundos;
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}