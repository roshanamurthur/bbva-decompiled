package com.mypinpad.tsdk.isolation;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class zh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f62357b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f62358c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet f62359a = new LinkedHashSet();

    public final synchronized boolean setCompoundDrawableTintBlendMode(@NotNull yp ypVar) {
        boolean zContains;
        int i10 = f62358c;
        int i11 = i10 & 101;
        int i12 = (i10 ^ 101) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f62357b = i13 % 128;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(ypVar, "");
            this.f62359a.contains(ypVar);
            throw null;
        }
        Intrinsics.checkNotNullParameter(ypVar, "");
        zContains = this.f62359a.contains(ypVar);
        int i14 = f62357b + 23;
        f62358c = i14 % 128;
        int i15 = i14 % 2;
        return zContains;
    }

    public final synchronized void setOnFocusChangeListener(@NotNull yp ypVar) {
        int i10 = f62357b;
        int i11 = i10 & 121;
        int i12 = (i11 - (~((i10 ^ 121) | i11))) - 1;
        f62358c = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(ypVar, "");
        this.f62359a.remove(ypVar);
        int i14 = f62358c + 81;
        f62357b = i14 % 128;
        int i15 = i14 % 2;
    }

    public final synchronized void setY(@NotNull yp ypVar) {
        int i10 = f62357b;
        int i11 = ((i10 ^ 20) + ((i10 & 20) << 1)) - 1;
        f62358c = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(ypVar, "");
            this.f62359a.add(ypVar);
            throw null;
        }
        Intrinsics.checkNotNullParameter(ypVar, "");
        this.f62359a.add(ypVar);
        int i12 = f62357b;
        int i13 = i12 & 53;
        int i14 = ((i12 | 53) & (~i13)) + (i13 << 1);
        f62358c = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 55 / 0;
            return;
        }
        return;
        throw th;
    }
}
