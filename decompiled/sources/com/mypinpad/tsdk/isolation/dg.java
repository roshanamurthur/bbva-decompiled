package com.mypinpad.tsdk.isolation;

import com.google.android.gms.wearable.WearableStatusCodes;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\bX\u0007¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0007¢\u0006\u0006\n\u0004\b\f\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/dg;", "Lcom/mypinpad/tsdk/i/dl;", "Lcom/mypinpad/tsdk/i/setContentDescription;", "p0", "", "setX", "(Lcom/mypinpad/tsdk/i/setContentDescription;)Z", "setCompoundDrawableTintBlendMode", "", "h", "[B", "()[B", "setDividerPadding", "", "i", "B", "()B", "setY"}, k = 1, mv = {1, 5, 1})
public final class dg extends dl {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f55181j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f55182k = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setDividerPadding;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final byte setY;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @Nullable
    public byte[] setX;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @Nullable
    public byte[] setCompoundDrawableTintBlendMode;

    public dg(byte[] bArr, byte b10, byte[] bArr2, byte[] bArr3, byte b11, byte b12, byte[] bArr4, byte[] bArr5, byte[] bArr6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        b11 = (i10 & 16) != 0 ? (byte) 1 : b11;
        b12 = (i10 & 32) != 0 ? (byte) 1 : b12;
        bArr4 = (i10 & 64) != 0 ? null : bArr4;
        bArr6 = (i10 & 256) != 0 ? null : bArr6;
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        Intrinsics.checkNotNullParameter(bArr5, "");
        this.setDividerPadding = bArr;
        this.setY = b10;
        this.setX = bArr4;
        this.setCompoundDrawableTintBlendMode = bArr6;
        dl.setCompoundDrawableTintBlendMode(new Object[]{this, Byte.valueOf(b11)}, -1763141630, 1763141638, System.identityHashCode(this));
        dl.setCompoundDrawableTintBlendMode(new Object[]{this, Byte.valueOf(b12)}, -1828525294, 1828525303, System.identityHashCode(this));
        dl.setCompoundDrawableTintBlendMode(new Object[]{this, bArr2}, -2023844664, 2023844664, System.identityHashCode(this));
        dl.setCompoundDrawableTintBlendMode(new Object[]{this, bArr3}, 849699746, -849699741, System.identityHashCode(this));
        dl.setCompoundDrawableTintBlendMode(new Object[]{this, bArr5}, 454696279, -454696269, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0167  */
    /* JADX WARN: Code duplicated, block: B:33:0x0183  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = (((~(i10 | i11)) | (~(i12 | i13))) * 433) + (((~((~i11) | i12)) | i13) * (-433)) + ((~((~i12) | i13 | i11)) * 433) + (i11 * 434) + (i10 * (-432));
        if (i14 == 1) {
            dg dgVar = (dg) objArr[0];
            setContentDescription setcontentdescription = (setContentDescription) objArr[1];
            int i15 = f55182k;
            int i16 = ((i15 & (-88)) | ((~i15) & 87)) + ((i15 & 87) << 1);
            f55181j = i16 % 128;
            int i17 = i16 % 2;
            Intrinsics.checkNotNullParameter(setcontentdescription, "");
            copy copyVar = copy.INSTANCE;
            byte[] bArr = (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dgVar}, 298274011, -298274005, System.identityHashCode(dgVar));
            Intrinsics.checkNotNull(bArr);
            boolean zBooleanValue = ((Boolean) dl.setCompoundDrawableTintBlendMode(new Object[]{setcontentdescription, (TransactionCompleted) copy.setOnFocusChangeListener(new Object[]{copyVar, bArr}, -1611367294, 1611367299, System.identityHashCode(copyVar))}, -2005943015, 2005943018, (int) System.currentTimeMillis())).booleanValue();
            int i18 = f55181j;
            int i19 = i18 | 11;
            int i20 = i19 << 1;
            int i21 = -((~(i18 & 11)) & i19);
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f55182k = i22 % 128;
            if (i22 % 2 != 0) {
                return Boolean.valueOf(zBooleanValue);
            }
            throw null;
        }
        if (i14 == 2) {
            dg dgVar2 = (dg) objArr[0];
            int i23 = f55181j;
            int i24 = (((i23 | 126) << 1) - (i23 ^ 126)) - 1;
            int i25 = i24 % 128;
            f55182k = i25;
            int i26 = i24 % 2;
            byte[] bArr2 = dgVar2.setDividerPadding;
            if (i26 == 0) {
                throw null;
            }
            int i27 = (i25 & 37) + (i25 | 37);
            f55181j = i27 % 128;
            int i28 = i27 % 2;
            return bArr2;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                dg dgVar3 = (dg) objArr[0];
                int i29 = f55182k;
                int i30 = i29 & 49;
                int i31 = (i29 ^ 49) | i30;
                int i32 = (i30 & i31) + (i30 | i31);
                f55181j = i32 % 128;
                int i33 = i32 % 2;
                byte b10 = dgVar3.setY;
                int i34 = i29 + 119;
                f55181j = i34 % 128;
                if (i34 % 2 == 0) {
                    return Byte.valueOf(b10);
                }
                throw null;
            }
            dg dgVar4 = (dg) objArr[0];
            int i35 = f55182k;
            int i36 = i35 & 15;
            int i37 = ((((i35 ^ 15) | i36) << 1) - (~(-((i35 | 15) & (~i36))))) - 1;
            int i38 = i37 % 128;
            f55181j = i38;
            if (i37 % 2 != 0) {
                byte[] bArr3 = dgVar4.setCompoundDrawableTintBlendMode;
                throw null;
            }
            byte[] bArr4 = dgVar4.setCompoundDrawableTintBlendMode;
            if (bArr4 == null) {
                int i39 = i38 + 13;
                f55182k = i39 % 128;
                int i40 = i39 % 2;
                return Boolean.TRUE;
            }
            boolean zBooleanValue2 = ((Boolean) dl.setCompoundDrawableTintBlendMode(new Object[]{ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus((byte[]) setX(new Object[]{dgVar4}, 1618145048, -1618145046, System.identityHashCode(dgVar4)), new byte[]{((Byte) setX(new Object[]{dgVar4}, 696526760, -696526756, System.identityHashCode(dgVar4))).byteValue()}), (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dgVar4}, -2004011430, 2004011432, System.identityHashCode(dgVar4))), (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dgVar4}, -2055662065, 2055662076, System.identityHashCode(dgVar4))), bArr4}, -2112094012, 2112094019, (int) System.currentTimeMillis())).booleanValue();
            int i41 = f55182k;
            int i42 = ((i41 | 105) << 1) - (i41 ^ 105);
            f55181j = i42 % 128;
            if (i42 % 2 != 0) {
                int i43 = 14 / 0;
            }
            return Boolean.valueOf(zBooleanValue2);
        }
        dg dgVar5 = (dg) objArr[0];
        setContentDescription setcontentdescription2 = (setContentDescription) objArr[1];
        int i44 = f55181j + 75;
        f55182k = i44 % 128;
        if (i44 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setcontentdescription2, "");
            int i45 = 9 / 0;
            if (((Boolean) setX(new Object[]{dgVar5}, 438989034, -438989034, System.identityHashCode(dgVar5))).booleanValue()) {
                if (((Boolean) setX(new Object[]{dgVar5, setcontentdescription2}, 1394609679, -1394609678, System.identityHashCode(dgVar5))).booleanValue()) {
                    int i46 = f55181j;
                    int i47 = (-2) - (((i46 & 54) + (i46 | 54)) ^ (-1));
                    f55182k = i47 % 128;
                    int i48 = i47 % 2;
                    int i49 = i46 & 101;
                    int i50 = (i46 | 101) & (~i49);
                    int i51 = i49 << 1;
                    int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
                    int i53 = i52 % 128;
                    f55182k = i53;
                    int i54 = i52 % 2;
                    int i55 = i53 & 21;
                    int i56 = i53 | 21;
                    int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                    f55181j = i57 % 128;
                    int i58 = i57 % 2;
                    return Boolean.TRUE;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(setcontentdescription2, "");
            if (((Boolean) setX(new Object[]{dgVar5}, 438989034, -438989034, System.identityHashCode(dgVar5))).booleanValue()) {
                if (((Boolean) setX(new Object[]{dgVar5, setcontentdescription2}, 1394609679, -1394609678, System.identityHashCode(dgVar5))).booleanValue()) {
                    int i410 = f55181j;
                    int i411 = (-2) - (((i410 & 54) + (i410 | 54)) ^ (-1));
                    f55182k = i411 % 128;
                    int i412 = i411 % 2;
                    int i413 = i410 & 101;
                    int i59 = (i410 | 101) & (~i413);
                    int i510 = i413 << 1;
                    int i511 = (i59 ^ i510) + ((i59 & i510) << 1);
                    int i512 = i511 % 128;
                    f55182k = i512;
                    int i513 = i511 % 2;
                    int i514 = i512 & 21;
                    int i515 = i512 | 21;
                    int i516 = (i514 ^ i515) + ((i515 & i514) << 1);
                    f55181j = i516 % 128;
                    int i517 = i516 % 2;
                    return Boolean.TRUE;
                }
            }
        }
        int i60 = f55182k;
        int i61 = i60 & 101;
        int i62 = (i61 - (~((i60 ^ 101) | i61))) - 1;
        f55181j = i62 % 128;
        int i63 = i62 % 2;
        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
        StringBuilder sb2 = new StringBuilder("Invalid public key certificate: RID: ");
        sb2.append((String) setInputExtras.setDividerPadding(new Object[]{(byte[]) setX(new Object[]{dgVar5}, 1618145048, -1618145046, System.identityHashCode(dgVar5))}, 1609250238, -1609250236, (int) System.currentTimeMillis()));
        sb2.append(", index: ");
        sb2.append((String) getPinPadLandscape.setY(new Object[]{Byte.valueOf(((Byte) setX(new Object[]{dgVar5}, 696526760, -696526756, System.identityHashCode(dgVar5))).byteValue())}, 1862949367, -1862949363, (int) System.currentTimeMillis()));
        SouthPacificEndpoint.setX(new Object[]{sb2.toString()}, 818541572, -818541572, (int) System.currentTimeMillis());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(setInputExtras.setOnFocusChangeListener((byte[]) setX(new Object[]{dgVar5}, 1618145048, -1618145046, System.identityHashCode(dgVar5))));
        sb3.append(AbstractJsonLexerKt.COLON);
        sb3.append(getPinPadLandscape.setX(((Byte) setX(new Object[]{dgVar5}, 696526760, -696526756, System.identityHashCode(dgVar5))).byteValue()));
        throw new setIndeterminateDrawable(WearableStatusCodes.ASSET_UNAVAILABLE, sb3.toString(), null, 4, null);
    }

    public final boolean setCompoundDrawableTintBlendMode(@NotNull setContentDescription p4) {
        return ((Boolean) setX(new Object[]{this, p4}, 1394609679, -1394609678, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setX(new Object[]{this}, 1618145048, -1618145046, System.identityHashCode(this));
    }

    public final boolean setX(@NotNull setContentDescription p4) {
        return ((Boolean) setX(new Object[]{this, p4}, 981690615, -981690612, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setX")
    public final byte setX() {
        return ((Byte) setX(new Object[]{this}, 696526760, -696526756, System.identityHashCode(this))).byteValue();
    }
}
