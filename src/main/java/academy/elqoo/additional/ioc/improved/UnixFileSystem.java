package academy.elqoo.additional.ioc.improved;


public class UnixFileSystem implements FileSystem{

    @Override
    public String readFile() {
        return "Unix file system read";
    }

}
