package com.noknok.android.client.extension;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface IExtensionList {
    void addExtension(String str, String str2, boolean z10);

    IExtension getExtension(String str);

    List<? extends IExtension> getExtensions();

    void removeExtension(String str);
}
