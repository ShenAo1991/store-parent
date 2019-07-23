package com.sinoku.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateUtils
 * @Description 日期工具类
 * @Author shen.ao
 * @Date 2019/7/23 下午12:09
 **/
public class DateUtils {


  /**
   * format date 2 str
   * @param d
   * @param ptn
   * @return
   */
  public static String formatDate(Date d, String ptn) {
    SimpleDateFormat sf = new SimpleDateFormat(ptn);
    return sf.format(d);
  }

  /**
   *
   * @param str
   * @param ptn
   * @return
   * @throws ParseException
   */
  public static Date parse(String str, String ptn) throws ParseException {
    SimpleDateFormat sf = new SimpleDateFormat(ptn);
    return sf.parse(str);
  }



}
