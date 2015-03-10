package leaprobovr.seneca.on.ca.leaprobovr;

import android.os.Bundle;
import android.webkit.WebView;
import com.google.vrtoolkit.cardboard.CardboardActivity;

/**
 * Created by collamo on 3/9/15.
 */
public class MainActivity extends CardboardActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        WebView web1 = (WebView) findViewById(R.id.web_left);
        web1.loadUrl("http://developer.android.com/guide/webapps/webview.html");
        WebView web2 = (WebView) findViewById(R.id.web_right);
        web2.loadUrl("http://developer.android.com/guide/webapps/webview.html");

    }

}
