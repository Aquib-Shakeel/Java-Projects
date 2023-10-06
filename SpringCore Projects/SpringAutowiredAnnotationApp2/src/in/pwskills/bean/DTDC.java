package in.pwskills.bean;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier {

	@Override
	public String deliver(Integer otp) {
		return "Delivering "+otp+"order Id purchased using DTDC ... ";
	}

	@Override
	public String toString() {
		return "DTDC []";
	}

}
