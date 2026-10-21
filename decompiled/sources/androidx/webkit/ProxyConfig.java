package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ProxyConfig {
    public static final String MATCH_ALL_SCHEMES = "*";
    public static final String MATCH_HTTP = "http";
    public static final String MATCH_HTTPS = "https";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ProxyRule> f24013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f24014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24015c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ProxyRule> f24016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<String> f24017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f24018c;

        public Builder() {
            this.f24018c = false;
            this.f24016a = new ArrayList();
            this.f24017b = new ArrayList();
        }

        @NonNull
        public Builder addBypassRule(@NonNull String str) {
            this.f24017b.add(str);
            return this;
        }

        @NonNull
        public Builder addDirect(@NonNull String str) {
            this.f24016a.add(new ProxyRule(str, "direct://"));
            return this;
        }

        @NonNull
        public Builder addProxyRule(@NonNull String str) {
            this.f24016a.add(new ProxyRule(str));
            return this;
        }

        @NonNull
        public ProxyConfig build() {
            return new ProxyConfig(this.f24016a, this.f24017b, this.f24018c);
        }

        @NonNull
        public Builder bypassSimpleHostnames() {
            return addBypassRule("<local>");
        }

        @NonNull
        public Builder removeImplicitRules() {
            return addBypassRule("<-loopback>");
        }

        @NonNull
        public Builder setReverseBypassEnabled(boolean z10) {
            this.f24018c = z10;
            return this;
        }

        @NonNull
        public Builder addDirect() {
            return addDirect(ProxyConfig.MATCH_ALL_SCHEMES);
        }

        @NonNull
        public Builder addProxyRule(@NonNull String str, @NonNull String str2) {
            this.f24016a.add(new ProxyRule(str2, str));
            return this;
        }

        public Builder(@NonNull ProxyConfig proxyConfig) {
            this.f24018c = false;
            this.f24016a = proxyConfig.getProxyRules();
            this.f24017b = proxyConfig.getBypassRules();
            this.f24018c = proxyConfig.isReverseBypassEnabled();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ProxyScheme {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ProxyConfig(@NonNull List<ProxyRule> list, @NonNull List<String> list2, boolean z10) {
        this.f24013a = list;
        this.f24014b = list2;
        this.f24015c = z10;
    }

    @NonNull
    public List<String> getBypassRules() {
        return Collections.unmodifiableList(this.f24014b);
    }

    @NonNull
    public List<ProxyRule> getProxyRules() {
        return Collections.unmodifiableList(this.f24013a);
    }

    public boolean isReverseBypassEnabled() {
        return this.f24015c;
    }

    public static final class ProxyRule {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f24019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f24020b;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public ProxyRule(@NonNull String str, @NonNull String str2) {
            this.f24019a = str;
            this.f24020b = str2;
        }

        @NonNull
        public String getSchemeFilter() {
            return this.f24019a;
        }

        @NonNull
        public String getUrl() {
            return this.f24020b;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public ProxyRule(@NonNull String str) {
            this(ProxyConfig.MATCH_ALL_SCHEMES, str);
        }
    }
}
