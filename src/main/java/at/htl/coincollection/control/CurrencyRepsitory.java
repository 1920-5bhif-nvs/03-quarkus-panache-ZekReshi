package at.htl.coincollection.control;

import at.htl.coincollection.entity.Currency;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class CurrencyRepsitory implements PanacheRepository<Currency> {

    public List<Currency> getAll() {
        return this.listAll();
    }

    public void save(Currency currency) {
        this.persistAndFlush(currency);
    }

}
