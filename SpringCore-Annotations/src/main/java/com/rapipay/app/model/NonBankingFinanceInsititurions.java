package com.rapipay.app.model;

import org.springframework.stereotype.Component;

@Component("nbfi")
public class NonBankingFinanceInsititurions extends EMI{
	public String getinfo()
	{
		return  "NBFI's Called";
	}
}
