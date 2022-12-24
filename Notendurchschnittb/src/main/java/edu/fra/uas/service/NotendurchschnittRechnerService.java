package edu.fra.uas.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import edu.fra.uas.model.StudentAccount;

@Service
public class NotendurchschnittRechnerService {

	
	public static double durchSchnittRechnen(List<StudentAccount> studentsList) {
		double noteDurchSchnitt = 0;
		
		for(StudentAccount account : studentsList) {
			noteDurchSchnitt += account.getNote();
		}
		
		noteDurchSchnitt = noteDurchSchnitt / studentsList.size();
		
		return noteDurchSchnitt;
	}
//	@Bean
//	CommandLineRunner init() {
//		CommandLineRunner action = new CommandLineRunner() {
//			@Override
//			public void run(String... args) throws Exception {
//				Scanner in = new Scanner(System.in);
//
//				int anzNoten;
//				int anzEingegeben = 0;
//				double note;
//				double total = 0.00;
//				double schnitt = 0;
//
////------ Programmablauf ------
//
//				System.out.print("Anzahl Noten >");
//				anzNoten = Integer.parseInt(in.nextLine());
//
//				while (anzEingegeben < anzNoten) {
//					System.out.print("Note >");
//					note = Double.parseDouble(in.nextLine());
//
//					total = total + note;
//					anzEingegeben = anzEingegeben + 1;
//				}
//
//				schnitt = total / anzNoten;
//
//				System.out.print("Notenschnitt = " + schnitt);
//
//				in.close();
//
//			}
//
//		};
//		return action;
//	}
}