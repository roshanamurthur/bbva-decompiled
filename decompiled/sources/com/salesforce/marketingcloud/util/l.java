package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f65198d = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f65199e = "^|^";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f65200f = "\\^\\|\\^";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Boolean f65203i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Locale f65195a = Locale.US;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f65196b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f65197c = com.salesforce.marketingcloud.g.a("Utils");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final char[] f65201g = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final TimeZone f65202h = TimeZone.getTimeZone("UTC");

    private l() {
    }

    public static int a(int i10) {
        return Build.VERSION.SDK_INT >= 31 ? i10 | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : i10;
    }

    public static int b() {
        return TimeZone.getDefault().getOffset(new Date().getTime()) / 1000;
    }

    public static Map<String, String> c(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split(f65200f);
            for (int i10 = 0; i10 < strArrSplit.length; i10 += 2) {
                int i11 = i10 + 1;
                map.put(strArrSplit[i10], i11 < strArrSplit.length ? strArrSplit[i11] : "");
            }
        }
        return map;
    }

    public static Set<String> d(String str) {
        TreeSet treeSet = new TreeSet();
        if (str != null && !TextUtils.isEmpty(str)) {
            for (String str2 : str.split(f65200f)) {
                if (str2 != null && !str2.isEmpty()) {
                    treeSet.add(str2);
                }
            }
        }
        return treeSet;
    }

    public static String e(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(f65196b);
            messageDigest.update(bytes, 0, bytes.length);
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (Throwable th2) {
            com.salesforce.marketingcloud.g.b(f65197c, th2, "md5 failed", new Object[0]);
            return "";
        }
    }

    public static Date f(String str) throws ParseException {
        if (str == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", f65195a);
        simpleDateFormat.setTimeZone(f65202h);
        return simpleDateFormat.parse(str);
    }

    public static String g(String str) {
        try {
            StringBuilder sb2 = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes(f65196b))).toString(16));
            while (sb2.length() < 64) {
                sb2.insert(0, '0');
            }
            return sb2.toString();
        } catch (Throwable th2) {
            com.salesforce.marketingcloud.g.b(f65197c, th2, "sha-256 failed", new Object[0]);
            return "";
        }
    }

    public static String a(String str) {
        return a(str, "SHA-256", "UTF-8");
    }

    public static int b(int i10) {
        return Build.VERSION.SDK_INT >= 31 ? i10 | 33554432 : i10;
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT <= 25) {
            String str = Build.VERSION.CODENAME;
            if (!"O".equals(str) && !str.startsWith("OMR")) {
                return false;
            }
        }
        return true;
    }

    private static String a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            byte[] bytes = str.getBytes(str3);
            messageDigest.update(bytes, 0, bytes.length);
            return a(messageDigest.digest());
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static String b(String str) {
        return a(str, "SHA-256", "UTF-8");
    }

    private static boolean c(@NonNull Context context) {
        try {
            Class<?> cls = Class.forName(context.getApplicationContext().getClass().getName().replace(Constant.DOT_STRING.concat(context.getApplicationContext().getClass().getSimpleName()), "") + ".BuildConfig");
            Field field = cls.getField("DEBUG");
            field.setAccessible(true);
            boolean z10 = field.getBoolean(null);
            com.salesforce.marketingcloud.g.c(f65197c, "isDebugBuild set to %s for clazz %s", Boolean.valueOf(z10), cls.getCanonicalName());
            return z10;
        } catch (Exception e5) {
            boolean zB = b(context);
            com.salesforce.marketingcloud.g.a(f65197c, "isDebugBuild determination failed with Exception [%s].  isDebugBuild set to: %s", e5.getMessage(), Boolean.valueOf(zB));
            return zB;
        }
    }

    public static String a(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", f65195a);
        simpleDateFormat.setTimeZone(f65202h);
        return simpleDateFormat.format(date);
    }

    private static boolean b(@NonNull Context context) {
        try {
            return (context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 2) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
            com.salesforce.marketingcloud.g.e(f65197c, "Failed to determine if app was in debug mode.", new Object[0]);
        }
    }

    public static String a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return "";
        }
        HashMap map2 = new HashMap(map);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map2.entrySet()) {
            a(sb2, (String) entry.getKey(), (String) entry.getValue());
        }
        return sb2.toString();
    }

    public static synchronized String a(Set<String> set) {
        if (set == null) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(f65199e);
            }
            return sb2.toString();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f65201g;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    private static void a(StringBuilder sb2, String str, String str2) {
        androidx.collection.k.e(sb2, str, f65199e, str2, f65199e);
    }

    private static boolean a() {
        return MarketingCloudSdk.isReady() || MarketingCloudSdk.isInitializing();
    }

    public static boolean a(long j10, long j11) {
        if (j10 > 0) {
            long jMin = Math.min(j11, j10);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jCurrentTimeMillis2 = jCurrentTimeMillis;
            boolean z10 = false;
            while (true) {
                long j12 = jCurrentTimeMillis + j10;
                if (j12 <= jCurrentTimeMillis2 || z10 || a()) {
                    break;
                }
                long j13 = jCurrentTimeMillis2 + jMin > j12 ? j12 - jCurrentTimeMillis2 : jMin;
                try {
                    com.salesforce.marketingcloud.g.d(f65197c, "Marketing Cloud SDK is not yet initializing.  Trying again in %sms. %s", Long.valueOf(j13), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis));
                    Thread.sleep(j13);
                } catch (Exception e5) {
                    com.salesforce.marketingcloud.g.b(f65197c, e5, "Encountered exception while waiting for SDK initialization to be triggered by the application.", new Object[0]);
                    z10 = true;
                }
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
        }
        return a();
    }

    public static boolean a(@NonNull Context context) {
        if (f65203i == null) {
            f65203i = Boolean.valueOf(c(context));
        }
        return f65203i.booleanValue();
    }
}
