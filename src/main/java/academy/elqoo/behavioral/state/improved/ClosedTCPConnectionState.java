package academy.elqoo.behavioral.state.improved;


public class ClosedTCPConnectionState implements TCPConnectionState{

    private TCPConnection connection;


    public ClosedTCPConnectionState(TCPConnection connection) {
        this.connection = connection;
    }

    @Override
    public void open() {
        System.out.println("Opening connection");
        connection.setTcpConnectionState(new OpenTCPConnectionState(connection));
    }

    @Override
    public void close() {
        System.out.println("Already closed connection");
    }

    @Override
    public void acknowledge() throws Exception {
        throw new Exception("Invalid usasage of connection");
    }
}
