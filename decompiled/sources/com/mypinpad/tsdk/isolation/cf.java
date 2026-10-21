package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/cf;", "", "", "setY", "B", "setDividerPadding", "setOnFocusChangeListener", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 5, 1})
public final class cf {
    private static int getNavBarTitleString = 1;
    private static cf setCompoundDrawableTintBlendMode;
    public static final cf setDividerPadding;
    private static int setOnDragListener;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static final /* synthetic */ cf[] setX;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    private final byte setDividerPadding;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.cf$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/cf$setOnFocusChangeListener;", "", "", "p0", "Lcom/mypinpad/tsdk/i/cf;", "setX", "(B)Lcom/mypinpad/tsdk/i/cf;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f54822a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f54823b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            cf cfVar;
            int i13 = 0;
            byte bByteValue = ((Byte) objArr[0]).byteValue();
            int i14 = f54822a;
            int i15 = i14 & 23;
            int i16 = (i14 | 23) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = (i16 & i17) + (i16 | i17);
            f54823b = i18 % 128;
            int i19 = i18 % 2;
            cf[] cfVarArrValues = cf.values();
            int length = cfVarArrValues.length;
            int i20 = f54822a;
            int i21 = ((i20 | 57) << 1) - (i20 ^ 57);
            f54823b = i21 % 128;
            while (true) {
                int i22 = i21 % 2;
                cfVar = null;
                if (i13 >= length) {
                    int i23 = f54823b + 126;
                    int i24 = (i23 ^ (-1)) + (i23 << 1);
                    f54822a = i24 % 128;
                    int i25 = i24 % 2;
                    break;
                }
                int i26 = f54823b;
                int i27 = ((i26 | 7) << 1) - (i26 ^ 7);
                f54822a = i27 % 128;
                if (i27 % 2 != 0) {
                    cf.setCompoundDrawableTintBlendMode(cfVarArrValues[i13]);
                    throw null;
                }
                cf cfVar2 = cfVarArrValues[i13];
                if (cf.setCompoundDrawableTintBlendMode(cfVar2) == bByteValue) {
                    int i28 = f54822a;
                    int i29 = i28 + 45;
                    f54823b = i29 % 128;
                    int i30 = i29 % 2;
                    int i31 = (i28 & (-22)) | ((~i28) & 21);
                    int i32 = -(-((i28 & 21) << 1));
                    int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
                    f54823b = i33 % 128;
                    if (i33 % 2 == 0) {
                        throw null;
                    }
                    int i34 = i28 + 15;
                    f54823b = i34 % 128;
                    int i35 = i34 % 2;
                    cfVar = cfVar2;
                    break;
                }
                int i36 = f54822a + 119;
                int i37 = i36 % 128;
                f54823b = i37;
                int i38 = i36 % 2;
                int i39 = (i13 & (-69)) + (i13 | (-69));
                i13 = (i39 & 70) + (i39 | 70);
                i21 = i37 + 107;
                f54822a = i21 % 128;
            }
            if (cfVar == null) {
                throw new fh(25, String.valueOf((int) bByteValue));
            }
            int i40 = f54823b;
            int i41 = i40 & 41;
            int i42 = -(-((i40 ^ 41) | i41));
            int i43 = (i41 & i42) + (i42 | i41);
            f54822a = i43 % 128;
            int i44 = i43 % 2;
            return cfVar;
        }

        @NotNull
        public static cf setX(byte p4) {
            return (cf) setOnFocusChangeListener(new Object[]{Byte.valueOf(p4)}, -1450463035, 1450463035, (int) System.currentTimeMillis());
        }
    }

    static {
        cf[] cfVarArr;
        cf cfVar = new cf("FAIL_CARDHOLDER_VERIFICATION_IF_THIS_CVM_IS_UNSUCCESSFUL", 0, (byte) 0);
        setDividerPadding = cfVar;
        cf cfVar2 = new cf("APPLY_SUCCEEDING_CV_RULE_IF_THIS_CVM_IS_UNSUCCESSFUL", 1, (byte) 1);
        setCompoundDrawableTintBlendMode = cfVar2;
        int i10 = ((37 << 1) - (~(-((~0) & 37)))) - 1;
        getNavBarTitleString = i10 % 128;
        if (i10 % 2 == 0) {
            cfVarArr = new cf[3];
            cfVarArr[1] = cfVar;
            cfVarArr[0] = cfVar2;
        } else {
            cfVarArr = new cf[]{cfVar, cfVar2};
        }
        int i11 = 41 << 1;
        int i12 = -((~0) & 41);
        int i13 = (i11 & i12) + (i11 | i12);
        getNavBarTitleString = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 55 / 0;
        }
        setX = cfVarArr;
        INSTANCE = new Companion(null);
        int i15 = setOnDragListener;
        int i16 = (((i15 | 88) << 1) - (i15 ^ 88)) - 1;
        getNavBarTitleString = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    public cf(String str, int i10, byte b10) {
        super(str, i10);
        this.setDividerPadding = b10;
    }

    public static final /* synthetic */ byte setCompoundDrawableTintBlendMode(cf cfVar) {
        int i10 = setOnDragListener;
        int i11 = i10 + 21;
        getNavBarTitleString = i11 % 128;
        int i12 = i11 % 2;
        byte b10 = cfVar.setDividerPadding;
        int i13 = i10 & 15;
        int i14 = (i10 | 15) & (~i13);
        int i15 = -(-(i13 << 1));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        getNavBarTitleString = i16 % 128;
        int i17 = i16 % 2;
        return b10;
    }

    public static cf valueOf(String str) {
        int i10 = getNavBarTitleString;
        int i11 = (i10 ^ 111) + ((i10 & 111) << 1);
        setOnDragListener = i11 % 128;
        int i12 = i11 % 2;
        cf cfVar = (cf) Enum.valueOf(cf.class, str);
        int i13 = getNavBarTitleString;
        int i14 = (i13 | 125) << 1;
        int i15 = -(((~i13) & 125) | (i13 & (-126)));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        setOnDragListener = i16 % 128;
        int i17 = i16 % 2;
        return cfVar;
    }

    public static cf[] values() {
        int i10 = getNavBarTitleString + 63;
        setOnDragListener = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        cf[] cfVarArr = (cf[]) setX.clone();
        int i11 = getNavBarTitleString;
        int i12 = i11 ^ 49;
        int i13 = ((((i11 & 49) | i12) << 1) - (~(-i12))) - 1;
        setOnDragListener = i13 % 128;
        int i14 = i13 % 2;
        return cfVarArr;
    }
}
