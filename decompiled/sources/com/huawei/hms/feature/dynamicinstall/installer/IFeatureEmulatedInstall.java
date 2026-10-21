package com.huawei.hms.feature.dynamicinstall.installer;

import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public interface IFeatureEmulatedInstall {
    public static final int V23_ELEMENTS_TYPE = 1;
    public static final int V26_ELEMENTS_TYPE = 2;

    boolean dexInstall(ClassLoader classLoader, File file, File file2, boolean z10);

    void nativeInstall(ClassLoader classLoader, Set<File> set);
}
