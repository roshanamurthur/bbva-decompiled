package com.mypinpad.tsdk.isolation;

import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class uj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61322c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public UUID f61323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public byte[] f61324b;

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-463)) + (i10 * 465);
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = ~(i14 | i15);
        int i17 = ~(i14 | i10);
        int i18 = (((~(i10 | i12)) | i17) * 464) + ((i14 | (~i10) | i12) * (-464)) + (((~(i15 | i10)) | i16 | i17) * 464) + i13;
        byte[] bArrCopyOf = null;
        if (i18 == 1) {
            uj ujVar = (uj) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int i19 = f61322c;
            int i20 = i19 & 17;
            int i21 = ((i19 | 17) & (~i20)) + (i20 << 1);
            int i22 = i21 % 128;
            int i23 = i21 % 2;
            ujVar.f61324b = bArr;
            int i24 = i22 & 63;
            int i25 = (i22 ^ 63) | i24;
            int i26 = (i24 & i25) + (i24 | i25);
            f61322c = i26 % 128;
            if (i26 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (i18 == 2) {
            uj ujVar2 = (uj) objArr[0];
            ru ruVar = (ru) objArr[1];
            byte[] bArr2 = (byte[]) objArr[2];
            sa saVar = (sa) objArr[3];
            Intrinsics.checkNotNullParameter(ruVar, "");
            Intrinsics.checkNotNullParameter(bArr2, "");
            Intrinsics.checkNotNullParameter(saVar, "");
            UUID uuid = ujVar2.f61323a;
            byte[] bArr3 = ujVar2.f61324b;
            if (bArr3 != null) {
                bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
            }
            return new rr(ruVar, bArr2, saVar, uuid, bArrCopyOf);
        }
        if (i18 == 3) {
            uj ujVar3 = (uj) objArr[0];
            int i27 = f61322c;
            int i28 = i27 ^ 123;
            int i29 = ((i27 & 123) | i28) << 1;
            int i30 = -i28;
            int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
            int i32 = i31 % 128;
            int i33 = i31 % 2;
            byte[] bArr4 = ujVar3.f61324b;
            if (i33 == 0) {
                int i34 = 59 / 0;
            }
            return bArr4;
        }
        uj ujVar4 = (uj) objArr[0];
        UUID uuid2 = (UUID) objArr[1];
        int i35 = f61322c;
        int i36 = (i35 & 109) + (i35 | 109);
        int i37 = i36 % 128;
        int i38 = i36 % 2;
        ujVar4.f61323a = uuid2;
        if (i38 == 0) {
            int i39 = 75 / 0;
        }
        int i40 = i37 & 91;
        int i41 = i40 + ((i37 ^ 91) | i40);
        f61322c = i41 % 128;
        int i42 = i41 % 2;
        return null;
    }

    public final void setCompoundDrawableTintBlendMode(@Nullable byte[] bArr) {
        setY(new Object[]{this, bArr}, 2027009510, -2027009509, System.identityHashCode(this));
    }

    @NotNull
    public final rr setX(@NotNull ru ruVar, @NotNull byte[] bArr, @NotNull sa saVar) {
        return (rr) setY(new Object[]{this, ruVar, bArr, saVar}, 1616775831, -1616775829, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@Nullable UUID uuid) {
        setY(new Object[]{this, uuid}, -622270376, 622270376, System.identityHashCode(this));
    }

    @Nullable
    public final byte[] setX() {
        return (byte[]) setY(new Object[]{this}, -1124796910, 1124796913, System.identityHashCode(this));
    }
}
