package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ko {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56810c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56811d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ka f56812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<fk> f56813b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/dc;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<dc, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f56814p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56815q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56816r0 = 1;

        static {
            int i10 = f56816r0;
            int i11 = i10 & 61;
            int i12 = (i11 - (~(-(-((i10 ^ 61) | i11))))) - 1;
            f56815q0 = i12 % 128;
            int i13 = i12 % 2;
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ((i10 | i11) * (-470)) + (i11 * 471) + (i10 * 471);
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = (~(i14 | i15)) | (~(i15 | i12));
            int i17 = ~(i11 | (~i12) | i10);
            if ((((~(i10 | i15 | i12)) | i17) * 470) + ((i16 | i17) * (-470)) + i13 == 1) {
                dc dcVar = (dc) objArr[1];
                int i18 = f56816r0;
                int i19 = i18 & 71;
                int i20 = (i18 | 71) & (~i19);
                int i21 = i19 << 1;
                int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
                f56815q0 = i22 % 128;
                int i23 = i22 % 2;
                Intrinsics.checkNotNullParameter(dcVar, "");
                dc.setDividerPadding(new Object[]{dcVar, Boolean.TRUE}, 1763882755, -1763882755, System.identityHashCode(dcVar));
                int i24 = f56815q0;
                int i25 = ((i24 | 13) << 1) - (i24 ^ 13);
                f56816r0 = i25 % 128;
                int i26 = i25 % 2;
                return null;
            }
            a aVar = (a) objArr[0];
            Object obj = objArr[1];
            int i27 = f56816r0 + 65;
            f56815q0 = i27 % 128;
            dc dcVar2 = (dc) obj;
            if (i27 % 2 != 0) {
                a(new Object[]{aVar, dcVar2}, 980541216, -980541215, System.identityHashCode(aVar));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            a(new Object[]{aVar, dcVar2}, 980541216, -980541215, System.identityHashCode(aVar));
            Unit unit2 = Unit.INSTANCE;
            int i28 = f56815q0;
            int i29 = i28 ^ 55;
            int i30 = ((i28 & 55) | i29) << 1;
            int i31 = -i29;
            int i32 = (i30 & i31) + (i30 | i31);
            f56816r0 = i32 % 128;
            int i33 = i32 % 2;
            return unit2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(dc dcVar) {
            return a(new Object[]{this, dcVar}, 177158489, -177158489, System.identityHashCode(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ko(@NotNull ka kaVar, @NotNull Function0<? extends fk> function0) {
        Intrinsics.checkNotNullParameter(kaVar, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.f56812a = kaVar;
        this.f56813b = function0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:20:0x0107  */
    /* JADX WARN: Code duplicated, block: B:68:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:70:0x0614  */
    /* JADX WARN: Code duplicated, block: B:73:0x0644  */
    /* JADX WARN: Code duplicated, block: B:77:0x0697  */
    /* JADX WARN: Code duplicated, block: B:80:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:82:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x0717  */
    /* JADX WARN: Code duplicated, block: B:92:0x0754  */
    /* JADX WARN: Code duplicated, block: B:94:0x0756  */
    /* JADX WARN: Code restructure failed: missing block: B:132:?, code lost:
    
        return (com.mypinpad.tsdk.isolation.fk) setY(new java.lang.Object[]{r0, r1, r2}, 288223852, -288223850, java.lang.System.identityHashCode(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x023c, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.cr.setDividerPadding(new java.lang.Object[]{r1}, 1815100415, -1815100409, java.lang.System.identityHashCode(r1))).booleanValue() != true) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0257, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.cr.setDividerPadding(new java.lang.Object[]{r1}, 1815100415, -1815100409, java.lang.System.identityHashCode(r1))).booleanValue() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0259, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.ko.f56810c;
        r2 = ((r1 & (-30)) | ((~r1) & 29)) + ((r1 & 29) << 1);
        com.mypinpad.tsdk.isolation.ko.f56811d = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x026a, code lost:
    
        if ((r2 % 2) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x026c, code lost:
    
        r0 = (com.mypinpad.tsdk.isolation.fk) setY(new java.lang.Object[]{r0}, 544955638, -544955634, java.lang.System.identityHashCode(r0));
        r1 = com.mypinpad.tsdk.isolation.ko.f56810c + 75;
        com.mypinpad.tsdk.isolation.ko.f56811d = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0289, code lost:
    
        if ((r1 % 2) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x028e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x028f, code lost:
    
        r0 = (com.mypinpad.tsdk.isolation.fk) setY(new java.lang.Object[]{r0}, 544955638, -544955634, java.lang.System.identityHashCode(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x02a3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02bd, code lost:
    
        if ((!((java.lang.Boolean) com.mypinpad.tsdk.isolation.kh.setOnFocusChangeListener(new java.lang.Object[]{r2}, 563562359, -563562350, java.lang.System.identityHashCode(r2))).booleanValue()) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02bf, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.ko.f56810c;
        r8 = r3 & 27;
        r3 = (r3 | 27) & (~r8);
        r8 = -(-(r8 << 1));
        r9 = (r3 & r8) + (r3 | r8);
        com.mypinpad.tsdk.isolation.ko.f56811d = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02d3, code lost:
    
        if ((r9 % 2) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02ee, code lost:
    
        r0 = (com.mypinpad.tsdk.isolation.fk) setY(new java.lang.Object[]{r0, r1, r2}, 288223852, -288223850, java.lang.System.identityHashCode(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0304, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r18, int r19, int r20, int r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ko.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Nullable
    public final fk setX() {
        return (fk) setY(new Object[]{this}, 349467792, -349467792, System.identityHashCode(this));
    }
}
