package com.veridas.contextualdata.miscellaneous;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IMiscellaneousContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/veridas/contextualdata/miscellaneous/IMiscellaneousContextualDataProvider;", "", "getDeviceModel", "", "getLanguage", "getOsName", "getOsVersionName", "getOsVersionNumber", "", "getSdkVersionName", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IMiscellaneousContextualDataProvider {
    @NotNull
    String getDeviceModel();

    @NotNull
    String getLanguage();

    @NotNull
    String getOsName();

    @NotNull
    String getOsVersionName();

    int getOsVersionNumber();

    @NotNull
    String getSdkVersionName();
}
