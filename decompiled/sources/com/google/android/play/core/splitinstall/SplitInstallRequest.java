package com.google.android.play.core.splitinstall;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class SplitInstallRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f46257b;

    public /* synthetic */ SplitInstallRequest(Builder builder) {
        this.f46256a = new ArrayList(builder.f46258a);
        this.f46257b = new ArrayList(builder.f46259b);
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(0);
    }

    public List<Locale> getLanguages() {
        return this.f46257b;
    }

    public List<String> getModuleNames() {
        return this.f46256a;
    }

    public String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.f46256a, this.f46257b);
    }

    /* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f46258a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f46259b = new ArrayList();

        public Builder() {
        }

        @NonNull
        public Builder addLanguage(@Nullable Locale locale) {
            this.f46259b.add(locale);
            return this;
        }

        public Builder addModule(String str) {
            this.f46258a.add(str);
            return this;
        }

        @NonNull
        public SplitInstallRequest build() {
            return new SplitInstallRequest(this);
        }

        public /* synthetic */ Builder(int i10) {
        }
    }
}
