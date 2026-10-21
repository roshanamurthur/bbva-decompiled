package com.salesforce.marketingcloud.events.predicates;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public static final f f64212b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final f f64213c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f64214d = com.salesforce.marketingcloud.g.a("Predicate");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f64215a;

    public class a extends f {
        @Override // com.salesforce.marketingcloud.events.predicates.f
        public boolean a() {
            return true;
        }

        @Override // com.salesforce.marketingcloud.events.predicates.f
        @NonNull
        public String c() {
            return "true";
        }
    }

    public class b extends f {
        @Override // com.salesforce.marketingcloud.events.predicates.f
        public boolean a() {
            return false;
        }

        @Override // com.salesforce.marketingcloud.events.predicates.f
        @NonNull
        public String c() {
            return "false";
        }
    }

    public abstract boolean a();

    public final boolean b() {
        if (this.f64215a == null) {
            this.f64215a = Boolean.valueOf(a());
        }
        String str = f64214d;
        Object[] objArr = new Object[2];
        objArr[0] = c();
        objArr[1] = this.f64215a.booleanValue() ? "passed" : "failed";
        com.salesforce.marketingcloud.g.d(str, "%s %s", objArr);
        return this.f64215a.booleanValue();
    }

    @NonNull
    public abstract String c();
}
