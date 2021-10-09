package com.adminportal.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.adminportal.entity.Shoe;
import com.adminportal.service.ShoeService;

@Controller
@RequestMapping("/shoe")
public class ShoeController {
	
	@Autowired
	private ShoeValidator shoeValidator;
	
	@Autowired
	private ShoeService shoeService;
	
	@GetMapping("/add")
	public String addShoe(Model model) {
		Shoe shoe = new Shoe();
		model.addAttribute("productForm", shoe);
		return "addshoe";
	}
	
	@PostMapping("/add")
	public String addShoePost(
			@ModelAttribute("productForm") Shoe productForm,
			BindingResult bindingResult,
			HttpServletRequest request
			) {
		 shoeValidator.validate(productForm, bindingResult);
		 if(bindingResult.hasErrors()) {
			 return "addshoe";
		 }
		 shoeService.save(productForm);
		 
		 MultipartFile shoeImage = productForm.getShoeImage();
		 try {
			 byte[] bytes = shoeImage.getBytes();
			 String name = productForm.getId()+".png";
			 BufferedOutputStream bOS = 
					 new BufferedOutputStream(new FileOutputStream(new File("src/main/resources/static/uploads/shoe/"+name)));
			 bOS.write(bytes);
			 bOS.close();
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		
		return "redirect:shoe-list";
	}
	
	@GetMapping("/shoe-list")
	public String shoeList(Model model) {
		List<Shoe> shoeList = shoeService.findAll();
		model.addAttribute("shoeList", shoeList);
		return "shoelist";
	}
}
