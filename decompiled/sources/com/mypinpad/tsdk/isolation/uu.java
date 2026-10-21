package com.mypinpad.tsdk.isolation;

import java.util.Calendar;

/* JADX INFO: loaded from: classes10.dex */
public final class uu {
    public static final long setOnFocusChangeListener() {
        return ((Long) setY(new Object[0], 2036213809, -2036213809, (int) System.currentTimeMillis())).longValue();
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        return Long.valueOf(Calendar.getInstance().getTimeInMillis() / 1000);
    }
}
