import org.springframework.stereotype.Service;

@Service
public class CounterService {

    private CounterRepo repo;

    public CounterService(CounterRepo repo) {
        this.repo = repo;
    }

    public int getCounter() {
        Optional<Counter> counter = repo.findById(1);
        if (counter.isPresent()) {
            return counter.get().getValue();
        }
        return 0;
    }

    public void update(int value) {
        repo.save(new Counter(1, value));
    }
}
