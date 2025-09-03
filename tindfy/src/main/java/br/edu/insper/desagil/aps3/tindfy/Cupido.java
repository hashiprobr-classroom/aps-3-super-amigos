package br.edu.insper.desagil.aps3.tindfy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cupido {
    private final Map<Integer, List<Integer>> likes = new HashMap<>();

    public void like(int pId, int paraId) {
        List<Integer> lista = likes.get(pId);
        if (lista == null) {
            lista = new ArrayList<>();
            likes.put(pId, lista);
        }
        if (!lista.contains(paraId)) {
            lista.add(paraId);
        }
    }

    public boolean match(Usuario a, Usuario b) {
        List<Integer> la = likes.get(a.getId());
        List<Integer> lb = likes.get(b.getId());

        if (la == null || lb == null) {
            return false;
        }
        return la.contains(b.getId()) && lb.contains(a.getId());
    }
}
