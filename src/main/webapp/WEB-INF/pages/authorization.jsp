
<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<html>
<body>
	<h1>权限显示页面</h1>	
<br/>
 &lt;shiro:guest&gt;:
<shiro:guest>
   
</shiro:guest>
<br/>
&lt;shiro:user&gt;:
<shiro:user>
	show tag
</shiro:user>
<br/>
&lt;shiro:authenticated&gt;:
<shiro:authenticated>
    show tage
</shiro:authenticated>
<br/>
&lt;shiro:notAuthenticated&gt;:
<shiro:notAuthenticated>
    show tage
</shiro:notAuthenticated>
<br/>
&lt;shiro:principal/&gt;:
<shiro:principal/>
<br/>
role-------------------------------------
<br/>
role:admin 
<shiro:hasRole name="admin">
  yes
</shiro:hasRole>
<br/>
role:user
<shiro:hasRole name="testRole">
   yes
</shiro:hasRole>
 <br/>
 
permission-------------------------------------
<br/>
user:create,edit
<shiro:hasPermission name="user:create,edit">
    yes
</shiro:hasPermission>
<br/>
user:create
<shiro:hasPermission name="user:create">
    yes
</shiro:hasPermission>
<br/>
user:edit
 <shiro:hasPermission name="user:edit">
    yes
</shiro:hasPermission>
<br/>
user:menu
<shiro:hasPermission name="user:menu">
    yes
</shiro:hasPermission>
<br/>
user:delete
<shiro:hasPermission name="user:delete">
    yes
</shiro:hasPermission>
<lacksPermission  name="user:delete">
   no
</lacksPermission >
 
</body>
</html>