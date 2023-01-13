import java.util.ArrayList;
import java.util.List;

public class ListaDeFeriados {
  private List<Feriado> feriados = new ArrayList<>();

  public void retornaFeriados() {
    for (int i = 0; i < this.feriados.size(); i++) {
      Feriado feriado = feriados.get(i);
      System.out.println(feriado.getDate() + " => " + feriado.getName());
    }
    
  }

  public void addFeriado(Feriado feriado) {
    this.feriados.add(feriado);
  }
  
  public void procuraFeriado(String data) {
    for (int i = 0; i < this.feriados.size(); i++) {
      Feriado feriado = feriados.get(i);

      if (data.equals(feriado.getDate())) {
        System.out.println(feriado.getName());
        return;
      }
    }
    System.out.println("Não há feriado nessa data");
  }

  public List<Feriado> retornaListaFeriados() {
    return feriados;
  }
}
