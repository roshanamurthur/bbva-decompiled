package com.visa.internal;

import android.content.Context;
import android.os.Vibrator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class vsb2 implements tsam7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f68046a;

    @Override // com.visa.internal.tsam7
    public final void a() {
    }

    @Override // com.visa.internal.tsam7
    public final void a(irts6 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f68046a = config.f68033d;
    }

    public final void a(Context context, Function0 function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f68046a) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(new long[]{0, 102, 48, 114, 179, 84, 60, 90}, -1);
            }
        }
    }
}
