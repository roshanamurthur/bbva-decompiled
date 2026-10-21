package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bbva.ethermobilesdk.devicechecker.emulator.EmulatorApi;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public class CommonUtils {
    public static final int DEVICE_STATE_BETAOS = 8;
    public static final int DEVICE_STATE_COMPROMISEDLIBRARIES = 32;
    public static final int DEVICE_STATE_DEBUGGERATTACHED = 4;
    public static final int DEVICE_STATE_ISSIMULATOR = 1;
    public static final int DEVICE_STATE_JAILBROKEN = 2;
    public static final int DEVICE_STATE_VENDORINTERNAL = 16;
    public static final String LEGACY_SHARED_PREFS_NAME = "com.crashlytics.prefs";
    public static final String SHARED_PREFS_NAME = "com.google.firebase.crashlytics";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f47717a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ARM64;
        public static final a ARMV6;
        public static final a ARMV7;
        public static final a ARMV7S;
        public static final a ARM_UNKNOWN;
        public static final a PPC;
        public static final a PPC64;
        public static final a UNKNOWN;
        public static final a X86_32;
        public static final a X86_64;
        private static final Map<String, a> matcher;

        static {
            a aVar = new a("X86_32", 0);
            X86_32 = aVar;
            a aVar2 = new a("X86_64", 1);
            X86_64 = aVar2;
            a aVar3 = new a("ARM_UNKNOWN", 2);
            ARM_UNKNOWN = aVar3;
            a aVar4 = new a("PPC", 3);
            PPC = aVar4;
            a aVar5 = new a("PPC64", 4);
            PPC64 = aVar5;
            a aVar6 = new a("ARMV6", 5);
            ARMV6 = aVar6;
            a aVar7 = new a("ARMV7", 6);
            ARMV7 = aVar7;
            a aVar8 = new a("UNKNOWN", 7);
            UNKNOWN = aVar8;
            a aVar9 = new a("ARMV7S", 8);
            ARMV7S = aVar9;
            a aVar10 = new a("ARM64", 9);
            ARM64 = aVar10;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
            HashMap map = new HashMap(4);
            matcher = map;
            map.put("armeabi-v7a", aVar7);
            map.put("armeabi", aVar6);
            map.put("arm64-v8a", aVar10);
            map.put("x86", aVar);
        }

        public a() {
            throw null;
        }

        public static a a() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                Logger.getLogger().v("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = matcher.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static long calculateFreeRamInBytes(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID)).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static synchronized long calculateTotalRamInBytes(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID)).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static long calculateUsedDiskSpaceInBytes(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    @SuppressLint({"MissingPermission"})
    public static boolean canTryConnection(Context context) {
        if (!checkPermission(context, MagiskApp.ACCESS_NETWORK_STATE)) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean checkPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void closeOrLog(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e5) {
                Logger.getLogger().e(str, e5);
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e5) {
                throw e5;
            } catch (Exception unused) {
            }
        }
    }

    public static String createInstanceIdFrom(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace(Constant.DASH_STRING, "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
        }
        String string = sb2.toString();
        if (string.length() > 0) {
            return sha1(string);
        }
        return null;
    }

    public static boolean getBooleanResourceValue(Context context, String str, boolean z10) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int resourcesIdentifier = getResourcesIdentifier(context, str, "bool");
            if (resourcesIdentifier > 0) {
                return resources.getBoolean(resourcesIdentifier);
            }
            int resourcesIdentifier2 = getResourcesIdentifier(context, str, "string");
            if (resourcesIdentifier2 > 0) {
                return Boolean.parseBoolean(context.getString(resourcesIdentifier2));
            }
        }
        return z10;
    }

    public static List<BuildIdInfo> getBuildIdInfo(Context context) {
        ArrayList arrayList = new ArrayList();
        int resourcesIdentifier = getResourcesIdentifier(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int resourcesIdentifier2 = getResourcesIdentifier(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int resourcesIdentifier3 = getResourcesIdentifier(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (resourcesIdentifier == 0 || resourcesIdentifier2 == 0 || resourcesIdentifier3 == 0) {
            Logger.getLogger().d(String.format("Could not find resources: %d %d %d", Integer.valueOf(resourcesIdentifier), Integer.valueOf(resourcesIdentifier2), Integer.valueOf(resourcesIdentifier3)));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(resourcesIdentifier);
        String[] stringArray2 = context.getResources().getStringArray(resourcesIdentifier2);
        String[] stringArray3 = context.getResources().getStringArray(resourcesIdentifier3);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            Logger.getLogger().d(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i10 = 0; i10 < stringArray3.length; i10++) {
            arrayList.add(new BuildIdInfo(stringArray[i10], stringArray2[i10], stringArray3[i10]));
        }
        return arrayList;
    }

    public static int getCpuArchitectureInt() {
        return a.a().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int getDeviceState() {
        boolean zIsEmulator = isEmulator();
        ?? r1 = zIsEmulator;
        if (isRooted()) {
            r1 = (zIsEmulator ? 1 : 0) | 2;
        }
        return isDebuggerAttached() ? r1 | 4 : r1;
    }

    public static SharedPreferences getLegacySharedPrefs(Context context) {
        return context.getSharedPreferences(LEGACY_SHARED_PREFS_NAME, 0);
    }

    public static String getMappingFileId(Context context) {
        int resourcesIdentifier = getResourcesIdentifier(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (resourcesIdentifier == 0) {
            resourcesIdentifier = getResourcesIdentifier(context, "com.crashlytics.android.build_id", "string");
        }
        if (resourcesIdentifier != 0) {
            return context.getResources().getString(resourcesIdentifier);
        }
        return null;
    }

    public static boolean getProximitySensorEnabled(Context context) {
        return (isEmulator() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    public static String getResourcePackageName(Context context) {
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i10);
            return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static int getResourcesIdentifier(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, getResourcePackageName(context));
    }

    public static SharedPreferences getSharedPrefs(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static String hexify(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f47717a;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static boolean isAppDebuggable(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean isDebuggerAttached() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static boolean isEmulator() {
        if (!Build.PRODUCT.contains(EmulatorApi.SDK)) {
            String str = Build.HARDWARE;
            if (!str.contains(EmulatorApi.GOLDFISH) && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public static boolean isLoggingEnabled(Context context) {
        return false;
    }

    public static boolean isRooted() {
        boolean zIsEmulator = isEmulator();
        String str = Build.TAGS;
        if ((zIsEmulator || str == null || !str.contains(RootService.TEST_KEYS)) && !new File("/system/app/Superuser.apk").exists()) {
            return !zIsEmulator && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static boolean nullSafeEquals(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public static String padWithZerosToMaxIntWidth(int i10) {
        if (i10 >= 0) {
            return String.format(Locale.US, "%1$10s", Integer.valueOf(i10)).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    public static String sha1(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
            messageDigest.update(bytes);
            return hexify(messageDigest.digest());
        } catch (NoSuchAlgorithmException e5) {
            Logger.getLogger().e("Could not create hashing algorithm: SHA-1, returning empty string.", e5);
            return "";
        }
    }

    public static String streamToString(InputStream inputStream) {
        Scanner scannerUseDelimiter = new Scanner(inputStream).useDelimiter(RootService.DELIMITER_A);
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }
}
