package com.salesforce.marketingcloud.messages.iam;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mastercard.sonic.androidsvg.SVGParser;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.media.o;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class m implements InAppMessageManager, i, com.salesforce.marketingcloud.alarms.b.InterfaceC0239b, com.salesforce.marketingcloud.media.b.a, com.salesforce.marketingcloud.events.f {
    private static final String A = "minDurationBetweenMessages";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f64683v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @VisibleForTesting
    private static final int f64684w = 111;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final String f64685x = com.salesforce.marketingcloud.g.a("InAppMessageManager");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f64686y = "messagesAttemptedInSession";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f64687z = "maxMessagesPerSession";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.salesforce.marketingcloud.alarms.b f64688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final UrlHandler f64689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.salesforce.marketingcloud.internal.l f64690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Context f64691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final com.salesforce.marketingcloud.storage.j f64692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final com.salesforce.marketingcloud.analytics.f f64693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Object f64694j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.salesforce.marketingcloud.config.a f64695k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Typeface f64696l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.salesforce.marketingcloud.media.b f64697n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InAppMessage f64698o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicInteger f64699p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @VisibleForTesting
    final AtomicInteger f64700q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @VisibleForTesting
    final Handler f64701r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Handler f64702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @GuardedBy("lock")
    InAppMessageManager.EventListener f64703t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    o f64704u;

    public class a extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f64705b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.f64705b = str2;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            InAppMessage inAppMessageA = m.this.f64692h.p().a(Collections.singletonList(this.f64705b), m.this.f64692h.b());
            if (inAppMessageA != null) {
                m.this.d(inAppMessageA);
            } else {
                com.salesforce.marketingcloud.g.a(m.f64685x, "Unable to find InAppMessage for message id [%s]", this.f64705b);
            }
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InAppMessage f64707b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                m.this.f64703t.didShowMessage(bVar.f64707b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, InAppMessage inAppMessage) {
            super(str, objArr);
            this.f64707b = inAppMessage;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            m.this.f64692h.p().a(this.f64707b);
            m.this.f64693i.a(this.f64707b);
            m.this.d();
            synchronized (m.this.f64694j) {
                if (m.this.f64703t != null) {
                    try {
                        new Handler(Looper.getMainLooper()).post(new a());
                    } catch (Exception e5) {
                        com.salesforce.marketingcloud.g.b(m.f64685x, e5, "InAppMessage EventListener threw an exception", new Object[0]);
                    }
                }
            }
        }
    }

    public class c extends com.salesforce.marketingcloud.internal.g {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            m mVar = m.this;
            mVar.a(mVar.f64692h.p().c(m.this.f64692h.b()));
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InAppMessage f64711a;

        public d(InAppMessage inAppMessage) {
            this.f64711a = inAppMessage;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (m.this.f64694j) {
                try {
                    InAppMessageManager.EventListener eventListener = m.this.f64703t;
                    if (eventListener != null) {
                        try {
                            if (!eventListener.shouldShowMessage(this.f64711a)) {
                                com.salesforce.marketingcloud.g.a(m.f64685x, "InAppMessage EventListener[%s] returned false for shouldShowMessage [%s]", m.this.f64703t.getClass().getName(), this.f64711a.id());
                                return;
                            }
                        } catch (Exception e5) {
                            com.salesforce.marketingcloud.g.b(m.f64685x, e5, "InAppMessage EventListener threw exception during shouldShowMessage", new Object[0]);
                        }
                    }
                    try {
                        Class<? extends f> clsA = m.this.a(this.f64711a);
                        if (clsA != null) {
                            m mVar = m.this;
                            if (mVar.a(clsA, this.f64711a, mVar.f64691g)) {
                                m.this.f64691g.startActivity(new Intent(m.this.f64691g, clsA).setFlags(276889600).putExtra("messageHandler", new k(this.f64711a)));
                            }
                        } else {
                            com.salesforce.marketingcloud.g.a(m.f64685x, "Not supported", new Object[0]);
                        }
                    } catch (Exception e7) {
                        com.salesforce.marketingcloud.g.b(m.f64685x, e7, "Failed to display InAppMessage [%s]", this.f64711a.id());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64713a;

        static {
            int[] iArr = new int[InAppMessage.Type.values().length];
            f64713a = iArr;
            try {
                iArr[InAppMessage.Type.bannerTop.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64713a[InAppMessage.Type.bannerBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64713a[InAppMessage.Type.modal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64713a[InAppMessage.Type.fullImageFill.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64713a[InAppMessage.Type.full.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public m(Context context, com.salesforce.marketingcloud.storage.j jVar, com.salesforce.marketingcloud.alarms.b bVar, o oVar, UrlHandler urlHandler, com.salesforce.marketingcloud.internal.l lVar, com.salesforce.marketingcloud.analytics.f fVar, @NonNull Handler handler, @NonNull com.salesforce.marketingcloud.config.a aVar) {
        this.f64691g = context;
        this.f64692h = jVar;
        this.f64688d = bVar;
        this.f64704u = oVar;
        this.f64689e = urlHandler;
        this.f64693i = fVar;
        this.f64690f = lVar;
        this.f64695k = aVar;
        bVar.a(this, com.salesforce.marketingcloud.alarms.a.b.f63808h);
        this.f64700q = new AtomicInteger();
        this.f64699p = new AtomicInteger();
        this.f64701r = new Handler(Looper.getMainLooper());
        this.f64702s = handler;
    }

    public Class<? extends f> a(InAppMessage inAppMessage) {
        int i10 = e.f64713a[inAppMessage.type().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return IamBannerActivity.class;
        }
        if (i10 == 3) {
            return IamModalActivity.class;
        }
        if (i10 == 4) {
            return IamFullImageFillActivity.class;
        }
        if (i10 != 5) {
            return null;
        }
        return IamFullscreenActivity.class;
    }

    @Nullable
    public String b(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("id");
        String strOptString2 = jSONObject.optString("activityInstanceId");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return "";
        }
        String strOptString3 = jSONObject.optString("endDateUtc", null);
        if (strOptString3 != null) {
            try {
                if (com.salesforce.marketingcloud.util.l.f(strOptString3).getTime() < System.currentTimeMillis()) {
                    return "ExpiredMessage";
                }
            } catch (Exception unused) {
                return "InvalidDate";
            }
        }
        String strOptString4 = jSONObject.optString("startDateUtc", null);
        if (strOptString4 != null && a(strOptString4)) {
            return "InvalidDate";
        }
        String strOptString5 = jSONObject.optString("modifiedDateUtc", null);
        if (strOptString5 == null) {
            return "NoModifiedDate";
        }
        if (a(strOptString5)) {
            return "InvalidDate";
        }
        try {
            InAppMessage.Type.valueOf(jSONObject.getString("type"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(SVGParser.XML_STYLESHEET_ATTR_MEDIA);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("title");
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("body");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("buttons");
            if (jSONObjectOptJSONObject == null && jSONObjectOptJSONObject2 == null && jSONObjectOptJSONObject3 == null && (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0)) {
                return "NoContent";
            }
            if (jSONObjectOptJSONObject != null) {
                Object objOpt = jSONObjectOptJSONObject.opt("url");
                if (!(objOpt instanceof String) || TextUtils.isEmpty((String) objOpt)) {
                    return "InvalidMedia";
                }
            }
            if (jSONObjectOptJSONObject2 != null && TextUtils.isEmpty(jSONObjectOptJSONObject2.optString("text", null))) {
                return "InvalidTitle";
            }
            if (jSONObjectOptJSONObject3 != null && TextUtils.isEmpty(jSONObjectOptJSONObject3.optString("text", null))) {
                return "InvalidBody";
            }
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject4 == null || TextUtils.isEmpty(jSONObjectOptJSONObject4.optString("id")) || TextUtils.isEmpty(jSONObjectOptJSONObject4.optString("text"))) {
                        return "InvalidButton";
                    }
                }
            }
            return null;
        } catch (Exception unused2) {
            return "NoMessageType";
        }
    }

    public void c() {
        this.f64702s.removeCallbacksAndMessages(null);
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    public boolean canDisplay(@NonNull InAppMessage inAppMessage) {
        InAppMessage inAppMessage2 = this.f64698o;
        if (inAppMessage2 == null) {
            this.f64690f.b().execute(new b("can_display", new Object[0], inAppMessage));
            this.f64698o = inAppMessage;
        } else if (inAppMessage != inAppMessage2) {
            com.salesforce.marketingcloud.g.a(f64685x, "In App Message [%s] not displayed because [%s] is currently being displayed", inAppMessage.id(), this.f64698o.id());
            return false;
        }
        return true;
    }

    @VisibleForTesting
    public void d() {
        this.f64700q.incrementAndGet();
        int i10 = this.f64692h.f().getInt(com.salesforce.marketingcloud.events.c.f64149u, 0);
        if (i10 > 0) {
            this.f64701r.sendMessageDelayed(this.f64701r.obtainMessage(111), TimeUnit.SECONDS.toMillis(i10));
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    public int getStatusBarColor() {
        return this.m;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    @Nullable
    public Typeface getTypeface() {
        return this.f64696l;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    public void handleMessageFinished(@NonNull InAppMessage inAppMessage, @NonNull j jVar) {
        InAppMessage inAppMessage2 = this.f64698o;
        if (inAppMessage2 != null && inAppMessage2.id().equals(inAppMessage.id())) {
            com.salesforce.marketingcloud.analytics.f fVar = this.f64693i;
            if (fVar != null) {
                fVar.a(inAppMessage, jVar);
            }
            synchronized (this.f64694j) {
                InAppMessageManager.EventListener eventListener = this.f64703t;
                if (eventListener != null) {
                    try {
                        eventListener.didCloseMessage(inAppMessage);
                    } catch (Exception e5) {
                        com.salesforce.marketingcloud.g.b(f64685x, e5, "InAppMessageEventListener threw an exception", new Object[0]);
                    }
                }
            }
        }
        this.f64698o = null;
    }

    @Override // com.salesforce.marketingcloud.events.f
    public void handleOutcomes(@NonNull Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        String str = f64685x;
        com.salesforce.marketingcloud.g.d(str, "Resolving IAM from outcomes %s", collection.toString());
        InAppMessage inAppMessageA = this.f64692h.p().a(collection, this.f64692h.b());
        if (inAppMessageA == null) {
            com.salesforce.marketingcloud.g.d(str, "No message resolved.", new Object[0]);
        } else {
            com.salesforce.marketingcloud.g.d(str, "Outcomes resolved to message[%s]", inAppMessageA.id());
            d(inAppMessageA);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    public o imageHandler() {
        return this.f64704u;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.InAppMessageManager
    public void setInAppMessageListener(@Nullable InAppMessageManager.EventListener eventListener) {
        synchronized (this.f64694j) {
            this.f64703t = eventListener;
        }
    }

    @Override // com.salesforce.marketingcloud.messages.iam.InAppMessageManager
    public void setStatusBarColor(int i10) {
        this.m = i10;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.InAppMessageManager
    public void setTypeface(@Nullable Typeface typeface) {
        this.f64696l = typeface;
    }

    @Override // com.salesforce.marketingcloud.messages.iam.InAppMessageManager
    public void showMessage(@NonNull String str) {
        if (str == null) {
            return;
        }
        this.f64690f.b().execute(new a("iam_showMessage", new Object[0], str));
    }

    @Override // com.salesforce.marketingcloud.messages.iam.i
    public UrlHandler urlHandler() {
        return this.f64689e;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messages", this.f64692h.p().b(this.f64692h.b()));
            InAppMessageManager.EventListener eventListener = this.f64703t;
            if (eventListener != null) {
                jSONObject.put("eventListener", eventListener.getClass().getName());
            }
            jSONObject.put("subscriberToken", this.f64692h.c().getString(com.salesforce.marketingcloud.storage.c.f64957j, AbstractJsonLexerKt.NULL));
            jSONObject.put("custom_font_set", this.f64696l != null);
            jSONObject.put("status_bar_color", this.m);
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f64685x, e5, "Unable to compile componentState for InAppMessageManager", new Object[0]);
        }
        return jSONObject;
    }

    public void b() {
        this.f64700q.set(0);
        this.f64699p.set(0);
        this.f64701r.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007d A[Catch: Exception -> 0x0083, TRY_LEAVE, TryCatch #2 {Exception -> 0x0083, blocks: (B:22:0x0075, B:24:0x007d), top: B:36:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @VisibleForTesting
    public boolean c(@NonNull InAppMessage inAppMessage) {
        boolean z10;
        boolean z11;
        AtomicInteger atomicInteger;
        if (inAppMessage.displayLimitOverride()) {
            com.salesforce.marketingcloud.g.a(f64685x, "InAppMessage [%s] has displayLimit Override set. The message will not honour displayLimit settings", inAppMessage.id());
            return false;
        }
        int i10 = this.f64692h.f().getInt(com.salesforce.marketingcloud.events.c.f64148t, Integer.MAX_VALUE);
        try {
            JSONObject jSONObject = new JSONObject();
            int i11 = this.f64700q.get();
            String str = f64687z;
            try {
                if (i11 < i10) {
                    if (this.f64701r.hasMessages(111)) {
                        jSONObject.put(A, this.f64692h.f().getInt(com.salesforce.marketingcloud.events.c.f64149u, 0));
                        atomicInteger = this.f64699p;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        return z11;
                    }
                    try {
                        if (this.f64695k.h()) {
                            return z11;
                        }
                        this.f64693i.a(inAppMessage, jSONObject);
                        return z11;
                    } catch (Exception e5) {
                        z10 = z11;
                        e = e5;
                        com.salesforce.marketingcloud.g.b(f64685x, e, "Failed to log message Debug Analytics for IAM %s", inAppMessage.id());
                        return z10;
                    }
                }
                jSONObject.put(f64687z, this.f64692h.f().getInt(com.salesforce.marketingcloud.events.c.f64148t, 0));
                str = f64686y;
                atomicInteger = this.f64699p;
                jSONObject.put(str, atomicInteger.incrementAndGet());
                z11 = true;
                if (z11) {
                    return z11;
                }
                if (this.f64695k.h()) {
                    return z11;
                }
                this.f64693i.a(inAppMessage, jSONObject);
                return z11;
            } catch (Exception e7) {
                e = e7;
                z10 = true;
            }
        } catch (Exception e10) {
            e = e10;
            z10 = false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void d(@Nullable InAppMessage inAppMessage) {
        if (inAppMessage == null || c(inAppMessage)) {
            return;
        }
        this.f64702s.postDelayed(new d(inAppMessage), TimeUnit.SECONDS.toMillis(inAppMessage.messageDelaySec()));
    }

    @Override // com.salesforce.marketingcloud.alarms.b.InterfaceC0239b
    public void a(@NonNull com.salesforce.marketingcloud.alarms.a.b bVar) {
        if (bVar == com.salesforce.marketingcloud.alarms.a.b.f63808h) {
            this.f64690f.b().execute(new c("iam_image_cache", new Object[0]));
        }
    }

    public void b(InAppMessage inAppMessage) {
        try {
            this.f64693i.b(inAppMessage);
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f64685x, e5, "Failed to log download analytics for IAM %s", inAppMessage.id());
        }
    }

    public void a(@NonNull List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        com.salesforce.marketingcloud.media.b bVar = this.f64697n;
        if (bVar != null) {
            bVar.b();
        }
        com.salesforce.marketingcloud.media.b bVarA = this.f64704u.a(list);
        this.f64697n = bVarA;
        bVarA.a(this);
    }

    public void b(boolean z10) {
        this.f64688d.e(com.salesforce.marketingcloud.alarms.a.b.f63808h);
        this.f64701r.removeCallbacksAndMessages(null);
        com.salesforce.marketingcloud.media.b bVar = this.f64697n;
        if (bVar != null) {
            bVar.b();
        }
        if (z10) {
            com.salesforce.marketingcloud.storage.g gVarP = this.f64692h.p();
            this.f64704u.a((Collection<String>) gVarP.c(this.f64692h.b()));
            gVarP.a(Collections.emptyList());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @WorkerThread
    public void a(JSONObject jSONObject) {
        if (jSONObject.optInt("version") != 1) {
            com.salesforce.marketingcloud.g.b(f64685x, "Unable to handle sync payload due to version mismatch", new Object[0]);
            return;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(FirebaseAnalytics.Param.ITEMS);
            int length = jSONArray.length();
            com.salesforce.marketingcloud.g.a(f64685x, "%d in app message(s) received from sync.", Integer.valueOf(length));
            TreeSet treeSet = new TreeSet();
            com.salesforce.marketingcloud.storage.g gVarP = this.f64692h.p();
            com.salesforce.marketingcloud.util.c cVarB = this.f64692h.b();
            List<String> listC = gVarP.c(cVarB);
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    String strB = b(jSONObject2);
                    if (strB == null) {
                        InAppMessage inAppMessage = new InAppMessage(jSONObject2);
                        if (gVarP.a(inAppMessage, cVarB) == 1) {
                            b(inAppMessage);
                        }
                        gVarP.b(inAppMessage.id(), jSONObject2.optInt("displayCount", 0));
                        treeSet.add(inAppMessage.id());
                    } else if (!strB.isEmpty()) {
                        this.f64693i.a(jSONObject2.optString("id"), jSONObject2.optString("activityInstanceId"), Collections.singletonList(strB));
                    }
                } catch (Exception e5) {
                    com.salesforce.marketingcloud.g.b(f64685x, e5, "Unable to parse in app message payload", new Object[0]);
                }
            }
            gVarP.a(treeSet);
            List<String> listC2 = gVarP.c(cVarB);
            a(listC2);
            TreeSet treeSet2 = new TreeSet(listC);
            treeSet2.removeAll(listC2);
            this.f64704u.a((Collection<String>) treeSet2);
        } catch (JSONException e7) {
            com.salesforce.marketingcloud.g.b(f64685x, e7, "Unable to get InAppMessages from sync payload", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.media.b.a
    public void a(boolean z10) {
        if (z10) {
            this.f64688d.d(com.salesforce.marketingcloud.alarms.a.b.f63808h);
        } else {
            this.f64688d.b(com.salesforce.marketingcloud.alarms.a.b.f63808h);
        }
    }

    public boolean a(Class<? extends f> cls, InAppMessage inAppMessage, Context context) throws ClassNotFoundException {
        return (cls == Class.forName(IamFullscreenActivity.class.getName()) && inAppMessage.type() == InAppMessage.Type.fullImageFill && context.getResources().getConfiguration().orientation != 1) ? false : true;
    }

    private boolean a(String str) {
        try {
            com.salesforce.marketingcloud.util.l.f(str);
            return false;
        } catch (Exception unused) {
            return true;
        }
    }
}
