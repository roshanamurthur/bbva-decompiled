package com.mypinpad.tsdk.isolation;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class writeObject {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f61664r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f61665s = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f61666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTextKeepState f61667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final eu f61668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final setTop f61669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final exceptionHandler f61670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final di f61671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final component10 f61672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final setTop f61673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final setChildIndicator f61674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final component17 f61675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final setContentDescription f61676k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ij f61677l;

    @NotNull
    public final Function1<setTextColor, Unit> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Function1<Exception, Unit> f61678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public setAdjustViewBounds f61679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public values f61680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public GlobalEndpoint<setScrollBarDefaultDelayBeforeFade> f61681q;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f61682p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f61684r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object[] objArr = {this, obj};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            aVar.f61682p0 = objArr[1];
            int i10 = aVar.f61684r0;
            int i11 = (Integer.MAX_VALUE & i10) | ((~i10) & Integer.MIN_VALUE);
            int i12 = i10 & Integer.MIN_VALUE;
            aVar.f61684r0 = (i12 & i11) | (i11 ^ i12);
            writeObject writeobject = writeObject.this;
            return writeObject.setY(new Object[]{writeobject, aVar}, 208139506, -208139506, System.identityHashCode(writeobject));
        }
    }

    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public writeObject f61685p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public setAccessibilityPaneTitle f61686q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public gz f61687r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public me f61688s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public getValue f61689t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public /* synthetic */ Object f61690u0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f61691w0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Exception {
            Object[] objArr = {this, obj};
            System.identityHashCode(this);
            b bVar = (b) objArr[0];
            Object obj2 = objArr[1];
            int iIdentityHashCode = System.identityHashCode(bVar);
            int i10 = ~iIdentityHashCode;
            int i11 = (((-1979694363) & i10) | (i10 ^ (-1979694363))) * (-192);
            int i12 = 1911966665 & i11;
            int i13 = (i11 | 1911966665) & (~i12);
            int i14 = i12 << 1;
            int i15 = (i13 & i14) + (i13 | i14);
            int i16 = (i10 | iIdentityHashCode) & i10;
            int i17 = (-1972220187) ^ i16;
            int i18 = i16 & (-1972220187);
            int i19 = ~(i17 | i18);
            int i20 = 1686409482 ^ i19;
            int i21 = i19 & 1686409482;
            int i22 = ((i21 & i20) | (i20 ^ i21)) * (-384);
            int i23 = (((~i22) & i15) | ((~i15) & i22)) + ((i22 & i15) << 1);
            int i24 = ((-1686409483) & i10) | (1686409482 & iIdentityHashCode);
            int i25 = (-1686409483) & iIdentityHashCode;
            int i26 = (i25 & i24) | (i24 ^ i25);
            int i27 = ~i26;
            int i28 = (i26 | i27) & i27;
            int i29 = (i18 & i17) | (i17 ^ i18);
            int i30 = (293284880 & i29) | ((~i29) & (-293284881));
            int i31 = i29 & (-293284881);
            int i32 = ~((i31 & i30) | (i30 ^ i31));
            int i33 = i28 & i32;
            int i34 = (i32 | i28) & (~i33);
            int i35 = (i34 & i33) | (i34 ^ i33);
            int i36 = (i10 & (-7474177)) | (7474176 & iIdentityHashCode);
            int i37 = iIdentityHashCode & (-7474177);
            int i38 = (i37 & i36) | (i36 ^ i37);
            int i39 = ~i38;
            int i40 = (i38 | i39) & i39;
            int i41 = i35 & i40;
            int i42 = (i40 | i35) & (~i41);
            int i43 = -(-(((i42 & i41) | (i42 ^ i41)) * 192));
            int i44 = (i23 ^ i43) + ((i43 & i23) << 1);
            int i45 = ~System.identityHashCode(bVar);
            int i46 = (i45 & (-1613787368)) | ((-1613787368) ^ i45);
            int i47 = ~i46;
            int i48 = ((1076908164 & i47) | (1076908164 ^ i47)) * (-241);
            int i49 = ((-1759771491) & i48) + (i48 | (-1759771491));
            int i50 = (i49 & 516335890) + (516335890 | i49);
            int i51 = (i47 & (-885468540)) | (885468539 & i46);
            int i52 = i46 & (-885468540);
            int i53 = (i52 & i51) | (i51 ^ i52);
            int i54 = ~i53;
            int i55 = (i53 | i54) & i54;
            int i56 = -(-(((i55 & (-1962376704)) | ((-1962376704) ^ i55)) * 241));
            int i57 = (i50 & i56) + (i56 | i50);
            bVar.f61690u0 = obj2;
            int i58 = bVar.f61691w0;
            if (i44 > i57) {
                int i59 = i58 ^ Integer.MIN_VALUE;
                int i60 = i58 & Integer.MIN_VALUE;
                bVar.f61691w0 = (i60 & i59) | (i59 ^ i60);
                writeObject writeobject = writeObject.this;
                return writeObject.setY(new Object[]{writeobject, null, null, null, null, null, bVar}, -1852746218, 1852746219, System.identityHashCode(writeobject));
            }
            int i61 = i58 & Integer.MIN_VALUE;
            int i62 = (i58 | Integer.MIN_VALUE) & (~i61);
            bVar.f61691w0 = (i62 & i61) | (i62 ^ i61);
            writeObject writeobject2 = writeObject.this;
            writeObject.setY(new Object[]{writeobject2, null, null, null, null, null, bVar}, -1852746218, 1852746219, System.identityHashCode(writeobject2));
            throw null;
        }
    }

    public /* synthetic */ class setCompoundDrawableTintBlendMode {
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[setMaxLines.values().length];
            iArr[setMaxLines.setOnFocusChangeListener.ordinal()] = 1;
            iArr[setMaxLines.setY.ordinal()] = 2;
            setOnFocusChangeListener = iArr;
            int i10 = ((-1) << 1) - ((0 - (-12)) ^ (-1));
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public writeObject(@NotNull CoroutineScope coroutineScope, @NotNull setTextKeepState settextkeepstate, @NotNull eu euVar, @NotNull setTop settop, @NotNull exceptionHandler exceptionhandler, @NotNull di diVar, @NotNull component10 component10Var, @NotNull setTop settop2, @NotNull setChildIndicator setchildindicator, @NotNull component17 component17Var, @NotNull setContentDescription setcontentdescription, @NotNull ij ijVar, @NotNull Function1<? super setTextColor, Unit> function1, @NotNull Function1<? super Exception, Unit> function2) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(euVar, "");
        Intrinsics.checkNotNullParameter(settop, "");
        Intrinsics.checkNotNullParameter(exceptionhandler, "");
        Intrinsics.checkNotNullParameter(diVar, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(settop2, "");
        Intrinsics.checkNotNullParameter(setchildindicator, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        Intrinsics.checkNotNullParameter(ijVar, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.f61666a = coroutineScope;
        this.f61667b = settextkeepstate;
        this.f61668c = euVar;
        this.f61669d = settop;
        this.f61670e = exceptionhandler;
        this.f61671f = diVar;
        this.f61672g = component10Var;
        this.f61673h = settop2;
        this.f61674i = setchildindicator;
        this.f61675j = component17Var;
        this.f61676k = setcontentdescription;
        this.f61677l = ijVar;
        this.m = function1;
        this.f61678n = function2;
    }

    public static /* synthetic */ Object a(Object[] objArr) throws Exception {
        writeObject writeobject = (writeObject) objArr[0];
        setAccessibilityPaneTitle setaccessibilitypanetitle = (setAccessibilityPaneTitle) objArr[1];
        setMaxLines setmaxlines = (setMaxLines) objArr[2];
        gz gzVar = (gz) objArr[3];
        me meVar = (me) objArr[4];
        getValue getvalue = (getValue) objArr[5];
        Continuation continuation = (Continuation) objArr[6];
        int i10 = f61664r;
        int i11 = (i10 ^ 39) + ((i10 & 39) << 1);
        f61665s = i11 % 128;
        Object[] objArr2 = new Object[8];
        if (i11 % 2 != 0) {
            objArr2[0] = writeobject;
            objArr2[1] = setaccessibilitypanetitle;
            objArr2[2] = setmaxlines;
            objArr2[3] = gzVar;
            objArr2[4] = meVar;
            objArr2[5] = getvalue;
            objArr2[6] = null;
            objArr2[7] = continuation;
            return setY(objArr2, -2063732872, 2063732879, System.identityHashCode(writeobject));
        }
        objArr2[0] = writeobject;
        objArr2[1] = setaccessibilitypanetitle;
        objArr2[2] = setmaxlines;
        objArr2[3] = gzVar;
        objArr2[4] = meVar;
        objArr2[5] = getvalue;
        objArr2[6] = null;
        objArr2[7] = continuation;
        setY(objArr2, -2063732872, 2063732879, System.identityHashCode(writeobject));
        throw null;
    }

    public static /* synthetic */ Object b(Object[] objArr) throws Exception {
        writeObject writeobject = (writeObject) objArr[0];
        setAccessibilityPaneTitle setaccessibilitypanetitle = (setAccessibilityPaneTitle) objArr[1];
        setMaxLines setmaxlines = (setMaxLines) objArr[2];
        gz gzVar = (gz) objArr[3];
        me meVar = (me) objArr[4];
        getValue getvalue = (getValue) objArr[5];
        setTextColor settextcolor = (setTextColor) objArr[6];
        Continuation continuation = (Continuation) objArr[7];
        int i10 = f61664r + 65;
        f61665s = i10 % 128;
        int i11 = i10 % 2;
        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
        SouthPacificEndpoint.setX(new Object[]{Integer.valueOf(CameraAccessExceptionCompat.CAMERA_CHARACTERISTICS_CREATION_ERROR), (getDetailsFieldTextSizeSp) getCause.setY(new Object[]{setmaxlines}, -464716334, 464716334, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, CameraAccessExceptionCompat.CAMERA_CHARACTERISTICS_CREATION_ERROR);
        startTransaction starttransaction = startTransaction.INSTANCE;
        setTouchDelegate settouchdelegate = setTouchDelegate.setY;
        eu euVar = writeobject.f61668c;
        setAdjustViewBounds setadjustviewbounds = writeobject.f61679o;
        Intrinsics.checkNotNull(setadjustviewbounds);
        values valuesVar = writeobject.f61680p;
        Intrinsics.checkNotNull(valuesVar);
        setPreferKeepClear setpreferkeepclear = (setPreferKeepClear) startTransaction.setY(new Object[]{settouchdelegate, euVar, setadjustviewbounds, valuesVar, settextcolor}, -306947982, 306947982, (int) System.currentTimeMillis());
        l lVar = (l) setPreferKeepClear.setY(new Object[]{setpreferkeepclear}, 1306238022, -1306238021, System.identityHashCode(setpreferkeepclear));
        if (lVar != null) {
            int i12 = f61664r + 67;
            f61665s = i12 % 128;
            if (i12 % 2 == 0) {
                setY(new Object[]{writeobject, lVar}, -1159289560, 1159289565, System.identityHashCode(writeobject));
                int i13 = 47 / 0;
            } else {
                setY(new Object[]{writeobject, lVar}, -1159289560, 1159289565, System.identityHashCode(writeobject));
            }
            int i14 = f61665s;
            int i15 = (i14 & (-64)) | ((~i14) & 63);
            int i16 = (i14 & 63) << 1;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            f61664r = i17 % 128;
            int i18 = i17 % 2;
        }
        if (!getvalue.setCompoundDrawableTintBlendMode()) {
            setHighlightColor sethighlightcolor = new setHighlightColor();
            eu euVar2 = writeobject.f61668c;
            fk fkVar = (fk) eu.setY(new Object[]{euVar2, sethighlightcolor, writeobject.f61667b}, 346138957, -346138957, System.identityHashCode(euVar2));
            if (fkVar == ek.a.getCOROUTINE_SUSPENDED()) {
                int i19 = f61664r;
                int i20 = i19 & 117;
                int i21 = (i19 ^ 117) | i20;
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f61665s = i22 % 128;
                int i23 = i22 % 2;
                return fkVar;
            }
            Unit unit = Unit.INSTANCE;
            int i24 = f61664r;
            int i25 = i24 ^ 97;
            int i26 = ((((i24 & 97) | i25) << 1) - (~(-i25))) - 1;
            f61665s = i26 % 128;
            int i27 = i26 % 2;
            return unit;
        }
        int i28 = setCompoundDrawableTintBlendMode.setOnFocusChangeListener[setmaxlines.ordinal()];
        if (i28 != 1 && i28 != 2) {
            throw new setIndeterminateDrawable(3017, null, null, 6, null);
        }
        Object y7 = setY(new Object[]{writeobject, setaccessibilitypanetitle, setmaxlines, gzVar, meVar, getvalue, continuation}, -1852746218, 1852746219, System.identityHashCode(writeobject));
        if (y7 == ek.a.getCOROUTINE_SUSPENDED()) {
            int i29 = f61664r + 107;
            f61665s = i29 % 128;
            if (i29 % 2 != 0) {
                return y7;
            }
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i30 = f61664r;
        int i31 = i30 & 15;
        int i32 = ((i30 ^ 15) | i31) << 1;
        int i33 = -((i30 | 15) & (~i31));
        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
        f61665s = i34 % 128;
        if (i34 % 2 == 0) {
            int i35 = 80 / 0;
        }
        return unit2;
    }

    public static /* synthetic */ Object c(Object[] objArr) throws Exception {
        writeObject writeobject = (writeObject) objArr[0];
        setAccessibilityPaneTitle setaccessibilitypanetitle = (setAccessibilityPaneTitle) objArr[1];
        gz gzVar = (gz) objArr[2];
        me meVar = (me) objArr[3];
        getValue getvalue = (getValue) objArr[4];
        Continuation continuation = (Continuation) objArr[5];
        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
        SouthPacificEndpoint.setX(new Object[]{Integer.valueOf(CameraAccessExceptionCompat.CAMERA_UNAVAILABLE_DO_NOT_DISTURB), new TerminalLogger(new getDetailsFieldTextSizeSp[]{getCause.setDividerPadding(meVar.setDividerPadding()), setLogo.setX(meVar.setCompoundDrawableTintBlendMode().setDividerPadding())}, null, 2, null), 4}, 1336485880, -1336485874, CameraAccessExceptionCompat.CAMERA_UNAVAILABLE_DO_NOT_DISTURB);
        if (meVar.setDividerPadding() == setTextLocales.setY) {
            eu euVar = writeobject.f61668c;
            fk fkVar = (fk) eu.setY(new Object[]{euVar, new setHighlightColor(), writeobject.f61667b}, -670989484, 670989485, System.identityHashCode(euVar));
            if (fkVar == ek.a.getCOROUTINE_SUSPENDED()) {
                int i10 = f61665s;
                int i11 = ((-1) << 1) - ((-1) ^ (((i10 | 18) << 1) - (i10 ^ 18)));
                f61664r = i11 % 128;
                int i12 = i11 % 2;
                return fkVar;
            }
            Unit unit = Unit.INSTANCE;
            int i13 = f61664r;
            int i14 = i13 & 73;
            int i15 = -(-((i13 ^ 73) | i14));
            int i16 = (i14 & i15) + (i15 | i14);
            f61665s = i16 % 128;
            if (i16 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        setShadowLayer setshadowlayer = new setShadowLayer(writeobject.f61670e);
        values valuesVar = (values) setShadowLayer.setDividerPadding(new Object[]{setshadowlayer, meVar}, 1207297972, -1207297972, System.identityHashCode(setshadowlayer));
        boolean zBooleanValue = ((Boolean) values.setY(new Object[]{valuesVar}, 83221832, -83221830, System.identityHashCode(valuesVar))).booleanValue();
        setTextKeepState settextkeepstate = writeobject.f61667b;
        eu euVar2 = writeobject.f61668c;
        if (zBooleanValue) {
            fk fkVar2 = (fk) eu.setY(new Object[]{euVar2, new setHighlightColor(), settextkeepstate}, 364221937, -364221935, System.identityHashCode(euVar2));
            if (fkVar2 == ek.a.getCOROUTINE_SUSPENDED()) {
                int i17 = f61664r + 91;
                f61665s = i17 % 128;
                int i18 = i17 % 2;
                return fkVar2;
            }
            Unit unit2 = Unit.INSTANCE;
            int i19 = f61664r + 62;
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            f61665s = i20 % 128;
            int i21 = i20 % 2;
            return unit2;
        }
        Unit unit3 = Unit.INSTANCE;
        writeobject.f61680p = valuesVar;
        writeobject.f61679o = new setAdjustViewBounds(getvalue, settextkeepstate, euVar2, writeobject.f61670e);
        Object y7 = setY(new Object[]{writeobject, setaccessibilitypanetitle, setMaxLines.setOnFocusChangeListener, gzVar, meVar, getvalue, continuation}, 1083414643, -1083414639, (int) System.currentTimeMillis());
        if (y7 == ek.a.getCOROUTINE_SUSPENDED()) {
            int i22 = f61665s;
            int i23 = ((i22 & 70) + (i22 | 70)) - 1;
            f61664r = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 49 / 0;
            }
            return y7;
        }
        Unit unit4 = Unit.INSTANCE;
        int i25 = f61664r;
        int i26 = (i25 & 97) + (i25 | 97);
        f61665s = i26 % 128;
        int i27 = i26 % 2;
        return unit4;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:51:0x039a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x039b  */
    public static /* synthetic */ Object d(Object[] objArr) {
        b bVar;
        b bVar2;
        component22 e5;
        getDetailsFieldTextColor getdetailsfieldtextcolor;
        Unit unit;
        int i10;
        int i11;
        int i12;
        writeObject writeobject = (writeObject) objArr[0];
        setAccessibilityPaneTitle setaccessibilitypanetitle = (setAccessibilityPaneTitle) objArr[1];
        setMaxLines setmaxlines = (setMaxLines) objArr[2];
        gz gzVar = (gz) objArr[3];
        me meVar = (me) objArr[4];
        getValue getvalue = (getValue) objArr[5];
        Continuation continuation = (Continuation) objArr[6];
        int i13 = f61665s;
        int i14 = i13 ^ 95;
        int i15 = -(-((i13 & 95) << 1));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        int i17 = i16 % 128;
        f61664r = i17;
        if (i16 % 2 != 0) {
            boolean z10 = continuation instanceof b;
            throw null;
        }
        if (!(continuation instanceof b) || (i12 = (i11 = (bVar = (b) continuation).f61691w0) & Integer.MIN_VALUE) == 0) {
            bVar = writeobject.new b(continuation);
            int i18 = f61665s;
            int i19 = i18 & 55;
            int i20 = i19 + ((i18 ^ 55) | i19);
            f61664r = i20 % 128;
            int i21 = i20 % 2;
        } else {
            int i22 = i17 | 79;
            int i23 = (i22 << 1) - ((~(i17 & 79)) & i22);
            f61665s = i23 % 128;
            int i24 = i23 % 2;
            bVar.f61691w0 = (((i11 ^ Integer.MIN_VALUE) | i12) << 1) - ((i11 | Integer.MIN_VALUE) & (~i12));
            int i25 = ((i17 & (-70)) | ((~i17) & 69)) + ((i17 & 69) << 1);
            f61665s = i25 % 128;
            int i26 = i25 % 2;
        }
        Object compoundDrawableTintBlendMode = bVar.f61690u0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i27 = bVar.f61691w0;
        if (i27 != 0) {
            if (i27 == 1) {
                getvalue = bVar.f61689t0;
                meVar = bVar.f61688s0;
                gzVar = bVar.f61687r0;
                setaccessibilitypanetitle = bVar.f61686q0;
                writeobject = bVar.f61685p0;
                try {
                    ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                    int i28 = f61665s;
                    int i29 = (i28 ^ 23) + ((i28 & 23) << 1);
                    f61664r = i29 % 128;
                    int i30 = i29 % 2;
                    bVar2 = bVar;
                } catch (component22 e7) {
                    e5 = e7;
                    bVar2 = bVar;
                    SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{10017, null, e5}, 1008224929, -1008224920, 10017);
                    SouthPacificEndpoint.setX(new Object[]{"Failed to select combination"}, -1166612213, 1166612217, (int) System.currentTimeMillis());
                    if (e5 instanceof TerminalCreationFailureCause) {
                        eu euVar = writeobject.f61668c;
                        int i31 = f61664r;
                        int i32 = i31 ^ 63;
                        int i33 = ((i31 & 63) | i32) << 1;
                        int i34 = -i32;
                        int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
                        f61665s = i35 % 128;
                        int i36 = i35 % 2;
                    }
                    getdetailsfieldtextcolor = null;
                }
            } else {
                if (i27 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i37 = f61665s;
                int i38 = i37 & 51;
                int i39 = (i38 - (~((i37 ^ 51) | i38))) - 1;
                f61664r = i39 % 128;
                int i40 = i39 % 2;
            }
            unit = Unit.INSTANCE;
            int i41 = f61665s;
            int i42 = i41 & 107;
            int i43 = -(-((i41 ^ 107) | i42));
            i10 = ((i42 | i43) << 1) - (i43 ^ i42);
            f61664r = i10 % 128;
            if (i10 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
        SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
        bVar2 = bVar;
        SouthPacificEndpoint.setX(new Object[]{Integer.valueOf(ConstantsKt.RESULT_CODE), (getDetailsFieldTextSizeSp) getCause.setY(new Object[]{setmaxlines}, -464716334, 464716334, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, ConstantsKt.RESULT_CODE);
        setForegroundTintMode setforegroundtintmode = setForegroundTintMode.INSTANCE;
        setForegroundTintMode.setX(new Object[]{"start entry point C"}, 1819518050, -1819518048, (int) System.currentTimeMillis());
        try {
            setAdjustViewBounds setadjustviewbounds = writeobject.f61679o;
            Intrinsics.checkNotNull(setadjustviewbounds);
            setClipToOutline setcliptooutline = (setClipToOutline) ((setAccessibilityPaneTitle.setY) setAccessibilityPaneTitle.setY(new Object[]{setaccessibilitypanetitle, Reflection.getOrCreateKotlinClass(setClipToOutline.class)}, 1735934812, -1735934811, System.identityHashCode(setaccessibilitypanetitle)));
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setClipToOutline.setOnFocusChangeListener(new Object[]{setcliptooutline}, -858335374, 858335378, System.identityHashCode(setcliptooutline));
            values valuesVar = writeobject.f61680p;
            Intrinsics.checkNotNull(valuesVar);
            bVar2.f61685p0 = writeobject;
            bVar2.f61686q0 = setaccessibilitypanetitle;
            bVar2.f61687r0 = gzVar;
            bVar2.f61688s0 = meVar;
            bVar2.f61689t0 = getvalue;
            bVar2.f61691w0 = 1;
            compoundDrawableTintBlendMode = setAdjustViewBounds.setCompoundDrawableTintBlendMode(new Object[]{setadjustviewbounds, setmaxlines, meVar, getbeeponfailure, valuesVar, bVar2}, -516459102, 516459115, (int) System.currentTimeMillis());
            if (compoundDrawableTintBlendMode == coroutine_suspended) {
                int i44 = f61664r + 29;
                int i45 = i44 % 128;
                f61665s = i45;
                int i46 = i44 % 2;
                int i47 = i45 + 39;
                f61664r = i47 % 128;
                int i48 = i47 % 2;
                return coroutine_suspended;
            }
        } catch (component22 e10) {
            e5 = e10;
            SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{10017, null, e5}, 1008224929, -1008224920, 10017);
            SouthPacificEndpoint.setX(new Object[]{"Failed to select combination"}, -1166612213, 1166612217, (int) System.currentTimeMillis());
            if (e5 instanceof TerminalCreationFailureCause) {
                eu euVar2 = writeobject.f61668c;
                int i310 = f61664r;
                int i311 = i310 ^ 63;
                int i312 = ((i310 & 63) | i311) << 1;
                int i313 = -i311;
                int i314 = ((i312 | i313) << 1) - (i312 ^ i313);
                f61665s = i314 % 128;
                int i315 = i314 % 2;
            }
            getdetailsfieldtextcolor = null;
        }
        getdetailsfieldtextcolor = (getDetailsFieldTextColor) compoundDrawableTintBlendMode;
        int i49 = f61665s;
        int i50 = i49 | 77;
        int i51 = i50 << 1;
        int i52 = -((~(i49 & 77)) & i50);
        int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
        f61664r = i53 % 128;
        int i54 = i53 % 2;
        setForegroundTintMode setforegroundtintmode2 = setForegroundTintMode.INSTANCE;
        setForegroundTintMode.setX(new Object[]{"finish entry point C"}, 1819518050, -1819518048, (int) System.currentTimeMillis());
        if (getdetailsfieldtextcolor == null) {
            Unit unit2 = Unit.INSTANCE;
            int i55 = f61664r;
            int i56 = i55 ^ 47;
            int i57 = (((i55 & 47) | i56) << 1) - i56;
            f61665s = i57 % 128;
            int i58 = i57 % 2;
            return unit2;
        }
        int i59 = f61665s;
        int i60 = (-2) - ((((i59 | 6) << 1) - (i59 ^ 6)) ^ (-1));
        f61664r = i60 % 128;
        int i61 = i60 % 2;
        values valuesVar2 = writeobject.f61680p;
        Intrinsics.checkNotNull(valuesVar2);
        setTitleMarginTop settitlemargintop = (setTitleMarginTop) getDetailsFieldTextColor.setX(new Object[]{getdetailsfieldtextcolor}, 870510485, -870510482, System.identityHashCode(getdetailsfieldtextcolor));
        Terminal terminal = (Terminal) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop}, 2113948533, -2113948530, System.identityHashCode(settitlemargintop));
        setTitleMarginTop settitlemargintop2 = (setTitleMarginTop) getDetailsFieldTextColor.setX(new Object[]{getdetailsfieldtextcolor}, 870510485, -870510482, System.identityHashCode(getdetailsfieldtextcolor));
        setFontFeatureSettings setfontfeaturesettings = (setFontFeatureSettings) values.setY(new Object[]{valuesVar2, terminal, (setBackgroundTintList) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop2}, 423062029, -423062025, System.identityHashCode(settitlemargintop2)), (md) getDetailsFieldTextColor.setX(new Object[]{getdetailsfieldtextcolor}, 1592202006, -1592202006, System.identityHashCode(getdetailsfieldtextcolor))}, -1159783560, 1159783561, System.identityHashCode(valuesVar2));
        if (setfontfeaturesettings == null) {
            SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{10018, null, 6}, 1336485880, -1336485874, 10018);
            setHighlightColor sethighlightcolor = new setHighlightColor();
            eu euVar3 = writeobject.f61668c;
            Unit unit3 = Unit.INSTANCE;
            int i62 = f61664r;
            int i63 = (i62 & (-102)) | ((~i62) & 101);
            int i64 = (i62 & 101) << 1;
            int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
            f61665s = i65 % 128;
            if (i65 % 2 == 0) {
                int i66 = 19 / 0;
            }
            return unit3;
        }
        bVar2.f61685p0 = null;
        bVar2.f61686q0 = null;
        bVar2.f61687r0 = null;
        bVar2.f61688s0 = null;
        bVar2.f61689t0 = null;
        bVar2.f61691w0 = 2;
        if (setY(new Object[]{writeobject, setaccessibilitypanetitle, gzVar, meVar, getvalue, getdetailsfieldtextcolor, setfontfeaturesettings}, -1436925701, 1436925715, System.identityHashCode(writeobject)) == coroutine_suspended) {
            int i67 = f61665s;
            int i68 = i67 & 85;
            int i69 = (i67 ^ 85) | i68;
            int i70 = (i68 & i69) + (i69 | i68);
            int i71 = i70 % 128;
            f61664r = i71;
            int i72 = i70 % 2;
            int i73 = i71 + 9;
            f61665s = i73 % 128;
            if (i73 % 2 != 0) {
                return coroutine_suspended;
            }
            throw null;
        }
        unit = Unit.INSTANCE;
        int i410 = f61665s;
        int i411 = i410 & 107;
        int i412 = -(-((i410 ^ 107) | i411));
        i10 = ((i411 | i412) << 1) - (i412 ^ i411);
        f61664r = i10 % 128;
        if (i10 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Boolean e(Object[] objArr) {
        boolean zBooleanValue;
        Exception exc = (Exception) objArr[0];
        int i10 = f61665s;
        int i11 = i10 & 123;
        int i12 = (i10 ^ 123) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        f61664r = i13 % 128;
        if (i13 % 2 != 0) {
            zBooleanValue = ((Boolean) setY(new Object[]{exc}, -1648183017, 1648183023, (int) System.currentTimeMillis())).booleanValue();
            int i14 = 80 / 0;
        } else {
            zBooleanValue = ((Boolean) setY(new Object[]{exc}, -1648183017, 1648183023, (int) System.currentTimeMillis())).booleanValue();
        }
        int i15 = f61664r;
        int i16 = i15 & 9;
        int i17 = (i16 - (~(-(-((i15 ^ 9) | i16))))) - 1;
        f61665s = i17 % 128;
        int i18 = i17 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    public static final /* synthetic */ Function1 setCompoundDrawableTintBlendMode(writeObject writeobject) {
        return (Function1) setY(new Object[]{writeobject}, -862316534, 862316545, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ setTextKeepState setX(writeObject writeobject) {
        return (setTextKeepState) setY(new Object[]{writeobject}, 1198895322, -1198895307, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0195  */
    /* JADX WARN: Code duplicated, block: B:33:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x0482  */
    /* JADX WARN: Code duplicated, block: B:66:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x04be  */
    /* JADX WARN: Code duplicated, block: B:9:0x00e9  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object obj;
        int i13;
        boolean z10;
        int i14;
        int i15;
        a aVar;
        Unit unit;
        int i16;
        switch ((((~(i10 | i12)) | (~i11)) * 529) + (((~((~i12) | i10)) | (~(i10 | i11))) * 529) + (i11 * 530) + (i10 * 530) + 1058) {
            case 1:
                return d(objArr);
            case 2:
                return e(objArr);
            case 3:
                obj = null;
                writeObject writeobject = (writeObject) objArr[0];
                GlobalEndpoint<setScrollBarDefaultDelayBeforeFade> globalEndpoint = (GlobalEndpoint) objArr[1];
                int i17 = f61664r;
                int i18 = i17 & 67;
                int i19 = ((i17 ^ 67) | i18) << 1;
                int i20 = -((i17 | 67) & (~i18));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                int i22 = i21 % 128;
                f61665s = i22;
                int i23 = i21 % 2;
                writeobject.f61681q = globalEndpoint;
                int i24 = i22 & 1;
                int i25 = i24 + ((i22 ^ 1) | i24);
                f61664r = i25 % 128;
                if (i25 % 2 != 0) {
                    int i26 = 46 / 0;
                }
                return obj;
            case 4:
                return a(objArr);
            case 5:
                ((writeObject) objArr[0]).m.invoke(new setTextColor(fd.UI_REQUEST, null, null, null, false, false, null, null, false, (l) objArr[1], null, false, null, null, 15870, null));
                int i27 = f61664r;
                int i28 = ((i27 | 99) << 1) - (((~i27) & 99) | (i27 & (-100)));
                f61665s = i28 % 128;
                if (i28 % 2 == 0) {
                    throw null;
                }
                return null;
            case 6:
                Exception exc = (Exception) objArr[0];
                int i29 = f61665s;
                int i30 = ((((i29 ^ 25) | (i29 & 25)) << 1) - (~(-((i29 & (-26)) | ((~i29) & 25))))) - 1;
                int i31 = i30 % 128;
                f61664r = i31;
                if (i30 % 2 != 0) {
                    boolean z11 = exc instanceof setScaleType;
                    throw null;
                }
                if (exc instanceof setScaleType) {
                    int i32 = i29 + 101;
                    f61664r = i32 % 128;
                    int i33 = i32 % 2;
                    obj = Boolean.TRUE;
                } else {
                    int i34 = (-2) - ((i31 + 108) ^ (-1));
                    f61665s = i34 % 128;
                    if (i34 % 2 == 0) {
                        throw null;
                    }
                    obj = Boolean.FALSE;
                }
                return obj;
            case 7:
                return b(objArr);
            case 8:
                return c(objArr);
            case 9:
                writeObject writeobject2 = (writeObject) objArr[0];
                int i35 = f61664r;
                int i36 = (i35 & 105) + (i35 | 105);
                int i37 = i36 % 128;
                f61665s = i37;
                int i38 = i36 % 2;
                GlobalEndpoint<setScrollBarDefaultDelayBeforeFade> globalEndpoint2 = writeobject2.f61681q;
                int i39 = (i37 & 103) + (i37 | 103);
                f61664r = i39 % 128;
                int i40 = i39 % 2;
                return globalEndpoint2;
            case 10:
                writeObject writeobject3 = (writeObject) objArr[0];
                int i41 = f61664r;
                int i42 = (i41 & (-76)) | ((~i41) & 75);
                int i43 = -(-((i41 & 75) << 1));
                int i44 = (i42 & i43) + (i43 | i42);
                int i45 = i44 % 128;
                f61665s = i45;
                int i46 = i44 % 2;
                eu euVar = writeobject3.f61668c;
                int i47 = ((i45 & (-42)) | ((~i45) & 41)) + ((i45 & 41) << 1);
                f61664r = i47 % 128;
                int i48 = i47 % 2;
                return euVar;
            case 11:
                writeObject writeobject4 = (writeObject) objArr[0];
                int i49 = f61665s;
                int i50 = i49 & 95;
                int i51 = (i49 | 95) & (~i50);
                int i52 = i50 << 1;
                int i53 = (i51 ^ i52) + ((i51 & i52) << 1);
                int i54 = i53 % 128;
                f61664r = i54;
                int i55 = i53 % 2;
                Function1<Exception, Unit> function1 = writeobject4.f61678n;
                if (i55 != 0) {
                    int i56 = 81 / 0;
                }
                int i57 = i54 + 53;
                f61665s = i57 % 128;
                int i58 = i57 % 2;
                return function1;
            case 12:
                getDetailsFieldTextColor getdetailsfieldtextcolor = (getDetailsFieldTextColor) objArr[0];
                me meVar = (me) objArr[1];
                setFontFeatureSettings setfontfeaturesettings = (setFontFeatureSettings) objArr[2];
                setMaxWidth setmaxwidth = new setMaxWidth();
                setScreenReaderFocusable setscreenreaderfocusable = (setScreenReaderFocusable) getDetailsFieldTextColor.setX(new Object[]{getdetailsfieldtextcolor}, -321474626, 321474627, System.identityHashCode(getdetailsfieldtextcolor));
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScreenReaderFocusable.setCompoundDrawableTintBlendMode(new Object[]{setscreenreaderfocusable}, 2060907440, -2060907440, System.identityHashCode(setscreenreaderfocusable));
                if (getbeeponfailure == null) {
                    throw new fh(9, null, 2, null);
                }
                ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, getbeeponfailure}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
                setMaxWidth.setX(new Object[]{setmaxwidth, meVar.setOnFocusChangeListener()}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                setTitleMarginTop settitlemargintop = (setTitleMarginTop) getDetailsFieldTextColor.setX(new Object[]{getdetailsfieldtextcolor}, 870510485, -870510482, System.identityHashCode(getdetailsfieldtextcolor));
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop}, -1710162922, 1710162922, System.identityHashCode(settitlemargintop));
                if (getbeeponfailure2 != null) {
                    int i59 = f61665s;
                    int i60 = i59 ^ 9;
                    int i61 = -(-((i59 & 9) << 1));
                    int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                    f61664r = i62 % 128;
                    if (i62 % 2 != 0) {
                        ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, getbeeponfailure2}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
                        int i63 = 17 / 0;
                    } else {
                        ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, getbeeponfailure2}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
                    }
                }
                cs csVar = (cs) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, -1608275827, 1608275837, System.identityHashCode(setfontfeaturesettings));
                if (csVar != null) {
                    int i64 = f61664r;
                    int i65 = (i64 ^ 45) + ((i64 & 45) << 1);
                    f61665s = i65 % 128;
                    int i66 = i65 % 2;
                    getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                    setAnimation setanimation = setAnimation.INSTANCE;
                    TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -692948779, 692948802, (int) System.currentTimeMillis());
                    ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), (byte[]) ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{csVar}, 252497730, -252497710, System.identityHashCode(csVar))).clone(), null, Boolean.FALSE, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
                    int i67 = f61664r + 80;
                    int i68 = (i67 ^ (-1)) + (i67 << 1);
                    f61665s = i68 % 128;
                    int i69 = i68 % 2;
                }
                setAnimation setanimation2 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -480651882, 480651889, System.identityHashCode(setmaxwidth));
                Intrinsics.checkNotNull(getbeeponfailure3);
                int i70 = f61665s;
                int i71 = i70 ^ 101;
                int i72 = -(-((i70 & 101) << 1));
                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                f61664r = i73 % 128;
                int i74 = i73 % 2;
                for (getBeepOnFailure getbeeponfailure4 : (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure3))) {
                    int i75 = f61665s;
                    int i76 = i75 & 13;
                    int i77 = (((i75 ^ 13) | i76) << 1) - ((i75 | 13) & (~i76));
                    f61664r = i77 % 128;
                    int i78 = i77 % 2;
                    setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, 865402441, -865402437, System.identityHashCode(getbeeponfailure4));
                    String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                    setAnimation setanimation3 = setAnimation.INSTANCE;
                    TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
                    if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3)))) {
                        int i79 = f61665s;
                        int i80 = i79 & 113;
                        int i81 = ((i79 ^ 113) | i80) << 1;
                        int i82 = -((i79 | 113) & (~i80));
                        int i83 = ((i81 | i82) << 1) - (i82 ^ i81);
                        int i84 = i83 % 128;
                        f61664r = i84;
                        if (i83 % 2 != 0) {
                            throw null;
                        }
                        int i85 = (((i84 | 55) << 1) - (~(-(((~i84) & 55) | (i84 & (-56)))))) - 1;
                        f61665s = i85 % 128;
                        int i86 = i85 % 2;
                        byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, 252497730, -252497710, System.identityHashCode(getbeeponfailure4));
                        TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], 80874758, -80874579, (int) System.currentTimeMillis());
                        ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4)), bArr, null, Boolean.FALSE, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
                        setTitleMarginTop settitlemargintop2 = (setTitleMarginTop) getDetailsFieldTextColor.setX(new Object[]{getdetailsfieldtextcolor}, 870510485, -870510482, System.identityHashCode(getdetailsfieldtextcolor));
                        ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop2}, 19241490, -19241481, System.identityHashCode(settitlemargintop2))}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
                        com.mypinpad.tsdk.isolation.a aVar2 = new com.mypinpad.tsdk.isolation.a(meVar.setDividerPadding(), setmaxwidth, null, null, null, 28, null);
                        int i87 = f61664r;
                        int i88 = i87 & 31;
                        int i89 = (i87 | 31) & (~i88);
                        int i90 = -(-(i88 << 1));
                        int i91 = (i89 & i90) + (i89 | i90);
                        f61665s = i91 % 128;
                        int i92 = i91 % 2;
                        return aVar2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 13:
                writeObject writeobject5 = (writeObject) objArr[0];
                int i93 = f61664r + 29;
                int i94 = i93 % 128;
                f61665s = i94;
                int i95 = i93 % 2;
                GlobalEndpoint<setScrollBarDefaultDelayBeforeFade> globalEndpoint3 = writeobject5.f61681q;
                if (globalEndpoint3 != null) {
                    int i96 = i94 ^ 37;
                    int i97 = -(-((i94 & 37) << 1));
                    int i98 = ((i96 | i97) << 1) - (i97 ^ i96);
                    f61664r = i98 % 128;
                    if (i98 % 2 != 0) {
                        int i99 = 23 / 0;
                        if (globalEndpoint3.setOnDragListener()) {
                            int i100 = f61664r;
                            int i101 = (i100 & (-18)) | ((~i100) & 17);
                            int i102 = -(-((i100 & 17) << 1));
                            int i103 = ((i101 | i102) << 1) - (i102 ^ i101);
                            f61665s = i103 % 128;
                            int i104 = i103 % 2;
                            setHighlightColor sethighlightcolor = new setHighlightColor();
                            eu euVar2 = writeobject5.f61668c;
                            int i105 = f61665s;
                            int i106 = i105 & 115;
                            int i107 = (i105 ^ 115) | i106;
                            int i108 = (i106 & i107) + (i107 | i106);
                            f61664r = i108 % 128;
                            int i109 = i108 % 2;
                        } else {
                            int i110 = f61664r;
                            int i111 = (i110 & 5) + (i110 | 5);
                            f61665s = i111 % 128;
                            int i112 = i111 % 2;
                            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                            SouthPacificEndpoint.setX(new Object[]{"Cancel transaction is not allowed"}, 818541572, -818541572, (int) System.currentTimeMillis());
                            int i113 = f61665s;
                            int i114 = i113 & 5;
                            int i115 = (i113 ^ 5) | i114;
                            i13 = ((i114 | i115) << 1) - (i115 ^ i114);
                            f61664r = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i116 = 65 / 0;
                            }
                        }
                    } else if (globalEndpoint3.setOnDragListener()) {
                        int i1010 = f61664r;
                        int i1011 = (i1010 & (-18)) | ((~i1010) & 17);
                        int i1012 = -(-((i1010 & 17) << 1));
                        int i1013 = ((i1011 | i1012) << 1) - (i1012 ^ i1011);
                        f61665s = i1013 % 128;
                        int i1014 = i1013 % 2;
                        setHighlightColor sethighlightcolor2 = new setHighlightColor();
                        eu euVar3 = writeobject5.f61668c;
                        int i1015 = f61665s;
                        int i1016 = i1015 & 115;
                        int i1017 = (i1015 ^ 115) | i1016;
                        int i1018 = (i1016 & i1017) + (i1017 | i1016);
                        f61664r = i1018 % 128;
                        int i1019 = i1018 % 2;
                    } else {
                        int i117 = f61664r;
                        int i118 = (i117 & 5) + (i117 | 5);
                        f61665s = i118 % 128;
                        int i119 = i118 % 2;
                        SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{"Cancel transaction is not allowed"}, 818541572, -818541572, (int) System.currentTimeMillis());
                        int i1110 = f61665s;
                        int i1111 = i1110 & 5;
                        int i1112 = (i1110 ^ 5) | i1111;
                        i13 = ((i1111 | i1112) << 1) - (i1112 ^ i1111);
                        f61664r = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i1113 = 65 / 0;
                        }
                    }
                } else {
                    int i10110 = f61664r;
                    int i10111 = (i10110 & (-18)) | ((~i10110) & 17);
                    int i10112 = -(-((i10110 & 17) << 1));
                    int i10113 = ((i10111 | i10112) << 1) - (i10112 ^ i10111);
                    f61665s = i10113 % 128;
                    int i10114 = i10113 % 2;
                    setHighlightColor sethighlightcolor3 = new setHighlightColor();
                    eu euVar4 = writeobject5.f61668c;
                    int i10115 = f61665s;
                    int i10116 = i10115 & 115;
                    int i10117 = (i10115 ^ 115) | i10116;
                    int i10118 = (i10116 & i10117) + (i10117 | i10116);
                    f61664r = i10118 % 128;
                    int i10119 = i10118 % 2;
                }
                return null;
            case 14:
                writeObject writeobject6 = (writeObject) objArr[0];
                setAccessibilityPaneTitle setaccessibilitypanetitle = (setAccessibilityPaneTitle) objArr[1];
                gz gzVar = (gz) objArr[2];
                me meVar2 = (me) objArr[3];
                getValue getvalue = (getValue) objArr[4];
                getDetailsFieldTextColor getdetailsfieldtextcolor2 = (getDetailsFieldTextColor) objArr[5];
                setFontFeatureSettings setfontfeaturesettings2 = (setFontFeatureSettings) objArr[6];
                int i120 = (-2) - ((f61664r + 74) ^ (-1));
                f61665s = i120 % 128;
                int i121 = i120 % 2;
                setClipToOutline setcliptooutline = (setClipToOutline) ((setAccessibilityPaneTitle.setY) setAccessibilityPaneTitle.setY(new Object[]{setaccessibilitypanetitle, Reflection.getOrCreateKotlinClass(setClipToOutline.class)}, 1735934812, -1735934811, System.identityHashCode(setaccessibilitypanetitle)));
                if (((getBeepOnFailure) setClipToOutline.setOnFocusChangeListener(new Object[]{setcliptooutline}, -858335374, 858335378, System.identityHashCode(setcliptooutline))) != null) {
                    int i122 = f61665s;
                    int i123 = i122 & 77;
                    int i124 = (~i123) & (i122 | 77);
                    int i125 = -(-(i123 << 1));
                    int i126 = (i124 & i125) + (i125 | i124);
                    f61664r = i126 % 128;
                    int i127 = i126 % 2;
                    int i128 = i122 + 71;
                    f61664r = i128 % 128;
                    int i129 = i128 % 2;
                    z10 = true;
                } else {
                    int i130 = (-2) - ((f61664r + 124) ^ (-1));
                    f61665s = i130 % 128;
                    int i131 = i130 % 2;
                    z10 = false;
                }
                SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{10004, (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(z10)}, -772901588, 772901588, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 10004);
                if (z10) {
                    i14 = 2;
                    i15 = 3;
                } else {
                    int i132 = f61664r;
                    int i133 = (i132 & (-92)) | ((~i132) & 91);
                    int i134 = (91 & i132) << 1;
                    int i135 = ((i133 | i134) << 1) - (i134 ^ i133);
                    f61665s = i135 % 128;
                    int i136 = i135 % 2;
                    setTop settop = writeobject6.f61669d;
                    setTitleMarginTop settitlemargintop3 = (setTitleMarginTop) getDetailsFieldTextColor.setX(new Object[]{getdetailsfieldtextcolor2}, 870510485, -870510482, System.identityHashCode(getdetailsfieldtextcolor2));
                    Terminal terminal = (Terminal) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop3}, 2113948533, -2113948530, System.identityHashCode(settitlemargintop3));
                    md mdVar = (md) getDetailsFieldTextColor.setX(new Object[]{getdetailsfieldtextcolor2}, 1592202006, -1592202006, System.identityHashCode(getdetailsfieldtextcolor2));
                    setTitleMarginTop settitlemargintop4 = (setTitleMarginTop) getDetailsFieldTextColor.setX(new Object[]{getdetailsfieldtextcolor2}, 870510485, -870510482, System.identityHashCode(getdetailsfieldtextcolor2));
                    settop.setCompoundDrawableTintBlendMode(terminal, mdVar, (setBackgroundTintList) setTitleMarginTop.setDividerPadding(new Object[]{settitlemargintop4}, 423062029, -423062025, System.identityHashCode(settitlemargintop4)));
                    setSubtitleTextColor setsubtitletextcolor = setSubtitleTextColor.INSTANCE;
                    setY(new Object[]{writeobject6, (GlobalEndpoint) setSubtitleTextColor.setDividerPadding(new Object[]{writeobject6.f61667b, setaccessibilitypanetitle, gzVar, meVar2, getvalue, writeobject6.f61671f, writeobject6.f61672g, writeobject6.f61673h, writeobject6.f61674i, writeobject6.f61675j, writeobject6.f61676k, getdetailsfieldtextcolor2, setfontfeaturesettings2, writeobject6.f61677l}, -2104124925, 2104124925, (int) System.currentTimeMillis())}, -1128570737, 1128570740, System.identityHashCode(writeobject6));
                    int i137 = f61665s;
                    int i138 = ((i137 | 33) << 1) - (i137 ^ 33);
                    f61664r = i138 % 128;
                    i14 = 2;
                    int i139 = i138 % 2;
                    i15 = 3;
                }
                Object[] objArr2 = new Object[i15];
                objArr2[0] = getdetailsfieldtextcolor2;
                objArr2[1] = meVar2;
                objArr2[i14] = setfontfeaturesettings2;
                com.mypinpad.tsdk.isolation.a aVar3 = (com.mypinpad.tsdk.isolation.a) setY(objArr2, 200242874, -200242862, (int) System.currentTimeMillis());
                setTextKeepState settextkeepstate = writeobject6.f61667b;
                Object[] objArr3 = new Object[i14];
                objArr3[0] = settextkeepstate;
                objArr3[1] = aVar3;
                setTextKeepState.setCompoundDrawableTintBlendMode(objArr3, 565642854, -565642852, System.identityHashCode(settextkeepstate));
                BuildersKt__Builders_commonKt.launch$default(writeobject6.f61666a, null, null, new o00(z10, writeobject6, null), 3, null);
                setForegroundTintMode setforegroundtintmode = setForegroundTintMode.INSTANCE;
                setForegroundTintMode.setX(new Object[]{"finish entry point D"}, 1819518050, -1819518048, (int) System.currentTimeMillis());
                SouthPacificEndpoint.setX(new Object[]{10019, null, 6}, 1336485880, -1336485874, 10019);
                obj = Unit.INSTANCE;
                int i140 = f61664r;
                int i141 = i140 & 113;
                int i142 = (i140 ^ 113) | i141;
                int i143 = (i141 & i142) + (i142 | i141);
                f61665s = i143 % 128;
                if (i143 % 2 == 0) {
                    throw null;
                }
                return obj;
            case 15:
                writeObject writeobject7 = (writeObject) objArr[0];
                int i144 = f61665s;
                int i145 = (i144 & 121) + (i144 | 121);
                int i146 = i145 % 128;
                f61664r = i146;
                int i147 = i145 % 2;
                setTextKeepState settextkeepstate2 = writeobject7.f61667b;
                int i148 = (i146 & 69) + (i146 | 69);
                f61665s = i148 % 128;
                int i149 = i148 % 2;
                return settextkeepstate2;
            case 16:
                writeObject writeobject8 = (writeObject) objArr[0];
                int i150 = f61665s;
                int i151 = (-2) - (((i150 & 92) + (i150 | 92)) ^ (-1));
                int i152 = i151 % 128;
                f61664r = i152;
                int i153 = i151 % 2;
                writeobject8.f61681q = null;
                int i154 = ((i152 | 1) << 1) - (i152 ^ 1);
                f61665s = i154 % 128;
                if (i154 % 2 == 0) {
                    throw null;
                }
                return null;
            default:
                writeObject writeobject9 = (writeObject) objArr[0];
                Continuation continuation = (Continuation) objArr[1];
                int i155 = f61665s;
                int i156 = (-2) - ((i155 + 8) ^ (-1));
                f61664r = i156 % 128;
                int i157 = i156 % 2;
                if (continuation instanceof a) {
                    int i158 = i155 & 33;
                    int i159 = i158 + ((i155 ^ 33) | i158);
                    int i160 = i159 % 128;
                    f61664r = i160;
                    int i161 = i159 % 2;
                    aVar = (a) continuation;
                    int i162 = aVar.f61684r0;
                    if ((i162 & Integer.MIN_VALUE) != 0) {
                        int i163 = i160 ^ 91;
                        int i164 = (91 & i160) << 1;
                        int i165 = ((i163 | i164) << 1) - (i163 ^ i164);
                        f61665s = i165 % 128;
                        int i166 = i165 % 2;
                        int iIdentityHashCode = System.identityHashCode(writeobject9);
                        int i167 = -(-(i162 * (-575)));
                        int i168 = Integer.MIN_VALUE & i167;
                        int i169 = i168 + ((i167 ^ Integer.MIN_VALUE) | i168);
                        int i170 = ~i162;
                        int i171 = ~i170;
                        int i172 = Integer.MAX_VALUE & i170;
                        int i173 = (~i172) & (Integer.MAX_VALUE | i170);
                        int i174 = ~((i173 ^ i172) | (i173 & i172));
                        int i175 = i170 & (i170 | i162);
                        int i176 = ~((i175 ^ iIdentityHashCode) | (i175 & iIdentityHashCode));
                        int i177 = i174 ^ i176;
                        int i178 = i174 & i176;
                        int i179 = ((i177 & i178) | (i177 ^ i178)) * 576;
                        int i180 = i169 ^ i179;
                        int i181 = ((i179 & i169) | i180) << 1;
                        int i182 = -i180;
                        int i183 = (i181 & i182) + (i181 | i182);
                        int i184 = ~((Integer.MAX_VALUE ^ i162) | (Integer.MAX_VALUE & i162));
                        int i185 = ~iIdentityHashCode;
                        int i186 = (iIdentityHashCode | i185) & i185;
                        int i187 = (i186 & i170) | (i170 ^ i186);
                        int i188 = ~((i187 & Integer.MIN_VALUE) | (i187 ^ Integer.MIN_VALUE));
                        int i189 = ((~i188) & i184) | ((~i184) & i188);
                        int i190 = i188 & i184;
                        int i191 = ((i190 & i189) | (i189 ^ i190)) * 576;
                        int i192 = i183 ^ i191;
                        int i193 = ((((i191 & i183) | i192) << 1) - (~(-i192))) - 1;
                        int i194 = (Integer.MAX_VALUE & i171) | (i170 & Integer.MIN_VALUE);
                        int i195 = (~((i172 & i194) | (i194 ^ i172))) * 576;
                        aVar.f61684r0 = (i193 & i195) + (i195 | i193);
                        int i196 = (-2) - ((f61665s + 16) ^ (-1));
                        f61664r = i196 % 128;
                        int i197 = i196 % 2;
                    } else {
                        aVar = writeobject9.new a(continuation);
                        int i198 = f61665s;
                        int i199 = ((i198 | 103) << 1) - (i198 ^ 103);
                        f61664r = i199 % 128;
                        int i200 = i199 % 2;
                    }
                } else {
                    aVar = writeobject9.new a(continuation);
                    int i1910 = f61665s;
                    int i1911 = ((i1910 | 103) << 1) - (i1910 ^ 103);
                    f61664r = i1911 % 128;
                    int i201 = i1911 % 2;
                }
                Object obj2 = aVar.f61682p0;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i202 = aVar.f61684r0;
                if (i202 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    GlobalEndpoint globalEndpoint4 = (GlobalEndpoint) setY(new Object[]{writeobject9}, 689440187, -689440178, System.identityHashCode(writeobject9));
                    if (globalEndpoint4 == null) {
                        int i203 = f61665s;
                        int i204 = i203 & 115;
                        int i205 = (i204 - (~(-(-((i203 ^ 115) | i204))))) - 1;
                        f61664r = i205 % 128;
                        if (i205 % 2 != 0) {
                            int i206 = 11 / 0;
                        }
                        unit = null;
                    } else {
                        eu euVar5 = writeobject9.f61668c;
                        aVar.f61684r0 = 1;
                        if (GlobalEndpoint.setCompoundDrawableTintBlendMode(new Object[]{globalEndpoint4, euVar5, aVar}, -489857506, 489857518, System.identityHashCode(globalEndpoint4)) == coroutine_suspended) {
                            int i207 = f61664r + 121;
                            f61665s = i207 % 128;
                            if (i207 % 2 != 0) {
                                return coroutine_suspended;
                            }
                            throw null;
                        }
                    }
                    if (unit != null) {
                        throw new setIndeterminateDrawable(3034, null, null, 6, null);
                    }
                    obj = Unit.INSTANCE;
                    int i208 = f61665s;
                    int i209 = (i208 & (-32)) | ((~i208) & 31);
                    int i210 = (i208 & 31) << 1;
                    i16 = (i209 & i210) + (i210 | i209);
                    f61664r = i16 % 128;
                    if (i16 % 2 != 0) {
                        int i211 = 41 / 0;
                    }
                    return obj;
                }
                if (i202 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
                int i212 = f61664r;
                int i213 = i212 & 27;
                int i214 = ((i212 | 27) & (~i213)) + (i213 << 1);
                f61665s = i214 % 128;
                int i215 = i214 % 2;
                unit = Unit.INSTANCE;
                int i216 = f61664r;
                int i217 = i216 ^ 97;
                int i218 = ((i216 & 97) | i217) << 1;
                int i219 = -i217;
                int i220 = (i218 & i219) + (i218 | i219);
                f61665s = i220 % 128;
                int i221 = i220 % 2;
                if (unit != null) {
                    throw new setIndeterminateDrawable(3034, null, null, 6, null);
                }
                obj = Unit.INSTANCE;
                int i2010 = f61665s;
                int i2011 = (i2010 & (-32)) | ((~i2010) & 31);
                int i2110 = (i2010 & 31) << 1;
                i16 = (i2011 & i2110) + (i2110 | i2011);
                f61664r = i16 % 128;
                if (i16 % 2 != 0) {
                    int i2111 = 41 / 0;
                }
                return obj;
        }
    }

    @Nullable
    public final Object setDividerPadding(@NotNull setAccessibilityPaneTitle setaccessibilitypanetitle, @NotNull setMaxLines setmaxlines, @NotNull gz gzVar, @NotNull me meVar, @NotNull getValue getvalue, @Nullable setTextColor settextcolor, @NotNull Continuation<? super Unit> continuation) {
        return setY(new Object[]{this, setaccessibilitypanetitle, setmaxlines, gzVar, meVar, getvalue, settextcolor, continuation}, -2063732872, 2063732879, System.identityHashCode(this));
    }

    @Nullable
    public final GlobalEndpoint<setScrollBarDefaultDelayBeforeFade> setX() {
        return (GlobalEndpoint) setY(new Object[]{this}, 689440187, -689440178, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode() throws Exception {
        setY(new Object[]{this}, 2144918328, -2144918312, System.identityHashCode(this));
    }

    @Nullable
    public final Object setCompoundDrawableTintBlendMode(@NotNull setAccessibilityPaneTitle setaccessibilitypanetitle, @NotNull setMaxLines setmaxlines, @NotNull gz gzVar, @NotNull me meVar, @NotNull getValue getvalue, @NotNull Continuation<? super Unit> continuation) {
        return setY(new Object[]{this, setaccessibilitypanetitle, setmaxlines, gzVar, meVar, getvalue, continuation}, -1852746218, 1852746219, System.identityHashCode(this));
    }

    public static final /* synthetic */ eu setY(writeObject writeobject) {
        return (eu) setY(new Object[]{writeobject}, -1863028640, 1863028650, (int) System.currentTimeMillis());
    }

    @Nullable
    public final Object setY(@NotNull Continuation<? super Unit> continuation) {
        return setY(new Object[]{this, continuation}, 208139506, -208139506, System.identityHashCode(this));
    }

    public final void setY() throws Exception {
        setY(new Object[]{this}, -551133523, 551133536, System.identityHashCode(this));
    }

    @Nullable
    public final Object setY(@NotNull setAccessibilityPaneTitle setaccessibilitypanetitle, @NotNull gz gzVar, @NotNull me meVar, @NotNull getValue getvalue, @NotNull Continuation<? super Unit> continuation) {
        return setY(new Object[]{this, setaccessibilitypanetitle, gzVar, meVar, getvalue, continuation}, 1915045663, -1915045655, System.identityHashCode(this));
    }
}
