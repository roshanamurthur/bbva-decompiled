package com.mypinpad.tsdk.isolation;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/gq;", "", "Lcom/mypinpad/tsdk/i/fk;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/fk;", "Lcom/mypinpad/tsdk/i/fi;", "p0", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "p1", "Lcom/mypinpad/tsdk/i/gr;", "p2", "Lcom/mypinpad/tsdk/i/setContentDescription;", "p3", "<init>", "(Lcom/mypinpad/tsdk/i/fi;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/gr;Lcom/mypinpad/tsdk/i/setContentDescription;)V", "setY"}, k = 1, mv = {1, 5, 1})
public final class gq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final List<TransactionFailed> f56057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final List<ft> f56058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final byte[] f56059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f56060h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56061i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final fi f56062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTextKeepState f56063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final gr f56064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56065d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setX", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f56066s0 = 0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f56067t0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ byte[] f56068p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ byte[] f56069q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ gq f56070r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(byte[] bArr, byte[] bArr2, gq gqVar) {
            super(1);
            this.f56068p0 = bArr;
            this.f56069q0 = bArr2;
            this.f56070r0 = gqVar;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11) {
            int i12 = ~i11;
            int i13 = (i12 * (-629)) + (i11 * (-628)) + (i10 * 630);
            int i14 = ~i10;
            if (((i14 | i11) * 629) + ((~(i12 | i14)) * (-629)) + i13 != 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i15 = f56066s0;
                int i16 = (i15 & (-104)) | ((~i15) & 103);
                int i17 = -(-((i15 & 103) << 1));
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                f56067t0 = i18 % 128;
                int i19 = i18 % 2;
                System.identityHashCode(aVar);
                a(new Object[]{aVar, (cv) obj}, 557897603, -557897602);
                Unit unit = Unit.INSTANCE;
                int i20 = f56066s0;
                int i21 = i20 & 95;
                int i22 = -(-(i20 | 95));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                f56067t0 = i23 % 128;
                if (i23 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
            a aVar2 = (a) objArr[0];
            cv cvVar = (cv) objArr[1];
            int i24 = f56067t0;
            int i25 = i24 ^ 77;
            int i26 = (i24 & 77) << 1;
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            f56066s0 = i27 % 128;
            if (i27 % 2 != 0) {
                Intrinsics.checkNotNullParameter(cvVar, "");
                Arrays.equals(aVar2.f56068p0, aVar2.f56069q0);
                throw null;
            }
            Intrinsics.checkNotNullParameter(cvVar, "");
            byte[] bArr = aVar2.f56068p0;
            byte[] bArr2 = aVar2.f56069q0;
            if (!Arrays.equals(bArr, bArr2)) {
                cv.setDividerPadding(new Object[]{cvVar}, 199649391, -199649372, System.identityHashCode(cvVar));
                int i28 = f56067t0;
                int i29 = i28 & 83;
                int i30 = i29 + ((i28 ^ 83) | i29);
                f56066s0 = i30 % 128;
                int i31 = i30 % 2;
            }
            gq gqVar = aVar2.f56070r0;
            if (!((Boolean) gq.setX(new Object[]{gqVar, bArr2}, -276942723, 276942723, (int) System.currentTimeMillis())).booleanValue()) {
                int i32 = f56067t0;
                int i33 = i32 & 95;
                int i34 = ((i32 | 95) & (~i33)) + (i33 << 1);
                f56066s0 = i34 % 128;
                int i35 = i34 % 2;
                cv.setDividerPadding(new Object[]{cvVar}, 234919463, -234919436, System.identityHashCode(cvVar));
                int i36 = f56066s0;
                int i37 = i36 & 69;
                int i38 = (i36 | 69) & (~i37);
                int i39 = -(-(i37 << 1));
                int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
                f56067t0 = i40 % 128;
                int i41 = i40 % 2;
            }
            TransactionCompleted compoundDrawableTintBlendMode = ((setContentDescription) gq.setX(new Object[]{gqVar}, -1437652932, 1437652933, (int) System.currentTimeMillis())).setCompoundDrawableTintBlendMode();
            fi fiVar = (fi) gq.setX(new Object[]{gqVar}, 71863946, -71863940, (int) System.currentTimeMillis());
            TransactionFailed suppressed = setAnimation.getSuppressed();
            if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar, (String) TransactionFailed.setX(new Object[]{suppressed}, 1914607362, -1914607356, System.identityHashCode(suppressed))}, -232375606, 232375652, System.identityHashCode(fiVar))).booleanValue()) {
                al alVar = new al(gq.setOnFocusChangeListener(gqVar));
                ai aiVar = (ai) ((setImageTintList) w.setX(new Object[]{alVar}, 1693919772, -1693919769, System.identityHashCode(alVar)));
                TransactionCompleted transactionCompleted = (TransactionCompleted) ai.setDividerPadding(new Object[]{aiVar}, 1408442774, -1408442774, System.identityHashCode(aiVar));
                if (((Integer) TransactionCompleted.setX(new Object[]{transactionCompleted, compoundDrawableTintBlendMode}, -354590257, 354590260, System.identityHashCode(transactionCompleted))).intValue() > 0) {
                    int i42 = f56066s0;
                    int i43 = ((i42 | 119) << 1) - (i42 ^ 119);
                    f56067t0 = i43 % 128;
                    if (i43 % 2 == 0) {
                        cv.setDividerPadding(new Object[]{cvVar}, 411204828, -411204817, System.identityHashCode(cvVar));
                        throw null;
                    }
                    cv.setDividerPadding(new Object[]{cvVar}, 411204828, -411204817, System.identityHashCode(cvVar));
                    int i44 = f56067t0 + 91;
                    f56066s0 = i44 % 128;
                    int i45 = i44 % 2;
                }
            }
            ak akVar = new ak(gq.setOnFocusChangeListener(gqVar));
            aj ajVar = (aj) ((setImageTintList) w.setX(new Object[]{akVar}, 1693919772, -1693919769, System.identityHashCode(akVar)));
            TransactionCompleted transactionCompleted2 = (TransactionCompleted) aj.setY(new Object[]{ajVar}, 919185106, -919185106, System.identityHashCode(ajVar));
            if (((Integer) TransactionCompleted.setX(new Object[]{transactionCompleted2, compoundDrawableTintBlendMode}, -354590257, 354590260, System.identityHashCode(transactionCompleted2))).intValue() < 0) {
                int i46 = f56067t0;
                int i47 = i46 | 31;
                int i48 = (i47 << 1) - ((~(i46 & 31)) & i47);
                f56066s0 = i48 % 128;
                if (i48 % 2 != 0) {
                    cv.setDividerPadding(new Object[]{cvVar, Boolean.FALSE}, -1217412403, 1217412419, System.identityHashCode(cvVar));
                } else {
                    cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1217412403, 1217412419, System.identityHashCode(cvVar));
                }
                int i49 = f56067t0 + 57;
                f56066s0 = i49 % 128;
                int i50 = i49 % 2;
            }
            int i51 = f56067t0;
            int i52 = i51 & 69;
            int i53 = (i51 ^ 69) | i52;
            int i54 = (i52 & i53) + (i53 | i52);
            f56066s0 = i54 % 128;
            int i55 = i54 % 2;
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            Object[] objArr = {this, cvVar};
            System.identityHashCode(this);
            return a(objArr, 1168090918, -1168090918);
        }
    }

    public /* synthetic */ class setDividerPadding {
        public static final /* synthetic */ int[] setDividerPadding;

        static {
            int[] iArr = new int[md.values().length];
            iArr[md.setCompoundDrawableTintBlendMode.ordinal()] = 1;
            iArr[md.setDividerPadding.ordinal()] = 2;
            iArr[md.setY.ordinal()] = 3;
            iArr[md.getNavBarTitleString.ordinal()] = 4;
            setDividerPadding = iArr;
            int i10 = 97 % 128;
            if (97 % 2 == 0) {
                throw null;
            }
        }
    }

    static {
        setAnimation setanimation = setAnimation.INSTANCE;
        f56057e = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], 2023104344, -2023104064, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 840618122, -840618073, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1817971805, -1817971762, (int) System.currentTimeMillis()), setAnimation.TerminalSessionDefaultImpls()});
        f56058f = CollectionsKt__CollectionsKt.listOf((Object[]) new ft[]{ft.ATTENDED_ONLINE_ONLY_NOT_RECOMMENDED_IN_TRANSIT, ft.ATTENDED_OFFLINE_WITH_ONLINE_CAPABILITY_TRANSIT_WITH_CONDUCTOR, ft.ATTENDED_OFFLINE_WITH_ONLINE_CAPABILITY_FARE_ADJUSTMENT_TERMINAL, ft.ATTENDED_OFFLINE_ONLY_TRANSIT_WITH_CONDUCTOR, ft.UNATTENDED_ONLINE_ONLY_NOT_RECOMMENDED_IN_TRANSIT, ft.UNATTENDED_OFFLINE_WITH_ONLINE_CAPABILITY_TRANSIT_WITHOUT_CONDUCTOR, ft.UNATTENDED_OFFLINE_WITH_ONLINE_CAPABILITY_FARE_ADJUSTMENT_TERMINAL, ft.UNATTENDED_OFFLINE_ONLY_TRANSIT_WITHOUT_CONDUCTOR});
        f56059g = new byte[]{0, 1};
        int i10 = f56061i;
        int i11 = (i10 ^ 114) + ((i10 & 114) << 1);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f56060h = i12 % 128;
        int i13 = i12 % 2;
    }

    public gq(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull gr grVar, @NotNull setContentDescription setcontentdescription) {
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(grVar, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56062a = fiVar;
        this.f56063b = settextkeepstate;
        this.f56064c = grVar;
        this.f56065d = setcontentdescription;
    }

    public static final /* synthetic */ setContentDescription setCompoundDrawableTintBlendMode(gq gqVar) {
        return (setContentDescription) setX(new Object[]{gqVar}, -1437652932, 1437652933, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ fi setOnFocusChangeListener(gq gqVar) {
        return (fi) setX(new Object[]{gqVar}, 71863946, -71863940, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0806 A[PHI: r2
      0x0806: PHI (r2v9 java.util.List<com.mypinpad.tsdk.i.TransactionFailed>) = 
      (r2v8 java.util.List<com.mypinpad.tsdk.i.TransactionFailed>)
      (r2v56 java.util.List<com.mypinpad.tsdk.i.TransactionFailed>)
     binds: [B:104:0x0804, B:101:0x07fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:121:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:123:0x090e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0932  */
    /* JADX WARN: Code duplicated, block: B:128:0x0964  */
    /* JADX WARN: Code duplicated, block: B:131:0x0977  */
    /* JADX WARN: Code duplicated, block: B:133:0x0979  */
    /* JADX WARN: Code duplicated, block: B:136:0x09b8  */
    /* JADX WARN: Code duplicated, block: B:139:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x03cd A[PHI: r6
      0x03cd: PHI (r6v41 byte[]) = (r6v40 byte[]), (r6v63 byte[]) binds: [B:54:0x03cb, B:51:0x038c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x03d8 A[PHI: r6 r7
      0x03d8: PHI (r6v58 byte[]) = (r6v40 byte[]), (r6v63 byte[]) binds: [B:54:0x03cb, B:51:0x038c] A[DONT_GENERATE, DONT_INLINE]
      0x03d8: PHI (r7v30 com.mypinpad.tsdk.i.getBeepOnFailure) = (r7v13 com.mypinpad.tsdk.i.getBeepOnFailure), (r7v36 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:54:0x03cb, B:51:0x038c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        List<TransactionFailed> list;
        char c10;
        int i13;
        fi fiVar;
        int i14;
        fi fiVar2;
        TransactionFailed transactionFailed;
        int i15;
        byte[] bArr;
        getBeepOnFailure getbeeponfailure;
        byte[] bArr2;
        boolean zBooleanValue;
        int i16;
        int i17;
        boolean zBooleanValue2;
        int i18 = ~i11;
        int i19 = ~i12;
        int i20 = ~(i18 | i19);
        int i21 = ~i10;
        fk fkVar = null;
        switch ((((~(i10 | i12)) | (~(i18 | i12)) | (~(i21 | i19))) * 959) + ((~(i11 | i10)) * (-959)) + ((i20 | (~(i21 | i12)) | (~(i19 | i10))) * 959) + (i11 * (-958)) + (i10 * (-958))) {
            case 1:
                gq gqVar = (gq) objArr[0];
                int i22 = f56060h;
                int i23 = ((i22 | 88) << 1) - (i22 ^ 88);
                int i24 = (i23 ^ (-1)) + (i23 << 1);
                f56061i = i24 % 128;
                int i25 = i24 % 2;
                setContentDescription setcontentdescription = gqVar.f56065d;
                if (i25 != 0) {
                    return setcontentdescription;
                }
                int i26 = 54 / 0;
                return setcontentdescription;
            case 2:
                gq gqVar2 = (gq) objArr[0];
                int i27 = (-2) - ((f56061i + 116) ^ (-1));
                f56060h = i27 % 128;
                int i28 = i27 % 2;
                List<TransactionFailed> list2 = f56057e;
                if (i28 == 0) {
                    list = list2;
                    if (list instanceof Collection) {
                        if (!list.isEmpty()) {
                            int i29 = f56061i;
                            int i30 = i29 | 75;
                            int i31 = i30 << 1;
                            int i32 = -((~(i29 & 75)) & i30);
                            int i33 = (i31 & i32) + (i32 | i31);
                            f56060h = i33 % 128;
                            int i34 = i33 % 2;
                            c10 = false;
                        }
                    }
                    if (c10 ^ true) {
                        fiVar = gqVar2.f56062a;
                        setAnimation setanimation = setAnimation.INSTANCE;
                        if (!Arrays.equals((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar, (TransactionFailed) setAnimation.setY(new Object[0], 840618122, -840618073, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(fiVar)), f56059g)) {
                            int i35 = f56061i;
                            int i36 = i35 & 27;
                            int i37 = (i35 | 27) & (~i36);
                            int i38 = -(-(i36 << 1));
                            int i39 = (i37 & i38) + (i37 | i38);
                            f56060h = i39 % 128;
                            i14 = i39 % 2;
                            fiVar2 = gqVar2.f56062a;
                            if (i14 != 0) {
                                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -619389084, 619389194, (int) System.currentTimeMillis());
                                ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -232375606, 232375652, System.identityHashCode(fiVar2))).booleanValue();
                                throw null;
                            }
                            transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -619389084, 619389194, (int) System.currentTimeMillis());
                            if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar2, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -232375606, 232375652, System.identityHashCode(fiVar2))).booleanValue()) {
                                int i40 = f56060h;
                                i15 = ((i40 | 93) << 1) - (i40 ^ 93);
                                f56061i = i15 % 128;
                                if (i15 % 2 == 0) {
                                    throw null;
                                }
                            }
                        }
                        int i41 = f56061i;
                        int i42 = (i41 & 29) + (i41 | 29);
                        f56060h = i42 % 128;
                        int i43 = i42 % 2;
                        return Boolean.TRUE;
                    }
                    int i44 = f56061i;
                    int i45 = i44 ^ 51;
                    int i46 = ((i44 & 51) | i45) << 1;
                    int i47 = -i45;
                    int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                    f56060h = i48 % 128;
                    int i49 = i48 % 2;
                    i13 = i44 + 71;
                    f56060h = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                    return Boolean.FALSE;
                }
                list = list2;
                int i50 = 14 / 0;
                if (list instanceof Collection) {
                    if (!list.isEmpty()) {
                        int i210 = f56061i;
                        int i310 = i210 | 75;
                        int i311 = i310 << 1;
                        int i312 = -((~(i210 & 75)) & i310);
                        int i313 = (i311 & i312) + (i312 | i311);
                        f56060h = i313 % 128;
                        int i314 = i313 % 2;
                        c10 = false;
                    }
                }
                if (c10 ^ true) {
                    fiVar = gqVar2.f56062a;
                    setAnimation setanimation2 = setAnimation.INSTANCE;
                    if (!Arrays.equals((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar, (TransactionFailed) setAnimation.setY(new Object[0], 840618122, -840618073, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(fiVar)), f56059g)) {
                        int i315 = f56061i;
                        int i316 = i315 & 27;
                        int i317 = (i315 | 27) & (~i316);
                        int i318 = -(-(i316 << 1));
                        int i319 = (i317 & i318) + (i317 | i318);
                        f56060h = i319 % 128;
                        i14 = i319 % 2;
                        fiVar2 = gqVar2.f56062a;
                        if (i14 != 0) {
                            TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -619389084, 619389194, (int) System.currentTimeMillis());
                            ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar2, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, -232375606, 232375652, System.identityHashCode(fiVar2))).booleanValue();
                            throw null;
                        }
                        transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -619389084, 619389194, (int) System.currentTimeMillis());
                        if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar2, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -232375606, 232375652, System.identityHashCode(fiVar2))).booleanValue()) {
                            int i410 = f56060h;
                            i15 = ((i410 | 93) << 1) - (i410 ^ 93);
                            f56061i = i15 % 128;
                            if (i15 % 2 == 0) {
                                throw null;
                            }
                        }
                    }
                    int i411 = f56061i;
                    int i412 = (i411 & 29) + (i411 | 29);
                    f56060h = i412 % 128;
                    int i413 = i412 % 2;
                    return Boolean.TRUE;
                }
                int i414 = f56061i;
                int i415 = i414 ^ 51;
                int i416 = ((i414 & 51) | i415) << 1;
                int i417 = -i415;
                int i418 = (i416 ^ i417) + ((i417 & i416) << 1);
                f56060h = i418 % 128;
                int i419 = i418 % 2;
                i13 = i414 + 71;
                f56060h = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
                }
                return Boolean.FALSE;
                Iterator<T> it = list.iterator();
                int i51 = f56061i;
                int i52 = i51 & 109;
                int i53 = (i51 | 109) & (~i52);
                int i54 = -(-(i52 << 1));
                int i55 = ((i53 | i54) << 1) - (i53 ^ i54);
                f56060h = i55 % 128;
                int i56 = i55 % 2;
                while (true) {
                    if (it.hasNext()) {
                        int i57 = f56060h;
                        int i58 = (i57 & (-4)) | ((~i57) & 3);
                        int i59 = -(-((i57 & 3) << 1));
                        int i60 = (i58 & i59) + (i59 | i58);
                        f56061i = i60 % 128;
                        if (i60 % 2 == 0) {
                            TransactionFailed transactionFailed4 = (TransactionFailed) it.next();
                            fi fiVar3 = gqVar2.f56062a;
                            int i61 = 6 / 0;
                            if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar3, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))}, -203580470, 203580510, System.identityHashCode(fiVar3))).booleanValue()) {
                                int i62 = f56061i;
                                int i63 = (-2) - ((((i62 | 36) << 1) - (i62 ^ 36)) ^ (-1));
                                int i64 = i63 % 128;
                                f56060h = i64;
                                int i65 = i63 % 2;
                                int i66 = i64 + 13;
                                f56061i = i66 % 128;
                                int i67 = i66 % 2;
                                c10 = true;
                            }
                        } else {
                            TransactionFailed transactionFailed5 = (TransactionFailed) it.next();
                            fi fiVar4 = gqVar2.f56062a;
                            if (!(!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar4, (String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5))}, -203580470, 203580510, System.identityHashCode(fiVar4))).booleanValue())) {
                                int i68 = f56061i;
                                int i69 = (-2) - ((((i68 | 36) << 1) - (i68 ^ 36)) ^ (-1));
                                int i610 = i69 % 128;
                                f56060h = i610;
                                int i611 = i69 % 2;
                                int i612 = i610 + 13;
                                f56061i = i612 % 128;
                                int i613 = i612 % 2;
                                c10 = true;
                            }
                        }
                    } else {
                        int i211 = f56061i;
                        int i3110 = i211 | 75;
                        int i3111 = i3110 << 1;
                        int i3112 = -((~(i211 & 75)) & i3110);
                        int i3113 = (i3111 & i3112) + (i3112 | i3111);
                        f56060h = i3113 % 128;
                        int i3114 = i3113 % 2;
                        c10 = false;
                    }
                    if (c10 ^ true) {
                        fiVar = gqVar2.f56062a;
                        setAnimation setanimation3 = setAnimation.INSTANCE;
                        if (!Arrays.equals((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar, (TransactionFailed) setAnimation.setY(new Object[0], 840618122, -840618073, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(fiVar)), f56059g)) {
                            int i3115 = f56061i;
                            int i3116 = i3115 & 27;
                            int i3117 = (i3115 | 27) & (~i3116);
                            int i3118 = -(-(i3116 << 1));
                            int i3119 = (i3117 & i3118) + (i3117 | i3118);
                            f56060h = i3119 % 128;
                            i14 = i3119 % 2;
                            fiVar2 = gqVar2.f56062a;
                            if (i14 != 0) {
                                TransactionFailed transactionFailed6 = (TransactionFailed) setAnimation.setY(new Object[0], -619389084, 619389194, (int) System.currentTimeMillis());
                                ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar2, (String) TransactionFailed.setX(new Object[]{transactionFailed6}, 1914607362, -1914607356, System.identityHashCode(transactionFailed6))}, -232375606, 232375652, System.identityHashCode(fiVar2))).booleanValue();
                                throw null;
                            }
                            transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -619389084, 619389194, (int) System.currentTimeMillis());
                            if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar2, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -232375606, 232375652, System.identityHashCode(fiVar2))).booleanValue()) {
                                int i4110 = f56060h;
                                i15 = ((i4110 | 93) << 1) - (i4110 ^ 93);
                                f56061i = i15 % 128;
                                if (i15 % 2 == 0) {
                                    throw null;
                                }
                            }
                        }
                        int i4111 = f56061i;
                        int i4112 = (i4111 & 29) + (i4111 | 29);
                        f56060h = i4112 % 128;
                        int i4113 = i4112 % 2;
                        return Boolean.TRUE;
                    }
                    int i4114 = f56061i;
                    int i4115 = i4114 ^ 51;
                    int i4116 = ((i4114 & 51) | i4115) << 1;
                    int i4117 = -i4115;
                    int i4118 = (i4116 ^ i4117) + ((i4117 & i4116) << 1);
                    f56060h = i4118 % 128;
                    int i4119 = i4118 % 2;
                    i13 = i4114 + 71;
                    f56060h = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                    return Boolean.FALSE;
                }
            case 3:
                gq gqVar3 = (gq) objArr[0];
                boolean zBooleanValue3 = ((Boolean) objArr[1]).booleanValue();
                boolean zBooleanValue4 = ((Boolean) objArr[2]).booleanValue();
                boolean zBooleanValue5 = ((Boolean) objArr[3]).booleanValue();
                boolean zBooleanValue6 = ((Boolean) objArr[4]).booleanValue();
                boolean zBooleanValue7 = ((Boolean) objArr[5]).booleanValue();
                boolean zBooleanValue8 = ((Boolean) objArr[6]).booleanValue();
                fu fuVar = new fu(gqVar3.f56062a);
                fv fvVar = (fv) ((setImageTintList) w.setX(new Object[]{fuVar}, 1693919772, -1693919769, System.identityHashCode(fuVar)));
                boolean zContains = f56058f.contains((ft) fv.setY(new Object[]{fvVar}, -714196005, 714196005, System.identityHashCode(fvVar)));
                de deVar = new de(gqVar3.f56062a);
                dd ddVar = (dd) ((setImageTintList) w.setX(new Object[]{deVar}, 1693919772, -1693919769, System.identityHashCode(deVar)));
                int i70 = setDividerPadding.setDividerPadding[((md) dd.setDividerPadding(new Object[]{ddVar}, -2041109093, 2041109093, System.identityHashCode(ddVar))).ordinal()];
                if (i70 != 1) {
                    if (i70 == 2) {
                        int i71 = f56060h;
                        int i72 = ((i71 & 104) + (i71 | 104)) - 1;
                        f56061i = i72 % 128;
                        int i73 = i72 % 2;
                        zBooleanValue4 = zBooleanValue6;
                    } else if (i70 == 3) {
                        int i74 = f56060h;
                        int i75 = i74 & 95;
                        int i76 = ((i74 | 95) & (~i75)) + (i75 << 1);
                        f56061i = i76 % 128;
                        int i77 = i76 % 2;
                        zBooleanValue4 = zBooleanValue7;
                    } else if (i70 != 4) {
                        int i78 = f56060h;
                        int i79 = ((i78 & 38) + (i78 | 38)) - 1;
                        f56061i = i79 % 128;
                        int i80 = i79 % 2;
                        zBooleanValue4 = true;
                    } else {
                        int i81 = f56061i + 109;
                        f56060h = i81 % 128;
                        int i82 = i81 % 2;
                        zBooleanValue4 = zBooleanValue8;
                    }
                } else if (!zContains) {
                    int i83 = f56061i;
                    int i84 = i83 & 103;
                    int i85 = (i83 ^ 103) | i84;
                    int i86 = ((i84 | i85) << 1) - (i85 ^ i84);
                    f56060h = i86 % 128;
                    int i87 = i86 % 2;
                    zBooleanValue4 = zBooleanValue5;
                } else {
                    int i88 = f56061i;
                    int i89 = ((i88 | 121) << 1) - (i88 ^ 121);
                    f56060h = i89 % 128;
                    if (i89 % 2 != 0) {
                        int i90 = 67 / 0;
                    }
                    int i91 = i88 ^ 49;
                    int i92 = ((i88 & 49) | i91) << 1;
                    int i93 = -i91;
                    int i94 = (i92 & i93) + (i92 | i93);
                    f56060h = i94 % 128;
                    int i95 = i94 % 2;
                }
                if (zBooleanValue3) {
                    int i96 = f56060h;
                    int i97 = i96 ^ 117;
                    int i98 = (i96 & 117) << 1;
                    int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                    int i100 = i99 % 128;
                    f56061i = i100;
                    int i101 = i99 % 2;
                    if (zBooleanValue4) {
                        int i102 = i100 & 43;
                        int i103 = -(-((i100 ^ 43) | i102));
                        int i104 = (i102 & i103) + (i103 | i102);
                        int i105 = i104 % 128;
                        f56060h = i105;
                        int i106 = i104 % 2;
                        int i107 = i105 + 35;
                        f56061i = i107 % 128;
                        int i108 = i107 % 2;
                        return Boolean.TRUE;
                    }
                }
                int i109 = f56060h;
                int i110 = i109 & 83;
                int i111 = -(-(i109 | 83));
                int i112 = (i110 ^ i111) + ((i111 & i110) << 1);
                f56061i = i112 % 128;
                int i113 = i112 % 2;
                return Boolean.FALSE;
            case 4:
                gq gqVar4 = (gq) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                int i114 = f56061i;
                int i115 = ((((i114 ^ 121) | (i114 & 121)) << 1) - (~(-((i114 & (-122)) | (121 & (~i114)))))) - 1;
                f56060h = i115 % 128;
                if (i115 % 2 != 0) {
                    fi fiVar5 = gqVar4.f56062a;
                    getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar5, setAnimation.setOnCapturedPointerListener()}, 1431838387, -1431838363, System.identityHashCode(fiVar5));
                    bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
                    TransactionFailed transactionFailedTerminalSessionDefaultImpls = setAnimation.TerminalSessionDefaultImpls();
                    fi fiVar6 = gqVar4.f56062a;
                    getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar6, transactionFailedTerminalSessionDefaultImpls}, -1593889019, 1593889062, System.identityHashCode(fiVar6));
                    int i116 = 99 / 0;
                    if (getbeeponfailure == null) {
                        int i117 = f56060h + 115;
                        f56061i = i117 % 128;
                        int i118 = i117 % 2;
                        bArr2 = null;
                    } else {
                        bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                        int i119 = f56060h;
                        int i120 = i119 ^ 121;
                        int i121 = ((i119 & 121) | i120) << 1;
                        int i122 = -i120;
                        int i123 = (i121 & i122) + (i121 | i122);
                        f56061i = i123 % 128;
                        int i124 = i123 % 2;
                    }
                } else {
                    fi fiVar7 = gqVar4.f56062a;
                    getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar7, setAnimation.setOnCapturedPointerListener()}, 1431838387, -1431838363, System.identityHashCode(fiVar7));
                    bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3));
                    TransactionFailed transactionFailedTerminalSessionDefaultImpls2 = setAnimation.TerminalSessionDefaultImpls();
                    fi fiVar8 = gqVar4.f56062a;
                    getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar8, transactionFailedTerminalSessionDefaultImpls2}, -1593889019, 1593889062, System.identityHashCode(fiVar8));
                    if (getbeeponfailure == null) {
                        int i1110 = f56060h + 115;
                        f56061i = i1110 % 128;
                        int i1111 = i1110 % 2;
                        bArr2 = null;
                    } else {
                        bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                        int i1112 = f56060h;
                        int i125 = i1112 ^ 121;
                        int i126 = ((i1112 & 121) | i125) << 1;
                        int i127 = -i125;
                        int i128 = (i126 & i127) + (i126 | i127);
                        f56061i = i128 % 128;
                        int i129 = i128 % 2;
                    }
                }
                if (Arrays.equals(bArr, bArr2)) {
                    int i130 = f56060h + 125;
                    f56061i = i130 % 128;
                    int i131 = i130 % 2;
                    byte[] bArr4 = f56059g;
                    if (i131 == 0) {
                        Arrays.equals(bArr3, bArr4);
                        throw null;
                    }
                    if (Arrays.equals(bArr3, bArr4)) {
                        fj fjVar = new fj(gqVar4.f56062a);
                        fn fnVar = (fn) ((setImageTintList) w.setX(new Object[]{fjVar}, 1693919772, -1693919769, System.identityHashCode(fjVar)));
                        boolean zBooleanValue9 = ((Boolean) ao.setY(new Object[]{fnVar}, 1416983743, -1416983736, System.identityHashCode(fnVar))).booleanValue();
                        boolean zBooleanValue10 = ((Boolean) fn.setOnFocusChangeListener(new Object[]{fnVar}, -2122257697, 2122257697, System.identityHashCode(fnVar))).booleanValue();
                        boolean zBooleanValue11 = ((Boolean) ao.setY(new Object[]{fnVar}, -1370773042, 1370773045, System.identityHashCode(fnVar))).booleanValue();
                        boolean zBooleanValue12 = ((Boolean) ao.setY(new Object[]{fnVar}, -1312436044, 1312436045, System.identityHashCode(fnVar))).booleanValue();
                        int i132 = (zBooleanValue11 ? 1 : 0) & (zBooleanValue12 ? 1 : 0);
                        int i133 = ((zBooleanValue12 ? 1 : 0) | (zBooleanValue11 ? 1 : 0)) & (~i132);
                        zBooleanValue = ((Boolean) setX(new Object[]{gqVar4, Boolean.valueOf(zBooleanValue9), Boolean.valueOf(zBooleanValue10), Boolean.valueOf((i133 & i132) | (i133 ^ i132)), Boolean.valueOf(((Boolean) ao.setY(new Object[]{fnVar}, 1150239482, -1150239480, System.identityHashCode(fnVar))).booleanValue()), Boolean.valueOf(((Boolean) ao.setY(new Object[]{fnVar}, -625784071, 625784076, System.identityHashCode(fnVar))).booleanValue()), Boolean.valueOf(((Boolean) fn.setOnFocusChangeListener(new Object[]{fnVar}, 33335514, -33335513, System.identityHashCode(fnVar))).booleanValue())}, -75982057, 75982060, System.identityHashCode(gqVar4))).booleanValue();
                        int i134 = f56061i;
                        int i135 = i134 & 15;
                        int i136 = (i134 | 15) & (~i135);
                        int i137 = -(-(i135 << 1));
                        int i138 = (i136 ^ i137) + ((i136 & i137) << 1);
                        f56060h = i138 % 128;
                        int i139 = i138 % 2;
                    } else {
                        ap apVar = new ap(gqVar4.f56062a);
                        ao aoVar = (ao) ((setImageTintList) w.setX(new Object[]{apVar}, 1693919772, -1693919769, System.identityHashCode(apVar)));
                        fq fqVar = new fq(gqVar4.f56062a);
                        fr frVar = (fr) ((setImageTintList) w.setX(new Object[]{fqVar}, 1693919772, -1693919769, System.identityHashCode(fqVar)));
                        boolean zBooleanValue13 = ((Boolean) ao.setY(new Object[]{aoVar}, 1416983743, -1416983736, System.identityHashCode(aoVar))).booleanValue();
                        boolean zBooleanValue14 = ((Boolean) fr.setY(new Object[]{frVar}, 1549416131, -1549416130, System.identityHashCode(frVar))).booleanValue();
                        boolean zBooleanValue15 = ((Boolean) ao.setY(new Object[]{aoVar}, -1370773042, 1370773045, System.identityHashCode(aoVar))).booleanValue();
                        boolean zBooleanValue16 = ((Boolean) ao.setY(new Object[]{aoVar}, -1312436044, 1312436045, System.identityHashCode(aoVar))).booleanValue();
                        zBooleanValue = ((Boolean) setX(new Object[]{gqVar4, Boolean.valueOf(zBooleanValue13), Boolean.valueOf(zBooleanValue14), Boolean.valueOf(((zBooleanValue16 ? 1 : 0) & (zBooleanValue15 ? 1 : 0)) | (((~(zBooleanValue16 ? 1 : 0)) & (zBooleanValue15 ? 1 : 0)) == true ? 1 : 0) | (((~(zBooleanValue15 ? 1 : 0)) & (zBooleanValue16 ? 1 : 0)) == true ? 1 : 0)), Boolean.valueOf(((Boolean) ao.setY(new Object[]{aoVar}, 1150239482, -1150239480, System.identityHashCode(aoVar))).booleanValue()), Boolean.valueOf(((Boolean) ao.setY(new Object[]{aoVar}, -625784071, 625784076, System.identityHashCode(aoVar))).booleanValue()), Boolean.valueOf(((Boolean) fr.setY(new Object[]{frVar}, 1275317793, -1275317793, System.identityHashCode(frVar))).booleanValue())}, -75982057, 75982060, System.identityHashCode(gqVar4))).booleanValue();
                        int i140 = f56060h;
                        int i141 = (i140 ^ 109) + ((i140 & 109) << 1);
                        f56061i = i141 % 128;
                        if (i141 % 2 == 0) {
                            int i142 = 91 / 0;
                        }
                    }
                } else {
                    zBooleanValue = ((Boolean) setX(new Object[]{gqVar4}, 1030402478, -1030402471, System.identityHashCode(gqVar4))).booleanValue();
                    int i143 = f56061i + 49;
                    f56060h = i143 % 128;
                    int i144 = i143 % 2;
                }
                return Boolean.valueOf(zBooleanValue);
            case 5:
                gq gqVar5 = (gq) objArr[0];
                int i145 = f56061i;
                int i146 = ((i145 & 84) + (i145 | 84)) - 1;
                f56060h = i146 % 128;
                int i147 = i146 % 2;
                fi fiVar9 = gqVar5.f56062a;
                setAnimation setanimation4 = setAnimation.INSTANCE;
                byte[] bArr5 = (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar9, (TransactionFailed) setAnimation.setY(new Object[0], 567755471, -567755289, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(fiVar9));
                boolean zBooleanValue17 = ((Boolean) setX(new Object[]{gqVar5}, 143216346, -143216344, System.identityHashCode(gqVar5))).booleanValue();
                fi fiVar10 = gqVar5.f56062a;
                if (zBooleanValue17) {
                    byte[] bArr6 = (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar10, (TransactionFailed) setAnimation.setY(new Object[0], 840618122, -840618073, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(fiVar10));
                    cz czVar = new cz(fiVar10);
                    int i148 = f56061i + 93;
                    f56060h = i148 % 128;
                    if (i148 % 2 != 0) {
                        i16 = 26;
                        int i149 = i16 / 0;
                    }
                } else {
                    int i150 = f56061i + 7;
                    f56060h = i150 % 128;
                    int i151 = i150 % 2;
                    gr grVar = gqVar5.f56064c;
                    fkVar = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar10, gqVar5.f56063b}, 532812653, -532812648, System.identityHashCode(grVar));
                    int i152 = f56060h;
                    int i153 = (((i152 | 38) << 1) - (i152 ^ 38)) - 1;
                    f56061i = i153 % 128;
                    if (i153 % 2 == 0) {
                        i16 = 14;
                        int i1410 = i16 / 0;
                    }
                }
                return fkVar;
            case 6:
                gq gqVar6 = (gq) objArr[0];
                int i154 = f56061i + 79;
                int i155 = i154 % 128;
                f56060h = i155;
                int i156 = i154 % 2;
                fi fiVar11 = gqVar6.f56062a;
                int i157 = i155 ^ 113;
                int i158 = ((i155 & 113) | i157) << 1;
                int i159 = -i157;
                int i160 = (i158 ^ i159) + ((i159 & i158) << 1);
                f56061i = i160 % 128;
                int i161 = i160 % 2;
                return fiVar11;
            case 7:
                gq gqVar7 = (gq) objArr[0];
                ap apVar2 = new ap(gqVar7.f56062a);
                ao aoVar2 = (ao) ((setImageTintList) w.setX(new Object[]{apVar2}, 1693919772, -1693919769, System.identityHashCode(apVar2)));
                de deVar2 = new de(gqVar7.f56062a);
                dd ddVar2 = (dd) ((setImageTintList) w.setX(new Object[]{deVar2}, 1693919772, -1693919769, System.identityHashCode(deVar2)));
                int i162 = setDividerPadding.setDividerPadding[((md) dd.setDividerPadding(new Object[]{ddVar2}, -2041109093, 2041109093, System.identityHashCode(ddVar2))).ordinal()];
                if (i162 == 1) {
                    if (!((Boolean) ao.setY(new Object[]{aoVar2}, -1993631086, 1993631090, System.identityHashCode(aoVar2))).booleanValue()) {
                        int i163 = f56060h;
                        int i164 = (i163 ^ 58) + ((i163 & 58) << 1);
                        int i165 = (i164 ^ (-1)) + (i164 << 1);
                        f56061i = i165 % 128;
                        if (i165 % 2 == 0) {
                            ((Boolean) ao.setY(new Object[]{aoVar2}, -1383166788, 1383166797, System.identityHashCode(aoVar2))).booleanValue();
                            throw null;
                        }
                        if (!((Boolean) ao.setY(new Object[]{aoVar2}, -1383166788, 1383166797, System.identityHashCode(aoVar2))).booleanValue()) {
                            int i166 = f56061i;
                            int i167 = i166 & 99;
                            int i168 = ((((i166 ^ 99) | i167) << 1) - (~(-((i166 | 99) & (~i167))))) - 1;
                            f56060h = i168 % 128;
                            int i169 = i168 % 2;
                            zBooleanValue2 = false;
                        }
                    }
                    int i170 = f56061i;
                    i17 = (i170 ^ 81) + ((i170 & 81) << 1);
                    f56060h = i17 % 128;
                    int i171 = i17 % 2;
                    zBooleanValue2 = true;
                } else if (i162 == 2) {
                    zBooleanValue2 = ((Boolean) ao.setY(new Object[]{aoVar2}, 743383994, -743383988, System.identityHashCode(aoVar2))).booleanValue();
                    int i172 = f56061i;
                    int i173 = (((i172 | 82) << 1) - (i172 ^ 82)) - 1;
                    f56060h = i173 % 128;
                    int i174 = i173 % 2;
                } else if (i162 != 3) {
                    int i175 = f56060h;
                    i17 = ((i175 ^ 48) + ((i175 & 48) << 1)) - 1;
                    f56061i = i17 % 128;
                    int i176 = i17 % 2;
                    zBooleanValue2 = true;
                } else {
                    zBooleanValue2 = ((Boolean) ao.setY(new Object[]{aoVar2}, 575922476, -575922476, System.identityHashCode(aoVar2))).booleanValue();
                    int i177 = f56061i + 87;
                    f56060h = i177 % 128;
                    int i178 = i177 % 2;
                }
                if (((Boolean) ao.setY(new Object[]{aoVar2}, 1416983743, -1416983736, System.identityHashCode(aoVar2))).booleanValue()) {
                    int i179 = f56060h;
                    int i180 = i179 + 56;
                    int i181 = (i180 ^ (-1)) + (i180 << 1);
                    f56061i = i181 % 128;
                    if (i181 % 2 == 0) {
                        throw null;
                    }
                    if (zBooleanValue2) {
                        int i182 = i179 ^ 51;
                        int i183 = -(-((i179 & 51) << 1));
                        int i184 = (i182 ^ i183) + ((i182 & i183) << 1);
                        f56061i = i184 % 128;
                        if (i184 % 2 != 0) {
                            return Boolean.TRUE;
                        }
                        throw null;
                    }
                }
                int i185 = f56060h;
                int i186 = ((i185 & (-50)) | ((~i185) & 49)) + ((i185 & 49) << 1);
                f56061i = i186 % 128;
                int i187 = i186 % 2;
                return Boolean.FALSE;
            default:
                gq gqVar8 = (gq) objArr[0];
                byte[] bArr7 = (byte[]) objArr[1];
                int i188 = f56061i;
                int i189 = (i188 & 17) + (i188 | 17);
                f56060h = i189 % 128;
                int i190 = i189 % 2;
                boolean zBooleanValue18 = ((Boolean) setX(new Object[]{gqVar8, bArr7}, -1496488299, 1496488303, System.identityHashCode(gqVar8))).booleanValue();
                int i191 = f56061i;
                int i192 = i191 & 101;
                int i193 = -(-((i191 ^ 101) | i192));
                int i194 = (i192 & i193) + (i193 | i192);
                f56060h = i194 % 128;
                if (i194 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue18);
                }
                throw null;
        }
    }

    @Nullable
    public final fk setDividerPadding() {
        return (fk) setX(new Object[]{this}, -1369194799, 1369194804, System.identityHashCode(this));
    }
}
