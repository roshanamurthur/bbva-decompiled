package com.google.firebase.dynamiclinks;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bbva.cellscore.helper.WebHelperKt;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinksImpl;

/* JADX INFO: loaded from: classes10.dex */
public final class DynamicLink {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f48317a;

    public static final class GoogleAnalyticsParameters {

        @VisibleForTesting
        public static final String KEY_UTM_CAMPAIGN = "utm_campaign";

        @VisibleForTesting
        public static final String KEY_UTM_CONTENT = "utm_content";

        @VisibleForTesting
        public static final String KEY_UTM_MEDIUM = "utm_medium";

        @VisibleForTesting
        public static final String KEY_UTM_SOURCE = "utm_source";

        @VisibleForTesting
        public static final String KEY_UTM_TERM = "utm_term";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bundle f48323a;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Bundle f48324a;

            public Builder() {
                this.f48324a = new Bundle();
            }

            @NonNull
            public GoogleAnalyticsParameters build() {
                GoogleAnalyticsParameters googleAnalyticsParameters = new GoogleAnalyticsParameters();
                googleAnalyticsParameters.f48323a = this.f48324a;
                return googleAnalyticsParameters;
            }

            @NonNull
            public String getCampaign() {
                return this.f48324a.getString("utm_campaign", "");
            }

            @NonNull
            public String getContent() {
                return this.f48324a.getString(GoogleAnalyticsParameters.KEY_UTM_CONTENT, "");
            }

            @NonNull
            public String getMedium() {
                return this.f48324a.getString("utm_medium", "");
            }

            @NonNull
            public String getSource() {
                return this.f48324a.getString("utm_source", "");
            }

            @NonNull
            public String getTerm() {
                return this.f48324a.getString(GoogleAnalyticsParameters.KEY_UTM_TERM, "");
            }

            @NonNull
            public Builder setCampaign(@NonNull String str) {
                this.f48324a.putString("utm_campaign", str);
                return this;
            }

            @NonNull
            public Builder setContent(@NonNull String str) {
                this.f48324a.putString(GoogleAnalyticsParameters.KEY_UTM_CONTENT, str);
                return this;
            }

            @NonNull
            public Builder setMedium(@NonNull String str) {
                this.f48324a.putString("utm_medium", str);
                return this;
            }

            @NonNull
            public Builder setSource(@NonNull String str) {
                this.f48324a.putString("utm_source", str);
                return this;
            }

            @NonNull
            public Builder setTerm(@NonNull String str) {
                this.f48324a.putString(GoogleAnalyticsParameters.KEY_UTM_TERM, str);
                return this;
            }

