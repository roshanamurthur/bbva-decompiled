package com.bbva.androidtoolkit.extenison;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.webkit.WebViewCompat;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isAndroidWebViewAvailable", "", "Landroid/content/Context;", "toolkit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Context.kt\ncom/bbva/androidtoolkit/extenison/ContextKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
public final class ContextKt {
    public static final boolean isAndroidWebViewAvailable(@NotNull Context context) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            PackageInfo currentWebViewPackage = WebViewCompat.getCurrentWebViewPackage(context);
            String str = currentWebViewPackage != null ? currentWebViewPackage.packageName : null;
            objM5535constructorimpl = Result.m5535constructorimpl(Boolean.valueOf((str == null || str.length() == 0) ? false : true));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            objM5535constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM5535constructorimpl).booleanValue();
    }
}
