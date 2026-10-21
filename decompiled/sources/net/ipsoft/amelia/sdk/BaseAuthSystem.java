package net.ipsoft.amelia.sdk;

import ad.d;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseAuthSystem implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f84531a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f84532b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f84533c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f84534d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f84535e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f84536f = null;

    public abstract String getCustomProviderClass();

    public abstract String getIdentifier();

    public abstract boolean getImmediate();

    public abstract String getLoginPath();

    public abstract String getName();

    public abstract boolean getRedirect();

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ redirect: ");
        sb2.append(this.f84531a);
        sb2.append(", immediate: ");
        sb2.append(this.f84532b);
        sb2.append(", identifier: ");
        sb2.append(this.f84533c);
        sb2.append(", name: ");
        sb2.append(this.f84534d);
        sb2.append(",  customProviderClass: ");
        sb2.append(this.f84535e);
        sb2.append(", loginPath: ");
        return d.f(sb2, this.f84536f, " }");
    }
}
