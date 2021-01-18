package com.fh.springboot_shop.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;

import java.io.InputStream;

/**
 * @author yiboChen
 * @create 2021-01-17 10:27
 */
public class OssUploadFile {

    // Endpoint以杭州为例，其它Region请按实际情况填写。


    private static String endpoint = "oss-cn-beijing.aliyuncs.com";
    // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录RAM控制台创建RAM账号。
    private static   String accessKeyId = "LTAI4G2LkFRxhM9FEfM3z57x";
    private static  String accessKeySecret = "tPyvyMYok2068rottCZfUzYIk2fBnU";
    private static String bucket="image-2006";





    public static String uploadFile(InputStream is, String fileName){
        OSS build = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        build.putObject(bucket,fileName,is);
        build.shutdown();
        return "https://"+bucket+"."+endpoint+"/"+fileName;
    }
}
