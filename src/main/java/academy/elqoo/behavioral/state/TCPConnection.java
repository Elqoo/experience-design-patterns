package academy.elqoo.behavioral.state;


public class TCPConnection {


    private TCPConnectionState state = TCPConnectionState.CLOSED;


    public void open(){
        if(state==TCPConnectionState.OPEN){
            System.out.println("Reinitializing connection");
        }

        if(state==TCPConnectionState.CLOSED){
            state = TCPConnectionState.OPEN;
            System.out.println("Opening connection");
        }


    }

    public void close(){
        if(state==TCPConnectionState.CLOSED){
            System.out.println("Already closed connection");
        }

        if(state==TCPConnectionState.OPEN){
            state = TCPConnectionState.CLOSED;
            System.out.println("Closing connection");
        }

    }

    public void acknowledge() throws Exception {
        if(state==TCPConnectionState.CLOSED){
            throw new Exception("Invalid usasage of connection");
        }

        if(state==TCPConnectionState.OPEN){
            System.out.println("Acknowledge");
        }
    }


}
