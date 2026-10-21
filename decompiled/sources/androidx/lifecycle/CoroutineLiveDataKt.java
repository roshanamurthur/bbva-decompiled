package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import java.time.Duration;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aZ\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\\\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0012\u001a,\u0010\u0013\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0080@¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000*`\b\u0000\u0010\u0018\u001a\u0004\b\u0000\u0010\u0004\")\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n¢\u0006\u0002\b\u000f2)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n¢\u0006\u0002\b\u000f¨\u0006\u0019"}, d2 = {"DEFAULT_TIMEOUT", "", "liveData", "Landroidx/lifecycle/LiveData;", ExifInterface.GPS_DIRECTION_TRUE, "timeout", "Ljava/time/Duration;", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/time/Duration;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Landroidx/lifecycle/LiveData;", "timeoutInMs", "(Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;)Landroidx/lifecycle/LiveData;", "addDisposableSource", "Landroidx/lifecycle/EmittedSource;", "Landroidx/lifecycle/MediatorLiveData;", "source", "(Landroidx/lifecycle/MediatorLiveData;Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Block", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000;

    /* JADX INFO: compiled from: CoroutineLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EmittedSource>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MediatorLiveData<T> f21841p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LiveData<T> f21842q0;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: androidx.lifecycle.CoroutineLiveDataKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CoroutineLiveData.kt */
        public static final class C0085a<T> extends Lambda implements Function1<T, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ MediatorLiveData<T> f21843p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0085a(MediatorLiveData<T> mediatorLiveData) {
                super(1);
                this.f21843p0 = mediatorLiveData;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Object obj) {
                this.f21843p0.setValue(obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f21841p0 = mediatorLiveData;
            this.f21842q0 = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f21841p0, this.f21842q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EmittedSource> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MediatorLiveData<T> mediatorLiveData = this.f21841p0;
            b bVar = new b(new C0085a(mediatorLiveData));
            LiveData<T> liveData = this.f21842q0;
            mediatorLiveData.addSource(liveData, bVar);
            return new EmittedSource(liveData, mediatorLiveData);
        }
    }

    /* JADX INFO: compiled from: CoroutineLiveData.kt */
    public static final class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f21844a;

        public b(a.C0085a function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f21844a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f21844a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f21844a;
        }

        public final int hashCode() {
            return this.f21844a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f21844a.invoke(obj);
        }
    }

    @Nullable
    public static final <T> Object addDisposableSource(@NotNull MediatorLiveData<T> mediatorLiveData, @NotNull LiveData<T> liveData, @NotNull Continuation<? super EmittedSource> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new a(mediatorLiveData, liveData, null), continuation);
    }

    @JvmOverloads
    @RequiresApi(26)
    @NotNull
    public static final <T> LiveData<T> liveData(@NotNull Duration timeout, @NotNull Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(block, "block");
        return liveData$default(timeout, (CoroutineContext) null, block, 2, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(CoroutineContext coroutineContext, long j10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            j10 = 5000;
        }
        return liveData(coroutineContext, j10, function2);
    }

    @JvmOverloads
    @NotNull
    public static final <T> LiveData<T> liveData(@NotNull CoroutineContext context, @NotNull Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return liveData$default(context, 0L, block, 2, (Object) null);
    }

    @JvmOverloads
    @NotNull
    public static final <T> LiveData<T> liveData(@NotNull Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return liveData$default((CoroutineContext) null, 0L, block, 3, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(Duration duration, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return liveData(duration, coroutineContext, function2);
    }

    @JvmOverloads
    @NotNull
    public static final <T> LiveData<T> liveData(@NotNull CoroutineContext context, long j10, @NotNull Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return new CoroutineLiveData(context, j10, block);
    }

    @JvmOverloads
    @RequiresApi(26)
    @NotNull
    public static final <T> LiveData<T> liveData(@NotNull Duration timeout, @NotNull CoroutineContext context, @NotNull Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return new CoroutineLiveData(context, Api26Impl.INSTANCE.toMillis(timeout), block);
    }
}
