package androidx.webkit;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class WebMessageCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebMessagePortCompat[] f24031b;

    public WebMessageCompat(@Nullable String str) {
        this.f24030a = str;
    }

    @Nullable
    public String getData() {
        return this.f24030a;
    }

    @Nullable
    public WebMessagePortCompat[] getPorts() {
        return this.f24031b;
    }

    public WebMessageCompat(@Nullable String str, @Nullable WebMessagePortCompat[] webMessagePortCompatArr) {
        this.f24030a = str;
        this.f24031b = webMessagePortCompatArr;
    }
}
