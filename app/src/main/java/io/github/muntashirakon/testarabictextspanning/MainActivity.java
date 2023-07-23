package io.github.muntashirakon.testarabictextspanning;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

import io.github.muntashirakon.testarabictextspanning.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv);
        WebView webView = findViewById(R.id.webview);
        CharSequence s = "صِرَاطَ الَّذِیْنَ اَنْعَمْتَ عَلَیْهِمْ ۙ۬ۦ غَیْرِ الْمَغْضُوْبِ عَلَیْهِمْ وَلَا الضَّآلِّیْنَ ۟۠\uF506";
        tv.setText(s);
        webView.loadUrl("file:///android_asset/test.html");
    }
}