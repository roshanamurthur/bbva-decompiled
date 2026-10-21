package com.bbva.component.dm.singlesignon;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.componentkit.ActionSpec;
import com.bbva.cells.componentkit.JsonDeserializer;
import com.bbva.cells.componentkit.ViewModel;
import com.bbva.cells.componentkit.model.FetchResult;
import com.bbva.cells.componentkit.usecase.UseCase;
import com.bbva.component.dm.singlesignon.data.model.SingleSignOnBody;
import com.bbva.component.dm.singlesignon.data.model.SingleSignOnRequest;
import com.bbva.component.dm.singlesignon.di.SingleSignOnUseCaseFactory;
import com.bbva.component.dm.singlesignon.mapper.SSOContentMapper;
import com.bbva.component.dm.singlesignon.model.SSOConfiguration;
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

/* JADX INFO: compiled from: SingleSignOnDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0019*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0019B\u001d\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J!\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR)\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u000b8\u0006¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/bbva/component/dm/singlesignon/SingleSignOnDataManager;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/cells/componentkit/ViewModel;", "Lcom/bbva/component/dm/singlesignon/model/SSOConfiguration;", "", "aapTarget", "", FetchCommand.ID, "Lcom/bbva/cells/componentkit/model/FetchResult;", "get", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "w0", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "getData$annotations", "()V", "data", "Lcom/bbva/network/NetworkWorker;", "worker", "Lcom/bbva/component/dm/singlesignon/mapper/SSOContentMapper;", "mapper", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bbva/component/dm/singlesignon/mapper/SSOContentMapper;)V", "Companion", "component-dm-singlesignon_release"}, k = 1, mv = {1, 8, 0})
public final class SingleSignOnDataManager<T> extends ViewModel<SSOConfiguration> {

    @NotNull
    public static final String ID = "component-dm-singlesignon";

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<FetchResult<T>> data;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f28052x0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<FetchResult<?>> f28050y0 = new ActionSpec<>("on-sso-content-fetched");

    /* JADX INFO: compiled from: SingleSignOnDataManager.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/bbva/component/dm/singlesignon/SingleSignOnDataManager$Companion;", "", "()V", "ID", "", "onContentFragment", "Lcom/bbva/cells/componentkit/ActionSpec;", "Lcom/bbva/cells/componentkit/model/FetchResult;", "getOnContentFragment", "()Lcom/bbva/cells/componentkit/ActionSpec;", "component-dm-singlesignon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<FetchResult<?>> getOnContentFragment() {
            return SingleSignOnDataManager.f28050y0;
        }
    }

    /* JADX INFO: compiled from: SingleSignOnDataManager.kt */
    @DebugMetadata(c = "com.bbva.component.dm.singlesignon.SingleSignOnDataManager$fetch$1", f = "SingleSignOnDataManager.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SingleSignOnDataManager f28053p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ActionSpec f28054q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f28055r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ SingleSignOnDataManager<T> f28056s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f28057t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SingleSignOnDataManager<T> singleSignOnDataManager, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f28056s0 = singleSignOnDataManager;
            this.f28057t0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f28056s0, this.f28057t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SingleSignOnDataManager<T> singleSignOnDataManager;
            ActionSpec<FetchResult<?>> actionSpec;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f28055r0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ActionSpec<FetchResult<?>> onContentFragment = SingleSignOnDataManager.INSTANCE.getOnContentFragment();
                singleSignOnDataManager = this.f28056s0;
                UseCase useCaseAccess$getUseCase = SingleSignOnDataManager.access$getUseCase(singleSignOnDataManager);
                SingleSignOnRequest singleSignOnRequestA = singleSignOnDataManager.a(this.f28057t0);
                this.f28053p0 = singleSignOnDataManager;
                this.f28054q0 = onContentFragment;
                this.f28055r0 = 1;
                Object objFetch = useCaseAccess$getUseCase.fetch(singleSignOnRequestA, this);
                if (objFetch == coroutine_suspended) {
                    return coroutine_suspended;
                }
                actionSpec = onContentFragment;
                obj = objFetch;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                actionSpec = this.f28054q0;
                singleSignOnDataManager = this.f28053p0;
                ResultKt.throwOnFailure(obj);
            }
            singleSignOnDataManager.fire(actionSpec, obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SingleSignOnDataManager.kt */
    public static final class b extends Lambda implements Function0<UseCase<? super SingleSignOnRequest, T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ NetworkWorker f28058p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SSOContentMapper<T> f28059q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(NetworkWorker networkWorker, SSOContentMapper<? extends T> sSOContentMapper) {
            super(0);
            this.f28058p0 = networkWorker;
            this.f28059q0 = sSOContentMapper;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SingleSignOnUseCaseFactory.INSTANCE.inject(this.f28058p0, this.f28059q0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleSignOnDataManager(@NotNull NetworkWorker worker, @NotNull SSOContentMapper<? extends T> mapper) {
        super(new JsonDeserializer(SSOConfiguration.INSTANCE.serializer()));
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Flow<FetchResult<T>> flow = (Flow<FetchResult<T>>) events(f28050y0);
        Intrinsics.checkNotNull(flow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<com.bbva.cells.componentkit.model.FetchResult<T of com.bbva.component.dm.singlesignon.SingleSignOnDataManager>>");
        this.data = flow;
        this.f28052x0 = LazyKt__LazyJVMKt.lazy(new b(worker, mapper));
    }

    public static final UseCase access$getUseCase(SingleSignOnDataManager singleSignOnDataManager) {
        return (UseCase) singleSignOnDataManager.f28052x0.getValue();
    }

    public final SingleSignOnRequest a(String str) {
        SSOConfiguration sSOConfiguration = (SSOConfiguration) getModel();
        String host = sSOConfiguration != null ? sSOConfiguration.getHost() : null;
        if (host == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        SSOConfiguration sSOConfiguration2 = (SSOConfiguration) getModel();
        String path = sSOConfiguration2 != null ? sSOConfiguration2.getPath() : null;
        if (path != null) {
            return new SingleSignOnRequest(host, path, new SingleSignOnBody(str));
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void fetch(@NotNull String aapTarget) {
        Intrinsics.checkNotNullParameter(aapTarget, "aapTarget");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(this, aapTarget, null), 3, null);
    }

    @Nullable
    public final Object get(@NotNull String str, @NotNull Continuation<? super FetchResult<T>> continuation) {
        return ((UseCase) this.f28052x0.getValue()).fetch(a(str), continuation);
    }

    @NotNull
    public final Flow<FetchResult<T>> getData() {
        return this.data;
    }

    public static /* synthetic */ void getData$annotations() {
    }
}
