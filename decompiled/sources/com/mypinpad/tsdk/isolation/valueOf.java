package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u0001\nB_\u0012\u0006\u0010\u0004\u001a\u00020 \u0012\u0006\u0010\u0006\u001a\u00020!\u0012\u0006\u0010\b\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\r\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\r\u0010\u0018R$\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\n\u0010\u0018\"\u0004\b\r\u0010\u001bR\u0014\u0010\n\u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/mypinpad/tsdk/i/valueOf;", "Lcom/mypinpad/tsdk/i/component24;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/mypinpad/tsdk/i/component20;", "p0", "Lcom/mypinpad/tsdk/i/component23;", "p1", "Lcom/mypinpad/tsdk/i/component12;", "p2", "", "setX", "(Lcom/mypinpad/tsdk/i/component20;Lcom/mypinpad/tsdk/i/component23;Lcom/mypinpad/tsdk/i/component12;)V", "", "setDividerPadding", "([B)V", "Lcom/mypinpad/tsdk/i/setAddStatesFromChildren;", "(Lcom/mypinpad/tsdk/i/setAddStatesFromChildren;)V", "", "setY", "(Ljava/lang/String;)V", "()V", "setCompoundDrawableTintBlendMode", "setOnFocusChangeListener", "Lcom/mypinpad/tsdk/i/setAccessibilityPaneTitle;", "()Lcom/mypinpad/tsdk/i/setAccessibilityPaneTitle;", "J0", "Lcom/mypinpad/tsdk/i/setAccessibilityPaneTitle;", "(Lcom/mypinpad/tsdk/i/setAccessibilityPaneTitle;)V", "setTextScaleX", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lcom/mypinpad/tsdk/i/setTop;", "Lcom/mypinpad/tsdk/i/setContextClickable;", "Lcom/mypinpad/tsdk/i/component15;", "Lcom/mypinpad/tsdk/i/component17;", "p3", "Lcom/mypinpad/tsdk/i/setVerticalScrollbarOverlay;", "p4", "Lcom/mypinpad/tsdk/i/setContentDescription;", "p5", "Lcom/mypinpad/tsdk/i/di;", "p6", "Lcom/mypinpad/tsdk/i/component10;", "p7", "Lcom/mypinpad/tsdk/i/ij;", "p8", "Lcom/mypinpad/tsdk/i/getRevealSystemBarToastMessage;", "p9", "Lkotlinx/coroutines/CoroutineDispatcher;", "p10", "<init>", "(Lcom/mypinpad/tsdk/i/setTop;Lcom/mypinpad/tsdk/i/setContextClickable;Lcom/mypinpad/tsdk/i/component15;Lcom/mypinpad/tsdk/i/component17;Lcom/mypinpad/tsdk/i/setVerticalScrollbarOverlay;Lcom/mypinpad/tsdk/i/setContentDescription;Lcom/mypinpad/tsdk/i/di;Lcom/mypinpad/tsdk/i/component10;Lcom/mypinpad/tsdk/i/ij;Lcom/mypinpad/tsdk/i/getRevealSystemBarToastMessage;Lkotlinx/coroutines/CoroutineDispatcher;)V"}, k = 1, mv = {1, 5, 1})
public final class valueOf implements component24, CoroutineScope {
    public static int N0 = 0;
    public static int O0 = 1;

    @NotNull
    public final CoroutineDispatcher E0;

    @NotNull
    public final CompletableJob F0;

    @NotNull
    public setTextKeepState G0;

    @Nullable
    public getValue H0;

    @Nullable
    public writeObject I0;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @Nullable
    public setAccessibilityPaneTitle setTextScaleX;
    public PinPadLaunchRequestListener K0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final setTop f61480p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final setContextClickable f61481q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final component15 f61482r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final component17 f61483s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final setVerticalScrollbarOverlay f61484t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final setContentDescription f61485u0;

    @NotNull
    public final di v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final component10 f61486w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final ij f61487x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final getRevealSystemBarToastMessage f61488y0;

    @NotNull
    public static final Semaphore L0 = new Semaphore(1, true);

    @NotNull
    public static final AtomicBoolean M0 = new AtomicBoolean(false);

    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f61489r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f61490s0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f61491p0;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
        
