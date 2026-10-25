package revisaomodulo1;

public class Filme {
    private String titulo, genero, classificacao;
    private double nota;
    public Filme(String titulo, String genero, double nota) {
        this.titulo=titulo; this.genero=genero.toUpperCase(); this.nota=nota;
        this.classificacao=classificar(nota);
    }
    public static String classificar(double nota) {
        if(nota>=8) return "Ótimo";
        if(nota>=5) return "Bom";
        return "Ruim";
    }
    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
    public double getNota() { return nota; }
    public String getClassificacao() { return classificacao; }
    public void mostrar() {
        System.out.printf("%s [%s] - Nota %.1f - %s%n",titulo,genero,nota,classificacao);
    }
}
