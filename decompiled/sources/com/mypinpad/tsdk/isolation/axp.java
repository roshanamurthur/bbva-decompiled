package com.mypinpad.tsdk.isolation;

import com.vierge.bluetoothlibrary.BluetoothState;

/* JADX INFO: loaded from: classes10.dex */
public final class axp implements awd {
    public static final axp setX = new axp(17669, 46, BluetoothState.REQUEST_CONNECT_DEVICE, 16);
    public static final axp setOnFocusChangeListener = new axp(35851, 56, 640, 24);
    public static final axp setDividerPadding = new axp(57637, 90, 640, 32);

    public axp(int i10, int i11, int i12, int i13) {
        int i14 = i11 * i12;
        int i15 = i12 / 128;
        e2.a(new Object[]{Integer.valueOf(i10)}, -188087916, 188087917, i10).intValue();
        e2.a(new Object[]{Integer.valueOf(i10)}, -2073624404, 2073624404, i10).intValue();
        e2.a(new Object[]{Integer.valueOf(i13)}, -188087916, 188087917, i13).intValue();
        e2.a(new Object[]{Integer.valueOf(i11)}, -188087916, 188087917, i11).intValue();
        e2.a(new Object[]{Integer.valueOf(i14)}, -2073624404, 2073624404, i14).intValue();
        e2.a(new Object[]{Integer.valueOf(i14)}, -188087916, 188087917, i14).intValue();
        e2.a(new Object[]{Integer.valueOf(i11)}, -188087916, 188087917, i11).intValue();
        long j10 = ((long) i10) % 64;
    }
}
