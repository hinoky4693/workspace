/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-05-28 07:46:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lec_005frest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--  REST(Representational State Transfer) \r\n");
      out.write("		   : 웹 서비스를 위한 분산 시스템 아키텍처\r\n");
      out.write("		   - http 프로토콜 사용\r\n");
      out.write("		   - 데이터 포맷 : json/xml 주로 사용\r\n");
      out.write("		   - 개인정보 데이터 접근을 위해서는 토큰(OAuth2) 이용\r\n");
      out.write("		   - 서버(프로바이더)가 정한 규칙에 맞게 요청을 해야 응답을 받을 수 있다\r\n");
      out.write("		   ex) kakao  사용자 목록 가져오기\r\n");
      out.write("		       Get https://kapi.kakao.com/v1/user/ids\r\n");
      out.write("		       ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SERVICE_APP_ADMIN_KEY}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("		       Content-type: application/x-www-form-urlencoded;charset=utf-8\r\n");
      out.write("		        \r\n");
      out.write("      AJAX : 스크립트에서 비동기 통신을 위한 기술(jQuery 스크립트 라이브러리)\r\n");
      out.write("		   : JSON/XML/TEXT/... 데이터표기를 사용해 데이터 송수신\r\n");
      out.write("		   : https://api.jquery.com/jQuery.ajax/\r\n");
      out.write("		   \r\n");
      out.write("	  $.ajax( { settings } );	   \r\n");
      out.write("	  $.ajax({ \r\n");
      out.write("	        *method      : \"GET\",\r\n");
      out.write("	        *url         : \"/BoradServlet?pagecode=B001\",\r\n");
      out.write("	        *data 		 : { \"name\":\"kim\" , \"pw\":\"123\" },    JSON표기 내부적변환 name=kim&pw=123\r\n");
      out.write("	  		             : { \"name\": [\"kim\",\"hong\"]    }                     name=kim&name=hong\r\n");
      out.write("	  		             : \"name=kim&pw=123\"\r\n");
      out.write("	  		*error 	     : function(){   },\r\n");
      out.write("	  		*success     : function(){   },\r\n");
      out.write("	  		\r\n");
      out.write("	  		contentType : \"application/x-www-form-urlencoded; charset=UTF-8\"   ------ 보낼데이터 타입\r\n");
      out.write("	  		            : \"application/json; charset=UTF-8\"\r\n");
      out.write("	  		dataType    : (xml, json, script, or html, text),                  ------ 서버로부터온 응답데이터 타입\r\n");
      out.write("	  		\r\n");
      out.write("	  		beforeSend 	: function(){   },\r\n");
      out.write("	  		complete 	: function(){   },\r\n");
      out.write("	  		crossDomain : false,\r\n");
      out.write("	  		headers     : {k:v},\r\n");
      out.write("	  });\r\n");
      out.write("		   \r\n");
      out.write("-->\r\n");
      out.write("<!--  ##################### 서버로 부터의 응답 String #######################  -->\r\n");
      out.write("<h2>초간단 AJAX <font color=red>(F12필수)</font></h2>\r\n");
      out.write("<form id=\"Str_Str_Form\" >\r\n");
      out.write("<input id=\"searchGubun\" type=hidden name=\"searchGubun\" value=\"\">\r\n");
      out.write("<input id=\"searchStr\"   type=\"text\" name=\"searchStr\">\r\n");
      out.write("<input type=\"button\" id=\"AjaxBtn\" value=\"초간단AJAX전송\">\r\n");
      out.write("</form>\r\n");
      out.write("<hr>\r\n");
      out.write("<div id=\"resultDIV\"></div>\r\n");
      out.write("\r\n");
      out.write("<!--  ##################### 서버로 부터의 응답 String #######################  -->\r\n");
      out.write("<h2>서버로 부터의 응답 String <font color=red>(F12필수)</font></h2>\r\n");
      out.write("<form id=\"Str_Str_Form1\">\r\n");
      out.write("<select name=\"searchGubun\">\r\n");
      out.write("	<option value=\"title\">제목</option>\r\n");
      out.write("	<option value=\"contents\">내용</option>\r\n");
      out.write("	<option value=\"regid\">글쓴이</option>\r\n");
      out.write("</select>\r\n");
      out.write("<input type=\"text\" name=\"searchStr\">\r\n");
      out.write("<input type=\"button\" id=\"1__Str_Str_Btn\" value=\"1.Str-Str\">\r\n");
      out.write("</form>\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<form id=\"JsonStr_Str_Form\" action=\"/RestServlet\" method=\"get\">\r\n");
      out.write("<select name=\"searchGubun\">\r\n");
      out.write("	<option value=\"title\">제목</option>\r\n");
      out.write("	<option value=\"contents\">내용</option>\r\n");
      out.write("	<option value=\"regid\">글쓴이</option>\r\n");
      out.write("</select>\r\n");
      out.write("<input type=\"text\" name=\"searchStr\">\r\n");
      out.write("<input type=\"button\" id=\"2__JsonStr_Str_Btn\"  value=\"2.JsonStr-Str\">\r\n");
      out.write("</form>\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<form id=\"Json_Str_Form\" action=\"/RestServlet\" method=\"get\">\r\n");
      out.write("<select name=\"searchGubun\">\r\n");
      out.write("	<option value=\"title\">제목</option>\r\n");
      out.write("	<option value=\"contents\">내용</option>\r\n");
      out.write("	<option value=\"regid\">글쓴이</option>\r\n");
      out.write("</select>\r\n");
      out.write("<input type=\"text\" name=\"searchStr\">\r\n");
      out.write("<input type=\"button\" id=\"3__Json_Str_Btn\"  value=\"3.Json-Str\">\r\n");
      out.write("</form>\r\n");
      out.write("<hr><br><br>\r\n");
      out.write("\r\n");
      out.write("<!--  ##################### 서버로 부터의 응답 JSON #######################  -->\r\n");
      out.write("<h2>서버로 부터의 응답 JSON <font color=red>(F12필수)</font></h2>\r\n");
      out.write("<form id=\"Str_Json_Form\" >\r\n");
      out.write("<select name=\"searchGubun\">\r\n");
      out.write("	<option value=\"title\">제목</option>\r\n");
      out.write("	<option value=\"contents\">내용</option>\r\n");
      out.write("	<option value=\"regid\">글쓴이</option>\r\n");
      out.write("</select>\r\n");
      out.write("<input type=\"text\" name=\"searchStr\">\r\n");
      out.write("<input type=\"button\" id=\"4__Str_Json_Btn\"  value=\"1.Str-JSON\">\r\n");
      out.write("</form>\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<form id=\"JsonStr_Json_Form\" action=\"/RestServlet\" method=\"get\">\r\n");
      out.write("<select name=\"searchGubun\">\r\n");
      out.write("	<option value=\"title\">제목</option>\r\n");
      out.write("	<option value=\"contents\">내용</option>\r\n");
      out.write("	<option value=\"regid\">글쓴이</option>\r\n");
      out.write("</select>\r\n");
      out.write("<input type=\"text\" name=\"searchStr\">\r\n");
      out.write("<input type=\"button\" id=\"5__JsonStr_Json_Btn\"  value=\"2.JsonStr-JSON\">\r\n");
      out.write("</form>\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<form id=\"Json_Json_Form\" action=\"/RestServlet\" method=\"get\">\r\n");
      out.write("<select name=\"searchGubun\">\r\n");
      out.write("	<option value=\"title\">제목</option>\r\n");
      out.write("	<option value=\"contents\">내용</option>\r\n");
      out.write("	<option value=\"regid\">글쓴이</option>\r\n");
      out.write("</select>\r\n");
      out.write("<input type=\"text\" name=\"searchStr\">\r\n");
      out.write("<input type=\"button\" id=\"6__Json_Json_Btn\"   value=\"3.Json-JSON\">\r\n");
      out.write("</form>\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.1.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	//$(function() {    });\r\n");
      out.write("	\r\n");
      out.write("	$(\"#AjaxBtn\").click(  function(){\r\n");
      out.write("		//alert(\"초간단AJAX\");\r\n");
      out.write("		var sg = $(\"#searchGubun\").val();\r\n");
      out.write("		var ss = $(\"#searchStr\").val();\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			method      : \"GET\",\r\n");
      out.write("	        url         : \"");
      out.print(request.getContextPath());
      out.write("/RestServlet?pagecode=R001\",\r\n");
      out.write("	        data 		: \"searchGubun=\"+sg+\"&searchStr=\"+ss ,\r\n");
      out.write("	  		error 	    : function(myval){ console.log(\"에러:\" + myval);   },\r\n");
      out.write("	  		success     : function(myval){ \r\n");
      out.write("	  										console.log(\"성공:\" + myval);   \r\n");
      out.write("	  										$(\"#resultDIV\").html(\"<b>\"+myval+\"</b>\")\r\n");
      out.write("	  									 }\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("	$(\"#1__Str_Str_Btn\").click(  function(){\r\n");
      out.write("		//alert(\"1\");\r\n");
      out.write("		var sendFormData = $(\"#Str_Str_Form1\").serialize();  //searchGubun=contents&searchStr=11111\r\n");
      out.write("		console.log(sendFormData);\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			method      : \"GET\",\r\n");
      out.write("	        url         : \"");
      out.print(request.getContextPath());
      out.write("/RestServlet?pagecode=R001\",\r\n");
      out.write("	        data 		: sendFormData ,   //searchGubun=contents&searchStr=11111\r\n");
      out.write("	  		error 	    : function(myval){  console.log(\"에러:\" + myval);   },\r\n");
      out.write("	  		success     : function(myval){ \r\n");
      out.write("	  										//JSON모양의 글자가 들어옴\r\n");
      out.write("	  										console.log(\"성공:\" + myval);\r\n");
      out.write("	  										\r\n");
      out.write("	  										//obj = JSON.parse(str);\r\n");
      out.write("	  										//JSON모양의 글자를 객체 JSON으로 변환\r\n");
      out.write("	  										var myval_obj = JSON.parse(myval);\r\n");
      out.write("	  										console.log(\"성공변환:\" + myval_obj);\r\n");
      out.write("	  										console.log(\"성공변환:\" + myval_obj[0][\"regid\"]);\r\n");
      out.write("	  			 							\r\n");
      out.write("	  										\r\n");
      out.write("	  										//https://api.jquery.com/jQuery.map/\r\n");
      out.write("	  										//[{\"seq\":0,\"title\":\"aaa\",\"regid\":\"kim\"},{\"seq\":0,\"title\":\"bbb\",\"regid\":\"hong\"}]\r\n");
      out.write("	  										var htmlStr = \"<table border=1 width=50%><tr><th>제목</th><th>글쓴이</th></tr>\";\r\n");
      out.write("	  										$.map( myval_obj, function( MYval, MYidx ) {\r\n");
      out.write("	  											htmlStr += \"<tr><td>\" +MYval[\"title\"] + \"</td><td>\"+MYval[\"regid\"] +\"</td></tr>\"\r\n");
      out.write("	  											//console.log(MYval[\"title\"] + \",\" + MYval[\"regid\"] + \",\" + MYidx);\r\n");
      out.write("											});\r\n");
      out.write("	  										htmlStr += \"</table>\";\r\n");
      out.write("	  										$(\"#resultDIV\").empty();\r\n");
      out.write("	  										$(\"#resultDIV\").html(\"1. <b>\"+htmlStr+\"</b>\");\r\n");
      out.write("	  									 }\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	$(\"#2__JsonStr_Str_Btn\").click(  function(){\r\n");
      out.write("		var objData = {\"name\":\"kim\",\"pw\":\"123\"};\r\n");
      out.write("		console.log(objData);\r\n");
      out.write("		\r\n");
      out.write("		var strData  = JSON.stringify(objData)\r\n");
      out.write("		console.log(strData);\r\n");
      out.write("		\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			method      : \"POST\",\r\n");
      out.write("	        url         : \"");
      out.print(request.getContextPath());
      out.write("/RestServlet?pagecode=R002\",\r\n");
      out.write("	        contentType : \"application/x-www-form-urlencoded; charset=UTF-8\",\r\n");
      out.write("	        data 		: \"MY_JSONKEY=\" + JSON.stringify(objData) ,   \r\n");
      out.write("	  		error 	    : function(myval){ console.log(\"에러:\" + myval);   },\r\n");
      out.write("	  		success     : function(myval){ console.log(\"성공:\" + myval);    }\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	$(\"#3__Json_Str_Btn\").click(  function(){\r\n");
      out.write("		var objData = {\"title\":\"aaaaatitle\",\"regid\":\"hong\"};\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			method      : \"POST\",\r\n");
      out.write("	        url         : \"");
      out.print(request.getContextPath());
      out.write("/RestServlet?pagecode=R003\",\r\n");
      out.write("	        contentType : \"application/json; charset=UTF-8\",\r\n");
      out.write("	        data 		: JSON.stringify(objData),   \r\n");
      out.write("	  		error 	    : function(myval){ console.log(\"에러:\" + myval);   },\r\n");
      out.write("	  		success     : function(myval){ console.log(\"성공:\" + myval);    }\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	$(\"#4__Str_Json_Btn\").click(  function(){\r\n");
      out.write("		var sendFormData = $(\"#Str_Json_Form\").serialize();  //searchGubun=contents&searchStr=11111\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			method      : \"POST\",\r\n");
      out.write("	        url         : \"");
      out.print(request.getContextPath());
      out.write("/RestServlet?pagecode=R004\",\r\n");
      out.write("	        data 		: sendFormData,   \r\n");
      out.write("	        dataType    : \"json\",    //생략가능\r\n");
      out.write("	  		error 	    : function(myval){ console.log(\"에러:\" + myval);   },\r\n");
      out.write("	  		success     : function(myval){ //{\"status\":\"200\", \"message\":\"R004 응답 ok\"}\r\n");
      out.write("	  									  console.log(\"성공:\" + myval);   \r\n");
      out.write("	  									  console.log(myval['status'] + \",\" + myval['message']);   \r\n");
      out.write("	  									 }\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("	$(\"#5__JsonStr_Json_Btn\").click(  function(){\r\n");
      out.write("		var objData = {\"name\":\"kim\",\"pw\":\"123\"};\r\n");
      out.write("		console.log(objData);\r\n");
      out.write("		\r\n");
      out.write("		var strData  = JSON.stringify(objData)\r\n");
      out.write("		console.log(strData);\r\n");
      out.write("		\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			method      : \"POST\",\r\n");
      out.write("	        url         : \"");
      out.print(request.getContextPath());
      out.write("/RestServlet?pagecode=R005\",\r\n");
      out.write("	        contentType : \"application/x-www-form-urlencoded; charset=UTF-8\",\r\n");
      out.write("	        data 		: \"MY_JSONKEY=\" + JSON.stringify(objData) ,   \r\n");
      out.write("	        dataType    : \"json\",    //생략가능\r\n");
      out.write("	  		error 	    : function(myval){ console.log(\"에러:\" + myval);   },\r\n");
      out.write("	  		success     : function(myval){ //{\"status\":\"200\", \"message\":\"R004 응답 ok\"}\r\n");
      out.write("	  									  console.log(\"성공:\" + myval);   \r\n");
      out.write("	  									  console.log(myval['status'] + \",\" + myval['message']);   \r\n");
      out.write("	  									 }\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	$(\"#6__Json_Json_Btn\").click(  function(){\r\n");
      out.write("		var objData = {\"title\":\"aaaaatitle\",\"regid\":\"hong\"};\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			method      : \"POST\",\r\n");
      out.write("	        url         : \"");
      out.print(request.getContextPath());
      out.write("/RestServlet?pagecode=R006\",\r\n");
      out.write("	        contentType : \"application/json; charset=UTF-8\",\r\n");
      out.write("	        data 		: JSON.stringify(objData),   \r\n");
      out.write("	        dataType    : \"json\",    //생략가능\r\n");
      out.write("	  		error 	    : function(myval){ console.log(\"에러:\" + myval);   },\r\n");
      out.write("	  		success     : function(myval){ //{\"status\":\"200\", \"message\":\"R004 응답 ok\"}\r\n");
      out.write("	  									  console.log(\"성공:\" + myval);   \r\n");
      out.write("	  									  console.log(myval['status'] + \",\" + myval['message']);   \r\n");
      out.write("	  									 }\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
