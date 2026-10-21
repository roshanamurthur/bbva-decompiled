package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TracingConfig {
    public static final int CATEGORIES_ALL = 1;
    public static final int CATEGORIES_ANDROID_WEBVIEW = 2;
    public static final int CATEGORIES_FRAME_VIEWER = 64;
    public static final int CATEGORIES_INPUT_LATENCY = 8;
    public static final int CATEGORIES_JAVASCRIPT_AND_RENDERING = 32;
    public static final int CATEGORIES_NONE = 0;
    public static final int CATEGORIES_RENDERING = 16;
    public static final int CATEGORIES_WEB_DEVELOPER = 4;
    public static final int RECORD_CONTINUOUSLY = 1;
    public static final int RECORD_UNTIL_FULL = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f24024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24025c;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface PredefinedCategories {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface TracingMode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public TracingConfig(int i10, @NonNull List<String> list, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f24024b = arrayList;
        this.f24023a = i10;
        arrayList.addAll(list);
        this.f24025c = i11;
    }

    @NonNull
    public List<String> getCustomIncludedCategories() {
        return this.f24024b;
    }

    public int getPredefinedCategories() {
        return this.f24023a;
    }

    public int getTracingMode() {
        return this.f24025c;
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24026a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f24027b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24028c = 1;

        @NonNull
        public Builder addCategories(@NonNull int... iArr) {
            for (int i10 : iArr) {
                this.f24026a = i10 | this.f24026a;
            }
            return this;
        }

        @NonNull
        public TracingConfig build() {
            return new TracingConfig(this.f24026a, this.f24027b, this.f24028c);
        }

        @NonNull
        public Builder setTracingMode(int i10) {
            this.f24028c = i10;
            return this;
        }

        @NonNull
        public Builder addCategories(@NonNull String... strArr) {
            this.f24027b.addAll(Arrays.asList(strArr));
            return this;
        }

        @NonNull
        public Builder addCategories(@NonNull Collection<String> collection) {
            this.f24027b.addAll(collection);
            return this;
        }
    }
}
