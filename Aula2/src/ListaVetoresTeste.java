public class ListaVetoresTeste {
    public static void main(String[] args) {
        ListaVetores lista = new ListaVetores(5);
        lista.insere(66);
        lista.insere(77);
        lista.insere(88);
        lista.insere(99);
        lista.insere(100);

        lista.imprime();
    }
}
