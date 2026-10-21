package com.mypinpad.tsdk.isolation;

import com.appsflyer.internal.f;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class xi implements getValue {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f61845i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f61846j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final component23 f61847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f61848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Channel<setImeActionLabel> f61849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final fm<setRotationX> f61850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f61851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f61852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f61853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f61854h;

    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f61855s0 = 0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f61856t0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f61857p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ setImeActionLabel f61859r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(setImeActionLabel setimeactionlabel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f61859r0 = setimeactionlabel;
        }

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-195)) + (i10 * (-391));
            int i14 = ~i11;
            int i15 = ~(i14 | i10);
            int i16 = ~(i12 | i11);
            int i17 = (((~((~i10) | i14)) | i16) * 196) + ((i11 | i10) * 392) + ((i15 | i16) * (-196)) + i13;
            if (i17 == 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                a aVar2 = xi.this.new a(aVar.f61859r0, (Continuation) objArr[2]);
                int i18 = f61856t0;
                int i19 = i18 & 65;
                int i20 = (i18 ^ 65) | i19;
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                f61855s0 = i21 % 128;
                int i22 = i21 % 2;
                return aVar2;
            }
            if (i17 != 2) {
                if (i17 == 3) {
                    a aVar3 = (a) objArr[0];
                    CoroutineScope coroutineScope = (CoroutineScope) objArr[1];
                    Continuation continuation = (Continuation) objArr[2];
                    System.identityHashCode(aVar3);
                    System.identityHashCode(aVar3);
                    a aVar4 = (a) ((Continuation) a(new Object[]{aVar3, coroutineScope, continuation}, 1367704734, -1367704733, System.identityHashCode(aVar3)));
                    Object objA = a(new Object[]{aVar4, Unit.INSTANCE}, 40771645, -40771643, System.identityHashCode(aVar4));
                    int i23 = f61855s0;
                    int i24 = (i23 ^ 93) + ((i23 & 93) << 1);
                    f61856t0 = i24 % 128;
                    int i25 = i24 % 2;
                    return objA;
                }
                a aVar5 = (a) objArr[0];
                Object obj2 = objArr[1];
                Object obj3 = objArr[2];
                int i26 = f61855s0;
                int i27 = (i26 & 91) + (i26 | 91);
                f61856t0 = i27 % 128;
                int i28 = i27 % 2;
                Object objA2 = a(new Object[]{aVar5, (CoroutineScope) obj2, (Continuation) obj3}, 1188900007, -1188900004, System.identityHashCode(aVar5));
                int i29 = f61856t0;
                int i30 = i29 & 91;
                int i31 = (i29 ^ 91) | i30;
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                f61855s0 = i32 % 128;
                int i33 = i32 % 2;
                return objA2;
            }
            a aVar6 = (a) objArr[0];
            Object obj4 = objArr[1];
            int i34 = f61856t0;
            int i35 = i34 & 77;
            int i36 = -(-((i34 ^ 77) | i35));
            int i37 = (i35 & i36) + (i36 | i35);
            f61855s0 = i37 % 128;
            if (i37 % 2 != 0) {
                ek.a.getCOROUTINE_SUSPENDED();
                int i38 = aVar6.f61857p0;
                throw null;
            }
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i39 = aVar6.f61857p0;
            if (i39 == 0) {
                ResultKt.throwOnFailure(obj4);
                Channel channel = (Channel) xi.setDividerPadding(new Object[]{xi.this}, 1223832607, -1223832600, (int) System.currentTimeMillis());
                aVar6.f61857p0 = 1;
                if (channel.send(aVar6.f61859r0, aVar6) == coroutine_suspended) {
                    int i40 = f61856t0;
                    int i41 = ((i40 & (-118)) | ((~i40) & 117)) + ((i40 & 117) << 1);
                    f61855s0 = i41 % 128;
                    int i42 = i41 % 2;
                    int i43 = (-2) - ((i40 + 42) ^ (-1));
                    f61855s0 = i43 % 128;
                    if (i43 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    throw null;
                }
            } else {
                if (i39 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj4);
                int i44 = f61855s0 + 117;
                f61856t0 = i44 % 128;
                int i45 = i44 % 2;
            }
            Unit unit = Unit.INSTANCE;
            int i46 = f61856t0;
            int i47 = ((i46 & 107) - (~(-(-(i46 | 107))))) - 1;
            f61855s0 = i47 % 128;
            int i48 = i47 % 2;
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return (Continuation) a(new Object[]{this, obj, continuation}, 1367704734, -1367704733, System.identityHashCode(this));
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return a(new Object[]{this, coroutineScope, continuation}, -1978481739, 1978481739, System.identityHashCode(this));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            return a(new Object[]{this, obj}, 40771645, -40771643, System.identityHashCode(this));
        }
    }

    public xi(@NotNull component23 component23Var, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(component23Var, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.f61847a = component23Var;
        this.f61848b = coroutineScope;
        this.f61849c = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f61850d = new fm<>();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:30:0x010b  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0104, code lost:
    
        if (r13 == r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0107, code lost:
    
        r12 = r3;
        r3 = r1;
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0115, code lost:
    
        if (r13 == r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0155, code lost:
    
        if (r13 == r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016e, code lost:
    
        if (r13 == r5) goto L43;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0155 -> B:17:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x016e -> B:17:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(java.lang.Object[] r13) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.xi.a(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:15:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0105  */
    /* JADX WARN: Code duplicated, block: B:19:0x0124  */
    /* JADX WARN: Code duplicated, block: B:21:0x012c  */
    /* JADX WARN: Code duplicated, block: B:24:0x01af  */
    /* JADX WARN: Code duplicated, block: B:26:0x01d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:29:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:33:0x020c  */
    /* JADX WARN: Code duplicated, block: B:36:0x021e  */
    /* JADX WARN: Code duplicated, block: B:37:0x024f  */
    /* JADX WARN: Code duplicated, block: B:40:0x026a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0291 A[Catch: TimeoutCancellationException -> 0x02bf, Exception -> 0x0325, TRY_ENTER, TRY_LEAVE, TryCatch #0 {TimeoutCancellationException -> 0x02bf, blocks: (B:34:0x021b, B:42:0x0291, B:45:0x0296, B:56:0x02c5, B:59:0x02ca, B:62:0x02e1, B:66:0x02fa), top: B:77:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:56:0x02c5 A[Catch: TimeoutCancellationException -> 0x02bf, Exception -> 0x0325, TRY_ENTER, TRY_LEAVE, TryCatch #0 {TimeoutCancellationException -> 0x02bf, blocks: (B:34:0x021b, B:42:0x0291, B:45:0x0296, B:56:0x02c5, B:59:0x02ca, B:62:0x02e1, B:66:0x02fa), top: B:77:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object[]] */
    public static /* synthetic */ Object b(Object[] objArr) {
        e10 e10Var;
        int i10;
        int i11;
        Object obj;
        Object coroutine_suspended;
        int i12;
        String str;
        long jCurrentTimeMillis;
        Object dividerPadding;
        int i13;
        int i14;
        byte[] bArr;
        int i15;
        setRotationX setrotationx;
        int i16;
        boolean z10;
        int i17;
        char c10;
        xi xiVar = (xi) objArr[0];
        setImeActionLabel setimeactionlabel = (setImeActionLabel) objArr[1];
        Continuation continuation = (Continuation) objArr[2];
        int i18 = f61845i;
        int i19 = ((i18 | 5) << 1) - (i18 ^ 5);
        f61846j = i19 % 128;
        try {
            if (i19 % 2 != 0) {
                if (continuation instanceof e10) {
                    e10Var = (e10) continuation;
                    i10 = e10Var.f55298u0;
                    i11 = i10 & Integer.MIN_VALUE;
                    if (i11 != 0) {
                        int i20 = ((i18 ^ 107) - (~((i18 & 107) << 1))) - 1;
                        f61846j = i20 % 128;
                        int i21 = i20 % 2;
                        int iIdentityHashCode = System.identityHashCode(xiVar);
                        int i22 = i10 * 399;
                        int i23 = Integer.MIN_VALUE & i22;
                        int i24 = -(-((i22 ^ Integer.MIN_VALUE) | i23));
                        int i25 = (i23 & i24) + (i24 | i23);
                        int i26 = Integer.MAX_VALUE & i10;
                        int i27 = ~((Integer.MAX_VALUE ^ i10) | i26);
                        int i28 = ~i10;
                        int i29 = Integer.MAX_VALUE & i28;
                        int i30 = ((~i28) & Integer.MIN_VALUE) | i29;
                        int i31 = i28 & Integer.MIN_VALUE;
                        int i32 = (i30 ^ i31) | (i30 & i31);
                        int i33 = ~i32;
                        int i34 = i33 & (i32 | i33);
                        int i35 = i27 & i34;
                        int i36 = (i34 | i27) & (~i35);
                        int i37 = (i36 & i35) | (i36 ^ i35);
                        int i38 = ~((i28 ^ iIdentityHashCode) | (i28 & iIdentityHashCode));
                        int i39 = i37 & i38;
                        int i40 = (i37 | i38) & (~i39);
                        int i41 = ((i40 & i39) | (i40 ^ i39)) * 398;
                        int i42 = i25 & i41;
                        int i43 = (((i25 ^ i41) | i42) << 1) - ((i41 | i25) & (~i42));
                        int i44 = i31 | i26;
                        int i45 = -(~(-(-(((i44 & i11) | (i44 ^ i11)) * (-1194)))));
                        int i46 = (-2) - (((i43 & i45) + (i45 | i43)) ^ (-1));
                        int i47 = (i28 | i10) & i28;
                        int i48 = ~iIdentityHashCode;
                        int i49 = ((~i48) & i47) | ((~i47) & i48);
                        int i50 = i47 & i48;
                        int i51 = ~((i50 & i49) | (i49 ^ i50));
                        int i52 = i29 | i11;
                        int i53 = ~((i52 & i26) | (i52 ^ i26));
                        int i54 = ((~i53) & i51) | ((~i51) & i53);
                        int i55 = i51 & i53;
                        int i56 = (i55 & i54) | (i54 ^ i55);
                        int i57 = ~((i28 ^ Integer.MIN_VALUE) | i31);
                        int i58 = -(-(((i56 & i57) | (i56 ^ i57)) * 398));
                        e10Var.f55298u0 = ((i46 | i58) << 1) - (i46 ^ i58);
                        int i59 = f61845i;
                        int i60 = i59 & 35;
                        int i61 = (i59 ^ 35) | i60;
                        int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                        f61846j = i62 % 128;
                        int i63 = i62 % 2;
                    }
                }
                obj = e10Var.f55296s0;
                coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                i12 = e10Var.f55298u0;
                if (i12 == 0) {
                    ResultKt.throwOnFailure(obj);
                    str = (String) setInputExtras.setDividerPadding(new Object[]{(byte[]) setImeActionLabel.setX(new Object[]{setimeactionlabel}, 486099974, -486099974, System.identityHashCode(setimeactionlabel))}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                    SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Card request(request): ", str)}, 818541572, -818541572, (int) System.currentTimeMillis());
                    setSafeBrowsingWhitelist setsafebrowsingwhitelist = setSafeBrowsingWhitelist.setX;
                    setSafeBrowsingWhitelist.setCompoundDrawableTintBlendMode(new Object[]{setsafebrowsingwhitelist, str}, -1913298289, 1913298289, System.identityHashCode(setsafebrowsingwhitelist));
                    jCurrentTimeMillis = System.currentTimeMillis();
                    e10Var.f55293p0 = xiVar;
                    e10Var.f55294q0 = str;
                    e10Var.f55295r0 = jCurrentTimeMillis;
                    e10Var.f55298u0 = 1;
                    dividerPadding = setDividerPadding(new Object[]{xiVar, setimeactionlabel, e10Var}, -222724231, 222724232, System.identityHashCode(xiVar));
                    if (dividerPadding == coroutine_suspended) {
                        int i64 = f61846j;
                        int i65 = i64 ^ 95;
                        int i66 = ((((i64 & 95) | i65) << 1) - (~(-i65))) - 1;
                        f61845i = i66 % 128;
                        int i67 = i66 % 2;
                        int i68 = i64 & 19;
                        i14 = (((i64 ^ 19) | i68) << 1) - ((i64 | 19) & (~i68));
                        f61845i = i14 % 128;
                        if (i14 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                    i13 = str;
                    obj = dividerPadding;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j10 = e10Var.f55295r0;
                    String str2 = e10Var.f55294q0;
                    xi xiVar2 = e10Var.f55293p0;
                    ResultKt.throwOnFailure(obj);
                    int i69 = f61845i;
                    int i70 = (i69 & 62) + (i69 | 62);
                    int i71 = (i70 ^ (-1)) + (i70 << 1);
                    f61846j = i71 % 128;
                    int i72 = i71 % 2;
                    jCurrentTimeMillis = j10;
                    i13 = str2;
                    xiVar = xiVar2;
                }
                bArr = (byte[]) obj;
                int i73 = f61846j;
                int i74 = (i73 | 37) << 1;
                int i75 = -(i73 ^ 37);
                int i76 = (i74 & i75) + (i75 | i74);
                int i77 = i76 % 128;
                f61845i = i77;
                int i78 = i76 % 2;
                int i79 = i77 & 77;
                int i80 = (i77 | 77) & (~i79);
                int i81 = -(-(i79 << 1));
                int i82 = (i80 ^ i81) + ((i80 & i81) << 1);
                i15 = i82 % 128;
                f61846j = i15;
                int i83 = i82 % 2;
                if (bArr != null) {
                    int i84 = i15 ^ 55;
                    int i85 = (((i15 & 55) | i84) << 1) - i84;
                    i16 = i85 % 128;
                    f61845i = i16;
                    int i86 = i85 % 2;
                    if (bArr.length == 0) {
                        int i87 = ((i16 | 115) << 1) - (i16 ^ 115);
                        int i88 = i87 % 128;
                        f61846j = i88;
                        int i89 = i87 % 2;
                        int i90 = (i88 ^ 110) + ((i88 & 110) << 1);
                        int i91 = (i90 ^ (-1)) + (i90 << 1);
                        f61845i = i91 % 128;
                        int i92 = i91 % 2;
                        int i93 = i88 & 57;
                        int i94 = (i88 | 57) & (~i93);
                        int i95 = -(-(i93 << 1));
                        int i96 = (i94 & i95) + (i95 | i94);
                        f61845i = i96 % 128;
                        int i97 = i96 % 2;
                        z10 = false;
                    } else {
                        int i98 = (i15 & 13) + (i15 | 13);
                        f61845i = i98 % 128;
                        int i99 = i98 % 2;
                        int i100 = i15 + 30;
                        int i101 = (i100 ^ (-1)) + (i100 << 1);
                        f61845i = i101 % 128;
                        int i102 = i101 % 2;
                        z10 = true;
                    }
                    if (!(!z10)) {
                        int i103 = f61846j;
                        i17 = ((((i103 ^ 89) | (i103 & 89)) << 1) - (~(-(((~i103) & 89) | (i103 & (-90)))))) - 1;
                        f61845i = i17 % 128;
                        c10 = 4;
                        if (i17 % 2 != 0) {
                            ?? r10 = new Object[4];
                            r10[0] = xiVar;
                            r10[1] = Long.valueOf(jCurrentTimeMillis);
                            c10 = 2;
                            r10[2] = i13;
                            r10[3] = bArr;
                            setDividerPadding(r10, -133549346, 133549351, System.identityHashCode(xiVar));
                            Object[] objArr2 = new Object[1];
                            objArr2[0] = bArr;
                            setrotationx = (setRotationX) setDividerPadding(objArr2, -1324979141, 1324979141, (int) System.currentTimeMillis());
                            int i104 = 71 / 0;
                        } else {
                            ?? r11 = new Object[4];
                            r11[0] = xiVar;
                            r11[1] = Long.valueOf(jCurrentTimeMillis);
                            c10 = 2;
                            r11[2] = i13;
                            r11[3] = bArr;
                            setDividerPadding(r11, -133549346, 133549351, System.identityHashCode(xiVar));
                            Object[] objArr3 = new Object[1];
                            objArr3[0] = bArr;
                            setrotationx = (setRotationX) setDividerPadding(objArr3, -1324979141, 1324979141, (int) System.currentTimeMillis());
                        }
                        int i105 = f61846j + 29;
                        f61845i = i105 % 128;
                        i13 = 2;
                        int i106 = i105 % 2;
                        int i107 = f61846j;
                        int i108 = ((i107 & (-70)) | ((~i107) & 69)) + ((i107 & 69) << 1);
                        f61845i = i108 % 128;
                        int i109 = i108 % 2;
                    } else {
                        setrotationx = (setRotationX) setDividerPadding(new Object[0], -1255953919, 1255953933, (int) System.currentTimeMillis());
                        int i110 = f61846j;
                        int i111 = (i110 & 111) + (i110 | 111);
                        f61845i = i111 % 128;
                        int i112 = i111 % 2;
                        int i1010 = f61846j;
                        int i1011 = ((i1010 & (-70)) | ((~i1010) & 69)) + ((i1010 & 69) << 1);
                        f61845i = i1011 % 128;
                        int i1012 = i1011 % 2;
                    }
                } else {
                    setrotationx = (setRotationX) setDividerPadding(new Object[0], -1255953919, 1255953933, (int) System.currentTimeMillis());
                    int i113 = f61846j;
                    int i114 = (i113 & 111) + (i113 | 111);
                    f61845i = i114 % 128;
                    int i115 = i114 % 2;
                    int i1013 = f61846j;
                    int i1014 = ((i1013 & (-70)) | ((~i1013) & 69)) + ((i1013 & 69) << 1);
                    f61845i = i1014 % 128;
                    int i1015 = i1014 % 2;
                }
                int i116 = f61846j;
                int i117 = (i116 ^ 31) + ((i116 & 31) << 1);
                f61845i = i117 % 128;
                int i118 = i117 % 2;
                return setrotationx;
            }
            int i119 = 49 / 0;
            if (continuation instanceof e10) {
                e10Var = (e10) continuation;
                i10 = e10Var.f55298u0;
                i11 = i10 & Integer.MIN_VALUE;
                if (i11 != 0) {
                    int i210 = ((i18 ^ 107) - (~((i18 & 107) << 1))) - 1;
                    f61846j = i210 % 128;
                    int i211 = i210 % 2;
                    int iIdentityHashCode2 = System.identityHashCode(xiVar);
                    int i212 = i10 * 399;
                    int i213 = Integer.MIN_VALUE & i212;
                    int i214 = -(-((i212 ^ Integer.MIN_VALUE) | i213));
                    int i215 = (i213 & i214) + (i214 | i213);
                    int i216 = Integer.MAX_VALUE & i10;
                    int i217 = ~((Integer.MAX_VALUE ^ i10) | i216);
                    int i218 = ~i10;
                    int i219 = Integer.MAX_VALUE & i218;
                    int i310 = ((~i218) & Integer.MIN_VALUE) | i219;
                    int i311 = i218 & Integer.MIN_VALUE;
                    int i312 = (i310 ^ i311) | (i310 & i311);
                    int i313 = ~i312;
                    int i314 = i313 & (i312 | i313);
                    int i315 = i217 & i314;
                    int i316 = (i314 | i217) & (~i315);
                    int i317 = (i316 & i315) | (i316 ^ i315);
                    int i318 = ~((i218 ^ iIdentityHashCode2) | (i218 & iIdentityHashCode2));
                    int i319 = i317 & i318;
                    int i410 = (i317 | i318) & (~i319);
                    int i411 = ((i410 & i319) | (i410 ^ i319)) * 398;
                    int i412 = i215 & i411;
                    int i413 = (((i215 ^ i411) | i412) << 1) - ((i411 | i215) & (~i412));
                    int i414 = i311 | i216;
                    int i415 = -(~(-(-(((i414 & i11) | (i414 ^ i11)) * (-1194)))));
                    int i416 = (-2) - (((i413 & i415) + (i415 | i413)) ^ (-1));
                    int i417 = (i218 | i10) & i218;
                    int i418 = ~iIdentityHashCode2;
                    int i419 = ((~i418) & i417) | ((~i417) & i418);
                    int i510 = i417 & i418;
                    int i511 = ~((i510 & i419) | (i419 ^ i510));
                    int i512 = i219 | i11;
                    int i513 = ~((i512 & i216) | (i512 ^ i216));
                    int i514 = ((~i513) & i511) | ((~i511) & i513);
                    int i515 = i511 & i513;
                    int i516 = (i515 & i514) | (i514 ^ i515);
                    int i517 = ~((i218 ^ Integer.MIN_VALUE) | i311);
                    int i518 = -(-(((i516 & i517) | (i516 ^ i517)) * 398));
                    e10Var.f55298u0 = ((i416 | i518) << 1) - (i416 ^ i518);
                    int i519 = f61845i;
                    int i610 = i519 & 35;
                    int i611 = (i519 ^ 35) | i610;
                    int i612 = ((i610 | i611) << 1) - (i611 ^ i610);
                    f61846j = i612 % 128;
                    int i613 = i612 % 2;
                }
            }
            obj = e10Var.f55296s0;
            coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            i12 = e10Var.f55298u0;
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                str = (String) setInputExtras.setDividerPadding(new Object[]{(byte[]) setImeActionLabel.setX(new Object[]{setimeactionlabel}, 486099974, -486099974, System.identityHashCode(setimeactionlabel))}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Card request(request): ", str)}, 818541572, -818541572, (int) System.currentTimeMillis());
                setSafeBrowsingWhitelist setsafebrowsingwhitelist2 = setSafeBrowsingWhitelist.setX;
                setSafeBrowsingWhitelist.setCompoundDrawableTintBlendMode(new Object[]{setsafebrowsingwhitelist2, str}, -1913298289, 1913298289, System.identityHashCode(setsafebrowsingwhitelist2));
                jCurrentTimeMillis = System.currentTimeMillis();
                e10Var.f55293p0 = xiVar;
                e10Var.f55294q0 = str;
                e10Var.f55295r0 = jCurrentTimeMillis;
                e10Var.f55298u0 = 1;
                dividerPadding = setDividerPadding(new Object[]{xiVar, setimeactionlabel, e10Var}, -222724231, 222724232, System.identityHashCode(xiVar));
                if (dividerPadding == coroutine_suspended) {
                    int i614 = f61846j;
                    int i615 = i614 ^ 95;
                    int i616 = ((((i614 & 95) | i615) << 1) - (~(-i615))) - 1;
                    f61845i = i616 % 128;
                    int i617 = i616 % 2;
                    int i618 = i614 & 19;
                    i14 = (((i614 ^ 19) | i618) << 1) - ((i614 | 19) & (~i618));
                    f61845i = i14 % 128;
                    if (i14 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    throw null;
                }
                i13 = str;
                obj = dividerPadding;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j11 = e10Var.f55295r0;
                String str3 = e10Var.f55294q0;
                xi xiVar3 = e10Var.f55293p0;
                ResultKt.throwOnFailure(obj);
                int i619 = f61845i;
                int i710 = (i619 & 62) + (i619 | 62);
                int i711 = (i710 ^ (-1)) + (i710 << 1);
                f61846j = i711 % 128;
                int i712 = i711 % 2;
                jCurrentTimeMillis = j11;
                i13 = str3;
                xiVar = xiVar3;
            }
            bArr = (byte[]) obj;
            int i713 = f61846j;
            int i714 = (i713 | 37) << 1;
            int i715 = -(i713 ^ 37);
            int i716 = (i714 & i715) + (i715 | i714);
            int i717 = i716 % 128;
            f61845i = i717;
            int i718 = i716 % 2;
            int i719 = i717 & 77;
            int i810 = (i717 | 77) & (~i719);
            int i811 = -(-(i719 << 1));
            int i812 = (i810 ^ i811) + ((i810 & i811) << 1);
            i15 = i812 % 128;
            f61846j = i15;
            int i813 = i812 % 2;
            if (bArr != null) {
                int i814 = i15 ^ 55;
                int i815 = (((i15 & 55) | i814) << 1) - i814;
                i16 = i815 % 128;
                f61845i = i16;
                int i816 = i815 % 2;
                try {
                    try {
                        if (bArr.length == 0) {
                            int i817 = ((i16 | 115) << 1) - (i16 ^ 115);
                            int i818 = i817 % 128;
                            f61846j = i818;
                            int i819 = i817 % 2;
                            int i910 = (i818 ^ 110) + ((i818 & 110) << 1);
                            int i911 = (i910 ^ (-1)) + (i910 << 1);
                            f61845i = i911 % 128;
                            int i912 = i911 % 2;
                            int i913 = i818 & 57;
                            int i914 = (i818 | 57) & (~i913);
                            int i915 = -(-(i913 << 1));
                            int i916 = (i914 & i915) + (i915 | i914);
                            f61845i = i916 % 128;
                            int i917 = i916 % 2;
                            z10 = false;
                        } else {
                            int i918 = (i15 & 13) + (i15 | 13);
                            f61845i = i918 % 128;
                            int i919 = i918 % 2;
                            int i1016 = i15 + 30;
                            int i1017 = (i1016 ^ (-1)) + (i1016 << 1);
                            f61845i = i1017 % 128;
                            int i1018 = i1017 % 2;
                            z10 = true;
                        }
                        if (!(!z10)) {
                            int i1019 = f61846j;
                            i17 = ((((i1019 ^ 89) | (i1019 & 89)) << 1) - (~(-(((~i1019) & 89) | (i1019 & (-90)))))) - 1;
                            f61845i = i17 % 128;
                            c10 = 4;
                            try {
                                try {
                                    if (i17 % 2 != 0) {
                                        ?? r12 = new Object[4];
                                        r12[0] = xiVar;
                                        r12[1] = Long.valueOf(jCurrentTimeMillis);
                                        c10 = 2;
                                        r12[2] = i13;
                                        r12[3] = bArr;
                                        setDividerPadding(r12, -133549346, 133549351, System.identityHashCode(xiVar));
                                        Object[] objArr4 = new Object[1];
                                        objArr4[0] = bArr;
                                        setrotationx = (setRotationX) setDividerPadding(objArr4, -1324979141, 1324979141, (int) System.currentTimeMillis());
                                        int i1020 = 71 / 0;
                                    } else {
                                        ?? r13 = new Object[4];
                                        r13[0] = xiVar;
                                        r13[1] = Long.valueOf(jCurrentTimeMillis);
                                        c10 = 2;
                                        r13[2] = i13;
                                        r13[3] = bArr;
                                        setDividerPadding(r13, -133549346, 133549351, System.identityHashCode(xiVar));
                                        Object[] objArr5 = new Object[1];
                                        objArr5[0] = bArr;
                                        setrotationx = (setRotationX) setDividerPadding(objArr5, -1324979141, 1324979141, (int) System.currentTimeMillis());
                                    }
                                    int i1021 = f61846j + 29;
                                    f61845i = i1021 % 128;
                                    i13 = 2;
                                    int i1022 = i1021 % 2;
                                    int i10110 = f61846j;
                                    int i10111 = ((i10110 & (-70)) | ((~i10110) & 69)) + ((i10110 & 69) << 1);
                                    f61845i = i10111 % 128;
                                    int i10112 = i10111 % 2;
                                } catch (TimeoutCancellationException unused) {
                                    i13 = c10;
                                    setrotationx = (setRotationX) setDividerPadding(new Object[i13], 907035481, -907035473, (int) System.currentTimeMillis());
                                }
                            } catch (TimeoutCancellationException unused2) {
                                setrotationx = (setRotationX) setDividerPadding(new Object[i13], 907035481, -907035473, (int) System.currentTimeMillis());
                            }
                        } else {
                            try {
                                setrotationx = (setRotationX) setDividerPadding(new Object[0], -1255953919, 1255953933, (int) System.currentTimeMillis());
                                int i1110 = f61846j;
                                int i1111 = (i1110 & 111) + (i1110 | 111);
                                f61845i = i1111 % 128;
                                int i1112 = i1111 % 2;
                                int i10113 = f61846j;
                                int i10114 = ((i10113 & (-70)) | ((~i10113) & 69)) + ((i10113 & 69) << 1);
                                f61845i = i10114 % 128;
                                int i10115 = i10114 % 2;
                            } catch (TimeoutCancellationException unused3) {
                                i13 = 0;
                                setrotationx = (setRotationX) setDividerPadding(new Object[i13], 907035481, -907035473, (int) System.currentTimeMillis());
                            }
                        }
                    } catch (TimeoutCancellationException unused4) {
                        i13 = 0;
                    }
                } catch (Exception unused5) {
                    SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{"Card request: Failed to parse card response"}, -1166612213, 1166612217, (int) System.currentTimeMillis());
                    setrotationx = (setRotationX) setDividerPadding(new Object[0], -1255953919, 1255953933, (int) System.currentTimeMillis());
                }
            } else {
                setrotationx = (setRotationX) setDividerPadding(new Object[0], -1255953919, 1255953933, (int) System.currentTimeMillis());
                int i1113 = f61846j;
                int i1114 = (i1113 & 111) + (i1113 | 111);
                f61845i = i1114 % 128;
                int i1115 = i1114 % 2;
                int i10116 = f61846j;
                int i10117 = ((i10116 & (-70)) | ((~i10116) & 69)) + ((i10116 & 69) << 1);
                f61845i = i10117 % 128;
                int i10118 = i10117 % 2;
            }
            int i1116 = f61846j;
            int i1117 = (i1116 ^ 31) + ((i1116 & 31) << 1);
            f61845i = i1117 % 128;
            int i1118 = i1117 % 2;
            return setrotationx;
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                str = (String) setInputExtras.setDividerPadding(new Object[]{(byte[]) setImeActionLabel.setX(new Object[]{setimeactionlabel}, 486099974, -486099974, System.identityHashCode(setimeactionlabel))}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Card request(request): ", str)}, 818541572, -818541572, (int) System.currentTimeMillis());
                setSafeBrowsingWhitelist setsafebrowsingwhitelist3 = setSafeBrowsingWhitelist.setX;
                setSafeBrowsingWhitelist.setCompoundDrawableTintBlendMode(new Object[]{setsafebrowsingwhitelist3, str}, -1913298289, 1913298289, System.identityHashCode(setsafebrowsingwhitelist3));
                jCurrentTimeMillis = System.currentTimeMillis();
                e10Var.f55293p0 = xiVar;
                e10Var.f55294q0 = str;
                e10Var.f55295r0 = jCurrentTimeMillis;
                e10Var.f55298u0 = 1;
                dividerPadding = setDividerPadding(new Object[]{xiVar, setimeactionlabel, e10Var}, -222724231, 222724232, System.identityHashCode(xiVar));
                if (dividerPadding == coroutine_suspended) {
                    int i6110 = f61846j;
                    int i6111 = i6110 ^ 95;
                    int i6112 = ((((i6110 & 95) | i6111) << 1) - (~(-i6111))) - 1;
                    f61845i = i6112 % 128;
                    int i6113 = i6112 % 2;
                    int i6114 = i6110 & 19;
                    i14 = (((i6110 ^ 19) | i6114) << 1) - ((i6110 | 19) & (~i6114));
                    f61845i = i14 % 128;
                    if (i14 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    throw null;
                }
                i13 = str;
                obj = dividerPadding;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j12 = e10Var.f55295r0;
                String str4 = e10Var.f55294q0;
                xi xiVar4 = e10Var.f55293p0;
                ResultKt.throwOnFailure(obj);
                int i6115 = f61845i;
                int i7110 = (i6115 & 62) + (i6115 | 62);
                int i7111 = (i7110 ^ (-1)) + (i7110 << 1);
                f61846j = i7111 % 128;
                int i7112 = i7111 % 2;
                jCurrentTimeMillis = j12;
                i13 = str4;
                xiVar = xiVar4;
            }
            bArr = (byte[]) obj;
            int i7113 = f61846j;
            int i7114 = (i7113 | 37) << 1;
            int i7115 = -(i7113 ^ 37);
            int i7116 = (i7114 & i7115) + (i7115 | i7114);
            int i7117 = i7116 % 128;
            f61845i = i7117;
            int i7118 = i7116 % 2;
            int i7119 = i7117 & 77;
            int i8110 = (i7117 | 77) & (~i7119);
            int i8111 = -(-(i7119 << 1));
            int i8112 = (i8110 ^ i8111) + ((i8110 & i8111) << 1);
            i15 = i8112 % 128;
            f61846j = i15;
            int i8113 = i8112 % 2;
            if (bArr != null) {
                int i8114 = i15 ^ 55;
                int i8115 = (((i15 & 55) | i8114) << 1) - i8114;
                i16 = i8115 % 128;
                f61845i = i16;
                int i8116 = i8115 % 2;
                if (bArr.length == 0) {
                    int i8117 = ((i16 | 115) << 1) - (i16 ^ 115);
                    int i8118 = i8117 % 128;
                    f61846j = i8118;
                    int i8119 = i8117 % 2;
                    int i9110 = (i8118 ^ 110) + ((i8118 & 110) << 1);
                    int i9111 = (i9110 ^ (-1)) + (i9110 << 1);
                    f61845i = i9111 % 128;
                    int i9112 = i9111 % 2;
                    int i9113 = i8118 & 57;
                    int i9114 = (i8118 | 57) & (~i9113);
                    int i9115 = -(-(i9113 << 1));
                    int i9116 = (i9114 & i9115) + (i9115 | i9114);
                    f61845i = i9116 % 128;
                    int i9117 = i9116 % 2;
                    z10 = false;
                } else {
                    int i9118 = (i15 & 13) + (i15 | 13);
                    f61845i = i9118 % 128;
                    int i9119 = i9118 % 2;
                    int i10119 = i15 + 30;
                    int i10120 = (i10119 ^ (-1)) + (i10119 << 1);
                    f61845i = i10120 % 128;
                    int i10121 = i10120 % 2;
                    z10 = true;
                }
                if (!(!z10)) {
                    int i10122 = f61846j;
                    i17 = ((((i10122 ^ 89) | (i10122 & 89)) << 1) - (~(-(((~i10122) & 89) | (i10122 & (-90)))))) - 1;
                    f61845i = i17 % 128;
                    c10 = 4;
                    if (i17 % 2 != 0) {
                        ?? r14 = new Object[4];
                        r14[0] = xiVar;
                        r14[1] = Long.valueOf(jCurrentTimeMillis);
                        c10 = 2;
                        r14[2] = i13;
                        r14[3] = bArr;
                        setDividerPadding(r14, -133549346, 133549351, System.identityHashCode(xiVar));
                        Object[] objArr6 = new Object[1];
                        objArr6[0] = bArr;
                        setrotationx = (setRotationX) setDividerPadding(objArr6, -1324979141, 1324979141, (int) System.currentTimeMillis());
                        int i1023 = 71 / 0;
                    } else {
                        ?? r15 = new Object[4];
                        r15[0] = xiVar;
                        r15[1] = Long.valueOf(jCurrentTimeMillis);
                        c10 = 2;
                        r15[2] = i13;
                        r15[3] = bArr;
                        setDividerPadding(r15, -133549346, 133549351, System.identityHashCode(xiVar));
                        Object[] objArr7 = new Object[1];
                        objArr7[0] = bArr;
                        setrotationx = (setRotationX) setDividerPadding(objArr7, -1324979141, 1324979141, (int) System.currentTimeMillis());
                    }
                    int i1024 = f61846j + 29;
                    f61845i = i1024 % 128;
                    i13 = 2;
                    int i1025 = i1024 % 2;
                    int i101110 = f61846j;
                    int i101111 = ((i101110 & (-70)) | ((~i101110) & 69)) + ((i101110 & 69) << 1);
                    f61845i = i101111 % 128;
                    int i101112 = i101111 % 2;
                } else {
                    setrotationx = (setRotationX) setDividerPadding(new Object[0], -1255953919, 1255953933, (int) System.currentTimeMillis());
                    int i1119 = f61846j;
                    int i11110 = (i1119 & 111) + (i1119 | 111);
                    f61845i = i11110 % 128;
                    int i11111 = i11110 % 2;
                    int i101113 = f61846j;
                    int i101114 = ((i101113 & (-70)) | ((~i101113) & 69)) + ((i101113 & 69) << 1);
                    f61845i = i101114 % 128;
                    int i101115 = i101114 % 2;
                }
            } else {
                setrotationx = (setRotationX) setDividerPadding(new Object[0], -1255953919, 1255953933, (int) System.currentTimeMillis());
                int i11112 = f61846j;
                int i11113 = (i11112 & 111) + (i11112 | 111);
                f61845i = i11113 % 128;
                int i11114 = i11113 % 2;
                int i101116 = f61846j;
                int i101117 = ((i101116 & (-70)) | ((~i101116) & 69)) + ((i101116 & 69) << 1);
                f61845i = i101117 % 128;
                int i101118 = i101117 % 2;
            }
            int i11115 = f61846j;
            int i11116 = (i11115 ^ 31) + ((i11115 & 31) << 1);
            f61845i = i11116 % 128;
            int i11117 = i11116 % 2;
            return setrotationx;
        } catch (Exception unused6) {
            SouthPacificEndpoint southPacificEndpoint5 = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{"Card request: Failed to read card"}, -1166612213, 1166612217, (int) System.currentTimeMillis());
            return (setRotationX) setDividerPadding(new Object[0], 907035481, -907035473, (int) System.currentTimeMillis());
        }
        e10Var = new e10(xiVar, continuation);
        System.identityHashCode(xiVar);
        System.identityHashCode(xiVar);
        obj = e10Var.f55296s0;
        coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        i12 = e10Var.f55298u0;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws InterruptedException {
        Object objWithTimeout;
        long j10;
        long jCurrentTimeMillis;
        Integer numValueOf;
        int i13;
        setRotationX setrotationx;
        byte[] bArr;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~i12;
        int i17 = ((~(i12 | i14 | i11)) * 1128) + (((~(i15 | i16)) | i14 | (~(i11 | i12))) * (-564)) + (i11 * 565) + (i10 * (-563));
        String str = "";
        byte[] bArr2 = null;
        int i18 = 1;
        switch ((((~(i10 | i11)) | (~(i14 | i16))) * 564) + i17) {
            case 1:
                xi xiVar = (xi) objArr[0];
                setImeActionLabel setimeactionlabel = (setImeActionLabel) objArr[1];
                Continuation continuation = (Continuation) objArr[2];
                CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                new Thread(new f(xiVar, setimeactionlabel, i18, completableDeferredCompletableDeferred$default)).start();
                objWithTimeout = TimeoutKt.withTimeout(xiVar.f61847a.setX(), new c10(completableDeferredCompletableDeferred$default, null), continuation);
                int i19 = f61845i;
                int i20 = i19 & 47;
                int i21 = ((i19 ^ 47) | i20) << 1;
                int i22 = -((i19 | 47) & (~i20));
                int i23 = (i21 & i22) + (i22 | i21);
                f61846j = i23 % 128;
                if (i23 % 2 == 0) {
                    throw null;
                }
                break;
            case 2:
                xi xiVar2 = (xi) objArr[0];
                int i24 = f61846j;
                int i25 = (((i24 | 99) << 1) - (~(-(i24 ^ 99)))) - 1;
                f61845i = i25 % 128;
                if (i25 % 2 != 0) {
                    xiVar2.f61851e = 0L;
                    xiVar2.f61853g = 1L;
                    xiVar2.f61852f = 0L;
                } else {
                    xiVar2.f61851e = 0L;
                    xiVar2.f61853g = 0L;
                    xiVar2.f61852f = 0L;
                }
                try {
                    xiVar2.f61847a.setDividerPadding();
                    BuildersKt__Builders_commonKt.launch$default(xiVar2.f61848b, null, null, new b10(xiVar2, null), 3, null);
                    int i26 = (-2) - ((f61845i + 68) ^ (-1));
                    f61846j = i26 % 128;
                    if (i26 % 2 == 0) {
                        int i27 = 24 / 0;
                    }
                    objWithTimeout = Boolean.TRUE;
                } catch (Exception unused) {
                    SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{"Failed to start card processing"}, -1166612213, 1166612217, (int) System.currentTimeMillis());
                    objWithTimeout = Boolean.FALSE;
                }
                break;
            case 3:
                xi xiVar3 = (xi) objArr[0];
                setImeActionLabel setimeactionlabel2 = (setImeActionLabel) objArr[1];
                Continuation continuation2 = (Continuation) objArr[2];
                int i28 = f61846j;
                int i29 = (i28 & 59) + (i28 | 59);
                f61845i = i29 % 128;
                if (i29 % 2 != 0) {
                    setDividerPadding(new Object[]{xiVar3, setimeactionlabel2, continuation2}, 1080029424, -1080029418, System.identityHashCode(xiVar3));
                    throw null;
                }
                objWithTimeout = setDividerPadding(new Object[]{xiVar3, setimeactionlabel2, continuation2}, 1080029424, -1080029418, System.identityHashCode(xiVar3));
                int i30 = f61846j;
                int i31 = ((i30 ^ 63) | (i30 & 63)) << 1;
                int i32 = -(((~i30) & 63) | (i30 & (-64)));
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                f61845i = i33 % 128;
                if (i33 % 2 != 0) {
                    throw null;
                }
                break;
            case 4:
                return a(objArr);
            case 5:
                xi xiVar4 = (xi) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                String str2 = (String) objArr[2];
                byte[] bArr3 = (byte[]) objArr[3];
                int i34 = f61845i + 79;
                f61846j = i34 % 128;
                if (i34 % 2 == 0) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    j10 = jCurrentTimeMillis % jLongValue;
                    if (xiVar4.f61851e == 1) {
                        xiVar4.f61851e = jCurrentTimeMillis;
                        int i35 = f61846j + 27;
                        f61845i = i35 % 128;
                        int i36 = i35 % 2;
                    } else {
                        long j11 = xiVar4.f61852f + j10;
                        xiVar4.f61852f = j11;
                        xiVar4.f61853g = (jCurrentTimeMillis - xiVar4.f61851e) - j11;
                        int i37 = f61846j;
                        int i38 = (((i37 | 47) << 1) - (~(-(i37 ^ 47)))) - 1;
                        f61845i = i38 % 128;
                        int i39 = i38 % 2;
                    }
                } else {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    j10 = jCurrentTimeMillis2 - jLongValue;
                    if (xiVar4.f61851e == 0) {
                        jCurrentTimeMillis = jCurrentTimeMillis2;
                        xiVar4.f61851e = jCurrentTimeMillis;
                        int i310 = f61846j + 27;
                        f61845i = i310 % 128;
                        int i311 = i310 % 2;
                    } else {
                        jCurrentTimeMillis = jCurrentTimeMillis2;
                        long j12 = xiVar4.f61852f + j10;
                        xiVar4.f61852f = j12;
                        xiVar4.f61853g = (jCurrentTimeMillis - xiVar4.f61851e) - j12;
                        int i312 = f61846j;
                        int i313 = (((i312 | 47) << 1) - (~(-(i312 ^ 47)))) - 1;
                        f61845i = i313 % 128;
                        int i314 = i313 % 2;
                    }
                }
                SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Card request(time): ", Long.valueOf(j10))}, 818541572, -818541572, (int) System.currentTimeMillis());
                setSafeBrowsingWhitelist setsafebrowsingwhitelist = setSafeBrowsingWhitelist.setX;
                StringBuilder sb2 = new StringBuilder("Card request time: ");
                sb2.append(j10);
                sb2.append(", CAPDU length: ");
                sb2.append(str2.length() / 2);
                sb2.append(", RAPDU length: ");
                if (bArr3 == null) {
                    int i40 = f61845i;
                    int i41 = (i40 ^ 1) + ((i40 & 1) << 1);
                    f61846j = i41 % 128;
                    if (i41 % 2 == 0) {
                        int i42 = 30 / 0;
                    }
                    int i43 = i40 & 73;
                    int i44 = (((i40 ^ 73) | i43) << 1) - ((i40 | 73) & (~i43));
                    f61846j = i44 % 128;
                    int i45 = i44 % 2;
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(bArr3.length);
                    int i46 = f61846j;
                    int i47 = (((i46 & (-40)) | ((~i46) & 39)) - (~(-(-((i46 & 39) << 1))))) - 1;
                    f61845i = i47 % 128;
                    int i48 = i47 % 2;
                }
                sb2.append(numValueOf);
                setSafeBrowsingWhitelist.setCompoundDrawableTintBlendMode(new Object[]{setsafebrowsingwhitelist, sb2.toString()}, -1329885597, 1329885604, System.identityHashCode(setsafebrowsingwhitelist));
                if (bArr3 == null) {
                    int i49 = f61845i;
                    int i50 = i49 & 17;
                    int i51 = (i50 - (~((i49 ^ 17) | i50))) - 1;
                    f61846j = i51 % 128;
                    int i52 = i51 % 2;
                    int i53 = ((i49 | 123) << 1) - (i49 ^ 123);
                    f61846j = i53 % 128;
                    int i54 = i53 % 2;
                } else {
                    String str3 = (String) setInputExtras.setDividerPadding(new Object[]{bArr3}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                    if (str3 == null) {
                        int i55 = f61846j;
                        int i56 = i55 ^ 73;
                        int i57 = (i55 & 73) << 1;
                        int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                        f61845i = i58 % 128;
                        if (i58 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        int i59 = f61845i;
                        int i60 = i59 & 39;
                        int i61 = -(-((39 ^ i59) | i60));
                        int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                        f61846j = i62 % 128;
                        int i63 = i62 % 2;
                        str = str3;
                    }
                }
                SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Card request(response): ", str)}, 818541572, -818541572, (int) System.currentTimeMillis());
                setSafeBrowsingWhitelist.setCompoundDrawableTintBlendMode(new Object[]{setsafebrowsingwhitelist, str}, -223244018, 223244023, System.identityHashCode(setsafebrowsingwhitelist));
                StringBuilder sb3 = new StringBuilder("add(Pair(\"");
                sb3.append(str2);
                sb3.append("\", \"");
                sb3.append(str);
                sb3.append("\"))");
                SouthPacificEndpoint.setX(new Object[]{sb3.toString()}, 818541572, -818541572, (int) System.currentTimeMillis());
                int i64 = f61846j + 107;
                f61845i = i64 % 128;
                if (i64 % 2 == 0) {
                    return null;
                }
                throw null;
            case 6:
                return b(objArr);
            case 7:
                xi xiVar5 = (xi) objArr[0];
                int i65 = f61846j;
                int i66 = i65 & 55;
                int i67 = (i65 ^ 55) | i66;
                int i68 = (i66 & i67) + (i66 | i67);
                f61845i = i68 % 128;
                int i69 = i68 % 2;
                objWithTimeout = xiVar5.f61849c;
                if (i69 != 0) {
                    throw null;
                }
                int i70 = ((i65 ^ 53) | (i65 & 53)) << 1;
                int i71 = -(((~i65) & 53) | (i65 & (-54)));
                int i72 = (i70 & i71) + (i71 | i70);
                f61845i = i72 % 128;
                if (i72 % 2 != 0) {
                    throw null;
                }
                break;
            case 8:
                objWithTimeout = new setRotationX(new byte[]{0, 0});
                setRotationX.setX(new Object[]{objWithTimeout, setRotationY.setDividerPadding}, 1666523036, -1666523027, System.identityHashCode(objWithTimeout));
                setRotationX.setX(new Object[]{objWithTimeout, setItemChecked.setX}, 1094457166, -1094457162, System.identityHashCode(objWithTimeout));
                int i73 = f61846j;
                int i74 = (((i73 & (-58)) | ((~i73) & 57)) - (~(-(-((i73 & 57) << 1))))) - 1;
                f61845i = i74 % 128;
                if (i74 % 2 != 0) {
                    throw null;
                }
                break;
            case 9:
                xi xiVar6 = (xi) objArr[0];
                long jLongValue2 = ((Number) objArr[1]).longValue();
                int i75 = f61845i;
                int i76 = i75 & 37;
                int i77 = i76 + ((i75 ^ 37) | i76);
                f61846j = i77 % 128;
                int i78 = i77 % 2;
                xiVar6.f61854h = System.currentTimeMillis() + jLongValue2;
                int i79 = f61845i;
                int i80 = i79 & 71;
                int i81 = ((i79 ^ 71) | i80) << 1;
                int i82 = -((i79 | 71) & (~i80));
                int i83 = ((i81 | i82) << 1) - (i82 ^ i81);
                f61846j = i83 % 128;
                if (i83 % 2 != 0) {
                    return null;
                }
                throw null;
            case 10:
                xi xiVar7 = (xi) objArr[0];
                int i84 = f61846j;
                int i85 = ((i84 | 77) << 1) - (i84 ^ 77);
                f61845i = i85 % 128;
                int i86 = i85 % 2;
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                long j13 = xiVar7.f61854h;
                if (jCurrentTimeMillis3 < j13) {
                    int i87 = f61845i;
                    int i88 = i87 ^ 93;
                    int i89 = (i87 & 93) << 1;
                    int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                    f61846j = i90 % 128;
                    if (i90 % 2 == 0) {
                        Thread.sleep(jCurrentTimeMillis3 & j13);
                    } else {
                        Thread.sleep(j13 - jCurrentTimeMillis3);
                    }
                }
                boolean y7 = xiVar7.f61847a.setY();
                setForegroundTintMode setforegroundtintmode = setForegroundTintMode.INSTANCE;
                setForegroundTintMode.setX(new Object[0], -1574302358, 1574302358, (int) System.currentTimeMillis());
                if (!y7) {
                    setDividerPadding(new Object[]{xiVar7}, 792062142, -792062130, System.identityHashCode(xiVar7));
                    i13 = f61846j + 101;
                } else {
                    int i91 = f61845i;
                    int i92 = (i91 & 89) + (i91 | 89);
                    f61846j = i92 % 128;
                    if (i92 % 2 == 0) {
                        ((Boolean) setDividerPadding(new Object[]{xiVar7}, -646960583, 646960585, System.identityHashCode(xiVar7))).booleanValue();
                        throw null;
                    }
                    y7 = ((Boolean) setDividerPadding(new Object[]{xiVar7}, -646960583, 646960585, System.identityHashCode(xiVar7))).booleanValue();
                    i13 = (-2) - ((f61846j + 118) ^ (-1));
                }
                f61845i = i13 % 128;
                int i93 = i13 % 2;
                int i94 = f61845i;
                int i95 = i94 & 17;
                int i96 = i94 | 17;
                int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                f61846j = i97 % 128;
                if (i97 % 2 != 0) {
                    objWithTimeout = Boolean.valueOf(y7);
                } else {
                    int i98 = 31 / 0;
                    objWithTimeout = Boolean.valueOf(y7);
                }
                break;
            case 11:
                xi xiVar8 = (xi) objArr[0];
                Continuation continuation3 = (Continuation) objArr[1];
                int i99 = f61846j;
                int i100 = i99 & 11;
                int i101 = (i99 | 11) & (~i100);
                int i102 = i100 << 1;
                int i103 = (i101 & i102) + (i101 | i102);
                f61845i = i103 % 128;
                int i104 = i103 % 2;
                fm<setRotationX> fmVar = xiVar8.f61850d;
                if (i104 == 0) {
                    return fm.setOnFocusChangeListener(new Object[]{fmVar, continuation3}, -656090639, 656090643, System.identityHashCode(fmVar));
                }
                fm.setOnFocusChangeListener(new Object[]{fmVar, continuation3}, -656090639, 656090643, System.identityHashCode(fmVar));
                throw null;
            case 12:
                xi xiVar9 = (xi) objArr[0];
                int i105 = f61846j;
                int i106 = i105 & 3;
                int i107 = -(-((i105 ^ 3) | i106));
                int i108 = (i106 ^ i107) + ((i107 & i106) << 1);
                f61845i = i108 % 128;
                int i109 = i108 % 2;
                if (xiVar9.f61852f > 0) {
                    SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                    StringBuilder sb4 = new StringBuilder("Card processing finished:\ncommunication time = ");
                    sb4.append(xiVar9.f61852f);
                    sb4.append("ms\ncomputation time = ");
                    sb4.append(xiVar9.f61853g);
                    sb4.append("ms\ntotal time = ");
                    sb4.append(xiVar9.f61852f + xiVar9.f61853g);
                    sb4.append("ms");
                    SouthPacificEndpoint.setX(new Object[]{sb4.toString()}, 818541572, -818541572, (int) System.currentTimeMillis());
                    xiVar9.f61852f = 0L;
                    xiVar9.f61853g = 0L;
                    int i110 = f61845i;
                    int i111 = (i110 & (-84)) | ((~i110) & 83);
                    int i112 = (i110 & 83) << 1;
                    int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                    f61846j = i113 % 128;
                    int i114 = i113 % 2;
                }
                try {
                    fm<setRotationX> fmVar2 = xiVar9.f61850d;
                    fm.setOnFocusChangeListener(new Object[]{fmVar2}, -1081673723, 1081673725, System.identityHashCode(fmVar2));
                    xiVar9.f61847a.setCompoundDrawableTintBlendMode();
                    int i115 = f61846j;
                    int i116 = (((i115 | 65) << 1) - (~(-(i115 ^ 65)))) - 1;
                    f61845i = i116 % 128;
                    int i117 = i116 % 2;
                    return null;
                } catch (Exception unused2) {
                    SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{"Failed to stop card processing"}, -1166612213, 1166612217, (int) System.currentTimeMillis());
                    return null;
                }
            case 13:
                xi xiVar10 = (xi) objArr[0];
                setImeActionLabel setimeactionlabel3 = (setImeActionLabel) objArr[1];
                Intrinsics.checkNotNullParameter(setimeactionlabel3, "");
                BuildersKt__Builders_commonKt.launch$default(xiVar10.f61848b, null, null, xiVar10.new a(setimeactionlabel3, null), 3, null);
                int i118 = f61845i;
                int i119 = i118 & 3;
                int i120 = (i118 | 3) & (~i119);
                int i121 = -(-(i119 << 1));
                int i122 = (i120 & i121) + (i120 | i121);
                f61846j = i122 % 128;
                int i123 = i122 % 2;
                return null;
            case 14:
                setRotationX setrotationx2 = new setRotationX(new byte[]{0, 0});
                setRotationX.setX(new Object[]{setrotationx2, setRotationY.setDividerPadding}, 1666523036, -1666523027, System.identityHashCode(setrotationx2));
                setRotationX.setX(new Object[]{setrotationx2, setItemChecked.setOnFocusChangeListener}, 1094457166, -1094457162, System.identityHashCode(setrotationx2));
                int i124 = f61846j;
                int i125 = i124 & 59;
                int i126 = ((i124 | 59) & (~i125)) + (i125 << 1);
                f61845i = i126 % 128;
                int i127 = i126 % 2;
                return setrotationx2;
            case 15:
                xi xiVar11 = (xi) objArr[0];
                setImeActionLabel setimeactionlabel4 = (setImeActionLabel) objArr[1];
                CompletableDeferred completableDeferred = (CompletableDeferred) objArr[2];
                int i128 = f61845i;
                int i129 = (i128 & (-18)) | ((~i128) & 17);
                int i130 = (i128 & 17) << 1;
                int i131 = (i129 & i130) + (i130 | i129);
                f61846j = i131 % 128;
                try {
                    if (i131 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(xiVar11, "");
                        Intrinsics.checkNotNullParameter(setimeactionlabel4, "");
                        Intrinsics.checkNotNullParameter(completableDeferred, "");
                        completableDeferred.complete(xiVar11.f61847a.setDividerPadding((byte[]) setImeActionLabel.setX(new Object[]{setimeactionlabel4}, 486099974, -486099974, System.identityHashCode(setimeactionlabel4))));
                        return null;
                    }
                    Intrinsics.checkNotNullParameter(xiVar11, "");
                    Intrinsics.checkNotNullParameter(setimeactionlabel4, "");
                    Intrinsics.checkNotNullParameter(completableDeferred, "");
                    completableDeferred.complete(xiVar11.f61847a.setDividerPadding((byte[]) setImeActionLabel.setX(new Object[]{setimeactionlabel4}, 486099974, -486099974, System.identityHashCode(setimeactionlabel4))));
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Exception e5) {
                    SouthPacificEndpoint southPacificEndpoint5 = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{"Failed to execute transceive on card provider"}, -1166612213, 1166612217, (int) System.currentTimeMillis());
                    completableDeferred.completeExceptionally(e5);
                    return null;
                }
            case 16:
                xi xiVar12 = (xi) objArr[0];
                Continuation continuation4 = (Continuation) objArr[1];
                int i132 = f61846j;
                int i133 = i132 ^ 61;
                int i134 = ((i132 & 61) | i133) << 1;
                int i135 = -i133;
                int i136 = (i134 ^ i135) + ((i134 & i135) << 1);
                f61845i = i136 % 128;
                int i137 = i136 % 2;
                objWithTimeout = setDividerPadding(new Object[]{xiVar12, null, continuation4}, 1080029424, -1080029418, System.identityHashCode(xiVar12));
                int i138 = f61845i;
                int i139 = (i138 ^ 43) + ((i138 & 43) << 1);
                f61846j = i139 % 128;
                if (i139 % 2 == 0) {
                    throw null;
                }
                break;
            case 17:
                xi xiVar13 = (xi) objArr[0];
                ReceiveChannel receiveChannel = (ReceiveChannel) objArr[1];
                Continuation continuation5 = (Continuation) objArr[2];
                int i140 = f61846j + 17;
                f61845i = i140 % 128;
                if (i140 % 2 == 0) {
                    objWithTimeout = setDividerPadding(new Object[]{xiVar13, receiveChannel, continuation5}, -1816944758, 1816944762, System.identityHashCode(xiVar13));
                } else {
                    objWithTimeout = setDividerPadding(new Object[]{xiVar13, receiveChannel, continuation5}, -1816944758, 1816944762, System.identityHashCode(xiVar13));
                    int i141 = 24 / 0;
                }
                break;
            default:
                byte[] bArr4 = (byte[]) objArr[0];
                try {
                    Intrinsics.checkNotNull(bArr4);
                    setrotationx = new setRotationX(bArr4);
                    setRotationX.setX(new Object[]{setrotationx, setRotationY.setCompoundDrawableTintBlendMode}, 1666523036, -1666523027, System.identityHashCode(setrotationx));
                    int i142 = f61845i;
                    int i143 = (i142 ^ 73) + ((i142 & 73) << 1);
                    f61846j = i143 % 128;
                    int i144 = i143 % 2;
                } catch (Exception e7) {
                    SouthPacificEndpoint southPacificEndpoint6 = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{20030, (getDetailsFieldTextSizeSp) Iso4217Currency.setCompoundDrawableTintBlendMode(new Object[]{e7}, 940749687, -940749687, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20030);
                    if (bArr4 == null) {
                        int i145 = f61845i;
                        int i146 = i145 & 65;
                        int i147 = ((i145 | 65) & (~i146)) + (i146 << 1);
                        f61846j = i147 % 128;
                        int i148 = i147 % 2;
                    } else {
                        setNextFocusLeftId setnextfocusleftid = setNextFocusLeftId.INSTANCE;
                        bArr2 = (byte[]) setNextFocusLeftId.setDividerPadding(new Object[]{bArr4}, -2058921266, 2058921268, (int) System.currentTimeMillis());
                        int i149 = f61845i + 28;
                        int i150 = (i149 ^ (-1)) + (i149 << 1);
                        f61846j = i150 % 128;
                        int i151 = i150 % 2;
                    }
                    if (bArr2 == null) {
                        int i152 = f61845i;
                        int i153 = (i152 & (-50)) | ((~i152) & 49);
                        int i154 = (i152 & 49) << 1;
                        int i155 = (i153 ^ i154) + ((i154 & i153) << 1);
                        f61846j = i155 % 128;
                        if (i155 % 2 == 0) {
                            bArr = new byte[]{0, 0, 0};
                            bArr[1] = 1;
                        } else {
                            bArr = new byte[]{0, 0};
                        }
                        bArr2 = bArr;
                    } else {
                        int i156 = f61846j + 85;
                        f61845i = i156 % 128;
                        int i157 = i156 % 2;
                    }
                    setrotationx = new setRotationX(bArr2);
                    setRotationX.setX(new Object[]{setrotationx, setRotationY.setCompoundDrawableTintBlendMode}, 1666523036, -1666523027, System.identityHashCode(setrotationx));
                    int i158 = f61845i;
                    int i159 = (i158 | 33) << 1;
                    int i160 = -(((~i158) & 33) | (i158 & (-34)));
                    int i161 = ((i159 | i160) << 1) - (i160 ^ i159);
                    f61846j = i161 % 128;
                    int i162 = i161 % 2;
                }
                setRotationX setrotationx3 = setrotationx;
                int i163 = f61846j;
                int i164 = (i163 & 65) + (i163 | 65);
                f61845i = i164 % 128;
                int i165 = i164 % 2;
                return setrotationx3;
        }
        return objWithTimeout;
    }

    public static final /* synthetic */ Channel setX(xi xiVar) {
        return (Channel) setDividerPadding(new Object[]{xiVar}, 1223832607, -1223832600, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.getValue
    public final void setCompoundDrawableTintBlendMode(long j10) throws InterruptedException {
        setDividerPadding(new Object[]{this, Long.valueOf(j10)}, -270510237, 270510246, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getValue
    @Nullable
    public final Object setOnFocusChangeListener(@NotNull setImeActionLabel setimeactionlabel, @NotNull Continuation<? super setRotationX> continuation) {
        return setDividerPadding(new Object[]{this, setimeactionlabel, continuation}, 34530072, -34530069, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getValue
    public final void setX() throws InterruptedException {
        setDividerPadding(new Object[]{this}, 792062142, -792062130, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getValue
    public final boolean setCompoundDrawableTintBlendMode() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -278904795, 278904805, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getValue
    public final void setOnFocusChangeListener(@NotNull setImeActionLabel setimeactionlabel) throws InterruptedException {
        setDividerPadding(new Object[]{this, setimeactionlabel}, 1669201983, -1669201970, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getValue
    @Nullable
    public final Object setCompoundDrawableTintBlendMode(@NotNull Continuation<? super setRotationX> continuation) {
        return setDividerPadding(new Object[]{this, continuation}, -483687794, 483687805, System.identityHashCode(this));
    }
}
