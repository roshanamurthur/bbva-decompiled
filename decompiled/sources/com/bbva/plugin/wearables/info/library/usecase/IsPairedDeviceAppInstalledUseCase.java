package com.bbva.plugin.wearables.info.library.usecase;

import android.content.Context;
import com.bbva.glomoutils.mobileservices.MobileServices;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.plugin.wearables.info.library.delegates.CapabilitiesDelegate;
import com.bbva.plugin.wearables.info.library.delegates.CapabilitiesInfo;
import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.Node;
import java.util.Set;
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

/* JADX INFO: compiled from: IsPairedDeviceAppInstalledUseCase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086Bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/bbva/plugin/wearables/info/library/usecase/IsPairedDeviceAppInstalledUseCase;", "", "", "capabilityId", "", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Lcom/bbva/plugin/wearables/info/library/delegates/CapabilitiesInfo;", "capabilitiesDelegate", "Lcom/bbva/glomoutils/mobileservices/MobileServices;", "mobileServices", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchersProvider", "<init>", "(Landroid/content/Context;Lcom/bbva/plugin/wearables/info/library/delegates/CapabilitiesInfo;Lcom/bbva/glomoutils/mobileservices/MobileServices;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "plugin-wearables-info_release"}, k = 1, mv = {1, 9, 0})
public final class IsPairedDeviceAppInstalledUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CapabilitiesInfo f36082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MobileServices f36083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f36084c;

    /* JADX INFO: compiled from: IsPairedDeviceAppInstalledUseCase.kt */
    @DebugMetadata(c = "com.bbva.plugin.wearables.info.library.usecase.IsPairedDeviceAppInstalledUseCase$invoke$2", f = "IsPairedDeviceAppInstalledUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f36086q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f36086q0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return IsPairedDeviceAppInstalledUseCase.this.new a(this.f36086q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IsPairedDeviceAppInstalledUseCase isPairedDeviceAppInstalledUseCase = IsPairedDeviceAppInstalledUseCase.this;
            boolean z10 = false;
            if (isPairedDeviceAppInstalledUseCase.f36083b.getIsGoogle()) {
                CapabilityInfo capabilitiesBy = isPairedDeviceAppInstalledUseCase.f36082a.getCapabilitiesBy(this.f36086q0);
                Set<Node> nodes = capabilitiesBy != null ? capabilitiesBy.getNodes() : null;
                if (nodes != null && !nodes.isEmpty()) {
                    z10 = true;
                }
            }
            return Boxing.boxBoolean(z10);
        }
    }

    public IsPairedDeviceAppInstalledUseCase(@NotNull Context context, @NotNull CapabilitiesInfo capabilitiesDelegate, @NotNull MobileServices mobileServices, @NotNull ThreadDispatchers dispatchersProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(capabilitiesDelegate, "capabilitiesDelegate");
        Intrinsics.checkNotNullParameter(mobileServices, "mobileServices");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        this.f36082a = capabilitiesDelegate;
        this.f36083b = mobileServices;
        this.f36084c = dispatchersProvider;
    }

    @Nullable
    public final Object invoke(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(this.f36084c.mo4923default(), new a(str, null), continuation);
    }

    public /* synthetic */ IsPairedDeviceAppInstalledUseCase(Context context, CapabilitiesInfo capabilitiesInfo, MobileServices mobileServices, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? new CapabilitiesDelegate(context) : capabilitiesInfo, mobileServices, (i10 & 8) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
