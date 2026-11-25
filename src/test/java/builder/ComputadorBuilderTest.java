package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ComputadorBuilderTest {

    @Test
    void deveMontarComputadorGamerComTodasAsPecas() {
        Computador computador = new ComputadorBuilder()
                .processador("AMD Ryzen 7")
                .memoria(32)
                .armazenamento(1000)
                .placaDeVideo("NVIDIA RTX 4070")
                .build();

        assertEquals("Processador: AMD Ryzen 7 | Memória: 32 GB | Armazenamento: 1000 GB"
                + " | Placa de vídeo: NVIDIA RTX 4070", computador.descrever());
    }

    @Test
    void deveUsarValoresPadraoParaPecasNaoInformadas() {
        Computador computador = new ComputadorBuilder()
                .processador("Intel Core i3")
                .memoria(8)
                .build();

        assertEquals(256, computador.getArmazenamento());
        assertEquals("Integrada", computador.getPlacaDeVideo());
    }

    @Test
    void deveExigirProcessador() {
        ComputadorBuilder builder = new ComputadorBuilder().memoria(8);

        assertThrows(IllegalStateException.class, builder::build);
    }

    @Test
    void deveExigirMemoria() {
        ComputadorBuilder builder = new ComputadorBuilder().processador("Intel Core i3");

        assertThrows(IllegalStateException.class, builder::build);
    }

    @Test
    void deveCriarNovoComputadorACadaBuild() {
        ComputadorBuilder builder = new ComputadorBuilder()
                .processador("Intel Core i5")
                .memoria(16);

        Computador primeiro = builder.build();
        Computador segundo = builder.build();

        assertNotSame(primeiro, segundo);
        assertEquals(primeiro.descrever(), segundo.descrever());
    }
}
