# gate_system
道闸管理系统


## 请求方式：POST
## 请求编码：application/json
## 登录接口：http://139.155.70.76:8080/user/login.do

## 请求参数
```
userModel：{
    corUserId:number,  // 非必须
    perName：String, // 必须参数
    passWord: String, // 必须参数
    roleLevel：String // 非必须
}
```

## 返回参数
```
code:number,
codeDescribe:String,
data:Object
```
