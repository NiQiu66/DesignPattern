package Composite;

import java.util.ArrayList;



abstract class  AbstractFile{
    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();
}

class ImageFile extends AbstractFile{

    private String name;

    public ImageFile(String name){
        this.name=name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.print("对比起，图片不支持此方法");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.print("对比起，图片不支持此方法");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.print("对比起，图片不支持此方法");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.print("对图像文件"+this.name+"杀毒\n");
    }
}

class  TextFile extends AbstractFile{

    private String name;
    public TextFile(String name){
        this.name=name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.print("对比起，不支持此方法");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.print("对比起，不支持此方法");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.print("对比起，不支持此方法");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.print("对文本文件"+this.name+"杀毒\n");
    }
}

class  VideoFile extends AbstractFile{
    private String name;
    public VideoFile(String name){
        this.name=name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.print("对比起，不支持此方法");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.print("对比起，不支持此方法");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.print("对比起，不支持此方法");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.print("对图像文件"+this.name+"杀毒\n");
    }
}

class  Folder extends AbstractFile{
    private ArrayList<AbstractFile> fileList=new ArrayList<AbstractFile>();
    private String name;
    public Folder(String name){
        this.name=name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.print("对文件夹"+this.name+"杀毒\n");
        for(Object obj:fileList){
            ((AbstractFile)obj).killVirus();
        }
    }
}