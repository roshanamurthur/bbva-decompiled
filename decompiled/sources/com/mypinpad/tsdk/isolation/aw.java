package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0005j\u0002\b\tj\u0002\b\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/mypinpad/tsdk/i/aw;", "", "", "setDividerPadding", "B", "setCompoundDrawableTintBlendMode", "()B", "setX", "setY", "setOnFocusChangeListener", "setOnDragListener", "getNavBarTitleString", "setNavigationOnClickListener", "setOnLongClickListener", "setLayoutAnimation", "UiMessageCallbackKtWhenMappings"}, k = 1, mv = {1, 5, 1})
public final class aw {
    private static aw UiMessageCallbackKtWhenMappings = null;
    private static aw getNavBarTitleString = null;
    private static aw setCompoundDrawableTintBlendMode = null;
    private static int setIncludeFontPadding = 0;
    private static aw setLayoutAnimation = null;
    private static aw setNavigationOnClickListener = null;
    private static aw setOnDragListener = null;
    private static aw setOnFocusChangeListener = null;
    private static aw setOnLongClickListener = null;
    private static final /* synthetic */ aw[] setTextAlignment;
    private static aw setX = null;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static int setZ = 1;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    private final byte setX;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aw$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/aw$setY;", "", "", "p0", "Lcom/mypinpad/tsdk/i/aw;", "setOnFocusChangeListener", "(B)Lcom/mypinpad/tsdk/i/aw;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f54037a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f54038b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public static aw setOnFocusChangeListener(byte p4) {
            return (aw) setX(new Object[]{Byte.valueOf(p4)}, -1805426140, 1805426140, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            aw awVar;
            byte bByteValue = ((Byte) objArr[0]).byteValue();
            int i13 = f54037a + 119;
            f54038b = i13 % 128;
            int i14 = i13 % 2;
            aw[] awVarArrValues = aw.values();
            int length = awVarArrValues.length;
            int i15 = f54038b;
            int i16 = i15 & 75;
            int i17 = i16 + ((i15 ^ 75) | i16);
            f54037a = i17 % 128;
            int i18 = i17 % 2;
            int i19 = 0;
            while (true) {
                if (i19 >= length) {
                    int i20 = f54037a;
                    int i21 = i20 & 99;
                    int i22 = (i21 - (~(-(-((i20 ^ 99) | i21))))) - 1;
                    f54038b = i22 % 128;
                    int i23 = i22 % 2;
                    awVar = null;
                    break;
                }
                int i24 = f54038b;
                int i25 = (((i24 | 101) << 1) - (~(-(((~i24) & 101) | (i24 & (-102)))))) - 1;
                f54037a = i25 % 128;
                int i26 = i25 % 2;
                awVar = awVarArrValues[i19];
                if (awVar.setCompoundDrawableTintBlendMode() == bByteValue) {
                    int i27 = f54038b;
                    int i28 = ((i27 ^ 20) + ((i27 & 20) << 1)) - 1;
                    f54037a = i28 % 128;
                    boolean z10 = i28 % 2 == 0;
                    int i29 = i27 & 125;
                    int i30 = (i29 - (~((i27 ^ 125) | i29))) - 1;
                    f54037a = i30 % 128;
                    int i31 = i30 % 2;
                    if (z10) {
                        int i32 = ((i27 | 78) << 1) - (i27 ^ 78);
                        int i33 = (i32 ^ (-1)) + (i32 << 1);
                        f54037a = i33 % 128;
                        int i34 = i33 % 2;
                        int i35 = i27 + 3;
                        f54037a = i35 % 128;
                        int i36 = i35 % 2;
                        break;
                    }
                } else {
                    int i37 = f54037a;
                    int i38 = i37 & 111;
                    int i39 = i38 + ((i37 ^ 111) | i38);
                    f54038b = i39 % 128;
                    int i40 = i39 % 2;
                }
                int i41 = (i19 | (-92)) << 1;
                int i42 = -(((~i19) & (-92)) | (i19 & 91));
                i19 = (i41 ^ i42) + ((i42 & i41) << 1) + 93;
                int i43 = f54038b;
                int i44 = (-2) - ((((i43 | 88) << 1) - (i43 ^ 88)) ^ (-1));
                f54037a = i44 % 128;
                int i45 = i44 % 2;
            }
            if (awVar == null) {
                throw new fh(38, String.valueOf((int) bByteValue));
            }
            int i46 = f54037a + 97;
            f54038b = i46 % 128;
            if (i46 % 2 == 0) {
                int i47 = 73 / 0;
            }
            return awVar;
        }
    }

