package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1tSDK.AnonymousClass5;
import com.salesforce.marketingcloud.storage.db.k;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.text.Typography;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1rSDK implements AFb1wSDK {
    private static int afErrorLog = 1;
    private static char[] afInfoLog = {'h', 214, 212, 214, Typography.times};
    private static int afRDLog;
    private List<String> AFInAppEventType = new ArrayList();
    private boolean AFInAppEventParameterName = true;

    @NonNull
    private final Map<String, Object> values = new HashMap();
    private String AFLogger = "-1";
    private boolean afDebugLog = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int valueOf = 0;
    private boolean AFKeystoreWrapper = false;

    @VisibleForTesting
    private Map<String, Object> AFInAppEventParameterName(String str, PackageManager packageManager, AFc1zSDK aFc1zSDK) {
        int i10 = afRDLog + 75;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventType(str, packageManager, aFc1zSDK.AFVersionDeclaration());
        Map<String, Object> mapAfRDLog = afRDLog();
        int i12 = afRDLog + 65;
        afErrorLog = i12 % 128;
        if (i12 % 2 != 0) {
            return mapAfRDLog;
        }
        throw null;
    }

    private synchronized void afDebugLog() {
        this.AFInAppEventType = new ArrayList();
        this.valueOf = 0;
        int i10 = afErrorLog + 65;
        afRDLog = i10 % 128;
        int i11 = i10 % 2;
    }

    private boolean afInfoLog() {
        int i10 = afRDLog;
        int i11 = i10 + 27;
        afErrorLog = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (!this.afDebugLog) {
            return false;
        }
        int i12 = i10 + 37;
        afErrorLog = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        if (!this.AFInAppEventParameterName) {
            int i13 = i10 + 101;
            afErrorLog = i13 % 128;
            int i14 = i13 % 2;
            if (!this.AFKeystoreWrapper) {
                return false;
            }
        }
        int i15 = i10 + 117;
        afErrorLog = i15 % 128;
        if (i15 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @NonNull
    private synchronized Map<String, Object> afRDLog() {
        int i10 = afErrorLog + 117;
        afRDLog = i10 % 128;
        int i11 = i10 % 2;
        this.values.put("data", this.AFInAppEventType);
        afDebugLog();
        Map<String, Object> map = this.values;
        int i12 = afErrorLog + 55;
        afRDLog = i12 % 128;
        if (i12 % 2 == 0) {
            return map;
        }
        int i13 = 51 / 0;
        return map;
    }

    private synchronized void values(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                int i10 = afRDLog + 5;
                afErrorLog = i10 % 128;
                int i11 = i10 % 2;
                try {
                    if (str.length() > 0) {
                        int i12 = afRDLog + 65;
                        afErrorLog = i12 % 128;
                        int i13 = i12 % 2;
                        this.values.put("app_id", str);
                    }
                } catch (Throwable unused) {
                    return;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.values.put(k.a.f65049q, str2);
        }
        if (str3 != null) {
            int i14 = afErrorLog + 33;
            afRDLog = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 57 / 0;
                if (str3.length() > 0) {
                    int i16 = afRDLog + 53;
                    afErrorLog = i16 % 128;
                    int i17 = i16 % 2;
                    this.values.put("channel", str3);
                }
            } else if (str3.length() > 0) {
                int i18 = afRDLog + 53;
                afErrorLog = i18 % 128;
                int i19 = i18 % 2;
                this.values.put("channel", str3);
            }
        }
        if (str4 != null && str4.length() > 0) {
            this.values.put("preInstall", str4);
        }
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final synchronized void AFInAppEventType(String str) {
        try {
            int i10 = afErrorLog + 109;
            int i11 = i10 % 128;
            afRDLog = i11;
            if (i10 % 2 != 0) {
                this.AFLogger = str;
                int i12 = 77 / 0;
            } else {
                this.AFLogger = str;
            }
            int i13 = i11 + 113;
            afErrorLog = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final synchronized void AFKeystoreWrapper() {
        this.AFKeystoreWrapper = true;
        AFInAppEventParameterName("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        int i10 = afErrorLog + 87;
        afRDLog = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 25 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final boolean afErrorLog() {
        boolean z10;
        int i10 = afRDLog;
        int i11 = i10 + 39;
        afErrorLog = i11 % 128;
        if (i11 % 2 == 0) {
            z10 = this.AFKeystoreWrapper;
            int i12 = 15 / 0;
        } else {
            z10 = this.AFKeystoreWrapper;
        }
        int i13 = i10 + 59;
        afErrorLog = i13 % 128;
        if (i13 % 2 != 0) {
            return z10;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final synchronized void valueOf() {
        AFInAppEventParameterName("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.AFKeystoreWrapper = false;
        this.AFInAppEventParameterName = false;
        int i10 = afErrorLog + 39;
        afRDLog = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final synchronized void AFInAppEventType() {
        try {
            int i10 = afRDLog + 3;
            afErrorLog = i10 % 128;
            if (i10 % 2 == 0) {
                this.values.clear();
                this.AFInAppEventType.clear();
                this.valueOf = 1;
            } else {
                this.values.clear();
                this.AFInAppEventType.clear();
                this.valueOf = 0;
            }
            int i11 = afErrorLog + 123;
            afRDLog = i11 % 128;
            int i12 = i11 % 2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3) {
        try {
            int i10 = afRDLog + 107;
            afErrorLog = i10 % 128;
            int i11 = i10 % 2;
            try {
                Map<String, Object> map = this.values;
                Object[] objArr = new Object[1];
                AFInAppEventParameterName("\u0001\u0000\u0001\u0001\u0000", true, new int[]{0, 5, 109, 0}, objArr);
                map.put(((String) objArr[0]).intern(), Build.BRAND);
                this.values.put("model", Build.MODEL);
                this.values.put(k.a.f65035b, "Android");
                this.values.put(k.a.f65042i, Build.VERSION.RELEASE);
                if (str != null && str.length() > 0) {
                    this.values.put("advertiserId", str);
                }
                if (str2 != null && str2.length() > 0) {
                    int i12 = afErrorLog + 113;
                    afRDLog = i12 % 128;
                    if (i12 % 2 != 0) {
                        this.values.put("imei", str2);
                        throw null;
                    }
                    this.values.put("imei", str2);
                }
                if (str3 != null && str3.length() > 0) {
                    this.values.put("android_id", str3);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0046, blocks: (B:3:0x0001, B:12:0x002a, B:14:0x003b, B:18:0x004a, B:26:0x006e, B:30:0x0080), top: B:41:0x0001 }] */
    private synchronized void valueOf(String str, String str2, String str3, String str4) {
        try {
            int i10 = afErrorLog + 91;
            afRDLog = i10 % 128;
            try {
                if (i10 % 2 != 0) {
                    this.values.put(k.a.f65050r, str);
                    int i11 = 62 / 0;
                    if (str2 != null) {
                        if (str2.length() > 0) {
                            int i12 = afErrorLog + 5;
                            afRDLog = i12 % 128;
                            int i13 = i12 % 2;
                            this.values.put("devkey", str2);
                            int i14 = afRDLog + 3;
                            afErrorLog = i14 % 128;
                            int i15 = i14 % 2;
                        }
                    }
                } else {
                    this.values.put(k.a.f65050r, str);
                    if (str2 != null) {
                        if (str2.length() > 0) {
                            int i16 = afErrorLog + 5;
                            afRDLog = i16 % 128;
                            int i17 = i16 % 2;
                            this.values.put("devkey", str2);
                            int i18 = afRDLog + 3;
                            afErrorLog = i18 % 128;
                            int i19 = i18 % 2;
                        }
                    }
                }
                if (str3 != null) {
                    int i20 = afErrorLog + 119;
                    afRDLog = i20 % 128;
                    if (i20 % 2 != 0) {
                        int i21 = 69 / 0;
                        if (str3.length() > 0) {
                            this.values.put("originalAppsFlyerId", str3);
                            int i22 = afErrorLog + 59;
                            afRDLog = i22 % 128;
                            int i23 = i22 % 2;
                        }
                    } else if (str3.length() > 0) {
                        this.values.put("originalAppsFlyerId", str3);
                        int i24 = afErrorLog + 59;
                        afRDLog = i24 % 128;
                        int i25 = i24 % 2;
                    }
                }
                if (str4 != null && str4.length() > 0) {
                    int i26 = afErrorLog + 7;
                    afRDLog = i26 % 128;
                    if (i26 % 2 != 0) {
                        this.values.put("uid", str4);
                        int i27 = 21 / 0;
                    } else {
                        this.values.put("uid", str4);
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032 A[PHI: r0 r1
      0x0032: PHI (r0v11 java.lang.Throwable) = (r0v3 java.lang.Throwable), (r0v12 java.lang.Throwable) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r1v5 java.lang.String) = (r1v2 java.lang.String), (r1v7 java.lang.String) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r0 r1
      0x002d: PHI (r0v4 java.lang.Throwable) = (r0v3 java.lang.Throwable), (r0v12 java.lang.Throwable) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v7 java.lang.String) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.internal.AFb1wSDK
    public final void AFInAppEventParameterName(Throwable th2) {
        Throwable cause;
        String simpleName;
        String message;
        StackTraceElement[] stackTrace;
        int i10 = afRDLog + 115;
        afErrorLog = i10 % 128;
        if (i10 % 2 == 0) {
            cause = th2.getCause();
            simpleName = th2.getClass().getSimpleName();
            int i11 = 96 / 0;
            if (cause == null) {
                message = th2.getMessage();
            } else {
                message = cause.getMessage();
            }
        } else {
            cause = th2.getCause();
            simpleName = th2.getClass().getSimpleName();
            if (cause == null) {
                message = th2.getMessage();
            } else {
                message = cause.getMessage();
            }
        }
        if (cause == null) {
            int i12 = afErrorLog + 125;
            afRDLog = i12 % 128;
            if (i12 % 2 == 0) {
                stackTrace = th2.getStackTrace();
            } else {
                th2.getStackTrace();
                throw null;
            }
        } else {
            stackTrace = cause.getStackTrace();
        }
        AFInAppEventParameterName("exception", simpleName, AFKeystoreWrapper(message, stackTrace));
        int i13 = afRDLog + 27;
        afErrorLog = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void AFInAppEventType(String str, PackageManager packageManager, AFc1zSDK aFc1zSDK) {
        try {
            AFd1dSDK aFd1dSDK = new AFd1dSDK(AFInAppEventParameterName(str, packageManager, aFc1zSDK), aFc1zSDK);
            AFd1tSDK level = aFc1zSDK.getLevel();
            level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1dSDK));
            int i10 = afErrorLog + 57;
            afRDLog = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th2);
        }
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void AFInAppEventType(String str, String... strArr) {
        int i10 = afErrorLog + 11;
        afRDLog = i10 % 128;
        int i11 = i10 % 2;
        AFInAppEventParameterName("public_api_call", str, strArr);
        if (i11 != 0) {
            throw null;
        }
        int i12 = afErrorLog + 103;
        afRDLog = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void AFInAppEventType(String str, String str2) {
        int i10 = afErrorLog + 23;
        afRDLog = i10 % 128;
        if (i10 % 2 == 0) {
            AFInAppEventParameterName((String) null, str, str2);
            return;
        }
        String[] strArr = new String[0];
        strArr[0] = str2;
        AFInAppEventParameterName((String) null, str, strArr);
    }

    private synchronized void AFInAppEventType(String str, PackageManager packageManager, AFe1xSDK aFe1xSDK) {
        try {
            int i10 = afRDLog + 105;
            afErrorLog = i10 % 128;
            if (i10 % 2 != 0) {
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                String string = appsFlyerProperties.getString("remote_debug_static_data");
                this.values.clear();
                if (string != null) {
                    try {
                        this.values.putAll(AFa1rSDK.values(new JSONObject(string)));
                    } catch (Throwable unused) {
                    }
                } else {
                    AFa1dSDK aFa1dSDKValueOf = AFa1dSDK.valueOf();
                    AFKeystoreWrapper(appsFlyerProperties.getString("advertiserId"), aFe1xSDK.valueOf, aFa1dSDKValueOf.afInfoLog);
                    StringBuilder sb2 = new StringBuilder("6.12.1.");
                    sb2.append(AFa1dSDK.valueOf);
                    valueOf(sb2.toString(), aFa1dSDKValueOf.AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType, appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
                    try {
                        int i11 = packageManager.getPackageInfo(str, 0).versionCode;
                        values(str, String.valueOf(i11), appsFlyerProperties.getString("channel"), appsFlyerProperties.getString("preInstallName"));
                        int i12 = afRDLog + 47;
                        afErrorLog = i12 % 128;
                        int i13 = i12 % 2;
                    } catch (Throwable unused2) {
                    }
                    appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.values).toString());
                    int i14 = afRDLog + 97;
                    afErrorLog = i14 % 128;
                    int i15 = i14 % 2;
                }
                this.values.put("launch_counter", this.AFLogger);
            } else {
                AppsFlyerProperties.getInstance().getString("remote_debug_static_data");
                this.values.clear();
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static String[] AFKeystoreWrapper(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            int i10 = afRDLog + 35;
            afErrorLog = i10 % 128;
            if (i10 % 2 != 0) {
                return new String[]{str};
            }
            String[] strArr = new String[0];
            strArr[1] = str;
            return strArr;
        }
        String[] strArr2 = new String[stackTraceElementArr.length + 1];
        strArr2[0] = str;
        int i11 = afRDLog + 75;
        afErrorLog = i11 % 128;
        int i12 = i11 % 2;
        for (int i13 = 1; i13 < stackTraceElementArr.length; i13++) {
            int i14 = afRDLog + 119;
            afErrorLog = i14 % 128;
            int i15 = i14 % 2;
            strArr2[i13] = stackTraceElementArr[i13].toString();
        }
        return strArr2;
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void values(String str, int i10, String str2) {
        int i11 = afRDLog + 81;
        afErrorLog = i11 % 128;
        if (i11 % 2 == 0) {
            String[] strArr = new String[5];
            strArr[1] = String.valueOf(i10);
            strArr[0] = str2;
            AFInAppEventParameterName("server_response", str, strArr);
        } else {
            AFInAppEventParameterName("server_response", str, String.valueOf(i10), str2);
        }
        int i12 = afRDLog + 69;
        afErrorLog = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    private synchronized void AFInAppEventParameterName(String str, String str2, String... strArr) {
        String string;
        if (afInfoLog()) {
            int i10 = afRDLog + 25;
            afErrorLog = i10 % 128;
            int i11 = i10 % 2;
            if (this.valueOf < 98304) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strJoin = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(jCurrentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" _/AppsFlyer_6.12.1 [");
                        sb2.append(str);
                        sb2.append("] ");
                        sb2.append(str2);
                        sb2.append(" ");
                        sb2.append(strJoin);
                        string = sb2.toString();
                        int i12 = afRDLog + 5;
                        afErrorLog = i12 % 128;
                        int i13 = i12 % 2;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(jCurrentTimeMillis);
                        sb3.append(" ");
                        sb3.append(Thread.currentThread().getId());
                        sb3.append(" ");
                        sb3.append(str2);
                        sb3.append("/AppsFlyer_6.12.1 ");
                        sb3.append(strJoin);
                        string = sb3.toString();
                    }
                    this.AFInAppEventType.add(string);
                    this.valueOf += string.length() << 1;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void values() {
        int i10 = afRDLog + 93;
        afErrorLog = i10 % 128;
        this.afDebugLog = i10 % 2 == 0;
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final void valueOf(String str, String str2) {
        int i10 = afRDLog + 77;
        afErrorLog = i10 % 128;
        if (i10 % 2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = str2;
            AFInAppEventParameterName("server_request", str, strArr);
        } else {
            AFInAppEventParameterName("server_request", str, str2);
        }
        int i11 = afErrorLog + 115;
        afRDLog = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1wSDK
    public final synchronized void AFInAppEventParameterName() {
        try {
            int i10 = afRDLog + 29;
            afErrorLog = i10 % 128;
            if (i10 % 2 == 0) {
                this.AFInAppEventParameterName = false;
            } else {
                this.AFInAppEventParameterName = false;
            }
            afDebugLog();
        } catch (Throwable th2) {
            throw th2;
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
                System.arraycopy(afInfoLog, i10, cArr, 0, i11);
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
}
