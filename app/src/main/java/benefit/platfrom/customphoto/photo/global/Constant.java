package benefit.platfrom.customphoto.photo.global;


import java.io.File;

import benefit.platfrom.customphoto.photo.utils.FileUtils;


/**
 * Author       wildma
 * Github       https://github.com/wildma
 * Date         2018/6/10
 * Desc	        ${常量}
 */
public class Constant {
    public static final String APP_NAME = "Parking";//app名称
    public static final String BASE_DIR = APP_NAME + File.separator;//WildmaIDCardCamera/
    public static final String DIR_ROOT = FileUtils.getRootPath() + File.separator + Constant.BASE_DIR;//文件夹根目录 /storage/emulated/0/WildmaIDCardCamera/
}