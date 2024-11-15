package com.example.lifecycledemo

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lifecycledemo.ui.theme.LifecycleDemoTheme

class MainActivity : ComponentActivity() {

    //onCreate: Inicializa a interface da Activity e exibe uma mensagem de log e
    // Toast quando a Activity é criada pela primeira vez.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Mensagem de log e Toast para onCreate
        Log.d("LifecycleDemo", "onCreate chamado")
        Toast.makeText(this, "onCreate chamado",
            Toast.LENGTH_SHORT).show()
    }

    //onStart: Chamado quando a Activity está prestes a se tornar visível.
    // Adicionar uma mensagem de log e Toast.
    override fun onStart() {
        super.onStart()

        // Mensagem de log e Toast para onStart
        Log.d("LifecycleDemo", "onStart chamado")
        Toast.makeText(this, "onStart chamado", Toast.LENGTH_SHORT).show()
    }

    //onResume: Chamado quando a Activity está pronta para interações do usuário.
    // Exibe a mensagem "onResume chamado".
    override fun onResume() {
        super.onResume()

        // Mensagem de log e Toast para onResume
        Log.d("LifecycleDemo", "onResume chamado")
        Toast.makeText(this, "onResume chamado", Toast.LENGTH_SHORT).show()
    }

    //onPause: Chamado quando a Activity está prestes a sair do primeiro plano,
    // por exemplo, quando uma caixa de diálogo é aberta.
    // Exibe a mensagem "onPause chamado".
    override fun onPause() {
        super.onPause()

        // Mensagem de log e Toast para onPause
        Log.d("LifecycleDemo", "onPause chamado")
        Toast.makeText(this, "onPause chamado", Toast.LENGTH_SHORT).show()
    }

    //onStop: Chamado quando a Activity não está mais visível.
    // Esse método libera recursos temporários e exibe "onStop chamado".
    override fun onStop() {
        super.onStop()

        // Mensagem de log e Toast para onStop
        Log.d("LifecycleDemo", "onStop chamado")
        Toast.makeText(this, "onStop chamado", Toast.LENGTH_SHORT).show()
    }

    //onDestroy: Chamado antes da Activity ser destruída. Exibe "onDestroy chamado".
    override fun onDestroy() {
        super.onDestroy()

        // Mensagem de log e Toast para onDestroy
        Log.d("LifecycleDemo", "onDestroy chamado")
        Toast.makeText(this, "onDestroy chamado", Toast.LENGTH_SHORT).show()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LifecycleDemoTheme {
        Greeting("Android")
    }
}