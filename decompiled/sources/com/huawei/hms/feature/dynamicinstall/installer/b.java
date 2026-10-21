package com.huawei.hms.feature.dynamicinstall.installer;

import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class b implements IFeatureEmulatedInstall {
    public static boolean a(String str, String str2) {
        return a.a(str, str2);
    }

    @Override // com.huawei.hms.feature.dynamicinstall.installer.IFeatureEmulatedInstall
    public boolean dexInstall(ClassLoader classLoader, File file, File file2, boolean z10) {
        return a.a(classLoader, file, file2, z10, "makePathElements", false);
    }

    @Override // com.huawei.hms.feature.dynamicinstall.installer.IFeatureEmulatedInstall
    public void nativeInstall(ClassLoader classLoader, Set<File> set) {
        c.a(classLoader, set, 1);
    }
}
