package kr.co.sosang.sosofriends.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FileUpload {
    private String filesavepath;
    private String fileurl;

    public Map<String,Object> setFileUpload(MultipartFile multipartfile) {
    	
    	
		 filesavepath = "C:\\project\\sosofriends\\src\\main\\webapp\\WEB-INF\\itemimages";
		 fileurl = "http://localhost:8080/sosofriends/items";


        Map<String,Object> param = new HashMap();

        String folderday = Utils.formatStrDay1();
		/*  String file_url = "";*/
        String filepath = filesavepath+"/"+folderday;
        String result = "Unavailable";

        try {

            if(multipartfile !=null) {

                String FILE_ORIGIN_NAME = Utils.chkNull(multipartfile.getOriginalFilename().trim());

                if(!FILE_ORIGIN_NAME.equals("") && FILE_ORIGIN_NAME != null){
                    File file = new File(filepath);

                    if(!file.exists()) {
                        file.mkdirs();// 폴더 생성
                    }
                    String ext = FILE_ORIGIN_NAME.substring(FILE_ORIGIN_NAME.lastIndexOf("."), FILE_ORIGIN_NAME.length());
                    Long size = multipartfile.getSize();

                    if(ext.equals(".exe")||ext.equals(".msi")||ext.equals(".bat")||ext.equals(".txt")) {
                        param.put("result",result);
                        return param;
                    }

                    String saveFileName = getRandomChar() + "" + ext; // 새로운 파일이름

                    File serverFile = new File(filepath + File.separator + saveFileName); //파일저장경로
                    if(!serverFile.exists()) {

                        byte[] data = multipartfile.getBytes();
                        FileOutputStream fos = new FileOutputStream(serverFile);

                        fos.write(data);
                        fos.close();

                        String file_url = String.format("%s%s/%s", fileurl, folderday, saveFileName);

                        result = "Success";
                        param.put("result", result);
                        param.put("saveFileName", folderday+"/"+saveFileName);
                        /*param.put("file_url", file_url);*/
                        param.put("filename", FILE_ORIGIN_NAME);
                        param.put("exten", ext);
                    }
                    return param;
                }else {
                    param.put("result","E02");
                    return param;
                }
            }
            param.put("result","E02");
            return param;

        }catch(Exception e) {
            e.printStackTrace();

        }

        param.put("result","E02");
        return param;
    }

    public String getRandomChar() {
        StringBuffer temp = new StringBuffer();
        Random rnd = new Random();

        for (int i = 0; i < 12; i++) {
            int rIndex = rnd.nextInt(3);
            switch (rIndex) {
                case 0:
                    // a-z
                    temp.append((char) ((int) (rnd.nextInt(26)) + 97));
                    break;
                case 1:
                    // A-Z
                    temp.append((char) ((int) (rnd.nextInt(26)) + 65));
                    break;
                case 2:
                    // 0-9
                    temp.append((rnd.nextInt(10)));
                    break;
            }
        }
        return temp.toString();
    }
}
