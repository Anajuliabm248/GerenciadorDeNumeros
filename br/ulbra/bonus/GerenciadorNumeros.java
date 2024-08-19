package br.ulbra.bonus;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciadorNumeros {

    public ArrayList<Integer> numero;

    public GerenciadorNumeros() {
        numero = new ArrayList();
    }

    public void adicionar(int numero) {

        this.numero.add(numero);

        if (this.numero.equals("") || this.numero.equals(null)) {
            JOptionPane.showMessageDialog(null, "Por favor, informe o número.");
        } else {
        }
    }

    public String listar() {
        String n = "";

        if (this.numero.isEmpty()) {
            return "Não foram lançados números.";
        } else {
            for (int i = 0; i < this.numero.size(); i++) {
                n += (i + 1) + " - " + this.numero.get(i) + "\n";
            }
        }
        return n;
    }

    public void excluir(int i) {
        if (this.numero.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vazia.");
        } else if (i >= this.numero.size() || i < 0) {
            JOptionPane.showMessageDialog(null, "numero não existe.");
        } else {
            this.numero.remove(i);
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        }
    }

    public void alterar(int i, int novoElemento) {
        if (this.numero.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vazia.");
        } else if (i >= this.numero.size() || i < 0) {
            JOptionPane.showMessageDialog(null, "numero não existe.");
        } else {
            this.numero.set(i, novoElemento);
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        }
    }

    public double calcularMedia() {
        double soma = 0;
        for (int numero : this.numero) {
            soma += numero;
        }
        double media = soma / this.numero.size();
        return media;
    }
}
