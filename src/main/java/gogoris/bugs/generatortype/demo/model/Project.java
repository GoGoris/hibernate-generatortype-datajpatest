package gogoris.bugs.generatortype.demo.model;

import gogoris.bugs.generatortype.demo.generator.ProjectNummerGenerator;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "PROJECT")
@Data
@Builder
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @GeneratorType(type = ProjectNummerGenerator.class, when = GenerationTime.INSERT)
    @Column(name = "CODE")
    private String code;
}
