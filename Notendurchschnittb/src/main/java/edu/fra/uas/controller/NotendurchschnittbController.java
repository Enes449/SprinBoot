package edu.fra.uas.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.fra.uas.repository.NotendurchschniitRepository;
import edu.fra.uas.service.NotendurchschnittRechnerService;
import edu.fra.uas.model.StudentAccount;

//http://localhost:8080/Notendurchschnitt/all

//@RestController
@Controller
@RequestMapping("/Notendurchschnitt")
public class NotendurchschnittbController {

	private static final Logger LOGGER = LoggerFactory.getLogger(NotendurchschnittbController.class);
	@Autowired
	private NotendurchschniitRepository notendurchschniitRepository;

	public NotendurchschnittbController(NotendurchschniitRepository notendurchschniitRepository) {

		this.notendurchschniitRepository = notendurchschniitRepository;

	}

	@GetMapping("/all")
	public String all(Model model) {
		List<StudentAccount> studentsList = this.notendurchschniitRepository.findAll();
		LOGGER.info("" + studentsList.size());
		double noteDurchschnitt = NotendurchschnittRechnerService.durchSchnittRechnen(studentsList);
		model.addAttribute("notee", studentsList);

		model.addAttribute("durchschnitt", noteDurchschnitt);

		return "noten";

	}
}