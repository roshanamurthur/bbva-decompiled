package net.ipsoft.amelia.sdk;

import android.os.Parcelable;
import androidx.appcompat.app.i;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseDomain implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f84537a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f84538b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f84539c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f84540d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f84541e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f84542f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f84543g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f84544h = false;

    public abstract boolean allowsConversations();

    public abstract String getCode();

    public abstract String getDomainId();

    public abstract boolean getHidden();

    public abstract String getLocaleDisplayName();

    public abstract String getLocaleLanguageTag();

    public abstract String getName();

    public abstract boolean getRequireLogin();

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ id: ");
        sb2.append(this.f84537a);
        sb2.append(", name: ");
        sb2.append(this.f84538b);
        sb2.append(", code: ");
        sb2.append(this.f84539c);
        sb2.append(", localeDisplayName: ");
        sb2.append(this.f84540d);
        sb2.append(", localeLanguageTag: ");
        sb2.append(this.f84541e);
        sb2.append(", requireLogin: ");
        sb2.append(this.f84542f);
        sb2.append(", hidden: ");
        return i.c(sb2, this.f84543g, " }");
    }
}
