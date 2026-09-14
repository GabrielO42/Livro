/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.com.senac.df.livro;

/**
 *
 * @author gabriel62947886
 */
public class Livro {

    String titulo;
    String autor;
    String genero;
    int publicação;
    int paginas;
    double valor;

    public Livro(String titulo, String autor, String genero, int publicação, int paginas, double valor) {
        
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.publicação = publicação;
        this.paginas = paginas;
        this.valor = valor;
    
}
    public void calcular(){
       int idade = 2026 - publicação;
    }

    public void exibirinformaçoes() {
        System.out.println("Titulo; " + this.titulo);
        System.out.println("autor: " + this.autor);
        System.out.println("Genero: " + this.genero);
        System.out.println("publicação: " + this.publicação);
        System.out.println("paginas: " + this.paginas);
        System.out.println("vslor: R$ " + this.valor);

        
    }


}
