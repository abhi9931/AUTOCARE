package car.controller;

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
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import car.entity.Register;
import car.service.CarService;

@org.springframework.stereotype.Controller
@SessionAttributes({"MyUser" , "MyRoles"})
public class Controller {
	
	@Autowired
	CarService carService;
	
	@ModelAttribute("MyUser")
	public Register createCustomer() {
		System.out.println("Controller -> createCustomer()");
		return new Register();
	}
	
	@GetMapping(value = {"/" , "/home"})
	public String showHome(Model model) {
		System.out.println("Controller -> showHome()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		return "BaseDef";
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
	
	@PostMapping("registerUser")
	public String registerUser(@ModelAttribute("myUser") Register customer, BindingResult bindingResult, Model model) {
		System.out.println("Controller -> registerUser()");
		carService.registerUser(customer);
		return "RegisterDef";
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
	
	@GetMapping("/register")
	public String showRegister(Model model) {
		System.out.println("Controller -> showRegister()");
		
		model.addAttribute("myUser", createCustomer());
		
		return "RegisterDef";
	}
	
	@GetMapping("/addCustomer")
	public String addCustomer(Model model) {
		System.out.println("Controller -> addCustomer()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		return "AddCustomerDef";
	}
	
	@GetMapping("/addStaff")
	public String addStaff(Model model) {
		System.out.println("Controller -> addStaff()");
		
		List<String> myroles = getUserRoles();
		System.out.println(myroles);
		model.addAttribute("MyRoles", myroles);
		
		return "AddStaffDef";
	}
	
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
		
		List<Register> usersList = carService.getAllUsers();
		model.addAttribute("MyUser", usersList);
		
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
