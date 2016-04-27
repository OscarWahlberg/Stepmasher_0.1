package stepmasher;
import java.io.IOException;

public interface IJsonWriter{
	<T> void Write(T obj, String path) throws IOException;
}
