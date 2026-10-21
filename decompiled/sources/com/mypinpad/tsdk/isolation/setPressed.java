package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\u0005j\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/mypinpad/tsdk/i/setPressed;", "", "", "setDividerPadding", "B", "setY", "()B", "setCompoundDrawableTintBlendMode", "setX", "getNavBarTitleString", "setOnFocusChangeListener"}, k = 1, mv = {1, 5, 1})
public final class setPressed {
    private static setPressed getNavBarTitleString = null;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static int setLayoutAnimation = 0;
    private static int setNavigationOnClickListener = 1;
    public static final setPressed setOnFocusChangeListener;
    private static final /* synthetic */ setPressed[] setOnLongClickListener;
    private static setPressed setX;
    private static setPressed setY;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    private final byte setY;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.setPressed$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/setPressed$setCompoundDrawableTintBlendMode;", "", "", "p0", "Lcom/mypinpad/tsdk/i/setPressed;", "setY", "(B)Lcom/mypinpad/tsdk/i/setPressed;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f60333a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f60334b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            setPressed[] setpressedArrValues;
            int length;
            setPressed setpressed;
            boolean z10;
            byte bByteValue = ((Byte) objArr[0]).byteValue();
            int i13 = f60334b;
            int i14 = (((i13 ^ 125) | (i13 & 125)) << 1) - (((~i13) & 125) | (i13 & (-126)));
            f60333a = i14 % 128;
            if (i14 % 2 != 0) {
                setpressedArrValues = setPressed.values();
                length = setpressedArrValues.length;
            } else {
                setpressedArrValues = setPressed.values();
                length = setpressedArrValues.length;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    int i16 = f60334b;
                    int i17 = i16 & 117;
                    int i18 = (i17 - (~((i16 ^ 117) | i17))) - 1;
                    f60333a = i18 % 128;
                    int i19 = i18 % 2;
                    setpressed = null;
                    break;
                }
                int i20 = ((-1) << 1) - ((f60334b + 54) ^ (-1));
                f60333a = i20 % 128;
                int i21 = i20 % 2;
                setpressed = setpressedArrValues[i15];
                if (setpressed.setY() == bByteValue) {
                    int i22 = f60333a;
                    int i23 = ((i22 | 5) << 1) - (i22 ^ 5);
                    int i24 = i23 % 128;
                    f60334b = i24;
                    int i25 = i23 % 2;
                    int i26 = ((i24 | 11) << 1) - (((~i24) & 11) | (i24 & (-12)));
                    f60333a = i26 % 128;
                    int i27 = i26 % 2;
                    z10 = true;
                } else {
                    int i28 = f60333a;
                    int i29 = i28 & 71;
                    int i30 = -(-((i28 ^ 71) | i29));
                    int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                    f60334b = i31 % 128;
                    int i32 = i31 % 2;
                    z10 = false;
                }
                if (!(!z10)) {
                    int i33 = f60333a;
                    int i34 = i33 ^ 45;
                    int i35 = ((i33 & 45) | i34) << 1;
                    int i36 = -i34;
                    int i37 = (i35 & i36) + (i36 | i35);
                    f60334b = i37 % 128;
                    int i38 = i37 % 2;
                    int i39 = i33 & 91;
                    int i40 = ((i33 | 91) & (~i39)) + (i39 << 1);
                    f60334b = i40 % 128;
                    int i41 = i40 % 2;
                    break;
                }
                i15 = ((-1) << 1) - ((((i15 ^ (-119)) - (~(-(-((i15 & (-119)) << 1))))) + 120) ^ (-1));
                int i42 = f60334b;
                int i43 = (((i42 ^ 117) | (i42 & 117)) << 1) - ((117 & (~i42)) | (i42 & (-118)));
                f60333a = i43 % 128;
                int i44 = i43 % 2;
            }
            if (setpressed == null) {
                throw new setOnHierarchyChangeListener(37, String.valueOf((int) bByteValue));
            }
            int i45 = f60334b;
            int i46 = (((i45 | 70) << 1) - (i45 ^ 70)) - 1;
            f60333a = i46 % 128;
            int i47 = i46 % 2;
            return setpressed;
        }

        @NotNull
        public static setPressed setY(byte p4) {
            return (setPressed) setOnFocusChangeListener(new Object[]{Byte.valueOf(p4)}, 666873186, -666873186, (int) System.currentTimeMillis());
        }
    }

    static {
        setPressed[] setpressedArr;
        setPressed setpressed = new setPressed("UNIVERSAL", 0, (byte) 0);
        setX = setpressed;
        setPressed setpressed2 = new setPressed("APPLICATION", 1, (byte) 1);
        setY = setpressed2;
        setPressed setpressed3 = new setPressed("CONTEXT_SPECIFIC", 2, (byte) 2);
        getNavBarTitleString = setpressed3;
        setPressed setpressed4 = new setPressed("PRIVATE", 3, (byte) 3);
        setOnFocusChangeListener = setpressed4;
        int i10 = (27 << 1) - 27;
        setNavigationOnClickListener = i10 % 128;
        if (i10 % 2 == 0) {
            setpressedArr = new setPressed[2];
            setpressedArr[0] = setpressed;
            setpressedArr[0] = setpressed2;
            setpressedArr[4] = setpressed3;
            setpressedArr[3] = setpressed4;
        } else {
            setpressedArr = new setPressed[]{setpressed, setpressed2, setpressed3, setpressed4};
        }
        setNavigationOnClickListener = 61 % 128;
        int i11 = 61 % 2;
        setOnLongClickListener = setpressedArr;
        INSTANCE = new Companion(null);
        int i12 = setNavigationOnClickListener;
        int i13 = i12 & 103;
        int i14 = (i12 | 103) & (~i13);
        int i15 = i13 << 1;
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        setLayoutAnimation = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 92 / 0;
        }
    }

    public setPressed(String str, int i10, byte b10) {
        super(str, i10);
        this.setY = b10;
    }

    public static setPressed valueOf(String str) {
        int i10 = setNavigationOnClickListener;
        int i11 = (i10 | 63) << 1;
        int i12 = -(((~i10) & 63) | (i10 & (-64)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setLayoutAnimation = i13 % 128;
        if (i13 % 2 == 0) {
            return (setPressed) Enum.valueOf(setPressed.class, str);
        }
        Enum.valueOf(setPressed.class, str);
        throw null;
    }

    public static setPressed[] values() {
        int i10 = setNavigationOnClickListener;
        int i11 = (i10 & (-108)) | ((~i10) & 107);
        int i12 = (i10 & 107) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        setLayoutAnimation = i13 % 128;
        int i14 = i13 % 2;
        setPressed[] setpressedArr = (setPressed[]) setOnLongClickListener.clone();
        int i15 = setLayoutAnimation + 11;
        setNavigationOnClickListener = i15 % 128;
        int i16 = i15 % 2;
        return setpressedArr;
    }

    @JvmName(name = "setY")
    public final byte setY() {
        int i10 = setNavigationOnClickListener;
        int i11 = i10 & 65;
        int i12 = -(-((i10 ^ 65) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        setLayoutAnimation = i13 % 128;
        if (i13 % 2 == 0) {
            return this.setY;
        }
        throw null;
    }
}
