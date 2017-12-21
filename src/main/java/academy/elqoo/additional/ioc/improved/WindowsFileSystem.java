package academy.elqoo.additional.ioc.improved;



public class WindowsFileSystem implements FileSystem {

    @Override
    public String readFile() {
        return "Windows file system read";
    }

}
