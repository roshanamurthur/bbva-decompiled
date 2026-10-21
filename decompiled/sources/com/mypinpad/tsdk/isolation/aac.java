package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\u0005j\u0002\b\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/mypinpad/tsdk/i/aac;", "", "", "getNavBarTitleString", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setDividerPadding", "()I", "setOnFocusChangeListener", "setCompoundDrawableTintBlendMode", "setX", "setY", "setOnLongClickListener", "setOnDragListener", "setAlwaysDrawnWithCacheEnabled", "setNavigationOnClickListener", "setLayoutAnimation", "setIncludeFontPadding", "setZ", "setTextAlignment", "UiMessageCallbackKtWhenMappings", "getAmountFieldTextColor"}, k = 1, mv = {1, 6, 0})
public enum aac {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    private static int setChildDivider = 1;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int setTextScaleX;

    /* JADX INFO: renamed from: getNavBarTitleString, reason: from kotlin metadata */
    private final int setOnFocusChangeListener;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aac$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/aac$setCompoundDrawableTintBlendMode;", "", "", "p0", "Lcom/mypinpad/tsdk/i/aac;", "setX", "(I)Lcom/mypinpad/tsdk/i/aac;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52019a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52020b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0065 A[PHI: r3
          0x0065: PHI (r3v11 com.mypinpad.tsdk.i.aac) = (r3v10 com.mypinpad.tsdk.i.aac), (r3v17 com.mypinpad.tsdk.i.aac) binds: [B:15:0x0063, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x0075  */
        /* JADX WARN: Code duplicated, block: B:19:0x0077  */
        /* JADX WARN: Code duplicated, block: B:21:0x0085 A[PHI: r3
          0x0085: PHI (r3v16 com.mypinpad.tsdk.i.aac) = (r3v10 com.mypinpad.tsdk.i.aac), (r3v17 com.mypinpad.tsdk.i.aac) binds: [B:15:0x0063, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            aac[] aacVarArrValuesCustom;
            int length;
            int i13;
            aac aacVar;
            int i14;
            boolean z10;
            int iIntValue = ((Number) objArr[0]).intValue();
            int i15 = f52020b;
            int i16 = ((i15 & 54) + (i15 | 54)) - 1;
            f52019a = i16 % 128;
            if (i16 % 2 != 0) {
                aacVarArrValuesCustom = aac.valuesCustom();
                length = aacVarArrValuesCustom.length;
                i13 = 1;
            } else {
                aacVarArrValuesCustom = aac.valuesCustom();
                length = aacVarArrValuesCustom.length;
                i13 = 0;
            }
            int i17 = (-2) - ((f52020b + 92) ^ (-1));
            f52019a = i17 % 128;
            int i18 = i17 % 2;
            while (i13 < length) {
                int i19 = f52019a;
                int i20 = i19 | 53;
                int i21 = i20 << 1;
                int i22 = -((~(i19 & 53)) & i20);
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                f52020b = i23 % 128;
                if (i23 % 2 == 0) {
                    aacVar = aacVarArrValuesCustom[i13];
                    int i24 = 35 / 0;
                    if (aacVar.setDividerPadding() == iIntValue) {
                        int i25 = f52020b;
                        i14 = (i25 ^ 71) + ((i25 & 71) << 1);
                        int i26 = i14 % 128;
                        f52019a = i26;
                        if (i14 % 2 != 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i27 = (i26 ^ 111) + ((i26 & 111) << 1);
                        f52020b = i27 % 128;
                        int i28 = i27 % 2;
                    } else {
                        int i29 = f52019a;
                        int i30 = i29 ^ 11;
                        int i31 = (11 & i29) << 1;
                        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                        f52020b = i32 % 128;
                        int i33 = i32 % 2;
                        z10 = false;
                    }
                } else {
                    aacVar = aacVarArrValuesCustom[i13];
                    if (aacVar.setDividerPadding() == iIntValue) {
                        int i210 = f52020b;
                        i14 = (i210 ^ 71) + ((i210 & 71) << 1);
                        int i211 = i14 % 128;
                        f52019a = i211;
                        if (i14 % 2 != 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i212 = (i211 ^ 111) + ((i211 & 111) << 1);
                        f52020b = i212 % 128;
                        int i213 = i212 % 2;
                    } else {
                        int i214 = f52019a;
                        int i34 = i214 ^ 11;
                        int i35 = (11 & i214) << 1;
                        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                        f52020b = i36 % 128;
                        int i37 = i36 % 2;
                        z10 = false;
                    }
                }
                if (z10) {
                    int i38 = f52019a;
                    int i39 = ((i38 | 105) << 1) - (i38 ^ 105);
                    f52020b = i39 % 128;
                    int i40 = i39 % 2;
                    int i41 = i38 & 49;
                    int i42 = ((i38 | 49) & (~i41)) + (i41 << 1);
                    f52020b = i42 % 128;
                    int i43 = i42 % 2;
                    return aacVar;
                }
                i13++;
                int i44 = f52019a;
                int i45 = ((i44 ^ 3) | (i44 & 3)) << 1;
                int i46 = -(((~i44) & 3) | (i44 & (-4)));
                int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                f52020b = i47 % 128;
                int i48 = i47 % 2;
            }
            int i49 = f52019a;
            int i50 = ((i49 ^ 11) | (i49 & 11)) << 1;
            int i51 = -(((~i49) & 11) | (i49 & (-12)));
            int i52 = (i50 & i51) + (i51 | i50);
            f52020b = i52 % 128;
            aacVar = null;
            if (i52 % 2 == 0) {
                throw null;
            }
            return aacVar;
        }

        @Nullable
        public static aac setX(int p4) {
            return (aac) setOnFocusChangeListener(new Object[]{Integer.valueOf(p4)}, -1744119768, 1744119768, p4);
        }
    }

    static {
        int i10 = 0 - (-117);
        int i11 = i10 % 128;
        setChildDivider = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 103;
        setTextScaleX = i13 % 128;
        int i14 = i13 % 2;
        int i15 = setChildDivider;
        int i16 = i15 & 117;
        int i17 = (i15 | 117) & (~i16);
        int i18 = i16 << 1;
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        setTextScaleX = i19 % 128;
        int i20 = i19 % 2;
    }

    aac(int i10) {
        this.setOnFocusChangeListener = i10;
    }

    public static aac valueOf(String str) {
        int i10 = setChildDivider;
        int i11 = i10 & 103;
        int i12 = i11 + ((i10 ^ 103) | i11);
        setTextScaleX = i12 % 128;
        int i13 = i12 % 2;
        aac aacVar = (aac) Enum.valueOf(aac.class, str);
        int i14 = setTextScaleX + 85;
        setChildDivider = i14 % 128;
        int i15 = i14 % 2;
        return aacVar;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static aac[] valuesCustom() {
        int i10 = setTextScaleX;
        int i11 = i10 & 29;
        int i12 = ((i10 ^ 29) | i11) << 1;
        int i13 = -((i10 | 29) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        setChildDivider = i14 % 128;
        int i15 = i14 % 2;
        aac[] aacVarArr = (aac[]) values().clone();
        int i16 = setTextScaleX;
        int i17 = (i16 & (-102)) | ((~i16) & 101);
        int i18 = -(-((i16 & 101) << 1));
        int i19 = (i17 & i18) + (i18 | i17);
        setChildDivider = i19 % 128;
        if (i19 % 2 != 0) {
            return aacVarArr;
        }
        throw null;
    }

    @JvmName(name = "setDividerPadding")
    public final int setDividerPadding() {
        int i10 = setTextScaleX;
        int i11 = (i10 & 63) + (i10 | 63);
        setChildDivider = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        int i12 = this.setOnFocusChangeListener;
        int i13 = ((i10 | 67) << 1) - (i10 ^ 67);
        setChildDivider = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }
}
