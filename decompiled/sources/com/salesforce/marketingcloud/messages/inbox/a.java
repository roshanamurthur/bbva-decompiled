package com.salesforce.marketingcloud.messages.inbox;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.analytics.g;
import com.salesforce.marketingcloud.e;
import com.salesforce.marketingcloud.http.d;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.j;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class a implements e, InboxMessageManager, com.salesforce.marketingcloud.behaviors.b, com.salesforce.marketingcloud.http.c.InterfaceC0253c, com.salesforce.marketingcloud.alarms.b.InterfaceC0239b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f64714n = "InboxMessagingEnabled";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f64715o = "8";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Object f64716p = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MarketingCloudConfig f64717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j f64718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f64719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.salesforce.marketingcloud.behaviors.c f64720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.salesforce.marketingcloud.alarms.b f64721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.salesforce.marketingcloud.http.c f64722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f64723j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private c f64724k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private l f64725l;
    private com.salesforce.marketingcloud.toggles.a m;

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.messages.inbox.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0261a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f64727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f64728c;

        static {
            int[] iArr = new int[com.salesforce.marketingcloud.alarms.a.b.values().length];
            f64728c = iArr;
            try {
                iArr[com.salesforce.marketingcloud.alarms.a.b.f63806f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[com.salesforce.marketingcloud.http.a.values().length];
            f64727b = iArr2;
            try {
                iArr2[com.salesforce.marketingcloud.http.a.f64256j.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64727b[com.salesforce.marketingcloud.http.a.f64257k.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64727b[com.salesforce.marketingcloud.http.a.f64258l.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[com.salesforce.marketingcloud.behaviors.a.values().length];
            f64726a = iArr3;
            try {
                iArr3[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64726a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_BACKGROUNDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64726a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_PUSH_RECEIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f64726a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_NOTIFICATION_OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public a(MarketingCloudConfig marketingCloudConfig, j jVar, String str, com.salesforce.marketingcloud.behaviors.c cVar, com.salesforce.marketingcloud.alarms.b bVar, com.salesforce.marketingcloud.http.c cVar2, l lVar, g gVar) {
        this.f64717d = (MarketingCloudConfig) com.salesforce.marketingcloud.util.j.a(marketingCloudConfig, "MarketingCloudConfig is null.");
        this.f64718e = (j) com.salesforce.marketingcloud.util.j.a(jVar, "Storage is null.");
        this.f64719f = (String) com.salesforce.marketingcloud.util.j.a(str, "You must provide the Device ID.");
        this.f64720g = (com.salesforce.marketingcloud.behaviors.c) com.salesforce.marketingcloud.util.j.a(cVar, "BehaviorManager is null.");
        this.f64721h = (com.salesforce.marketingcloud.alarms.b) com.salesforce.marketingcloud.util.j.a(bVar, "AlarmScheduler is null.");
        this.f64722i = (com.salesforce.marketingcloud.http.c) com.salesforce.marketingcloud.util.j.a(cVar2, "RequestManager is null.");
        this.f64723j = (g) com.salesforce.marketingcloud.util.j.a(gVar, "InboxAnalyticEventListener is null.");
        this.f64725l = lVar;
    }

    private com.salesforce.marketingcloud.toggles.a a(com.salesforce.marketingcloud.toggles.a aVar) {
        if (aVar != null) {
            return aVar;
        }
        String string = this.f64718e.f().getString(f64714n, null);
        return string == null ? com.salesforce.marketingcloud.toggles.a.UNKNOWN : com.salesforce.marketingcloud.toggles.a.valueOf(string);
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final String componentName() {
        return "InboxMessageManager";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public JSONObject componentState() {
        try {
            c cVar = this.f64724k;
            JSONObject jSONObjectC = cVar != null ? cVar.c() : new JSONObject();
            jSONObjectC.put("inboxEnabled", isInboxEnabled());
            return jSONObjectC;
        } catch (JSONException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // com.salesforce.marketingcloud.e
    public void controlChannelInit(int i10) {
        if (!com.salesforce.marketingcloud.b.a(i10, 128)) {
            if (this.f64724k == null && isInboxEnabled()) {
                a();
                return;
            }
            return;
        }
        this.f64724k = null;
        c.a(this.f64718e, this.f64721h, this.f64725l, com.salesforce.marketingcloud.b.c(i10, 128));
        this.f64720g.a(this);
        this.f64721h.e(com.salesforce.marketingcloud.alarms.a.b.f63806f);
        this.f64722i.a(com.salesforce.marketingcloud.http.a.f64256j);
        this.f64722i.a(com.salesforce.marketingcloud.http.a.f64257k);
        this.f64722i.a(com.salesforce.marketingcloud.http.a.f64258l);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void deleteMessage(@NonNull InboxMessage inboxMessage) {
        c cVar = this.f64724k;
        if (cVar != null) {
            cVar.deleteMessage(inboxMessage);
        } else {
            com.salesforce.marketingcloud.g.e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to deleteMessage() was ignored.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void disableInbox() {
        synchronized (f64716p) {
            com.salesforce.marketingcloud.toggles.a aVar = com.salesforce.marketingcloud.toggles.a.DISABLED;
            this.m = aVar;
            this.f64718e.f().edit().putString(f64714n, this.m.name()).apply();
            com.salesforce.marketingcloud.g.a(InboxMessageManager.TAG, "Inbox runtime toggle set to " + aVar.name(), new Object[0]);
            this.f64724k = null;
            tearDown(false);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void enableInbox() {
        synchronized (f64716p) {
            try {
                if (com.salesforce.marketingcloud.b.a(com.salesforce.marketingcloud.b.a(this.f64718e.o()), 128)) {
                    return;
                }
                String str = InboxMessageManager.TAG;
                StringBuilder sb2 = new StringBuilder("Inbox runtime toggle set to ");
                com.salesforce.marketingcloud.toggles.a aVar = com.salesforce.marketingcloud.toggles.a.ENABLED;
                sb2.append(aVar.name());
                com.salesforce.marketingcloud.g.a(str, sb2.toString(), new Object[0]);
                this.m = aVar;
                this.f64718e.f().edit().putString(f64714n, this.m.name()).apply();
                a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public int getDeletedMessageCount() {
        c cVar = this.f64724k;
        if (cVar != null) {
            return cVar.getDeletedMessageCount();
        }
        com.salesforce.marketingcloud.g.e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to getDeletedMessageCount() was ignored.", new Object[0]);
        return 0;
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    @NonNull
    public List<InboxMessage> getDeletedMessages() {
        List<InboxMessage> listEmptyList = Collections.emptyList();
        c cVar = this.f64724k;
        if (cVar != null) {
            return cVar.getDeletedMessages();
        }
        com.salesforce.marketingcloud.g.e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to getDeletedMessages() was ignored.", new Object[0]);
        return listEmptyList;
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public int getMessageCount() {
        c cVar = this.f64724k;
        if (cVar != null) {
            return cVar.getMessageCount();
        }
        com.salesforce.marketingcloud.g.e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to getMessageCount() was ignored.", new Object[0]);
        return 0;
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    @NonNull
    @WorkerThread
    public List<InboxMessage> getMessages() {
        List<InboxMessage> listEmptyList = Collections.emptyList();
        c cVar = this.f64724k;
        if (cVar != null) {
            return cVar.getMessages();
        }
        com.salesforce.marketingcloud.g.e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to getMessages() was ignored.", new Object[0]);
        return listEmptyList;
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public int getReadMessageCount() {
        c cVar = this.f64724k;
        if (cVar != null) {
            return cVar.getReadMessageCount();
        }
        com.salesforce.marketingcloud.g.e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to getReadMessageCount() was ignored.", new Object[0]);
        return 0;
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    @NonNull
    public List<InboxMessage> getReadMessages() {
        List<InboxMessage> listEmptyList = Collections.emptyList();
        c cVar = this.f64724k;
        if (cVar != null) {
            return cVar.getReadMessages();
        }
        com.salesforce.marketingcloud.g.e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to getReadMessages() was ignored.", new Object[0]);
        return listEmptyList;
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public int getUnreadMessageCount() {
        c cVar = this.f64724k;
        if (cVar != null) {
            return cVar.getUnreadMessageCount();
        }
        com.salesforce.marketingcloud.g.e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to getUnreadMessageCount() was ignored.", new Object[0]);
        return 0;
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    @NonNull
    public List<InboxMessage> getUnreadMessages() {
        List<InboxMessage> listEmptyList = Collections.emptyList();
        c cVar = this.f64724k;
        if (cVar != null) {
            return cVar.getUnreadMessages();
        }
        com.salesforce.marketingcloud.g.e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to getUnreadMessages() was ignored.", new Object[0]);
        return listEmptyList;
    }

    @Override // com.salesforce.marketingcloud.e
    public void init(@NonNull InitializationStatus.a aVar, int i10) {
        if (a(i10)) {
            a();
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public boolean isInboxEnabled() {
        return a(com.salesforce.marketingcloud.b.a(this.f64718e.o()));
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void markAllMessagesDeleted() {
        c cVar = this.f64724k;
        if (cVar != null) {
            cVar.markAllMessagesDeleted();
        } else {
            com.salesforce.marketingcloud.g.e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to markAllMessagesDeleted() was ignored.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void markAllMessagesRead() {
        c cVar = this.f64724k;
        if (cVar != null) {
            cVar.markAllMessagesRead();
        } else {
            com.salesforce.marketingcloud.g.e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to markAllMessagesRead() was ignored.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.behaviors.b
    public void onBehavior(@NonNull com.salesforce.marketingcloud.behaviors.a aVar, @NonNull Bundle bundle) {
        NotificationMessage notificationMessage;
        if (this.f64724k != null) {
            int i10 = C0261a.f64726a[aVar.ordinal()];
            if (i10 == 1) {
                this.f64724k.b();
                return;
            }
            if (i10 == 2) {
                this.f64724k.a();
                return;
            }
            if (i10 != 3) {
                if (i10 == 4 && (notificationMessage = (NotificationMessage) bundle.get(com.salesforce.marketingcloud.notifications.a.f64810p)) != null) {
                    this.f64724k.a(notificationMessage);
                    return;
                }
                return;
            }
            if (a(bundle)) {
                try {
                    this.f64724k.a(new InboxMessage(bundle));
                } catch (Exception e5) {
                    com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, e5, "Failed to seed inbox_messages table with message: %s.", bundle.getString(NotificationMessage.NOTIF_KEY_ID));
                }
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void refreshInbox(InboxMessageManager.InboxRefreshListener inboxRefreshListener) {
        c cVar = this.f64724k;
        if (cVar != null) {
            cVar.refreshInbox(inboxRefreshListener);
            return;
        }
        com.salesforce.marketingcloud.g.e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to refreshInbox() was ignored.", new Object[0]);
        if (inboxRefreshListener != null) {
            try {
                inboxRefreshListener.onRefreshComplete(false);
            } catch (Exception unused) {
                com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, "InboxRefreshListener threw an exception.", new Object[0]);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void registerInboxResponseListener(@NonNull InboxMessageManager.InboxResponseListener inboxResponseListener) {
        c cVar = this.f64724k;
        if (cVar != null) {
            cVar.registerInboxResponseListener(inboxResponseListener);
        } else {
            com.salesforce.marketingcloud.g.e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to registerInboxResponseListener() was ignored.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void setMessageRead(@NonNull InboxMessage inboxMessage) {
        c cVar = this.f64724k;
        if (cVar != null) {
            cVar.setMessageRead(inboxMessage);
        } else {
            com.salesforce.marketingcloud.g.e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to setMessageRead() was ignored.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.d
    public void tearDown(boolean z10) {
        com.salesforce.marketingcloud.alarms.b bVar = this.f64721h;
        if (bVar != null) {
            bVar.e(com.salesforce.marketingcloud.alarms.a.b.f63806f);
        }
        com.salesforce.marketingcloud.behaviors.c cVar = this.f64720g;
        if (cVar != null) {
            cVar.a(this);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void unregisterInboxResponseListener(@NonNull InboxMessageManager.InboxResponseListener inboxResponseListener) {
        c cVar = this.f64724k;
        if (cVar != null) {
            cVar.unregisterInboxResponseListener(inboxResponseListener);
        } else {
            com.salesforce.marketingcloud.g.e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to unregisterInboxResponseListener() was ignored.", new Object[0]);
        }
    }

    @VisibleForTesting(otherwise = 5)
    public a(c cVar) {
        this.f64717d = null;
        this.f64718e = null;
        this.f64719f = null;
        this.f64720g = null;
        this.f64721h = null;
        this.f64722i = null;
        this.f64723j = null;
        this.f64724k = cVar;
    }

    private void a() {
        this.f64724k = new c(this.f64717d, this.f64718e, this.f64719f, this.f64721h, this.f64722i, this.f64723j, this.f64725l);
        this.f64722i.a(com.salesforce.marketingcloud.http.a.f64256j, this);
        this.f64722i.a(com.salesforce.marketingcloud.http.a.f64257k, this);
        this.f64722i.a(com.salesforce.marketingcloud.http.a.f64258l, this);
        this.f64721h.a(this, com.salesforce.marketingcloud.alarms.a.b.f63806f);
        this.f64720g.a(this, EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_PUSH_RECEIVED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_BACKGROUNDED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_NOTIFICATION_OPENED));
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void deleteMessage(@NonNull String str) {
        c cVar = this.f64724k;
        if (cVar != null) {
            cVar.deleteMessage(str);
        } else {
            com.salesforce.marketingcloud.g.e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to deleteMessage() was ignored.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void setMessageRead(@NonNull String str) {
        c cVar = this.f64724k;
        if (cVar != null) {
            cVar.setMessageRead(str);
        } else {
            com.salesforce.marketingcloud.g.e(InboxMessageManager.TAG, "Inbox messaging is disabled.  Call to setMessageRead() was ignored.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.alarms.b.InterfaceC0239b
    public void a(@NonNull com.salesforce.marketingcloud.alarms.a.b bVar) {
        if (this.f64724k == null || C0261a.f64728c[bVar.ordinal()] != 1) {
            return;
        }
        this.f64724k.d();
    }

    @Override // com.salesforce.marketingcloud.http.c.InterfaceC0253c
    public void a(com.salesforce.marketingcloud.http.b bVar, d dVar) {
        if (this.f64724k != null) {
            int i10 = C0261a.f64727b[bVar.p().ordinal()];
            if (i10 == 1 || i10 == 2) {
                if (dVar.g()) {
                    this.f64724k.a(dVar);
                    return;
                } else {
                    this.f64724k.a(dVar.getCode(), dVar.getMessage());
                    return;
                }
            }
            if (i10 != 3) {
                return;
            }
            if (dVar.g()) {
                this.f64724k.a(bVar);
            } else {
                this.f64724k.b(dVar.getCode(), dVar.getMessage());
            }
        }
    }

    private boolean a(int i10) {
        if (com.salesforce.marketingcloud.b.a(i10, 128)) {
            return false;
        }
        if (this.m == null) {
            this.m = a((com.salesforce.marketingcloud.toggles.a) null);
        }
        com.salesforce.marketingcloud.toggles.a aVar = this.m;
        return aVar == com.salesforce.marketingcloud.toggles.a.ENABLED || (aVar == com.salesforce.marketingcloud.toggles.a.UNKNOWN && this.f64717d.inboxEnabled());
    }

    private static boolean a(@NonNull Bundle bundle) {
        return f64715o.equals(bundle.getString(NotificationMessage.NOTIF_KEY_MESSAGE_TYPE));
    }

    public static boolean a(@NonNull Map<String, String> map) {
        return f64715o.equals(map.get(NotificationMessage.NOTIF_KEY_MESSAGE_TYPE));
    }
}
