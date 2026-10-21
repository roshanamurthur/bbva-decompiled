package com.huawei.hms.feature.dynamicinstall;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import com.huawei.hms.feature.dynamicinstall.installer.FeatureCompatVersionApiFactory;
import com.huawei.hms.feature.dynamicinstall.installer.IFeatureEmulatedInstall;
import com.huawei.hms.feature.model.CommonInstallException;
import com.huawei.hms.feature.utils.Logger;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes10.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50249a = "i";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile i f50250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Set<String> f50251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static h f50252d;

    public class a implements com.huawei.hms.feature.install.featureinfo.e {
        public a() {
        }

        @Override // com.huawei.hms.feature.install.featureinfo.e
        public Set<String> a() {
            return i.f50251c;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f50254a;

        public b(Context context) {
            this.f50254a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.i(i.f50249a, "first install, begin register");
            com.huawei.hms.feature.broadcast.d.a(this.f50254a).forceRegister(true);
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                i.f50252d.a();
            } catch (IOException e5) {
                Logger.w(i.f50249a, "failed to clean old version", e5);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HashSet f50256a;

        public d(HashSet hashSet) {
            this.f50256a = hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Iterator it = this.f50256a.iterator();
                while (it.hasNext()) {
                    i.f50252d.b((String) it.next());
                }
            } catch (Exception e5) {
                Logger.e(i.f50249a, "Failed to remove from feature storage", e5);
            }
        }
    }

    private i(Context context) {
        f50251c = new HashSet();
        try {
            h hVar = new h(context, "hw");
            f50252d = hVar;
            a(context, hVar);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new CommonInstallException("Failed to initialize FileStorage");
        } catch (Exception e5) {
            Logger.w(f50249a, "HWFeatureCompat error", e5);
        }
    }

    public static int a(Context context, String str) {
        AssetManager assets = context.getAssets();
        try {
            Method declaredMethod = assets.getClass().getDeclaredMethod("addAssetPath", String.class);
            declaredMethod.setAccessible(true);
            try {
                int iIntValue = ((Integer) declaredMethod.invoke(assets, str)).intValue();
                Logger.d(f50249a, "cookie = " + iIntValue);
                return iIntValue;
            } catch (Exception e5) {
                Logger.w(f50249a, "invoke failed", e5);
                return -1;
            }
        } catch (NoSuchMethodException e7) {
            Logger.w(f50249a, "get method failed", e7);
            return -2;
        }
    }

    private static i b(Context context) {
        if (f50250b == null) {
            synchronized (i.class) {
                try {
                    if (f50250b == null) {
                        f50250b = new i(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f50250b;
    }

    private static synchronized Set<String> d() {
        return new HashSet(f50251c);
    }

    public static boolean e() {
        return f50250b != null;
    }

    private static synchronized void c(Context context, boolean z10) throws IOException {
        Set<com.huawei.hms.feature.dynamicinstall.a> setA;
        try {
            Logger.i(f50249a, "begin loadLocalSplitApks ...");
            a(z10);
            try {
                setA = a(context, z10);
            } catch (IOException e5) {
                Logger.w(f50249a, "failed to get need loaded apks", e5);
                setA = null;
            }
            if (setA == null) {
                Logger.i(f50249a, "no need to load apks.");
                return;
            }
            Logger.i(f50249a, "begin install ...");
            IFeatureEmulatedInstall iFeatureEmulatedInstallCreateDynamicInstaller = FeatureCompatVersionApiFactory.createDynamicInstaller();
            a(context, z10, setA, iFeatureEmulatedInstallCreateDynamicInstaller);
            HashSet hashSet = new HashSet();
            a(context, z10, setA, hashSet, iFeatureEmulatedInstallCreateDynamicInstaller);
            for (com.huawei.hms.feature.dynamicinstall.a aVar : setA) {
                if (hashSet.contains(aVar.a())) {
                    Logger.d(f50249a, "Split '" + aVar.b() + "' installation emulated");
                    f50251c.add(aVar.b());
                } else {
                    Logger.d(f50249a, "Split '" + aVar.b() + "' installation not emulated");
                }
            }
            Logger.i(f50249a, "loadLocalSplitApks finished.");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @TargetApi(21)
    private static Set<com.huawei.hms.feature.dynamicinstall.a> a(Context context, boolean z10) throws IOException {
        PackageInfo packageInfo;
        Logger.i(f50249a, "try to get local storage apks.");
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e5) {
            Logger.w(f50249a, "failed to get package info", e5);
            packageInfo = null;
        }
        if (packageInfo == null) {
            Logger.i(f50249a, "package info is null.");
            return new HashSet();
        }
        String[] strArr = packageInfo.splitNames;
        List arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
        Set<com.huawei.hms.feature.dynamicinstall.a> setB = f50252d.b();
        HashSet hashSet = new HashSet();
        Iterator<com.huawei.hms.feature.dynamicinstall.a> it = setB.iterator();
        while (it.hasNext()) {
            com.huawei.hms.feature.dynamicinstall.a next = it.next();
            if (arrayList.contains(next.b())) {
                if (z10) {
                    f50252d.b(next.b());
                } else {
                    hashSet.add(next.b());
                }
                it.remove();
            }
        }
        if (!hashSet.isEmpty()) {
            com.huawei.hms.feature.dynamicinstall.c.a().execute(new d(hashSet));
        }
        Logger.i(f50249a, "get local storage apks finished.");
        return setB;
    }

    private static boolean b(Context context, boolean z10) {
        b(context);
        Logger.i(f50249a, "begin installInternal ...");
        try {
            c(context, z10);
            return true;
        } catch (Exception e5) {
            Logger.e(f50249a, "Installing  splits failed:", e5);
            return false;
        }
    }

    public static boolean c(Context context) {
        Logger.i(f50249a, "HWFeatureCompat install");
        return b(context, false);
    }

    private void a(Context context, h hVar) {
        Logger.i(f50249a, "first install, begin set interceptor");
        com.huawei.hms.feature.broadcast.h.a(new com.huawei.hms.feature.broadcast.a(context, hVar));
        com.huawei.hms.feature.install.featureinfo.a.a(new a());
        com.huawei.hms.feature.dynamicinstall.c.a().execute(new b(context));
    }

    private static void a(Context context, boolean z10, Set<com.huawei.hms.feature.dynamicinstall.a> set, IFeatureEmulatedInstall iFeatureEmulatedInstall) throws IOException {
        g gVar = new g(f50252d);
        ClassLoader classLoader = context.getClassLoader();
        if (z10) {
            Logger.i(f50249a, "DownloadInstall, begin native install ...");
            iFeatureEmulatedInstall.nativeInstall(classLoader, gVar.a());
        } else {
            Iterator<com.huawei.hms.feature.dynamicinstall.a> it = set.iterator();
            while (it.hasNext()) {
                Set<File> setB = gVar.b(it.next());
                if (setB == null) {
                    it.remove();
                } else {
                    Logger.i(f50249a, "Not DownloadInstall, begin native install ...");
                    iFeatureEmulatedInstall.nativeInstall(classLoader, setB);
                }
            }
        }
        Logger.i(f50249a, "native install finished.");
    }

    private static void a(Context context, boolean z10, Set<com.huawei.hms.feature.dynamicinstall.a> set, HashSet<File> hashSet, IFeatureEmulatedInstall iFeatureEmulatedInstall) throws Throwable {
        Logger.i(f50249a, "begin classloader install.");
        for (com.huawei.hms.feature.dynamicinstall.a aVar : set) {
            String str = f50249a;
            Logger.i(str, " begin install " + aVar.b());
            ClassLoader classLoader = context.getClassLoader();
            boolean zA = a(aVar);
            boolean zDexInstall = iFeatureEmulatedInstall.dexInstall(classLoader, f50252d.d(aVar.b()), aVar.a(), z10);
            if (!zA || zDexInstall) {
                Logger.i(str, "dex  installed or not dexAPk");
                hashSet.add(aVar.a());
            } else {
                Logger.w(str, "split " + aVar.a() + "was not installed");
            }
        }
        for (File file : hashSet) {
            Logger.i(f50249a, "begin   install resource " + file.getName());
            Logger.d("SplitCompat", "addAssetPath completed with " + file.getName() + " cookie " + a(context, file.getCanonicalPath()));
        }
        Logger.i(f50249a, "classloader install finished.");
    }

    private static void a(boolean z10) {
        if (!z10) {
            Logger.i(f50249a, "Not DownloadInstall, begin clean old version async ...");
            com.huawei.hms.feature.dynamicinstall.c.a().execute(new c());
            return;
        }
        Logger.i(f50249a, "DownloadInstall, begin clean old version sync ...");
        try {
            f50252d.a();
        } catch (IOException e5) {
            Logger.w(f50249a, "failed to clean old version", e5);
        }
    }

    public static boolean a(Context context) {
        return b(context, true);
    }

    private static boolean a(com.huawei.hms.feature.dynamicinstall.a aVar) throws Throwable {
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(aVar.a());
                try {
                    boolean z10 = zipFile2.getEntry("classes.dex") != null;
                    try {
                        zipFile2.close();
                    } catch (IOException e5) {
                        Logger.w(f50249a, "close file failed", e5);
                    }
                    return z10;
                } catch (IOException e7) {
                    e = e7;
                    zipFile = zipFile2;
                    Logger.w(f50249a, "check file failed", e);
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (IOException e10) {
                            Logger.w(f50249a, "close file failed", e10);
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    zipFile = zipFile2;
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (IOException e11) {
                            Logger.w(f50249a, "close file failed", e11);
                        }
                    }
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
