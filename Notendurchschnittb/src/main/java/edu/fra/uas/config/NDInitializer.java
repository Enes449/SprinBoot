package edu.fra.uas.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import edu.fra.uas.model.StudentAccount;
import edu.fra.uas.repository.NotendurchschniitRepository;

@Component
@ConditionalOnProperty(name ="app.init-db", havingValue = "true") //dadurch wird die Daten nicht ausgeführt sie sind an die bedingung in den Propertys verbunden. Diser muss true sein
public class NDInitializer implements CommandLineRunner{
private NotendurchschniitRepository notendurchschniitRepository;
	
	public NDInitializer(NotendurchschniitRepository notendurchschniitRepository) {
		this.notendurchschniitRepository = notendurchschniitRepository;
		
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.notendurchschniitRepository.deleteAll();
		
		StudentAccount studentAccount1 = new StudentAccount("John", 18,  4.5);
		StudentAccount studentAccount2 = new StudentAccount("Anna", 168,  3.5);
		
		this.notendurchschniitRepository.save(studentAccount1);
		this.notendurchschniitRepository.save(studentAccount2);
		
		System.out.println("-----Database has been initialized");
	}

}