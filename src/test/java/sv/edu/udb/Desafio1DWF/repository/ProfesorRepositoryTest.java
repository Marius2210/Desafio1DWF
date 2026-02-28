package sv.edu.udb.Desafio1DWF.repository;
import sv.edu.udb.Desafio1DWF.domain.Profesor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Commit
public class ProfesorRepositoryTest {
    @Autowired
    private ProfesorRepository profesorRepository;

    @Test
    public void testInsertarProfesor1() {
        Profesor profesor = new Profesor("Pedro Alvarado");
        Profesor guardado = profesorRepository.save(profesor);

        assertNotNull(guardado.getId());
        assertEquals("Pedro Alvarado", guardado.getNombre());
        System.out.println("Profesor insertado: " + guardado.getId() + " - " + guardado.getNombre());
    }

    @Test
    public void testInsertarProfesor2() {
        Profesor profesor = new Profesor("Laura Mendoza");
        Profesor guardado = profesorRepository.save(profesor);

        assertNotNull(guardado.getId());
        assertEquals("Laura Mendoza", guardado.getNombre());
        System.out.println("Profesor insertado: " + guardado.getId() + " - " + guardado.getNombre());
    }
}