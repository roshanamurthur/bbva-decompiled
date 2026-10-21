package com.salesforce.marketingcloud.alarms;

import android.annotation.SuppressLint;
import androidx.annotation.CheckResult;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final String f63795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f63796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f63797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f63798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final String f63799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f63800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f63801g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f63802b = new C0237a("REGISTRATION", 0, 909100);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f63803c = new C0238b("ET_ANALYTICS", 1, 909102);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f63804d = new c("FETCH_REGION_MESSAGES_DAILY", 2, 909111);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f63805e = new d("FETCH_PUSH_TOKEN", 3, 909108);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f63806f = new e("UPDATE_INBOX_MESSAGE_STATUS", 4, 909110);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f63807g = new f("SYNC", 5, 909112);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f63808h = new g("IAM_IMAGE_BATCH", 6, 909113);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f63809i = new h("DEVICE_STATS", 7, 909114);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f63810j = new i("EVENTS", 8, 909115);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ b[] f63811k = a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f63812a;

        /* JADX INFO: renamed from: com.salesforce.marketingcloud.alarms.a$b$a, reason: collision with other inner class name */
        public final enum C0237a extends b {
            public C0237a(String str, int i10, int i11) {
                super(str, i10, i11);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.b
            public a b() {
                return new j(c());
            }
        }

        /* JADX INFO: renamed from: com.salesforce.marketingcloud.alarms.a$b$b, reason: collision with other inner class name */
        public final enum C0238b extends b {
            public C0238b(String str, int i10, int i11) {
                super(str, i10, i11);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.b
            public a b() {
                return new c(c());
            }
        }

        public final enum c extends b {
            public c(String str, int i10, int i11) {
                super(str, i10, i11);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.b
            public a b() {
                return new g(c());
            }
        }

        public final enum d extends b {
            public d(String str, int i10, int i11) {
                super(str, i10, i11);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.b
            public a b() {
                return new i(c());
            }
        }

        public final enum e extends b {
            public e(String str, int i10, int i11) {
                super(str, i10, i11);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.b
            public a b() {
                return new k(c());
            }
        }

        public final enum f extends b {
            public f(String str, int i10, int i11) {
                super(str, i10, i11);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.b
            public a b() {
                return new h(c());
            }
        }

        public final enum g extends b {
            public g(String str, int i10, int i11) {
                super(str, i10, i11);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.b
            public a b() {
                return new f(c());
            }
        }

        public final enum h extends b {
            public h(String str, int i10, int i11) {
                super(str, i10, i11);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.b
            public a b() {
                return new d(c());
            }
        }

        public final enum i extends b {
            public i(String str, int i10, int i11) {
                super(str, i10, i11);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.b
            public a b() {
                return new e(c());
            }
        }

        @VisibleForTesting
        public static class j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final int f63813a = 909115;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            static final int f63814b = 909114;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            static final int f63815c = 909113;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            static final int f63816d = 909112;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            static final int f63817e = 909110;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            static final int f63818f = 909109;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            static final int f63819g = 909108;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            static final int f63820h = 909111;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            static final int f63821i = 909102;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            static final int f63822j = 909101;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            static final int f63823k = 909100;
        }

        private b(String str, int i10, int i11) {
            super(str, i10);
            this.f63812a = i11;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f63811k.clone();
        }

        @CheckResult
        @Deprecated
        public boolean a(@NonNull com.salesforce.marketingcloud.storage.j jVar) {
            return true;
        }

        public abstract a b();

        public int c() {
            return this.f63812a;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{f63802b, f63803c, f63804d, f63805e, f63806f, f63807g, f63808h, f63809i, f63810j};
        }
    }

    public static final class c extends a {
        public c(int i10) {
            this(i10, "et_etanalytic_alarm_created_date", "et_etanalytic_next_alarm_interval", 60000L, 2.0d, 86400000L, true);
        }

        private c(int i10, String str, String str2, long j10, double d2, long j11, boolean z10) {
            super(i10, str, str2, j10, d2, j11, z10);
        }
    }

    public static final class d extends a {
        public d(int i10) {
            super(i10, "et_device_stats_alarm_created_date", "et_device_stats_alarm_interval", 60000L, 2.0d, 86400000L, false);
        }
    }

    public static final class e extends a {
        public e(int i10) {
            super(i10, "et_events_alarm_created_date", "et_events_alarm_interval", 60000L, 2.0d, 86400000L, false);
        }
    }

    public static final class f extends a {
        public f(int i10) {
            super(i10, "et_iam_image_cache_route_alarm_created_date", "et_iam_image_cache_route_alarm_interval", 60000L, 2.0d, 86400000L, false);
        }
    }

    public static final class g extends a {
        public g(int i10) {
            this(i10, "et_fetch_background_beacon_messages_alarm_created_date", "et_fetch_background_beacon_messages_next_alarm_interval", 86400000L, 1.0d, 86400000L, false);
        }

        private g(int i10, String str, String str2, long j10, double d2, long j11, boolean z10) {
            super(i10, str, str2, j10, d2, j11, z10);
        }
    }

    public static final class h extends a {
        public h(int i10) {
            super(i10, "et_sync_route_alarm_created_date", "et_sync_route_alarm_interval", 60000L, 2.0d, 86400000L, false);
        }
    }

    public static final class i extends a {
        public i(int i10) {
            this(i10, "et_register_for_remote_notifications_alarm_created_date", "et_register_for_remote_notifications_next_alarm_interval", 60000L, 2.0d, 86400000L, false);
        }

        private i(int i10, String str, String str2, long j10, double d2, long j11, boolean z10) {
            super(i10, str, str2, j10, d2, j11, z10);
        }
    }

    public static final class j extends a {
        public j(int i10) {
            this(i10, "et_registration_alarm_created_date", "et_registration_next_alarm_interval", 60000L, 2.0d, 86400000L, false);
        }

        private j(int i10, String str, String str2, long j10, double d2, long j11, boolean z10) {
            super(i10, str, str2, j10, d2, j11, z10);
        }
    }

    public static final class k extends a {
        public k(int i10) {
            this(i10, "et_update_inbox_message_status_alarm_created_date", "et_update_inbox_message_status_next_alarm_interval", 60000L, 2.0d, 86400000L, true);
        }

        private k(int i10, String str, String str2, long j10, double d2, long j11, boolean z10) {
            super(i10, str, str2, j10, d2, j11, z10);
        }
    }

    @VisibleForTesting
    public a(@IntRange(from = 1, to = 2147483647L) int i10, @NonNull @Size(min = 1) String str, @NonNull @Size(min = 1) String str2, @IntRange(from = 1, to = 86400000) long j10, @FloatRange(from = 1.0d, to = 10.0d) double d2, @IntRange(from = 1, to = 86400000) long j11, boolean z10) {
        this.f63800f = i10;
        this.f63799e = str;
        this.f63795a = str2;
        this.f63796b = j10;
        this.f63797c = d2;
        this.f63798d = j11;
        this.f63801g = z10;
    }

    @NonNull
    public final String a() {
        return this.f63799e;
    }

    public final int b() {
        return this.f63800f;
    }

    @NonNull
    public final String c() {
        return this.f63795a;
    }

    public final long d() {
        return this.f63796b;
    }

    public final double e() {
        return this.f63797c;
    }

    public final long f() {
        return this.f63798d;
    }

    public final boolean g() {
        return this.f63801g;
    }
}
