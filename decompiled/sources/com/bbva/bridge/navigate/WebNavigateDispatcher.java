package com.bbva.bridge.navigate;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.bridge.WebAwareComponent;
import com.bbva.bridge.webcontroller.WebState;
import com.bbva.cellscore.web.WebController;
import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebNavigateDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB#\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\u0011\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/bbva/bridge/navigate/WebNavigateDispatcher;", "Lcom/bbva/bridge/navigate/NavigateDispatcher;", "Lcom/bbva/bridge/WebAwareComponent;", "", "route", "", "awaitPageLoaded", "", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/bridge/navigate/WebNavigationState;", "navigate", "Lcom/bbva/bridge/webcontroller/WebState;", "state", "", "onWebReady", "onPageLoaded", "setPageLoadingReady", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/cellscore/web/WebController;", "webController", "", "debounceTime", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Lcom/bbva/cellscore/web/WebController;JLkotlinx/coroutines/CoroutineScope;)V", "Companion", "cells-bridge_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWebNavigateDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebNavigateDispatcher.kt\ncom/bbva/bridge/navigate/WebNavigateDispatcher\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,99:1\n237#2:100\n239#2:102\n106#3:101\n106#3:105\n106#3:110\n20#4:103\n22#4:107\n20#4:108\n22#4:112\n50#5:104\n55#5:106\n50#5:109\n55#5:111\n*S KotlinDebug\n*F\n+ 1 WebNavigateDispatcher.kt\ncom/bbva/bridge/navigate/WebNavigateDispatcher\n*L\n50#1:100\n50#1:102\n50#1:101\n69#1:105\n75#1:110\n69#1:103\n69#1:107\n75#1:108\n75#1:112\n69#1:104\n69#1:106\n75#1:109\n75#1:111\n*E\n"})
public final class WebNavigateDispatcher implements NavigateDispatcher, WebAwareComponent {
    public static final long DEFAULT_DEBOUNCE = 300;
    public static final int ONE = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WebController f26616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f26618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<WebState> f26619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<String> f26620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f26621f;

