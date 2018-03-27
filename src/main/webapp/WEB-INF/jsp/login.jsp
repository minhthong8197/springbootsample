<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<!DOCTYPE html>
<html lang="vi">

<head>
<meta charset="utf-8">

<title>Login</title>


<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>

<body>
	<div class="container-fluid">

		<!-- Header bar -->
		<div class="row">
			<div class="container-fluid" id="header">
				<div class="row center-block">
					<div class="col-md-9 col-sm-9 col-xs-12">
						<img src="img/logo.jpg" class="img-responsive"
							alt="Responsive image" id="logo">
					</div>
					<div class="col-md-3 col-sm-3 col-xs-12 center-block"
						id="searchBox">
						<form action="checklogin" class="form-inline" role="form">
							<input style="width: 100%" type="text" class="form-control"
								placeholder="Tìm kiếm"> <br /> <input
								style="width: 100%" type="submit"
								class="form-control btn-success" value="Tìm"> <a
								href="http://gtsd2018.hcmute.edu.vn">http://gtsd2018.hcmute.edu.vn</a>
						</form>
					</div>
				</div>
			</div>
			<!-- Menu bar -->
			<div class="container-fluid">
				<nav class="navbar navbar-inverse">
					<div class="container-fluid">
						<div class="navbar-header">
							<a class="navbar-brand" href="#">ICSSE</a>
						</div>
						<ul class="nav navbar-nav">
							<li class="active"><a href="#">Home</a></li>
							<li><a href="#"> <b>ABOUT</b>
							</a></li>
							<li><a href="#"> <b>KEYNOTE SPEAKER</b>
							</a></li>
							<li><a href="#"> <b>PROGRAM</b>
							</a></li>
							<li><a href="#"> <b>GALLERY</b>
							</a></li>
							<li><a href="#"> <b>CONTACT</b>
							</a></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="/managepost"> Manage</a></li>
							<li><a href="/newpost"> New post</a></li>
							<li><a> Log out</a></li>
							<li><a href="/login"> <span
									class="glyphicon glyphicon-user"></span> Login
							</a></li>
						</ul>
					</div>
				</nav>
			</div>
			<br />
			<!-- End Header-->
		</div>


		<!-- Content -->
		<div class="row">
			<div class="container-fluid" id="content">
				<!-- Left Collum -->
				<div class="col-md-9 col-sm-10 col-xs-12">
					<form action="/checklogin" method="GET">
						<div class="form-group">
							<label>Tên đăng nhập:</label>
							<input name="tendangnhap" type="text"
								placeholder="Nhập tài khoản" class="form-control" />
							<br /> <label>Mật khẩu:</label>
							<input name="matkhau" type="password"
								placeholder="Nhập tài khoản" class="form-control" />
							<br /> <input style="max-width: 100px" type="submit"
								value="Đăng nhập" class="form-contro btn btn-success">
						</div>
					</form>
				</div>

				<!-- Right Collum -->
				<div class="col-md-3 col-sm-2 col-xs-0" id="adv">
					<div class="container-fluid"
						style="background-color: cyan; padding: 5px; text-align: center;">
						<h4>DANH SÁCH TIN TỨC</h4>
					</div>
					<p>Load tên các bài viêt tại đây</p>
				</div>
			</div>
			<!-- End Content -->

			<br />
			<!--Footer -->
			<div class="row">
				<div class="container-fluid footer" id="footer">
					<p>4th International Conference on Green Technology and
						Sustainable Development</p>
					<p>HCMC University of Technology and Education</p>
					<p>Add: No 1 Vo Van Ngan Street, Linh Chieu Ward, Thu Duc
						District, Ho Chi Minh City</p>
					<p>Tel: (+84.8) 37 221 223 - Ext: 8161 or 8443</p>
					<p>E-mail: gtsd2018@hcmute.edu.vn</p>
				</div>
			</div>
		</div>
	</div>
</body>

</html>