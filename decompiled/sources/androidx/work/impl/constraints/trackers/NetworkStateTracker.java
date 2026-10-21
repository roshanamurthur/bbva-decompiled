package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.net.ConnectivityManagerCompat;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NetworkStateTracker extends ConstraintTracker<NetworkState> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f24514h = Logger.tagWithPrefix("NetworkStateTracker");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConnectivityManager f24515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @RequiresApi(24)
    public final b f24516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f24517g;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            Logger.get().debug(NetworkStateTracker.f24514h, "Network broadcast received", new Throwable[0]);
            NetworkStateTracker networkStateTracker = NetworkStateTracker.this;
            networkStateTracker.setState(networkStateTracker.a());
        }
    }

    @RequiresApi(24)
    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            Logger.get().debug(NetworkStateTracker.f24514h, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            NetworkStateTracker networkStateTracker = NetworkStateTracker.this;
            networkStateTracker.setState(networkStateTracker.a());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NonNull Network network) {
            Logger.get().debug(NetworkStateTracker.f24514h, "Network connection lost", new Throwable[0]);
            NetworkStateTracker networkStateTracker = NetworkStateTracker.this;
            networkStateTracker.setState(networkStateTracker.a());
        }
    }

    public NetworkStateTracker(@NonNull Context context, @NonNull TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        this.f24515e = (ConnectivityManager) this.mAppContext.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            this.f24516f = new b();
        } else {
            this.f24517g = new a();
        }
    }

    public final NetworkState a() {
        boolean z10;
        ConnectivityManager connectivityManager = this.f24515e;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z11 = false;
        boolean z12 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            z10 = networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException e5) {
            Logger.get().error(f24514h, "Unable to validate active network", e5);
        }
        boolean zIsActiveNetworkMetered = ConnectivityManagerCompat.isActiveNetworkMetered(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z11 = true;
        }
        return new NetworkState(z12, z10, zIsActiveNetworkMetered, z11);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
        boolean z10 = Build.VERSION.SDK_INT >= 24;
        String str = f24514h;
        if (!z10) {
            Logger.get().debug(str, "Registering broadcast receiver", new Throwable[0]);
            this.mAppContext.registerReceiver(this.f24517g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            Logger.get().debug(str, "Registering network callback", new Throwable[0]);
            this.f24515e.registerDefaultNetworkCallback(this.f24516f);
        } catch (IllegalArgumentException | SecurityException e5) {
            Logger.get().error(str, "Received exception while registering network callback", e5);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
        boolean z10 = Build.VERSION.SDK_INT >= 24;
        String str = f24514h;
        if (!z10) {
            Logger.get().debug(str, "Unregistering broadcast receiver", new Throwable[0]);
            this.mAppContext.unregisterReceiver(this.f24517g);
            return;
        }
        try {
            Logger.get().debug(str, "Unregistering network callback", new Throwable[0]);
            this.f24515e.unregisterNetworkCallback(this.f24516f);
        } catch (IllegalArgumentException | SecurityException e5) {
            Logger.get().error(str, "Received exception while unregistering network callback", e5);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public NetworkState getInitialState() {
        return a();
    }
}
