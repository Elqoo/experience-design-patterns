package academy.elqoo.additional.ioc;


public class ImageService {

    private FileSystem fileSystem = new WindowsFileSystem();

    public String readImage(){
        return fileSystem.readFile();
    }

    public static void main(String[] args) {
        ImageService service = new ImageService();
        System.out.print(service.readImage());
    }

}
