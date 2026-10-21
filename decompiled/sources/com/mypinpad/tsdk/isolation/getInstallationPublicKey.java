package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/getInstallationPublicKey;", "", "", "setX", "B", "setCompoundDrawableTintBlendMode", "()B", "setY", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
public enum getInstallationPublicKey {
    MISSING(Constants.CVR_B2b8765_1111_APP_DISABLED),
    UNSPECIFIED((byte) -15);


    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static int setLayoutAnimation = 1;
    private static int setNavigationOnClickListener;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    private final byte setY;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.getInstallationPublicKey$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/getInstallationPublicKey$setDividerPadding;", "", "", "p0", "Lcom/mypinpad/tsdk/i/getInstallationPublicKey;", "setX", "(B)Lcom/mypinpad/tsdk/i/getInstallationPublicKey;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f55901a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f55902b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0060 A[PHI: r2
          0x0060: PHI (r2v11 com.mypinpad.tsdk.i.getInstallationPublicKey) = (r2v10 com.mypinpad.tsdk.i.getInstallationPublicKey), (r2v18 com.mypinpad.tsdk.i.getInstallationPublicKey) binds: [B:10:0x005e, B:7:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:12:0x007d A[PHI: r2
          0x007d: PHI (r2v17 com.mypinpad.tsdk.i.getInstallationPublicKey) = (r2v10 com.mypinpad.tsdk.i.getInstallationPublicKey), (r2v18 com.mypinpad.tsdk.i.getInstallationPublicKey) binds: [B:10:0x005e, B:7:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            getInstallationPublicKey getinstallationpublickey;
            boolean z10;
            byte bByteValue = ((Byte) objArr[0]).byteValue();
            int i13 = f55902b;
            int i14 = i13 & 45;
            int i15 = -(-(i13 | 45));
            int i16 = (i14 & i15) + (i15 | i14);
            f55901a = i16 % 128;
            int i17 = i16 % 2;
            getInstallationPublicKey[] getinstallationpublickeyArrValuesCustom = getInstallationPublicKey.valuesCustom();
            int length = getinstallationpublickeyArrValuesCustom.length;
            int i18 = f55901a;
            int i19 = ((i18 & 120) + (i18 | 120)) - 1;
            f55902b = i19 % 128;
            int i20 = i19 % 2;
            int i21 = 0;
            while (i21 < length) {
                int i22 = f55901a;
                int i23 = (i22 | 15) << 1;
                int i24 = -(((~i22) & 15) | (i22 & (-16)));
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                f55902b = i25 % 128;
                if (i25 % 2 == 0) {
                    getinstallationpublickey = getinstallationpublickeyArrValuesCustom[i21];
                    int i26 = 82 / 0;
                    if (getinstallationpublickey.setCompoundDrawableTintBlendMode() == bByteValue) {
                        int i27 = f55902b;
                        int i28 = ((i27 ^ 35) | (i27 & 35)) << 1;
                        int i29 = -(((~i27) & 35) | (i27 & (-36)));
                        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                        f55901a = i30 % 128;
                        int i31 = i30 % 2;
                        z10 = true;
                    } else {
                        int i32 = f55901a;
                        int i33 = i32 & 97;
                        int i34 = ((i32 | 97) & (~i33)) + (i33 << 1);
                        f55902b = i34 % 128;
                        int i35 = i34 % 2;
                        z10 = false;
                    }
                } else {
                    getinstallationpublickey = getinstallationpublickeyArrValuesCustom[i21];
                    if (getinstallationpublickey.setCompoundDrawableTintBlendMode() == bByteValue) {
                        int i210 = f55902b;
                        int i211 = ((i210 ^ 35) | (i210 & 35)) << 1;
                        int i212 = -(((~i210) & 35) | (i210 & (-36)));
                        int i36 = ((i211 | i212) << 1) - (i212 ^ i211);
                        f55901a = i36 % 128;
                        int i37 = i36 % 2;
                        z10 = true;
                    } else {
                        int i38 = f55901a;
                        int i39 = i38 & 97;
                        int i310 = ((i38 | 97) & (~i39)) + (i39 << 1);
                        f55902b = i310 % 128;
                        int i311 = i310 % 2;
                        z10 = false;
                    }
                }
                if (z10) {
                    int i40 = f55901a;
                    int i41 = (i40 | 91) << 1;
                    int i42 = -(((~i40) & 91) | (i40 & (-92)));
                    int i43 = (i41 & i42) + (i42 | i41);
                    int i44 = i43 % 128;
                    f55902b = i44;
                    if (i43 % 2 == 0) {
                        int i45 = 17 / 0;
                    }
                    int i46 = (i44 ^ 103) + ((i44 & 103) << 1);
                    f55901a = i46 % 128;
                    int i47 = i46 % 2;
                    return getinstallationpublickey;
                }
                int i48 = i21 ^ 1;
                int i49 = -(-((i21 & 1) << 1));
                i21 = ((i48 | i49) << 1) - (i49 ^ i48);
                int i50 = f55901a;
                int i51 = (i50 & 23) + (i50 | 23);
                f55902b = i51 % 128;
                int i52 = i51 % 2;
            }
            int i53 = f55902b;
            int i54 = (i53 ^ 3) + ((i53 & 3) << 1);
            f55901a = i54 % 128;
            getinstallationpublickey = null;
            if (i54 % 2 != 0) {
                throw null;
            }
            return getinstallationpublickey;
        }

        @Nullable
        public static getInstallationPublicKey setX(byte p4) {
            return (getInstallationPublicKey) setDividerPadding(new Object[]{Byte.valueOf(p4)}, 1422275723, -1422275723, (int) System.currentTimeMillis());
        }
    }

    static {
        int i10 = 0 - (-107);
        setLayoutAnimation = i10 % 128;
        int i11 = i10 % 2;
        int i12 = (~0) & 115;
        int i13 = -(-0);
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        setLayoutAnimation = i14 % 128;
        int i15 = i14 % 2;
        INSTANCE = new Companion(null);
        int i16 = setNavigationOnClickListener;
        int i17 = i16 & 97;
        int i18 = (i17 - (~((i16 ^ 97) | i17))) - 1;
        setLayoutAnimation = i18 % 128;
        int i19 = i18 % 2;
    }

    getInstallationPublicKey(byte b10) {
        this.setY = b10;
    }

    public static getInstallationPublicKey valueOf(String str) {
        int i10 = setLayoutAnimation + 113;
        setNavigationOnClickListener = i10 % 128;
        if (i10 % 2 != 0) {
            Enum.valueOf(getInstallationPublicKey.class, str);
            throw null;
        }
        getInstallationPublicKey getinstallationpublickey = (getInstallationPublicKey) Enum.valueOf(getInstallationPublicKey.class, str);
        int i11 = setNavigationOnClickListener;
        int i12 = ((i11 | 39) << 1) - (i11 ^ 39);
        setLayoutAnimation = i12 % 128;
        int i13 = i12 % 2;
        return getinstallationpublickey;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static getInstallationPublicKey[] valuesCustom() {
        int i10 = setNavigationOnClickListener;
        int i11 = (i10 & (-14)) | ((~i10) & 13);
        int i12 = (i10 & 13) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        setLayoutAnimation = i13 % 128;
        int i14 = i13 % 2;
        getInstallationPublicKey[] getinstallationpublickeyArr = (getInstallationPublicKey[]) values().clone();
        int i15 = setLayoutAnimation;
        int i16 = (((i15 ^ 103) | (i15 & 103)) << 1) - (((~i15) & 103) | (i15 & (-104)));
        setNavigationOnClickListener = i16 % 128;
        if (i16 % 2 == 0) {
            return getinstallationpublickeyArr;
        }
        throw null;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final byte setCompoundDrawableTintBlendMode() {
        int i10 = setLayoutAnimation;
        int i11 = (i10 & 41) + (i10 | 41);
        int i12 = i11 % 128;
        setNavigationOnClickListener = i12;
        int i13 = i11 % 2;
        byte b10 = this.setY;
        int i14 = i12 & 71;
        int i15 = (((i12 ^ 71) | i14) << 1) - ((i12 | 71) & (~i14));
        setLayoutAnimation = i15 % 128;
        if (i15 % 2 != 0) {
            return b10;
        }
        throw null;
    }
}
