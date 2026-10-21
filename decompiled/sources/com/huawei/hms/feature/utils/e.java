package com.huawei.hms.feature.utils;

import android.content.Intent;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50588a = "e";

    public static Intent a(Intent intent) {
        if (intent == null) {
            return null;
        }
        String action = intent.getAction();
        int flags = intent.getFlags();
        String str = f50588a;
        Logger.d(str, "begin to modify, action = " + action + ", flags = " + flags);
        if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action) || "android.media.action.IMAGE_CAPTURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action) || "android.media.action.VIDEO_CAPTURE".equals(action)) {
            intent.setAction("android.intent.action.VIEW");
        }
        intent.setFlags(flags & (-196));
        Logger.d(str, "after modified, action = " + intent.getAction() + ", flags = " + intent.getFlags());
        return intent;
    }
}
