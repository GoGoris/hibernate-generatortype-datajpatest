package gogoris.bugs.generatortype.demo.repository;

import gogoris.bugs.generatortype.demo.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
