package render;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import entidade.Agente;

public class Janela extends JFrame{

   public Painel painel = new Painel();

   public Janela(){
      try{
         BufferedImage icone = ImageIO.read(new File("./imagens/inteligencia-artificial.png"));
         setIconImage(icone);
      }catch(Exception e){}
      
      setTitle("Treino Genético");
      add(painel);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      pack();
      setResizable(false);
      setLocationRelativeTo(null);
   }


   public void desenhar(Agente agente, double melhorFitness, int geracoesStagnadas, double mediaFitness, long redesQueGanharam){
      painel.desenhar(agente, melhorFitness, geracoesStagnadas, mediaFitness, redesQueGanharam);
   }
}
