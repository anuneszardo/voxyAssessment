package br.com.mvc.voxy.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.mvc.voxy.dto.RequestTextDTO;
import br.com.mvc.voxy.model.UserForm;

//Main controller for the app, the index.html alerady redirects to /form 
@Controller
public class FormController {
	
//  if you want to test the spring data save, you have to uncomment these lines in order to persist the data
//	@Autowired
//	private UserFormRepository userFormRepository;
	
	@RequestMapping(value="/form", method=RequestMethod.GET)
	public String form(@Valid RequestTextDTO req, BindingResult result) {
		return "form";
	}
	
	@RequestMapping(value="/form/create", method=RequestMethod.POST)
	public String create(@Valid RequestTextDTO req, BindingResult result) {
		if(result.hasErrors()) {
			return "form";
		}
		UserForm uf = new UserForm();
		uf.setText(req.getText());
		String[] wordArray = req.getText().trim().split("\\s+");
		int length = wordArray.length;
		uf.setWordCount(length);
		req.setWordCount(length);
		//  if you want to test the spring data save, you have to uncomment these lines in order to persist the data
		//userFormRepository.save(uf);
		return "form";
	}
}
