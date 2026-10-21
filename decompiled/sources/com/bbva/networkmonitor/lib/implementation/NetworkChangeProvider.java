package com.bbva.networkmonitor.lib.implementation;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bbva.networkmonitor.lib.NetworkExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NetworkChangeProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u001e\u0010\b\u001a\u00020\u00022\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004j\u0002`\u0006J\u001e\u0010\t\u001a\u00020\u00022\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004j\u0002`\u0006J\b\u0010\n\u001a\u00020\u0002H\u0007J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\u0012"}, d2 = {"Lcom/bbva/networkmonitor/lib/implementation/NetworkChangeProvider;", "Landroidx/lifecycle/LifecycleObserver;", "", "startMonitoring", "Lkotlin/Function1;", "", "Lcom/bbva/networkmonitor/lib/implementation/OnConnectionChange;", "onConnectionChange", "attachNetworkListener", "unregisterListener", "stopMonitoring", "", "", "getNetworkCauses", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "cmp-dp-network_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNetworkChangeProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkChangeProvider.kt\ncom/bbva/networkmonitor/lib/implementation/NetworkChangeProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1855#2,2:105\n1855#2,2:107\n*S KotlinDebug\n*F\n+ 1 NetworkChangeProvider.kt\ncom/bbva/networkmonitor/lib/implementation/NetworkChangeProvider\n*L\n76#1:105,2\n80#1:107,2\n*E\n"})
public final class NetworkChangeProvider implements LifecycleObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final CompletableJob f35204p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ConnectivityManager f35205q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ArrayList f35206r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final NetworkChangeProvider$networkCallback$1 f35207s0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.bbva.networkmonitor.lib.implementation.NetworkChangeProvider$networkCallback$1] */
    public NetworkChangeProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35204p0 = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.f35205q0 = NetworkExtensionsKt.connectivityManager(context);
        this.f35206r0 = new ArrayList();
        if (context instanceof LifecycleOwner) {
            ((LifecycleOwner) context).getLifecycle().addObserver(this);
        }
        this.f35207s0 = new ConnectivityManager.NetworkCallback() { // from class: com.bbva.networkmonitor.lib.implementation.NetworkChangeProvider$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NotNull Network network) {
                Intrinsics.checkNotNullParameter(network, "network");
                super.onAvailable(network);
                NetworkChangeProvider networkChangeProvider = this.f35208a;
                CoroutineScope coroutineScopeAccess$getScope = NetworkChangeProvider.access$getScope(networkChangeProvider);
                JobKt__JobKt.cancelChildren$default(networkChangeProvider.f35204p0, (CancellationException) null, 1, (Object) null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScopeAccess$getScope, null, null, new NetworkChangeProvider$networkCallback$1$onAvailable$$inlined$onNewJob$1(null, networkChangeProvider), 3, null);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NotNull Network network) {
                Intrinsics.checkNotNullParameter(network, "network");
                super.onLost(network);
                NetworkChangeProvider networkChangeProvider = this.f35208a;
                CoroutineScope coroutineScopeAccess$getScope = NetworkChangeProvider.access$getScope(networkChangeProvider);
                JobKt__JobKt.cancelChildren$default(networkChangeProvider.f35204p0, (CancellationException) null, 1, (Object) null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScopeAccess$getScope, null, null, new NetworkChangeProvider$networkCallback$1$onLost$$inlined$onNewJob$1(null, networkChangeProvider), 3, null);
            }
        };
    }

    public static final CoroutineScope access$getScope(NetworkChangeProvider networkChangeProvider) {
        networkChangeProvider.getClass();
        return CoroutineScopeKt.plus(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), networkChangeProvider.f35204p0);
    }

    public static final void access$notifyCurrentConnectionStatus(NetworkChangeProvider networkChangeProvider, boolean z10) {
        Iterator it = networkChangeProvider.f35206r0.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(Boolean.valueOf(z10));
        }
    }

    public final void attachNetworkListener(@NotNull Function1<? super Boolean, Unit> onConnectionChange) {
        Intrinsics.checkNotNullParameter(onConnectionChange, "onConnectionChange");
        ArrayList arrayList = this.f35206r0;
        if (arrayList.contains(onConnectionChange)) {
            return;
        }
        arrayList.add(onConnectionChange);
    }

    @NotNull
    public final List<Integer> getNetworkCauses() {
        return NetworkExtensionsKt.getUnavailableCapabilities(this.f35205q0);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void startMonitoring() {
        int i10 = Build.VERSION.SDK_INT;
        NetworkChangeProvider$networkCallback$1 networkChangeProvider$networkCallback$1 = this.f35207s0;
        ConnectivityManager connectivityManager = this.f35205q0;
        if (i10 >= 24) {
            connectivityManager.registerDefaultNetworkCallback(networkChangeProvider$networkCallback$1);
        } else {
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(1).addTransportType(0).build();
            Intrinsics.checkNotNullExpressionValue(networkRequestBuild, "build(...)");
            connectivityManager.registerNetworkCallback(networkRequestBuild, networkChangeProvider$networkCallback$1);
        }
        Iterator it = this.f35206r0.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(Boolean.valueOf(NetworkExtensionsKt.isInternetConnected(connectivityManager)));
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void stopMonitoring() {
        this.f35205q0.unregisterNetworkCallback(this.f35207s0);
    }

    public final void unregisterListener(@NotNull Function1<? super Boolean, Unit> onConnectionChange) {
        Intrinsics.checkNotNullParameter(onConnectionChange, "onConnectionChange");
        this.f35206r0.remove(onConnectionChange);
    }
}
