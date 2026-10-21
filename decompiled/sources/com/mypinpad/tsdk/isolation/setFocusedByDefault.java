package com.mypinpad.tsdk.isolation;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setFocusedByDefault {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f59724e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f59725f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f59726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final UUID f59727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final byte[] f59728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final UUID f59729d;

    public setFocusedByDefault(@NotNull byte[] bArr, @NotNull UUID uuid, @NotNull byte[] bArr2, @NotNull UUID uuid2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(uuid2, "");
        this.f59726a = bArr;
        this.f59727b = uuid;
        this.f59728c = bArr2;
        this.f59729d = uuid2;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 965) + ((i10 * (-963)) - 964);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (((~(i10 | i15)) | (~((~i12) | i15))) * (-964)) + ((i14 | (~(i15 | i12))) * (-964)) + i13;
        if (i16 == 1) {
            setFocusedByDefault setfocusedbydefault = (setFocusedByDefault) objArr[0];
            int i17 = f59725f + 71;
            f59724e = i17 % 128;
            int i18 = i17 % 2;
            UUID uuid = setfocusedbydefault.f59727b;
            if (i18 == 0) {
                return uuid;
            }
            int i19 = 34 / 0;
            return uuid;
        }
        if (i16 == 2) {
            setFocusedByDefault setfocusedbydefault2 = (setFocusedByDefault) objArr[0];
            int i20 = f59725f + 69;
            int i21 = i20 % 128;
            f59724e = i21;
            int i22 = i20 % 2;
            byte[] bArr = setfocusedbydefault2.f59726a;
            if (i22 != 0) {
                int i23 = 70 / 0;
            }
            int i24 = i21 ^ 79;
            int i25 = -(-((i21 & 79) << 1));
            int i26 = (i24 & i25) + (i24 | i25);
            f59725f = i26 % 128;
            if (i26 % 2 != 0) {
                return bArr;
            }
            int i27 = 64 / 0;
            return bArr;
        }
        if (i16 != 3) {
            setFocusedByDefault setfocusedbydefault3 = (setFocusedByDefault) objArr[0];
            int i28 = f59725f + 85;
            f59724e = i28 % 128;
            int i29 = i28 % 2;
            byte[] bArr2 = setfocusedbydefault3.f59728c;
            if (i29 == 0) {
                return bArr2;
            }
            int i30 = 41 / 0;
            return bArr2;
        }
        setFocusedByDefault setfocusedbydefault4 = (setFocusedByDefault) objArr[0];
        int i31 = f59724e;
        int i32 = ((i31 ^ 118) + ((i31 & 118) << 1)) - 1;
        int i33 = i32 % 128;
        f59725f = i33;
        int i34 = i32 % 2;
        UUID uuid2 = setfocusedbydefault4.f59729d;
        int i35 = i33 & 37;
        int i36 = (((i33 | 37) & (~i35)) - (~(-(-(i35 << 1))))) - 1;
        f59724e = i36 % 128;
        int i37 = i36 % 2;
        return uuid2;
    }

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setX(new Object[]{this}, 519690448, -519690446, System.identityHashCode(this));
    }

    @NotNull
    public final UUID setOnFocusChangeListener() {
        return (UUID) setX(new Object[]{this}, 109010771, -109010768, System.identityHashCode(this));
    }

    @NotNull
    public final UUID setY() {
        return (UUID) setX(new Object[]{this}, -1383088519, 1383088520, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setX() {
        return (byte[]) setX(new Object[]{this}, 1162022211, -1162022211, System.identityHashCode(this));
    }
}
