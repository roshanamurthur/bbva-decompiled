package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/au;", "", "", "setX", "B", "setCompoundDrawableTintBlendMode", "()B", "setDividerPadding", "setY", "setOnFocusChangeListener"}, k = 1, mv = {1, 5, 1})
public final class au {
    public static final au setCompoundDrawableTintBlendMode;
    private static final /* synthetic */ au[] setDividerPadding;
    private static int setNavigationOnClickListener = 1;
    private static int setOnDragListener;
    private static au setOnFocusChangeListener;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    private final byte setDividerPadding;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.au$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/au$setY;", "", "", "p0", "Lcom/mypinpad/tsdk/i/au;", "setCompoundDrawableTintBlendMode", "(B)Lcom/mypinpad/tsdk/i/au;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f53866a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f53867b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public static au setCompoundDrawableTintBlendMode(byte p4) {
            return (au) setX(new Object[]{Byte.valueOf(p4)}, 178206581, -178206581, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            au auVar;
            boolean z10;
            byte bByteValue = ((Byte) objArr[0]).byteValue();
            int i13 = f53867b;
            int i14 = ((i13 | 73) << 1) - (i13 ^ 73);
            f53866a = i14 % 128;
            int i15 = i14 % 2;
            au[] auVarArrValues = au.values();
            int length = auVarArrValues.length;
            int i16 = f53866a;
            int i17 = i16 & 73;
            int i18 = i17 + ((i16 ^ 73) | i17);
            f53867b = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 0;
            while (true) {
                if (i20 >= length) {
                    int i21 = f53866a;
                    int i22 = i21 & 87;
                    int i23 = -(-((i21 ^ 87) | i22));
                    int i24 = (i22 & i23) + (i23 | i22);
                    f53867b = i24 % 128;
                    int i25 = i24 % 2;
                    auVar = null;
                    break;
                }
                int i26 = f53867b;
                int i27 = i26 & 17;
                int i28 = i26 | 17;
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                f53866a = i29 % 128;
                int i30 = i29 % 2;
                auVar = auVarArrValues[i20];
                if (auVar.setCompoundDrawableTintBlendMode() == bByteValue) {
                    int i31 = f53867b;
                    int i32 = (i31 & 67) + (i31 | 67);
                    f53866a = i32 % 128;
                    int i33 = i32 % 2;
                    z10 = true;
                } else {
                    int i34 = f53866a;
                    int i35 = (i34 & (-98)) | ((~i34) & 97);
                    int i36 = (i34 & 97) << 1;
                    int i37 = (i35 & i36) + (i36 | i35);
                    f53867b = i37 % 128;
                    int i38 = i37 % 2;
                    z10 = false;
                }
                if (!(!z10)) {
                    int i39 = f53867b;
                    int i40 = i39 ^ 9;
                    int i41 = (i39 & 9) << 1;
                    int i42 = ((i40 | i41) << 1) - (i40 ^ i41);
                    f53866a = i42 % 128;
                    int i43 = i42 % 2;
                    int i44 = (i39 & 87) + (i39 | 87);
                    f53866a = i44 % 128;
                    int i45 = i44 % 2;
                    break;
                }
                int i46 = i20 - 55;
                i20 = ((i46 | 56) << 1) - (i46 ^ 56);
                int i47 = f53867b + 69;
                f53866a = i47 % 128;
                int i48 = i47 % 2;
            }
            if (auVar == null) {
                throw new fh(36, String.valueOf((int) bByteValue));
            }
            int i49 = f53867b;
            int i50 = i49 & 121;
            int i51 = (i49 ^ 121) | i50;
            int i52 = (i50 & i51) + (i51 | i50);
            f53866a = i52 % 128;
            if (i52 % 2 != 0) {
                int i53 = 88 / 0;
            }
            return auVar;
        }
    }

    static {
        au auVar = new au("CDA_SUPPORTED_IN_EMV", 0, (byte) 0);
        setOnFocusChangeListener = auVar;
        au auVar2 = new au("CDA_SUPPORTED_OVER_TC_ARQC_AAC", 1, (byte) 1);
        setCompoundDrawableTintBlendMode = auVar2;
        int i10 = 5 % 128;
        setNavigationOnClickListener = i10;
        int i11 = 5 % 2;
        au[] auVarArr = {auVar, auVar2};
        int i12 = (i10 ^ 93) + ((i10 & 93) << 1);
        setOnDragListener = i12 % 128;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (i12 % 2 != 0) {
            throw null;
        }
        setDividerPadding = auVarArr;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i13 = setOnDragListener + 57;
        setNavigationOnClickListener = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public au(String str, int i10, byte b10) {
        super(str, i10);
        this.setDividerPadding = b10;
    }

    public static au valueOf(String str) {
        int i10 = setOnDragListener;
        int i11 = (((i10 ^ 63) | (i10 & 63)) << 1) - (((~i10) & 63) | (i10 & (-64)));
        setNavigationOnClickListener = i11 % 128;
        int i12 = i11 % 2;
        au auVar = (au) Enum.valueOf(au.class, str);
        int i13 = ((-1) << 1) - ((setOnDragListener + 34) ^ (-1));
        setNavigationOnClickListener = i13 % 128;
        int i14 = i13 % 2;
        return auVar;
    }

    public static au[] values() {
        int i10 = setOnDragListener;
        int i11 = i10 & 15;
        int i12 = i11 + ((i10 ^ 15) | i11);
        setNavigationOnClickListener = i12 % 128;
        int i13 = i12 % 2;
        au[] auVarArr = (au[]) setDividerPadding.clone();
        int i14 = setOnDragListener;
        int i15 = (i14 & 67) + (i14 | 67);
        setNavigationOnClickListener = i15 % 128;
        if (i15 % 2 != 0) {
            return auVarArr;
        }
        throw null;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final byte setCompoundDrawableTintBlendMode() {
        int i10 = setOnDragListener;
        int i11 = i10 + 61;
        setNavigationOnClickListener = i11 % 128;
        int i12 = i11 % 2;
        byte b10 = this.setDividerPadding;
        int i13 = i10 ^ 63;
        int i14 = ((i10 & 63) | i13) << 1;
        int i15 = -i13;
        int i16 = (i14 & i15) + (i14 | i15);
        setNavigationOnClickListener = i16 % 128;
        if (i16 % 2 != 0) {
            return b10;
        }
        throw null;
    }
}
