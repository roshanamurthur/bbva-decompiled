package com.salesforce.marketingcloud;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public class MCReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f63739a = "com.salesforce.marketingcloud.WAKE_FOR_ALARM";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63740b = "alarmName";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f63741c = g.a("MCReceiver");

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Intent a(@NonNull Context context, String str) {
        return new Intent(context, (Class<?>) MCReceiver.class).setAction(context.getApplicationContext().getPackageName() + ".com.salesforce.marketingcloud.WAKE_FOR_ALARM").putExtra(f63740b, str);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            g.a(f63741c, "Action was empty %s", intent.toString());
        }
        String strReplaceFirst = action.replaceFirst(context.getApplicationContext().getPackageName() + Constant.DOT_STRING, "");
        g.d(f63741c, "onReceive with action: %s", strReplaceFirst);
        strReplaceFirst.getClass();
        switch (strReplaceFirst) {
            case "android.intent.action.AIRPLANE_MODE":
            case "android.intent.action.TIMEZONE_CHANGED":
            case "android.intent.action.BOOT_COMPLETED":
            case "android.intent.action.MY_PACKAGE_REPLACED":
            case "android.intent.action.ACTION_SHUTDOWN":
                com.salesforce.marketingcloud.behaviors.a aVarA = com.salesforce.marketingcloud.behaviors.a.a(strReplaceFirst);
                if (aVarA != null) {
                    MCService.a(context, aVarA, intent.getExtras());
                    break;
                }
                break;
            case "com.salesforce.marketingcloud.WAKE_FOR_ALARM":
                MCService.a(context, intent.getStringExtra(f63740b));
                break;
        }
    }
}
