package gogoris.bugs.generatortype.demo.repository;

import gogoris.bugs.generatortype.demo.model.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest @AutoConfigureDataJpa
public class ProjectRepositorySpringBootTest {

    @Autowired
    private ProjectRepository repository;

    @Test
    public void saveTest() {
        Project project = Project.builder().build();
        project = repository.save(project);

        assertThat(project).isNotNull();
        assertThat(project.getId()).as("id").isGreaterThan(0L);
        assertThat(project.getCode()).as("Code after insertion").isEqualTo("PROJECT001");
    }

}