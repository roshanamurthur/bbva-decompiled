package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.math.BigInteger;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0014\b&\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b \u0010!J!\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\b\u0010\u0007J!\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\nH\u0004¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\u00020\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\b\u001a\u00020\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\"\u0010\u0016\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u0012\u0010\u001bR\"\u0010\u000b\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u0016\u0010\u001bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b\b\u0010\u001b"}, d2 = {"Lcom/mypinpad/tsdk/i/dl;", "", "", "p0", "p1", "", "setDividerPadding", "([B[B)Z", "setX", "Lcom/mypinpad/tsdk/i/setContentDescription;", "Lcom/mypinpad/tsdk/i/TransactionCompleted;", "setY", "(Lcom/mypinpad/tsdk/i/setContentDescription;Lcom/mypinpad/tsdk/i/TransactionCompleted;)Z", "", "a", "B", "setTextAlignment", "()B", "setCompoundDrawableTintBlendMode", "(B)V", "b", "UiMessageCallbackKtWhenMappings", "setOnFocusChangeListener", "c", "[B", "setIncludeFontPadding", "()[B", "([B)V", "d", "setZ", "e", "setAlwaysDrawnWithCacheEnabled", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public abstract class dl {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f55216f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f55217g = 1;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public byte setDividerPadding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public byte setX;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public byte[] setOnFocusChangeListener = new byte[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public byte[] setY = new byte[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public byte[] setCompoundDrawableTintBlendMode;

    static {
        int i10 = f55217g;
        int i11 = (((i10 ^ 25) | (i10 & 25)) << 1) - (((~i10) & 25) | (i10 & (-26)));
        f55216f = i11 % 128;
        int i12 = i11 % 2;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13;
        int i14 = ~i10;
        int i15 = (((~((~i11) | i12)) | i14) * (-433)) + ((~((~i12) | i14 | i11)) * 433) + (i11 * 434) + (i10 * (-432));
        int i16 = ~(i12 | i14);
        boolean z10 = false;
        switch ((((~(i10 | i11)) | i16) * 433) + i15) {
            case 1:
                dl dlVar = (dl) objArr[0];
                int i17 = f55216f;
                int i18 = ((i17 | 8) << 1) - (i17 ^ 8);
                int i19 = (i18 ^ (-1)) + (i18 << 1);
                f55217g = i19 % 128;
                int i20 = i19 % 2;
                byte b10 = dlVar.setDividerPadding;
                if (i20 == 0) {
                    throw null;
                }
                int i21 = (i17 & 119) + (i17 | 119);
                f55217g = i21 % 128;
                if (i21 % 2 == 0) {
                    int i22 = 13 / 0;
                }
                objValueOf = Byte.valueOf(b10);
                break;
                break;
            case 2:
                dl dlVar2 = (dl) objArr[0];
                int i23 = f55216f;
                int i24 = (i23 ^ 73) + ((i23 & 73) << 1);
                f55217g = i24 % 128;
                int i25 = i24 % 2;
                objValueOf = dlVar2.setOnFocusChangeListener;
                int i26 = i23 & 121;
                int i27 = ((i23 | 121) & (~i26)) + (i26 << 1);
                f55217g = i27 % 128;
                if (i27 % 2 == 0) {
                    throw null;
                }
                break;
            case 3:
                setContentDescription setcontentdescription = (setContentDescription) objArr[0];
                TransactionCompleted transactionCompleted = (TransactionCompleted) objArr[1];
                int i28 = f55216f;
                int i29 = i28 & 111;
                int i30 = (i28 ^ 111) | i29;
                int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                f55217g = i31 % 128;
                if (i31 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setcontentdescription, "");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(setcontentdescription, "");
                if (transactionCompleted == null) {
                    int i32 = f55216f + 7;
                    int i33 = i32 % 128;
                    f55217g = i33;
                    z10 = i32 % 2 != 0;
                    int i34 = (((i33 ^ 25) | (i33 & 25)) << 1) - (((~i33) & 25) | (i33 & (-26)));
                    f55216f = i34 % 128;
                    int i35 = i34 % 2;
                } else if (((Integer) TransactionCompleted.setX(new Object[]{transactionCompleted, setcontentdescription.setCompoundDrawableTintBlendMode()}, -354590257, 354590260, System.identityHashCode(transactionCompleted))).intValue() < 0) {
                    int i36 = f55216f;
                    int i37 = ((i36 ^ 77) - (~((i36 & 77) << 1))) - 1;
                    f55217g = i37 % 128;
                    if (i37 % 2 == 0) {
                        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{"Error: Trying to use an expired issuer public key"}, -34485176, 34485177, (int) System.currentTimeMillis());
                        z10 = true;
                    } else {
                        SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{"Error: Trying to use an expired issuer public key"}, -34485176, 34485177, (int) System.currentTimeMillis());
                    }
                    int i38 = f55216f;
                    int i39 = (i38 & 97) + (i38 | 97);
                    f55217g = i39 % 128;
                    if (i39 % 2 == 0) {
                        throw null;
                    }
                } else {
                    int i40 = f55217g;
                    int i41 = i40 & 29;
                    int i42 = ((i40 ^ 29) | i41) << 1;
                    int i43 = -((i40 | 29) & (~i41));
                    int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                    f55216f = i44 % 128;
                    if (i44 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Boolean.TRUE;
                }
                objValueOf = Boolean.valueOf(z10);
                break;
                break;
            case 4:
                dl dlVar3 = (dl) objArr[0];
                int i45 = f55216f;
                int i46 = ((i45 & 115) - (~(i45 | 115))) - 1;
                int i47 = i46 % 128;
                f55217g = i47;
                int i48 = i46 % 2;
                byte b11 = dlVar3.setX;
                int i49 = ((i47 | 21) << 1) - (i47 ^ 21);
                f55216f = i49 % 128;
                if (i49 % 2 != 0) {
                    int i50 = 75 / 0;
                }
                objValueOf = Byte.valueOf(b11);
                break;
            case 5:
                dl dlVar4 = (dl) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int i51 = f55217g;
                int i52 = i51 & 49;
                int i53 = i52 + ((i51 ^ 49) | i52);
                f55216f = i53 % 128;
                if (i53 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(bArr, "");
                    dlVar4.setY = bArr;
                    int i54 = 85 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(bArr, "");
                    dlVar4.setY = bArr;
                }
                int i55 = f55216f;
                int i56 = ((i55 ^ 89) | (i55 & 89)) << 1;
                int i57 = -(((~i55) & 89) | (i55 & (-90)));
                int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
                f55217g = i58 % 128;
                int i59 = i58 % 2;
                return null;
            case 6:
                dl dlVar5 = (dl) objArr[0];
                int i60 = f55216f;
                int i61 = i60 & 31;
                int i62 = ((i60 | 31) & (~i61)) + (i61 << 1);
                f55217g = i62 % 128;
                if (i62 % 2 != 0) {
                    return dlVar5.setCompoundDrawableTintBlendMode;
                }
                byte[] bArr2 = dlVar5.setCompoundDrawableTintBlendMode;
                throw null;
            case 7:
                byte[] bArr3 = (byte[]) objArr[0];
                byte[] bArr4 = (byte[]) objArr[1];
                int i63 = f55216f;
                int i64 = (((i63 | 26) << 1) - (i63 ^ 26)) - 1;
                f55217g = i64 % 128;
                if (i64 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(bArr3, "");
                    Intrinsics.checkNotNullParameter(bArr4, "");
                    return Boolean.valueOf(Arrays.equals(bArr4, (byte[]) dy.setDividerPadding(new Object[]{bArr3}, 504323118, -504323118, (int) System.currentTimeMillis())));
                }
                Intrinsics.checkNotNullParameter(bArr3, "");
                Intrinsics.checkNotNullParameter(bArr4, "");
                Arrays.equals(bArr4, (byte[]) dy.setDividerPadding(new Object[]{bArr3}, 504323118, -504323118, (int) System.currentTimeMillis()));
                throw null;
            case 8:
                dl dlVar6 = (dl) objArr[0];
                byte bByteValue = ((Byte) objArr[1]).byteValue();
                int i65 = f55216f;
                int i66 = i65 & 51;
                int i67 = (i66 - (~(-(-((i65 ^ 51) | i66))))) - 1;
                int i68 = i67 % 128;
                f55217g = i68;
                int i69 = i67 % 2;
                dlVar6.setDividerPadding = bByteValue;
                int i70 = i68 & 91;
                int i71 = ((i68 ^ 91) | i70) << 1;
                int i72 = -((~i70) & (i68 | 91));
                int i73 = ((i71 | i72) << 1) - (i71 ^ i72);
                f55216f = i73 % 128;
                if (i73 % 2 == 0) {
                    return null;
                }
                int i74 = 16 / 0;
                return null;
            case 9:
                dl dlVar7 = (dl) objArr[0];
                byte bByteValue2 = ((Byte) objArr[1]).byteValue();
                int i75 = f55217g;
                int i76 = (i75 ^ 97) + ((i75 & 97) << 1);
                f55216f = i76 % 128;
                int i77 = i76 % 2;
                dlVar7.setX = bByteValue2;
                if (i77 != 0) {
                    throw null;
                }
                int i78 = i75 & 103;
                int i79 = i78 + ((i75 ^ 103) | i78);
                f55216f = i79 % 128;
                int i80 = i79 % 2;
                return null;
            case 10:
                dl dlVar8 = (dl) objArr[0];
                byte[] bArr5 = (byte[]) objArr[1];
                int i81 = f55217g;
                int i82 = i81 & 11;
                int i83 = (i81 ^ 11) | i82;
                int i84 = (i82 & i83) + (i83 | i82);
                int i85 = i84 % 128;
                f55216f = i85;
                int i86 = i84 % 2;
                dlVar8.setCompoundDrawableTintBlendMode = bArr5;
                int i87 = (i85 ^ 59) + ((i85 & 59) << 1);
                f55217g = i87 % 128;
                if (i87 % 2 != 0) {
                    return null;
                }
                throw null;
            case 11:
                dl dlVar9 = (dl) objArr[0];
                int i88 = f55216f;
                int i89 = (i88 & (-108)) | ((~i88) & 107);
                int i90 = (i88 & 107) << 1;
                int i91 = (i89 & i90) + (i90 | i89);
                f55217g = i91 % 128;
                if (i91 % 2 != 0) {
                    return dlVar9.setY;
                }
                byte[] bArr6 = dlVar9.setY;
                throw null;
            case 12:
                byte[] bArr7 = (byte[]) objArr[0];
                byte[] bArr8 = (byte[]) objArr[1];
                int i92 = f55217g;
                int i93 = ((((i92 ^ 67) | (i92 & 67)) << 1) - (~(-(((~i92) & 67) | (i92 & (-68)))))) - 1;
                f55216f = i93 % 128;
                int i94 = i93 % 2;
                Intrinsics.checkNotNullParameter(bArr8, "");
                if (bArr7 == null) {
                    int i95 = f55217g;
                    int i96 = i95 ^ 63;
                    int i97 = -(-((i95 & 63) << 1));
                    int i98 = (i96 & i97) + (i97 | i96);
                    int i99 = i98 % 128;
                    f55216f = i99;
                    int i100 = i98 % 2;
                    int i101 = (i99 & (-8)) | ((~i99) & 7);
                    int i102 = -(-((i99 & 7) << 1));
                    i13 = ((i101 | i102) << 1) - (i102 ^ i101);
                    f55217g = i13 % 128;
                } else {
                    byte[] bArr9 = (byte[]) setInputExtras.setDividerPadding(new Object[]{bArr8}, -888564661, 888564675, (int) System.currentTimeMillis());
                    if (bArr7.length < bArr9.length) {
                        int i103 = f55216f;
                        int i104 = i103 & 37;
                        int i105 = -(-((i103 ^ 37) | i104));
                        int i106 = (i104 ^ i105) + ((i105 & i104) << 1);
                        int i107 = i106 % 128;
                        f55217g = i107;
                        int i108 = i106 % 2;
                        int i109 = ((i107 ^ 23) | (i107 & 23)) << 1;
                        int i110 = -(((~i107) & 23) | (i107 & (-24)));
                        i13 = (i109 ^ i110) + ((i110 & i109) << 1);
                        f55216f = i13 % 128;
                    } else {
                        byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.slice(bArr7, ArraysKt___ArraysKt.getIndices(bArr9)));
                        byte b12 = bArr9[ArraysKt___ArraysKt.getLastIndex(bArr9)];
                        if (((byte) (b12 & 15)) == 15) {
                            int i111 = f55217g;
                            int i112 = ((i111 ^ 94) + ((i111 & 94) << 1)) - 1;
                            f55216f = i112 % 128;
                            int i113 = i112 % 2;
                            byteArray[ArraysKt___ArraysKt.getLastIndex(byteArray)] = (byte) (byteArray[ArraysKt___ArraysKt.getLastIndex(byteArray)] & Constants.CVR_B2b8765_1111_APP_DISABLED);
                            bArr9[ArraysKt___ArraysKt.getLastIndex(bArr9)] = (byte) (b12 & Constants.CVR_B2b8765_1111_APP_DISABLED);
                            int i114 = f55216f;
                            int i115 = (i114 & 73) + (i114 | 73);
                            f55217g = i115 % 128;
                            int i116 = i115 % 2;
                        }
                        boolean zEquals = Arrays.equals(byteArray, bArr9);
                        int i117 = f55216f + 51;
                        f55217g = i117 % 128;
                        if (i117 % 2 == 0) {
                            throw null;
                        }
                        objValueOf = Boolean.valueOf(zEquals);
                    }
                }
                int i118 = i13 % 2;
                objValueOf = Boolean.FALSE;
                break;
            default:
                dl dlVar10 = (dl) objArr[0];
                byte[] bArr10 = (byte[]) objArr[1];
                int i119 = f55217g;
                int i120 = i119 & 17;
                int i121 = ((i119 ^ 17) | i120) << 1;
                int i122 = -((i119 | 17) & (~i120));
                int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
                f55216f = i123 % 128;
                int i124 = i123 % 2;
                Intrinsics.checkNotNullParameter(bArr10, "");
                dlVar10.setOnFocusChangeListener = bArr10;
                int i125 = f55216f;
                int i126 = i125 | 87;
                int i127 = i126 << 1;
                int i128 = -((~(i125 & 87)) & i126);
                int i129 = ((i127 | i128) << 1) - (i128 ^ i127);
                f55217g = i129 % 128;
                if (i129 % 2 != 0) {
                    return null;
                }
                int i130 = 99 / 0;
                return null;
        }
        return objValueOf;
    }

    public static boolean setDividerPadding(@Nullable byte[] p4, @NotNull byte[] p10) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{p4, p10}, 504092227, -504092215, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean setX(@NotNull byte[] p4, @NotNull byte[] p10) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{p4, p10}, -2112094012, 2112094019, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean setY(@NotNull setContentDescription p4, @Nullable TransactionCompleted p10) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{p4, p10}, -2005943015, 2005943018, (int) System.currentTimeMillis())).booleanValue();
    }

    @JvmName(name = "UiMessageCallbackKtWhenMappings")
    public final byte UiMessageCallbackKtWhenMappings() {
        return ((Byte) setCompoundDrawableTintBlendMode(new Object[]{this}, 208355073, -208355069, System.identityHashCode(this))).byteValue();
    }

    @JvmName(name = "setAlwaysDrawnWithCacheEnabled")
    @Nullable
    public final byte[] setAlwaysDrawnWithCacheEnabled() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 298274011, -298274005, System.identityHashCode(this));
    }

    @JvmName(name = "setIncludeFontPadding")
    @NotNull
    public final byte[] setIncludeFontPadding() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -2004011430, 2004011432, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final void setOnFocusChangeListener(@NotNull byte[] bArr) {
        setCompoundDrawableTintBlendMode(new Object[]{this, bArr}, 849699746, -849699741, System.identityHashCode(this));
    }

    @JvmName(name = "setTextAlignment")
    public final byte setTextAlignment() {
        return ((Byte) setCompoundDrawableTintBlendMode(new Object[]{this}, -1993710626, 1993710627, System.identityHashCode(this))).byteValue();
    }

    @JvmName(name = "setZ")
    @NotNull
    public final byte[] setZ() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -2055662065, 2055662076, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final void setOnFocusChangeListener(byte b10) {
        setCompoundDrawableTintBlendMode(new Object[]{this, Byte.valueOf(b10)}, -1828525294, 1828525303, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    public final void setX(@Nullable byte[] bArr) {
        setCompoundDrawableTintBlendMode(new Object[]{this, bArr}, 454696279, -454696269, System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.dl$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/dl$setOnFocusChangeListener;", "", "", "p0", "p1", "p2", "setOnFocusChangeListener", "([B[B[B)[B", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f55223a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f55224b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0071  */
        /* JADX WARN: Code duplicated, block: B:9:0x005b  */
        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            byte[] bArrPlus;
            byte[] bArr = (byte[]) objArr[0];
            byte[] bArrPlus2 = (byte[]) objArr[1];
            byte[] bArrPlus3 = (byte[]) objArr[2];
            int i13 = f55223a + 89;
            f55224b = i13 % 128;
            if (i13 % 2 == 0) {
                Intrinsics.checkNotNullParameter(bArr, "");
                Intrinsics.checkNotNullParameter(bArrPlus2, "");
                Intrinsics.checkNotNullParameter(bArrPlus3, "");
                if (Intrinsics.compare(UByte.m5545constructorimpl(bArrPlus2[1]) & 8926, UByte.m5545constructorimpl((byte) 20) & 7209) >= 0) {
                    bArrPlus2 = ArraysKt___ArraysJvmKt.plus(new byte[]{0}, bArrPlus2);
                    int i14 = f55224b;
                    int i15 = (i14 ^ 43) + ((i14 & 43) << 1);
                    f55223a = i15 % 128;
                    int i16 = i15 % 2;
                } else {
                    int i17 = f55223a;
                    int i18 = (i17 & (-104)) | ((~i17) & 103);
                    int i19 = (i17 & 103) << 1;
                    int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                    f55224b = i20 % 128;
                    int i21 = i20 % 2;
                }
            } else {
                Intrinsics.checkNotNullParameter(bArr, "");
                Intrinsics.checkNotNullParameter(bArrPlus2, "");
                Intrinsics.checkNotNullParameter(bArrPlus3, "");
                if (Intrinsics.compare(UByte.m5545constructorimpl(bArrPlus2[0]) & 255, UByte.m5545constructorimpl((byte) -128) & 255) >= 0) {
                    bArrPlus2 = ArraysKt___ArraysJvmKt.plus(new byte[]{0}, bArrPlus2);
                    int i110 = f55224b;
                    int i111 = (i110 ^ 43) + ((i110 & 43) << 1);
                    f55223a = i111 % 128;
                    int i112 = i111 % 2;
                } else {
                    int i113 = f55223a;
                    int i114 = (i113 & (-104)) | ((~i113) & 103);
                    int i115 = (i113 & 103) << 1;
                    int i22 = (i114 ^ i115) + ((i115 & i114) << 1);
                    f55224b = i22 % 128;
                    int i23 = i22 % 2;
                }
            }
            if (Intrinsics.compare(UByte.m5545constructorimpl(bArrPlus3[0]) & 255, UByte.m5545constructorimpl((byte) -128) & 255) >= 0) {
                int i24 = f55223a;
                int i25 = (i24 | 115) << 1;
                int i26 = -(((~i24) & 115) | (i24 & (-116)));
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                f55224b = i27 % 128;
                if (i27 % 2 == 0) {
                    byte[] bArr2 = new byte[0];
                    bArr2[1] = 1;
                    bArrPlus3 = ArraysKt___ArraysJvmKt.plus(bArr2, bArrPlus3);
                } else {
                    bArrPlus3 = ArraysKt___ArraysJvmKt.plus(new byte[]{0}, bArrPlus3);
                }
                int i28 = f55224b;
                int i29 = (i28 & 100) + (i28 | 100);
                int i30 = (i29 ^ (-1)) + (i29 << 1);
                f55223a = i30 % 128;
                int i31 = i30 % 2;
            } else {
                int i32 = f55224b;
                int i33 = (i32 & 53) + (i32 | 53);
                f55223a = i33 % 128;
                int i34 = i33 % 2;
            }
            if (Intrinsics.compare(UByte.m5545constructorimpl(bArr[0]) & 255, UByte.m5545constructorimpl((byte) -128) & 255) >= 0) {
                int i35 = f55224b;
                int i36 = ((i35 & (-44)) | ((~i35) & 43)) + ((i35 & 43) << 1);
                f55223a = i36 % 128;
                bArrPlus = i36 % 2 != 0 ? ArraysKt___ArraysJvmKt.plus(new byte[]{0}, bArr) : ArraysKt___ArraysJvmKt.plus(new byte[]{0}, bArr);
                int i37 = f55223a + 93;
                f55224b = i37 % 128;
                int i38 = i37 % 2;
            } else {
                int i39 = f55224b;
                int i40 = i39 & 69;
                int i41 = (i39 | 69) & (~i40);
                int i42 = -(-(i40 << 1));
                int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                f55223a = i43 % 128;
                int i44 = i43 % 2;
                bArrPlus = bArr;
            }
            byte[] byteArray = new BigInteger(1, bArrPlus).modPow(new BigInteger(1, bArrPlus3), new BigInteger(1, bArrPlus2)).toByteArray();
            int length = byteArray.length;
            int length2 = bArr.length;
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i45 = length2 * (-167);
            int i46 = (-167) & i45;
            int i47 = -(-((i45 ^ (-167)) | i46));
            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
            int i49 = ~length2;
            int i50 = (-2) ^ i49;
            int i51 = (-2) & i49;
            int i52 = (i50 & i51) | (i50 ^ i51);
            int i53 = ~i52;
            int i54 = (i49 | length2) & i49;
            int i55 = ~iCurrentTimeMillis;
            int i56 = i54 & i55;
            int i57 = ~(((~i56) & (i54 | i55)) | i56);
            int i58 = ((~i57) & i53) | ((~i53) & i57);
            int i59 = i57 & i53;
            int i60 = -(~(((i59 & i58) | (i58 ^ i59)) * 168));
            int i61 = ((i48 ^ i60) + ((i60 & i48) << 1)) - 1;
            int i62 = (~((i52 & i55) | (iCurrentTimeMillis & i53) | (i52 & iCurrentTimeMillis))) * 168;
            int i63 = i61 & i62;
            int i64 = ((i61 ^ i62) | i63) << 1;
            int i65 = -((i62 | i61) & (~i63));
            int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
            int i67 = (-2) & i55;
            int i68 = (~i67) & ((-2) | i55);
            int i69 = ~((i67 & i68) | (i68 ^ i67));
            int i70 = ~(length2 | (-2));
            int i71 = i69 & i70;
            int i72 = (i69 | i70) & (~i71);
            int i73 = (i72 & i71) | (i72 ^ i71);
            int i74 = (i49 ^ 1) | (i49 & 1);
            int i75 = i74 & iCurrentTimeMillis;
            int i76 = (i74 | iCurrentTimeMillis) & (~i75);
            int i77 = ~((i76 & i75) | (i76 ^ i75));
            int i78 = i73 & i77;
            int i79 = (i73 | i77) & (~i78);
            int i80 = -(~(((i79 & i78) | (i79 ^ i78)) * 168));
            if (length == (((i66 | i80) << 1) - (i80 ^ i66)) - 1) {
                int i81 = f55223a;
                int i82 = (((i81 | 56) << 1) - (i81 ^ 56)) - 1;
                f55224b = i82 % 128;
                if (i82 % 2 != 0 ? byteArray[0] == 0 : byteArray[0] == 0) {
                    Intrinsics.checkNotNullExpressionValue(byteArray, "");
                    byteArray = ArraysKt___ArraysKt.sliceArray(byteArray, c.until(1, byteArray.length));
                    int i83 = f55224b;
                    int i84 = ((i83 & (-98)) | ((~i83) & 97)) + ((i83 & 97) << 1);
                    f55223a = i84 % 128;
                    int i85 = i84 % 2;
                }
            }
            Intrinsics.checkNotNullExpressionValue(byteArray, "");
            int i86 = f55223a + 27;
            f55224b = i86 % 128;
            if (i86 % 2 == 0) {
                int i87 = 65 / 0;
            }
            return byteArray;
        }

        @NotNull
        public static byte[] setOnFocusChangeListener(@NotNull byte[] p4, @NotNull byte[] p10, @NotNull byte[] p11) {
            return (byte[]) setOnFocusChangeListener(new Object[]{p4, p10, p11}, -1375611456, 1375611456, (int) System.currentTimeMillis());
        }
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final void setCompoundDrawableTintBlendMode(@NotNull byte[] bArr) {
        setCompoundDrawableTintBlendMode(new Object[]{this, bArr}, -2023844664, 2023844664, System.identityHashCode(this));
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final void setCompoundDrawableTintBlendMode(byte b10) {
        setCompoundDrawableTintBlendMode(new Object[]{this, Byte.valueOf(b10)}, -1763141630, 1763141638, System.identityHashCode(this));
    }
}
