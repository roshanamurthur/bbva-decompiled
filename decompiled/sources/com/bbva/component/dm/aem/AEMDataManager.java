package com.bbva.component.dm.aem;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.componentkit.ActionSpec;
import com.bbva.cells.componentkit.JsonDeserializer;
import com.bbva.cells.componentkit.ViewModel;
import com.bbva.cells.componentkit.model.FetchResult;
import com.bbva.cells.componentkit.usecase.UseCase;
import com.bbva.component.dm.aem.data.model.AEMRequest;
import com.bbva.component.dm.aem.di.AEMDependencies;
import com.bbva.component.dm.aem.mapper.AEMContentMapper;
import com.bbva.component.dm.aem.model.AEMConfiguration;
import com.bbva.network.NetworkWorker;
import com.bbva.plugin.filefetcher.command.FetchCommand;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AEMDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0019*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0019B\u001d\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J!\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR)\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u000b8\u0006¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/bbva/component/dm/aem/AEMDataManager;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/cells/componentkit/ViewModel;", "Lcom/bbva/component/dm/aem/model/AEMConfiguration;", "", "path", "", FetchCommand.ID, "Lcom/bbva/cells/componentkit/model/FetchResult;", "get", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "w0", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "getData$annotations", "()V", "data", "Lcom/bbva/network/NetworkWorker;", "worker", "Lcom/bbva/component/dm/aem/mapper/AEMContentMapper;", "mapper", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bbva/component/dm/aem/mapper/AEMContentMapper;)V", "Companion", "component-dm-aem_release"}, k = 1, mv = {1, 5, 1})
public final class AEMDataManager<T> extends ViewModel<AEMConfiguration> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<FetchResult<?>> f27366y0 = new ActionSpec<>("on-aem-content-fetched");

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<FetchResult<T>> data;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f27368x0;

    /* JADX INFO: compiled from: AEMDataManager.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/dm/aem/AEMDataManager$Companion;", "", "()V", "onContentFragment", "Lcom/bbva/cells/componentkit/ActionSpec;", "Lcom/bbva/cells/componentkit/model/FetchResult;", "getOnContentFragment", "()Lcom/bbva/cells/componentkit/ActionSpec;", "component-dm-aem_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<FetchResult<?>> getOnContentFragment() {
            return AEMDataManager.f27366y0;
        }
    }

    /* JADX INFO: compiled from: AEMDataManager.kt */
    @DebugMetadata(c = "com.bbva.component.dm.aem.AEMDataManager$fetch$1", f = "AEMDataManager.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AEMDataManager f27369p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ActionSpec f27370q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f27371r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ AEMDataManager<T> f27372s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f27373t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AEMDataManager<T> aEMDataManager, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f27372s0 = aEMDataManager;
            this.f27373t0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f27372s0, this.f27373t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AEMDataManager<T> aEMDataManager;
            ActionSpec<FetchResult<?>> actionSpec;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f27371r0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ActionSpec<FetchResult<?>> onContentFragment = AEMDataManager.INSTANCE.getOnContentFragment();
                aEMDataManager = this.f27372s0;
                UseCase useCaseAccess$getUseCase = AEMDataManager.access$getUseCase(aEMDataManager);
                AEMRequest aEMRequestA = aEMDataManager.a(this.f27373t0);
                this.f27369p0 = aEMDataManager;
                this.f27370q0 = onContentFragment;
                this.f27371r0 = 1;
                Object objFetch = useCaseAccess$getUseCase.fetch(aEMRequestA, this);
                if (objFetch == coroutine_suspended) {
                    return coroutine_suspended;
                }
                actionSpec = onContentFragment;
                obj = objFetch;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                actionSpec = this.f27370q0;
                aEMDataManager = this.f27369p0;
                ResultKt.throwOnFailure(obj);
            }
            aEMDataManager.fire(actionSpec, obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AEMDataManager.kt */
    public static final class b extends Lambda implements Function0<UseCase<? super AEMRequest, T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ NetworkWorker f27374p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AEMContentMapper<T> f27375q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(NetworkWorker networkWorker, AEMContentMapper<? extends T> aEMContentMapper) {
            super(0);
            this.f27374p0 = networkWorker;
            this.f27375q0 = aEMContentMapper;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AEMDependencies.INSTANCE.inject(this.f27374p0, this.f27375q0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AEMDataManager(@NotNull NetworkWorker worker, @NotNull AEMContentMapper<? extends T> mapper) {
        super(new JsonDeserializer(AEMConfiguration.INSTANCE.serializer()));
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.data = (Flow<FetchResult<T>>) events(f27366y0);
        this.f27368x0 = LazyKt__LazyJVMKt.lazy(new b(worker, mapper));
    }

    public static final UseCase access$getUseCase(AEMDataManager aEMDataManager) {
        return (UseCase) aEMDataManager.f27368x0.getValue();
    }

    public final AEMRequest a(String str) {
        AEMConfiguration aEMConfiguration = (AEMConfiguration) getModel();
        String host = aEMConfiguration == null ? null : aEMConfiguration.getHost();
        if (host != null) {
            return new AEMRequest(host, str);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void fetch(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(this, path, null), 3, null);
    }

    @Nullable
    public final Object get(@NotNull String str, @NotNull Continuation<? super FetchResult<T>> continuation) {
        return ((UseCase) this.f27368x0.getValue()).fetch(a(str), continuation);
    }

    @NotNull
    public final Flow<FetchResult<T>> getData() {
        return this.data;
    }

    public static /* synthetic */ void getData$annotations() {
    }
}