    static {
        aw awVar = new aw("UNDEFINED_SDS_CONFIGURATION", 0, (byte) 0);
        setCompoundDrawableTintBlendMode = awVar;
        aw awVar2 = new aw("ALL_10_TAGS_32_BYTES", 1, (byte) 1);
        setOnFocusChangeListener = awVar2;
        aw awVar3 = new aw("ALL_10_TAGS_48_BYTES", 2, (byte) 2);
        setX = awVar3;
        aw awVar4 = new aw("ALL_10_TAGS_64_BYTES", 3, (byte) 3);
        setOnDragListener = awVar4;
        aw awVar5 = new aw("ALL_10_TAGS_96_BYTES", 4, (byte) 4);
        getNavBarTitleString = awVar5;
        aw awVar6 = new aw("ALL_10_TAGS_128_BYTES", 5, (byte) 5);
        setNavigationOnClickListener = awVar6;
        aw awVar7 = new aw("ALL_10_TAGS_160_BYTES", 6, (byte) 6);
        setOnLongClickListener = awVar7;
        aw awVar8 = new aw("ALL_10_TAGS_192_BYTES", 7, (byte) 7);
        setLayoutAnimation = awVar8;
        aw awVar9 = new aw("ALL_SDS_TAGS_32_BYTES_EXCEPT_9F78_WHICH_IS_64_BYTES", 8, (byte) 8);
        UiMessageCallbackKtWhenMappings = awVar9;
        int i10 = 1 ^ 97;
        int i11 = ((i10 | (1 & 97)) << 1) - i10;
        int i12 = i11 % 128;
        setIncludeFontPadding = i12;
        int i13 = i11 % 2;
        aw[] awVarArr = {awVar, awVar2, awVar3, awVar4, awVar5, awVar6, awVar7, awVar8, awVar9};
        int i14 = i12 & 93;
        int i15 = (i12 ^ 93) | i14;
        int i16 = (i14 & i15) + (i14 | i15);
        setZ = i16 % 128;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (i16 % 2 == 0) {
            throw null;
        }
        setTextAlignment = awVarArr;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i17 = setZ;
        int i18 = i17 & 17;
        int i19 = (i17 | 17) & (~i18);
        int i20 = -(-(i18 << 1));
        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
        setIncludeFontPadding = i21 % 128;
        if (i21 % 2 != 0) {
            throw null;
        }
    }

    public aw(String str, int i10, byte b10) {
        super(str, i10);
        this.setX = b10;
    }

    public static aw valueOf(String str) {
        int i10 = setIncludeFontPadding;
        int i11 = (i10 & 35) + (i10 | 35);
        setZ = i11 % 128;
        int i12 = i11 % 2;
        aw awVar = (aw) Enum.valueOf(aw.class, str);
        int i13 = setZ + 117;
        setIncludeFontPadding = i13 % 128;
        int i14 = i13 % 2;
        return awVar;
    }

    public static aw[] values() {
        int i10 = setIncludeFontPadding;
        int i11 = ((i10 & (-2)) | ((~i10) & 1)) + ((i10 & 1) << 1);
        setZ = i11 % 128;
        int i12 = i11 % 2;
        aw[] awVarArr = (aw[]) setTextAlignment.clone();
        int i13 = ((-1) << 1) - ((setIncludeFontPadding + 64) ^ (-1));
        setZ = i13 % 128;
        int i14 = i13 % 2;
        return awVarArr;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final byte setCompoundDrawableTintBlendMode() {
        int i10 = setZ;
        int i11 = i10 & 43;
        int i12 = (i10 | 43) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        setIncludeFontPadding = i14 % 128;
        int i15 = i14 % 2;
        byte b10 = this.setX;
        if (i15 != 0) {
            int i16 = 25 / 0;
        }
        return b10;
    }
}
