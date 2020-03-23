package at.htl.coincollection.control;

import at.htl.coincollection.entity.Coin;
import at.htl.coincollection.entity.Collector;
import at.htl.coincollection.entity.Currency;
import at.htl.coincollection.entity.Source;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class InitBean {

    @Inject
    CoinRepository coinRepository;
    @Inject
    CollectorRepository collectorRepository;
    @Inject
    CurrencyRepsitory currencyRepsitory;
    @Inject
    SourceRepository sourceRepository;

    @Transactional
    public void init(@Observes StartupEvent ev) {
        Collector florian = new Collector("Florian", "Schwarcz");
        collectorRepository.save(florian);
        Currency groschen = new Currency("Groschen");
        currencyRepsitory.save(groschen);
        Source kaffeedose = new Source("Kaffeedose");
        sourceRepository.save(kaffeedose);

        Coin coin1 = new Coin(10, 10, 1990, kaffeedose, groschen, florian);
        Coin coin2 = new Coin(50, 5, 1991, kaffeedose, groschen, florian);
        coinRepository.save(coin1);
        coinRepository.save(coin2);
    }

}
