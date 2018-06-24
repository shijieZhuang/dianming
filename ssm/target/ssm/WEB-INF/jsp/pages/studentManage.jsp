<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String CON_CONTEXT_PATH = request.getContextPath();
%>
<script>
    var CONTEXT_PATH = "<%=CON_CONTEXT_PATH%>";
</script>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>DASHGUM - Bootstrap Admin Template</title>

    <!-- Bootstrap core CSS -->
    <link href="../../../resources/assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="../../../resources/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        
    <!-- Custom styles for this template -->
    <link href="../../../resources/assets/css/style.css" rel="stylesheet">
    <link href="../../../resources/assets/css/style-responsive.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

  <section id="container" >
      <!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
      <!--header start-->
      <header class="header black-bg">
              <div class="sidebar-toggle-box">
                  <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
              </div>
            <!--logo start-->
            <a href="index.jsp" class="logo"><b>DASHGUM FREE</b></a>
            <!--logo end-->
            <div class="nav notify-row" id="top_menu">
                <!--  notification start -->
                <ul class="nav top-menu">
                    <!-- settings start -->
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="index.jsp#">
                            <i class="fa fa-tasks"></i>
                            <span class="badge bg-theme">4</span>
                        </a>
                        <ul class="dropdown-menu extended tasks-bar">
                            <div class="notify-arrow notify-arrow-green"></div>
                            <li>
                                <p class="green">You have 4 pending tasks</p>
                            </li>
                            <li>
                                <a href="index.jsp#">
                                    <div class="task-info">
                                        <div class="desc">DashGum Admin Panel</div>
                                        <div class="percent">40%</div>
                                    </div>
                                    <div class="progress progress-striped">
                                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                            <span class="sr-only">40% Complete (success)</span>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="index.jsp#">
                                    <div class="task-info">
                                        <div class="desc">Database Update</div>
                                        <div class="percent">60%</div>
                                    </div>
                                    <div class="progress progress-striped">
                                        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                            <span class="sr-only">60% Complete (warning)</span>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="index.jsp#">
                                    <div class="task-info">
                                        <div class="desc">Product Development</div>
                                        <div class="percent">80%</div>
                                    </div>
                                    <div class="progress progress-striped">
                                        <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                            <span class="sr-only">80% Complete</span>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="index.jsp#">
                                    <div class="task-info">
                                        <div class="desc">Payments Sent</div>
                                        <div class="percent">70%</div>
                                    </div>
                                    <div class="progress progress-striped">
                                        <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%">
                                            <span class="sr-only">70% Complete (Important)</span>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="external">
                                <a href="#">See All Tasks</a>
                            </li>
                        </ul>
                    </li>
                    <!-- settings end -->
                    <!-- inbox dropdown start-->
                    <li id="header_inbox_bar" class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="index.jsp#">
                            <i class="fa fa-envelope-o"></i>
                            <span class="badge bg-theme">5</span>
                        </a>
                        <ul class="dropdown-menu extended inbox">
                            <div class="notify-arrow notify-arrow-green"></div>
                            <li>
                                <p class="green">You have 5 new messages</p>
                            </li>
                            <li>
                                <a href="index.jsp#">
                                    <span class="photo"><img alt="avatar" src="../../../resources/assets/img/ui-zac.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Zac Snider</span>
                                    <span class="time">Just now</span>
                                    </span>
                                    <span class="message">
                                        Hi mate, how is everything?
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="index.jsp#">
                                    <span class="photo"><img alt="avatar" src="../../../resources/assets/img/ui-divya.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Divya Manian</span>
                                    <span class="time">40 mins.</span>
                                    </span>
                                    <span class="message">
                                     Hi, I need your help with this.
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="index.jsp#">
                                    <span class="photo"><img alt="avatar" src="../../../resources/assets/img/ui-danro.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Dan Rogers</span>
                                    <span class="time">2 hrs.</span>
                                    </span>
                                    <span class="message">
                                        Love your new Dashboard.
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="index.jsp#">
                                    <span class="photo"><img alt="avatar" src="../../../resources/assets/img/ui-sherman.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Dj Sherman</span>
                                    <span class="time">4 hrs.</span>
                                    </span>
                                    <span class="message">
                                        Please, answer asap.
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="index.jsp#">See all messages</a>
                            </li>
                        </ul>
                    </li>
                    <!-- inbox dropdown end -->
                </ul>
                <!--  notification end -->
            </div>
            <div class="top-menu">
            	<ul class="nav pull-right top-menu">
                    <li><a class="logout" href="login.html">Logout</a></li>
            	</ul>
            </div>
        </header>
      <!--header end-->
      
      <!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
      <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu" id="nav-accordion">

                  <p class="centered"><a href="profile.html"><img src="../../../resources/assets/img/ui-sam.jpg" class="img-circle" width="60"></a></p>
                  <h5 class="centered">Marcel Newman</h5>

                  <li class="mt">
                      <a class="active">
                          <i class="fa fa-dashboard"></i>
                          <span>主页</span>
                      </a>
                  </li>
                  <%--
                                    <li class="sub-menu">
                                        <a href="javascript:;" >
                                            <i class="fa fa-desktop"></i>
                                            <span>UI Elements</span>
                                        </a>
                                        <ul class="sub">
                                            <li><a  href="general">General</a></li>
                                            <li><a  href="buttons">Buttons</a></li>
                                            <li><a  href="panels">Panels</a></li>
                                        </ul>
                                    </li>

                                    <li class="sub-menu">
                                        <a href="javascript:;" >
                                            <i class="fa fa-cogs"></i>
                                            <span>Components</span>
                                        </a>
                                        <ul class="sub">
                                            <li><a  href="calendar">Calendar</a></li>
                                            <li><a  href="gallery">Gallery</a></li>
                                            <li><a  href="todo_list">Todo List</a></li>
                                        </ul>
                                    </li>
                                    <li class="sub-menu">
                                        <a href="javascript:;" >
                                            <i class="fa fa-book"></i>
                                            <span>Extra Pages</span>
                                        </a>
                                        <ul class="sub">
                                            <li><a  href="blank">Blank Page</a></li>
                                            <li><a  href="login.html">Login</a></li>
                                            <li><a  href="lock_screen">Lock Screen</a></li>
                                        </ul>
                                    </li>
                                    <li class="sub-menu">
                                        <a href="javascript:;" >
                                            <i class="fa fa-tasks"></i>
                                            <span>Forms</span>
                                        </a>
                                        <ul class="sub">
                                            <li><a  href="form_component">Form Components</a></li>
                                        </ul>
                                    </li>--%>
                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-th"></i>
                          <span>管理</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="/pages/studentManage">学生管理</a></li>
                          <li><a  href="/pages/TeacherManage">教师管理</a></li>
                          <%--<li><a  href="responsive_table">Responsive Table</a></li>--%>
                      </ul>
                  </li>
