package com.bbva.cells.componentkit;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.componentkit.dispatcher.IODispatcherKt;
import com.bbva.cells.componentkit.dispatcher.UIDispatcherKt;
import com.bbva.cells.componentkit.model.Flag;
import ek.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0004\b-\u0010.J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\rJ\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u001a\u0010\u0014\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u0012J#\u0010\u0017\u001a\u00020\n\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00028\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0013J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0015\u001a\u00020\bH\u0004J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0015\u001a\u00020\bH\u0004J/\u0010\u001d\u001a\u00020\n\"\u0004\b\u0001\u0010\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00018\u0001H\u0004¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\f\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\rR\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006/"}, d2 = {"Lcom/bbva/cells/componentkit/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", ExifInterface.LONGITUDE_EAST, "Lcom/bbva/cells/componentkit/ActionSpec;", "spec", "Lkotlinx/coroutines/flow/Flow;", "events", "", "raw", "", "updateModel", "model", "(Ljava/lang/Object;)V", "", "Lcom/bbva/cells/componentkit/model/Flag;", "flags", "updateFlags", "", "Lcom/bbva/cells/componentkit/FlagState;", "applyFlags", "key", "value", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", "setFlag", "property", "flag", "actionSpec", "fire", "(Lcom/bbva/cells/componentkit/ActionSpec;Ljava/lang/Object;)V", "v0", "Ljava/lang/Object;", "getModel", "()Ljava/lang/Object;", "setModel", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getOnModel", "()Lkotlinx/coroutines/flow/Flow;", "onModel", "Lcom/bbva/cells/componentkit/Deserializer;", "deserializer", "<init>", "(Lcom/bbva/cells/componentkit/Deserializer;)V", "componentkit_release"}, k = 1, mv = {1, 6, 0})
public abstract class ViewModel<T> implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Deserializer<T> f26711p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f26712q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f26713r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f26714s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Channel<T> f26715t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final ArrayList f26716u0;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @Nullable
    public T model;

    /* JADX INFO: compiled from: ViewModel.kt */
    @DebugMetadata(c = "com.bbva.cells.componentkit.ViewModel$fire$1", f = "ViewModel.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f26717p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ViewModel<T> f26718q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ActionSpec<E> f26719r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ E f26720s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModel<T> viewModel, ActionSpec<E> actionSpec, E e5, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f26718q0 = viewModel;
            this.f26719r0 = actionSpec;
            this.f26720s0 = e5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f26718q0, this.f26719r0, this.f26720s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f26717p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Map map = this.f26718q0.f26714s0;
                ActionSpec<E> actionSpec = this.f26719r0;
                String id = actionSpec.getId();
                Object objChannel$default = map.get(id);
                if (objChannel$default == null) {
                    objChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
                    map.put(id, objChannel$default);
                }
                Pair pair = new Pair(actionSpec, this.f26720s0);
                this.f26717p0 = 1;
                if (((Channel) objChannel$default).send(pair, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: ViewModel.kt */
    @DebugMetadata(c = "com.bbva.cells.componentkit.ViewModel$setFlag$1", f = "ViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f26721p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ViewModel<T> f26722q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f26723r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ FlagState f26724s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewModel<T> viewModel, String str, FlagState flagState, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f26722q0 = viewModel;
            this.f26723r0 = str;
            this.f26724s0 = flagState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f26722q0, this.f26723r0, this.f26724s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f26721p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) this.f26722q0.f26713r0.get(this.f26723r0);
                if (channel != null) {
                    this.f26721p0 = 1;
                    if (channel.send(this.f26724s0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: compiled from: ViewModel.kt */
    @DebugMetadata(c = "com.bbva.cells.componentkit.ViewModel$setProperty$1", f = "ViewModel.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f26725p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ViewModel<T> f26726q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f26727r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ T f26728s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ViewModel<T> viewModel, String str, T t10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f26726q0 = viewModel;
            this.f26727r0 = str;
            this.f26728s0 = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.f26726q0, this.f26727r0, this.f26728s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f26725p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.f26726q0.f26712q0.get(this.f26727r0);
                Channel channel = obj2 instanceof Channel ? (Channel) obj2 : null;
                if (channel != null) {
                    this.f26725p0 = 1;
                    if (channel.send(this.f26728s0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: compiled from: ViewModel.kt */
    @DebugMetadata(c = "com.bbva.cells.componentkit.ViewModel$updateModel$1", f = "ViewModel.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f26729p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ViewModel<T> f26730q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f26731r0;

        /* JADX INFO: compiled from: ViewModel.kt */
        @DebugMetadata(c = "com.bbva.cells.componentkit.ViewModel$updateModel$1$newModel$1", f = "ViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ ViewModel<T> f26732p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ String f26733q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewModel<T> viewModel, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f26732p0 = viewModel;
                this.f26733q0 = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f26732p0, this.f26733q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Object obj) {
                return ((a) create(coroutineScope, (Continuation) obj)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return this.f26732p0.f26711p0.deserialize(this.f26733q0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ViewModel<T> viewModel, String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f26730q0 = viewModel;
            this.f26731r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.f26730q0, this.f26731r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f26729p0;
            ViewModel<T> viewModel = this.f26730q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher ioDispatcher = IODispatcherKt.getIoDispatcher();
                a aVar = new a(viewModel, this.f26731r0, null);
                this.f26729p0 = 1;
                obj = BuildersKt.withContext(ioDispatcher, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            viewModel.updateModel((T) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ViewModel.kt */
    @DebugMetadata(c = "com.bbva.cells.componentkit.ViewModel$updateModel$2", f = "ViewModel.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f26734p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ViewModel<T> f26735q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ T f26736r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ViewModel<T> viewModel, T t10, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f26735q0 = viewModel;
            this.f26736r0 = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.f26735q0, this.f26736r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f26734p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = this.f26735q0.f26715t0;
                this.f26734p0 = 1;
                if (channel.send(this.f26736r0, this) == coroutine_suspended) {
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

    public ViewModel(@NotNull Deserializer<T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f26711p0 = deserializer;
        this.f26712q0 = new LinkedHashMap();
        this.f26713r0 = new LinkedHashMap();
        this.f26714s0 = new LinkedHashMap();
        this.f26715t0 = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f26716u0 = new ArrayList();
    }

    public static /* synthetic */ void fire$default(ViewModel viewModel, ActionSpec actionSpec, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fire");
        }
        if ((i10 & 2) != 0) {
            obj = null;
        }
        viewModel.fire(actionSpec, obj);
    }

    public final void applyFlags(@NotNull Map<String, ? extends FlagState> flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        for (Flag flag : this.f26716u0) {
            FlagState flagState = flags.get(flag.getAppId());
            if (flagState == null) {
                flagState = flag.getDefault();
            }
            setFlag(flag.getId(), flagState);
        }
    }

    @NotNull
    public final <E> Flow<E> events(@NotNull ActionSpec<E> spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        LinkedHashMap linkedHashMap = this.f26714s0;
        String id = spec.getId();
        Object objChannel$default = linkedHashMap.get(id);
        if (objChannel$default == null) {
            objChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
            linkedHashMap.put(id, objChannel$default);
        }
        final Flow flowReceiveAsFlow = FlowKt.receiveAsFlow((ReceiveChannel) objChannel$default);
        return (Flow<E>) new Flow<Object>() { // from class: com.bbva.cells.componentkit.ViewModel$events$$inlined$map$1

            /* JADX INFO: renamed from: com.bbva.cells.componentkit.ViewModel$events$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 6, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector, SuspendFunction {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f26738p0;

                /* JADX INFO: renamed from: com.bbva.cells.componentkit.ViewModel$events$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "com.bbva.cells.componentkit.ViewModel$events$$inlined$map$1$2", f = "ViewModel.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public /* synthetic */ Object f26739p0;

                    /* JADX INFO: renamed from: q0, reason: collision with root package name */
                    public int f26740q0;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f26739p0 = obj;
                        this.f26740q0 |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f26738p0 = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i10 = anonymousClass1.f26740q0;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f26740q0 = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.f26739p0;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i11 = anonymousClass1.f26740q0;
                    if (i11 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        Object second = ((Pair) obj).getSecond();
                        anonymousClass1.f26740q0 = 1;
                        if (this.f26738p0.emit(second, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
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
            public Object collect(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowReceiveAsFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final <E> void fire(@NotNull ActionSpec<E> actionSpec, @Nullable E value) {
        Intrinsics.checkNotNullParameter(actionSpec, "actionSpec");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(this, actionSpec, value, null), 3, null);
    }

    @NotNull
    public final Flow<FlagState> flag(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = this.f26713r0;
        Object objChannel$default = linkedHashMap.get(key);
        if (objChannel$default == null) {
            objChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
            linkedHashMap.put(key, objChannel$default);
        }
        return FlowKt.consumeAsFlow((ReceiveChannel) objChannel$default);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return UIDispatcherKt.getUiDispatcher();
    }

    @Nullable
    public final T getModel() {
        return this.model;
    }

    @NotNull
    public final Flow<T> getOnModel() {
        return FlowKt.consumeAsFlow(this.f26715t0);
    }

    @NotNull
    public final <T> Flow<T> property(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = this.f26712q0;
        Object objChannel$default = linkedHashMap.get(key);
        if (objChannel$default == null) {
            objChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
            linkedHashMap.put(key, objChannel$default);
        }
        return FlowKt.consumeAsFlow((ReceiveChannel) objChannel$default);
    }

    public final void setFlag(@NotNull String key, @NotNull FlagState value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(this, key, value, null), 3, null);
    }

    public final void setModel(@Nullable T t10) {
        this.model = t10;
    }

    public final <T> void setProperty(@NotNull String key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(this, key, value, null), 3, null);
    }

    public final void updateFlags(@NotNull List<Flag> flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        ArrayList arrayList = this.f26716u0;
        arrayList.clear();
        arrayList.addAll(flags);
    }

    public final void updateModel(@NotNull String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new d(this, raw, null), 3, null);
    }

    public final void updateModel(T model) {
        this.model = model;
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new e(this, model, null), 3, null);
    }
}
