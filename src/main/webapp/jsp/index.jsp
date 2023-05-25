<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
    <link href="../bootstrap/css/bootstrap.css" rel="stylesheet"/>
    <script src="../bootstrap/js/jquery-3.6.1.min.js"></script>
    <script src="../bootstrap/js/bootstrap.min.js"></script>

    <style>
        #img {
            background-image: url("../bootstrap/image/beijing.gif");
        }

        .container {
            background-color: steelblue;
            border-radius: 15px;
            margin-top: 30px;
        }

        .form-group p {
            display: inline-block;
            color: red;
            font-size: 20px;
            height: 10px;
        }
    </style>

</head>
<body id="img">
<div class="container" style="width: 400px;">
    <h3 style="text-align: center;">管理员登录</h3>
    <form id="f1" action="${pageContext.request.contextPath}/login" method="post">
        <div class="form-group">
            <label>用户名：</label>
            <input type="text" name="username" class="form-control" id="user" placeholder="请输入用户名"/>
            <p id="us"></p>
        </div>

        <div class="form-group">
            <label>密码：</label>
            <input type="password" name="password" class="form-control" id="password" placeholder="请输入密码"/>
            <p id="ps"></p>
        </div>

        <hr/>
        <div class="form-group">
            <input id="sub" class="btn btn btn-success" type="button" value="登录" style="float: left">
            <a href="${pageContext.request.contextPath}/forget" style="float: right">
                <input type="button" class="btn btn-warning" value="忘记密码">
            </a>
        </div>
        <br/><br/>
        <div class="row">
            <div class="col-md-3 "></div>
            <div class="col-md-6 text-center"><span style="color: red;font-size: 20px" id="tishi">${msg}</span></div>
            <div class="col-md-3 "></div>
        </div>
    </form>
</div>

<script>
    //判断用户名是否为空
    $('#user').on('blur', function () {
        if ($('#user').val() === '' || $('#user').val() === null) {
            $('#us').text('请输入用户名')
        } else {
            $('#us').text('')
        }
    })
    //判断密码是否为空
    $('#password').on('blur', function () {
        if ($(this).val() === '' || $(this).val() === null) {
            $('#ps').text('请输入密码')
        } else {
            $('#ps').text('')
        }
    })
    //添加点击事件
    $('#sub').on("click", function (e) {
        //若值不为空，则修改按钮的类型为submit
        if ($('#user').val().trim() !== '' && $('#password').val().trim() !== '') {
            $('#sub')[0].type = 'submit'
        } else {
            $('#tishi').text('请将信息填写完整')
        }
    })


</script>

</body>
</html>