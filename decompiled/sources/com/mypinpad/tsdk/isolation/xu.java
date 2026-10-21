package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import dk.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0018\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015"}, d2 = {"Lcom/mypinpad/tsdk/i/xu;", "", "Ljavax/net/ssl/SSLSocket;", "p0", "", "p1", "", "setOnFocusChangeListener", "(Ljavax/net/ssl/SSLSocket;Z)V", "(Ljavax/net/ssl/SSLSocket;)Z", "equals", "(Ljava/lang/Object;)Z", "", GenerateActivationFormCommand.HASH_CODE, "()I", "", "toString", "()Ljava/lang/String;", "a", "Z", "setY", "()Z", "setDividerPadding", "b", "", "p2", "p3", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "setX", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 6, 0})
public final class xu {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f61945e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f61946f = 1;

    @JvmField
    @NotNull
    public static final xu setCompoundDrawableTintBlendMode;

    @JvmField
    @NotNull
    public static final xu setDividerPadding;

    @JvmField
    @NotNull
    public static final xu setOnFocusChangeListener;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean setDividerPadding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean setY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String[] f61949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String[] f61950d;

    public static final class setCompoundDrawableTintBlendMode {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f61951e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f61952f = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f61953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String[] f61954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String[] f61955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f61956d;

