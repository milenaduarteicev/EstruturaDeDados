public class GestaoHospital {

    protected String nome;
    protected String cpf;
    protected int nivelPrioridade;
    
    public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }

        public int getNivelPrioridade() {
            return nivelPrioridade;
        }
    
    public GestaoHospital(String nome, String cpf, int nivelPrioridade) {
        this.nome = nome;
        this.cpf = cpf;
        this.nivelPrioridade = nivelPrioridade;
    }

    public GestaoHospital(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Paciente" +
        "\nNome: " + nome +
        "\nCPF: " + cpf;
    }

}
