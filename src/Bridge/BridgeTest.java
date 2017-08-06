package Bridge;

/**
 * Created by NiQiu on 2017/8/6.
 */
public class BridgeTest {
    public static void main(String[] args) {
        Image image;
        ImageImp imp;
        image= (Image) Bridge.XMLUtil.getBean("image");
        imp= (ImageImp) Bridge.XMLUtil.getBean("os");
        image.setImageImp(imp);
        image.parseFile("大海图片");
        System.out.print("OVER");
    }
}
