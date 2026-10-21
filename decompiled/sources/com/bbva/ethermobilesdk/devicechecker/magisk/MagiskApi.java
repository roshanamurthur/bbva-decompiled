package com.bbva.ethermobilesdk.devicechecker.magisk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import bk.q;
import bk.w;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicechecker.MagiskServiceApi;
import com.bbva.ethermobilesdk.devicechecker.extension.ContextKt;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import com.bbva.ethermobilesdk.devicechecker.magisk.service.MagiskService;
import com.bbva.ethermobilesdk.devicechecker.util.ResultUtilKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MagiskApi.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJO\u0010\u000b\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001`\n0\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJa\u0010\u000b\u001a.\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\bj\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007`\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0017\u001a\u00020\rR\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/magisk/MagiskApi;", "", "", "autoFinalizeDetection", "", "", "whiteListPackages", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "isMagiskCompleteDetected", "(ZLjava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "asResult", "(ZLjava/util/Set;Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "magiskPackageDetection$devicechecker_release", "()Z", "magiskPackageDetection", "", "magiskPermissionDetection$devicechecker_release", "(Ljava/util/Set;)Ljava/util/List;", "magiskPermissionDetection", "finalizeMagiskDetection", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "devicechecker_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMagiskApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MagiskApi.kt\ncom/bbva/ethermobilesdk/devicechecker/magisk/MagiskApi\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n819#2:218\n847#2,2:219\n*S KotlinDebug\n*F\n+ 1 MagiskApi.kt\ncom/bbva/ethermobilesdk/devicechecker/magisk/MagiskApi\n*L\n190#1:218\n190#1:219,2\n*E\n"})
public final class MagiskApi {

    @NotNull
    public static final String DANGEROUS_MAGISK_PACKAGE = "Y29tLnRvcGpvaG53dS5tYWdpc2s=";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public MagiskApi$magiskServiceDetection$2$1 f29449c;

    /* JADX INFO: compiled from: MagiskApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.magisk.MagiskApi$isMagiskCompleteDetected$2", f = "MagiskApi.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<HashMap<Integer, Object>>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Set f29450p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Pair[] f29451q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Integer f29452r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Pair[] f29453s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f29454t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f29455u0;
        public /* synthetic */ Object v0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ boolean f29457x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Set<String> f29458y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, Set<String> set, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f29457x0 = z10;
            this.f29458y0 = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = MagiskApi.this.new a(this.f29457x0, this.f29458y0, continuation);
            aVar.v0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<HashMap<Integer, Object>>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM5535constructorimpl;
            MagiskApi magiskApi;
            Set<String> set;
            Integer numBoxInt;
            Pair[] pairArr;
            Pair[] pairArr2;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29455u0;
            int i11 = 1;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    magiskApi = MagiskApi.this;
                    set = this.f29458y0;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    Pair[] pairArr3 = new Pair[3];
                    pairArr3[0] = TuplesKt.to(Boxing.boxInt(0), Boxing.boxBoolean(magiskApi.magiskPackageDetection$devicechecker_release()));
                    numBoxInt = Boxing.boxInt(1);
                    boolean z10 = this.f29457x0;
                    this.v0 = magiskApi;
                    this.f29450p0 = set;
                    this.f29451q0 = pairArr3;
                    this.f29452r0 = numBoxInt;
                    this.f29453s0 = pairArr3;
                    this.f29454t0 = 1;
                    this.f29455u0 = 1;
                    Object objAccess$magiskServiceDetection = MagiskApi.access$magiskServiceDetection(magiskApi, z10, this);
                    if (objAccess$magiskServiceDetection == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pairArr = pairArr3;
                    obj = objAccess$magiskServiceDetection;
                    pairArr2 = pairArr;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = this.f29454t0;
                    pairArr = this.f29453s0;
                    numBoxInt = this.f29452r0;
                    pairArr2 = this.f29451q0;
                    set = this.f29450p0;
                    magiskApi = (MagiskApi) this.v0;
                    ResultKt.throwOnFailure(obj);
                }
                pairArr[i11] = TuplesKt.to(numBoxInt, com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) obj));
                pairArr2[2] = TuplesKt.to(Boxing.boxInt(2), magiskApi.magiskPermissionDetection$devicechecker_release(set));
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(q.hashMapOf(pairArr2)));
            } catch (Throwable th2) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            return thM5538exceptionOrNullimpl == null ? objM5535constructorimpl : new Result.Error(thM5538exceptionOrNullimpl);
        }
    }

    /* JADX INFO: compiled from: MagiskApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.magisk.MagiskApi$isMagiskCompleteDetected$4", f = "MagiskApi.kt", i = {}, l = {115, 116, 117}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HashMap<Integer, Result<? extends Object>>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Pair[] f29459p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Pair[] f29460q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Integer f29461r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f29462s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f29463t0;
        public final /* synthetic */ boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Set<String> f29465w0;

        /* JADX INFO: compiled from: MagiskApi.kt */
        @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.magisk.MagiskApi$isMagiskCompleteDetected$4$1", f = "MagiskApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ MagiskApi f29466p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MagiskApi magiskApi, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f29466p0 = magiskApi;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.f29466p0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Boolean> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.f29466p0.magiskPackageDetection$devicechecker_release());
            }
        }

        /* JADX INFO: renamed from: com.bbva.ethermobilesdk.devicechecker.magisk.MagiskApi$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MagiskApi.kt */
        @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.magisk.MagiskApi$isMagiskCompleteDetected$4$2", f = "MagiskApi.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0124b extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f29467p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ MagiskApi f29468q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ boolean f29469r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0124b(MagiskApi magiskApi, boolean z10, Continuation<? super C0124b> continuation) {
                super(1, continuation);
                this.f29468q0 = magiskApi;
                this.f29469r0 = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new C0124b(this.f29468q0, this.f29469r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Boolean> continuation) {
                return ((C0124b) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f29467p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f29467p0 = 1;
                    obj = MagiskApi.access$magiskServiceDetection(this.f29468q0, this.f29469r0, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) obj);
            }
        }

        /* JADX INFO: compiled from: MagiskApi.kt */
        @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.magisk.MagiskApi$isMagiskCompleteDetected$4$3", f = "MagiskApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function1<Continuation<? super List<? extends String>>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ MagiskApi f29470p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Set<String> f29471q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(MagiskApi magiskApi, Set<String> set, Continuation<? super c> continuation) {
                super(1, continuation);
                this.f29470p0 = magiskApi;
                this.f29471q0 = set;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new c(this.f29470p0, this.f29471q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super List<? extends String>> continuation) {
                return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return this.f29470p0.magiskPermissionDetection$devicechecker_release(this.f29471q0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, Set<String> set, Continuation<? super b> continuation) {
            super(2, continuation);
            this.v0 = z10;
            this.f29465w0 = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MagiskApi.this.new b(this.v0, this.f29465w0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HashMap<Integer, Result<? extends Object>>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00a9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00aa  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Pair[] pairArr;
            int i10;
            Integer numBoxInt;
            Pair[] pairArr2;
            Integer numBoxInt2;
            Pair[] pairArr3;
            Integer numBoxInt3;
            Object objCatchingAndLog;
            Integer num;
            Pair[] pairArr4;
            Pair[] pairArr5;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i11 = this.f29463t0;
            MagiskApi magiskApi = MagiskApi.this;
            int i12 = 2;
            int i13 = 1;
            if (i11 != 0) {
                if (i11 == 1) {
                    i10 = this.f29462s0;
                    numBoxInt = this.f29461r0;
                    Pair[] pairArr6 = this.f29460q0;
                    Pair[] pairArr7 = this.f29459p0;
                    ResultKt.throwOnFailure(obj);
                    pairArr2 = pairArr6;
                    pairArr = pairArr7;
                } else if (i11 == 2) {
                    i13 = this.f29462s0;
                    numBoxInt2 = this.f29461r0;
                    pairArr3 = this.f29460q0;
                    pairArr = this.f29459p0;
                    ResultKt.throwOnFailure(obj);
                    pairArr3[i13] = TuplesKt.to(numBoxInt2, obj);
                    numBoxInt3 = Boxing.boxInt(2);
                    c cVar = new c(magiskApi, this.f29465w0, null);
                    this.f29459p0 = pairArr;
                    this.f29460q0 = pairArr;
                    this.f29461r0 = numBoxInt3;
                    this.f29462s0 = 2;
                    this.f29463t0 = 3;
                    objCatchingAndLog = ResultUtilKt.catchingAndLog(cVar, this);
                    if (objCatchingAndLog == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    num = numBoxInt3;
                    obj = objCatchingAndLog;
                    pairArr4 = pairArr;
                    pairArr5 = pairArr4;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = this.f29462s0;
                    num = this.f29461r0;
                    pairArr4 = this.f29460q0;
                    pairArr5 = this.f29459p0;
                    ResultKt.throwOnFailure(obj);
                }
                pairArr4[i12] = TuplesKt.to(num, obj);
                return q.hashMapOf(pairArr5);
            }
            ResultKt.throwOnFailure(obj);
            pairArr = new Pair[3];
            i10 = 0;
            numBoxInt = Boxing.boxInt(0);
            a aVar = new a(magiskApi, null);
            this.f29459p0 = pairArr;
            this.f29460q0 = pairArr;
            this.f29461r0 = numBoxInt;
            this.f29462s0 = 0;
            this.f29463t0 = 1;
            obj = ResultUtilKt.catchingAndLog(aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            pairArr2 = pairArr;
            pairArr2[i10] = TuplesKt.to(numBoxInt, obj);
            numBoxInt2 = Boxing.boxInt(1);
            C0124b c0124b = new C0124b(magiskApi, this.v0, null);
            this.f29459p0 = pairArr;
            this.f29460q0 = pairArr;
            this.f29461r0 = numBoxInt2;
            this.f29462s0 = 1;
            this.f29463t0 = 2;
            obj = ResultUtilKt.catchingAndLog(c0124b, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            pairArr3 = pairArr;
            pairArr3[i13] = TuplesKt.to(numBoxInt2, obj);
            numBoxInt3 = Boxing.boxInt(2);
            c cVar2 = new c(magiskApi, this.f29465w0, null);
            this.f29459p0 = pairArr;
            this.f29460q0 = pairArr;
            this.f29461r0 = numBoxInt3;
            this.f29462s0 = 2;
            this.f29463t0 = 3;
            objCatchingAndLog = ResultUtilKt.catchingAndLog(cVar2, this);
            if (objCatchingAndLog == coroutine_suspended) {
                return coroutine_suspended;
            }
            num = numBoxInt3;
            obj = objCatchingAndLog;
            pairArr4 = pairArr;
            pairArr5 = pairArr4;
            pairArr4[i12] = TuplesKt.to(num, obj);
            return q.hashMapOf(pairArr5);
        }
    }

    public MagiskApi(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bbva.ethermobilesdk.devicechecker.magisk.MagiskApi$magiskServiceDetection$2$1] */
    public static final Object access$magiskServiceDetection(final MagiskApi magiskApi, final boolean z10, Continuation continuation) {
        magiskApi.getClass();
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        magiskApi.f29449c = new ServiceConnection(magiskApi) { // from class: com.bbva.ethermobilesdk.devicechecker.magisk.MagiskApi$magiskServiceDetection$2$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MagiskApi f29473b;

            /* JADX INFO: compiled from: MagiskApi.kt */
            public static final class a extends Lambda implements Function1<Unit, Unit> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ boolean f29475p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ MagiskApi f29476q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(MagiskApi magiskApi, boolean z10) {
                    super(1);
                    this.f29475p0 = z10;
                    this.f29476q0 = magiskApi;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Unit unit) {
                    Unit it = unit;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (!this.f29475p0) {
                        this.f29476q0.f29448b = false;
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: compiled from: MagiskApi.kt */
            public static final class b extends Lambda implements Function1<Unit, Unit> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ boolean f29477p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ MagiskApi f29478q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(MagiskApi magiskApi, boolean z10) {
                    super(1);
                    this.f29477p0 = z10;
                    this.f29478q0 = magiskApi;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Unit unit) {
                    Unit it = unit;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (!this.f29477p0) {
                        this.f29478q0.f29448b = false;
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: compiled from: MagiskApi.kt */
            public static final class c extends Lambda implements Function1<Unit, Unit> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ Continuation<Result<Boolean>> f29479p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ Throwable f29480q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ boolean f29481r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final /* synthetic */ MagiskApi f29482s0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public c(Continuation<? super Result<Boolean>> continuation, Throwable th2, boolean z10, MagiskApi magiskApi) {
                    super(1);
                    this.f29479p0 = continuation;
                    this.f29480q0 = th2;
                    this.f29481r0 = z10;
                    this.f29482s0 = magiskApi;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Unit unit) {
                    Unit it = unit;
                    Intrinsics.checkNotNullParameter(it, "it");
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    this.f29479p0.resumeWith(kotlin.Result.m5535constructorimpl(new Result.Error(this.f29480q0)));
                    if (!this.f29481r0) {
                        this.f29482s0.f29448b = false;
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: compiled from: MagiskApi.kt */
            public static final class d extends Lambda implements Function1<Unit, Unit> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ boolean f29483p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ MagiskApi f29484q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(MagiskApi magiskApi, boolean z10) {
                    super(1);
                    this.f29483p0 = z10;
                    this.f29484q0 = magiskApi;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Unit unit) {
                    Unit it = unit;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (!this.f29483p0) {
                        this.f29484q0.f29448b = false;
                    }
                    return Unit.INSTANCE;
                }
            }

            {
                this.f29473b = magiskApi;
            }

            @Override // android.content.ServiceConnection
            public void onBindingDied(@Nullable ComponentName name) {
                ResultUtilKt.catchingAndSuppress$default(null, new a(this.f29473b, z10), 1, null);
            }

            @Override // android.content.ServiceConnection
            public void onNullBinding(@Nullable ComponentName name) {
                ResultUtilKt.catchingAndSuppress$default(null, new b(this.f29473b, z10), 1, null);
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(@NotNull ComponentName componentName, @NotNull IBinder iBinder) {
                Object objM5535constructorimpl;
                Intrinsics.checkNotNullParameter(componentName, "componentName");
                Intrinsics.checkNotNullParameter(iBinder, "iBinder");
                boolean z11 = z10;
                MagiskApi magiskApi2 = this.f29473b;
                Continuation<Result<Boolean>> continuation2 = safeContinuation;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    if (!z11) {
                        magiskApi2.f29448b = true;
                    }
                    continuation2.resumeWith(kotlin.Result.m5535constructorimpl(new Result.Success(com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow(com.bbva.ethermobilesdk.devicechecker.extension.ResultKt.toResult(MagiskServiceApi.Stub.asInterface(iBinder).isMagiskPresent())))));
                    if (z11) {
                        ContextKt.unbindService(magiskApi2.getContext(), magiskApi2.f29449c);
                    }
                    objM5535constructorimpl = kotlin.Result.m5535constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                if (thM5538exceptionOrNullimpl == null) {
                    return;
                }
                ResultUtilKt.catchingAndSuppress(thM5538exceptionOrNullimpl, new c(continuation2, thM5538exceptionOrNullimpl, z11, magiskApi2));
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@NotNull ComponentName componentName) {
                Intrinsics.checkNotNullParameter(componentName, "componentName");
                ResultUtilKt.catchingAndSuppress$default(null, new d(this.f29473b, z10), 1, null);
            }
        };
        Context context = magiskApi.context;
        Intent intent = new Intent(context, (Class<?>) MagiskService.class);
        MagiskApi$magiskServiceDetection$2$1 magiskApi$magiskServiceDetection$2$1 = magiskApi.f29449c;
        Intrinsics.checkNotNull(magiskApi$magiskServiceDetection$2$1, "null cannot be cast to non-null type android.content.ServiceConnection");
        context.bindService(intent, magiskApi$magiskServiceDetection$2$1, 1);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object isMagiskCompleteDetected$default(MagiskApi magiskApi, boolean z10, Set set, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            set = w.emptySet();
        }
        return magiskApi.isMagiskCompleteDetected(z10, set, continuation);
    }

    public final void finalizeMagiskDetection() {
        if (this.f29448b) {
            this.f29448b = false;
            ContextKt.unbindService(this.context, this.f29449c);
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final Object isMagiskCompleteDetected(boolean z10, @NotNull Set<String> set, @NotNull Continuation<? super Result<HashMap<Integer, Object>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(z10, set, null), continuation);
    }

    public final boolean magiskPackageDetection$devicechecker_release() {
        return ContextKt.isPackageInstalledBase64(this.context, DANGEROUS_MAGISK_PACKAGE);
    }

    @NotNull
    public final List<String> magiskPermissionDetection$devicechecker_release(@NotNull Set<String> whiteListPackages) {
        Intrinsics.checkNotNullParameter(whiteListPackages, "whiteListPackages");
        int i10 = Build.VERSION.SDK_INT;
        List<String> listPermissionsByApp = ContextKt.permissionsByApp(this.context, CollectionsKt__CollectionsKt.listOf((Object[]) new HashSet[]{MagiskApp.Magisk24000.INSTANCE.obtainPermissions(i10), MagiskApp.Magisk22000.INSTANCE.obtainPermissions(i10)}));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listPermissionsByApp) {
            if (!whiteListPackages.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Nullable
    public final Object isMagiskCompleteDetected(boolean z10, @NotNull Set<String> set, @NotNull Unit unit, @NotNull Continuation<? super HashMap<Integer, Result<? extends Object>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(z10, set, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object isMagiskCompleteDetected$default(MagiskApi magiskApi, boolean z10, Set set, Unit unit, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            set = w.emptySet();
        }
        return magiskApi.isMagiskCompleteDetected(z10, set, unit, continuation);
    }
}
