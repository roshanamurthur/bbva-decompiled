package com.veridas.contextualdata.miscellaneous;

import android.os.Build;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MiscellaneousContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/veridas/contextualdata/miscellaneous/MiscellaneousContextualDataProvider;", "Lcom/veridas/contextualdata/miscellaneous/IMiscellaneousContextualDataProvider;", "()V", "getDeviceModel", "", "getLanguage", "getOsName", "getOsVersionName", "getOsVersionNumber", "", "getSdkVersionName", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MiscellaneousContextualDataProvider implements IMiscellaneousContextualDataProvider {
    @Override // com.veridas.contextualdata.miscellaneous.IMiscellaneousContextualDataProvider
    @NotNull
    public String getDeviceModel() {
        return Build.MANUFACTURER + " " + Build.MODEL + " " + Build.VERSION.RELEASE;
    }

    @Override // com.veridas.contextualdata.miscellaneous.IMiscellaneousContextualDataProvider
    @NotNull
    public String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        return language;
    }

    @Override // com.veridas.contextualdata.miscellaneous.IMiscellaneousContextualDataProvider
    @NotNull
    public String getOsName() {
        return "Android";
    }

    @Override // com.veridas.contextualdata.miscellaneous.IMiscellaneousContextualDataProvider
    @NotNull
    public String getOsVersionName() {
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return RELEASE;
    }

    @Override // com.veridas.contextualdata.miscellaneous.IMiscellaneousContextualDataProvider
    public int getOsVersionNumber() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.veridas.contextualdata.miscellaneous.IMiscellaneousContextualDataProvider
    @NotNull
    public String getSdkVersionName() {
        return "8.4.0";
    }
}
