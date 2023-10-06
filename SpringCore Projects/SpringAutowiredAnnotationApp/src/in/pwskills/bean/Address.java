package in.pwskills.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("India")
	private String Country;
	@Value("UP")
	private String State;
	@Value("226010")
	private Integer pincode;
	@Override
	public String toString() {
		return "Address [Country=" + Country + ", State=" + State + ", pincode=" + pincode + "]";
	}


}
