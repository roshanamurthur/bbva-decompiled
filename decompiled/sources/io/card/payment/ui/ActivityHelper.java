package io.card.payment.ui;

import android.R;
import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public class ActivityHelper {
    @TargetApi(11)
    public static void addActionBarIfSupported(Activity activity) {
        activity.requestWindowFeature(8);
    }

    public static boolean holoSupported() {
        return true;
    }

    @TargetApi(11)
    public static void setActivityTheme(Activity activity, boolean z10) {
        if (z10 && activity.getApplicationInfo().theme != 0) {
            activity.setTheme(activity.getApplicationInfo().theme);
        } else if (holoSupported()) {
            activity.setTheme(R.style.Theme.Holo.Light);
        } else {
            activity.setTheme(R.style.Theme.Light);
        }
    }

    @TargetApi(11)
    public static void setFlagSecure(Activity activity) {
        activity.getWindow().addFlags(8192);
    }

    public static void setupActionBarIfSupported(Activity activity, TextView textView, String str, String str2, Drawable drawable) {
        if (str2 == null) {
            str2 = "";
        }
        activity.setTitle(str2 + str);
        if (activity.getActionBar() == null) {
            if (textView != null) {
                textView.setText(str);
                return;
            }
            return;
        }
        ActionBar actionBar = activity.getActionBar();
        actionBar.setBackgroundDrawable(Appearance.ACTIONBAR_BACKGROUND);
        actionBar.setTitle(str);
        TextView textView2 = (TextView) activity.findViewById(Resources.getSystem().getIdentifier("action_bar_title", "id", "android"));
        if (textView2 != null) {
            textView2.setTextColor(-1);
        }
        actionBar.setDisplayHomeAsUpEnabled(false);
        if (drawable != null) {
            actionBar.setIcon(drawable);
        } else {
            actionBar.setDisplayShowHomeEnabled(false);
        }
        if (textView != null) {
            textView.setVisibility(8);
        }
    }
}
