package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.appcompat.widget.r1;
import androidx.appcompat.widget.s1;
import androidx.lifecycle.k;
import com.adobe.marketing.mobile.EventDataKeys;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFd1tSDK.AnonymousClass5;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.devicechecker.emulator.EmulatorApi;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.mastercard.sonic.androidsvg.SVGParser;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.KeyStoreException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFa1dSDK extends AppsFlyerLib {
    static AppsFlyerInAppPurchaseValidatorListener AFInAppEventParameterName = null;
    public static final String AFKeystoreWrapper;

    @VisibleForTesting
    private static AFa1dSDK afErrorLog = null;

    @VisibleForTesting
    private static String afRDLog = null;
    private static int onAttributionFailure = 0;
    private static int onConversionDataFail = 1;
    private static char[] onResponse;
    static final String valueOf;
    public static final String values;
    private String AFLogger$LogLevel;
    public AFa1bSDK afDebugLog;
    private Map<Long, String> afErrorLogForExcManagerOnly;
    String afInfoLog;
    private boolean init;

    @NonNull
    private final AFc1xSDK onAppOpenAttribution;
    private SharedPreferences onAttributionFailureNative;
    private Map<String, Object> onConversionDataSuccess;
    private boolean onInstallConversionDataLoadedNative;
    private Application onInstallConversionFailureNative;
    private AFb1hSDK onResponseErrorNative;
    private String onResponseNative;
    public volatile AppsFlyerConversionListener AFInAppEventType = null;
    private long AFLogger = -1;
    private long afWarnLog = -1;
    private long getLevel = TimeUnit.SECONDS.toMillis(5);
    private boolean AFVersionDeclaration = false;
    private final AFb1xSDK onAppOpenAttributionNative = new AFb1xSDK();
    private boolean AppsFlyer2dXConversionCallback = false;
    private boolean onDeepLinkingNative = false;
    private final Executor onDeepLinking = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1dSDK$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AFInAppEventParameterName;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            AFInAppEventParameterName = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFInAppEventParameterName[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class AFa1vSDK implements Runnable {
        private final AFa1qSDK AFInAppEventParameterName;

        public /* synthetic */ AFa1vSDK(AFa1dSDK aFa1dSDK, AFa1qSDK aFa1qSDK, byte b10) {
            this(aFa1qSDK);
        }

        @Override // java.lang.Runnable
        public final void run() throws UnsupportedEncodingException {
            AFa1dSDK.values(AFa1dSDK.this, this.AFInAppEventParameterName);
        }

        private AFa1vSDK(AFa1qSDK aFa1qSDK) {
            this.AFInAppEventParameterName = aFa1qSDK;
        }
    }

    public class AFa1xSDK implements AFd1zSDK {
        private AFa1xSDK() {
        }

        private boolean valueOf() {
            return AFa1dSDK.this.AFInAppEventType != null;
        }

        @Override // com.appsflyer.internal.AFd1zSDK
        public final void AFInAppEventType(AFd1uSDK<?> aFd1uSDK) {
            if (aFd1uSDK instanceof AFd1hSDK) {
                AFa1dSDK.this.AFInAppEventParameterName().AFLogger().AFKeystoreWrapper(((AFd1eSDK) aFd1uSDK).afInfoLog.afErrorLog);
            }
        }

        public /* synthetic */ AFa1xSDK(AFa1dSDK aFa1dSDK, byte b10) {
            this();
        }

        @Override // com.appsflyer.internal.AFd1zSDK
        public final void AFInAppEventType(AFd1uSDK<?> aFd1uSDK, AFd1ySDK aFd1ySDK) {
            JSONObject jSONObjectAFInAppEventParameterName;
            AFb1oSDK aFb1oSDKAFKeystoreWrapper;
            if (aFd1uSDK instanceof AFd1eSDK) {
                AFd1eSDK aFd1eSDK = (AFd1eSDK) aFd1uSDK;
                boolean z10 = aFd1uSDK instanceof AFd1hSDK;
                if (z10 && valueOf()) {
                    AFd1hSDK aFd1hSDK = (AFd1hSDK) aFd1uSDK;
                    if (aFd1hSDK.AFKeystoreWrapper == AFd1ySDK.SUCCESS || aFd1hSDK.AFInAppEventParameterName == 1) {
                        AFe1kSDK aFe1kSDK = new AFe1kSDK(aFd1hSDK, AFa1dSDK.this.AFInAppEventParameterName().AFKeystoreWrapper());
                        AFd1tSDK level = AFa1dSDK.this.AFInAppEventParameterName().getLevel();
                        level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFe1kSDK));
                    }
                }
                if (aFd1ySDK == AFd1ySDK.SUCCESS) {
                    AFa1dSDK aFa1dSDK = AFa1dSDK.this;
                    aFa1dSDK.valueOf(AFa1dSDK.values(aFa1dSDK)).values("sentSuccessfully", "true");
                    if (!(aFd1uSDK instanceof AFd1gSDK) && (aFb1oSDKAFKeystoreWrapper = new AFe1sSDK(AFa1dSDK.values(AFa1dSDK.this)).AFKeystoreWrapper()) != null && aFb1oSDKAFKeystoreWrapper.valueOf()) {
                        String str = aFb1oSDKAFKeystoreWrapper.AFKeystoreWrapper;
                        AFLogger.afDebugLog("Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                        AFe1sSDK.AFKeystoreWrapper(str);
                    }
                    ResponseNetwork responseNetwork = ((AFd1nSDK) aFd1eSDK).AFLogger;
                    if (responseNetwork != null && (jSONObjectAFInAppEventParameterName = AFb1tSDK.AFInAppEventParameterName((String) responseNetwork.getBody())) != null) {
                        AFa1dSDK.AFInAppEventType(AFa1dSDK.this, jSONObjectAFInAppEventParameterName.optBoolean("send_background", false));
                    }
                    if (z10) {
                        AFa1dSDK.values(AFa1dSDK.this, System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(aFd1uSDK instanceof AFe1kSDK) || aFd1ySDK == AFd1ySDK.SUCCESS) {
                return;
            }
            AFe1rSDK aFe1rSDK = new AFe1rSDK(AFa1dSDK.this.AFInAppEventParameterName());
            AFd1tSDK level2 = AFa1dSDK.this.AFInAppEventParameterName().getLevel();
            level2.AFKeystoreWrapper.execute(level2.new AnonymousClass5(aFe1rSDK));
        }

        @Override // com.appsflyer.internal.AFd1zSDK
        public final void AFKeystoreWrapper(AFd1uSDK<?> aFd1uSDK) {
        }
    }

    public class AFa1ySDK implements Runnable {
        private final AFa1qSDK valueOf;

        public /* synthetic */ AFa1ySDK(AFa1dSDK aFa1dSDK, AFa1qSDK aFa1qSDK, byte b10) {
            this(aFa1qSDK);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFd1uSDK aFd1eSDK;
            if (this.valueOf.values()) {
                AFd1hSDK aFd1hSDK = new AFd1hSDK(this.valueOf, AFa1dSDK.this.AFInAppEventParameterName());
                aFd1hSDK.getLevel = AFa1dSDK.AFInAppEventType(AFa1dSDK.this);
                aFd1eSDK = aFd1hSDK;
            } else {
                aFd1eSDK = new AFd1eSDK(this.valueOf, AFa1dSDK.this.AFInAppEventParameterName());
            }
            AFd1tSDK level = AFa1dSDK.this.AFInAppEventParameterName().getLevel();
            level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1eSDK));
        }

        private AFa1ySDK(AFa1qSDK aFa1qSDK) {
            this.valueOf = aFa1qSDK;
        }
    }

    static {
        AFInAppEventType();
        valueOf = "253";
        Object[] objArr = new Object[1];
        AFInAppEventParameterName("\u0001", false, new int[]{33, 1, 169, 1}, objArr);
        String strSubstring = "6.12.1".substring(0, "6.12.1".lastIndexOf(((String) objArr[0]).intern()));
        AFKeystoreWrapper = strSubstring;
        afRDLog = "https://%sstats.%s/stats";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strSubstring);
        sb2.append("/androidevent?buildnumber=6.12.1&app_id=");
        values = sb2.toString();
        AFInAppEventParameterName = null;
        afErrorLog = new AFa1dSDK();
        int i10 = onConversionDataFail + 105;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
    }

    @VisibleForTesting
    public AFa1dSDK() {
        AFVersionDeclaration.init();
        this.onAppOpenAttribution = new AFc1xSDK();
        AFd1tSDK level = AFInAppEventParameterName().getLevel();
        level.values.add(new AFa1xSDK(this, (byte) 0));
    }

    public static void AFInAppEventType() {
        onResponse = new char[]{148, 296, 287, 284, 291, 285, 280, 279, 286, 291, 288, 286, 24, 137, 269, 263, 270, 269, 141, 293, 299, 290, 287, 272, 268, 292, 294, 287, 289, 295, 300, 301, 282, 'k'};
    }

    private static void AFKeystoreWrapper(String str, String str2) {
        int i10 = onConversionDataFail + 105;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        AppsFlyerProperties.getInstance().set(str, str2);
        int i12 = onAttributionFailure + 105;
        onConversionDataFail = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    private static String AFLogger() {
        int i10 = onAttributionFailure + 79;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        String strValueOf = valueOf("appid");
        int i12 = onConversionDataFail + 101;
        onAttributionFailure = i12 % 128;
        if (i12 % 2 == 0) {
            return strValueOf;
        }
        throw null;
    }

    @NonNull
    private AFf1jSDK[] AFLogger$LogLevel() {
        int i10 = onConversionDataFail + 75;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 == 0) {
            return AFInAppEventParameterName().AFLogger$LogLevel().AFInAppEventType();
        }
        int i11 = 5 / 0;
        return AFInAppEventParameterName().AFLogger$LogLevel().AFInAppEventType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFVersionDeclaration() {
        try {
            AFe1hSDK aFe1hSDK = new AFe1hSDK();
            if (AFInAppEventParameterName(aFe1hSDK, valueOf(this.onInstallConversionFailureNative))) {
                int i10 = onConversionDataFail + 123;
                onAttributionFailure = i10 % 128;
                int i11 = i10 % 2;
                valueOf(aFe1hSDK);
                int i12 = onAttributionFailure + 83;
                onConversionDataFail = i12 % 128;
                int i13 = i12 % 2;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
        }
    }

    private void afDebugLog() {
        AFf1kSDK aFf1kSDKAFLogger$LogLevel = AFInAppEventParameterName().AFLogger$LogLevel();
        AFf1pSDK aFf1pSDKAfRDLog = afRDLog();
        Runnable runnableAFInAppEventType = AFInAppEventType(aFf1pSDKAfRDLog);
        aFf1kSDKAFLogger$LogLevel.values(aFf1pSDKAfRDLog);
        aFf1kSDKAFLogger$LogLevel.values(new AFf1cSDK(runnableAFInAppEventType));
        aFf1kSDKAFLogger$LogLevel.values(new AFf1gSDK(runnableAFInAppEventType, AFInAppEventParameterName()));
        aFf1kSDKAFLogger$LogLevel.values(new AFf1hSDK(runnableAFInAppEventType, AFInAppEventParameterName()));
        if (!afErrorLog()) {
            aFf1kSDKAFLogger$LogLevel.AFInAppEventParameterName(this.onInstallConversionFailureNative, runnableAFInAppEventType, AFInAppEventParameterName());
        }
        AFf1jSDK[] aFf1jSDKArrAFInAppEventType = aFf1kSDKAFLogger$LogLevel.AFInAppEventType();
        int i10 = onAttributionFailure + 75;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        for (AFf1jSDK aFf1jSDK : aFf1jSDKArrAFInAppEventType) {
            int i12 = onAttributionFailure + 65;
            onConversionDataFail = i12 % 128;
            int i13 = i12 % 2;
            aFf1jSDK.AFKeystoreWrapper(this.onInstallConversionFailureNative);
        }
    }

    @VisibleForTesting
    private boolean afErrorLog() {
        int i10 = onAttributionFailure + 89;
        onConversionDataFail = i10 % 128;
        if (i10 % 2 != 0) {
            return AFInAppEventParameterName().AFInAppEventParameterName().AFInAppEventType("AF_PREINSTALL_DISABLED");
        }
        int i11 = 59 / 0;
        return AFInAppEventParameterName().AFInAppEventParameterName().AFInAppEventType("AF_PREINSTALL_DISABLED");
    }

    private void afErrorLogForExcManagerOnly() {
        int i10 = onAttributionFailure + 61;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        if (AFd1mSDK.afRDLog()) {
            return;
        }
        AFc1zSDK aFc1zSDKAFInAppEventParameterName = AFInAppEventParameterName();
        AFd1tSDK level = aFc1zSDKAFInAppEventParameterName.getLevel();
        level.AFKeystoreWrapper.execute(level.new AnonymousClass5(new AFd1mSDK(aFc1zSDKAFInAppEventParameterName)));
        int i12 = onConversionDataFail + 105;
        onAttributionFailure = i12 % 128;
        int i13 = i12 % 2;
    }

    private static void afInfoLog(Context context) {
        int i10 = onAttributionFailure + 15;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                int i12 = onConversionDataFail + 33;
                onAttributionFailure = i12 % 128;
                if (i12 % 2 != 0) {
                    context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName());
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                        int i13 = onAttributionFailure + 65;
                        onConversionDataFail = i13 % 128;
                        int i14 = i13 % 2;
                        AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                        return;
                    }
                    AFLogger.AFInAppEventType("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
                }
            }
            int i15 = onAttributionFailure + 57;
            onConversionDataFail = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 27 / 0;
            }
        } catch (Exception e5) {
            AFLogger.afErrorLogForExcManagerOnly("checkBackupRules Exception", e5);
            AFLogger.afRDLog("checkBackupRules Exception: ".concat(String.valueOf(e5)));
        }
    }

    private AFf1pSDK afRDLog() {
        AFf1pSDK aFf1pSDK = new AFf1pSDK(new androidx.activity.f(this, 6), AFInAppEventParameterName().valueOf());
        int i10 = onConversionDataFail + 31;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 30 / 0;
        }
        return aFf1pSDK;
    }

    private boolean afWarnLog() {
        int i10 = onConversionDataFail;
        int i11 = i10 + 113;
        onAttributionFailure = i11 % 128;
        int i12 = i11 % 2;
        Map<String, Object> map = this.onConversionDataSuccess;
        if (map == null) {
            return false;
        }
        int i13 = i10 + 87;
        onAttributionFailure = i13 % 128;
        int i14 = i13 % 2;
        if (map.isEmpty()) {
            return false;
        }
        int i15 = onConversionDataFail + 11;
        onAttributionFailure = i15 % 128;
        int i16 = i15 % 2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getLevel() {
        int i10 = onConversionDataFail + 101;
        onAttributionFailure = i10 % 128;
        int i11 = 2;
        if (i10 % 2 != 0) {
            AFInAppEventType(AFInAppEventParameterName().values(), new k(this, 1), 0L, TimeUnit.MILLISECONDS);
        } else {
            AFInAppEventType(AFInAppEventParameterName().values(), new s1(this, i11), 0L, TimeUnit.MILLISECONDS);
        }
    }

    public static /* synthetic */ void valueOf(AFa1dSDK aFa1dSDK) {
        int i10 = onAttributionFailure + 125;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        aFa1dSDK.afErrorLogForExcManagerOnly();
        if (i11 == 0) {
            throw null;
        }
        int i12 = onAttributionFailure + 103;
        onConversionDataFail = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ long values(AFa1dSDK aFa1dSDK, long j10) {
        int i10 = onAttributionFailure;
        int i11 = i10 + 25;
        onConversionDataFail = i11 % 128;
        int i12 = i11 % 2;
        aFa1dSDK.afWarnLog = j10;
        int i13 = i10 + 31;
        onConversionDataFail = i13 % 128;
        int i14 = i13 % 2;
        return j10;
    }

    public final AFc1zSDK AFInAppEventParameterName() {
        int i10 = onAttributionFailure + 65;
        int i11 = i10 % 128;
        onConversionDataFail = i11;
        int i12 = i10 % 2;
        AFc1xSDK aFc1xSDK = this.onAppOpenAttribution;
        int i13 = i11 + 121;
        onAttributionFailure = i13 % 128;
        int i14 = i13 % 2;
        return aFc1xSDK;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i10 = onConversionDataFail + 91;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 != 0) {
            AFInAppEventParameterName().init().AFKeystoreWrapper.contains(Arrays.asList(strArr));
            throw null;
        }
        List<String> listAsList = Arrays.asList(strArr);
        List<List<String>> list = AFInAppEventParameterName().init().AFKeystoreWrapper;
        if (!list.contains(listAsList)) {
            list.add(listAsList);
        }
        int i11 = onConversionDataFail + 59;
        onAttributionFailure = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z10) {
        int i10 = onConversionDataFail + 1;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 != 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("anonymizeUser", String.valueOf(z10));
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("anonymizeUser", String.valueOf(z10));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z10);
        int i11 = onConversionDataFail + 11;
        onAttributionFailure = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i10 = onAttributionFailure + 51;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        AFb1uSDK aFb1uSDKInit = AFInAppEventParameterName().init();
        aFb1uSDKInit.values = str;
        aFb1uSDKInit.AFInAppEventParameterName = map;
        int i12 = onConversionDataFail + 79;
        onAttributionFailure = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z10) {
        int i10 = onConversionDataFail + 113;
        int i11 = i10 % 128;
        onAttributionFailure = i11;
        int i12 = i10 % 2;
        this.onDeepLinkingNative = z10;
        int i13 = i11 + 47;
        onConversionDataFail = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Nullable
    public final String getAppsFlyerUID(@NonNull Context context) {
        int i10 = onConversionDataFail + 35;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("getAppsFlyerUID", new String[0]);
        if (context == null) {
            int i12 = onAttributionFailure + 47;
            onConversionDataFail = i12 % 128;
            if (i12 % 2 != 0) {
                return null;
            }
            throw null;
        }
        AFInAppEventType(context);
        AFb1cSDK aFb1cSDKAFInAppEventParameterName = AFInAppEventParameterName().AFInAppEventParameterName();
        String strAFInAppEventParameterName = AFa1aSDK.AFInAppEventParameterName(aFb1cSDKAFInAppEventParameterName.values, aFb1cSDKAFInAppEventParameterName.AFInAppEventType);
        int i13 = onConversionDataFail + 69;
        onAttributionFailure = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 77 / 0;
        }
        return strAFInAppEventParameterName;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        try {
            String strAFInAppEventParameterName = new AFa1eSDK(context, AFInAppEventParameterName()).AFInAppEventParameterName();
            int i10 = onConversionDataFail + 113;
            onAttributionFailure = i10 % 128;
            if (i10 % 2 == 0) {
                return strAFInAppEventParameterName;
            }
            throw null;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th2);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i10 = onConversionDataFail + 59;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        String strAFInAppEventType = AFInAppEventParameterName().onInstallConversionDataLoadedNative().AFInAppEventType();
        int i12 = onAttributionFailure + 115;
        onConversionDataFail = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 37 / 0;
        }
        return strAFInAppEventType;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i10 = onAttributionFailure + 83;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        String strValueOf = AFInAppEventParameterName().onInstallConversionDataLoadedNative().valueOf();
        int i12 = onConversionDataFail + 89;
        onAttributionFailure = i12 % 128;
        int i13 = i12 % 2;
        return strValueOf;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        int i10 = onConversionDataFail + 75;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 != 0) {
            AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            throw null;
        }
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            return string;
        }
        String strAFKeystoreWrapper = AFKeystoreWrapper(context, "AF_STORE");
        if (strAFKeystoreWrapper == null) {
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        int i11 = onAttributionFailure + 77;
        onConversionDataFail = i11 % 128;
        int i12 = i11 % 2;
        return strAFKeystoreWrapper;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        AFc1zSDK aFc1zSDKAFInAppEventParameterName;
        int i10 = onConversionDataFail + 119;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 != 0) {
            aFc1zSDKAFInAppEventParameterName = AFInAppEventParameterName();
            aFc1zSDKAFInAppEventParameterName.afErrorLogForExcManagerOnly().AFInAppEventType("getSdkVersion", new String[1]);
        } else {
            aFc1zSDKAFInAppEventParameterName = AFInAppEventParameterName();
            aFc1zSDKAFInAppEventParameterName.afErrorLogForExcManagerOnly().AFInAppEventType("getSdkVersion", new String[0]);
        }
        aFc1zSDKAFInAppEventParameterName.AFInAppEventParameterName();
        String strAFInAppEventParameterName = AFb1cSDK.AFInAppEventParameterName();
        int i11 = onAttributionFailure + 39;
        onConversionDataFail = i11 % 128;
        if (i11 % 2 != 0) {
            return strAFInAppEventParameterName;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        String str2;
        if (this.init) {
            int i10 = onConversionDataFail + 15;
            onAttributionFailure = i10 % 128;
            int i11 = i10 % 2;
            return this;
        }
        this.init = true;
        AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType = str;
        AFc1pSDK.AFInAppEventParameterName(str);
        int i12 = 0;
        if (context != null) {
            this.onInstallConversionFailureNative = (Application) context.getApplicationContext();
            AFInAppEventType(context);
            AFInAppEventParameterName().AFLogger().valueOf = System.currentTimeMillis();
            AFInAppEventParameterName().onResponseErrorNative().AFInAppEventType();
            AFInAppEventParameterName().afDebugLog().valueOf(new a(this, i12));
            afDebugLog();
            this.onAppOpenAttribution.AFVersionDeclaration().AFInAppEventParameterName();
        } else {
            AFLogger.afWarnLog("context is null, Google Install Referrer will be not initialized");
        }
        AFb1wSDK aFb1wSDKAfErrorLogForExcManagerOnly = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
        String[] strArr = new String[2];
        strArr[0] = str;
        if (appsFlyerConversionListener == null) {
            str2 = AbstractJsonLexerKt.NULL;
        } else {
            int i13 = onConversionDataFail + 105;
            onAttributionFailure = i13 % 128;
            int i14 = i13 % 2;
            str2 = "conversionDataListener";
        }
        strArr[1] = str2;
        aFb1wSDKAfErrorLogForExcManagerOnly.AFInAppEventType("init", strArr);
        AFLogger.AFInAppEventParameterName(String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.12.1", valueOf));
        this.AFInAppEventType = appsFlyerConversionListener;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if ((r4.getPackageManager().getApplicationInfo(r4.getPackageName(), 0).flags & 1) != 0) goto L12;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isPreInstalledApp(android.content.Context r4) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFa1dSDK.onAttributionFailure
            int r0 = r0 + 37
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1dSDK.onConversionDataFail = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L22
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            android.content.pm.ApplicationInfo r4 = r0.getApplicationInfo(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            int r4 = r4.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            r4 = r4 | r1
            if (r4 == 0) goto L34
            goto L33
        L20:
            r4 = move-exception
            goto L3f
        L22:
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            android.content.pm.ApplicationInfo r4 = r0.getApplicationInfo(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            int r4 = r4.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            r4 = r4 & r1
            if (r4 == 0) goto L34
        L33:
            return r1
        L34:
            int r4 = com.appsflyer.internal.AFa1dSDK.onConversionDataFail
            int r4 = r4 + 121
            int r0 = r4 % 128
            com.appsflyer.internal.AFa1dSDK.onAttributionFailure = r0
            int r4 = r4 % 2
            goto L44
        L3f:
            java.lang.String r0 = "Could not check if app is pre installed"
            com.appsflyer.AFLogger.afErrorLog(r0, r4)
        L44:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.isPreInstalledApp(android.content.Context):boolean");
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        int i10 = onConversionDataFail + 79;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 != 0) {
            AFInAppEventParameterName().AFVersionDeclaration().values();
            throw null;
        }
        boolean zValues = AFInAppEventParameterName().AFVersionDeclaration().values();
        int i11 = onAttributionFailure + 89;
        onConversionDataFail = i11 % 128;
        int i12 = i11 % 2;
        return zValues;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i10 = onConversionDataFail + 73;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        logEvent(context, str, map, null);
        if (i11 != 0) {
            throw null;
        }
        int i12 = onAttributionFailure + 81;
        onConversionDataFail = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d2, double d3) {
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("logLocation", String.valueOf(d2), String.valueOf(d3));
        HashMap map = new HashMap();
        map.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d3));
        map.put(AFInAppEventParameterName.LATITUDE, Double.toString(d2));
        valueOf(context, AFInAppEventType.LOCATION_COORDINATES, map);
        int i10 = onAttributionFailure + 79;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        int i10 = onAttributionFailure + 73;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("logSession", new String[0]);
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().values();
        AFInAppEventType(context, AFe1nSDK.logSession);
        valueOf(context, (String) null, (Map<String, Object>) null);
        int i12 = onAttributionFailure + 111;
        onConversionDataFail = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i10 = onAttributionFailure + 69;
        onConversionDataFail = i10 % 128;
        if (i10 % 2 == 0) {
            AFInAppEventParameterName().onDeepLinkingNative().valueOf(context);
            throw null;
        }
        AFInAppEventParameterName().onDeepLinkingNative().valueOf(context);
        int i11 = onAttributionFailure + 119;
        onConversionDataFail = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(@NonNull Context context, @NonNull URI uri) {
        int i10 = onConversionDataFail + 11;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (uri == null || uri.toString().isEmpty()) {
            AFb1uSDK aFb1uSDKInit = AFInAppEventParameterName().init();
            StringBuilder sb2 = new StringBuilder("Link is \"");
            sb2.append(uri);
            sb2.append("\"");
            aFb1uSDKInit.AFInAppEventType(sb2.toString(), DeepLinkResult.Error.NETWORK);
            int i11 = onAttributionFailure + 61;
            onConversionDataFail = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        if (context != null) {
            AFInAppEventParameterName().init().AFInAppEventType(context, new HashMap(), Uri.parse(uri.toString()));
            int i13 = onConversionDataFail + 23;
            onAttributionFailure = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        AFb1uSDK aFb1uSDKInit2 = AFInAppEventParameterName().init();
        StringBuilder sb3 = new StringBuilder("Context is \"");
        sb3.append(context);
        sb3.append("\"");
        aFb1uSDKInit2.AFInAppEventType(sb3.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(@NonNull Intent intent, @NonNull Context context) {
        if (intent == null) {
            int i10 = onAttributionFailure + 35;
            onConversionDataFail = i10 % 128;
            if (i10 % 2 != 0) {
                AFInAppEventParameterName().init().AFInAppEventType("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            } else {
                AFInAppEventParameterName().init().AFInAppEventType("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
                throw null;
            }
        }
        int i11 = 0;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            AFInAppEventType(applicationContext);
            AFInAppEventParameterName().valueOf().execute(new b(this, applicationContext, i11, intent));
            return;
        }
        int i12 = onAttributionFailure + 125;
        onConversionDataFail = i12 % 128;
        if (i12 % 2 != 0) {
            AFInAppEventParameterName().init().AFInAppEventType("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        } else {
            AFInAppEventParameterName().init().AFInAppEventType("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            int i13 = 29 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i10 = onAttributionFailure + 111;
        onConversionDataFail = i10 % 128;
        if (i10 % 2 == 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("registerConversionListener", new String[0]);
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("registerConversionListener", new String[0]);
        }
        AFInAppEventParameterName(appsFlyerConversionListener);
        int i11 = onConversionDataFail + 73;
        onAttributionFailure = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        com.appsflyer.internal.AFa1dSDK.AFInAppEventParameterName = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
        r4 = com.appsflyer.internal.AFa1dSDK.onAttributionFailure + 51;
        com.appsflyer.internal.AFa1dSDK.onConversionDataFail = r4 % 128;
        r4 = r4 % 2;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void registerValidatorListener(android.content.Context r4, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener r5) {
        /*
            r3 = this;
            int r4 = com.appsflyer.internal.AFa1dSDK.onConversionDataFail
            int r4 = r4 + 81
            int r0 = r4 % 128
            com.appsflyer.internal.AFa1dSDK.onAttributionFailure = r0
            int r4 = r4 % 2
            java.lang.String r0 = "registerValidatorListener called"
            java.lang.String r1 = "registerValidatorListener"
            if (r4 == 0) goto L24
            com.appsflyer.internal.AFc1zSDK r4 = r3.AFInAppEventParameterName()
            com.appsflyer.internal.AFb1wSDK r4 = r4.afErrorLogForExcManagerOnly()
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r4.AFInAppEventType(r1, r2)
            com.appsflyer.AFLogger.afDebugLog(r0)
            if (r5 != 0) goto L47
            goto L37
        L24:
            com.appsflyer.internal.AFc1zSDK r4 = r3.AFInAppEventParameterName()
            com.appsflyer.internal.AFb1wSDK r4 = r4.afErrorLogForExcManagerOnly()
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            r4.AFInAppEventType(r1, r2)
            com.appsflyer.AFLogger.afDebugLog(r0)
            if (r5 != 0) goto L47
        L37:
            java.lang.String r4 = "registerValidatorListener null listener"
            com.appsflyer.AFLogger.afDebugLog(r4)
            int r4 = com.appsflyer.internal.AFa1dSDK.onAttributionFailure
            int r4 = r4 + 51
            int r5 = r4 % 128
            com.appsflyer.internal.AFa1dSDK.onConversionDataFail = r5
            int r4 = r4 % 2
            return
        L47:
            com.appsflyer.internal.AFa1dSDK.AFInAppEventParameterName = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.registerValidatorListener(android.content.Context, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdImpression(Context context, Map<String, Object> map) {
        int iAFKeystoreWrapper = AFKeystoreWrapper(valueOf(context));
        HashMap map2 = new HashMap();
        map2.put("ad_network", map);
        map2.put("adimpression_counter", Integer.valueOf(iAFKeystoreWrapper));
        AFInAppEventType(context, map2, new AFe1jSDK());
        int i10 = onAttributionFailure + 117;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        int iAFInAppEventParameterName = AFInAppEventParameterName(valueOf(context));
        HashMap map2 = new HashMap();
        map2.put("ad_network", map);
        map2.put("adrevenue_counter", Integer.valueOf(iAFInAppEventParameterName));
        AFInAppEventType(context, map2, new AFe1gSDK());
        int i10 = onAttributionFailure + 25;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003b A[PHI: r4
      0x003b: PHI (r4v3 com.appsflyer.PurchaseHandler) = (r4v2 com.appsflyer.PurchaseHandler), (r4v13 com.appsflyer.PurchaseHandler) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler purchaseHandlerAfInfoLog;
        int i10 = onAttributionFailure + 117;
        onConversionDataFail = i10 % 128;
        if (i10 % 2 == 0) {
            AFInAppEventType(context);
            purchaseHandlerAfInfoLog = AFInAppEventParameterName().afInfoLog();
            String[] strArr = new String[0];
            strArr[1] = "purchases";
            if (purchaseHandlerAfInfoLog.AFInAppEventParameterName(map, purchaseValidationCallback, strArr)) {
                AFd1kSDK aFd1kSDK = new AFd1kSDK(map, purchaseValidationCallback, purchaseHandlerAfInfoLog.valueOf);
                AFd1tSDK aFd1tSDK = purchaseHandlerAfInfoLog.AFInAppEventParameterName;
                aFd1tSDK.AFKeystoreWrapper.execute(aFd1tSDK.new AnonymousClass5(aFd1kSDK));
                int i11 = onAttributionFailure + 3;
                onConversionDataFail = i11 % 128;
                int i12 = i11 % 2;
            }
        } else {
            AFInAppEventType(context);
            purchaseHandlerAfInfoLog = AFInAppEventParameterName().afInfoLog();
            if (purchaseHandlerAfInfoLog.AFInAppEventParameterName(map, purchaseValidationCallback, "purchases")) {
                AFd1kSDK aFd1kSDK2 = new AFd1kSDK(map, purchaseValidationCallback, purchaseHandlerAfInfoLog.valueOf);
                AFd1tSDK aFd1tSDK2 = purchaseHandlerAfInfoLog.AFInAppEventParameterName;
                aFd1tSDK2.AFKeystoreWrapper.execute(aFd1tSDK2.new AnonymousClass5(aFd1kSDK2));
                int i13 = onAttributionFailure + 3;
                onConversionDataFail = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        int i15 = onAttributionFailure + 33;
        onConversionDataFail = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        int i10 = onConversionDataFail + 69;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventType(context);
        PurchaseHandler purchaseHandlerAfInfoLog = AFInAppEventParameterName().afInfoLog();
        if (purchaseHandlerAfInfoLog.AFInAppEventParameterName(map, purchaseValidationCallback, "subscriptions")) {
            AFd1pSDK aFd1pSDK = new AFd1pSDK(map, purchaseValidationCallback, purchaseHandlerAfInfoLog.valueOf);
            AFd1tSDK aFd1tSDK = purchaseHandlerAfInfoLog.AFInAppEventParameterName;
            aFd1tSDK.AFKeystoreWrapper.execute(aFd1tSDK.new AnonymousClass5(aFd1pSDK));
        }
        int i12 = onAttributionFailure + 5;
        onConversionDataFail = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0053  */
    /* JADX WARN: Code duplicated, block: B:11:0x006b  */
    /* JADX WARN: Code duplicated, block: B:12:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:8:0x0046  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPushNotificationData(@Nullable Activity activity) {
        int i10;
        long jLongValue;
        if (activity != null) {
            int i11 = onConversionDataFail + 49;
            onAttributionFailure = i11 % 128;
            int i12 = i11 % 2;
            if (activity.getIntent() != null) {
                AFb1wSDK aFb1wSDKAfErrorLogForExcManagerOnly = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
                String localClassName = activity.getLocalClassName();
                StringBuilder sb2 = new StringBuilder("activity_intent_");
                sb2.append(activity.getIntent().toString());
                aFb1wSDKAfErrorLogForExcManagerOnly.AFInAppEventType("sendPushNotificationData", localClassName, sb2.toString());
            } else if (activity != null) {
                i10 = onConversionDataFail + 31;
                onAttributionFailure = i10 % 128;
                if (i10 % 2 != 0) {
                    AFb1wSDK aFb1wSDKAfErrorLogForExcManagerOnly2 = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
                    String[] strArr = new String[3];
                    strArr[1] = activity.getLocalClassName();
                    strArr[1] = "activity_intent_null";
                    aFb1wSDKAfErrorLogForExcManagerOnly2.AFInAppEventType("sendPushNotificationData", strArr);
                } else {
                    AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
                }
            } else {
                AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("sendPushNotificationData", "activity_null");
            }
        } else if (activity != null) {
            i10 = onConversionDataFail + 31;
            onAttributionFailure = i10 % 128;
            if (i10 % 2 != 0) {
                AFb1wSDK aFb1wSDKAfErrorLogForExcManagerOnly3 = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
                String[] strArr2 = new String[3];
                strArr2[1] = activity.getLocalClassName();
                strArr2[1] = "activity_intent_null";
                aFb1wSDKAfErrorLogForExcManagerOnly3.AFInAppEventType("sendPushNotificationData", strArr2);
            } else {
                AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
            }
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("sendPushNotificationData", "activity_null");
        }
        String strValueOf = valueOf(activity);
        this.AFLogger$LogLevel = strValueOf;
        if (strValueOf != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.afErrorLogForExcManagerOnly == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.afErrorLogForExcManagerOnly = new ConcurrentHashMap();
                jLongValue = jCurrentTimeMillis;
            } else {
                try {
                    long j10 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    jLongValue = jCurrentTimeMillis;
                    for (Long l6 : this.afErrorLogForExcManagerOnly.keySet()) {
                        try {
                            JSONObject jSONObject = new JSONObject(this.AFLogger$LogLevel);
                            JSONObject jSONObject2 = new JSONObject(this.afErrorLogForExcManagerOnly.get(l6));
                            if (jSONObject.opt("pid").equals(jSONObject2.opt("pid"))) {
                                int i13 = onAttributionFailure + 23;
                                onConversionDataFail = i13 % 128;
                                int i14 = i13 % 2;
                                if (jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                    StringBuilder sb3 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                    sb3.append(jSONObject2);
                                    sb3.append(", new: ");
                                    sb3.append(jSONObject);
                                    sb3.append(")");
                                    AFLogger.afInfoLog(sb3.toString());
                                    this.AFLogger$LogLevel = null;
                                    return;
                                }
                            }
                            if (jCurrentTimeMillis - l6.longValue() > j10) {
                                this.afErrorLogForExcManagerOnly.remove(l6);
                            }
                            if (l6.longValue() <= jLongValue) {
                                jLongValue = l6.longValue();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            AFLogger.afErrorLog("Error while handling push notification measurement: ".concat(th.getClass().getSimpleName()), th);
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    jLongValue = jCurrentTimeMillis;
                }
            }
            if (this.afErrorLogForExcManagerOnly.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                StringBuilder sb4 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                sb4.append(jLongValue);
                sb4.append(")");
                AFLogger.afInfoLog(sb4.toString());
                this.afErrorLogForExcManagerOnly.remove(Long.valueOf(jLongValue));
            }
            this.afErrorLogForExcManagerOnly.put(Long.valueOf(jCurrentTimeMillis), this.AFLogger$LogLevel);
            start(activity);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        int i10 = onConversionDataFail + 43;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        if (map != null) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            int i12 = onAttributionFailure + 5;
            onConversionDataFail = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = onConversionDataFail + 55;
        onAttributionFailure = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        int i10 = onConversionDataFail + 69;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setAndroidIdData", str);
        this.afInfoLog = str;
        int i12 = onConversionDataFail + 123;
        onAttributionFailure = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i10 = onAttributionFailure + 77;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setAppId", str);
        AFKeystoreWrapper("appid", str);
        int i12 = onAttributionFailure + 19;
        onConversionDataFail = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        int i10 = onConversionDataFail + 113;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        }
        AFKeystoreWrapper(AppsFlyerProperties.ONELINK_ID, str);
        int i12 = onConversionDataFail + 97;
        onAttributionFailure = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 87 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z10) {
        int i10 = onAttributionFailure + 19;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCollectAndroidID", String.valueOf(z10));
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z10));
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z10));
        int i12 = onConversionDataFail + 121;
        onAttributionFailure = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z10) {
        int i10 = onAttributionFailure + 83;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCollectIMEI", String.valueOf(z10));
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z10));
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z10));
        int i12 = onAttributionFailure + 81;
        onConversionDataFail = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 9 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z10) {
        int i10 = onAttributionFailure + 23;
        onConversionDataFail = i10 % 128;
        if (i10 % 2 == 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCollectOaid", String.valueOf(z10));
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCollectOaid", String.valueOf(z10));
        }
        AFKeystoreWrapper(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z10));
        int i11 = onAttributionFailure + 101;
        onConversionDataFail = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        int i10 = onAttributionFailure + 97;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        int i12 = onConversionDataFail + 77;
        onAttributionFailure = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, @NonNull Context context) {
        String str2;
        int i10 = onAttributionFailure + 13;
        onConversionDataFail = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (context != null) {
            if (!AFKeystoreWrapper()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                int i11 = onAttributionFailure + 31;
                onConversionDataFail = i11 % 128;
                int i12 = i11 % 2;
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb2 = new StringBuilder("CustomerUserId set: ");
            sb2.append(str);
            sb2.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb2.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventParameterName().AFKeystoreWrapper());
            AFInAppEventType(context, AFe1nSDK.setCustomerIdAndLogSession);
            String str3 = AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType;
            if (referrer == null) {
                int i13 = onConversionDataFail + 29;
                onAttributionFailure = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 80 / 0;
                }
                str2 = "";
            } else {
                str2 = referrer;
            }
            if (!(!(context instanceof Activity))) {
                ((Activity) context).getIntent();
            }
            AFKeystoreWrapper(context, null, null, str2, null);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        int i10 = onAttributionFailure + 99;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AFKeystoreWrapper(AppsFlyerProperties.APP_USER_ID, str);
        AFKeystoreWrapper(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        int i12 = onConversionDataFail + 63;
        onAttributionFailure = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z10) {
        int i10;
        AFLogger.LogLevel logLevel;
        int i11 = onConversionDataFail;
        int i12 = i11 + 115;
        onAttributionFailure = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 25 / 0;
            if (!(!z10)) {
                i10 = i11 + 101;
                onAttributionFailure = i10 % 128;
                if (i10 % 2 == 0) {
                    AFLogger.LogLevel logLevel2 = AFLogger.LogLevel.NONE;
                    throw null;
                }
                logLevel = AFLogger.LogLevel.DEBUG;
            } else {
                logLevel = AFLogger.LogLevel.NONE;
            }
        } else if (z10) {
            i10 = i11 + 101;
            onAttributionFailure = i10 % 128;
            if (i10 % 2 == 0) {
                AFLogger.LogLevel logLevel3 = AFLogger.LogLevel.NONE;
                throw null;
            }
            logLevel = AFLogger.LogLevel.DEBUG;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
        }
        setLogLevel(logLevel);
        int i14 = onAttributionFailure + 75;
        onConversionDataFail = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z10) {
        int i10 = onAttributionFailure + 3;
        onConversionDataFail = i10 % 128;
        if (i10 % 2 == 0) {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z10)));
            throw null;
        }
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z10)));
        AFa1bSDK.valueOf = Boolean.valueOf(z10 ^ true);
        AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
        AppsFlyerProperties.getInstance().remove("advertiserId");
        int i11 = onConversionDataFail + 15;
        onAttributionFailure = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z10) {
        int i10 = onAttributionFailure + 113;
        onConversionDataFail = i10 % 128;
        if (i10 % 2 != 0) {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z10)));
            AFKeystoreWrapper(AppsFlyerProperties.DISABLE_NETWORK_DATA, z10);
        } else {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z10)));
            AFKeystoreWrapper(AppsFlyerProperties.DISABLE_NETWORK_DATA, z10);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i10 = onConversionDataFail + 45;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i12 = onConversionDataFail + 53;
        onAttributionFailure = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(@Nullable String str, @NonNull String str2) {
        String strTrim;
        if (AFb1vSDK.valueOf(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i10 = onConversionDataFail;
        int i11 = i10 + 49;
        int i12 = i11 % 128;
        onAttributionFailure = i12;
        int i13 = i11 % 2;
        if (str != null) {
            int i14 = i10 + 27;
            onAttributionFailure = i14 % 128;
            int i15 = i14 % 2;
            strTrim = str.trim();
        } else {
            int i16 = i12 + 109;
            onConversionDataFail = i16 % 128;
            int i17 = i16 % 2;
            strTrim = "";
        }
        AFc1cSDK.AFInAppEventType(new AFc1dSDK(strTrim, str2.trim()));
        int i18 = onConversionDataFail + 33;
        onAttributionFailure = i18 % 128;
        int i19 = i18 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i10 = onConversionDataFail + 119;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 != 0) {
            AFb1wSDK aFb1wSDKAfErrorLogForExcManagerOnly = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
            String[] strArr = new String[1];
            strArr[1] = str;
            aFb1wSDKAfErrorLogForExcManagerOnly.AFInAppEventType("setImeiData", strArr);
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setImeiData", str);
        }
        AFInAppEventParameterName().AFVersionDeclaration().valueOf = str;
        int i11 = onAttributionFailure + 81;
        onConversionDataFail = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 50 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z10) {
        int i10 = onConversionDataFail + 7;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setIsUpdate", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z10);
        int i12 = onConversionDataFail + 11;
        onAttributionFailure = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        boolean z10;
        int i10 = onConversionDataFail + 87;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            int i12 = onConversionDataFail + 89;
            onAttributionFailure = i12 % 128;
            int i13 = i12 % 2;
            z10 = true;
        } else {
            z10 = false;
        }
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType(LogKeysKt.LOG, String.valueOf(z10));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        int i14 = onAttributionFailure + 9;
        onConversionDataFail = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i10) {
        int i11 = onConversionDataFail + 91;
        onAttributionFailure = i11 % 128;
        int i12 = i11 % 2;
        this.getLevel = TimeUnit.SECONDS.toMillis(i10);
        int i13 = onConversionDataFail + 79;
        onAttributionFailure = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i10 = onConversionDataFail + 15;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 != 0) {
            AFb1wSDK aFb1wSDKAfErrorLogForExcManagerOnly = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
            String[] strArr = new String[1];
            strArr[1] = str;
            aFb1wSDKAfErrorLogForExcManagerOnly.AFInAppEventType("setOaidData", strArr);
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setOaidData", str);
        }
        AFa1bSDK.AFInAppEventParameterName = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        String str;
        int i10 = onAttributionFailure + 111;
        onConversionDataFail = i10 % 128;
        if (i10 % 2 == 0) {
            Object[] objArr = new Object[0];
            objArr[1] = Arrays.toString(strArr);
            str = String.format("setOneLinkCustomDomain %s", objArr);
        } else {
            str = String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr));
        }
        AFLogger.afDebugLog(str);
        AFInAppEventParameterName().init().afInfoLog = strArr;
        int i11 = onAttributionFailure + 65;
        onConversionDataFail = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i10 = onConversionDataFail + 23;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (str == null) {
            AFLogger.AFInAppEventType("Cannot set setOutOfStore with null");
            int i11 = onAttributionFailure + 97;
            onConversionDataFail = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
        AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        int i12 = onAttributionFailure + 115;
        onConversionDataFail = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(@NonNull String str, Map<String, Object> map) {
        String strConcat;
        int i10 = onConversionDataFail + 73;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        if (this.onResponseErrorNative == null) {
            this.onResponseErrorNative = new AFb1hSDK();
        }
        AFb1hSDK aFb1hSDK = this.onResponseErrorNative;
        if (str == null || str.isEmpty()) {
            AFLogger.afWarnLog("Partner ID is missing or `null`");
            return;
        }
        if (map == null || !(!map.isEmpty())) {
            if (aFb1hSDK.AFInAppEventParameterName.remove(str) == null) {
                int i12 = onAttributionFailure + 97;
                onConversionDataFail = i12 % 128;
                int i13 = i12 % 2;
                strConcat = "Partner data is missing or `null`";
            } else {
                strConcat = "Cleared partner data for ".concat(str);
            }
            AFLogger.afWarnLog(strConcat);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Setting partner data for ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(map);
        AFLogger.afDebugLog(sb2.toString());
        int length = new JSONObject(map).toString().length();
        if (length > 1000) {
            AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
            HashMap map2 = new HashMap();
            map2.put("error", "limit exceeded: ".concat(String.valueOf(length)));
            aFb1hSDK.AFInAppEventType.put(str, map2);
            return;
        }
        aFb1hSDK.AFInAppEventParameterName.put(str, map);
        aFb1hSDK.AFInAppEventType.remove(str);
        int i14 = onConversionDataFail + 121;
        onAttributionFailure = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i10 = onAttributionFailure + 81;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        this.onResponseNative = AFb1zSDK.AFInAppEventParameterName(str);
        if (i11 == 0) {
            throw null;
        }
        int i12 = onConversionDataFail + 101;
        onAttributionFailure = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(@NonNull PluginInfo pluginInfo) {
        int i10 = onConversionDataFail + 9;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 != 0) {
            Objects.requireNonNull(pluginInfo);
            AFInAppEventParameterName().onInstallConversionFailureNative().values(pluginInfo);
            throw null;
        }
        Objects.requireNonNull(pluginInfo);
        AFInAppEventParameterName().onInstallConversionFailureNative().values(pluginInfo);
        int i11 = onAttributionFailure + 109;
        onConversionDataFail = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        try {
            if (str != null) {
                int i10 = onConversionDataFail + 37;
                onAttributionFailure = i10 % 128;
                if (i10 % 2 != 0) {
                    jSONObject.put("pid", str);
                    int i11 = 49 / 0;
                } else {
                    jSONObject.put("pid", str);
                }
            }
            if (str2 != null) {
                int i12 = onAttributionFailure + 1;
                onConversionDataFail = i12 % 128;
                if (i12 % 2 == 0) {
                    jSONObject.put("c", str2);
                    int i13 = 65 / 0;
                } else {
                    jSONObject.put("c", str2);
                }
            }
            if (str3 != null) {
                jSONObject.put("af_siteid", str3);
            }
        } catch (JSONException e5) {
            AFLogger.afErrorLog(e5.getMessage(), e5);
        }
        if (!jSONObject.has("pid")) {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            return;
        }
        int i14 = onConversionDataFail + 95;
        onAttributionFailure = i14 % 128;
        if (i14 % 2 == 0) {
            AFKeystoreWrapper("preInstallName", jSONObject.toString());
        } else {
            AFKeystoreWrapper("preInstallName", jSONObject.toString());
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        int i10 = onAttributionFailure + 71;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFb1uSDK aFb1uSDKInit = AFInAppEventParameterName().init();
        aFb1uSDKInit.afDebugLog.clear();
        aFb1uSDKInit.afDebugLog.addAll(Arrays.asList(strArr));
        int i12 = onConversionDataFail + 79;
        onAttributionFailure = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) {
        int i10 = onConversionDataFail + 55;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        setSharingFilterForPartners(strArr);
        int i12 = onConversionDataFail + 47;
        onAttributionFailure = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 30 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i10 = onConversionDataFail + 41;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 != 0) {
            String[] strArr = new String[0];
            strArr[0] = SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL;
            setSharingFilterForPartners(strArr);
        } else {
            setSharingFilterForPartners(SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL);
        }
        int i11 = onConversionDataFail + 51;
        onAttributionFailure = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        this.afDebugLog = new AFa1bSDK(strArr);
        int i10 = onAttributionFailure + 65;
        onConversionDataFail = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i10 = onConversionDataFail + 61;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 != 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            throw null;
        }
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        int i11 = onConversionDataFail + 91;
        onAttributionFailure = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context) {
        int i10 = onConversionDataFail + 107;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        start(context, null);
        int i12 = onAttributionFailure + 55;
        onConversionDataFail = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z10, Context context) {
        AFInAppEventType(context);
        AFc1zSDK aFc1zSDKAFInAppEventParameterName = AFInAppEventParameterName();
        aFc1zSDKAFInAppEventParameterName.AFVersionDeclaration().values = z10;
        aFc1zSDKAFInAppEventParameterName.valueOf().submit(new r1(aFc1zSDKAFInAppEventParameterName, 3));
        if (z10) {
            int i10 = onConversionDataFail + 17;
            onAttributionFailure = i10 % 128;
            int i11 = i10 % 2;
            aFc1zSDKAFInAppEventParameterName.AFKeystoreWrapper().valueOf("is_stop_tracking_used", true);
            int i12 = onConversionDataFail + 65;
            onAttributionFailure = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = onConversionDataFail + 57;
        onAttributionFailure = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        int i10 = onAttributionFailure + 69;
        onConversionDataFail = i10 % 128;
        if (i10 % 2 == 0) {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
            int i11 = 46 / 0;
        } else {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        }
        int i12 = onAttributionFailure + 51;
        onConversionDataFail = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i10 = onConversionDataFail + 63;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 != 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("unregisterConversionListener", new String[0]);
        } else {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("unregisterConversionListener", new String[0]);
        }
        this.AFInAppEventType = null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        AFInAppEventType(context);
        AFe1sSDK aFe1sSDK = new AFe1sSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.afWarnLog("[register] Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.afInfoLog("[register] Firebase Refreshed Token = ".concat(str));
        AFb1oSDK aFb1oSDKAFKeystoreWrapper = aFe1sSDK.AFKeystoreWrapper();
        if (aFb1oSDKAFKeystoreWrapper == null || !str.equals(aFb1oSDKAFKeystoreWrapper.AFKeystoreWrapper)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z10 = aFb1oSDKAFKeystoreWrapper == null || jCurrentTimeMillis - aFb1oSDKAFKeystoreWrapper.values > TimeUnit.SECONDS.toMillis(2L);
            AFb1oSDK aFb1oSDK = new AFb1oSDK(str, jCurrentTimeMillis, !z10);
            aFe1sSDK.values.values("afUninstallToken", aFb1oSDK.AFKeystoreWrapper);
            aFe1sSDK.values.AFInAppEventType("afUninstallToken_received_time", aFb1oSDK.values);
            aFe1sSDK.values.valueOf("afUninstallToken_queued", aFb1oSDK.valueOf());
            if (z10) {
                AFe1sSDK.AFKeystoreWrapper(str);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        AFb1wSDK aFb1wSDKAfErrorLogForExcManagerOnly = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3;
        strArr[3] = str4;
        strArr[4] = str5;
        strArr[5] = map == null ? "" : map.toString();
        aFb1wSDKAfErrorLogForExcManagerOnly.AFInAppEventType("validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("Validate in app called with parameters: ", str3, " ", str4, " ");
            sbC.append(str5);
            AFLogger.afInfoLog(sbC.toString());
        }
        if (str != null && str4 != null && str2 != null && str5 != null && str3 != null) {
            new Thread(new AFa1kSDK(context.getApplicationContext(), AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType, str, str2, str3, str4, str5, map, context instanceof Activity ? ((Activity) context).getIntent() : null)).start();
            return;
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFInAppEventParameterName;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z10) {
        String strConcat;
        boolean z11;
        int i10 = onAttributionFailure + 125;
        onConversionDataFail = i10 % 128;
        if (i10 % 2 == 0) {
            strConcat = "initAfterCustomerUserID: ".concat(String.valueOf(z10));
            z11 = false;
        } else {
            strConcat = "initAfterCustomerUserID: ".concat(String.valueOf(z10));
            z11 = true;
        }
        AFLogger.afInfoLog(strConcat, z11);
        AFKeystoreWrapper(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z10);
        int i11 = onAttributionFailure + 23;
        onConversionDataFail = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    public /* synthetic */ void AFInAppEventParameterName(Context context, Intent intent) {
        Uri data;
        boolean z10;
        AFInAppEventType(context);
        AFb1uSDK aFb1uSDKInit = AFInAppEventParameterName().init();
        AFb1fSDK aFb1fSDKAFKeystoreWrapper = AFInAppEventParameterName().AFKeystoreWrapper();
        if (intent != null) {
            int i10 = onConversionDataFail + 25;
            onAttributionFailure = i10 % 128;
            if (i10 % 2 != 0) {
                "android.intent.action.VIEW".equals(intent.getAction());
                throw null;
            }
            if (!(!"android.intent.action.VIEW".equals(intent.getAction()))) {
                data = intent.getData();
            } else {
                data = null;
            }
        } else {
            data = null;
        }
        if (data != null) {
            int i11 = onAttributionFailure + 15;
            onConversionDataFail = i11 % 128;
            int i12 = i11 % 2;
            if (!data.toString().isEmpty()) {
                int i13 = onAttributionFailure + 49;
                onConversionDataFail = i13 % 128;
                z10 = i13 % 2 != 0;
            }
        }
        if (aFb1fSDKAFKeystoreWrapper.AFKeystoreWrapper("ddl_sent")) {
            int i14 = onConversionDataFail + 81;
            int i15 = i14 % 128;
            onAttributionFailure = i15;
            int i16 = i14 % 2;
            if (!z10) {
                int i17 = i15 + 69;
                onConversionDataFail = i17 % 128;
                if (i17 % 2 != 0) {
                    aFb1uSDKInit.AFInAppEventType("No direct deep link", (DeepLinkResult.Error) null);
                    return;
                } else {
                    aFb1uSDKInit.AFInAppEventType("No direct deep link", (DeepLinkResult.Error) null);
                    throw null;
                }
            }
        }
        aFb1uSDKInit.valueOf(new HashMap(), intent, context);
    }

    public static /* synthetic */ Map AFInAppEventType(AFa1dSDK aFa1dSDK) {
        int i10 = onConversionDataFail + 33;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        Map<String, Object> map = aFa1dSDK.onConversionDataSuccess;
        if (i11 == 0) {
            return map;
        }
        throw null;
    }

    private static void AFKeystoreWrapper(String str, boolean z10) {
        int i10 = onConversionDataFail + 23;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, z10);
            int i11 = 54 / 0;
        } else {
            AppsFlyerProperties.getInstance().set(str, z10);
        }
        int i12 = onAttributionFailure + 71;
        onConversionDataFail = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 70 / 0;
        }
    }

    private long afErrorLog(Context context) {
        AFb1fSDK aFb1fSDKValueOf = valueOf(context);
        long jValues = aFb1fSDKValueOf.values("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        aFb1fSDKValueOf.AFInAppEventType("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
        if (jValues <= 0) {
            int i10 = onConversionDataFail + 5;
            onAttributionFailure = i10 % 128;
            if (i10 % 2 == 0) {
                return -1L;
            }
            throw null;
        }
        long j10 = jCurrentTimeMillis - jValues;
        int i11 = onAttributionFailure;
        int i12 = i11 + 53;
        onConversionDataFail = i12 % 128;
        long j11 = i12 % 2 == 0 ? j10 ^ 1000 : j10 / 1000;
        int i13 = i11 + 11;
        onConversionDataFail = i13 % 128;
        if (i13 % 2 != 0) {
            return j11;
        }
        throw null;
    }

    public static AFa1dSDK valueOf() {
        int i10 = onAttributionFailure + 27;
        int i11 = i10 % 128;
        onConversionDataFail = i11;
        int i12 = i10 % 2;
        AFa1dSDK aFa1dSDK = afErrorLog;
        int i13 = i11 + 113;
        onAttributionFailure = i13 % 128;
        if (i13 % 2 == 0) {
            return aFa1dSDK;
        }
        throw null;
    }

    public static /* synthetic */ Application values(AFa1dSDK aFa1dSDK) {
        int i10 = onAttributionFailure + 45;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        Application application = aFa1dSDK.onInstallConversionFailureNative;
        if (i11 != 0) {
            return application;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap map2 = map == null ? null : new HashMap(map);
        AFInAppEventType(context);
        AFe1aSDK aFe1aSDK = new AFe1aSDK();
        aFe1aSDK.afDebugLog = str;
        aFe1aSDK.AFInAppEventType = appsFlyerRequestListener;
        if (map2 != null && map2.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap map3 = new HashMap();
            Object obj = map2.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap map4 = new HashMap();
                map4.put("x", Float.valueOf(motionEvent.getX()));
                map4.put("y", Float.valueOf(motionEvent.getY()));
                map3.put("loc", map4);
                map3.put("pf", Float.valueOf(motionEvent.getPressure()));
                map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map3.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.AFInAppEventType("Parsing failed due to invalid input in 'af_touch_obj'.");
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
            map2.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFe1aSDK.AFInAppEventType(mapSingletonMap);
        }
        aFe1aSDK.AFKeystoreWrapper = map2;
        AFb1wSDK aFb1wSDKAfErrorLogForExcManagerOnly = AFInAppEventParameterName().afErrorLogForExcManagerOnly();
        String[] strArr = new String[2];
        strArr[0] = str;
        Map map5 = aFe1aSDK.AFKeystoreWrapper;
        if (map5 == null) {
            map5 = new HashMap();
        }
        strArr[1] = new JSONObject(map5).toString();
        aFb1wSDKAfErrorLogForExcManagerOnly.AFInAppEventType("logEvent", strArr);
        if (str == null) {
            AFInAppEventType(context, AFe1nSDK.logEvent);
        }
        values(aFe1aSDK, context instanceof Activity ? (Activity) context : null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str) {
        int i10 = onConversionDataFail + 37;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        start(context, str, null);
        if (i11 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j10) {
        int i10 = onAttributionFailure + 77;
        onConversionDataFail = i10 % 128;
        if (i10 % 2 == 0) {
            AFInAppEventParameterName().init().valueOf = deepLinkListener;
            AFInAppEventParameterName().init().afRDLog = j10;
            throw null;
        }
        AFInAppEventParameterName().init().valueOf = deepLinkListener;
        AFInAppEventParameterName().init().afRDLog = j10;
        int i11 = onConversionDataFail + 125;
        onAttributionFailure = i11 % 128;
        int i12 = i11 % 2;
    }

    public static /* synthetic */ boolean AFInAppEventType(AFa1dSDK aFa1dSDK, boolean z10) {
        int i10 = onAttributionFailure + 23;
        int i11 = i10 % 128;
        onConversionDataFail = i11;
        int i12 = i10 % 2;
        aFa1dSDK.AppsFlyer2dXConversionCallback = z10;
        int i13 = i11 + 15;
        onAttributionFailure = i13 % 128;
        if (i13 % 2 == 0) {
            return z10;
        }
        throw null;
    }

    public static /* synthetic */ void values(AFa1dSDK aFa1dSDK, AFa1qSDK aFa1qSDK) throws UnsupportedEncodingException {
        int i10 = onAttributionFailure + 109;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        aFa1dSDK.valueOf(aFa1qSDK);
        int i12 = onAttributionFailure + 1;
        onConversionDataFail = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 91 / 0;
        }
    }

    public final boolean AFKeystoreWrapper() {
        int i10 = onAttributionFailure + 107;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        if (!AFInAppEventParameterName(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) || values() != null) {
            int i12 = onAttributionFailure + 79;
            onConversionDataFail = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        int i14 = onAttributionFailure + 69;
        int i15 = i14 % 128;
        onConversionDataFail = i15;
        int i16 = i14 % 2;
        int i17 = i15 + 15;
        onAttributionFailure = i17 % 128;
        int i18 = i17 % 2;
        return true;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        if (AFInAppEventParameterName().onDeepLinkingNative().AFKeystoreWrapper()) {
            return;
        }
        if (!this.init) {
            int i10 = onConversionDataFail + 17;
            onAttributionFailure = i10 % 128;
            int i11 = i10 % 2;
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
        }
        AFInAppEventType(context);
        final AFe1lSDK aFe1lSDKAFLogger = AFInAppEventParameterName().AFLogger();
        aFe1lSDKAFLogger.values(AFa1rSDK.AFKeystoreWrapper(context));
        this.onInstallConversionFailureNative = (Application) context.getApplicationContext();
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType(EventDataKeys.Lifecycle.LIFECYCLE_START, str);
        String str2 = valueOf;
        AFLogger.afInfoLog(String.format("Starting AppsFlyer: (v%s.%s)", "6.12.1", str2));
        StringBuilder sb2 = new StringBuilder("Build Number: ");
        sb2.append(str2);
        AFLogger.afInfoLog(sb2.toString());
        AppsFlyerProperties.getInstance().loadProperties(AFInAppEventParameterName().AFKeystoreWrapper());
        if (!TextUtils.isEmpty(str)) {
            int i12 = onAttributionFailure + 87;
            onConversionDataFail = i12 % 128;
            if (i12 % 2 == 0) {
                AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType = str;
                AFc1pSDK.AFInAppEventParameterName(str);
                int i13 = 66 / 0;
            } else {
                AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType = str;
                AFc1pSDK.AFInAppEventParameterName(str);
            }
        } else if (TextUtils.isEmpty(AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType)) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
            return;
        }
        AFInAppEventParameterName().afDebugLog().valueOf(null);
        afErrorLogForExcManagerOnly();
        afInfoLog(this.onInstallConversionFailureNative.getBaseContext());
        if (this.onDeepLinkingNative) {
            int i14 = onAttributionFailure + 77;
            onConversionDataFail = i14 % 128;
            int i15 = i14 % 2;
            AFInAppEventParameterName(this.onInstallConversionFailureNative.getApplicationContext());
        }
        this.onAppOpenAttribution.onDeepLinkingNative().AFInAppEventParameterName(context, new AFb1iSDK.AFa1wSDK() { // from class: com.appsflyer.internal.AFa1dSDK.5
            @Override // com.appsflyer.internal.AFb1iSDK.AFa1wSDK
            public final void AFKeystoreWrapper(@NonNull Context context2) {
                AFLogger.afInfoLog("onBecameBackground");
                AFe1lSDK aFe1lSDK = aFe1lSDKAFLogger;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = aFe1lSDK.afDebugLog;
                if (j10 != 0) {
                    long j11 = jCurrentTimeMillis - j10;
                    if (j11 > 0 && j11 < 1000) {
                        j11 = 1000;
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(j11);
                    aFe1lSDK.afErrorLogForExcManagerOnly = seconds;
                    aFe1lSDK.AFKeystoreWrapper.AFInAppEventType("prev_session_dur", seconds);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFa1dSDK.this.AFInAppEventType(new WeakReference<>(context2));
                AFa1dSDK.this.AFInAppEventParameterName().onResponseErrorNative().AFKeystoreWrapper();
                AFb1wSDK aFb1wSDKAfErrorLogForExcManagerOnly = AFa1dSDK.this.AFInAppEventParameterName().afErrorLogForExcManagerOnly();
                if (aFb1wSDKAfErrorLogForExcManagerOnly.afErrorLog()) {
                    aFb1wSDKAfErrorLogForExcManagerOnly.valueOf();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        aFb1wSDKAfErrorLogForExcManagerOnly.AFInAppEventType(context2.getPackageName(), context2.getPackageManager(), AFa1dSDK.this.AFInAppEventParameterName());
                    }
                    aFb1wSDKAfErrorLogForExcManagerOnly.AFInAppEventType();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFa1dSDK.this.AFInAppEventParameterName().afWarnLog().values();
            }

            @Override // com.appsflyer.internal.AFb1iSDK.AFa1wSDK
            public final void values(@NonNull Activity activity) {
                aFe1lSDKAFLogger.AFInAppEventParameterName();
                AFa1dSDK.this.AFInAppEventParameterName().afDebugLog().valueOf(null);
                AFa1dSDK.valueOf(AFa1dSDK.this);
                AFa1dSDK aFa1dSDK = AFa1dSDK.this;
                int iAFInAppEventType = aFa1dSDK.AFInAppEventType(aFa1dSDK.valueOf((Context) activity), false);
                AFLogger.afInfoLog("onBecameForeground");
                if (iAFInAppEventType < 2) {
                    AFa1dSDK.this.AFInAppEventParameterName().afWarnLog().AFInAppEventType();
                }
                AFe1bSDK aFe1bSDK = new AFe1bSDK();
                if (activity != null) {
                    AFa1dSDK.this.AFInAppEventParameterName().init().valueOf(aFe1bSDK.AFInAppEventType(), activity.getIntent(), activity.getApplication());
                }
                AFa1dSDK aFa1dSDK2 = AFa1dSDK.this;
                aFe1bSDK.AFInAppEventType = appsFlyerRequestListener;
                aFa1dSDK2.values(aFe1bSDK, activity);
            }
        });
    }

    public final void valueOf(Context context, Intent intent) {
        if (intent.getStringExtra("appsflyer_preinstall") != null) {
            int i10 = onConversionDataFail + 19;
            onAttributionFailure = i10 % 128;
            int i11 = i10 % 2;
            AFInAppEventParameterName(intent.getStringExtra("appsflyer_preinstall"));
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String stringExtra = intent.getStringExtra("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(stringExtra)));
        if (stringExtra != null) {
            valueOf(context).values("referrer", stringExtra);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", stringExtra);
            appsFlyerProperties.AFInAppEventParameterName = stringExtra;
            if (AppsFlyerProperties.getInstance().AFInAppEventType()) {
                int i12 = onConversionDataFail + 23;
                onAttributionFailure = i12 % 128;
                int i13 = i12 % 2;
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                AFInAppEventType(context, AFe1nSDK.onReceive);
                values(context, stringExtra);
                int i14 = onConversionDataFail + 19;
                onAttributionFailure = i14 % 128;
                int i15 = i14 % 2;
            }
        }
        int i16 = onConversionDataFail + 111;
        onAttributionFailure = i16 % 128;
        int i17 = i16 % 2;
    }

    private Runnable AFInAppEventType(AFf1pSDK aFf1pSDK) {
        int i10 = onConversionDataFail + 75;
        int i11 = i10 % 128;
        onAttributionFailure = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        h2.i iVar = new h2.i(this, aFf1pSDK, 1);
        int i12 = i11 + 49;
        onConversionDataFail = i12 % 128;
        if (i12 % 2 != 0) {
            return iVar;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFKeystoreWrapper(AFf1pSDK aFf1pSDK) throws UnsupportedEncodingException {
        AFb1fSDK aFb1fSDKValueOf = valueOf(this.onInstallConversionFailureNative);
        boolean z10 = false;
        int iAFInAppEventType = AFInAppEventParameterName().AFInAppEventParameterName().AFInAppEventType.AFInAppEventType("appsFlyerCount", 0);
        boolean zAFKeystoreWrapper = aFb1fSDKValueOf.AFKeystoreWrapper(AppsFlyerProperties.NEW_REFERRER_SENT);
        if (aFf1pSDK.afRDLog == AFf1jSDK.AFa1vSDK.NOT_STARTED) {
            int i10 = onConversionDataFail + 15;
            onAttributionFailure = i10 % 128;
            int i11 = i10 % 2;
            z10 = true;
        }
        if (iAFInAppEventType == 1) {
            int i12 = onConversionDataFail + 91;
            onAttributionFailure = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            if (z10 || zAFKeystoreWrapper) {
                valueOf(new AFe1hSDK());
                int i13 = onAttributionFailure + 11;
                onConversionDataFail = i13 % 128;
                int i14 = i13 % 2;
            }
        }
    }

    public static String values() {
        int i10 = onConversionDataFail + 93;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        String strValueOf = valueOf(AppsFlyerProperties.APP_USER_ID);
        int i12 = onConversionDataFail + 103;
        onAttributionFailure = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 33 / 0;
        }
        return strValueOf;
    }

    public final void AFInAppEventType(WeakReference<Context> weakReference) {
        if (weakReference.get() == null) {
            return;
        }
        AFLogger.afInfoLog("app went to background");
        AFb1fSDK aFb1fSDKValueOf = valueOf(weakReference.get());
        AppsFlyerProperties.getInstance().saveProperties(aFb1fSDKValueOf);
        long j10 = AFInAppEventParameterName().AFLogger().afErrorLogForExcManagerOnly;
        HashMap map = new HashMap();
        String str = AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType;
        if (str == null) {
            int i10 = onConversionDataFail + 11;
            onAttributionFailure = i10 % 128;
            if (i10 % 2 == 0) {
                AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            } else {
                AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                throw null;
            }
        }
        String strValueOf = valueOf("KSAppsFlyerId");
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        AFc1uSDK.AFa1wSDK aFa1wSDKValues = AFa1bSDK.values(weakReference.get().getContentResolver());
        if (aFa1wSDKValues != null) {
            map.put("amazon_aid", aFa1wSDKValues.AFInAppEventParameterName);
            map.put("amazon_aid_limit", String.valueOf(aFa1wSDKValues.AFInAppEventType));
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            int i11 = onConversionDataFail + 39;
            onAttributionFailure = i11 % 128;
            int i12 = i11 % 2;
            map.put("advertiserId", string);
        }
        map.put("app_id", weakReference.get().getPackageName());
        map.put("devkey", str);
        map.put("uid", AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName().onAppOpenAttributionNative(), AFInAppEventParameterName().AFKeystoreWrapper()));
        map.put("time_in_app", String.valueOf(j10));
        map.put("statType", "user_closed_app");
        map.put(com.salesforce.marketingcloud.storage.db.k.a.f65035b, "Android");
        map.put("launch_counter", Integer.toString(AFInAppEventType(aFb1fSDKValueOf, false)));
        map.put("channel", AFInAppEventParameterName().AFInAppEventParameterName().AFKeystoreWrapper());
        if (strValueOf != null) {
            int i13 = onConversionDataFail + 15;
            onAttributionFailure = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        } else {
            int i14 = onAttributionFailure + 61;
            onConversionDataFail = i14 % 128;
            int i15 = i14 % 2;
            strValueOf = "";
        }
        map.put("originalAppsflyerId", strValueOf);
        if (this.AppsFlyer2dXConversionCallback) {
            AFf1wSDK aFf1wSDK = new AFf1wSDK();
            aFf1wSDK.afWarnLog = isStopped();
            AFd1eSDK aFd1eSDK = new AFd1eSDK((AFf1wSDK) aFf1wSDK.valueOf(AFInAppEventParameterName().AFInAppEventParameterName().AFInAppEventType.AFInAppEventType("appsFlyerCount", 0)).AFInAppEventType(map).valueOf(String.format(afRDLog, AppsFlyerLib.getInstance().getHostPrefix(), valueOf().getHostName())), AFInAppEventParameterName());
            AFd1tSDK level = AFInAppEventParameterName().getLevel();
            level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1eSDK));
            return;
        }
        AFLogger.afDebugLog("Stats call is disabled, ignore ...");
    }

    @VisibleForTesting
    public final void values(@NonNull AFa1qSDK aFa1qSDK, @Nullable Activity activity) {
        int i10 = onAttributionFailure + 23;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventType(aFa1qSDK, activity);
        if (AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType == null) {
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.AFInAppEventType;
            if (appsFlyerRequestListener != null) {
                int i12 = onAttributionFailure + 99;
                onConversionDataFail = i12 % 128;
                int i13 = i12 % 2;
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventParameterName().AFKeystoreWrapper());
        if (referrer == null) {
            referrer = "";
        }
        aFa1qSDK.AFLogger = referrer;
        AFInAppEventType(aFa1qSDK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int i10 = onConversionDataFail + 47;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        String str = null;
        for (String str2 : strArr) {
            if (AnonymousClass2.AFInAppEventParameterName[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFb1zSDK.AFInAppEventParameterName(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                int i12 = onConversionDataFail + 21;
                onAttributionFailure = i12 % 128;
                int i13 = i12 % 2;
                str = "plain_el_arr";
            }
        }
        map.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(map).toString());
    }

    @VisibleForTesting
    private void AFKeystoreWrapper(Context context, String str, Map<String, Object> map, String str2, String str3) {
        AFa1qSDK aFe1bSDK;
        int i10;
        int i11 = onAttributionFailure + 45;
        onConversionDataFail = i11 % 128;
        int i12 = i11 % 2;
        if (str != null && !str.trim().isEmpty()) {
            aFe1bSDK = new AFe1aSDK();
            i10 = onAttributionFailure + 125;
        } else {
            aFe1bSDK = new AFe1bSDK();
            i10 = onAttributionFailure + 115;
        }
        onConversionDataFail = i10 % 128;
        int i13 = i10 % 2;
        AFInAppEventType(context);
        aFe1bSDK.afDebugLog = str;
        aFe1bSDK.AFKeystoreWrapper = map;
        aFe1bSDK.AFLogger = str2;
        aFe1bSDK.values = str3;
        AFInAppEventType(aFe1bSDK);
        int i14 = onConversionDataFail + 105;
        onAttributionFailure = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    private void afDebugLog(Context context) {
        int i10;
        if (AFa1cSDK.valueOf()) {
            AFLogger.afRDLog("OPPO device found");
            i10 = 23;
        } else {
            i10 = 18;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= i10 && !AFInAppEventParameterName(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            StringBuilder sb2 = new StringBuilder("OS SDK is=");
            sb2.append(i11);
            sb2.append("; use KeyStore");
            AFLogger.afRDLog(sb2.toString());
            AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(context);
            if (!aFKeystoreWrapper.valueOf()) {
                aFKeystoreWrapper.AFKeystoreWrapper = AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName().onAppOpenAttributionNative(), AFInAppEventParameterName().AFKeystoreWrapper());
                aFKeystoreWrapper.AFInAppEventType = 0;
                aFKeystoreWrapper.valueOf(aFKeystoreWrapper.AFInAppEventParameterName());
            } else {
                String strAFInAppEventParameterName = aFKeystoreWrapper.AFInAppEventParameterName();
                synchronized (aFKeystoreWrapper.AFInAppEventParameterName) {
                    aFKeystoreWrapper.AFInAppEventType++;
                    AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(strAFInAppEventParameterName)));
                    try {
                        synchronized (aFKeystoreWrapper.AFInAppEventParameterName) {
                            aFKeystoreWrapper.values.deleteEntry(strAFInAppEventParameterName);
                        }
                    } catch (KeyStoreException e5) {
                        StringBuilder sb3 = new StringBuilder("Exception ");
                        sb3.append(e5.getMessage());
                        sb3.append(" occurred");
                        AFLogger.afErrorLog(sb3.toString(), e5);
                    }
                }
                aFKeystoreWrapper.valueOf(aFKeystoreWrapper.AFInAppEventParameterName());
            }
            AFKeystoreWrapper("KSAppsFlyerId", aFKeystoreWrapper.AFKeystoreWrapper());
            AFKeystoreWrapper("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.AFInAppEventType()));
            return;
        }
        StringBuilder sb4 = new StringBuilder("OS SDK is=");
        sb4.append(i11);
        sb4.append("; no KeyStore usage");
        AFLogger.afRDLog(sb4.toString());
    }

    private boolean afInfoLog() {
        int i10 = onAttributionFailure + 125;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        if (this.AFLogger > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.AFLogger;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            String strValues = values(simpleDateFormat, this.AFLogger);
            String strValues2 = values(simpleDateFormat, this.afWarnLog);
            if (jCurrentTimeMillis < this.getLevel && (!isStopped())) {
                AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", strValues, strValues2, Long.valueOf(jCurrentTimeMillis), Long.valueOf(this.getLevel)));
                return true;
            }
            if (!isStopped()) {
                AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", strValues, strValues2, Long.valueOf(jCurrentTimeMillis)));
            }
        } else if (!isStopped()) {
            int i12 = onAttributionFailure + 37;
            onConversionDataFail = i12 % 128;
            int i13 = i12 % 2;
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        int i14 = onAttributionFailure + 81;
        onConversionDataFail = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 8 / 0;
        }
        return false;
    }

    public final void AFInAppEventParameterName(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        int i10 = onConversionDataFail + 7;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strValueOf = valueOf(context).valueOf("extraReferrers", (String) null);
            if (strValueOf == null) {
                jSONObject = new JSONObject();
                jSONArray2 = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(strValueOf);
                if (jSONObject2.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject2.get(str));
                    int i12 = onAttributionFailure + 17;
                    onConversionDataFail = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    jSONArray = new JSONArray();
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
            }
            if (jSONArray2.length() < 5) {
                int i14 = onConversionDataFail + 63;
                onAttributionFailure = i14 % 128;
                int i15 = i14 % 2;
                jSONArray2.put(jCurrentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                valueOf(jSONObject);
            }
            jSONObject.put(str, jSONArray2.toString());
            valueOf(context).values("extraReferrers", jSONObject.toString());
        } catch (JSONException e5) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e5);
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Couldn't save referrer - ");
            sb2.append(str);
            sb2.append(": ");
            AFLogger.afErrorLog(sb2.toString(), th2);
        }
    }

    public static String values(SimpleDateFormat simpleDateFormat, long j10) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j10));
        int i10 = onConversionDataFail + 59;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private void values(Context context, String str) {
        byte b10 = 0;
        AFa1qSDK aFa1qSDKValueOf = new AFe1iSDK().valueOf(AFInAppEventParameterName().AFInAppEventParameterName().AFInAppEventType.AFInAppEventType("appsFlyerCount", 0));
        aFa1qSDKValueOf.AFLogger = str;
        if (str != null) {
            int i10 = onConversionDataFail + 121;
            onAttributionFailure = i10 % 128;
            if (i10 % 2 == 0 ? str.length() > 5 : str.length() > 4) {
                if (AFInAppEventParameterName(aFa1qSDKValueOf, valueOf(context))) {
                    AFInAppEventType(AFInAppEventParameterName().values(), new AFa1vSDK(this, aFa1qSDKValueOf, b10), 5L, TimeUnit.MILLISECONDS);
                    int i11 = onAttributionFailure + 27;
                    onConversionDataFail = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
        }
        int i13 = onConversionDataFail + 11;
        onAttributionFailure = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    private static void valueOf(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        int i10 = onConversionDataFail + 45;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        while (true) {
            if (!itKeys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(itKeys.next()));
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i12)));
                }
            } catch (JSONException e5) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e5);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> itKeys2 = jSONObject.keys();
        int i13 = onConversionDataFail + 53;
        onAttributionFailure = i13 % 128;
        int i14 = i13 % 2;
        loop2: while (true) {
            str = null;
            while (!(!itKeys2.hasNext()) && str == null) {
                String next = itKeys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i15 = onAttributionFailure + 53;
                    onConversionDataFail = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = 0;
                    while (i17 < jSONArray2.length()) {
                        int i18 = onConversionDataFail + 73;
                        onAttributionFailure = i18 % 128;
                        int i19 = i18 % 2;
                        if (jSONArray2.getLong(i17) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i17) != ((Long) arrayList.get(1)).longValue() && jSONArray2.getLong(i17) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            i17++;
                            str = next;
                        }
                    }
                } catch (JSONException e7) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e7);
                }
            }
            break loop2;
        }
        if (str != null) {
            int i20 = onConversionDataFail + 77;
            onAttributionFailure = i20 % 128;
            int i21 = i20 % 2;
            jSONObject.remove(str);
            if (i21 != 0) {
                throw null;
            }
        }
    }

    private int AFKeystoreWrapper(AFb1fSDK aFb1fSDK) {
        int i10 = onAttributionFailure + 15;
        onConversionDataFail = i10 % 128;
        return valueOf(aFb1fSDK, "appsFlyerAdImpressionCount", i10 % 2 != 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r9.contains("access_token") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r9.contains("access_token") != true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        r0 = values(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r0.length() != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r1 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r0.contains("&") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        r1 = new java.util.ArrayList(java.util.Arrays.asList(r0.split("&")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        r1.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        r5 = new java.lang.StringBuilder();
        r6 = r1.iterator();
        r1 = com.appsflyer.internal.AFa1dSDK.onAttributionFailure + 17;
        com.appsflyer.internal.AFa1dSDK.onConversionDataFail = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (r6.hasNext() == true) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        return r9.replace(r0, r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        r1 = com.appsflyer.internal.AFa1dSDK.onAttributionFailure + 109;
        com.appsflyer.internal.AFa1dSDK.onConversionDataFail = r1 % 128;
        r1 = r1 % 2;
        r1 = (java.lang.String) r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r1.contains("access_token") == true) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r5.length() == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
    
        r5.append("&");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        if (r1.startsWith("?") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:
    
        r5.append("?");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        r5.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        r1 = com.appsflyer.internal.AFa1dSDK.onConversionDataFail + 111;
        com.appsflyer.internal.AFa1dSDK.onAttributionFailure = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        if ((r1 % 2) == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ca, code lost:
    
        r6.remove();
        r1 = 89 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        r6.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String AFKeystoreWrapper(@androidx.annotation.Nullable java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.AFKeystoreWrapper(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02f3 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0306 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0319 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0336 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0342 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0351 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x035e A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0364 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x036c A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0377 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0389 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x039a A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x03a1 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x03c4 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x040d A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0412 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x042d A[Catch: all -> 0x00c1, Exception -> 0x0433, TRY_LEAVE, TryCatch #5 {Exception -> 0x0433, blocks: (B:163:0x0417, B:165:0x042d), top: B:289:0x0417, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x04cf A[Catch: all -> 0x04d9, TryCatch #13 {all -> 0x04d9, blocks: (B:191:0x04b8, B:194:0x04cb, B:196:0x04cf, B:201:0x04e4), top: B:304:0x04b8 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x05c0 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:234:0x05c9 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x05cd A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x05d5 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x05dc A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:243:0x0605 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x0640 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:254:0x064b  */
    /* JADX WARN: Code duplicated, block: B:255:0x064d  */
    /* JADX WARN: Code duplicated, block: B:259:0x065f A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:262:0x0691  */
    /* JADX WARN: Code duplicated, block: B:265:0x06a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:269:0x06e8 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:272:0x0748 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:285:0x044a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x03df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x060e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x01a9 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x01af A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x01b5 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01ed A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x020b A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0218 A[Catch: all -> 0x00c1, TRY_ENTER, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0221 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0247 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0254 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x025e A[Catch: all -> 0x00c1, TRY_ENTER, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x026b A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x027c A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x02a7 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:14:0x00af, B:16:0x00b5, B:22:0x00c6, B:24:0x00d6, B:25:0x00e1, B:27:0x00fd, B:30:0x0106, B:32:0x010e, B:33:0x0113, B:35:0x0119, B:37:0x0121, B:40:0x012c, B:42:0x01a9, B:44:0x01af, B:46:0x01b5, B:47:0x01cc, B:49:0x01d9, B:51:0x01e0, B:52:0x01e7, B:54:0x01ed, B:55:0x01f4, B:57:0x020b, B:58:0x0210, B:61:0x0218, B:62:0x021b, B:64:0x0221, B:65:0x0224, B:67:0x0236, B:69:0x023c, B:70:0x023f, B:72:0x0247, B:73:0x0250, B:75:0x0254, B:78:0x025e, B:79:0x0263, B:81:0x026b, B:83:0x027f, B:86:0x028f, B:88:0x0295, B:89:0x029f, B:91:0x02a7, B:92:0x02ac, B:94:0x02bf, B:96:0x02c5, B:97:0x02c8, B:99:0x02de, B:103:0x02e8, B:104:0x02ed, B:106:0x02f3, B:107:0x0300, B:109:0x0306, B:110:0x0313, B:112:0x0319, B:115:0x032a, B:117:0x0330, B:123:0x034b, B:125:0x0351, B:126:0x0356, B:128:0x035e, B:133:0x0377, B:134:0x0383, B:136:0x0389, B:137:0x0392, B:139:0x039a, B:141:0x03a1, B:142:0x03b7, B:143:0x03bc, B:145:0x03c4, B:146:0x03c9, B:161:0x040d, B:159:0x0401, B:162:0x0412, B:163:0x0417, B:165:0x042d, B:170:0x044a, B:175:0x045f, B:180:0x0474, B:185:0x0489, B:186:0x0498, B:230:0x05a3, B:232:0x05c0, B:234:0x05c9, B:236:0x05cd, B:238:0x05d5, B:240:0x05dc, B:241:0x05f2, B:243:0x0605, B:245:0x060e, B:250:0x063a, B:252:0x0640, B:256:0x064e, B:257:0x0655, B:259:0x065f, B:260:0x0671, B:263:0x0692, B:266:0x06a2, B:267:0x06a6, B:269:0x06e8, B:270:0x06f5, B:272:0x0748, B:274:0x074c, B:249:0x0620, B:229:0x059d, B:190:0x04b3, B:184:0x0484, B:179:0x046f, B:174:0x045a, B:169:0x0435, B:155:0x03f8, B:129:0x0364, B:131:0x036c, B:118:0x0336, B:120:0x0342, B:122:0x0348, B:275:0x0752, B:82:0x027c, B:39:0x0127, B:23:0x00d1, B:148:0x03df, B:149:0x03e3), top: B:280:0x00af, inners: #1, #3, #5, #6, #7, #8, #16, #17 }] */
    @WorkerThread
    public final Map<String, Object> values(AFa1qSDK aFa1qSDK) throws UnsupportedEncodingException {
        AFe1tSDK aFe1tSDKAfRDLog;
        AppsFlyerProperties appsFlyerProperties;
        AFe1lSDK aFe1lSDKAFLogger;
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        String string;
        String strAFKeystoreWrapper;
        String strValues;
        String strAFInAppEventParameterName;
        String strAfDebugLog;
        String strAFInAppEventType;
        String str;
        String strValues2;
        String string2;
        String strValueOf4;
        String strValueOf5;
        String strValueOf6;
        PackageManager.NameNotFoundException nameNotFoundException;
        String attributionId;
        AppsFlyerProperties appsFlyerProperties2;
        AFb1fSDK aFb1fSDK;
        String str2;
        boolean z10;
        AFc1uSDK.AFa1wSDK aFa1wSDKValues;
        AFb1fSDK aFb1fSDK2;
        AFa1bSDK aFa1bSDK;
        String[] strArr;
        boolean z11;
        PackageInfo packageInfo;
        String strAFInAppEventParameterName2;
        String str3;
        String strValueOf7;
        String referrer;
        long j10;
        AFb1hSDK aFb1hSDK;
        UiModeManager uiModeManager;
        Context context = AFInAppEventParameterName().onAppOpenAttributionNative().AFInAppEventParameterName;
        String str4 = AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType;
        String str5 = aFa1qSDK.afDebugLog;
        Map map = aFa1qSDK.AFKeystoreWrapper;
        if (map == null) {
            map = new HashMap();
        }
        String string3 = new JSONObject(map).toString();
        String str6 = aFa1qSDK.AFLogger;
        AFb1fSDK aFb1fSDKValueOf = valueOf(context);
        boolean zValues = aFa1qSDK.values();
        Map<String, Object> map2 = aFa1qSDK.AFInAppEventParameterName;
        AFa1bSDK.valueOf(context, map2);
        Boolean bool = AFa1bSDK.valueOf;
        if (bool != null && !bool.booleanValue()) {
            AFInAppEventParameterName(map2).put("ad_ids_disabled", Boolean.TRUE);
        }
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        AFInAppEventParameterName("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", false, new int[]{0, 12, 181, 5}, objArr);
        map2.put(((String) objArr[0]).intern(), Long.toString(time));
        String strValueOf8 = AFb1eSDK.valueOf(context, time);
        if (strValueOf8 != null) {
            map2.put("cksm_v1", strValueOf8);
        }
        try {
            if (!isStopped()) {
                StringBuilder sb2 = new StringBuilder("******* sendTrackingWithEvent: ");
                sb2.append(zValues ? "Launch" : str5);
                AFLogger.afInfoLog(sb2.toString());
            } else {
                AFLogger.afInfoLog("Reporting has been stopped");
            }
            AFInAppEventParameterName().AppsFlyer2dXConversionCallback().AFInAppEventParameterName();
            try {
                List listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
                if (!listAsList.contains(MagiskApp.INTERNET)) {
                    AFLogger.afWarnLog("Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                }
                if (!listAsList.contains(MagiskApp.ACCESS_NETWORK_STATE)) {
                    AFLogger.afWarnLog("Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                }
                if (Build.VERSION.SDK_INT > 32 && !listAsList.contains("com.google.android.gms.permission.AD_ID")) {
                    AFLogger.afWarnLog("Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                    aFe1tSDKAfRDLog = AFInAppEventParameterName().afRDLog();
                    Object[] objArr2 = new Object[1];
                    AFInAppEventParameterName("\u0001", true, new int[]{12, 1, 0, 1}, objArr2);
                    map2.put("af_events_api", ((String) objArr2[0]).intern());
                    Object[] objArr3 = new Object[1];
                    AFInAppEventParameterName("\u0000\u0000\u0000\u0000\u0001", false, new int[]{13, 5, 164, 2}, objArr3);
                    map2.put(((String) objArr3[0]).intern(), Build.BRAND);
                    map2.put(Constants.device, Build.DEVICE);
                    map2.put("product", Build.PRODUCT);
                    map2.put(EmulatorApi.SDK, Integer.toString(Build.VERSION.SDK_INT));
                    map2.put("model", Build.MODEL);
                    map2.put(Constants.deviceType, Build.TYPE);
                    aFe1tSDKAfRDLog.AFKeystoreWrapper(map2);
                    appsFlyerProperties = AppsFlyerProperties.getInstance();
                    aFe1lSDKAFLogger = AFInAppEventParameterName().AFLogger();
                    if (zValues) {
                        if (aFe1tSDKAfRDLog.afErrorLog()) {
                            if (!appsFlyerProperties.isOtherSdkStringDisabled()) {
                                map2.put("batteryLevel", String.valueOf(AFInAppEventParameterName().onConversionDataSuccess().AFInAppEventParameterName(context).AFKeystoreWrapper));
                            }
                            afDebugLog(context);
                            uiModeManager = (UiModeManager) context.getSystemService(UiModeManager.class);
                            if (uiModeManager != null) {
                                map2.put("tv", Boolean.TRUE);
                            }
                            if (AFe1mSDK.AFInAppEventParameterName(context)) {
                                map2.put("inst_app", Boolean.TRUE);
                            }
                        }
                        map2.put("timepassedsincelastlaunch", Long.toString(afErrorLog(context)));
                        aFe1tSDKAfRDLog.AFInAppEventType(map2);
                        aFe1tSDKAfRDLog.values(map2);
                        str3 = this.onResponseNative;
                        if (str3 != null) {
                            map2.put("phone", str3);
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            map2.put("referrer", str6);
                        }
                        strValueOf7 = aFb1fSDKValueOf.valueOf("extraReferrers", (String) null);
                        if (strValueOf7 != null) {
                            map2.put("extraReferrers", strValueOf7);
                        }
                        referrer = appsFlyerProperties.getReferrer(AFInAppEventParameterName().AFKeystoreWrapper());
                        if (!TextUtils.isEmpty(referrer)) {
                            map2.put("referrer", referrer);
                        }
                        j10 = aFe1lSDKAFLogger.afErrorLogForExcManagerOnly;
                        if (j10 != 0) {
                            map2.put("prev_session_dur", Long.valueOf(j10));
                        }
                        aFb1hSDK = this.onResponseErrorNative;
                        if (aFb1hSDK != null) {
                            if (!aFb1hSDK.AFInAppEventParameterName.isEmpty()) {
                                map2.put("partner_data", aFb1hSDK.AFInAppEventParameterName);
                            }
                            if (!aFb1hSDK.AFInAppEventType.isEmpty()) {
                                AFInAppEventParameterName(map2).put("partner_data", aFb1hSDK.AFInAppEventType);
                                aFb1hSDK.AFInAppEventType = new HashMap();
                            }
                        }
                    } else {
                        aFe1tSDKAfRDLog.AFKeystoreWrapper(map2, str5);
                    }
                    strValueOf = valueOf("KSAppsFlyerId");
                    strValueOf2 = valueOf("KSAppsFlyerRICounter");
                    if (strValueOf != null) {
                        map2.put("reinstallCounter", strValueOf2);
                        map2.put("originalAppsflyerId", strValueOf);
                    }
                    strValueOf3 = valueOf(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
                    if (strValueOf3 != null) {
                        map2.put("customData", strValueOf3);
                    }
                    map2.putAll(this.onAppOpenAttribution.afErrorLog().AFInAppEventType());
                    string = appsFlyerProperties.getString(AppsFlyerProperties.EXTENSION);
                    if (string != null) {
                        map2.put(AppsFlyerProperties.EXTENSION, string);
                    }
                    strAFKeystoreWrapper = AFInAppEventParameterName().AFInAppEventParameterName().AFKeystoreWrapper();
                    strValues = values(valueOf(context), strAFKeystoreWrapper);
                    if (strValues == null) {
                        map2.put("af_latestchannel", strAFKeystoreWrapper);
                    } else {
                        map2.put("af_latestchannel", strAFKeystoreWrapper);
                    }
                    strAFInAppEventParameterName = aFe1tSDKAfRDLog.AFInAppEventParameterName();
                    if (strAFInAppEventParameterName != null) {
                        map2.put("af_installstore", strAFInAppEventParameterName.toLowerCase(Locale.getDefault()));
                    }
                    strAfDebugLog = aFe1tSDKAfRDLog.afDebugLog();
                    if (strAfDebugLog != null) {
                        map2.put("af_preinstall_name", strAfDebugLog.toLowerCase(Locale.getDefault()));
                    }
                    strAFInAppEventType = aFe1tSDKAfRDLog.AFInAppEventType();
                    if (strAFInAppEventType != null) {
                        map2.put("af_currentstore", strAFInAppEventType.toLowerCase(Locale.getDefault()));
                    }
                    if (str4 == null) {
                        str = AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType;
                        if (str == null) {
                        }
                        AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
                        AFLogger.afInfoLog("AppsFlyer will not track this event.");
                        return null;
                    }
                    str = AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType;
                    if (str == null) {
                    }
                    AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
                    AFLogger.afInfoLog("AppsFlyer will not track this event.");
                    return null;
                    strValues2 = values();
                    if (strValues2 != null) {
                        map2.put("appUserId", strValues2);
                    }
                    string2 = appsFlyerProperties.getString(AppsFlyerProperties.USER_EMAILS);
                    if (string2 != null) {
                        map2.put("user_emails", string2);
                    } else {
                        strValueOf4 = valueOf(AppsFlyerProperties.USER_EMAIL);
                        if (strValueOf4 != null) {
                            map2.put("sha1_el", AFb1zSDK.values(strValueOf4));
                        }
                    }
                    if (str5 != null) {
                        map2.put(com.salesforce.marketingcloud.config.a.f64108s, str5);
                        map2.put("eventValue", string3);
                    }
                    if (AFLogger() != null) {
                        map2.put("appid", valueOf("appid"));
                    }
                    strValueOf5 = valueOf(AppsFlyerProperties.CURRENCY_CODE);
                    if (strValueOf5 != null) {
                        if (strValueOf5.length() != 3) {
                            StringBuilder sb3 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                            sb3.append(strValueOf5);
                            sb3.append("' is not a legal value.");
                            AFLogger.afWarnLog(sb3.toString());
                        }
                        map2.put("currency", strValueOf5);
                    }
                    strValueOf6 = valueOf(AppsFlyerProperties.IS_UPDATE);
                    if (strValueOf6 != null) {
                        map2.put("isUpdate", strValueOf6);
                    }
                    map2.put("af_preinstalled", Boolean.toString(isPreInstalledApp(context)));
                    if (appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
                        context.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                        attributionId = getAttributionId(context);
                        if (attributionId != null) {
                            map2.put("fb", attributionId);
                        }
                        aFe1tSDKAfRDLog.AFInAppEventType(map2, this.afInfoLog);
                        strAFInAppEventParameterName2 = AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName().onAppOpenAttributionNative(), AFInAppEventParameterName().AFKeystoreWrapper());
                        if (strAFInAppEventParameterName2 != null) {
                            map2.put("uid", strAFInAppEventParameterName2);
                            map2.put("lang", Locale.getDefault().getDisplayLanguage());
                            map2.put("lang_code", Locale.getDefault().getLanguage());
                            map2.put("country", Locale.getDefault().getCountry());
                            aFe1tSDKAfRDLog.values(map2, zValues);
                            aFe1tSDKAfRDLog.valueOf(map2);
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
                            map2.put("installDate", values(simpleDateFormat, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime));
                            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                            if (packageInfo.versionCode > aFb1fSDKValueOf.AFInAppEventType("versionCode", 0)) {
                                valueOf(context).valueOf("versionCode", packageInfo.versionCode);
                            }
                            AFb1cSDK aFb1cSDKAFInAppEventParameterName = AFInAppEventParameterName().AFInAppEventParameterName();
                            map2.put("app_version_code", Integer.toString(packageInfo.versionCode));
                            Context context2 = aFb1cSDKAFInAppEventParameterName.values.AFInAppEventParameterName;
                            map2.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(context2, context2.getPackageName()));
                            map2.put("targetSDKver", Integer.valueOf(aFb1cSDKAFInAppEventParameterName.values.AFInAppEventParameterName.getApplicationInfo().targetSdkVersion));
                            long j11 = packageInfo.firstInstallTime;
                            long j12 = packageInfo.lastUpdateTime;
                            appsFlyerProperties2 = appsFlyerProperties;
                            str2 = str5;
                            Locale locale = Locale.US;
                            aFb1fSDK = aFb1fSDKValueOf;
                            map2.put("date1", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", locale).format(new Date(j11)));
                            map2.put("date2", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", locale).format(new Date(j12)));
                            String strAFInAppEventParameterName3 = aFe1tSDKAfRDLog.AFInAppEventParameterName(simpleDateFormat);
                            Object[] objArr4 = new Object[1];
                            z10 = false;
                            AFInAppEventParameterName("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{18, 15, 186, 9}, objArr4);
                            map2.put(((String) objArr4[0]).intern(), strAFInAppEventParameterName3);
                            this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
                            StringBuilder sb4 = new StringBuilder("didConfigureTokenRefreshService=");
                            sb4.append(this.onInstallConversionDataLoadedNative);
                            AFLogger.afDebugLog(sb4.toString());
                            if (!this.onInstallConversionDataLoadedNative) {
                                map2.put("tokenRefreshConfigured", Boolean.FALSE);
                            }
                            if (zValues) {
                                if (this.AFLogger$LogLevel != null) {
                                    if (map2.get("af_deeplink") != null) {
                                        AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                                    } else {
                                        JSONObject jSONObject = new JSONObject(this.AFLogger$LogLevel);
                                        jSONObject.put("isPush", "true");
                                        map2.put("af_deeplink", jSONObject.toString());
                                    }
                                }
                                this.AFLogger$LogLevel = null;
                                map2.put("open_referrer", aFa1qSDK.values);
                                if (!AFb1vSDK.valueOf(aFa1qSDK.afRDLog)) {
                                    map2.put("af_web_referrer", aFa1qSDK.afRDLog);
                                }
                            }
                            if (!zValues) {
                                map2.putAll(AFInAppEventParameterName().afWarnLog().valueOf());
                            }
                            if (valueOf("advertiserId") == null) {
                                AFa1bSDK.valueOf(context, map2);
                                if (valueOf("advertiserId") != null) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                map2.put("GAID_retry", String.valueOf(z11));
                            }
                            aFa1wSDKValues = AFa1bSDK.values(context.getContentResolver());
                            if (aFa1wSDKValues != null) {
                                map2.put("amazon_aid", aFa1wSDKValues.AFInAppEventParameterName);
                                map2.put("amazon_aid_limit", String.valueOf(aFa1wSDKValues.AFInAppEventType));
                            }
                            map2.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(aFb1fSDK)));
                            aFb1fSDK2 = aFb1fSDK;
                            int iAFInAppEventType = AFInAppEventType(aFb1fSDK2, zValues);
                            map2.put("counter", Integer.toString(iAFInAppEventType));
                            if (str2 != null) {
                                z10 = true;
                            }
                            map2.put("iaecounter", Integer.toString(values(aFb1fSDK2, z10)));
                            if (zValues) {
                                appsFlyerProperties2.valueOf = true;
                            }
                            map2.put("isFirstCall", Boolean.toString(!aFe1tSDKAfRDLog.AFLogger()));
                            aFe1tSDKAfRDLog.AFInAppEventParameterName(zValues, map2, iAFInAppEventType);
                            new AFb1zSDK();
                            map2.put("af_v", AFb1zSDK.values(map2));
                            new AFb1zSDK();
                            map2.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map2));
                            map2.put("ivc", Boolean.valueOf(aFe1tSDKAfRDLog.afInfoLog()));
                            if (aFb1fSDK2.valueOf("is_stop_tracking_used")) {
                                map2.put("istu", String.valueOf(aFb1fSDK2.AFKeystoreWrapper("is_stop_tracking_used")));
                            }
                            HashMap map3 = new HashMap();
                            map3.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                            map3.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                            map2.put("cell", map3);
                            map2.put("sig", aFe1tSDKAfRDLog.valueOf());
                            map2.put("last_boot_time", Long.valueOf(aFe1tSDKAfRDLog.AFKeystoreWrapper()));
                            map2.put("disk", aFe1tSDKAfRDLog.values());
                            aFa1bSDK = this.afDebugLog;
                            if (aFa1bSDK != null) {
                                map2.put("sharing_filter", strArr);
                            }
                        } else {
                            map2.put("lang", Locale.getDefault().getDisplayLanguage());
                            map2.put("lang_code", Locale.getDefault().getLanguage());
                            map2.put("country", Locale.getDefault().getCountry());
                            aFe1tSDKAfRDLog.values(map2, zValues);
                            aFe1tSDKAfRDLog.valueOf(map2);
                            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
                            map2.put("installDate", values(simpleDateFormat2, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime));
                            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                            if (packageInfo.versionCode > aFb1fSDKValueOf.AFInAppEventType("versionCode", 0)) {
                                valueOf(context).valueOf("versionCode", packageInfo.versionCode);
                            }
                            AFb1cSDK aFb1cSDKAFInAppEventParameterName2 = AFInAppEventParameterName().AFInAppEventParameterName();
                            map2.put("app_version_code", Integer.toString(packageInfo.versionCode));
                            Context context3 = aFb1cSDKAFInAppEventParameterName2.values.AFInAppEventParameterName;
                            map2.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(context3, context3.getPackageName()));
                            map2.put("targetSDKver", Integer.valueOf(aFb1cSDKAFInAppEventParameterName2.values.AFInAppEventParameterName.getApplicationInfo().targetSdkVersion));
                            long j13 = packageInfo.firstInstallTime;
                            long j14 = packageInfo.lastUpdateTime;
                            appsFlyerProperties2 = appsFlyerProperties;
                            str2 = str5;
                            Locale locale2 = Locale.US;
                            aFb1fSDK = aFb1fSDKValueOf;
                            map2.put("date1", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", locale2).format(new Date(j13)));
                            map2.put("date2", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", locale2).format(new Date(j14)));
                            String strAFInAppEventParameterName4 = aFe1tSDKAfRDLog.AFInAppEventParameterName(simpleDateFormat2);
                            Object[] objArr5 = new Object[1];
                            z10 = false;
                            AFInAppEventParameterName("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{18, 15, 186, 9}, objArr5);
                            map2.put(((String) objArr5[0]).intern(), strAFInAppEventParameterName4);
                            this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
                            StringBuilder sb5 = new StringBuilder("didConfigureTokenRefreshService=");
                            sb5.append(this.onInstallConversionDataLoadedNative);
                            AFLogger.afDebugLog(sb5.toString());
                            if (!this.onInstallConversionDataLoadedNative) {
                                map2.put("tokenRefreshConfigured", Boolean.FALSE);
                            }
                            if (zValues) {
                                if (this.AFLogger$LogLevel != null) {
                                    if (map2.get("af_deeplink") != null) {
                                        AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                                    } else {
                                        JSONObject jSONObject2 = new JSONObject(this.AFLogger$LogLevel);
                                        jSONObject2.put("isPush", "true");
                                        map2.put("af_deeplink", jSONObject2.toString());
                                    }
                                }
                                this.AFLogger$LogLevel = null;
                                map2.put("open_referrer", aFa1qSDK.values);
                                if (!AFb1vSDK.valueOf(aFa1qSDK.afRDLog)) {
                                    map2.put("af_web_referrer", aFa1qSDK.afRDLog);
                                }
                            }
                            if (!zValues) {
                                map2.putAll(AFInAppEventParameterName().afWarnLog().valueOf());
                            }
                            if (valueOf("advertiserId") == null) {
                                AFa1bSDK.valueOf(context, map2);
                                if (valueOf("advertiserId") != null) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                map2.put("GAID_retry", String.valueOf(z11));
                            }
                            aFa1wSDKValues = AFa1bSDK.values(context.getContentResolver());
                            if (aFa1wSDKValues != null) {
                                map2.put("amazon_aid", aFa1wSDKValues.AFInAppEventParameterName);
                                map2.put("amazon_aid_limit", String.valueOf(aFa1wSDKValues.AFInAppEventType));
                            }
                            map2.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(aFb1fSDK)));
                            aFb1fSDK2 = aFb1fSDK;
                            int iAFInAppEventType2 = AFInAppEventType(aFb1fSDK2, zValues);
                            map2.put("counter", Integer.toString(iAFInAppEventType2));
                            if (str2 != null) {
                                z10 = true;
                            }
                            map2.put("iaecounter", Integer.toString(values(aFb1fSDK2, z10)));
                            if (zValues) {
                                appsFlyerProperties2.valueOf = true;
                            }
                            map2.put("isFirstCall", Boolean.toString(!aFe1tSDKAfRDLog.AFLogger()));
                            aFe1tSDKAfRDLog.AFInAppEventParameterName(zValues, map2, iAFInAppEventType2);
                            new AFb1zSDK();
                            map2.put("af_v", AFb1zSDK.values(map2));
                            new AFb1zSDK();
                            map2.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map2));
                            map2.put("ivc", Boolean.valueOf(aFe1tSDKAfRDLog.afInfoLog()));
                            if (aFb1fSDK2.valueOf("is_stop_tracking_used")) {
                                map2.put("istu", String.valueOf(aFb1fSDK2.AFKeystoreWrapper("is_stop_tracking_used")));
                            }
                            HashMap map4 = new HashMap();
                            map4.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                            map4.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                            map2.put("cell", map4);
                            map2.put("sig", aFe1tSDKAfRDLog.valueOf());
                            map2.put("last_boot_time", Long.valueOf(aFe1tSDKAfRDLog.AFKeystoreWrapper()));
                            map2.put("disk", aFe1tSDKAfRDLog.values());
                            aFa1bSDK = this.afDebugLog;
                            if (aFa1bSDK != null) {
                                map2.put("sharing_filter", strArr);
                            }
                        }
                    } else {
                        aFe1tSDKAfRDLog.AFInAppEventType(map2, this.afInfoLog);
                        strAFInAppEventParameterName2 = AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName().onAppOpenAttributionNative(), AFInAppEventParameterName().AFKeystoreWrapper());
                        if (strAFInAppEventParameterName2 != null) {
                            map2.put("uid", strAFInAppEventParameterName2);
                            map2.put("lang", Locale.getDefault().getDisplayLanguage());
                            map2.put("lang_code", Locale.getDefault().getLanguage());
                            map2.put("country", Locale.getDefault().getCountry());
                            aFe1tSDKAfRDLog.values(map2, zValues);
                            aFe1tSDKAfRDLog.valueOf(map2);
                            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
                            map2.put("installDate", values(simpleDateFormat3, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime));
                            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                            if (packageInfo.versionCode > aFb1fSDKValueOf.AFInAppEventType("versionCode", 0)) {
                                valueOf(context).valueOf("versionCode", packageInfo.versionCode);
                            }
                            AFb1cSDK aFb1cSDKAFInAppEventParameterName3 = AFInAppEventParameterName().AFInAppEventParameterName();
                            map2.put("app_version_code", Integer.toString(packageInfo.versionCode));
                            Context context4 = aFb1cSDKAFInAppEventParameterName3.values.AFInAppEventParameterName;
                            map2.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(context4, context4.getPackageName()));
                            map2.put("targetSDKver", Integer.valueOf(aFb1cSDKAFInAppEventParameterName3.values.AFInAppEventParameterName.getApplicationInfo().targetSdkVersion));
                            long j15 = packageInfo.firstInstallTime;
                            long j16 = packageInfo.lastUpdateTime;
                            appsFlyerProperties2 = appsFlyerProperties;
                            str2 = str5;
                            Locale locale3 = Locale.US;
                            aFb1fSDK = aFb1fSDKValueOf;
                            map2.put("date1", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", locale3).format(new Date(j15)));
                            map2.put("date2", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", locale3).format(new Date(j16)));
                            String strAFInAppEventParameterName5 = aFe1tSDKAfRDLog.AFInAppEventParameterName(simpleDateFormat3);
                            Object[] objArr6 = new Object[1];
                            z10 = false;
                            AFInAppEventParameterName("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{18, 15, 186, 9}, objArr6);
                            map2.put(((String) objArr6[0]).intern(), strAFInAppEventParameterName5);
                            this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
                            StringBuilder sb6 = new StringBuilder("didConfigureTokenRefreshService=");
                            sb6.append(this.onInstallConversionDataLoadedNative);
                            AFLogger.afDebugLog(sb6.toString());
                            if (!this.onInstallConversionDataLoadedNative) {
                                map2.put("tokenRefreshConfigured", Boolean.FALSE);
                            }
                            if (zValues) {
                                if (this.AFLogger$LogLevel != null) {
                                    if (map2.get("af_deeplink") != null) {
                                        AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                                    } else {
                                        JSONObject jSONObject3 = new JSONObject(this.AFLogger$LogLevel);
                                        jSONObject3.put("isPush", "true");
                                        map2.put("af_deeplink", jSONObject3.toString());
                                    }
                                }
                                this.AFLogger$LogLevel = null;
                                map2.put("open_referrer", aFa1qSDK.values);
                                if (!AFb1vSDK.valueOf(aFa1qSDK.afRDLog)) {
                                    map2.put("af_web_referrer", aFa1qSDK.afRDLog);
                                }
                            }
                            if (!zValues) {
                                map2.putAll(AFInAppEventParameterName().afWarnLog().valueOf());
                            }
                            if (valueOf("advertiserId") == null) {
                                AFa1bSDK.valueOf(context, map2);
                                if (valueOf("advertiserId") != null) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                map2.put("GAID_retry", String.valueOf(z11));
                            }
                            aFa1wSDKValues = AFa1bSDK.values(context.getContentResolver());
                            if (aFa1wSDKValues != null) {
                                map2.put("amazon_aid", aFa1wSDKValues.AFInAppEventParameterName);
                                map2.put("amazon_aid_limit", String.valueOf(aFa1wSDKValues.AFInAppEventType));
                            }
                            map2.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(aFb1fSDK)));
                            aFb1fSDK2 = aFb1fSDK;
                            int iAFInAppEventType3 = AFInAppEventType(aFb1fSDK2, zValues);
                            map2.put("counter", Integer.toString(iAFInAppEventType3));
                            if (str2 != null) {
                                z10 = true;
                            }
                            map2.put("iaecounter", Integer.toString(values(aFb1fSDK2, z10)));
                            if (zValues) {
                                appsFlyerProperties2.valueOf = true;
                            }
                            map2.put("isFirstCall", Boolean.toString(!aFe1tSDKAfRDLog.AFLogger()));
                            aFe1tSDKAfRDLog.AFInAppEventParameterName(zValues, map2, iAFInAppEventType3);
                            new AFb1zSDK();
                            map2.put("af_v", AFb1zSDK.values(map2));
                            new AFb1zSDK();
                            map2.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map2));
                            map2.put("ivc", Boolean.valueOf(aFe1tSDKAfRDLog.afInfoLog()));
                            if (aFb1fSDK2.valueOf("is_stop_tracking_used")) {
                                map2.put("istu", String.valueOf(aFb1fSDK2.AFKeystoreWrapper("is_stop_tracking_used")));
                            }
                            HashMap map5 = new HashMap();
                            map5.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                            map5.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                            map2.put("cell", map5);
                            map2.put("sig", aFe1tSDKAfRDLog.valueOf());
                            map2.put("last_boot_time", Long.valueOf(aFe1tSDKAfRDLog.AFKeystoreWrapper()));
                            map2.put("disk", aFe1tSDKAfRDLog.values());
                            aFa1bSDK = this.afDebugLog;
                            if (aFa1bSDK != null) {
                                map2.put("sharing_filter", strArr);
                            }
                        } else {
                            map2.put("lang", Locale.getDefault().getDisplayLanguage());
                            map2.put("lang_code", Locale.getDefault().getLanguage());
                            map2.put("country", Locale.getDefault().getCountry());
                            aFe1tSDKAfRDLog.values(map2, zValues);
                            aFe1tSDKAfRDLog.valueOf(map2);
                            SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
                            map2.put("installDate", values(simpleDateFormat4, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime));
                            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                            if (packageInfo.versionCode > aFb1fSDKValueOf.AFInAppEventType("versionCode", 0)) {
                                valueOf(context).valueOf("versionCode", packageInfo.versionCode);
                            }
                            AFb1cSDK aFb1cSDKAFInAppEventParameterName4 = AFInAppEventParameterName().AFInAppEventParameterName();
                            map2.put("app_version_code", Integer.toString(packageInfo.versionCode));
                            Context context5 = aFb1cSDKAFInAppEventParameterName4.values.AFInAppEventParameterName;
                            map2.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(context5, context5.getPackageName()));
                            map2.put("targetSDKver", Integer.valueOf(aFb1cSDKAFInAppEventParameterName4.values.AFInAppEventParameterName.getApplicationInfo().targetSdkVersion));
                            long j17 = packageInfo.firstInstallTime;
                            long j18 = packageInfo.lastUpdateTime;
                            appsFlyerProperties2 = appsFlyerProperties;
                            str2 = str5;
                            Locale locale4 = Locale.US;
                            aFb1fSDK = aFb1fSDKValueOf;
                            map2.put("date1", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", locale4).format(new Date(j17)));
                            map2.put("date2", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", locale4).format(new Date(j18)));
                            String strAFInAppEventParameterName6 = aFe1tSDKAfRDLog.AFInAppEventParameterName(simpleDateFormat4);
                            Object[] objArr7 = new Object[1];
                            z10 = false;
                            AFInAppEventParameterName("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{18, 15, 186, 9}, objArr7);
                            map2.put(((String) objArr7[0]).intern(), strAFInAppEventParameterName6);
                            this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
                            StringBuilder sb7 = new StringBuilder("didConfigureTokenRefreshService=");
                            sb7.append(this.onInstallConversionDataLoadedNative);
                            AFLogger.afDebugLog(sb7.toString());
                            if (!this.onInstallConversionDataLoadedNative) {
                                map2.put("tokenRefreshConfigured", Boolean.FALSE);
                            }
                            if (zValues) {
                                if (this.AFLogger$LogLevel != null) {
                                    if (map2.get("af_deeplink") != null) {
                                        AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                                    } else {
                                        JSONObject jSONObject4 = new JSONObject(this.AFLogger$LogLevel);
                                        jSONObject4.put("isPush", "true");
                                        map2.put("af_deeplink", jSONObject4.toString());
                                    }
                                }
                                this.AFLogger$LogLevel = null;
                                map2.put("open_referrer", aFa1qSDK.values);
                                if (!AFb1vSDK.valueOf(aFa1qSDK.afRDLog)) {
                                    map2.put("af_web_referrer", aFa1qSDK.afRDLog);
                                }
                            }
                            if (!zValues) {
                                map2.putAll(AFInAppEventParameterName().afWarnLog().valueOf());
                            }
                            if (valueOf("advertiserId") == null) {
                                AFa1bSDK.valueOf(context, map2);
                                if (valueOf("advertiserId") != null) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                map2.put("GAID_retry", String.valueOf(z11));
                            }
                            aFa1wSDKValues = AFa1bSDK.values(context.getContentResolver());
                            if (aFa1wSDKValues != null) {
                                map2.put("amazon_aid", aFa1wSDKValues.AFInAppEventParameterName);
                                map2.put("amazon_aid_limit", String.valueOf(aFa1wSDKValues.AFInAppEventType));
                            }
                            map2.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(aFb1fSDK)));
                            aFb1fSDK2 = aFb1fSDK;
                            int iAFInAppEventType4 = AFInAppEventType(aFb1fSDK2, zValues);
                            map2.put("counter", Integer.toString(iAFInAppEventType4));
                            if (str2 != null) {
                                z10 = true;
                            }
                            map2.put("iaecounter", Integer.toString(values(aFb1fSDK2, z10)));
                            if (zValues) {
                                appsFlyerProperties2.valueOf = true;
                            }
                            map2.put("isFirstCall", Boolean.toString(!aFe1tSDKAfRDLog.AFLogger()));
                            aFe1tSDKAfRDLog.AFInAppEventParameterName(zValues, map2, iAFInAppEventType4);
                            new AFb1zSDK();
                            map2.put("af_v", AFb1zSDK.values(map2));
                            new AFb1zSDK();
                            map2.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map2));
                            map2.put("ivc", Boolean.valueOf(aFe1tSDKAfRDLog.afInfoLog()));
                            if (aFb1fSDK2.valueOf("is_stop_tracking_used")) {
                                map2.put("istu", String.valueOf(aFb1fSDK2.AFKeystoreWrapper("is_stop_tracking_used")));
                            }
                            HashMap map6 = new HashMap();
                            map6.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                            map6.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                            map2.put("cell", map6);
                            map2.put("sig", aFe1tSDKAfRDLog.valueOf());
                            map2.put("last_boot_time", Long.valueOf(aFe1tSDKAfRDLog.AFKeystoreWrapper()));
                            map2.put("disk", aFe1tSDKAfRDLog.values());
                            aFa1bSDK = this.afDebugLog;
                            if (aFa1bSDK != null) {
                                map2.put("sharing_filter", strArr);
                            }
                        }
                    }
                } else {
                    aFe1tSDKAfRDLog = AFInAppEventParameterName().afRDLog();
                    Object[] objArr8 = new Object[1];
                    AFInAppEventParameterName("\u0001", true, new int[]{12, 1, 0, 1}, objArr8);
                    map2.put("af_events_api", ((String) objArr8[0]).intern());
                    Object[] objArr9 = new Object[1];
                    AFInAppEventParameterName("\u0000\u0000\u0000\u0000\u0001", false, new int[]{13, 5, 164, 2}, objArr9);
                    map2.put(((String) objArr9[0]).intern(), Build.BRAND);
                    map2.put(Constants.device, Build.DEVICE);
                    map2.put("product", Build.PRODUCT);
                    map2.put(EmulatorApi.SDK, Integer.toString(Build.VERSION.SDK_INT));
                    map2.put("model", Build.MODEL);
                    map2.put(Constants.deviceType, Build.TYPE);
                    aFe1tSDKAfRDLog.AFKeystoreWrapper(map2);
                    appsFlyerProperties = AppsFlyerProperties.getInstance();
                    aFe1lSDKAFLogger = AFInAppEventParameterName().AFLogger();
                    if (zValues) {
                        if (aFe1tSDKAfRDLog.afErrorLog()) {
                            if (!appsFlyerProperties.isOtherSdkStringDisabled()) {
                                map2.put("batteryLevel", String.valueOf(AFInAppEventParameterName().onConversionDataSuccess().AFInAppEventParameterName(context).AFKeystoreWrapper));
                            }
                            afDebugLog(context);
                            uiModeManager = (UiModeManager) context.getSystemService(UiModeManager.class);
                            if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                                map2.put("tv", Boolean.TRUE);
                            }
                            if (AFe1mSDK.AFInAppEventParameterName(context)) {
                                map2.put("inst_app", Boolean.TRUE);
                            }
                        }
                        map2.put("timepassedsincelastlaunch", Long.toString(afErrorLog(context)));
                        aFe1tSDKAfRDLog.AFInAppEventType(map2);
                        aFe1tSDKAfRDLog.values(map2);
                        str3 = this.onResponseNative;
                        if (str3 != null) {
                            map2.put("phone", str3);
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            map2.put("referrer", str6);
                        }
                        strValueOf7 = aFb1fSDKValueOf.valueOf("extraReferrers", (String) null);
                        if (strValueOf7 != null) {
                            map2.put("extraReferrers", strValueOf7);
                        }
                        referrer = appsFlyerProperties.getReferrer(AFInAppEventParameterName().AFKeystoreWrapper());
                        if (!TextUtils.isEmpty(referrer) && map2.get("referrer") == null) {
                            map2.put("referrer", referrer);
                        }
                        j10 = aFe1lSDKAFLogger.afErrorLogForExcManagerOnly;
                        if (j10 != 0) {
                            map2.put("prev_session_dur", Long.valueOf(j10));
                        }
                        aFb1hSDK = this.onResponseErrorNative;
                        if (aFb1hSDK != null) {
                            if (!aFb1hSDK.AFInAppEventParameterName.isEmpty()) {
                                map2.put("partner_data", aFb1hSDK.AFInAppEventParameterName);
                            }
                            if (!aFb1hSDK.AFInAppEventType.isEmpty()) {
                                AFInAppEventParameterName(map2).put("partner_data", aFb1hSDK.AFInAppEventType);
                                aFb1hSDK.AFInAppEventType = new HashMap();
                            }
                        }
                    } else {
                        aFe1tSDKAfRDLog.AFKeystoreWrapper(map2, str5);
                    }
                    strValueOf = valueOf("KSAppsFlyerId");
                    strValueOf2 = valueOf("KSAppsFlyerRICounter");
                    if (strValueOf != null && strValueOf2 != null && Integer.parseInt(strValueOf2) > 0) {
                        map2.put("reinstallCounter", strValueOf2);
                        map2.put("originalAppsflyerId", strValueOf);
                    }
                    strValueOf3 = valueOf(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
                    if (strValueOf3 != null) {
                        map2.put("customData", strValueOf3);
                    }
                    map2.putAll(this.onAppOpenAttribution.afErrorLog().AFInAppEventType());
                    string = appsFlyerProperties.getString(AppsFlyerProperties.EXTENSION);
                    if (string != null && string.length() > 0) {
                        map2.put(AppsFlyerProperties.EXTENSION, string);
                    }
                    strAFKeystoreWrapper = AFInAppEventParameterName().AFInAppEventParameterName().AFKeystoreWrapper();
                    strValues = values(valueOf(context), strAFKeystoreWrapper);
                    if ((strValues == null && !strValues.equals(strAFKeystoreWrapper)) || (strValues == null && strAFKeystoreWrapper != null)) {
                        map2.put("af_latestchannel", strAFKeystoreWrapper);
                    }
                    strAFInAppEventParameterName = aFe1tSDKAfRDLog.AFInAppEventParameterName();
                    if (strAFInAppEventParameterName != null) {
                        map2.put("af_installstore", strAFInAppEventParameterName.toLowerCase(Locale.getDefault()));
                    }
                    strAfDebugLog = aFe1tSDKAfRDLog.afDebugLog();
                    if (strAfDebugLog != null) {
                        map2.put("af_preinstall_name", strAfDebugLog.toLowerCase(Locale.getDefault()));
                    }
                    strAFInAppEventType = aFe1tSDKAfRDLog.AFInAppEventType();
                    if (strAFInAppEventType != null) {
                        map2.put("af_currentstore", strAFInAppEventType.toLowerCase(Locale.getDefault()));
                    }
                    if (str4 == null && str4.length() > 0) {
                        map2.put("appsflyerKey", str4);
                    } else {
                        str = AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType;
                        if (str == null && str.length() > 0) {
                            map2.put("appsflyerKey", str);
                        } else {
                            AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
                            AFLogger.afInfoLog("AppsFlyer will not track this event.");
                            return null;
                        }
                    }
                    strValues2 = values();
                    if (strValues2 != null) {
                        map2.put("appUserId", strValues2);
                    }
                    string2 = appsFlyerProperties.getString(AppsFlyerProperties.USER_EMAILS);
                    if (string2 != null) {
                        map2.put("user_emails", string2);
                    } else {
                        strValueOf4 = valueOf(AppsFlyerProperties.USER_EMAIL);
                        if (strValueOf4 != null) {
                            map2.put("sha1_el", AFb1zSDK.values(strValueOf4));
                        }
                    }
                    if (str5 != null) {
                        map2.put(com.salesforce.marketingcloud.config.a.f64108s, str5);
                        map2.put("eventValue", string3);
                    }
                    if (AFLogger() != null) {
                        map2.put("appid", valueOf("appid"));
                    }
                    strValueOf5 = valueOf(AppsFlyerProperties.CURRENCY_CODE);
                    if (strValueOf5 != null) {
                        if (strValueOf5.length() != 3) {
                            StringBuilder sb8 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                            sb8.append(strValueOf5);
                            sb8.append("' is not a legal value.");
                            AFLogger.afWarnLog(sb8.toString());
                        }
                        map2.put("currency", strValueOf5);
                    }
                    strValueOf6 = valueOf(AppsFlyerProperties.IS_UPDATE);
                    if (strValueOf6 != null) {
                        map2.put("isUpdate", strValueOf6);
                    }
                    map2.put("af_preinstalled", Boolean.toString(isPreInstalledApp(context)));
                    if (appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
                        try {
                            try {
                                try {
                                    context.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                                    attributionId = getAttributionId(context);
                                } catch (PackageManager.NameNotFoundException e5) {
                                    nameNotFoundException = e5;
                                    AFLogger.afErrorLogForExcManagerOnly("com.facebook.katana not found", nameNotFoundException, true);
                                    AFLogger.afWarnLog("Exception while collecting facebook's attribution ID. ");
                                    attributionId = null;
                                }
                            } catch (Throwable th2) {
                                AFLogger.afErrorLog("Exception while collecting facebook's attribution ID. ", th2);
                                attributionId = null;
                            }
                        } catch (PackageManager.NameNotFoundException e7) {
                            nameNotFoundException = e7;
                        }
                        if (attributionId != null) {
                            map2.put("fb", attributionId);
                        }
                        aFe1tSDKAfRDLog.AFInAppEventType(map2, this.afInfoLog);
                        try {
                            strAFInAppEventParameterName2 = AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName().onAppOpenAttributionNative(), AFInAppEventParameterName().AFKeystoreWrapper());
                            if (strAFInAppEventParameterName2 != null) {
                                map2.put("uid", strAFInAppEventParameterName2);
                                try {
                                    map2.put("lang", Locale.getDefault().getDisplayLanguage());
                                } catch (Exception e10) {
                                    AFLogger.afErrorLog("Exception while collecting display language name. ", e10);
                                }
                                try {
                                    map2.put("lang_code", Locale.getDefault().getLanguage());
                                } catch (Exception e11) {
                                    AFLogger.afErrorLog("Exception while collecting display language code. ", e11);
                                }
                                try {
                                    map2.put("country", Locale.getDefault().getCountry());
                                } catch (Exception e12) {
                                    AFLogger.afErrorLog("Exception while collecting country name. ", e12);
                                }
                                aFe1tSDKAfRDLog.values(map2, zValues);
                                aFe1tSDKAfRDLog.valueOf(map2);
                                SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
                                try {
                                    map2.put("installDate", values(simpleDateFormat5, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime));
                                } catch (Exception e13) {
                                    AFLogger.afErrorLog("Exception while collecting install date. ", e13);
                                }
                                try {
                                    try {
                                        packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                                        if (packageInfo.versionCode > aFb1fSDKValueOf.AFInAppEventType("versionCode", 0)) {
                                            valueOf(context).valueOf("versionCode", packageInfo.versionCode);
                                        }
                                        AFb1cSDK aFb1cSDKAFInAppEventParameterName5 = AFInAppEventParameterName().AFInAppEventParameterName();
                                        map2.put("app_version_code", Integer.toString(packageInfo.versionCode));
                                        Context context6 = aFb1cSDKAFInAppEventParameterName5.values.AFInAppEventParameterName;
                                        map2.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(context6, context6.getPackageName()));
                                        map2.put("targetSDKver", Integer.valueOf(aFb1cSDKAFInAppEventParameterName5.values.AFInAppEventParameterName.getApplicationInfo().targetSdkVersion));
                                        try {
                                            long j19 = packageInfo.firstInstallTime;
                                            try {
                                                long j110 = packageInfo.lastUpdateTime;
                                                appsFlyerProperties2 = appsFlyerProperties;
                                                try {
                                                    str2 = str5;
                                                    try {
                                                        Locale locale5 = Locale.US;
                                                        aFb1fSDK = aFb1fSDKValueOf;
                                                        try {
                                                            map2.put("date1", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", locale5).format(new Date(j19)));
                                                            map2.put("date2", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", locale5).format(new Date(j110)));
                                                            String strAFInAppEventParameterName7 = aFe1tSDKAfRDLog.AFInAppEventParameterName(simpleDateFormat5);
                                                            Object[] objArr10 = new Object[1];
                                                            z10 = false;
                                                            try {
                                                                AFInAppEventParameterName("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{18, 15, 186, 9}, objArr10);
                                                                map2.put(((String) objArr10[0]).intern(), strAFInAppEventParameterName7);
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            z10 = false;
                                                            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
                                                            this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
                                                            StringBuilder sb9 = new StringBuilder("didConfigureTokenRefreshService=");
                                                            sb9.append(this.onInstallConversionDataLoadedNative);
                                                            AFLogger.afDebugLog(sb9.toString());
                                                            if (!this.onInstallConversionDataLoadedNative) {
                                                                map2.put("tokenRefreshConfigured", Boolean.FALSE);
                                                            }
                                                            if (zValues) {
                                                                if (this.AFLogger$LogLevel != null) {
                                                                    if (map2.get("af_deeplink") != null) {
                                                                        AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                                                                    } else {
                                                                        JSONObject jSONObject5 = new JSONObject(this.AFLogger$LogLevel);
                                                                        jSONObject5.put("isPush", "true");
                                                                        map2.put("af_deeplink", jSONObject5.toString());
                                                                    }
                                                                }
                                                                this.AFLogger$LogLevel = null;
                                                                map2.put("open_referrer", aFa1qSDK.values);
                                                                if (!AFb1vSDK.valueOf(aFa1qSDK.afRDLog)) {
                                                                    map2.put("af_web_referrer", aFa1qSDK.afRDLog);
                                                                }
                                                            }
                                                            if (!zValues) {
                                                                try {
                                                                    map2.putAll(AFInAppEventParameterName().afWarnLog().valueOf());
                                                                } catch (Exception e14) {
                                                                    AFLogger.afErrorLogForExcManagerOnly("error while getting sensors data", e14);
                                                                    StringBuilder sb10 = new StringBuilder("Unexpected exception from AFSensorManager: ");
                                                                    sb10.append(e14.getMessage());
                                                                    AFLogger.afRDLog(sb10.toString());
                                                                }
                                                            }
                                                            if (valueOf("advertiserId") == null) {
                                                                AFa1bSDK.valueOf(context, map2);
                                                                if (valueOf("advertiserId") != null) {
                                                                    z11 = true;
                                                                } else {
                                                                    z11 = z10;
                                                                }
                                                                map2.put("GAID_retry", String.valueOf(z11));
                                                            }
                                                            aFa1wSDKValues = AFa1bSDK.values(context.getContentResolver());
                                                            if (aFa1wSDKValues != null) {
                                                                map2.put("amazon_aid", aFa1wSDKValues.AFInAppEventParameterName);
                                                                map2.put("amazon_aid_limit", String.valueOf(aFa1wSDKValues.AFInAppEventType));
                                                            }
                                                            map2.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(aFb1fSDK)));
                                                            aFb1fSDK2 = aFb1fSDK;
                                                            int iAFInAppEventType5 = AFInAppEventType(aFb1fSDK2, zValues);
                                                            map2.put("counter", Integer.toString(iAFInAppEventType5));
                                                            if (str2 != null) {
                                                                z10 = true;
                                                            }
                                                            map2.put("iaecounter", Integer.toString(values(aFb1fSDK2, z10)));
                                                            if (zValues) {
                                                                appsFlyerProperties2.valueOf = true;
                                                            }
                                                            map2.put("isFirstCall", Boolean.toString(!aFe1tSDKAfRDLog.AFLogger()));
                                                            aFe1tSDKAfRDLog.AFInAppEventParameterName(zValues, map2, iAFInAppEventType5);
                                                            new AFb1zSDK();
                                                            map2.put("af_v", AFb1zSDK.values(map2));
                                                            new AFb1zSDK();
                                                            map2.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map2));
                                                            map2.put("ivc", Boolean.valueOf(aFe1tSDKAfRDLog.afInfoLog()));
                                                            if (aFb1fSDK2.valueOf("is_stop_tracking_used")) {
                                                                map2.put("istu", String.valueOf(aFb1fSDK2.AFKeystoreWrapper("is_stop_tracking_used")));
                                                            }
                                                            HashMap map7 = new HashMap();
                                                            map7.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                                                            map7.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                                                            map2.put("cell", map7);
                                                            map2.put("sig", aFe1tSDKAfRDLog.valueOf());
                                                            map2.put("last_boot_time", Long.valueOf(aFe1tSDKAfRDLog.AFKeystoreWrapper()));
                                                            map2.put("disk", aFe1tSDKAfRDLog.values());
                                                            aFa1bSDK = this.afDebugLog;
                                                            if (aFa1bSDK != null) {
                                                                map2.put("sharing_filter", strArr);
                                                            }
                                                            return map2;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        aFb1fSDK = aFb1fSDKValueOf;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    aFb1fSDK = aFb1fSDKValueOf;
                                                    str2 = str5;
                                                    z10 = false;
                                                    AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
                                                    this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
                                                    StringBuilder sb11 = new StringBuilder("didConfigureTokenRefreshService=");
                                                    sb11.append(this.onInstallConversionDataLoadedNative);
                                                    AFLogger.afDebugLog(sb11.toString());
                                                    if (!this.onInstallConversionDataLoadedNative) {
                                                        map2.put("tokenRefreshConfigured", Boolean.FALSE);
                                                    }
                                                    if (zValues) {
                                                        if (this.AFLogger$LogLevel != null) {
                                                            if (map2.get("af_deeplink") != null) {
                                                                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                                                            } else {
                                                                JSONObject jSONObject6 = new JSONObject(this.AFLogger$LogLevel);
                                                                jSONObject6.put("isPush", "true");
                                                                map2.put("af_deeplink", jSONObject6.toString());
                                                            }
                                                        }
                                                        this.AFLogger$LogLevel = null;
                                                        map2.put("open_referrer", aFa1qSDK.values);
                                                        if (!AFb1vSDK.valueOf(aFa1qSDK.afRDLog)) {
                                                            map2.put("af_web_referrer", aFa1qSDK.afRDLog);
                                                        }
                                                    }
                                                    if (!zValues) {
                                                        map2.putAll(AFInAppEventParameterName().afWarnLog().valueOf());
                                                    }
                                                    if (valueOf("advertiserId") == null) {
                                                        AFa1bSDK.valueOf(context, map2);
                                                        if (valueOf("advertiserId") != null) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = z10;
                                                        }
                                                        map2.put("GAID_retry", String.valueOf(z11));
                                                    }
                                                    aFa1wSDKValues = AFa1bSDK.values(context.getContentResolver());
                                                    if (aFa1wSDKValues != null) {
                                                        map2.put("amazon_aid", aFa1wSDKValues.AFInAppEventParameterName);
                                                        map2.put("amazon_aid_limit", String.valueOf(aFa1wSDKValues.AFInAppEventType));
                                                    }
                                                    map2.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(aFb1fSDK)));
                                                    aFb1fSDK2 = aFb1fSDK;
                                                    int iAFInAppEventType6 = AFInAppEventType(aFb1fSDK2, zValues);
                                                    map2.put("counter", Integer.toString(iAFInAppEventType6));
                                                    if (str2 != null) {
                                                        z10 = true;
                                                    }
                                                    map2.put("iaecounter", Integer.toString(values(aFb1fSDK2, z10)));
                                                    if (zValues) {
                                                        appsFlyerProperties2.valueOf = true;
                                                    }
                                                    map2.put("isFirstCall", Boolean.toString(!aFe1tSDKAfRDLog.AFLogger()));
                                                    aFe1tSDKAfRDLog.AFInAppEventParameterName(zValues, map2, iAFInAppEventType6);
                                                    new AFb1zSDK();
                                                    map2.put("af_v", AFb1zSDK.values(map2));
                                                    new AFb1zSDK();
                                                    map2.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map2));
                                                    map2.put("ivc", Boolean.valueOf(aFe1tSDKAfRDLog.afInfoLog()));
                                                    if (aFb1fSDK2.valueOf("is_stop_tracking_used")) {
                                                        map2.put("istu", String.valueOf(aFb1fSDK2.AFKeystoreWrapper("is_stop_tracking_used")));
                                                    }
                                                    HashMap map8 = new HashMap();
                                                    map8.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                                                    map8.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                                                    map2.put("cell", map8);
                                                    map2.put("sig", aFe1tSDKAfRDLog.valueOf());
                                                    map2.put("last_boot_time", Long.valueOf(aFe1tSDKAfRDLog.AFKeystoreWrapper()));
                                                    map2.put("disk", aFe1tSDKAfRDLog.values());
                                                    aFa1bSDK = this.afDebugLog;
                                                    if (aFa1bSDK != null) {
                                                        map2.put("sharing_filter", strArr);
                                                    }
                                                    return map2;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                appsFlyerProperties2 = appsFlyerProperties;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            appsFlyerProperties2 = appsFlyerProperties;
                                            aFb1fSDK = aFb1fSDKValueOf;
                                            str2 = str5;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        appsFlyerProperties2 = appsFlyerProperties;
                                        aFb1fSDK = aFb1fSDKValueOf;
                                        z10 = false;
                                        str2 = str5;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    appsFlyerProperties2 = appsFlyerProperties;
                                    aFb1fSDK = aFb1fSDKValueOf;
                                    str2 = str5;
                                }
                                this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
                                StringBuilder sb12 = new StringBuilder("didConfigureTokenRefreshService=");
                                sb12.append(this.onInstallConversionDataLoadedNative);
                                AFLogger.afDebugLog(sb12.toString());
                                if (!this.onInstallConversionDataLoadedNative) {
                                    map2.put("tokenRefreshConfigured", Boolean.FALSE);
                                }
                                if (zValues) {
                                    if (this.AFLogger$LogLevel != null) {
                                        if (map2.get("af_deeplink") != null) {
                                            AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                                        } else {
                                            JSONObject jSONObject7 = new JSONObject(this.AFLogger$LogLevel);
                                            jSONObject7.put("isPush", "true");
                                            map2.put("af_deeplink", jSONObject7.toString());
                                        }
                                    }
                                    this.AFLogger$LogLevel = null;
                                    map2.put("open_referrer", aFa1qSDK.values);
                                    if (!AFb1vSDK.valueOf(aFa1qSDK.afRDLog)) {
                                        map2.put("af_web_referrer", aFa1qSDK.afRDLog);
                                    }
                                }
                                if (!zValues) {
                                    map2.putAll(AFInAppEventParameterName().afWarnLog().valueOf());
                                }
                                if (valueOf("advertiserId") == null) {
                                    AFa1bSDK.valueOf(context, map2);
                                    if (valueOf("advertiserId") != null) {
                                        z11 = true;
                                    } else {
                                        z11 = z10;
                                    }
                                    map2.put("GAID_retry", String.valueOf(z11));
                                }
                                aFa1wSDKValues = AFa1bSDK.values(context.getContentResolver());
                                if (aFa1wSDKValues != null) {
                                    map2.put("amazon_aid", aFa1wSDKValues.AFInAppEventParameterName);
                                    map2.put("amazon_aid_limit", String.valueOf(aFa1wSDKValues.AFInAppEventType));
                                }
                                map2.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(aFb1fSDK)));
                                aFb1fSDK2 = aFb1fSDK;
                                int iAFInAppEventType7 = AFInAppEventType(aFb1fSDK2, zValues);
                                map2.put("counter", Integer.toString(iAFInAppEventType7));
                                if (str2 != null) {
                                    z10 = true;
                                }
                                map2.put("iaecounter", Integer.toString(values(aFb1fSDK2, z10)));
                                if (zValues && iAFInAppEventType7 == 1) {
                                    appsFlyerProperties2.valueOf = true;
                                }
                                map2.put("isFirstCall", Boolean.toString(!aFe1tSDKAfRDLog.AFLogger()));
                                aFe1tSDKAfRDLog.AFInAppEventParameterName(zValues, map2, iAFInAppEventType7);
                                new AFb1zSDK();
                                map2.put("af_v", AFb1zSDK.values(map2));
                                new AFb1zSDK();
                                map2.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map2));
                                map2.put("ivc", Boolean.valueOf(aFe1tSDKAfRDLog.afInfoLog()));
                                if (aFb1fSDK2.valueOf("is_stop_tracking_used")) {
                                    map2.put("istu", String.valueOf(aFb1fSDK2.AFKeystoreWrapper("is_stop_tracking_used")));
                                }
                                HashMap map9 = new HashMap();
                                map9.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                                map9.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                                map2.put("cell", map9);
                                map2.put("sig", aFe1tSDKAfRDLog.valueOf());
                                map2.put("last_boot_time", Long.valueOf(aFe1tSDKAfRDLog.AFKeystoreWrapper()));
                                map2.put("disk", aFe1tSDKAfRDLog.values());
                                aFa1bSDK = this.afDebugLog;
                                if (aFa1bSDK != null && (strArr = aFa1bSDK.AFInAppEventType) != null) {
                                    map2.put("sharing_filter", strArr);
                                }
                            } else {
                                map2.put("lang", Locale.getDefault().getDisplayLanguage());
                                map2.put("lang_code", Locale.getDefault().getLanguage());
                                map2.put("country", Locale.getDefault().getCountry());
                                aFe1tSDKAfRDLog.values(map2, zValues);
                                aFe1tSDKAfRDLog.valueOf(map2);
                                SimpleDateFormat simpleDateFormat6 = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
                                map2.put("installDate", values(simpleDateFormat6, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime));
                                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                                if (packageInfo.versionCode > aFb1fSDKValueOf.AFInAppEventType("versionCode", 0)) {
                                    valueOf(context).valueOf("versionCode", packageInfo.versionCode);
                                }
                                AFb1cSDK aFb1cSDKAFInAppEventParameterName6 = AFInAppEventParameterName().AFInAppEventParameterName();
                                map2.put("app_version_code", Integer.toString(packageInfo.versionCode));
                                Context context7 = aFb1cSDKAFInAppEventParameterName6.values.AFInAppEventParameterName;
                                map2.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(context7, context7.getPackageName()));
                                map2.put("targetSDKver", Integer.valueOf(aFb1cSDKAFInAppEventParameterName6.values.AFInAppEventParameterName.getApplicationInfo().targetSdkVersion));
                                long j111 = packageInfo.firstInstallTime;
                                long j112 = packageInfo.lastUpdateTime;
                                appsFlyerProperties2 = appsFlyerProperties;
                                str2 = str5;
                                Locale locale6 = Locale.US;
                                aFb1fSDK = aFb1fSDKValueOf;
                                map2.put("date1", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", locale6).format(new Date(j111)));
                                map2.put("date2", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", locale6).format(new Date(j112)));
                                String strAFInAppEventParameterName8 = aFe1tSDKAfRDLog.AFInAppEventParameterName(simpleDateFormat6);
                                Object[] objArr11 = new Object[1];
                                z10 = false;
                                AFInAppEventParameterName("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{18, 15, 186, 9}, objArr11);
                                map2.put(((String) objArr11[0]).intern(), strAFInAppEventParameterName8);
                                this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
                                StringBuilder sb13 = new StringBuilder("didConfigureTokenRefreshService=");
                                sb13.append(this.onInstallConversionDataLoadedNative);
                                AFLogger.afDebugLog(sb13.toString());
                                if (!this.onInstallConversionDataLoadedNative) {
                                    map2.put("tokenRefreshConfigured", Boolean.FALSE);
                                }
                                if (zValues) {
                                    if (this.AFLogger$LogLevel != null) {
                                        if (map2.get("af_deeplink") != null) {
                                            AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                                        } else {
                                            JSONObject jSONObject8 = new JSONObject(this.AFLogger$LogLevel);
                                            jSONObject8.put("isPush", "true");
                                            map2.put("af_deeplink", jSONObject8.toString());
                                        }
                                    }
                                    this.AFLogger$LogLevel = null;
                                    map2.put("open_referrer", aFa1qSDK.values);
                                    if (!AFb1vSDK.valueOf(aFa1qSDK.afRDLog)) {
                                        map2.put("af_web_referrer", aFa1qSDK.afRDLog);
                                    }
                                }
                                if (!zValues) {
                                    map2.putAll(AFInAppEventParameterName().afWarnLog().valueOf());
                                }
                                if (valueOf("advertiserId") == null) {
                                    AFa1bSDK.valueOf(context, map2);
                                    if (valueOf("advertiserId") != null) {
                                        z11 = true;
                                    } else {
                                        z11 = z10;
                                    }
                                    map2.put("GAID_retry", String.valueOf(z11));
                                }
                                aFa1wSDKValues = AFa1bSDK.values(context.getContentResolver());
                                if (aFa1wSDKValues != null) {
                                    map2.put("amazon_aid", aFa1wSDKValues.AFInAppEventParameterName);
                                    map2.put("amazon_aid_limit", String.valueOf(aFa1wSDKValues.AFInAppEventType));
                                }
                                map2.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(aFb1fSDK)));
                                aFb1fSDK2 = aFb1fSDK;
                                int iAFInAppEventType8 = AFInAppEventType(aFb1fSDK2, zValues);
                                map2.put("counter", Integer.toString(iAFInAppEventType8));
                                if (str2 != null) {
                                    z10 = true;
                                }
                                map2.put("iaecounter", Integer.toString(values(aFb1fSDK2, z10)));
                                if (zValues) {
                                    appsFlyerProperties2.valueOf = true;
                                }
                                map2.put("isFirstCall", Boolean.toString(!aFe1tSDKAfRDLog.AFLogger()));
                                aFe1tSDKAfRDLog.AFInAppEventParameterName(zValues, map2, iAFInAppEventType8);
                                new AFb1zSDK();
                                map2.put("af_v", AFb1zSDK.values(map2));
                                new AFb1zSDK();
                                map2.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map2));
                                map2.put("ivc", Boolean.valueOf(aFe1tSDKAfRDLog.afInfoLog()));
                                if (aFb1fSDK2.valueOf("is_stop_tracking_used")) {
                                    map2.put("istu", String.valueOf(aFb1fSDK2.AFKeystoreWrapper("is_stop_tracking_used")));
                                }
                                HashMap map10 = new HashMap();
                                map10.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                                map10.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                                map2.put("cell", map10);
                                map2.put("sig", aFe1tSDKAfRDLog.valueOf());
                                map2.put("last_boot_time", Long.valueOf(aFe1tSDKAfRDLog.AFKeystoreWrapper()));
                                map2.put("disk", aFe1tSDKAfRDLog.values());
                                aFa1bSDK = this.afDebugLog;
                                if (aFa1bSDK != null) {
                                    map2.put("sharing_filter", strArr);
                                }
                            }
                        } catch (Exception e15) {
                            StringBuilder sb14 = new StringBuilder("ERROR: could not get uid ");
                            sb14.append(e15.getMessage());
                            AFLogger.afErrorLog(sb14.toString(), e15);
                        }
                    } else {
                        aFe1tSDKAfRDLog.AFInAppEventType(map2, this.afInfoLog);
                        strAFInAppEventParameterName2 = AFa1aSDK.AFInAppEventParameterName(AFInAppEventParameterName().onAppOpenAttributionNative(), AFInAppEventParameterName().AFKeystoreWrapper());
                        if (strAFInAppEventParameterName2 != null) {
                            map2.put("uid", strAFInAppEventParameterName2);
                            map2.put("lang", Locale.getDefault().getDisplayLanguage());
                            map2.put("lang_code", Locale.getDefault().getLanguage());
                            map2.put("country", Locale.getDefault().getCountry());
                            aFe1tSDKAfRDLog.values(map2, zValues);
                            aFe1tSDKAfRDLog.valueOf(map2);
                            SimpleDateFormat simpleDateFormat7 = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
                            map2.put("installDate", values(simpleDateFormat7, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime));
                            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                            if (packageInfo.versionCode > aFb1fSDKValueOf.AFInAppEventType("versionCode", 0)) {
                                valueOf(context).valueOf("versionCode", packageInfo.versionCode);
                            }
                            AFb1cSDK aFb1cSDKAFInAppEventParameterName7 = AFInAppEventParameterName().AFInAppEventParameterName();
                            map2.put("app_version_code", Integer.toString(packageInfo.versionCode));
                            Context context8 = aFb1cSDKAFInAppEventParameterName7.values.AFInAppEventParameterName;
                            map2.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(context8, context8.getPackageName()));
                            map2.put("targetSDKver", Integer.valueOf(aFb1cSDKAFInAppEventParameterName7.values.AFInAppEventParameterName.getApplicationInfo().targetSdkVersion));
                            long j113 = packageInfo.firstInstallTime;
                            long j114 = packageInfo.lastUpdateTime;
                            appsFlyerProperties2 = appsFlyerProperties;
                            str2 = str5;
                            Locale locale7 = Locale.US;
                            aFb1fSDK = aFb1fSDKValueOf;
                            map2.put("date1", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", locale7).format(new Date(j113)));
                            map2.put("date2", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", locale7).format(new Date(j114)));
                            String strAFInAppEventParameterName9 = aFe1tSDKAfRDLog.AFInAppEventParameterName(simpleDateFormat7);
                            Object[] objArr12 = new Object[1];
                            z10 = false;
                            AFInAppEventParameterName("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{18, 15, 186, 9}, objArr12);
                            map2.put(((String) objArr12[0]).intern(), strAFInAppEventParameterName9);
                            this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
                            StringBuilder sb15 = new StringBuilder("didConfigureTokenRefreshService=");
                            sb15.append(this.onInstallConversionDataLoadedNative);
                            AFLogger.afDebugLog(sb15.toString());
                            if (!this.onInstallConversionDataLoadedNative) {
                                map2.put("tokenRefreshConfigured", Boolean.FALSE);
                            }
                            if (zValues) {
                                if (this.AFLogger$LogLevel != null) {
                                    if (map2.get("af_deeplink") != null) {
                                        AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                                    } else {
                                        JSONObject jSONObject9 = new JSONObject(this.AFLogger$LogLevel);
                                        jSONObject9.put("isPush", "true");
                                        map2.put("af_deeplink", jSONObject9.toString());
                                    }
                                }
                                this.AFLogger$LogLevel = null;
                                map2.put("open_referrer", aFa1qSDK.values);
                                if (!AFb1vSDK.valueOf(aFa1qSDK.afRDLog)) {
                                    map2.put("af_web_referrer", aFa1qSDK.afRDLog);
                                }
                            }
                            if (!zValues) {
                                map2.putAll(AFInAppEventParameterName().afWarnLog().valueOf());
                            }
                            if (valueOf("advertiserId") == null) {
                                AFa1bSDK.valueOf(context, map2);
                                if (valueOf("advertiserId") != null) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                map2.put("GAID_retry", String.valueOf(z11));
                            }
                            aFa1wSDKValues = AFa1bSDK.values(context.getContentResolver());
                            if (aFa1wSDKValues != null) {
                                map2.put("amazon_aid", aFa1wSDKValues.AFInAppEventParameterName);
                                map2.put("amazon_aid_limit", String.valueOf(aFa1wSDKValues.AFInAppEventType));
                            }
                            map2.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(aFb1fSDK)));
                            aFb1fSDK2 = aFb1fSDK;
                            int iAFInAppEventType9 = AFInAppEventType(aFb1fSDK2, zValues);
                            map2.put("counter", Integer.toString(iAFInAppEventType9));
                            if (str2 != null) {
                                z10 = true;
                            }
                            map2.put("iaecounter", Integer.toString(values(aFb1fSDK2, z10)));
                            if (zValues) {
                                appsFlyerProperties2.valueOf = true;
                            }
                            map2.put("isFirstCall", Boolean.toString(!aFe1tSDKAfRDLog.AFLogger()));
                            aFe1tSDKAfRDLog.AFInAppEventParameterName(zValues, map2, iAFInAppEventType9);
                            new AFb1zSDK();
                            map2.put("af_v", AFb1zSDK.values(map2));
                            new AFb1zSDK();
                            map2.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map2));
                            map2.put("ivc", Boolean.valueOf(aFe1tSDKAfRDLog.afInfoLog()));
                            if (aFb1fSDK2.valueOf("is_stop_tracking_used")) {
                                map2.put("istu", String.valueOf(aFb1fSDK2.AFKeystoreWrapper("is_stop_tracking_used")));
                            }
                            HashMap map11 = new HashMap();
                            map11.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                            map11.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                            map2.put("cell", map11);
                            map2.put("sig", aFe1tSDKAfRDLog.valueOf());
                            map2.put("last_boot_time", Long.valueOf(aFe1tSDKAfRDLog.AFKeystoreWrapper()));
                            map2.put("disk", aFe1tSDKAfRDLog.values());
                            aFa1bSDK = this.afDebugLog;
                            if (aFa1bSDK != null) {
                                map2.put("sharing_filter", strArr);
                            }
                        } else {
                            map2.put("lang", Locale.getDefault().getDisplayLanguage());
                            map2.put("lang_code", Locale.getDefault().getLanguage());
                            map2.put("country", Locale.getDefault().getCountry());
                            aFe1tSDKAfRDLog.values(map2, zValues);
                            aFe1tSDKAfRDLog.valueOf(map2);
                            SimpleDateFormat simpleDateFormat8 = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
                            map2.put("installDate", values(simpleDateFormat8, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime));
                            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                            if (packageInfo.versionCode > aFb1fSDKValueOf.AFInAppEventType("versionCode", 0)) {
                                valueOf(context).valueOf("versionCode", packageInfo.versionCode);
                            }
                            AFb1cSDK aFb1cSDKAFInAppEventParameterName8 = AFInAppEventParameterName().AFInAppEventParameterName();
                            map2.put("app_version_code", Integer.toString(packageInfo.versionCode));
                            Context context9 = aFb1cSDKAFInAppEventParameterName8.values.AFInAppEventParameterName;
                            map2.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(context9, context9.getPackageName()));
                            map2.put("targetSDKver", Integer.valueOf(aFb1cSDKAFInAppEventParameterName8.values.AFInAppEventParameterName.getApplicationInfo().targetSdkVersion));
                            long j115 = packageInfo.firstInstallTime;
                            long j116 = packageInfo.lastUpdateTime;
                            appsFlyerProperties2 = appsFlyerProperties;
                            str2 = str5;
                            Locale locale8 = Locale.US;
                            aFb1fSDK = aFb1fSDKValueOf;
                            map2.put("date1", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", locale8).format(new Date(j115)));
                            map2.put("date2", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", locale8).format(new Date(j116)));
                            String strAFInAppEventParameterName10 = aFe1tSDKAfRDLog.AFInAppEventParameterName(simpleDateFormat8);
                            Object[] objArr13 = new Object[1];
                            z10 = false;
                            AFInAppEventParameterName("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{18, 15, 186, 9}, objArr13);
                            map2.put(((String) objArr13[0]).intern(), strAFInAppEventParameterName10);
                            this.onInstallConversionDataLoadedNative = AFe1sSDK.AFInAppEventParameterName(context);
                            StringBuilder sb16 = new StringBuilder("didConfigureTokenRefreshService=");
                            sb16.append(this.onInstallConversionDataLoadedNative);
                            AFLogger.afDebugLog(sb16.toString());
                            if (!this.onInstallConversionDataLoadedNative) {
                                map2.put("tokenRefreshConfigured", Boolean.FALSE);
                            }
                            if (zValues) {
                                if (this.AFLogger$LogLevel != null) {
                                    if (map2.get("af_deeplink") != null) {
                                        AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                                    } else {
                                        JSONObject jSONObject10 = new JSONObject(this.AFLogger$LogLevel);
                                        jSONObject10.put("isPush", "true");
                                        map2.put("af_deeplink", jSONObject10.toString());
                                    }
                                }
                                this.AFLogger$LogLevel = null;
                                map2.put("open_referrer", aFa1qSDK.values);
                                if (!AFb1vSDK.valueOf(aFa1qSDK.afRDLog)) {
                                    map2.put("af_web_referrer", aFa1qSDK.afRDLog);
                                }
                            }
                            if (!zValues) {
                                map2.putAll(AFInAppEventParameterName().afWarnLog().valueOf());
                            }
                            if (valueOf("advertiserId") == null) {
                                AFa1bSDK.valueOf(context, map2);
                                if (valueOf("advertiserId") != null) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                map2.put("GAID_retry", String.valueOf(z11));
                            }
                            aFa1wSDKValues = AFa1bSDK.values(context.getContentResolver());
                            if (aFa1wSDKValues != null) {
                                map2.put("amazon_aid", aFa1wSDKValues.AFInAppEventParameterName);
                                map2.put("amazon_aid_limit", String.valueOf(aFa1wSDKValues.AFInAppEventType));
                            }
                            map2.put("registeredUninstall", Boolean.valueOf(AFe1sSDK.AFInAppEventType(aFb1fSDK)));
                            aFb1fSDK2 = aFb1fSDK;
                            int iAFInAppEventType10 = AFInAppEventType(aFb1fSDK2, zValues);
                            map2.put("counter", Integer.toString(iAFInAppEventType10));
                            if (str2 != null) {
                                z10 = true;
                            }
                            map2.put("iaecounter", Integer.toString(values(aFb1fSDK2, z10)));
                            if (zValues) {
                                appsFlyerProperties2.valueOf = true;
                            }
                            map2.put("isFirstCall", Boolean.toString(!aFe1tSDKAfRDLog.AFLogger()));
                            aFe1tSDKAfRDLog.AFInAppEventParameterName(zValues, map2, iAFInAppEventType10);
                            new AFb1zSDK();
                            map2.put("af_v", AFb1zSDK.values(map2));
                            new AFb1zSDK();
                            map2.put("af_v2", AFb1zSDK.AFKeystoreWrapper(map2));
                            map2.put("ivc", Boolean.valueOf(aFe1tSDKAfRDLog.afInfoLog()));
                            if (aFb1fSDK2.valueOf("is_stop_tracking_used")) {
                                map2.put("istu", String.valueOf(aFb1fSDK2.AFKeystoreWrapper("is_stop_tracking_used")));
                            }
                            HashMap map12 = new HashMap();
                            map12.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                            map12.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                            map2.put("cell", map12);
                            map2.put("sig", aFe1tSDKAfRDLog.valueOf());
                            map2.put("last_boot_time", Long.valueOf(aFe1tSDKAfRDLog.AFKeystoreWrapper()));
                            map2.put("disk", aFe1tSDKAfRDLog.values());
                            aFa1bSDK = this.afDebugLog;
                            if (aFa1bSDK != null) {
                                map2.put("sharing_filter", strArr);
                            }
                        }
                    }
                }
            } catch (Exception e16) {
                AFLogger.afErrorLog("Exception while validation permissions. ", e16);
            }
        } catch (Throwable th11) {
            AFLogger.afErrorLog(th11.getLocalizedMessage(), th11, true);
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AFInAppEventParameterName(AFc1zSDK aFc1zSDK) {
        int i10 = onConversionDataFail + 31;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        aFc1zSDK.AppsFlyer2dXConversionCallback().valueOf();
        int i12 = onAttributionFailure + 69;
        onConversionDataFail = i12 % 128;
        int i13 = i12 % 2;
    }

    private static boolean AFInAppEventParameterName(String str, boolean z10) {
        int i10 = onConversionDataFail + 105;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 == 0) {
            return AppsFlyerProperties.getInstance().getBoolean(str, z10);
        }
        AppsFlyerProperties.getInstance().getBoolean(str, z10);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventParameterName(AFe1zSDK aFe1zSDK) {
        int i10 = onConversionDataFail + 115;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 == 0) {
            if (aFe1zSDK == AFe1zSDK.SUCCESS) {
                int i11 = onAttributionFailure + 9;
                onConversionDataFail = i11 % 128;
                if (i11 % 2 != 0) {
                    AFInAppEventParameterName().onResponseErrorNative().values();
                    return;
                } else {
                    AFInAppEventParameterName().onResponseErrorNative().values();
                    throw null;
                }
            }
            return;
        }
        AFe1zSDK aFe1zSDK2 = AFe1zSDK.SUCCESS;
        throw null;
    }

    private void AFInAppEventParameterName(Context context) {
        this.onConversionDataSuccess = new HashMap();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final AFa1uSDK.AFa1xSDK aFa1xSDK = new AFa1uSDK.AFa1xSDK() { // from class: com.appsflyer.internal.AFa1dSDK.4
            @Override // com.appsflyer.internal.AFa1uSDK.AFa1xSDK
            public final void AFInAppEventParameterName(String str) {
                AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put("error", str);
            }

            @Override // com.appsflyer.internal.AFa1uSDK.AFa1xSDK
            public final void AFInAppEventType(String str, String str2, String str3) {
                if (str != null) {
                    AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
                    AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put(DynamicLink.Builder.KEY_LINK, str);
                    if (str2 != null) {
                        AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put("target_url", str2);
                    }
                    if (str3 != null) {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        map2.put("promo_code", str3);
                        map.put("deeplink_context", map2);
                        AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put("extras", map);
                    }
                } else {
                    AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put(DynamicLink.Builder.KEY_LINK, "");
                }
                AFa1dSDK.AFInAppEventType(AFa1dSDK.this).put("ttr", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        };
        try {
            Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
            final Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
            Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
            Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
            Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1uSDK.1
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                    String string;
                    String string2;
                    String string3;
                    Bundle bundle;
                    if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                        AFa1xSDK aFa1xSDK2 = aFa1xSDK;
                        if (aFa1xSDK2 != null) {
                            aFa1xSDK2.AFInAppEventParameterName("onDeferredAppLinkDataFetched invocation failed");
                        }
                        return null;
                    }
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", new Class[0]).invoke(cls.cast(obj2), new Object[0]));
                        if (bundle2 != null) {
                            string2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                            string3 = bundle2.getString("target_url");
                            Bundle bundle3 = bundle2.getBundle("extras");
                            string = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                        } else {
                            string = null;
                            string2 = null;
                            string3 = null;
                        }
                        AFa1xSDK aFa1xSDK3 = aFa1xSDK;
                        if (aFa1xSDK3 != null) {
                            aFa1xSDK3.AFInAppEventType(string2, string3, string);
                        }
                    } else {
                        AFa1xSDK aFa1xSDK4 = aFa1xSDK;
                        if (aFa1xSDK4 != null) {
                            aFa1xSDK4.AFInAppEventType(null, null, null);
                        }
                    }
                    return null;
                }
            });
            String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
            if (TextUtils.isEmpty(string)) {
                int i10 = onConversionDataFail + 55;
                onAttributionFailure = i10 % 128;
                if (i10 % 2 == 0) {
                    aFa1xSDK.AFInAppEventParameterName("Facebook app id not defined in resources");
                    return;
                } else {
                    aFa1xSDK.AFInAppEventParameterName("Facebook app id not defined in resources");
                    throw null;
                }
            }
            method.invoke(null, context, string, objNewProxyInstance);
            int i11 = onAttributionFailure + 21;
            onConversionDataFail = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e5);
            aFa1xSDK.AFInAppEventParameterName(e5.toString());
        } catch (IllegalAccessException e7) {
            AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e7);
            aFa1xSDK.AFInAppEventParameterName(e7.toString());
        } catch (NoSuchMethodException e10) {
            AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e10);
            aFa1xSDK.AFInAppEventParameterName(e10.toString());
        } catch (InvocationTargetException e11) {
            AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e11);
            aFa1xSDK.AFInAppEventParameterName(e11.toString());
        }
    }

    private static String valueOf(String str) {
        int i10 = onConversionDataFail + 55;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        String string = AppsFlyerProperties.getInstance().getString(str);
        int i12 = onAttributionFailure + 69;
        onConversionDataFail = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 40 / 0;
        }
        return string;
    }

    private void valueOf(Context context, String str, Map<String, Object> map) {
        Activity activity;
        AFe1aSDK aFe1aSDK = new AFe1aSDK();
        aFe1aSDK.afDebugLog = str;
        aFe1aSDK.AFKeystoreWrapper = map;
        if (context instanceof Activity) {
            int i10 = onConversionDataFail + 29;
            onAttributionFailure = i10 % 128;
            int i11 = i10 % 2;
            activity = (Activity) context;
        } else {
            int i12 = onConversionDataFail + 25;
            onAttributionFailure = i12 % 128;
            int i13 = i12 % 2;
            activity = null;
        }
        values(aFe1aSDK, activity);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01cf  */
    private void valueOf(AFa1qSDK aFa1qSDK) throws UnsupportedEncodingException {
        String strAFInAppEventParameterName;
        long j10;
        boolean z10;
        Context context = AFInAppEventParameterName().onAppOpenAttributionNative().AFInAppEventParameterName;
        if (context == null) {
            AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        AFb1fSDK aFb1fSDKValueOf = valueOf(context);
        AppsFlyerProperties.getInstance().saveProperties(aFb1fSDKValueOf);
        if (!AFInAppEventParameterName().AFVersionDeclaration().values()) {
            AFLogger.afInfoLog("sendWithEvent from activity: ".concat(context.getClass().getName()));
            int i10 = onAttributionFailure + 61;
            onConversionDataFail = i10 % 128;
            int i11 = i10 % 2;
        }
        boolean zValues = aFa1qSDK.values();
        Map<String, ?> mapValues = values(aFa1qSDK);
        String str = (String) mapValues.get("appsflyerKey");
        if (str != null) {
            int i12 = onConversionDataFail + 101;
            onAttributionFailure = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            if (str.length() != 0) {
                if (!isStopped()) {
                    AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
                }
                boolean z11 = false;
                int i13 = 0;
                int iAFInAppEventType = AFInAppEventType(aFb1fSDKValueOf, false);
                AFg1zSDK aFg1zSDK = new AFg1zSDK(this.onAppOpenAttribution);
                Intrinsics.checkNotNullParameter(aFa1qSDK, "");
                boolean zValues2 = aFa1qSDK.values();
                boolean z12 = aFa1qSDK instanceof AFe1gSDK;
                boolean z13 = aFa1qSDK instanceof AFe1jSDK;
                boolean z14 = aFa1qSDK instanceof AFe1iSDK;
                if ((aFa1qSDK instanceof AFe1hSDK) || z14) {
                    strAFInAppEventParameterName = AFg1zSDK.afErrorLog;
                    if (strAFInAppEventParameterName == null) {
                        int i14 = onConversionDataFail + 77;
                        onAttributionFailure = i14 % 128;
                        if (i14 % 2 == 0) {
                            strAFInAppEventParameterName = aFg1zSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFg1zSDK.valueOf);
                        } else {
                            aFg1zSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFg1zSDK.valueOf);
                            throw null;
                        }
                    }
                } else if (z13) {
                    strAFInAppEventParameterName = AFg1zSDK.afWarnLog;
                    if (strAFInAppEventParameterName == null) {
                        int i15 = onAttributionFailure + 81;
                        onConversionDataFail = i15 % 128;
                        if (i15 % 2 != 0) {
                            strAFInAppEventParameterName = aFg1zSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFg1zSDK.AFInAppEventType);
                        } else {
                            aFg1zSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFg1zSDK.AFInAppEventType);
                            throw null;
                        }
                    }
                } else if (z12) {
                    int i16 = onAttributionFailure + 11;
                    onConversionDataFail = i16 % 128;
                    int i17 = i16 % 2;
                    strAFInAppEventParameterName = AFg1zSDK.afInfoLog;
                    if (strAFInAppEventParameterName == null) {
                        strAFInAppEventParameterName = aFg1zSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFg1zSDK.AFKeystoreWrapper);
                    }
                } else if (!zValues2) {
                    strAFInAppEventParameterName = AFg1zSDK.getLevel;
                    if (strAFInAppEventParameterName == null) {
                        strAFInAppEventParameterName = aFg1zSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFg1zSDK.afRDLog);
                    }
                } else if (iAFInAppEventType < 2) {
                    int i18 = onAttributionFailure + 51;
                    onConversionDataFail = i18 % 128;
                    int i19 = i18 % 2;
                    strAFInAppEventParameterName = AFg1zSDK.AFLogger$LogLevel;
                    if (strAFInAppEventParameterName == null) {
                        strAFInAppEventParameterName = aFg1zSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFg1zSDK.AFLogger);
                    }
                    int i20 = onConversionDataFail + 67;
                    onAttributionFailure = i20 % 128;
                    int i21 = i20 % 2;
                } else {
                    strAFInAppEventParameterName = AFg1zSDK.AFVersionDeclaration;
                    if (strAFInAppEventParameterName == null) {
                        strAFInAppEventParameterName = aFg1zSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFg1zSDK.afDebugLog);
                    }
                }
                StringBuilder sbD = androidx.camera.core.impl.utils.c.d(strAFInAppEventParameterName);
                sbD.append(aFg1zSDK.valueOf.AFInAppEventParameterName().values.AFInAppEventParameterName.getPackageName());
                StringBuilder sbD2 = androidx.camera.core.impl.utils.c.d(AFg1zSDK.valueOf(sbD.toString(), z12));
                String strAFKeystoreWrapper = aFg1zSDK.valueOf.AFInAppEventParameterName().AFKeystoreWrapper();
                String strConcat = strAFKeystoreWrapper != null ? "&channel=".concat(strAFKeystoreWrapper) : null;
                sbD2.append(strConcat != null ? strConcat : "");
                String string = sbD2.toString();
                valueOf(mapValues);
                AFa1ySDK aFa1ySDK = new AFa1ySDK(this, aFa1qSDK.valueOf(string).AFInAppEventType(mapValues).valueOf(iAFInAppEventType), z11 ? (byte) 1 : (byte) 0);
                if (zValues) {
                    AFf1jSDK[] aFf1jSDKArrAFLogger$LogLevel = AFLogger$LogLevel();
                    int length = aFf1jSDKArrAFLogger$LogLevel.length;
                    boolean z15 = false;
                    while (i13 < length) {
                        AFf1jSDK aFf1jSDK = aFf1jSDKArrAFLogger$LogLevel[i13];
                        if (aFf1jSDK.afRDLog == AFf1jSDK.AFa1vSDK.STARTED) {
                            StringBuilder sb2 = new StringBuilder("Failed to get ");
                            sb2.append(aFf1jSDK.AFInAppEventParameterName);
                            sb2.append(" referrer, wait ...");
                            AFLogger.afDebugLog(sb2.toString());
                            z15 = true;
                        }
                        i13++;
                        z15 = z15;
                    }
                    if (!this.onDeepLinkingNative) {
                        z10 = z15 ? 1 : 0;
                    } else {
                        int i22 = onConversionDataFail + 107;
                        onAttributionFailure = i22 % 128;
                        int i23 = i22 % 2;
                        if (afWarnLog()) {
                            z10 = z15 ? 1 : 0;
                        } else {
                            AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                            z10 = true;
                        }
                    }
                    z11 = z10;
                    if (AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType()) {
                        z11 = true;
                    }
                }
                ScheduledExecutorService scheduledExecutorServiceValues = AFInAppEventParameterName().values();
                if (z11) {
                    j10 = 500;
                } else {
                    int i24 = onAttributionFailure + 65;
                    onConversionDataFail = i24 % 128;
                    int i25 = i24 % 2;
                    j10 = 0;
                }
                AFInAppEventType(scheduledExecutorServiceValues, aFa1ySDK, j10, TimeUnit.MILLISECONDS);
                return;
            }
        }
        AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
        AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.AFInAppEventType;
        if (appsFlyerRequestListener != null) {
            appsFlyerRequestListener.onError(41, "No dev key");
        }
    }

    public static boolean AFKeystoreWrapper(Context context) {
        int i10 = onConversionDataFail + 71;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                return true;
            }
            int i12 = onConversionDataFail + 25;
            onAttributionFailure = i12 % 128;
            int i13 = i12 % 2;
            try {
                context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                return true;
            } catch (PackageManager.NameNotFoundException e5) {
                AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", e5);
                return false;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th2);
        }
    }

    private void AFInAppEventType(Context context, AFe1nSDK aFe1nSDK) {
        int i10 = onConversionDataFail + 117;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventType(context);
        AFe1lSDK aFe1lSDKAFLogger = AFInAppEventParameterName().AFLogger();
        AFe1oSDK aFe1oSDKAFKeystoreWrapper = AFa1rSDK.AFKeystoreWrapper(context);
        if (!(!aFe1lSDKAFLogger.values())) {
            aFe1lSDKAFLogger.values.put("api_name", aFe1nSDK.toString());
            aFe1lSDKAFLogger.values(aFe1oSDKAFKeystoreWrapper);
            int i12 = onConversionDataFail + 3;
            onAttributionFailure = i12 % 128;
            int i13 = i12 % 2;
        }
        aFe1lSDKAFLogger.AFInAppEventParameterName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        AFInAppEventType(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        return AFInAppEventParameterName().AFInAppEventParameterName().valueOf(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r3 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r3 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        r1 = r1 + 5;
        com.appsflyer.internal.AFa1dSDK.onAttributionFailure = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return null;
     */
    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String AFKeystoreWrapper(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFa1dSDK.onAttributionFailure
            int r0 = r0 + 83
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1dSDK.onConversionDataFail = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L13
            r0 = 74
            int r0 = r0 / 0
            if (r3 != 0) goto L1f
            goto L15
        L13:
            if (r3 != 0) goto L1f
        L15:
            int r1 = r1 + 5
            int r3 = r1 % 128
            com.appsflyer.internal.AFa1dSDK.onAttributionFailure = r3
            int r1 = r1 % 2
            r3 = 0
            return r3
        L1f:
            r2.AFInAppEventType(r3)
            com.appsflyer.internal.AFc1zSDK r3 = r2.AFInAppEventParameterName()
            com.appsflyer.internal.AFb1cSDK r3 = r3.AFInAppEventParameterName()
            java.lang.String r3 = r3.valueOf(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.AFKeystoreWrapper(android.content.Context, java.lang.String):java.lang.String");
    }

    private void AFInAppEventType(Context context, Map<String, Object> map, AFa1qSDK aFa1qSDK) {
        Activity activity;
        int i10 = onConversionDataFail + 19;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventType(context);
        aFa1qSDK.AFInAppEventType(map);
        if (!(!(context instanceof Activity))) {
            int i12 = onConversionDataFail;
            int i13 = i12 + 83;
            onAttributionFailure = i13 % 128;
            int i14 = i13 % 2;
            activity = (Activity) context;
            int i15 = i12 + 107;
            onAttributionFailure = i15 % 128;
            int i16 = i15 % 2;
        } else {
            activity = null;
        }
        values(aFa1qSDK, activity);
    }

    public final int AFInAppEventType(AFb1fSDK aFb1fSDK, boolean z10) {
        int i10 = onAttributionFailure + 75;
        onConversionDataFail = i10 % 128;
        if (i10 % 2 == 0) {
            valueOf(aFb1fSDK, "appsFlyerCount", z10);
            throw null;
        }
        int iValueOf = valueOf(aFb1fSDK, "appsFlyerCount", z10);
        int i11 = onAttributionFailure + 41;
        onConversionDataFail = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 71 / 0;
        }
        return iValueOf;
    }

    private static void AFInAppEventType(@NonNull ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j10, TimeUnit timeUnit) {
        int i10 = onConversionDataFail + 107;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        try {
            scheduledExecutorService.schedule(runnable, j10, timeUnit);
            int i12 = onConversionDataFail + 109;
            onAttributionFailure = i12 % 128;
            int i13 = i12 % 2;
        } catch (RejectedExecutionException e5) {
            AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e5);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("scheduleJob failed with Exception", th2);
        }
    }

    private void AFInAppEventParameterName(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i10 = onConversionDataFail + 97;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (appsFlyerConversionListener == null) {
            return;
        }
        this.AFInAppEventType = appsFlyerConversionListener;
        int i11 = onConversionDataFail + 21;
        onAttributionFailure = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002c  */
    private boolean AFInAppEventParameterName(AFa1qSDK aFa1qSDK, AFb1fSDK aFb1fSDK) {
        boolean z10;
        int i10 = onConversionDataFail + 49;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        int iAFInAppEventType = AFInAppEventType(aFb1fSDK, false);
        if (iAFInAppEventType == 1) {
            int i12 = onAttributionFailure + 109;
            int i13 = i12 % 128;
            onConversionDataFail = i13;
            int i14 = i12 % 2;
            if (!(!(aFa1qSDK instanceof AFe1hSDK))) {
                z10 = false;
            } else {
                int i15 = i13 + 89;
                onAttributionFailure = i15 % 128;
                int i16 = i15 % 2;
                z10 = true;
            }
        } else {
            z10 = false;
        }
        return (!aFb1fSDK.AFKeystoreWrapper(AppsFlyerProperties.NEW_REFERRER_SENT) && iAFInAppEventType == 1) || z10;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    @NonNull
    @Deprecated
    public static String AFInAppEventType(HttpURLConnection httpURLConnection) {
        InputStreamReader inputStreamReader;
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream == null) {
                    errorStream = httpURLConnection.getInputStream();
                }
                inputStreamReader = new InputStreamReader(errorStream, Charset.defaultCharset());
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                    boolean z10 = false;
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            int i10 = onAttributionFailure + 41;
                            onConversionDataFail = i10 % 128;
                            int i11 = i10 % 2;
                            sb2.append(z10 ? '\n' : "");
                            sb2.append(line);
                            z10 = true;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            try {
                                StringBuilder sb3 = new StringBuilder("Could not read connection response from: ");
                                sb3.append(httpURLConnection.getURL().toString());
                                AFLogger.afErrorLog(sb3.toString(), th);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                int i12 = onAttributionFailure + 69;
                                onConversionDataFail = i12 % 128;
                                int i13 = i12 % 2;
                            } catch (Throwable th3) {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                        if (inputStreamReader != null) {
                                            int i14 = onConversionDataFail + 117;
                                            onAttributionFailure = i14 % 128;
                                            int i15 = i14 % 2;
                                            inputStreamReader.close();
                                        }
                                    } catch (Throwable th4) {
                                        AFLogger.afErrorLogForExcManagerOnly("readServerResponse error", th4);
                                        throw th3;
                                    }
                                } else if (inputStreamReader != null) {
                                    int i16 = onConversionDataFail + 117;
                                    onAttributionFailure = i16 % 128;
                                    int i17 = i16 % 2;
                                    inputStreamReader.close();
                                }
                                throw th3;
                            }
                        }
                    }
                    bufferedReader2.close();
                    inputStreamReader.close();
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                inputStreamReader = null;
            }
        } catch (Throwable th7) {
            AFLogger.afErrorLogForExcManagerOnly("readServerResponse error", th7);
        }
        String string = sb2.toString();
        try {
            new JSONObject(string);
            return string;
        } catch (JSONException e5) {
            AFLogger.afErrorLogForExcManagerOnly("error while parsing readServerResponse", e5);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("string_response", string);
                return jSONObject.toString();
            } catch (JSONException e7) {
                AFLogger.afErrorLogForExcManagerOnly("RESPONSE_NOT_JSON error", e7);
                return new JSONObject().toString();
            }
        }
    }

    public static Map<String, Object> AFInAppEventParameterName(Map<String, Object> map) {
        int i10 = onAttributionFailure + 65;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        if (map.containsKey("meta")) {
            int i12 = onAttributionFailure + 63;
            onConversionDataFail = i12 % 128;
            int i13 = i12 % 2;
            return (Map) map.get("meta");
        }
        HashMap map2 = new HashMap();
        map.put("meta", map2);
        return map2;
    }

    private int AFInAppEventParameterName(AFb1fSDK aFb1fSDK) {
        int i10 = onConversionDataFail + 27;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        return valueOf(aFb1fSDK, "appsFlyerAdRevenueCount", true);
    }

    private static void AFInAppEventParameterName(String str) {
        try {
            if (!new JSONObject(str).has("pid")) {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                int i10 = onConversionDataFail + 39;
                onAttributionFailure = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
            int i12 = onAttributionFailure + 121;
            onConversionDataFail = i12 % 128;
            int i13 = i12 % 2;
            AFKeystoreWrapper("preInstallName", str);
        } catch (JSONException e5) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e5);
        }
    }

    private static void AFInAppEventParameterName(String str, boolean z10, int[] iArr, Object[] objArr) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (AFg1mSDK.AFInAppEventType) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(onResponse, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    AFg1mSDK.AFKeystoreWrapper = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = AFg1mSDK.AFKeystoreWrapper;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        AFg1mSDK.AFKeystoreWrapper = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    AFg1mSDK.AFKeystoreWrapper = 0;
                    while (true) {
                        int i16 = AFg1mSDK.AFKeystoreWrapper;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        AFg1mSDK.AFKeystoreWrapper = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    AFg1mSDK.AFKeystoreWrapper = 0;
                    while (true) {
                        int i17 = AFg1mSDK.AFKeystoreWrapper;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        AFg1mSDK.AFKeystoreWrapper = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str2;
    }

    public final void AFInAppEventType(@NonNull Context context) {
        int i10 = onConversionDataFail + 25;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 == 0) {
            AFc1xSDK aFc1xSDK = this.onAppOpenAttribution;
            if (context != null) {
                AFb1bSDK aFb1bSDK = aFc1xSDK.AFInAppEventParameterName;
                if (context != null) {
                    aFb1bSDK.AFInAppEventParameterName = context.getApplicationContext();
                    int i11 = onConversionDataFail + 91;
                    onAttributionFailure = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
            int i13 = onAttributionFailure + 73;
            onConversionDataFail = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 15 / 0;
                return;
            }
            return;
        }
        throw null;
    }

    private void AFInAppEventType(@NonNull AFa1qSDK aFa1qSDK, @Nullable Activity activity) {
        int i10 = onConversionDataFail + 75;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        AFf1tSDK aFf1tSDKOnResponseNative = AFInAppEventParameterName().onResponseNative();
        aFa1qSDK.values = aFf1tSDKOnResponseNative.AFInAppEventType(activity);
        aFa1qSDK.afRDLog = aFf1tSDKOnResponseNative.valueOf(activity);
        int i12 = onConversionDataFail + 35;
        onAttributionFailure = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 18 / 0;
        }
    }

    private void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        boolean z10;
        byte b10 = 0;
        if (aFa1qSDK.afDebugLog == null) {
            int i10 = onAttributionFailure + 97;
            onConversionDataFail = i10 % 128;
            int i11 = i10 % 2;
            z10 = true;
        } else {
            z10 = false;
        }
        if (AFKeystoreWrapper()) {
            int i12 = onConversionDataFail + 71;
            onAttributionFailure = i12 % 128;
            int i13 = i12 % 2;
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z10) {
            int i14 = onConversionDataFail + 125;
            onAttributionFailure = i14 % 128;
            int i15 = i14 % 2;
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                if (afInfoLog()) {
                    int i16 = onConversionDataFail + 77;
                    onAttributionFailure = i16 % 128;
                    int i17 = i16 % 2;
                    AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.AFInAppEventType;
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                        return;
                    }
                    return;
                }
            } else {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            }
            this.AFLogger = System.currentTimeMillis();
        }
        AFInAppEventType(AFInAppEventParameterName().values(), new AFa1vSDK(this, aFa1qSDK, b10), 0L, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0056 A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:9:0x002c, B:13:0x0042, B:15:0x0048, B:24:0x0056, B:22:0x0050, B:25:0x005b, B:27:0x006b, B:29:0x0073), top: B:33:0x002c }] */
    private void valueOf(Map<String, Object> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return;
        }
        int i10 = onConversionDataFail + 53;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        if (map.get("advertiserId") != null) {
            try {
                if (AFb1vSDK.AFInAppEventParameterName(this.afInfoLog)) {
                    int i12 = onAttributionFailure + 51;
                    onConversionDataFail = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 17 / 0;
                        if (map.remove("android_id") != null) {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                        }
                    } else if (map.remove("android_id") != null) {
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                    }
                }
                if (!AFb1vSDK.AFInAppEventParameterName(AFInAppEventParameterName().AFVersionDeclaration().valueOf) || map.remove("imei") == null) {
                    return;
                }
                AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
            } catch (Exception e5) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e5);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    private static String valueOf(Activity activity) {
        int i10;
        int i11 = onAttributionFailure + 13;
        int i12 = i11 % 128;
        onConversionDataFail = i12;
        int i13 = i11 % 2;
        String string = null;
        if (activity != null) {
            int i14 = i12 + 83;
            onAttributionFailure = i14 % 128;
            int i15 = i14 % 2;
            Intent intent = activity.getIntent();
            if (intent != null) {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        int i16 = onConversionDataFail + 63;
                        onAttributionFailure = i16 % 128;
                        if (i16 % 2 == 0) {
                            string = extras.getString("af");
                            if (string != null) {
                                int i17 = onAttributionFailure + 11;
                                onConversionDataFail = i17 % 128;
                                int i18 = i17 % 2;
                                AFLogger.afInfoLog("Push Notification received af payload = ".concat(String.valueOf(string)));
                                extras.remove("af");
                                activity.setIntent(intent.putExtras(extras));
                            }
                        } else {
                            String string2 = extras.getString("af");
                            try {
                                throw null;
                            } catch (Throwable th2) {
                                string = string2;
                                th = th2;
                                AFLogger.afErrorLog(th.getMessage(), th);
                                i10 = onAttributionFailure + 53;
                                onConversionDataFail = i10 % 128;
                                if (i10 % 2 == 0) {
                                    int i19 = 61 / 0;
                                }
                                return string;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        i10 = onAttributionFailure + 53;
        onConversionDataFail = i10 % 128;
        if (i10 % 2 == 0) {
            int i110 = 61 / 0;
        }
        return string;
    }

    public final AFb1fSDK valueOf(Context context) {
        int i10 = onConversionDataFail + 61;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventType(context);
        AFb1fSDK aFb1fSDKAFKeystoreWrapper = AFInAppEventParameterName().AFKeystoreWrapper();
        int i12 = onConversionDataFail + 1;
        onAttributionFailure = i12 % 128;
        if (i12 % 2 == 0) {
            return aFb1fSDKAFKeystoreWrapper;
        }
        throw null;
    }

    private int valueOf(AFb1fSDK aFb1fSDK, String str, boolean z10) {
        int i10 = onAttributionFailure + 21;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        int iAFInAppEventType = aFb1fSDK.AFInAppEventType(str, 0);
        if (z10) {
            int i12 = onAttributionFailure + 89;
            onConversionDataFail = i12 % 128;
            int i13 = i12 % 2;
            iAFInAppEventType++;
            aFb1fSDK.valueOf(str, iAFInAppEventType);
        }
        if (AFInAppEventParameterName().afErrorLogForExcManagerOnly().afErrorLog()) {
            int i14 = onConversionDataFail + 83;
            onAttributionFailure = i14 % 128;
            if (i14 % 2 != 0) {
                AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType(String.valueOf(iAFInAppEventType));
                int i15 = 92 / 0;
            } else {
                AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType(String.valueOf(iAFInAppEventType));
            }
        }
        return iAFInAppEventType;
    }

    public final void values(Context context, Map<String, Object> map, Uri uri) {
        int i10 = onConversionDataFail + 45;
        onAttributionFailure = i10 % 128;
        if (i10 % 2 == 0) {
            AFInAppEventType(context);
            if (!map.containsKey("af_deeplink")) {
                String strAFKeystoreWrapper = AFKeystoreWrapper(uri.toString());
                AFb1uSDK aFb1uSDKInit = AFInAppEventParameterName().init();
                String str = aFb1uSDKInit.values;
                if (str != null) {
                    int i11 = onConversionDataFail + 29;
                    int i12 = i11 % 128;
                    onAttributionFailure = i12;
                    int i13 = i11 % 2;
                    if (aFb1uSDKInit.AFInAppEventParameterName != null) {
                        int i14 = i12 + 63;
                        onConversionDataFail = i14 % 128;
                        if (i14 % 2 != 0) {
                            if (!(!strAFKeystoreWrapper.contains(str))) {
                                Uri.Builder builderBuildUpon = Uri.parse(strAFKeystoreWrapper).buildUpon();
                                Uri.Builder builderBuildUpon2 = Uri.EMPTY.buildUpon();
                                for (Map.Entry<String, String> entry : aFb1uSDKInit.AFInAppEventParameterName.entrySet()) {
                                    int i15 = onAttributionFailure + 31;
                                    onConversionDataFail = i15 % 128;
                                    int i16 = i15 % 2;
                                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                                    builderBuildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                                }
                                strAFKeystoreWrapper = builderBuildUpon.build().toString();
                                map.put("appended_query_params", builderBuildUpon2.build().getEncodedQuery());
                            }
                        } else {
                            strAFKeystoreWrapper.contains(str);
                            throw null;
                        }
                    }
                }
                map.put("af_deeplink", strAFKeystoreWrapper);
            }
            HashMap map2 = new HashMap();
            map2.put(DynamicLink.Builder.KEY_LINK, uri.toString());
            AFd1iSDK aFd1iSDK = new AFd1iSDK(AFInAppEventParameterName(), UUID.randomUUID(), uri);
            if (aFd1iSDK.getLevel()) {
                map.put("isBrandedDomain", Boolean.TRUE);
            }
            AFa1cSDK.values(context, map2, uri);
            if (aFd1iSDK.AFLogger$LogLevel()) {
                aFd1iSDK.afInfoLog = values(map2);
                AFd1tSDK level = AFInAppEventParameterName().getLevel();
                level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1iSDK));
                return;
            }
            AFInAppEventParameterName().init().AFInAppEventParameterName(map2);
            return;
        }
        AFInAppEventType(context);
        map.containsKey("af_deeplink");
        throw null;
    }

    private static String values(String str) {
        int i10 = onAttributionFailure + 105;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        int iIndexOf = str.indexOf(63);
        if (iIndexOf != -1) {
            return str.substring(iIndexOf);
        }
        int i12 = onConversionDataFail;
        int i13 = i12 + 95;
        onAttributionFailure = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 16 / 0;
        }
        int i15 = i12 + 97;
        onAttributionFailure = i15 % 128;
        int i16 = i15 % 2;
        return "";
    }

    private AFd1iSDK.AFa1xSDK values(final Map<String, String> map) {
        AFd1iSDK.AFa1xSDK aFa1xSDK = new AFd1iSDK.AFa1xSDK() { // from class: com.appsflyer.internal.AFa1dSDK.3
            @Override // com.appsflyer.internal.AFd1iSDK.AFa1xSDK
            public final void AFKeystoreWrapper(String str) {
                AFa1dSDK.this.AFInAppEventParameterName().init().AFInAppEventType(str, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFd1iSDK.AFa1xSDK
            public final void AFKeystoreWrapper(Map<String, String> map2) {
                for (String str : map2.keySet()) {
                    map.put(str, map2.get(str));
                }
                AFa1dSDK.this.AFInAppEventParameterName().init().AFInAppEventParameterName(map);
            }
        };
        int i10 = onAttributionFailure + 89;
        onConversionDataFail = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 87 / 0;
        }
        return aFa1xSDK;
    }

    public static String values(AFb1fSDK aFb1fSDK, String str) {
        int i10 = onConversionDataFail + 45;
        onAttributionFailure = i10 % 128;
        int i11 = i10 % 2;
        String strValueOf = aFb1fSDK.valueOf("CACHED_CHANNEL", (String) null);
        if (strValueOf != null) {
            int i12 = onAttributionFailure + 113;
            onConversionDataFail = i12 % 128;
            if (i12 % 2 != 0) {
                return strValueOf;
            }
            throw null;
        }
        aFb1fSDK.values("CACHED_CHANNEL", str);
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public static synchronized SharedPreferences values(Context context) {
        try {
            int i10 = onAttributionFailure + 31;
            onConversionDataFail = i10 % 128;
            int i11 = i10 % 2;
            if (valueOf().onAttributionFailureNative == null) {
                int i12 = onConversionDataFail + 37;
                onAttributionFailure = i12 % 128;
                StrictMode.ThreadPolicy threadPolicy = i12 % 2;
                try {
                    if (threadPolicy != 0) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        valueOf().onAttributionFailureNative = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                        threadPolicy = threadPolicyAllowThreadDiskReads;
                    } else {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        valueOf().onAttributionFailureNative = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                        threadPolicy = threadPolicyAllowThreadDiskReads2;
                    }
                    StrictMode.setThreadPolicy(threadPolicy);
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return valueOf().onAttributionFailureNative;
    }

    private int values(AFb1fSDK aFb1fSDK, boolean z10) {
        int i10 = onAttributionFailure + 123;
        onConversionDataFail = i10 % 128;
        int i11 = i10 % 2;
        int iValueOf = valueOf(aFb1fSDK, "appsFlyerInAppEventCount", z10);
        if (i11 == 0) {
            int i12 = 9 / 0;
        }
        return iValueOf;
    }
}
