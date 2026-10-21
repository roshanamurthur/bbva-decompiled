package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0014B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/mypinpad/tsdk/i/mc;", "Lcom/mypinpad/tsdk/i/ez;", "Lcom/mypinpad/tsdk/i/fb;", "Lcom/mypinpad/tsdk/i/lq;", "Lcom/mypinpad/tsdk/i/ew;", "p0", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "p1", "Lcom/mypinpad/tsdk/i/activateSession;", "p2", "Lcom/mypinpad/tsdk/i/fd;", "p3", "", "p4", "Lcom/mypinpad/tsdk/i/setTransitionVisibility;", "p5", "Lcom/mypinpad/tsdk/i/fk;", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/lq;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/activateSession;Lcom/mypinpad/tsdk/i/fd;Lcom/mypinpad/tsdk/i/setTransitionVisibility;)Lcom/mypinpad/tsdk/i/fk;", "", "setY", "(Lcom/mypinpad/tsdk/i/lq;Lcom/mypinpad/tsdk/i/setTextKeepState;)V", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class mc extends ez implements ew<lq>, fb<lq> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f57074k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f57075l = 1;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.mc$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mc$setY;", "", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f57076a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f57077b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ byte[] setCompoundDrawableTintBlendMode() {
            return (byte[]) setX(new Object[0], -2146548641, 2146548644, (int) System.currentTimeMillis());
        }

        public static final /* synthetic */ byte[] setOnFocusChangeListener() {
            return (byte[]) setX(new Object[0], -1566706822, 1566706822, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = (((~((~i12) | i13)) | (~(i13 | i10))) * (-245)) + (i11 * 246) + (i10 * (-244));
            int i15 = ~(i13 | i12);
            int i16 = ((i15 | i10) * 245) + (i15 * (-245)) + i14;
            if (i16 == 1) {
                int i17 = f57076a;
                int i18 = ((i17 ^ 110) + ((i17 & 110) << 1)) - 1;
                f57077b = i18 % 128;
                if (i18 % 2 != 0) {
                    return new byte[]{0, 0, 3};
                }
                byte[] bArr = {0, 0};
                bArr[1] = 1;
                bArr[4] = 3;
                return bArr;
            }
            if (i16 == 2) {
                int i19 = f57077b + 1;
                int i20 = i19 % 128;
                f57076a = i20;
                int i21 = i19 % 2;
                byte[] bArr2 = {0, 0, 0};
                int i22 = i20 + 109;
                f57077b = i22 % 128;
                int i23 = i22 % 2;
                return bArr2;
            }
            if (i16 != 3) {
                int i24 = ((-1) << 1) - ((f57076a + 74) ^ (-1));
                f57077b = i24 % 128;
                int i25 = i24 % 2;
                byte[] bArr3 = (byte[]) setX(new Object[0], -163777439, 163777441, (int) System.currentTimeMillis());
                int i26 = f57076a;
                int i27 = (i26 ^ 49) + ((i26 & 49) << 1);
                f57077b = i27 % 128;
                int i28 = i27 % 2;
                return bArr3;
            }
            int i29 = f57077b;
            int i30 = (i29 | 57) << 1;
            int i31 = -(((~i29) & 57) | (i29 & (-58)));
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            f57076a = i32 % 128;
            int i33 = i32 % 2;
            byte[] bArr4 = (byte[]) setX(new Object[0], -860013008, 860013009, (int) System.currentTimeMillis());
            int i34 = f57077b;
            int i35 = i34 & 59;
            int i36 = ((i34 | 59) & (~i35)) + (i35 << 1);
            f57076a = i36 % 128;
            if (i36 % 2 == 0) {
                return bArr4;
            }
            int i37 = 49 / 0;
            return bArr4;
        }
    }

    static {
        int i10 = ((-1) << 1) - ((f57075l + 106) ^ (-1));
        f57074k = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 45 / 0;
        }
    }

    public static /* synthetic */ fk b(Object[] objArr) {
        mc mcVar = (mc) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        int i10 = f57075l;
        int i11 = i10 & 83;
        int i12 = ((((i10 ^ 83) | i11) << 1) - (~(-((i10 | 83) & (~i11))))) - 1;
        f57074k = i12 % 128;
        lq lqVar = (lq) setscrollbardefaultdelaybeforefade;
        if (i12 % 2 != 0) {
            throw null;
        }
        fk fkVar = (fk) setCompoundDrawableTintBlendMode(new Object[]{mcVar, lqVar, settextkeepstate}, 1609617138, -1609617126, System.identityHashCode(mcVar));
        int i13 = f57075l + 113;
        f57074k = i13 % 128;
        int i14 = i13 % 2;
        return fkVar;
    }

    public static /* synthetic */ fk c(Object[] objArr) {
        mc mcVar = (mc) objArr[0];
        lq lqVar = (lq) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        byte[] bArr = (byte[]) objArr[3];
        int i10 = f57075l;
        int i11 = i10 ^ 89;
        int i12 = ((i10 & 89) | i11) << 1;
        int i13 = -i11;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f57074k = i14 % 128;
        if (i14 % 2 == 0) {
            Intrinsics.checkNotNullParameter(lqVar, "");
            Intrinsics.checkNotNullParameter(settextkeepstate, "");
            Intrinsics.checkNotNullParameter(bArr, "");
            return (fk) setCompoundDrawableTintBlendMode(new Object[]{mcVar, lqVar, settextkeepstate, ValueQualifier.setY, setContentCaptureSession.setLayoutAnimation}, -53505243, 53505243, System.identityHashCode(mcVar));
        }
        Intrinsics.checkNotNullParameter(lqVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        throw null;
    }

    public static /* synthetic */ fk d(Object[] objArr) {
        mc mcVar = (mc) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        int i10 = (-2) - ((f57074k + 116) ^ (-1));
        f57075l = i10 % 128;
        int i11 = i10 % 2;
        fk fkVar = (fk) setCompoundDrawableTintBlendMode(new Object[]{mcVar, (lq) setscrollbardefaultdelaybeforefade, settextkeepstate}, 1078421888, -1078421874, System.identityHashCode(mcVar));
        int i12 = f57074k;
        int i13 = i12 & 111;
        int i14 = i13 + ((i12 ^ 111) | i13);
        f57075l = i14 % 128;
        if (i14 % 2 != 0) {
            return fkVar;
        }
        throw null;
    }

    public static /* synthetic */ fk e(Object[] objArr) {
        mc mcVar = (mc) objArr[0];
        lq lqVar = (lq) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        int i10 = f57075l;
        int i11 = ((i10 & 6) + (i10 | 6)) - 1;
        f57074k = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(lqVar, "");
            Intrinsics.checkNotNullParameter(settextkeepstate, "");
            return (fk) setCompoundDrawableTintBlendMode(new Object[]{mcVar, lqVar, settextkeepstate, ValueQualifier.setY, setContentCaptureSession.setOnLongClickListener}, -53505243, 53505243, System.identityHashCode(mcVar));
        }
        Intrinsics.checkNotNullParameter(lqVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        throw null;
    }

    public static /* synthetic */ fk f(Object[] objArr) {
        mc mcVar = (mc) objArr[0];
        lq lqVar = (lq) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        Intrinsics.checkNotNullParameter(lqVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        f fVar = new f(ez.setY.setX(), setItemChecked.setX, ez.setY.setOnLongClickListener(), ez.setY.setLayoutAnimation(), ez.setY.setOnFocusChangeListener());
        fk onFocusChangeListener = ez.setOnFocusChangeListener(mcVar, lqVar, settextkeepstate, null, ez.setY(fd.TRY_AGAIN, getY.setOnFocusChangeListener, Boolean.TRUE, null, null, null, null, null, 192), ez.setY(lqVar, activateSession.PRESENT_CARD_AGAIN, ValueQualifier.setOnFocusChangeListener, (byte[]) Companion.setX(new Object[0], -1566706822, 1566706822, (int) System.currentTimeMillis())), fVar);
        int i10 = f57074k + 109;
        f57075l = i10 % 128;
        if (i10 % 2 != 0) {
            return onFocusChangeListener;
        }
        throw null;
    }

    public static /* synthetic */ fk g(Object[] objArr) {
        mc mcVar = (mc) objArr[0];
        activateSession activatesession = (activateSession) objArr[1];
        fd fdVar = (fd) objArr[2];
        lq lqVar = (lq) objArr[3];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[4];
        ValueQualifier valueQualifier = (ValueQualifier) objArr[5];
        getY gety = (getY) objArr[6];
        byte[] bArr = (byte[]) objArr[7];
        f fVar = new f(activatesession, ez.setY.setNavigationOnClickListener(), (setContentCaptureSession) objArr[8], ez.setY.setLayoutAnimation(), bArr);
        fk onFocusChangeListener = ez.setOnFocusChangeListener(mcVar, lqVar, settextkeepstate, null, ez.setY(fdVar, gety, Boolean.TRUE, null, null, null, null, null, 192), ez.setY(lqVar, activatesession, valueQualifier, (byte[]) Companion.setX(new Object[0], -1566706822, 1566706822, (int) System.currentTimeMillis())), fVar);
        int i10 = f57074k;
        int i11 = i10 ^ 101;
        int i12 = ((((i10 & 101) | i11) << 1) - (~(-i11))) - 1;
        f57075l = i12 % 128;
        if (i12 % 2 != 0) {
            return onFocusChangeListener;
        }
        throw null;
    }

    public static /* synthetic */ fk h(Object[] objArr) {
        mc mcVar = (mc) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        byte[] bArr = (byte[]) objArr[3];
        int i10 = f57074k;
        int i11 = ((i10 & 120) + (i10 | 120)) - 1;
        f57075l = i11 % 128;
        int i12 = i11 % 2;
        fk fkVar = (fk) setCompoundDrawableTintBlendMode(new Object[]{mcVar, (lq) setscrollbardefaultdelaybeforefade, settextkeepstate, bArr}, -1782843661, 1782843674, System.identityHashCode(mcVar));
        int i13 = f57075l;
        int i14 = ((i13 | 45) << 1) - (i13 ^ 45);
        f57074k = i14 % 128;
        if (i14 % 2 == 0) {
            return fkVar;
        }
        throw null;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Exception {
        fk onFocusChangeListener;
        switch ((((~(i10 | i12)) | (~i11)) * 529) + (((~((~i12) | i10)) | (~(i10 | i11))) * 529) + (i11 * 530) + (i10 * 530) + 1058) {
            case 1:
                onFocusChangeListener = null;
                mc mcVar = (mc) objArr[0];
                lq lqVar = (lq) objArr[1];
                setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
                int i13 = f57075l;
                int i14 = i13 ^ 95;
                int i15 = ((i13 & 95) | i14) << 1;
                int i16 = -i14;
                int i17 = (i15 & i16) + (i15 | i16);
                f57074k = i17 % 128;
                int i18 = i17 % 2;
                Intrinsics.checkNotNullParameter(lqVar, "");
                Intrinsics.checkNotNullParameter(settextkeepstate, "");
                ez.setX(lqVar, settextkeepstate, activateSession.CLEAR_DISPLAY, ValueQualifier.setCompoundDrawableTintBlendMode, (byte[]) Companion.setX(new Object[0], -2146548641, 2146548644, (int) System.currentTimeMillis()), null);
                System.identityHashCode(mcVar);
                System.identityHashCode(mcVar);
                break;
            case 2:
                return c(objArr);
            case 3:
                return h(objArr);
            case 4:
                return g(objArr);
            case 5:
                mc mcVar2 = (mc) objArr[0];
                lq lqVar2 = (lq) objArr[1];
                setTextKeepState settextkeepstate2 = (setTextKeepState) objArr[2];
                int i19 = f57074k;
                int i20 = i19 & 43;
                int i21 = ((((i19 ^ 43) | i20) << 1) - (~(-((i19 | 43) & (~i20))))) - 1;
                f57075l = i21 % 128;
                int i22 = i21 % 2;
                Intrinsics.checkNotNullParameter(lqVar2, "");
                Intrinsics.checkNotNullParameter(settextkeepstate2, "");
                onFocusChangeListener = (fk) setCompoundDrawableTintBlendMode(new Object[]{mcVar2, lqVar2, settextkeepstate2, ValueQualifier.setY, setContentCaptureSession.setNavigationOnClickListener}, -53505243, 53505243, System.identityHashCode(mcVar2));
                int i23 = f57074k;
                int i24 = i23 & 35;
                int i25 = ((i23 ^ 35) | i24) << 1;
                int i26 = -((i23 | 35) & (~i24));
                int i27 = (i25 & i26) + (i26 | i25);
                f57075l = i27 % 128;
                int i28 = i27 % 2;
                break;
            case 6:
                mc mcVar3 = (mc) objArr[0];
                lq lqVar3 = (lq) objArr[1];
                setTextKeepState settextkeepstate3 = (setTextKeepState) objArr[2];
                Intrinsics.checkNotNullParameter(lqVar3, "");
                Intrinsics.checkNotNullParameter(settextkeepstate3, "");
                fk onFocusChangeListener2 = ez.setOnFocusChangeListener(mcVar3, lqVar3, settextkeepstate3, null, ez.setY(fd.END_APPLICATION, getY.setNavigationOnClickListener, Boolean.TRUE, null, null, null, null, null, 192), null, new f(activateSession.N_A, ez.setY.setNavigationOnClickListener(), ez.setY.setOnLongClickListener(), setDrawSelectorOnTop.setOnFocusChangeListener, ez.setY.setOnFocusChangeListener()));
                int i29 = f57075l + 89;
                f57074k = i29 % 128;
                int i30 = i29 % 2;
                return onFocusChangeListener2;
            case 7:
                mc mcVar4 = (mc) objArr[0];
                lq lqVar4 = (lq) objArr[1];
                setTextKeepState settextkeepstate4 = (setTextKeepState) objArr[2];
                activateSession activatesession = (activateSession) objArr[3];
                fd fdVar = (fd) objArr[4];
                setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[5];
                Intrinsics.checkNotNullParameter(lqVar4, "");
                Intrinsics.checkNotNullParameter(settextkeepstate4, "");
                Intrinsics.checkNotNullParameter(activatesession, "");
                Intrinsics.checkNotNullParameter(fdVar, "");
                Intrinsics.checkNotNullParameter(settransitionvisibility, "");
                f fVar = new f(ez.setY.setOnDragListener(), ez.setY.setNavigationOnClickListener(), ez.setY.setOnLongClickListener(), ez.setY.setLayoutAnimation(), ez.setY.setOnFocusChangeListener());
                l y7 = ez.setY(lqVar4, activatesession, ValueQualifier.setCompoundDrawableTintBlendMode, (byte[]) Companion.setX(new Object[0], -1566706822, 1566706822, (int) System.currentTimeMillis()));
                j y10 = ez.setY(fdVar, (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis()), Boolean.TRUE, Boolean.FALSE, null, settransitionvisibility, null, null, 192);
                ey eyVar = ey.INSTANCE;
                onFocusChangeListener = ez.setOnFocusChangeListener(mcVar4, lqVar4, settextkeepstate4, (getBeepOnFailure) ey.setY(new Object[]{lqVar4}, 1660534021, -1660534020, (int) System.currentTimeMillis()), y10, y7, fVar);
                int i31 = f57075l;
                int i32 = (i31 & (-122)) | ((~i31) & 121);
                int i33 = -(-((i31 & 121) << 1));
                int i34 = (i32 & i33) + (i33 | i32);
                f57074k = i34 % 128;
                int i35 = i34 % 2;
                break;
            case 8:
                return f(objArr);
            case 9:
                return d(objArr);
            case 10:
                return b(objArr);
            case 11:
                mc mcVar5 = (mc) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate5 = (setTextKeepState) objArr[2];
                byte[] bArr = (byte[]) objArr[3];
                int i36 = f57074k;
                int i37 = i36 & 79;
                int i38 = (i36 | 79) & (~i37);
                int i39 = -(-(i37 << 1));
                int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
                f57075l = i40 % 128;
                int i41 = i40 % 2;
                onFocusChangeListener = (fk) setCompoundDrawableTintBlendMode(new Object[]{mcVar5, (lq) setscrollbardefaultdelaybeforefade, settextkeepstate5, bArr}, -114681819, 114681821, System.identityHashCode(mcVar5));
                int i42 = f57075l;
                int i43 = i42 | 81;
                int i44 = i43 << 1;
                int i45 = -((~(i42 & 81)) & i43);
                int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                f57074k = i46 % 128;
                int i47 = i46 % 2;
                break;
            case 12:
                return e(objArr);
            case 13:
                mc mcVar6 = (mc) objArr[0];
                lq lqVar5 = (lq) objArr[1];
                setTextKeepState settextkeepstate6 = (setTextKeepState) objArr[2];
                byte[] bArr2 = (byte[]) objArr[3];
                int i48 = f57075l + 53;
                f57074k = i48 % 128;
                if (i48 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(lqVar5, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate6, "");
                    Intrinsics.checkNotNullParameter(bArr2, "");
                    return (fk) setCompoundDrawableTintBlendMode(new Object[]{mcVar6, (activateSession) ez.setY.setX(new Object[0], -750761700, 750761703, (int) System.currentTimeMillis()), fd.SELECT_NEXT, lqVar5, settextkeepstate6, (ValueQualifier) ez.setY.setX(new Object[0], -160680657, 160680667, (int) System.currentTimeMillis()), getY.setCompoundDrawableTintBlendMode, bArr2, setContentCaptureSession.setLayoutAnimation}, 942783519, -942783515, System.identityHashCode(mcVar6));
                }
                Intrinsics.checkNotNullParameter(lqVar5, "");
                Intrinsics.checkNotNullParameter(settextkeepstate6, "");
                Intrinsics.checkNotNullParameter(bArr2, "");
                throw null;
            case 14:
                mc mcVar7 = (mc) objArr[0];
                lq lqVar6 = (lq) objArr[1];
                setTextKeepState settextkeepstate7 = (setTextKeepState) objArr[2];
                int i49 = f57074k;
                int i50 = (((i49 | 90) << 1) - (i49 ^ 90)) - 1;
                f57075l = i50 % 128;
                if (i50 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(lqVar6, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate7, "");
                    return (fk) setCompoundDrawableTintBlendMode(new Object[]{mcVar7, lqVar6, settextkeepstate7, ValueQualifier.setY, setContentCaptureSession.setOnFocusChangeListener}, -53505243, 53505243, System.identityHashCode(mcVar7));
                }
                Intrinsics.checkNotNullParameter(lqVar6, "");
                Intrinsics.checkNotNullParameter(settextkeepstate7, "");
                throw null;
            case 15:
                mc mcVar8 = (mc) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate8 = (setTextKeepState) objArr[2];
                int i51 = f57074k;
                int i52 = i51 ^ 103;
                int i53 = (((i51 & 103) | i52) << 1) - i52;
                f57075l = i53 % 128;
                if (i53 % 2 != 0) {
                    return (fk) setCompoundDrawableTintBlendMode(new Object[]{mcVar8, (lq) setscrollbardefaultdelaybeforefade2, settextkeepstate8}, 1635713385, -1635713379, System.identityHashCode(mcVar8));
                }
                throw null;
            case 16:
                mc mcVar9 = (mc) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade3 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate9 = (setTextKeepState) objArr[2];
                int i54 = f57074k;
                int i55 = (((i54 ^ 17) | (i54 & 17)) << 1) - (((~i54) & 17) | (i54 & (-18)));
                f57075l = i55 % 128;
                lq lqVar7 = (lq) setscrollbardefaultdelaybeforefade3;
                if (i55 % 2 == 0) {
                    throw null;
                }
                onFocusChangeListener = (fk) setCompoundDrawableTintBlendMode(new Object[]{mcVar9, lqVar7, settextkeepstate9}, -87141997, 87142005, System.identityHashCode(mcVar9));
                int i56 = f57074k;
                int i57 = (i56 ^ 65) + ((i56 & 65) << 1);
                f57075l = i57 % 128;
                if (i57 % 2 == 0) {
                    int i58 = 79 / 0;
                }
                break;
                break;
            case 17:
                mc mcVar10 = (mc) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade4 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate10 = (setTextKeepState) objArr[2];
                int i59 = f57074k;
                int i60 = i59 & 105;
                int i61 = (i59 ^ 105) | i60;
                int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                f57075l = i62 % 128;
                int i63 = i62 % 2;
                fk fkVar = (fk) setCompoundDrawableTintBlendMode(new Object[]{mcVar10, (lq) setscrollbardefaultdelaybeforefade4, settextkeepstate10}, 307279250, -307279245, System.identityHashCode(mcVar10));
                int i64 = f57075l + 125;
                f57074k = i64 % 128;
                int i65 = i64 % 2;
                return fkVar;
            default:
                mc mcVar11 = (mc) objArr[0];
                lq lqVar8 = (lq) objArr[1];
                setTextKeepState settextkeepstate11 = (setTextKeepState) objArr[2];
                ValueQualifier valueQualifier = (ValueQualifier) objArr[3];
                setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[4];
                int i66 = f57075l;
                int i67 = (i66 & 101) + (i66 | 101);
                f57074k = i67 % 128;
                int i68 = i67 % 2;
                Intrinsics.checkNotNullParameter(lqVar8, "");
                Intrinsics.checkNotNullParameter(settextkeepstate11, "");
                Intrinsics.checkNotNullParameter(valueQualifier, "");
                Intrinsics.checkNotNullParameter(setcontentcapturesession, "");
                fk fkVar2 = (fk) setCompoundDrawableTintBlendMode(new Object[]{mcVar11, activateSession.ERROR_OTHER_CARD, fd.END_APPLICATION, lqVar8, settextkeepstate11, valueQualifier, (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis()), (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis()), setcontentcapturesession}, 942783519, -942783515, System.identityHashCode(mcVar11));
                int i69 = f57074k + 29;
                f57075l = i69 % 128;
                int i70 = i69 % 2;
                return fkVar2;
        }
        return onFocusChangeListener;
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk a_(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -1787573881, 1787573890, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk b_(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -576112684, 576112694, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk setDividerPadding(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -1940080328, 1940080345, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.fb
    public final /* synthetic */ fk setOnFocusChangeListener(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -1129268892, 1129268907, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk setY(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate, byte[] bArr) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate, bArr}, 1315971368, -1315971357, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk setDividerPadding(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate, byte[] bArr) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate, bArr}, -254650324, 254650327, System.identityHashCode(this));
    }

    public final void setY(@NotNull lq p4, @NotNull setTextKeepState p10) throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this, p4, p10}, 341676927, -341676926, System.identityHashCode(this));
    }

    @NotNull
    public final fk setDividerPadding(@NotNull lq lqVar, @NotNull setTextKeepState settextkeepstate, @NotNull activateSession activatesession, @NotNull fd fdVar, @NotNull setTransitionVisibility settransitionvisibility) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, lqVar, settextkeepstate, activatesession, fdVar, settransitionvisibility}, 892756200, -892756193, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.fb
    public final /* synthetic */ fk setCompoundDrawableTintBlendMode(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -614746241, 614746257, System.identityHashCode(this));
    }
}
