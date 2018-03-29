package gogoris.bugs.generatortype.demo.generator;

import gogoris.bugs.generatortype.demo.model.Project;
import org.hibernate.Session;
import org.hibernate.tuple.ValueGenerator;

public class ProjectNummerGenerator implements ValueGenerator<String> {

    @Override
    public String generateValue(Session session, Object owner) {
        Project project = (Project) owner;
        return String.format("PROJECT%03d", project.getId());
    }
}
