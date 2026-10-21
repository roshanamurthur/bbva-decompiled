package com.mypinpad.tsdk.isolation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class hx extends hi {
    public static int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f56280n = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final getValue f56281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final gz f56282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final io f56283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final et f56284l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f56285p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56286q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56287r0 = 1;

        static {
            int i10 = f56286q0;
            int i11 = i10 & 83;
            int i12 = (i10 | 83) & (~i11);
            int i13 = -(-(i11 << 1));
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            f56287r0 = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            Unit unit;
            int i13 = ~i10;
            int i14 = (~((~i11) | i13)) | i12;
            int i15 = ~(i10 | i11);
            if (((i11 | (~(i12 | i13))) * 376) + (((~(i10 | (~i12))) | i15) * (-376)) + ((i14 | i15) * 376) + (i11 * (-375)) + (i10 * (-375)) != 1) {
                cv cvVar = (cv) objArr[1];
                int i16 = f56287r0;
                int i17 = i16 & 53;
                int i18 = (i16 | 53) & (~i17);
                int i19 = i17 << 1;
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                f56286q0 = i20 % 128;
                int i21 = i20 % 2;
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -2106531481, 2106531485, System.identityHashCode(cvVar));
                int i22 = f56287r0;
                int i23 = ((i22 & (-56)) | ((~i22) & 55)) + ((i22 & 55) << 1);
                f56286q0 = i23 % 128;
                int i24 = i23 % 2;
                return null;
            }
            a aVar = (a) objArr[0];
            Object obj = objArr[1];
            int i25 = (-2) - ((f56287r0 + 80) ^ (-1));
            f56286q0 = i25 % 128;
            cv cvVar2 = (cv) obj;
            if (i25 % 2 != 0) {
                a(new Object[]{aVar, cvVar2}, -843718231, 843718231, System.identityHashCode(aVar));
                unit = Unit.INSTANCE;
                int i26 = 55 / 0;
            } else {
                a(new Object[]{aVar, cvVar2}, -843718231, 843718231, System.identityHashCode(aVar));
                unit = Unit.INSTANCE;
            }
            int i27 = f56286q0;
            int i28 = i27 ^ 109;
            int i29 = (((i27 & 109) | i28) << 1) - i28;
            f56287r0 = i29 % 128;
            if (i29 % 2 != 0) {
                return unit;
            }
            int i30 = 84 / 0;
            return unit;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, -1029339222, 1029339223, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f56288p0 = new b();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56289q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56290r0 = 1;

        static {
            int i10 = f56289q0;
            int i11 = i10 & 55;
            int i12 = (i11 - (~((i10 ^ 55) | i11))) - 1;
            f56290r0 = i12 % 128;
            int i13 = i12 % 2;
        }

        public b() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = i13 | i14;
            int i16 = ((~i15) * 497) + (i11 * (-496)) + (i10 * (-496));
            int i17 = ~(i15 | i12);
            int i18 = ~i12;
            if ((((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i18 | i13))) * 497) + ((i17 | (~(i14 | i18 | i10))) * 497) + i16 == 1) {
                cv cvVar = (cv) objArr[1];
                int i19 = f56289q0;
                int i20 = (i19 & 61) + (i19 | 61);
                f56290r0 = i20 % 128;
                if (i20 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(cvVar, "");
                    cv.setDividerPadding(new Object[]{cvVar, Boolean.FALSE}, -2106531481, 2106531485, System.identityHashCode(cvVar));
                } else {
                    Intrinsics.checkNotNullParameter(cvVar, "");
                    cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -2106531481, 2106531485, System.identityHashCode(cvVar));
                }
                return null;
            }
            b bVar = (b) objArr[0];
            Object obj = objArr[1];
            int i21 = f56289q0;
            int i22 = (i21 | 105) << 1;
            int i23 = -(((~i21) & 105) | (i21 & (-106)));
            int i24 = (i22 & i23) + (i23 | i22);
            f56290r0 = i24 % 128;
            int i25 = i24 % 2;
            a(new Object[]{bVar, (cv) obj}, -484684765, 484684766, System.identityHashCode(bVar));
            Unit unit = Unit.INSTANCE;
            int i26 = f56290r0;
            int i27 = i26 & 85;
            int i28 = -(-(i26 | 85));
            int i29 = (i27 & i28) + (i28 | i27);
            f56289q0 = i29 % 128;
            int i30 = i29 % 2;
            return unit;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, 866360043, -866360043, System.identityHashCode(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull ex exVar, @NotNull getValue getvalue, @NotNull gz gzVar, @NotNull io ioVar, @NotNull et etVar) {
        super(gvVar, settextkeepstate, exVar, getvalue);
        Intrinsics.checkNotNullParameter(gvVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(exVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(gzVar, "");
        Intrinsics.checkNotNullParameter(ioVar, "");
        Intrinsics.checkNotNullParameter(etVar, "");
        this.f56281i = getvalue;
        this.f56282j = gzVar;
        this.f56283k = ioVar;
        this.f56284l = etVar;
    }

    public static /* synthetic */ fk a(Object[] objArr) throws Exception {
        hx hxVar = (hx) objArr[0];
        gv gvVar = (gv) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        int i10 = m;
        int i11 = (i10 ^ 97) + ((i10 & 97) << 1);
        f56280n = i11 % 128;
        int i12 = i11 % 2;
        et etVar = hxVar.f56284l;
        et.setDividerPadding(new Object[]{gvVar}, 338249870, -338249868, (int) System.currentTimeMillis());
        ex x4 = hxVar.setX();
        activateSession activatesession = activateSession.ERROR_OTHER_CARD;
        fk dividerPadding = ex.setDividerPadding(x4, gvVar, settextkeepstate, activatesession, ValueQualifier.setY, null, fd.END_APPLICATION, null, Boolean.TRUE, activatesession, null, null, setContentCaptureSession.setNavigationOnClickListener, null, null, null, null, null, null, false, false, 4191824);
        int i13 = m;
        int i14 = i13 & 43;
        int i15 = -(-(i13 | 43));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f56280n = i16 % 128;
        if (i16 % 2 != 0) {
            return dividerPadding;
        }
        throw null;
    }

    public static /* synthetic */ void b(Object[] objArr) {
        int i10;
        List list = (List) objArr[0];
        gv gvVar = (gv) objArr[1];
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i11 = f56280n;
        int i12 = ((i11 ^ 33) | (i11 & 33)) << 1;
        int i13 = -(((~i11) & 33) | (i11 & (-34)));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        m = i14 % 128;
        int i15 = i14 % 2;
        while (!(!it.hasNext())) {
            int i16 = m;
            int i17 = i16 ^ 91;
            int i18 = ((i16 & 91) | i17) << 1;
            int i19 = -i17;
            int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
            f56280n = i20 % 128;
            int i21 = i20 % 2;
            Object next = it.next();
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) next;
            setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
            setAnimation setanimation = setAnimation.INSTANCE;
            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -154084724, 154084974, (int) System.currentTimeMillis());
            if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                int i22 = m + 123;
                f56280n = i22 % 128;
                int i23 = i22 % 2;
                arrayList.add(next);
                int i24 = m;
                int i25 = i24 & 87;
                int i26 = (i24 | 87) & (~i25);
                int i27 = -(-(i25 << 1));
                int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                f56280n = i28 % 128;
                int i29 = i28 % 2;
            }
        }
        if (!(!arrayList.isEmpty())) {
            i10 = (-2) - ((m + 56) ^ (-1));
            f56280n = i10 % 128;
        } else {
            System.currentTimeMillis();
            System.currentTimeMillis();
            int i30 = f56280n;
            int i31 = i30 & 111;
            int i32 = (i30 ^ 111) | i31;
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            m = i33 % 128;
            int i34 = i33 % 2;
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
            getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) CollectionsKt___CollectionsKt.first((List) arrayList);
            setMaxWidth setmaxwidth = (setMaxWidth) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2)), 0}, 896036021, -896036014, 0);
            v vVar = new v(gvVar);
            i10 = f56280n + 5;
            m = i10 % 128;
        }
        int i35 = i10 % 2;
        int i36 = m;
        int i37 = (i36 & (-18)) | ((~i36) & 17);
        int i38 = (i36 & 17) << 1;
        int i39 = (i37 & i38) + (i38 | i37);
        f56280n = i39 % 128;
        if (i39 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ fk c(Object[] objArr) {
        byte b10 = 0;
        hx hxVar = (hx) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        int i10 = f56280n;
        int i11 = ((i10 ^ 21) | (i10 & 21)) << 1;
        int i12 = -(((~i10) & 21) | (i10 & (-22)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        m = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(setrotationx, "");
        et etVar = hxVar.f56284l;
        ex x4 = hxVar.setX();
        gv onFocusChangeListener = hxVar.setOnFocusChangeListener();
        setTextKeepState compoundDrawableTintBlendMode = hxVar.setCompoundDrawableTintBlendMode();
        activateSession activatesession = activateSession.PRESENT_CARD_AGAIN;
        ValueQualifier valueQualifier = ValueQualifier.setOnFocusChangeListener;
        byte[] bArr = new byte[3];
        int i15 = m + 21;
        f56280n = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 0;
        for (int i18 = 3; i17 < i18; i18 = 3) {
            int i19 = m;
            int i20 = i19 & 121;
            int i21 = (i19 ^ 121) | i20;
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f56280n = i22 % 128;
            int i23 = i22 % 2;
            bArr[i17] = b10;
            int iIdentityHashCode = System.identityHashCode(hxVar);
            int i24 = i17 * (-103);
            int i25 = ((~i24) & (-103)) | (i24 & 102);
            int i26 = (i24 & (-103)) << 1;
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            int i28 = ~i17;
            int i29 = ((-2) & (~i28)) | (i28 & 1);
            int i30 = (-2) & i28;
            int i31 = ~((i29 ^ i30) | (i29 & i30));
            int i32 = i28 & iIdentityHashCode;
            int i33 = (~i32) & (i28 | iIdentityHashCode);
            int i34 = (i33 & i32) | (i33 ^ i32);
            int i35 = ~i34;
            int i36 = (i34 | i35) & i35;
            int i37 = (i27 - (~(((i36 & i31) | (i31 ^ i36)) * 104))) - 1;
            int i38 = (~iIdentityHashCode) | 1;
            int i39 = i38 & i17;
            int i40 = (i38 | i17) & (~i39);
            int i41 = -(-((~((i40 & i39) | (i40 ^ i39))) * (-104)));
            int i42 = ((((~i41) & i37) | ((~i37) & i41)) - (~((i41 & i37) << 1))) - 1;
            int i43 = ((iIdentityHashCode ^ 1) | (iIdentityHashCode & 1)) * 104;
            int i44 = i42 & i43;
            i17 = ((i43 | i42) & (~i44)) + (i44 << 1);
            int i45 = f56280n;
            int i46 = ((i45 ^ 122) + ((i45 & 122) << 1)) - 1;
            m = i46 % 128;
            int i47 = i46 % 2;
            b10 = 0;
        }
        fk dividerPadding = ex.setDividerPadding(x4, onFocusChangeListener, compoundDrawableTintBlendMode, activatesession, valueQualifier, bArr, fd.END_APPLICATION, getY.setOnFocusChangeListener, Boolean.FALSE, activateSession.PRESENT_CARD_AGAIN, (setItemChecked) setRotationX.setX(new Object[]{setrotationx}, 2020716727, -2020716721, System.identityHashCode(setrotationx)), null, null, null, null, null, null, null, null, false, false, 4193280);
        int i48 = m;
        int i49 = (i48 | 11) << 1;
        int i50 = -(((~i48) & 11) | (i48 & (-12)));
        int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
        f56280n = i51 % 128;
        if (i51 % 2 != 0) {
            return dividerPadding;
        }
        throw null;
    }

    public static /* synthetic */ Boolean d(Object[] objArr) {
        byte bByteValue = ((Byte) objArr[0]).byteValue();
        setRotationX setrotationx = (setRotationX) objArr[1];
        gv gvVar = (gv) objArr[2];
        int i10 = m;
        int i11 = i10 & 123;
        int i12 = i10 | 123;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f56280n = i13 % 128;
        if (i13 % 2 != 0 ? bByteValue > 10 : bByteValue > 95) {
            int i14 = ((i10 ^ 29) - (~(-(-((i10 & 29) << 1))))) - 1;
            f56280n = i14 % 128;
            if (i14 % 2 != 0) {
                return Boolean.TRUE;
            }
            int i15 = 89 / 0;
            return Boolean.TRUE;
        }
        if (((byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx))).length == 0) {
            int i16 = f56280n;
            int i17 = ((i16 | 65) << 1) - ((i16 & (-66)) | ((~i16) & 65));
            m = i17 % 128;
            boolean z10 = i17 % 2 == 0;
            int i18 = i16 ^ 33;
            int i19 = (((i16 & 33) | i18) << 1) - i18;
            int i20 = i19 % 128;
            m = i20;
            int i21 = i19 % 2;
            if (z10) {
                int i22 = (((i20 ^ 95) | (i20 & 95)) << 1) - ((i20 & (-96)) | ((~i20) & 95));
                f56280n = i22 % 128;
                int i23 = i22 % 2;
            }
            int i24 = m;
            int i25 = i24 & 91;
            int i26 = (i24 | 91) & (~i25);
            int i27 = -(-(i25 << 1));
            int i28 = (i26 & i27) + (i26 | i27);
            f56280n = i28 % 128;
            int i29 = i28 % 2;
            return Boolean.FALSE;
        }
        int i30 = f56280n;
        int i31 = (i30 & (-120)) | ((~i30) & 119);
        int i32 = (i30 & 119) << 1;
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        m = i33 % 128;
        int i34 = i33 % 2;
        int i35 = m;
        int i36 = i35 & 13;
        int i37 = ((i35 ^ 13) | i36) << 1;
        int i38 = -((i35 | 13) & (~i36));
        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
        int i40 = i39 % 128;
        f56280n = i40;
        int i41 = i39 % 2;
        int i42 = (((i40 | 45) << 1) - (~(-(((~i40) & 45) | (i40 & (-46)))))) - 1;
        int i43 = i42 % 128;
        m = i43;
        int i44 = i42 % 2;
        int i45 = ((i43 ^ 63) - (~((i43 & 63) << 1))) - 1;
        f56280n = i45 % 128;
        int i46 = i45 % 2;
        if (((byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)))[0] == 112) {
            int i47 = m;
            int i48 = ((i47 | 104) << 1) - (i47 ^ 104);
            int i49 = (i48 ^ (-1)) + (i48 << 1);
            f56280n = i49 % 128;
            int i50 = i49 % 2;
            boolean zBooleanValue = ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)), TerminalCreationFailure.setY}, -1215492211, 1215492218, System.identityHashCode(gvVar))).booleanValue();
            int i51 = m;
            int i52 = ((i51 ^ 61) | (i51 & 61)) << 1;
            int i53 = -(((~i51) & 61) | (i51 & (-62)));
            int i54 = (i52 & i53) + (i53 | i52);
            f56280n = i54 % 128;
            int i55 = i54 % 2;
            return Boolean.valueOf(zBooleanValue);
        }
        int i210 = m;
        int i211 = i210 & 91;
        int i212 = (i210 | 91) & (~i211);
        int i213 = -(-(i211 << 1));
        int i214 = (i212 & i213) + (i212 | i213);
        f56280n = i214 % 128;
        int i215 = i214 % 2;
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0076 A[PHI: r3
      0x0076: PHI (r3v65 com.mypinpad.tsdk.i.getBeepOnFailure) = (r3v8 com.mypinpad.tsdk.i.getBeepOnFailure), (r3v82 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:8:0x0061, B:5:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x008c  */
    /* JADX WARN: Code duplicated, block: B:14:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x025e  */
    /* JADX WARN: Code duplicated, block: B:62:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:9:0x0063  */
    public static /* synthetic */ setSupportBackgroundTintMode e(Object[] objArr) {
        getBeepOnFailure getbeeponfailure;
        String str;
        av avVar;
        int i10;
        List<av> navigationOnClickListener;
        setSupportBackgroundTintMode setsupportbackgroundtintmode;
        setScrollContainer setscrollcontainer;
        getValue getvalue = (getValue) objArr[0];
        gv gvVar = (gv) objArr[1];
        int i11 = m + 123;
        f56280n = i11 % 128;
        if (i11 % 2 == 0) {
            setMaxWidth setmaxwidth = (setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar}, -836208544, 836208569, System.identityHashCode(gvVar));
            getbeeponfailure = (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth}, -852037600, 852037625, System.identityHashCode(setmaxwidth));
            int i12 = 20 / 0;
            if (getbeeponfailure == null) {
                int i13 = f56280n;
                int i14 = i13 & 23;
                int i15 = (i13 ^ 23) | i14;
                int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                m = i16 % 128;
                int i17 = i16 % 2;
            } else {
                setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                if (setscrollcontainer == null) {
                    int i18 = f56280n;
                    int i19 = (-2) - ((i18 + 4) ^ (-1));
                    m = i19 % 128;
                    int i20 = i19 % 2;
                    int i21 = (-2) - ((i18 + 94) ^ (-1));
                    m = i21 % 128;
                    int i22 = i21 % 2;
                } else {
                    str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                    int i23 = f56280n;
                    int i24 = ((i23 ^ 41) | (i23 & 41)) << 1;
                    int i25 = -(((~i23) & 41) | (i23 & (-42)));
                    int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                    m = i26 % 128;
                    int i27 = i26 % 2;
                }
            }
            str = null;
        } else {
            setMaxWidth setmaxwidth2 = (setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar}, -836208544, 836208569, System.identityHashCode(gvVar));
            getbeeponfailure = (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth2}, -852037600, 852037625, System.identityHashCode(setmaxwidth2));
            if (getbeeponfailure == null) {
                int i110 = f56280n;
                int i111 = i110 & 23;
                int i112 = (i110 ^ 23) | i111;
                int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                m = i113 % 128;
                int i114 = i113 % 2;
            } else {
                setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                if (setscrollcontainer == null) {
                    int i115 = f56280n;
                    int i116 = (-2) - ((i115 + 4) ^ (-1));
                    m = i116 % 128;
                    int i28 = i116 % 2;
                    int i29 = (-2) - ((i115 + 94) ^ (-1));
                    m = i29 % 128;
                    int i210 = i29 % 2;
                } else {
                    str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                    int i211 = f56280n;
                    int i212 = ((i211 ^ 41) | (i211 & 41)) << 1;
                    int i213 = -(((~i211) & 41) | (i211 & (-42)));
                    int i214 = ((i212 | i213) << 1) - (i213 ^ i212);
                    m = i214 % 128;
                    int i215 = i214 % 2;
                }
            }
            str = null;
        }
        gv.setOnFocusChangeListener(new Object[]{gvVar, str}, -64680794, 64680813, System.identityHashCode(gvVar));
        String str2 = (String) gv.setOnFocusChangeListener(new Object[]{gvVar}, -1126898243, 1126898267, System.identityHashCode(gvVar));
        if (str2 != null) {
            getvalue.setOnFocusChangeListener(new setDrawingCacheQuality(setInputExtras.setOnFocusChangeListener(str2, 2)));
            setSupportBackgroundTintMode setsupportbackgroundtintmode2 = setSupportBackgroundTintMode.setY;
            int i30 = m + 35;
            f56280n = i30 % 128;
            if (i30 % 2 != 0) {
                return setsupportbackgroundtintmode2;
            }
            throw null;
        }
        ah ahVar = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar}, 1437547358, -1437547304, System.identityHashCode(gvVar));
        if (ahVar != null) {
            int i31 = f56280n;
            int i32 = (i31 ^ 51) + ((i31 & 51) << 1);
            m = i32 % 128;
            if (i32 % 2 != 0) {
                throw null;
            }
            an anVar = (an) ((setImageTintList) w.setX(new Object[]{ahVar}, 1693919772, -1693919769, System.identityHashCode(ahVar)));
            if (anVar != null && (navigationOnClickListener = anVar.setNavigationOnClickListener()) != null) {
                int i33 = m + 53;
                f56280n = i33 % 128;
                if (i33 % 2 == 0) {
                    navigationOnClickListener.size();
                    throw null;
                }
                if (navigationOnClickListener.size() == 0) {
                    int i34 = f56280n;
                    int i35 = i34 & 103;
                    int i36 = i35 + ((i34 ^ 103) | i35);
                    m = i36 % 128;
                    int i37 = i36 % 2;
                    int i38 = (i34 & (-80)) | ((~i34) & 79);
                    int i39 = (i34 & 79) << 1;
                    int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                    m = i40 % 128;
                    if (i40 % 2 != 0) {
                        setsupportbackgroundtintmode = setSupportBackgroundTintMode.setDividerPadding;
                        int i41 = 51 / 0;
                    } else {
                        setsupportbackgroundtintmode = setSupportBackgroundTintMode.setDividerPadding;
                    }
                    int i42 = f56280n + 94;
                    int i43 = (i42 ^ (-1)) + (i42 << 1);
                    m = i43 % 128;
                    if (i43 % 2 == 0) {
                        return setsupportbackgroundtintmode;
                    }
                    throw null;
                }
            }
        }
        int i44 = m + 18;
        int i45 = (i44 ^ (-1)) + (i44 << 1);
        f56280n = i45 % 128;
        int i46 = i45 % 2;
        ah ahVar2 = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar}, 1437547358, -1437547304, System.identityHashCode(gvVar));
        if (ahVar2 == null) {
            int i47 = m;
            int i48 = (i47 ^ 78) + ((i47 & 78) << 1);
            int i49 = (i48 ^ (-1)) + (i48 << 1);
            f56280n = i49 % 128;
            int i50 = i49 % 2;
            int i51 = ((i47 ^ 3) | (i47 & 3)) << 1;
            int i52 = -(((~i47) & 3) | (i47 & (-4)));
            int i53 = (i51 & i52) + (i52 | i51);
            f56280n = i53 % 128;
            int i54 = i53 % 2;
        } else {
            an anVar2 = (an) ((setImageTintList) w.setX(new Object[]{ahVar2}, 1693919772, -1693919769, System.identityHashCode(ahVar2)));
            if (anVar2 != null) {
                List<av> navigationOnClickListener2 = anVar2.setNavigationOnClickListener();
                if (navigationOnClickListener2 == null) {
                    int i55 = f56280n;
                    int i56 = i55 & 73;
                    int i57 = (((i55 ^ 73) | i56) << 1) - ((i55 | 73) & (~i56));
                    m = i57 % 128;
                    if (i57 % 2 != 0) {
                        throw null;
                    }
                } else {
                    avVar = navigationOnClickListener2.get(0);
                    int i58 = m;
                    int i59 = ((i58 & 124) + (i58 | 124)) - 1;
                    f56280n = i59 % 128;
                    int i60 = i59 % 2;
                }
                if (avVar != null) {
                    throw new fh(34, null, 2, null);
                }
                getvalue.setOnFocusChangeListener(new setText(((Byte) av.setY(new Object[]{avVar}, -888174800, 888174800, System.identityHashCode(avVar))).byteValue(), ((Byte) av.setY(new Object[]{avVar}, 1262930435, -1262930433, System.identityHashCode(avVar))).byteValue()));
                setSupportBackgroundTintMode setsupportbackgroundtintmode3 = setSupportBackgroundTintMode.setCompoundDrawableTintBlendMode;
                int i61 = f56280n;
                int i62 = i61 & 69;
                int i63 = i61 | 69;
                i10 = (i62 ^ i63) + ((i63 & i62) << 1);
                m = i10 % 128;
                if (i10 % 2 != 0) {
                    int i64 = 64 / 0;
                }
                return setsupportbackgroundtintmode3;
            }
            int i65 = m;
            int i66 = (i65 & 81) + (i65 | 81);
            int i67 = i66 % 128;
            f56280n = i67;
            int i68 = i66 % 2;
            int i69 = i67 & 33;
            int i70 = (i67 ^ 33) | i69;
            int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
            m = i71 % 128;
            int i72 = i71 % 2;
        }
        avVar = null;
        if (avVar != null) {
            throw new fh(34, null, 2, null);
        }
        getvalue.setOnFocusChangeListener(new setText(((Byte) av.setY(new Object[]{avVar}, -888174800, 888174800, System.identityHashCode(avVar))).byteValue(), ((Byte) av.setY(new Object[]{avVar}, 1262930435, -1262930433, System.identityHashCode(avVar))).byteValue()));
        setSupportBackgroundTintMode setsupportbackgroundtintmode4 = setSupportBackgroundTintMode.setCompoundDrawableTintBlendMode;
        int i610 = f56280n;
        int i611 = i610 & 69;
        int i612 = i610 | 69;
        i10 = (i611 ^ i612) + ((i612 & i611) << 1);
        m = i10 % 128;
        if (i10 % 2 != 0) {
            int i613 = 64 / 0;
        }
        return setsupportbackgroundtintmode4;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:107:0x0a9d  */
    /* JADX WARN: Code duplicated, block: B:35:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:37:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:39:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:41:0x0311  */
    /* JADX WARN: Code duplicated, block: B:43:0x032a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0401  */
    /* JADX WARN: Code duplicated, block: B:46:0x0408  */
    /* JADX WARN: Code duplicated, block: B:47:0x040f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0452  */
    /* JADX WARN: Code duplicated, block: B:53:0x049e  */
    /* JADX WARN: Code duplicated, block: B:54:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:71:0x0574  */
    /* JADX WARN: Code duplicated, block: B:74:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:78:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:80:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:83:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x070e  */
    /* JADX WARN: Code duplicated, block: B:91:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:93:0x0803  */
    /* JADX WARN: Code duplicated, block: B:95:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:96:0x09ff  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        av avVar;
        boolean zBooleanValue;
        byte bByteValue;
        ah ahVar;
        hb hbVar;
        gv onFocusChangeListener;
        int i13;
        Object onFocusChangeListener2;
        int i14;
        hd hdVar;
        gv onFocusChangeListener3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        TransactionFailed transactionFailed;
        gv onFocusChangeListener4;
        int i15;
        int length;
        String str11;
        TransactionFailed transactionFailed2;
        int i16;
        int i17;
        gv onFocusChangeListener5;
        int i18;
        int i19;
        int i20;
        int i21;
        an anVar;
        List<av> navigationOnClickListener;
        int i22;
        int i23;
        int i24;
        int i25 = ~i10;
        int i26 = ((~(i25 | i11)) * 2748) + (i11 * 917) + (i10 * (-1831));
        int i27 = i25 | (~i11);
        switch ((((~(i10 | i11)) | (~i27)) * 916) + (i27 * (-916)) + i26) {
            case 1:
                return d(objArr);
            case 2:
                return a(objArr);
            case 3:
                return e(objArr);
            case 4:
                return c(objArr);
            case 5:
                b(objArr);
                return null;
            case 6:
                hx hxVar = (hx) objArr[0];
                setRotationX setrotationx = (setRotationX) objArr[1];
                Continuation continuation = (Continuation) objArr[2];
                int i28 = m;
                int i29 = i28 & 107;
                int i30 = ((i28 | 107) & (~i29)) + (i29 << 1);
                f56280n = i30 % 128;
                if (i30 % 2 == 0) {
                    ((Boolean) setRotationX.setX(new Object[]{setrotationx}, -268504199, 268504206, System.identityHashCode(setrotationx))).booleanValue();
                    throw null;
                }
                if (((Boolean) setRotationX.setX(new Object[]{setrotationx}, -268504199, 268504206, System.identityHashCode(setrotationx))).booleanValue()) {
                    gv onFocusChangeListener6 = hxVar.setOnFocusChangeListener();
                    ah ahVar2 = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener6}, 1437547358, -1437547304, System.identityHashCode(onFocusChangeListener6));
                    if (ahVar2 == null) {
                        int i31 = f56280n;
                        int i32 = i31 + 89;
                        m = i32 % 128;
                        int i33 = i32 % 2;
                        int i34 = i31 & 119;
                        int i35 = -(-((i31 ^ 119) | i34));
                        int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
                        m = i36 % 128;
                        int i37 = i36 % 2;
                    } else {
                        an anVar2 = (an) ((setImageTintList) w.setX(new Object[]{ahVar2}, 1693919772, -1693919769, System.identityHashCode(ahVar2)));
                        if (anVar2 == null) {
                            int i38 = f56280n;
                            int i39 = i38 & 111;
                            int i40 = i38 | 111;
                            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                            m = i41 % 128;
                            if (i41 % 2 != 0) {
                                throw null;
                            }
                        } else {
                            List<av> navigationOnClickListener2 = anVar2.setNavigationOnClickListener();
                            if (navigationOnClickListener2 == null) {
                                int i42 = m;
                                int i43 = i42 & 101;
                                int i44 = (i42 | 101) & (~i43);
                                int i45 = -(-(i43 << 1));
                                int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
                                f56280n = i46 % 128;
                                if (i46 % 2 == 0) {
                                    throw null;
                                }
                            } else {
                                avVar = navigationOnClickListener2.get(0);
                                int i47 = f56280n;
                                int i48 = (-2) - (((i47 ^ 72) + ((i47 & 72) << 1)) ^ (-1));
                                m = i48 % 128;
                                int i49 = i48 % 2;
                            }
                            if (avVar != null) {
                                throw new fh(34, null, 2, null);
                            }
                            zBooleanValue = ((Boolean) av.setY(new Object[]{avVar}, -1890498550, 1890498551, System.identityHashCode(avVar))).booleanValue();
                            bByteValue = ((Byte) av.setY(new Object[]{avVar}, -888174800, 888174800, System.identityHashCode(avVar))).byteValue();
                            gv onFocusChangeListener7 = hxVar.setOnFocusChangeListener();
                            ahVar = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener7}, 1437547358, -1437547304, System.identityHashCode(onFocusChangeListener7));
                            if (ahVar != null) {
                                int i50 = m;
                                int i51 = (i50 & (-96)) | ((~i50) & 95);
                                int i52 = -(-((95 & i50) << 1));
                                i21 = (i51 & i52) + (i52 | i51);
                                f56280n = i21 % 128;
                                if (i21 % 2 != 0) {
                                    throw null;
                                }
                                anVar = (an) ((setImageTintList) w.setX(new Object[]{ahVar}, 1693919772, -1693919769, System.identityHashCode(ahVar)));
                                if (anVar != null) {
                                    int i53 = m;
                                    int i54 = i53 & 51;
                                    int i55 = (((i53 | 51) & (~i54)) - (~(-(-(i54 << 1))))) - 1;
                                    f56280n = i55 % 128;
                                    int i56 = i55 % 2;
                                    navigationOnClickListener = anVar.setNavigationOnClickListener();
                                    if (navigationOnClickListener != null) {
                                        int iIdentityHashCode = System.identityHashCode(hxVar);
                                        int i57 = ~iIdentityHashCode;
                                        int i58 = ((-140857054) & i57) | (i57 ^ (-140857054));
                                        int i59 = ~i58;
                                        int i60 = ((i58 | i59) & i59) * (-560);
                                        int i61 = (((~i60) & (-728401333)) | (i60 & 728401332)) + ((i60 & (-728401333)) << 1);
                                        int i62 = (-140527834) & iIdentityHashCode;
                                        int i63 = (~i62) & ((-140527834) | iIdentityHashCode);
                                        int i64 = (i61 - (~(-(-((~((i63 & i62) | (i63 ^ i62))) * (-560)))))) - 1;
                                        int i65 = (iIdentityHashCode | i57) & i57;
                                        int i66 = i65 & (-1688147751);
                                        int i67 = (i65 | (-1688147751)) & (~i66);
                                        int i68 = -(-(((~((i67 & i66) | (i67 ^ i66))) | 1687818530) * 560));
                                        int i69 = i64 & i68;
                                        int i70 = (i68 ^ i64) | i69;
                                        i22 = ((i69 | i70) << 1) - (i70 ^ i69);
                                        int iIdentityHashCode2 = System.identityHashCode(hxVar);
                                        int i71 = (-306270259) & iIdentityHashCode2;
                                        int i72 = ((-306270259) | iIdentityHashCode2) & (~i71);
                                        int i73 = ~iIdentityHashCode2;
                                        int i74 = (i72 & i71) | (i72 ^ i71);
                                        int i75 = ~i74;
                                        int i76 = (i74 | i75) & i75;
                                        int i77 = ((~i73) & (-440784244)) | (i73 & 440784243);
                                        int i78 = (-440784244) & i73;
                                        int i79 = (i77 ^ i78) | (i77 & i78);
                                        int i80 = i79 & (-213692230);
                                        int i81 = (i79 | (-213692230)) & (~i80);
                                        int i82 = ~((i80 & i81) | (i81 ^ i80));
                                        int i83 = i76 & i82;
                                        int i84 = (i76 | i82) & (~i83);
                                        int i85 = -(~(((i84 & i83) | (i84 ^ i83)) * 497));
                                        int i86 = ((923974114 | i85) << 1) - (i85 ^ 923974114);
                                        i23 = (i86 ^ (-1)) + (i86 << 1);
                                        int i87 = ~((213692229 & i73) | (213692229 ^ i73));
                                        int i88 = i87 & (-519962488);
                                        int i89 = (i87 | (-519962488)) & (~i88);
                                        int i90 = (i89 & i88) | (i89 ^ i88);
                                        int i91 = (iIdentityHashCode2 & (-134513986)) | (i73 & (-134513986)) | (134513985 & iIdentityHashCode2);
                                        int i92 = ~i91;
                                        int i93 = (i91 | i92) & i92;
                                        int i94 = i90 & i93;
                                        int i95 = (i93 | i90) & (~i94);
                                        i24 = -(-(((i95 & i94) | (i95 ^ i94)) * 497));
                                        if (i22 > ((i23 | i24) << 1) - (i24 ^ i23)) {
                                            navigationOnClickListener.remove(1);
                                        } else {
                                            navigationOnClickListener.remove(0);
                                        }
                                    }
                                }
                            }
                            if (((Boolean) setDividerPadding(new Object[]{Byte.valueOf(bByteValue), setrotationx, hxVar.setOnFocusChangeListener()}, 1477243022, -1477243021, (int) System.currentTimeMillis())).booleanValue()) {
                                setDividerPadding(new Object[]{setrotationx.setOnDragListener(), hxVar.setOnFocusChangeListener()}, 406848526, -406848521, (int) System.currentTimeMillis());
                                if (zBooleanValue) {
                                    int i96 = f56280n;
                                    int i97 = i96 & 113;
                                    int i98 = (i97 - (~((i96 ^ 113) | i97))) - 1;
                                    m = i98 % 128;
                                    int i99 = i98 % 2;
                                    onFocusChangeListener4 = hxVar.setOnFocusChangeListener();
                                    if (((Byte) gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener4}, -1980384064, 1980384093, System.identityHashCode(onFocusChangeListener4))).byteValue() == UByte.m5545constructorimpl((byte) -128)) {
                                        i15 = (-2) - ((f56280n + 112) ^ (-1));
                                        int i100 = i15 % 128;
                                        m = i100;
                                        if (i15 % 2 != 0 ? bByteValue > 10 : bByteValue > 20) {
                                            length = ((byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx))).length;
                                            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
                                            setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                                            str11 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                                            setAnimation setanimation = setAnimation.INSTANCE;
                                            transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 399313363, -399313217, (int) System.currentTimeMillis());
                                            if (Intrinsics.areEqual(str11, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)))) {
                                                i17 = f56280n + 115;
                                                m = i17 % 128;
                                                if (i17 % 2 != 0) {
                                                    gv onFocusChangeListener8 = hxVar.setOnFocusChangeListener();
                                                    int length2 = ((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener8}, -854811249, 854811301, System.identityHashCode(onFocusChangeListener8))).length;
                                                    i18 = length2 ^ 25383;
                                                    i19 = -(-((length2 & 25383) << 1));
                                                    if ((i18 ^ i19) + ((i19 & i18) << 1) >= length) {
                                                        System.identityHashCode(hxVar);
                                                        System.identityHashCode(hxVar);
                                                        gv onFocusChangeListener9 = hxVar.setOnFocusChangeListener();
                                                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener9, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener9}, -854811249, 854811301, System.identityHashCode(onFocusChangeListener9)), (byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)))}, 1069122946, -1069122918, System.identityHashCode(onFocusChangeListener9));
                                                        int i101 = m;
                                                        int i102 = ((i101 | 78) << 1) - (i101 ^ 78);
                                                        i16 = (i102 ^ (-1)) + (i102 << 1);
                                                        f56280n = i16 % 128;
                                                    } else {
                                                        cz czVar = new cz(hxVar.setOnFocusChangeListener());
                                                        int i103 = f56280n;
                                                        int i104 = i103 & 89;
                                                        i16 = (((i103 | 89) & (~i104)) - (~(i104 << 1))) - 1;
                                                        m = i16 % 128;
                                                    }
                                                } else {
                                                    onFocusChangeListener5 = hxVar.setOnFocusChangeListener();
                                                    if (2046 - (~(-(~(-((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener5}, -854811249, 854811301, System.identityHashCode(onFocusChangeListener5))).length)))) >= length) {
                                                        System.identityHashCode(hxVar);
                                                        System.identityHashCode(hxVar);
                                                        gv onFocusChangeListener10 = hxVar.setOnFocusChangeListener();
                                                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener10, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener10}, -854811249, 854811301, System.identityHashCode(onFocusChangeListener10)), (byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)))}, 1069122946, -1069122918, System.identityHashCode(onFocusChangeListener10));
                                                        int i105 = m;
                                                        int i106 = ((i105 | 78) << 1) - (i105 ^ 78);
                                                        i16 = (i106 ^ (-1)) + (i106 << 1);
                                                        f56280n = i16 % 128;
                                                    } else {
                                                        cz czVar2 = new cz(hxVar.setOnFocusChangeListener());
                                                        int i107 = f56280n;
                                                        int i108 = i107 & 89;
                                                        i16 = (((i107 | 89) & (~i108)) - (~(i108 << 1))) - 1;
                                                        m = i16 % 128;
                                                    }
                                                }
                                            } else {
                                                cz czVar3 = new cz(hxVar.setOnFocusChangeListener());
                                                int i109 = f56280n;
                                                int i1010 = i109 & 89;
                                                i16 = (((i109 | 89) & (~i1010)) - (~(i1010 << 1))) - 1;
                                                m = i16 % 128;
                                            }
                                            int i110 = i16 % 2;
                                        } else {
                                            int i111 = ((i100 | 67) << 1) - (i100 ^ 67);
                                            f56280n = i111 % 128;
                                            if (i111 % 2 == 0) {
                                                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
                                                int length3 = ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2))).length;
                                                gv onFocusChangeListener11 = hxVar.setOnFocusChangeListener();
                                                if ((27383 << ((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener11}, -854811249, 854811301, System.identityHashCode(onFocusChangeListener11))).length) >= length3) {
                                                    gv onFocusChangeListener12 = hxVar.setOnFocusChangeListener();
                                                    byte[] bArr = (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener12}, -854811249, 854811301, System.identityHashCode(onFocusChangeListener12));
                                                    getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
                                                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener12, ArraysKt___ArraysJvmKt.plus(bArr, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3)))}, 1069122946, -1069122918, System.identityHashCode(onFocusChangeListener12));
                                                    int i112 = m;
                                                    int i113 = (i112 | 61) << 1;
                                                    int i114 = -(i112 ^ 61);
                                                    int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
                                                    f56280n = i115 % 128;
                                                    int i116 = i115 % 2;
                                                } else {
                                                    cz czVar4 = new cz(hxVar.setOnFocusChangeListener());
                                                    int i117 = m;
                                                    int i118 = i117 & 115;
                                                    int i119 = -(-((i117 ^ 115) | i118));
                                                    int i120 = ((i118 | i119) << 1) - (i119 ^ i118);
                                                    f56280n = i120 % 128;
                                                    int i121 = i120 % 2;
                                                }
                                            } else {
                                                getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
                                                int length4 = ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, 252497730, -252497710, System.identityHashCode(getbeeponfailure4))).length;
                                                gv onFocusChangeListener13 = hxVar.setOnFocusChangeListener();
                                                int i122 = -((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener13}, -854811249, 854811301, System.identityHashCode(onFocusChangeListener13))).length;
                                                int i123 = i122 & 2048;
                                                int i124 = (i122 ^ 2048) | i123;
                                                if ((i123 ^ i124) + ((i124 & i123) << 1) >= length4) {
                                                    gv onFocusChangeListener14 = hxVar.setOnFocusChangeListener();
                                                    byte[] bArr2 = (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener14}, -854811249, 854811301, System.identityHashCode(onFocusChangeListener14));
                                                    getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
                                                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener14, ArraysKt___ArraysJvmKt.plus(bArr2, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5}, 252497730, -252497710, System.identityHashCode(getbeeponfailure5)))}, 1069122946, -1069122918, System.identityHashCode(onFocusChangeListener14));
                                                    int i1110 = m;
                                                    int i1111 = (i1110 | 61) << 1;
                                                    int i1112 = -(i1110 ^ 61);
                                                    int i1113 = ((i1111 | i1112) << 1) - (i1112 ^ i1111);
                                                    f56280n = i1113 % 128;
                                                    int i1114 = i1113 % 2;
                                                } else {
                                                    cz czVar5 = new cz(hxVar.setOnFocusChangeListener());
                                                    int i1115 = m;
                                                    int i1116 = i1115 & 115;
                                                    int i1117 = -(-((i1115 ^ 115) | i1116));
                                                    int i125 = ((i1116 | i1117) << 1) - (i1117 ^ i1116);
                                                    f56280n = i125 % 128;
                                                    int i126 = i125 % 2;
                                                }
                                            }
                                        }
                                    }
                                }
                                hbVar = new hb(hxVar.setOnFocusChangeListener());
                                onFocusChangeListener = hxVar.setOnFocusChangeListener();
                                if (((Byte) gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener}, -1980384064, 1980384093, System.identityHashCode(onFocusChangeListener))).byteValue() != UByte.m5545constructorimpl((byte) -128)) {
                                    int i127 = m;
                                    int i128 = i127 & 123;
                                    int i129 = -(-(i127 | 123));
                                    int i130 = (i128 & i129) + (i129 | i128);
                                    f56280n = i130 % 128;
                                    int i131 = i130 % 2;
                                    hdVar = (hd) ((setImageTintList) w.setX(new Object[]{hbVar}, 1693919772, -1693919769, System.identityHashCode(hbVar)));
                                    if (((Boolean) hd.setY(new Object[]{hdVar}, 136707458, -136707458, System.identityHashCode(hdVar))).booleanValue()) {
                                        i13 = 2;
                                    } else {
                                        int i132 = f56280n;
                                        int i133 = (i132 ^ 9) + ((i132 & 9) << 1);
                                        m = i133 % 128;
                                        int i134 = i133 % 2;
                                        onFocusChangeListener3 = hxVar.setOnFocusChangeListener();
                                        setAnimation setanimation2 = setAnimation.INSTANCE;
                                        TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 1817971805, -1817971762, (int) System.currentTimeMillis());
                                        str = (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3));
                                        TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], 1260159524, -1260159512, (int) System.currentTimeMillis());
                                        str2 = (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4));
                                        TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], 1217059921, -1217059727, (int) System.currentTimeMillis());
                                        str3 = (String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5));
                                        TransactionFailed transactionFailed6 = (TransactionFailed) setAnimation.setY(new Object[0], 2023104344, -2023104064, (int) System.currentTimeMillis());
                                        str4 = (String) TransactionFailed.setX(new Object[]{transactionFailed6}, 1914607362, -1914607356, System.identityHashCode(transactionFailed6));
                                        TransactionFailed transactionFailed7 = (TransactionFailed) setAnimation.setY(new Object[0], -1874888877, 1874888891, (int) System.currentTimeMillis());
                                        str5 = (String) TransactionFailed.setX(new Object[]{transactionFailed7}, 1914607362, -1914607356, System.identityHashCode(transactionFailed7));
                                        TransactionFailed transactionFailed8 = (TransactionFailed) setAnimation.setY(new Object[0], -956296156, 956296218, (int) System.currentTimeMillis());
                                        str6 = (String) TransactionFailed.setX(new Object[]{transactionFailed8}, 1914607362, -1914607356, System.identityHashCode(transactionFailed8));
                                        TransactionFailed transactionFailed9 = (TransactionFailed) setAnimation.setY(new Object[0], 812392256, -812392155, (int) System.currentTimeMillis());
                                        str7 = (String) TransactionFailed.setX(new Object[]{transactionFailed9}, 1914607362, -1914607356, System.identityHashCode(transactionFailed9));
                                        TransactionFailed transactionFailed10 = (TransactionFailed) setAnimation.setY(new Object[0], -1457907498, 1457907557, (int) System.currentTimeMillis());
                                        str8 = (String) TransactionFailed.setX(new Object[]{transactionFailed10}, 1914607362, -1914607356, System.identityHashCode(transactionFailed10));
                                        TransactionFailed transactionFailedTerminalSessionDefaultImpls = setAnimation.TerminalSessionDefaultImpls();
                                        str9 = (String) TransactionFailed.setX(new Object[]{transactionFailedTerminalSessionDefaultImpls}, 1914607362, -1914607356, System.identityHashCode(transactionFailedTerminalSessionDefaultImpls));
                                        TransactionFailed transactionFailed11 = (TransactionFailed) setAnimation.setY(new Object[0], 1963048329, -1963048320, (int) System.currentTimeMillis());
                                        str10 = (String) TransactionFailed.setX(new Object[]{transactionFailed11}, 1914607362, -1914607356, System.identityHashCode(transactionFailed11));
                                        transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1381885457, 1381885551, (int) System.currentTimeMillis());
                                        if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener3, CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))})}, 318904434, -318904411, System.identityHashCode(onFocusChangeListener3))).booleanValue()) {
                                            gv onFocusChangeListener15 = hxVar.setOnFocusChangeListener();
                                            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                                            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener15, new ah(getBeepOnFailure.setCompoundDrawableTintBlendMode.setY(setAnimation.setMaxEms().setOnFocusChangeListener(), null, null, false, 30))}, 2023572198, -2023572188, System.identityHashCode(onFocusChangeListener15));
                                            int i135 = f56280n;
                                            int i136 = (i135 & (-16)) | ((~i135) & 15);
                                            int i137 = -(-((i135 & 15) << 1));
                                            int i138 = (i136 ^ i137) + ((i137 & i136) << 1);
                                            m = i138 % 128;
                                            i13 = 2;
                                            int i139 = i138 % 2;
                                        } else {
                                            i13 = 2;
                                        }
                                    }
                                } else {
                                    i13 = 2;
                                }
                                gv onFocusChangeListener16 = hxVar.setOnFocusChangeListener();
                                gv onFocusChangeListener17 = hxVar.setOnFocusChangeListener();
                                Object[] objArr2 = new Object[i13];
                                objArr2[0] = hxVar.f56281i;
                                objArr2[1] = onFocusChangeListener17;
                                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener16, (setSupportBackgroundTintMode) setDividerPadding(objArr2, -790547922, 790547925, (int) System.currentTimeMillis())}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener16));
                                hw hwVar = new hw(hxVar.setX(), hxVar.f56284l);
                                onFocusChangeListener2 = hw.setOnFocusChangeListener(new Object[]{hwVar, hxVar.setOnFocusChangeListener(), hxVar.setCompoundDrawableTintBlendMode(), hxVar.f56282j, hxVar.f56281i, hxVar.f56283k, continuation}, -2058538250, 2058538250, System.identityHashCode(hwVar));
                                int i140 = f56280n;
                                int i141 = ((i140 ^ 121) | (i140 & 121)) << 1;
                                int i142 = -(((~i140) & 121) | (i140 & (-122)));
                                i14 = ((i141 | i142) << 1) - (i142 ^ i141);
                                m = i14 % 128;
                                if (i14 % 2 != 0) {
                                    throw null;
                                }
                            } else {
                                int i143 = f56280n;
                                int i144 = i143 ^ 49;
                                int i145 = -(-((i143 & 49) << 1));
                                int i146 = (i144 & i145) + (i145 | i144);
                                m = i146 % 128;
                                int i147 = i146 % 2;
                                onFocusChangeListener2 = (fk) setDividerPadding(new Object[]{hxVar, hxVar.setOnFocusChangeListener(), hxVar.setCompoundDrawableTintBlendMode()}, -2141349429, 2141349431, System.identityHashCode(hxVar));
                                int i148 = f56280n;
                                int i149 = i148 ^ 53;
                                int i150 = -(-((i148 & 53) << 1));
                                i20 = ((i149 | i150) << 1) - (i150 ^ i149);
                                m = i20 % 128;
                                if (i20 % 2 != 0) {
                                    int i151 = 12 / 0;
                                }
                            }
                        }
                    }
                    avVar = null;
                    if (avVar != null) {
                        throw new fh(34, null, 2, null);
                    }
                    zBooleanValue = ((Boolean) av.setY(new Object[]{avVar}, -1890498550, 1890498551, System.identityHashCode(avVar))).booleanValue();
                    bByteValue = ((Byte) av.setY(new Object[]{avVar}, -888174800, 888174800, System.identityHashCode(avVar))).byteValue();
                    gv onFocusChangeListener18 = hxVar.setOnFocusChangeListener();
                    ahVar = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener18}, 1437547358, -1437547304, System.identityHashCode(onFocusChangeListener18));
                    if (ahVar != null) {
                        int i510 = m;
                        int i511 = (i510 & (-96)) | ((~i510) & 95);
                        int i512 = -(-((95 & i510) << 1));
                        i21 = (i511 & i512) + (i512 | i511);
                        f56280n = i21 % 128;
                        if (i21 % 2 != 0) {
                            throw null;
                        }
                        anVar = (an) ((setImageTintList) w.setX(new Object[]{ahVar}, 1693919772, -1693919769, System.identityHashCode(ahVar)));
                        if (anVar != null) {
                            int i513 = m;
                            int i514 = i513 & 51;
                            int i515 = (((i513 | 51) & (~i514)) - (~(-(-(i514 << 1))))) - 1;
                            f56280n = i515 % 128;
                            int i516 = i515 % 2;
                            navigationOnClickListener = anVar.setNavigationOnClickListener();
                            if (navigationOnClickListener != null) {
                                int iIdentityHashCode3 = System.identityHashCode(hxVar);
                                int i517 = ~iIdentityHashCode3;
                                int i518 = ((-140857054) & i517) | (i517 ^ (-140857054));
                                int i519 = ~i518;
                                int i610 = ((i518 | i519) & i519) * (-560);
                                int i611 = (((~i610) & (-728401333)) | (i610 & 728401332)) + ((i610 & (-728401333)) << 1);
                                int i612 = (-140527834) & iIdentityHashCode3;
                                int i613 = (~i612) & ((-140527834) | iIdentityHashCode3);
                                int i614 = (i611 - (~(-(-((~((i613 & i612) | (i613 ^ i612))) * (-560)))))) - 1;
                                int i615 = (iIdentityHashCode3 | i517) & i517;
                                int i616 = i615 & (-1688147751);
                                int i617 = (i615 | (-1688147751)) & (~i616);
                                int i618 = -(-(((~((i617 & i616) | (i617 ^ i616))) | 1687818530) * 560));
                                int i619 = i614 & i618;
                                int i710 = (i618 ^ i614) | i619;
                                i22 = ((i619 | i710) << 1) - (i710 ^ i619);
                                int iIdentityHashCode4 = System.identityHashCode(hxVar);
                                int i711 = (-306270259) & iIdentityHashCode4;
                                int i712 = ((-306270259) | iIdentityHashCode4) & (~i711);
                                int i713 = ~iIdentityHashCode4;
                                int i714 = (i712 & i711) | (i712 ^ i711);
                                int i715 = ~i714;
                                int i716 = (i714 | i715) & i715;
                                int i717 = ((~i713) & (-440784244)) | (i713 & 440784243);
                                int i718 = (-440784244) & i713;
                                int i719 = (i717 ^ i718) | (i717 & i718);
                                int i810 = i719 & (-213692230);
                                int i811 = (i719 | (-213692230)) & (~i810);
                                int i812 = ~((i810 & i811) | (i811 ^ i810));
                                int i813 = i716 & i812;
                                int i814 = (i716 | i812) & (~i813);
                                int i815 = -(~(((i814 & i813) | (i814 ^ i813)) * 497));
                                int i816 = ((923974114 | i815) << 1) - (i815 ^ 923974114);
                                i23 = (i816 ^ (-1)) + (i816 << 1);
                                int i817 = ~((213692229 & i713) | (213692229 ^ i713));
                                int i818 = i817 & (-519962488);
                                int i819 = (i817 | (-519962488)) & (~i818);
                                int i910 = (i819 & i818) | (i819 ^ i818);
                                int i911 = (iIdentityHashCode4 & (-134513986)) | (i713 & (-134513986)) | (134513985 & iIdentityHashCode4);
                                int i912 = ~i911;
                                int i913 = (i911 | i912) & i912;
                                int i914 = i910 & i913;
                                int i915 = (i913 | i910) & (~i914);
                                i24 = -(-(((i915 & i914) | (i915 ^ i914)) * 497));
                                if (i22 > ((i23 | i24) << 1) - (i24 ^ i23)) {
                                    navigationOnClickListener.remove(1);
                                } else {
                                    navigationOnClickListener.remove(0);
                                }
                            }
                        }
                    }
                    if (((Boolean) setDividerPadding(new Object[]{Byte.valueOf(bByteValue), setrotationx, hxVar.setOnFocusChangeListener()}, 1477243022, -1477243021, (int) System.currentTimeMillis())).booleanValue()) {
                        int i1410 = f56280n;
                        int i1411 = i1410 ^ 49;
                        int i1412 = -(-((i1410 & 49) << 1));
                        int i1413 = (i1411 & i1412) + (i1412 | i1411);
                        m = i1413 % 128;
                        int i1414 = i1413 % 2;
                        onFocusChangeListener2 = (fk) setDividerPadding(new Object[]{hxVar, hxVar.setOnFocusChangeListener(), hxVar.setCompoundDrawableTintBlendMode()}, -2141349429, 2141349431, System.identityHashCode(hxVar));
                        int i1415 = f56280n;
                        int i1416 = i1415 ^ 53;
                        int i152 = -(-((i1415 & 53) << 1));
                        i20 = ((i1416 | i152) << 1) - (i152 ^ i1416);
                        m = i20 % 128;
                        if (i20 % 2 != 0) {
                            int i153 = 12 / 0;
                        }
                    } else {
                        setDividerPadding(new Object[]{setrotationx.setOnDragListener(), hxVar.setOnFocusChangeListener()}, 406848526, -406848521, (int) System.currentTimeMillis());
                        if (zBooleanValue) {
                            int i916 = f56280n;
                            int i917 = i916 & 113;
                            int i918 = (i917 - (~((i916 ^ 113) | i917))) - 1;
                            m = i918 % 128;
                            int i919 = i918 % 2;
                            onFocusChangeListener4 = hxVar.setOnFocusChangeListener();
                            if (((Byte) gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener4}, -1980384064, 1980384093, System.identityHashCode(onFocusChangeListener4))).byteValue() == UByte.m5545constructorimpl((byte) -128)) {
                                i15 = (-2) - ((f56280n + 112) ^ (-1));
                                int i1011 = i15 % 128;
                                m = i1011;
                                if (i15 % 2 != 0) {
                                    length = ((byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx))).length;
                                    getBeepOnFailure getbeeponfailure6 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
                                    setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 865402441, -865402437, System.identityHashCode(getbeeponfailure6));
                                    str11 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
                                    setAnimation setanimation3 = setAnimation.INSTANCE;
                                    transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 399313363, -399313217, (int) System.currentTimeMillis());
                                    if (Intrinsics.areEqual(str11, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)))) {
                                        i17 = f56280n + 115;
                                        m = i17 % 128;
                                        if (i17 % 2 != 0) {
                                            gv onFocusChangeListener19 = hxVar.setOnFocusChangeListener();
                                            int length5 = ((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener19}, -854811249, 854811301, System.identityHashCode(onFocusChangeListener19))).length;
                                            i18 = length5 ^ 25383;
                                            i19 = -(-((length5 & 25383) << 1));
                                            if ((i18 ^ i19) + ((i19 & i18) << 1) >= length) {
                                                System.identityHashCode(hxVar);
                                                System.identityHashCode(hxVar);
                                                gv onFocusChangeListener110 = hxVar.setOnFocusChangeListener();
                                                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener110, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener110}, -854811249, 854811301, System.identityHashCode(onFocusChangeListener110)), (byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)))}, 1069122946, -1069122918, System.identityHashCode(onFocusChangeListener110));
                                                int i1012 = m;
                                                int i1013 = ((i1012 | 78) << 1) - (i1012 ^ 78);
                                                i16 = (i1013 ^ (-1)) + (i1013 << 1);
                                                f56280n = i16 % 128;
                                            } else {
                                                cz czVar6 = new cz(hxVar.setOnFocusChangeListener());
                                                int i1014 = f56280n;
                                                int i1015 = i1014 & 89;
                                                i16 = (((i1014 | 89) & (~i1015)) - (~(i1015 << 1))) - 1;
                                                m = i16 % 128;
                                            }
                                        } else {
                                            onFocusChangeListener5 = hxVar.setOnFocusChangeListener();
                                            if (2046 - (~(-(~(-((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener5}, -854811249, 854811301, System.identityHashCode(onFocusChangeListener5))).length)))) >= length) {
                                                System.identityHashCode(hxVar);
                                                System.identityHashCode(hxVar);
                                                gv onFocusChangeListener111 = hxVar.setOnFocusChangeListener();
                                                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener111, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener111}, -854811249, 854811301, System.identityHashCode(onFocusChangeListener111)), (byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)))}, 1069122946, -1069122918, System.identityHashCode(onFocusChangeListener111));
                                                int i1016 = m;
                                                int i1017 = ((i1016 | 78) << 1) - (i1016 ^ 78);
                                                i16 = (i1017 ^ (-1)) + (i1017 << 1);
                                                f56280n = i16 % 128;
                                            } else {
                                                cz czVar7 = new cz(hxVar.setOnFocusChangeListener());
                                                int i1018 = f56280n;
                                                int i1019 = i1018 & 89;
                                                i16 = (((i1018 | 89) & (~i1019)) - (~(i1019 << 1))) - 1;
                                                m = i16 % 128;
                                            }
                                        }
                                    } else {
                                        cz czVar8 = new cz(hxVar.setOnFocusChangeListener());
                                        int i10110 = f56280n;
                                        int i10111 = i10110 & 89;
                                        i16 = (((i10110 | 89) & (~i10111)) - (~(i10111 << 1))) - 1;
                                        m = i16 % 128;
                                    }
                                    int i1118 = i16 % 2;
                                } else {
                                    length = ((byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx))).length;
                                    getBeepOnFailure getbeeponfailure7 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
                                    setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure7}, 865402441, -865402437, System.identityHashCode(getbeeponfailure7));
                                    str11 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3));
                                    setAnimation setanimation4 = setAnimation.INSTANCE;
                                    transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 399313363, -399313217, (int) System.currentTimeMillis());
                                    if (Intrinsics.areEqual(str11, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)))) {
                                        i17 = f56280n + 115;
                                        m = i17 % 128;
                                        if (i17 % 2 != 0) {
                                            gv onFocusChangeListener112 = hxVar.setOnFocusChangeListener();
                                            int length6 = ((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener112}, -854811249, 854811301, System.identityHashCode(onFocusChangeListener112))).length;
                                            i18 = length6 ^ 25383;
                                            i19 = -(-((length6 & 25383) << 1));
                                            if ((i18 ^ i19) + ((i19 & i18) << 1) >= length) {
                                                System.identityHashCode(hxVar);
                                                System.identityHashCode(hxVar);
                                                gv onFocusChangeListener113 = hxVar.setOnFocusChangeListener();
                                                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener113, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener113}, -854811249, 854811301, System.identityHashCode(onFocusChangeListener113)), (byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)))}, 1069122946, -1069122918, System.identityHashCode(onFocusChangeListener113));
                                                int i10112 = m;
                                                int i10113 = ((i10112 | 78) << 1) - (i10112 ^ 78);
                                                i16 = (i10113 ^ (-1)) + (i10113 << 1);
                                                f56280n = i16 % 128;
                                            } else {
                                                cz czVar9 = new cz(hxVar.setOnFocusChangeListener());
                                                int i10114 = f56280n;
                                                int i10115 = i10114 & 89;
                                                i16 = (((i10114 | 89) & (~i10115)) - (~(i10115 << 1))) - 1;
                                                m = i16 % 128;
                                            }
                                        } else {
                                            onFocusChangeListener5 = hxVar.setOnFocusChangeListener();
                                            if (2046 - (~(-(~(-((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener5}, -854811249, 854811301, System.identityHashCode(onFocusChangeListener5))).length)))) >= length) {
                                                System.identityHashCode(hxVar);
                                                System.identityHashCode(hxVar);
                                                gv onFocusChangeListener114 = hxVar.setOnFocusChangeListener();
                                                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener114, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener114}, -854811249, 854811301, System.identityHashCode(onFocusChangeListener114)), (byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)))}, 1069122946, -1069122918, System.identityHashCode(onFocusChangeListener114));
                                                int i10116 = m;
                                                int i10117 = ((i10116 | 78) << 1) - (i10116 ^ 78);
                                                i16 = (i10117 ^ (-1)) + (i10117 << 1);
                                                f56280n = i16 % 128;
                                            } else {
                                                cz czVar10 = new cz(hxVar.setOnFocusChangeListener());
                                                int i10118 = f56280n;
                                                int i10119 = i10118 & 89;
                                                i16 = (((i10118 | 89) & (~i10119)) - (~(i10119 << 1))) - 1;
                                                m = i16 % 128;
                                            }
                                        }
                                    } else {
                                        cz czVar11 = new cz(hxVar.setOnFocusChangeListener());
                                        int i101110 = f56280n;
                                        int i101111 = i101110 & 89;
                                        i16 = (((i101110 | 89) & (~i101111)) - (~(i101111 << 1))) - 1;
                                        m = i16 % 128;
                                    }
                                    int i1119 = i16 % 2;
                                }
                            }
                        }
                        hbVar = new hb(hxVar.setOnFocusChangeListener());
                        onFocusChangeListener = hxVar.setOnFocusChangeListener();
                        if (((Byte) gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener}, -1980384064, 1980384093, System.identityHashCode(onFocusChangeListener))).byteValue() != UByte.m5545constructorimpl((byte) -128)) {
                            int i1210 = m;
                            int i1211 = i1210 & 123;
                            int i1212 = -(-(i1210 | 123));
                            int i1310 = (i1211 & i1212) + (i1212 | i1211);
                            f56280n = i1310 % 128;
                            int i1311 = i1310 % 2;
                            hdVar = (hd) ((setImageTintList) w.setX(new Object[]{hbVar}, 1693919772, -1693919769, System.identityHashCode(hbVar)));
                            if (((Boolean) hd.setY(new Object[]{hdVar}, 136707458, -136707458, System.identityHashCode(hdVar))).booleanValue()) {
                                int i1312 = f56280n;
                                int i1313 = (i1312 ^ 9) + ((i1312 & 9) << 1);
                                m = i1313 % 128;
                                int i1314 = i1313 % 2;
                                onFocusChangeListener3 = hxVar.setOnFocusChangeListener();
                                setAnimation setanimation5 = setAnimation.INSTANCE;
                                TransactionFailed transactionFailed12 = (TransactionFailed) setAnimation.setY(new Object[0], 1817971805, -1817971762, (int) System.currentTimeMillis());
                                str = (String) TransactionFailed.setX(new Object[]{transactionFailed12}, 1914607362, -1914607356, System.identityHashCode(transactionFailed12));
                                TransactionFailed transactionFailed13 = (TransactionFailed) setAnimation.setY(new Object[0], 1260159524, -1260159512, (int) System.currentTimeMillis());
                                str2 = (String) TransactionFailed.setX(new Object[]{transactionFailed13}, 1914607362, -1914607356, System.identityHashCode(transactionFailed13));
                                TransactionFailed transactionFailed14 = (TransactionFailed) setAnimation.setY(new Object[0], 1217059921, -1217059727, (int) System.currentTimeMillis());
                                str3 = (String) TransactionFailed.setX(new Object[]{transactionFailed14}, 1914607362, -1914607356, System.identityHashCode(transactionFailed14));
                                TransactionFailed transactionFailed15 = (TransactionFailed) setAnimation.setY(new Object[0], 2023104344, -2023104064, (int) System.currentTimeMillis());
                                str4 = (String) TransactionFailed.setX(new Object[]{transactionFailed15}, 1914607362, -1914607356, System.identityHashCode(transactionFailed15));
                                TransactionFailed transactionFailed16 = (TransactionFailed) setAnimation.setY(new Object[0], -1874888877, 1874888891, (int) System.currentTimeMillis());
                                str5 = (String) TransactionFailed.setX(new Object[]{transactionFailed16}, 1914607362, -1914607356, System.identityHashCode(transactionFailed16));
                                TransactionFailed transactionFailed17 = (TransactionFailed) setAnimation.setY(new Object[0], -956296156, 956296218, (int) System.currentTimeMillis());
                                str6 = (String) TransactionFailed.setX(new Object[]{transactionFailed17}, 1914607362, -1914607356, System.identityHashCode(transactionFailed17));
                                TransactionFailed transactionFailed18 = (TransactionFailed) setAnimation.setY(new Object[0], 812392256, -812392155, (int) System.currentTimeMillis());
                                str7 = (String) TransactionFailed.setX(new Object[]{transactionFailed18}, 1914607362, -1914607356, System.identityHashCode(transactionFailed18));
                                TransactionFailed transactionFailed19 = (TransactionFailed) setAnimation.setY(new Object[0], -1457907498, 1457907557, (int) System.currentTimeMillis());
                                str8 = (String) TransactionFailed.setX(new Object[]{transactionFailed19}, 1914607362, -1914607356, System.identityHashCode(transactionFailed19));
                                TransactionFailed transactionFailedTerminalSessionDefaultImpls2 = setAnimation.TerminalSessionDefaultImpls();
                                str9 = (String) TransactionFailed.setX(new Object[]{transactionFailedTerminalSessionDefaultImpls2}, 1914607362, -1914607356, System.identityHashCode(transactionFailedTerminalSessionDefaultImpls2));
                                TransactionFailed transactionFailed110 = (TransactionFailed) setAnimation.setY(new Object[0], 1963048329, -1963048320, (int) System.currentTimeMillis());
                                str10 = (String) TransactionFailed.setX(new Object[]{transactionFailed110}, 1914607362, -1914607356, System.identityHashCode(transactionFailed110));
                                transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1381885457, 1381885551, (int) System.currentTimeMillis());
                                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener3, CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))})}, 318904434, -318904411, System.identityHashCode(onFocusChangeListener3))).booleanValue()) {
                                    gv onFocusChangeListener115 = hxVar.setOnFocusChangeListener();
                                    getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
                                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener115, new ah(getBeepOnFailure.setCompoundDrawableTintBlendMode.setY(setAnimation.setMaxEms().setOnFocusChangeListener(), null, null, false, 30))}, 2023572198, -2023572188, System.identityHashCode(onFocusChangeListener115));
                                    int i1315 = f56280n;
                                    int i1316 = (i1315 & (-16)) | ((~i1315) & 15);
                                    int i1317 = -(-((i1315 & 15) << 1));
                                    int i1318 = (i1316 ^ i1317) + ((i1317 & i1316) << 1);
                                    m = i1318 % 128;
                                    i13 = 2;
                                    int i1319 = i1318 % 2;
                                } else {
                                    i13 = 2;
                                }
                            } else {
                                i13 = 2;
                            }
                        } else {
                            i13 = 2;
                        }
                        gv onFocusChangeListener116 = hxVar.setOnFocusChangeListener();
                        gv onFocusChangeListener117 = hxVar.setOnFocusChangeListener();
                        Object[] objArr3 = new Object[i13];
                        objArr3[0] = hxVar.f56281i;
                        objArr3[1] = onFocusChangeListener117;
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener116, (setSupportBackgroundTintMode) setDividerPadding(objArr3, -790547922, 790547925, (int) System.currentTimeMillis())}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener116));
                        hw hwVar2 = new hw(hxVar.setX(), hxVar.f56284l);
                        onFocusChangeListener2 = hw.setOnFocusChangeListener(new Object[]{hwVar2, hxVar.setOnFocusChangeListener(), hxVar.setCompoundDrawableTintBlendMode(), hxVar.f56282j, hxVar.f56281i, hxVar.f56283k, continuation}, -2058538250, 2058538250, System.identityHashCode(hwVar2));
                        int i1417 = f56280n;
                        int i1418 = ((i1417 ^ 121) | (i1417 & 121)) << 1;
                        int i1419 = -(((~i1417) & 121) | (i1417 & (-122)));
                        i14 = ((i1418 | i1419) << 1) - (i1419 ^ i1418);
                        m = i14 % 128;
                        if (i14 % 2 != 0) {
                            throw null;
                        }
                    }
                } else {
                    onFocusChangeListener2 = (fk) setDividerPadding(new Object[]{hxVar, hxVar.setOnFocusChangeListener(), hxVar.setCompoundDrawableTintBlendMode(), setrotationx}, 5763510, -5763502, System.identityHashCode(hxVar));
                    int i154 = m + 71;
                    f56280n = i154 % 128;
                    int i155 = i154 % 2;
                }
                return onFocusChangeListener2;
            case 7:
                hx hxVar2 = (hx) objArr[0];
                com.mypinpad.tsdk.isolation.a aVar = (com.mypinpad.tsdk.isolation.a) objArr[1];
                int i156 = f56280n;
                int i157 = i156 & 83;
                int i158 = -(-((i156 ^ 83) | i157));
                int i159 = ((i157 | i158) << 1) - (i158 ^ i157);
                m = i159 % 128;
                int i160 = i159 % 2;
                Intrinsics.checkNotNullParameter(aVar, "");
                gv onFocusChangeListener20 = hxVar2.setOnFocusChangeListener();
                gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener20, (Integer) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar}, -114513983, 114513983, System.identityHashCode(aVar)), (Integer) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar}, 156913967, -156913963, System.identityHashCode(aVar)), (setMaxWidth) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar}, -917873151, 917873153, System.identityHashCode(aVar))}, -1273972116, 1273972121, System.identityHashCode(onFocusChangeListener20));
                fk fkVar = fk.setOnDragListener;
                int i161 = f56280n;
                int i162 = i161 & 59;
                int i163 = -(-((i161 ^ 59) | i162));
                int i164 = (i162 & i163) + (i163 | i162);
                m = i164 % 128;
                int i165 = i164 % 2;
                return fkVar;
            case 8:
                hx hxVar3 = (hx) objArr[0];
                gv gvVar = (gv) objArr[1];
                setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
                setRotationX setrotationx2 = (setRotationX) objArr[3];
                int i166 = m;
                int i167 = i166 ^ 51;
                int i168 = (i166 & 51) << 1;
                int i169 = ((i167 | i168) << 1) - (i168 ^ i167);
                f56280n = i169 % 128;
                int i170 = i169 % 2;
                et etVar = hxVar3.f56284l;
                et.setDividerPadding(new Object[]{gvVar}, 338249870, -338249868, (int) System.currentTimeMillis());
                ex x4 = hxVar3.setX();
                activateSession activatesession = activateSession.ERROR_OTHER_CARD;
                fk dividerPadding = ex.setDividerPadding(x4, gvVar, settextkeepstate, activatesession, ValueQualifier.setY, null, fd.END_APPLICATION, null, Boolean.TRUE, activatesession, null, (byte[]) setRotationX.setX(new Object[]{setrotationx2}, 1043258083, -1043258081, System.identityHashCode(setrotationx2)), setContentCaptureSession.setLayoutAnimation, null, null, null, null, null, null, false, false, 4190800);
                int i171 = f56280n + 115;
                m = i171 % 128;
                if (i171 % 2 == 0) {
                    return dividerPadding;
                }
                int i172 = 2 / 0;
                return dividerPadding;
            default:
                hx hxVar4 = (hx) objArr[0];
                int i173 = m + 39;
                f56280n = i173 % 128;
                int i174 = i173 % 2;
                et etVar2 = hxVar4.f56284l;
                et.setDividerPadding(new Object[]{hxVar4.setOnFocusChangeListener()}, 338249870, -338249868, (int) System.currentTimeMillis());
                fk compoundDrawableTintBlendMode = ex.setCompoundDrawableTintBlendMode(hxVar4.setX(), hxVar4.setOnFocusChangeListener(), hxVar4.setCompoundDrawableTintBlendMode(), fd.END_APPLICATION, null, null, null, setDrawSelectorOnTop.setOnFocusChangeListener, null, false, 184);
                int i175 = f56280n;
                int i176 = (i175 | 95) << 1;
                int i177 = -(((~i175) & 95) | (i175 & (-96)));
                int i178 = (i176 & i177) + (i177 | i176);
                m = i178 % 128;
                if (i178 % 2 == 0) {
                    return compoundDrawableTintBlendMode;
                }
                int i179 = 28 / 0;
                return compoundDrawableTintBlendMode;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @NotNull
    public final fk setCompoundDrawableTintBlendMode(@NotNull com.mypinpad.tsdk.isolation.a aVar) {
        return (fk) setDividerPadding(new Object[]{this, aVar}, -1610740815, 1610740822, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @NotNull
    public final fk setNavigationOnClickListener() {
        return (fk) setDividerPadding(new Object[]{this}, -2062633505, 2062633505, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.hi
    @NotNull
    public final fk setOnFocusChangeListener(@NotNull setRotationX setrotationx) {
        return (fk) setDividerPadding(new Object[]{this, setrotationx}, -1442726621, 1442726625, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.hi
    @Nullable
    public final Object setY(@NotNull setRotationX setrotationx, @NotNull Continuation<? super fk> continuation) {
        return setDividerPadding(new Object[]{this, setrotationx, continuation}, 1624200252, -1624200246, System.identityHashCode(this));
    }
}
