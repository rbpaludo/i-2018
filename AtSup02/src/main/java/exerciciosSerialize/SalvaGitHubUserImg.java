package exerciciosSerialize;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class SalvaGitHubUserImg {

	static HttpURLConnection httpConn = null;

	public static void main(String[] args) throws IOException {

		URL url = new URL("https://api.github.com/users/" + args[0]);
		httpConn = (HttpURLConnection)url.openConnection();

		InputStream in = httpConn.getInputStream();
		InputStreamReader isw = new InputStreamReader(in);

		String avatarUrl;
		StringBuilder sb = new StringBuilder();

		int data = isw.read();
		while (data != -1) {
			char current = (char) data;
			data = isw.read();
			sb.append(current);
		}

		Gson gson = new Gson();
		JsonObject jsonObject = gson.fromJson(sb.toString(), JsonObject.class);
		avatarUrl = jsonObject.get("avatar_url").toString();

		String path = "image.jpg";
		url = new URL(avatarUrl.substring(1, avatarUrl.length() - 1));
		BufferedImage image = ImageIO.read(url);
		ImageIO.write(image, "jpg", new File(path));

	}
}