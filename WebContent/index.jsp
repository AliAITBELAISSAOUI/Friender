<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <LINK href="<%=path %>/css/css.css" type=text/css rel=stylesheet>
    <script type="text/javascript" src="<%=path %>/js/popup_shuaxin.js"></script>
    
    <script type="text/javascript">
       function userEditPre()
       {
            var url="<%=path %>/qiantai/gerenzhuye/userEditPre.jsp";
            var pop=new Popup({ contentType:1,isReloadOnClose:false,width:500,height:460});
            pop.setContent("contentUrl",url);
            pop.setContent("title","管理个人资料");
            pop.build();
            pop.show();
       }
       
       function bowenAdd()
       {
            var url="<%=path %>/qiantai/gerenzhuye/bowen/bowenAdd.jsp";
            var pop=new Popup({ contentType:1,isReloadOnClose:false,width:700,height:400});
            pop.setContent("contentUrl",url);
            pop.setContent("title","发日志");
            pop.build();
            pop.show();
       }
       function bowenDel(id)
       {
            var url="<%=path %>/bowenDel.action?id="+id;
            var pop=new Popup({ contentType:1,isReloadOnClose:false,width:240,height:90});
            pop.setContent("contentUrl",url);
            pop.setContent("title","日志删除");
            pop.build();
            pop.show();
       }
       
       function pinglunMana(bowenId)
       {
            var url="<%=path %>/pinglunMana.action?bowenId="+bowenId;
            var pop=new Popup({ contentType:1,isReloadOnClose:false,width:650,height:450});
            pop.setContent("contentUrl",url);
            pop.setContent("title","评论管理");
            pop.build();
            pop.show();
       }
    </script>
    
  </head>
  
  <BODY text=#000000  leftMargin=0 topMargin=0>
	<div class="wrap"> 
		<TABLE  cellSpacing=0 cellPadding=0 width="100%" align=center border=0  background="<%=path %>/img/reservation01.gif">
				<TR height="90">
					<TD align="center" style="color: white">
					    <br/><font size="13px;">${sessionScope.user.userRealname }的主页</font> 
					</TD>
				</TR>
		</TABLE>
		
		
		<TABLE id=guide cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
				<TR>
					<TD align="left">
						&nbsp;&nbsp;
						 <a href="<%=path %>/hydt.action">my page</A> &nbsp;&nbsp;&nbsp; 
				        <a href="<%=path %>/bowenMana.action">my tweets</A> &nbsp;&nbsp;&nbsp; 
				        <a href="<%=path %>/xiangceMana.action">my photos</A>  &nbsp;&nbsp; &nbsp;
				        <!-- a href="<%=path %>/rizhiMana.action">my tweets</A &nbsp;&nbsp;-->
				        <a href="<%=path %>/haoyouMana.action">my friends</A> &nbsp;&nbsp; &nbsp;
				         <a href="<%=path %>/mySixin.action">my message</A> &nbsp;&nbsp;&nbsp;&nbsp; 
				        <a href="<%=path %>/userLogout.action">signout</A> &nbsp;&nbsp;
					</TD>
				</TR>
		</TABLE>

        <TABLE class=MainTable style="MARGIN-TOP: 0px" cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
				<TR>
				    <TD class=Side vAlign=top align=right width="25%">
						 <TABLE width="100%" height="160" border=0 cellPadding=0 cellSpacing=0 class=dragTable>
								<TR>
									<TD class=head>&nbsp; 
										<span style="float:left" class="TAG">My data</span><span style="float:right"><a href="#" onclick="userEditPre()">[modify]</a>&nbsp;&nbsp;&nbsp;&nbsp;</span>
									</TD>
								</TR>
								<TR>
									<TD class=middle align="center">
									     <table>
									         <tr>
									            <td align="center">
									                <img src="<%=path %>/${sessionScope.user.fujian }" width="140" height="170">
									            </td>
									         </tr>
									         <tr>
									            <td align="left" style="font-size: 14px;">
									               <br>
									                 nickname：${sessionScope.user.userRealname }<br>
									                 address：${sessionScope.user.userAddress }<br> 
									                 school：${sessionScope.user.school }<br>
									                 sex：${sessionScope.user.userSex }<br>
									            </td>
									         </tr>
									     </table>
									</TD>
								</TR>
						</TABLE><br></TD>
					<td width="1">&nbsp;</td>
					<TD class=Side vAlign=top align=right width="75%">
						<TABLE class=dragTable cellSpacing=0 cellPadding=0 width="100%" border=0>
								<TR>
									<TD class=head>
										<span style="float:left" class="TAG">Friends tweets</span>
							           
									</TD>
								</TR>
								<TR align="left">
									<TD height="5"></TD>
								</TR>
								<TR align="left" height="620">
									<TD>
									    <c:forEach items="${requestScope.bowenList}" var="bowen" varStatus="ss">
											<TABLE cellpadding="12" cellspacing="12">
												<TR>
													<td>
													  <font style="font-size: 17px;font-family: 幼圆">${ss.index+1 }.${Tweets.title }</font>&nbsp;&nbsp;(${Tweets.affairs}) 
													   &nbsp;&nbsp;&nbsp;<a target="_blank" href="<%=path %>/tarenzhuye.action?userId=${bowen.userId }">${Tweets.name }</a>
													</td>
												</TR>
												<TR>
													<td><c:out value="${bowen.content }" escapeXml="false"></c:out></td>
												</TR>
												<tr>
												   <td>
												       <a href="#" onclick="pinglunMana(${bowen.id })">comments(${Tweets.numbers })</a>
												   </td>
												</tr>
												<tr>
												   <td>
												       <hr style="BORDER-BOTTOM-STYLE: dotted; BORDER-LEFT-STYLE: dotted; BORDER-RIGHT-STYLE: dotted; BORDER-TOP-STYLE: dotted" color=blue size=1 width="500">
												   </td>
												</tr>
											</TABLE>
										</c:forEach>
									</TD>
								</TR>
								<TR align="left">
									<TD height="5"></TD>
								</TR>
						</TABLE>
					</TD>
				</TR>
		</TABLE><br></div>
  </BODY>
</html>
