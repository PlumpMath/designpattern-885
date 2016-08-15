/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package cn.com.tcsl.test;

/**
 * <P>
 * Description:
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年7月5日下午1:29:05
 */
public class Test {

    public static void main(String[] args) {
        /*Console console = System.console();
        String username = console.readLine("User name: ");
        char[] password = console.readPassword("Password: ");*/
        /*String mapperUrl = "mapper/BusinessMapper.xml";
        String mapperName = getMapperName(mapperUrl);
        System.out.println(mapperName);*/

        String test = "\n" +
                "        select * from arch_item where id=#id#\n" +
                "    name='lee'";
        String sql = getFinalSql(test);
        System.out.println(sql);
    }

    /**
     * 根据 mapperUrl 截取 mapper 有效名称
     * @param mapperUrl mapper 资源路径
     * @return mapper 有效名称
     */
    private static String getMapperName(String mapperUrl) {
        int mapperNameBegin = mapperUrl.lastIndexOf("/") + 1;
        int mapperNameEnd = mapperUrl.indexOf(".xml");
        String mapperName = mapperUrl.substring(mapperNameBegin, mapperNameEnd);
        return mapperName;
    }

    /**
     * 获得最终的可执行的 sql 语句，把语句中的 "#paramName#" 替换成 "？"
     * @param sql xml 中的 sql 语句
     * @return String[paramName1,paramName2...]
     */
    private static String getFinalSql(String sql) {
        sql = sql.trim();
        String[] partSql = sql.split("#\\w+#");

        StringBuilder finalSql = new StringBuilder();
        for(int i = 0; i < partSql.length; i++) {
            if (partSql[i].endsWith("=")) {
                finalSql.append(partSql[i] + "?");
            } else {
                finalSql.append(partSql[i]);
            }
        }

        return finalSql.toString();
    }

}
