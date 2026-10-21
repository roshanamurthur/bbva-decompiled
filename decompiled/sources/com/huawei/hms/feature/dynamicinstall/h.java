package com.huawei.hms.feature.dynamicinstall;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bbva.plugin.media.capture.util.Constants;
import com.huawei.hms.feature.utils.Logger;
import com.huawei.secure.android.common.util.SafeString;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50246a = "h";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f50247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f50248c;

    public h(Context context, String str) throws PackageManager.NameNotFoundException {
        this.f50248c = -1L;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getFilesDir().getAbsolutePath());
        this.f50247b = new File(ad.d.f(sb2, File.separator, str));
        this.f50248c = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public final File a(String str, String str2) throws IOException {
        return new File(e(str), str2);
    }

    public final File b(File file) throws IOException {
        return new File(i(), file.getName());
    }

    public final File c() throws IOException {
        return new File(j(), "lock.tmp");
    }

    public File d() throws IOException {
        return com.huawei.hms.feature.utils.c.b(new File(j(), "native-libraries"));
    }

    public File e() throws IOException {
        return com.huawei.hms.feature.utils.c.b(new File(this.f50247b, "splitcompat"));
    }

    public final List<String> f() throws IOException {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = d().listFiles();
        if (fileArrListFiles == null) {
            return arrayList;
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                arrayList.add(file.getName());
            }
        }
        return arrayList;
    }

    public File g() throws IOException {
        return com.huawei.hms.feature.utils.c.b(new File(j(), Constants.TEMP_FOLDER));
    }

    public File h() throws IOException {
        return com.huawei.hms.feature.utils.c.b(new File(j(), "unverified-splits"));
    }

    public File i() throws IOException {
        return com.huawei.hms.feature.utils.c.b(new File(j(), "verified-splits"));
    }

    public File j() throws IOException {
        return com.huawei.hms.feature.utils.c.b(new File(e(), Long.toString(this.f50248c)));
    }

    private static String c(String str) {
        return str.endsWith(".apk") ? str : str.concat(".apk");
    }

    public final void a() throws IOException {
        String[] list;
        File fileE = e();
        if (fileE == null || (list = fileE.list()) == null) {
            return;
        }
        Logger.i(f50246a, "begin clean old  VersionSplits ...");
        for (String str : list) {
            if (!TextUtils.equals(str, String.valueOf(this.f50248c))) {
                Logger.i(f50246a, "begin clean old  VersionSplits " + str);
                com.huawei.hms.feature.utils.c.a(new File(fileE, str));
            }
        }
    }

    public final Set<a> b() throws IOException {
        File fileI = i();
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = fileI.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && file.getName().endsWith(".apk")) {
                    hashSet.add(new a(file, SafeString.substring(file.getName(), 0, file.getName().length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public final File d(String str) throws IOException {
        return com.huawei.hms.feature.utils.c.b(new File(com.huawei.hms.feature.utils.c.b(new File(j(), "dex")), str));
    }

    public File e(String str) throws IOException {
        return com.huawei.hms.feature.utils.c.b(new File(d(), str));
    }

    public final Set<File> f(String str) throws IOException {
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = e(str).listFiles();
        if (fileArrListFiles == null) {
            return hashSet;
        }
        for (File file : fileArrListFiles) {
            if (file.isFile()) {
                hashSet.add(file);
            }
        }
        return hashSet;
    }

    public final File g(String str) throws IOException {
        return new File(g(), c(str));
    }

    public final File h(String str) throws IOException {
        return new File(h(), c(str));
    }

    public final File i(String str) throws IOException {
        return new File(i(), c(str));
    }

    public void a(File file) throws IOException {
        com.huawei.hms.feature.utils.c.a(file);
    }

    public final void b(String str) throws IOException {
        com.huawei.hms.feature.utils.c.a(i(str));
    }

    public final void a(String str) throws IOException {
        com.huawei.hms.feature.utils.c.a(e(str));
    }
}
