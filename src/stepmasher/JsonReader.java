package stepmasher;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.Gson;

public class JsonReader implements IJsonReader {
	public <T> T Read(String path, Class<T> classType) throws IOException {
		Gson gson = new Gson();
		String json = new String(Files.readAllBytes(Paths.get(path)));
		 T gsonObj = gson.fromJson(json, classType);
		
		return gsonObj;
	}
}