            public Builder(@NonNull String str, @NonNull String str2, @NonNull String str3) {
                Bundle bundle = new Bundle();
                this.f48324a = bundle;
                bundle.putString("utm_source", str);
                bundle.putString("utm_medium", str2);
                bundle.putString("utm_campaign", str3);
            }
        }
    }

    public static final class IosParameters {

        @VisibleForTesting
        public static final String KEY_IOS_APP_STORE_ID = "isi";

        @VisibleForTesting
        public static final String KEY_IOS_BUNDLE_ID = "ibi";

        @VisibleForTesting
        public static final String KEY_IOS_CUSTOM_SCHEME = "ius";

        @VisibleForTesting
        public static final String KEY_IOS_FALLBACK_LINK = "ifl";

        @VisibleForTesting
        public static final String KEY_IOS_MINIMUM_VERSION = "imv";

        @VisibleForTesting
        public static final String KEY_IPAD_BUNDLE_ID = "ipbi";

        @VisibleForTesting
        public static final String KEY_IPAD_FALLBACK_LINK = "ipfl";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f48325a;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Bundle f48326a;

            public Builder(@NonNull String str) {
                Bundle bundle = new Bundle();
                this.f48326a = bundle;
                bundle.putString(IosParameters.KEY_IOS_BUNDLE_ID, str);
            }

            @NonNull
            public IosParameters build() {
                return new IosParameters(this.f48326a);
            }

            @NonNull
            public String getAppStoreId() {
                return this.f48326a.getString(IosParameters.KEY_IOS_APP_STORE_ID, "");
            }

            @NonNull
            public String getCustomScheme() {
                return this.f48326a.getString(IosParameters.KEY_IOS_CUSTOM_SCHEME, "");
            }

            @NonNull
            public String getIpadBundleId() {
                return this.f48326a.getString(IosParameters.KEY_IPAD_BUNDLE_ID, "");
            }

            @NonNull
            public Uri getIpadFallbackUrl() {
                Uri uri = (Uri) this.f48326a.getParcelable(IosParameters.KEY_IPAD_FALLBACK_LINK);
                return uri == null ? Uri.EMPTY : uri;
            }

            @NonNull
            public String getMinimumVersion() {
                return this.f48326a.getString(IosParameters.KEY_IOS_MINIMUM_VERSION, "");
            }

            @NonNull
            public Builder setAppStoreId(@NonNull String str) {
                this.f48326a.putString(IosParameters.KEY_IOS_APP_STORE_ID, str);
                return this;
            }

            @NonNull
            public Builder setCustomScheme(@NonNull String str) {
                this.f48326a.putString(IosParameters.KEY_IOS_CUSTOM_SCHEME, str);
                return this;
            }

            @NonNull
            public Builder setFallbackUrl(@NonNull Uri uri) {
                this.f48326a.putParcelable(IosParameters.KEY_IOS_FALLBACK_LINK, uri);
                return this;
            }

            @NonNull
            public Builder setIpadBundleId(@NonNull String str) {
                this.f48326a.putString(IosParameters.KEY_IPAD_BUNDLE_ID, str);
                return this;
            }

            @NonNull
            public Builder setIpadFallbackUrl(@NonNull Uri uri) {
                this.f48326a.putParcelable(IosParameters.KEY_IPAD_FALLBACK_LINK, uri);
                return this;
            }

            @NonNull
            public Builder setMinimumVersion(@NonNull String str) {
                this.f48326a.putString(IosParameters.KEY_IOS_MINIMUM_VERSION, str);
                return this;
            }
        }

        public IosParameters(Bundle bundle) {
            this.f48325a = bundle;
        }
    }

    public static final class ItunesConnectAnalyticsParameters {

        @VisibleForTesting
        public static final String KEY_ITUNES_CONNECT_AT = "at";

        @VisibleForTesting
        public static final String KEY_ITUNES_CONNECT_CT = "ct";

        @VisibleForTesting
        public static final String KEY_ITUNES_CONNECT_PT = "pt";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f48327a;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Bundle f48328a = new Bundle();

            @NonNull
            public ItunesConnectAnalyticsParameters build() {
                return new ItunesConnectAnalyticsParameters(this.f48328a);
            }

            @NonNull
            public String getAffiliateToken() {
                return this.f48328a.getString(ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_AT, "");
            }

            @NonNull
            public String getCampaignToken() {
                return this.f48328a.getString(ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_CT, "");
            }

            @NonNull
            public String getProviderToken() {
                return this.f48328a.getString(ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT, "");
            }

            @NonNull
            public Builder setAffiliateToken(@NonNull String str) {
                this.f48328a.putString(ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_AT, str);
                return this;
            }

            @NonNull
            public Builder setCampaignToken(@NonNull String str) {
                this.f48328a.putString(ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_CT, str);
                return this;
            }

            @NonNull
            public Builder setProviderToken(@NonNull String str) {
                this.f48328a.putString(ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT, str);
                return this;
            }
        }

        public ItunesConnectAnalyticsParameters(Bundle bundle) {
            this.f48327a = bundle;
        }
    }

    public static final class NavigationInfoParameters {

        @VisibleForTesting
        public static final String KEY_FORCED_REDIRECT = "efr";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f48329a;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Bundle f48330a = new Bundle();

            @NonNull
            public NavigationInfoParameters build() {
                return new NavigationInfoParameters(this.f48330a);
            }

            public boolean getForcedRedirectEnabled() {
                return this.f48330a.getInt(NavigationInfoParameters.KEY_FORCED_REDIRECT) == 1;
            }

            @NonNull
            public Builder setForcedRedirectEnabled(boolean z10) {
                this.f48330a.putInt(NavigationInfoParameters.KEY_FORCED_REDIRECT, z10 ? 1 : 0);
                return this;
            }
        }

        public NavigationInfoParameters(Bundle bundle) {
            this.f48329a = bundle;
        }
    }

    public static final class SocialMetaTagParameters {

        @VisibleForTesting
        public static final String KEY_SOCIAL_DESCRIPTION = "sd";

        @VisibleForTesting
        public static final String KEY_SOCIAL_IMAGE_LINK = "si";

        @VisibleForTesting
        public static final String KEY_SOCIAL_TITLE = "st";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f48331a;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Bundle f48332a = new Bundle();

            @NonNull
            public SocialMetaTagParameters build() {
                return new SocialMetaTagParameters(this.f48332a);
            }

            @NonNull
            public String getDescription() {
                return this.f48332a.getString(SocialMetaTagParameters.KEY_SOCIAL_DESCRIPTION, "");
            }

            @NonNull
            public Uri getImageUrl() {
                Uri uri = (Uri) this.f48332a.getParcelable(SocialMetaTagParameters.KEY_SOCIAL_IMAGE_LINK);
                return uri == null ? Uri.EMPTY : uri;
            }

            @NonNull
            public String getTitle() {
                return this.f48332a.getString(SocialMetaTagParameters.KEY_SOCIAL_TITLE, "");
            }

            @NonNull
            public Builder setDescription(@NonNull String str) {
                this.f48332a.putString(SocialMetaTagParameters.KEY_SOCIAL_DESCRIPTION, str);
                return this;
            }

            @NonNull
            public Builder setImageUrl(@NonNull Uri uri) {
                this.f48332a.putParcelable(SocialMetaTagParameters.KEY_SOCIAL_IMAGE_LINK, uri);
                return this;
            }

            @NonNull
            public Builder setTitle(@NonNull String str) {
                this.f48332a.putString(SocialMetaTagParameters.KEY_SOCIAL_TITLE, str);
                return this;
            }
        }

        public SocialMetaTagParameters(Bundle bundle) {
            this.f48331a = bundle;
        }
    }

    public DynamicLink(Bundle bundle) {
        this.f48317a = bundle;
    }

    @NonNull
    public Uri getUri() {
        return FirebaseDynamicLinksImpl.createDynamicLink(this.f48317a);
    }

    public static final class Builder {
        public static final String KEY_API_KEY = "apiKey";

        @VisibleForTesting
        public static final String KEY_DOMAIN = "domain";
        public static final String KEY_DOMAIN_URI_PREFIX = "domainUriPrefix";
        public static final String KEY_DYNAMIC_LINK = "dynamicLink";
        public static final String KEY_DYNAMIC_LINK_PARAMETERS = "parameters";

        @VisibleForTesting
        public static final String KEY_LINK = "link";
        public static final String KEY_SUFFIX = "suffix";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FirebaseDynamicLinksImpl f48320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bundle f48321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f48322c;

        public Builder(FirebaseDynamicLinksImpl firebaseDynamicLinksImpl) {
            this.f48320a = firebaseDynamicLinksImpl;
            Bundle bundle = new Bundle();
            this.f48321b = bundle;
            bundle.putString("apiKey", firebaseDynamicLinksImpl.getFirebaseApp().getOptions().getApiKey());
            Bundle bundle2 = new Bundle();
            this.f48322c = bundle2;
            bundle.putBundle("parameters", bundle2);
        }

        @NonNull
        public DynamicLink buildDynamicLink() {
            Bundle bundle = this.f48321b;
            FirebaseDynamicLinksImpl.verifyDomainUriPrefix(bundle);
            return new DynamicLink(bundle);
        }

        @NonNull
        public Task<ShortDynamicLink> buildShortDynamicLink() {
            Bundle bundle = this.f48321b;
            if (bundle.getString("apiKey") != null) {
                return this.f48320a.createShortDynamicLink(bundle);
            }
            throw new IllegalArgumentException("Missing API key. Set with setApiKey().");
        }

        @NonNull
        public String getDomainUriPrefix() {
            return this.f48321b.getString(KEY_DOMAIN_URI_PREFIX, "");
        }

        @NonNull
        public Uri getLink() {
            Uri uri = (Uri) this.f48322c.getParcelable(KEY_LINK);
            return uri == null ? Uri.EMPTY : uri;
        }

        @NonNull
        public Uri getLongLink() {
            Uri uri = (Uri) this.f48322c.getParcelable(KEY_DYNAMIC_LINK);
            return uri == null ? Uri.EMPTY : uri;
        }

        @NonNull
        public Builder setAndroidParameters(@NonNull AndroidParameters androidParameters) {
            this.f48322c.putAll(androidParameters.f48318a);
            return this;
        }

        @NonNull
        public Builder setDomainUriPrefix(@NonNull String str) {
            boolean zMatches = str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.app\\.goo\\.gl$");
            Bundle bundle = this.f48321b;
            if (zMatches || str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.page\\.link$")) {
                bundle.putString(KEY_DOMAIN, str.replace(WebHelperKt.HTTPS_PROTOCOL, ""));
            }
            bundle.putString(KEY_DOMAIN_URI_PREFIX, str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setDynamicLinkDomain(@NonNull String str) {
            if (!str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.app\\.goo\\.gl$") && !str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.page\\.link$")) {
                throw new IllegalArgumentException("Use setDomainUriPrefix() instead, setDynamicLinkDomain() is only applicable for *.page.link and *.app.goo.gl domains.");
            }
            Bundle bundle = this.f48321b;
            bundle.putString(KEY_DOMAIN, str);
            bundle.putString(KEY_DOMAIN_URI_PREFIX, WebHelperKt.HTTPS_PROTOCOL.concat(str));
            return this;
        }

        @NonNull
        public Builder setGoogleAnalyticsParameters(@NonNull GoogleAnalyticsParameters googleAnalyticsParameters) {
            this.f48322c.putAll(googleAnalyticsParameters.f48323a);
            return this;
        }

        @NonNull
        public Builder setIosParameters(@NonNull IosParameters iosParameters) {
            this.f48322c.putAll(iosParameters.f48325a);
            return this;
        }

        @NonNull
        public Builder setItunesConnectAnalyticsParameters(@NonNull ItunesConnectAnalyticsParameters itunesConnectAnalyticsParameters) {
            this.f48322c.putAll(itunesConnectAnalyticsParameters.f48327a);
            return this;
        }

        @NonNull
        public Builder setLink(@NonNull Uri uri) {
            this.f48322c.putParcelable(KEY_LINK, uri);
            return this;
        }

        @NonNull
        public Builder setLongLink(@NonNull Uri uri) {
            this.f48321b.putParcelable(KEY_DYNAMIC_LINK, uri);
            return this;
        }

        @NonNull
        public Builder setNavigationInfoParameters(@NonNull NavigationInfoParameters navigationInfoParameters) {
            this.f48322c.putAll(navigationInfoParameters.f48329a);
            return this;
        }

        @NonNull
        public Builder setSocialMetaTagParameters(@NonNull SocialMetaTagParameters socialMetaTagParameters) {
            this.f48322c.putAll(socialMetaTagParameters.f48331a);
            return this;
        }

        @NonNull
        public Task<ShortDynamicLink> buildShortDynamicLink(int i10) {
            Bundle bundle = this.f48321b;
            if (bundle.getString("apiKey") != null) {
                bundle.putInt(KEY_SUFFIX, i10);
                return this.f48320a.createShortDynamicLink(bundle);
            }
            throw new IllegalArgumentException("Missing API key. Set with setApiKey().");
        }
    }

    public static final class AndroidParameters {

        @VisibleForTesting
        public static final String KEY_ANDROID_FALLBACK_LINK = "afl";

        @VisibleForTesting
        public static final String KEY_ANDROID_MIN_VERSION_CODE = "amv";

        @VisibleForTesting
        public static final String KEY_ANDROID_PACKAGE_NAME = "apn";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f48318a;

        public AndroidParameters(Bundle bundle) {
            this.f48318a = bundle;
        }

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Bundle f48319a;

            public Builder() {
                if (FirebaseApp.getInstance() == null) {
                    throw new IllegalStateException("FirebaseApp not initialized.");
                }
                Bundle bundle = new Bundle();
                this.f48319a = bundle;
                bundle.putString("apn", FirebaseApp.getInstance().getApplicationContext().getPackageName());
            }

            @NonNull
            public AndroidParameters build() {
                return new AndroidParameters(this.f48319a);
            }

            @NonNull
            public Uri getFallbackUrl() {
                Uri uri = (Uri) this.f48319a.getParcelable(AndroidParameters.KEY_ANDROID_FALLBACK_LINK);
                return uri == null ? Uri.EMPTY : uri;
            }

            public int getMinimumVersion() {
                return this.f48319a.getInt(AndroidParameters.KEY_ANDROID_MIN_VERSION_CODE);
            }

            @NonNull
            public Builder setFallbackUrl(@NonNull Uri uri) {
                this.f48319a.putParcelable(AndroidParameters.KEY_ANDROID_FALLBACK_LINK, uri);
                return this;
            }

            @NonNull
            public Builder setMinimumVersion(int i10) {
                this.f48319a.putInt(AndroidParameters.KEY_ANDROID_MIN_VERSION_CODE, i10);
                return this;
            }

            public Builder(@NonNull String str) {
                Bundle bundle = new Bundle();
                this.f48319a = bundle;
                bundle.putString("apn", str);
            }
        }
    }
}
