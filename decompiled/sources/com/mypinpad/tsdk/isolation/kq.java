package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class kq extends kj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f56818h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56819i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final component10 f56820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56821g;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/mypinpad/tsdk/i/fk;", "setY", "()Lcom/mypinpad/tsdk/i/fk;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function0<fk> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56822q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56823r0 = 1;

        public a() {
            super(0);
        }

        public static /* synthetic */ fk a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = ~(i13 | i10);
            int i15 = ~i12;
            int i16 = ~(i15 | i10);
            if (((i13 | i16) * 712) + (((~(i10 | i11 | i12)) | (~(i13 | i15 | i10))) * (-712)) + ((i14 | i16) * (-712)) + (i11 * 713) + (i10 * (-711)) == 1) {
                a aVar = (a) objArr[0];
                int i17 = f56822q0;
                int i18 = i17 & 99;
                int i19 = (((i17 ^ 99) | i18) << 1) - ((i17 | 99) & (~i18));
                f56823r0 = i19 % 128;
                int i20 = i19 % 2;
                fk fkVarA = a(new Object[]{aVar}, 859097231, -859097231, System.identityHashCode(aVar));
                int i21 = f56823r0 + 9;
                f56822q0 = i21 % 128;
                if (i21 % 2 == 0) {
                    return fkVarA;
                }
                throw null;
            }
            a aVar2 = (a) objArr[0];
            int i22 = f56822q0;
            int i23 = i22 & 27;
            int i24 = -(-((i22 ^ 27) | i23));
            int i25 = (i23 & i24) + (i24 | i23);
            f56823r0 = i25 % 128;
            if (i25 % 2 == 0) {
                kw kwVar = (kw) kq.setY(new Object[]{kq.this}, 1683756539, -1683756536, (int) System.currentTimeMillis());
                kq kqVar = kq.this;
                throw null;
            }
            kw kwVar2 = (kw) kq.setY(new Object[]{kq.this}, 1683756539, -1683756536, (int) System.currentTimeMillis());
            kq kqVar2 = kq.this;
            fk fkVar = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar2, (ka) kq.setY(new Object[]{kqVar2}, 1474534669, -1474534668, (int) System.currentTimeMillis()), (setTextKeepState) kq.setY(new Object[]{kqVar2}, 28897039, -28897035, (int) System.currentTimeMillis()), ValueQualifier.setDividerPadding, setContentCaptureSession.setCompoundDrawableTintBlendMode}, -331699183, 331699193, System.identityHashCode(kwVar2));
            int i26 = f56823r0;
            int i27 = i26 & 71;
            int i28 = (i26 | 71) & (~i27);
            int i29 = -(-(i27 << 1));
            int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
            f56822q0 = i30 % 128;
            int i31 = i30 % 2;
            return fkVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ fk invoke() {
            return a(new Object[]{this}, 1211714490, -1211714489, System.identityHashCode(this));
        }
    }

    public /* synthetic */ class setOnFocusChangeListener {
        public static final /* synthetic */ int[] setDividerPadding;

        static {
            int[] iArr = new int[fd.valuesCustom().length];
            iArr[fd.ONLINE_REQUEST.ordinal()] = 1;
            iArr[fd.DECLINED.ordinal()] = 2;
            setDividerPadding = iArr;
            int i10 = 1 ^ 37;
            int i11 = ((1 & 37) | i10) << 1;
            int i12 = -i10;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            int i14 = i13 % 128;
            int i15 = i13 % 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq(@NotNull ka kaVar, @NotNull setTextKeepState settextkeepstate, @NotNull kw kwVar, @NotNull component10 component10Var, @NotNull setContentDescription setcontentdescription) {
        super(kaVar, settextkeepstate, kwVar);
        Intrinsics.checkNotNullParameter(kaVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(kwVar, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56820f = component10Var;
        this.f56821g = setcontentdescription;
    }

    public static final /* synthetic */ kw setCompoundDrawableTintBlendMode(kq kqVar) {
        return (kw) setY(new Object[]{kqVar}, 1683756539, -1683756536, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ ka setDividerPadding(kq kqVar) {
        return (ka) setY(new Object[]{kqVar}, 1474534669, -1474534668, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ setTextKeepState setX(kq kqVar) {
        return (setTextKeepState) setY(new Object[]{kqVar}, 28897039, -28897035, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        fk fkVar;
        int i13;
        int i14 = (~i10) | (~i12);
        int i15 = ((i10 | (~(i11 | i12))) * 519) + (((~(i14 | i11)) | (~(i10 | i11 | i12))) * (-519)) + (((~i14) | i11) * 519) + (i11 * (-518)) + (i10 * (-518));
        if (i15 == 1) {
            kq kqVar = (kq) objArr[0];
            int i16 = f56818h;
            int i17 = ((i16 | 73) << 1) - (i16 ^ 73);
            f56819i = i17 % 128;
            int i18 = i17 % 2;
            ka onFocusChangeListener = kqVar.setOnFocusChangeListener();
            if (i18 != 0) {
                return onFocusChangeListener;
            }
            throw null;
        }
        if (i15 != 2) {
            if (i15 == 3) {
                kq kqVar2 = (kq) objArr[0];
                int i19 = f56818h;
                int i20 = (i19 ^ 65) + ((i19 & 65) << 1);
                f56819i = i20 % 128;
                int i21 = i20 % 2;
                kw x4 = kqVar2.setX();
                int i22 = f56818h;
                int i23 = ((i22 & (-10)) | ((~i22) & 9)) + ((i22 & 9) << 1);
                f56819i = i23 % 128;
                int i24 = i23 % 2;
                return x4;
            }
            if (i15 == 4) {
                kq kqVar3 = (kq) objArr[0];
                int i25 = f56818h;
                int i26 = i25 & 125;
                int i27 = i26 + ((i25 ^ 125) | i26);
                f56819i = i27 % 128;
                if (i27 % 2 != 0) {
                    return kqVar3.setCompoundDrawableTintBlendMode();
                }
                kqVar3.setCompoundDrawableTintBlendMode();
                throw null;
            }
            kq kqVar4 = (kq) objArr[0];
            ka onFocusChangeListener2 = kqVar4.setOnFocusChangeListener();
            setContentDescription setcontentdescription = kqVar4.f56821g;
            kt ktVar = new kt(onFocusChangeListener2, setcontentdescription);
            kt.setDividerPadding(new Object[]{ktVar}, -1265802861, 1265802862, System.identityHashCode(ktVar));
            ko koVar = new ko(kqVar4.setOnFocusChangeListener(), kqVar4.new a());
            fk fkVar2 = (fk) ko.setY(new Object[]{koVar}, 349467792, -349467792, System.identityHashCode(koVar));
            if (fkVar2 != null) {
                int i28 = f56819i;
                int i29 = ((i28 & 92) + (i28 | 92)) - 1;
                f56818h = i29 % 128;
                int i30 = i29 % 2;
                int i31 = ((i28 & 55) - (~(i28 | 55))) - 1;
                f56818h = i31 % 128;
                if (i31 % 2 == 0) {
                    return fkVar2;
                }
                throw null;
            }
            kw x6 = kqVar4.setX();
            kw.setCompoundDrawableTintBlendMode(new Object[]{x6, kqVar4.setOnFocusChangeListener(), kqVar4.setCompoundDrawableTintBlendMode()}, 1615351699, -1615351690, System.identityHashCode(x6));
            kv kvVar = new kv(kqVar4.setOnFocusChangeListener(), kqVar4.f56820f, setcontentdescription);
            kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, 62941534, -62941533, System.identityHashCode(kvVar));
            ku kuVar = new ku(kqVar4.setOnFocusChangeListener());
            fk fkVar3 = (fk) setY(new Object[]{kqVar4, (fd) ku.setCompoundDrawableTintBlendMode(new Object[]{kuVar}, -1607349383, 1607349385, System.identityHashCode(kuVar))}, 958168713, -958168711, System.identityHashCode(kqVar4));
            int i32 = f56819i;
            int i33 = i32 & 47;
            int i34 = -(-((i32 ^ 47) | i33));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            f56818h = i35 % 128;
            int i36 = i35 % 2;
            return fkVar3;
        }
        kq kqVar5 = (kq) objArr[0];
        fd fdVar = (fd) objArr[1];
        int i37 = f56818h;
        int i38 = i37 & 87;
        int i39 = i38 + ((i37 ^ 87) | i38);
        f56819i = i39 % 128;
        int i40 = i39 % 2;
        ka onFocusChangeListener3 = kqVar5.setOnFocusChangeListener();
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener3}, -672536244, 672536278, System.identityHashCode(onFocusChangeListener3));
        ka onFocusChangeListener4 = kqVar5.setOnFocusChangeListener();
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener4, setAnimation.setPersistentDrawingCache()}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener4));
        if (getbeeponfailure != null) {
            int i41 = f56818h;
            int i42 = (i41 & (-62)) | (61 & (~i41));
            int i43 = (i41 & 61) << 1;
            int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
            f56819i = i44 % 128;
            int i45 = i44 % 2;
            int i46 = f56818h;
            int i47 = (i46 & 31) + (i46 | 31);
            f56819i = i47 % 128;
            int i48 = i47 % 2;
        }
        setSelector setselector = setSelector.NONE;
        ka onFocusChangeListener5 = kqVar5.setOnFocusChangeListener();
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener5, (TransactionFailed) setAnimation.setY(new Object[0], -967810516, 967810619, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener5));
        if (getbeeponfailure2 != null) {
            int i49 = f56819i;
            int i50 = i49 ^ 95;
            int i51 = (((i49 & 95) | i50) << 1) - i50;
            f56818h = i51 % 128;
            int i52 = i51 % 2;
            setselector = setSelector.BALANCE;
            int i53 = f56819i;
            int i54 = i53 & 43;
            int i55 = (i53 ^ 43) | i54;
            int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
            f56818h = i56 % 128;
            int i57 = i56 % 2;
        }
        int i58 = setOnFocusChangeListener.setDividerPadding[fdVar.ordinal()];
        if (i58 == 1) {
            kw x7 = kqVar5.setX();
            fkVar = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{x7, kqVar5.setOnFocusChangeListener(), kqVar5.setCompoundDrawableTintBlendMode(), activateSession.AUTHORISING_PLEASE_WAIT, fd.ONLINE_REQUEST, setselector, settransitionvisibility}, 1060517325, -1060517319, System.identityHashCode(x7));
            i13 = f56818h + 117;
        } else {
            if (i58 != 2) {
                throw new fh(23, fdVar.toString());
            }
            kw x10 = kqVar5.setX();
            ka onFocusChangeListener6 = kqVar5.setOnFocusChangeListener();
            setTextKeepState compoundDrawableTintBlendMode = kqVar5.setCompoundDrawableTintBlendMode();
            activateSession.Companion companion = activateSession.INSTANCE;
            fkVar = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{x10, onFocusChangeListener6, compoundDrawableTintBlendMode, (activateSession) activateSession.Companion.setCompoundDrawableTintBlendMode(new Object[0], -1920552587, 1920552589, (int) System.currentTimeMillis()), fd.DECLINED, setselector, settransitionvisibility}, 1060517325, -1060517319, System.identityHashCode(x10));
            int i59 = f56818h;
            int i60 = i59 ^ 75;
            i13 = (((i59 & 75) | i60) << 1) - i60;
        }
        f56819i = i13 % 128;
        int i61 = i13 % 2;
        return fkVar;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setY(new Object[]{this, continuation}, -824185757, 824185757, System.identityHashCode(this));
    }
}
