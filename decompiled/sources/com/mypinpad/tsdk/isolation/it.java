package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class it extends is {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56529j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56530k = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final getValue f56531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final di f56532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final component10 f56533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56534i;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public it f56535p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f56536q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f56538s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object[] objArr = {this, obj};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            aVar.f56536q0 = objArr[1];
            int i10 = aVar.f56538s0;
            aVar.f56538s0 = (i10 & Integer.MIN_VALUE) | (i10 ^ Integer.MIN_VALUE);
            it itVar = it.this;
            return it.setOnFocusChangeListener(new Object[]{itVar, aVar}, 14420552, -14420548, System.identityHashCode(itVar));
        }
    }

    public /* synthetic */ class setCompoundDrawableTintBlendMode {
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[setRotationY.values().length];
            iArr[setRotationY.setCompoundDrawableTintBlendMode.ordinal()] = 1;
            iArr[setRotationY.setDividerPadding.ordinal()] = 2;
            setOnFocusChangeListener = iArr;
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i10 = ~iCurrentTimeMillis;
            int i11 = ((-2029888745) & i10) | (2029888744 & iCurrentTimeMillis);
            int i12 = (-2029888745) & iCurrentTimeMillis;
            int i13 = ~((i11 & i12) | (i11 ^ i12));
            int i14 = -(-(((i13 & 538191080) | (538191080 ^ i13)) * 305));
            int i15 = (247252012 & i14) + (i14 | 247252012);
            int i16 = (iCurrentTimeMillis | i10) & (~iCurrentTimeMillis);
            int i17 = ~((i16 & (-2029888745)) | (i16 ^ (-2029888745)));
            int i18 = ((i17 & (-1525406487)) | ((~i17) & (-1525406487)) | (1525406486 & i17)) * 305;
            int i19 = i15 | i18;
            int i20 = i19 << 1;
            int i21 = -((~(i18 & i15)) & i19);
            int i22 = (i20 & i21) + (i21 | i20);
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i23 = ~iCurrentTimeMillis2;
            int i24 = ~(((~i23) & 1872352240) | (i23 & (-1872352241)) | (1872352240 & i23));
            int i25 = (974120904 & i23) | ((-974120905) & iCurrentTimeMillis2);
            int i26 = 974120904 & iCurrentTimeMillis2;
            int i27 = (i25 & i26) | (i25 ^ i26);
            int i28 = (i27 | (~i27)) & (~i27);
            int i29 = i24 & i28;
            int i30 = (i24 | i28) & (~i29);
            int i31 = ((i30 & i29) | (i30 ^ i29)) * 333;
            int i32 = 2084521161 & i31;
            int i33 = ((i31 | 2084521161) & (~i32)) + (i32 << 1);
            int i34 = (1872352240 & i23) | ((-1872352241) & iCurrentTimeMillis2);
            int i35 = iCurrentTimeMillis2 & 1872352240;
            int i36 = (i35 & i34) | (i34 ^ i35);
            int i37 = (i36 | (~i36)) & (~i36);
            int i38 = i23 & 974120904;
            int i39 = (i23 | 974120904) & (~i38);
            int i40 = ~((i38 & i39) | (i39 ^ i38));
            int i41 = i37 & i40;
            int i42 = (i37 | i40) & (~i41);
            if (i22 <= (((i42 & i41) | (i42 ^ i41)) * 333) + i33) {
                int i43 = 38 / 0;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it(@NotNull im imVar, @NotNull setTextKeepState settextkeepstate, @NotNull iu iuVar, @NotNull getValue getvalue, @NotNull di diVar, @NotNull component10 component10Var, @NotNull setContentDescription setcontentdescription) {
        super(imVar, settextkeepstate, iuVar);
        Intrinsics.checkNotNullParameter(imVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(iuVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(diVar, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56531f = getvalue;
        this.f56532g = diVar;
        this.f56533h = component10Var;
        this.f56534i = setcontentdescription;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x05af  */
    /* JADX WARN: Code duplicated, block: B:102:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:103:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:11:0x008b  */
    /* JADX WARN: Code duplicated, block: B:137:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:14:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:16:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:18:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:20:0x010e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0125  */
    /* JADX WARN: Code duplicated, block: B:24:0x013c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0142  */
    /* JADX WARN: Code duplicated, block: B:29:0x0156  */
    /* JADX WARN: Code duplicated, block: B:30:0x0157  */
    /* JADX WARN: Code duplicated, block: B:32:0x016e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0179  */
    /* JADX WARN: Code duplicated, block: B:35:0x0192  */
    /* JADX WARN: Code duplicated, block: B:37:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:41:0x020d  */
    /* JADX WARN: Code duplicated, block: B:44:0x022d  */
    /* JADX WARN: Code duplicated, block: B:45:0x022e  */
    /* JADX WARN: Code duplicated, block: B:47:0x023d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0256  */
    /* JADX WARN: Code duplicated, block: B:51:0x0265  */
    /* JADX WARN: Code duplicated, block: B:53:0x027a  */
    /* JADX WARN: Code duplicated, block: B:55:0x028f  */
    /* JADX WARN: Code duplicated, block: B:57:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x02af  */
    /* JADX WARN: Code duplicated, block: B:61:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:64:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:66:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x030d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0320  */
    /* JADX WARN: Code duplicated, block: B:74:0x0381  */
    /* JADX WARN: Code duplicated, block: B:76:0x0391  */
    /* JADX WARN: Code duplicated, block: B:77:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:80:0x044e  */
    /* JADX WARN: Code duplicated, block: B:99:0x059d A[PHI: r6
      0x059d: PHI (r6v27 com.mypinpad.tsdk.i.it$a) = (r6v26 com.mypinpad.tsdk.i.it$a), (r6v29 com.mypinpad.tsdk.i.it$a) binds: [B:98:0x059b, B:95:0x0592] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object objValueOf;
        boolean z10;
        a aVar;
        int i13;
        int i14;
        ah ahVar;
        an anVar;
        List<av> navigationOnClickListener;
        av avVar;
        int i15;
        int i16;
        boolean zBooleanValue;
        byte bByteValue;
        ah ahVar2;
        an anVar2;
        int i17;
        boolean z11;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = ~i10;
        int i28 = ~i11;
        int i29 = ~(i27 | i28);
        List<av> navigationOnClickListener2 = null;
        switch ((i29 * 576) + (((~(i10 | (~i12) | i28)) | (~(i11 | i27))) * 576) + (((~(i28 | i12)) | i29) * 576) + (i11 * (-575)) + (i10 * (-575))) {
            case 1:
                it itVar = (it) objArr[0];
                byte bByteValue2 = ((Byte) objArr[1]).byteValue();
                setRotationX setrotationx = (setRotationX) objArr[2];
                int i30 = f56530k;
                int i31 = (i30 & 65) + (i30 | 65);
                f56529j = i31 % 128;
                int i32 = i31 % 2;
                if (bByteValue2 <= 10) {
                    int i33 = (i30 ^ 53) + ((i30 & 53) << 1);
                    f56529j = i33 % 128;
                    if (i33 % 2 != 0) {
                        int length = ((byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx))).length;
                        throw null;
                    }
                    if (((byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx))).length == 0) {
                        int i34 = f56529j;
                        int i35 = (i34 ^ 47) + ((i34 & 47) << 1);
                        f56530k = i35 % 128;
                        int i36 = i35 % 2;
                        z10 = true;
                    } else {
                        int i37 = f56530k;
                        int i38 = i37 & 41;
                        int i39 = -(-((i37 ^ 41) | i38));
                        int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                        f56529j = i40 % 128;
                        int i41 = i40 % 2;
                        z10 = false;
                    }
                    if (!z10) {
                        int i42 = f56529j;
                        int i43 = i42 + 123;
                        f56530k = i43 % 128;
                        int i44 = i43 % 2;
                        int i45 = i42 & 99;
                        int i46 = (~i45) & (i42 | 99);
                        int i47 = -(-(i45 << 1));
                        int i48 = (i46 & i47) + (i47 | i46);
                        f56530k = i48 % 128;
                        int i49 = i48 % 2;
                        int i50 = i42 & 33;
                        int i51 = ((i42 | 33) & (~i50)) + (i50 << 1);
                        f56530k = i51 % 128;
                        if (i51 % 2 != 0 ? ((byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)))[0] == 112 : ((byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)))[0] == 62) {
                            int i52 = f56529j;
                            int i53 = ((i52 ^ 113) | (i52 & 113)) << 1;
                            int i54 = -(((~i52) & 113) | (i52 & (-114)));
                            int i55 = (i53 & i54) + (i54 | i53);
                            f56530k = i55 % 128;
                            int i56 = i55 % 2;
                            im onFocusChangeListener = itVar.setOnFocusChangeListener();
                            boolean zBooleanValue2 = ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, (byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)), null}, 1799308265, -1799308256, System.identityHashCode(onFocusChangeListener))).booleanValue();
                            int i57 = f56530k;
                            int i58 = (i57 ^ 101) + ((i57 & 101) << 1);
                            f56529j = i58 % 128;
                            int i59 = i58 % 2;
                            objValueOf = Boolean.valueOf(zBooleanValue2);
                            break;
                        }
                    } else {
                        int i60 = f56530k + 7;
                        f56529j = i60 % 128;
                        int i61 = i60 % 2;
                    }
                    int i62 = f56530k + 25;
                    f56529j = i62 % 128;
                    if (i62 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Boolean.FALSE;
                } else {
                    int i63 = ((i30 & 110) + (i30 | 110)) - 1;
                    f56529j = i63 % 128;
                    if (i63 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Boolean.TRUE;
                }
                break;
            case 2:
                it itVar2 = (it) objArr[0];
                int i64 = f56529j + 119;
                f56530k = i64 % 128;
                if (i64 % 2 != 0) {
                    return (fk) iu.setX(new Object[]{itVar2.setX(), itVar2.setOnFocusChangeListener(), itVar2.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.setNavigationOnClickListener}, 991028938, -991028938, (int) System.currentTimeMillis());
                }
                throw null;
            case 3:
                im imVar = (im) objArr[0];
                boolean zBooleanValue3 = ((Boolean) objArr[1]).booleanValue();
                byte bByteValue3 = ((Byte) objArr[2]).byteValue();
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[3];
                byte[] bArr = (byte[]) objArr[4];
                int i65 = f56529j;
                int i66 = i65 & 121;
                int i67 = -(-(i65 | 121));
                int i68 = (i66 & i67) + (i67 | i66);
                int i69 = i68 % 128;
                f56530k = i69;
                int i70 = i68 % 2;
                if (zBooleanValue3) {
                    int i71 = i69 + 45;
                    f56529j = i71 % 128;
                    if (i71 % 2 == 0 ? bByteValue3 <= 10 : bByteValue3 <= 109) {
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar}, -854811249, 854811301, System.identityHashCode(imVar)), (byte[]) ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))).clone())}, 1069122946, -1069122918, System.identityHashCode(imVar));
                        int i72 = f56529j;
                        int i73 = i72 & 115;
                        int i74 = ((((i72 ^ 115) | i73) << 1) - (~(-((i72 | 115) & (~i73))))) - 1;
                        f56530k = i74 % 128;
                        if (i74 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar}, -854811249, 854811301, System.identityHashCode(imVar)), (byte[]) bArr.clone())}, 1069122946, -1069122918, System.identityHashCode(imVar));
                    int i75 = f56530k;
                    int i76 = i75 & 23;
                    int i77 = i76 + ((i75 ^ 23) | i76);
                    f56529j = i77 % 128;
                    int i78 = i77 % 2;
                }
                int i79 = f56529j;
                int i80 = (i79 & (-10)) | ((~i79) & 9);
                int i81 = -(-((i79 & 9) << 1));
                int i82 = ((i80 | i81) << 1) - (i81 ^ i80);
                f56530k = i82 % 128;
                if (i82 % 2 != 0) {
                    return null;
                }
                throw null;
            case 4:
                it itVar3 = (it) objArr[0];
                Continuation continuation = (Continuation) objArr[1];
                int i83 = f56529j;
                int i84 = (i83 & 121) + (i83 | 121);
                f56530k = i84 % 128;
                int i85 = i84 % 2;
                if (continuation instanceof a) {
                    int i86 = i83 & 43;
                    int i87 = ((i83 ^ 43) | i86) << 1;
                    int i88 = -((~i86) & (i83 | 43));
                    int i89 = ((i87 | i88) << 1) - (i87 ^ i88);
                    f56530k = i89 % 128;
                    if (i89 % 2 == 0) {
                        aVar = (a) continuation;
                        int i90 = 40 / 0;
                        if ((aVar.f56538s0 & Integer.MIN_VALUE) != 0) {
                            int i91 = i83 & 83;
                            int i92 = -(-((i83 ^ 83) | i91));
                            i14 = (i91 & i92) + (i91 | i92);
                            f56530k = i14 % 128;
                            if (i14 % 2 == 0) {
                                aVar.f56538s0 >>>= Integer.MIN_VALUE;
                            } else {
                                aVar.f56538s0 -= Integer.MIN_VALUE;
                            }
                        } else {
                            aVar = itVar3.new a(continuation);
                            int i93 = f56530k;
                            int i94 = (i93 ^ 101) + ((i93 & 101) << 1);
                            f56529j = i94 % 128;
                            int i95 = i94 % 2;
                        }
                    } else {
                        aVar = (a) continuation;
                        if ((aVar.f56538s0 & Integer.MIN_VALUE) != 0) {
                            int i96 = i83 & 83;
                            int i97 = -(-((i83 ^ 83) | i96));
                            i14 = (i96 & i97) + (i96 | i97);
                            f56530k = i14 % 128;
                            if (i14 % 2 == 0) {
                                aVar.f56538s0 >>>= Integer.MIN_VALUE;
                            } else {
                                aVar.f56538s0 -= Integer.MIN_VALUE;
                            }
                        } else {
                            aVar = itVar3.new a(continuation);
                            int i98 = f56530k;
                            int i99 = (i98 ^ 101) + ((i98 & 101) << 1);
                            f56529j = i99 % 128;
                            int i910 = i99 % 2;
                        }
                    }
                } else {
                    aVar = itVar3.new a(continuation);
                    int i911 = f56530k;
                    int i912 = (i911 ^ 101) + ((i911 & 101) << 1);
                    f56529j = i912 % 128;
                    int i913 = i912 % 2;
                }
                Object compoundDrawableTintBlendMode = aVar.f56536q0;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i100 = aVar.f56538s0;
                if (i100 == 0) {
                    ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                    getValue getvalue = itVar3.f56531f;
                    aVar.f56535p0 = itVar3;
                    aVar.f56538s0 = 1;
                    compoundDrawableTintBlendMode = getvalue.setCompoundDrawableTintBlendMode(aVar);
                    if (compoundDrawableTintBlendMode == coroutine_suspended) {
                        int i101 = f56529j;
                        int i102 = (i101 ^ 21) + ((i101 & 21) << 1);
                        int i103 = i102 % 128;
                        f56530k = i103;
                        if (i102 % 2 == 0) {
                            throw null;
                        }
                        int i104 = i103 + 43;
                        f56529j = i104 % 128;
                        int i105 = i104 % 2;
                    }
                    return coroutine_suspended;
                }
                if (i100 == 1) {
                    itVar3 = aVar.f56535p0;
                    ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                    int i106 = f56529j + 72;
                    int i107 = (i106 ^ (-1)) + (i106 << 1);
                    f56530k = i107 % 128;
                    int i108 = i107 % 2;
                } else {
                    if (i100 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                    int i109 = f56530k;
                    int i110 = i109 & 105;
                    int i111 = ((i109 ^ 105) | i110) << 1;
                    int i112 = -((i109 | 105) & (~i110));
                    int i113 = (i111 & i112) + (i112 | i111);
                    f56529j = i113 % 128;
                    int i114 = i113 % 2;
                }
                int i115 = f56530k;
                int i116 = i115 ^ 117;
                i13 = ((((i115 & 117) | i116) << 1) - (~(-i116))) - 1;
                f56529j = i13 % 128;
                if (i13 % 2 != 0) {
                    int i117 = 54 / 0;
                }
                return compoundDrawableTintBlendMode;
                setRotationX setrotationx2 = (setRotationX) compoundDrawableTintBlendMode;
                int i118 = setCompoundDrawableTintBlendMode.setOnFocusChangeListener[((setRotationY) setRotationX.setX(new Object[]{setrotationx2}, 1897018363, -1897018360, System.identityHashCode(setrotationx2))).ordinal()];
                if (i118 == 1) {
                    aVar.f56535p0 = null;
                    aVar.f56538s0 = 2;
                    compoundDrawableTintBlendMode = setOnFocusChangeListener(new Object[]{itVar3, setrotationx2, aVar}, 1887209974, -1887209974, System.identityHashCode(itVar3));
                    if (compoundDrawableTintBlendMode == coroutine_suspended) {
                        int i119 = f56530k;
                        int i120 = i119 & 99;
                        int i121 = (i119 | 99) & (~i120);
                        int i122 = i120 << 1;
                        int i123 = (i121 & i122) + (i121 | i122);
                        int i124 = i123 % 128;
                        f56529j = i124;
                        if (i123 % 2 != 0) {
                            int i125 = 9 / 0;
                        }
                        int i126 = ((i124 | 11) << 1) - (i124 ^ 11);
                        f56530k = i126 % 128;
                        int i127 = i126 % 2;
                        return coroutine_suspended;
                    }
                    int i1110 = f56530k;
                    int i1111 = i1110 ^ 117;
                    i13 = ((((i1110 & 117) | i1111) << 1) - (~(-i1111))) - 1;
                    f56529j = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i1112 = 54 / 0;
                    }
                    return compoundDrawableTintBlendMode;
                }
                if (i118 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                objValueOf = (fk) setOnFocusChangeListener(new Object[]{itVar3}, -1382316414, 1382316420, System.identityHashCode(itVar3));
                int i128 = f56529j;
                int i129 = i128 & 119;
                int i130 = ((i128 ^ 119) | i129) << 1;
                int i131 = -((i128 | 119) & (~i129));
                int i132 = (i130 ^ i131) + ((i131 & i130) << 1);
                f56530k = i132 % 128;
                if (i132 % 2 == 0) {
                    throw null;
                }
                break;
            case 5:
                it itVar4 = (it) objArr[0];
                setRotationX setrotationx3 = (setRotationX) objArr[1];
                int i133 = f56529j;
                int i134 = i133 & 101;
                int i135 = (i133 ^ 101) | i134;
                int i136 = (i134 & i135) + (i135 | i134);
                f56530k = i136 % 128;
                if (i136 % 2 != 0) {
                    iu x4 = itVar4.setX();
                    objValueOf = (fk) iu.setX(new Object[]{x4, itVar4.setOnFocusChangeListener(), itVar4.setCompoundDrawableTintBlendMode(), (byte[]) setRotationX.setX(new Object[]{setrotationx3}, 1043258083, -1043258081, System.identityHashCode(setrotationx3))}, 1792429075, -1792429064, System.identityHashCode(x4));
                } else {
                    iu x6 = itVar4.setX();
                    objValueOf = (fk) iu.setX(new Object[]{x6, itVar4.setOnFocusChangeListener(), itVar4.setCompoundDrawableTintBlendMode(), (byte[]) setRotationX.setX(new Object[]{setrotationx3}, 1043258083, -1043258081, System.identityHashCode(setrotationx3))}, 1792429075, -1792429064, System.identityHashCode(x6));
                    int i137 = 77 / 0;
                }
                break;
            case 6:
                it itVar5 = (it) objArr[0];
                int i138 = f56530k + 69;
                f56529j = i138 % 128;
                if (i138 % 2 != 0) {
                    iu x7 = itVar5.setX();
                    throw null;
                }
                iu x10 = itVar5.setX();
                fk fkVar = (fk) iu.setX(new Object[]{x10, itVar5.setOnFocusChangeListener(), itVar5.setCompoundDrawableTintBlendMode()}, -61530894, 61530906, System.identityHashCode(x10));
                int i139 = f56529j;
                int i140 = i139 & 101;
                int i141 = (i139 ^ 101) | i140;
                int i142 = ((i140 | i141) << 1) - (i141 ^ i140);
                f56530k = i142 % 128;
                int i143 = i142 % 2;
                return fkVar;
            default:
                it itVar6 = (it) objArr[0];
                setRotationX setrotationx4 = (setRotationX) objArr[1];
                Continuation<? super fk> continuation2 = (Continuation) objArr[2];
                int i144 = f56530k;
                int i145 = i144 & 25;
                int i146 = ((i144 ^ 25) | i145) << 1;
                int i147 = -((i144 | 25) & (~i145));
                int i148 = ((i146 | i147) << 1) - (i147 ^ i146);
                f56529j = i148 % 128;
                if (i148 % 2 == 0) {
                    if (((Boolean) setRotationX.setX(new Object[]{setrotationx4}, -268504199, 268504206, System.identityHashCode(setrotationx4))).booleanValue()) {
                        im onFocusChangeListener2 = itVar6.setOnFocusChangeListener();
                        ahVar = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener2}, 1437547358, -1437547304, System.identityHashCode(onFocusChangeListener2));
                        if (ahVar == null) {
                            anVar = (an) ((setImageTintList) w.setX(new Object[]{ahVar}, 1693919772, -1693919769, System.identityHashCode(ahVar)));
                            if (anVar == null) {
                                navigationOnClickListener = anVar.setNavigationOnClickListener();
                                if (navigationOnClickListener == null) {
                                    int i149 = f56529j;
                                    int i150 = (i149 ^ 8) + ((i149 & 8) << 1);
                                    i15 = (i150 ^ (-1)) + (i150 << 1);
                                    f56530k = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        throw null;
                                    }
                                } else {
                                    avVar = (av) CollectionsKt___CollectionsKt.first((List) navigationOnClickListener);
                                    int i151 = f56529j;
                                    int i152 = (i151 & 4) + (i151 | 4);
                                    int i153 = (i152 ^ (-1)) + (i152 << 1);
                                    f56530k = i153 % 128;
                                    int i154 = i153 % 2;
                                }
                                if (avVar == null) {
                                    zBooleanValue = ((Boolean) av.setY(new Object[]{avVar}, -1890498550, 1890498551, System.identityHashCode(avVar))).booleanValue();
                                    bByteValue = ((Byte) av.setY(new Object[]{avVar}, -888174800, 888174800, System.identityHashCode(avVar))).byteValue();
                                    if (!((Boolean) setOnFocusChangeListener(new Object[]{itVar6, Byte.valueOf(bByteValue), setrotationx4}, -2126003656, 2126003657, System.identityHashCode(itVar6))).booleanValue()) {
                                        im onFocusChangeListener3 = itVar6.setOnFocusChangeListener();
                                        ahVar2 = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener3}, 1437547358, -1437547304, System.identityHashCode(onFocusChangeListener3));
                                        if (ahVar2 == null) {
                                            int i155 = f56530k;
                                            i21 = (i155 ^ 23) + ((i155 & 23) << 1);
                                            int i156 = i21 % 128;
                                            f56529j = i156;
                                            if (i21 % 2 != 0) {
                                                int i157 = 2 / 0;
                                            }
                                            int i158 = i156 & 77;
                                            int i159 = (i156 | 77) & (~i158);
                                            int i160 = i158 << 1;
                                            int i161 = ((i159 | i160) << 1) - (i159 ^ i160);
                                            f56530k = i161 % 128;
                                            int i162 = i161 % 2;
                                        } else {
                                            anVar2 = (an) ((setImageTintList) w.setX(new Object[]{ahVar2}, 1693919772, -1693919769, System.identityHashCode(ahVar2)));
                                            if (anVar2 == null) {
                                                int i163 = f56529j;
                                                i17 = ((i163 ^ 19) - (~((i163 & 19) << 1))) - 1;
                                                f56530k = i17 % 128;
                                                if (i17 % 2 == 0) {
                                                    int i164 = 98 / 0;
                                                }
                                                int i165 = (i163 ^ 119) + ((i163 & 119) << 1);
                                                f56530k = i165 % 128;
                                                int i166 = i165 % 2;
                                            } else {
                                                navigationOnClickListener2 = anVar2.setNavigationOnClickListener();
                                                int i167 = f56529j;
                                                int i168 = ((i167 ^ 101) - (~(-(-((i167 & 101) << 1))))) - 1;
                                                f56530k = i168 % 128;
                                                int i169 = i168 % 2;
                                            }
                                        }
                                        if (navigationOnClickListener2 != null) {
                                            int i170 = f56530k;
                                            i20 = ((i170 & 100) + (i170 | 100)) - 1;
                                            f56529j = i20 % 128;
                                            if (i20 % 2 != 0) {
                                                navigationOnClickListener2.remove(1);
                                            } else {
                                                navigationOnClickListener2.remove(0);
                                            }
                                        }
                                        if (navigationOnClickListener2 != null) {
                                            int i171 = f56529j;
                                            int i172 = i171 & 33;
                                            int i173 = ((i171 | 33) & (~i172)) + (i172 << 1);
                                            f56530k = i173 % 128;
                                            int i174 = i173 % 2;
                                            if (!(!navigationOnClickListener2.isEmpty())) {
                                                int i175 = f56530k + 31;
                                                f56529j = i175 % 128;
                                                int i176 = i175 % 2;
                                                z11 = false;
                                            } else {
                                                int i177 = f56529j + 51;
                                                int i178 = i177 % 128;
                                                f56530k = i178;
                                                int i179 = i177 % 2;
                                                int i180 = i178 + 29;
                                                f56529j = i180 % 128;
                                                int i181 = i180 % 2;
                                                z11 = true;
                                            }
                                        } else {
                                            int i1710 = f56530k + 31;
                                            f56529j = i1710 % 128;
                                            int i1711 = i1710 % 2;
                                            z11 = false;
                                        }
                                        if (!(!z11)) {
                                            av avVar2 = (av) CollectionsKt___CollectionsKt.first((List) navigationOnClickListener2);
                                            itVar6.f56531f.setOnFocusChangeListener(new setText(((Byte) av.setY(new Object[]{avVar2}, -888174800, 888174800, System.identityHashCode(avVar2))).byteValue(), ((Byte) av.setY(new Object[]{avVar2}, 1262930435, -1262930433, System.identityHashCode(avVar2))).byteValue()));
                                            im onFocusChangeListener4 = itVar6.setOnFocusChangeListener();
                                            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener4, setSupportBackgroundTintMode.setCompoundDrawableTintBlendMode}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener4));
                                            int i182 = f56529j;
                                            int i183 = ((i182 & 52) + (i182 | 52)) - 1;
                                            f56530k = i183 % 128;
                                            int i184 = i183 % 2;
                                        } else {
                                            int i185 = f56529j;
                                            i18 = (i185 ^ 109) + ((i185 & 109) << 1);
                                            f56530k = i18 % 128;
                                            if (i18 % 2 == 0) {
                                                im onFocusChangeListener5 = itVar6.setOnFocusChangeListener();
                                                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener5, setSupportBackgroundTintMode.setDividerPadding}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener5));
                                                int i186 = 16 / 0;
                                            } else {
                                                im onFocusChangeListener6 = itVar6.setOnFocusChangeListener();
                                                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener6, setSupportBackgroundTintMode.setDividerPadding}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener6));
                                            }
                                        }
                                        setOnFocusChangeListener(new Object[]{itVar6.setOnFocusChangeListener(), Boolean.valueOf(zBooleanValue), Byte.valueOf(bByteValue), (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx4}, -707146526, 707146527, System.identityHashCode(setrotationx4)), (byte[]) setRotationX.setX(new Object[]{setrotationx4}, -1008183286, 1008183296, System.identityHashCode(setrotationx4))}, 1566175275, -1566175272, (int) System.currentTimeMillis());
                                        objValueOf = new iq(itVar6.setOnFocusChangeListener(), itVar6.setCompoundDrawableTintBlendMode(), itVar6.setX(), itVar6.f56532g, itVar6.f56533h, itVar6.f56534i).setX(continuation2);
                                        int i187 = f56529j;
                                        i19 = (((i187 ^ 69) | (i187 & 69)) << 1) - (((~i187) & 69) | (i187 & (-70)));
                                        f56530k = i19 % 128;
                                        if (i19 % 2 == 0) {
                                            int i188 = 27 / 0;
                                        }
                                    } else {
                                        int i189 = f56530k;
                                        int i190 = i189 & 67;
                                        i22 = ((i189 | 67) & (~i190)) + (i190 << 1);
                                        f56529j = i22 % 128;
                                        if (i22 % 2 == 0) {
                                            throw null;
                                        }
                                        objValueOf = (fk) setOnFocusChangeListener(new Object[]{itVar6}, 384654630, -384654628, System.identityHashCode(itVar6));
                                        int i191 = f56530k;
                                        i23 = (((i191 | 88) << 1) - (i191 ^ 88)) - 1;
                                        f56529j = i23 % 128;
                                        if (i23 % 2 != 0) {
                                            throw null;
                                        }
                                    }
                                } else {
                                    i24 = f56529j + 97;
                                    f56530k = i24 % 128;
                                    if (i24 % 2 != 0) {
                                        throw null;
                                    }
                                    objValueOf = (fk) setOnFocusChangeListener(new Object[]{itVar6, setrotationx4}, -787977014, 787977019, System.identityHashCode(itVar6));
                                    int i192 = f56529j;
                                    i25 = i192 & 115;
                                    i26 = (i192 ^ 115) | i25;
                                }
                            } else {
                                int i193 = f56529j;
                                int i194 = ((~i193) & 37) | (i193 & (-38));
                                int i195 = (i193 & 37) << 1;
                                i16 = (i194 ^ i195) + ((i195 & i194) << 1);
                                int i196 = i16 % 128;
                                f56530k = i196;
                                if (i16 % 2 == 0) {
                                    int i197 = 7 / 0;
                                }
                                int i198 = (i196 & (-92)) | (91 & (~i196));
                                int i199 = (i196 & 91) << 1;
                                int i200 = (i198 & i199) + (i199 | i198);
                                f56529j = i200 % 128;
                                int i201 = i200 % 2;
                            }
                        } else {
                            int i202 = (-2) - ((f56530k + 78) ^ (-1));
                            int i203 = i202 % 128;
                            f56529j = i203;
                            int i204 = i202 % 2;
                            int i205 = i203 & 1;
                            int i206 = -(-((i203 ^ 1) | i205));
                            int i207 = (i205 ^ i206) + ((i205 & i206) << 1);
                            f56530k = i207 % 128;
                            int i208 = i207 % 2;
                        }
                        avVar = null;
                        if (avVar == null) {
                            zBooleanValue = ((Boolean) av.setY(new Object[]{avVar}, -1890498550, 1890498551, System.identityHashCode(avVar))).booleanValue();
                            bByteValue = ((Byte) av.setY(new Object[]{avVar}, -888174800, 888174800, System.identityHashCode(avVar))).byteValue();
                            if (!((Boolean) setOnFocusChangeListener(new Object[]{itVar6, Byte.valueOf(bByteValue), setrotationx4}, -2126003656, 2126003657, System.identityHashCode(itVar6))).booleanValue()) {
                                im onFocusChangeListener7 = itVar6.setOnFocusChangeListener();
                                ahVar2 = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener7}, 1437547358, -1437547304, System.identityHashCode(onFocusChangeListener7));
                                if (ahVar2 == null) {
                                    int i1510 = f56530k;
                                    i21 = (i1510 ^ 23) + ((i1510 & 23) << 1);
                                    int i1511 = i21 % 128;
                                    f56529j = i1511;
                                    if (i21 % 2 != 0) {
                                        int i1512 = 2 / 0;
                                    }
                                    int i1513 = i1511 & 77;
                                    int i1514 = (i1511 | 77) & (~i1513);
                                    int i1610 = i1513 << 1;
                                    int i1611 = ((i1514 | i1610) << 1) - (i1514 ^ i1610);
                                    f56530k = i1611 % 128;
                                    int i1612 = i1611 % 2;
                                } else {
                                    anVar2 = (an) ((setImageTintList) w.setX(new Object[]{ahVar2}, 1693919772, -1693919769, System.identityHashCode(ahVar2)));
                                    if (anVar2 == null) {
                                        int i1613 = f56529j;
                                        i17 = ((i1613 ^ 19) - (~((i1613 & 19) << 1))) - 1;
                                        f56530k = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            int i1614 = 98 / 0;
                                        }
                                        int i1615 = (i1613 ^ 119) + ((i1613 & 119) << 1);
                                        f56530k = i1615 % 128;
                                        int i1616 = i1615 % 2;
                                    } else {
                                        navigationOnClickListener2 = anVar2.setNavigationOnClickListener();
                                        int i1617 = f56529j;
                                        int i1618 = ((i1617 ^ 101) - (~(-(-((i1617 & 101) << 1))))) - 1;
                                        f56530k = i1618 % 128;
                                        int i1619 = i1618 % 2;
                                    }
                                }
                                if (navigationOnClickListener2 != null) {
                                    int i1712 = f56530k;
                                    i20 = ((i1712 & 100) + (i1712 | 100)) - 1;
                                    f56529j = i20 % 128;
                                    if (i20 % 2 != 0) {
                                        navigationOnClickListener2.remove(1);
                                    } else {
                                        navigationOnClickListener2.remove(0);
                                    }
                                }
                                if (navigationOnClickListener2 != null) {
                                    int i1713 = f56529j;
                                    int i1714 = i1713 & 33;
                                    int i1715 = ((i1713 | 33) & (~i1714)) + (i1714 << 1);
                                    f56530k = i1715 % 128;
                                    int i1716 = i1715 % 2;
                                    if (!(!navigationOnClickListener2.isEmpty())) {
                                        int i1717 = f56530k + 31;
                                        f56529j = i1717 % 128;
                                        int i1718 = i1717 % 2;
                                        z11 = false;
                                    } else {
                                        int i1719 = f56529j + 51;
                                        int i1720 = i1719 % 128;
                                        f56530k = i1720;
                                        int i1721 = i1719 % 2;
                                        int i1810 = i1720 + 29;
                                        f56529j = i1810 % 128;
                                        int i1811 = i1810 % 2;
                                        z11 = true;
                                    }
                                } else {
                                    int i17110 = f56530k + 31;
                                    f56529j = i17110 % 128;
                                    int i17111 = i17110 % 2;
                                    z11 = false;
                                }
                                if (!(!z11)) {
                                    av avVar3 = (av) CollectionsKt___CollectionsKt.first((List) navigationOnClickListener2);
                                    itVar6.f56531f.setOnFocusChangeListener(new setText(((Byte) av.setY(new Object[]{avVar3}, -888174800, 888174800, System.identityHashCode(avVar3))).byteValue(), ((Byte) av.setY(new Object[]{avVar3}, 1262930435, -1262930433, System.identityHashCode(avVar3))).byteValue()));
                                    im onFocusChangeListener8 = itVar6.setOnFocusChangeListener();
                                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener8, setSupportBackgroundTintMode.setCompoundDrawableTintBlendMode}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener8));
                                    int i1812 = f56529j;
                                    int i1813 = ((i1812 & 52) + (i1812 | 52)) - 1;
                                    f56530k = i1813 % 128;
                                    int i1814 = i1813 % 2;
                                } else {
                                    int i1815 = f56529j;
                                    i18 = (i1815 ^ 109) + ((i1815 & 109) << 1);
                                    f56530k = i18 % 128;
                                    if (i18 % 2 == 0) {
                                        im onFocusChangeListener9 = itVar6.setOnFocusChangeListener();
                                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener9, setSupportBackgroundTintMode.setDividerPadding}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener9));
                                        int i1816 = 16 / 0;
                                    } else {
                                        im onFocusChangeListener10 = itVar6.setOnFocusChangeListener();
                                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener10, setSupportBackgroundTintMode.setDividerPadding}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener10));
                                    }
                                }
                                setOnFocusChangeListener(new Object[]{itVar6.setOnFocusChangeListener(), Boolean.valueOf(zBooleanValue), Byte.valueOf(bByteValue), (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx4}, -707146526, 707146527, System.identityHashCode(setrotationx4)), (byte[]) setRotationX.setX(new Object[]{setrotationx4}, -1008183286, 1008183296, System.identityHashCode(setrotationx4))}, 1566175275, -1566175272, (int) System.currentTimeMillis());
                                objValueOf = new iq(itVar6.setOnFocusChangeListener(), itVar6.setCompoundDrawableTintBlendMode(), itVar6.setX(), itVar6.f56532g, itVar6.f56533h, itVar6.f56534i).setX(continuation2);
                                int i1817 = f56529j;
                                i19 = (((i1817 ^ 69) | (i1817 & 69)) << 1) - (((~i1817) & 69) | (i1817 & (-70)));
                                f56530k = i19 % 128;
                                if (i19 % 2 == 0) {
                                    int i1818 = 27 / 0;
                                }
                            } else {
                                int i1819 = f56530k;
                                int i1910 = i1819 & 67;
                                i22 = ((i1819 | 67) & (~i1910)) + (i1910 << 1);
                                f56529j = i22 % 128;
                                if (i22 % 2 == 0) {
                                    throw null;
                                }
                                objValueOf = (fk) setOnFocusChangeListener(new Object[]{itVar6}, 384654630, -384654628, System.identityHashCode(itVar6));
                                int i1911 = f56530k;
                                i23 = (((i1911 | 88) << 1) - (i1911 ^ 88)) - 1;
                                f56529j = i23 % 128;
                                if (i23 % 2 != 0) {
                                    throw null;
                                }
                            }
                        } else {
                            i24 = f56529j + 97;
                            f56530k = i24 % 128;
                            if (i24 % 2 != 0) {
                                throw null;
                            }
                            objValueOf = (fk) setOnFocusChangeListener(new Object[]{itVar6, setrotationx4}, -787977014, 787977019, System.identityHashCode(itVar6));
                            int i1912 = f56529j;
                            i25 = i1912 & 115;
                            i26 = (i1912 ^ 115) | i25;
                        }
                    } else {
                        int i209 = f56529j + 85;
                        f56530k = i209 % 128;
                        int i210 = i209 % 2;
                        objValueOf = (fk) setOnFocusChangeListener(new Object[]{itVar6, setrotationx4}, -787977014, 787977019, System.identityHashCode(itVar6));
                        int i211 = f56529j;
                        i25 = (i211 & (-22)) | ((~i211) & 21);
                        i26 = (i211 & 21) << 1;
                    }
                    int i212 = (i25 - (~i26)) - 1;
                    f56530k = i212 % 128;
                    int i213 = i212 % 2;
                } else {
                    int i214 = 37 / 0;
                    if (!(!((Boolean) setRotationX.setX(new Object[]{setrotationx4}, -268504199, 268504206, System.identityHashCode(setrotationx4))).booleanValue())) {
                        im onFocusChangeListener11 = itVar6.setOnFocusChangeListener();
                        ahVar = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener11}, 1437547358, -1437547304, System.identityHashCode(onFocusChangeListener11));
                        if (ahVar == null) {
                            anVar = (an) ((setImageTintList) w.setX(new Object[]{ahVar}, 1693919772, -1693919769, System.identityHashCode(ahVar)));
                            if (anVar == null) {
                                navigationOnClickListener = anVar.setNavigationOnClickListener();
                                if (navigationOnClickListener == null) {
                                    int i1410 = f56529j;
                                    int i1515 = (i1410 ^ 8) + ((i1410 & 8) << 1);
                                    i15 = (i1515 ^ (-1)) + (i1515 << 1);
                                    f56530k = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        throw null;
                                    }
                                } else {
                                    avVar = (av) CollectionsKt___CollectionsKt.first((List) navigationOnClickListener);
                                    int i1516 = f56529j;
                                    int i1517 = (i1516 & 4) + (i1516 | 4);
                                    int i1518 = (i1517 ^ (-1)) + (i1517 << 1);
                                    f56530k = i1518 % 128;
                                    int i1519 = i1518 % 2;
                                }
                                if (avVar == null) {
                                    zBooleanValue = ((Boolean) av.setY(new Object[]{avVar}, -1890498550, 1890498551, System.identityHashCode(avVar))).booleanValue();
                                    bByteValue = ((Byte) av.setY(new Object[]{avVar}, -888174800, 888174800, System.identityHashCode(avVar))).byteValue();
                                    if (!((Boolean) setOnFocusChangeListener(new Object[]{itVar6, Byte.valueOf(bByteValue), setrotationx4}, -2126003656, 2126003657, System.identityHashCode(itVar6))).booleanValue()) {
                                        im onFocusChangeListener12 = itVar6.setOnFocusChangeListener();
                                        ahVar2 = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener12}, 1437547358, -1437547304, System.identityHashCode(onFocusChangeListener12));
                                        if (ahVar2 == null) {
                                            int i15110 = f56530k;
                                            i21 = (i15110 ^ 23) + ((i15110 & 23) << 1);
                                            int i15111 = i21 % 128;
                                            f56529j = i15111;
                                            if (i21 % 2 != 0) {
                                                int i15112 = 2 / 0;
                                            }
                                            int i15113 = i15111 & 77;
                                            int i15114 = (i15111 | 77) & (~i15113);
                                            int i16110 = i15113 << 1;
                                            int i16111 = ((i15114 | i16110) << 1) - (i15114 ^ i16110);
                                            f56530k = i16111 % 128;
                                            int i16112 = i16111 % 2;
                                        } else {
                                            anVar2 = (an) ((setImageTintList) w.setX(new Object[]{ahVar2}, 1693919772, -1693919769, System.identityHashCode(ahVar2)));
                                            if (anVar2 == null) {
                                                int i16113 = f56529j;
                                                i17 = ((i16113 ^ 19) - (~((i16113 & 19) << 1))) - 1;
                                                f56530k = i17 % 128;
                                                if (i17 % 2 == 0) {
                                                    int i16114 = 98 / 0;
                                                }
                                                int i16115 = (i16113 ^ 119) + ((i16113 & 119) << 1);
                                                f56530k = i16115 % 128;
                                                int i16116 = i16115 % 2;
                                            } else {
                                                navigationOnClickListener2 = anVar2.setNavigationOnClickListener();
                                                int i16117 = f56529j;
                                                int i16118 = ((i16117 ^ 101) - (~(-(-((i16117 & 101) << 1))))) - 1;
                                                f56530k = i16118 % 128;
                                                int i16119 = i16118 % 2;
                                            }
                                        }
                                        if (navigationOnClickListener2 != null) {
                                            int i17112 = f56530k;
                                            i20 = ((i17112 & 100) + (i17112 | 100)) - 1;
                                            f56529j = i20 % 128;
                                            if (i20 % 2 != 0) {
                                                navigationOnClickListener2.remove(1);
                                            } else {
                                                navigationOnClickListener2.remove(0);
                                            }
                                        }
                                        if (navigationOnClickListener2 != null) {
                                            int i17113 = f56529j;
                                            int i17114 = i17113 & 33;
                                            int i17115 = ((i17113 | 33) & (~i17114)) + (i17114 << 1);
                                            f56530k = i17115 % 128;
                                            int i17116 = i17115 % 2;
                                            if (!(!navigationOnClickListener2.isEmpty())) {
                                                int i17117 = f56530k + 31;
                                                f56529j = i17117 % 128;
                                                int i17118 = i17117 % 2;
                                                z11 = false;
                                            } else {
                                                int i17119 = f56529j + 51;
                                                int i1722 = i17119 % 128;
                                                f56530k = i1722;
                                                int i1723 = i17119 % 2;
                                                int i18110 = i1722 + 29;
                                                f56529j = i18110 % 128;
                                                int i18111 = i18110 % 2;
                                                z11 = true;
                                            }
                                        } else {
                                            int i171110 = f56530k + 31;
                                            f56529j = i171110 % 128;
                                            int i171111 = i171110 % 2;
                                            z11 = false;
                                        }
                                        if (!(!z11)) {
                                            av avVar4 = (av) CollectionsKt___CollectionsKt.first((List) navigationOnClickListener2);
                                            itVar6.f56531f.setOnFocusChangeListener(new setText(((Byte) av.setY(new Object[]{avVar4}, -888174800, 888174800, System.identityHashCode(avVar4))).byteValue(), ((Byte) av.setY(new Object[]{avVar4}, 1262930435, -1262930433, System.identityHashCode(avVar4))).byteValue()));
                                            im onFocusChangeListener13 = itVar6.setOnFocusChangeListener();
                                            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener13, setSupportBackgroundTintMode.setCompoundDrawableTintBlendMode}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener13));
                                            int i18112 = f56529j;
                                            int i18113 = ((i18112 & 52) + (i18112 | 52)) - 1;
                                            f56530k = i18113 % 128;
                                            int i18114 = i18113 % 2;
                                        } else {
                                            int i18115 = f56529j;
                                            i18 = (i18115 ^ 109) + ((i18115 & 109) << 1);
                                            f56530k = i18 % 128;
                                            if (i18 % 2 == 0) {
                                                im onFocusChangeListener14 = itVar6.setOnFocusChangeListener();
                                                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener14, setSupportBackgroundTintMode.setDividerPadding}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener14));
                                                int i18116 = 16 / 0;
                                            } else {
                                                im onFocusChangeListener15 = itVar6.setOnFocusChangeListener();
                                                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener15, setSupportBackgroundTintMode.setDividerPadding}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener15));
                                            }
                                        }
                                        setOnFocusChangeListener(new Object[]{itVar6.setOnFocusChangeListener(), Boolean.valueOf(zBooleanValue), Byte.valueOf(bByteValue), (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx4}, -707146526, 707146527, System.identityHashCode(setrotationx4)), (byte[]) setRotationX.setX(new Object[]{setrotationx4}, -1008183286, 1008183296, System.identityHashCode(setrotationx4))}, 1566175275, -1566175272, (int) System.currentTimeMillis());
                                        objValueOf = new iq(itVar6.setOnFocusChangeListener(), itVar6.setCompoundDrawableTintBlendMode(), itVar6.setX(), itVar6.f56532g, itVar6.f56533h, itVar6.f56534i).setX(continuation2);
                                        int i18117 = f56529j;
                                        i19 = (((i18117 ^ 69) | (i18117 & 69)) << 1) - (((~i18117) & 69) | (i18117 & (-70)));
                                        f56530k = i19 % 128;
                                        if (i19 % 2 == 0) {
                                            int i18118 = 27 / 0;
                                        }
                                    } else {
                                        int i18119 = f56530k;
                                        int i1913 = i18119 & 67;
                                        i22 = ((i18119 | 67) & (~i1913)) + (i1913 << 1);
                                        f56529j = i22 % 128;
                                        if (i22 % 2 == 0) {
                                            throw null;
                                        }
                                        objValueOf = (fk) setOnFocusChangeListener(new Object[]{itVar6}, 384654630, -384654628, System.identityHashCode(itVar6));
                                        int i1914 = f56530k;
                                        i23 = (((i1914 | 88) << 1) - (i1914 ^ 88)) - 1;
                                        f56529j = i23 % 128;
                                        if (i23 % 2 != 0) {
                                            throw null;
                                        }
                                    }
                                } else {
                                    i24 = f56529j + 97;
                                    f56530k = i24 % 128;
                                    if (i24 % 2 != 0) {
                                        throw null;
                                    }
                                    objValueOf = (fk) setOnFocusChangeListener(new Object[]{itVar6, setrotationx4}, -787977014, 787977019, System.identityHashCode(itVar6));
                                    int i1915 = f56529j;
                                    i25 = i1915 & 115;
                                    i26 = (i1915 ^ 115) | i25;
                                }
                            } else {
                                int i1916 = f56529j;
                                int i1917 = ((~i1916) & 37) | (i1916 & (-38));
                                int i1918 = (i1916 & 37) << 1;
                                i16 = (i1917 ^ i1918) + ((i1918 & i1917) << 1);
                                int i1919 = i16 % 128;
                                f56530k = i1919;
                                if (i16 % 2 == 0) {
                                    int i1920 = 7 / 0;
                                }
                                int i1921 = (i1919 & (-92)) | (91 & (~i1919));
                                int i1922 = (i1919 & 91) << 1;
                                int i2010 = (i1921 & i1922) + (i1922 | i1921);
                                f56529j = i2010 % 128;
                                int i2011 = i2010 % 2;
                            }
                        } else {
                            int i2012 = (-2) - ((f56530k + 78) ^ (-1));
                            int i2013 = i2012 % 128;
                            f56529j = i2013;
                            int i2014 = i2012 % 2;
                            int i2015 = i2013 & 1;
                            int i2016 = -(-((i2013 ^ 1) | i2015));
                            int i2017 = (i2015 ^ i2016) + ((i2015 & i2016) << 1);
                            f56530k = i2017 % 128;
                            int i2018 = i2017 % 2;
                        }
                        avVar = null;
                        if (avVar == null) {
                            zBooleanValue = ((Boolean) av.setY(new Object[]{avVar}, -1890498550, 1890498551, System.identityHashCode(avVar))).booleanValue();
                            bByteValue = ((Byte) av.setY(new Object[]{avVar}, -888174800, 888174800, System.identityHashCode(avVar))).byteValue();
                            if (!((Boolean) setOnFocusChangeListener(new Object[]{itVar6, Byte.valueOf(bByteValue), setrotationx4}, -2126003656, 2126003657, System.identityHashCode(itVar6))).booleanValue()) {
                                im onFocusChangeListener16 = itVar6.setOnFocusChangeListener();
                                ahVar2 = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener16}, 1437547358, -1437547304, System.identityHashCode(onFocusChangeListener16));
                                if (ahVar2 == null) {
                                    int i15115 = f56530k;
                                    i21 = (i15115 ^ 23) + ((i15115 & 23) << 1);
                                    int i15116 = i21 % 128;
                                    f56529j = i15116;
                                    if (i21 % 2 != 0) {
                                        int i15117 = 2 / 0;
                                    }
                                    int i15118 = i15116 & 77;
                                    int i15119 = (i15116 | 77) & (~i15118);
                                    int i161110 = i15118 << 1;
                                    int i161111 = ((i15119 | i161110) << 1) - (i15119 ^ i161110);
                                    f56530k = i161111 % 128;
                                    int i161112 = i161111 % 2;
                                } else {
                                    anVar2 = (an) ((setImageTintList) w.setX(new Object[]{ahVar2}, 1693919772, -1693919769, System.identityHashCode(ahVar2)));
                                    if (anVar2 == null) {
                                        int i161113 = f56529j;
                                        i17 = ((i161113 ^ 19) - (~((i161113 & 19) << 1))) - 1;
                                        f56530k = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            int i161114 = 98 / 0;
                                        }
                                        int i161115 = (i161113 ^ 119) + ((i161113 & 119) << 1);
                                        f56530k = i161115 % 128;
                                        int i161116 = i161115 % 2;
                                    } else {
                                        navigationOnClickListener2 = anVar2.setNavigationOnClickListener();
                                        int i161117 = f56529j;
                                        int i161118 = ((i161117 ^ 101) - (~(-(-((i161117 & 101) << 1))))) - 1;
                                        f56530k = i161118 % 128;
                                        int i161119 = i161118 % 2;
                                    }
                                }
                                if (navigationOnClickListener2 != null) {
                                    int i171112 = f56530k;
                                    i20 = ((i171112 & 100) + (i171112 | 100)) - 1;
                                    f56529j = i20 % 128;
                                    if (i20 % 2 != 0) {
                                        navigationOnClickListener2.remove(1);
                                    } else {
                                        navigationOnClickListener2.remove(0);
                                    }
                                }
                                if (navigationOnClickListener2 != null) {
                                    int i171113 = f56529j;
                                    int i171114 = i171113 & 33;
                                    int i171115 = ((i171113 | 33) & (~i171114)) + (i171114 << 1);
                                    f56530k = i171115 % 128;
                                    int i171116 = i171115 % 2;
                                    if (!(!navigationOnClickListener2.isEmpty())) {
                                        int i171117 = f56530k + 31;
                                        f56529j = i171117 % 128;
                                        int i171118 = i171117 % 2;
                                        z11 = false;
                                    } else {
                                        int i171119 = f56529j + 51;
                                        int i1724 = i171119 % 128;
                                        f56530k = i1724;
                                        int i1725 = i171119 % 2;
                                        int i181110 = i1724 + 29;
                                        f56529j = i181110 % 128;
                                        int i181111 = i181110 % 2;
                                        z11 = true;
                                    }
                                } else {
                                    int i1711110 = f56530k + 31;
                                    f56529j = i1711110 % 128;
                                    int i1711111 = i1711110 % 2;
                                    z11 = false;
                                }
                                if (!(!z11)) {
                                    av avVar5 = (av) CollectionsKt___CollectionsKt.first((List) navigationOnClickListener2);
                                    itVar6.f56531f.setOnFocusChangeListener(new setText(((Byte) av.setY(new Object[]{avVar5}, -888174800, 888174800, System.identityHashCode(avVar5))).byteValue(), ((Byte) av.setY(new Object[]{avVar5}, 1262930435, -1262930433, System.identityHashCode(avVar5))).byteValue()));
                                    im onFocusChangeListener17 = itVar6.setOnFocusChangeListener();
                                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener17, setSupportBackgroundTintMode.setCompoundDrawableTintBlendMode}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener17));
                                    int i181112 = f56529j;
                                    int i181113 = ((i181112 & 52) + (i181112 | 52)) - 1;
                                    f56530k = i181113 % 128;
                                    int i181114 = i181113 % 2;
                                } else {
                                    int i181115 = f56529j;
                                    i18 = (i181115 ^ 109) + ((i181115 & 109) << 1);
                                    f56530k = i18 % 128;
                                    if (i18 % 2 == 0) {
                                        im onFocusChangeListener18 = itVar6.setOnFocusChangeListener();
                                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener18, setSupportBackgroundTintMode.setDividerPadding}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener18));
                                        int i181116 = 16 / 0;
                                    } else {
                                        im onFocusChangeListener19 = itVar6.setOnFocusChangeListener();
                                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener19, setSupportBackgroundTintMode.setDividerPadding}, 346983986, -346983929, System.identityHashCode(onFocusChangeListener19));
                                    }
                                }
                                setOnFocusChangeListener(new Object[]{itVar6.setOnFocusChangeListener(), Boolean.valueOf(zBooleanValue), Byte.valueOf(bByteValue), (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx4}, -707146526, 707146527, System.identityHashCode(setrotationx4)), (byte[]) setRotationX.setX(new Object[]{setrotationx4}, -1008183286, 1008183296, System.identityHashCode(setrotationx4))}, 1566175275, -1566175272, (int) System.currentTimeMillis());
                                objValueOf = new iq(itVar6.setOnFocusChangeListener(), itVar6.setCompoundDrawableTintBlendMode(), itVar6.setX(), itVar6.f56532g, itVar6.f56533h, itVar6.f56534i).setX(continuation2);
                                int i181117 = f56529j;
                                i19 = (((i181117 ^ 69) | (i181117 & 69)) << 1) - (((~i181117) & 69) | (i181117 & (-70)));
                                f56530k = i19 % 128;
                                if (i19 % 2 == 0) {
                                    int i181118 = 27 / 0;
                                }
                            } else {
                                int i181119 = f56530k;
                                int i19110 = i181119 & 67;
                                i22 = ((i181119 | 67) & (~i19110)) + (i19110 << 1);
                                f56529j = i22 % 128;
                                if (i22 % 2 == 0) {
                                    throw null;
                                }
                                objValueOf = (fk) setOnFocusChangeListener(new Object[]{itVar6}, 384654630, -384654628, System.identityHashCode(itVar6));
                                int i19111 = f56530k;
                                i23 = (((i19111 | 88) << 1) - (i19111 ^ 88)) - 1;
                                f56529j = i23 % 128;
                                if (i23 % 2 != 0) {
                                    throw null;
                                }
                            }
                        } else {
                            i24 = f56529j + 97;
                            f56530k = i24 % 128;
                            if (i24 % 2 != 0) {
                                throw null;
                            }
                            objValueOf = (fk) setOnFocusChangeListener(new Object[]{itVar6, setrotationx4}, -787977014, 787977019, System.identityHashCode(itVar6));
                            int i19112 = f56529j;
                            i25 = i19112 & 115;
                            i26 = (i19112 ^ 115) | i25;
                        }
                    } else {
                        int i2019 = f56529j + 85;
                        f56530k = i2019 % 128;
                        int i215 = i2019 % 2;
                        objValueOf = (fk) setOnFocusChangeListener(new Object[]{itVar6, setrotationx4}, -787977014, 787977019, System.identityHashCode(itVar6));
                        int i216 = f56529j;
                        i25 = (i216 & (-22)) | ((~i216) & 21);
                        i26 = (i216 & 21) << 1;
                    }
                    int i217 = (i25 - (~i26)) - 1;
                    f56530k = i217 % 128;
                    int i218 = i217 % 2;
                }
                break;
        }
        return objValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setOnFocusChangeListener(new Object[]{this, continuation}, 14420552, -14420548, System.identityHashCode(this));
    }
}
