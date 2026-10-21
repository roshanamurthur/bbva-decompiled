package com.salesforce.marketingcloud.events.predicates;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public abstract class h<T> extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f64217i = com.salesforce.marketingcloud.g.a("ValuePredicate");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f64218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.salesforce.marketingcloud.events.g.a f64219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f64220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f64221h;

    public h(@Nullable Object obj, @NonNull com.salesforce.marketingcloud.events.g.a aVar, @Nullable Object obj2) {
        this.f64218e = obj;
        this.f64219f = aVar;
        this.f64220g = obj2;
        this.f64221h = String.format("%s %s %s", obj, aVar, obj2);
    }

    @Nullable
    public abstract T a(Object obj);

    @Override // com.salesforce.marketingcloud.events.predicates.f
    public final boolean a() {
        try {
            return a(a(this.f64218e), this.f64219f, a(this.f64220g));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f64217i, e5, "Unable to evaluate predicate.  Returning default value of 'false'", new Object[0]);
            return false;
        }
    }

    public abstract boolean a(@Nullable T t10, @NonNull com.salesforce.marketingcloud.events.g.a aVar, @Nullable T t11) throws UnsupportedOperationException;

    @Override // com.salesforce.marketingcloud.events.predicates.f
    @NonNull
    public String c() {
        return this.f64221h;
    }
}
