<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	    <base target="_self"/>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />
		<script type="text/javascript" src="<%=path %>/js/popup_shuaxin_no.js"></script>
		<script language="javascript">
            function up()
		    {
		        var pop=new Popup({ contentType:1,isReloadOnClose:false,width:400,height:200});
	            pop.setContent("contentUrl","<%=path %>/upload/upload.jsp");
	            pop.setContent("title","文件上传");
	            pop.build();
	            pop.show();
		    }
		    function check1()
		    {
		        if(document.form1.userName.value=="")
		        {
		            alert("请输入账号");
		            return false;
		        }
		        if(document.form1.userPw.value=="")
		        {
		            alert("请输入密码");
		            return false;
		        }
		        document.form1.submit();
		    }
        </script>
	</head>
	<body>
			<form action="<%=path %>/userEdit.action" name="form1" method="post">
				<table width="98%" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#CCCCCC">
					<tr>
						<td width="20%" height="30" align="right" bgcolor="#F9F9F9" style="font-size: 11px;">
							account：
						</td>
						<td width="80%" bgcolor="#FFFFFF">
							&nbsp;
							<input type="text" name="userName" id="userName" readonly="readonly" value="${sessionScope.user.userName }"/>
						</td>
					</tr>
					<tr>
						<td height="30" align="right" bgcolor="#F9F9F9" style="font-size: 11px;">
							passwords：
						</td>
						<td bgcolor="#FFFFFF">
							&nbsp;
							<input type="password" name="userPw" value="${sessionScope.user.userPw }"/>
						</td>
					</tr>
					<tr>
						<td height="30" align="right" bgcolor="#F9F9F9" style="font-size: 11px;">
							nickname：
						</td>
						<td bgcolor="#FFFFFF">
							&nbsp;
							<input type="text" name="userRealname" value="${sessionScope.user.userRealname }"/>
						</td>
					</tr>
					<tr>
						<td height="30" align="right" bgcolor="#F9F9F9" style="font-size: 11px;">
							address：
						</td>
						<td bgcolor="#FFFFFF">
							&nbsp;
							<input type="text" name="userAddress" value="${sessionScope.user.userAddress }"/>
						</td>
					</tr>
					<tr>
						<td height="30" align="right" bgcolor="#F9F9F9" style="font-size: 11px;">
							sex：
						</td>
						<td bgcolor="#FFFFFF">
								<select name="userSex"  id="userSex" class="inputbox">
							<option <c:if test="${sessionScope.user.userSex=='male'}">selected</c:if>  value="male">male</option>
							<option <c:if test="${sessionScope.user.userSex=='female'}">selected</c:if>  value="female">female</option>
						</select>

						</td>
					</tr>
					
					<tr>
						<td height="30" align="right" bgcolor="#F9F9F9" style="font-size: 11px;">
							school：
						</td>
						<td bgcolor="#FFFFFF">
							&nbsp;
							<select name="school"  id="school" class="inputbox">
							<option <c:if test="${sessionScope.user.school=='xxxx'}">selected</c:if> value="xxxx">xxxx</option>
							<option <c:if test="${sessionScope.user.school=='zzzz'}">selected</c:if> value="zzzz">zzzz</option>
							<option <c:if test="${sessionScope.user.school=='cccc'}">selected</c:if> value="cccc">cccc</option>
							<option <c:if test="${sessionScope.user.school=='vvvv'}">selected</c:if> value="vvvv">vvvv</option>
							<option <c:if test="${sessionScope.user.school=='bbbb'}">selected</c:if> value="bbbb">bbbb</option>
							<option <c:if test="${sessionScope.user.school=='nnnn'}">selected</c:if> value="nnnn">nnnn</option>
						</select>
						</td>
					</tr>
					
					
					<tr>
						<td height="30" align="right" bgcolor="#F9F9F9" style="font-size: 11px;"> 
							phone number： 
						</td>
						<td bgcolor="#FFFFFF">
							&nbsp;
							<input type="text" name="userTel" value="${sessionScope.user.userTel }"/>
						</td>
					</tr>
					<tr>
						<td height="30" align="right" bgcolor="#F9F9F9" style="font-size: 11px;">
							E-mail：
						</td>
						<td bgcolor="#FFFFFF">
							&nbsp;
							<input type="text" name="userEmail" value="${sessionScope.user.userEmail }"/>
						</td>
					</tr>
					
					<tr>
						<td height="30" align="right" bgcolor="#F9F9F9" style="font-size: 11px;">
							portrait：
						</td>
						<td bgcolor="#FFFFFF">
							&nbsp;
							<input type="text" name="portrait" id="portrait" size="30" readonly="readonly" value="${sessionScope.user.portrait }"/>
						    <input type="button" value="upload" onclick="up()"/>
						    <input type="hidden" name="fujianYuanshiming" id="fujianYuanshiming"/>
						</td>
					</tr>
					<tr>
						<td height="30" align="right" bgcolor="#F9F9F9">
							&nbsp;
						</td>
						<td bgcolor="#FFFFFF">
							&nbsp;
							<input type="submit" value="ok"/>
						</td>
					</tr>
				</table>
			</form>
	</body>
</html>
