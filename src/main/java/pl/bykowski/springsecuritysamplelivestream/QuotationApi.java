package pl.bykowski.springsecuritysamplelivestream;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuotationApi {

    private List<Quotation> quotations;

    public QuotationApi() {
        this.quotations = new ArrayList<>();
        quotations.add(new Quotation("To, że milczę, nie znaczy, że nie mam nic do powiedzenia.", "Jonathan Carroll"));
        quotations.add(new Quotation("Lepiej zaliczać się do niektórych, niż do wszystkich.", "Andrzej Sapkowski"));
    }

    @GetMapping("/api")
    public List<Quotation> getQuotation() {
        return quotations;
    }

    @PostMapping("/api")
    public boolean addQuotation(@RequestBody Quotation quotation) {
        return quotations.add(quotation);
    }

    @DeleteMapping("/api")
    public void deleteQuotation(@RequestParam int index) {
        quotations.remove(index);
    }
}
