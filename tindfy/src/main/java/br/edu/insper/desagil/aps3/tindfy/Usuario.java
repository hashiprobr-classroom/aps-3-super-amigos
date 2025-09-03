package br.edu.insper.desagil.aps3.tindfy;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
    private final List<Musica> favoritas;

    public Usuario(int id, String nome, List<Musica> favoritas) {
        super(id, nome);
        this.favoritas = favoritas;
    }

    public List<Musica> getFavoritas() {
        return new ArrayList<>(favoritas);
    }

    public boolean contains(Musica m) {
        for (Musica x : favoritas) {
            boolean mesmoArtista = x.getArtista().getId() == m.getArtista().getId();
            boolean mesmoTitulo = x.getTitulo().equals(m.getTitulo());
            if (mesmoArtista && mesmoTitulo) {
                return true;
            }
        }
        return false;
    }

    public void add(Musica m) {
        if (!contains(m)) {
            favoritas.add(m);
        }
    }
}