            if (com.mypinpad.tsdk.isolation.writeObject.setY(new java.lang.Object[]{r7, r8}, 208139506, -208139506, java.lang.System.identityHashCode(r7)) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
        
            if (com.mypinpad.tsdk.isolation.writeObject.setY(new java.lang.Object[]{r7, r8}, 208139506, -208139506, java.lang.System.identityHashCode(r7)) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
        
            r7 = com.mypinpad.tsdk.i.valueOf.a.f61490s0 + 25;
            com.mypinpad.tsdk.i.valueOf.a.f61489r0 = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
        
            if ((r7 % 2) == 0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
        
            r7 = 93 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        
            return r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object a(java.lang.Object[] r7, int r8, int r9, int r10) {
            /*
                Method dump skipped, instruction units count: 408
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.valueOf.a.a(java.lang.Object[], int, int, int):java.lang.Object");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return (Continuation) a(new Object[]{this, obj, continuation}, -1230522884, 1230522885, System.identityHashCode(this));
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return a(new Object[]{this, coroutineScope, continuation}, 1949883688, -1949883686, System.identityHashCode(this));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            return a(new Object[]{this, obj}, 363396189, -363396189, System.identityHashCode(this));
        }
    }

    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f61493q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f61494r0 = 1;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) throws Exception {
            int i13 = (i11 * (-657)) + (i10 * 659);
            int i14 = ~((~i10) | i11);
            int i15 = ~((~i11) | i10);
            int i16 = ~(i10 | i12);
            int i17 = ((i16 | i15) * 658) + (i15 * 658) + ((i14 | i15 | i16) * (-658)) + i13;
            if (i17 == 1) {
                b bVar = (b) objArr[0];
                Object obj = objArr[1];
                b bVar2 = valueOf.this.new b((Continuation) objArr[2]);
                int i18 = f61494r0;
                int i19 = i18 ^ 105;
                int i20 = -(-((i18 & 105) << 1));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                f61493q0 = i21 % 128;
                if (i21 % 2 == 0) {
                    return bVar2;
                }
                throw null;
            }
            if (i17 == 2) {
                b bVar3 = (b) objArr[0];
                Object obj2 = objArr[1];
                Object obj3 = objArr[2];
                int i22 = f61493q0;
                int i23 = ((i22 & (-52)) | ((~i22) & 51)) + ((i22 & 51) << 1);
                f61494r0 = i23 % 128;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                Continuation continuation = (Continuation) obj3;
                if (i23 % 2 == 0) {
                    a(new Object[]{bVar3, coroutineScope, continuation}, -305383003, 305383003, System.identityHashCode(bVar3));
                    throw null;
                }
                Object objA = a(new Object[]{bVar3, coroutineScope, continuation}, -305383003, 305383003, System.identityHashCode(bVar3));
                int i24 = f61493q0;
                int i25 = i24 & 69;
                int i26 = (i25 - (~(-(-((i24 ^ 69) | i25))))) - 1;
                f61494r0 = i26 % 128;
                int i27 = i26 % 2;
                return objA;
            }
            if (i17 != 3) {
                b bVar4 = (b) objArr[0];
                CoroutineScope coroutineScope2 = (CoroutineScope) objArr[1];
                Continuation continuation2 = (Continuation) objArr[2];
                int i28 = f61494r0;
                int i29 = (((i28 & (-64)) | ((~i28) & 63)) - (~((i28 & 63) << 1))) - 1;
                f61493q0 = i29 % 128;
                int i30 = i29 % 2;
                b bVar5 = (b) ((Continuation) a(new Object[]{bVar4, coroutineScope2, continuation2}, -1340815083, 1340815084, System.identityHashCode(bVar4)));
                Object objA2 = a(new Object[]{bVar5, Unit.INSTANCE}, -2028674068, 2028674071, System.identityHashCode(bVar5));
                int i31 = f61494r0;
                int i32 = ((((i31 ^ 63) | (i31 & 63)) << 1) - (~(-(((~i31) & 63) | (i31 & (-64)))))) - 1;
                f61493q0 = i32 % 128;
                int i33 = i32 % 2;
                return objA2;
            }
            b bVar6 = (b) objArr[0];
            Object obj4 = objArr[1];
            int i34 = f61494r0 + 119;
            f61493q0 = i34 % 128;
            int i35 = i34 % 2;
            ek.a.getCOROUTINE_SUSPENDED();
            bVar6.getClass();
            ResultKt.throwOnFailure(obj4);
            writeObject layoutAnimation = valueOf.setLayoutAnimation(valueOf.this);
            if (layoutAnimation != null) {
                int i36 = f61494r0;
                int i37 = i36 & 15;
                int i38 = (i36 | 15) & (~i37);
                int i39 = -(-(i37 << 1));
                int i40 = (i38 & i39) + (i38 | i39);
                f61493q0 = i40 % 128;
                if (i40 % 2 != 0) {
                    writeObject.setY(new Object[]{layoutAnimation}, -551133523, 551133536, System.identityHashCode(layoutAnimation));
                    throw null;
                }
                writeObject.setY(new Object[]{layoutAnimation}, -551133523, 551133536, System.identityHashCode(layoutAnimation));
                int i41 = f61493q0;
                int i42 = ((i41 | 53) << 1) - (i41 ^ 53);
                f61494r0 = i42 % 128;
                int i43 = i42 % 2;
            }
            Unit unit = Unit.INSTANCE;
            int i44 = f61493q0;
            int i45 = ((i44 ^ 64) + ((i44 & 64) << 1)) - 1;
            f61494r0 = i45 % 128;
            if (i45 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return (Continuation) a(new Object[]{this, obj, continuation}, -1340815083, 1340815084, System.identityHashCode(this));
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return a(new Object[]{this, coroutineScope, continuation}, 1879694251, -1879694249, System.identityHashCode(this));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            return a(new Object[]{this, obj}, -2028674068, 2028674071, System.identityHashCode(this));
        }
    }

    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f61496r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f61497s0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f61498p0;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            Object objA;
            int i13 = (i11 * (-463)) + (i10 * 465);
            int i14 = ~i11;
            int i15 = ~i12;
            int i16 = ~(i14 | i15);
            int i17 = ~(i14 | i10);
            int i18 = (((~(i10 | i12)) | i17) * 464) + ((i14 | (~i10) | i12) * (-464)) + (((~(i15 | i10)) | i16 | i17) * 464) + i13;
            if (i18 == 1) {
                c cVar = (c) objArr[0];
                Object obj = objArr[1];
                Object obj2 = objArr[2];
                int i19 = f61496r0;
                int i20 = (i19 & 123) + (i19 | 123);
                f61497s0 = i20 % 128;
                int i21 = i20 % 2;
                Object objA2 = a(new Object[]{cVar, (CoroutineScope) obj, (Continuation) obj2}, 2129975283, -2129975280, System.identityHashCode(cVar));
                int i22 = f61497s0;
                int i23 = i22 & 27;
                int i24 = ((i22 ^ 27) | i23) << 1;
                int i25 = -((i22 | 27) & (~i23));
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                f61496r0 = i26 % 128;
                if (i26 % 2 == 0) {
                    return objA2;
                }
                int i27 = 13 / 0;
                return objA2;
            }
            if (i18 == 2) {
                c cVar2 = (c) objArr[0];
                Object obj3 = objArr[1];
                c cVar3 = valueOf.this.new c((Continuation) objArr[2]);
                int i28 = f61497s0;
                int i29 = i28 & 9;
                int i30 = (((i28 ^ 9) | i29) << 1) - ((i28 | 9) & (~i29));
                f61496r0 = i30 % 128;
                int i31 = i30 % 2;
                return cVar3;
            }
            if (i18 == 3) {
                c cVar4 = (c) objArr[0];
                CoroutineScope coroutineScope = (CoroutineScope) objArr[1];
                Continuation continuation = (Continuation) objArr[2];
                int i32 = f61497s0;
                int i33 = ((i32 & (-68)) | ((~i32) & 67)) + ((i32 & 67) << 1);
                f61496r0 = i33 % 128;
                Object[] objArr2 = new Object[3];
                if (i33 % 2 != 0) {
                    objArr2[0] = cVar4;
                    objArr2[1] = coroutineScope;
                    objArr2[2] = continuation;
                    c cVar5 = (c) ((Continuation) a(objArr2, -1132719903, 1132719905, System.identityHashCode(cVar4)));
                    objA = a(new Object[]{cVar5, Unit.INSTANCE}, -1388303690, 1388303690, System.identityHashCode(cVar5));
                    int i34 = 28 / 0;
                } else {
                    objArr2[0] = cVar4;
                    objArr2[1] = coroutineScope;
                    objArr2[2] = continuation;
                    c cVar6 = (c) ((Continuation) a(objArr2, -1132719903, 1132719905, System.identityHashCode(cVar4)));
                    objA = a(new Object[]{cVar6, Unit.INSTANCE}, -1388303690, 1388303690, System.identityHashCode(cVar6));
                }
                return objA;
            }
            c cVar7 = (c) objArr[0];
            Object obj4 = objArr[1];
            int i35 = f61496r0;
            int i36 = ((i35 ^ 78) + ((i35 & 78) << 1)) - 1;
            f61497s0 = i36 % 128;
            int i37 = i36 % 2;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i38 = cVar7.f61498p0;
            if (i38 == 0) {
                ResultKt.throwOnFailure(obj4);
                writeObject layoutAnimation = valueOf.setLayoutAnimation(valueOf.this);
                if (layoutAnimation != null) {
                    int i39 = f61497s0;
                    int i40 = ((i39 & 11) - (~(-(-(i39 | 11))))) - 1;
                    f61496r0 = i40 % 128;
                    int i41 = i40 % 2;
                    cVar7.f61498p0 = 1;
                    if (writeObject.setY(new Object[]{layoutAnimation, cVar7}, 208139506, -208139506, System.identityHashCode(layoutAnimation)) == coroutine_suspended) {
                        int i42 = f61496r0;
                        int i43 = i42 & 27;
                        int i44 = ((((i42 ^ 27) | i43) << 1) - (~(-((i42 | 27) & (~i43))))) - 1;
                        int i45 = i44 % 128;
                        f61497s0 = i45;
                        int i46 = i44 % 2;
                        int i47 = i45 & 85;
                        int i48 = -(-((i45 ^ 85) | i47));
                        int i49 = (i47 & i48) + (i48 | i47);
                        f61496r0 = i49 % 128;
                        if (i49 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        int i50 = 2 / 0;
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i38 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj4);
                int i51 = f61497s0;
                int i52 = (i51 & 29) + (i51 | 29);
                f61496r0 = i52 % 128;
                int i53 = i52 % 2;
            }
            Unit unit = Unit.INSTANCE;
            int i54 = f61496r0;
            int i55 = i54 & 43;
            int i56 = (i54 | 43) & (~i55);
            int i57 = -(-(i55 << 1));
            int i58 = ((i56 | i57) << 1) - (i56 ^ i57);
            f61497s0 = i58 % 128;
            if (i58 % 2 != 0) {
                return unit;
            }
            int i59 = 61 / 0;
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return (Continuation) a(new Object[]{this, obj, continuation}, -1132719903, 1132719905, System.identityHashCode(this));
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return a(new Object[]{this, coroutineScope, continuation}, -422811824, 422811825, System.identityHashCode(this));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            return a(new Object[]{this, obj}, -1388303690, 1388303690, System.identityHashCode(this));
        }
    }

    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f61500r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f61501s0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f61502p0;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0159, code lost:
        
            if (com.mypinpad.tsdk.isolation.writeObject.setY(new java.lang.Object[]{r6, r7}, 208139506, -208139506, java.lang.System.identityHashCode(r6)) == r2) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x016c, code lost:
        
            if (com.mypinpad.tsdk.isolation.writeObject.setY(new java.lang.Object[]{r6, r7}, 208139506, -208139506, java.lang.System.identityHashCode(r6)) == r2) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x016e, code lost:
        
            r6 = com.mypinpad.tsdk.i.valueOf.d.f61501s0;
            r7 = r6 & 55;
            r6 = (((r6 | 55) & (~r7)) - (~(r7 << 1))) - 1;
            com.mypinpad.tsdk.i.valueOf.d.f61500r0 = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x017f, code lost:
        
            if ((r6 % 2) == 0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0181, code lost:
        
            r6 = 26 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
        
            return r2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object a(java.lang.Object[] r6, int r7, int r8, int r9) {
            /*
                Method dump skipped, instruction units count: 423
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.valueOf.d.a(java.lang.Object[], int, int, int):java.lang.Object");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return (Continuation) a(new Object[]{this, obj, continuation}, -427028294, 427028297, System.identityHashCode(this));
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return a(new Object[]{this, coroutineScope, continuation}, -332841111, 332841113, System.identityHashCode(this));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            return a(new Object[]{this, obj}, 702384611, -702384610, System.identityHashCode(this));
        }
    }

    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static int f61504w0 = 0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static int f61505x0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f61506p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f61507q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ component23 f61509s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ component20 f61510t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ setCompoundDrawableTintList f61511u0;
        public final /* synthetic */ component12 v0;

        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public static int f61512u0 = 0;
            public static int v0 = 1;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f61513p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ valueOf f61514q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Channel<setSystemGestureExclusionRects> f61515r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ gz f61516s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ mb f61517t0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(valueOf valueof, Channel<setSystemGestureExclusionRects> channel, gz gzVar, mb mbVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f61514q0 = valueof;
                this.f61515r0 = channel;
                this.f61516s0 = gzVar;
                this.f61517t0 = mbVar;
            }

            public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
                int i13 = ~i10;
                int i14 = i13 | i11;
                int i15 = (((~i14) | (~(i13 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
                int i16 = ~(i14 | i12);
                int i17 = ~i12;
                int i18 = ((i13 | i17) * 754) + (((~(i10 | i17 | i11)) | i16) * (-754)) + i15;
                if (i18 == 1) {
                    a aVar = (a) objArr[0];
                    CoroutineScope coroutineScope = (CoroutineScope) objArr[1];
                    Continuation continuation = (Continuation) objArr[2];
                    int i19 = f61512u0;
                    int i20 = i19 & 35;
                    int i21 = ((i19 ^ 35) | i20) << 1;
                    int i22 = -((35 | i19) & (~i20));
                    int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                    v0 = i23 % 128;
                    Object[] objArr2 = new Object[3];
                    if (i23 % 2 != 0) {
                        objArr2[0] = aVar;
                        objArr2[1] = coroutineScope;
                        objArr2[2] = continuation;
                        a aVar2 = (a) ((Continuation) a(objArr2, -2034083072, 2034083074, System.identityHashCode(aVar)));
                        return a(new Object[]{aVar2, Unit.INSTANCE}, 1428245416, -1428245413, System.identityHashCode(aVar2));
                    }
                    objArr2[0] = aVar;
                    objArr2[1] = coroutineScope;
                    objArr2[2] = continuation;
                    a aVar3 = (a) ((Continuation) a(objArr2, -2034083072, 2034083074, System.identityHashCode(aVar)));
                    int i24 = 94 / 0;
                    return a(new Object[]{aVar3, Unit.INSTANCE}, 1428245416, -1428245413, System.identityHashCode(aVar3));
                }
                if (i18 == 2) {
                    a aVar4 = (a) objArr[0];
                    Object obj = objArr[1];
                    a aVar5 = new a(aVar4.f61514q0, aVar4.f61515r0, aVar4.f61516s0, aVar4.f61517t0, (Continuation) objArr[2]);
                    int i25 = f61512u0;
                    int i26 = (i25 & (-36)) | ((~i25) & 35);
                    int i27 = (35 & i25) << 1;
                    int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                    v0 = i28 % 128;
                    if (i28 % 2 != 0) {
                        return aVar5;
                    }
                    throw null;
                }
                if (i18 != 3) {
                    a aVar6 = (a) objArr[0];
                    Object obj2 = objArr[1];
                    Object obj3 = objArr[2];
                    int i29 = f61512u0 + 3;
                    v0 = i29 % 128;
                    CoroutineScope coroutineScope2 = (CoroutineScope) obj2;
                    Continuation continuation2 = (Continuation) obj3;
                    Object[] objArr3 = new Object[3];
                    if (i29 % 2 != 0) {
                        objArr3[0] = aVar6;
                        objArr3[1] = coroutineScope2;
                        objArr3[2] = continuation2;
                        return a(objArr3, -1532458660, 1532458661, System.identityHashCode(aVar6));
                    }
                    objArr3[0] = aVar6;
                    objArr3[1] = coroutineScope2;
                    objArr3[2] = continuation2;
                    Object objA = a(objArr3, -1532458660, 1532458661, System.identityHashCode(aVar6));
                    int i30 = 44 / 0;
                    return objA;
                }
                a aVar7 = (a) objArr[0];
                Object obj4 = objArr[1];
                int i31 = f61512u0 + 93;
                v0 = i31 % 128;
                if (i31 % 2 == 0) {
                    ek.a.getCOROUTINE_SUSPENDED();
                    int i32 = aVar7.f61513p0;
                    throw null;
                }
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i33 = aVar7.f61513p0;
                if (i33 == 0) {
                    ResultKt.throwOnFailure(obj4);
                    valueOf valueof = aVar7.f61514q0;
                    Channel<setSystemGestureExclusionRects> channel = aVar7.f61515r0;
                    gz gzVar = aVar7.f61516s0;
                    mb mbVar = aVar7.f61517t0;
                    setTextKeepState y7 = valueOf.setY(valueof);
                    aVar7.f61513p0 = 1;
                    if (valueOf.setX(valueof, channel, gzVar, mbVar, y7, aVar7) == coroutine_suspended) {
                        int i34 = v0 + 51;
                        f61512u0 = i34 % 128;
                        if (i34 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj4);
                    int i35 = f61512u0;
                    int i36 = i35 & 117;
                    int i37 = i36 + ((i35 ^ 117) | i36);
                    v0 = i37 % 128;
                    int i38 = i37 % 2;
                }
                getValue onFocusChangeListener = valueOf.setOnFocusChangeListener(aVar7.f61514q0);
                if (onFocusChangeListener != null) {
                    int iIdentityHashCode = System.identityHashCode(aVar7);
                    int i39 = ~iIdentityHashCode;
                    int i40 = 56489248 & i39;
                    int i41 = (56489248 | i39) & (~i40);
                    int i42 = ~((i41 & i40) | (i41 ^ i40));
                    int i43 = ((-385025) & i39) | (385024 & iIdentityHashCode);
                    int i44 = (-385025) & iIdentityHashCode;
                    int i45 = ~((i44 & i43) | (i43 ^ i44));
                    int i46 = ((i42 & i45) | (i42 ^ i45)) * (-831);
                    int i47 = ((-2134168198) | i46) << 1;
                    int i48 = -((i46 & 2134168197) | ((-2134168198) & (~i46)));
                    int i49 = (i47 & i48) + (i48 | i47);
                    int i50 = 1602221949 & iIdentityHashCode;
                    int i51 = (1602221949 | iIdentityHashCode) & (~i50);
                    int i52 = -(-((~((i51 & i50) | (i51 ^ i50))) * (-1662)));
                    int i53 = i49 & i52;
                    int i54 = (i52 | i49) & (~i53);
                    int i55 = i53 << 1;
                    int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
                    int i57 = (-1601836926) ^ i39;
                    int i58 = i39 & (-1601836926);
                    int i59 = ~((i58 & i57) | (i57 ^ i58));
                    int i60 = 1601836925 ^ iIdentityHashCode;
                    int i61 = 1601836925 & iIdentityHashCode;
                    int i62 = ~((i61 & i60) | (i60 ^ i61));
                    int i63 = (i59 & i62) | ((~i62) & i59) | ((~i59) & i62);
                    int i64 = (iIdentityHashCode & (-56489249)) | ((-56489249) ^ iIdentityHashCode);
                    int i65 = ~i64;
                    int i66 = (i64 | i65) & i65;
                    int i67 = i63 & i66;
                    int i68 = -(~(-(-((((i66 | i63) & (~i67)) | i67) * 831))));
                    int i69 = (i56 ^ i68) + ((i68 & i56) << 1);
                    int i70 = (i69 ^ (-1)) + (i69 << 1);
                    int iIdentityHashCode2 = System.identityHashCode(aVar7);
                    int i71 = ~iIdentityHashCode2;
                    int i72 = (i71 | iIdentityHashCode2) & i71;
                    int i73 = ((~i72) & (-810663378)) | (810663377 & i72);
                    int i74 = i72 & (-810663378);
                    int i75 = ~((i74 & i73) | (i73 ^ i74));
                    int i76 = -(-(((i75 & (-532837364)) | ((-532837364) ^ i75)) * 226));
                    int i77 = (-1051742384) & i76;
                    int i78 = -(-((i76 ^ (-1051742384)) | i77));
                    int i79 = (i77 & i78) + (i78 | i77);
                    int i80 = (532837363 & i71) | (iIdentityHashCode2 & (-532837364));
                    int i81 = 532837363 & iIdentityHashCode2;
                    int i82 = ~((i81 & i80) | (i80 ^ i81));
                    int i83 = ((~i82) & (-1070858228)) | (1070858227 & i82);
                    int i84 = i82 & (-1070858228);
                    int i85 = (i84 & i83) | (i83 ^ i84);
                    int i86 = (-810663378) & i71;
                    int i87 = (i71 | (-810663378)) & (~i86);
                    int i88 = (i87 & i86) | (i87 ^ i86);
                    int i89 = i88 & (-532837364);
                    int i90 = (i88 | (-532837364)) & (~i89);
                    int i91 = ~((i90 & i89) | (i90 ^ i89));
                    int i92 = i85 & i91;
                    int i93 = (i91 | i85) & (~i92);
                    int i94 = -(-(((i93 & i92) | (i93 ^ i92)) * (-113)));
                    int i95 = i79 & i94;
                    int i96 = i95 + ((i94 ^ i79) | i95);
                    int i97 = (-810663378) & iIdentityHashCode2;
                    int i98 = (iIdentityHashCode2 | (-810663378)) & (~i97);
                    int i99 = (i98 & i97) | (i98 ^ i97);
                    int i100 = ~i99;
                    int i101 = ((i99 | i100) & i100) * 113;
                    int i102 = i96 & i101;
                    int i103 = (i101 ^ i96) | i102;
                    if (i70 <= (i102 ^ i103) + ((i103 & i102) << 1)) {
                        onFocusChangeListener.setX();
                        throw null;
                    }
                    onFocusChangeListener.setX();
                    int i104 = v0;
                    int i105 = i104 & 75;
                    int i106 = (((i104 | 75) & (~i105)) - (~(i105 << 1))) - 1;
                    f61512u0 = i106 % 128;
                    int i107 = i106 % 2;
                }
                Unit unit = Unit.INSTANCE;
                int i108 = f61512u0 + 53;
                v0 = i108 % 128;
                int i109 = i108 % 2;
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return (Continuation) a(new Object[]{this, obj, continuation}, -2034083072, 2034083074, System.identityHashCode(this));
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return a(new Object[]{this, coroutineScope, continuation}, 1824043682, -1824043682, System.identityHashCode(this));
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                return a(new Object[]{this, obj}, 1428245416, -1428245413, System.identityHashCode(this));
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/setTextColor;", "p0", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/setTextColor;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class b extends Lambda implements Function1<setTextColor, Unit> {

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public static int f61518r0 = 0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public static int f61519s0 = 1;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ valueOf f61520p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Channel<setSystemGestureExclusionRects> f61521q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(valueOf valueof, Channel<setSystemGestureExclusionRects> channel) {
                super(1);
                this.f61520p0 = valueof;
                this.f61521q0 = channel;
            }

            public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Exception {
                int i13 = (i11 * (-489)) + (i10 * 491);
                int i14 = ~i10;
                int i15 = ~i11;
                if ((i14 * 490) + (((~(i10 | i15)) | (~(i15 | i12))) * 490) + ((i14 | i15 | (~i12)) * (-490)) + i13 != 1) {
                    b bVar = (b) objArr[0];
                    setTextColor settextcolor = (setTextColor) objArr[1];
                    int i16 = f61518r0;
                    int i17 = i16 & 77;
                    int i18 = i17 + ((i16 ^ 77) | i17);
                    f61519s0 = i18 % 128;
                    int i19 = i18 % 2;
                    Intrinsics.checkNotNullParameter(settextcolor, "");
                    valueOf.setY(bVar.f61520p0, bVar.f61521q0, settextcolor);
                    int i20 = f61519s0;
                    int i21 = i20 & 23;
                    int i22 = ((i20 | 23) & (~i21)) + (i21 << 1);
                    f61518r0 = i22 % 128;
                    if (i22 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                b bVar2 = (b) objArr[0];
                Object obj = objArr[1];
                int i23 = f61518r0;
                int i24 = ((i23 ^ 112) + ((i23 & 112) << 1)) - 1;
                f61519s0 = i24 % 128;
                setTextColor settextcolor2 = (setTextColor) obj;
                if (i24 % 2 == 0) {
                    a(new Object[]{bVar2, settextcolor2}, 2051111617, -2051111617, System.identityHashCode(bVar2));
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                a(new Object[]{bVar2, settextcolor2}, 2051111617, -2051111617, System.identityHashCode(bVar2));
                Unit unit2 = Unit.INSTANCE;
                int i25 = f61518r0;
                int i26 = i25 & 1;
                int i27 = (i26 - (~(-(-((i25 ^ 1) | i26))))) - 1;
                f61519s0 = i27 % 128;
                if (i27 % 2 != 0) {
                    return unit2;
                }
                throw null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(setTextColor settextcolor) {
                return a(new Object[]{this, settextcolor}, -681678835, 681678836, System.identityHashCode(this));
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "p0", "", "setX", "(Ljava/lang/Exception;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class c extends Lambda implements Function1<Exception, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ valueOf f61522p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Channel<setSystemGestureExclusionRects> f61523q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(valueOf valueof, Channel<setSystemGestureExclusionRects> channel) {
                super(1);
                this.f61522p0 = valueof;
                this.f61523q0 = channel;
            }

            public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Exception {
                int i13 = ~i12;
                int i14 = ~(i13 | i10);
                int i15 = ((i11 | i14) * 764) + (i11 * (-1527)) + (i10 * 765);
                int i16 = ~((~i10) | i11);
                if ((((~(i10 | (~i11))) | i16 | i14) * 764) + (((~(i13 | i11)) | i16) * (-1528)) + i15 != 1) {
                    c cVar = (c) objArr[0];
                    a(new Object[]{cVar, (Exception) objArr[1]}, -199523533, 199523534, System.identityHashCode(cVar));
                    return Unit.INSTANCE;
                }
                c cVar2 = (c) objArr[0];
                Exception exc = (Exception) objArr[1];
                Intrinsics.checkNotNullParameter(exc, "");
                valueOf.setOnFocusChangeListener(cVar2.f61522p0, cVar2.f61523q0, exc);
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(Exception exc) {
                return a(new Object[]{this, exc}, 995449431, -995449431, System.identityHashCode(this));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(component23 component23Var, component20 component20Var, setCompoundDrawableTintList setcompounddrawabletintlist, component12 component12Var, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f61509s0 = component23Var;
            this.f61510t0 = component20Var;
            this.f61511u0 = setcompounddrawabletintlist;
            this.v0 = component12Var;
        }

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) throws Exception {
            int i13 = ~i10;
            int i14 = ~i12;
            int i15 = (~(i13 | i11)) | (~(i13 | i14));
            int i16 = ~i11;
            int i17 = ~(i10 | i16 | i12);
            int i18 = ((~(i16 | i14)) * 713) + (i17 * 1426) + ((i15 | i17) * (-713)) + (i11 * (-712)) + (i10 * 714);
            if (i18 == 1) {
                e eVar = (e) objArr[0];
                Object obj = objArr[1];
                Object obj2 = objArr[2];
                int i19 = f61504w0;
                int i20 = (i19 ^ 109) + ((i19 & 109) << 1);
                f61505x0 = i20 % 128;
                int i21 = i20 % 2;
                Object objA = a(new Object[]{eVar, (CoroutineScope) obj, (Continuation) obj2}, -193052537, 193052539, System.identityHashCode(eVar));
                int i22 = f61505x0;
                int i23 = ((((i22 ^ 3) | (i22 & 3)) << 1) - (~(-(((~i22) & 3) | (i22 & (-4)))))) - 1;
                f61504w0 = i23 % 128;
                int i24 = i23 % 2;
                return objA;
            }
            if (i18 == 2) {
                e eVar2 = (e) objArr[0];
                CoroutineScope coroutineScope = (CoroutineScope) objArr[1];
                Continuation continuation = (Continuation) objArr[2];
                int i25 = f61505x0;
                int i26 = i25 & 95;
                int i27 = -(-((i25 ^ 95) | i26));
                int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                f61504w0 = i28 % 128;
                int i29 = i28 % 2;
                e eVar3 = (e) ((Continuation) a(new Object[]{eVar2, coroutineScope, continuation}, -2081024041, 2081024044, System.identityHashCode(eVar2)));
                Object objA2 = a(new Object[]{eVar3, Unit.INSTANCE}, -769252152, 769252152, System.identityHashCode(eVar3));
                int i30 = f61505x0;
                int i31 = i30 & 39;
                int i32 = -(-(i30 | 39));
                int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                f61504w0 = i33 % 128;
                if (i33 % 2 == 0) {
                    return objA2;
                }
                int i34 = 49 / 0;
                return objA2;
            }
            if (i18 == 3) {
                e eVar4 = (e) objArr[0];
                Object obj3 = objArr[1];
                e eVar5 = valueOf.this.new e(eVar4.f61509s0, eVar4.f61510t0, eVar4.f61511u0, eVar4.v0, (Continuation) objArr[2]);
                eVar5.f61507q0 = obj3;
                int i35 = f61505x0;
                int i36 = i35 & 69;
                int i37 = (i35 | 69) & (~i36);
                int i38 = -(-(i36 << 1));
                int i39 = (i37 & i38) + (i37 | i38);
                f61504w0 = i39 % 128;
                if (i39 % 2 == 0) {
                    return eVar5;
                }
                throw null;
            }
            e eVar6 = (e) objArr[0];
            Object obj4 = objArr[1];
            int i40 = f61504w0 + 99;
            f61505x0 = i40 % 128;
            int i41 = i40 % 2;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i42 = eVar6.f61506p0;
            if (i42 == 0) {
                ResultKt.throwOnFailure(obj4);
                CoroutineScope coroutineScope2 = (CoroutineScope) eVar6.f61507q0;
                xi xiVar = new xi(eVar6.f61509s0, coroutineScope2);
                valueOf valueof = valueOf.this;
                valueOf.setCompoundDrawableTintBlendMode(valueof, xiVar);
                Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
                component20 component20Var = eVar6.f61510t0;
                setTranslationZ settranslationz = new setTranslationZ(channelChannel$default, component20Var, eVar6.f61511u0);
                setTranslationZ.setDividerPadding(new Object[]{settranslationz, coroutineScope2}, -175372226, 175372229, System.identityHashCode(settranslationz));
                gz gzVar = new gz(component20Var, valueOf.setDividerPadding(valueof));
                mb mbVar = new mb(setTextLocales.setDividerPadding, eVar6.v0);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new a(valueOf.this, channelChannel$default, gzVar, mbVar, null), 3, null);
                writeObject writeobject = new writeObject(coroutineScope2, valueOf.setY(valueof), new eu(), valueOf.setX(valueof), valueOf.setOnDragListener(valueof), valueOf.setCompoundDrawableTintBlendMode(valueof), valueOf.setOnLongClickListener(valueof), valueOf.setX(valueof), valueOf.setOnDragListener(valueof), valueOf.setDividerPadding(valueof), valueOf.getNavBarTitleString(valueof), valueOf.setNavigationOnClickListener(valueof), new b(valueof, channelChannel$default), new c(valueof, channelChannel$default));
                valueOf.setOnFocusChangeListener(valueof, writeobject);
                setAccessibilityPaneTitle setaccessibilitypanetitle = (setAccessibilityPaneTitle) valueOf.setOnFocusChangeListener(new Object[]{valueof}, -151746579, 151746599, System.identityHashCode(valueof));
                getValue onFocusChangeListener = valueOf.setOnFocusChangeListener(valueof);
                Intrinsics.checkNotNull(onFocusChangeListener);
                eVar6.f61507q0 = writeobject;
                eVar6.f61506p0 = 1;
                if (writeObject.setY(new Object[]{writeobject, setaccessibilitypanetitle, gzVar, mbVar, onFocusChangeListener, eVar6}, 1915045663, -1915045655, System.identityHashCode(writeobject)) == coroutine_suspended) {
                    int i43 = f61504w0;
                    int i44 = i43 & 103;
                    int i45 = ((~i44) & (i43 | 103)) + (i44 << 1);
                    f61505x0 = i45 % 128;
                    if (i45 % 2 == 0) {
                        int i46 = 24 / 0;
                    }
                    int i47 = i43 & 71;
                    int i48 = -(-((i43 ^ 71) | i47));
                    int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                    f61505x0 = i49 % 128;
                    int i50 = i49 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i42 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj4);
                int i51 = f61505x0;
                int i52 = i51 & 87;
                int i53 = i52 + ((i51 ^ 87) | i52);
                f61504w0 = i53 % 128;
                int i54 = i53 % 2;
            }
            Unit unit = Unit.INSTANCE;
            int i55 = f61505x0;
            int i56 = (i55 & (-126)) | ((~i55) & 125);
            int i57 = (i55 & 125) << 1;
            int i58 = (i56 & i57) + (i57 | i56);
            f61504w0 = i58 % 128;
            int i59 = i58 % 2;
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return (Continuation) a(new Object[]{this, obj, continuation}, -2081024041, 2081024044, System.identityHashCode(this));
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return a(new Object[]{this, coroutineScope, continuation}, 1495203298, -1495203297, System.identityHashCode(this));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            return a(new Object[]{this, obj}, -769252152, 769252152, System.identityHashCode(this));
        }
    }

    public static final class setIncludeFontPadding extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ component20 f61524p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ setCompoundDrawableTintList f61525q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setIncludeFontPadding(CoroutineExceptionHandler.Companion companion, component20 component20Var, setCompoundDrawableTintList setcompounddrawabletintlist) {
            super(companion);
            this.f61524p0 = component20Var;
            this.f61525q0 = setcompounddrawabletintlist;
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            setIncludeFontPadding setincludefontpadding = (setIncludeFontPadding) objArr[0];
            Throwable th2 = (Throwable) objArr[2];
            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{"uncaught coroutine exception"}, -1543927628, 1543927635, (int) System.currentTimeMillis());
            SouthPacificEndpoint.setX(new Object[]{9, (getDetailsFieldTextSizeSp) Iso4217Currency.setCompoundDrawableTintBlendMode(new Object[]{th2}, 940749687, -940749687, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 9);
            setIndeterminateDrawable setindeterminatedrawable = new setIndeterminateDrawable(3037, null, th2, 2, null);
            component20 component20Var = setincludefontpadding.f61524p0;
            setCompoundDrawableTintList setcompounddrawabletintlist = setincludefontpadding.f61525q0;
            component20Var.setCompoundDrawableTintBlendMode((setStateDescription) setCompoundDrawableTintList.setY(new Object[]{setcompounddrawabletintlist, setindeterminatedrawable}, -1829490722, 1829490722, System.identityHashCode(setcompounddrawabletintlist)));
            return null;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            setY(new Object[]{this, coroutineContext, th2}, -831661139, 831661139, System.identityHashCode(this));
        }
    }

    public /* synthetic */ class setOnFocusChangeListener {
        public static final /* synthetic */ int[] setDividerPadding;
        public static final /* synthetic */ int[] setOnFocusChangeListener;
        public static final /* synthetic */ int[] setX;
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[com.mypinpad.tsdk.isolation.b.values().length];
            iArr[com.mypinpad.tsdk.isolation.b.setX.ordinal()] = 1;
            iArr[com.mypinpad.tsdk.isolation.b.setCompoundDrawableTintBlendMode.ordinal()] = 2;
            setY = iArr;
            int[] iArr2 = new int[getY.values().length];
            iArr2[getY.setDividerPadding.ordinal()] = 1;
            iArr2[getY.setOnFocusChangeListener.ordinal()] = 2;
            iArr2[getY.setCompoundDrawableTintBlendMode.ordinal()] = 3;
            iArr2[getY.setOnLongClickListener.ordinal()] = 4;
            iArr2[getY.setNavigationOnClickListener.ordinal()] = 5;
            setOnFocusChangeListener = iArr2;
            int[] iArr3 = new int[setFastScrollEnabled.setY.values().length];
            iArr3[setFastScrollEnabled.setY.setCompoundDrawableTintBlendMode.ordinal()] = 1;
            iArr3[setFastScrollEnabled.setY.setDividerPadding.ordinal()] = 2;
            setX = iArr3;
            int[] iArr4 = new int[setMaxLines.values().length];
            iArr4[setMaxLines.setY.ordinal()] = 1;
            iArr4[setMaxLines.setX.ordinal()] = 2;
            iArr4[setMaxLines.setCompoundDrawableTintBlendMode.ordinal()] = 3;
            iArr4[setMaxLines.setLayoutAnimation.ordinal()] = 4;
            setDividerPadding = iArr4;
            int i10 = 1 ^ 41;
            int i11 = ((1 & 41) | i10) << 1;
            int i12 = -i10;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            int i14 = i13 % 128;
            int i15 = i13 % 2;
        }
    }

    static {
        int i10 = O0;
        int i11 = (((i10 & (-54)) | ((~i10) & 53)) - (~(-(-((i10 & 53) << 1))))) - 1;
        N0 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public valueOf(@NotNull setTop settop, @NotNull setContextClickable setcontextclickable, @NotNull component15 component15Var, @NotNull component17 component17Var, @NotNull setVerticalScrollbarOverlay setverticalscrollbaroverlay, @NotNull setContentDescription setcontentdescription, @NotNull di diVar, @NotNull component10 component10Var, @NotNull ij ijVar, @NotNull getRevealSystemBarToastMessage getrevealsystembartoastmessage, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(settop, "");
        Intrinsics.checkNotNullParameter(setcontextclickable, "");
        Intrinsics.checkNotNullParameter(component15Var, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        Intrinsics.checkNotNullParameter(setverticalscrollbaroverlay, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        Intrinsics.checkNotNullParameter(diVar, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(ijVar, "");
        Intrinsics.checkNotNullParameter(getrevealsystembartoastmessage, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.f61480p0 = settop;
        this.f61481q0 = setcontextclickable;
        this.f61482r0 = component15Var;
        this.f61483s0 = component17Var;
        this.f61484t0 = setverticalscrollbaroverlay;
        this.f61485u0 = setcontentdescription;
        this.v0 = diVar;
        this.f61486w0 = component10Var;
        this.f61487x0 = ijVar;
        this.f61488y0 = getrevealsystembartoastmessage;
        this.E0 = coroutineDispatcher;
        this.F0 = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.G0 = new setTextKeepState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        com.mypinpad.tsdk.isolation.SouthPacificEndpoint.setX(new java.lang.Object[]{"Transaction has been ended"}, -1475632754, 1475632759, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        com.mypinpad.tsdk.isolation.SouthPacificEndpoint.setX(new java.lang.Object[]{"Transaction has been ended"}, -1475632754, 1475632759, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
    
        setOnFocusChangeListener(new java.lang.Object[0], -136592865, 136592904, (int) java.lang.System.currentTimeMillis());
        r1 = r10.setTextScaleX;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        if (r1 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
    
        r2 = com.mypinpad.tsdk.isolation.valueOf.O0 + 35;
        com.mypinpad.tsdk.isolation.valueOf.N0 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        if ((r2 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
    
        com.mypinpad.tsdk.isolation.setAccessibilityPaneTitle.setY(new java.lang.Object[]{r1}, -875567491, 875567491, java.lang.System.identityHashCode(r1));
        r0 = com.mypinpad.tsdk.isolation.valueOf.N0 + 37;
        com.mypinpad.tsdk.isolation.valueOf.O0 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b8, code lost:
    
        com.mypinpad.tsdk.isolation.setAccessibilityPaneTitle.setY(new java.lang.Object[]{r1}, -875567491, 875567491, java.lang.System.identityHashCode(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
    
        r10.setTextScaleX = null;
        com.mypinpad.tsdk.isolation.valueOf.L0.release();
        r10 = com.mypinpad.tsdk.isolation.valueOf.O0;
        r0 = (r10 ^ 73) + ((r10 & 73) << 1);
        com.mypinpad.tsdk.isolation.valueOf.N0 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        if (r1.compareAndSet(true, false) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (r1.compareAndSet(true, false) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.valueOf.N0;
        r1 = (r10 ^ 121) + ((r10 & 121) << 1);
        com.mypinpad.tsdk.isolation.valueOf.O0 = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(java.lang.Object[] r10) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.valueOf.a(java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x008b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0123  */
    /* JADX WARN: Code duplicated, block: B:29:0x015a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0181  */
    /* JADX WARN: Code duplicated, block: B:33:0x0183  */
    /* JADX WARN: Code duplicated, block: B:37:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x01b9 A[Catch: Exception -> 0x028b, TRY_LEAVE, TryCatch #0 {Exception -> 0x028b, blocks: (B:53:0x0333, B:57:0x035d, B:58:0x037c, B:59:0x037f, B:35:0x018a, B:38:0x01b9, B:42:0x0290, B:43:0x02a7, B:44:0x02a8), top: B:74:0x0333 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0290 A[Catch: Exception -> 0x028b, TRY_ENTER, TryCatch #0 {Exception -> 0x028b, blocks: (B:53:0x0333, B:57:0x035d, B:58:0x037c, B:59:0x037f, B:35:0x018a, B:38:0x01b9, B:42:0x0290, B:43:0x02a7, B:44:0x02a8), top: B:74:0x0333 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x02a8 A[Catch: Exception -> 0x028b, TRY_LEAVE, TryCatch #0 {Exception -> 0x028b, blocks: (B:53:0x0333, B:57:0x035d, B:58:0x037c, B:59:0x037f, B:35:0x018a, B:38:0x01b9, B:42:0x0290, B:43:0x02a7, B:44:0x02a8), top: B:74:0x0333 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0309  */
    /* JADX WARN: Code duplicated, block: B:48:0x0323  */
    /* JADX WARN: Code duplicated, block: B:50:0x032b  */
    /* JADX WARN: Code duplicated, block: B:52:0x032d  */
    /* JADX WARN: Code duplicated, block: B:55:0x034b  */
    /* JADX WARN: Code duplicated, block: B:57:0x035d A[Catch: Exception -> 0x028b, TRY_ENTER, TryCatch #0 {Exception -> 0x028b, blocks: (B:53:0x0333, B:57:0x035d, B:58:0x037c, B:59:0x037f, B:35:0x018a, B:38:0x01b9, B:42:0x0290, B:43:0x02a7, B:44:0x02a8), top: B:74:0x0333 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x037f A[Catch: Exception -> 0x028b, TRY_LEAVE, TryCatch #0 {Exception -> 0x028b, blocks: (B:53:0x0333, B:57:0x035d, B:58:0x037c, B:59:0x037f, B:35:0x018a, B:38:0x01b9, B:42:0x0290, B:43:0x02a7, B:44:0x02a8), top: B:74:0x0333 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x03b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x03b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x026b -> B:25:0x011c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x032d -> B:74:0x0333). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object b(java.lang.Object[] r28) {
        /*
            Method dump skipped, instruction units count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.valueOf.b(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Boolean c(Object[] objArr) {
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        int i10 = O0;
        int i11 = i10 + 69;
        N0 = i11 % 128;
        int i12 = i11 % 2;
        if (getbeeponfailure == null) {
            int i13 = i10 + 109;
            N0 = i13 % 128;
            int i14 = i13 % 2;
            System.currentTimeMillis();
            System.currentTimeMillis();
            return Boolean.FALSE;
        }
        setAnimation setanimation = setAnimation.INSTANCE;
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, (TransactionFailed) setAnimation.setY(new Object[0], -705722506, 705722524, (int) System.currentTimeMillis())}, -990392770, 990392791, System.identityHashCode(getbeeponfailure));
        if (getbeeponfailure2 == null) {
            int i15 = N0;
            int i16 = i15 & 27;
            int i17 = (i15 ^ 27) | i16;
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            O0 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = i15 & 7;
            int i21 = ((i15 ^ 7) | i20) << 1;
            int i22 = -((i15 | 7) & (~i20));
            int i23 = (i21 & i22) + (i22 | i21);
            O0 = i23 % 128;
            int i24 = i23 % 2;
            return Boolean.FALSE;
        }
        byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
        if (bArr == null) {
            int i25 = O0;
            int i26 = i25 + 49;
            N0 = i26 % 128;
            int i27 = i26 % 2;
            int i28 = ((i25 ^ 41) | (i25 & 41)) << 1;
            int i29 = -(((~i25) & 41) | (i25 & (-42)));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            N0 = i30 % 128;
            if (i30 % 2 == 0) {
                return Boolean.FALSE;
            }
            int i31 = 70 / 0;
            return Boolean.FALSE;
        }
        byte b10 = bArr[0];
        component13.Companion companion = component13.INSTANCE;
        if (((component13) component13.Companion.setDividerPadding(new Object[]{Byte.valueOf(b10)}, 961284563, -961284563, (int) System.currentTimeMillis())) != component13.setNavigationOnClickListener) {
            int i32 = O0;
            int i33 = (i32 & (-74)) | ((~i32) & 73);
            int i34 = (i32 & 73) << 1;
            int i35 = (i33 & i34) + (i34 | i33);
            N0 = i35 % 128;
            int i36 = i35 % 2;
            return Boolean.FALSE;
        }
        int i37 = O0;
        int i38 = (i37 & (-52)) | ((~i37) & 51);
        int i39 = -(-((i37 & 51) << 1));
        int i40 = (i38 & i39) + (i39 | i38);
        int i41 = i40 % 128;
        N0 = i41;
        int i42 = i40 % 2;
        int i43 = i41 & 57;
        int i44 = (i43 - (~(-(-((i41 ^ 57) | i43))))) - 1;
        O0 = i44 % 128;
        if (i44 % 2 != 0) {
            return Boolean.TRUE;
        }
        int i45 = 62 / 0;
        return Boolean.TRUE;
    }

    public static /* synthetic */ void d(Object[] objArr) {
        valueOf valueof = (valueOf) objArr[0];
        setAccessibilityPaneTitle setaccessibilitypanetitle = (setAccessibilityPaneTitle) objArr[1];
        int i10 = O0;
        int i11 = (((i10 & (-56)) | ((~i10) & 55)) - (~(-(-((i10 & 55) << 1))))) - 1;
        int i12 = i11 % 128;
        N0 = i12;
        int i13 = i11 % 2;
        valueof.setTextScaleX = setaccessibilitypanetitle;
        int i14 = (i12 | 79) << 1;
        int i15 = -(i12 ^ 79);
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        O0 = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void e(Object[] objArr) throws IllegalAccessException, InstantiationException {
        valueOf valueof = (valueOf) objArr[0];
        valueof.K0 = new PinPadLaunchRequestListener(valueof.f61482r0, (setCompoundDrawableTintList) objArr[1]);
        setOnFocusChangeListener(new Object[]{valueof}, 1136081888, -1136081859, System.identityHashCode(valueof));
        setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
        setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.OTHER}, -157457190, 157457205, (int) System.currentTimeMillis());
        valueof.f61480p0.setDividerPadding();
        setContextClickable setcontextclickable = valueof.f61481q0;
        setContextClickable.setDividerPadding(new Object[]{setcontextclickable}, -442541688, 442541699, System.identityHashCode(setcontextclickable));
        getValue getvalue = valueof.H0;
        if (getvalue != null) {
            int i10 = N0 + 7;
            O0 = i10 % 128;
            int i11 = i10 % 2;
            getvalue.setX();
            int i12 = O0;
            int i13 = (i12 ^ 111) + ((i12 & 111) << 1);
            N0 = i13 % 128;
            int i14 = i13 % 2;
        }
        valueof.H0 = null;
        valueof.I0 = null;
        JobKt__JobKt.cancelChildren$default((Job) valueof.F0, (CancellationException) null, 1, (Object) null);
        int i15 = N0;
        int i16 = ((i15 & 118) + (i15 | 118)) - 1;
        O0 = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:102:0x0646  */
    /* JADX WARN: Code duplicated, block: B:106:0x06a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:107:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x0140  */
    /* JADX WARN: Code duplicated, block: B:31:0x0151  */
    /* JADX WARN: Code duplicated, block: B:33:0x017e  */
    /* JADX WARN: Code duplicated, block: B:36:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:39:0x01df  */
    /* JADX WARN: Code duplicated, block: B:41:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:43:0x020e  */
    /* JADX WARN: Code duplicated, block: B:45:0x021a  */
    /* JADX WARN: Code duplicated, block: B:46:0x022f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0232  */
    /* JADX WARN: Code duplicated, block: B:50:0x0236  */
    /* JADX WARN: Code duplicated, block: B:54:0x0318  */
    /* JADX WARN: Code duplicated, block: B:56:0x033b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0388  */
    /* JADX WARN: Code duplicated, block: B:61:0x038d  */
    /* JADX WARN: Code duplicated, block: B:73:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x0411  */
    /* JADX WARN: Code duplicated, block: B:77:0x042b  */
    /* JADX WARN: Code duplicated, block: B:79:0x043d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0452  */
    /* JADX WARN: Code duplicated, block: B:84:0x0464  */
    /* JADX WARN: Code duplicated, block: B:87:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:89:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:90:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x0519  */
    /* JADX WARN: Code duplicated, block: B:95:0x0547  */
    /* JADX WARN: Code duplicated, block: B:97:0x0577  */
    /* JADX WARN: Code duplicated, block: B:99:0x0587  */
    public static /* synthetic */ setTextColor f(Object[] objArr) throws Exception {
        j jVar;
        setTransitionVisibility settransitionvisibility;
        setTransitionVisibility settransitionvisibility2;
        setTransitionVisibility settransitionvisibility3;
        l lVar;
        byte[] bArr;
        setTextColor settextcolor;
        int i10;
        setMaxWidth setmaxwidth;
        setAccessibilityPaneTitle setaccessibilitypanetitle;
        int i11;
        setClipToOutline setcliptooutline;
        int i12;
        getValue getvalue;
        int i13;
        int i14;
        l lVar2;
        l lVar3;
        fd fdVar;
        fd fdVar2;
        setMaxLines setmaxlines;
        fd fdVar3;
        setMaxWidth setmaxwidth2;
        int i15;
        int i16;
        setMaxLines setmaxlines2;
        valueOf valueof = (valueOf) objArr[0];
        SendChannel sendChannel = (SendChannel) objArr[1];
        setTextAppearance settextappearance = (setTextAppearance) objArr[2];
        int i17 = O0 + 113;
        N0 = i17 % 128;
        byte[] bArr2 = null;
        if (i17 % 2 == 0) {
            setSafeBrowsingWhitelist setsafebrowsingwhitelist = setSafeBrowsingWhitelist.setX;
            setSafeBrowsingWhitelist.setCompoundDrawableTintBlendMode(new Object[]{(String) setTextAppearance.setY(new Object[]{settextappearance}, 2103420954, -2103420949, System.identityHashCode(settextappearance))}, 1025379401, -1025379400, (int) System.currentTimeMillis());
            jVar = (j) setTextAppearance.setY(new Object[]{settextappearance}, 1069213621, -1069213611, System.identityHashCode(settextappearance));
            Intrinsics.checkNotNull(jVar);
            setTransitionVisibility settransitionvisibility4 = (setTransitionVisibility) j.setDividerPadding(new Object[]{jVar}, -453755924, 453755935, System.identityHashCode(jVar));
            int i18 = setOnFocusChangeListener.setOnFocusChangeListener[((getY) j.setDividerPadding(new Object[]{jVar}, -500139973, 500139976, System.identityHashCode(jVar))).ordinal()];
            if (i18 != 1) {
                if (i18 == 2) {
                    settransitionvisibility = settransitionvisibility4;
                    lVar = (l) setTextAppearance.setY(new Object[]{settextappearance}, 1819649031, -1819649023, System.identityHashCode(settextappearance));
                    if (lVar != null) {
                        int i19 = N0;
                        i12 = ((((i19 ^ 53) | (i19 & 53)) << 1) - (~(-(((~i19) & 53) | (i19 & (-54)))))) - 1;
                        O0 = i12 % 128;
                        if (i12 % 2 != 0) {
                            ((Boolean) j.setDividerPadding(new Object[]{jVar}, 693029875, -693029866, System.identityHashCode(jVar))).booleanValue();
                            throw null;
                        }
                        if (!((Boolean) j.setDividerPadding(new Object[]{jVar}, 693029875, -693029866, System.identityHashCode(jVar))).booleanValue()) {
                            i14 = O0 + 31;
                            N0 = i14 % 128;
                            if (i14 % 2 == 0) {
                                ((Boolean) j.setDividerPadding(new Object[]{jVar}, 775130114, -775130109, System.identityHashCode(jVar))).booleanValue();
                                throw null;
                            }
                            if (((Boolean) j.setDividerPadding(new Object[]{jVar}, 775130114, -775130109, System.identityHashCode(jVar))).booleanValue()) {
                                setOnFocusChangeListener(new Object[]{valueof, sendChannel, lVar, (String) setTextAppearance.setY(new Object[]{settextappearance}, 2103420954, -2103420949, System.identityHashCode(settextappearance)), Boolean.FALSE}, 424966625, -424966585, System.identityHashCode(valueof));
                                int i20 = N0;
                                int i21 = i20 & 57;
                                int i22 = -(-(i20 | 57));
                                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                                O0 = i23 % 128;
                                int i24 = i23 % 2;
                            }
                        } else {
                            setOnFocusChangeListener(new Object[]{valueof, sendChannel, lVar, (String) setTextAppearance.setY(new Object[]{settextappearance}, 2103420954, -2103420949, System.identityHashCode(settextappearance)), Boolean.FALSE}, 424966625, -424966585, System.identityHashCode(valueof));
                            int i25 = N0;
                            int i26 = i25 & 57;
                            int i27 = -(-(i25 | 57));
                            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                            O0 = i28 % 128;
                            int i29 = i28 % 2;
                        }
                        getvalue = valueof.H0;
                        if (getvalue != null) {
                            int i30 = N0;
                            int i31 = i30 & 21;
                            int i32 = (i30 ^ 21) | i31;
                            i13 = (i31 ^ i32) + ((i32 & i31) << 1);
                            O0 = i13 % 128;
                            if (i13 % 2 == 0) {
                                getvalue.setCompoundDrawableTintBlendMode(100 & ((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) l.setX(new Object[]{lVar}, -1193387599, 1193387606, System.identityHashCode(lVar))}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue());
                            } else {
                                getvalue.setCompoundDrawableTintBlendMode(((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) l.setX(new Object[]{lVar}, -1193387599, 1193387606, System.identityHashCode(lVar))}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue() * 100);
                            }
                        }
                    }
                    bArr = (byte[]) j.setDividerPadding(new Object[]{jVar}, -1879825437, 1879825444, System.identityHashCode(jVar));
                    if (bArr != null) {
                        setmaxwidth = new setMaxWidth();
                        setMaxWidth.setX(new Object[]{setmaxwidth, bArr}, -494144192, 494144193, (int) System.currentTimeMillis());
                        setaccessibilitypanetitle = (setAccessibilityPaneTitle) setOnFocusChangeListener(new Object[]{valueof}, 1137740596, -1137740561, System.identityHashCode(valueof));
                        if (setaccessibilitypanetitle != null) {
                            int i33 = N0;
                            i11 = (i33 ^ 51) + ((i33 & 51) << 1);
                            O0 = i11 % 128;
                            if (i11 % 2 != 0) {
                                throw null;
                            }
                            setcliptooutline = (setClipToOutline) ((setAccessibilityPaneTitle.setY) setAccessibilityPaneTitle.setY(new Object[]{setaccessibilitypanetitle, Reflection.getOrCreateKotlinClass(setClipToOutline.class)}, 1735934812, -1735934811, System.identityHashCode(setaccessibilitypanetitle)));
                            if (setcliptooutline != null) {
                                int i34 = N0 + 47;
                                O0 = i34 % 128;
                                int i35 = i34 % 2;
                                TransactionFailed designatorAfterValue = setAnimation.getDesignatorAfterValue();
                                setClipToOutline.setOnFocusChangeListener(new Object[]{setcliptooutline, (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{designatorAfterValue}, 1914607362, -1914607356, System.identityHashCode(designatorAfterValue))}, -480651882, 480651889, System.identityHashCode(setmaxwidth))}, -1177243662, 1177243664, System.identityHashCode(setcliptooutline));
                                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 2019562047, -2019561898, (int) System.currentTimeMillis());
                                setClipToOutline.setOnFocusChangeListener(new Object[]{setcliptooutline, (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -480651882, 480651889, System.identityHashCode(setmaxwidth))}, -1083661792, 1083661792, System.identityHashCode(setcliptooutline));
                                int i36 = O0;
                                int i37 = ((i36 | 9) << 1) - (i36 ^ 9);
                                N0 = i37 % 128;
                                int i38 = i37 % 2;
                            }
                        }
                    }
                    settextcolor = new setTextColor(null, null, settransitionvisibility, null, false, false, null, null, false, null, setMaxLines.setY, true, null, null, 13307, null);
                    int i39 = O0;
                    int i40 = i39 & 47;
                    int i41 = ((i39 ^ 47) | i40) << 1;
                    int i42 = -((i39 | 47) & (~i40));
                    i10 = (i41 ^ i42) + ((i42 & i41) << 1);
                    N0 = i10 % 128;
                    if (i10 % 2 == 0) {
                        return settextcolor;
                    }
                    throw null;
                }
                if (i18 == 3) {
                    settransitionvisibility2 = settransitionvisibility4;
                    setTextColor settextcolor2 = new setTextColor(null, null, settransitionvisibility2, null, false, false, null, null, false, null, setMaxLines.setX, true, null, null, 13307, null);
                    int i43 = O0 + 101;
                    N0 = i43 % 128;
                    int i44 = i43 % 2;
                    return settextcolor2;
                }
                if (i18 != 4) {
                    if (i18 == 5) {
                        settransitionvisibility3 = settransitionvisibility4;
                        setOnFocusChangeListener(new Object[]{settextappearance}, -1224821522, 1224821552, (int) System.currentTimeMillis());
                        if (!((Boolean) j.setDividerPadding(new Object[]{jVar}, 693029875, -693029866, System.identityHashCode(jVar))).booleanValue()) {
                            int i45 = N0;
                            int i46 = ((i45 | 121) << 1) - (i45 ^ 121);
                            O0 = i46 % 128;
                            int i47 = i46 % 2;
                            lVar3 = null;
                        } else {
                            int i48 = N0;
                            int i49 = (i48 & (-14)) | ((~i48) & 13);
                            int i50 = -(-((i48 & 13) << 1));
                            int i51 = (i49 & i50) + (i50 | i49);
                            O0 = i51 % 128;
                            int i52 = i51 % 2;
                            lVar2 = (l) setTextAppearance.setY(new Object[]{settextappearance}, 1819649031, -1819649023, System.identityHashCode(settextappearance));
                            if (lVar2 != null) {
                                throw new setIndeterminateDrawable(3028, null, null, 6, null);
                            }
                            int i53 = N0;
                            int i54 = i53 & 83;
                            int i55 = i54 + ((i53 ^ 83) | i54);
                            O0 = i55 % 128;
                            int i56 = i55 % 2;
                            lVar3 = lVar2;
                        }
                        j jVar2 = (j) setTextAppearance.setY(new Object[]{settextappearance}, 1069213621, -1069213611, System.identityHashCode(settextappearance));
                        Intrinsics.checkNotNull(jVar2);
                        fdVar = (fd) j.setDividerPadding(new Object[]{jVar2}, -624677485, 624677493, System.identityHashCode(jVar2));
                        fdVar2 = fd.ONLINE_REQUEST;
                        if (fdVar != fdVar2) {
                            int i57 = O0 + 125;
                            N0 = i57 % 128;
                            int i58 = i57 % 2;
                            if (((Boolean) setOnFocusChangeListener(new Object[]{settextappearance, fdVar}, 1546393725, -1546393689, (int) System.currentTimeMillis())).booleanValue()) {
                                setMaxLines setmaxlines3 = setMaxLines.setCompoundDrawableTintBlendMode;
                                if (lVar3 != null) {
                                    int i59 = O0;
                                    int i60 = (i59 & 107) + (i59 | 107);
                                    N0 = i60 % 128;
                                    int i61 = i60 % 2;
                                    l.setX(new Object[]{lVar3, activateSession.AUTHORISING_PLEASE_WAIT}, 1689731204, -1689731203, System.identityHashCode(lVar3));
                                    int i62 = O0;
                                    int i63 = i62 ^ 75;
                                    int i64 = (i62 & 75) << 1;
                                    int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                                    N0 = i65 % 128;
                                    int i66 = i65 % 2;
                                }
                                int i67 = O0;
                                int i68 = i67 & 59;
                                int i69 = i68 + ((i67 ^ 59) | i68);
                                N0 = i69 % 128;
                                int i70 = i69 % 2;
                                setmaxlines = setmaxlines3;
                                fdVar3 = fdVar2;
                            } else {
                                if (!((Boolean) setOnFocusChangeListener(new Object[]{settextappearance, fdVar}, -767440706, 767440716, (int) System.currentTimeMillis())).booleanValue()) {
                                    setmaxlines2 = setMaxLines.setLayoutAnimation;
                                    int i71 = N0 + 119;
                                    O0 = i71 % 128;
                                    int i72 = i71 % 2;
                                } else {
                                    i16 = N0 + 31;
                                    O0 = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        setMaxLines setmaxlines4 = setMaxLines.setOnFocusChangeListener;
                                        throw null;
                                    }
                                    setmaxlines2 = setMaxLines.setCompoundDrawableTintBlendMode;
                                    int i73 = N0;
                                    int i74 = i73 & 113;
                                    int i75 = (i74 - (~(-(-((i73 ^ 113) | i74))))) - 1;
                                    O0 = i75 % 128;
                                    int i76 = i75 % 2;
                                }
                                fdVar3 = fdVar;
                                setmaxlines = setmaxlines2;
                            }
                        } else {
                            setMaxLines setmaxlines5 = setMaxLines.setCompoundDrawableTintBlendMode;
                            if (lVar3 != null) {
                                int i510 = O0;
                                int i610 = (i510 & 107) + (i510 | 107);
                                N0 = i610 % 128;
                                int i611 = i610 % 2;
                                l.setX(new Object[]{lVar3, activateSession.AUTHORISING_PLEASE_WAIT}, 1689731204, -1689731203, System.identityHashCode(lVar3));
                                int i612 = O0;
                                int i613 = i612 ^ 75;
                                int i614 = (i612 & 75) << 1;
                                int i615 = (i613 ^ i614) + ((i614 & i613) << 1);
                                N0 = i615 % 128;
                                int i616 = i615 % 2;
                            }
                            int i617 = O0;
                            int i618 = i617 & 59;
                            int i619 = i618 + ((i617 ^ 59) | i618);
                            N0 = i619 % 128;
                            int i77 = i619 % 2;
                            setmaxlines = setmaxlines5;
                            fdVar3 = fdVar2;
                        }
                        TransactionProcessingResult transactionProcessingResult = (TransactionProcessingResult) j.setDividerPadding(new Object[]{jVar}, -1501769096, 1501769102, System.identityHashCode(jVar));
                        f fVar = (f) setTextAppearance.setY(new Object[]{settextappearance}, -1677040788, 1677040788, System.identityHashCode(settextappearance));
                        byte[] bArr3 = (byte[]) setTextAppearance.setY(new Object[]{settextappearance}, 1154949342, -1154949341, System.identityHashCode(settextappearance));
                        getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations = (getINVALID_MERCHANT_IDannotations) setTextAppearance.setY(new Object[]{settextappearance}, -638298177, 638298180, System.identityHashCode(settextappearance));
                        boolean zBooleanValue = ((Boolean) j.setDividerPadding(new Object[]{jVar}, 24686371, -24686367, System.identityHashCode(jVar))).booleanValue();
                        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setTextAppearance.setY(new Object[]{settextappearance}, -1762606256, 1762606263, System.identityHashCode(settextappearance));
                        setmaxwidth2 = (setMaxWidth) setTextAppearance.setY(new Object[]{settextappearance}, 1411396419, -1411396410, System.identityHashCode(settextappearance));
                        if (setmaxwidth2 == null) {
                            int i78 = N0;
                            int i79 = i78 & 51;
                            int i80 = i79 + ((i78 ^ 51) | i79);
                            O0 = i80 % 128;
                            int i81 = i80 % 2;
                            int i82 = i78 & 3;
                            int i83 = -(-((i78 ^ 3) | i82));
                            int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                            O0 = i84 % 128;
                            int i85 = i84 % 2;
                        } else {
                            bArr2 = (byte[]) setMaxWidth.setX(new Object[]{setmaxwidth2}, -2074592285, 2074592295, System.identityHashCode(setmaxwidth2));
                            int i86 = N0;
                            int i87 = (i86 ^ 21) + ((i86 & 21) << 1);
                            O0 = i87 % 128;
                            int i88 = i87 % 2;
                        }
                        setTextColor settextcolor3 = new setTextColor(fdVar3, transactionProcessingResult, settransitionvisibility3, fVar, false, false, bArr3, getinvalid_merchant_idannotations, zBooleanValue, lVar3, setmaxlines, false, getbeeponfailure, bArr2, 2096, null);
                        int i89 = O0;
                        int i90 = i89 & 89;
                        int i91 = -(-((i89 ^ 89) | i90));
                        i15 = ((i90 | i91) << 1) - (i91 ^ i90);
                        N0 = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i92 = 47 / 0;
                        }
                        return settextcolor3;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                throw new setIndeterminateDrawable(3015, null, null, 6, null);
            }
            throw new setIndeterminateDrawable(3014, null, null, 6, null);
        }
        setSafeBrowsingWhitelist setsafebrowsingwhitelist2 = setSafeBrowsingWhitelist.setX;
        setSafeBrowsingWhitelist.setCompoundDrawableTintBlendMode(new Object[]{(String) setTextAppearance.setY(new Object[]{settextappearance}, 2103420954, -2103420949, System.identityHashCode(settextappearance))}, 1025379401, -1025379400, (int) System.currentTimeMillis());
        jVar = (j) setTextAppearance.setY(new Object[]{settextappearance}, 1069213621, -1069213611, System.identityHashCode(settextappearance));
        Intrinsics.checkNotNull(jVar);
        setTransitionVisibility settransitionvisibility5 = (setTransitionVisibility) j.setDividerPadding(new Object[]{jVar}, -453755924, 453755935, System.identityHashCode(jVar));
        int i93 = setOnFocusChangeListener.setOnFocusChangeListener[((getY) j.setDividerPadding(new Object[]{jVar}, -500139973, 500139976, System.identityHashCode(jVar))).ordinal()];
        int i94 = 19 / 0;
        if (i93 != 1) {
            if (i93 == 2) {
                settransitionvisibility = settransitionvisibility5;
                lVar = (l) setTextAppearance.setY(new Object[]{settextappearance}, 1819649031, -1819649023, System.identityHashCode(settextappearance));
                if (lVar != null) {
                    int i110 = N0;
                    i12 = ((((i110 ^ 53) | (i110 & 53)) << 1) - (~(-(((~i110) & 53) | (i110 & (-54)))))) - 1;
                    O0 = i12 % 128;
                    if (i12 % 2 != 0) {
                        ((Boolean) j.setDividerPadding(new Object[]{jVar}, 693029875, -693029866, System.identityHashCode(jVar))).booleanValue();
                        throw null;
                    }
                    if (!((Boolean) j.setDividerPadding(new Object[]{jVar}, 693029875, -693029866, System.identityHashCode(jVar))).booleanValue()) {
                        i14 = O0 + 31;
                        N0 = i14 % 128;
                        if (i14 % 2 == 0) {
                            ((Boolean) j.setDividerPadding(new Object[]{jVar}, 775130114, -775130109, System.identityHashCode(jVar))).booleanValue();
                            throw null;
                        }
                        if (((Boolean) j.setDividerPadding(new Object[]{jVar}, 775130114, -775130109, System.identityHashCode(jVar))).booleanValue()) {
                            setOnFocusChangeListener(new Object[]{valueof, sendChannel, lVar, (String) setTextAppearance.setY(new Object[]{settextappearance}, 2103420954, -2103420949, System.identityHashCode(settextappearance)), Boolean.FALSE}, 424966625, -424966585, System.identityHashCode(valueof));
                            int i210 = N0;
                            int i211 = i210 & 57;
                            int i212 = -(-(i210 | 57));
                            int i213 = (i211 ^ i212) + ((i212 & i211) << 1);
                            O0 = i213 % 128;
                            int i214 = i213 % 2;
                        }
                    } else {
                        setOnFocusChangeListener(new Object[]{valueof, sendChannel, lVar, (String) setTextAppearance.setY(new Object[]{settextappearance}, 2103420954, -2103420949, System.identityHashCode(settextappearance)), Boolean.FALSE}, 424966625, -424966585, System.identityHashCode(valueof));
                        int i215 = N0;
                        int i216 = i215 & 57;
                        int i217 = -(-(i215 | 57));
                        int i218 = (i216 ^ i217) + ((i217 & i216) << 1);
                        O0 = i218 % 128;
                        int i219 = i218 % 2;
                    }
                    getvalue = valueof.H0;
                    if (getvalue != null) {
                        int i310 = N0;
                        int i311 = i310 & 21;
                        int i312 = (i310 ^ 21) | i311;
                        i13 = (i311 ^ i312) + ((i312 & i311) << 1);
                        O0 = i13 % 128;
                        if (i13 % 2 == 0) {
                            getvalue.setCompoundDrawableTintBlendMode(100 & ((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) l.setX(new Object[]{lVar}, -1193387599, 1193387606, System.identityHashCode(lVar))}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue());
                        } else {
                            getvalue.setCompoundDrawableTintBlendMode(((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) l.setX(new Object[]{lVar}, -1193387599, 1193387606, System.identityHashCode(lVar))}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue() * 100);
                        }
                    }
                }
                bArr = (byte[]) j.setDividerPadding(new Object[]{jVar}, -1879825437, 1879825444, System.identityHashCode(jVar));
                if (bArr != null) {
                    setmaxwidth = new setMaxWidth();
                    setMaxWidth.setX(new Object[]{setmaxwidth, bArr}, -494144192, 494144193, (int) System.currentTimeMillis());
                    setaccessibilitypanetitle = (setAccessibilityPaneTitle) setOnFocusChangeListener(new Object[]{valueof}, 1137740596, -1137740561, System.identityHashCode(valueof));
                    if (setaccessibilitypanetitle != null) {
                        int i313 = N0;
                        i11 = (i313 ^ 51) + ((i313 & 51) << 1);
                        O0 = i11 % 128;
                        if (i11 % 2 != 0) {
                            throw null;
                        }
                        setcliptooutline = (setClipToOutline) ((setAccessibilityPaneTitle.setY) setAccessibilityPaneTitle.setY(new Object[]{setaccessibilitypanetitle, Reflection.getOrCreateKotlinClass(setClipToOutline.class)}, 1735934812, -1735934811, System.identityHashCode(setaccessibilitypanetitle)));
                        if (setcliptooutline != null) {
                            int i314 = N0 + 47;
                            O0 = i314 % 128;
                            int i315 = i314 % 2;
                            TransactionFailed designatorAfterValue2 = setAnimation.getDesignatorAfterValue();
                            setClipToOutline.setOnFocusChangeListener(new Object[]{setcliptooutline, (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{designatorAfterValue2}, 1914607362, -1914607356, System.identityHashCode(designatorAfterValue2))}, -480651882, 480651889, System.identityHashCode(setmaxwidth))}, -1177243662, 1177243664, System.identityHashCode(setcliptooutline));
                            TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 2019562047, -2019561898, (int) System.currentTimeMillis());
                            setClipToOutline.setOnFocusChangeListener(new Object[]{setcliptooutline, (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -480651882, 480651889, System.identityHashCode(setmaxwidth))}, -1083661792, 1083661792, System.identityHashCode(setcliptooutline));
                            int i316 = O0;
                            int i317 = ((i316 | 9) << 1) - (i316 ^ 9);
                            N0 = i317 % 128;
                            int i318 = i317 % 2;
                        }
                    }
                }
                settextcolor = new setTextColor(null, null, settransitionvisibility, null, false, false, null, null, false, null, setMaxLines.setY, true, null, null, 13307, null);
                int i319 = O0;
                int i410 = i319 & 47;
                int i411 = ((i319 ^ 47) | i410) << 1;
                int i412 = -((i319 | 47) & (~i410));
                i10 = (i411 ^ i412) + ((i412 & i411) << 1);
                N0 = i10 % 128;
                if (i10 % 2 == 0) {
                    return settextcolor;
                }
                throw null;
            }
            if (i93 == 3) {
                settransitionvisibility2 = settransitionvisibility5;
                setTextColor settextcolor4 = new setTextColor(null, null, settransitionvisibility2, null, false, false, null, null, false, null, setMaxLines.setX, true, null, null, 13307, null);
                int i413 = O0 + 101;
                N0 = i413 % 128;
                int i414 = i413 % 2;
                return settextcolor4;
            }
            if (i93 != 4) {
                if (i93 == 5) {
                    settransitionvisibility3 = settransitionvisibility5;
                    setOnFocusChangeListener(new Object[]{settextappearance}, -1224821522, 1224821552, (int) System.currentTimeMillis());
                    if (!((Boolean) j.setDividerPadding(new Object[]{jVar}, 693029875, -693029866, System.identityHashCode(jVar))).booleanValue()) {
                        int i415 = N0;
                        int i416 = ((i415 | 121) << 1) - (i415 ^ 121);
                        O0 = i416 % 128;
                        int i417 = i416 % 2;
                        lVar3 = null;
                    } else {
                        int i418 = N0;
                        int i419 = (i418 & (-14)) | ((~i418) & 13);
                        int i511 = -(-((i418 & 13) << 1));
                        int i512 = (i419 & i511) + (i511 | i419);
                        O0 = i512 % 128;
                        int i513 = i512 % 2;
                        lVar2 = (l) setTextAppearance.setY(new Object[]{settextappearance}, 1819649031, -1819649023, System.identityHashCode(settextappearance));
                        if (lVar2 != null) {
                            throw new setIndeterminateDrawable(3028, null, null, 6, null);
                        }
                        int i514 = N0;
                        int i515 = i514 & 83;
                        int i516 = i515 + ((i514 ^ 83) | i515);
                        O0 = i516 % 128;
                        int i517 = i516 % 2;
                        lVar3 = lVar2;
                    }
                    j jVar3 = (j) setTextAppearance.setY(new Object[]{settextappearance}, 1069213621, -1069213611, System.identityHashCode(settextappearance));
                    Intrinsics.checkNotNull(jVar3);
                    fdVar = (fd) j.setDividerPadding(new Object[]{jVar3}, -624677485, 624677493, System.identityHashCode(jVar3));
                    fdVar2 = fd.ONLINE_REQUEST;
                    if (fdVar != fdVar2) {
                        int i518 = O0 + 125;
                        N0 = i518 % 128;
                        int i519 = i518 % 2;
                        if (((Boolean) setOnFocusChangeListener(new Object[]{settextappearance, fdVar}, 1546393725, -1546393689, (int) System.currentTimeMillis())).booleanValue()) {
                            setMaxLines setmaxlines6 = setMaxLines.setCompoundDrawableTintBlendMode;
                            if (lVar3 != null) {
                                int i5110 = O0;
                                int i6110 = (i5110 & 107) + (i5110 | 107);
                                N0 = i6110 % 128;
                                int i6111 = i6110 % 2;
                                l.setX(new Object[]{lVar3, activateSession.AUTHORISING_PLEASE_WAIT}, 1689731204, -1689731203, System.identityHashCode(lVar3));
                                int i6112 = O0;
                                int i6113 = i6112 ^ 75;
                                int i6114 = (i6112 & 75) << 1;
                                int i6115 = (i6113 ^ i6114) + ((i6114 & i6113) << 1);
                                N0 = i6115 % 128;
                                int i6116 = i6115 % 2;
                            }
                            int i6117 = O0;
                            int i6118 = i6117 & 59;
                            int i6119 = i6118 + ((i6117 ^ 59) | i6118);
                            N0 = i6119 % 128;
                            int i710 = i6119 % 2;
                            setmaxlines = setmaxlines6;
                            fdVar3 = fdVar2;
                        } else {
                            if (!((Boolean) setOnFocusChangeListener(new Object[]{settextappearance, fdVar}, -767440706, 767440716, (int) System.currentTimeMillis())).booleanValue()) {
                                setmaxlines2 = setMaxLines.setLayoutAnimation;
                                int i711 = N0 + 119;
                                O0 = i711 % 128;
                                int i712 = i711 % 2;
                            } else {
                                i16 = N0 + 31;
                                O0 = i16 % 128;
                                if (i16 % 2 != 0) {
                                    setMaxLines setmaxlines7 = setMaxLines.setOnFocusChangeListener;
                                    throw null;
                                }
                                setmaxlines2 = setMaxLines.setCompoundDrawableTintBlendMode;
                                int i713 = N0;
                                int i714 = i713 & 113;
                                int i715 = (i714 - (~(-(-((i713 ^ 113) | i714))))) - 1;
                                O0 = i715 % 128;
                                int i716 = i715 % 2;
                            }
                            fdVar3 = fdVar;
                            setmaxlines = setmaxlines2;
                        }
                    } else {
                        setMaxLines setmaxlines8 = setMaxLines.setCompoundDrawableTintBlendMode;
                        if (lVar3 != null) {
                            int i5111 = O0;
                            int i61110 = (i5111 & 107) + (i5111 | 107);
                            N0 = i61110 % 128;
                            int i61111 = i61110 % 2;
                            l.setX(new Object[]{lVar3, activateSession.AUTHORISING_PLEASE_WAIT}, 1689731204, -1689731203, System.identityHashCode(lVar3));
                            int i61112 = O0;
                            int i61113 = i61112 ^ 75;
                            int i61114 = (i61112 & 75) << 1;
                            int i61115 = (i61113 ^ i61114) + ((i61114 & i61113) << 1);
                            N0 = i61115 % 128;
                            int i61116 = i61115 % 2;
                        }
                        int i61117 = O0;
                        int i61118 = i61117 & 59;
                        int i61119 = i61118 + ((i61117 ^ 59) | i61118);
                        N0 = i61119 % 128;
                        int i717 = i61119 % 2;
                        setmaxlines = setmaxlines8;
                        fdVar3 = fdVar2;
                    }
                    TransactionProcessingResult transactionProcessingResult2 = (TransactionProcessingResult) j.setDividerPadding(new Object[]{jVar}, -1501769096, 1501769102, System.identityHashCode(jVar));
                    f fVar2 = (f) setTextAppearance.setY(new Object[]{settextappearance}, -1677040788, 1677040788, System.identityHashCode(settextappearance));
                    byte[] bArr4 = (byte[]) setTextAppearance.setY(new Object[]{settextappearance}, 1154949342, -1154949341, System.identityHashCode(settextappearance));
                    getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations2 = (getINVALID_MERCHANT_IDannotations) setTextAppearance.setY(new Object[]{settextappearance}, -638298177, 638298180, System.identityHashCode(settextappearance));
                    boolean zBooleanValue2 = ((Boolean) j.setDividerPadding(new Object[]{jVar}, 24686371, -24686367, System.identityHashCode(jVar))).booleanValue();
                    getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setTextAppearance.setY(new Object[]{settextappearance}, -1762606256, 1762606263, System.identityHashCode(settextappearance));
                    setmaxwidth2 = (setMaxWidth) setTextAppearance.setY(new Object[]{settextappearance}, 1411396419, -1411396410, System.identityHashCode(settextappearance));
                    if (setmaxwidth2 == null) {
                        int i718 = N0;
                        int i719 = i718 & 51;
                        int i810 = i719 + ((i718 ^ 51) | i719);
                        O0 = i810 % 128;
                        int i811 = i810 % 2;
                        int i812 = i718 & 3;
                        int i813 = -(-((i718 ^ 3) | i812));
                        int i814 = (i812 ^ i813) + ((i813 & i812) << 1);
                        O0 = i814 % 128;
                        int i815 = i814 % 2;
                    } else {
                        bArr2 = (byte[]) setMaxWidth.setX(new Object[]{setmaxwidth2}, -2074592285, 2074592295, System.identityHashCode(setmaxwidth2));
                        int i816 = N0;
                        int i817 = (i816 ^ 21) + ((i816 & 21) << 1);
                        O0 = i817 % 128;
                        int i818 = i817 % 2;
                    }
                    setTextColor settextcolor5 = new setTextColor(fdVar3, transactionProcessingResult2, settransitionvisibility3, fVar2, false, false, bArr4, getinvalid_merchant_idannotations2, zBooleanValue2, lVar3, setmaxlines, false, getbeeponfailure2, bArr2, 2096, null);
                    int i819 = O0;
                    int i95 = i819 & 89;
                    int i96 = -(-((i819 ^ 89) | i95));
                    i15 = ((i95 | i96) << 1) - (i96 ^ i95);
                    N0 = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i97 = 47 / 0;
                    }
                    return settextcolor5;
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new setIndeterminateDrawable(3015, null, null, 6, null);
        }
        throw new setIndeterminateDrawable(3014, null, null, 6, null);
    }

    public static /* synthetic */ void g(Object[] objArr) throws Exception {
        valueOf valueof = (valueOf) objArr[0];
        setFastScrollEnabled.setY sety = (setFastScrollEnabled.setY) objArr[1];
        int i10 = O0 + 17;
        N0 = i10 % 128;
        if (i10 % 2 == 0) {
            setOnFocusChangeListener(new Object[]{valueof, sety}, -2130775637, 2130775675, System.identityHashCode(valueof));
        } else {
            setOnFocusChangeListener(new Object[]{valueof, sety}, -2130775637, 2130775675, System.identityHashCode(valueof));
            int i11 = 44 / 0;
        }
    }

    public static final /* synthetic */ setContentDescription getNavBarTitleString(valueOf valueof) {
        return (setContentDescription) setOnFocusChangeListener(new Object[]{valueof}, 2097295022, -2097294991, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ void h(Object[] objArr) {
        valueOf valueof = (valueOf) objArr[0];
        getValue getvalue = (getValue) objArr[1];
        System.currentTimeMillis();
        System.currentTimeMillis();
        valueof.H0 = getvalue;
        int i10 = N0;
        int i11 = (((i10 ^ 71) | (i10 & 71)) << 1) - (((~i10) & 71) | (i10 & (-72)));
        O0 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 6 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0103  */
    /* JADX WARN: Code duplicated, block: B:22:0x0120  */
    /* JADX WARN: Code duplicated, block: B:24:0x0123  */
    public static /* synthetic */ Boolean i(Object[] objArr) {
        boolean zBooleanValue;
        int i10;
        setTextAppearance settextappearance = (setTextAppearance) objArr[0];
        fd fdVar = (fd) objArr[1];
        int i11 = N0 + 59;
        O0 = i11 % 128;
        int i12 = i11 % 2;
        f fVar = (f) setTextAppearance.setY(new Object[]{settextappearance}, -1677040788, 1677040788, System.identityHashCode(settextappearance));
        if (fVar == null) {
            int i13 = N0 + 41;
            O0 = i13 % 128;
            int i14 = i13 % 2;
            zBooleanValue = false;
        } else {
            zBooleanValue = ((Boolean) com.mypinpad.tsdk.isolation.d.setDividerPadding(new Object[]{fVar}, -1630615362, 1630615362, (int) System.currentTimeMillis())).booleanValue();
            int i15 = O0;
            int i16 = (((i15 & (-92)) | ((~i15) & 91)) - (~((i15 & 91) << 1))) - 1;
            N0 = i16 % 128;
            int i17 = i16 % 2;
        }
        if (((getINVALID_MERCHANT_IDannotations) setTextAppearance.setY(new Object[]{settextappearance}, -638298177, 638298180, System.identityHashCode(settextappearance))) == getINVALID_MERCHANT_IDannotations.getNavBarTitleString) {
            int i18 = N0;
            int i19 = (i18 & (-8)) | ((~i18) & 7);
            int i20 = (i18 & 7) << 1;
            int i21 = (i19 & i20) + (i20 | i19);
            O0 = i21 % 128;
            if (i21 % 2 == 0) {
                fd.Companion companion = fd.INSTANCE;
                throw null;
            }
            if (fdVar == fd.DECLINED) {
                int i22 = N0;
                int i23 = (-2) - ((((i22 | 96) << 1) - (i22 ^ 96)) ^ (-1));
                O0 = i23 % 128;
                if (i23 % 2 == 0) {
                    boolean zBooleanValue2 = ((Boolean) setOnFocusChangeListener(new Object[]{(getBeepOnFailure) setTextAppearance.setY(new Object[]{settextappearance}, -1762606256, 1762606263, System.identityHashCode(settextappearance))}, 2028206718, -2028206691, (int) System.currentTimeMillis())).booleanValue();
                    int i24 = 74 / 0;
                    if (zBooleanValue2) {
                        if (zBooleanValue) {
                            int i25 = N0;
                            int i26 = ((i25 ^ 48) + ((i25 & 48) << 1)) - 1;
                            O0 = i26 % 128;
                            int i27 = i26 % 2;
                            int i28 = i25 + 58;
                            i10 = (i28 ^ (-1)) + (i28 << 1);
                            O0 = i10 % 128;
                            if (i10 % 2 != 0) {
                                return Boolean.TRUE;
                            }
                            throw null;
                        }
                    }
                } else if (!(!((Boolean) setOnFocusChangeListener(new Object[]{(getBeepOnFailure) setTextAppearance.setY(new Object[]{settextappearance}, -1762606256, 1762606263, System.identityHashCode(settextappearance))}, 2028206718, -2028206691, (int) System.currentTimeMillis())).booleanValue())) {
                    if (zBooleanValue) {
                        int i29 = N0;
                        int i210 = ((i29 ^ 48) + ((i29 & 48) << 1)) - 1;
                        O0 = i210 % 128;
                        int i211 = i210 % 2;
                        int i212 = i29 + 58;
                        i10 = (i212 ^ (-1)) + (i212 << 1);
                        O0 = i10 % 128;
                        if (i10 % 2 != 0) {
                            return Boolean.TRUE;
                        }
                        throw null;
                    }
                }
            }
        }
        int i30 = N0 + 113;
        O0 = i30 % 128;
        if (i30 % 2 != 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    public static /* synthetic */ void j(Object[] objArr) throws Exception {
        valueOf valueof = (valueOf) objArr[0];
        SendChannel sendChannel = (SendChannel) objArr[1];
        Exception exc = (Exception) objArr[2];
        int i10 = O0;
        int i11 = (i10 & (-50)) | ((~i10) & 49);
        int i12 = (i10 & 49) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        N0 = i13 % 128;
        if (i13 % 2 == 0) {
            setOnFocusChangeListener(new Object[]{valueof, sendChannel, exc}, -539303991, 539304005, System.identityHashCode(valueof));
        } else {
            setOnFocusChangeListener(new Object[]{valueof, sendChannel, exc}, -539303991, 539304005, System.identityHashCode(valueof));
            throw null;
        }
    }

    public static /* synthetic */ component10 k(Object[] objArr) {
        valueOf valueof = (valueOf) objArr[0];
        int i10 = N0;
        int i11 = i10 & 11;
        int i12 = ((((i10 ^ 11) | i11) << 1) - (~(-((i10 | 11) & (~i11))))) - 1;
        int i13 = i12 % 128;
        O0 = i13;
        int i14 = i12 % 2;
        component10 component10Var = valueof.f61486w0;
        if (i14 == 0) {
            int i15 = 57 / 0;
        }
        int i16 = i13 + 37;
        N0 = i16 % 128;
        int i17 = i16 % 2;
        return component10Var;
    }

    public static /* synthetic */ Boolean l(Object[] objArr) {
        boolean zBooleanValue;
        setTextAppearance settextappearance = (setTextAppearance) objArr[0];
        fd fdVar = (fd) objArr[1];
        int i10 = N0;
        int i11 = (((i10 | 112) << 1) - (i10 ^ 112)) - 1;
        O0 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        f fVar = (f) setTextAppearance.setY(new Object[]{settextappearance}, -1677040788, 1677040788, System.identityHashCode(settextappearance));
        if (fVar == null) {
            int i12 = N0 + 34;
            int i13 = (i12 ^ (-1)) + (i12 << 1);
            int i14 = i13 % 128;
            O0 = i14;
            int i15 = i13 % 2;
            int i16 = i14 & 75;
            int i17 = (i14 ^ 75) | i16;
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            N0 = i18 % 128;
            int i19 = i18 % 2;
            zBooleanValue = false;
        } else {
            zBooleanValue = ((Boolean) com.mypinpad.tsdk.isolation.d.setDividerPadding(new Object[]{fVar}, -1630615362, 1630615362, (int) System.currentTimeMillis())).booleanValue();
            int i20 = N0 + 113;
            O0 = i20 % 128;
            int i21 = i20 % 2;
        }
        if (((getINVALID_MERCHANT_IDannotations) setTextAppearance.setY(new Object[]{settextappearance}, -638298177, 638298180, System.identityHashCode(settextappearance))) == getINVALID_MERCHANT_IDannotations.setLayoutAnimation) {
            System.currentTimeMillis();
            System.currentTimeMillis();
            if (fdVar == fd.END_APPLICATION) {
                int i22 = O0;
                int i23 = (((i22 | 74) << 1) - (i22 ^ 74)) - 1;
                N0 = i23 % 128;
                int i24 = i23 % 2;
                if (((Boolean) setOnFocusChangeListener(new Object[]{(getBeepOnFailure) setTextAppearance.setY(new Object[]{settextappearance}, -1762606256, 1762606263, System.identityHashCode(settextappearance))}, 2028206718, -2028206691, (int) System.currentTimeMillis())).booleanValue()) {
                    int i25 = N0;
                    int i26 = i25 & 53;
                    int i27 = i26 + ((i25 ^ 53) | i26);
                    O0 = i27 % 128;
                    if (i27 % 2 == 0) {
                        throw null;
                    }
                    if (zBooleanValue) {
                        int i28 = i25 & 101;
                        int i29 = -(-((i25 ^ 101) | i28));
                        int i30 = (i28 & i29) + (i29 | i28);
                        O0 = i30 % 128;
                        if (i30 % 2 != 0) {
                            return Boolean.TRUE;
                        }
                        throw null;
                    }
                }
            }
        }
        int i31 = N0;
        int i32 = (((i31 | 12) << 1) - (i31 ^ 12)) - 1;
        O0 = i32 % 128;
        int i33 = i32 % 2;
        return Boolean.FALSE;
    }

    public static /* synthetic */ void m(Object[] objArr) {
        setTextAppearance settextappearance = (setTextAppearance) objArr[0];
        int i10 = O0;
        int i11 = (i10 & 87) + (i10 | 87);
        N0 = i11 % 128;
        int i12 = i11 % 2;
        if (((l) setTextAppearance.setY(new Object[]{settextappearance}, 1819649031, -1819649023, System.identityHashCode(settextappearance))) != null) {
            int i13 = N0;
            int i14 = i13 ^ 85;
            int i15 = ((i13 & 85) | i14) << 1;
            int i16 = -i14;
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            O0 = i17 % 128;
            if (i17 % 2 == 0) {
                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{(String) l.setX(new Object[0], 1622929278, -1622929275, (int) System.currentTimeMillis())}, 818541572, -818541572, (int) System.currentTimeMillis());
                throw null;
            }
            SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{(String) l.setX(new Object[0], 1622929278, -1622929275, (int) System.currentTimeMillis())}, 818541572, -818541572, (int) System.currentTimeMillis());
        }
        if (((j) setTextAppearance.setY(new Object[]{settextappearance}, 1069213621, -1069213611, System.identityHashCode(settextappearance))) != null) {
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i18 = ~iCurrentTimeMillis;
            int i19 = (i18 | iCurrentTimeMillis) & i18;
            int i20 = ~((i19 & (-313329456)) | ((-313329456) ^ i19));
            int i21 = (-1025534292) & iCurrentTimeMillis;
            int i22 = (~i21) & ((-1025534292) | iCurrentTimeMillis);
            int i23 = ~((i21 & i22) | (i22 ^ i21));
            int i24 = ((~i23) & i20) | ((~i20) & i23);
            int i25 = i20 & i23;
            int i26 = -(~(((i25 & i24) | (i24 ^ i25)) * 959));
            int i27 = (-2) - ((((-322553331) ^ i26) + ((i26 & (-322553331)) << 1)) ^ (-1));
            int i28 = (-2) - (((i27 & (-164762415)) + (i27 | (-164762415))) ^ (-1));
            int i29 = (-313329456) ^ iCurrentTimeMillis;
            int i30 = iCurrentTimeMillis & (-313329456);
            int i31 = (i30 & i29) | (i29 ^ i30);
            int i32 = ~i31;
            int i33 = (i31 | i32) & i32;
            int i34 = i18 & (-1025534292);
            int i35 = (i18 | (-1025534292)) & (~i34);
            int i36 = (i35 & i34) | (i35 ^ i34);
            int i37 = ~i36;
            int i38 = (i36 | i37) & i37;
            int i39 = i33 & i38;
            int i40 = (i33 | i38) & (~i39);
            int i41 = ((i40 & i39) | (i40 ^ i39)) * 959;
            int i42 = ((~i41) & i28) | ((~i28) & i41);
            int i43 = -(-((i41 & i28) << 1));
            int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i45 = ~iCurrentTimeMillis2;
            int i46 = (-777878295) ^ i45;
            int i47 = (-777878295) & i45;
            int i48 = ~((i47 & i46) | (i46 ^ i47));
            int i49 = 1895063147 & i48;
            int i50 = (i48 | 1895063147) & (~i49);
            int i51 = (((i50 & i49) | (i50 ^ i49)) * (-983)) + 388251143;
            int i52 = (iCurrentTimeMillis2 | i45) & i45;
            int i53 = 1895063147 & i52;
            int i54 = (i52 | 1895063147) & (~i53);
            int i55 = ~((i54 & i53) | (i54 ^ i53));
            int i56 = (2130542463 & i55) | ((~i55) & (-2130542464));
            int i57 = i55 & (-2130542464);
            if (i44 <= (-2) - (((i51 - (~(-(~(-(-(((i57 & i56) | (i56 ^ i57)) * 983))))))) - 1) ^ (-1))) {
                SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{(String) j.setDividerPadding(new Object[0], -598422633, 598422633, (int) System.currentTimeMillis())}, 818541572, -818541572, (int) System.currentTimeMillis());
                throw null;
            }
            SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{(String) j.setDividerPadding(new Object[0], -598422633, 598422633, (int) System.currentTimeMillis())}, 818541572, -818541572, (int) System.currentTimeMillis());
        }
        if (((f) setTextAppearance.setY(new Object[]{settextappearance}, -1677040788, 1677040788, System.identityHashCode(settextappearance))) != null) {
            int i58 = N0;
            int i59 = (((i58 | 56) << 1) - (i58 ^ 56)) - 1;
            O0 = i59 % 128;
            int i60 = i59 % 2;
            SouthPacificEndpoint southPacificEndpoint5 = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{(String) f.setOnFocusChangeListener(new Object[0], -239259623, 239259628, (int) System.currentTimeMillis())}, 818541572, -818541572, (int) System.currentTimeMillis());
            int i61 = O0 + 39;
            N0 = i61 % 128;
            int i62 = i61 % 2;
        }
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setTextAppearance.setY(new Object[]{settextappearance}, -1762606256, 1762606263, System.identityHashCode(settextappearance));
        if (getbeeponfailure != null) {
            int i63 = O0;
            int i64 = i63 ^ 35;
            int i65 = ((i63 & 35) | i64) << 1;
            int i66 = -i64;
            int i67 = (i65 & i66) + (i65 | i66);
            N0 = i67 % 128;
            if (i67 % 2 != 0) {
                SouthPacificEndpoint southPacificEndpoint6 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Outcome Tag List\n", ((Pair) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1674109266, 1674109269, (int) System.currentTimeMillis())).getFirst())}, 818541572, -818541572, (int) System.currentTimeMillis());
                throw null;
            }
            SouthPacificEndpoint southPacificEndpoint7 = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Outcome Tag List\n", ((Pair) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1674109266, 1674109269, (int) System.currentTimeMillis())).getFirst())}, 818541572, -818541572, (int) System.currentTimeMillis());
            int i68 = O0;
            int i69 = ((i68 | 87) << 1) - (i68 ^ 87);
            N0 = i69 % 128;
            int i70 = i69 % 2;
        }
        SouthPacificEndpoint southPacificEndpoint8 = SouthPacificEndpoint.setX;
        SouthPacificEndpoint.setX(new Object[]{30000, settextappearance, 4}, 1336485880, -1336485874, 30000);
        int i71 = O0;
        int i72 = i71 & 7;
        int i73 = (i71 | 7) & (~i72);
        int i74 = i72 << 1;
        int i75 = (i73 ^ i74) + ((i73 & i74) << 1);
        N0 = i75 % 128;
        int i76 = i75 % 2;
    }

    public static /* synthetic */ void n(Object[] objArr) throws Exception {
        valueOf valueof = (valueOf) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i10 = N0;
        int i11 = ((i10 | 55) << 1) - (i10 ^ 55);
        O0 = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
        SouthPacificEndpoint.setX(new Object[]{"Continue transaction processing using online response callback called"}, 818541572, -818541572, (int) System.currentTimeMillis());
        SouthPacificEndpoint.setX(new Object[]{6, null, 6}, 1336485880, -1336485874, 6);
        if (valueof.setTextScaleX == null) {
            SouthPacificEndpoint.setX(new Object[]{"Transaction has been completed"}, -1475632754, 1475632759, (int) System.currentTimeMillis());
            throw new setIndeterminateDrawable(3035, null, null, 6, null);
        }
        if (bArr.length == 0) {
            int i13 = N0;
            int i14 = i13 + 15;
            O0 = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = i13 ^ 19;
                int i16 = ((i13 & 19) | i15) << 1;
                int i17 = -i15;
                int i18 = (i16 & i17) + (i17 | i16);
                O0 = i18 % 128;
                int i19 = i18 % 2;
            }
            throw new setIndeterminateDrawable(3033, null, null, 6, null);
        }
        int i20 = O0;
        int i21 = ((i20 & (-72)) | ((~i20) & 71)) + ((i20 & 71) << 1);
        N0 = i21 % 128;
        int i22 = i21 % 2;
        int i23 = O0;
        int i24 = i23 & 47;
        int i25 = (i23 ^ 47) | i24;
        int i26 = (i24 & i25) + (i25 | i24);
        N0 = i26 % 128;
        if (i26 % 2 == 0) {
            setTextKeepState settextkeepstate = valueof.G0;
            setTextLocales settextlocales = setTextLocales.setOnDragListener;
            setMaxWidth setmaxwidth = new setMaxWidth();
            setMaxWidth.setX(new Object[]{setmaxwidth, bArr}, -494144192, 494144193, (int) System.currentTimeMillis());
            Unit unit = Unit.INSTANCE;
            setTextKeepState.setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate, new com.mypinpad.tsdk.isolation.a(settextlocales, setmaxwidth, null, null, null, 28, null)}, 565642854, -565642852, System.identityHashCode(settextkeepstate));
            BuildersKt__Builders_commonKt.launch$default(valueof, null, null, valueof.new a(null), 3, null);
            int i27 = N0;
            int i28 = i27 ^ 35;
            int i29 = ((((i27 & 35) | i28) << 1) - (~(-i28))) - 1;
            O0 = i29 % 128;
            if (i29 % 2 == 0) {
                throw null;
            }
            return;
        }
        throw new setIndeterminateDrawable(3033, null, null, 6, null);
    }

    public static /* synthetic */ void o(Object[] objArr) {
        valueOf valueof = (valueOf) objArr[0];
        int i10 = O0 + 67;
        N0 = i10 % 128;
        int i11 = i10 % 2;
        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
        SouthPacificEndpoint.setX(new Object[]{"Online request failed callback called"}, 818541572, -818541572, (int) System.currentTimeMillis());
        SouthPacificEndpoint.setX(new Object[]{5, null, 6}, 1336485880, -1336485874, 5);
        if (valueof.setTextScaleX == null) {
            SouthPacificEndpoint.setX(new Object[]{"Transaction has been completed"}, -1475632754, 1475632759, (int) System.currentTimeMillis());
            throw new setIndeterminateDrawable(3035, null, null, 6, null);
        }
        setTextKeepState settextkeepstate = valueof.G0;
        setTextKeepState.setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate, new com.mypinpad.tsdk.isolation.a(setTextLocales.getNavBarTitleString, null, null, null, null, 30, null)}, 565642854, -565642852, System.identityHashCode(settextkeepstate));
        BuildersKt__Builders_commonKt.launch$default(valueof, null, null, valueof.new c(null), 3, null);
        int iIdentityHashCode = System.identityHashCode(valueof);
        int i12 = 780765174 ^ iIdentityHashCode;
        int i13 = 780765174 & iIdentityHashCode;
        int i14 = ~((i12 & i13) | (i12 ^ i13));
        int i15 = ((~i14) & (-1283607495)) | (1283607494 & i14);
        int i16 = i14 & (-1283607495);
        int i17 = ((i16 & i15) | (i15 ^ i16)) * (-658);
        int i18 = 1817184259 & i17;
        int i19 = (i18 + ((i17 ^ 1817184259) | i18)) - 593266910;
        int i20 = (iIdentityHashCode | 780765174) & (~i13);
        int i21 = (i20 & i13) | (i20 ^ i13);
        int i22 = ~i21;
        int i23 = (i21 | i22) & i22;
        int i24 = ((i23 & (-1854656503)) | ((~i23) & (-1854656503)) | (1854656502 & i23)) * 658;
        int i25 = (i19 & i24) + (i24 | i19);
        int iIdentityHashCode2 = System.identityHashCode(valueof);
        int i26 = ~iIdentityHashCode2;
        int i27 = ~(((-665484654) & i26) | ((~i26) & 665484653) | (i26 & 665484653));
        int i28 = 1735461518 ^ i27;
        int i29 = i27 & 1735461518;
        int i30 = ((i29 & i28) | (i28 ^ i29)) * (-1042);
        int i31 = 1513144356 & i30;
        int i32 = (i30 | 1513144356) & (~i31);
        int i33 = -(-(i31 << 1));
        int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
        int i35 = 665484653 ^ iIdentityHashCode2;
        int i36 = 665484653 & iIdentityHashCode2;
        int i37 = -(-(((i35 & i36) | (i35 ^ i36)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
        int i38 = i34 & i37;
        int i39 = (((i37 | i34) & (~i38)) - (~(-(-(i38 << 1))))) - 1;
        int i40 = ((-1735461519) & i26) | (iIdentityHashCode2 & 1735461518);
        int i41 = iIdentityHashCode2 & (-1735461519);
        int i42 = ~((i41 & i40) | (i40 ^ i41));
        int i43 = ((~i42) & 656410636) | ((-656410637) & i42);
        int i44 = i42 & 656410636;
        int i45 = (i44 & i43) | (i43 ^ i44);
        int i46 = i26 & 1735461518;
        int i47 = (i26 | 1735461518) & (~i46);
        int i48 = (i47 & i46) | (i47 ^ i46);
        int i49 = i48 & 665484653;
        int i50 = (i48 | 665484653) & (~i49);
        int i51 = (i50 & i49) | (i50 ^ i49);
        int i52 = ~i51;
        int i53 = (i51 | i52) & i52;
        if (i25 <= (-2) - (((i39 - (~(-(~(((i45 & i53) | (i45 ^ i53)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY))))) - 1) ^ (-1))) {
            throw null;
        }
    }

    public static /* synthetic */ getRevealSystemBarToastMessage p(Object[] objArr) {
        valueOf valueof = (valueOf) objArr[0];
        int i10 = O0;
        int i11 = i10 & 81;
        int i12 = (~i11) & (i10 | 81);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i13 | i12);
        N0 = i14 % 128;
        int i15 = i14 % 2;
        getRevealSystemBarToastMessage getrevealsystembartoastmessage = valueof.f61488y0;
        if (i15 != 0) {
            int i16 = 13 / 0;
        }
        int i17 = i10 & 97;
        int i18 = ((i10 ^ 97) | i17) << 1;
        int i19 = -((i10 | 97) & (~i17));
        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
        N0 = i20 % 128;
        int i21 = i20 % 2;
        return getrevealsystembartoastmessage;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0079 A[Catch: Exception -> 0x004c, PHI: r8
      0x0079: PHI (r8v18 com.mypinpad.tsdk.i.setMaxLines) = (r8v5 com.mypinpad.tsdk.i.setMaxLines), (r8v23 com.mypinpad.tsdk.i.setMaxLines) binds: [B:15:0x005d, B:7:0x0046] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x004c, blocks: (B:4:0x0035, B:6:0x0045, B:17:0x0079, B:24:0x00a4, B:27:0x00d2, B:28:0x00de, B:29:0x00df, B:32:0x0119, B:35:0x0136, B:14:0x004f), top: B:44:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x016c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x016d  */
    public static /* synthetic */ Unit q(Object[] objArr) throws Exception {
        setMaxLines setmaxlines;
        int i10;
        int i11;
        Unit unit;
        int i12;
        valueOf valueof = (valueOf) objArr[0];
        SendChannel sendChannel = (SendChannel) objArr[1];
        gz gzVar = (gz) objArr[2];
        me meVar = (me) objArr[3];
        getValue getvalue = (getValue) objArr[4];
        setTextColor settextcolor = (setTextColor) objArr[5];
        int i13 = O0 + 65;
        N0 = i13 % 128;
        try {
            if (i13 % 2 != 0) {
                setmaxlines = (setMaxLines) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1588451735, 1588451749, System.identityHashCode(settextcolor));
                int i14 = 34 / 0;
                if (setmaxlines == null) {
                    int i15 = O0;
                    int i16 = ((((i15 ^ 77) | (i15 & 77)) << 1) - (~(-(((~i15) & 77) | (i15 & (-78)))))) - 1;
                    N0 = i16 % 128;
                    int i17 = i16 % 2;
                    i10 = -1;
                } else {
                    i10 = setOnFocusChangeListener.setDividerPadding[setmaxlines.ordinal()];
                    int i18 = N0;
                    int i19 = i18 | 21;
                    int i20 = i19 << 1;
                    int i21 = -((~(i18 & 21)) & i19);
                    int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                    O0 = i22 % 128;
                    int i23 = i22 % 2;
                }
            } else {
                setmaxlines = (setMaxLines) setTextColor.setCompoundDrawableTintBlendMode(new Object[]{settextcolor}, -1588451735, 1588451749, System.identityHashCode(settextcolor));
                if (setmaxlines == null) {
                    int i110 = O0;
                    int i111 = ((((i110 ^ 77) | (i110 & 77)) << 1) - (~(-(((~i110) & 77) | (i110 & (-78)))))) - 1;
                    N0 = i111 % 128;
                    int i112 = i111 % 2;
                    i10 = -1;
                } else {
                    i10 = setOnFocusChangeListener.setDividerPadding[setmaxlines.ordinal()];
                    int i113 = N0;
                    int i114 = i113 | 21;
                    int i24 = i114 << 1;
                    int i25 = -((~(i113 & 21)) & i114);
                    int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                    O0 = i26 % 128;
                    int i27 = i26 % 2;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    BuildersKt__Builders_commonKt.launch$default(valueof, null, null, new wy(valueof, gzVar, meVar, getvalue, null), 3, null);
                    int i28 = N0 + 51;
                    O0 = i28 % 128;
                    int i29 = i28 % 2;
                } else if (i10 == 3) {
                    SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{"Waiting for online Processing..."}, 818541572, -818541572, (int) System.currentTimeMillis());
                    setOnFocusChangeListener(new Object[]{valueof, sendChannel, settextcolor}, -889700403, 889700422, System.identityHashCode(valueof));
                    int i30 = N0;
                    int i31 = i30 ^ 117;
                    int i32 = ((i30 & 117) | i31) << 1;
                    int i33 = -i31;
                    int i34 = (i32 & i33) + (i32 | i33);
                    O0 = i34 % 128;
                    int i35 = i34 % 2;
                } else {
                    if (i10 != 4) {
                        throw new setIndeterminateDrawable(3016, null, null, 6, null);
                    }
                    setOnFocusChangeListener(new Object[]{valueof, sendChannel, settextcolor}, -889700403, 889700422, System.identityHashCode(valueof));
                    setOnFocusChangeListener(new Object[]{valueof}, 656009894, -656009871, System.identityHashCode(valueof));
                    int i36 = N0;
                    i11 = (((i36 | 54) << 1) - (i36 ^ 54)) - 1;
                    O0 = i11 % 128;
                }
                unit = Unit.INSTANCE;
                int i37 = O0;
                i12 = (i37 ^ 57) + ((i37 & 57) << 1);
                N0 = i12 % 128;
                if (i12 % 2 == 0) {
                    return unit;
                }
                throw null;
            }
            BuildersKt__Builders_commonKt.launch$default(valueof, null, null, new c00(valueof, gzVar, meVar, getvalue, settextcolor, null), 3, null);
            int i38 = O0;
            i11 = (((i38 & (-112)) | ((~i38) & 111)) - (~((i38 & 111) << 1))) - 1;
            N0 = i11 % 128;
            int i39 = i11 % 2;
            unit = Unit.INSTANCE;
            int i310 = O0;
            i12 = (i310 ^ 57) + ((i310 & 57) << 1);
            N0 = i12 % 128;
            if (i12 % 2 == 0) {
                return unit;
            }
            throw null;
        } catch (Exception e5) {
            setOnFocusChangeListener(new Object[]{valueof}, 656009894, -656009871, System.identityHashCode(valueof));
            SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{"Error in OnProcessCompleted"}, -1166612213, 1166612217, (int) System.currentTimeMillis());
            throw e5;
        }
    }

    public static /* synthetic */ getValue r(Object[] objArr) {
        valueOf valueof = (valueOf) objArr[0];
        int i10 = N0;
        int i11 = ((i10 & 72) + (i10 | 72)) - 1;
        O0 = i11 % 128;
        int i12 = i11 % 2;
        getValue getvalue = valueof.H0;
        int i13 = i10 + 13;
        O0 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 62 / 0;
        }
        return getvalue;
    }

    public static /* synthetic */ di s(Object[] objArr) {
        valueOf valueof = (valueOf) objArr[0];
        int i10 = N0;
        int i11 = i10 ^ 67;
        int i12 = -(-((i10 & 67) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        O0 = i14;
        int i15 = i13 % 2;
        di diVar = valueof.v0;
        int i16 = i14 & 59;
        int i17 = -(-((i14 ^ 59) | i16));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        N0 = i18 % 128;
        if (i18 % 2 == 0) {
            return diVar;
        }
        throw null;
    }

    public static final /* synthetic */ di setCompoundDrawableTintBlendMode(valueOf valueof) {
        return (di) setOnFocusChangeListener(new Object[]{valueof}, -1508853607, 1508853619, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ component17 setDividerPadding(valueOf valueof) {
        return (component17) setOnFocusChangeListener(new Object[]{valueof}, -1836476222, 1836476240, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ writeObject setLayoutAnimation(valueOf valueof) {
        return (writeObject) setOnFocusChangeListener(new Object[]{valueof}, -1217860370, 1217860413, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ ij setNavigationOnClickListener(valueOf valueof) {
        return (ij) setOnFocusChangeListener(new Object[]{valueof}, -1339796769, 1339796802, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ setContextClickable setOnDragListener(valueOf valueof) {
        return (setContextClickable) setOnFocusChangeListener(new Object[]{valueof}, 439341206, -439341206, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object obj;
        int i13 = ~i11;
        int i14 = ~i12;
        switch ((((~(i10 | i14 | i11)) | (~(i12 | i13)) | (~((~i10) | i13))) * 988) + ((i10 | i13) * (-988)) + (((~(i13 | i14 | i10)) | (~(i10 | i11 | i12))) * 988) + (i11 * (-987)) + (i10 * 989)) {
            case 1:
                valueOf valueof = (valueOf) objArr[0];
                int i15 = O0;
                int i16 = i15 + 65;
                N0 = i16 % 128;
                int i17 = i16 % 2;
                setTop settop = valueof.f61480p0;
                int i18 = ((i15 | 63) << 1) - (i15 ^ 63);
                N0 = i18 % 128;
                int i19 = i18 % 2;
                return settop;
            case 2:
                return r(objArr);
            case 3:
                return v(objArr);
            case 4:
                w(objArr);
                return null;
            case 5:
                valueOf valueof2 = (valueOf) objArr[0];
                SendChannel sendChannel = (SendChannel) objArr[1];
                gz gzVar = (gz) objArr[2];
                me meVar = (me) objArr[3];
                setTextKeepState settextkeepstate = (setTextKeepState) objArr[4];
                Continuation continuation = (Continuation) objArr[5];
                int i20 = O0;
                int i21 = i20 & 81;
                int i22 = -(-((i20 ^ 81) | i21));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                N0 = i23 % 128;
                int i24 = i23 % 2;
                Object onFocusChangeListener = setOnFocusChangeListener(new Object[]{valueof2, sendChannel, gzVar, meVar, settextkeepstate, continuation}, -811121700, 811121716, System.identityHashCode(valueof2));
                int i25 = O0;
                int i26 = ((i25 | 87) << 1) - (i25 ^ 87);
                N0 = i26 % 128;
                int i27 = i26 % 2;
                return onFocusChangeListener;
            case 6:
                valueOf valueof3 = (valueOf) objArr[0];
                component20 component20Var = (component20) objArr[1];
                component23 component23Var = (component23) objArr[2];
                component12 component12Var = (component12) objArr[3];
                Intrinsics.checkNotNullParameter(component20Var, "");
                Intrinsics.checkNotNullParameter(component23Var, "");
                Intrinsics.checkNotNullParameter(component12Var, "");
                L0.acquire();
                M0.set(true);
                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Start transaction ", component12Var)}, 818541572, -818541572, (int) System.currentTimeMillis());
                SouthPacificEndpoint.setX(new Object[]{0, (getDetailsFieldTextSizeSp) component12.setX(new Object[]{component12Var}, -838704000, 838704001, System.identityHashCode(component12Var)), 4}, 1336485880, -1336485874, 0);
                setCompoundDrawableTintList setcompounddrawabletintlist = new setCompoundDrawableTintList();
                setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding(CoroutineExceptionHandler.INSTANCE, component20Var, setcompounddrawabletintlist);
                setOnFocusChangeListener(new Object[]{valueof3, setcompounddrawabletintlist}, -1001092853, 1001092887, System.identityHashCode(valueof3));
                setSafeBrowsingWhitelist setsafebrowsingwhitelist = setSafeBrowsingWhitelist.setX;
                setSafeBrowsingWhitelist.setCompoundDrawableTintBlendMode(new Object[0], 1531836137, -1531836134, (int) System.currentTimeMillis());
                BuildersKt__Builders_commonKt.launch$default(valueof3, setincludefontpadding, null, valueof3.new e(component23Var, component20Var, setcompounddrawabletintlist, component12Var, null), 2, null);
                int i28 = O0;
                int i29 = i28 & 53;
                int i30 = i29 + ((i28 ^ 53) | i29);
                N0 = i30 % 128;
                int i31 = i30 % 2;
                return null;
            case 7:
                j(objArr);
                return null;
            case 8:
                valueOf valueof4 = (valueOf) objArr[0];
                int i32 = O0;
                int i33 = i32 & 99;
                int i34 = (i32 ^ 99) | i33;
                int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                N0 = i35 % 128;
                int i36 = i35 % 2;
                SouthPacificEndpoint.setX(new Object[]{4, null, 6}, 1336485880, -1336485874, 4);
                setOnFocusChangeListener(new Object[]{valueof4}, 656009894, -656009871, System.identityHashCode(valueof4));
                int i37 = N0;
                int i38 = ((i37 & 90) + (i37 | 90)) - 1;
                O0 = i38 % 128;
                int i39 = i38 % 2;
                return null;
            case 9:
                return p(objArr);
            case 10:
                return l(objArr);
            case 11:
                o(objArr);
                return null;
            case 12:
                return s(objArr);
            case 13:
                d(objArr);
                return null;
            case 14:
                valueOf valueof5 = (valueOf) objArr[0];
                SendChannel sendChannel2 = (SendChannel) objArr[1];
                Exception exc = (Exception) objArr[2];
                int i40 = O0;
                int i41 = (i40 | 45) << 1;
                int i42 = -(i40 ^ 45);
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                N0 = i43 % 128;
                int i44 = i43 % 2;
                SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{40001, null, exc}, 1008224929, -1008224920, 40001);
                sendChannel2.close(exc);
                setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.OTHER}, -157457190, 157457205, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{valueof5}, 1458627735, -1458627698, System.identityHashCode(valueof5));
                int i45 = N0;
                int i46 = (i45 & (-100)) | ((~i45) & 99);
                int i47 = (i45 & 99) << 1;
                int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                O0 = i48 % 128;
                int i49 = i48 % 2;
                return null;
            case 15:
                return f(objArr);
            case 16:
                return b(objArr);
            case 17:
                valueOf valueof6 = (valueOf) objArr[0];
                SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{7, null, 6}, 1336485880, -1336485874, 7);
                BuildersKt__Builders_commonKt.launch$default(valueof6, null, null, valueof6.new b(null), 3, null);
                int i50 = O0;
                int i51 = ((i50 | 61) << 1) - (i50 ^ 61);
                N0 = i51 % 128;
                int i52 = i51 % 2;
                return null;
            case 18:
                valueOf valueof7 = (valueOf) objArr[0];
                int i53 = N0;
                int i54 = i53 & 69;
                int i55 = -(-((i53 ^ 69) | i54));
                int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
                O0 = i56 % 128;
                int i57 = i56 % 2;
                component17 component17Var = valueof7.f61483s0;
                int i58 = i53 & 81;
                int i59 = (i53 ^ 81) | i58;
                int i60 = ((i58 | i59) << 1) - (i58 ^ i59);
                O0 = i60 % 128;
                int i61 = i60 % 2;
                return component17Var;
            case 19:
                x(objArr);
                return null;
            case 20:
                valueOf valueof8 = (valueOf) objArr[0];
                setAccessibilityPaneTitle setaccessibilitypanetitle = new setAccessibilityPaneTitle();
                setOnFocusChangeListener(new Object[]{valueof8, setaccessibilitypanetitle}, -206681346, 206681359, System.identityHashCode(valueof8));
                int i62 = N0;
                int i63 = i62 & 79;
                int i64 = (i62 | 79) & (~i63);
                int i65 = i63 << 1;
                int i66 = ((i64 | i65) << 1) - (i64 ^ i65);
                O0 = i66 % 128;
                int i67 = i66 % 2;
                return setaccessibilitypanetitle;
            case 21:
                return k(objArr);
            case 22:
                valueOf valueof9 = (valueOf) objArr[0];
                setAddStatesFromChildren setaddstatesfromchildren = (setAddStatesFromChildren) objArr[1];
                int i68 = O0 + 81;
                N0 = i68 % 128;
                int i69 = i68 % 2;
                Intrinsics.checkNotNullParameter(setaddstatesfromchildren, "");
                SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Continue transaction processing with Pin entry result: ", Integer.valueOf(setaddstatesfromchildren.ordinal()))}, 818541572, -818541572, (int) System.currentTimeMillis());
                SouthPacificEndpoint.setX(new Object[]{10, (getDetailsFieldTextSizeSp) getCause.setY(new Object[]{setaddstatesfromchildren}, -464716334, 464716334, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 10);
                if (valueof9.setTextScaleX == null) {
                    SouthPacificEndpoint.setX(new Object[]{"Transaction has been completed"}, -1475632754, 1475632759, (int) System.currentTimeMillis());
                    throw new setIndeterminateDrawable(3035, null, null, 6, null);
                }
                setTextKeepState settextkeepstate2 = valueof9.G0;
                setTextKeepState.setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate2, new setFallbackLineSpacing(setaddstatesfromchildren.setCompoundDrawableTintBlendMode())}, 565642854, -565642852, System.identityHashCode(settextkeepstate2));
                BuildersKt__Builders_commonKt.launch$default(valueof9, null, null, valueof9.new d(null), 3, null);
                int i70 = N0;
                int i71 = i70 & 125;
                int i72 = (i70 | 125) & (~i71);
                int i73 = -(-(i71 << 1));
                int i74 = (i72 & i73) + (i72 | i73);
                O0 = i74 % 128;
                int i75 = i74 % 2;
                return null;
            case 23:
                t(objArr);
                return null;
            case 24:
                u(objArr);
                return null;
            case 25:
                return q(objArr);
            case 26:
                g(objArr);
                return null;
            case 27:
                return c(objArr);
            case 28:
                h(objArr);
                return null;
            case 29:
                valueOf valueof10 = (valueOf) objArr[0];
                setTextKeepState settextkeepstate3 = valueof10.G0;
                setTextKeepState.setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate3}, -502880194, 502880200, System.identityHashCode(settextkeepstate3));
                valueof10.G0 = new setTextKeepState();
                int i76 = O0;
                int i77 = i76 & 47;
                int i78 = ((i76 ^ 47) | i77) << 1;
                int i79 = -((i76 | 47) & (~i77));
                int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
                N0 = i80 % 128;
                int i81 = i80 % 2;
                return null;
            case 30:
                m(objArr);
                return null;
            case 31:
                valueOf valueof11 = (valueOf) objArr[0];
                int i82 = O0;
                int i83 = (i82 | 51) << 1;
                int i84 = -(((~i82) & 51) | (i82 & (-52)));
                int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                N0 = i85 % 128;
                if (i85 % 2 == 0) {
                    return valueof11.f61485u0;
                }
                setContentDescription setcontentdescription = valueof11.f61485u0;
                throw null;
            case 32:
                n(objArr);
                return null;
            case 33:
                valueOf valueof12 = (valueOf) objArr[0];
                int i86 = N0;
                int i87 = i86 ^ 75;
                int i88 = ((i86 & 75) | i87) << 1;
                int i89 = -i87;
                int i90 = ((i88 | i89) << 1) - (i88 ^ i89);
                O0 = i90 % 128;
                int i91 = i90 % 2;
                obj = valueof12.f61487x0;
                if (i91 == 0) {
                    int i92 = 43 / 0;
                }
                break;
            case 34:
                e(objArr);
                return null;
            case 35:
                valueOf valueof13 = (valueOf) objArr[0];
                int i93 = O0;
                int i94 = i93 ^ 17;
                int i95 = ((((i93 & 17) | i94) << 1) - (~(-i94))) - 1;
                int i96 = i95 % 128;
                N0 = i96;
                int i97 = i95 % 2;
                obj = valueof13.setTextScaleX;
                int i98 = i96 ^ 35;
                int i99 = -(-((i96 & 35) << 1));
                int i100 = (i98 & i99) + (i98 | i99);
                O0 = i100 % 128;
                if (i100 % 2 == 0) {
                    throw null;
                }
                break;
            case 36:
                return i(objArr);
            case 37:
                a(objArr);
                return null;
            case 38:
                valueOf valueof14 = (valueOf) objArr[0];
                setFastScrollEnabled.setY sety = (setFastScrollEnabled.setY) objArr[1];
                int i101 = O0;
                int i102 = ((((i101 ^ 113) | (i101 & 113)) << 1) - (~(-(((~i101) & 113) | (i101 & (-114)))))) - 1;
                N0 = i102 % 128;
                int i103 = i102 % 2;
                int i104 = setOnFocusChangeListener.setX[sety.ordinal()];
                if (i104 == 1) {
                    valueof14.f61488y0.setOnFocusChangeListener(getRevealSystemBarToastMessage.setDividerPadding.setOnFocusChangeListener);
                    int i105 = N0;
                    int i106 = i105 & 31;
                    int i107 = ((i105 | 31) & (~i106)) + (i106 << 1);
                    O0 = i107 % 128;
                    if (i107 % 2 != 0) {
                        return null;
                    }
                    int i108 = 44 / 0;
                    return null;
                }
                if (i104 == 2) {
                    valueof14.f61488y0.setOnFocusChangeListener(getRevealSystemBarToastMessage.setDividerPadding.setDividerPadding);
                    int i109 = N0;
                    int i110 = (i109 & (-56)) | ((~i109) & 55);
                    int i111 = (i109 & 55) << 1;
                    int i112 = ((i110 | i111) << 1) - (i111 ^ i110);
                    O0 = i112 % 128;
                    int i113 = i112 % 2;
                }
                int i114 = O0;
                int i115 = i114 & 45;
                int i116 = (i114 | 45) & (~i115);
                int i117 = i115 << 1;
                int i118 = ((i116 | i117) << 1) - (i116 ^ i117);
                N0 = i118 % 128;
                int i119 = i118 % 2;
                return null;
            case 39:
                int i120 = O0;
                int i121 = i120 ^ 33;
                int i122 = ((i120 & 33) | i121) << 1;
                int i123 = -i121;
                int i124 = ((i122 | i123) << 1) - (i122 ^ i123);
                N0 = i124 % 128;
                int i125 = i124 % 2;
                getRrn.Companion companion = getRrn.INSTANCE;
                getRrn.Companion.setCompoundDrawableTintBlendMode(new Object[0], -533004245, 533004245, (int) System.currentTimeMillis());
                int i126 = O0 + 75;
                N0 = i126 % 128;
                int i127 = i126 % 2;
                return null;
            case 40:
                valueOf valueof15 = (valueOf) objArr[0];
                SendChannel sendChannel3 = (SendChannel) objArr[1];
                l lVar = (l) objArr[2];
                String str = (String) objArr[3];
                boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
                int i128 = N0;
                int i129 = ~i128;
                int i130 = (((i128 ^ 83) | (i128 & 83)) << 1) - ((i128 & (-84)) | (83 & i129));
                O0 = i130 % 128;
                int i131 = i130 % 2;
                if (zBooleanValue) {
                    int i132 = ((i128 ^ 89) | (i128 & 89)) << 1;
                    int i133 = -((i128 & (-90)) | (i129 & 89));
                    int i134 = ((i132 | i133) << 1) - (i132 ^ i133);
                    O0 = i134 % 128;
                    if (i134 % 2 == 0) {
                        setSafeBrowsingWhitelist setsafebrowsingwhitelist2 = setSafeBrowsingWhitelist.setX;
                        setSafeBrowsingWhitelist.setCompoundDrawableTintBlendMode(new Object[]{str}, 2134864921, -2134864915, (int) System.currentTimeMillis());
                        throw null;
                    }
                    setSafeBrowsingWhitelist setsafebrowsingwhitelist3 = setSafeBrowsingWhitelist.setX;
                    setSafeBrowsingWhitelist.setCompoundDrawableTintBlendMode(new Object[]{str}, 2134864921, -2134864915, (int) System.currentTimeMillis());
                    int i135 = O0;
                    int i136 = (i135 & 29) + (i135 | 29);
                    N0 = i136 % 128;
                    int i137 = i136 % 2;
                }
                PinPadLaunchRequestListener pinPadLaunchRequestListener = valueof15.K0;
                if (pinPadLaunchRequestListener == null) {
                    int i138 = N0;
                    int i139 = i138 & 85;
                    int i140 = (((i138 ^ 85) | i139) << 1) - ((i138 | 85) & (~i139));
                    O0 = i140 % 128;
                    int i141 = i140 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i142 = N0;
                    int i143 = i142 & 35;
                    int i144 = (((i142 | 35) & (~i143)) - (~(-(-(i143 << 1))))) - 1;
                    O0 = i144 % 128;
                    int i145 = i144 % 2;
                    pinPadLaunchRequestListener = null;
                } else {
                    int i146 = O0;
                    int i147 = (i146 ^ 123) + ((i146 & 123) << 1);
                    N0 = i147 % 128;
                    int i148 = i147 % 2;
                }
                Pair pair = (Pair) PinPadLaunchRequestListener.setX(new Object[]{pinPadLaunchRequestListener, lVar}, -687603644, 687603654, System.identityHashCode(pinPadLaunchRequestListener));
                BuildersKt__Builders_commonKt.launch$default(valueof15, null, null, new a00((setFastScrollEnabled.setY) pair.component2(), sendChannel3, (setSystemGestureExclusionRects) pair.component1(), valueof15, null), 3, null);
                int i149 = N0;
                int i150 = (i149 & 116) + (i149 | 116);
                int i151 = (i150 ^ (-1)) + (i150 << 1);
                O0 = i151 % 128;
                if (i151 % 2 != 0) {
                    return null;
                }
                int i152 = 10 / 0;
                return null;
            case 41:
                valueOf valueof16 = (valueOf) objArr[0];
                int i153 = O0;
                int i154 = i153 ^ 49;
                int i155 = ((((i153 & 49) | i154) << 1) - (~(-i154))) - 1;
                int i156 = i155 % 128;
                N0 = i156;
                int i157 = i155 % 2;
                setTextKeepState settextkeepstate4 = valueof16.G0;
                if (i157 != 0) {
                    int i158 = 46 / 0;
                }
                int i159 = i156 + 15;
                O0 = i159 % 128;
                int i160 = i159 % 2;
                return settextkeepstate4;
            case 42:
                valueOf valueof17 = (valueOf) objArr[0];
                writeObject writeobject = (writeObject) objArr[1];
                int i161 = O0 + 71;
                N0 = i161 % 128;
                int i162 = i161 % 2;
                valueof17.I0 = writeobject;
                if (i162 == 0) {
                    return null;
                }
                throw null;
            case 43:
                valueOf valueof18 = (valueOf) objArr[0];
                int i163 = N0;
                int i164 = ((i163 & 35) - (~(-(-(i163 | 35))))) - 1;
                O0 = i164 % 128;
                if (i164 % 2 != 0) {
                    return valueof18.I0;
                }
                writeObject writeobject2 = valueof18.I0;
                throw null;
            default:
                valueOf valueof19 = (valueOf) objArr[0];
                int i165 = (-2) - ((O0 + 44) ^ (-1));
                int i166 = i165 % 128;
                N0 = i166;
                int i167 = i165 % 2;
                obj = valueof19.f61481q0;
                if (i167 != 0) {
                    int i168 = 58 / 0;
                }
                int i169 = ((i166 & 105) - (~(i166 | 105))) - 1;
                O0 = i169 % 128;
                if (i169 % 2 == 0) {
                    throw null;
                }
                break;
        }
        return obj;
    }

    public static final /* synthetic */ component10 setOnLongClickListener(valueOf valueof) {
        return (component10) setOnFocusChangeListener(new Object[]{valueof}, -1087480566, 1087480587, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ void setY(valueOf valueof, SendChannel sendChannel, setTextColor settextcolor) throws Exception {
        setOnFocusChangeListener(new Object[]{valueof, sendChannel, settextcolor}, 1409123646, -1409123622, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ getRevealSystemBarToastMessage setZ(valueOf valueof) {
        return (getRevealSystemBarToastMessage) setOnFocusChangeListener(new Object[]{valueof}, -528642313, 528642322, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022 A[PHI: r2
      0x0022: PHI (r2v5 com.mypinpad.tsdk.i.writeObject) = (r2v4 com.mypinpad.tsdk.i.writeObject), (r2v21 com.mypinpad.tsdk.i.writeObject) binds: [B:8:0x0020, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void t(Object[] objArr) throws Exception {
        writeObject writeobject;
        int i10;
        valueOf valueof = (valueOf) objArr[0];
        int i11 = N0;
        int i12 = ((i11 & 64) + (i11 | 64)) - 1;
        int i13 = i12 % 128;
        O0 = i13;
        if (i12 % 2 == 0) {
            writeobject = valueof.I0;
            int i14 = 23 / 0;
            if (writeobject != null) {
                i10 = (i13 & 79) + (i13 | 79);
                N0 = i10 % 128;
                if (i10 % 2 != 0) {
                    writeObject.setY(new Object[]{writeobject}, 2144918328, -2144918312, System.identityHashCode(writeobject));
                    int i15 = 59 / 0;
                } else {
                    writeObject.setY(new Object[]{writeobject}, 2144918328, -2144918312, System.identityHashCode(writeobject));
                }
                int i16 = O0;
                int i17 = (i16 & 32) + (i16 | 32);
                int i18 = (i17 ^ (-1)) + (i17 << 1);
                N0 = i18 % 128;
                int i19 = i18 % 2;
            }
        } else {
            writeobject = valueof.I0;
            if (writeobject != null) {
                i10 = (i13 & 79) + (i13 | 79);
                N0 = i10 % 128;
                if (i10 % 2 != 0) {
                    writeObject.setY(new Object[]{writeobject}, 2144918328, -2144918312, System.identityHashCode(writeobject));
                    int i110 = 59 / 0;
                } else {
                    writeObject.setY(new Object[]{writeobject}, 2144918328, -2144918312, System.identityHashCode(writeobject));
                }
                int i111 = O0;
                int i112 = (i111 & 32) + (i111 | 32);
                int i113 = (i112 ^ (-1)) + (i112 << 1);
                N0 = i113 % 128;
                int i114 = i113 % 2;
            }
        }
        setContextClickable setcontextclickable = valueof.f61481q0;
        setContextClickable.setDividerPadding(new Object[]{setcontextclickable}, -1553894445, 1553894446, System.identityHashCode(setcontextclickable));
        setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
        setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.OTHER}, -157457190, 157457205, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{valueof}, 1458627735, -1458627698, System.identityHashCode(valueof));
        int i20 = O0;
        int i21 = (i20 ^ 86) + ((i20 & 86) << 1);
        int i22 = (i21 ^ (-1)) + (i21 << 1);
        N0 = i22 % 128;
        int i23 = i22 % 2;
    }

    public static /* synthetic */ void u(Object[] objArr) throws Exception {
        valueOf valueof = (valueOf) objArr[0];
        SendChannel sendChannel = (SendChannel) objArr[1];
        setTextColor settextcolor = (setTextColor) objArr[2];
        int i10 = N0;
        int i11 = (((i10 & (-40)) | ((~i10) & 39)) - (~(-(-((i10 & 39) << 1))))) - 1;
        O0 = i11 % 128;
        if (i11 % 2 != 0) {
            setOnFocusChangeListener(new Object[]{valueof, sendChannel, settextcolor}, -889700403, 889700422, System.identityHashCode(valueof));
        } else {
            setOnFocusChangeListener(new Object[]{valueof, sendChannel, settextcolor}, -889700403, 889700422, System.identityHashCode(valueof));
            throw null;
        }
    }

    public static /* synthetic */ CoroutineContext v(Object[] objArr) {
        valueOf valueof = (valueOf) objArr[0];
        int i10 = N0;
        int i11 = i10 & 83;
        int i12 = (i10 | 83) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        O0 = i14 % 128;
        int i15 = i14 % 2;
        CoroutineContext coroutineContextPlus = valueof.F0.plus(valueof.E0);
        int i16 = O0 + 29;
        N0 = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 96 / 0;
        }
        return coroutineContextPlus;
    }

    public static /* synthetic */ void w(Object[] objArr) {
        valueOf valueof = (valueOf) objArr[0];
        String str = (String) objArr[1];
        int i10 = N0;
        int i11 = i10 ^ 39;
        int i12 = (i10 & 39) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        O0 = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{1, null, 6}, 1336485880, -1336485874, 1);
            getImmersiveMode getimmersivemode = getImmersiveMode.INSTANCE;
            setGroupIndicator setgroupindicator = (setGroupIndicator) getImmersiveMode.setDividerPadding(new Object[]{str}, -822279764, 822279764, (int) System.currentTimeMillis());
            component1 component1Var = component1.INSTANCE;
            setId setid = (setId) component1.setOnFocusChangeListener(new Object[]{setgroupindicator}, -1978374289, 1978374290, (int) System.currentTimeMillis());
            setId.setCompoundDrawableTintBlendMode(new Object[]{setid, valueof.f61485u0}, -1811659539, 1811659548, System.identityHashCode(setid));
            int i15 = N0;
            int i16 = (((i15 | 58) << 1) - (i15 ^ 58)) - 1;
            int i17 = i16 % 128;
            O0 = i17;
            int i18 = i16 % 2;
            int i19 = (i17 & (-96)) | ((~i17) & 95);
            int i20 = -(-((i17 & 95) << 1));
            int i21 = (i19 & i20) + (i20 | i19);
            N0 = i21 % 128;
            int i22 = i21 % 2;
            SouthPacificEndpoint.setX(new Object[]{3, null, 6}, 1336485880, -1336485874, 3);
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            valueof.f61484t0.setDividerPadding(bytes);
            int i23 = O0;
            int i24 = i23 & 121;
            int i25 = (i23 ^ 121) | i24;
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            N0 = i26 % 128;
            if (i26 % 2 != 0) {
                throw null;
            }
        } catch (Exception e5) {
            SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{2, (getDetailsFieldTextSizeSp) getCancelButtonIconDrawableId.setY(new Object[]{3020}, -2102169182, 2102169182, 3020), e5}, 1008224929, -1008224920, 2);
            throw new setIndeterminateDrawable(3020, e5.getMessage(), e5);
        }
    }

    public static /* synthetic */ void x(Object[] objArr) {
        valueOf valueof = (valueOf) objArr[0];
        SendChannel sendChannel = (SendChannel) objArr[1];
        setTextColor settextcolor = (setTextColor) objArr[2];
        int i10 = N0;
        int i11 = i10 + 77;
        int i12 = i11 % 128;
        O0 = i12;
        int i13 = i11 % 2;
        PinPadLaunchRequestListener pinPadLaunchRequestListener = valueof.K0;
        if (pinPadLaunchRequestListener == null) {
            int i14 = ((i10 & 63) - (~(-(-(i10 | 63))))) - 1;
            O0 = i14 % 128;
            if (i14 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i15 = 92 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            pinPadLaunchRequestListener = null;
        } else {
            int i16 = ((i12 ^ 56) + ((i12 & 56) << 1)) - 1;
            N0 = i16 % 128;
            int i17 = i16 % 2;
        }
        BuildersKt__Builders_commonKt.launch$default(valueof, null, null, new b00((Pair) PinPadLaunchRequestListener.setX(new Object[]{pinPadLaunchRequestListener, settextcolor}, 928347527, -928347523, System.identityHashCode(pinPadLaunchRequestListener)), sendChannel, valueof, null), 3, null);
        int i18 = N0;
        int i19 = i18 | 115;
        int i20 = ((i19 << 1) - (~(-((~(i18 & 115)) & i19)))) - 1;
        O0 = i20 % 128;
        int i21 = i20 % 2;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @JvmName(name = "getCoroutineContext")
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return (CoroutineContext) setOnFocusChangeListener(new Object[]{this}, 669819368, -669819365, System.identityHashCode(this));
    }

    public static final /* synthetic */ void setCompoundDrawableTintBlendMode(valueOf valueof, getValue getvalue) throws Exception {
        setOnFocusChangeListener(new Object[]{valueof, getvalue}, -476494440, 476494468, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ setTop setX(valueOf valueof) {
        return (setTop) setOnFocusChangeListener(new Object[]{valueof}, -100763846, 100763847, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ setTextKeepState setY(valueOf valueof) {
        return (setTextKeepState) setOnFocusChangeListener(new Object[]{valueof}, -1382858665, 1382858706, (int) System.currentTimeMillis());
    }

    @NotNull
    public final setAccessibilityPaneTitle setDividerPadding() {
        return (setAccessibilityPaneTitle) setOnFocusChangeListener(new Object[]{this}, -151746579, 151746599, System.identityHashCode(this));
    }

    public static final /* synthetic */ Object setX(valueOf valueof, SendChannel sendChannel, gz gzVar, me meVar, setTextKeepState settextkeepstate, Continuation continuation) {
        return setOnFocusChangeListener(new Object[]{valueof, sendChannel, gzVar, meVar, settextkeepstate, continuation}, -647779596, 647779601, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.component24
    public final void setCompoundDrawableTintBlendMode() throws Exception {
        setOnFocusChangeListener(new Object[]{this}, -1013767398, 1013767406, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.component24
    public final void setDividerPadding(@NotNull setAddStatesFromChildren p4) throws Exception {
        setOnFocusChangeListener(new Object[]{this, p4}, 1478890231, -1478890209, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.component24
    public final void setY() throws Exception {
        setOnFocusChangeListener(new Object[]{this}, 672684330, -672684313, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.component24
    public final void setDividerPadding(@NotNull byte[] p4) throws Exception {
        setOnFocusChangeListener(new Object[]{this, p4}, 811168539, -811168507, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.component24
    public final void setX(@NotNull component20 p4, @NotNull component23 p10, @NotNull component12 p11) throws Exception {
        setOnFocusChangeListener(new Object[]{this, p4, p10, p11}, -217499075, 217499081, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.component24
    public final void setY(@NotNull String p4) throws Exception {
        setOnFocusChangeListener(new Object[]{this, p4}, -998880692, 998880696, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @Nullable
    public final setAccessibilityPaneTitle setX() {
        return (setAccessibilityPaneTitle) setOnFocusChangeListener(new Object[]{this}, 1137740596, -1137740561, System.identityHashCode(this));
    }

    public static final /* synthetic */ void setOnFocusChangeListener(valueOf valueof, writeObject writeobject) throws Exception {
        setOnFocusChangeListener(new Object[]{valueof, writeobject}, 1773181035, -1773180993, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ void setOnFocusChangeListener(valueOf valueof, SendChannel sendChannel, Exception exc) throws Exception {
        setOnFocusChangeListener(new Object[]{valueof, sendChannel, exc}, -478932713, 478932720, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ getValue setOnFocusChangeListener(valueOf valueof) {
        return (getValue) setOnFocusChangeListener(new Object[]{valueof}, -1831347946, 1831347948, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.component24
    public final void setOnFocusChangeListener() throws Exception {
        setOnFocusChangeListener(new Object[]{this}, 1338606450, -1338606439, System.identityHashCode(this));
    }
}
