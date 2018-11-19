package coupons.web;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tamer.entities.Company;
import com.tamer.entities.Coupon;
import com.tamer.entities.Customer;

import antlr.debug.Event;
import service.TestService;

@RestController
@RequestMapping("rest/api/coupons")
public class CouponsController {
	private final TestService testService;
	
	
	@Autowired
	public CouponsController(TestService testService) {
		this.testService = testService;
	}
	
	@GetMapping("/test-generate-coupons")
	public Set<Coupon> generateCoupons(){
		return testService.generateCoupons();
	}
	
	@GetMapping("/test-company")
	public Company testCompany() {
		return testService.testCompany(5);
	}
	
	@GetMapping("/test-customer")
	public Customer testCustomer() {
		return testService.testCustomer(3);
	}
	
//	@PostMapping("/add-customer")
//	public Customer addCustomer(@RequestBody Customer newCustomer) {
//		return new Customer(service)
//	}
}
