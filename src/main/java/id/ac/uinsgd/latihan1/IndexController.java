package id.ac.uinsgd.latihan1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping ("api")
public class IndexController {
    @GetMapping("hello")
    public String index(@RequestParam String nama) {
        return "Selamat Belajar Springboot, " + nama + " Diakses pada : " + LocalDate.now();
    }
}