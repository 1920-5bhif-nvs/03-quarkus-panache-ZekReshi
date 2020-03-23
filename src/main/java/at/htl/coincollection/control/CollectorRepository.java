package at.htl.coincollection.control;

import at.htl.coincollection.entity.Collector;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class CollectorRepository implements PanacheRepository<Collector> {

    public List<Collector> getAll() {
        return this.listAll();
    }

    public void save(Collector collector) {
        this.persistAndFlush(collector);
    }

}
