package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u0005j\u0002\b\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/yq;", "", "", "setOnLongClickListener", "Ljava/lang/String;", "setY", "()Ljava/lang/String;", "setDividerPadding", "setOnFocusChangeListener", "setX", "setCompoundDrawableTintBlendMode", "setOnDragListener"}, k = 1, mv = {1, 6, 0})
public final class yq {
    private static int getNavBarTitleString = 0;
    public static final yq setCompoundDrawableTintBlendMode;
    public static final yq setDividerPadding;
    private static int setLayoutAnimation = 1;
    private static final /* synthetic */ yq[] setNavigationOnClickListener;
    public static final yq setOnDragListener;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final yq setX;
    public static final yq setY;

    /* JADX INFO: renamed from: setOnLongClickListener, reason: from kotlin metadata */
    @NotNull
    private final String setDividerPadding;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.yq$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/yq$setOnFocusChangeListener;", "", "", "p0", "Lcom/mypinpad/tsdk/i/yq;", "setY", "(Ljava/lang/String;)Lcom/mypinpad/tsdk/i/yq;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f62175a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f62176b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0042  */
        /* JADX WARN: Code duplicated, block: B:16:0x004a  */
        /* JADX WARN: Code duplicated, block: B:18:0x005e  */
        /* JADX WARN: Code duplicated, block: B:19:0x0063  */
        /* JADX WARN: Code duplicated, block: B:21:0x007f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0087  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:33:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:38:0x0105  */
        /* JADX WARN: Code duplicated, block: B:39:0x0106  */
        /* JADX WARN: Code duplicated, block: B:40:0x011e  */
        /* JADX WARN: Code duplicated, block: B:42:0x0126  */
        /* JADX WARN: Code duplicated, block: B:44:0x013d A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:45:0x013e  */
        /* JADX WARN: Code duplicated, block: B:46:0x013f  */
        /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            yq yqVar;
            int i13;
            int i14;
            yq yqVar2;
            int i15;
            int i16;
            yq yqVar3;
            int i17;
            yq yqVar4;
            int i18;
            String str = (String) objArr[0];
            int i19 = f62175a;
            int i20 = (i19 ^ 9) + ((i19 & 9) << 1);
            f62176b = i20 % 128;
            if (i20 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                int iHashCode = str.hashCode();
                int i21 = 89 / 0;
                if (iHashCode == 79201641) {
                    if (str.equals("SSLv3")) {
                        yqVar = yq.setOnDragListener;
                        int i22 = f62175a;
                        int i23 = i22 & 99;
                        int i24 = (i22 ^ 99) | i23;
                        i13 = ((i23 | i24) << 1) - (i24 ^ i23);
                        f62176b = i13 % 128;
                        if (i13 % 2 != 0) {
                            return yqVar;
                        }
                        throw null;
                    }
                    int i25 = f62176b;
                    int i26 = i25 & 101;
                    int i27 = ((i25 | 101) & (~i26)) + (i26 << 1);
                    f62175a = i27 % 128;
                    int i28 = i27 % 2;
                } else if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                yqVar3 = yq.setCompoundDrawableTintBlendMode;
                                int i29 = f62176b;
                                int i30 = i29 & 55;
                                i17 = (i30 - (~(-(-((i29 ^ 55) | i30))))) - 1;
                                f62175a = i17 % 128;
                                if (i17 % 2 == 0) {
                                    return yqVar3;
                                }
                                throw null;
                            }
                            int i31 = f62176b;
                            int i32 = i31 & 59;
                            i16 = (((i31 ^ 59) | i32) << 1) - ((i31 | 59) & (~i32));
                            f62175a = i16 % 128;
                            int i33 = i16 % 2;
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                yq yqVar5 = yq.setX;
                                int i34 = f62176b;
                                int i35 = ((((i34 ^ 43) | (i34 & 43)) << 1) - (~(-(((~i34) & 43) | (i34 & (-44)))))) - 1;
                                f62175a = i35 % 128;
                                int i36 = i35 % 2;
                                return yqVar5;
                            }
                            int i37 = f62176b;
                            i16 = (i37 & 53) + (i37 | 53);
                            f62175a = i16 % 128;
                            int i38 = i16 % 2;
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                yqVar4 = yq.setDividerPadding;
                                int i39 = f62176b;
                                i18 = ((i39 & 19) - (~(i39 | 19))) - 1;
                                f62175a = i18 % 128;
                                if (i18 % 2 != 0) {
                                    return yqVar4;
                                }
                                int i40 = 15 / 0;
                                return yqVar4;
                            }
                            int i41 = f62176b;
                            int i42 = ((i41 ^ 63) | (i41 & 63)) << 1;
                            int i43 = -(((~i41) & 63) | (i41 & (-64)));
                            i14 = (i42 & i43) + (i43 | i42);
                            f62175a = i14 % 128;
                            int i44 = i14 % 2;
                            break;
                    }
                } else {
                    if (str.equals("TLSv1")) {
                        yqVar2 = yq.setY;
                        int i45 = f62175a;
                        i15 = (-2) - ((((i45 | 100) << 1) - (i45 ^ 100)) ^ (-1));
                        f62176b = i15 % 128;
                        if (i15 % 2 != 0) {
                            return yqVar2;
                        }
                        throw null;
                    }
                    int i46 = f62175a;
                    int i47 = (i46 & (-54)) | ((~i46) & 53);
                    int i48 = -(-((i46 & 53) << 1));
                    i14 = (i47 & i48) + (i48 | i47);
                    f62176b = i14 % 128;
                    int i49 = i14 % 2;
                }
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                int iHashCode2 = str.hashCode();
                if (iHashCode2 == 79201641) {
                    if (str.equals("SSLv3")) {
                        yqVar = yq.setOnDragListener;
                        int i210 = f62175a;
                        int i211 = i210 & 99;
                        int i212 = (i210 ^ 99) | i211;
                        i13 = ((i211 | i212) << 1) - (i212 ^ i211);
                        f62176b = i13 % 128;
                        if (i13 % 2 != 0) {
                            return yqVar;
                        }
                        throw null;
                    }
                    int i213 = f62176b;
                    int i214 = i213 & 101;
                    int i215 = ((i213 | 101) & (~i214)) + (i214 << 1);
                    f62175a = i215 % 128;
                    int i216 = i215 % 2;
                } else if (iHashCode2 != 79923350) {
                    switch (iHashCode2) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                yqVar3 = yq.setCompoundDrawableTintBlendMode;
                                int i217 = f62176b;
                                int i310 = i217 & 55;
                                i17 = (i310 - (~(-(-((i217 ^ 55) | i310))))) - 1;
                                f62175a = i17 % 128;
                                if (i17 % 2 == 0) {
                                    return yqVar3;
                                }
                                throw null;
                            }
                            int i311 = f62176b;
                            int i312 = i311 & 59;
                            i16 = (((i311 ^ 59) | i312) << 1) - ((i311 | 59) & (~i312));
                            f62175a = i16 % 128;
                            int i313 = i16 % 2;
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                yq yqVar6 = yq.setX;
                                int i314 = f62176b;
                                int i315 = ((((i314 ^ 43) | (i314 & 43)) << 1) - (~(-(((~i314) & 43) | (i314 & (-44)))))) - 1;
                                f62175a = i315 % 128;
                                int i316 = i315 % 2;
                                return yqVar6;
                            }
                            int i317 = f62176b;
                            i16 = (i317 & 53) + (i317 | 53);
                            f62175a = i16 % 128;
                            int i318 = i16 % 2;
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                yqVar4 = yq.setDividerPadding;
                                int i319 = f62176b;
                                i18 = ((i319 & 19) - (~(i319 | 19))) - 1;
                                f62175a = i18 % 128;
                                if (i18 % 2 != 0) {
                                    return yqVar4;
                                }
                                int i410 = 15 / 0;
                                return yqVar4;
                            }
                            int i411 = f62176b;
                            int i412 = ((i411 ^ 63) | (i411 & 63)) << 1;
                            int i413 = -(((~i411) & 63) | (i411 & (-64)));
                            i14 = (i412 & i413) + (i413 | i412);
                            f62175a = i14 % 128;
                            int i414 = i14 % 2;
                            break;
                    }
                } else {
                    if (str.equals("TLSv1")) {
                        yqVar2 = yq.setY;
                        int i415 = f62175a;
                        i15 = (-2) - ((((i415 | 100) << 1) - (i415 ^ 100)) ^ (-1));
                        f62176b = i15 % 128;
                        if (i15 % 2 != 0) {
                            return yqVar2;
                        }
                        throw null;
                    }
                    int i416 = f62175a;
                    int i417 = (i416 & (-54)) | ((~i416) & 53);
                    int i418 = -(-((i416 & 53) << 1));
                    i14 = (i417 & i418) + (i418 | i417);
                    f62176b = i14 % 128;
                    int i419 = i14 % 2;
                }
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected TLS version: ", str));
        }

        @JvmStatic
        @NotNull
        public static yq setY(@NotNull String p4) {
            return (yq) setDividerPadding(new Object[]{p4}, -2136027086, 2136027086, (int) System.currentTimeMillis());
        }
    }

    static {
        yq yqVar = new yq("TLS_1_3", 0, "TLSv1.3");
        setDividerPadding = yqVar;
        yq yqVar2 = new yq("TLS_1_2", 1, "TLSv1.2");
        setX = yqVar2;
        yq yqVar3 = new yq("TLS_1_1", 2, "TLSv1.1");
        setCompoundDrawableTintBlendMode = yqVar3;
        yq yqVar4 = new yq("TLS_1_0", 3, "TLSv1");
        setY = yqVar4;
        yq yqVar5 = new yq("SSL_3_0", 4, "SSLv3");
        setOnDragListener = yqVar5;
        int i10 = (1 ^ 109) + ((1 & 109) << 1);
        getNavBarTitleString = i10 % 128;
        int i11 = i10 % 2;
        yq[] yqVarArr = {yqVar, yqVar2, yqVar3, yqVar4, yqVar5};
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i12 = ~iCurrentTimeMillis;
        int i13 = ~((i12 ^ 1318026759) | (i12 & 1318026759));
        int i14 = -(-(((i13 & (-1609563992)) | ((-1609563992) ^ i13)) * (-1188)));
        int i15 = ((1142457596 | i14) << 1) - (i14 ^ 1142457596);
        int i16 = ~(((-1318026760) ^ iCurrentTimeMillis) | ((-1318026760) & iCurrentTimeMillis));
        int i17 = (-1609563992) & i16;
        int i18 = ((-1609563992) | i16) & (~i17);
        int i19 = (i18 & i17) | (i18 ^ i17);
        int i20 = i12 & (-501471573);
        int i21 = ((-501471573) | i12) & (~i20);
        int i22 = ~((i21 & i20) | (i21 ^ i20));
        int i23 = -(-(((i19 & i22) | (i19 ^ i22)) * 594));
        int i24 = i15 & i23;
        int i25 = (iCurrentTimeMillis | i12) & i12;
        int i26 = ((~i25) & (-1318026760)) | (1318026759 & i25);
        int i27 = i25 & (-1318026760);
        int i28 = ~((i27 & i26) | (i26 ^ i27));
        int i29 = i28 ^ 209934340;
        int i30 = i28 & 209934340;
        int i31 = (i30 & i29) | (i29 ^ i30);
        int i32 = ((~i22) & i31) | ((~i31) & i22);
        int i33 = i31 & i22;
        int i34 = (-2) - (((i24 + ((i23 ^ i15) | i24)) - (~(((i33 & i32) | (i32 ^ i33)) * 594))) ^ (-1));
        System.currentTimeMillis();
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (i34 <= -372236889) {
            throw null;
        }
        setNavigationOnClickListener = yqVarArr;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i35 = ((-1) << 1) - ((-1) ^ (getNavBarTitleString + 120));
        setLayoutAnimation = i35 % 128;
        int i36 = i35 % 2;
    }

    public yq(String str, int i10, String str2) {
        super(str, i10);
        this.setDividerPadding = str2;
    }

    public static yq valueOf(String str) {
        int i10 = setLayoutAnimation;
        int i11 = ((i10 ^ 77) - (~(-(-((i10 & 77) << 1))))) - 1;
        getNavBarTitleString = i11 % 128;
        int i12 = i11 % 2;
        yq yqVar = (yq) Enum.valueOf(yq.class, str);
        if (i12 != 0) {
            int i13 = 8 / 0;
        }
        int i14 = getNavBarTitleString;
        int i15 = i14 & 17;
        int i16 = (i14 | 17) & (~i15);
        int i17 = i15 << 1;
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        setLayoutAnimation = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 85 / 0;
        }
        return yqVar;
    }

    public static yq[] values() {
        int i10 = getNavBarTitleString;
        int i11 = ((i10 ^ 16) + ((i10 & 16) << 1)) - 1;
        setLayoutAnimation = i11 % 128;
        int i12 = i11 % 2;
        yq[] yqVarArr = (yq[]) setNavigationOnClickListener.clone();
        int i13 = getNavBarTitleString + 69;
        setLayoutAnimation = i13 % 128;
        int i14 = i13 % 2;
        return yqVarArr;
    }

    @JvmName(name = "setY")
    @NotNull
    public final String setY() {
        int i10 = getNavBarTitleString;
        int i11 = (i10 ^ 74) + ((i10 & 74) << 1);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        setLayoutAnimation = i12 % 128;
        if (i12 % 2 != 0) {
            return this.setDividerPadding;
        }
        int i13 = 28 / 0;
        return this.setDividerPadding;
    }
}
