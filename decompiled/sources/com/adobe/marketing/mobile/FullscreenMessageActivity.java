package com.adobe.marketing.mobile;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"Registered"})
public class FullscreenMessageActivity extends Activity {
    private static final String TAG = "AndroidFullscreenMessage";
    protected static AndroidFullscreenMessage message;

    private void dismiss() {
        finish();
        overridePendingTransition(0, 0);
    }

    public static void setFullscreenMessage(AndroidFullscreenMessage androidFullscreenMessage) {
        message = androidFullscreenMessage;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        AndroidFullscreenMessage androidFullscreenMessage = message;
        if (androidFullscreenMessage != null) {
            androidFullscreenMessage.dismissed();
        }
        dismiss();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AndroidFullscreenMessage androidFullscreenMessage = message;
        if (androidFullscreenMessage == null) {
            Log.debug(TAG, "%s (message), failed to show the fullscreen message.", "Unexpected Null Value");
            dismiss();
        } else {
            androidFullscreenMessage.messageFullScreenActivity = this;
            requestWindowFeature(1);
            setContentView(new RelativeLayout(this));
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (message == null) {
            Log.debug(TAG, "%s (message), failed to show the fullscreen message.", "Unexpected Null Value");
            dismiss();
            return;
        }
        try {
            final ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
            if (viewGroup == null) {
                Log.debug(TAG, "%s (root view group), failed to show the fullscreen message.", "Unexpected Null Value");
                dismiss();
            } else {
                viewGroup.post(new Runnable() { // from class: com.adobe.marketing.mobile.FullscreenMessageActivity.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AndroidFullscreenMessage androidFullscreenMessage = FullscreenMessageActivity.message;
                        androidFullscreenMessage.rootViewGroup = viewGroup;
                        androidFullscreenMessage.showInRootViewGroup();
                    }
                });
            }
        } catch (NullPointerException e5) {
            Log.error(TAG, "Failed to show the fullscreen message (%s).", e5.toString());
            dismiss();
        }
    }
}
