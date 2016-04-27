package stepmasher;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonWriter implements IJsonWriter{

	public <T> void Write(T obj, String path) throws IOException {
		try (Writer writer = new FileWriter(path)) {
			Gson gson = new GsonBuilder().create();
			gson.toJson(obj, writer);
		}
	}
}