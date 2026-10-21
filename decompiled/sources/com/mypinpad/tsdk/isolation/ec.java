package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.isolation.fb;
import com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ec<D extends setScrollBarDefaultDelayBeforeFade, O extends fb<D>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55338d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55339e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final D f55340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTextKeepState f55341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final O f55342c;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ec f55343p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f55344q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ec<D, O> f55345r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f55346s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ec<D, O> ecVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f55345r0 = ecVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object[] objArr = {this, obj};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            aVar.f55344q0 = objArr[1];
            int i10 = aVar.f55346s0;
            aVar.f55346s0 = (i10 & Integer.MIN_VALUE) | (i10 ^ Integer.MIN_VALUE);
            ec<D, O> ecVar = aVar.f55345r0;
            Object compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{ecVar, aVar}, 1559788296, -1559788294, System.identityHashCode(ecVar));
            System.identityHashCode(aVar);
            System.identityHashCode(aVar);
            return compoundDrawableTintBlendMode;
        }
    }

    public /* synthetic */ class setX {
        public static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[setTextLocales.values().length];
            iArr[setTextLocales.setY.ordinal()] = 1;
            iArr[setTextLocales.setDividerPadding.ordinal()] = 2;
            iArr[setTextLocales.setX.ordinal()] = 3;
            iArr[setTextLocales.setCompoundDrawableTintBlendMode.ordinal()] = 4;
            setX = iArr;
            int i10 = 1 & 19;
            int i11 = -(-((1 ^ 19) | i10));
            int i12 = (i10 & i11) + (i10 | i11);
            int i13 = i12 % 128;
            int i14 = i12 % 2;
        }
    }

    public ec(@NotNull D d2, @NotNull setTextKeepState settextkeepstate, @NotNull O o2) {
        Intrinsics.checkNotNullParameter(d2, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(o2, "");
        this.f55340a = d2;
        this.f55341b = settextkeepstate;
        this.f55342c = o2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0155  */
    /* JADX WARN: Code duplicated, block: B:45:0x0223  */
    /* JADX WARN: Code duplicated, block: B:52:0x02a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x02a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:61:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:66:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:70:0x0304  */
    /* JADX WARN: Code duplicated, block: B:72:0x031c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0335  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        a aVar;
        com.mypinpad.tsdk.isolation.a aVar2;
        int i13;
        int i14;
        fk dividerPadding;
        int i15;
        fk compoundDrawableTintBlendMode;
        int i16;
        int i17;
        int i18 = ((~i11) * (-783)) + (i11 * (-782)) + (i10 * 784);
        int i19 = ~i10;
        int i20 = ~i12;
        int i21 = ((i19 | (~(i11 | i20))) * 783) + ((~(i19 | i20 | i11)) * (-783)) + i18;
        if (i21 == 1) {
            ec ecVar = (ec) objArr[0];
            int i22 = f55339e;
            int i23 = ((i22 | 62) << 1) - (i22 ^ 62);
            int i24 = (i23 ^ (-1)) + (i23 << 1);
            int i25 = i24 % 128;
            f55338d = i25;
            int i26 = i24 % 2;
            setTextKeepState settextkeepstate = ecVar.f55341b;
            int i27 = i25 | 91;
            int i28 = i27 << 1;
            int i29 = -((~(91 & i25)) & i27);
            int i30 = (i28 & i29) + (i29 | i28);
            f55339e = i30 % 128;
            int i31 = i30 % 2;
            return settextkeepstate;
        }
        if (i21 != 2) {
            if (i21 == 3) {
                ec ecVar2 = (ec) objArr[0];
                int i32 = f55339e + 81;
                f55338d = i32 % 128;
                int i33 = i32 % 2;
                O o2 = ecVar2.f55342c;
                if (i33 == 0) {
                    return o2;
                }
                throw null;
            }
            if (i21 == 4) {
                com.mypinpad.tsdk.isolation.a aVar3 = (com.mypinpad.tsdk.isolation.a) objArr[0];
                throw new fh(32, ((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar3}, -298445589, 298445592, System.identityHashCode(aVar3))).toString());
            }
            ec ecVar3 = (ec) objArr[0];
            int i34 = f55339e;
            int i35 = (i34 | 45) << 1;
            int i36 = -(((~i34) & 45) | (i34 & (-46)));
            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
            int i38 = i37 % 128;
            f55338d = i38;
            int i39 = i37 % 2;
            D d2 = ecVar3.f55340a;
            int i40 = i38 & 1;
            int i41 = (i38 ^ 1) | i40;
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            f55339e = i42 % 128;
            int i43 = i42 % 2;
            return d2;
        }
        ec ecVar4 = (ec) objArr[0];
        Continuation continuation = (Continuation) objArr[1];
        int i44 = f55338d;
        int i45 = i44 & 23;
        int i46 = i45 + ((i44 ^ 23) | i45);
        f55339e = i46 % 128;
        if (i46 % 2 == 0) {
            boolean z10 = continuation instanceof a;
            throw null;
        }
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i47 = aVar.f55346s0;
            if ((i47 & Integer.MIN_VALUE) != 0) {
                int i48 = i44 & 79;
                int i49 = -(-((i44 ^ 79) | i48));
                int i50 = (i48 & i49) + (i48 | i49);
                f55339e = i50 % 128;
                int i51 = i50 % 2;
                int iIdentityHashCode = System.identityHashCode(ecVar4);
                int i52 = i47 * (-344);
                int i53 = (i52 << 1) - i52;
                int i54 = ~i47;
                int i55 = Integer.MAX_VALUE & i54;
                int i56 = ~(((~i55) & (Integer.MAX_VALUE | i54)) | i55);
                int i57 = Integer.MAX_VALUE ^ iIdentityHashCode;
                int i58 = ~iIdentityHashCode;
                int i59 = Integer.MAX_VALUE & iIdentityHashCode;
                int i60 = ~((i57 ^ i59) | (i57 & i59));
                int i61 = i56 ^ i60;
                int i62 = i60 & i56;
                int i63 = ((i61 & i62) | (i61 ^ i62)) * 345;
                int i64 = ((~i53) & i63) | ((~i63) & i53);
                int i65 = -(-((i63 & i53) << 1));
                int i66 = (i64 & i65) + (i64 | i65);
                int i67 = (i58 | iIdentityHashCode) & i58;
                int i68 = Integer.MAX_VALUE & i67;
                int i69 = ~(((Integer.MAX_VALUE | i67) & (~i68)) | i68);
                int i70 = ~i54;
                int i71 = (Integer.MIN_VALUE & i70) | i55;
                int i72 = i54 & Integer.MIN_VALUE;
                int i73 = ~((i71 & i72) | (i71 ^ i72));
                int i74 = -(~(-(-(((i69 & i73) | (i69 ^ i73)) * 345))));
                int i75 = ((i66 ^ i74) + ((i74 & i66) << 1)) - 1;
                int i76 = (Integer.MAX_VALUE & i70) | i72;
                int i77 = (i76 & i55) | (i76 ^ i55);
                int i78 = (i58 & i77) | ((~i77) & iIdentityHashCode);
                int i79 = i77 & iIdentityHashCode;
                int i80 = (~((i79 & i78) | (i78 ^ i79))) * 345;
                aVar.f55346s0 = ((i75 | i80) << 1) - (i80 ^ i75);
                int i81 = f55338d;
                int i82 = (i81 & 60) + (i81 | 60);
                int i83 = (i82 ^ (-1)) + (i82 << 1);
                f55339e = i83 % 128;
                int i84 = i83 % 2;
            } else {
                aVar = new a(ecVar4, continuation);
                int i85 = f55338d;
                int i86 = ((i85 | 35) << 1) - (i85 ^ 35);
                f55339e = i86 % 128;
                int i87 = i86 % 2;
            }
        } else {
            aVar = new a(ecVar4, continuation);
            int i88 = f55338d;
            int i89 = ((i88 | 35) << 1) - (i88 ^ 35);
            f55339e = i89 % 128;
            int i810 = i89 % 2;
        }
        Object compoundDrawableTintBlendMode2 = aVar.f55344q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i90 = aVar.f55346s0;
        if (i90 == 0) {
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode2);
            setTextKeepState settextkeepstate2 = (setTextKeepState) setCompoundDrawableTintBlendMode(new Object[]{ecVar4}, 1001493365, -1001493364, System.identityHashCode(ecVar4));
            if (!((Boolean) setTextKeepState.setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate2}, 11951396, -11951391, System.identityHashCode(settextkeepstate2))).booleanValue()) {
                aVar.f55346s0 = 3;
                compoundDrawableTintBlendMode2 = ecVar4.setDividerPadding(aVar);
                if (compoundDrawableTintBlendMode2 == coroutine_suspended) {
                    int i91 = f55339e;
                    int i92 = (((i91 | 92) << 1) - (i91 ^ 92)) - 1;
                    int i93 = i92 % 128;
                    f55338d = i93;
                    if (i92 % 2 != 0) {
                        int i94 = 91 / 0;
                    }
                    int i95 = (i93 & 109) + (i93 | 109);
                    f55339e = i95 % 128;
                    int i96 = i95 % 2;
                }
                int i97 = f55339e;
                i17 = (i97 ^ 35) + ((i97 & 35) << 1);
                f55338d = i17 % 128;
                if (i17 % 2 != 0) {
                    throw null;
                }
            } else {
                int i98 = f55339e;
                int i99 = ((i98 ^ 39) | (i98 & 39)) << 1;
                int i100 = -(((~i98) & 39) | (i98 & (-40)));
                int i101 = (i99 ^ i100) + ((i100 & i99) << 1);
                f55338d = i101 % 128;
                int i102 = i101 % 2;
                setTextKeepState settextkeepstate3 = (setTextKeepState) setCompoundDrawableTintBlendMode(new Object[]{ecVar4}, 1001493365, -1001493364, System.identityHashCode(ecVar4));
                aVar.f55343p0 = ecVar4;
                aVar.f55346s0 = 1;
                compoundDrawableTintBlendMode2 = setTextKeepState.setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate3, aVar}, -1083100835, 1083100838, System.identityHashCode(settextkeepstate3));
                if (compoundDrawableTintBlendMode2 == coroutine_suspended) {
                    int i103 = f55339e;
                    int i104 = ((i103 & (-100)) | ((~i103) & 99)) + ((i103 & 99) << 1);
                    f55338d = i104 % 128;
                    int i105 = i104 % 2;
                    int i106 = (i103 & 25) + (i103 | 25);
                    f55338d = i106 % 128;
                    int i107 = i106 % 2;
                } else {
                    aVar2 = (com.mypinpad.tsdk.isolation.a) compoundDrawableTintBlendMode2;
                    i13 = setX.setX[((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar2}, -298445589, 298445592, System.identityHashCode(aVar2))).ordinal()];
                    if (i13 != 1) {
                        fk navigationOnClickListener = ecVar4.setNavigationOnClickListener();
                        int i108 = f55339e;
                        int i109 = i108 ^ 103;
                        int i110 = -(-((i108 & 103) << 1));
                        int i111 = ((i109 | i110) << 1) - (i110 ^ i109);
                        f55338d = i111 % 128;
                        int i112 = i111 % 2;
                        return navigationOnClickListener;
                    }
                    if (i13 != 2) {
                        if (i13 != 3) {
                            dividerPadding = ecVar4.setDividerPadding();
                            int i113 = f55338d;
                            i15 = (i113 & 79) + (i113 | 79);
                            f55339e = i15 % 128;
                            if (i15 % 2 != 0) {
                                return dividerPadding;
                            }
                            throw null;
                        }
                        if (i13 == 4) {
                            throw new fh(32, ((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar2}, -298445589, 298445592, System.identityHashCode(aVar2))).toString());
                        }
                        compoundDrawableTintBlendMode = ecVar4.setCompoundDrawableTintBlendMode(aVar2);
                        int i114 = f55339e;
                        i16 = ((i114 | 53) << 1) - (i114 ^ 53);
                        f55338d = i16 % 128;
                        if (i16 % 2 == 0) {
                            return compoundDrawableTintBlendMode;
                        }
                        throw null;
                    }
                    aVar.f55343p0 = null;
                    aVar.f55346s0 = 2;
                    compoundDrawableTintBlendMode2 = ecVar4.setX(aVar2);
                    if (compoundDrawableTintBlendMode2 == coroutine_suspended) {
                        int i115 = f55339e;
                        int i116 = ((i115 ^ 123) - (~((i115 & 123) << 1))) - 1;
                        int i117 = i116 % 128;
                        f55338d = i117;
                        int i118 = i116 % 2;
                        i14 = i117 + 111;
                        f55339e = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i119 = 58 / 0;
                        }
                    }
                    int i120 = f55339e;
                    int i121 = i120 & 23;
                    int i122 = -(-(i120 | 23));
                    int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
                    f55338d = i123 % 128;
                    int i124 = i123 % 2;
                }
            }
            return coroutine_suspended;
        }
        if (i90 == 1) {
            ecVar4 = aVar.f55343p0;
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode2);
            int i125 = f55338d;
            int i126 = i125 & 121;
            int i127 = (i126 - (~((i125 ^ 121) | i126))) - 1;
            f55339e = i127 % 128;
            int i128 = i127 % 2;
            aVar2 = (com.mypinpad.tsdk.isolation.a) compoundDrawableTintBlendMode2;
            i13 = setX.setX[((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar2}, -298445589, 298445592, System.identityHashCode(aVar2))).ordinal()];
            if (i13 != 1) {
                fk navigationOnClickListener2 = ecVar4.setNavigationOnClickListener();
                int i1010 = f55339e;
                int i1011 = i1010 ^ 103;
                int i1110 = -(-((i1010 & 103) << 1));
                int i1111 = ((i1011 | i1110) << 1) - (i1110 ^ i1011);
                f55338d = i1111 % 128;
                int i1112 = i1111 % 2;
                return navigationOnClickListener2;
            }
            if (i13 != 2) {
                if (i13 != 3) {
                    dividerPadding = ecVar4.setDividerPadding();
                    int i1113 = f55338d;
                    i15 = (i1113 & 79) + (i1113 | 79);
                    f55339e = i15 % 128;
                    if (i15 % 2 != 0) {
                        return dividerPadding;
                    }
                    throw null;
                }
                if (i13 == 4) {
                    throw new fh(32, ((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar2}, -298445589, 298445592, System.identityHashCode(aVar2))).toString());
                }
                compoundDrawableTintBlendMode = ecVar4.setCompoundDrawableTintBlendMode(aVar2);
                int i1114 = f55339e;
                i16 = ((i1114 | 53) << 1) - (i1114 ^ 53);
                f55338d = i16 % 128;
                if (i16 % 2 == 0) {
                    return compoundDrawableTintBlendMode;
                }
                throw null;
            }
            aVar.f55343p0 = null;
            aVar.f55346s0 = 2;
            compoundDrawableTintBlendMode2 = ecVar4.setX(aVar2);
            if (compoundDrawableTintBlendMode2 == coroutine_suspended) {
                int i1115 = f55339e;
                int i1116 = ((i1115 ^ 123) - (~((i1115 & 123) << 1))) - 1;
                int i1117 = i1116 % 128;
                f55338d = i1117;
                int i1118 = i1116 % 2;
                i14 = i1117 + 111;
                f55339e = i14 % 128;
                if (i14 % 2 == 0) {
                    int i1119 = 58 / 0;
                }
                return coroutine_suspended;
            }
        } else if (i90 == 2) {
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode2);
            int i129 = f55339e + 123;
            f55338d = i129 % 128;
            int i130 = i129 % 2;
        } else {
            if (i90 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode2);
            int i131 = f55339e;
            int i132 = i131 & 123;
            int i133 = (i131 ^ 123) | i132;
            int i134 = (i132 ^ i133) + ((i133 & i132) << 1);
            f55338d = i134 % 128;
            int i135 = i134 % 2;
            int i910 = f55339e;
            i17 = (i910 ^ 35) + ((i910 & 35) << 1);
            f55338d = i17 % 128;
            if (i17 % 2 != 0) {
                throw null;
            }
        }
        int i1210 = f55339e;
        int i1211 = i1210 & 23;
        int i1212 = -(-(i1210 | 23));
        int i1213 = (i1211 ^ i1212) + ((i1212 & i1211) << 1);
        f55338d = i1213 % 128;
        int i1214 = i1213 % 2;
        return compoundDrawableTintBlendMode2;
    }

    @NotNull
    public fk setDividerPadding() {
        throw new fh(32, null);
    }

    @Nullable
    public abstract Object setDividerPadding(@NotNull Continuation<? super fk> continuation);

    @NotNull
    public fk setNavigationOnClickListener() {
        int i10 = f55338d;
        int i11 = ((i10 | 17) << 1) - (i10 ^ 17);
        f55339e = i11 % 128;
        int i12 = i11 % 2;
        setTextKeepState settextkeepstate = this.f55341b;
        D d2 = this.f55340a;
        O o2 = this.f55342c;
        if (i12 != 0) {
            return o2.setOnFocusChangeListener(d2, settextkeepstate);
        }
        int i13 = 43 / 0;
        return o2.setOnFocusChangeListener(d2, settextkeepstate);
    }

    @NotNull
    public final D setOnFocusChangeListener() {
        return (D) setCompoundDrawableTintBlendMode(new Object[]{this}, -1396275124, 1396275124, System.identityHashCode(this));
    }

    @Nullable
    public Object setX(@NotNull com.mypinpad.tsdk.isolation.a aVar) {
        int i10 = f55338d + 89;
        f55339e = i10 % 128;
        if (i10 % 2 != 0) {
            return setCompoundDrawableTintBlendMode(new Object[]{aVar}, -390982498, 390982502, (int) System.currentTimeMillis());
        }
        setCompoundDrawableTintBlendMode(new Object[]{aVar}, -390982498, 390982502, (int) System.currentTimeMillis());
        throw null;
    }

    @Nullable
    public final Object setX(@NotNull Continuation<? super fk> continuation) {
        return setCompoundDrawableTintBlendMode(new Object[]{this, continuation}, 1559788296, -1559788294, System.identityHashCode(this));
    }

    @NotNull
    public final O setX() {
        return (O) setCompoundDrawableTintBlendMode(new Object[]{this}, 356425760, -356425757, System.identityHashCode(this));
    }

    @NotNull
    public fk setCompoundDrawableTintBlendMode(@NotNull com.mypinpad.tsdk.isolation.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "");
        throw new fh(32, ((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar}, -298445589, 298445592, System.identityHashCode(aVar))).toString());
    }

    @NotNull
    public final setTextKeepState setCompoundDrawableTintBlendMode() {
        return (setTextKeepState) setCompoundDrawableTintBlendMode(new Object[]{this}, 1001493365, -1001493364, System.identityHashCode(this));
    }
}