<%--                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class=" fa fa-bar-chart-o"></i>
                          <span>Charts</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="morris">Morris</a></li>
                          <li><a  href="chartjs">Chartjs</a></li>
                      </ul>
                  </li>--%>

              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>
      <!--sidebar end-->

      <!-- Modal -->
      <div aria-hidden="true" aria-labelledby="myModalLabel1" role="dialog" tabindex="-1" id="changeModal" class="modal fade">
          <div class="modal-dialog">
              <div class="modal-content">
                  <div class="modal-header">
                      <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                      <h4 class="modal-title">修改学生信息</h4>
                  </div>
                  <div class="modal-body">
                      <p>姓名</p>
                      <input type="text" id="c_name" placeholder="" autocomplete="off" class="form-control placeholder-no-fix">

                  </div>
                  <div class="modal-body">
                      <p>学号</p>
                      <input type="text" id="c_student_ID" placeholder="" autocomplete="off" class="form-control placeholder-no-fix">

                  </div>
                  <div class="modal-body">
                      <p>学校</p>
                      <input type="text" id="c_school" placeholder="" autocomplete="off" class="form-control placeholder-no-fix">

                  </div>
                  <div class="modal-body">
                      <p>学院</p>
                      <input type="text" id="c_college" placeholder="" autocomplete="off" class="form-control placeholder-no-fix">

                  </div>
                  <div class="modal-body">
                      <p>专业</p>
                      <input type="text" id="c_profession" placeholder="" autocomplete="off" class="form-control placeholder-no-fix">
                  </div>
                  <div class="modal-body">
                      <p>年级</p>
                      <input type="text" id="c_grade" placeholder="" autocomplete="off" class="form-control placeholder-no-fix">

                  </div>
                  <div class="modal-body">
                      <p>班级</p>
                      <input type="text" id="c_s_class" placeholder="" autocomplete="off" class="form-control placeholder-no-fix">

                  </div>
                  <div class="modal-body">
                      <p>电话</p>
                      <input type="text" id="c_s_tel" placeholder="" autocomplete="off" class="form-control placeholder-no-fix">

                  </div>
                  <div class="modal-footer">
                      <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
                      <button id="changesubmit" class="btn btn-theme" type="button">Submit</button>
                  </div>
              </div>
          </div>
      </div>
      <!-- modal -->
      <!-- Modal -->
      <div aria-hidden="true" aria-labelledby="myModalLabel2" role="dialog" tabindex="-1" id="addModal" class="modal fade">
          <div class="modal-dialog">
              <div class="modal-content">
                  <div class="modal-header">
                      <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                      <h4 class="modal-title">添加学生信息</h4>
                  </div>
                  <div class="modal-body">
                      <input type="text" id="s_name" placeholder="输入学生姓名" autocomplete="off" class="form-control placeholder-no-fix">

                  </div>
                  <div class="modal-body">
                      <input type="text" id="s_id" placeholder="输入学生学号" autocomplete="off" class="form-control placeholder-no-fix">

                  </div>
                  <div class="modal-body">
                      <input type="text" id="s_school" placeholder="输入学生学校" autocomplete="off" class="form-control placeholder-no-fix">

                  </div>
                  <div class="modal-body">
                      <input type="text" id="s_college" placeholder="输入学生学院" autocomplete="off" class="form-control placeholder-no-fix">

                  </div>
                  <div class="modal-body">
                  <input type="text" id="s_perfession" placeholder="输入学生专业" autocomplete="off" class="form-control placeholder-no-fix">
                  </div>
                  <div class="modal-body">
                      <input type="text" id="s_grade" placeholder="输入学生年级" autocomplete="off" class="form-control placeholder-no-fix">

                  </div>
                  <div class="modal-body">
                      <input type="text" id="s_class" placeholder="输入学生班级" autocomplete="off" class="form-control placeholder-no-fix">

                  </div>
                  <div class="modal-body">
                      <input type="text" id="s_tel" placeholder="输入学生联系方式" autocomplete="off" class="form-control placeholder-no-fix">

                  </div>
                  <div class="modal-footer">
                      <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
                      <button id="addsubmit" class="btn btn-theme" type="button">Submit</button>
                  </div>
              </div>
          </div>
      </div>
      <!-- modal -->
      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">
          	<h3><i class="fa fa-angle-right"></i> 学生管理</h3>

              <div class="row mt">
                  <div class="col-md-12">
                      <div class="content-panel">
                          <table class="table table-striped table-advance table-hover">
                              <button  id="add_button" type="button" class="btn btn-info">添加学生</button>
	                  	  	  <hr>
                              <thead>
                              <tr>
                                  <th><i class="fa"></i> 姓名</th>
                                  <th><i class="fa"></i> 学号</th>
                                  <th><i class="fa"></i> 学校</th>
                                  <th><i class="fa"></i> 学院</th>
                                  <th><i class="fa"></i> 专业</th>
                                  <th><i class="fa"></i> 年级</th>
                                  <th><i class="fa"></i> 班级</th>
                                  <th><i class="fa"></i> 联系方式</th>
                                  <th></th>
                              </tr>
                              </thead>
                              <tbody>
                              <c:forEach items="${st}" var="s">
                                  <tr>
                                      <td>${s.name}</td>
                                      <td>${s.student_ID}</td>
                                      <td>${s.school}</td>
                                      <td>${s.college}</td>
                                      <td>${s.profession}</td>
                                      <td>${s.grade}</td>
                                      <td>${s.s_class}</td>
                                      <td>${s.tel}</td>
                                      <td>
                                          <button onclick="editfunction({
                                                  id:'${s.id}',
                                                  student_ID:'${s.student_ID}',
                                                  name:'${s.name}',
                                                  school:'${s.school}',
                                                  college:'${s.college}',
                                                  profession:'${s.profession}',
                                                  grade:'${s.grade}',
                                                  s_class:'${s.s_class}',
                                                  tel:'${s.tel}'})" class="btn btn-primary btn-xs"><i class="fa fa-pencil"></i></button>
                                          <button onclick="delfunction(${s.id})" class="btn btn-danger btn-xs"><i class="fa fa-trash-o"></i></button>
                                      </td>
                                  </tr>
                              </c:forEach>

                              </tbody>
                          </table>
                      </div>
                      <div style="float: right" class="center">
                          <script>
                              $(function(){
                                  $("ul.pagination li.disabled a").click(function(){
                                      return false;
                                  });
                              });
                          </script>
                          <ul class="pagination">
                              <li <c:if test="${!page.hasPreviouse}">class="disabled"</c:if>>
                                  <a  href="?start=0${page.param}" aria-label="Previous" >
                                      <span aria-hidden="true">«</span>
                                  </a>
                              </li>

                              <li <c:if test="${!page.hasPreviouse}">class="disabled"</c:if>>
                                  <a  href="?start=${page.start-page.count}${page.param}" aria-label="Previous" >
                                      <span aria-hidden="true">‹</span>
                                  </a>
                              </li>

                              <c:forEach begin="0" end="${page.totalPage-1}" varStatus="status">
                                  <li <c:if test="${status.index*page.count==page.start}">class="disabled"</c:if>>
                                      <a
                                              href="?start=${status.index*page.count}${page.param}"
                                              <c:if test="${status.index*page.count==page.start}">class="current"</c:if>
                                      >${status.count}</a>
                                  </li>

                              </c:forEach>

                              <li <c:if test="${!page.hasNext}">class="disabled"</c:if>>
                                  <a href="?start=${page.start+page.count}${page.param}" aria-label="Next">
                                      <span aria-hidden="true">›</span>
                                  </a>
                              </li>
                              <li <c:if test="${!page.hasNext}">class="disabled"</c:if>>
                                  <a href="?start=${page.last}${page.param}" aria-label="Next">
                                      <span aria-hidden="true">»</span>
                                  </a>
                              </li>
                          </ul>
                      </div><!-- /content-panel -->
                  </div><!-- /col-md-12 -->
              </div><!-- /row -->

		</section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
      <!--footer start-->
      <footer class="site-footer">
          <div class="text-center">
              2018 - 点名管理系统后台 - @author：庄世杰
              <a href="studentManage.jsp#" class="go-top">
                  <i class="fa fa-angle-up"></i>
              </a>
          </div>
      </footer>
      <!--footer end-->
  </section>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="../../../resources/assets/js/jquery.js"></script>
    <script src="../../../resources/assets/js/bootstrap.min.js"></script>
    <script class="include" type="text/javascript" src="../../../resources/assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="../../../resources/assets/js/jquery.scrollTo.min.js"></script>
    <script src="../../../resources/assets/js/jquery.nicescroll.js" type="text/javascript"></script>


    <!--common script for all pages-->
    <script src="../../../resources/assets/js/common-scripts.js"></script>

    <!--script for this page-->
    
  <script>
      function delfunction(s) {
          $.ajax({
              type: "POST",
              contentType: 'application/json;charset=utf-8',
              url: "/pages/deleteStudent",
              dataType: "json",
              async:false,
              data: JSON.stringify({
                  "new_id":s,
              }),
              success: function (data) {
              }
          });
          location.reload();
      }
      var id;
      function editfunction(s) {
          $("#changeModal").modal({
              backdrop:"static"
          });
          id = s.id;
        $("#c_name").val(s.name);
        $("#c_student_ID").val(s.student_ID);
        $("#c_school").val(s.school);
        $("#c_college").val(s.college);
        $("#c_profession").val(s.profession);
        $("#c_grade").val(s.grade);
        $("#c_s_class").val(s.s_class);
        $("#c_s_tel").val(s.tel);
      }
      $(function(){
          $("#changesubmit").click(function () {
              $.ajax({
                  type: "POST",
                  contentType: 'application/json;charset=utf-8',
                  url: "/pages/changeStudent",
                  dataType: "json",
                  async:false,
                  data: JSON.stringify({
                      "new_id":id,
                      "new_student_ID": $("#c_student_ID").val(),
                      "new_name": $("#c_name").val(),
                      "new_school": $("#c_school").val(),
                      "new_college": $("#c_college").val(),
                      "new_profession": $("#c_profession").val(),
                      "new_grade": $("#c_grade").val(),
                      "new_class": $("#c_s_class").val(),
                      "new_tel": $("#c_s_tel").val(),
                  }),
                  success: function (data) {
                  }
              });
              location.reload();
          })

      <!--模态框-->
      //点击新增按钮弹出模态框
      $("#add_button").click(function(){
          //弹出模态框
          $("#addModal").modal({
              backdrop:"static"
          });
      });
      $("#addsubmit").click(function () {
          $.ajax({
              type: "POST",
              contentType: 'application/json;charset=utf-8',
              url: "/pages/addStudent",
              dataType: "json",
              async:false,
              data: JSON.stringify({
                  "new_student_ID": $("#s_id").val(),
                  "new_name": $("#s_name").val(),
                  "new_school": $("#s_school").val(),
                  "new_college": $("#s_college").val(),
                  "new_profession": $("#s_perfession").val(),
                  "new_grade": $("#s_grade").val(),
                  "new_class": $("#s_class").val(),
                  "new_tel": $("#s_tel").val(),
              }),
              success: function (data) {
              }
          });
          location.reload();
      })
  });

  </script>



  </body>
</html>
