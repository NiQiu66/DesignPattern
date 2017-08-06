package Composite;

public class CompositeTest {
    public static void main(String[] args) {
        AbstractFile file1, file2, file3, file4, file5, folder1, folder2;
        folder1 = new Folder("途虎资料文件夹");
        file1 = new ImageFile("轮胎.jpg");
        file2 = new TextFile("微保接口说明文档.doc");
        file3 = new VideoFile("轮胎残酷踹门时间.mp4");
        folder1.add(file1);
        folder1.add(file2);
        folder1.add(file3);

        folder1.killVirus();
    }
}
