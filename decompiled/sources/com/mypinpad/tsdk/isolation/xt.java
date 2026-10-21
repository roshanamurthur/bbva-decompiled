package com.mypinpad.tsdk.isolation;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/xt;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "setY", "setX"}, k = 1, mv = {1, 6, 0})
public final class xt {

    @JvmField
    @NotNull
    public static final xt UiMessageCallbackKtWhenMappings;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f61938d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f61939e = 1;

    @JvmField
    @NotNull
    public static final xt getAmountFieldTextColor;

    @JvmField
    @NotNull
    public static final xt getNavBarTitleString;

    @JvmField
    @NotNull
    public static final xt setAlwaysDrawnWithCacheEnabled;

    @JvmField
    @NotNull
    public static final xt setCompoundDrawableTintBlendMode;

    @JvmField
    @NotNull
    public static final xt setDividerPadding;

    @JvmField
    @NotNull
    public static final xt setIncludeFontPadding;

    @JvmField
    @NotNull
    public static final xt setLayoutAnimation;

    @JvmField
    @NotNull
    public static final xt setNavigationOnClickListener;

    @JvmField
    @NotNull
    public static final xt setOnDragListener;

    @JvmField
    @NotNull
    public static final xt setOnFocusChangeListener;

    @JvmField
    @NotNull
    public static final xt setOnLongClickListener;

    @JvmField
    @NotNull
    public static final xt setTextAlignment;

    @JvmField
    @NotNull
    public static final xt setTextScaleX;

    @JvmField
    @NotNull
    public static final xt setY;

    @JvmField
    @NotNull
    public static final xt setZ;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setX;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final setY f61936b = new setY();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f61937c = new LinkedHashMap();

    public static final class setY implements Comparator<String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static int f61943p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f61944q0 = 1;

