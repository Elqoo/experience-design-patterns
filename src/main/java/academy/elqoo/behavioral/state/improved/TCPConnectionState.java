package academy.elqoo.behavioral.state.improved;


public interface TCPConnectionState {

    void open();

    void close();

    void acknowledge() throws Exception;


}
