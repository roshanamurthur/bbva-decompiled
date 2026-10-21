package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0005j\u0002\b\tj\u0002\b\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/as;", "", "", "setX", "B", "setOnFocusChangeListener", "()B", "setY", "setCompoundDrawableTintBlendMode", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
public final class as {

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static as setDividerPadding = null;
    private static int setLayoutAnimation = 0;
    private static int setOnDragListener = 1;
    public static final as setOnFocusChangeListener;
    private static final /* synthetic */ as[] setOnLongClickListener;
    private static as setY;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    private final byte setY;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.as$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/as$setCompoundDrawableTintBlendMode;", "", "", "p0", "Lcom/mypinpad/tsdk/i/as;", "setY", "(B)Lcom/mypinpad/tsdk/i/as;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f53725a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f53726b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            as asVar;
            byte bByteValue = ((Byte) objArr[0]).byteValue();
            int i13 = f53726b;
            int i14 = i13 & 29;
            int i15 = (i14 - (~(-(-((i13 ^ 29) | i14))))) - 1;
            f53725a = i15 % 128;
            int i16 = i15 % 2;
            as[] asVarArrValues = as.values();
            int length = asVarArrValues.length;
            int i17 = f53726b;
            int i18 = i17 & 81;
            int i19 = (i17 | 81) & (~i18);
            int i20 = -(-(i18 << 1));
            int i21 = (i19 & i20) + (i19 | i20);
            f53725a = i21 % 128;
            int i22 = i21 % 2;
            int i23 = 0;
            while (true) {
                if (i23 >= length) {
                    int i24 = f53726b;
                    int i25 = (i24 | 17) << 1;
                    int i26 = -(((~i24) & 17) | (i24 & (-18)));
                    int i27 = (i25 & i26) + (i26 | i25);
                    f53725a = i27 % 128;
                    int i28 = i27 % 2;
                    asVar = null;
                    break;
                }
                int i29 = f53725a;
                int i30 = ((i29 | 81) << 1) - (i29 ^ 81);
                f53726b = i30 % 128;
                int i31 = i30 % 2;
                asVar = asVarArrValues[i23];
                if (asVar.setOnFocusChangeListener() == bByteValue) {
                    int i32 = f53726b;
                    int i33 = (i32 ^ 63) + ((i32 & 63) << 1);
                    f53725a = i33 % 128;
                    int i34 = i33 % 2;
                    int i35 = i32 | 85;
                    int i36 = ((i35 << 1) - (~(-(i35 & (~(i32 & 85)))))) - 1;
                    f53725a = i36 % 128;
                    int i37 = i36 % 2;
                    int i38 = i32 & 19;
                    int i39 = ((((i32 ^ 19) | i38) << 1) - (~(-((i32 | 19) & (~i38))))) - 1;
                    int i40 = i39 % 128;
                    f53725a = i40;
                    if (i39 % 2 != 0) {
                        throw null;
                    }
                    int i41 = (((i40 | 60) << 1) - (i40 ^ 60)) - 1;
                    f53726b = i41 % 128;
                    int i42 = i41 % 2;
                    break;
                }
                int i43 = f53726b;
                int i44 = i43 & 65;
                int i45 = i44 + ((i43 ^ 65) | i44);
                int i46 = i45 % 128;
                f53725a = i46;
                int i47 = i45 % 2;
                int i48 = i23 & 120;
                int i49 = (i48 - (~((i23 ^ 120) | i48))) - 1;
                int i50 = i49 ^ (-119);
                int i51 = -(-((i49 & (-119)) << 1));
                i23 = ((i50 & i51) << 1) + (i50 ^ i51);
                int i52 = i46 & 79;
                int i53 = (i46 | 79) & (~i52);
                int i54 = i52 << 1;
                int i55 = (i53 & i54) + (i53 | i54);
                f53726b = i55 % 128;
                int i56 = i55 % 2;
            }
            if (asVar == null) {
                int i57 = f53726b + 85;
                f53725a = i57 % 128;
                int i58 = i57 % 2;
                asVar = as.setOnFocusChangeListener;
                int i59 = f53726b;
                int i60 = (i59 & (-120)) | ((~i59) & 119);
                int i61 = (i59 & 119) << 1;
                int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                f53725a = i62 % 128;
                if (i62 % 2 != 0) {
                    throw null;
                }
            } else {
                int i63 = f53725a;
                int i64 = ((i63 & 82) + (i63 | 82)) - 1;
                f53726b = i64 % 128;
                if (i64 % 2 == 0) {
                    int i65 = 63 / 0;
                }
            }
            return asVar;
        }

        @NotNull
        public static as setY(byte p4) {
            return (as) setCompoundDrawableTintBlendMode(new Object[]{Byte.valueOf(p4)}, 1461447194, -1461447194, (int) System.currentTimeMillis());
        }
    }

    static {
        as asVar = new as("DATA_STORAGE_NOT_SUPPORTED", 0, (byte) 0);
        setOnFocusChangeListener = asVar;
        as asVar2 = new as("VERSION_1", 1, (byte) 1);
        setDividerPadding = asVar2;
        as asVar3 = new as("VERSION_2", 2, (byte) 2);
        setY = asVar3;
        int i10 = 105 << 1;
        int i11 = -((~0) & 105);
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        setOnDragListener = i12 % 128;
        int i13 = i12 % 2;
        as[] asVarArr = {asVar, asVar2, asVar3};
        int i14 = (26 << 1) - 27;
        setOnDragListener = i14 % 128;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (i14 % 2 == 0) {
            throw null;
        }
        setOnLongClickListener = asVarArr;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i15 = setLayoutAnimation;
        int i16 = ((-1) << 1) - ((-1) ^ ((i15 & 98) + (i15 | 98)));
        setOnDragListener = i16 % 128;
        int i17 = i16 % 2;
    }

    public as(String str, int i10, byte b10) {
        super(str, i10);
        this.setY = b10;
    }

    public static as valueOf(String str) {
        int i10 = setLayoutAnimation;
        int i11 = i10 & 113;
        int i12 = i11 + ((i10 ^ 113) | i11);
        setOnDragListener = i12 % 128;
        int i13 = i12 % 2;
        as asVar = (as) Enum.valueOf(as.class, str);
        int i14 = setOnDragListener;
        int i15 = i14 & 3;
        int i16 = i14 | 3;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        setLayoutAnimation = i17 % 128;
        int i18 = i17 % 2;
        return asVar;
    }

    public static as[] values() {
        int i10 = setOnDragListener;
        int i11 = i10 & 79;
        int i12 = -(-((i10 ^ 79) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setLayoutAnimation = i13 % 128;
        int i14 = i13 % 2;
        as[] asVarArr = setOnLongClickListener;
        if (i14 == 0) {
            return (as[]) asVarArr.clone();
        }
        throw null;
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final byte setOnFocusChangeListener() {
        int i10 = setLayoutAnimation;
        int i11 = ((i10 | 125) << 1) - (i10 ^ 125);
        setOnDragListener = i11 % 128;
        if (i11 % 2 != 0) {
            return this.setY;
        }
        throw null;
    }
}
