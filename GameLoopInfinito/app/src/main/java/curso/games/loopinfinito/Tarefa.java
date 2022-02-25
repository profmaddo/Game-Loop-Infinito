package curso.games.loopinfinito;

import android.util.Log;

public class Tarefa implements Runnable {

    boolean isRodando = true;

    int tempo;

    public Tarefa(int tempo){
        this.tempo = tempo;

    }

    @Override
    public void run() {

        int contador = 0;


        while (isRodando) {
            Log.i("LogTarefa", "Tafera genérica rodando...." + contador);

            contador++;

              if(contador>tempo) isRodando = false;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public  void finalizarTarefa(){
        this.isRodando = false;
    }


}
