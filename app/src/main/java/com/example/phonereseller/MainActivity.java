package com.example.phonereseller;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.Window;
import android.view.WindowManager;
public class MainActivity extends Activity {
 private WebView webView;
 @Override protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState); requestWindowFeature(Window.FEATURE_NO_TITLE);
  getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
  webView = new WebView(this); WebSettings s = webView.getSettings();
  s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setDatabaseEnabled(true); s.setAllowFileAccess(true); s.setLoadsImagesAutomatically(true);
  webView.setWebViewClient(new WebViewClient()); setContentView(webView); webView.loadUrl("file:///android_asset/index.html");
 }
 @Override public void onBackPressed() { if (webView != null && webView.canGoBack()) webView.goBack(); else super.onBackPressed(); }
}
