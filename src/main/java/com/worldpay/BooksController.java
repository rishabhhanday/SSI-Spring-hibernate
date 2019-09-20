package com.worldpay;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BooksController {

	@RequestMapping("searchbooks")
	public ModelAndView allBooks(@ModelAttribute("books") BooksModel model) {
	
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Criteria cr = session.createCriteria(BooksModel.class);
		List<BooksModel> books = cr.list();
		ModelAndView mv = new ModelAndView("allbooks.jsp");
		mv.addObject("books", books);
		return mv;
	}

	@RequestMapping("insertbooks")
	public ModelAndView insertBooks(@ModelAttribute("info") BooksModel model) {

		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tr = session.beginTransaction();

		System.out.println(model.getbName());
		session.save(model);
		tr.commit();
		session.close();
		ModelAndView mv = new ModelAndView("redirect:searchbooks");
		return mv;

	}

	@RequestMapping("deletebooks")
	public void delete(@ModelAttribute("info") BooksModel model) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		session.delete(model);
		session.close();
	}

}
