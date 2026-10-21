package com.salesforce.marketingcloud.messages.push;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.u;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationManagerCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.firebase.messaging.RemoteMessage;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MCService;
import com.salesforce.marketingcloud.behaviors.c;
import com.salesforce.marketingcloud.e;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.internal.h;
import com.salesforce.marketingcloud.k;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.j;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class a extends PushMessageManager implements e, com.salesforce.marketingcloud.alarms.b.InterfaceC0239b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @VisibleForTesting
    static final String f64784t = "et_push_enabled";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f64785u = "last_push_token_refresh";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f64786v = "content-available";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f64787w = "_c";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f64788x = "_p";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f64789y = TimeUnit.HOURS.toMillis(48);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f64790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.salesforce.marketingcloud.notifications.a f64791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.salesforce.marketingcloud.alarms.b f64792l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f64793n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f64794o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f64796q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private BroadcastReceiver f64797r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f64798s;
    private final Set<PushMessageManager.SilentPushListener> m = new ArraySet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Set<PushMessageManager.PushTokenRefreshListener> f64795p = new ArraySet();

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.messages.push.a$a, reason: collision with other inner class name */
    public class C0264a extends BroadcastReceiver {
        public C0264a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                g.d(PushMessageManager.f64778d, "Received null intent", new Object[0]);
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                g.d(PushMessageManager.f64778d, "Received null action", new Object[0]);
            } else if (action.equals(PushMessageManager.f64779e)) {
                a.this.a(intent.getExtras());
            } else {
                g.a(PushMessageManager.f64778d, "Received unknown action: %s", action);
            }
        }
    }

    public a(@NonNull Context context, @NonNull j jVar, @NonNull com.salesforce.marketingcloud.notifications.a aVar, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @Nullable String str) {
        this.f64790j = (Context) com.salesforce.marketingcloud.util.j.a(context, "Content is null");
        this.f64793n = (j) com.salesforce.marketingcloud.util.j.a(jVar, "Storage is null");
        this.f64791k = (com.salesforce.marketingcloud.notifications.a) com.salesforce.marketingcloud.util.j.a(aVar, "NotificationManager is null");
        this.f64792l = (com.salesforce.marketingcloud.alarms.b) com.salesforce.marketingcloud.util.j.a(bVar, "AlarmScheduler is null");
        this.f64794o = str;
    }

    private static Bundle a(@NonNull Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (!map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
        }
        return bundle;
    }

    private void b() {
        JSONArray jSONArrayOptJSONArray = getPushDebugInfo().optJSONArray("messagingService");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 2) {
            return;
        }
        g.e(PushMessageManager.f64778d, "Possible Multiple Push Provider implementation issue detected in your application. This may lead to the malfunctioning of the Push SDK.", new Object[0]);
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            int iOptInt = jSONObjectOptJSONObject.optInt("priority");
            String strOptString = jSONObjectOptJSONObject.optString("name");
            if (iOptInt > -1) {
                g.d(PushMessageManager.f64778d, u.f(strOptString, " is having higher priority than the Push SDK"), new Object[0]);
            }
        }
    }

    private void c() {
        this.f64797r = new C0264a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PushMessageManager.f64779e);
        LocalBroadcastManager.getInstance(this.f64790j).registerReceiver(this.f64797r, intentFilter);
    }

    private void d() {
        j jVar = this.f64793n;
        if (jVar != null) {
            jVar.f().edit().putBoolean(f64784t, this.f64798s).apply();
        }
    }

    private void e(Map<String, String> map) {
        if (map == null || f(map)) {
            return;
        }
        c.a(this.f64790j, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_PUSH_RECEIVED, a(map));
        if (k.a(map)) {
            g.d(PushMessageManager.f64778d, "Sync handler push received.", new Object[0]);
            return;
        }
        if (!isPushEnabled()) {
            g.a(PushMessageManager.f64778d, "Push Messaging is disabled.  Ignoring message.", new Object[0]);
            return;
        }
        if (map.containsKey(f64786v)) {
            b(map);
            return;
        }
        if (map.containsKey(f64787w)) {
            c(map);
            return;
        }
        try {
            NotificationMessage notificationMessageA = h.a(map);
            if (TextUtils.isEmpty(notificationMessageA.alert().trim())) {
                g.a(PushMessageManager.f64778d, "Message (%s) was received but does not have an alert message.", notificationMessageA.id());
            } else {
                this.f64791k.a(notificationMessageA, (com.salesforce.marketingcloud.notifications.a.b) null);
            }
        } catch (Exception e5) {
            g.b(PushMessageManager.f64778d, e5, "Unable to show push notification", new Object[0]);
        }
    }

    private boolean f(Map<String, String> map) {
        if (com.salesforce.marketingcloud.b.a(this.f64796q, 4)) {
            g.a(PushMessageManager.f64778d, "Blocking push message.  Received a push message when the push feature is blocked.", new Object[0]);
            return true;
        }
        if (!com.salesforce.marketingcloud.b.a(this.f64796q, 128) || !com.salesforce.marketingcloud.messages.inbox.a.a(map)) {
            return false;
        }
        g.a(PushMessageManager.f64778d, "Blocking push message.  Received an inbox message when the inbox feature is blocked.", new Object[0]);
        return true;
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public String componentName() {
        return "PushMessageManager";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public JSONObject componentState() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pushEnabled", this.f64798s);
            jSONObject.put("pushPermissionsAllowed", NotificationManagerCompat.from(this.f64790j).areNotificationsEnabled());
            synchronized (this.f64795p) {
                try {
                    if (!this.f64795p.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        for (PushMessageManager.PushTokenRefreshListener pushTokenRefreshListener : this.f64795p) {
                            if (pushTokenRefreshListener != null) {
                                jSONArray.put(pushTokenRefreshListener.getClass().getName());
                            }
                        }
                        jSONObject.put("tokenRefreshListeners", jSONArray);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            jSONObject.put("debugInfo", getPushDebugInfo());
        } catch (JSONException e5) {
            g.b(PushMessageManager.f64778d, e5, "Unable to create component state for $s", componentName());
        }
        return jSONObject;
    }

    @Override // com.salesforce.marketingcloud.e
    public void controlChannelInit(int i10) {
        if (!com.salesforce.marketingcloud.b.a(i10, 4)) {
            if (com.salesforce.marketingcloud.b.a(this.f64796q, 4)) {
                this.f64796q = i10;
                c();
                this.f64792l.a(this, com.salesforce.marketingcloud.alarms.a.b.f63805e);
                enablePush();
                String str = this.f64794o;
                if (str != null) {
                    MCService.b(this.f64790j, str);
                    return;
                }
                return;
            }
            return;
        }
        disablePush();
        if (this.f64797r != null) {
            LocalBroadcastManager.getInstance(this.f64790j).unregisterReceiver(this.f64797r);
        }
        com.salesforce.marketingcloud.alarms.b bVar = this.f64792l;
        com.salesforce.marketingcloud.alarms.a.b bVar2 = com.salesforce.marketingcloud.alarms.a.b.f63805e;
        bVar.e(bVar2);
        this.f64792l.d(bVar2);
        if (com.salesforce.marketingcloud.b.c(i10, 4)) {
            com.salesforce.marketingcloud.storage.c cVarC = this.f64793n.c();
            cVarC.remove(com.salesforce.marketingcloud.storage.c.f64956i);
            cVarC.remove(com.salesforce.marketingcloud.storage.c.f64952e);
        }
        this.f64796q = i10;
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public synchronized void disablePush() {
        if (this.f64798s && !com.salesforce.marketingcloud.b.a(this.f64796q, 4)) {
            this.f64798s = false;
            a();
            d();
        }
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public synchronized void enablePush() {
        if (com.salesforce.marketingcloud.b.a(this.f64796q, 4)) {
            return;
        }
        this.f64798s = true;
        a();
        d();
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    @NonNull
    public JSONObject getPushDebugInfo() {
        try {
            return b.a(this.f64790j, this.f64794o, this.f64793n.c().getString(com.salesforce.marketingcloud.storage.c.f64952e, null));
        } catch (Exception e5) {
            g.b(PushMessageManager.f64778d, e5, "Unable to acquire push debug info.", new Object[0]);
            return new JSONObject();
        }
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    @Nullable
    public String getPushToken() {
        return this.f64793n.c().getString(com.salesforce.marketingcloud.storage.c.f64952e, null);
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public boolean handleMessage(@NonNull RemoteMessage remoteMessage) {
        if (PushMessageManager.isMarketingCloudPush(remoteMessage)) {
            e(remoteMessage.getData());
            return true;
        }
        g.a(PushMessageManager.f64778d, "Message was not sent from the Marketing Cloud.  Message ignored.", new Object[0]);
        return false;
    }

    @Override // com.salesforce.marketingcloud.e
    public void init(@NonNull InitializationStatus.a aVar, int i10) {
        this.f64796q = i10;
        if (com.salesforce.marketingcloud.b.b(i10, 4)) {
            this.f64798s = this.f64793n.f().getBoolean(f64784t, true);
            c();
            com.salesforce.marketingcloud.alarms.b bVar = this.f64792l;
            com.salesforce.marketingcloud.alarms.a.b bVar2 = com.salesforce.marketingcloud.alarms.a.b.f63805e;
            bVar.a(this, bVar2);
            if (this.f64794o == null) {
                g.e(PushMessageManager.f64778d, "No sender id was provided during initialization.  You will not receive push messages until a token is manually set.", new Object[0]);
                this.f64792l.d(bVar2);
                this.f64793n.c().remove(com.salesforce.marketingcloud.storage.c.f64956i);
                return;
            }
            b();
            if (!this.f64794o.equals(this.f64793n.c().getString(com.salesforce.marketingcloud.storage.c.f64956i, null))) {
                g.d(PushMessageManager.f64778d, "Sender Id has changed.  Refresh system token.", new Object[0]);
            } else if (this.f64793n.f().getLong(f64785u, 0L) + f64789y >= System.currentTimeMillis()) {
                return;
            } else {
                g.d(PushMessageManager.f64778d, "Push token refresh cool down expired.  Refresh system token.", new Object[0]);
            }
            MCService.b(this.f64790j, this.f64794o);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public synchronized boolean isPushEnabled() {
        return this.f64798s;
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public void registerSilentPushListener(@NonNull PushMessageManager.SilentPushListener silentPushListener) {
        if (silentPushListener == null) {
            return;
        }
        synchronized (this.m) {
            this.m.add(silentPushListener);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public void registerTokenRefreshListener(@NonNull PushMessageManager.PushTokenRefreshListener pushTokenRefreshListener) {
        if (pushTokenRefreshListener == null) {
            return;
        }
        synchronized (this.f64795p) {
            this.f64795p.add(pushTokenRefreshListener);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public void setPushToken(@NonNull String str) {
        if (com.salesforce.marketingcloud.b.b(this.f64796q, 4)) {
            if (str == null) {
                g.b(PushMessageManager.f64778d, "Provided pushToken was null", new Object[0]);
                return;
            }
            if (this.f64794o != null) {
                g.a(PushMessageManager.f64778d, "Setting the SenderId during SDK initialization and setting the push token will cause conflicts in the system and could prevent the device from receiving push messages.", new Object[0]);
            }
            com.salesforce.marketingcloud.storage.c cVarC = this.f64793n.c();
            cVarC.remove(com.salesforce.marketingcloud.storage.c.f64956i);
            cVarC.putString(com.salesforce.marketingcloud.storage.c.f64952e, str);
            this.f64792l.d(com.salesforce.marketingcloud.alarms.a.b.f63805e);
            b(str);
        }
    }

    @Override // com.salesforce.marketingcloud.d
    public void tearDown(boolean z10) {
        if (this.f64797r != null) {
            LocalBroadcastManager.getInstance(this.f64790j).unregisterReceiver(this.f64797r);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public void unregisterSilentPushListener(@NonNull PushMessageManager.SilentPushListener silentPushListener) {
        synchronized (this.m) {
            this.m.remove(silentPushListener);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public void unregisterTokenRefreshListener(@NonNull PushMessageManager.PushTokenRefreshListener pushTokenRefreshListener) {
        synchronized (this.f64795p) {
            this.f64795p.remove(pushTokenRefreshListener);
        }
    }

    private void a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(PushMessageManager.f64782h, this.f64798s);
        c.a(this.f64790j, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_PUSH_MESSAGING_TOGGLED, bundle);
    }

    private void c(Map<String, String> map) {
        map.remove(f64787w);
        map.remove(f64788x);
        d(map);
    }

    private void d(Map<String, String> map) {
        synchronized (this.m) {
            for (PushMessageManager.SilentPushListener silentPushListener : this.m) {
                if (silentPushListener != null) {
                    try {
                        silentPushListener.silentPushReceived(map);
                    } catch (Exception e5) {
                        g.b(PushMessageManager.f64778d, e5, "%s threw an exception while processing the silent push message", silentPushListener.getClass().getName());
                    }
                }
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public boolean handleMessage(@NonNull Map<String, String> map) {
        if (PushMessageManager.isMarketingCloudPush(map)) {
            e(map);
            return true;
        }
        g.a(PushMessageManager.f64778d, "Message was not sent from the Marketing Cloud.  Message ignored.", new Object[0]);
        return false;
    }

    public static void a(@NonNull Context context, boolean z10, String str, String str2) {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(PushMessageManager.f64779e).putExtra(PushMessageManager.f64780f, z10).putExtra(PushMessageManager.f64781g, str).putExtra(PushMessageManager.f64783i, str2));
    }

    public void a(Bundle bundle) {
        com.salesforce.marketingcloud.storage.c cVarC = this.f64793n.c();
        if (!bundle.getBoolean(PushMessageManager.f64780f, false)) {
            cVarC.remove(com.salesforce.marketingcloud.storage.c.f64956i);
            this.f64792l.b(com.salesforce.marketingcloud.alarms.a.b.f63805e);
            return;
        }
        String string = bundle.getString(PushMessageManager.f64783i, "");
        cVarC.putString(com.salesforce.marketingcloud.storage.c.f64952e, string);
        cVarC.putString(com.salesforce.marketingcloud.storage.c.f64956i, bundle.getString(PushMessageManager.f64781g, ""));
        b(string);
        this.f64792l.d(com.salesforce.marketingcloud.alarms.a.b.f63805e);
        this.f64793n.f().edit().putLong(f64785u, System.currentTimeMillis()).apply();
        a(string);
    }

    @Override // com.salesforce.marketingcloud.alarms.b.InterfaceC0239b
    public void a(@NonNull com.salesforce.marketingcloud.alarms.a.b bVar) {
        String str;
        if (bVar != com.salesforce.marketingcloud.alarms.a.b.f63805e || (str = this.f64794o) == null) {
            return;
        }
        MCService.b(this.f64790j, str);
    }

    private void a(String str) {
        synchronized (this.f64795p) {
            for (PushMessageManager.PushTokenRefreshListener pushTokenRefreshListener : this.f64795p) {
                if (pushTokenRefreshListener != null) {
                    try {
                        pushTokenRefreshListener.onTokenRefreshed(str);
                    } catch (Exception e5) {
                        g.b(PushMessageManager.f64778d, e5, "%s threw an exception while processing the token refresh", pushTokenRefreshListener.getClass().getName());
                    }
                }
            }
        }
    }

    private void b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(PushMessageManager.f64783i, str);
        c.a(this.f64790j, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_TOKEN_REFRESHED, bundle);
    }

    private void b(Map<String, String> map) {
        String str = map.get(f64786v);
        if (str != null) {
            try {
                if (Integer.parseInt(str) == 1) {
                    d(map);
                }
            } catch (Exception e5) {
                g.b(PushMessageManager.f64778d, e5, "Unable to parse content available flag: %s", str);
            }
        }
    }
}
