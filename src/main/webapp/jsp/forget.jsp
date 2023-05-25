<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>忘记密码</title>
    <link href="../bootstrap/css/bootstrap.css" rel="stylesheet">
    <script src="../bootstrap/js/jquery-3.6.1.min.js"></script>
    <script src="../bootstrap/js/bootstrap.min.js"></script>

    <style>
        #img {
            background-image: url("../bootstrap/image/beijing.gif");
        }

        .container {
            background-color: steelblue;
            border-radius: 15px;
            margin-top: 10px;
        }

        p {
            height: 10px;
            color: red;
        }
    </style>

</head>
<body id="img">
<div class="container" style="width: 420px">
    <form id="for" method="post" action="${pageContext.request.contextPath}/forgets">
        <h3 style="text-align: center">忘记密码</h3>
        <div class="form-group">
            <label>用户名：</label>
            <input type="text" name="username" class="form-control" id="user" placeholder="请输入用户名" value="${username}"/>
            <p id="us"></p>
        </div>

        <div class="form-group">
            <label>请输入新密码:</label>
            <input type="password" name="password" class="form-control" id="password" placeholder="请输入新密码"/>
            <p id="pa"></p>
        </div>

        <div class="form-group">
            <label>请再输入一次新密码:</label>
            <input type="password" name="againpass" class="form-control" id="againpassword" placeholder="请再输入一次新密码"/>
            <p id="ag"></p>
        </div>

        <div class="form-group">
            <input type="button" class="btn btn-success" value="修改" id="but" style="float: left">
            <input type="reset" class="btn btn-primary" value="清空内容" style="float: right">
        </div>
        <br/><br/>
        <div class="row">
            <div class="col-md-3"></div>
            <div class="col-md-6"><span style="font-size: 20px;color: red;" id="tishi">${msg}</span></div>
            <div class="col-md-3"></div>
        </div>
    </form>
</div>

<script>
    //定义一个flag,用来判断是否可以提交请求
    //判断用户名是否为空
    $('#user').on('blur', function () {
        if ($('#user').val().trim() === '' || $('#user').val().trim() === null) {
            $('#us').text('请输入用户名')
        } else {
            $('#us').text('')
        }
    })

    //判断新密码是否为空
    $('#password').on('blur', function () {
        if ($('#password').val().trim() === '' || $('#password').val().trim() === null) {
            $('#pa').text('请输入密码')
        } else {
            $('#pa').text('')
        }
    })

    //判断确认密码是否为空以及是否和新密码相同
    $('#againpassword').on('blur', function () {
        if ($('#password').val().trim() === '' || $('#password').val().trim() === null) {
            $('#ag').text('请输入确认密码')
        } else if ($('#password').val().trim() !== $('#againpassword').val().trim()) {
            $('#ag').text('两次输入的密码不同')
        } else {
            $('#ag').text('')
        }
    })
    $('#but').on('click', function () {
        //若值不为空，则修改按钮的类型为submit
        if ($('#user').val().trim() !== '' && $('#password').val().trim() !== '' && $('#password').val().trim() === $('#againpassword').val().trim()) {
            $('#but')[0].type = 'submit'
            $('#tishi').text('')
        } else {
            $('#tishi').text('请将信息填写完整')
        }
    })
</script>

</body>
</html>
