package com.salesforce.marketingcloud.proximity;

import android.app.Application;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.internal.h;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.altbeacon.beacon.BeaconConsumer;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Identifier;
import org.altbeacon.beacon.MonitorNotifier;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.powersave.BackgroundPowerSaver;

/* JADX INFO: loaded from: classes11.dex */
class a implements BeaconConsumer, MonitorNotifier {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @VisibleForTesting
    static final String f64833k = "m:0-3=4c000215,i:4-19,i:20-21,i:22-23,p:24-24";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f64834l = 121;
    static final String m = "0ahUKEwj";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    final Map<String, Region> f64835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BeaconManager f64836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f64837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<c> f64838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final LocalBroadcastManager f64839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f64840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f64841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BackgroundPowerSaver f64842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Intent f64843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ProximityNotificationCustomizationOptions f64844j;

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.proximity.a$a, reason: collision with other inner class name */
    public class C0266a implements MarketingCloudSdk.WhenReadyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f64845a;

        public C0266a(Intent intent) {
            this.f64845a = intent;
        }

        @Override // com.salesforce.marketingcloud.MarketingCloudSdk.WhenReadyListener
        public void ready(@NonNull MarketingCloudSdk marketingCloudSdk) {
            a.this.f64839e.sendBroadcast(this.f64845a);
        }
    }

    public a(Context context) {
        this(context, null);
    }

    private static c a(Region region) {
        try {
            return new c(region.getUniqueId(), region.getId1().toString(), region.getId2().toInt(), region.getId3().toInt());
        } catch (Exception e5) {
            g.b(e.f64863h, e5, "Unable to convert Region to BeaconRegion", new Object[0]);
            return null;
        }
    }

    private void b() {
        this.f64841g = true;
        this.f64836b.bind(this);
        g.a(e.f64863h, "Waiting for BeaconService connection", new Object[0]);
    }

    private void c() {
        g.d(e.f64863h, "monitorNewRegions", new Object[0]);
        if (this.f64838d.isEmpty()) {
            return;
        }
        for (c cVar : this.f64838d) {
            if (this.f64835a.containsKey(cVar.f())) {
                g.d(e.f64863h, "Region [%s] already monitored by SDK", cVar);
            } else {
                Region regionA = a(cVar);
                this.f64835a.put(cVar.f(), regionA);
                g.d(e.f64863h, "Now monitoring [%s]", cVar.toString());
                this.f64836b.startMonitoring(regionA);
            }
        }
        this.f64838d.clear();
    }

    public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i10) {
        this.f64843i = intent;
        this.f64837c.startService(intent);
        return this.f64837c.bindService(intent, serviceConnection, i10);
    }

    public void d() {
        g.a(e.f64863h, "stopMonitoring()", new Object[0]);
        synchronized (this.f64838d) {
            try {
                if (this.f64840f) {
                    a();
                    this.f64836b.unbind(this);
                    this.f64836b.removeMonitorNotifier(this);
                    if (this.f64842h != null) {
                        ((Application) this.f64837c.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f64842h);
                    }
                    this.f64840f = false;
                } else {
                    this.f64838d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void didDetermineStateForRegion(int i10, Region region) {
        String str = e.f64863h;
        g.d(str, "didDetermineStateForRegion(%d, %s)", Integer.valueOf(i10), region);
        if (!MarketingCloudSdk.isReady() && !MarketingCloudSdk.isInitializing()) {
            g.e(str, "MarketingCloudSdk#init must be called in your application's onCreate", new Object[0]);
            return;
        }
        Intent intentPutExtra = new Intent(i10 == 1 ? e.f64859d : e.f64860e).putExtra(e.f64861f, a(region));
        if (MarketingCloudSdk.isReady()) {
            this.f64839e.sendBroadcast(intentPutExtra);
        } else {
            MarketingCloudSdk.requestSdk(new C0266a(intentPutExtra));
        }
    }

    public void didEnterRegion(Region region) {
        g.d(e.f64863h, "didEnterRegion(%s)", region);
    }

    public void didExitRegion(Region region) {
        g.d(e.f64863h, "didExitRegion(%s)", region);
    }

    public Context getApplicationContext() {
        return this.f64837c;
    }

    public void onBeaconServiceConnect() {
        g.a(e.f64863h, "onBeaconServiceConnect", new Object[0]);
        synchronized (this.f64838d) {
            this.f64842h = new BackgroundPowerSaver(this.f64837c);
            this.f64836b.addMonitorNotifier(this);
            this.f64840f = true;
            this.f64841g = false;
            c();
        }
    }

    public void unbindService(ServiceConnection serviceConnection) {
        this.f64837c.unbindService(serviceConnection);
        this.f64837c.stopService(this.f64843i);
        this.f64840f = false;
        this.f64841g = false;
    }

    public a(Context context, @Nullable ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions) {
        this.f64835a = new ArrayMap();
        this.f64838d = new ArrayList();
        this.f64837c = context;
        this.f64839e = LocalBroadcastManager.getInstance(context);
        BeaconManager instanceForApplication = BeaconManager.getInstanceForApplication(context);
        this.f64836b = instanceForApplication;
        this.f64844j = proximityNotificationCustomizationOptions;
        instanceForApplication.getBeaconParsers().add(new BeaconParser("iBeacon").setBeaconLayout(f64833k));
        instanceForApplication.setBackgroundScanPeriod(5000L);
        instanceForApplication.setBackgroundBetweenScanPeriod(10000L);
        instanceForApplication.addMonitorNotifier(this);
    }

    @VisibleForTesting
    public static Region a(c cVar) {
        return new Region(cVar.f(), Identifier.fromUuid(UUID.fromString(cVar.e())), Identifier.fromInt(cVar.g()), Identifier.fromInt(cVar.h()));
    }

    public void b(@NonNull List<c> list) {
        g.a(e.f64863h, "unmonitorBeaconRegions() - [%d regions]", Integer.valueOf(list.size()));
        if (list.isEmpty()) {
            return;
        }
        for (c cVar : list) {
            this.f64835a.remove(cVar.f());
            b(a(cVar));
        }
    }

    private void a() {
        String str = e.f64863h;
        g.d(str, "clearAllMonitoredRegions", new Object[0]);
        if (this.f64835a.isEmpty()) {
            return;
        }
        g.d(str, "Stop monitoring %d BeaconRegions", Integer.valueOf(this.f64835a.size()));
        for (Region region : this.f64835a.values()) {
            if (region != null) {
                b(region);
            }
        }
        this.f64835a.clear();
    }

    private void b(Region region) {
        try {
            this.f64836b.stopMonitoring(region);
        } catch (Exception e5) {
            g.a(e.f64863h, e5, "Failed to stop monitoring %s", region);
        }
    }

    private void a(ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions) {
        if (proximityNotificationCustomizationOptions != null) {
            com.salesforce.marketingcloud.notifications.c cVar = new com.salesforce.marketingcloud.notifications.c(proximityNotificationCustomizationOptions.getSmallIconResId(), proximityNotificationCustomizationOptions.getChannelIdProvider());
            HashMap map = new HashMap();
            map.put("alert", "Searching for available beacons ...");
            map.put(NotificationMessage.NOTIF_KEY_ID, m);
            Notification notificationBuild = cVar.setupNotificationBuilder(this.f64837c, h.a(map)).build();
            if (this.f64836b.isAnyConsumerBound()) {
                return;
            }
            this.f64836b.enableForegroundServiceScanning(notificationBuild, 121);
        }
    }

    public void a(@NonNull List<c> list) {
        String str = e.f64863h;
        g.a(str, "monitorBeaconRegions() - [%d regions]", Integer.valueOf(list.size()));
        a(this.f64844j);
        this.f64836b.addMonitorNotifier(this);
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.f64838d) {
            try {
                this.f64838d.clear();
                this.f64838d.addAll(list);
                if (this.f64840f) {
                    c();
                } else {
                    g.d(str, "Not yet connected.  Will register Beacons once complete.", new Object[0]);
                    if (!this.f64841g) {
                        b();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