        /* JADX WARN: Code restructure failed: missing block: B:16:0x00a4, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.compare((int) r6, (int) r7) < 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00ab, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.compare((int) r6, (int) r7) < 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
        
            r8 = com.mypinpad.tsdk.i.xt.setY.f61943p0;
            r9 = r8 & 15;
            r1 = (r8 ^ 15) | r9;
            r0 = ((r9 | r1) << 1) - (r9 ^ r1);
            com.mypinpad.tsdk.i.xt.setY.f61944q0 = r0 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00bf, code lost:
        
            if ((r0 % 2) != 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00c1, code lost:
        
            r9 = 28 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
        
            r9 = (r8 & 73) + (r8 | 73);
            com.mypinpad.tsdk.i.xt.setY.f61944q0 = r9 % 128;
            r9 = r9 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00d4, code lost:
        
            r8 = com.mypinpad.tsdk.i.xt.setY.f61944q0;
            r9 = ((r8 ^ 22) + ((r8 & 22) << 1)) - 1;
            com.mypinpad.tsdk.i.xt.setY.f61943p0 = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00e2, code lost:
        
            if ((r9 % 2) != 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00e6, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
        
            return 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object setDividerPadding(java.lang.Object[] r8, int r9, int r10, int r11) {
            /*
                Method dump skipped, instruction units count: 453
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.xt.setY.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(String str, String str2) {
            return ((Integer) setDividerPadding(new Object[]{this, str, str2}, -1640922034, 1640922035, System.identityHashCode(this))).intValue();
        }
    }

    static {
        setY = (xt) Companion.setOnFocusChangeListener(new Object[]{"SSL_RSA_WITH_3DES_EDE_CBC_SHA"}, -1690501427, 1690501429, (int) System.currentTimeMillis());
        setOnFocusChangeListener = (xt) Companion.setOnFocusChangeListener(new Object[]{"TLS_RSA_WITH_AES_128_CBC_SHA"}, -1690501427, 1690501429, (int) System.currentTimeMillis());
        setDividerPadding = (xt) Companion.setOnFocusChangeListener(new Object[]{"TLS_RSA_WITH_AES_256_CBC_SHA"}, -1690501427, 1690501429, (int) System.currentTimeMillis());
        setCompoundDrawableTintBlendMode = (xt) Companion.setOnFocusChangeListener(new Object[]{"TLS_RSA_WITH_AES_128_GCM_SHA256"}, -1690501427, 1690501429, (int) System.currentTimeMillis());
        setOnDragListener = (xt) Companion.setOnFocusChangeListener(new Object[]{"TLS_RSA_WITH_AES_256_GCM_SHA384"}, -1690501427, 1690501429, (int) System.currentTimeMillis());
        getNavBarTitleString = (xt) Companion.setOnFocusChangeListener(new Object[]{"TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"}, -1690501427, 1690501429, (int) System.currentTimeMillis());
        setOnLongClickListener = (xt) Companion.setOnFocusChangeListener(new Object[]{"TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"}, -1690501427, 1690501429, (int) System.currentTimeMillis());
        setLayoutAnimation = (xt) Companion.setOnFocusChangeListener(new Object[]{"TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256"}, -1690501427, 1690501429, (int) System.currentTimeMillis());
        setNavigationOnClickListener = (xt) Companion.setOnFocusChangeListener(new Object[]{"TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384"}, -1690501427, 1690501429, (int) System.currentTimeMillis());
        UiMessageCallbackKtWhenMappings = (xt) Companion.setOnFocusChangeListener(new Object[]{"TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"}, -1690501427, 1690501429, (int) System.currentTimeMillis());
        setIncludeFontPadding = (xt) Companion.setOnFocusChangeListener(new Object[]{"TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"}, -1690501427, 1690501429, (int) System.currentTimeMillis());
        setAlwaysDrawnWithCacheEnabled = (xt) Companion.setOnFocusChangeListener(new Object[]{"TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256"}, -1690501427, 1690501429, (int) System.currentTimeMillis());
        setTextAlignment = (xt) Companion.setOnFocusChangeListener(new Object[]{"TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256"}, -1690501427, 1690501429, (int) System.currentTimeMillis());
        setZ = (xt) Companion.setOnFocusChangeListener(new Object[]{"TLS_AES_128_GCM_SHA256"}, -1690501427, 1690501429, (int) System.currentTimeMillis());
        setTextScaleX = (xt) Companion.setOnFocusChangeListener(new Object[]{"TLS_AES_256_GCM_SHA384"}, -1690501427, 1690501429, (int) System.currentTimeMillis());
        getAmountFieldTextColor = (xt) Companion.setOnFocusChangeListener(new Object[]{"TLS_CHACHA20_POLY1305_SHA256"}, -1690501427, 1690501429, (int) System.currentTimeMillis());
        int i10 = f61938d;
        int i11 = i10 & 65;
        int i12 = i11 + ((i10 ^ 65) | i11);
        f61939e = i12 % 128;
        int i13 = i12 % 2;
    }

    public xt(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.setX = str;
    }

    public static final /* synthetic */ Comparator setDividerPadding() {
        return (Comparator) setX(new Object[0], 1906256335, -1906256333, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ Map setOnFocusChangeListener() {
        return (Map) setX(new Object[0], -647586737, 647586740, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~(i10 | i11 | i12)) * (-301)) + (i11 * 302) + (i10 * (-300));
        int i14 = ~i11;
        int i15 = (((~((~i10) | i12)) | i14) * 301) + (((~(i14 | i12)) | (~((~i12) | i10))) * (-301)) + i13;
        if (i15 == 1) {
            xt xtVar = (xt) objArr[0];
            int i16 = f61938d;
            int i17 = i16 & 75;
            int i18 = -(-((i16 ^ 75) | i17));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            f61939e = i19 % 128;
            int i20 = i19 % 2;
            String str = xtVar.setX;
            if (i20 != 0) {
                return str;
            }
            throw null;
        }
        if (i15 == 2) {
            int i21 = f61939e + 13;
            f61938d = i21 % 128;
            if (i21 % 2 == 0) {
                return f61936b;
            }
            throw null;
        }
        if (i15 == 3) {
            int i22 = f61939e + 65;
            int i23 = i22 % 128;
            f61938d = i23;
            if (i22 % 2 != 0) {
                throw null;
            }
            LinkedHashMap linkedHashMap = f61937c;
            int i24 = i23 + 13;
            f61939e = i24 % 128;
            int i25 = i24 % 2;
            return linkedHashMap;
        }
        xt xtVar2 = (xt) objArr[0];
        int i26 = f61938d;
        int i27 = (i26 ^ 91) + ((i26 & 91) << 1);
        f61939e = i27 % 128;
        int i28 = i27 % 2;
        String str2 = xtVar2.setX;
        int i29 = i26 & 85;
        int i30 = -(-((i26 ^ 85) | i29));
        int i31 = (i29 & i30) + (i30 | i29);
        f61939e = i31 % 128;
        int i32 = i31 % 2;
        return str2;
    }

    @JvmName(name = "setY")
    @NotNull
    public final String setY() {
        return (String) setX(new Object[]{this}, 1004849359, -1004849359, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, -1494832081, 1494832082, System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.xt$setX, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u000bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011"}, d2 = {"Lcom/mypinpad/tsdk/i/xt$setX;", "", "", "p0", "Lcom/mypinpad/tsdk/i/xt;", "setY", "(Ljava/lang/String;)Lcom/mypinpad/tsdk/i/xt;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "setOnEditorActionListener", "Ljava/util/Comparator;", "()Ljava/util/Comparator;", "setDividerPadding", "", "setChildDivider", "Ljava/util/Map;", "setZ", "Lcom/mypinpad/tsdk/i/xt;", "setCompoundDrawableTintBlendMode", "setTextScaleX", "setOnFocusChangeListener", "getAmountFieldTextColor", "setX", "setLayoutAnimation", "setOnDragListener", "setNavigationOnClickListener", "getNavBarTitleString", "setTextAlignment", "setOnLongClickListener", "UiMessageCallbackKtWhenMappings", "setAlwaysDrawnWithCacheEnabled", "setIncludeFontPadding", "setCompoundDrawablePadding", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f61941a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f61942b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ xt setDividerPadding(String str) {
            return (xt) setOnFocusChangeListener(new Object[]{str}, -1690501427, 1690501429, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i12;
            int i14 = ~i11;
            int i15 = (((~(i10 | i11 | i12)) | (~(i13 | i14)) | (~((~i10) | i14))) * 757) + ((~(i14 | i10 | i12)) * 1514) + ((i10 | i13) * (-757)) + (i11 * (-756)) + (i10 * 758);
            if (i15 == 1) {
                String str = (String) objArr[0];
                xt xtVar = new xt(str, null);
                ((Map) xt.setX(new Object[0], -647586737, 647586740, (int) System.currentTimeMillis())).put(str, xtVar);
                int i16 = ((-1) << 1) - ((f61942b + 34) ^ (-1));
                f61941a = i16 % 128;
                int i17 = i16 % 2;
                return xtVar;
            }
            if (i15 == 2) {
                String str2 = (String) objArr[0];
                int i18 = f61942b;
                int i19 = i18 & 45;
                int i20 = ((i18 ^ 45) | i19) << 1;
                int i21 = -((i18 | 45) & (~i19));
                int i22 = (i20 & i21) + (i21 | i20);
                f61941a = i22 % 128;
                if (i22 % 2 == 0) {
                    return (xt) setOnFocusChangeListener(new Object[]{str2}, -598901815, 598901816, (int) System.currentTimeMillis());
                }
                throw null;
            }
            if (i15 == 3) {
                int i23 = f61941a;
                int i24 = i23 ^ 3;
                int i25 = -(-((i23 & 3) << 1));
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                f61942b = i26 % 128;
                if (i26 % 2 != 0) {
                    return (Comparator) xt.setX(new Object[0], 1906256335, -1906256333, (int) System.currentTimeMillis());
                }
                throw null;
            }
            String str3 = (String) objArr[0];
            int i27 = f61942b + 107;
            f61941a = i27 % 128;
            int i28 = i27 % 2;
            if (!(!l.startsWith$default(str3, "TLS_", false, 2, null))) {
                int i29 = (-2) - ((f61941a + 16) ^ (-1));
                f61942b = i29 % 128;
                int i30 = i29 % 2;
                String strSubstring = str3.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                String strStringPlus = Intrinsics.stringPlus("SSL_", strSubstring);
                int i31 = f61942b;
                int i32 = (-2) - ((((i31 | 104) << 1) - (i31 ^ 104)) ^ (-1));
                f61941a = i32 % 128;
                if (i32 % 2 == 0) {
                    return strStringPlus;
                }
                int i33 = 31 / 0;
                return strStringPlus;
            }
            if (!l.startsWith$default(str3, "SSL_", false, 2, null)) {
                int i34 = f61941a;
                int i35 = ((i34 & 74) + (i34 | 74)) - 1;
                f61942b = i35 % 128;
                if (i35 % 2 != 0) {
                    return str3;
                }
                throw null;
            }
            int i36 = f61942b;
            int i37 = (((i36 | 56) << 1) - (i36 ^ 56)) - 1;
            f61941a = i37 % 128;
            int i38 = i37 % 2;
            String strSubstring2 = str3.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            String strStringPlus2 = Intrinsics.stringPlus("TLS_", strSubstring2);
            int i39 = f61942b;
            int i40 = (-2) - ((((i39 | 30) << 1) - (i39 ^ 30)) ^ (-1));
            f61941a = i40 % 128;
            if (i40 % 2 == 0) {
                return strStringPlus2;
            }
            throw null;
        }

        @JvmStatic
        @NotNull
        public final synchronized xt setY(@NotNull String p4) {
            xt xtVar;
            try {
                System.identityHashCode(this);
                System.identityHashCode(this);
                Intrinsics.checkNotNullParameter(p4, "");
                xtVar = (xt) ((Map) xt.setX(new Object[0], -647586737, 647586740, (int) System.currentTimeMillis())).get(p4);
                if (xtVar == null) {
                    int i10 = f61942b;
                    int i11 = i10 & 77;
                    int i12 = (i10 ^ 77) | i11;
                    int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                    f61941a = i13 % 128;
                    int i14 = i13 % 2;
                    xtVar = (xt) ((Map) xt.setX(new Object[0], -647586737, 647586740, (int) System.currentTimeMillis())).get((String) setOnFocusChangeListener(new Object[]{p4}, -1568944662, 1568944662, (int) System.currentTimeMillis()));
                    if (xtVar == null) {
                        xtVar = new xt(p4, null);
                        int i15 = f61942b;
                        int i16 = i15 & 59;
                        int i17 = (((i15 | 59) & (~i16)) - (~(-(-(i16 << 1))))) - 1;
                        f61941a = i17 % 128;
                        int i18 = i17 % 2;
                    }
                    ((Map) xt.setX(new Object[0], -647586737, 647586740, (int) System.currentTimeMillis())).put(p4, xtVar);
                    System.identityHashCode(this);
                    System.identityHashCode(this);
                }
                int i19 = f61942b + 33;
                f61941a = i19 % 128;
                int i20 = i19 % 2;
            } catch (Throwable th2) {
                throw th2;
            }
            return xtVar;
        }

        @JvmName(name = "setY")
        @NotNull
        public static Comparator<String> setY() {
            return (Comparator) setOnFocusChangeListener(new Object[0], -197045215, 197045218, (int) System.currentTimeMillis());
        }
    }
}
