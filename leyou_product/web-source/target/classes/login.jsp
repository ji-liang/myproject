<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7"/>
    <title>乐优商城--登录页面</title>

    <link rel="stylesheet" type="text/css" href="css/webbase.css"/>
    <link rel="stylesheet" type="text/css" href="css/pages-login.css"/>
</head>

<body>
<div class="login-box">
    <!--head-->
    <div class="py-container logoArea">
        <a href="" class="logo"></a>
    </div>
    <!--loginArea-->
    <div class="loginArea" id="loginApp">
        <div class="py-container login">
            <div class="loginform">
                <ul class="sui-nav nav-tabs tab-wraped">
                    <li>
                        <a href="#index" data-toggle="tab">
                            <h3>扫描登录</h3>
                        </a>
                    </li>
                    <li class="active">
                        <a href="#profile" data-toggle="tab">
                            <h3>账户登录</h3>
                        </a>
                    </li>
                </ul>
                <div class="tab-content tab-wraped">
                    <div id="index" class="tab-pane">
                        <p>二维码登录，暂为官网二维码</p>
                        <img src="img/wx_cz.jpg"/>
                    </div>
                    <div id="profile" class="tab-pane  active">
                        <span v-text="msg"></span>
                        <form class="sui-form">
                            <div class="input-prepend"><span class="add-on loginname"></span>
                                <input id="username" type="text" placeholder="邮箱/用户名/手机号" class="span2 input-xfat"
                                       v-model="form.username">
                            </div>
                            <div class="input-prepend"><span class="add-on loginpwd"></span>
                                <input id="password" type="password" placeholder="请输入密码" class="span2 input-xfat"
                                       v-model="form.password">
                            </div>
                            <div class="setting">
                                <label class="checkbox inline">
                                    <input name="m1" type="checkbox" value="2" checked="">
                                    自动登录
                                </label>
                                <span class="forget">忘记密码？</span>
                            </div>
                            <div class="logined">
                                <a class="sui-btn btn-block btn-xlarge btn-danger" @click="login"
                                   href="javascript:login()">登&nbsp;&nbsp;录</a>
                            </div>
                        </form>
                        <div class="otherlogin">
                            <div class="types">
                                <ul>
                                    <li><img src="img/qq.png" width="35px" height="35px"/></li>
                                    <li><img src="img/sina.png"/></li>
                                    <li><img src="img/ali.png"/></li>
                                    <li><img src="img/weixin.png"/></li>
                                </ul>
                            </div>
                            <span class="register"><a href="register.jsp" target="_blank">立即注册</a></span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--foot-->

    <script type="text/javascript" src="js/plugins/jquery/jquery.min.js"></script>
    <!-- 底部栏位 -->
    <!--页面底部版权信息，由js动态加载-->
    <div class="Mod-copyright"></div>
    <script type="text/javascript">$(".Mod-copyright").load("copyright.html");</script>
    <!--页面底部END-->

</div>

<script type="text/javascript" src="js/plugins/jquery/jquery.min.js"></script>
<script type="text/javascript" src="js/plugins/jquery.easing/jquery.easing.min.js"></script>
<script type="text/javascript" src="js/plugins/sui/sui.min.js"></script>
<script type="text/javascript" src="js/plugins/jquery-placeholder/jquery.placeholder.min.js"></script>
<script type="text/javascript" src="js/pages/login.js"></script>
</body>
<script src="./js/vue/vue.js"></script>
<script src="./js/axios.min.js"></script>
<script src="./js/common.js"></script>
<script type="text/javascript">
    function login () {
        var username = document.getElementById("username").value;
        var password=document.getElementById("password").value;
        window.location.href="/login?username="+username+"&password="+password;
    }
</script>
</html>