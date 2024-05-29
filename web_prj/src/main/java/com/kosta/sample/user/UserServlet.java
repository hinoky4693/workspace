package com.kosta.sample.user;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그아웃 처리
		HttpSession session = request.getSession();
		// 하나 하나 키를 사용해 지우기
//		session.removeAttribute("KEY_SESS_USERID");
//		session.removeAttribute("KEY_SESS_UNAME");
//		session.removeAttribute("KEY_SESS_GRADE");
		
		// 일괄로 다 지우기
		session.invalidate();
		// 세션 유효타임 : 0초 -> invalidate랑 같은효과
		session.setMaxInactiveInterval(0);
		
		response.sendRedirect("index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 페이지 구분을 위한 input type = hidden 값(P001 or P002)
		String pagecode = request.getParameter("pagecode");

		UserDAO dao = new UserDAO();
		
		//------------------- register ----------------------
		if(pagecode.equals("P001")) {
			String userid = request.getParameter("userid");
			String uname = request.getParameter("uname");
			String email = request.getParameter("email");
			String passwd = request.getParameter("passwd");

			UserVO uvo = new UserVO();
			
			uvo.setUserid(userid);
			uvo.setUname(uname);
			uvo.setEmail(email);
			uvo.setPasswd(passwd);

			System.out.println(uvo.toString()); 
			
			
			
			int insertRows = dao.userInsert(uvo);
			if(insertRows == 1) {
				// 회원가입 성공
				response.sendRedirect("index.jsp");
			} else {
				// 회원가입 실패
				response.sendRedirect("500.html");
			}
		
		
	
		
		//-------------------- login ------------------------
		} else if(pagecode.equals("P002")) {
			String userid = request.getParameter("userid");
			String passwd = request.getParameter("passwd");
			
			
			
			UserVO uvo = dao.userLogin(userid, passwd);
			if(uvo != null) {
//			if(uvo.isLoginCheck()) {	// 로그인 성공
				
				//session.add("MYKEY_GRADE", grade);
				System.out.println("--------- 세션 할당 ------------" + uvo.getGrade());
				HttpSession session = request.getSession();
				session.setAttribute("KEY_SESS_USERID", uvo.getUserid());
				session.setAttribute("KEY_SESS_UNAME", uvo.getUname());
				session.setAttribute("KEY_SESS_GRADE", uvo.getGrade());
				
				
				
				response.sendRedirect("index.jsp");
			} else {
				// 로그인 실패
				response.sendRedirect("500.html");
			}

		
		//--------------------  other  ----------------------
		} else { 
			response.sendRedirect("500.html");
		}
		
	}

}
