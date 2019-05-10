package co.sofka.example.demoReceptora;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.NumberFormat;

@SpringBootApplication
public class DemoReceptoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoReceptoraApplication.class, args);
	}

	public static void printInfo() {
		Runtime runtime = Runtime.getRuntime();
		final NumberFormat format = NumberFormat.getInstance();
		final long maxMemory = runtime.maxMemory();
		final long allocatedMemory = runtime.totalMemory();
		final long freeMemory = runtime.freeMemory();
		final long mb = 1024 * 1024;
		final String mega = " MB";
		System.out.println("========================== Memory Info ==========================");
		System.out.println("Free memory: " + format.format(freeMemory / mb) + mega);
		System.out.println("Allocated memory: " + format.format(allocatedMemory / mb) + mega);
		System.out.println("Max memory: " + format.format(maxMemory / mb) + mega);
		System.out.println("Total free memory: " + format.format((freeMemory + (maxMemory - allocatedMemory)) / mb) + mega);
		System.out.println("=================================================================");
	}

	@Bean
	public CommandLineRunner lineRunner() {
		return args -> {
			printInfo();
		};
	}

}
