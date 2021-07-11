package loanController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Loan;


@RestController
@RequestMapping("/loans")
public class LoanController {

	@GetMapping("/{number}")
	public Loan getLoanDetails(@PathVariable long number) {
		return new Loan(number, "Gold", 400000, 4000, 18);
	}
}