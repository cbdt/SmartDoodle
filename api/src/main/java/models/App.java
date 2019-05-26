package models;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class App {

	void onStart(@Observes StartupEvent e) {
		
		System.out.println("starting ........");
	}
	
	void onStop(@Observes ShutdownEvent e) {
		System.out.println("stopping ........");

	}
}