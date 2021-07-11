package AccountController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import AccountModel.Account;


@RestController
@RequestMapping("/accounts")
public class AccountController {

	@GetMapping("/{number}")
	public Account getAccountDetails(@PathVariable long number) {
		return new Account(number, "Saving", 10000.00);
	}
}