        public setCompoundDrawableTintBlendMode(boolean z10) {
            this.f61953a = z10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x008a, code lost:
        
            if (((java.lang.Boolean) setOnFocusChangeListener(new java.lang.Object[]{r11}, 2127216729, -2127216724, java.lang.System.identityHashCode(r11))).booleanValue() != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:?, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00a2, code lost:
        
            if (((java.lang.Boolean) setOnFocusChangeListener(new java.lang.Object[]{r11}, 2127216729, -2127216724, java.lang.System.identityHashCode(r11))).booleanValue() != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00a5, code lost:
        
            if (r10.length != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00a7, code lost:
        
            r12 = com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61952f;
            r0 = ((r12 & 44) + (r12 | 44)) - 1;
            r12 = r0 % 128;
            com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61951e = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00b4, code lost:
        
            if ((r0 % 2) == 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00b6, code lost:
        
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b8, code lost:
        
            r0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
        
            r0 = !r0;
            r1 = r12 + 33;
            com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61952f = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c1, code lost:
        
            if (r0 != false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
        
            r10 = ((r12 ^ 101) - (~((r12 & 101) << 1))) - 1;
            com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61952f = r10 % 128;
            r10 = r10 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00dc, code lost:
        
            throw new java.lang.IllegalArgumentException("At least one TLS version is required".toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00dd, code lost:
        
            r12 = com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61951e + 1;
            com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61952f = r12 % 128;
            r12 = r12 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
        
            r12 = com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61952f;
            r0 = r12 + 29;
            com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61951e = r0 % 128;
            r0 = r0 % 2;
            r0 = r12 & 83;
            r12 = -(-(r12 | 83));
            r1 = (r0 & r12) + (r12 | r0);
            com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61951e = r1 % 128;
            r1 = r1 % 2;
            setOnFocusChangeListener(new java.lang.Object[]{r11, (java.lang.String[]) r10.clone()}, -677672797, 677672797, java.lang.System.identityHashCode(r11));
            r10 = com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61952f;
            r12 = r10 & 63;
            r10 = (r10 | 63) & (~r12);
            r12 = -(-(r12 << 1));
            r13 = (r10 ^ r12) + ((r10 & r12) << 1);
            com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61951e = r13 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x012b, code lost:
        
            if ((r13 % 2) != 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0130, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x013a, code lost:
        
            throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections".toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x035c, code lost:
        
            if (((java.lang.Boolean) setOnFocusChangeListener(new java.lang.Object[]{r11}, 2127216729, -2127216724, java.lang.System.identityHashCode(r11))).booleanValue() != false) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0374, code lost:
        
            if (((java.lang.Boolean) setOnFocusChangeListener(new java.lang.Object[]{r11}, 2127216729, -2127216724, java.lang.System.identityHashCode(r11))).booleanValue() != false) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0376, code lost:
        
            r12 = new java.util.ArrayList(r10.length);
            r13 = r10.length;
            r0 = com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61951e;
            r1 = r0 & 81;
            r0 = -(-((r0 ^ 81) | r1));
            r2 = ((r1 | r0) << 1) - (r0 ^ r1);
            com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61952f = r2 % 128;
            r2 = r2 % 2;
            r0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0391, code lost:
        
            if (r0 >= r13) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0393, code lost:
        
            r1 = com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61951e;
            r3 = r1 & 51;
            r2 = (((r1 ^ 51) | r3) << 1) - ((r1 | 51) & (~r3));
            com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61952f = r2 % 128;
            r2 = r2 % 2;
            r12.add(r10[r0].setY());
            r1 = ((r0 & 59) | ((~r0) & (-60))) + ((r0 & (-60)) << 1);
            r2 = r1 & 61;
            r0 = ((((r1 ^ 61) | r2) << 1) - (~(-((r1 | 61) & (~r2))))) - 1;
            r1 = com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61951e;
            r2 = (r1 & 27) + (r1 | 27);
            com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61952f = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x03d3, code lost:
        
            r10 = r12.toArray(new java.lang.String[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x03d9, code lost:
        
            if (r10 == null) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x03db, code lost:
        
            r10 = (java.lang.String[]) r10;
            r3 = (com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new java.lang.Object[]{r11, (java.lang.String[]) java.util.Arrays.copyOf(r10, r10.length)}, -1450531074, 1450531083, java.lang.System.identityHashCode(r11));
            r10 = com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61952f + 93;
            com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.f61951e = r10 % 128;
            r10 = r10 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x040d, code lost:
        
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0417, code lost:
        
            throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections".toString());
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r10, int r11, int r12, int r13) {
            /*
                Method dump skipped, instruction units count: 1260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.xu.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
        }

        @NotNull
        public final xu setDividerPadding() {
            return (xu) setOnFocusChangeListener(new Object[]{this}, -1601996436, 1601996438, System.identityHashCode(this));
        }

        @NotNull
        public final setCompoundDrawableTintBlendMode setY(@NotNull String... strArr) {
            return (setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new Object[]{this, strArr}, -1450531074, 1450531083, System.identityHashCode(this));
        }

        @NotNull
        public final setCompoundDrawableTintBlendMode setDividerPadding(@NotNull xt... xtVarArr) {
            return (setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new Object[]{this, xtVarArr}, -793922257, 793922265, System.identityHashCode(this));
        }

        public setCompoundDrawableTintBlendMode(@NotNull xu xuVar) {
            Intrinsics.checkNotNullParameter(xuVar, "");
            this.f61953a = ((Boolean) xu.setX(new Object[]{xuVar}, -1423293510, 1423293512, System.identityHashCode(xuVar))).booleanValue();
            this.f61954b = (String[]) xu.setX(new Object[]{xuVar}, 334393234, -334393225, (int) System.currentTimeMillis());
            this.f61955c = (String[]) xu.setX(new Object[]{xuVar}, -404624815, 404624826, (int) System.currentTimeMillis());
            this.f61956d = ((Boolean) xu.setX(new Object[]{xuVar}, 1501770906, -1501770896, System.identityHashCode(xuVar))).booleanValue();
        }

        @Deprecated(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        @NotNull
        public final setCompoundDrawableTintBlendMode setOnFocusChangeListener() {
            return (setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new Object[]{this}, 351516059, -351516058, System.identityHashCode(this));
        }

        @NotNull
        public final setCompoundDrawableTintBlendMode setOnFocusChangeListener(@NotNull yq... yqVarArr) {
            return (setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new Object[]{this, yqVarArr}, -1869991422, 1869991426, System.identityHashCode(this));
        }

        @NotNull
        public final setCompoundDrawableTintBlendMode setOnFocusChangeListener(@NotNull String... strArr) {
            return (setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new Object[]{this, strArr}, -318600108, 318600114, System.identityHashCode(this));
        }
    }

    static {
        xt xtVar = xt.setZ;
        xt xtVar2 = xt.setTextScaleX;
        xt xtVar3 = xt.getAmountFieldTextColor;
        xt xtVar4 = xt.setLayoutAnimation;
        xt xtVar5 = xt.UiMessageCallbackKtWhenMappings;
        xt xtVar6 = xt.setNavigationOnClickListener;
        xt xtVar7 = xt.setIncludeFontPadding;
        xt xtVar8 = xt.setTextAlignment;
        xt xtVar9 = xt.setAlwaysDrawnWithCacheEnabled;
        xt[] xtVarArr = {xtVar, xtVar2, xtVar3, xtVar4, xtVar5, xtVar6, xtVar7, xtVar8, xtVar9};
        xt[] xtVarArr2 = {xtVar, xtVar2, xtVar3, xtVar4, xtVar5, xtVar6, xtVar7, xtVar8, xtVar9, xt.getNavBarTitleString, xt.setOnLongClickListener, xt.setCompoundDrawableTintBlendMode, xt.setOnDragListener, xt.setOnFocusChangeListener, xt.setDividerPadding, xt.setY};
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode(true);
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (setCompoundDrawableTintBlendMode) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode, (xt[]) Arrays.copyOf(xtVarArr, 9)}, -793922257, 793922265, System.identityHashCode(setcompounddrawabletintblendmode));
        yq yqVar = yq.setDividerPadding;
        yq yqVar2 = yq.setX;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = (setCompoundDrawableTintBlendMode) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode2, new yq[]{yqVar, yqVar2}}, -1869991422, 1869991426, System.identityHashCode(setcompounddrawabletintblendmode2));
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = (setCompoundDrawableTintBlendMode) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode3}, 351516059, -351516058, System.identityHashCode(setcompounddrawabletintblendmode3));
        setDividerPadding = (xu) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode4}, -1601996436, 1601996438, System.identityHashCode(setcompounddrawabletintblendmode4));
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode5 = new setCompoundDrawableTintBlendMode(true);
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode6 = (setCompoundDrawableTintBlendMode) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode5, (xt[]) Arrays.copyOf(xtVarArr2, 16)}, -793922257, 793922265, System.identityHashCode(setcompounddrawabletintblendmode5));
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode7 = (setCompoundDrawableTintBlendMode) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode6, new yq[]{yqVar, yqVar2}}, -1869991422, 1869991426, System.identityHashCode(setcompounddrawabletintblendmode6));
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode8 = (setCompoundDrawableTintBlendMode) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode7}, 351516059, -351516058, System.identityHashCode(setcompounddrawabletintblendmode7));
        setOnFocusChangeListener = (xu) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode8}, -1601996436, 1601996438, System.identityHashCode(setcompounddrawabletintblendmode8));
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode9 = new setCompoundDrawableTintBlendMode(true);
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode10 = (setCompoundDrawableTintBlendMode) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode9, (xt[]) Arrays.copyOf(xtVarArr2, 16)}, -793922257, 793922265, System.identityHashCode(setcompounddrawabletintblendmode9));
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode11 = (setCompoundDrawableTintBlendMode) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode10, new yq[]{yqVar, yqVar2, yq.setCompoundDrawableTintBlendMode, yq.setY}}, -1869991422, 1869991426, System.identityHashCode(setcompounddrawabletintblendmode10));
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode12 = (setCompoundDrawableTintBlendMode) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode11}, 351516059, -351516058, System.identityHashCode(setcompounddrawabletintblendmode11));
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode13 = new setCompoundDrawableTintBlendMode(false);
        setCompoundDrawableTintBlendMode = (xu) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode13}, -1601996436, 1601996438, System.identityHashCode(setcompounddrawabletintblendmode13));
        int i10 = f61946f;
        int i11 = ((((i10 ^ 15) | (i10 & 15)) << 1) - (~(-(((~i10) & 15) | (i10 & (-16)))))) - 1;
        f61945e = i11 % 128;
        int i12 = i11 % 2;
    }

    public xu(boolean z10, boolean z11, @Nullable String[] strArr, @Nullable String[] strArr2) {
        this.setDividerPadding = z10;
        this.setY = z11;
        this.f61949c = strArr;
        this.f61950d = strArr2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x008b A[PHI: r12
      0x008b: PHI (r12v8 com.mypinpad.tsdk.i.xu) = (r12v7 com.mypinpad.tsdk.i.xu), (r12v24 com.mypinpad.tsdk.i.xu) binds: [B:8:0x0089, B:5:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void a(Object[] objArr) {
        xu xuVar;
        xu xuVar2 = (xu) objArr[0];
        SSLSocket sSLSocket = (SSLSocket) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i10 = f61945e;
        int i11 = i10 ^ 37;
        int i12 = (i10 & 37) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f61946f = i13 % 128;
        if (i13 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sSLSocket, "");
            xuVar = (xu) setX(new Object[]{xuVar2, sSLSocket, Boolean.valueOf(zBooleanValue)}, 1784451493, -1784451487, System.identityHashCode(xuVar2));
            int i14 = 26 / 0;
            if (((List) setX(new Object[]{xuVar}, 1049653417, -1049653413, System.identityHashCode(xuVar))) != null) {
                sSLSocket.setEnabledProtocols(xuVar.f61950d);
                int i15 = f61945e + 55;
                f61946f = i15 % 128;
                int i16 = i15 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(sSLSocket, "");
            xuVar = (xu) setX(new Object[]{xuVar2, sSLSocket, Boolean.valueOf(zBooleanValue)}, 1784451493, -1784451487, System.identityHashCode(xuVar2));
            if (((List) setX(new Object[]{xuVar}, 1049653417, -1049653413, System.identityHashCode(xuVar))) != null) {
                sSLSocket.setEnabledProtocols(xuVar.f61950d);
                int i17 = f61945e + 55;
                f61946f = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        if (((List) setX(new Object[]{xuVar}, -295438716, 295438721, System.identityHashCode(xuVar))) != null) {
            int i19 = f61945e;
            int i20 = (i19 ^ 67) + ((i19 & 67) << 1);
            f61946f = i20 % 128;
            int i21 = i20 % 2;
            sSLSocket.setEnabledCipherSuites(xuVar.f61949c);
            int i22 = f61945e;
            int i23 = i22 & 83;
            int i24 = i23 + ((i22 ^ 83) | i23);
            f61946f = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = f61946f;
        int i27 = i26 & 49;
        int i28 = i27 + ((i26 ^ 49) | i27);
        f61945e = i28 % 128;
        if (i28 % 2 != 0) {
            int i29 = 4 / 0;
        }
    }

    public static /* synthetic */ Boolean b(Object[] objArr) {
        Boolean bool = Boolean.FALSE;
        xu xuVar = (xu) objArr[0];
        Object obj = objArr[1];
        int i10 = f61945e;
        int i11 = i10 + 57;
        int i12 = i11 % 128;
        f61946f = i12;
        int i13 = i11 % 2;
        if (!(obj instanceof xu)) {
            int i14 = ((i12 & (-120)) | ((~i12) & 119)) + ((i12 & 119) << 1);
            int i15 = i14 % 128;
            f61945e = i15;
            int i16 = i14 % 2;
            int i17 = ((i15 ^ 118) + ((i15 & 118) << 1)) - 1;
            f61946f = i17 % 128;
            int i18 = i17 % 2;
            return bool;
        }
        if (obj == xuVar) {
            int i19 = (-2) - (((i12 ^ 70) + ((i12 & 70) << 1)) ^ (-1));
            int i20 = i19 % 128;
            f61945e = i20;
            boolean z10 = i19 % 2 == 0;
            int i21 = i20 + 39;
            f61946f = i21 % 128;
            if (i21 % 2 != 0) {
                return Boolean.valueOf(z10);
            }
            throw null;
        }
        boolean z11 = xuVar.setDividerPadding;
        xu xuVar2 = (xu) obj;
        if (z11 != xuVar2.setDividerPadding) {
            int i22 = ((((i10 ^ 125) | (i10 & 125)) << 1) - (~(-((i10 & (-126)) | ((~i10) & 125))))) - 1;
            int i23 = i22 % 128;
            f61946f = i23;
            int i24 = i22 % 2;
            int i25 = i23 | 117;
            int i26 = i25 << 1;
            int i27 = -(i25 & (~(i23 & 117)));
            int i28 = (i26 & i27) + (i27 | i26);
            f61945e = i28 % 128;
            if (i28 % 2 != 0) {
                int i29 = 91 / 0;
            }
            return bool;
        }
        if (z11) {
            int i30 = i10 & 51;
            int i31 = (i10 ^ 51) | i30;
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            f61946f = i32 % 128;
            int i33 = i32 % 2;
            if (!Arrays.equals(xuVar.f61949c, xuVar2.f61949c)) {
                int i34 = f61946f;
                int i35 = i34 & 17;
                int i36 = (i34 ^ 17) | i35;
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                int i38 = i37 % 128;
                f61945e = i38;
                int i39 = i37 % 2;
                int i40 = i38 ^ 83;
                int i41 = ((((i38 & 83) | i40) << 1) - (~(-i40))) - 1;
                f61946f = i41 % 128;
                if (i41 % 2 == 0) {
                    int i42 = 39 / 0;
                }
                return bool;
            }
            if (!Arrays.equals(xuVar.f61950d, xuVar2.f61950d)) {
                int i43 = f61945e + 67;
                f61946f = i43 % 128;
                int i44 = i43 % 2;
                return bool;
            }
            if (xuVar.setY != xuVar2.setY) {
                int i45 = f61946f;
                int i46 = (i45 ^ 13) + ((i45 & 13) << 1);
                f61945e = i46 % 128;
                int i47 = i46 % 2;
                int i48 = (i45 & (-110)) | ((~i45) & 109);
                int i49 = (i45 & 109) << 1;
                int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                f61945e = i50 % 128;
                int i51 = i50 % 2;
                return bool;
            }
        }
        int i52 = f61945e + 117;
        f61946f = i52 % 128;
        int i53 = i52 % 2;
        return Boolean.TRUE;
    }

    public static final /* synthetic */ String[] setOnFocusChangeListener(xu xuVar) {
        return (String[]) setX(new Object[]{xuVar}, -404624815, 404624826, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:30:0x012b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0155  */
    /* JADX WARN: Code duplicated, block: B:58:0x0206  */
    /* JADX WARN: Code duplicated, block: B:60:0x0219  */
    /* JADX WARN: Code duplicated, block: B:63:0x0220  */
    /* JADX WARN: Code duplicated, block: B:65:0x0226 A[PHI: r3
      0x0226: PHI (r3v67 int) = (r3v66 int), (r3v95 int) binds: [B:64:0x0224, B:61:0x021d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0237 A[PHI: r2 r3
      0x0237: PHI (r2v136 java.lang.String[]) = (r2v89 java.lang.String[]), (r2v140 java.lang.String[]) binds: [B:64:0x0224, B:61:0x021d] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r3v94 int) = (r3v66 int), (r3v95 int) binds: [B:64:0x0224, B:61:0x021d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0252  */
    /* JADX WARN: Code duplicated, block: B:71:0x0262  */
    /* JADX WARN: Code duplicated, block: B:72:0x0264  */
    /* JADX WARN: Code duplicated, block: B:74:0x0276  */
    /* JADX WARN: Code duplicated, block: B:77:0x031c  */
    /* JADX WARN: Code duplicated, block: B:80:0x032b  */
    /* JADX WARN: Code duplicated, block: B:81:0x032d  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        Object list;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i14;
        String[] strArr;
        int i15;
        int iHashCode;
        String[] strArr2;
        int iHashCode2;
        int i16;
        int i17;
        int i18;
        String[] strArr3;
        String[] enabledCipherSuites2;
        int i19;
        int i20;
        int i21 = ~i11;
        int i22 = ~i10;
        int i23 = ~i12;
        int i24 = 17;
        List list2 = null;
        switch (((~(i10 | i11)) * 933) + (((~(i21 | i10)) | (~(i21 | i23))) * 933) + (((~(i22 | i23)) | i21) * (-933)) + (i11 * (-932)) + (i10 * 934)) {
            case 1:
                a(objArr);
                return null;
            case 2:
                xu xuVar = (xu) objArr[0];
                int i25 = f61945e;
                int i26 = i25 & 99;
                int i27 = ((i25 ^ 99) | i26) << 1;
                int i28 = -((i25 | 99) & (~i26));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                f61946f = i29 % 128;
                int i30 = i29 % 2;
                boolean z10 = xuVar.setDividerPadding;
                if (i30 != 0) {
                    return Boolean.valueOf(z10);
                }
                throw null;
            case 3:
                return b(objArr);
            case 4:
                xu xuVar2 = (xu) objArr[0];
                int i31 = f61946f;
                int i32 = ((i31 | 77) << 1) - (i31 ^ 77);
                f61945e = i32 % 128;
                int i33 = i32 % 2;
                String[] strArr4 = xuVar2.f61950d;
                if (strArr4 == null) {
                    int i34 = i31 + 113;
                    f61945e = i34 % 128;
                    if (i34 % 2 != 0) {
                        throw null;
                    }
                    int i35 = i31 & 25;
                    i13 = (i35 - (~(-(-((i31 ^ 25) | i35))))) - 1;
                } else {
                    ArrayList arrayList = new ArrayList(strArr4.length);
                    int length = strArr4.length;
                    int i36 = f61946f + 97;
                    f61945e = i36 % 128;
                    int i37 = i36 % 2;
                    int i38 = 0;
                    while (i38 < length) {
                        int i39 = f61946f;
                        int i40 = (((i39 | 40) << 1) - (i39 ^ 40)) - 1;
                        f61945e = i40 % 128;
                        int i41 = i40 % 2;
                        String str = strArr4[i38];
                        yq.Companion companion = yq.INSTANCE;
                        arrayList.add((yq) yq.Companion.setDividerPadding(new Object[]{str}, -2136027086, 2136027086, (int) System.currentTimeMillis()));
                        int i42 = i38 & 126;
                        int i43 = ((i38 | 126) & (~i42)) + (i42 << 1);
                        int i44 = i43 ^ (-125);
                        int i45 = (i43 & (-125)) << 1;
                        i38 = ((i44 | i45) << 1) - (i45 ^ i44);
                        int i46 = f61946f;
                        int i47 = ((i46 | 17) << 1) - (i46 ^ 17);
                        f61945e = i47 % 128;
                        int i48 = i47 % 2;
                    }
                    list2 = CollectionsKt___CollectionsKt.toList(arrayList);
                    int i49 = f61946f;
                    i13 = (i49 & 121) + (i49 | 121);
                }
                f61945e = i13 % 128;
                int i50 = i13 % 2;
                return list2;
            case 5:
                xu xuVar3 = (xu) objArr[0];
                int i51 = f61946f;
                int i52 = ((i51 ^ 121) | (i51 & 121)) << 1;
                int i53 = ~i51;
                int i54 = -((i51 & (-122)) | (i53 & 121));
                int i55 = ((i52 | i54) << 1) - (i52 ^ i54);
                f61945e = i55 % 128;
                if (i55 % 2 != 0) {
                    String[] strArr5 = xuVar3.f61949c;
                    throw null;
                }
                String[] strArr6 = xuVar3.f61949c;
                if (strArr6 == null) {
                    int i56 = ((((i51 ^ 87) | (i51 & 87)) << 1) - (~(-((i51 & (-88)) | (i53 & 87))))) - 1;
                    f61945e = i56 % 128;
                    int i57 = i56 % 2;
                    int i58 = i51 & 59;
                    int i59 = ((i51 ^ 59) | i58) << 1;
                    int i60 = -((i51 | 59) & (~i58));
                    int i61 = (i59 & i60) + (i59 | i60);
                    f61945e = i61 % 128;
                    if (i61 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                ArrayList arrayList2 = new ArrayList(strArr6.length);
                int length2 = strArr6.length;
                int i62 = f61945e;
                int i63 = (i62 & 93) + (i62 | 93);
                f61946f = i63 % 128;
                int i64 = i63 % 2;
                int i65 = 0;
                while (i65 < length2) {
                    int i66 = f61945e;
                    int i67 = ((i66 ^ 121) | (i66 & 121)) << 1;
                    int i68 = -(((~i66) & 121) | (i66 & (-122)));
                    int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
                    f61946f = i69 % 128;
                    if (i69 % 2 == 0) {
                        arrayList2.add(xt.INSTANCE.setY(strArr6[i65]));
                        i65 += 27;
                    } else {
                        arrayList2.add(xt.INSTANCE.setY(strArr6[i65]));
                        i65 = ((i65 | 1) << 1) - (i65 ^ 1);
                    }
                }
                list = CollectionsKt___CollectionsKt.toList(arrayList2);
                int i70 = f61945e;
                int i71 = i70 & 41;
                int i72 = ((i70 ^ 41) | i71) << 1;
                int i73 = -((i70 | 41) & (~i71));
                int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
                f61946f = i74 % 128;
                if (i74 % 2 == 0) {
                    throw null;
                }
                break;
            case 6:
                xu xuVar4 = (xu) objArr[0];
                SSLSocket sSLSocket = (SSLSocket) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i75 = f61945e;
                int i76 = i75 + 12;
                int i77 = (i76 ^ (-1)) + (i76 << 1);
                f61946f = i77 % 128;
                int i78 = i77 % 2;
                if (xuVar4.f61949c != null) {
                    int i79 = (((i75 | 95) << 1) - (~(-((i75 & (-96)) | ((~i75) & 95))))) - 1;
                    f61946f = i79 % 128;
                    int i80 = i79 % 2;
                    String[] enabledCipherSuites3 = sSLSocket.getEnabledCipherSuites();
                    Intrinsics.checkNotNullExpressionValue(enabledCipherSuites3, "");
                    xt.Companion companion2 = xt.INSTANCE;
                    enabledCipherSuites = (String[]) yt.setY(new Object[]{enabledCipherSuites3, xuVar4.f61949c, (Comparator) xt.Companion.setOnFocusChangeListener(new Object[0], -197045215, 197045218, (int) System.currentTimeMillis())}, 1465570526, -1465570513, (int) System.currentTimeMillis());
                    int i81 = f61945e + 109;
                    f61946f = i81 % 128;
                    int i82 = i81 % 2;
                } else {
                    enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                    int i83 = f61945e;
                    int i84 = i83 & 23;
                    int i85 = -(-((i83 ^ 23) | i84));
                    int i86 = (i84 & i85) + (i85 | i84);
                    f61946f = i86 % 128;
                    int i87 = i86 % 2;
                }
                String[] strArr7 = xuVar4.f61950d;
                if (strArr7 != null) {
                    int i88 = f61945e;
                    int i89 = i88 ^ 57;
                    int i90 = ((((i88 & 57) | i89) << 1) - (~(-i89))) - 1;
                    f61946f = i90 % 128;
                    if (i90 % 2 == 0) {
                        String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
                        Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "");
                        throw null;
                    }
                    String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
                    Intrinsics.checkNotNullExpressionValue(enabledProtocols3, "");
                    enabledProtocols = (String[]) yt.setY(new Object[]{enabledProtocols3, strArr7, e.naturalOrder()}, 1465570526, -1465570513, (int) System.currentTimeMillis());
                } else {
                    enabledProtocols = sSLSocket.getEnabledProtocols();
                    int i91 = f61945e;
                    int i92 = ((i91 ^ 13) | (i91 & 13)) << 1;
                    int i93 = -(((~i91) & 13) | (i91 & (-14)));
                    int i94 = (i92 ^ i93) + ((i93 & i92) << 1);
                    f61946f = i94 % 128;
                    int i95 = i94 % 2;
                }
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "");
                xt.Companion companion3 = xt.INSTANCE;
                int iIntValue = ((Integer) yt.setY(new Object[]{supportedCipherSuites, "TLS_FALLBACK_SCSV", (Comparator) xt.Companion.setOnFocusChangeListener(new Object[0], -197045215, 197045218, (int) System.currentTimeMillis())}, 1838081140, -1838081135, (int) System.currentTimeMillis())).intValue();
                if (!(!zBooleanValue)) {
                    int i96 = f61946f;
                    int i97 = i96 + 23;
                    f61945e = i97 % 128;
                    int i98 = i97 % 2;
                    if (iIntValue != -1) {
                        int i99 = i96 & 69;
                        int i100 = (i96 ^ 69) | i99;
                        int i101 = ((i99 | i100) << 1) - (i100 ^ i99);
                        f61945e = i101 % 128;
                        if (i101 % 2 != 0) {
                            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "");
                            String str2 = supportedCipherSuites[iIntValue];
                            Intrinsics.checkNotNullExpressionValue(str2, "");
                            throw null;
                        }
                        Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "");
                        String str3 = supportedCipherSuites[iIntValue];
                        Intrinsics.checkNotNullExpressionValue(str3, "");
                        enabledCipherSuites = (String[]) yt.setY(new Object[]{enabledCipherSuites, str3}, -1660299830, 1660299878, (int) System.currentTimeMillis());
                        int i102 = f61946f;
                        int i103 = (i102 & (-52)) | ((~i102) & 51);
                        int i104 = (i102 & 51) << 1;
                        int i105 = (i103 & i104) + (i104 | i103);
                        f61945e = i105 % 128;
                        int i106 = i105 % 2;
                    }
                }
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode(xuVar4);
                Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "");
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (setCompoundDrawableTintBlendMode) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode, (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length)}, -318600108, 318600114, System.identityHashCode(setcompounddrawabletintblendmode));
                Intrinsics.checkNotNullExpressionValue(enabledProtocols, "");
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = (setCompoundDrawableTintBlendMode) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode2, (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)}, -1450531074, 1450531083, System.identityHashCode(setcompounddrawabletintblendmode2));
                xu xuVar5 = (xu) setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode3}, -1601996436, 1601996438, System.identityHashCode(setcompounddrawabletintblendmode3));
                int i107 = f61946f;
                int i108 = i107 ^ 89;
                int i109 = ((i107 & 89) | i108) << 1;
                int i110 = -i108;
                int i111 = (i109 ^ i110) + ((i109 & i110) << 1);
                f61945e = i111 % 128;
                if (i111 % 2 == 0) {
                    return xuVar5;
                }
                int i112 = 86 / 0;
                return xuVar5;
            case 7:
                xu xuVar6 = (xu) objArr[0];
                int i113 = f61946f;
                int i114 = i113 & 61;
                int i115 = (i113 ^ 61) | i114;
                int i116 = (i114 & i115) + (i114 | i115);
                f61945e = i116 % 128;
                int i117 = i116 % 2;
                if (!xuVar6.setDividerPadding) {
                    int i118 = i113 + 125;
                    int i119 = i118 % 128;
                    f61945e = i119;
                    int i120 = i118 % 2;
                    int i121 = i119 & 5;
                    int i122 = ((i119 | 5) & (~i121)) + (i121 << 1);
                    f61946f = i122 % 128;
                    int i123 = i122 % 2;
                    list = "ConnectionSpec()";
                } else {
                    StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
                    sb2.append((Object) Objects.toString((List) setX(new Object[]{xuVar6}, -295438716, 295438721, System.identityHashCode(xuVar6)), "[all enabled]"));
                    sb2.append(", tlsVersions=");
                    sb2.append((Object) Objects.toString((List) setX(new Object[]{xuVar6}, 1049653417, -1049653413, System.identityHashCode(xuVar6)), "[all enabled]"));
                    sb2.append(", supportsTlsExtensions=");
                    sb2.append(xuVar6.setY);
                    sb2.append(RootService.CLOSE_BRACKET);
                    list = sb2.toString();
                    int i124 = f61946f + 39;
                    f61945e = i124 % 128;
                    if (i124 % 2 != 0) {
                        int i125 = 50 / 0;
                    }
                }
                break;
            case 8:
                xu xuVar7 = (xu) objArr[0];
                int i126 = f61945e;
                int i127 = (i126 ^ 85) + ((i126 & 85) << 1);
                int i128 = i127 % 128;
                f61946f = i128;
                if (i127 % 2 == 0) {
                    if (!xuVar7.setDividerPadding) {
                        i24 = 4;
                    } else {
                        int i129 = (i128 & (-70)) | ((~i128) & 69);
                        int i130 = (i128 & 69) << 1;
                        i14 = (i129 & i130) + (i129 | i130);
                        f61945e = i14 % 128;
                        if (i14 % 2 != 0) {
                            strArr = xuVar7.f61949c;
                            i15 = 32469;
                            if (strArr == null) {
                                int i131 = i128 & 101;
                                int i132 = (i128 ^ 101) | i131;
                                int i133 = ((i131 | i132) << 1) - (i132 ^ i131);
                                f61945e = i133 % 128;
                                int i134 = i133 % 2;
                                iHashCode = 0;
                            } else {
                                iHashCode = Arrays.hashCode(strArr);
                                int i135 = f61946f + 21;
                                f61945e = i135 % 128;
                                int i136 = i135 % 2;
                            }
                        } else {
                            strArr = xuVar7.f61949c;
                            i15 = 527;
                            if (strArr == null) {
                                int i137 = i128 & 101;
                                int i138 = (i128 ^ 101) | i137;
                                int i139 = ((i137 | i138) << 1) - (i138 ^ i137);
                                f61945e = i139 % 128;
                                int i1310 = i139 % 2;
                                iHashCode = 0;
                            } else {
                                iHashCode = Arrays.hashCode(strArr);
                                int i1311 = f61946f + 21;
                                f61945e = i1311 % 128;
                                int i1312 = i1311 % 2;
                            }
                        }
                        int i140 = i15 & iHashCode;
                        int i141 = (iHashCode ^ i15) | i140;
                        int i142 = (i140 & i141) + (i141 | i140);
                        int i143 = i142 * 31;
                        strArr2 = xuVar7.f61950d;
                        if (strArr2 == null) {
                            int i144 = f61945e;
                            i18 = (((i144 | 80) << 1) - (i144 ^ 80)) - 1;
                            f61946f = i18 % 128;
                            if (i18 % 2 == 0) {
                                iHashCode2 = 1;
                            } else {
                                iHashCode2 = 0;
                            }
                            int i145 = i144 & 121;
                            int i146 = (((i144 ^ 121) | i145) << 1) - ((i144 | 121) & (~i145));
                            f61946f = i146 % 128;
                            int i147 = i146 % 2;
                        } else {
                            iHashCode2 = Arrays.hashCode(strArr2);
                            int i148 = f61946f;
                            int i149 = ((i148 ^ 5) | (i148 & 5)) << 1;
                            int i150 = -(((~i148) & 5) | (i148 & (-6)));
                            int i151 = (i149 ^ i150) + ((i150 & i149) << 1);
                            f61945e = i151 % 128;
                            int i152 = i151 % 2;
                        }
                        int iIdentityHashCode = System.identityHashCode(xuVar7);
                        int i153 = iHashCode2 * 881;
                        int i154 = -(-(i142 * 27311));
                        int i155 = i153 & i154;
                        int i156 = (((i154 | i153) & (~i155)) - (~(i155 << 1))) - 1;
                        int i157 = ~iHashCode2;
                        int i158 = ~i143;
                        int i159 = i158 & (i158 | i143);
                        int i160 = (~i159) & i157;
                        int i161 = ~i157;
                        int i162 = i160 | (i159 & i161);
                        int i163 = i157 & i159;
                        int i164 = (i162 & i163) | (i162 ^ i163);
                        int i165 = ~i164;
                        int i166 = (i164 | i165) & i165;
                        int i167 = i157 & iIdentityHashCode;
                        int i168 = (~i167) & (i157 | iIdentityHashCode);
                        int i169 = ~iIdentityHashCode;
                        int i170 = i167 | i168;
                        int i171 = ~i170;
                        int i172 = (i170 | i171) & i171;
                        int i173 = (i166 & i172) | (i166 ^ i172);
                        int i174 = i159 & iIdentityHashCode;
                        int i175 = (i159 | iIdentityHashCode) & (~i174);
                        int i176 = (i175 & i174) | (i175 ^ i174);
                        int i177 = ~i176;
                        int i178 = (i176 | i177) & i177;
                        int i179 = i173 ^ i178;
                        int i180 = i178 & i173;
                        int i181 = (i156 - (~(-(-(((i180 & i179) | (i179 ^ i180)) * (-880)))))) - 1;
                        int i182 = (i169 | iIdentityHashCode) & i169;
                        int i183 = ((~i182) & i157) | (i182 & i161);
                        int i184 = i157 & i182;
                        int i185 = ~((i184 & i183) | (i183 ^ i184));
                        int i186 = (i143 & i185) | (i143 ^ i185);
                        int i187 = iHashCode2 ^ iIdentityHashCode;
                        int i188 = iIdentityHashCode & iHashCode2;
                        int i189 = ~((i188 & i187) | (i187 ^ i188));
                        int i190 = ((i186 & i189) | (i186 ^ i189)) * (-880);
                        int i191 = i181 & i190;
                        int i192 = i191 + ((i190 ^ i181) | i191);
                        int i193 = -(~(-(-(i189 * 880))));
                        int i194 = ((i192 ^ i193) + ((i193 & i192) << 1)) - 1;
                        int i195 = i194 * 31;
                        if (xuVar7.setY) {
                            i17 = (-2) - ((f61946f + 22) ^ (-1));
                            f61945e = i17 % 128;
                            if (i17 % 2 != 0) {
                                i16 = 0;
                            }
                            int iIdentityHashCode2 = System.identityHashCode(xuVar7);
                            int i196 = i16 * (-751);
                            int i197 = -(~(-(-(i194 * (-23281)))));
                            int i198 = (((i196 | i197) << 1) - (i197 ^ i196)) - 1;
                            int i199 = ~i16;
                            int i200 = ~i195;
                            int i201 = (i200 | i195) & i200;
                            int i202 = i199 & i201;
                            int i203 = (i199 ^ i201) | i202;
                            int i204 = ~i203;
                            int i205 = (i203 | i204) & i204;
                            int i206 = ~((i199 ^ iIdentityHashCode2) | (i199 & iIdentityHashCode2));
                            int i207 = ((i205 & i206) | (i205 ^ i206)) * ReturnCode.ERR_CONN_IO;
                            int i208 = ((i198 | i207) << 1) - (i198 ^ i207);
                            int i209 = i199 ^ i195;
                            int i210 = i199 & i195;
                            int i211 = (i209 & i210) | (i209 ^ i210);
                            int i212 = i211 & iIdentityHashCode2;
                            int i213 = (iIdentityHashCode2 | i211) & (~i212);
                            int i214 = ((~((i213 & i212) | (i213 ^ i212))) * (-1504)) + i208;
                            int i215 = ~((i195 & (~i199)) | (i200 & i199) | i210);
                            int i216 = ((~i201) & i16) | i202;
                            int i217 = i201 & i16;
                            int i218 = ~((i216 & i217) | (i216 ^ i217));
                            int i219 = i215 & i218;
                            int i220 = (i215 | i218) & (~i219);
                            int i221 = -(~(((i220 & i219) | (i220 ^ i219)) * 752));
                            i24 = (-2) - ((((i214 | i221) << 1) - (i214 ^ i221)) ^ (-1));
                            int i222 = f61945e;
                            int i223 = (i222 | 23) << 1;
                            int i224 = -(((~i222) & 23) | (i222 & (-24)));
                            int i225 = (i223 & i224) + (i224 | i223);
                            f61946f = i225 % 128;
                            int i226 = i225 % 2;
                        } else {
                            int i227 = f61945e;
                            int i228 = ((i227 | 65) << 1) - (i227 ^ 65);
                            f61946f = i228 % 128;
                            int i229 = i228 % 2;
                        }
                        i16 = 1;
                        int iIdentityHashCode3 = System.identityHashCode(xuVar7);
                        int i1910 = i16 * (-751);
                        int i1911 = -(~(-(-(i194 * (-23281)))));
                        int i1912 = (((i1910 | i1911) << 1) - (i1911 ^ i1910)) - 1;
                        int i1913 = ~i16;
                        int i2010 = ~i195;
                        int i2011 = (i2010 | i195) & i2010;
                        int i2012 = i1913 & i2011;
                        int i2013 = (i1913 ^ i2011) | i2012;
                        int i2014 = ~i2013;
                        int i2015 = (i2013 | i2014) & i2014;
                        int i2016 = ~((i1913 ^ iIdentityHashCode3) | (i1913 & iIdentityHashCode3));
                        int i2017 = ((i2015 & i2016) | (i2015 ^ i2016)) * ReturnCode.ERR_CONN_IO;
                        int i2018 = ((i1912 | i2017) << 1) - (i1912 ^ i2017);
                        int i2019 = i1913 ^ i195;
                        int i2110 = i1913 & i195;
                        int i2111 = (i2019 & i2110) | (i2019 ^ i2110);
                        int i2112 = i2111 & iIdentityHashCode3;
                        int i2113 = (iIdentityHashCode3 | i2111) & (~i2112);
                        int i2114 = ((~((i2113 & i2112) | (i2113 ^ i2112))) * (-1504)) + i2018;
                        int i2115 = ~((i195 & (~i1913)) | (i2010 & i1913) | i2110);
                        int i2116 = ((~i2011) & i16) | i2012;
                        int i2117 = i2011 & i16;
                        int i2118 = ~((i2116 & i2117) | (i2116 ^ i2117));
                        int i2119 = i2115 & i2118;
                        int i2210 = (i2115 | i2118) & (~i2119);
                        int i2211 = -(~(((i2210 & i2119) | (i2210 ^ i2119)) * 752));
                        i24 = (-2) - ((((i2114 | i2211) << 1) - (i2114 ^ i2211)) ^ (-1));
                        int i2212 = f61945e;
                        int i2213 = (i2212 | 23) << 1;
                        int i2214 = -(((~i2212) & 23) | (i2212 & (-24)));
                        int i2215 = (i2213 & i2214) + (i2214 | i2213);
                        f61946f = i2215 % 128;
                        int i2216 = i2215 % 2;
                    }
                } else if (xuVar7.setDividerPadding) {
                    int i1210 = (i128 & (-70)) | ((~i128) & 69);
                    int i1313 = (i128 & 69) << 1;
                    i14 = (i1210 & i1313) + (i1210 | i1313);
                    f61945e = i14 % 128;
                    if (i14 % 2 != 0) {
                        strArr = xuVar7.f61949c;
                        i15 = 32469;
                        if (strArr == null) {
                            int i1314 = i128 & 101;
                            int i1315 = (i128 ^ 101) | i1314;
                            int i1316 = ((i1314 | i1315) << 1) - (i1315 ^ i1314);
                            f61945e = i1316 % 128;
                            int i1317 = i1316 % 2;
                            iHashCode = 0;
                        } else {
                            iHashCode = Arrays.hashCode(strArr);
                            int i1318 = f61946f + 21;
                            f61945e = i1318 % 128;
                            int i1319 = i1318 % 2;
                        }
                    } else {
                        strArr = xuVar7.f61949c;
                        i15 = 527;
                        if (strArr == null) {
                            int i13110 = i128 & 101;
                            int i13111 = (i128 ^ 101) | i13110;
                            int i13112 = ((i13110 | i13111) << 1) - (i13111 ^ i13110);
                            f61945e = i13112 % 128;
                            int i13113 = i13112 % 2;
                            iHashCode = 0;
                        } else {
                            iHashCode = Arrays.hashCode(strArr);
                            int i13114 = f61946f + 21;
                            f61945e = i13114 % 128;
                            int i13115 = i13114 % 2;
                        }
                    }
                    int i1410 = i15 & iHashCode;
                    int i1411 = (iHashCode ^ i15) | i1410;
                    int i1412 = (i1410 & i1411) + (i1411 | i1410);
                    int i1413 = i1412 * 31;
                    strArr2 = xuVar7.f61950d;
                    if (strArr2 == null) {
                        int i1414 = f61945e;
                        i18 = (((i1414 | 80) << 1) - (i1414 ^ 80)) - 1;
                        f61946f = i18 % 128;
                        if (i18 % 2 == 0) {
                            iHashCode2 = 1;
                        } else {
                            iHashCode2 = 0;
                        }
                        int i1415 = i1414 & 121;
                        int i1416 = (((i1414 ^ 121) | i1415) << 1) - ((i1414 | 121) & (~i1415));
                        f61946f = i1416 % 128;
                        int i1417 = i1416 % 2;
                    } else {
                        iHashCode2 = Arrays.hashCode(strArr2);
                        int i1418 = f61946f;
                        int i1419 = ((i1418 ^ 5) | (i1418 & 5)) << 1;
                        int i1510 = -(((~i1418) & 5) | (i1418 & (-6)));
                        int i1511 = (i1419 ^ i1510) + ((i1510 & i1419) << 1);
                        f61945e = i1511 % 128;
                        int i1512 = i1511 % 2;
                    }
                    int iIdentityHashCode4 = System.identityHashCode(xuVar7);
                    int i1513 = iHashCode2 * 881;
                    int i1514 = -(-(i1412 * 27311));
                    int i1515 = i1513 & i1514;
                    int i1516 = (((i1514 | i1513) & (~i1515)) - (~(i1515 << 1))) - 1;
                    int i1517 = ~iHashCode2;
                    int i1518 = ~i1413;
                    int i1519 = i1518 & (i1518 | i1413);
                    int i1610 = (~i1519) & i1517;
                    int i1611 = ~i1517;
                    int i1612 = i1610 | (i1519 & i1611);
                    int i1613 = i1517 & i1519;
                    int i1614 = (i1612 & i1613) | (i1612 ^ i1613);
                    int i1615 = ~i1614;
                    int i1616 = (i1614 | i1615) & i1615;
                    int i1617 = i1517 & iIdentityHashCode4;
                    int i1618 = (~i1617) & (i1517 | iIdentityHashCode4);
                    int i1619 = ~iIdentityHashCode4;
                    int i1710 = i1617 | i1618;
                    int i1711 = ~i1710;
                    int i1712 = (i1710 | i1711) & i1711;
                    int i1713 = (i1616 & i1712) | (i1616 ^ i1712);
                    int i1714 = i1519 & iIdentityHashCode4;
                    int i1715 = (i1519 | iIdentityHashCode4) & (~i1714);
                    int i1716 = (i1715 & i1714) | (i1715 ^ i1714);
                    int i1717 = ~i1716;
                    int i1718 = (i1716 | i1717) & i1717;
                    int i1719 = i1713 ^ i1718;
                    int i1810 = i1718 & i1713;
                    int i1811 = (i1516 - (~(-(-(((i1810 & i1719) | (i1719 ^ i1810)) * (-880)))))) - 1;
                    int i1812 = (i1619 | iIdentityHashCode4) & i1619;
                    int i1813 = ((~i1812) & i1517) | (i1812 & i1611);
                    int i1814 = i1517 & i1812;
                    int i1815 = ~((i1814 & i1813) | (i1813 ^ i1814));
                    int i1816 = (i1413 & i1815) | (i1413 ^ i1815);
                    int i1817 = iHashCode2 ^ iIdentityHashCode4;
                    int i1818 = iIdentityHashCode4 & iHashCode2;
                    int i1819 = ~((i1818 & i1817) | (i1817 ^ i1818));
                    int i1914 = ((i1816 & i1819) | (i1816 ^ i1819)) * (-880);
                    int i1915 = i1811 & i1914;
                    int i1916 = i1915 + ((i1914 ^ i1811) | i1915);
                    int i1917 = -(~(-(-(i1819 * 880))));
                    int i1918 = ((i1916 ^ i1917) + ((i1917 & i1916) << 1)) - 1;
                    int i1919 = i1918 * 31;
                    if (xuVar7.setY) {
                        i17 = (-2) - ((f61946f + 22) ^ (-1));
                        f61945e = i17 % 128;
                        if (i17 % 2 != 0) {
                            i16 = 0;
                        }
                        int iIdentityHashCode5 = System.identityHashCode(xuVar7);
                        int i19110 = i16 * (-751);
                        int i19111 = -(~(-(-(i1918 * (-23281)))));
                        int i19112 = (((i19110 | i19111) << 1) - (i19111 ^ i19110)) - 1;
                        int i19113 = ~i16;
                        int i20110 = ~i1919;
                        int i20111 = (i20110 | i1919) & i20110;
                        int i20112 = i19113 & i20111;
                        int i20113 = (i19113 ^ i20111) | i20112;
                        int i20114 = ~i20113;
                        int i20115 = (i20113 | i20114) & i20114;
                        int i20116 = ~((i19113 ^ iIdentityHashCode5) | (i19113 & iIdentityHashCode5));
                        int i20117 = ((i20115 & i20116) | (i20115 ^ i20116)) * ReturnCode.ERR_CONN_IO;
                        int i20118 = ((i19112 | i20117) << 1) - (i19112 ^ i20117);
                        int i20119 = i19113 ^ i1919;
                        int i21110 = i19113 & i1919;
                        int i21111 = (i20119 & i21110) | (i20119 ^ i21110);
                        int i21112 = i21111 & iIdentityHashCode5;
                        int i21113 = (iIdentityHashCode5 | i21111) & (~i21112);
                        int i21114 = ((~((i21113 & i21112) | (i21113 ^ i21112))) * (-1504)) + i20118;
                        int i21115 = ~((i1919 & (~i19113)) | (i20110 & i19113) | i21110);
                        int i21116 = ((~i20111) & i16) | i20112;
                        int i21117 = i20111 & i16;
                        int i21118 = ~((i21116 & i21117) | (i21116 ^ i21117));
                        int i21119 = i21115 & i21118;
                        int i2217 = (i21115 | i21118) & (~i21119);
                        int i2218 = -(~(((i2217 & i21119) | (i2217 ^ i21119)) * 752));
                        i24 = (-2) - ((((i21114 | i2218) << 1) - (i21114 ^ i2218)) ^ (-1));
                        int i2219 = f61945e;
                        int i22110 = (i2219 | 23) << 1;
                        int i22111 = -(((~i2219) & 23) | (i2219 & (-24)));
                        int i22112 = (i22110 & i22111) + (i22111 | i22110);
                        f61946f = i22112 % 128;
                        int i22113 = i22112 % 2;
                    } else {
                        int i2220 = f61945e;
                        int i2221 = ((i2220 | 65) << 1) - (i2220 ^ 65);
                        f61946f = i2221 % 128;
                        int i2222 = i2221 % 2;
                    }
                    i16 = 1;
                    int iIdentityHashCode6 = System.identityHashCode(xuVar7);
                    int i19114 = i16 * (-751);
                    int i19115 = -(~(-(-(i1918 * (-23281)))));
                    int i19116 = (((i19114 | i19115) << 1) - (i19115 ^ i19114)) - 1;
                    int i19117 = ~i16;
                    int i201110 = ~i1919;
                    int i201111 = (i201110 | i1919) & i201110;
                    int i201112 = i19117 & i201111;
                    int i201113 = (i19117 ^ i201111) | i201112;
                    int i201114 = ~i201113;
                    int i201115 = (i201113 | i201114) & i201114;
                    int i201116 = ~((i19117 ^ iIdentityHashCode6) | (i19117 & iIdentityHashCode6));
                    int i201117 = ((i201115 & i201116) | (i201115 ^ i201116)) * ReturnCode.ERR_CONN_IO;
                    int i201118 = ((i19116 | i201117) << 1) - (i19116 ^ i201117);
                    int i201119 = i19117 ^ i1919;
                    int i211110 = i19117 & i1919;
                    int i211111 = (i201119 & i211110) | (i201119 ^ i211110);
                    int i211112 = i211111 & iIdentityHashCode6;
                    int i211113 = (iIdentityHashCode6 | i211111) & (~i211112);
                    int i211114 = ((~((i211113 & i211112) | (i211113 ^ i211112))) * (-1504)) + i201118;
                    int i211115 = ~((i1919 & (~i19117)) | (i201110 & i19117) | i211110);
                    int i211116 = ((~i201111) & i16) | i201112;
                    int i211117 = i201111 & i16;
                    int i211118 = ~((i211116 & i211117) | (i211116 ^ i211117));
                    int i211119 = i211115 & i211118;
                    int i22114 = (i211115 | i211118) & (~i211119);
                    int i22115 = -(~(((i22114 & i211119) | (i22114 ^ i211119)) * 752));
                    i24 = (-2) - ((((i211114 | i22115) << 1) - (i211114 ^ i22115)) ^ (-1));
                    int i22116 = f61945e;
                    int i22117 = (i22116 | 23) << 1;
                    int i22118 = -(((~i22116) & 23) | (i22116 & (-24)));
                    int i22119 = (i22117 & i22118) + (i22118 | i22117);
                    f61946f = i22119 % 128;
                    int i221110 = i22119 % 2;
                }
                int i230 = f61946f;
                int i231 = i230 | 47;
                int i232 = i231 << 1;
                int i233 = -((~(i230 & 47)) & i231);
                int i234 = (i232 & i233) + (i233 | i232);
                f61945e = i234 % 128;
                if (i234 % 2 == 0) {
                    return Integer.valueOf(i24);
                }
                throw null;
            case 9:
                xu xuVar8 = (xu) objArr[0];
                int i235 = f61945e;
                int i236 = (i235 ^ 67) + ((i235 & 67) << 1);
                f61946f = i236 % 128;
                if (i236 % 2 == 0) {
                    String[] strArr8 = xuVar8.f61949c;
                    throw null;
                }
                String[] strArr9 = xuVar8.f61949c;
                int i237 = i235 ^ 15;
                int i238 = (i235 & 15) << 1;
                int i239 = ((i237 | i238) << 1) - (i237 ^ i238);
                f61946f = i239 % 128;
                int i240 = i239 % 2;
                return strArr9;
            case 10:
                xu xuVar9 = (xu) objArr[0];
                int i241 = f61945e;
                int i242 = (i241 ^ 5) + ((i241 & 5) << 1);
                int i243 = i242 % 128;
                f61946f = i243;
                int i244 = i242 % 2;
                boolean z11 = xuVar9.setY;
                int i245 = ((i243 ^ 37) | (i243 & 37)) << 1;
                int i246 = -(((~i243) & 37) | (i243 & (-38)));
                int i247 = (i245 & i246) + (i246 | i245);
                f61945e = i247 % 128;
                if (i247 % 2 == 0) {
                    return Boolean.valueOf(z11);
                }
                throw null;
            case 11:
                xu xuVar10 = (xu) objArr[0];
                int i248 = f61945e + 29;
                f61946f = i248 % 128;
                if (i248 % 2 != 0) {
                    return xuVar10.f61950d;
                }
                String[] strArr10 = xuVar10.f61950d;
                throw null;
            default:
                xu xuVar11 = (xu) objArr[0];
                SSLSocket sSLSocket2 = (SSLSocket) objArr[1];
                int i249 = f61946f;
                int i250 = i249 & 81;
                int i251 = -(-(i249 | 81));
                int i252 = (i250 & i251) + (i251 | i250);
                f61945e = i252 % 128;
                if (i252 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(sSLSocket2, "");
                    boolean z12 = xuVar11.setDividerPadding;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(sSLSocket2, "");
                if (xuVar11.setDividerPadding) {
                    String[] strArr11 = xuVar11.f61950d;
                    if (strArr11 == null) {
                        strArr3 = xuVar11.f61949c;
                        if (strArr3 != null) {
                            int i253 = f61945e;
                            int i254 = i253 & 71;
                            int i255 = ((i253 | 71) & (~i254)) + (i254 << 1);
                            f61946f = i255 % 128;
                            int i256 = i255 % 2;
                            enabledCipherSuites2 = sSLSocket2.getEnabledCipherSuites();
                            xt.Companion companion4 = xt.INSTANCE;
                            if (!((Boolean) yt.setY(new Object[]{strArr3, enabledCipherSuites2, (Comparator) xt.Companion.setOnFocusChangeListener(new Object[0], -197045215, 197045218, (int) System.currentTimeMillis())}, 564857492, -564857466, (int) System.currentTimeMillis())).booleanValue()) {
                                int i257 = f61946f;
                                int i258 = i257 & 17;
                                int i259 = -(-(i257 | 17));
                                int i260 = (i258 ^ i259) + ((i258 & i259) << 1);
                                f61945e = i260 % 128;
                                int i261 = i260 % 2;
                                int i262 = i257 & 87;
                                int i263 = ((i257 ^ 87) | i262) << 1;
                                int i264 = -((i257 | 87) & (~i262));
                                i19 = (i263 & i264) + (i264 | i263);
                                f61945e = i19 % 128;
                                if (i19 % 2 != 0) {
                                    throw null;
                                }
                            }
                        }
                        int i265 = f61945e;
                        int i266 = (i265 | 109) << 1;
                        int i267 = -(((~i265) & 109) | (i265 & (-110)));
                        int i268 = (i266 & i267) + (i267 | i266);
                        f61946f = i268 % 128;
                        int i269 = i268 % 2;
                        list = Boolean.TRUE;
                    } else {
                        int i270 = f61946f;
                        int i271 = i270 & 119;
                        int i272 = (((i270 ^ 119) | i271) << 1) - ((i270 | 119) & (~i271));
                        f61945e = i272 % 128;
                        if (i272 % 2 != 0) {
                            int i273 = 74 / 0;
                            if (!((Boolean) yt.setY(new Object[]{strArr11, sSLSocket2.getEnabledProtocols(), e.naturalOrder()}, 564857492, -564857466, (int) System.currentTimeMillis())).booleanValue()) {
                                int i274 = f61946f;
                                int i275 = i274 & 51;
                                int i276 = (i274 ^ 51) | i275;
                                i20 = (i275 ^ i276) + ((i276 & i275) << 1);
                                f61945e = i20 % 128;
                                if (i20 % 2 != 0) {
                                    int i277 = 79 / 0;
                                    list = Boolean.FALSE;
                                }
                            } else {
                                strArr3 = xuVar11.f61949c;
                                if (strArr3 != null) {
                                    int i2510 = f61945e;
                                    int i2511 = i2510 & 71;
                                    int i2512 = ((i2510 | 71) & (~i2511)) + (i2511 << 1);
                                    f61946f = i2512 % 128;
                                    int i2513 = i2512 % 2;
                                    enabledCipherSuites2 = sSLSocket2.getEnabledCipherSuites();
                                    xt.Companion companion5 = xt.INSTANCE;
                                    if (!((Boolean) yt.setY(new Object[]{strArr3, enabledCipherSuites2, (Comparator) xt.Companion.setOnFocusChangeListener(new Object[0], -197045215, 197045218, (int) System.currentTimeMillis())}, 564857492, -564857466, (int) System.currentTimeMillis())).booleanValue()) {
                                        int i2514 = f61946f;
                                        int i2515 = i2514 & 17;
                                        int i2516 = -(-(i2514 | 17));
                                        int i2610 = (i2515 ^ i2516) + ((i2515 & i2516) << 1);
                                        f61945e = i2610 % 128;
                                        int i2611 = i2610 % 2;
                                        int i2612 = i2514 & 87;
                                        int i2613 = ((i2514 ^ 87) | i2612) << 1;
                                        int i2614 = -((i2514 | 87) & (~i2612));
                                        i19 = (i2613 & i2614) + (i2614 | i2613);
                                        f61945e = i19 % 128;
                                        if (i19 % 2 != 0) {
                                            throw null;
                                        }
                                    }
                                }
                                int i2615 = f61945e;
                                int i2616 = (i2615 | 109) << 1;
                                int i2617 = -(((~i2615) & 109) | (i2615 & (-110)));
                                int i2618 = (i2616 & i2617) + (i2617 | i2616);
                                f61946f = i2618 % 128;
                                int i2619 = i2618 % 2;
                                list = Boolean.TRUE;
                            }
                        } else if (!((Boolean) yt.setY(new Object[]{strArr11, sSLSocket2.getEnabledProtocols(), e.naturalOrder()}, 564857492, -564857466, (int) System.currentTimeMillis())).booleanValue()) {
                            int i278 = f61946f;
                            int i279 = i278 & 51;
                            int i2710 = (i278 ^ 51) | i279;
                            i20 = (i279 ^ i2710) + ((i2710 & i279) << 1);
                            f61945e = i20 % 128;
                            if (i20 % 2 != 0) {
                                int i2711 = 79 / 0;
                                list = Boolean.FALSE;
                            }
                        } else {
                            strArr3 = xuVar11.f61949c;
                            if (strArr3 != null) {
                                int i2517 = f61945e;
                                int i2518 = i2517 & 71;
                                int i2519 = ((i2517 | 71) & (~i2518)) + (i2518 << 1);
                                f61946f = i2519 % 128;
                                int i25110 = i2519 % 2;
                                enabledCipherSuites2 = sSLSocket2.getEnabledCipherSuites();
                                xt.Companion companion6 = xt.INSTANCE;
                                if (!((Boolean) yt.setY(new Object[]{strArr3, enabledCipherSuites2, (Comparator) xt.Companion.setOnFocusChangeListener(new Object[0], -197045215, 197045218, (int) System.currentTimeMillis())}, 564857492, -564857466, (int) System.currentTimeMillis())).booleanValue()) {
                                    int i25111 = f61946f;
                                    int i25112 = i25111 & 17;
                                    int i25113 = -(-(i25111 | 17));
                                    int i26110 = (i25112 ^ i25113) + ((i25112 & i25113) << 1);
                                    f61945e = i26110 % 128;
                                    int i26111 = i26110 % 2;
                                    int i26112 = i25111 & 87;
                                    int i26113 = ((i25111 ^ 87) | i26112) << 1;
                                    int i26114 = -((i25111 | 87) & (~i26112));
                                    i19 = (i26113 & i26114) + (i26114 | i26113);
                                    f61945e = i19 % 128;
                                    if (i19 % 2 != 0) {
                                        throw null;
                                    }
                                }
                            }
                            int i26115 = f61945e;
                            int i26116 = (i26115 | 109) << 1;
                            int i26117 = -(((~i26115) & 109) | (i26115 & (-110)));
                            int i26118 = (i26116 & i26117) + (i26117 | i26116);
                            f61946f = i26118 % 128;
                            int i26119 = i26118 % 2;
                            list = Boolean.TRUE;
                        }
                    }
                } else {
                    int i280 = f61945e + 87;
                    f61946f = i280 % 128;
                    if (i280 % 2 == 0) {
                        throw null;
                    }
                }
                list = Boolean.FALSE;
                break;
                break;
        }
        return list;
    }

    public static final /* synthetic */ String[] setY(xu xuVar) {
        return (String[]) setX(new Object[]{xuVar}, 334393234, -334393225, (int) System.currentTimeMillis());
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setX(new Object[]{this, p4}, 1490831598, -1490831595, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, 1898093808, -1898093800, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setDividerPadding")
    public final boolean setDividerPadding() {
        return ((Boolean) setX(new Object[]{this}, 1501770906, -1501770896, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, -301266060, 301266067, System.identityHashCode(this));
    }

    public final boolean setOnFocusChangeListener(@NotNull SSLSocket p4) {
        return ((Boolean) setX(new Object[]{this, p4}, 1573978703, -1573978703, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setY")
    public final boolean setY() {
        return ((Boolean) setX(new Object[]{this}, -1423293510, 1423293512, System.identityHashCode(this))).booleanValue();
    }

    public final void setOnFocusChangeListener(@NotNull SSLSocket p4, boolean p10) {
        setX(new Object[]{this, p4, Boolean.valueOf(p10)}, -512663162, 512663163, System.identityHashCode(this));
    }
}
