package com.huawei.hms.feature.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class FeatureInstallRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f50411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Locale> f50412b;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f50413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<Locale> f50414b;

        private Builder() {
            this.f50413a = new ArrayList();
            this.f50414b = new ArrayList();
        }

        public Builder addLanguage(Locale locale) {
            this.f50414b.add(locale);
            return this;
        }

        public Builder addModule(String str) {
            this.f50413a.add(str);
            return this;
        }

        public FeatureInstallRequest build() {
            return new FeatureInstallRequest(this);
        }
    }

    private FeatureInstallRequest(Builder builder) {
        this.f50411a = new ArrayList(builder.f50413a);
        this.f50412b = new ArrayList(builder.f50414b);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final List<Locale> getLanguages() {
        return this.f50412b;
    }

    public List<String> getModuleNames() {
        return this.f50411a;
    }
}
