package model;

import java.util.List;

public class Funcionario {
    
    private String nome;
    //Representa a associação unária ou reflexiva
    //Um chefe se relaciona com n funcionarios
    private List<Funcionario> funcionarios;
}
