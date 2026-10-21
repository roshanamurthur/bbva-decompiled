package com.mypinpad.tsdk.isolation;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bÂ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/mypinpad/tsdk/i/f00;", ""}, k = 1, mv = {1, 8, 0})
final class f00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f00 f55459a = new f00();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final AtomicInteger f55460b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55461c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f55462d;

    static {
        int i10 = f55461c + 125;
        f55462d = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Integer a() {
        int i10 = f55462d;
        int i11 = ((((i10 ^ 65) | (i10 & 65)) << 1) - (~(-(((~i10) & 65) | (i10 & (-66)))))) - 1;
        f55461c = i11 % 128;
        int i12 = i11 % 2;
        AtomicInteger atomicInteger = f55460b;
        if (i12 == 0) {
            return Integer.valueOf(atomicInteger.getAndIncrement());
        }
        atomicInteger.getAndIncrement();
        throw null;
    }
}
