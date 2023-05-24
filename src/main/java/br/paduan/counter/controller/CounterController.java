import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counter")
public class CounterController {
    
    @Autowired
    private CounterService service;

    @GetMapping
    public String getCounter() {
        int curentCounterValue = service.getCounter();
        curentCounterValue++;
        service.update(curentCounterValue);
        return "A NOVA página foi acessada " + curentCounterValue;
    }
}
