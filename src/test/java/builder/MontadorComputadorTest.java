package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class MontadorComputadorTest {

    @Test
    void deveMontarComputadorDeEscritorio() {
        MontadorComputador montador = new MontadorComputador(new ComputadorEscritorioBuilder());

        Computador computador = montador.montar();

        assertEquals("Processador: Intel Core i3 | Memória: 8 GB | Armazenamento: 256 GB"
                + " | Placa de vídeo: Integrada", computador.descrever());
    }

    @Test
    void deveMontarComputadorGamer() {
        MontadorComputador montador = new MontadorComputador(new ComputadorGamerBuilder());

        Computador computador = montador.montar();

        assertEquals("Processador: AMD Ryzen 7 | Memória: 32 GB | Armazenamento: 1000 GB"
                + " | Placa de vídeo: NVIDIA RTX 4070", computador.descrever());
    }

    @Test
    void deveMontarComputadoresDiferentesTrocandoOBuilder() {
        MontadorComputador montador = new MontadorComputador(new ComputadorEscritorioBuilder());
        Computador escritorio = montador.montar();

        montador.setBuilder(new ComputadorGamerBuilder());
        Computador gamer = montador.montar();

        assertEquals(8, escritorio.getMemoria());
        assertEquals(32, gamer.getMemoria());
    }

    @Test
    void deveCriarNovoComputadorACadaMontagem() {
        MontadorComputador montador = new MontadorComputador(new ComputadorGamerBuilder());

        Computador primeiro = montador.montar();
        Computador segundo = montador.montar();

        assertNotSame(primeiro, segundo);
        assertEquals(primeiro.descrever(), segundo.descrever());
    }
}
