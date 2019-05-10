package co.sofka.example.demoReceptora;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
public class SaludoService {

    @GetMapping(value = "/salud", produces = MediaType.TEXT_PLAIN_VALUE)
    public Mono<String> salud() {
        return Mono.just(("Mariana"));
    }
}
