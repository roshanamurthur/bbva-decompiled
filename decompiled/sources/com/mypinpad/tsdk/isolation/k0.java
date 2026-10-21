package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aey f56736a = new aey();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56737b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56738c = 1;

    static {
        new afb();
        int i10 = f56738c;
        int i11 = i10 ^ 19;
        int i12 = ((i10 & 19) | i11) << 1;
        int i13 = -i11;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f56737b = i14 % 128;
        int i15 = i14 % 2;
    }
}
