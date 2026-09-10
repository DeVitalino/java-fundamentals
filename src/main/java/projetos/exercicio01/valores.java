package projetos.exercicio01;

public class valores {

    // LIMPEZA & PREVENTIVA
    static int limpeza_cpu = 120;
    static int mao_de_obra = 80;

    static int limpeza_notebook = 180;
    static int mao_de_obra_notebook = 100;

    static int limpeza_videogame = 150;
    static int mao_de_obra_videogame = 100;

    static int bruto_cpu = limpeza_cpu + mao_de_obra;
    static int bruto_notebook = limpeza_notebook + mao_de_obra_notebook;
    static int bruto_videogame = limpeza_videogame + mao_de_obra_videogame;

    // MANUTENÇÃO
    static int manutencao_geral = 500;
    static int manutencao_exp = 2000;

    static double i3 = 789.99;
    static double i5 = 1349.99;
    static double i7 = 1899.90;
    static double ram = 349.90;
    static int memoria = 400;
    static int placa_mae = 600;
    static int placa_video = 1100;

    static double bruto_manutencao_processador = i3 + manutencao_exp;
    static double bruto_manutencao_memoria = memoria + manutencao_exp;
    static double bruto_manutencao_placa_mae = placa_mae + manutencao_exp;
    static double bruto_manutencao_placa_video = placa_video + manutencao_exp;
}