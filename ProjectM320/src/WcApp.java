import netscape.javascript.JSObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpClient;

import static java.nio.charset.StandardCharsets.UTF_8;

public class WcApp {

    public void apiCall() throws IOException {
        URL url = new URL("https://www.ogd.stadt-zuerich.ch/wfs/geoportal/Zueri_WC?service=WFS&version=1.1.0&request=GetFeature&outputFormat=GeoJSON&typename=poi_zueriwc_rs_view");
        StringBuilder builder = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream(), UTF_8))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                builder.append(str);
            }
        }
        String json = builder.toString();

        getJsonData(json);
    }


    public void getJsonData(String json) {

        JSONobject
    }
}
