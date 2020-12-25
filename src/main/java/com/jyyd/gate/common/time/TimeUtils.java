package com.jyyd.gate.common.time;

import org.jetbrains.annotations.NotNull;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static java.util.Locale.ENGLISH;

public class TimeUtils {

    private static int i = 0;

    /**
     * 日期转换成 yyyy-MM-dd HH:mm:ss+时区形式 如:2019-04-24 19:18:03+0800
     *
     * @param date 日期
     * @return 按格式返回日期
     */
    public static String getDateString(Date date) {
        if (date == null) {
            return null;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");

        return dateFormat.format(date);
    }

    public static String getDateStr(Date date) {
        if (date == null) {
            return null;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return dateFormat.format(date);
    }

    /**
     * 日期转换成 yyyy-MM-dd HH:mm:ss 形式 如:2019-04-24 19:18:03
     *
     * @return 按格式返回日期
     */
    public static String dateToString() {
        Calendar now = Calendar.getInstance();
        now.set(Calendar.SECOND, now.get(Calendar.SECOND) + i);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        i++;
        if (i > 1) {
            i = 0;
        }
        return dateFormat.format(now.getTime());
    }

    /**
     * 日期转换成 yyyy-MM-dd HH:mm:ss+时区形式 如:2019-04-24 19:18:03+0800
     *
     * @param date 日期
     * @return 按格式返回日期
     */
    public static String getDateString(String date) {
        if (date == null) {
            return null;
        }
        return TimeUtils.getDateString(toDate(date, "yyyy-MM-dd HH:mm:ss"));
    }

    /**
     * String转 Date
     *
     * @param date   日期
     * @param format 格式
     * @return 转换后日期
     */
    public static Date toDate(String date, String format) {
        if (StringUtils.isEmpty(format)) {
            format = "yyyy-MM-dd HH:mm:ss";
        }
        SimpleDateFormat df = new SimpleDateFormat(format);
        try {
            return df.parse(date);
        } catch (ParseException e) {
            return new Date();
        }
    }

    /**
     * String转 Date
     *
     * @param date 日期
     * @return 转换后日期
     */
    public static Date toDate(String date) {
        return toDate(date, null);
    }

    /**
     * 将带时区的时间字符串转换成系统所在时区的时间 如：2019-04-24 19:18:03+0700 转换到东八区的时间为:2019-04-24
     * 20:18:03
     *
     * @param dateformat 日期格式
     * @return 系统所在时区的时间
     * @throws ParseException [参数说明]
     */
    public static Date convertToLocalDate(String dateformat) throws ParseException {
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");

        Date date = dFormat.parse(dateformat);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.setTimeZone(TimeZone.getDefault());

        return calendar.getTime();
    }

    /**
     * <获取当前时间N小时后的时间 >
     *
     * @param n 小时
     * @return 日期
     */
    public static Date getNextDate(int n) {
        Calendar now = Calendar.getInstance();
        now.set(Calendar.HOUR_OF_DAY, now.get(Calendar.HOUR_OF_DAY) + n);
        return now.getTime();
    }

    /**
     * <获取当前时间N天后的凌晨 >
     *
     * @param n 天
     * @return 日期
     */
    public static Date getMorningNextDate(int n) {
        Calendar now = Calendar.getInstance();
        now.set(Calendar.DATE, now.get(Calendar.DATE) + n);// 设置时间向前进n天
        now.set(Calendar.HOUR_OF_DAY, 0);
        now.set(Calendar.MINUTE, 0);
        now.set(Calendar.SECOND, 0);
        return now.getTime();
    }

    /**
     * <获取当前时间N小时后的整点时间 >
     *
     * @param n 小时
     * @return 日期
     */
    public static Date getNextHour(int n) {
        Calendar now = Calendar.getInstance();
        now.set(Calendar.DATE, now.get(Calendar.DATE));
        now.set(Calendar.HOUR_OF_DAY, now.get(Calendar.HOUR_OF_DAY) + n);// 设置时间向前进n小时
        return now.getTime();
    }

    /**
     * <获取当前时间N天后的凌晨【精确到毫秒】 >
     *
     * @param n 前进天数
     * @return Date [日期]
     */
    public static Date getMorningNextDateMillisecond(int n) {
        Calendar now = Calendar.getInstance();
        now.set(Calendar.DATE, now.get(Calendar.DATE) + n);// 设置时间向前进n天
        now.set(Calendar.HOUR_OF_DAY, 0);
        now.set(Calendar.MINUTE, 0);
        now.set(Calendar.SECOND, 0);
        now.set(Calendar.MILLISECOND, 0);
        return now.getTime();
    }

    /**
     * 比较
     *
     * @param date 日期
     * @return 是否是今天
     */
    public boolean checkLastDate(Date date) {
        Date d = new Date();
        Calendar current = Calendar.getInstance();
        current.setTime(date);
        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        start.set(Calendar.YEAR, current.get(Calendar.YEAR));
        start.set(Calendar.MONTH, current.get(Calendar.MONTH));
        start.set(Calendar.DAY_OF_MONTH, current.get(Calendar.DAY_OF_MONTH));
        start.set(Calendar.HOUR_OF_DAY, 0);
        start.set(Calendar.MINUTE, 0);
        start.set(Calendar.SECOND, 0);
        end.set(Calendar.YEAR, current.get(Calendar.YEAR));
        end.set(Calendar.MONTH, current.get(Calendar.MONTH));
        end.set(Calendar.DAY_OF_MONTH, current.get(Calendar.DAY_OF_MONTH));
        end.set(Calendar.HOUR_OF_DAY, 23);
        end.set(Calendar.MINUTE, 59);
        end.set(Calendar.SECOND, 59);
        if (d.after(start.getTime()) && d.before(end.getTime())) {
            return true;
        }
        return false;
    }

    /**
     * 判断是否是昨天还是今天还是明天  yesterday  or  today  or tomorrow   1 0 2
     */

    public int checkYTTDay(Date date) {
        Date d = new Date();
        Calendar current = Calendar.getInstance();
        current.setTime(date);
        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        start.set(Calendar.YEAR, current.get(Calendar.YEAR));
        start.set(Calendar.MONTH, current.get(Calendar.MONTH));
        start.set(Calendar.DAY_OF_MONTH, current.get(Calendar.DAY_OF_MONTH));
        start.set(Calendar.HOUR_OF_DAY, 0);
        start.set(Calendar.MINUTE, 0);
        start.set(Calendar.SECOND, 0);
        end.set(Calendar.YEAR, current.get(Calendar.YEAR));
        end.set(Calendar.MONTH, current.get(Calendar.MONTH));
        end.set(Calendar.DAY_OF_MONTH, current.get(Calendar.DAY_OF_MONTH));
        end.set(Calendar.HOUR_OF_DAY, 23);
        end.set(Calendar.MINUTE, 59);
        end.set(Calendar.SECOND, 59);

//        Date1.after(Date2),当Date1大于Date2时，返回TRUE，当小于等于时，返回false；

//        Date1.before(Date2)，当Date1小于Date2时，返回TRUE，当大于等于时，返回false；

        if (d.after(start.getTime()) && d.before(end.getTime())) {
            // after 当前时间大于传入时间  返回true  否则  false
            // before  当前时间小于传入时间 返回true  否则  false
            // 当前时间之中 表现在
            return 0;
        }

        if (d.after(end.getTime())) {
            // 当前时间之前 表过去
            return 1;
        }

        if (d.before(start.getTime())) {
            // 当前时间之后  表未来
            return 2;
        }

        return -1;
    }


    /**
     * 转换日期：格式：时间戳
     */
    public Date transDate(Long timestamp){
        Date date = new Date();
        date.setTime(timestamp);
        return date;
    }

    /**
     * 转换日期：格式：EEE MMM dd HH:mm:ss z yyyy
     */
    public Date transDate(@NotNull Object dateObject){
        String dateStr = dateObject.toString();
        System.out.println(dateStr);
        System.out.println(dateStr.length());
        int length = dateStr.length();
        Date date = new Date();
        if (length == 13){  // 时间戳
            date.setTime(Long.parseLong(dateStr));
        }else if (dateStr == null || dateStr.equals("null")){
            // 为空
            date = null;
        }
        else {  // 非时间戳
            SimpleDateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", ENGLISH);
            try {
                date =  df.parse(dateObject.toString());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return date;
    }

    /**
     * 获取日期；格式：yyyy-MM-dd
     *
     * @param date 日期
     * @return String yyyy-MM-dd格式的日期字符串
     */
    public static String getDate(Date date) {
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        dFormat.setTimeZone(TimeZone.getDefault());
        return dFormat.format(date);
    }

    /**
     * <获取年月>
     *
     * @param date 时间
     * @return String [获取年月]
     */
    public static String getDateYearAndMonth(Date date) {
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM");
        dFormat.setTimeZone(TimeZone.getDefault());
        return dFormat.format(date);
    }

    /**
     * 获取有效时间
     *
     * @return 有效时间
     */
    public static int getExpireTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        return (int) ((cal.getTime().getTime() - new Date().getTime()) / 1000);
    }

    /**
     * <时间增加>
     *
     * @param p      时间日期
     * @param number 要增加数
     * @param filed  域
     * @return Date [增加后的时间]
     */
    public static Date addDate(Date p, int number, int filed) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(p);
        cal.add(filed, number);
        return cal.getTime();
    }

    /**
     * <时间戳转日期时间>
     *
     * @param s 时间戳
     * @return String [日期时间]
     */
    public static String stampToDate(String s, String format) {
        if (StringUtils.isEmpty(format)) {
            format = "yyyy-MM-dd HH:mm:ss";
        }
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }

    /**
     * 日期转换成 yyyy-MM-dd HH:mm:ss zzz+时区形式 如:2019-04-24 19:18:03 132+0800
     *
     * @param date 日期
     * @return LongDate
     */
    public static String getLongDateString(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SZ");

        return dateFormat.format(date);
    }

}
