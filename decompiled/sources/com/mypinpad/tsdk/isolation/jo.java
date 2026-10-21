package com.mypinpad.tsdk.isolation;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/jo;", "", "Lcom/mypinpad/tsdk/i/fk;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/fk;", "Lcom/mypinpad/tsdk/i/iv;", "p0", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "p1", "Lcom/mypinpad/tsdk/i/kc;", "p2", "Lcom/mypinpad/tsdk/i/setFontFeatureSettings;", "p3", "Lcom/mypinpad/tsdk/i/iw;", "p4", "<init>", "(Lcom/mypinpad/tsdk/i/iv;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/kc;Lcom/mypinpad/tsdk/i/setFontFeatureSettings;Lcom/mypinpad/tsdk/i/iw;)V", "setX", "b"}, k = 1, mv = {1, 5, 1})
public final class jo {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f56658g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f56659h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final iv f56660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTextKeepState f56661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final kc f56662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final setFontFeatureSettings f56663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final iw f56664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final by f56657f = by.PLAINTEXT_PIN_VERIFICATION_PERFORMED_BY_ICC;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/dc;", "", "setX", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<dc, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f56665p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56666q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56667r0 = 1;

        static {
            int i10 = f56666q0;
            int i11 = i10 & 31;
            int i12 = ((i10 | 31) & (~i11)) + (i11 << 1);
            f56667r0 = i12 % 128;
            int i13 = i12 % 2;
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = i13 | i11;
            int i15 = (((~i14) | (~(i13 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
            int i16 = ~(i14 | i12);
            int i17 = ~i12;
            if (((i13 | i17) * 754) + (((~(i10 | i17 | i11)) | i16) * (-754)) + i15 != 1) {
                dc dcVar = (dc) objArr[1];
                int i18 = f56667r0 + 23;
                f56666q0 = i18 % 128;
                if (i18 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(dcVar, "");
                    dc.setDividerPadding(new Object[]{dcVar, Boolean.FALSE}, 1763882755, -1763882755, System.identityHashCode(dcVar));
                    return null;
                }
                Intrinsics.checkNotNullParameter(dcVar, "");
                dc.setDividerPadding(new Object[]{dcVar, Boolean.FALSE}, 1763882755, -1763882755, System.identityHashCode(dcVar));
                return null;
            }
            a aVar = (a) objArr[0];
            Object obj = objArr[1];
            int i19 = f56667r0;
            int i20 = i19 & 45;
            int i21 = (((i19 ^ 45) | i20) << 1) - ((i19 | 45) & (~i20));
            f56666q0 = i21 % 128;
            dc dcVar2 = (dc) obj;
            if (i21 % 2 != 0) {
                a(new Object[]{aVar, dcVar2}, 446971952, -446971952, System.identityHashCode(aVar));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            a(new Object[]{aVar, dcVar2}, 446971952, -446971952, System.identityHashCode(aVar));
            Unit unit2 = Unit.INSTANCE;
            int i22 = f56666q0;
            int i23 = ((i22 | 53) << 1) - (i22 ^ 53);
            f56667r0 = i23 % 128;
            int i24 = i23 % 2;
            return unit2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(dc dcVar) {
            return a(new Object[]{this, dcVar}, 98618421, -98618420, System.identityHashCode(this));
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f56668c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f56669d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ca f56670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ce f56671b;

        public b(@NotNull ca caVar, @NotNull ce ceVar) {
            Intrinsics.checkNotNullParameter(caVar, "");
            Intrinsics.checkNotNullParameter(ceVar, "");
            this.f56670a = caVar;
            this.f56671b = ceVar;
        }

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~(i12 | i11);
            if ((((~(i10 | (~i11))) | (~(i13 | i11))) * 110) + ((i14 | (~(i10 | i11))) * 220) + ((i13 | i14) * (-220)) + (i11 * 111) + (i10 * (-109)) != 1) {
                b bVar = (b) objArr[0];
                int i15 = f56669d;
                int i16 = (i15 ^ 63) + ((i15 & 63) << 1);
                f56668c = i16 % 128;
                int i17 = i16 % 2;
                ca caVar = bVar.f56670a;
                int i18 = i15 & 73;
                int i19 = -(-((i15 ^ 73) | i18));
                int i20 = (i18 & i19) + (i19 | i18);
                f56668c = i20 % 128;
                if (i20 % 2 == 0) {
                    return caVar;
                }
                int i21 = 33 / 0;
                return caVar;
            }
            b bVar2 = (b) objArr[0];
            int i22 = f56668c;
            int i23 = i22 & 119;
            int i24 = (i22 ^ 119) | i23;
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            int i26 = i25 % 128;
            f56669d = i26;
            int i27 = i25 % 2;
            ce ceVar = bVar2.f56671b;
            int i28 = i26 + 28;
            int i29 = (i28 ^ (-1)) + (i28 << 1);
            f56668c = i29 % 128;
            int i30 = i29 % 2;
            return ceVar;
        }
    }

    public /* synthetic */ class setOnFocusChangeListener {
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[by.valuesCustom().length];
            iArr[by.PLAINTEXT_PIN_VERIFICATION_PERFORMED_BY_ICC.ordinal()] = 1;
            iArr[by.PLAINTEXT_PIN_VERIFICATION_PERFORMED_BY_ICC_AND_SIGNATURE_PAPER.ordinal()] = 2;
            iArr[by.ENCIPHERED_PIN_VERIFICATION_PERFORMED_BY_ICC.ordinal()] = 3;
            iArr[by.ENCIPHERED_PIN_VERIFICATION_PERFORMED_BY_ICC_AND_SIGNATURE_PAPER.ordinal()] = 4;
            iArr[by.ENCIPHERED_PIN_VERIFIED_ONLINE.ordinal()] = 5;
            iArr[by.SIGNATURE_PAPER.ordinal()] = 6;
            iArr[by.NO_CVM_REQUIRED.ordinal()] = 7;
            iArr[by.FAIL_CVM_PROCESSING.ordinal()] = 8;
            setY = iArr;
            int[] iArr2 = new int[ce.values().length];
            iArr2[ce.setX.ordinal()] = 1;
            setCompoundDrawableTintBlendMode = iArr2;
            int i10 = ((65 << 1) - (~(-65))) - 1;
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }
    }

    static {
        int i10 = f56658g + 73;
        f56659h = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public jo(@NotNull iv ivVar, @NotNull setTextKeepState settextkeepstate, @NotNull kc kcVar, @NotNull setFontFeatureSettings setfontfeaturesettings, @NotNull iw iwVar) {
        Intrinsics.checkNotNullParameter(ivVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(kcVar, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        Intrinsics.checkNotNullParameter(iwVar, "");
        this.f56660a = ivVar;
        this.f56661b = settextkeepstate;
        this.f56662c = kcVar;
        this.f56663d = setfontfeaturesettings;
        this.f56664e = iwVar;
    }

    public static /* synthetic */ Pair a(Object[] objArr) {
        jo joVar = (jo) objArr[0];
        int i10 = f56659h;
        int i11 = i10 & 119;
        int i12 = (i11 - (~(-(-((i10 ^ 119) | i11))))) - 1;
        f56658g = i12 % 128;
        if (i12 % 2 != 0) {
            iv ivVar = joVar.f56660a;
            TransactionFailed compoundDrawables = setAnimation.setCompoundDrawables();
            ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar, (String) TransactionFailed.setX(new Object[]{compoundDrawables}, 1914607362, -1914607356, System.identityHashCode(compoundDrawables))}, -203580470, 203580510, System.identityHashCode(ivVar))).booleanValue();
            throw null;
        }
        iv ivVar2 = joVar.f56660a;
        TransactionFailed compoundDrawables2 = setAnimation.setCompoundDrawables();
        boolean zBooleanValue = ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar2, (String) TransactionFailed.setX(new Object[]{compoundDrawables2}, 1914607362, -1914607356, System.identityHashCode(compoundDrawables2))}, -203580470, 203580510, System.identityHashCode(ivVar2))).booleanValue();
        iv ivVar3 = joVar.f56660a;
        if (zBooleanValue) {
            cz czVar = new cz(ivVar3);
            Pair pair = (Pair) setX(new Object[0], -1742626267, 1742626278, (int) System.currentTimeMillis());
            int i13 = f56658g;
            int i14 = i13 & 9;
            int i15 = (i13 ^ 9) | i14;
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            f56659h = i16 % 128;
            if (i16 % 2 != 0) {
                return pair;
            }
            throw null;
        }
        ja jaVar = new ja(ivVar3);
        jc jcVar = (jc) ((setImageTintList) w.setX(new Object[]{jaVar}, 1693919772, -1693919769, System.identityHashCode(jaVar)));
        if (((iz) jc.setOnFocusChangeListener(new Object[]{jcVar}, 1232158677, -1232158676, System.identityHashCode(jcVar))) == iz.BLOCKED) {
            int i17 = f56659h;
            int i18 = i17 & 21;
            int i19 = -(-((i17 ^ 21) | i18));
            int i20 = (i18 & i19) + (i19 | i18);
            f56658g = i20 % 128;
            if (i20 % 2 != 0) {
                throw null;
            }
            Pair pair2 = (Pair) setX(new Object[0], -1742626267, 1742626278, (int) System.currentTimeMillis());
            int i21 = f56659h;
            int i22 = ((((i21 ^ 105) | (i21 & 105)) << 1) - (~(-(((~i21) & 105) | (i21 & (-106)))))) - 1;
            f56658g = i22 % 128;
            int i23 = i22 % 2;
            return pair2;
        }
        jb jbVar = (jb) jc.setOnFocusChangeListener(new Object[]{jcVar}, 1362433532, -1362433532, System.identityHashCode(jcVar));
        jb jbVar2 = jb.setOnFocusChangeListener;
        iw iwVar = joVar.f56664e;
        if (jbVar == jbVar2) {
            int i24 = f56658g + 119;
            f56659h = i24 % 128;
            int i25 = i24 % 2;
            if (!((Boolean) iw.setOnFocusChangeListener(new Object[]{iwVar}, -1546748914, 1546748916, System.identityHashCode(iwVar))).booleanValue()) {
                Pair pair3 = (Pair) setX(new Object[]{joVar}, 300669119, -300669100, System.identityHashCode(joVar));
                int i26 = f56658g + 79;
                f56659h = i26 % 128;
                int i27 = i26 % 2;
                return pair3;
            }
            int i28 = f56658g;
            int i29 = i28 & 19;
            int i30 = (i28 | 19) & (~i29);
            int i31 = i29 << 1;
            int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
            f56659h = i32 % 128;
            int i33 = i32 % 2;
            Pair pair4 = (Pair) setX(new Object[0], -1742626267, 1742626278, (int) System.currentTimeMillis());
            int i34 = f56659h;
            int i35 = (i34 ^ 1) + ((i34 & 1) << 1);
            f56658g = i35 % 128;
            if (i35 % 2 == 0) {
                return pair4;
            }
            throw null;
        }
        if (((jb) jc.setOnFocusChangeListener(new Object[]{jcVar}, 1362433532, -1362433532, System.identityHashCode(jcVar))) == jb.setCompoundDrawableTintBlendMode) {
            int i36 = f56658g;
            int i37 = (i36 ^ 121) + ((i36 & 121) << 1);
            f56659h = i37 % 128;
            int i38 = i37 % 2;
            iz izVar = (iz) jc.setOnFocusChangeListener(new Object[]{jcVar}, 1232158677, -1232158676, System.identityHashCode(jcVar));
            iz izVar2 = iz.SUCCESS;
            if (izVar == izVar2) {
                int i39 = f56658g + 3;
                f56659h = i39 % 128;
                if (i39 % 2 != 0) {
                    return (Pair) setX(new Object[0], 1277246760, -1277246757, (int) System.currentTimeMillis());
                }
                throw null;
            }
            if (((iz) jc.setOnFocusChangeListener(new Object[]{jcVar}, 1232158677, -1232158676, System.identityHashCode(jcVar))) != izVar2) {
                int i40 = f56659h;
                int i41 = (((i40 | 47) << 1) - (~(-(i40 ^ 47)))) - 1;
                f56658g = i41 % 128;
                int i42 = i41 % 2;
                if (((Boolean) iw.setOnFocusChangeListener(new Object[]{iwVar}, -1546748914, 1546748916, System.identityHashCode(iwVar))).booleanValue()) {
                    Pair pair5 = (Pair) setX(new Object[0], -1742626267, 1742626278, (int) System.currentTimeMillis());
                    int i43 = f56658g;
                    int i44 = (i43 & 46) + (i43 | 46);
                    int i45 = (i44 ^ (-1)) + (i44 << 1);
                    f56659h = i45 % 128;
                    int i46 = i45 % 2;
                    return pair5;
                }
                int i47 = f56659h + 45;
                f56658g = i47 % 128;
                int i48 = i47 % 2;
                Pair pair6 = (Pair) setX(new Object[]{joVar}, 300669119, -300669100, System.identityHashCode(joVar));
                int i49 = f56659h;
                int i50 = i49 & 71;
                int i51 = i50 + ((i49 ^ 71) | i50);
                f56658g = i51 % 128;
                int i52 = i51 % 2;
                return pair6;
            }
        }
        if (!((Boolean) iw.setOnFocusChangeListener(new Object[]{iwVar}, -1546748914, 1546748916, System.identityHashCode(iwVar))).booleanValue()) {
            Pair pair7 = (Pair) setX(new Object[]{joVar}, 300669119, -300669100, System.identityHashCode(joVar));
            int i53 = f56659h;
            int i54 = i53 & 65;
            int i55 = (i53 | 65) & (~i54);
            int i56 = i54 << 1;
            int i57 = ((i55 | i56) << 1) - (i55 ^ i56);
            f56658g = i57 % 128;
            if (i57 % 2 != 0) {
                int i58 = 51 / 0;
            }
            return pair7;
        }
        int i59 = f56658g;
        int i60 = i59 & 73;
        int i61 = (i59 ^ 73) | i60;
        int i62 = (i60 & i61) + (i61 | i60);
        f56659h = i62 % 128;
        int i63 = i62 % 2;
        Pair pair8 = (Pair) setX(new Object[0], -1742626267, 1742626278, (int) System.currentTimeMillis());
        int i64 = f56658g;
        int i65 = ((i64 & 47) - (~(i64 | 47))) - 1;
        f56659h = i65 % 128;
        int i66 = i65 % 2;
        return pair8;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x011f A[PHI: r7 r9
      0x011f: PHI (r7v14 java.lang.Object) = (r7v13 java.lang.Object), (r7v17 java.lang.Object) binds: [B:23:0x011d, B:20:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x011f: PHI (r9v2 com.mypinpad.tsdk.i.ca) = (r9v1 com.mypinpad.tsdk.i.ca), (r9v5 com.mypinpad.tsdk.i.ca) binds: [B:23:0x011d, B:20:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0151  */
    /* JADX WARN: Code duplicated, block: B:32:0x0184 A[EDGE_INSN: B:32:0x0184->B:34:0x0196 BREAK  A[LOOP:0: B:15:0x00cd->B:48:?]] */
    /* JADX WARN: Code duplicated, block: B:47:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[LOOP:0: B:15:0x00cd->B:48:?, LOOP_END, SYNTHETIC] */
    public static /* synthetic */ fk b(Object[] objArr) throws Exception {
        Object next;
        ca caVar;
        boolean z10;
        int i10;
        jo joVar = (jo) objArr[0];
        am amVar = (am) objArr[1];
        int i11 = f56659h + 121;
        f56658g = i11 % 128;
        int i12 = i11 % 2;
        if (!((Boolean) am.setY(new Object[]{amVar}, 27011347, -27011346, System.identityHashCode(amVar))).booleanValue()) {
            setX(new Object[]{joVar}, 1350830935, -1350830933, System.identityHashCode(joVar));
            int i13 = f56659h;
            int i14 = (i13 ^ 11) + ((i13 & 11) << 1);
            f56658g = i14 % 128;
            if (i14 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i15 = f56659h;
        int i16 = i15 & 63;
        int i17 = (i15 | 63) & (~i16);
        int i18 = i16 << 1;
        int i19 = (i17 & i18) + (i17 | i18);
        f56658g = i19 % 128;
        int i20 = i19 % 2;
        bq bqVar = (bq) setX(new Object[]{joVar}, -1187581896, 1187581906, System.identityHashCode(joVar));
        if (bqVar == null) {
            int i21 = f56658g;
            int i22 = i21 & 125;
            int i23 = ((i21 ^ 125) | i22) << 1;
            int i24 = -((i21 | 125) & (~i22));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            int i26 = i25 % 128;
            f56659h = i26;
            int i27 = i25 % 2;
            int i28 = i26 & 17;
            int i29 = (i26 | 17) & (~i28);
            int i30 = -(-(i28 << 1));
            int i31 = (i29 & i30) + (i29 | i30);
            f56658g = i31 % 128;
            if (i31 % 2 != 0) {
                int i32 = 33 / 0;
            }
            return null;
        }
        fk fkVar = (fk) setX(new Object[]{joVar, bqVar}, 2120968191, -2120968184, System.identityHashCode(joVar));
        if (fkVar != null) {
            int i33 = f56659h;
            int i34 = i33 + 99;
            f56658g = i34 % 128;
            int i35 = i34 % 2;
            int i36 = (((i33 | 83) << 1) - (~(-(i33 ^ 83)))) - 1;
            f56658g = i36 % 128;
            int i37 = i36 % 2;
            return fkVar;
        }
        Iterator<T> it = bqVar.setLayoutAnimation().iterator();
        int i38 = f56658g;
        int i39 = ((i38 & 12) + (i38 | 12)) - 1;
        f56659h = i39 % 128;
        int i40 = i39 % 2;
        while (true) {
            if (!it.hasNext()) {
                int i41 = f56658g;
                int i42 = (i41 ^ 19) + ((i41 & 19) << 1);
                f56659h = i42 % 128;
                int i43 = i42 % 2;
                next = null;
                break;
            }
            int i44 = f56658g;
            int i45 = ((i44 & 78) + (i44 | 78)) - 1;
            f56659h = i45 % 128;
            if (i45 % 2 == 0) {
                next = it.next();
                caVar = (ca) next;
                int i46 = 81 / 0;
                if (((by) ca.setOnFocusChangeListener(new Object[]{caVar}, 1299031735, -1299031735, System.identityHashCode(caVar))) == by.NO_CVM_REQUIRED) {
                    int i47 = f56658g;
                    int i48 = (i47 & (-4)) | ((~i47) & 3);
                    int i49 = (i47 & 3) << 1;
                    int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                    f56659h = i50 % 128;
                    int i51 = i50 % 2;
                    if (((Boolean) ca.setOnFocusChangeListener(new Object[]{caVar, joVar.f56660a}, 2074548862, -2074548853, System.identityHashCode(caVar))).booleanValue()) {
                        int i52 = f56659h;
                        int i53 = i52 & 23;
                        int i54 = (i53 - (~((i52 ^ 23) | i53))) - 1;
                        f56658g = i54 % 128;
                        int i55 = i54 % 2;
                        z10 = true;
                    }
                }
                if (!(!z10)) {
                    int i56 = f56659h;
                    int i57 = i56 & 123;
                    int i58 = -(-((i56 ^ 123) | i57));
                    i10 = ((i57 | i58) << 1) - (i58 ^ i57);
                    f56658g = i10 % 128;
                    if (i10 % 2 == 0) {
                        break;
                    }
                    int i59 = 85 / 0;
                    break;
                }
            } else {
                next = it.next();
                caVar = (ca) next;
                if (((by) ca.setOnFocusChangeListener(new Object[]{caVar}, 1299031735, -1299031735, System.identityHashCode(caVar))) == by.NO_CVM_REQUIRED) {
                    int i410 = f56658g;
                    int i411 = (i410 & (-4)) | ((~i410) & 3);
                    int i412 = (i410 & 3) << 1;
                    int i510 = (i411 ^ i412) + ((i412 & i411) << 1);
                    f56659h = i510 % 128;
                    int i511 = i510 % 2;
                    if (((Boolean) ca.setOnFocusChangeListener(new Object[]{caVar, joVar.f56660a}, 2074548862, -2074548853, System.identityHashCode(caVar))).booleanValue()) {
                        int i512 = f56659h;
                        int i513 = i512 & 23;
                        int i514 = (i513 - (~((i512 ^ 23) | i513))) - 1;
                        f56658g = i514 % 128;
                        int i515 = i514 % 2;
                        z10 = true;
                    }
                }
                if (!(!z10)) {
                    int i516 = f56659h;
                    int i517 = i516 & 123;
                    int i518 = -(-((i516 ^ 123) | i517));
                    i10 = ((i517 | i518) << 1) - (i518 ^ i517);
                    f56658g = i10 % 128;
                    if (i10 % 2 == 0) {
                        break;
                    }
                    int i519 = 85 / 0;
                    break;
                }
            }
            int i60 = f56658g + 55;
            f56659h = i60 % 128;
            int i61 = i60 % 2;
            z10 = false;
            if (!(!z10)) {
                int i5110 = f56659h;
                int i5111 = i5110 & 123;
                int i5112 = -(-((i5110 ^ 123) | i5111));
                i10 = ((i5111 | i5112) << 1) - (i5112 ^ i5111);
                f56658g = i10 % 128;
                if (i10 % 2 == 0) {
                    break;
                }
                int i5113 = 85 / 0;
                break;
            }
        }
        ca caVar2 = (ca) next;
        if (caVar2 == null) {
            fk fkVar2 = (fk) setX(new Object[]{joVar, bqVar}, -2135547760, 2135547774, System.identityHashCode(joVar));
            int i62 = f56659h + 61;
            f56658g = i62 % 128;
            int i63 = i62 % 2;
            return fkVar2;
        }
        fk fkVar3 = (fk) setX(new Object[]{joVar, new b(caVar2, ce.setX)}, 1957582963, -1957582943, System.identityHashCode(joVar));
        int i64 = f56659h;
        int i65 = i64 & 43;
        int i66 = (i64 ^ 43) | i65;
        int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
        f56658g = i67 % 128;
        if (i67 % 2 == 0) {
            return fkVar3;
        }
        throw null;
    }

    public static /* synthetic */ setTransitionVisibility c(Object[] objArr) {
        int i10;
        setTransitionVisibility settransitionvisibility;
        by byVar = (by) objArr[0];
        System.currentTimeMillis();
        System.currentTimeMillis();
        if (byVar == null) {
            int i11 = f56658g + 95;
            int i12 = i11 % 128;
            f56659h = i12;
            int i13 = i11 % 2;
            int i14 = ((i12 ^ 27) | (i12 & 27)) << 1;
            int i15 = -(((~i12) & 27) | (i12 & (-28)));
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            f56658g = i16 % 128;
            int i17 = i16 % 2;
            i10 = -1;
        } else {
            i10 = setOnFocusChangeListener.setY[byVar.ordinal()];
            int i18 = f56658g;
            int i19 = (i18 ^ 58) + ((i18 & 58) << 1);
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            f56659h = i20 % 128;
            int i21 = i20 % 2;
        }
        if (byVar == f56657f) {
            int i22 = f56659h;
            int i23 = (i22 ^ 97) + ((i22 & 97) << 1);
            f56658g = i23 % 128;
            if (i23 % 2 == 0) {
                return setTransitionVisibility.setDividerPadding;
            }
            setTransitionVisibility.Companion companion = setTransitionVisibility.INSTANCE;
            throw null;
        }
        if (i10 == 5) {
            int i24 = f56659h;
            int i25 = i24 & 111;
            int i26 = i25 + ((i24 ^ 111) | i25);
            f56658g = i26 % 128;
            if (i26 % 2 != 0) {
                settransitionvisibility = setTransitionVisibility.setY;
                int i27 = 59 / 0;
            } else {
                settransitionvisibility = setTransitionVisibility.setY;
            }
            int i28 = f56658g;
            int i29 = (i28 & (-78)) | ((~i28) & 77);
            int i30 = -(-((i28 & 77) << 1));
            int i31 = (i29 & i30) + (i30 | i29);
            f56659h = i31 % 128;
            int i32 = i31 % 2;
            return settransitionvisibility;
        }
        if (i10 == 2) {
            int i33 = f56659h + 27;
            f56658g = i33 % 128;
            int i34 = i33 % 2;
            setTransitionVisibility settransitionvisibility2 = setTransitionVisibility.setLayoutAnimation;
            int i35 = f56659h;
            int i36 = i35 & 7;
            int i37 = ((((i35 ^ 7) | i36) << 1) - (~(-((7 | i35) & (~i36))))) - 1;
            f56658g = i37 % 128;
            int i38 = i37 % 2;
            return settransitionvisibility2;
        }
        if (i10 == 3) {
            int i39 = f56658g;
            int i40 = i39 & 125;
            int i41 = ((i39 | 125) & (~i40)) + (i40 << 1);
            f56659h = i41 % 128;
            if (i41 % 2 == 0) {
                setTransitionVisibility.Companion companion2 = setTransitionVisibility.INSTANCE;
                throw null;
            }
            setTransitionVisibility settransitionvisibility3 = setTransitionVisibility.getNavBarTitleString;
            int i42 = f56659h;
            int i43 = (((i42 & (-46)) | ((~i42) & 45)) - (~((i42 & 45) << 1))) - 1;
            f56658g = i43 % 128;
            int i44 = i43 % 2;
            return settransitionvisibility3;
        }
        if (i10 == 4) {
            int i45 = f56659h;
            int i46 = (i45 ^ 99) + ((i45 & 99) << 1);
            f56658g = i46 % 128;
            if (i46 % 2 == 0) {
                return setTransitionVisibility.setLayoutAnimation;
            }
            setTransitionVisibility.Companion companion3 = setTransitionVisibility.INSTANCE;
            throw null;
        }
        if (i10 == 6) {
            int i47 = f56658g + 73;
            f56659h = i47 % 128;
            int i48 = i47 % 2;
            setTransitionVisibility settransitionvisibility4 = setTransitionVisibility.setX;
            int i49 = f56658g;
            int i50 = (-2) - (((i49 & 40) + (i49 | 40)) ^ (-1));
            f56659h = i50 % 128;
            int i51 = i50 % 2;
            return settransitionvisibility4;
        }
        if (i10 == 7) {
            int i52 = f56659h;
            int i53 = (((i52 | 100) << 1) - (i52 ^ 100)) - 1;
            f56658g = i53 % 128;
            int i54 = i53 % 2;
            setTransitionVisibility settransitionvisibility5 = setTransitionVisibility.setOnFocusChangeListener;
            int i55 = f56658g + 123;
            f56659h = i55 % 128;
            if (i55 % 2 != 0) {
                return settransitionvisibility5;
            }
            throw null;
        }
        setTransitionVisibility settransitionvisibility6 = setTransitionVisibility.setOnDragListener;
        int i56 = f56659h;
        int i57 = i56 & 105;
        int i58 = ((((i56 ^ 105) | i57) << 1) - (~(-((i56 | 105) & (~i57))))) - 1;
        f56658g = i58 % 128;
        if (i58 % 2 == 0) {
            return settransitionvisibility6;
        }
        throw null;
    }

    public static /* synthetic */ void d(Object[] objArr) {
        bs bsVar = new bs(((jo) objArr[0]).f56660a);
        int i10 = f56658g;
        int i11 = i10 & 71;
        int i12 = -(-((i10 ^ 71) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        f56659h = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x013b, code lost:
    
        if (r6 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0150, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.ji.setDividerPadding(new java.lang.Object[]{r1}, 858549070, -858549065, java.lang.System.identityHashCode(r1))).booleanValue() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0152, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.jo.f56658g;
        r0 = r6 & 29;
        r6 = -(-((r6 ^ 29) | r0));
        r1 = (r0 & r6) + (r6 | r0);
        com.mypinpad.tsdk.isolation.jo.f56659h = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0167, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0168, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.jo.f56658g;
        r1 = (r6 | 93) << 1;
        r6 = -(((~r6) & 93) | (r6 & (-94)));
        r3 = (r1 ^ r6) + ((r6 & r1) << 1);
        com.mypinpad.tsdk.isolation.jo.f56659h = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x017f, code lost:
    
        if ((r3 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0181, code lost:
    
        r6 = 68 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0186, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0189, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean e(java.lang.Object[] r6) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.jo.e(java.lang.Object[]):java.lang.Boolean");
    }

    public static /* synthetic */ bq f(Object[] objArr) throws Exception {
        jo joVar = (jo) objArr[0];
        int i10 = f56659h;
        int i11 = i10 & 45;
        int i12 = i10 | 45;
        int i13 = (i11 & i12) + (i12 | i11);
        f56658g = i13 % 128;
        int i14 = i13 % 2;
        iv ivVar = joVar.f56660a;
        TransactionFailed drawingCacheEnabled = setAnimation.setDrawingCacheEnabled();
        if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar, (String) TransactionFailed.setX(new Object[]{drawingCacheEnabled}, 1914607362, -1914607356, System.identityHashCode(drawingCacheEnabled))}, 1014467290, -1014467254, System.identityHashCode(ivVar))).booleanValue()) {
            int i15 = f56659h;
            int i16 = (i15 ^ 79) + ((i15 & 79) << 1);
            f56658g = i16 % 128;
            int i17 = i16 % 2;
            setX(new Object[]{joVar}, -1464503041, 1464503059, System.identityHashCode(joVar));
            int i18 = f56659h;
            int i19 = (((i18 & (-20)) | ((~i18) & 19)) - (~(-(-((i18 & 19) << 1))))) - 1;
            f56658g = i19 % 128;
            int i20 = i19 % 2;
            return null;
        }
        bt btVar = new bt(joVar.f56660a);
        bq bqVar = (bq) ((setImageTintList) w.setX(new Object[]{btVar}, 1693919772, -1693919769, System.identityHashCode(btVar)));
        if (!bqVar.setLayoutAnimation().isEmpty()) {
            int i21 = f56658g;
            int i22 = (i21 ^ 63) + ((i21 & 63) << 1);
            f56659h = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 28 / 0;
            }
            return bqVar;
        }
        int i24 = f56658g;
        int i25 = i24 & 21;
        int i26 = (i24 | 21) & (~i25);
        int i27 = -(-(i25 << 1));
        int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
        f56659h = i28 % 128;
        if (i28 % 2 == 0) {
            setX(new Object[]{joVar}, -1464503041, 1464503059, System.identityHashCode(joVar));
            int i29 = 31 / 0;
        } else {
            setX(new Object[]{joVar}, -1464503041, 1464503059, System.identityHashCode(joVar));
        }
        int i30 = f56659h;
        int i31 = i30 ^ 103;
        int i32 = ((i30 & 103) | i31) << 1;
        int i33 = -i31;
        int i34 = (i32 & i33) + (i32 | i33);
        f56658g = i34 % 128;
        int i35 = i34 % 2;
        return null;
    }

    public static /* synthetic */ fk g(Object[] objArr) {
        jo joVar = (jo) objArr[0];
        bq bqVar = (bq) objArr[1];
        cy cyVar = new cy(joVar.f56660a);
        if (!bqVar.setAlwaysDrawnWithCacheEnabled()) {
            kc kcVar = joVar.f56662c;
            fk fkVar = (fk) kc.setDividerPadding(new Object[]{kcVar, joVar.f56660a, joVar.f56661b}, 37118063, -37118043, System.identityHashCode(kcVar));
            int i10 = f56659h;
            int i11 = i10 & 41;
            int i12 = i10 | 41;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f56658g = i13 % 128;
            if (i13 % 2 == 0) {
                return fkVar;
            }
            throw null;
        }
        int i14 = f56659h;
        int i15 = (((i14 ^ 63) | (i14 & 63)) << 1) - (((~i14) & 63) | (i14 & (-64)));
        int i16 = i15 % 128;
        f56658g = i16;
        int i17 = i15 % 2;
        int i18 = i16 ^ 103;
        int i19 = ((i16 & 103) | i18) << 1;
        int i20 = -i18;
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        f56659h = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    public static /* synthetic */ fk h(Object[] objArr) {
        jo joVar = (jo) objArr[0];
        am amVar = (am) objArr[1];
        int i10 = f56658g + 82;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f56659h = i11 % 128;
        if (i11 % 2 == 0) {
            ((Boolean) am.setY(new Object[]{amVar}, -776903, 776911, System.identityHashCode(amVar))).booleanValue();
            throw null;
        }
        if (!((Boolean) am.setY(new Object[]{amVar}, -776903, 776911, System.identityHashCode(amVar))).booleanValue()) {
            fk fkVar = (fk) setX(new Object[]{joVar, amVar}, -1725298059, 1725298065, System.identityHashCode(joVar));
            int i12 = f56658g + 101;
            f56659h = i12 % 128;
            int i13 = i12 % 2;
            return fkVar;
        }
        int i14 = f56658g;
        int i15 = ((i14 | 33) << 1) - (i14 ^ 33);
        f56659h = i15 % 128;
        if (i15 % 2 != 0) {
            return (fk) setX(new Object[]{joVar}, 478422934, -478422930, System.identityHashCode(joVar));
        }
        throw null;
    }

    public static /* synthetic */ fk i(Object[] objArr) {
        jo joVar = (jo) objArr[0];
        cy cyVar = new cy(joVar.f56660a);
        aq aqVar = new aq(joVar.f56660a);
        am amVar = (am) ((setImageTintList) w.setX(new Object[]{aqVar}, 1693919772, -1693919769, System.identityHashCode(aqVar)));
        setFontFeatureSettings setfontfeaturesettings = joVar.f56663d;
        if (!((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, -2133249192, 2133249203, System.identityHashCode(setfontfeaturesettings))).booleanValue()) {
            fk fkVar = (fk) setX(new Object[]{joVar, amVar}, 1147413293, -1147413288, System.identityHashCode(joVar));
            int i10 = f56658g + 78;
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            f56659h = i11 % 128;
            int i12 = i11 % 2;
            return fkVar;
        }
        int i13 = f56658g;
        int i14 = (i13 ^ 111) + ((i13 & 111) << 1);
        f56659h = i14 % 128;
        int i15 = i14 % 2;
        if (((Boolean) am.setY(new Object[]{amVar}, 27011347, -27011346, System.identityHashCode(amVar))).booleanValue()) {
            int i16 = f56658g;
            int i17 = i16 & 99;
            int i18 = ((((i16 ^ 99) | i17) << 1) - (~(-((i16 | 99) & (~i17))))) - 1;
            f56659h = i18 % 128;
            if (i18 % 2 != 0) {
                return (fk) setX(new Object[]{joVar}, -41585605, 41585605, System.identityHashCode(joVar));
            }
            throw null;
        }
        fk fkVar2 = (fk) setX(new Object[]{joVar}, 1804527824, -1804527809, System.identityHashCode(joVar));
        int i19 = f56659h;
        int i20 = (i19 | 109) << 1;
        int i21 = -(i19 ^ 109);
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        f56658g = i22 % 128;
        if (i22 % 2 == 0) {
            return fkVar2;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:13:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:15:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:17:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:19:0x010e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0126  */
    /* JADX WARN: Code duplicated, block: B:22:0x013b  */
    /* JADX WARN: Code duplicated, block: B:9:0x007c  */
    public static /* synthetic */ fk j(Object[] objArr) {
        jc jcVar;
        int i10;
        iw iwVar;
        int i11;
        jo joVar = (jo) objArr[0];
        int i12 = f56659h + 23;
        f56658g = i12 % 128;
        if (i12 % 2 != 0) {
            iv ivVar = joVar.f56660a;
            TransactionFailed compoundDrawables = setAnimation.setCompoundDrawables();
            int i13 = 24 / 0;
            if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar, (String) TransactionFailed.setX(new Object[]{compoundDrawables}, 1914607362, -1914607356, System.identityHashCode(compoundDrawables))}, -232375606, 232375652, System.identityHashCode(ivVar))).booleanValue()) {
                ja jaVar = new ja(joVar.f56660a);
                jcVar = (jc) ((setImageTintList) w.setX(new Object[]{jaVar}, 1693919772, -1693919769, System.identityHashCode(jaVar)));
                if (((jb) jc.setOnFocusChangeListener(new Object[]{jcVar}, 1362433532, -1362433532, System.identityHashCode(jcVar))) == jb.setCompoundDrawableTintBlendMode) {
                    int i14 = f56659h;
                    int i15 = i14 & 79;
                    int i16 = -(-((i14 ^ 79) | i15));
                    i10 = (i15 ^ i16) + ((i16 & i15) << 1);
                    f56658g = i10 % 128;
                    if (i10 % 2 == 0) {
                        iz.Companion companion = iz.INSTANCE;
                        throw null;
                    }
                    if (((iz) jc.setOnFocusChangeListener(new Object[]{jcVar}, 1232158677, -1232158676, System.identityHashCode(jcVar))) == iz.FAILED) {
                        int i17 = f56659h + 69;
                        f56658g = i17 % 128;
                        int i18 = i17 % 2;
                        iwVar = joVar.f56664e;
                        if (!((Boolean) iw.setOnFocusChangeListener(new Object[]{iwVar}, -1546748914, 1546748916, System.identityHashCode(iwVar))).booleanValue()) {
                            i11 = f56659h + 45;
                            f56658g = i11 % 128;
                            if (i11 % 2 != 0) {
                                return (fk) ((Pair) setX(new Object[]{joVar}, 300669119, -300669100, System.identityHashCode(joVar))).getSecond();
                            }
                            int i19 = 21 / 0;
                            return (fk) ((Pair) setX(new Object[]{joVar}, 300669119, -300669100, System.identityHashCode(joVar))).getSecond();
                        }
                    }
                }
            }
        } else {
            iv ivVar2 = joVar.f56660a;
            TransactionFailed compoundDrawables2 = setAnimation.setCompoundDrawables();
            if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar2, (String) TransactionFailed.setX(new Object[]{compoundDrawables2}, 1914607362, -1914607356, System.identityHashCode(compoundDrawables2))}, -232375606, 232375652, System.identityHashCode(ivVar2))).booleanValue()) {
                ja jaVar2 = new ja(joVar.f56660a);
                jcVar = (jc) ((setImageTintList) w.setX(new Object[]{jaVar2}, 1693919772, -1693919769, System.identityHashCode(jaVar2)));
                if (((jb) jc.setOnFocusChangeListener(new Object[]{jcVar}, 1362433532, -1362433532, System.identityHashCode(jcVar))) == jb.setCompoundDrawableTintBlendMode) {
                    int i110 = f56659h;
                    int i111 = i110 & 79;
                    int i112 = -(-((i110 ^ 79) | i111));
                    i10 = (i111 ^ i112) + ((i112 & i111) << 1);
                    f56658g = i10 % 128;
                    if (i10 % 2 == 0) {
                        iz.Companion companion2 = iz.INSTANCE;
                        throw null;
                    }
                    if (((iz) jc.setOnFocusChangeListener(new Object[]{jcVar}, 1232158677, -1232158676, System.identityHashCode(jcVar))) == iz.FAILED) {
                        int i113 = f56659h + 69;
                        f56658g = i113 % 128;
                        int i114 = i113 % 2;
                        iwVar = joVar.f56664e;
                        if (!((Boolean) iw.setOnFocusChangeListener(new Object[]{iwVar}, -1546748914, 1546748916, System.identityHashCode(iwVar))).booleanValue()) {
                            i11 = f56659h + 45;
                            f56658g = i11 % 128;
                            if (i11 % 2 != 0) {
                                return (fk) ((Pair) setX(new Object[]{joVar}, 300669119, -300669100, System.identityHashCode(joVar))).getSecond();
                            }
                            int i115 = 21 / 0;
                            return (fk) ((Pair) setX(new Object[]{joVar}, 300669119, -300669100, System.identityHashCode(joVar))).getSecond();
                        }
                    }
                }
            }
        }
        aq aqVar = new aq(joVar.f56660a);
        fk fkVar = (fk) setX(new Object[]{joVar, (am) ((setImageTintList) w.setX(new Object[]{aqVar}, 1693919772, -1693919769, System.identityHashCode(aqVar)))}, -1725298059, 1725298065, System.identityHashCode(joVar));
        int i20 = f56659h;
        int i21 = i20 ^ 47;
        int i22 = ((((i20 & 47) | i21) << 1) - (~(-i21))) - 1;
        f56658g = i22 % 128;
        int i23 = i22 % 2;
        return fkVar;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0576  */
    /* JADX WARN: Code duplicated, block: B:123:0x064c  */
    /* JADX WARN: Code duplicated, block: B:156:0x0785  */
    /* JADX WARN: Code duplicated, block: B:159:0x0799  */
    /* JADX WARN: Code duplicated, block: B:168:0x0800  */
    /* JADX WARN: Code duplicated, block: B:36:0x0134  */
    /* JADX WARN: Code duplicated, block: B:38:0x0147  */
    /* JADX WARN: Code duplicated, block: B:40:0x014c  */
    /* JADX WARN: Code duplicated, block: B:42:0x015f  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object pair;
        boolean zBooleanValue;
        int i13;
        b bVar;
        char c10;
        byte b10;
        boolean zBooleanValue2;
        fk fkVar;
        List listListOf;
        Object onFocusChangeListener;
        by byVar;
        ce ceVar;
        ce ceVar2;
        int i14;
        int i15;
        int i16;
        int i17 = ~((~i10) | i11);
        int i18 = ~i11;
        int i19 = ~(i10 | i18);
        int i20 = ((i19 | (~(i18 | (~i12))) | i17) * 262) + (i19 * (-786)) + ((i17 | i19 | (~(i18 | i12))) * 262) + (i11 * 263) + (i10 * (-523));
        int i21 = -1986078786;
        int i22 = 1986078787;
        by byVar2 = f56657f;
        int i23 = -1790938757;
        int i24 = 1790938757;
        ce ceVar3 = null;
        switch (i20) {
            case 1:
                return c(objArr);
            case 2:
                d(objArr);
                return null;
            case 3:
                pair = new Pair(Boolean.TRUE, null);
                int i25 = f56659h;
                int i26 = (i25 ^ 117) + ((i25 & 117) << 1);
                f56658g = i26 % 128;
                int i27 = i26 % 2;
                return pair;
            case 4:
                return j(objArr);
            case 5:
                return h(objArr);
            case 6:
                return b(objArr);
            case 7:
                return g(objArr);
            case 8:
                return i(objArr);
            case 9:
                return e(objArr);
            case 10:
                return f(objArr);
            case 11:
                pair = new Pair(Boolean.FALSE, null);
                int i28 = f56659h;
                int i29 = i28 | 101;
                int i30 = i29 << 1;
                int i31 = -((~(i28 & 101)) & i29);
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                f56658g = i32 % 128;
                if (i32 % 2 != 0) {
                    throw null;
                }
                return pair;
            case 12:
                return a(objArr);
            case 13:
                jo joVar = (jo) objArr[0];
                iv ivVar = (iv) objArr[1];
                ca caVar = (ca) objArr[2];
                long jLongValue = ((Number) objArr[3]).longValue();
                long jLongValue2 = ((Number) objArr[4]).longValue();
                int i33 = f56658g;
                int i34 = (i33 & (-66)) | ((~i33) & 65);
                int i35 = -(-((i33 & 65) << 1));
                int i36 = (i34 & i35) + (i35 | i34);
                f56659h = i36 % 128;
                if (i36 % 2 == 0) {
                    int i37 = 31 / 0;
                    if (((cb) ca.setOnFocusChangeListener(new Object[]{caVar}, 115119597, -115119594, System.identityHashCode(caVar))) == cb.IF_TERMINAL_SUPPORTS_THE_CVM) {
                        zBooleanValue = ((Boolean) setX(new Object[]{joVar, caVar}, 741853817, -741853808, System.identityHashCode(joVar))).booleanValue();
                        int i38 = f56659h;
                        int i39 = ((i38 | 49) << 1) - (i38 ^ 49);
                        f56658g = i39 % 128;
                        int i40 = i39 % 2;
                    } else {
                        zBooleanValue = ((Boolean) ca.setOnFocusChangeListener(new Object[]{caVar, ivVar, Long.valueOf(jLongValue), Long.valueOf(jLongValue2)}, -1335075487, 1335075493, System.identityHashCode(caVar))).booleanValue();
                        int i41 = f56659h;
                        int i42 = i41 & 11;
                        i13 = (i42 - (~((i41 ^ 11) | i42))) - 1;
                        f56658g = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i43 = 62 / 0;
                            pair = Boolean.valueOf(zBooleanValue);
                        }
                    }
                    pair = Boolean.valueOf(zBooleanValue);
                } else {
                    if (((cb) ca.setOnFocusChangeListener(new Object[]{caVar}, 115119597, -115119594, System.identityHashCode(caVar))) == cb.IF_TERMINAL_SUPPORTS_THE_CVM) {
                        zBooleanValue = ((Boolean) setX(new Object[]{joVar, caVar}, 741853817, -741853808, System.identityHashCode(joVar))).booleanValue();
                        int i310 = f56659h;
                        int i311 = ((i310 | 49) << 1) - (i310 ^ 49);
                        f56658g = i311 % 128;
                        int i44 = i311 % 2;
                    } else {
                        zBooleanValue = ((Boolean) ca.setOnFocusChangeListener(new Object[]{caVar, ivVar, Long.valueOf(jLongValue), Long.valueOf(jLongValue2)}, -1335075487, 1335075493, System.identityHashCode(caVar))).booleanValue();
                        int i45 = f56659h;
                        int i46 = i45 & 11;
                        i13 = (i46 - (~((i45 ^ 11) | i46))) - 1;
                        f56658g = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i47 = 62 / 0;
                            pair = Boolean.valueOf(zBooleanValue);
                        }
                    }
                    pair = Boolean.valueOf(zBooleanValue);
                }
                return pair;
            case 14:
                jo joVar2 = (jo) objArr[0];
                bq bqVar = (bq) objArr[1];
                List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) bqVar.setLayoutAnimation());
                b bVar2 = null;
                while (true) {
                    if (bVar2 != null) {
                        ceVar3 = (ce) b.a(new Object[]{bVar2}, i21, i22, System.identityHashCode(bVar2));
                    }
                    ce ceVar4 = ce.setX;
                    if (ceVar3 == ceVar4 || !(!mutableList.isEmpty())) {
                        bVar = bVar2;
                    } else {
                        ca caVar2 = (ca) mutableList.remove(0);
                        if (((Boolean) ca.setOnFocusChangeListener(new Object[]{caVar2}, 1425072868, -1425072867, System.identityHashCode(caVar2))).booleanValue()) {
                            if (((Boolean) setX(new Object[]{caVar2}, 1298095606, -1298095589, (int) System.currentTimeMillis())).booleanValue()) {
                                c10 = 42679;
                                b10 = -1299031735;
                            } else {
                                c10 = 42679;
                                b10 = -1299031735;
                            }
                            i21 = -1986078786;
                            i22 = 1986078787;
                            i23 = -1790938757;
                            i24 = 1790938757;
                            ceVar3 = null;
                        } else {
                            cz czVar = new cz(joVar2.f56660a);
                            if (((cf) ca.setOnFocusChangeListener(new Object[]{caVar2}, -943319764, 943319766, System.identityHashCode(caVar2))) != cf.setDividerPadding) {
                                if (((Boolean) setX(new Object[]{caVar2}, 1298095606, -1298095589, (int) System.currentTimeMillis())).booleanValue() || !((Boolean) setX(new Object[]{joVar2, joVar2.f56660a, caVar2, Long.valueOf(bqVar.setNavigationOnClickListener()), Long.valueOf(bqVar.getNavBarTitleString())}, -1435107602, 1435107615, System.identityHashCode(joVar2))).booleanValue()) {
                                    c10 = 42679;
                                    b10 = -1299031735;
                                } else if (((Boolean) setX(new Object[]{joVar2, caVar2}, 741853817, -741853808, System.identityHashCode(joVar2))).booleanValue()) {
                                    boolean zBooleanValue3 = ((Boolean) ca.setOnFocusChangeListener(new Object[]{caVar2, joVar2.f56660a}, 2074548862, -2074548853, System.identityHashCode(caVar2))).booleanValue();
                                    if (((by) ca.setOnFocusChangeListener(new Object[]{caVar2}, 1299031735, -1299031735, System.identityHashCode(caVar2))) == byVar2) {
                                        Pair pair2 = (Pair) setX(new Object[]{joVar2}, -112206761, 112206773, System.identityHashCode(joVar2));
                                        zBooleanValue2 = ((Boolean) pair2.component1()).booleanValue();
                                        fkVar = (fk) pair2.component2();
                                        if (fkVar != null) {
                                            return fkVar;
                                        }
                                    } else {
                                        zBooleanValue2 = true;
                                    }
                                    boolean z10 = zBooleanValue3 && zBooleanValue2;
                                    if (z10) {
                                        c10 = 42679;
                                        b10 = -1299031735;
                                        if (((by) ca.setOnFocusChangeListener(new Object[]{caVar2}, 1299031735, -1299031735, System.identityHashCode(caVar2))) != by.FAIL_CVM_PROCESSING) {
                                        }
                                        bVar = new b(caVar2, ce.setDividerPadding);
                                    } else {
                                        c10 = 42679;
                                        b10 = -1299031735;
                                    }
                                    if (z10 || ((cf) ca.setOnFocusChangeListener(new Object[]{caVar2}, -943319764, 943319766, System.identityHashCode(caVar2))) != cf.setDividerPadding) {
                                        if (!z10) {
                                            ceVar4 = ce.setDividerPadding;
                                        }
                                        bVar2 = new b(caVar2, ceVar4);
                                    } else {
                                        bVar = new b(caVar2, ce.setDividerPadding);
                                    }
                                } else {
                                    if (((by) ca.setOnFocusChangeListener(new Object[]{caVar2}, 1299031735, -1299031735, System.identityHashCode(caVar2))) == by.ENCIPHERED_PIN_VERIFIED_ONLINE || ((Boolean) setX(new Object[]{caVar2}, 1029443446, -1029443425, (int) System.currentTimeMillis())).booleanValue()) {
                                        cz czVar2 = new cz(joVar2.f56660a);
                                    }
                                    if (((cf) ca.setOnFocusChangeListener(new Object[]{caVar2}, -943319764, 943319766, System.identityHashCode(caVar2))) == cf.setDividerPadding) {
                                    }
                                    c10 = 42679;
                                    b10 = -1299031735;
                                }
                                i21 = -1986078786;
                                i22 = 1986078787;
                                i23 = -1790938757;
                                i24 = 1790938757;
                                ceVar3 = null;
                            }
                            bVar = null;
                        }
                    }
                    pair = (fk) setX(new Object[]{joVar2, bVar}, 1957582963, -1957582943, System.identityHashCode(joVar2));
                    return pair;
                }
            case 15:
                jo joVar3 = (jo) objArr[0];
                cz czVar3 = new cz(joVar3.f56660a);
                setX(new Object[]{joVar3}, 1572261495, -1572261479, System.identityHashCode(joVar3));
                int i48 = f56659h;
                int i49 = i48 & 51;
                int i50 = (((i48 | 51) & (~i49)) - (~(i49 << 1))) - 1;
                f56658g = i50 % 128;
                if (i50 % 2 == 0) {
                    return null;
                }
                throw null;
            case 16:
                bs bsVar = new bs(((jo) objArr[0]).f56660a);
                int i51 = f56659h;
                int i52 = ((i51 & 79) - (~(i51 | 79))) - 1;
                f56658g = i52 % 128;
                int i53 = i52 % 2;
                return null;
            case 17:
                ca caVar3 = (ca) objArr[0];
                int i54 = f56659h;
                int i55 = (((i54 & (-32)) | ((~i54) & 31)) - (~(-(-((i54 & 31) << 1))))) - 1;
                f56658g = i55 % 128;
                if (i55 % 2 != 0) {
                    by[] byVarArr = new by[3];
                    byVarArr[1] = byVar2;
                    byVarArr[1] = by.ENCIPHERED_PIN_VERIFIED_ONLINE;
                    byVarArr[4] = by.SIGNATURE_PAPER;
                    byVarArr[3] = by.NO_CVM_REQUIRED;
                    byVarArr[2] = by.FAIL_CVM_PROCESSING;
                    listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) byVarArr);
                    onFocusChangeListener = ca.setOnFocusChangeListener(new Object[]{caVar3}, 1299031735, -1299031735, System.identityHashCode(caVar3));
                } else {
                    listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new by[]{byVar2, by.ENCIPHERED_PIN_VERIFIED_ONLINE, by.SIGNATURE_PAPER, by.NO_CVM_REQUIRED, by.FAIL_CVM_PROCESSING});
                    onFocusChangeListener = ca.setOnFocusChangeListener(new Object[]{caVar3}, 1299031735, -1299031735, System.identityHashCode(caVar3));
                }
                boolean zContains = listListOf.contains((by) onFocusChangeListener);
                int i56 = f56659h + 47;
                f56658g = i56 % 128;
                int i57 = i56 % 2;
                return Boolean.valueOf(zContains);
            case 18:
                jo joVar4 = (jo) objArr[0];
                cz czVar4 = new cz(joVar4.f56660a);
                setX(new Object[]{joVar4}, 1350830935, -1350830933, System.identityHashCode(joVar4));
                int i58 = f56659h;
                int i59 = i58 & 37;
                int i60 = i59 + ((i58 ^ 37) | i59);
                f56658g = i60 % 128;
                int i61 = i60 % 2;
                return null;
            case 19:
                jo joVar5 = (jo) objArr[0];
                iw iwVar = joVar5.f56664e;
                iw.setOnFocusChangeListener(new Object[]{iwVar}, -1545700222, 1545700222, System.identityHashCode(iwVar));
                Boolean bool = Boolean.FALSE;
                kc kcVar = joVar5.f56662c;
                Pair pair3 = new Pair(bool, (fk) kc.setDividerPadding(new Object[]{kcVar, joVar5.f56660a, joVar5.f56661b}, 644326672, -644326670, System.identityHashCode(kcVar)));
                int i62 = f56659h;
                int i63 = ((i62 & 118) + (i62 | 118)) - 1;
                f56658g = i63 % 128;
                if (i63 % 2 == 0) {
                    return pair3;
                }
                throw null;
            case 20:
                jo joVar6 = (jo) objArr[0];
                b bVar3 = (b) objArr[1];
                int i64 = f56659h;
                int i65 = ((i64 ^ 6) + ((i64 & 6) << 1)) - 1;
                int i66 = i65 % 128;
                f56658g = i66;
                if (i65 % 2 != 0) {
                    throw null;
                }
                if (bVar3 == null) {
                    int i67 = i66 & 109;
                    int i68 = -(-(i66 | 109));
                    int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                    f56659h = i69 % 128;
                    int i70 = i69 % 2;
                    byVar = null;
                } else {
                    ca caVar4 = (ca) b.a(new Object[]{bVar3}, -27278032, 27278032, System.identityHashCode(bVar3));
                    byVar = (by) ca.setOnFocusChangeListener(new Object[]{caVar4}, 1299031735, -1299031735, System.identityHashCode(caVar4));
                    int i71 = f56658g;
                    int i72 = ((i71 & 30) + (i71 | 30)) - 1;
                    f56659h = i72 % 128;
                    int i73 = i72 % 2;
                }
                iv ivVar2 = joVar6.f56660a;
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar2, (setTransitionVisibility) setX(new Object[]{byVar}, -1807893005, 1807893006, (int) System.currentTimeMillis())}, -1167051031, 1167051073, System.identityHashCode(ivVar2));
                if (bVar3 == null) {
                    int i74 = f56658g;
                    int i75 = (((i74 & (-120)) | ((~i74) & 119)) - (~(-(-((i74 & 119) << 1))))) - 1;
                    f56659h = i75 % 128;
                    if (i75 % 2 == 0) {
                        throw null;
                    }
                    int i76 = i74 + 101;
                    f56659h = i76 % 128;
                    int i77 = i76 % 2;
                    ceVar = null;
                } else {
                    ceVar = (ce) b.a(new Object[]{bVar3}, -1986078786, 1986078787, System.identityHashCode(bVar3));
                    int i78 = f56659h;
                    int i79 = i78 & 95;
                    int i80 = ((i78 ^ 95) | i79) << 1;
                    int i81 = -((i78 | 95) & (~i79));
                    int i82 = (i80 & i81) + (i81 | i80);
                    f56658g = i82 % 128;
                    int i83 = i82 % 2;
                }
                iv ivVar3 = joVar6.f56660a;
                if (ceVar != null) {
                    int i84 = setOnFocusChangeListener.setCompoundDrawableTintBlendMode[ceVar.ordinal()];
                    int i85 = f56659h;
                    int i86 = i85 & 39;
                    int i87 = ((i85 ^ 39) | i86) << 1;
                    int i88 = -((i85 | 39) & (~i86));
                    int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                    int i90 = i89 % 128;
                    f56658g = i90;
                    int i91 = i89 % 2;
                    if (i84 == 1) {
                        int i92 = (((i90 | 22) << 1) - (i90 ^ 22)) - 1;
                        f56659h = i92 % 128;
                        int i93 = i92 % 2;
                        by byVar3 = by.ENCIPHERED_PIN_VERIFIED_ONLINE;
                        if (byVar == byVar3) {
                            cz czVar5 = new cz(ivVar3);
                            int i94 = f56659h;
                            int i95 = i94 & 19;
                            int i96 = ((i94 | 19) & (~i95)) + (i95 << 1);
                            f56658g = i96 % 128;
                            int i97 = i96 % 2;
                        }
                        if (CollectionsKt___CollectionsKt.contains(CollectionsKt__CollectionsKt.listOf((Object[]) new by[]{byVar3, by.SIGNATURE_PAPER}), byVar)) {
                            int i98 = f56658g;
                            int i99 = (i98 ^ 5) + ((i98 & 5) << 1);
                            f56659h = i99 % 128;
                            int i100 = i99 % 2;
                            ceVar2 = ce.setOnFocusChangeListener;
                            int i101 = f56659h;
                            int i102 = i101 & 69;
                            int i103 = -(-((i101 ^ 69) | i102));
                            int i104 = (i102 & i103) + (i103 | i102);
                            f56658g = i104 % 128;
                            int i105 = i104 % 2;
                        } else {
                            ceVar2 = ce.setX;
                            int i106 = f56658g;
                            i14 = (i106 & 77) + (i106 | 77);
                            f56659h = i14 % 128;
                            int i107 = i14 % 2;
                        }
                    }
                    bs bsVar2 = new bs(ivVar3);
                    int i108 = f56658g + 120;
                    int i109 = (i108 ^ (-1)) + (i108 << 1);
                    f56659h = i109 % 128;
                    int i110 = i109 % 2;
                    return null;
                }
                int i111 = f56659h;
                int i112 = i111 & 17;
                int i113 = ((i111 | 17) & (~i112)) + (i112 << 1);
                int i114 = i113 % 128;
                f56658g = i114;
                int i115 = i113 % 2;
                int i116 = i114 & 107;
                int i117 = -(-((i114 ^ 107) | i116));
                int i118 = ((i116 | i117) << 1) - (i116 ^ i117);
                f56659h = i118 % 128;
                int i119 = i118 % 2;
                cz czVar6 = new cz(ivVar3);
                if (bVar3 == null) {
                    int i120 = f56658g + 98;
                    int i121 = (i120 ^ (-1)) + (i120 << 1);
                    f56659h = i121 % 128;
                    if (i121 % 2 == 0) {
                        ceVar2 = ce.setDividerPadding;
                        int i122 = 45 / 0;
                    } else {
                        ceVar2 = ce.setDividerPadding;
                    }
                    int i123 = f56659h;
                    i14 = ((i123 | 59) << 1) - (i123 ^ 59);
                    f56658g = i14 % 128;
                    int i1010 = i14 % 2;
                } else {
                    ceVar2 = (ce) b.a(new Object[]{bVar3}, -1986078786, 1986078787, System.identityHashCode(bVar3));
                    int i124 = f56659h + 98;
                    int i125 = (i124 ^ (-1)) + (i124 << 1);
                    f56658g = i125 % 128;
                    int i126 = i125 % 2;
                }
                bs bsVar3 = new bs(ivVar3);
                int i1011 = f56658g + 120;
                int i1012 = (i1011 ^ (-1)) + (i1011 << 1);
                f56659h = i1012 % 128;
                int i1110 = i1012 % 2;
                return null;
            case 21:
                ca caVar5 = (ca) objArr[0];
                int i127 = f56659h;
                int i128 = i127 & 17;
                int i129 = -(-((i127 ^ 17) | i128));
                int i130 = ((i128 | i129) << 1) - (i129 ^ i128);
                f56658g = i130 % 128;
                Object[] objArr2 = new Object[1];
                if (i130 % 2 != 0) {
                    objArr2[0] = caVar5;
                    int i131 = setOnFocusChangeListener.setY[((by) ca.setOnFocusChangeListener(objArr2, 1299031735, -1299031735, System.identityHashCode(caVar5))).ordinal()];
                    int i132 = 1 / 0;
                    if (i131 == 1 || i131 == 2 || i131 == 3 || i131 == 4) {
                        int i133 = f56659h;
                        int i134 = i133 & 7;
                        i15 = (i134 - (~(-(-((i133 ^ 7) | i134))))) - 1;
                        f56658g = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i135 = 41 / 0;
                        }
                        pair = Boolean.TRUE;
                    } else {
                        int i136 = f56658g;
                        int i137 = i136 & 47;
                        int i138 = (i136 ^ 47) | i137;
                        i16 = ((i137 | i138) << 1) - (i138 ^ i137);
                        f56659h = i16 % 128;
                        if (i16 % 2 == 0) {
                            int i139 = 31 / 0;
                        }
                        pair = Boolean.FALSE;
                    }
                } else {
                    objArr2[0] = caVar5;
                    int i140 = setOnFocusChangeListener.setY[((by) ca.setOnFocusChangeListener(objArr2, 1299031735, -1299031735, System.identityHashCode(caVar5))).ordinal()];
                    if (i140 == 1 || i140 == 2 || i140 == 3 || i140 == 4) {
                        int i1310 = f56659h;
                        int i1311 = i1310 & 7;
                        i15 = (i1311 - (~(-(-((i1310 ^ 7) | i1311))))) - 1;
                        f56658g = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i1312 = 41 / 0;
                        }
                        pair = Boolean.TRUE;
                    } else {
                        int i1313 = f56658g;
                        int i1314 = i1313 & 47;
                        int i1315 = (i1313 ^ 47) | i1314;
                        i16 = ((i1314 | i1315) << 1) - (i1315 ^ i1314);
                        f56659h = i16 % 128;
                        if (i16 % 2 == 0) {
                            int i1316 = 31 / 0;
                        }
                        pair = Boolean.FALSE;
                    }
                }
                return pair;
            default:
                jo joVar7 = (jo) objArr[0];
                int i141 = f56659h + 53;
                f56658g = i141 % 128;
                if (i141 % 2 != 0) {
                    throw null;
                }
                bq bqVar2 = (bq) setX(new Object[]{joVar7}, -1187581896, 1187581906, System.identityHashCode(joVar7));
                if (bqVar2 == null) {
                    int i142 = f56659h;
                    int i143 = (i142 & 107) + (i142 | 107);
                    f56658g = i143 % 128;
                    if (i143 % 2 == 0) {
                        return null;
                    }
                    int i144 = 57 / 0;
                    return null;
                }
                fkVar = (fk) setX(new Object[]{joVar7, bqVar2}, 2120968191, -2120968184, System.identityHashCode(joVar7));
                if (fkVar != null) {
                    int i145 = f56658g;
                    int i146 = (i145 ^ 83) + ((i145 & 83) << 1);
                    f56659h = i146 % 128;
                    if (i146 % 2 == 0) {
                        int i147 = 3 / 0;
                    }
                    return fkVar;
                }
                pair = (fk) setX(new Object[]{joVar7, bqVar2}, -2135547760, 2135547774, System.identityHashCode(joVar7));
                int i148 = f56659h;
                int i149 = (i148 ^ 9) + ((i148 & 9) << 1);
                f56658g = i149 % 128;
                if (i149 % 2 != 0) {
                    throw null;
                }
                return pair;
        }
    }

    @Nullable
    public final fk setCompoundDrawableTintBlendMode() {
        return (fk) setX(new Object[]{this}, -725137687, 725137695, System.identityHashCode(this));
    }
}
