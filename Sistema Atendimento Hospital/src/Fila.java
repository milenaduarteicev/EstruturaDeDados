import java.util.ArrayList;

public class Fila {
    private ArrayList<GestaoHospital> filaNormal;
    private ArrayList<GestaoHospital> filaLeve;
    private ArrayList<GestaoHospital> filaModerado;
    private ArrayList<GestaoHospital> filaSevero;

    public Fila() {
        this.filaNormal = new ArrayList<GestaoHospital>();
        this.filaLeve = new ArrayList<GestaoHospital>();
        this.filaModerado = new ArrayList<GestaoHospital>();
        this.filaSevero = new ArrayList<GestaoHospital>();
    }


    // ADICIONAR NO FINAL

    public void adicionarNormal(GestaoHospital gestaoHospital) {
        filaNormal.add(gestaoHospital);
    }

    public void adicionarLeve(GestaoHospital gestaoHospital) {
        filaLeve.add(gestaoHospital);
    }

    public void adicionarModerado(GestaoHospital gestaoHospital) {
        filaModerado.add(gestaoHospital);
    }

    public void adicionarSevero(GestaoHospital gestaoHospital) {
        filaSevero.add(gestaoHospital);
    }


    // RETIRAR DO COMEÇO

    public GestaoHospital retirarNormal() {
        if (!filaNormal.isEmpty()) {
            return filaNormal.remove(0);
        }
        return null;
    }

    public GestaoHospital retirarLeve() {
        if (!filaLeve.isEmpty()) {
            return filaLeve.remove(0);
        }
        return null;
    }

    public GestaoHospital retirarModerado() {
        if (!filaModerado.isEmpty()) {
            return filaModerado.remove(0);
        }
        return null;
    }

    public GestaoHospital retirarSevero() {
        if (!filaSevero.isEmpty()) {
            return filaSevero.remove(0);
        }
        return null;
    }


    // VERIFICAR VEZ

    public GestaoHospital verificarNormal() {
        int pessoasFrente = 0;

        return null;
    }

/*
 * Chama 1 paciente severo
 * Chama 1 paciente moderado
 * Chama 1 paciente leve
 * Chama 1 paciente severo
 * Chama 1 paciente moderado
 * Chama 1 paciente severo
 * Chama 1 paciente normal
 */

    public void atenderProximoPaciente() {
        if (!filaSevero.isEmpty()) {
            System.out.println("Chamando paciente severo: " + filaSevero.remove(0));
        }
    }

}
