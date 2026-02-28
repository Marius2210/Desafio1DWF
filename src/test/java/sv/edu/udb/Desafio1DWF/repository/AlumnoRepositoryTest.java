package sv.edu.udb.Desafio1DWF.repository;
import sv.edu.udb.Desafio1DWF.domain.Alumno;
import sv.edu.udb.Desafio1DWF.domain.Materia;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Commit
public class AlumnoRepositoryTest {
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private MateriaRepository materiaRepository;

    @Test
    public void testInsertarAlumno1() {
        Alumno alumno = new Alumno("Carlos", "Reyes");
        Materia materia = materiaRepository.findById(1L).orElseThrow();
        alumno.setMaterias(List.of(materia));

        Alumno guardado = alumnoRepository.save(alumno);

        assertNotNull(guardado.getId());
        assertEquals("Carlos", guardado.getNombre());
        assertEquals("Reyes", guardado.getApellido());
        System.out.println("Alumno insertado: " + guardado.getId() + " - " + guardado.getNombre() + " " + guardado.getApellido());
    }

    @Test
    public void testInsertarAlumno2() {
        Alumno alumno = new Alumno("Gabriela", "Morales");
        Materia materia = materiaRepository.findById(2L).orElseThrow();
        alumno.setMaterias(List.of(materia));

        Alumno guardado = alumnoRepository.save(alumno);

        assertNotNull(guardado.getId());
        assertEquals("Gabriela", guardado.getNombre());
        assertEquals("Morales", guardado.getApellido());
        System.out.println("Alumno insertado: " + guardado.getId() + " - " + guardado.getNombre() + " " + guardado.getApellido());
    }
}