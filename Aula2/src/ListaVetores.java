public class ListaVetores {
        private Integer[] dados;
        private int qt;

        ListaVetores(int tam){
            dados = new Integer[tam];
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
                System.out.print(dados[i] + " -> ");
            }
        }

        Integer removeFinal(){
            if(qt == 0) return null;
            Integer temp = dados[qt - 1];
            qt --;
            return temp;

        }

    }
