package com.mypinpad.tsdk.isolation;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes10.dex */
public final class mg {
    public static final Boolean setCompoundDrawableTintBlendMode;
    public static final Boolean setX;
    public static final Boolean setY;

    static {
        a();
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getScrollBarFadeDuration();
        TextUtils.getCapsMode("", 0, 0);
        TextUtils.indexOf((CharSequence) "", '0');
        AudioTrack.getMinVolume();
        ViewConfiguration.getGlobalActionKeyTimeout();
        Boolean bool = Boolean.FALSE;
        setX = bool;
        setY = bool;
        setCompoundDrawableTintBlendMode = bool;
        int i10 = 25 % 128;
        int i11 = 25 % 2;
    }

    public static void a() {
    }
}
