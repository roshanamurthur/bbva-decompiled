package com.salesforce.marketingcloud.messages.inbox;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class c implements InboxMessageManager {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final com.salesforce.marketingcloud.storage.j f64729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final com.salesforce.marketingcloud.analytics.g f64730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final com.salesforce.marketingcloud.http.c f64731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final MarketingCloudConfig f64732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f64733h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.salesforce.marketingcloud.alarms.b f64735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l f64736k;

    @GuardedBy("REFRESH_LOCK")
    private InboxMessageManager.InboxRefreshListener m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f64738n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Set<InboxMessageManager.InboxResponseListener> f64734i = new ArraySet();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f64737l = new Object();

    public class a extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f64739b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.f64739b = str2;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            c.this.f64729d.q().b(TextUtils.split(this.f64739b, ","));
        }
    }

    public class b implements MarketingCloudSdk.WhenReadyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.salesforce.marketingcloud.http.a f64741a;

        public b(com.salesforce.marketingcloud.http.a aVar) {
            this.f64741a = aVar;
        }

        @Override // com.salesforce.marketingcloud.MarketingCloudSdk.WhenReadyListener
        public void ready(@NonNull MarketingCloudSdk marketingCloudSdk) {
            c cVar = c.this;
            cVar.f64731f.a(this.f64741a.a(cVar.f64732g, cVar.f64729d.c(), com.salesforce.marketingcloud.http.a.b(c.this.f64732g.applicationId(), c.this.f64733h)));
        }
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.messages.inbox.c$c, reason: collision with other inner class name */
    public class C0262c extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.salesforce.marketingcloud.storage.h f64743b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0262c(String str, Object[] objArr, com.salesforce.marketingcloud.storage.h hVar) {
            super(str, objArr);
            this.f64743b = hVar;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            this.f64743b.k();
        }
    }

    public class d extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InboxMessage f64744b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, InboxMessage inboxMessage) {
            super(str, objArr);
            this.f64744b = inboxMessage;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            c.this.f64729d.q().a(this.f64744b, c.this.f64729d.b());
        }
    }

    public class e extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f64746b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.f64746b = str2;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            c.this.setMessageRead(this.f64746b);
        }
    }

    public class f extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f64748b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.f64748b = str2;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            c.this.f64729d.q().d(this.f64748b);
        }
    }

    public class g extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f64750b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.f64750b = str2;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            c.this.f64729d.q().e(this.f64750b);
        }
    }

    public class h extends com.salesforce.marketingcloud.internal.g {
        public h(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            c.this.f64729d.q().m();
        }
    }

    public class i extends com.salesforce.marketingcloud.internal.g {
        public i(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            c.this.f64729d.q().f();
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.b(false);
        }
    }

    public class k extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f64755b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k kVar = k.this;
                c.this.a(kVar.f64755b);
                c.this.b(true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, Object[] objArr, List list) {
            super(str, objArr);
            this.f64755b = list;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x007c  */
        /* JADX WARN: Code duplicated, block: B:27:0x008d  */
        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            boolean z10;
            com.salesforce.marketingcloud.storage.h hVarQ = c.this.f64729d.q();
            com.salesforce.marketingcloud.util.c cVarB = c.this.f64729d.b();
            ArrayList arrayList = new ArrayList(this.f64755b.size());
            if (!this.f64755b.isEmpty()) {
                for (InboxMessage inboxMessage : this.f64755b) {
                    arrayList.add(inboxMessage.id());
                    com.salesforce.marketingcloud.storage.h.b bVarG = hVarQ.g(inboxMessage.id());
                    boolean z11 = true;
                    if (bVarG != null) {
                        String str = bVarG.f65103b;
                        if (str == null) {
                            com.salesforce.marketingcloud.internal.b.a(inboxMessage, bVarG.f65106e);
                            com.salesforce.marketingcloud.internal.b.c(inboxMessage, bVarG.f65105d);
                        } else {
                            if (str.equals(com.salesforce.marketingcloud.internal.b.a(inboxMessage))) {
                                com.salesforce.marketingcloud.internal.b.a(inboxMessage, bVarG.f65106e);
                                com.salesforce.marketingcloud.internal.b.c(inboxMessage, bVarG.f65105d);
                                if (bVarG.f65104c != null) {
                                    z10 = false;
                                }
                            }
                            com.salesforce.marketingcloud.internal.b.b(inboxMessage, bVarG.f65107f);
                            if (com.salesforce.marketingcloud.internal.b.c(inboxMessage) > 0) {
                                com.salesforce.marketingcloud.internal.b.c(inboxMessage, true);
                            }
                            if (bVarG.f65106e || (bVarG.f65105d && com.salesforce.marketingcloud.internal.b.c(inboxMessage) == 0)) {
                                com.salesforce.marketingcloud.internal.b.b(inboxMessage, true);
                            }
                            z11 = z10;
                        }
                        z10 = true;
                        com.salesforce.marketingcloud.internal.b.b(inboxMessage, bVarG.f65107f);
                        if (com.salesforce.marketingcloud.internal.b.c(inboxMessage) > 0) {
                            com.salesforce.marketingcloud.internal.b.c(inboxMessage, true);
                        }
                        if (bVarG.f65106e) {
                            com.salesforce.marketingcloud.internal.b.b(inboxMessage, true);
                        } else {
                            com.salesforce.marketingcloud.internal.b.b(inboxMessage, true);
                        }
                        z11 = z10;
                    }
                    hVarQ.a(inboxMessage, cVarB);
                    if (z11) {
                        c.this.f64730e.a(inboxMessage);
                    }
                }
            }
            hVarQ.a(arrayList);
            new Handler(Looper.getMainLooper()).post(new a());
        }
    }

    public c(MarketingCloudConfig marketingCloudConfig, com.salesforce.marketingcloud.storage.j jVar, String str, com.salesforce.marketingcloud.alarms.b bVar, com.salesforce.marketingcloud.http.c cVar, com.salesforce.marketingcloud.analytics.g gVar, l lVar) {
        this.f64732g = marketingCloudConfig;
        this.f64729d = jVar;
        this.f64733h = str;
        this.f64735j = bVar;
        this.f64731f = cVar;
        this.f64730e = gVar;
        this.f64736k = lVar;
    }

    public void a() {
        this.f64738n = false;
        d();
    }

    public void b() {
        this.f64738n = true;
        a(false);
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.salesforce.marketingcloud.storage.db.g.f64988e, this.f64729d.q().g(this.f64729d.b()));
            return jSONObject;
        } catch (JSONException e5) {
            com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, e5, "Failed to create our component state JSONObject.", new Object[0]);
            return null;
        }
    }

    public void d() {
        List<com.salesforce.marketingcloud.storage.h.b> listL = this.f64729d.q().l();
        int size = listL.size();
        if (size > 0) {
            ArrayList arrayList = new ArrayList(size);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("deviceId", this.f64733h);
                String strA = com.salesforce.marketingcloud.util.l.a(new Date());
                for (com.salesforce.marketingcloud.storage.h.b bVar : listL) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("actionParameters", jSONObject);
                    jSONObject2.put("messageId", bVar.f65102a);
                    jSONObject2.put("actionDate", strA);
                    jSONObject2.put("action", bVar.f65106e ? "Deleted" : "Viewed");
                    jSONArray.put(jSONObject2);
                    arrayList.add(bVar.f65102a);
                }
                com.salesforce.marketingcloud.http.b bVarA = com.salesforce.marketingcloud.http.a.f64258l.a(this.f64732g, this.f64729d.c(), com.salesforce.marketingcloud.http.a.a(this.f64732g.applicationId()), jSONArray.toString());
                bVarA.a(TextUtils.join(",", arrayList));
                this.f64731f.a(bVarA);
            } catch (JSONException e5) {
                com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, e5, "Failed to create Inbox status payload.  Status updates not sent to Marketing Cloud", new Object[0]);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void deleteMessage(@Nullable InboxMessage inboxMessage) {
        if (inboxMessage == null) {
            com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, "InboxMessage was null and could not be updated.  Call to deleteMessage() ignored.", new Object[0]);
        } else {
            com.salesforce.marketingcloud.internal.b.a(inboxMessage, true);
            deleteMessage(inboxMessage.id());
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public int getDeletedMessageCount() {
        return this.f64729d.q().a(com.salesforce.marketingcloud.storage.h.a.DELETED);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    @NonNull
    public List<InboxMessage> getDeletedMessages() {
        return this.f64729d.q().a(this.f64729d.b(), com.salesforce.marketingcloud.storage.h.a.DELETED);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public int getMessageCount() {
        return this.f64729d.q().a(com.salesforce.marketingcloud.storage.h.a.NOT_DELETED);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    @NonNull
    public List<InboxMessage> getMessages() {
        return this.f64729d.q().a(this.f64729d.b(), com.salesforce.marketingcloud.storage.h.a.NOT_DELETED);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public int getReadMessageCount() {
        return this.f64729d.q().a(com.salesforce.marketingcloud.storage.h.a.READ);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    @NonNull
    public List<InboxMessage> getReadMessages() {
        return this.f64729d.q().a(this.f64729d.b(), com.salesforce.marketingcloud.storage.h.a.READ);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public int getUnreadMessageCount() {
        return this.f64729d.q().a(com.salesforce.marketingcloud.storage.h.a.UNREAD);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    @NonNull
    public List<InboxMessage> getUnreadMessages() {
        return this.f64729d.q().a(this.f64729d.b(), com.salesforce.marketingcloud.storage.h.a.UNREAD);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public boolean isInboxEnabled() {
        return true;
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void markAllMessagesDeleted() {
        this.f64736k.b().execute(new i("delete_all", new Object[0]));
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void markAllMessagesRead() {
        this.f64736k.b().execute(new h("mark_all_read", new Object[0]));
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void refreshInbox(InboxMessageManager.InboxRefreshListener inboxRefreshListener) {
        synchronized (this.f64737l) {
            if (this.m == null) {
                this.m = inboxRefreshListener;
                com.salesforce.marketingcloud.g.d(InboxMessageManager.TAG, "Refreshing inbox messages", new Object[0]);
                a(true);
            } else {
                com.salesforce.marketingcloud.g.d(InboxMessageManager.TAG, "Refresh already in progress.", new Object[0]);
                try {
                    inboxRefreshListener.onRefreshComplete(false);
                } catch (Exception e5) {
                    com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, e5, "Error delivering Refresh Complete result to %s", inboxRefreshListener.getClass().getName());
                }
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void registerInboxResponseListener(@NonNull InboxMessageManager.InboxResponseListener inboxResponseListener) {
        if (inboxResponseListener != null) {
            synchronized (this.f64734i) {
                this.f64734i.add(inboxResponseListener);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void setMessageRead(@Nullable InboxMessage inboxMessage) {
        if (inboxMessage == null) {
            com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, "InboxMessage was null and could not be updated.  Call to setMessageRead() ignored.", new Object[0]);
        } else {
            com.salesforce.marketingcloud.internal.b.c(inboxMessage, true);
            setMessageRead(inboxMessage.id());
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void unregisterInboxResponseListener(@NonNull InboxMessageManager.InboxResponseListener inboxResponseListener) {
        synchronized (this.f64734i) {
            this.f64734i.remove(inboxResponseListener);
        }
    }

    public void a(int i10, String str) {
        com.salesforce.marketingcloud.g.c(InboxMessageManager.TAG, "Request failed: %d - %s", Integer.valueOf(i10), str);
        new Handler(Looper.getMainLooper()).post(new j());
    }

    public void b(int i10, String str) {
        com.salesforce.marketingcloud.g.c(InboxMessageManager.TAG, "Request failed: %d - %s", Integer.valueOf(i10), str);
        this.f64735j.b(com.salesforce.marketingcloud.alarms.a.b.f63806f);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void deleteMessage(@NonNull String str) {
        this.f64736k.b().execute(new f("inbox_delete", new Object[0], str));
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void setMessageRead(@NonNull String str) {
        this.f64736k.b().execute(new g("mark_read", new Object[0], str));
    }

    public void a(com.salesforce.marketingcloud.http.b bVar) {
        if (bVar.getCom.bbva.glomohybrid.logs.LogKeysKt.TAG java.lang.String() != null) {
            this.f64735j.c(com.salesforce.marketingcloud.alarms.a.b.f63806f);
            this.f64736k.b().execute(new a("inbox_status_updated", new Object[0], bVar.getCom.bbva.glomohybrid.logs.LogKeysKt.TAG java.lang.String()));
        }
    }

    @VisibleForTesting
    public void b(@NonNull List<InboxMessage> list) {
        this.f64736k.b().execute(new k("inbox_updated", new Object[0], list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.salesforce.marketingcloud.messages.inbox.c] */
    public void a(com.salesforce.marketingcloud.http.d dVar) {
        int length;
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(dVar.getBody()).optJSONArray("messages");
            ?? EmptyList = Collections.emptyList();
            if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
                EmptyList = new ArrayList(length);
                for (int i10 = 0; i10 < length; i10++) {
                    try {
                        EmptyList.add(new InboxMessage(jSONArrayOptJSONArray.getJSONObject(i10)));
                    } catch (Exception e5) {
                        com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, e5, "Failed to parse inbox message", new Object[0]);
                    }
                }
            }
            b(EmptyList);
        } catch (Exception e7) {
            com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, e7, "Failed to parse inbox messages response", new Object[0]);
            a(-1, "Failed to parse response");
        }
    }

    public void b(boolean z10) {
        synchronized (this.f64737l) {
            InboxMessageManager.InboxRefreshListener inboxRefreshListener = this.m;
            if (inboxRefreshListener != null) {
                try {
                    inboxRefreshListener.onRefreshComplete(z10);
                } catch (Exception e5) {
                    com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, e5, "InboxRefreshListener threw an exception", new Object[0]);
                }
                this.m = null;
            }
        }
    }

    public void a(InboxMessage inboxMessage) {
        this.f64736k.b().execute(new d("inbox_push_received", new Object[0], inboxMessage));
        if (this.f64738n) {
            a(false);
        }
    }

    public void a(@NonNull NotificationMessage notificationMessage) {
        if (this.f64732g.markMessageReadOnInboxNotificationOpen()) {
            this.f64736k.b().execute(new e("inbox_notification_opened", new Object[0], notificationMessage.id()));
        }
    }

    public static void a(com.salesforce.marketingcloud.storage.j jVar, com.salesforce.marketingcloud.alarms.b bVar, l lVar, boolean z10) {
        bVar.d(com.salesforce.marketingcloud.alarms.a.b.f63806f);
        if (z10) {
            lVar.b().execute(new C0262c("inbox_shutdown", new Object[0], jVar.q()));
        }
    }

    public void a(List<InboxMessage> list) {
        synchronized (this.f64734i) {
            if (!this.f64734i.isEmpty()) {
                for (InboxMessageManager.InboxResponseListener inboxResponseListener : this.f64734i) {
                    if (inboxResponseListener != null) {
                        try {
                            inboxResponseListener.onInboxMessagesChanged(list);
                        } catch (Exception e5) {
                            com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, e5, "%s threw an exception while processing the inbox messages response", inboxResponseListener.getClass().getName());
                        }
                    }
                }
            }
        }
    }

    private void a(boolean z10) {
        MarketingCloudSdk.requestSdk(new b(z10 ? com.salesforce.marketingcloud.http.a.f64257k : com.salesforce.marketingcloud.http.a.f64256j));
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void disableInbox() {
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void enableInbox() {
    }
}
