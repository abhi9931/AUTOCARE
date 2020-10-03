package com.autocare.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.autocare.entity.Customer;
import com.autocare.entity.Staff;
import com.autocare.service.AutocareService;

@org.springframework.stereotype.Controller
@SessionAttributes({"MyStaff" , "MyRoles", "MyCustomer"})
@Transactional
public class Controller {
	
	@Autowired
	AutocareService autocareService;
	
	@ModelAttribute("MyStaff")
	public Staff createStaff() {
		System.out.println("Controller -> createStaff()");
		return new Staff();
	}
	
	@ModelAttribute("MyCustomer")
	public Customer newCustomer() {
		System.out.println("Controller -> newCustomer()");
		return new Customer();
	}
	
	@GetMapping(value = {"/" , "/home"})
	public String showHome(Model model) {
		System.out.println("Controller -> showHome()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		return "BaseDef";
	}
	
	/*
	 * @GetMapping(value = {"/test"}) public String showTest(Model model) {
	 * System.out.println("Controller -> showTest()");
	 * 
	 * List<String> myroles = getUserRoles(); System.out.println(myroles);
	 * model.addAttribute("MyRoles", myroles);
	 * 
	 * return "TestDef"; }
	 */
	
	@GetMapping(value = {"/bookService"})
	public String showBookServicePage(Model model) {
		System.out.println("Controller -> showBookServicePage()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		return "BookServiceDef";
	}
	
	@GetMapping(value = {"/invalidAccess"})
	public String showInvalidAccessPage(Model model) {
		System.out.println("Controller -> showInvalidAccessPage()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		return "InvalidAccessDef";
	}
	
	@GetMapping(value = {"/worksheetItems"})
	public String showWorkSheetItemsPage(Model model) {
		System.out.println("Controller -> showWorkSheetItemsPage()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		return "WorksheetItemsDef";
	}
	
	@GetMapping(value = {"/serviceNames"})
	public String showServiceNamesPage(Model model) {
		System.out.println("Controller -> showServiceNamesPage()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		return "ServiceNamesDef";
	}
	
	@GetMapping(value = {"/serviceDetails"})
	public String showServiceDetails(Model model) {
		System.out.println("Controller -> showServiceDetails()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		return "ServiceDetailsDef";
	}
	
	@GetMapping(value = {"/part"})
	public String showPartPage(Model model) {
		System.out.println("Controller -> showPartPage()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		return "PartDef";
	}
	
	@GetMapping(value = {"/addCar"})
	public String showAddCar(Model model) {
		System.out.println("Controller -> showAddCar()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		return "AddCarDef";
	}
	
	@GetMapping(value = {"/addStaff", "addStaff"})
	public String addStaff(Model model) {
		System.out.println("Controller -> addStaff()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		return "AddStaffDef";
	}
	
	@PostMapping("registerStaff")
	public String registerStaff(@ModelAttribute("MyStaff") Staff staff, BindingResult bindingResult, Model model) {
		System.out.println("Controller -> registerStaff()");
		autocareService.registerStaff(staff);
		return "BaseDef";
	}
	
	@GetMapping("/addCustomer")
	public String addCustomer(Model model) {
		System.out.println("Controller -> addCustomer()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		return "AddCustomerDef";
	}
	
	@PostMapping("registerCustomer")
	public String registerCustomer(@ModelAttribute("MyCustomer") Customer customer, BindingResult bindingResult, Model model) {
		System.out.println("Controller -> registerCustomer()");
		autocareService.registerCustomer(customer);
		return "BaseDef";
	}
	
	@GetMapping("/login")
	public String showLoginPage(
			@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout,
			HttpSession session,
			Model model
			) {
		System.out.println("Controller -> showLoginPage()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		if(error != null) {
			model.addAttribute("error", "Invalid Username or Password");
		}
		
		if(logout != null) {
			model.addAttribute("logout", "You have logged out Successfully");
		}
		
		getUserRoles();
		
		return "LoginDef";
	}
	
	@GetMapping("/logout")
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("UserController -> logoutPage()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		
		return "redirect:/login?logout";
	}
	
	/*@GetMapping("/register")
	public String showRegister(Model model) {
		System.out.println("Controller -> showRegister()");
		
		model.addAttribute("MyStaff", createStaff());
		
		return "RegisterDef";
	}*/
	
	@GetMapping("/removeCustomer")
	public String removeCustomer(Model model) {
		System.out.println("Controller -> removeCustomer()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		return "RemoveCustomerDef";
	}
	
	@GetMapping("/allusers")
	public String getAllUsers(Model model) {
		System.out.println("Controller -> getAllUsers()");
		
		List<Staff> usersList = autocareService.getAllUsers();
		model.addAttribute("MyStaff", usersList);
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		return "AllUsersDef";
	}
	
	@GetMapping("/removeStaff")
	public String removeStaff(Model model) {
		System.out.println("Controller -> removeStaff()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		return "RemoveStaffDef";
	}
	
	@GetMapping("/serviceVehicle")
	public String serviceVehicle(Model model) {
		System.out.println("Controller -> serviceVehicle()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		return "AddCarDef";
	}
	
	
	private List<String> getUserRoles(){
		System.out.println("Controller -> getUserRoles()");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		List<String> myRoles = new ArrayList<String>();
		if(auth != null) {
			Collection<GrantedAuthority> col = (Collection<GrantedAuthority>) auth.getAuthorities();
			for(GrantedAuthority gauth : col) {
				myRoles.add(gauth.getAuthority());
			}
		}
		return myRoles;
	}
}
