package com.fh.springboot_shop.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yiboChen
 * @create 2021-01-11 11:58
 */
@RestController
@RequestMapping("api/uploadFile/")
@CrossOrigin
public class uploadFile {



    // uri : http://localhost:8081/api/uploadFile/imgPath
    // 请求方式 : get
    // 请求参数:
    //     flie
    // 返回值:
    //   code url


        @RequestMapping("imgPath")
        public Map<String,Object> photo(@RequestParam("file") MultipartFile photo, HttpServletRequest request){
            //System.out.println(photo.getOriginalFilename());i
            //先给图片重命名
            Long timeMills=System.currentTimeMillis();//获取当前时间的时间戳
            String oldFileName=photo.getOriginalFilename();//获取图片原名称
            String newFileName=timeMills+oldFileName.substring(oldFileName.lastIndexOf("."));
            //获取上传的绝对路径
            String realPath=request.getSession().getServletContext().getRealPath("/");
            String uploadPath=realPath+"/commons/photo/";
            File file=new File(uploadPath);
            if(!file.exists()){
                file.mkdirs();
            }
            //拼接后缀名
            String photoUrl=uploadPath+"/"+newFileName;
            //上传
            try {
                photo.transferTo(new File(photoUrl));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Map<String,Object> resultMap=new HashMap<>();
            resultMap.put("code",0);
            resultMap.put("url","http://192.168.1.178:8082/commons/photo/"+newFileName);
            return resultMap;
        }

}
