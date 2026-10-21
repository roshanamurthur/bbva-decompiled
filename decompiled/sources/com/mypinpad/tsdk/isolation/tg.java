package com.mypinpad.tsdk.isolation;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/tg;", "", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "setCompoundDrawableTintBlendMode", "()Ljava/util/UUID;", "setY", "", "b", "[B", "()[B", "setOnFocusChangeListener", "c", "setX", "p0", "p1", "p2", "<init>", "(Ljava/util/UUID;[B[B)V"}, k = 1, mv = {1, 8, 0})
public final class tg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f61053d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f61054e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UUID setY;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setOnFocusChangeListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final byte[] setX;

    public tg(@NotNull UUID uuid, @NotNull byte[] bArr, @Nullable byte[] bArr2) {
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.setY = uuid;
        this.setOnFocusChangeListener = bArr;
        this.setX = bArr2;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (((~(i14 | i12)) | (~(i13 | i14)) | (~(i13 | i12))) * (-880)) + (i11 * 881) + (i10 * 881);
        int i16 = i11 | (~(i13 | (~i12)));
        int i17 = ~(i10 | i12);
        int i18 = (i17 * 880) + ((i16 | i17) * (-880)) + i15;
        if (i18 == 1) {
            tg tgVar = (tg) objArr[0];
            int i19 = f61054e;
            int i20 = i19 ^ 93;
            int i21 = ((((i19 & 93) | i20) << 1) - (~(-i20))) - 1;
            int i22 = i21 % 128;
            f61053d = i22;
            int i23 = i21 % 2;
            obj = tgVar.setOnFocusChangeListener;
            if (i23 != 0) {
                throw null;
            }
            int i24 = i22 & 37;
            int i25 = -(-(i22 | 37));
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            f61054e = i26 % 128;
            int i27 = i26 % 2;
        } else if (i18 != 2) {
            tg tgVar2 = (tg) objArr[0];
            int i28 = f61053d;
            int i29 = (i28 ^ 77) + ((i28 & 77) << 1);
            int i30 = i29 % 128;
            f61054e = i30;
            int i31 = i29 % 2;
            obj = tgVar2.setX;
            int i32 = i30 + 51;
            f61053d = i32 % 128;
            if (i32 % 2 != 0) {
                int i33 = 96 / 0;
            }
        } else {
            tg tgVar3 = (tg) objArr[0];
            int i34 = f61054e;
            int i35 = i34 & 5;
            int i36 = ((i34 | 5) & (~i35)) + (i35 << 1);
            int i37 = i36 % 128;
            f61053d = i37;
            int i38 = i36 % 2;
            obj = tgVar3.setY;
            if (i38 != 0) {
                int i39 = 43 / 0;
            }
            int i40 = i37 + 89;
            f61054e = i40 % 128;
            if (i40 % 2 == 0) {
                throw null;
            }
        }
        return obj;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final UUID setCompoundDrawableTintBlendMode() {
        return (UUID) setDividerPadding(new Object[]{this}, -453668006, 453668008, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @Nullable
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, 293781792, -293781792, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final byte[] setY() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1067077603, 1067077604, System.identityHashCode(this));
    }
}
