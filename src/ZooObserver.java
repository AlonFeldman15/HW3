import java.util.ArrayList;

public interface ZooObserver {
    void update(String name);
    void subscribe();
    void unsubscribe();
}


