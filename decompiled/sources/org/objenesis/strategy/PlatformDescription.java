package org.objenesis.strategy;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.deviceinfo.component.Sys;
import org.objenesis.ObjenesisException;

/* JADX INFO: loaded from: classes13.dex */
public final class PlatformDescription {
    public static final String DALVIK = "Dalvik";
    public static final String GAE_VERSION;
    public static final String GNU = "GNU libgcj";
    public static final String HOTSPOT = "Java HotSpot";
    public static final boolean IS_ANDROID_OPENJDK;
    public static final String OPENJDK = "OpenJDK";
    public static final String PERC = "PERC";

    @Deprecated
    public static final String SUN = "Java HotSpot";
    public static final String SPECIFICATION_VERSION = System.getProperty("java.specification.version");
    public static final String VM_VERSION = System.getProperty(Sys.RUNTIME_VERSION);
    public static final String VM_INFO = System.getProperty("java.vm.info");
    public static final String VENDOR_VERSION = System.getProperty(Sys.VM_VERSION);
    public static final String VENDOR = System.getProperty("java.vm.vendor");
    public static final String JVM_NAME = System.getProperty(Sys.VM_NAME);
    public static final int ANDROID_VERSION = a();

    static {
        String property;
        boolean z10 = false;
        if (a() != 0 && (property = System.getProperty("java.boot.class.path")) != null && property.toLowerCase().contains("core-oj.jar")) {
            z10 = true;
        }
        IS_ANDROID_OPENJDK = z10;
        GAE_VERSION = System.getProperty("com.google.appengine.runtime.version");
    }

    public static int a() {
        if (!isThisJVM(DALVIK)) {
            return 0;
        }
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            try {
                try {
                    try {
                        return ((Integer) cls.getField("SDK_INT").get(null)).intValue();
                    } catch (IllegalAccessException e5) {
                        throw new RuntimeException(e5);
                    }
                } catch (NoSuchFieldException unused) {
                    try {
                        return Integer.parseInt((String) cls.getField("SDK").get(null));
                    } catch (IllegalAccessException e7) {
                        throw new RuntimeException(e7);
                    }
                }
            } catch (NoSuchFieldException e10) {
                throw new ObjenesisException(e10);
            }
        } catch (ClassNotFoundException e11) {
            throw new ObjenesisException(e11);
        }
    }

    public static String describePlatform() {
        String str = "Java " + SPECIFICATION_VERSION + " (VM vendor name=\"" + VENDOR + "\", VM vendor version=" + VENDOR_VERSION + ", JVM name=\"" + JVM_NAME + "\", JVM version=" + VM_VERSION + ", JVM info=" + VM_INFO;
        int i10 = ANDROID_VERSION;
        if (i10 != 0) {
            str = str + ", API level=" + i10;
        }
        return u.f(str, ")");
    }

    public static boolean isAfterJava11() {
        return isAfterJigsaw() && Integer.parseInt(SPECIFICATION_VERSION) >= 11;
    }

    public static boolean isAfterJigsaw() {
        return SPECIFICATION_VERSION.indexOf(46) < 0;
    }

    public static boolean isAndroidOpenJDK() {
        return IS_ANDROID_OPENJDK;
    }

    public static boolean isGoogleAppEngine() {
        return GAE_VERSION != null;
    }

    public static boolean isThisJVM(String str) {
        return JVM_NAME.startsWith(str);
    }
}
