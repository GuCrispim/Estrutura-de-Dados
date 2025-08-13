public class ListaVetoresTeste {
    public static void main(String[] args) {
        ListaVetores lista = new ListaVetores(5);
        lista.insere(66);
        lista.insere(77);
        lista.insere(88);
        lista.insere(99);
        lista.insere(100);
        System.out.println(lista.removeFinal());
        System.out.println();
        lista.imprime();
        lista.insere(333);
        lista.insere(999);
        lista.insere(55);
        lista.insere(22);
        lista.insere(44);
        lista.imprime();

    }
}
