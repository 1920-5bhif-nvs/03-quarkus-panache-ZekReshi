package at.htl.coincollection.control;

import at.htl.coincollection.entity.Source;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class SourceRepository implements PanacheRepository<Source> {

    public List<Source> getAll() {
        return this.listAll();
    }

    public void save(Source source) {
        this.persistAndFlush(source);
    }

}
