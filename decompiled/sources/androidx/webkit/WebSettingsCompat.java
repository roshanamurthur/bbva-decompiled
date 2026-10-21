package androidx.webkit;

import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ApiHelperForM;
import androidx.webkit.internal.ApiHelperForN;
import androidx.webkit.internal.ApiHelperForO;
import androidx.webkit.internal.ApiHelperForQ;
import androidx.webkit.internal.WebSettingsAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
public class WebSettingsCompat {

    @Deprecated
    public static final int DARK_STRATEGY_PREFER_WEB_THEME_OVER_USER_AGENT_DARKENING = 2;

    @Deprecated
    public static final int DARK_STRATEGY_USER_AGENT_DARKENING_ONLY = 0;

    @Deprecated
    public static final int DARK_STRATEGY_WEB_THEME_DARKENING_ONLY = 1;

    @Deprecated
    public static final int FORCE_DARK_AUTO = 1;

    @Deprecated
    public static final int FORCE_DARK_OFF = 0;

    @Deprecated
    public static final int FORCE_DARK_ON = 2;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int REQUESTED_WITH_HEADER_MODE_APP_PACKAGE_NAME = 1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int REQUESTED_WITH_HEADER_MODE_NO_HEADER = 0;

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ForceDark {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ForceDarkStrategy {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface MenuItemFlags {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface RequestedWithHeaderMode {
    }

    public static WebSettingsAdapter a(WebSettings webSettings) {
        return WebViewGlueCommunicator.getCompatConverter().convertSettings(webSettings);
    }

    public static int getDisabledActionModeMenuItems(@NonNull WebSettings webSettings) {
        ApiFeature.N n7 = WebViewFeatureInternal.DISABLED_ACTION_MODE_MENU_ITEMS;
        if (n7.isSupportedByFramework()) {
            return ApiHelperForN.getDisabledActionModeMenuItems(webSettings);
        }
        if (n7.isSupportedByWebView()) {
            return a(webSettings).getDisabledActionModeMenuItems();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean getEnterpriseAuthenticationAppLinkPolicyEnabled(@NonNull WebSettings webSettings) {
        if (WebViewFeatureInternal.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY.isSupportedByWebView()) {
            return a(webSettings).getEnterpriseAuthenticationAppLinkPolicyEnabled();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Deprecated
    public static int getForceDark(@NonNull WebSettings webSettings) {
        ApiFeature.NoFramework noFramework = WebViewFeatureInternal.FORCE_DARK;
        if (noFramework.isSupportedByFramework()) {
            return ApiHelperForQ.getForceDark(webSettings);
        }
        if (noFramework.isSupportedByWebView()) {
            return a(webSettings).getForceDark();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Deprecated
    public static int getForceDarkStrategy(@NonNull WebSettings webSettings) {
        if (WebViewFeatureInternal.FORCE_DARK_STRATEGY.isSupportedByWebView()) {
            return a(webSettings).getForceDark();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean getOffscreenPreRaster(@NonNull WebSettings webSettings) {
        ApiFeature.M m = WebViewFeatureInternal.OFF_SCREEN_PRERASTER;
        if (m.isSupportedByFramework()) {
            return ApiHelperForM.getOffscreenPreRaster(webSettings);
        }
        if (m.isSupportedByWebView()) {
            return a(webSettings).getOffscreenPreRaster();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static int getRequestedWithHeaderMode(@NonNull WebSettings webSettings) {
        if (WebViewFeatureInternal.REQUESTED_WITH_HEADER_CONTROL.isSupportedByWebView()) {
            return a(webSettings).getRequestedWithHeaderMode();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean getSafeBrowsingEnabled(@NonNull WebSettings webSettings) {
        ApiFeature.O o2 = WebViewFeatureInternal.SAFE_BROWSING_ENABLE;
        if (o2.isSupportedByFramework()) {
            return ApiHelperForO.getSafeBrowsingEnabled(webSettings);
        }
        if (o2.isSupportedByWebView()) {
            return a(webSettings).getSafeBrowsingEnabled();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @RequiresApi(29)
    public static boolean isAlgorithmicDarkeningAllowed(@NonNull WebSettings webSettings) {
        if (WebViewFeatureInternal.ALGORITHMIC_DARKENING.isSupportedByWebView()) {
            return a(webSettings).isAlgorithmicDarkeningAllowed();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @RequiresApi(29)
    public static void setAlgorithmicDarkeningAllowed(@NonNull WebSettings webSettings, boolean z10) {
        if (!WebViewFeatureInternal.ALGORITHMIC_DARKENING.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        a(webSettings).setAlgorithmicDarkeningAllowed(z10);
    }

    public static void setDisabledActionModeMenuItems(@NonNull WebSettings webSettings, int i10) {
        ApiFeature.N n7 = WebViewFeatureInternal.DISABLED_ACTION_MODE_MENU_ITEMS;
        if (n7.isSupportedByFramework()) {
            ApiHelperForN.setDisabledActionModeMenuItems(webSettings, i10);
        } else {
            if (!n7.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a(webSettings).setDisabledActionModeMenuItems(i10);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void setEnterpriseAuthenticationAppLinkPolicyEnabled(@NonNull WebSettings webSettings, boolean z10) {
        if (!WebViewFeatureInternal.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        a(webSettings).setEnterpriseAuthenticationAppLinkPolicyEnabled(z10);
    }

    @Deprecated
    public static void setForceDark(@NonNull WebSettings webSettings, int i10) {
        ApiFeature.NoFramework noFramework = WebViewFeatureInternal.FORCE_DARK;
        if (noFramework.isSupportedByFramework()) {
            ApiHelperForQ.setForceDark(webSettings, i10);
        } else {
            if (!noFramework.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a(webSettings).setForceDark(i10);
        }
    }

    @Deprecated
    public static void setForceDarkStrategy(@NonNull WebSettings webSettings, int i10) {
        if (!WebViewFeatureInternal.FORCE_DARK_STRATEGY.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        a(webSettings).setForceDarkStrategy(i10);
    }

    public static void setOffscreenPreRaster(@NonNull WebSettings webSettings, boolean z10) {
        ApiFeature.M m = WebViewFeatureInternal.OFF_SCREEN_PRERASTER;
        if (m.isSupportedByFramework()) {
            ApiHelperForM.setOffscreenPreRaster(webSettings, z10);
        } else {
            if (!m.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a(webSettings).setOffscreenPreRaster(z10);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void setRequestedWithHeaderMode(@NonNull WebSettings webSettings, int i10) {
        if (!WebViewFeatureInternal.REQUESTED_WITH_HEADER_CONTROL.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        a(webSettings).setRequestedWithHeaderMode(i10);
    }

    public static void setSafeBrowsingEnabled(@NonNull WebSettings webSettings, boolean z10) {
        ApiFeature.O o2 = WebViewFeatureInternal.SAFE_BROWSING_ENABLE;
        if (o2.isSupportedByFramework()) {
            ApiHelperForO.setSafeBrowsingEnabled(webSettings, z10);
        } else {
            if (!o2.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a(webSettings).setSafeBrowsingEnabled(z10);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void setWillSuppressErrorPage(@NonNull WebSettings webSettings, boolean z10) {
        if (!WebViewFeatureInternal.SUPPRESS_ERROR_PAGE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        a(webSettings).setWillSuppressErrorPage(z10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean willSuppressErrorPage(@NonNull WebSettings webSettings) {
        if (WebViewFeatureInternal.SUPPRESS_ERROR_PAGE.isSupportedByWebView()) {
            return a(webSettings).willSuppressErrorPage();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
