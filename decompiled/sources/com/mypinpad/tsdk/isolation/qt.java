package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class qt {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57986d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57987e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f57988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<String> f57989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<String> f57990c;

    public qt(long j10, long j11, @Nullable String str, @NotNull List<String> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.f57988a = str;
        this.f57989b = list;
        this.f57990c = list2;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~(i10 | i12)) * 216) + (i11 * (-215)) + (i10 * 217);
        int i14 = (~i11) | i10;
        int i15 = ~i12;
        int i16 = (((~(i10 | i15)) | i11) * 216) + ((i14 | i15) * (-216)) + i13;
        if (i16 == 1) {
            qt qtVar = (qt) objArr[0];
            int i17 = f57987e;
            int i18 = ((i17 & 92) + (i17 | 92)) - 1;
            f57986d = i18 % 128;
            int i19 = i18 % 2;
            String str = qtVar.f57988a;
            if (i19 == 0) {
                return str;
            }
            throw null;
        }
        if (i16 != 2) {
            qt qtVar2 = (qt) objArr[0];
            int i20 = f57986d;
            int i21 = ((i20 | 25) << 1) - (i20 ^ 25);
            f57987e = i21 % 128;
            int i22 = i21 % 2;
            List<String> list = qtVar2.f57990c;
            if (i22 != 0) {
                return list;
            }
            throw null;
        }
        qt qtVar3 = (qt) objArr[0];
        int i23 = f57986d;
        int i24 = ((-1) << 1) - (((i23 & 54) + (i23 | 54)) ^ (-1));
        f57987e = i24 % 128;
        int i25 = i24 % 2;
        List<String> list2 = qtVar3.f57989b;
        int i26 = i23 & 15;
        int i27 = (i23 | 15) & (~i26);
        int i28 = i26 << 1;
        int i29 = (i27 & i28) + (i27 | i28);
        f57987e = i29 % 128;
        int i30 = i29 % 2;
        return list2;
    }

    @Nullable
    public final String setDividerPadding() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 633516041, -633516040, System.identityHashCode(this));
    }

    @NotNull
    public final List<String> setX() {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, 615385835, -615385835, System.identityHashCode(this));
    }

    @NotNull
    public final List<String> setY() {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, 893873829, -893873827, System.identityHashCode(this));
    }
}