    /* JADX INFO: compiled from: WebNavigateDispatcher.kt */
    @DebugMetadata(c = "com.bbva.bridge.navigate.WebNavigateDispatcher$navigate$2", f = "WebNavigateDispatcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<Object[], Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f26623q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Object f26624r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object obj, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f26623q0 = str;
            this.f26624r0 = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WebNavigateDispatcher.this.new a(this.f26623q0, this.f26624r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object[] objArr, Continuation<? super Unit> continuation) {
            return ((a) create(objArr, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            WebNavigateDispatcher webNavigateDispatcher = WebNavigateDispatcher.this;
            webNavigateDispatcher.f26616a.syncChannels();
            webNavigateDispatcher.f26616a.navigateTo(this.f26623q0, this.f26624r0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: WebNavigateDispatcher.kt */
    @DebugMetadata(c = "com.bbva.bridge.navigate.WebNavigateDispatcher$navigate$3", f = "WebNavigateDispatcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<Object[], Continuation<? super Flow<? extends WebNavigationState>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f26625p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WebNavigateDispatcher f26626q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f26627r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, WebNavigateDispatcher webNavigateDispatcher, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f26625p0 = z10;
            this.f26626q0 = webNavigateDispatcher;
            this.f26627r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f26625p0, this.f26626q0, this.f26627r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object[] objArr, Continuation<? super Flow<? extends WebNavigationState>> continuation) {
            return ((b) create(objArr, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            boolean z10 = this.f26625p0;
            String str = this.f26627r0;
            return z10 ? WebNavigateDispatcher.access$navigationFlow(this.f26626q0, str) : FlowKt.flowOf(new WebNavigationState.Loaded(str));
        }
    }

    /* JADX INFO: compiled from: WebNavigateDispatcher.kt */
    @DebugMetadata(c = "com.bbva.bridge.navigate.WebNavigateDispatcher$navigate$4", f = "WebNavigateDispatcher.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<FlowCollector<? super WebNavigationState>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f26628p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f26629q0;

        public c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(2, continuation);
            cVar.f26629q0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super WebNavigationState> flowCollector, Continuation<? super Unit> continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f26628p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.f26629q0;
                WebNavigationState.Loading loading = WebNavigationState.Loading.INSTANCE;
                this.f26628p0 = 1;
                if (flowCollector.emit(loading, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: WebNavigateDispatcher.kt */
    @DebugMetadata(c = "com.bbva.bridge.navigate.WebNavigateDispatcher$onPageLoaded$1", f = "WebNavigateDispatcher.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f26630p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f26632r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f26632r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WebNavigateDispatcher.this.new d(this.f26632r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f26630p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = WebNavigateDispatcher.this.f26620e;
                this.f26630p0 = 1;
                if (mutableSharedFlow.emit(this.f26632r0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: WebNavigateDispatcher.kt */
    @DebugMetadata(c = "com.bbva.bridge.navigate.WebNavigateDispatcher$onWebReady$1", f = "WebNavigateDispatcher.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f26633p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ WebState f26635r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(WebState webState, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f26635r0 = webState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WebNavigateDispatcher.this.new e(this.f26635r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f26633p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = WebNavigateDispatcher.this.f26619d;
                this.f26633p0 = 1;
                if (mutableSharedFlow.emit(this.f26635r0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public WebNavigateDispatcher(@NotNull WebController webController, long j10, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(webController, "webController");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f26616a = webController;
        this.f26617b = j10;
        this.f26618c = scope;
        this.f26619d = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f26620e = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f26621f = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
    }

    public static final Flow access$navigationFlow(WebNavigateDispatcher webNavigateDispatcher, final String str) {
        final MutableSharedFlow<String> mutableSharedFlow = webNavigateDispatcher.f26620e;
        return FlowKt.transformWhile(new Flow<String>() { // from class: com.bbva.bridge.navigate.WebNavigateDispatcher$navigationFlow$$inlined$filter$1

            /* JADX INFO: renamed from: com.bbva.bridge.navigate.WebNavigateDispatcher$navigationFlow$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WebNavigateDispatcher.kt\ncom/bbva/bridge/navigate/WebNavigateDispatcher\n*L\n1#1,222:1\n21#2:223\n22#2:225\n75#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f26643p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ String f26644q0;

                /* JADX INFO: renamed from: com.bbva.bridge.navigate.WebNavigateDispatcher$navigationFlow$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.bbva.bridge.navigate.WebNavigateDispatcher$navigationFlow$$inlined$filter$1$2", f = "WebNavigateDispatcher.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public /* synthetic */ Object f26645p0;

                    /* JADX INFO: renamed from: q0, reason: collision with root package name */
                    public int f26646q0;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f26645p0 = obj;
                        this.f26646q0 |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, String str) {
                    this.f26643p0 = flowCollector;
                    this.f26644q0 = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i10 = anonymousClass1.f26646q0;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f26646q0 = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.f26645p0;
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i11 = anonymousClass1.f26646q0;
                    if (i11 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        if (Intrinsics.areEqual((String) obj, this.f26644q0)) {
                            anonymousClass1.f26646q0 = 1;
                            if (this.f26643p0.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super String> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = mutableSharedFlow.collect(new AnonymousClass2(flowCollector, str), continuation);
                return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new com.bbva.bridge.navigate.a(str, null));
    }

    @Override // com.bbva.bridge.navigate.NavigateDispatcher
    @NotNull
    public Flow<WebNavigationState> navigate(@NotNull String route, boolean awaitPageLoaded, @Nullable Object payload) {
        Intrinsics.checkNotNullParameter(route, "route");
        final MutableSharedFlow<WebState> mutableSharedFlow = this.f26619d;
        final Flow[] flowArr = {FlowKt.take(new Flow<WebState>() { // from class: com.bbva.bridge.navigate.WebNavigateDispatcher$webReadyFlow$$inlined$filter$1

            /* JADX INFO: renamed from: com.bbva.bridge.navigate.WebNavigateDispatcher$webReadyFlow$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WebNavigateDispatcher.kt\ncom/bbva/bridge/navigate/WebNavigateDispatcher\n*L\n1#1,222:1\n21#2:223\n22#2:225\n69#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f26649p0;

                /* JADX INFO: renamed from: com.bbva.bridge.navigate.WebNavigateDispatcher$webReadyFlow$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.bbva.bridge.navigate.WebNavigateDispatcher$webReadyFlow$$inlined$filter$1$2", f = "WebNavigateDispatcher.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public /* synthetic */ Object f26650p0;

                    /* JADX INFO: renamed from: q0, reason: collision with root package name */
                    public int f26651q0;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f26650p0 = obj;
                        this.f26651q0 |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f26649p0 = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i10 = anonymousClass1.f26651q0;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f26651q0 = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.f26650p0;
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i11 = anonymousClass1.f26651q0;
                    if (i11 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        if (((WebState) obj) == WebState.READY) {
                            anonymousClass1.f26651q0 = 1;
                            if (this.f26649p0.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super WebState> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = mutableSharedFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, 1), FlowKt.distinctUntilChanged(this.f26621f)};
        return FlowKt.debounce(FlowKt.onStart(FlowKt.flatMapConcat(FlowKt.onEach(new Flow<Object[]>() { // from class: com.bbva.bridge.navigate.WebNavigateDispatcher$navigate$$inlined$combine$1

            /* JADX INFO: renamed from: com.bbva.bridge.navigate.WebNavigateDispatcher$navigate$$inlined$combine$1$3, reason: invalid class name */
            /* JADX INFO: compiled from: Zip.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.bbva.bridge.navigate.WebNavigateDispatcher$navigate$$inlined$combine$1$3", f = "WebNavigateDispatcher.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$2\n+ 2 WebNavigateDispatcher.kt\ncom/bbva/bridge/navigate/WebNavigateDispatcher\n*L\n1#1,332:1\n51#2:333\n*E\n"})
            public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super Object[]>, Object[], Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public int f26638p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public /* synthetic */ FlowCollector f26639q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public /* synthetic */ Object[] f26640r0;

                public AnonymousClass3(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f26638p0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.f26639q0;
                        Object[] objArr = this.f26640r0;
                        this.f26638p0 = 1;
                        if (flowCollector.emit(objArr, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function3
                @Nullable
                public final Object invoke(@NotNull FlowCollector<? super Object[]> flowCollector, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                    anonymousClass3.f26639q0 = flowCollector;
                    anonymousClass3.f26640r0 = objArr;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Object[]> flowCollector, @NotNull Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr2, new Function0<Object[]>() { // from class: com.bbva.bridge.navigate.WebNavigateDispatcher$navigate$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final Object[] invoke() {
                        return new Object[flowArr2.length];
                    }
                }, new AnonymousClass3(null), continuation);
                return objCombineInternal == ek.a.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }
        }, new a(route, payload, null)), new b(awaitPageLoaded, this, route, null)), new c(2, null)), this.f26617b);
    }

    @Override // com.bbva.bridge.WebAwareComponent
    public void onPageLoaded(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        BuildersKt__Builders_commonKt.launch$default(this.f26618c, null, null, new d(route, null), 3, null);
    }

    @Override // com.bbva.bridge.WebAwareComponent
    public void onWebReady(@NotNull WebState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        BuildersKt__Builders_commonKt.launch$default(this.f26618c, null, null, new e(state, null), 3, null);
    }

    @Nullable
    public final Object setPageLoadingReady(@NotNull Continuation<? super Unit> continuation) {
        Unit unit = Unit.INSTANCE;
        Object objEmit = this.f26621f.emit(unit, continuation);
        return objEmit == ek.a.getCOROUTINE_SUSPENDED() ? objEmit : unit;
    }

    public /* synthetic */ WebNavigateDispatcher(WebController webController, long j10, CoroutineScope coroutineScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(webController, (i10 & 2) != 0 ? 300L : j10, (i10 & 4) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()) : coroutineScope);
    }
}
