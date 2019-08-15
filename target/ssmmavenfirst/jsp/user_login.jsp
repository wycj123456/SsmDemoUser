<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <div style="width: 300px;margin-left: auto;margin-right: auto;text-align: center;">
        <h1>登录</h1>
    </div>
    <br><br><br>
    <form action="/user/verify.do" method="post">
        <h2 style="color: red" align="center">${error}</h2><br>
            <%--layer.alert('${error}');--%>
        <div style="border:solid deepskyblue;width:100%;height:400px;text-align:center;">

        <div >
            <label>账号</label>
            <div>
                <input type="text" name="username" required placeholder="请输入账号" autocomplete="off">
            </div>
        </div>

        <div>
            <label>密码</label>
            <div>
                <input type="password" name="password" required placeholder="请输入密码" autocomplete="off">
            </div>
        </div>
        <br>
        <div>
            <h3><button>登录</button></h3>
        </div>

        </div>
    </form>
