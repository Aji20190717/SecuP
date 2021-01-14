package com.security.practice;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private Biz biz;

	@RequestMapping(value = "main.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		return "loginMain";
	}

	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public String logout(HttpSession session, HttpServletRequest request) {

		session.invalidate();
		session = request.getSession(true);

		if (session.isNew()) {
			System.out.println("세션만료");
		} else {
			System.out.println("세션 살아있음");
		}

		return "mainpage";

	}

	@RequestMapping("/error.do")
	public String accessDeniedPage(Model model) throws Exception {
		
		model.addAttribute("msg", "로그인 오류입니다.");
		return "login_withdrawal";
	}

	@RequestMapping("/login.do")
	public String login(HttpSession session, Model model) {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		// System.out.println(auth.getName());

		String id = auth.getName();
		
		Dto dto = biz.login(id);

		if(id.equals("admin") || id.equals("user")) {
			session.setAttribute("dto", dto);
			return "loginMain";
		} else {
			String msg = "회원이 아닙니다.";
			model.addAttribute("msg", msg);
			return "login_withdrawal";
		}

	}
}
