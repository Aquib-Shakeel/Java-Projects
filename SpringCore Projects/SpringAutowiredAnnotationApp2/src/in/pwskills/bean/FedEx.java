
package in.pwskills.bean;


import java.util.Random;

import org.springframework.stereotype.Component;

@Component("fedex")
public class FedEx implements Courier{
	@Override
	public String deliver(Integer otp) {
		
		return "Delivering "+otp+"order Id purchased using FedEx ... ";
	}
	

	@Override
	public String toString() {
		return "FedEx []";
	}
	
}
