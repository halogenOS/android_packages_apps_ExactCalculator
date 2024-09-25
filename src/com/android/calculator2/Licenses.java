package com.android.calculator2;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;

public class Licenses extends BaseActivity {

    private static final String LICENSE_URL = "file:///android_asset/licenses.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_licenses);
        setupInsets(findViewById(R.id.main_layout));

        final WebView webView = findViewById(R.id.webview);
        webView.loadUrl(LICENSE_URL);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
