public class ListaVetores {
        private int[] dados;
        private int qt;

        ListaVetores(int tam){
            dados = new int[tam];
            qt = 0;
        }

        void insere(int valor){
            if(qt < dados.length){
                dados[qt] = valor;
                qt++;
            }
        }

        void imprime(){

            for(int i = 0; i < qt; i++) {
                System.out.println(dados[i] + " -> ");
            }
            System.out.println();
        }
    }
