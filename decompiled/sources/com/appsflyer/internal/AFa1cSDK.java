package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import androidx.annotation.WorkerThread;
import bk.v;
import com.appsflyer.AFLogger;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@WorkerThread
public final class AFa1cSDK implements AFc1ySDK {

    @NotNull
    private final AFb1bSDK AFInAppEventType;

    public AFa1cSDK() {
    }

    public AFa1cSDK(AFb1bSDK aFb1bSDK) {
        Intrinsics.checkNotNullParameter(aFb1bSDK, "");
        this.AFInAppEventType = aFb1bSDK;
    }

    public static boolean AFInAppEventParameterName(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }

    public static boolean AFInAppEventType(Context context, String str) {
        int iCheckPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb2 = new StringBuilder("is Permission Available: ");
        sb2.append(str);
        sb2.append("; res: ");
        sb2.append(iCheckPermission);
        AFLogger.afRDLog(sb2.toString());
        return iCheckPermission == 0;
    }

    private File afErrorLog() {
        File fileAFInAppEventParameterName = AFInAppEventParameterName();
        if (fileAFInAppEventParameterName == null) {
            return null;
        }
        File file = new File(fileAFInAppEventParameterName, "6.12.1");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean valueOf() {
        return Build.BRAND.equals("OPPO");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    public static Map<String, String> values(Context context, Map<String, String> map, Uri uri) {
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            String str = "media_source";
            byte b10 = 0;
            if (it.hasNext()) {
                String next = it.next();
                String queryParameter = uri.getQueryParameter(next);
                if (map.containsKey(next)) {
                    str = next;
                } else {
                    int iHashCode = next.hashCode();
                    if (iHashCode != -1420799080) {
                        if (iHashCode != 99) {
                            if (iHashCode == 110987 && next.equals("pid")) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                        } else if (!next.equals("c")) {
                            b10 = -1;
                        }
                    } else if (next.equals("af_prt")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                    if (b10 == 0) {
                        str = "campaign";
                    } else if (b10 != 1) {
                        if (b10 != 2) {
                            str = next;
                        } else {
                            str = "agency";
                        }
                    }
                }
                map.put(str, queryParameter);
            } else {
                try {
                    break;
                } catch (Exception e5) {
                    AFLogger.afErrorLog("Could not fetch install time. ", e5);
                }
            }
        }
        if (!map.containsKey("install_time")) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            long j10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("install_time", simpleDateFormat.format(new Date(j10)));
        }
        if (map.containsKey("af_deeplink") && !map.containsKey("af_status")) {
            map.put("af_status", "Non-organic");
        }
        if (map.containsKey("agency")) {
            map.remove("media_source");
        }
        String path = uri.getPath();
        if (path != null) {
            map.put("path", path);
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            map.put("scheme", scheme);
        }
        String host = uri.getHost();
        if (host != null) {
            map.put("host", host);
        }
        return map;
    }

    @Override // com.appsflyer.internal.AFc1ySDK
    @Nullable
    public final String AFKeystoreWrapper(Throwable th2, String str) {
        String str2;
        AFb1aSDK aFb1aSDKAFKeystoreWrapper;
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            try {
                File fileAfErrorLog = afErrorLog();
                str2 = null;
                if (fileAfErrorLog != null) {
                    try {
                        Intrinsics.checkNotNullParameter(th2, "");
                        Intrinsics.checkNotNullParameter(str, "");
                        StringBuilder sb2 = new StringBuilder();
                        Intrinsics.checkNotNullParameter(th2, "");
                        String name = th2.getClass().getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        sb2.append(name);
                        sb2.append(": ");
                        sb2.append(str);
                        String string = sb2.toString();
                        Intrinsics.checkNotNullParameter(th2, "");
                        Intrinsics.checkNotNullParameter(th2, "");
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(th2);
                        sb3.append('\n');
                        sb3.append(CollectionsKt___CollectionsKt.joinToString$default(AFc1pSDK.valueOf(th2), RootService.LINE_BREAK, null, null, 0, null, new Function1<StackTraceElement, CharSequence>() { // from class: com.appsflyer.internal.AFc1pSDK.1
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            /* JADX INFO: renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
                            public final CharSequence invoke(@NotNull StackTraceElement stackTraceElement) {
                                Intrinsics.checkNotNullParameter(stackTraceElement, "");
                                return "at ".concat(String.valueOf(stackTraceElement));
                            }
                        }, 30, null));
                        AFb1aSDK aFb1aSDK = new AFb1aSDK(string, AFc1uSDK.AFa1wSDK.values(sb3.toString()), ak.b.stackTraceToString(th2), 0, 8, null);
                        String str3 = aFb1aSDK.AFInAppEventType;
                        File file = new File(fileAfErrorLog, str3);
                        if (file.exists() && (aFb1aSDKAFKeystoreWrapper = AFb1aSDK.Companion.AFKeystoreWrapper(ik.c.readText$default(file, null, 1, null))) != null) {
                            aFb1aSDKAFKeystoreWrapper.AFKeystoreWrapper++;
                            aFb1aSDK = aFb1aSDKAFKeystoreWrapper;
                        }
                        StringBuilder sb4 = new StringBuilder("label=");
                        sb4.append(AFc1uSDK.AFa1wSDK.AFInAppEventType(aFb1aSDK.com.bbva.appsflyer.DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF java.lang.String));
                        sb4.append("\nhashName=");
                        sb4.append(AFc1uSDK.AFa1wSDK.AFInAppEventType(aFb1aSDK.AFInAppEventType));
                        sb4.append("\nstackTrace=");
                        sb4.append(AFc1uSDK.AFa1wSDK.AFInAppEventType(aFb1aSDK.AFInAppEventParameterName));
                        sb4.append("\nc=");
                        sb4.append(aFb1aSDK.AFKeystoreWrapper);
                        ik.c.writeText$default(file, sb4.toString(), null, 2, null);
                        str2 = str3;
                    } catch (Exception e5) {
                        StringBuilder sb5 = new StringBuilder("Could not cache exception\n");
                        StringBuilder sb6 = new StringBuilder(" ");
                        sb6.append(e5.getMessage());
                        String string2 = sb6.toString();
                        Intrinsics.checkNotNullParameter(string2, "");
                        sb5.append("[Exception Manager]: ".concat(String.valueOf(string2)));
                        AFLogger.afRDLog(sb5.toString());
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return str2;
    }

    public static String AFInAppEventParameterName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e5) {
            AFLogger.afErrorLog(e5.getMessage(), e5);
            return "";
        }
    }

    public static long valueOf(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e5) {
            AFLogger.afErrorLog(e5.getMessage(), e5);
            return 0L;
        }
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public static String AFInAppEventType(PackageManager packageManager, String str) throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance(ConstantKt.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(x509Certificate.getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }

    private File AFInAppEventParameterName() {
        Context context = this.AFInAppEventType.AFInAppEventParameterName;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFc1ySDK
    public final boolean AFInAppEventParameterName(String... strArr) {
        boolean zDeleteRecursively;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File fileAFInAppEventParameterName = AFInAppEventParameterName();
                zDeleteRecursively = true;
                if (fileAFInAppEventParameterName != null) {
                    if (strArr.length == 0) {
                        Intrinsics.checkNotNullParameter("delete all exceptions", "");
                        AFLogger.afRDLog("[Exception Manager]: ".concat("delete all exceptions"));
                        zDeleteRecursively = ik.e.deleteRecursively(fileAFInAppEventParameterName);
                    } else {
                        StringBuilder sb2 = new StringBuilder("delete all exceptions except for: ");
                        sb2.append(ArraysKt___ArraysKt.joinToString$default(strArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                        String string = sb2.toString();
                        Intrinsics.checkNotNullParameter(string, "");
                        AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(string)));
                        File[] fileArrListFiles = fileAFInAppEventParameterName.listFiles();
                        if (fileArrListFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                            ArrayList<File> arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                if (!ArraysKt___ArraysKt.contains(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            for (File file2 : arrayList) {
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(ik.e.deleteRecursively(file2)));
                            }
                            Set set = CollectionsKt___CollectionsKt.toSet(arrayList2);
                            if (set.isEmpty()) {
                                set = v.setOf(Boolean.TRUE);
                            }
                            Set set2 = set;
                            if (set2.size() != 1 || !((Boolean) CollectionsKt___CollectionsKt.first(set2)).booleanValue()) {
                                zDeleteRecursively = false;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zDeleteRecursively;
    }

    @Override // com.appsflyer.internal.AFc1ySDK
    public final int AFInAppEventType() {
        Iterator<T> it = values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((AFb1aSDK) it.next()).AFKeystoreWrapper;
        }
        return i10;
    }

    @Override // com.appsflyer.internal.AFc1ySDK
    @NotNull
    public final List<AFb1aSDK> values() {
        List<AFb1aSDK> listEmptyList;
        synchronized (this) {
            try {
                File fileAfErrorLog = afErrorLog();
                listEmptyList = null;
                if (fileAfErrorLog != null) {
                    try {
                        File[] fileArrListFiles = fileAfErrorLog.listFiles();
                        if (fileArrListFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                            ArrayList arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                AFb1aSDK.Companion companion = AFb1aSDK.INSTANCE;
                                Intrinsics.checkNotNullExpressionValue(file, "");
                                AFb1aSDK aFb1aSDKAFKeystoreWrapper = AFb1aSDK.Companion.AFKeystoreWrapper(ik.c.readText$default(file, null, 1, null));
                                if (aFb1aSDKAFKeystoreWrapper != null) {
                                    arrayList.add(aFb1aSDKAFKeystoreWrapper);
                                }
                            }
                            listEmptyList = arrayList;
                        }
                    } catch (Throwable th2) {
                        StringBuilder sb2 = new StringBuilder("Could not get stored exceptions\n ");
                        sb2.append(th2.getMessage());
                        String string = sb2.toString();
                        Intrinsics.checkNotNullParameter(string, "");
                        AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(string)));
                    }
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return listEmptyList;
    }

    @Override // com.appsflyer.internal.AFc1ySDK
    public final boolean AFKeystoreWrapper() {
        return AFInAppEventParameterName(new String[0]);
    }
}
