<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- taglib 지시어  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="skwyverns_list.css">
<script type="text/javascript" src="skwyverns_list.js"></script>
<title>자유게시판</title>
</head>
<body>
<header id="main_header">
    	<nav id="main_gnb">
         	<ul>
            	<li><a href="#">로그인</a></li>
                <li><a href="#">회원가입</a></li>
                <li><a href="http://www.ticketlink.co.kr/sports/baseball/56#reservation">장애인예매</a></li>
                <li><a href="#">english</a></li>
                <li><a href="#">검색어입력</a></li>
            </ul>
         </nav>
    <nav id="main_logo">
    <ul>
    <li><a href="main.html"> <img src="../img/logo_wyverns.png"></a></li>
	</ul>
	</nav>
<div id="main_lnb">
    <ul>
	<li class = "menu">
		<a class="under" href="sub_02.html">소개</a>
        <div class="article">
          <a href="sub_02.html">SK Wyverns 역사</a>
          <a href="#">엠블럼</a>
          <a href="#">응원단</a>
          <a href="#">후원사</a>
          </div>
        </li>
        <li class = "menu">
		<a class="under" href="sub_03.html">경기정보</a>
        <div class="article">
          <a href="sub_03.html">경기일정</a>
          <a href="sub_05.html">경기결과</a>
          </div>
        </li>
        <li class = "menu">
		<a href="#">기록실</a>
        </li>
        <li class = "menu">
		<a class="under" href="#">선수단</a>
        <div class="article">
          <a href="#">투수</a>
          <a href="#">포수</a>
          <a href="#">내야수</a>
          <a href="#">외야수</a>
          </div>
        </li>
        <li class = "menu">
		<a href="#">이벤트</a>
        </li>
        <li class = "menu">
		<a class="under" href="sub_01.html">팬</a>
        <div class="article">
          <a href="skwyverns_list.jsp">자유게시판</a>
          <a href="#">To.SKwyverns</a>
          <a href="#">From.SKwyverns</a>
          <a href="../skwyverns_qa/skwyverns_Q&A_list.jsp">Q & A</a>
          </div>
        </li>
        <li class = "menu">
		<a href="https://www.youtube.com/user/Wyvernsstory">미디어</a>
        </li>
        <li class = "menu">
		<a href="http://www.ticketlink.co.kr/sports/baseball/56#reservation">티켓</a>
        </li>
	</ul>
    </div>
    </header>
    	<div id="content">
    	<section id="main_section">
        	<article class="main_article">
        	  <h1>자유게시판 </h1>
        	  <hr style="height: 2px; background-color: #cf232e"><br>
		<form name="form1" method="post" action="SkwyvernsController">
		<input type="hidden" name="action" value="list">
		<input type="hidden" name="id" value=0>
		<div class="search">	
			<input type="text" class="search_text" align="left " name="searchName" value=${skwyvernsDTO.searchName}>
    		<input type="button" class="button" id="list" align=right value="조회" onClick="retrivalcheck()">
		</div>
		
		<table class="list_table">
			<tr>
				<th>ID</th>
				<th>제목</th>
				<th>작성자</th>
			</tr>
			<% int count = 1; %>
			<c:forEach var="i" items="${skwyvernsList}">
				<tr>
					<td><a href="javascript:editcheck(${i.id})"><%=count %></a></td>
					<td>${i.title}</td>
					<td>${i.name}</td>
				</tr>
			<% count++; %>
			</c:forEach>			
			
		</table>
	</form>
         	<div class="botton">
 			<input type="button" class="button" align=right value="글쓰기" onClick="addcheck()">
          	</div>
            </article>
         </section>
         
         	<aside id="main_aside">
            <h3>팬</h3><hr><br>
				<small><a href="skwyverns_list.jsp">자유게시판</a></small><br><hr><br>
				<small><a href="#">To.SKwyverns</a></small><br><hr><br>
				<small><a href="#">From.SKwyverns</a></small><br><hr><br>
				<small><a href="../skwyverns_qa/skwyverns_Q&A_list.jsp">Q & A</a></small><br><hr><br>
            </aside>
    </div>
<footer id="main_footer">
    <h6>| 개인정보 처리방침 | 이용약관 | 이메일주소무단수집거부 | 개인정보 수집 및 이용 |</h6>
    <address> (22234) 인천광역시 남구 매소홀로 618(문학동), 주경기장 2층</address>
    </footer>
</body>
</html>