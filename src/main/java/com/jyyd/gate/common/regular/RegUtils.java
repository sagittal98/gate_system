package com.jyyd.gate.common.regular;

import com.alibaba.fastjson.JSONObject;
import com.jyyd.gate.common.time.TimeUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegUtils {


    private static final Logger logger = Logger.getLogger(RegUtils.class);

    /**
     * 邮箱验证
     *
     */

    public static boolean checkEmail(String email){
        boolean flag = false;
        logger.info("【日志提醒】开始邮箱验证！");
        try {
            String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
            Pattern regex = Pattern.compile(check);
            Matcher matcher = regex.matcher(email);
            flag = matcher.matches();
        }catch (Exception e){
            logger.info("【日志提醒】抛出错误：验证邮箱地址错误！ 错误信息：" + e);
        }
        logger.info("【日志提醒】验证结果：" + flag);
        return flag;
    }

    /**
     * 手机号码验证
     */

    public static boolean checkPhone(String phoneNumber){
        boolean flag = false;
        logger.info("【日志提醒】开始手机号验证！");
        try{
            Pattern p = Pattern.compile("^1[3|4|5|7|8][0-9]{9}$");
//            Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
            Matcher m = p.matcher(phoneNumber);
            flag = m.matches();
        }catch(Exception e){
            logger.info("【日志提醒】抛出错误：验证邮箱地址错误！ 错误信息：" + e);
        }
        logger.info("【日志提醒】验证结果：" + flag);
        return flag;
    }

    /**
     * string 转 list
     */
    @NotNull
    @Contract("_ -> new")
    public static List<Long> stringToList(@NotNull String str){
        String newStr = str.substring(1,str.length() -1);
        String[] resultStr = newStr.split(",");
        List<Long> longList = new ArrayList<>();
        for (String s : resultStr){
            longList.add(Long.valueOf(s));
        }
        return longList;
    }


    /**
     *
     * @param c  用来创建泛型对象
     * @param jsonObject 传入jsonObject
     * @param <T> 代指此方法为泛型方法
     * @return 返回泛型
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    @NotNull
    public static <T> T jsonObjectToT(@NotNull Class<T> c, JSONObject jsonObject) throws IllegalAccessException, InstantiationException {
        T t = c.newInstance();
        Field[] fields = t.getClass().getDeclaredFields();
        System.out.println(jsonObject);
        try {
            for (Field field : fields){
                Class<?> type = field.getType();
                System.out.println(type);
                String name = field.getName();
                System.out.println(name);
                System.out.println("serialVersionUID".equals(name));
                field.setAccessible(true);
                if (jsonObject.get(name) == null || jsonObject.get(name).equals("null")){
                    if ("serialVersionUID".equals(name) ){
                        // 为序列号的时候
                        System.out.println("我是序列号，所以不写，跳过吧！");
                    }else {
                        field.set(t,null);
                    }
                }else {
                    if (Long.class.equals(type)) {
                        field.set(t,jsonObject.getLong(name));
                    } else if (Integer.class.equals(type)) {
                        field.set(t, jsonObject.getInteger(name));
                    } else if (String.class.equals(type)) {
                        field.set(t, jsonObject.getString(name));
                    } else if (Date.class.equals(type)) {
                        field.set(t, TimeUtils.toDate(jsonObject.getString(name)));
                    }else {
                        System.out.println("新类型：" + type);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }


}
