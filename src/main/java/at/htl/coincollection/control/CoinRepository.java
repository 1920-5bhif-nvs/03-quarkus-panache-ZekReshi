package at.htl.coincollection.control;

import at.htl.coincollection.entity.Coin;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class CoinRepository implements PanacheRepository<Coin> {

    public List<Coin> getAll() {
        return this.listAll();
    }

    public Coin getById(Long id) {
        return this.findById(id);
    }

    public void save(Coin coin) {
        this.persistAndFlush(coin);
    }

}
