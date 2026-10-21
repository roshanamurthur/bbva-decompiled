package androidx.webkit.internal;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ApiFeature implements ConditionallySupportedFeature {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f24047c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24049b;

    public static final class M extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public boolean isSupportedByFramework() {
            return true;
        }
    }

    public static final class N extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    public static final class NoFramework extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public boolean isSupportedByFramework() {
            return false;
        }
    }

    public static final class O extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    public static final class O_MR1 extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    public static final class P extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public static final class Q extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashSet f24050a = new HashSet(Arrays.asList(WebViewGlueCommunicator.getFactory().getWebViewFeatures()));
    }

    public ApiFeature(@NonNull String str, @NonNull String str2) {
        this.f24048a = str;
        this.f24049b = str2;
        f24047c.add(this);
    }

    @NonNull
    @VisibleForTesting
    public static Set<String> getWebViewApkFeaturesForTesting() {
        return a.f24050a;
    }

    @NonNull
    public static Set<ApiFeature> values() {
        return Collections.unmodifiableSet(f24047c);
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    @NonNull
    public String getPublicFeatureName() {
        return this.f24048a;
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public boolean isSupported() {
        return isSupportedByFramework() || isSupportedByWebView();
    }

    public abstract boolean isSupportedByFramework();

    @ChecksSdkIntAtLeast(api = 21)
    public boolean isSupportedByWebView() {
        return BoundaryInterfaceReflectionUtil.containsFeature(a.f24050a, this.f24049b);
    }
}
