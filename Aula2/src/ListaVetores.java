public class ListaVetores {
    private Integer[] dados;
    private int qt;

    ListaVetores(int tam) {
        dados = new Integer[tam];
        qt = 0;
    }

    void insere(int valor) {
        if (qt < dados.length) {
            dados[qt] = valor;
            qt++;
        }
    }

    void imprime() {

        for (int i = 0; i < qt; i++) {
            System.out.print(dados[i] + " -> ");
        }
    }

    Integer removeFinal() {
        if (qt == 0) return null;
        Integer temp = dados[qt - 1];
        qt--;
        return temp;

    }
    void redireciona(int max){
        Integer temp[] = new Integer[max];
        for (int i = 0; i < qt; i++){
            temp[i] = dados[i];

            dados = temp;
        }
    }

    Integer removePosicao(int pos) {
        if (pos < 0 || pos >= qt) return null;
        Integer temp = dados[pos];

        for(int i = pos + 1; i<qt; i++){
            dados[i-1] = dados[i];
            qt--;
        }
        return temp;
    }
}