<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<body>
<h2>Hello World!</h2>
<a href="welcome">welcome</a>
<form action="geshihua" method="post">
id:<input type="text" name="id"></input>
姓名：<input type="text" name="name"></input>
生日：<input type="text" name="birthday"></input>
<input type="submit" name="提交"></input>
</form>
<form action="zhuanhuanqi" method="post">
15-赵妍<input type="text" name="stuinfo"></input>
<input type="submit" name="提交"></input>
</form>
</form>
<form action="testUpload" method="post" enctype="multipart/form-data">
上传文件<input type="file" name="file"></input>
文件描述<input type="text" name="desc"></input>
<input type="submit" name="提交"></input>
</form>
</body>
</html>
