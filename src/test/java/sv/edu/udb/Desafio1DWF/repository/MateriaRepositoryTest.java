package sv.edu.udb.Desafio1DWF.repository;
import sv.edu.udb.Desafio1DWF.domain.Materia;
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
public class MateriaRepositoryTest {
    @Autowired
    private MateriaRepository materiaRepository;

    @Autowired
    private ProfesorRepository profesorRepository;

    @Test
    public void testInsertarMateria1() {
        Profesor profesor = profesorRepository.findById(1L).orElseThrow();
        Materia materia = new Materia("Cálculo", profesor);
        Materia guardada = materiaRepository.save(materia);

        assertNotNull(guardada.getId());
        assertEquals("Cálculo", guardada.getNombre());
        System.out.println("Materia insertada: " + guardada.getId() + " - " + guardada.getNombre());
    }

    @Test
    public void testInsertarMateria2() {
        Profesor profesor = profesorRepository.findById(2L).orElseThrow();
        Materia materia = new Materia("Estructura de Datos", profesor);
        Materia guardada = materiaRepository.save(materia);

        assertNotNull(guardada.getId());
        assertEquals("Estructura de Datos", guardada.getNombre());
        System.out.println("Materia insertada: " + guardada.getId() + " - " + guardada.getNombre());
    }
}