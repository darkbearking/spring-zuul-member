package org.dark;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MemberController {

	@RequestMapping(value = "/member/{id}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Member call(@PathVariable Integer id) {
		Member p = new Member();
		p.setId(id);
		p.setName("dark");
//		p.setMessage(request.getRequestURI().toString()+"=="+request.getLocalAddr()+"--"+request.getLocalPort());
		return p;
	}
}
