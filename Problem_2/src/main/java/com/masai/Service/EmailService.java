package com.masai.Service;

import com.masai.Model.Email;

public interface EmailService {

	public String getUserEmailbyBothId(Integer id,Integer mail_id);
	
	public Email createbyemailforuser(Integer id);
}
