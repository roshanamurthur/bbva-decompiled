package com.bbva.glomohybrid.infoscreen.networkerror;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenViewModel;
import com.bbva.networkmonitor.component.NetworkMonitorDataManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/networkerror/NetworkViewModel;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenViewModel;", "", GenerateActivationFormCommand.HASH_CODE, "", "startNetworkMonitor", "Landroidx/lifecycle/MutableLiveData;", "", "p0", "Landroidx/lifecycle/MutableLiveData;", "isNetworkAvailable", "()Landroidx/lifecycle/MutableLiveData;", "setNetworkAvailable", "(Landroidx/lifecycle/MutableLiveData;)V", "<init>", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class NetworkViewModel extends InfoScreenViewModel {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public MutableLiveData<Boolean> isNetworkAvailable = new MutableLiveData<>();

    /* JADX INFO: compiled from: NetworkViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.infoscreen.networkerror.NetworkViewModel$startNetworkMonitor$1", f = "NetworkViewModel.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f32367p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ NetworkMonitorDataManager f32368q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ NetworkViewModel f32369r0;

        /* JADX INFO: renamed from: com.bbva.glomohybrid.infoscreen.networkerror.NetworkViewModel$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NetworkViewModel.kt */
        public static final class C0136a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ NetworkViewModel f32370p0;

            public C0136a(NetworkViewModel networkViewModel) {
                this.f32370p0 = networkViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                this.f32370p0.isNetworkAvailable().setValue(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NetworkMonitorDataManager networkMonitorDataManager, NetworkViewModel networkViewModel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f32368q0 = networkMonitorDataManager;
            this.f32369r0 = networkViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f32368q0, this.f32369r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f32367p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowNetworkMonitor = this.f32368q0.networkMonitor();
                C0136a c0136a = new C0136a(this.f32369r0);
                this.f32367p0 = 1;
                if (flowNetworkMonitor.collect(c0136a, this) == coroutine_suspended) {
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

    @NotNull
    public final MutableLiveData<Boolean> isNetworkAvailable() {
        return this.isNetworkAvailable;
    }

    public final void setNetworkAvailable(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.isNetworkAvailable = mutableLiveData;
    }

    public final void startNetworkMonitor(int hashCode) {
        NetworkMonitorDataManager networkMonitorDataManager = (NetworkMonitorDataManager) ComponentManager.get(hashCode, NetworkMonitorDataManager.ID);
        if (networkMonitorDataManager == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(networkMonitorDataManager, this, null), 3, null);
    }
}
