package com.bbva.network.state;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.image.transform.MonochromeImageTransformer;
import com.bbva.network.ConnectionChecker;
import com.bbva.network.model.ConnectionStatusEvent;
import com.bbva.network.model.ConnectionThreshold;
import com.bbva.network.model.NetworkSpeed;
import com.bbva.network.model.NetworkStatus;
import com.bbva.network.model.NetworkStrength;
import com.bbva.network.model.NetworkType;
import com.bbva.network.model.SpeedThreshold;
import com.bbva.network.model.StrengthThreshold;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkStateEmitter.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/bbva/network/state/NetworkStateEmitter;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lkotlinx/coroutines/CoroutineScope;", "", "delay", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/network/model/ConnectionStatusEvent;", "events", "Landroid/net/Network;", DeepLinkListenerAdapter.Constants.ERROR_NETWORK, "", "onAvailable", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "onLost", "Lcom/bbva/network/model/ConnectionThreshold;", "q0", "Lcom/bbva/network/model/ConnectionThreshold;", "getThreshold", "()Lcom/bbva/network/model/ConnectionThreshold;", "setThreshold", "(Lcom/bbva/network/model/ConnectionThreshold;)V", MonochromeImageTransformer.THRESHOLD, "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/network/ConnectionChecker;", "connectionChecker", "<init>", "(Lcom/bbva/network/ConnectionChecker;Lcom/bbva/network/model/ConnectionThreshold;)V", "network_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"MissingPermission"})
@SourceDebugExtension({"SMAP\nNetworkStateEmitter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkStateEmitter.kt\ncom/bbva/network/state/NetworkStateEmitter\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,115:1\n39#2,6:116\n*S KotlinDebug\n*F\n+ 1 NetworkStateEmitter.kt\ncom/bbva/network/state/NetworkStateEmitter\n*L\n42#1:116,6\n*E\n"})
public final class NetworkStateEmitter extends ConnectivityManager.NetworkCallback implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ConnectionChecker f35179p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public ConnectionThreshold threshold;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f35181r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<ConnectionStatusEvent> f35182s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public NetworkStatus f35183t0;

    /* JADX INFO: compiled from: NetworkStateEmitter.kt */
    @DebugMetadata(c = "com.bbva.network.state.NetworkStateEmitter$onNetworkUpdated$1", f = "NetworkStateEmitter.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35184p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ConnectionStatusEvent f35186r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ConnectionStatusEvent connectionStatusEvent, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35186r0 = connectionStatusEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return NetworkStateEmitter.this.new a(this.f35186r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35184p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = NetworkStateEmitter.this.f35182s0;
                this.f35184p0 = 1;
                if (mutableStateFlow.emit(this.f35186r0, this) == coroutine_suspended) {
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

    public NetworkStateEmitter(@NotNull ConnectionChecker connectionChecker, @NotNull ConnectionThreshold threshold) {
        Intrinsics.checkNotNullParameter(connectionChecker, "connectionChecker");
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        this.f35179p0 = connectionChecker;
        this.threshold = threshold;
        this.f35181r0 = CoroutineScopeKt.MainScope();
        this.f35182s0 = StateFlowKt.MutableStateFlow(null);
        this.f35183t0 = ConnectionChecker.DefaultImpls.isNetworkConnected$default(connectionChecker, null, 1, null) ? NetworkStatus.ONLINE : NetworkStatus.OFFLINE;
        connectionChecker.registerNetworkCallback(this);
    }

    public final void a(NetworkStatus networkStatus, NetworkCapabilities networkCapabilities) {
        NetworkStrength networkStrength;
        NetworkSpeed networkSpeed;
        NetworkStatus networkStatus2 = this.f35183t0;
        NetworkType networkType = this.f35179p0.getNetworkType(networkCapabilities);
        int i10 = Build.VERSION.SDK_INT;
        Integer numValueOf = (i10 < 29 || networkCapabilities == null) ? null : Integer.valueOf(networkCapabilities.getSignalStrength());
        StrengthThreshold strengthThreshold = this.threshold.getStrengthThreshold();
        if (numValueOf == null || numValueOf.intValue() == Integer.MIN_VALUE) {
            networkStrength = NetworkStrength.UNKNOWN;
        } else if (numValueOf.intValue() > strengthThreshold.getExcellent()) {
            networkStrength = NetworkStrength.EXCELLENT;
        } else if (numValueOf.intValue() > strengthThreshold.getGood()) {
            networkStrength = NetworkStrength.GOOD;
        } else {
            networkStrength = numValueOf.intValue() > strengthThreshold.getFair() ? NetworkStrength.FAIR : NetworkStrength.WEAK;
        }
        NetworkStrength networkStrength2 = networkStrength;
        Integer numValueOf2 = networkCapabilities != null ? Integer.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps() / 1000) : null;
        SpeedThreshold speedThreshold = this.threshold.getSpeedThreshold();
        if (numValueOf2 == null) {
            networkSpeed = NetworkSpeed.UNKNOWN;
        } else if (numValueOf2.intValue() < speedThreshold.getLow()) {
            networkSpeed = NetworkSpeed.LOW;
        } else if (numValueOf2.intValue() < speedThreshold.getModerate()) {
            networkSpeed = NetworkSpeed.MODERATE;
        } else {
            networkSpeed = numValueOf2.intValue() < speedThreshold.getHigh() ? NetworkSpeed.HIGH : NetworkSpeed.VERY_HIGH;
        }
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(new ConnectionStatusEvent(networkStatus2, networkStatus, networkType, networkStrength2, networkSpeed, networkCapabilities != null ? Integer.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps() / 1000) : null, (i10 < 29 || networkCapabilities == null) ? null : Integer.valueOf(networkCapabilities.getSignalStrength())), null), 3, null);
    }

    @NotNull
    public final Flow<ConnectionStatusEvent> events(long delay) {
        return FlowKt.flow(new NetworkStateEmitter$events$$inlined$transform$1(FlowKt.filterNotNull(FlowKt.asStateFlow(this.f35182s0)), null, this, delay));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f35181r0.getCoroutineContext();
    }

    @NotNull
    public final ConnectionThreshold getThreshold() {
        return this.threshold;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        NetworkCapabilities networkCapabilities = this.f35179p0.getNetworkCapabilities(network);
        if (Build.VERSION.SDK_INT < 26) {
            a(NetworkStatus.ONLINE, networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        if (this.f35179p0.isNetworkConnected(networkCapabilities)) {
            a(NetworkStatus.ONLINE, networkCapabilities);
        } else {
            a(NetworkStatus.OFFLINE, networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        a(NetworkStatus.OFFLINE, null);
    }

    public final void setThreshold(@NotNull ConnectionThreshold connectionThreshold) {
        Intrinsics.checkNotNullParameter(connectionThreshold, "<set-?>");
        this.threshold = connectionThreshold;
    }
}
