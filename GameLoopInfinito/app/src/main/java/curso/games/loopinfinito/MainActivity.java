package curso.games.loopinfinito;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Tarefa tarefa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("LogTarefa", "onCreate: iniciada");

    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void finalizarApp(View view) {

        Log.i("LogTarefa", "finalizarApp: clicado");
        tarefa.finalizarTarefa();
        finish();

    }

    public void iniciarTarefa(View view) {

        tarefa = new Tarefa(100);
        new Thread(tarefa).start();
       // tarefa.run();
    }

    public void concluirTarefa(View view) {

        Log.e("LogTarefa", "concluirTarefa: clicada");
        tarefa.finalizarTarefa();


    }
}