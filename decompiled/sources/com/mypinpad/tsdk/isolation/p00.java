package com.mypinpad.tsdk.isolation;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bÂ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/mypinpad/tsdk/i/p00;", ""}, k = 1, mv = {1, 8, 0})
final class p00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p00 f57615a = new p00();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final AtomicInteger f57616b = new AtomicInteger(0);

    static {
        int i10 = 105 << 1;
        int i11 = -(105 & (~0));
        int i12 = (i10 & i11) + (i11 | i10);
        int i13 = i12 % 128;
        int i14 = i12 % 2;
    }
}
