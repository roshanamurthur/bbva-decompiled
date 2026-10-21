package com.bbva.plugin.wearables.info.library.usecase;

import android.content.Context;
import com.bbva.glomoutils.mobileservices.MobileServices;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.plugin.wearables.info.library.delegates.ConnectedNodesInfo;
import com.bbva.plugin.wearables.info.library.delegates.NodesDelegate;
import com.google.android.gms.wearable.Node;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IsDevicePairedUserCase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086Bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/wearables/info/library/usecase/IsDevicePairedUserCase;", "", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Lcom/bbva/plugin/wearables/info/library/delegates/ConnectedNodesInfo;", "nodesDelegate", "Lcom/bbva/glomoutils/mobileservices/MobileServices;", "mobileServices", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchersProvider", "<init>", "(Landroid/content/Context;Lcom/bbva/plugin/wearables/info/library/delegates/ConnectedNodesInfo;Lcom/bbva/glomoutils/mobileservices/MobileServices;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "plugin-wearables-info_release"}, k = 1, mv = {1, 9, 0})
public final class IsDevicePairedUserCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ConnectedNodesInfo f36078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MobileServices f36079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f36080c;

    /* JADX INFO: compiled from: IsDevicePairedUserCase.kt */
    @DebugMetadata(c = "com.bbva.plugin.wearables.info.library.usecase.IsDevicePairedUserCase$invoke$2", f = "IsDevicePairedUserCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return IsDevicePairedUserCase.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<Node> connectedNodes;
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IsDevicePairedUserCase isDevicePairedUserCase = IsDevicePairedUserCase.this;
            boolean z10 = false;
            if (isDevicePairedUserCase.f36079b.getIsGoogle() && (connectedNodes = isDevicePairedUserCase.f36078a.getConnectedNodes()) != null && (!connectedNodes.isEmpty())) {
                z10 = true;
            }
            return Boxing.boxBoolean(z10);
        }
    }

    public IsDevicePairedUserCase(@NotNull Context context, @NotNull ConnectedNodesInfo nodesDelegate, @NotNull MobileServices mobileServices, @NotNull ThreadDispatchers dispatchersProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nodesDelegate, "nodesDelegate");
        Intrinsics.checkNotNullParameter(mobileServices, "mobileServices");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        this.f36078a = nodesDelegate;
        this.f36079b = mobileServices;
        this.f36080c = dispatchersProvider;
    }

    @Nullable
    public final Object invoke(@NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(this.f36080c.mo4923default(), new a(null), continuation);
    }

    public /* synthetic */ IsDevicePairedUserCase(Context context, ConnectedNodesInfo connectedNodesInfo, MobileServices mobileServices, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? new NodesDelegate(context) : connectedNodesInfo, mobileServices, (i10 & 8) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
