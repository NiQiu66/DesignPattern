package Bridge;

/**
 * Created by NiQiu on 2017/8/6.
 */
class  Matrix{
}
abstract  class  Image{
    protected ImageImp imp;
    public void setImageImp(ImageImp imp){
        this.imp=imp;
    }
    public  abstract void parseFile(String fileName);
}
class JPGImage extends Image{

    @Override
    public void parseFile(String fileName) {
        Matrix m=new Matrix();
        imp.doPaint(m);
        System.out.print(fileName+"的格式为JPG");
    }
}
class PNGImage extends Image{

    @Override
    public void parseFile(String fileName) {
        Matrix m=new Matrix();
        imp.doPaint(m);
        System.out.print(fileName+"的格式为PNG");
    }
}
class  GIFImage extends Image{

    @Override
    public void parseFile(String fileName) {
        Matrix m=new Matrix();
        imp.doPaint(m);
        System.out.print(fileName+"格式为GIF");
    }
}
interface  ImageImp{
    public  void doPaint(Matrix m);
}
class  WindowsImp implements ImageImp{
    @Override
    public void doPaint(Matrix m) {
        System.out.print("Windows系统显示的图像");
    }
}
class  LinuxImp implements ImageImp{

    @Override
    public void doPaint(Matrix m) {
        System.out.print("Linux系统显示图像");
    }
}
class  UnixImp implements ImageImp{

    @Override
    public void doPaint(Matrix m) {
        System.out.print("Unix系统显示的图像");
    }
}