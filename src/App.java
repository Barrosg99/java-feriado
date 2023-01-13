public class App {
    public static void main(String[] args) throws Exception {
        String[] infoDatas = new String[] { "01/01/2023", "21/02/2023", "17/04/2023", "21/04/2023", "01/05/2023",
                "08/06/2023", "07/09/2023", "12/10/2023", "02/11/2023", "15/11/2023", "25/12/2023" };
        String[] infoFeriados = new String[] { "Confraternização mundial", "Carnaval", "Páscoa", "Tiradentes",
                "Dia do trabalho", "Corpus Christi", "Independência do Brasil", "Nossa Senhora Aparecida", "Finados",
                "Proclamação da República", "Natal" };

        ListaDeFeriados feriados = new ListaDeFeriados();
        

        for (int i = 0; i < infoFeriados.length; i++) {
            feriados.addFeriado(new Feriado(infoFeriados[i], infoDatas[i]));
        }

        feriados.retornaFeriados();
        feriados.procuraFeriado("12/10/2023");
        System.out.println(feriados.retornaListaFeriados());
    }
}
