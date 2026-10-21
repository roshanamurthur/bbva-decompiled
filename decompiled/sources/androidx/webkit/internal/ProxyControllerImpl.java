package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.ProxyConfig;
import androidx.webkit.ProxyController;
import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyControllerImpl extends ProxyController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ProxyControllerBoundaryInterface f24059a;

    @NonNull
    @VisibleForTesting
    public static String[][] proxyRulesToStringArray(@NonNull List<ProxyConfig.ProxyRule> list) {
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, list.size(), 2);
        for (int i10 = 0; i10 < list.size(); i10++) {
            strArr[i10][0] = list.get(i10).getSchemeFilter();
            strArr[i10][1] = list.get(i10).getUrl();
        }
        return strArr;
    }

    @Override // androidx.webkit.ProxyController
    public void clearProxyOverride(@NonNull Executor executor, @NonNull Runnable runnable) {
        if (!WebViewFeatureInternal.PROXY_OVERRIDE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (this.f24059a == null) {
            this.f24059a = WebViewGlueCommunicator.getFactory().getProxyController();
        }
        this.f24059a.clearProxyOverride(runnable, executor);
    }

    @Override // androidx.webkit.ProxyController
    public void setProxyOverride(@NonNull ProxyConfig proxyConfig, @NonNull Executor executor, @NonNull Runnable runnable) {
        ApiFeature.NoFramework noFramework = WebViewFeatureInternal.PROXY_OVERRIDE;
        ApiFeature.NoFramework noFramework2 = WebViewFeatureInternal.PROXY_OVERRIDE_REVERSE_BYPASS;
        String[][] strArrProxyRulesToStringArray = proxyRulesToStringArray(proxyConfig.getProxyRules());
        String[] strArr = (String[]) proxyConfig.getBypassRules().toArray(new String[0]);
        if (noFramework.isSupportedByWebView() && !proxyConfig.isReverseBypassEnabled()) {
            if (this.f24059a == null) {
                this.f24059a = WebViewGlueCommunicator.getFactory().getProxyController();
            }
            this.f24059a.setProxyOverride(strArrProxyRulesToStringArray, strArr, runnable, executor);
        } else {
            if (!noFramework.isSupportedByWebView() || !noFramework2.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            if (this.f24059a == null) {
                this.f24059a = WebViewGlueCommunicator.getFactory().getProxyController();
            }
            this.f24059a.setProxyOverride(strArrProxyRulesToStringArray, strArr, runnable, executor, proxyConfig.isReverseBypassEnabled());
        }
    }
}
