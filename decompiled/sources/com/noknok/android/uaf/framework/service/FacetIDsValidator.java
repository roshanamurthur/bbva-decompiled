package com.noknok.android.uaf.framework.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import androidx.camera.camera2.internal.h0;
import androidx.webkit.ProxyConfig;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.tokencompat.service.RelayedService;
import com.fido.android.framework.service.Mfac;
import com.fido.uaf.ver0100.types.TrustedFacets;
import com.fido.uaf.ver0100.types.UafException;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.noknok.android.client.asm.api.uaf.json.Version;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.AppUtils;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.CryptoProviderHelper;
import com.noknok.android.client.utils.HttpClient;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.client.utils.StrictTypeAdapter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes11.dex */
public class FacetIDsValidator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Set<String> f63584d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences f63586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f63587c;

    public enum CacheUpdateStrategy {
        CheckDefaultPeriod,
        ForceUpdate
    }

    public static class TrustedApps {
        TrustedFacets[] trustedFacets;

        public boolean isValid() {
            TrustedFacets[] trustedFacetsArr = this.trustedFacets;
            if (trustedFacetsArr == null) {
                return false;
            }
            if (trustedFacetsArr.length <= 0) {
                return true;
            }
            for (TrustedFacets trustedFacets : trustedFacetsArr) {
                if (!trustedFacets.isValid()) {
                    return false;
                }
            }
            return true;
        }
    }

    public FacetIDsValidator(String str, Context context) {
        this.f63587c = context;
        this.f63585a = str;
    }

    private String a(String str, boolean z10, boolean z11, Version version) throws Throwable {
        Logger.d("FacetIDsValidator", String.format("Checking facet ID: facetID=%s AppID=%s", str, this.f63585a));
        String str2 = this.f63585a;
        if (str2 == null || str2.length() == 0) {
            Logger.d("FacetIDsValidator", "Facet ID trusted because App ID is blank");
            return str;
        }
        if (!e(this.f63585a)) {
            if (!str.equals(this.f63585a)) {
                throw new UafException(Outcome.PROTOCOL_ERROR, "App ID is not HTTPS");
            }
            Logger.d("FacetIDsValidator", "Facet ID trusted because it matches the App ID");
            return str;
        }
        if (z11) {
            Logger.d("FacetIDsValidator", "Facet ID trusted because this is a local request");
            return str;
        }
        if (z10) {
            try {
                if (new URL(this.f63585a).getHost().compareToIgnoreCase(new URL(str).getHost()) == 0) {
                    Logger.d("FacetIDsValidator", "Facet ID trusted because the host matches the App ID");
                    return str;
                }
            } catch (MalformedURLException unused) {
                throw new UafException(Outcome.APP_NOT_FOUND, "App ID is an invalid URL");
            }
        }
        if (Mfac.Instance().getContext() != null) {
            this.f63586b = Mfac.Instance().getContext().getSharedPreferences(a(), 0);
        } else {
            this.f63586b = this.f63587c.getSharedPreferences(a(), 0);
        }
        for (CacheUpdateStrategy cacheUpdateStrategy : CacheUpdateStrategy.values()) {
            a(cacheUpdateStrategy, this.f63585a, version, 0);
            if (d(str)) {
                Logger.d("FacetIDsValidator", "Facet ID trusted because it is in the list");
                return str;
            }
        }
        throw new UafException(Outcome.APP_NOT_FOUND, "Facet ID is not trusted");
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    private String b(String str) {
        synchronized (this) {
            if (f63584d == null) {
                f63584d = new HashSet();
                String asString = AppSDKConfig.getInstance(this.f63587c).get(AppSDKConfig.Key.publicSuffixList).getAsString();
                if (!asString.isEmpty()) {
                    f63584d.addAll(Arrays.asList(asString.split(RootService.LINE_BREAK)));
                }
            }
        }
        if (f63584d.isEmpty()) {
            return "";
        }
        Logger.i("FacetIDsValidator", "TLD checking is enabled.");
        try {
            String host = new URL(str).getHost();
            int iIndexOf = -1;
            do {
                host = host.substring(iIndexOf + 1);
                if (f63584d.contains(host)) {
                    return host;
                }
                iIndexOf = host.indexOf(46);
                return null;
            } while (iIndexOf != -1);
        } catch (MalformedURLException e5) {
            Logger.e("FacetIDsValidator", "Failed to parse URL", e5);
        }
        return null;
    }

    private Boolean c(String str) {
        if (str == null) {
            return Boolean.FALSE;
        }
        JsonElement jsonElement = AppSDKConfig.getInstance(this.f63587c).get(AppSDKConfig.Key.allowedBrowsers);
        if (jsonElement != null) {
            Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAsString())) {
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0082 A[LOOP:0: B:9:0x004e->B:18:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0080 A[SYNTHETIC] */
    private boolean d(String str) {
        String str2 = null;
        String string = this.f63586b.getString(RelayedService.KEY_IDS, null);
        try {
            URL url = new URL(str);
            str2 = url.getProtocol() + "://" + url.getAuthority();
            Logger.d("FacetIDsValidator", "facetURL scheme+host+port: " + str2);
        } catch (MalformedURLException unused) {
        }
        if (string == null || string.length() == 0) {
            Logger.i("FacetIDsValidator", "IDS list is empty");
            return false;
        }
        for (String str3 : string.split(",")) {
            if (str2 != null) {
                try {
                    URL url2 = new URL(str3);
                    if (!str2.equalsIgnoreCase(url2.getProtocol() + "://" + url2.getAuthority())) {
                        if (str.equals(str3)) {
                        }
                    }
                } catch (MalformedURLException unused2) {
                }
            } else if (str.equals(str3)) {
            }
            return true;
        }
        return false;
    }

    private static boolean e(String str) {
        try {
            return ProxyConfig.MATCH_HTTPS.equals(new URL(str).getProtocol());
        } catch (MalformedURLException unused) {
            Logger.w("FacetIDsValidator", str + " Invalid URL.");
            return false;
        }
    }

    public String validateCaller(int i10, int i11, ActivityProxy activityProxy, String str, boolean z10, Version version) throws Throwable {
        String callingPackage;
        String refAppPackage;
        String strComputeFacetID = str;
        String strA = null;
        boolean z11 = false;
        if (strComputeFacetID == null) {
            PackageManager packageManager = this.f63587c.getPackageManager();
            if (z10) {
                String[] packagesForUid = packageManager.getPackagesForUid(i11);
                if (packagesForUid != null) {
                    try {
                        callingPackage = packageManager.getPackageInfo(packagesForUid[0], 0).packageName;
                    } catch (PackageManager.NameNotFoundException e5) {
                        Logger.e("FacetIDsValidator", "Failed to get packageName", e5);
                    }
                }
            } else {
                callingPackage = activityProxy.getCallingPackage();
            }
            strComputeFacetID = callingPackage != null ? AppUtils.computeFacetID(this.f63587c, callingPackage, AppUtils.Algorithm.SHA1) : null;
        } else {
            if (!e(str)) {
                throw new UafException(Outcome.APP_NOT_FOUND, "Origin is not HTTPS.");
            }
            if (z10) {
                if (this.f63587c.checkPermission("org.fidoalliance.uaf.permissions.ACT_AS_WEB_BROWSER", i10, i11) == 0) {
                    break;
                }
                throw new UafException(Outcome.FAILURE, "ACT_AS_WEB_BROWSER permission denied");
            }
            String callingPackage2 = activityProxy.getCallingPackage();
            if (!c(AppUtils.computeFacetID(this.f63587c, callingPackage2, AppUtils.Algorithm.SHA1)).booleanValue()) {
                throw new UafException(Outcome.FAILURE, h0.b("Access denied: ", callingPackage2, " is not allowed."));
            }
            PackageManager packageManager2 = this.f63587c.getPackageManager();
            if (activityProxy.hasActivity()) {
                String callingPackage3 = activityProxy.getCallingPackage();
                try {
                    String[] strArr = packageManager2.getPackageInfo(callingPackage3, 4096).requestedPermissions;
                    if (strArr != null) {
                        int length = strArr.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 < length) {
                                if (strArr[i12].matches("org.fidoalliance.uaf.permissions.ACT_AS_WEB_BROWSER")) {
                                    break;
                                }
                                i12++;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException e7) {
                    Logger.e("FacetIDsValidator", "Failed to get requestedPermissions for " + callingPackage3, e7);
                }
            }
            throw new UafException(Outcome.FAILURE, "ACT_AS_WEB_BROWSER permission denied");
            try {
                URI uri = new URI(strComputeFacetID);
                String path = uri.getPath();
                if (path.length() > 0) {
                    strComputeFacetID = strComputeFacetID.split(path)[0];
                }
                try {
                    int port = uri.getPort();
                    if (port != -1 && uri.getScheme().equalsIgnoreCase(ProxyConfig.MATCH_HTTPS) && port == 443) {
                        strComputeFacetID = strComputeFacetID.split(":443")[0];
                    }
                    if (!strComputeFacetID.endsWith("/")) {
                        strComputeFacetID = strComputeFacetID + "/";
                    }
                } catch (URISyntaxException e10) {
                    e = e10;
                    Logger.e("FacetIDsValidator", "Error while resolving FacetID", e);
                }
            } catch (URISyntaxException e11) {
                e = e11;
                strComputeFacetID = null;
            }
            z11 = true;
        }
        if (strComputeFacetID != null) {
            return a(strComputeFacetID, z11, z10, version);
        }
        Logger.d("FacetIDsValidator", "Trying mReferrer for App Links approved browser");
        if (activityProxy.hasActivity() && (refAppPackage = activityProxy.getRefAppPackage()) != null) {
            Logger.d("FacetIDsValidator", "Possible browser caller is: ".concat(refAppPackage));
            if (c(AppUtils.computeFacetID(this.f63587c, refAppPackage, AppUtils.Algorithm.SHA1)).booleanValue()) {
                String string = activityProxy.getReferrer().toString();
                if (string != null && string.startsWith("android-app")) {
                    string = activityProxy.getIntent().getExtras().getString("com.huawei.browser.appfilterctrl");
                }
                if (string != null) {
                    Logger.d("FacetIDsValidator", "facetURL from getReferrer() is: ".concat(string));
                    try {
                        URL url = new URL(string);
                        strA = a((url.getProtocol() + "://" + url.getAuthority()).toLowerCase(), true, z10, version);
                    } catch (MalformedURLException unused) {
                    }
                }
            }
        }
        if (strA != null) {
            return strA;
        }
        throw new UafException(Outcome.APP_NOT_FOUND, "Failed to retrieve facetID");
    }

    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x022d  */
    private void a(CacheUpdateStrategy cacheUpdateStrategy, String str, Version version, int i10) throws Throwable {
        StringBuilder sb2;
        int i11;
        long jA;
        String header;
        if (cacheUpdateStrategy != CacheUpdateStrategy.ForceUpdate && (cacheUpdateStrategy != CacheUpdateStrategy.CheckDefaultPeriod || new Date().getTime() <= this.f63586b.getLong("expireTime", 0L))) {
            Logger.i("FacetIDsValidator", "TrustedFacets list is up to date.");
            return;
        }
        Logger.i("FacetIDsValidator", "Need to update TrustedFacets list based on " + cacheUpdateStrategy + " policy");
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        try {
            try {
                HttpClient url = HttpClient.createInstance(this.f63587c).setMethod(HttpClient.HttpMethod.GET).setUrl(str);
                JsonElement jsonElement = Mfac.Instance().getConfig().get(AppSDKConfig.Key.allowedSslProtocols);
                url.setAllowedSSLProtocols(jsonElement != null ? (String[]) new Gson().fromJson(jsonElement, String[].class) : null);
                url.setFollowRedirects(false);
                url.addHeader("Accept", "application/fido.trusted-apps+json");
                url.sendRequest();
                int statusCode = url.getStatusCode();
                if (statusCode >= 300 && statusCode < 400) {
                    Logger.i("FacetIDsValidator", "HTTP response status:" + statusCode);
                    String header2 = url.getHeader("FIDO-AppID-Redirect-Authorized", 0);
                    if (header2 == null || !header2.matches("true") || (header = url.getHeader("Location", 0)) == null || !e(header)) {
                        Logger.e("FacetIDsValidator", "Missing or incomplete FIDO-AppID-Redirect-Authorized header");
                    } else {
                        try {
                            if (i10 >= 5) {
                                Logger.e("FacetIDsValidator", "Failed to get FacetIDs list - too much redirections!");
                            } else {
                                a(cacheUpdateStrategy, header, version, i10 + 1);
                            }
                            z10 = true;
                        } catch (JsonParseException e5) {
                            e = e5;
                            z10 = true;
                            Logger.e("FacetIDsValidator", "Failed at parsing TrustedFacets JSON", e);
                            if (z10) {
                                return;
                            }
                            SharedPreferences.Editor editorEdit = this.f63586b.edit();
                            editorEdit.putString(RelayedService.KEY_IDS, sb3.toString());
                            editorEdit.putLong("expireTime", 0L);
                            editorEdit.apply();
                            sb2 = new StringBuilder();
                        } catch (IOException e7) {
                            e = e7;
                            z10 = true;
                            Logger.e("FacetIDsValidator", "Failed to retrieve TrustedFacets list", e);
                            if (z10) {
                                return;
                            }
                            SharedPreferences.Editor editorEdit2 = this.f63586b.edit();
                            editorEdit2.putString(RelayedService.KEY_IDS, sb3.toString());
                            editorEdit2.putLong("expireTime", 0L);
                            editorEdit2.apply();
                            sb2 = new StringBuilder();
                        } catch (CertificateEncodingException e10) {
                            e = e10;
                            z10 = true;
                            Logger.e("FacetIDsValidator", "Failed to encode HTTPS certificate.", e);
                            if (z10) {
                                return;
                            }
                            SharedPreferences.Editor editorEdit3 = this.f63586b.edit();
                            editorEdit3.putString(RelayedService.KEY_IDS, sb3.toString());
                            editorEdit3.putLong("expireTime", 0L);
                            editorEdit3.apply();
                            sb2 = new StringBuilder();
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = true;
                            if (!z10) {
                                SharedPreferences.Editor editorEdit4 = this.f63586b.edit();
                                editorEdit4.putString(RelayedService.KEY_IDS, sb3.toString());
                                editorEdit4.putLong("expireTime", 0L);
                                editorEdit4.apply();
                                Logger.i("FacetIDsValidator", "Updated Preferences:\n" + this.f63586b.getAll());
                            }
                            throw th;
                        }
                    }
                } else {
                    if (statusCode == 200) {
                        Scanner scannerUseDelimiter = new Scanner(url.getResponse()).useDelimiter(RootService.DELIMITER_A);
                        String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : null;
                        scannerUseDelimiter.close();
                        if (next != null && next.length() != 0) {
                            Logger.i("FacetIDsValidator", "facetID file:".concat(next));
                            TrustedApps trustedApps = (TrustedApps) StrictTypeAdapter.GsonBuilder().create().fromJson(next, TrustedApps.class);
                            if (!trustedApps.isValid()) {
                                Logger.e("FacetIDsValidator", "Trusted apps structure is invalid");
                                SharedPreferences.Editor editorEdit5 = this.f63586b.edit();
                                editorEdit5.putString(RelayedService.KEY_IDS, sb3.toString());
                                editorEdit5.putLong("expireTime", 0L);
                                editorEdit5.apply();
                                Logger.i("FacetIDsValidator", "Updated Preferences:\n" + this.f63586b.getAll());
                                return;
                            }
                            TrustedFacets[] trustedFacetsArr = trustedApps.trustedFacets;
                            Version version2 = new Version((short) 1, (short) 0);
                            Version version3 = new Version((short) 1, (short) 1);
                            String strB = b(this.f63585a);
                            for (TrustedFacets trustedFacets : trustedFacetsArr) {
                                i11 = (trustedFacets.version.equals(version2) || trustedFacets.version.equals(version3)) ? 0 : i11 + 1;
                                List<String> list = trustedFacets.ids;
                                if (list == null) {
                                    break;
                                }
                                for (String str2 : list) {
                                    if (a(str2, strB)) {
                                        sb3.append(str2);
                                        sb3.append(",");
                                    }
                                }
                                break;
                            }
                            String header3 = url.getHeader("Expires", 0);
                            if (header3 != null && !header3.equals("0")) {
                                jA = a(header3);
                            } else {
                                Logger.w("FacetIDsValidator", "\"Expires\" header is missing. An update will be enforced for each request");
                            }
                            if (z10) {
                            }
                            SharedPreferences.Editor editorEdit6 = this.f63586b.edit();
                            editorEdit6.putString(RelayedService.KEY_IDS, sb3.toString());
                            editorEdit6.putLong("expireTime", jA);
                            editorEdit6.apply();
                            sb2 = new StringBuilder();
                            sb2.append("Updated Preferences:\n");
                            sb2.append(this.f63586b.getAll());
                            Logger.i("FacetIDsValidator", sb2.toString());
                        }
                        Logger.e("FacetIDsValidator", "The response is empty");
                        SharedPreferences.Editor editorEdit7 = this.f63586b.edit();
                        editorEdit7.putString(RelayedService.KEY_IDS, sb3.toString());
                        editorEdit7.putLong("expireTime", 0L);
                        editorEdit7.apply();
                        Logger.i("FacetIDsValidator", "Updated Preferences:\n" + this.f63586b.getAll());
                        return;
                    }
                    Logger.e("FacetIDsValidator", "Unexpected HTTP response status:" + statusCode);
                }
                jA = 0;
                if (z10) {
                    SharedPreferences.Editor editorEdit8 = this.f63586b.edit();
                    editorEdit8.putString(RelayedService.KEY_IDS, sb3.toString());
                    editorEdit8.putLong("expireTime", jA);
                    editorEdit8.apply();
                    sb2 = new StringBuilder();
                    sb2.append("Updated Preferences:\n");
                    sb2.append(this.f63586b.getAll());
                    Logger.i("FacetIDsValidator", sb2.toString());
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (JsonParseException e11) {
            e = e11;
        } catch (IOException e12) {
            e = e12;
        } catch (CertificateEncodingException e13) {
            e = e13;
        }
    }

    private String a() {
        try {
            MessageDigest messageDigestInstance = CryptoProviderHelper.getMessageDigestInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
            messageDigestInstance.update(this.f63585a.getBytes(Charsets.utf8Charset), 0, this.f63585a.length());
            byte[] bArrDigest = messageDigestInstance.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                int i10 = (b10 >>> 4) & 15;
                int i11 = 0;
                while (true) {
                    if (i10 >= 0 && i10 <= 9) {
                        sb2.append((char) (i10 + 48));
                    } else {
                        sb2.append((char) (i10 + 87));
                    }
                    i10 = b10 & 15;
                    int i12 = i11 + 1;
                    if (i11 >= 1) {
                        break;
                    }
                    i11 = i12;
                }
            }
            Logger.i("FacetIDsValidator", "Preferences file name:" + ((Object) sb2));
            return sb2.toString();
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            Logger.w("FacetIDsValidator", "Failed to generate preference file name", e);
            return null;
        } catch (NoSuchProviderException e7) {
            e = e7;
            Logger.w("FacetIDsValidator", "Failed to generate preference file name", e);
            return null;
        }
    }

    private static long a(String str) {
        try {
            return new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US).parse(str).getTime();
        } catch (ParseException e5) {
            Logger.e("FacetIDsValidator", "Error while getting expires", e5);
            return new Date().getTime() + 60000;
        }
    }

    private boolean a(String str, String str2) {
        if (str.startsWith("android:apk-key-hash:")) {
            return true;
        }
        if (!e(str) || str2 == null) {
            return false;
        }
        try {
            return new URL(str).getHost().endsWith(str2);
        } catch (MalformedURLException e5) {
            Logger.e("FacetIDsValidator", "Failed to parse URL", e5);
        }
    }
}
