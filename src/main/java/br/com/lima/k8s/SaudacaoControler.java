package br.com.lima.k8s;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoControler {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/saudacao")
	public SaudacaoVO saudacao(@RequestParam(defaultValue = "World") String conteudo) {
		return new SaudacaoVO(counter.incrementAndGet(), String.format(template, conteudo));
	}
}

