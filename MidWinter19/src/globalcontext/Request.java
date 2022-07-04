package globalcontext;

public class Request {
    private static int lastId = 0;
    private int id;

    public Request(){
        lastId++;
        id = lastId;
    }

    public int getId() {
        return id;
    }

    public static int getLastId() {
        return lastId;
    }
}

