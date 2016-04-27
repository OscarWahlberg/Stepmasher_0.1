package stepmasher;
import java.io.IOException;

public interface IJsonReader {
	public <T> T Read(String path, Class<T> classType) throws IOException;
}
