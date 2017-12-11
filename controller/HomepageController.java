package com.textile_app.controller;


	import org.springframework.stereotype.Controller;

	import org.springframework.web.bind.annotation.RequestMapping;

	@Controller("homepageconttroller")

	 class HomepageController {

	@RequestMapping(value="register")
	public String register()  
	{
		System.out.println("register");
		return "register";
	}


			@RequestMapping(value="about")
			public String aboutus ()  
			{
				System.out.println("about");
				return "about";
			}

		
			@RequestMapping(value="brands")
			public String brands()  
			{
				System.out.println("brands");
				return "brands";
			}


		@RequestMapping(value="contact")
		public String contact()  
		{
			System.out.println("contact");
			return "contact";
		}


			@RequestMapping(value="login")
			public String login()  
			{
				System.out.println("login");
				return "login";
			}
			
			@RequestMapping(value="Product")
			public String addproduct()  
			{
				System.out.println("Product");
				return "Product";
			}
			}

