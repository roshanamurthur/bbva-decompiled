package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ir extends is {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f56521h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56522i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final getValue f56523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final iq f56524g;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ir f56525p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f56526q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f56528s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object[] objArr = {this, obj};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            aVar.f56526q0 = objArr[1];
            int i10 = aVar.f56528s0;
            int i11 = i10 & Integer.MIN_VALUE;
            int i12 = (i10 | Integer.MIN_VALUE) & (~i11);
            aVar.f56528s0 = (i12 & i11) | (i12 ^ i11);
            ir irVar = ir.this;
            return ir.setDividerPadding(new Object[]{irVar, aVar}, 1822943980, -1822943975, System.identityHashCode(irVar));
        }
    }

    public /* synthetic */ class setDividerPadding {
        public static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[setRotationY.values().length];
            iArr[setRotationY.setCompoundDrawableTintBlendMode.ordinal()] = 1;
            iArr[setRotationY.setDividerPadding.ordinal()] = 2;
            setX = iArr;
            int i10 = (1 & 2) + (1 | 2);
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            int i12 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir(@NotNull im imVar, @NotNull setTextKeepState settextkeepstate, @NotNull iu iuVar, @NotNull getValue getvalue, @NotNull di diVar, @NotNull component10 component10Var, @NotNull setContentDescription setcontentdescription) {
        super(imVar, settextkeepstate, iuVar);
        Intrinsics.checkNotNullParameter(imVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(iuVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(diVar, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56523f = getvalue;
        this.f56524g = new iq(imVar, settextkeepstate, iuVar, diVar, component10Var, setcontentdescription);
    }

    public static /* synthetic */ fk a(Object[] objArr) {
        ir irVar = (ir) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i10 = f56522i;
        int i11 = (((i10 ^ 63) | (i10 & 63)) << 1) - (((~i10) & 63) | (i10 & (-64)));
        f56521h = i11 % 128;
        byte[] x4 = null;
        if (i11 % 2 != 0) {
            irVar.setX();
            irVar.setOnFocusChangeListener();
            irVar.setCompoundDrawableTintBlendMode();
            getEmvLibVersion.Companion companion = getEmvLibVersion.INSTANCE;
            throw null;
        }
        iu x6 = irVar.setX();
        im onFocusChangeListener = irVar.setOnFocusChangeListener();
        setTextKeepState compoundDrawableTintBlendMode = irVar.setCompoundDrawableTintBlendMode();
        getEmvLibVersion.Companion companion2 = getEmvLibVersion.INSTANCE;
        getEmvLibVersion getemvlibversion = (getEmvLibVersion) getEmvLibVersion.Companion.setOnFocusChangeListener(new Object[]{bArr}, 617595066, -617595066, (int) System.currentTimeMillis());
        if (getemvlibversion == null) {
            int i12 = f56522i;
            int i13 = i12 | 33;
            int i14 = i12 & 33;
            int i15 = (i13 << 1) - ((~i14) & i13);
            f56521h = i15 % 128;
            int i16 = i15 % 2;
            int i17 = (i14 - (~(-(-i13)))) - 1;
            f56521h = i17 % 128;
            int i18 = i17 % 2;
        } else {
            x4 = getemvlibversion.setX();
            int i19 = f56521h;
            int i20 = (i19 & (-26)) | ((~i19) & 25);
            int i21 = -(-((i19 & 25) << 1));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f56522i = i22 % 128;
            int i23 = i22 % 2;
        }
        fk fkVar = (fk) iu.setX(new Object[]{x6, onFocusChangeListener, compoundDrawableTintBlendMode, x4}, 1792429075, -1792429064, System.identityHashCode(x6));
        int i24 = f56521h;
        int i25 = i24 & 123;
        int i26 = ((i24 ^ 123) | i25) << 1;
        int i27 = -((i24 | 123) & (~i25));
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        f56522i = i28 % 128;
        int i29 = i28 % 2;
        return fkVar;
    }

    public static /* synthetic */ fk b(Object[] objArr) {
        byte[] x4;
        ir irVar = (ir) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i10 = f56522i;
        int i11 = i10 & 93;
        int i12 = (i10 | 93) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        f56521h = i14 % 128;
        int i15 = i14 % 2;
        iu x6 = irVar.setX();
        im onFocusChangeListener = irVar.setOnFocusChangeListener();
        setTextKeepState compoundDrawableTintBlendMode = irVar.setCompoundDrawableTintBlendMode();
        getEmvLibVersion.Companion companion = getEmvLibVersion.INSTANCE;
        getEmvLibVersion getemvlibversion = (getEmvLibVersion) getEmvLibVersion.Companion.setOnFocusChangeListener(new Object[]{bArr}, 617595066, -617595066, (int) System.currentTimeMillis());
        if (getemvlibversion == null) {
            int i16 = f56522i;
            int i17 = i16 ^ 75;
            int i18 = (i16 & 75) << 1;
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            f56521h = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 5 / 0;
            }
            x4 = null;
        } else {
            x4 = getemvlibversion.setX();
            int i21 = f56522i;
            int i22 = (i21 & (-106)) | ((~i21) & 105);
            int i23 = (i21 & 105) << 1;
            int i24 = (i22 & i23) + (i23 | i22);
            f56521h = i24 % 128;
            int i25 = i24 % 2;
        }
        fk fkVar = (fk) iu.setX(new Object[]{x6, onFocusChangeListener, compoundDrawableTintBlendMode, x4}, 1792429075, -1792429064, System.identityHashCode(x6));
        int i26 = f56521h;
        int i27 = i26 & 77;
        int i28 = (i26 ^ 77) | i27;
        int i29 = (i27 & i28) + (i28 | i27);
        f56522i = i29 % 128;
        if (i29 % 2 != 0) {
            return fkVar;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0114  */
    /* JADX WARN: Code duplicated, block: B:69:0x0649  */
    /* JADX WARN: Code duplicated, block: B:71:0x0663  */
    /* JADX WARN: Code duplicated, block: B:72:0x0693  */
    /* JADX WARN: Code duplicated, block: B:76:0x06c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x06c9  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x055c, code lost:
    
        if ((!((java.lang.Boolean) com.mypinpad.tsdk.isolation.cr.setDividerPadding(new java.lang.Object[]{r0}, -426527980, 426527990, java.lang.System.identityHashCode(r0))).booleanValue()) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x058c, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.cr.setDividerPadding(new java.lang.Object[]{r0}, -426527980, 426527990, java.lang.System.identityHashCode(r0))).booleanValue() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x058e, code lost:
    
        r7.f60980p0 = r1;
        r7.f60983s0 = 1;
        r3 = new java.lang.Object[2];
        r3[r5] = r1;
        r3[1] = r7;
        r0 = setDividerPadding(r3, 768298982, -768298970, java.lang.System.identityHashCode(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x05a7, code lost:
    
        if (r0 != r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x05a9, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.ir.f56521h;
        r3 = r0 & 39;
        r1 = ((r0 ^ 39) | r3) << 1;
        r3 = -((~r3) & (r0 | 39));
        r2 = ((r1 | r3) << 1) - (r1 ^ r3);
        com.mypinpad.tsdk.isolation.ir.f56522i = r2 % 128;
        r2 = r2 % 2;
        r0 = r0 + 91;
        com.mypinpad.tsdk.isolation.ir.f56522i = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x05c9, code lost:
    
        if ((r0 % 2) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x05cb, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x05cd, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object c(java.lang.Object[] r25) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ir.c(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0681  */
    /* JADX WARN: Code duplicated, block: B:112:0x075f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0778  */
    /* JADX WARN: Code duplicated, block: B:116:0x0789  */
    /* JADX WARN: Code duplicated, block: B:117:0x079b  */
    /* JADX WARN: Code duplicated, block: B:119:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:122:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:124:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:126:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:127:0x0822  */
    /* JADX WARN: Code duplicated, block: B:133:0x084a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0927  */
    /* JADX WARN: Code duplicated, block: B:154:0x0972  */
    /* JADX WARN: Code duplicated, block: B:155:0x0976  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0157 A[PHI: r2
      0x0157: PHI (r2v131 com.mypinpad.tsdk.i.getBeepOnFailure) = (r2v130 com.mypinpad.tsdk.i.getBeepOnFailure), (r2v161 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:17:0x0155, B:14:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:22:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:24:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:26:0x021b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0246  */
    /* JADX WARN: Code duplicated, block: B:29:0x0277  */
    /* JADX WARN: Code duplicated, block: B:34:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x0581  */
    /* JADX WARN: Code duplicated, block: B:71:0x058c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0599  */
    /* JADX WARN: Code duplicated, block: B:74:0x059d  */
    /* JADX WARN: Code duplicated, block: B:78:0x05c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x05c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:81:0x05de  */
    /* JADX WARN: Code duplicated, block: B:83:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x0604  */
    /* JADX WARN: Code duplicated, block: B:89:0x0615  */
    /* JADX WARN: Code duplicated, block: B:92:0x0636 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0638  */
    /* JADX WARN: Code duplicated, block: B:96:0x065e  */
    /* JADX WARN: Code duplicated, block: B:97:0x065f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0665  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        av avVar;
        setText settext;
        int i13;
        Object x4;
        int i14;
        cr crVar;
        int i15;
        a aVar;
        Object compoundDrawableTintBlendMode;
        Object coroutine_suspended;
        int i16;
        int i17;
        setRotationX setrotationx;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        getBeepOnFailure getbeeponfailure;
        List listListOf;
        ah ahVar;
        int i23;
        int i24;
        an anVar;
        int i25;
        int i26 = (i11 * 517) + (i10 * (-515));
        int i27 = ~i11;
        int i28 = ~(i27 | i12);
        int i29 = ~i12;
        int i30 = i28 | (~(i29 | i10));
        int i31 = ~(i29 | i11);
        int i32 = ~i10;
        switch ((((~(i32 | i11)) | i31) * LibMCryptConstants.IND_HEX_SEGMENTO2) + (((~(i12 | i27 | i32)) | (~(i32 | i29 | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2) + ((i30 | i31) * (-516)) + i26) {
            case 1:
                return a(objArr);
            case 2:
                return b(objArr);
            case 3:
                ir irVar = (ir) objArr[0];
                int i33 = f56521h;
                int i34 = i33 & 65;
                int i35 = (((i33 ^ 65) | i34) << 1) - ((i33 | 65) & (~i34));
                f56522i = i35 % 128;
                if (i35 % 2 == 0) {
                    im onFocusChangeListener = irVar.setOnFocusChangeListener();
                    throw null;
                }
                im onFocusChangeListener2 = irVar.setOnFocusChangeListener();
                ah ahVar2 = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener2}, 1437547358, -1437547304, System.identityHashCode(onFocusChangeListener2));
                if (ahVar2 == null) {
                    int i36 = f56522i;
                    int i37 = i36 & 37;
                    int i38 = (i36 ^ 37) | i37;
                    int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
                    f56521h = i39 % 128;
                    int i40 = i39 % 2;
                } else {
                    an anVar2 = (an) ((setImageTintList) w.setX(new Object[]{ahVar2}, 1693919772, -1693919769, System.identityHashCode(ahVar2)));
                    if (anVar2 != null) {
                        List<av> navigationOnClickListener = anVar2.setNavigationOnClickListener();
                        if (navigationOnClickListener == null) {
                            int i41 = f56522i;
                            int i42 = i41 ^ 77;
                            int i43 = ((i41 & 77) | i42) << 1;
                            int i44 = -i42;
                            int i45 = (i43 & i44) + (i43 | i44);
                            f56521h = i45 % 128;
                            if (i45 % 2 != 0) {
                                throw null;
                            }
                        } else {
                            avVar = (av) CollectionsKt___CollectionsKt.firstOrNull((List) navigationOnClickListener);
                            int i46 = f56522i;
                            int i47 = i46 & 43;
                            int i48 = ((((i46 ^ 43) | i47) << 1) - (~(-((i46 | 43) & (~i47))))) - 1;
                            f56521h = i48 % 128;
                            int i49 = i48 % 2;
                        }
                        if (avVar != null) {
                            throw new fh(45, null, 2, null);
                        }
                        settext = new setText(((Byte) av.setY(new Object[]{avVar}, -888174800, 888174800, System.identityHashCode(avVar))).byteValue(), ((Byte) av.setY(new Object[]{avVar}, 1262930435, -1262930433, System.identityHashCode(avVar))).byteValue());
                        int i50 = f56522i;
                        int i51 = (i50 & (-114)) | ((~i50) & 113);
                        int i52 = (i50 & 113) << 1;
                        i13 = (i51 & i52) + (i52 | i51);
                        f56521h = i13 % 128;
                        if (i13 % 2 != 0) {
                            return settext;
                        }
                        int i53 = 95 / 0;
                        return settext;
                    }
                    int i54 = f56521h + 47;
                    int i55 = i54 % 128;
                    f56522i = i55;
                    int i56 = i54 % 2;
                    int i57 = (((i55 ^ 119) | (i55 & 119)) << 1) - (((~i55) & 119) | (i55 & (-120)));
                    f56521h = i57 % 128;
                    int i58 = i57 % 2;
                }
                avVar = null;
                if (avVar != null) {
                    throw new fh(45, null, 2, null);
                }
                settext = new setText(((Byte) av.setY(new Object[]{avVar}, -888174800, 888174800, System.identityHashCode(avVar))).byteValue(), ((Byte) av.setY(new Object[]{avVar}, 1262930435, -1262930433, System.identityHashCode(avVar))).byteValue());
                int i59 = f56522i;
                int i510 = (i59 & (-114)) | ((~i59) & 113);
                int i511 = (i59 & 113) << 1;
                i13 = (i510 & i511) + (i511 | i510);
                f56521h = i13 % 128;
                if (i13 % 2 != 0) {
                    return settext;
                }
                int i512 = 95 / 0;
                return settext;
            case 4:
                ir irVar2 = (ir) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                cs csVar = new cs(irVar2.setOnFocusChangeListener());
                setNextFocusLeftId setnextfocusleftid = setNextFocusLeftId.INSTANCE;
                if (((Boolean) setNextFocusLeftId.setDividerPadding(new Object[]{bArr, getEmvLibVersion.setCompoundDrawableTintBlendMode}, 177165021, -177165021, (int) System.currentTimeMillis())).booleanValue()) {
                    int i60 = f56521h + 101;
                    f56522i = i60 % 128;
                    int i61 = i60 % 2;
                    cr crVar2 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                    if (((Boolean) cr.setDividerPadding(new Object[]{crVar2}, -426527980, 426527990, System.identityHashCode(crVar2))).booleanValue()) {
                        int i62 = f56522i;
                        int i63 = ((i62 | 47) << 1) - (i62 ^ 47);
                        f56521h = i63 % 128;
                        int i64 = i63 % 2;
                        x4 = (fk) setDividerPadding(new Object[]{irVar2, bArr}, -1692795744, 1692795745, System.identityHashCode(irVar2));
                        int i65 = f56521h;
                        int i66 = i65 & 39;
                        int i67 = (((i65 | 39) & (~i66)) - (~(-(-(i66 << 1))))) - 1;
                        f56522i = i67 % 128;
                        if (i67 % 2 == 0) {
                            throw null;
                        }
                    } else if (((Boolean) setNextFocusLeftId.setDividerPadding(new Object[]{bArr, getEmvLibVersion.setOnFocusChangeListener}, 177165021, -177165021, (int) System.currentTimeMillis())).booleanValue()) {
                        i15 = f56521h + 69;
                        f56522i = i15 % 128;
                        if (i15 % 2 != 0) {
                            throw null;
                        }
                        x4 = (fk) setDividerPadding(new Object[]{irVar2, bArr}, -232171676, 232171683, System.identityHashCode(irVar2));
                    } else if (!((Boolean) setNextFocusLeftId.setDividerPadding(new Object[]{bArr, getEmvLibVersion.setX}, 177165021, -177165021, (int) System.currentTimeMillis())).booleanValue()) {
                        x4 = (fk) setDividerPadding(new Object[]{irVar2, bArr}, 776690439, -776690437, System.identityHashCode(irVar2));
                        int i68 = f56521h;
                        int i69 = (i68 ^ 29) + ((i68 & 29) << 1);
                        f56522i = i69 % 128;
                        int i70 = i69 % 2;
                    } else {
                        i14 = f56522i + 93;
                        f56521h = i14 % 128;
                        if (i14 % 2 == 0) {
                            cr crVar3 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                            ((Boolean) cr.setDividerPadding(new Object[]{crVar3}, -426527980, 426527990, System.identityHashCode(crVar3))).booleanValue();
                            throw null;
                        }
                        crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                        if (((Boolean) cr.setDividerPadding(new Object[]{crVar}, -426527980, 426527990, System.identityHashCode(crVar))).booleanValue()) {
                            x4 = (fk) setDividerPadding(new Object[]{irVar2, bArr}, 776690439, -776690437, System.identityHashCode(irVar2));
                            int i610 = f56521h;
                            int i611 = (i610 ^ 29) + ((i610 & 29) << 1);
                            f56522i = i611 % 128;
                            int i71 = i611 % 2;
                        } else {
                            x4 = (fk) setDividerPadding(new Object[]{irVar2, bArr}, -1879033393, 1879033404, System.identityHashCode(irVar2));
                            int i72 = f56522i;
                            int i73 = ((i72 ^ 34) + ((i72 & 34) << 1)) - 1;
                            f56521h = i73 % 128;
                            int i74 = i73 % 2;
                        }
                    }
                } else if (((Boolean) setNextFocusLeftId.setDividerPadding(new Object[]{bArr, getEmvLibVersion.setOnFocusChangeListener}, 177165021, -177165021, (int) System.currentTimeMillis())).booleanValue()) {
                    i15 = f56521h + 69;
                    f56522i = i15 % 128;
                    if (i15 % 2 != 0) {
                        throw null;
                    }
                    x4 = (fk) setDividerPadding(new Object[]{irVar2, bArr}, -232171676, 232171683, System.identityHashCode(irVar2));
                } else if (!((Boolean) setNextFocusLeftId.setDividerPadding(new Object[]{bArr, getEmvLibVersion.setX}, 177165021, -177165021, (int) System.currentTimeMillis())).booleanValue()) {
                    x4 = (fk) setDividerPadding(new Object[]{irVar2, bArr}, 776690439, -776690437, System.identityHashCode(irVar2));
                    int i612 = f56521h;
                    int i613 = (i612 ^ 29) + ((i612 & 29) << 1);
                    f56522i = i613 % 128;
                    int i75 = i613 % 2;
                } else {
                    i14 = f56522i + 93;
                    f56521h = i14 % 128;
                    if (i14 % 2 == 0) {
                        cr crVar4 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                        ((Boolean) cr.setDividerPadding(new Object[]{crVar4}, -426527980, 426527990, System.identityHashCode(crVar4))).booleanValue();
                        throw null;
                    }
                    crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                    if (((Boolean) cr.setDividerPadding(new Object[]{crVar}, -426527980, 426527990, System.identityHashCode(crVar))).booleanValue()) {
                        x4 = (fk) setDividerPadding(new Object[]{irVar2, bArr}, 776690439, -776690437, System.identityHashCode(irVar2));
                        int i614 = f56521h;
                        int i615 = (i614 ^ 29) + ((i614 & 29) << 1);
                        f56522i = i615 % 128;
                        int i76 = i615 % 2;
                    } else {
                        x4 = (fk) setDividerPadding(new Object[]{irVar2, bArr}, -1879033393, 1879033404, System.identityHashCode(irVar2));
                        int i77 = f56522i;
                        int i78 = ((i77 ^ 34) + ((i77 & 34) << 1)) - 1;
                        f56521h = i78 % 128;
                        int i79 = i78 % 2;
                    }
                }
                break;
            case 5:
                ir irVar3 = (ir) objArr[0];
                Continuation continuation = (Continuation) objArr[1];
                int i80 = f56521h;
                int i81 = i80 | 87;
                int i82 = i81 << 1;
                int i83 = -((~(i80 & 87)) & i81);
                int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                int i85 = i84 % 128;
                f56522i = i85;
                if (i84 % 2 == 0) {
                    int i86 = 59 / 0;
                    if (continuation instanceof a) {
                        aVar = (a) continuation;
                        i20 = aVar.f56528s0;
                        i21 = i20 & Integer.MIN_VALUE;
                        if (i21 != 0) {
                            i22 = ((i85 | 81) << 1) - (i85 ^ 81);
                            f56521h = i22 % 128;
                            if (i22 % 2 != 0) {
                                aVar.f56528s0 = i20 * Integer.MIN_VALUE;
                            } else {
                                aVar.f56528s0 = i21 + ((i20 ^ Integer.MIN_VALUE) | i21);
                            }
                        }
                    }
                    compoundDrawableTintBlendMode = aVar.f56526q0;
                    coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    i16 = aVar.f56528s0;
                    if (i16 == 0) {
                        ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                        getValue getvalue = irVar3.f56523f;
                        aVar.f56525p0 = irVar3;
                        aVar.f56528s0 = 1;
                        compoundDrawableTintBlendMode = getvalue.setCompoundDrawableTintBlendMode(aVar);
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i87 = f56521h;
                            i17 = (i87 & 59) + (i87 | 59);
                            f56522i = i17 % 128;
                            if (i17 % 2 == 0) {
                                throw null;
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i16 == 1) {
                        irVar3 = aVar.f56525p0;
                        ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                        int i88 = f56522i + 117;
                        f56521h = i88 % 128;
                        int i89 = i88 % 2;
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                        int i90 = f56522i;
                        int i91 = i90 & 63;
                        int i92 = (i91 - (~((i90 ^ 63) | i91))) - 1;
                        f56521h = i92 % 128;
                        int i93 = i92 % 2;
                    }
                    int i94 = f56521h;
                    int i95 = i94 & 19;
                    int i96 = -(-((i94 ^ 19) | i95));
                    int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                    f56522i = i97 % 128;
                    int i98 = i97 % 2;
                    return compoundDrawableTintBlendMode;
                    setrotationx = (setRotationX) compoundDrawableTintBlendMode;
                    i18 = setDividerPadding.setX[((setRotationY) setRotationX.setX(new Object[]{setrotationx}, 1897018363, -1897018360, System.identityHashCode(setrotationx))).ordinal()];
                    if (i18 == 1) {
                        aVar.f56525p0 = null;
                        aVar.f56528s0 = 2;
                        compoundDrawableTintBlendMode = setDividerPadding(new Object[]{irVar3, setrotationx, aVar}, -265490155, 265490164, System.identityHashCode(irVar3));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i99 = f56522i + 52;
                            int i100 = (i99 ^ (-1)) + (i99 << 1);
                            int i101 = i100 % 128;
                            f56521h = i101;
                            int i102 = i100 % 2;
                            int i103 = (i101 | 99) << 1;
                            int i104 = -(((~i101) & 99) | (i101 & (-100)));
                            int i105 = ((i103 | i104) << 1) - (i104 ^ i103);
                            f56522i = i105 % 128;
                            int i106 = i105 % 2;
                            return coroutine_suspended;
                        }
                        int i910 = f56521h;
                        int i911 = i910 & 19;
                        int i912 = -(-((i910 ^ 19) | i911));
                        int i913 = (i911 ^ i912) + ((i912 & i911) << 1);
                        f56522i = i913 % 128;
                        int i914 = i913 % 2;
                        return compoundDrawableTintBlendMode;
                    }
                    if (i18 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    x4 = (fk) setDividerPadding(new Object[]{irVar3}, -299551488, 299551496, System.identityHashCode(irVar3));
                    int i107 = f56522i;
                    i19 = (((i107 | 12) << 1) - (i107 ^ 12)) - 1;
                    f56521h = i19 % 128;
                    if (i19 % 2 != 0) {
                        throw null;
                    }
                } else {
                    if (continuation instanceof a) {
                        aVar = (a) continuation;
                        i20 = aVar.f56528s0;
                        i21 = i20 & Integer.MIN_VALUE;
                        if (i21 != 0) {
                            i22 = ((i85 | 81) << 1) - (i85 ^ 81);
                            f56521h = i22 % 128;
                            if (i22 % 2 != 0) {
                                aVar.f56528s0 = i20 * Integer.MIN_VALUE;
                            } else {
                                aVar.f56528s0 = i21 + ((i20 ^ Integer.MIN_VALUE) | i21);
                            }
                        }
                    }
                    compoundDrawableTintBlendMode = aVar.f56526q0;
                    coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    i16 = aVar.f56528s0;
                    if (i16 == 0) {
                        ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                        getValue getvalue2 = irVar3.f56523f;
                        aVar.f56525p0 = irVar3;
                        aVar.f56528s0 = 1;
                        compoundDrawableTintBlendMode = getvalue2.setCompoundDrawableTintBlendMode(aVar);
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i810 = f56521h;
                            i17 = (i810 & 59) + (i810 | 59);
                            f56522i = i17 % 128;
                            if (i17 % 2 == 0) {
                                throw null;
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i16 == 1) {
                        irVar3 = aVar.f56525p0;
                        ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                        int i811 = f56522i + 117;
                        f56521h = i811 % 128;
                        int i812 = i811 % 2;
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                        int i915 = f56522i;
                        int i916 = i915 & 63;
                        int i917 = (i916 - (~((i915 ^ 63) | i916))) - 1;
                        f56521h = i917 % 128;
                        int i918 = i917 % 2;
                    }
                    int i919 = f56521h;
                    int i9110 = i919 & 19;
                    int i9111 = -(-((i919 ^ 19) | i9110));
                    int i9112 = (i9110 ^ i9111) + ((i9111 & i9110) << 1);
                    f56522i = i9112 % 128;
                    int i9113 = i9112 % 2;
                    return compoundDrawableTintBlendMode;
                    setrotationx = (setRotationX) compoundDrawableTintBlendMode;
                    i18 = setDividerPadding.setX[((setRotationY) setRotationX.setX(new Object[]{setrotationx}, 1897018363, -1897018360, System.identityHashCode(setrotationx))).ordinal()];
                    if (i18 == 1) {
                        aVar.f56525p0 = null;
                        aVar.f56528s0 = 2;
                        compoundDrawableTintBlendMode = setDividerPadding(new Object[]{irVar3, setrotationx, aVar}, -265490155, 265490164, System.identityHashCode(irVar3));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i920 = f56522i + 52;
                            int i108 = (i920 ^ (-1)) + (i920 << 1);
                            int i109 = i108 % 128;
                            f56521h = i109;
                            int i1010 = i108 % 2;
                            int i1011 = (i109 | 99) << 1;
                            int i1012 = -(((~i109) & 99) | (i109 & (-100)));
                            int i1013 = ((i1011 | i1012) << 1) - (i1012 ^ i1011);
                            f56522i = i1013 % 128;
                            int i1014 = i1013 % 2;
                            return coroutine_suspended;
                        }
                        int i9114 = f56521h;
                        int i9115 = i9114 & 19;
                        int i9116 = -(-((i9114 ^ 19) | i9115));
                        int i9117 = (i9115 ^ i9116) + ((i9116 & i9115) << 1);
                        f56522i = i9117 % 128;
                        int i9118 = i9117 % 2;
                        return compoundDrawableTintBlendMode;
                    }
                    if (i18 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    x4 = (fk) setDividerPadding(new Object[]{irVar3}, -299551488, 299551496, System.identityHashCode(irVar3));
                    int i1015 = f56522i;
                    i19 = (((i1015 | 12) << 1) - (i1015 ^ 12)) - 1;
                    f56521h = i19 % 128;
                    if (i19 % 2 != 0) {
                        throw null;
                    }
                }
                aVar = irVar3.new a(continuation);
                int i110 = f56522i;
                int i111 = i110 & 89;
                int i112 = -(-((i110 ^ 89) | i111));
                int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                f56521h = i113 % 128;
                int i114 = i113 % 2;
                compoundDrawableTintBlendMode = aVar.f56526q0;
                coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                i16 = aVar.f56528s0;
                if (i16 == 0) {
                    ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                    getValue getvalue3 = irVar3.f56523f;
                    aVar.f56525p0 = irVar3;
                    aVar.f56528s0 = 1;
                    compoundDrawableTintBlendMode = getvalue3.setCompoundDrawableTintBlendMode(aVar);
                    if (compoundDrawableTintBlendMode == coroutine_suspended) {
                        int i813 = f56521h;
                        i17 = (i813 & 59) + (i813 | 59);
                        f56522i = i17 % 128;
                        if (i17 % 2 == 0) {
                            throw null;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i16 == 1) {
                    irVar3 = aVar.f56525p0;
                    ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                    int i814 = f56522i + 117;
                    f56521h = i814 % 128;
                    int i815 = i814 % 2;
                } else {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                    int i9119 = f56522i;
                    int i9120 = i9119 & 63;
                    int i9121 = (i9120 - (~((i9119 ^ 63) | i9120))) - 1;
                    f56521h = i9121 % 128;
                    int i9122 = i9121 % 2;
                }
                int i91110 = f56521h;
                int i91111 = i91110 & 19;
                int i91112 = -(-((i91110 ^ 19) | i91111));
                int i91113 = (i91111 ^ i91112) + ((i91112 & i91111) << 1);
                f56522i = i91113 % 128;
                int i91114 = i91113 % 2;
                return compoundDrawableTintBlendMode;
                setrotationx = (setRotationX) compoundDrawableTintBlendMode;
                i18 = setDividerPadding.setX[((setRotationY) setRotationX.setX(new Object[]{setrotationx}, 1897018363, -1897018360, System.identityHashCode(setrotationx))).ordinal()];
                if (i18 == 1) {
                    aVar.f56525p0 = null;
                    aVar.f56528s0 = 2;
                    compoundDrawableTintBlendMode = setDividerPadding(new Object[]{irVar3, setrotationx, aVar}, -265490155, 265490164, System.identityHashCode(irVar3));
                    if (compoundDrawableTintBlendMode == coroutine_suspended) {
                        int i921 = f56522i + 52;
                        int i1016 = (i921 ^ (-1)) + (i921 << 1);
                        int i1017 = i1016 % 128;
                        f56521h = i1017;
                        int i1018 = i1016 % 2;
                        int i1019 = (i1017 | 99) << 1;
                        int i10110 = -(((~i1017) & 99) | (i1017 & (-100)));
                        int i10111 = ((i1019 | i10110) << 1) - (i10110 ^ i1019);
                        f56522i = i10111 % 128;
                        int i10112 = i10111 % 2;
                        return coroutine_suspended;
                    }
                    int i91115 = f56521h;
                    int i91116 = i91115 & 19;
                    int i91117 = -(-((i91115 ^ 19) | i91116));
                    int i91118 = (i91116 ^ i91117) + ((i91117 & i91116) << 1);
                    f56522i = i91118 % 128;
                    int i91119 = i91118 % 2;
                    return compoundDrawableTintBlendMode;
                }
                if (i18 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                x4 = (fk) setDividerPadding(new Object[]{irVar3}, -299551488, 299551496, System.identityHashCode(irVar3));
                int i10113 = f56522i;
                i19 = (((i10113 | 12) << 1) - (i10113 ^ 12)) - 1;
                f56521h = i19 % 128;
                if (i19 % 2 != 0) {
                    throw null;
                }
            case 6:
                ir irVar4 = (ir) objArr[0];
                Continuation continuation2 = (Continuation) objArr[1];
                int i115 = f56522i;
                int i116 = i115 & 49;
                int i117 = ((i115 ^ 49) | i116) << 1;
                int i118 = -((i115 | 49) & (~i116));
                int i119 = ((i117 | i118) << 1) - (i118 ^ i117);
                f56521h = i119 % 128;
                if (i119 % 2 != 0) {
                    setDividerPadding(new Object[]{irVar4, null, continuation2}, -265490155, 265490164, System.identityHashCode(irVar4));
                    throw null;
                }
                Object dividerPadding = setDividerPadding(new Object[]{irVar4, null, continuation2}, -265490155, 265490164, System.identityHashCode(irVar4));
                int i120 = f56521h + 11;
                f56522i = i120 % 128;
                if (i120 % 2 != 0) {
                    return dividerPadding;
                }
                int i121 = 39 / 0;
                return dividerPadding;
            case 7:
                ir irVar5 = (ir) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int i122 = f56521h;
                int i123 = i122 & 3;
                int i124 = (i123 - (~(-(-((i122 ^ 3) | i123))))) - 1;
                f56522i = i124 % 128;
                int i125 = i124 % 2;
                iu x6 = irVar5.setX();
                im onFocusChangeListener3 = irVar5.setOnFocusChangeListener();
                setTextKeepState compoundDrawableTintBlendMode2 = irVar5.setCompoundDrawableTintBlendMode();
                setContentCaptureSession setcontentcapturesession = setContentCaptureSession.setLayoutAnimation;
                getEmvLibVersion.Companion companion = getEmvLibVersion.INSTANCE;
                getEmvLibVersion getemvlibversion = (getEmvLibVersion) getEmvLibVersion.Companion.setOnFocusChangeListener(new Object[]{bArr2}, 617595066, -617595066, (int) System.currentTimeMillis());
                Intrinsics.checkNotNull(getemvlibversion);
                fk fkVar = (fk) iu.setX(new Object[]{x6, onFocusChangeListener3, compoundDrawableTintBlendMode2, setcontentcapturesession, getemvlibversion.setX()}, 1169253250, -1169253248, System.identityHashCode(x6));
                int i126 = f56521h;
                int i127 = i126 & 63;
                int i128 = -(-((i126 ^ 63) | i127));
                int i129 = (i127 & i128) + (i128 | i127);
                f56522i = i129 % 128;
                int i130 = i129 % 2;
                return fkVar;
            case 8:
                ir irVar6 = (ir) objArr[0];
                int i131 = f56522i;
                int i132 = i131 & 39;
                int i133 = ((i131 ^ 39) | i132) << 1;
                int i134 = -((i131 | 39) & (~i132));
                int i135 = (i133 ^ i134) + ((i134 & i133) << 1);
                f56521h = i135 % 128;
                if (i135 % 2 != 0) {
                    iu x7 = irVar6.setX();
                    throw null;
                }
                iu x10 = irVar6.setX();
                fk fkVar2 = (fk) iu.setX(new Object[]{x10, irVar6.setOnFocusChangeListener(), irVar6.setCompoundDrawableTintBlendMode()}, -61530894, 61530906, System.identityHashCode(x10));
                int i136 = f56522i;
                int i137 = (i136 ^ 108) + ((i136 & 108) << 1);
                int i138 = (i137 ^ (-1)) + (i137 << 1);
                f56521h = i138 % 128;
                if (i138 % 2 == 0) {
                    return fkVar2;
                }
                int i139 = 16 / 0;
                return fkVar2;
            case 9:
                return c(objArr);
            case 10:
                ir irVar7 = (ir) objArr[0];
                setContentCaptureSession setcontentcapturesession2 = (setContentCaptureSession) objArr[1];
                int i140 = f56521h;
                int i141 = ((i140 ^ 6) + ((i140 & 6) << 1)) - 1;
                f56522i = i141 % 128;
                if (i141 % 2 != 0) {
                    return (fk) iu.setX(new Object[]{irVar7.setX(), irVar7.setOnFocusChangeListener(), irVar7.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setcontentcapturesession2}, 991028938, -991028938, (int) System.currentTimeMillis());
                }
                throw null;
            case 11:
                ir irVar8 = (ir) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                int i142 = f56522i + 63;
                f56521h = i142 % 128;
                if (i142 % 2 == 0) {
                    iu x11 = irVar8.setX();
                    im onFocusChangeListener4 = irVar8.setOnFocusChangeListener();
                    setTextKeepState compoundDrawableTintBlendMode3 = irVar8.setCompoundDrawableTintBlendMode();
                    getEmvLibVersion.Companion companion2 = getEmvLibVersion.INSTANCE;
                    getEmvLibVersion getemvlibversion2 = (getEmvLibVersion) getEmvLibVersion.Companion.setOnFocusChangeListener(new Object[]{bArr3}, 617595066, -617595066, (int) System.currentTimeMillis());
                    Intrinsics.checkNotNull(getemvlibversion2);
                    return (fk) iu.setX(new Object[]{x11, onFocusChangeListener4, compoundDrawableTintBlendMode3, getemvlibversion2.setX()}, -1236108965, 1236108966, System.identityHashCode(x11));
                }
                iu x12 = irVar8.setX();
                im onFocusChangeListener5 = irVar8.setOnFocusChangeListener();
                setTextKeepState compoundDrawableTintBlendMode4 = irVar8.setCompoundDrawableTintBlendMode();
                getEmvLibVersion.Companion companion3 = getEmvLibVersion.INSTANCE;
                getEmvLibVersion getemvlibversion3 = (getEmvLibVersion) getEmvLibVersion.Companion.setOnFocusChangeListener(new Object[]{bArr3}, 617595066, -617595066, (int) System.currentTimeMillis());
                Intrinsics.checkNotNull(getemvlibversion3);
                throw null;
            case 12:
                ir irVar9 = (ir) objArr[0];
                Continuation<? super fk> continuation3 = (Continuation) objArr[1];
                int i143 = f56521h;
                int i144 = (((i143 & (-14)) | ((~i143) & 13)) - (~((i143 & 13) << 1))) - 1;
                f56522i = i144 % 128;
                if (i144 % 2 != 0) {
                    im onFocusChangeListener6 = irVar9.setOnFocusChangeListener();
                    setAnimation setanimation = setAnimation.INSTANCE;
                    getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener6, (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener6));
                    if (getbeeponfailure == null) {
                        im onFocusChangeListener7 = irVar9.setOnFocusChangeListener();
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener7, setSupportBackgroundTintMode.setDividerPadding}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener7));
                        x4 = irVar9.f56524g.setX(continuation3);
                        int i145 = f56521h;
                        int i146 = ((i145 ^ 123) | (i145 & 123)) << 1;
                        int i147 = -(((~i145) & 123) | (i145 & (-124)));
                        int i148 = ((i146 | i147) << 1) - (i147 ^ i146);
                        f56522i = i148 % 128;
                        int i149 = i148 % 2;
                    } else {
                        setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
                        setFocusable setfocusable = (setFocusable) setImageTintList.setX(new Object[]{setimagetintlist}, 290021075, -290021067, System.identityHashCode(setimagetintlist));
                        listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new byte[][]{(byte[]) setFocusable.setOnFocusChangeListener(new Object[]{setfocusable}, 1803955216, -1803955212, System.identityHashCode(setfocusable)), (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))});
                        im onFocusChangeListener8 = irVar9.setOnFocusChangeListener();
                        ahVar = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener8}, 1437547358, -1437547304, System.identityHashCode(onFocusChangeListener8));
                        if (ahVar != null) {
                            int i150 = f56521h + 42;
                            i24 = (i150 ^ (-1)) + (i150 << 1);
                            f56522i = i24 % 128;
                            if (i24 % 2 != 0) {
                                throw null;
                            }
                            anVar = (an) ((setImageTintList) w.setX(new Object[]{ahVar}, 1693919772, -1693919769, System.identityHashCode(ahVar)));
                            if (anVar != null) {
                                int i151 = f56522i;
                                int i152 = ((i151 ^ 103) | (i151 & 103)) << 1;
                                int i153 = -(((~i151) & 103) | (i151 & (-104)));
                                i25 = ((i152 | i153) << 1) - (i153 ^ i152);
                                f56521h = i25 % 128;
                                if (i25 % 2 != 0) {
                                    Boxing.boxInt(((Integer) setLeftTopRightBottom.setCompoundDrawableTintBlendMode(new Object[]{anVar, (byte[]) setInputExtras.setDividerPadding(new Object[]{listListOf}, -822524174, 822524177, (int) System.currentTimeMillis())}, -1162888331, 1162888331, (int) System.currentTimeMillis())).intValue());
                                    int i154 = 81 / 0;
                                } else {
                                    Boxing.boxInt(((Integer) setLeftTopRightBottom.setCompoundDrawableTintBlendMode(new Object[]{anVar, (byte[]) setInputExtras.setDividerPadding(new Object[]{listListOf}, -822524174, 822524177, (int) System.currentTimeMillis())}, -1162888331, 1162888331, (int) System.currentTimeMillis())).intValue());
                                }
                                int i155 = f56522i + 93;
                                f56521h = i155 % 128;
                                int i156 = i155 % 2;
                            }
                        }
                        x4 = (fk) setDividerPadding(new Object[]{irVar9}, 1130781503, -1130781503, System.identityHashCode(irVar9));
                        int i157 = f56522i;
                        i23 = ((i157 | 61) << 1) - (i157 ^ 61);
                        f56521h = i23 % 128;
                        if (i23 % 2 != 0) {
                            throw null;
                        }
                    }
                } else {
                    im onFocusChangeListener9 = irVar9.setOnFocusChangeListener();
                    setAnimation setanimation2 = setAnimation.INSTANCE;
                    getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener9, (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener9));
                    int i158 = 79 / 0;
                    if (getbeeponfailure == null) {
                        im onFocusChangeListener10 = irVar9.setOnFocusChangeListener();
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener10, setSupportBackgroundTintMode.setDividerPadding}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener10));
                        x4 = irVar9.f56524g.setX(continuation3);
                        int i1410 = f56521h;
                        int i1411 = ((i1410 ^ 123) | (i1410 & 123)) << 1;
                        int i1412 = -(((~i1410) & 123) | (i1410 & (-124)));
                        int i1413 = ((i1411 | i1412) << 1) - (i1412 ^ i1411);
                        f56522i = i1413 % 128;
                        int i1414 = i1413 % 2;
                    } else {
                        setImageTintList setimagetintlist2 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
                        setFocusable setfocusable2 = (setFocusable) setImageTintList.setX(new Object[]{setimagetintlist2}, 290021075, -290021067, System.identityHashCode(setimagetintlist2));
                        listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new byte[][]{(byte[]) setFocusable.setOnFocusChangeListener(new Object[]{setfocusable2}, 1803955216, -1803955212, System.identityHashCode(setfocusable2)), (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))});
                        im onFocusChangeListener11 = irVar9.setOnFocusChangeListener();
                        ahVar = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener11}, 1437547358, -1437547304, System.identityHashCode(onFocusChangeListener11));
                        if (ahVar != null) {
                            int i159 = f56521h + 42;
                            i24 = (i159 ^ (-1)) + (i159 << 1);
                            f56522i = i24 % 128;
                            if (i24 % 2 != 0) {
                                throw null;
                            }
                            anVar = (an) ((setImageTintList) w.setX(new Object[]{ahVar}, 1693919772, -1693919769, System.identityHashCode(ahVar)));
                            if (anVar != null) {
                                int i1510 = f56522i;
                                int i1511 = ((i1510 ^ 103) | (i1510 & 103)) << 1;
                                int i1512 = -(((~i1510) & 103) | (i1510 & (-104)));
                                i25 = ((i1511 | i1512) << 1) - (i1512 ^ i1511);
                                f56521h = i25 % 128;
                                if (i25 % 2 != 0) {
                                    Boxing.boxInt(((Integer) setLeftTopRightBottom.setCompoundDrawableTintBlendMode(new Object[]{anVar, (byte[]) setInputExtras.setDividerPadding(new Object[]{listListOf}, -822524174, 822524177, (int) System.currentTimeMillis())}, -1162888331, 1162888331, (int) System.currentTimeMillis())).intValue());
                                    int i1513 = 81 / 0;
                                } else {
                                    Boxing.boxInt(((Integer) setLeftTopRightBottom.setCompoundDrawableTintBlendMode(new Object[]{anVar, (byte[]) setInputExtras.setDividerPadding(new Object[]{listListOf}, -822524174, 822524177, (int) System.currentTimeMillis())}, -1162888331, 1162888331, (int) System.currentTimeMillis())).intValue());
                                }
                                int i1514 = f56522i + 93;
                                f56521h = i1514 % 128;
                                int i1515 = i1514 % 2;
                            }
                        }
                        x4 = (fk) setDividerPadding(new Object[]{irVar9}, 1130781503, -1130781503, System.identityHashCode(irVar9));
                        int i1516 = f56522i;
                        i23 = ((i1516 | 61) << 1) - (i1516 ^ 61);
                        f56521h = i23 % 128;
                        if (i23 % 2 != 0) {
                            throw null;
                        }
                    }
                }
                break;
            default:
                ir irVar10 = (ir) objArr[0];
                int i160 = f56522i;
                int i161 = i160 & 103;
                int i162 = (i161 - (~(-(-((i160 ^ 103) | i161))))) - 1;
                f56521h = i162 % 128;
                int i163 = i162 % 2;
                im onFocusChangeListener12 = irVar10.setOnFocusChangeListener();
                if (((ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener12}, 1437547358, -1437547304, System.identityHashCode(onFocusChangeListener12))) == null) {
                    int i164 = f56522i + 117;
                    f56521h = i164 % 128;
                    int i165 = i164 % 2;
                    fk fkVar3 = (fk) setDividerPadding(new Object[]{irVar10, setContentCaptureSession.setOnLongClickListener}, 1017446654, -1017446644, System.identityHashCode(irVar10));
                    System.identityHashCode(irVar10);
                    System.identityHashCode(irVar10);
                    return fkVar3;
                }
                irVar10.f56523f.setOnFocusChangeListener((setText) setDividerPadding(new Object[]{irVar10}, 2675740, -2675737, System.identityHashCode(irVar10)));
                im onFocusChangeListener13 = irVar10.setOnFocusChangeListener();
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener13, setSupportBackgroundTintMode.setCompoundDrawableTintBlendMode}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener13));
                fk fkVar4 = fk.setOnDragListener;
                int i166 = f56521h;
                int i167 = (i166 & 33) + (i166 | 33);
                f56522i = i167 % 128;
                if (i167 % 2 != 0) {
                    return fkVar4;
                }
                throw null;
        }
        return x4;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setDividerPadding(new Object[]{this, continuation}, 1822943980, -1822943975, System.identityHashCode(this));
    }
}
