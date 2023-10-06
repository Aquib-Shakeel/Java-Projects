package in.pwskills.bean;

import org.springframework.stereotype.Component;

@Component("bdart")
public class BlueDart implements Courier {

	@Override
	public String deliver(Integer otp) {	
		return "Delivering "+otp+"order Id purchased using BlueDart ... ";
	}

	@Override
	public String toString() {
		return "BlueDart []";
	}

}
