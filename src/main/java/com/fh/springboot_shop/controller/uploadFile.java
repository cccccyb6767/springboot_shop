package com.fh.springboot_shop.controller;

import com.fh.springboot_shop.utils.OssUploadFile;
import com.fh.springboot_shop.utils.ReturnData;
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
import java.util.UUID;

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
        public ReturnData photo(MultipartFile photo, HttpServletRequest request) throws IOException {

            String oldFileName=photo.getOriginalFilename();//获取图片原名称
            String newName= UUID.randomUUID().toString()+oldFileName.substring(oldFileName.lastIndexOf("."));
            //获取上传的绝对路径
             newName="img/"+newName;
     return ReturnData.successs(OssUploadFile.uploadFile(photo.getInputStream(),newName));
        }

}
