package com.bbva.actionlauncher.converter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.webkit.internal.AssetHelper;
import com.bbva.actionlauncher.ActionLauncherConfig;
import com.bbva.actionlauncher.SharedValue;
import com.bbva.actionlauncher.ViewValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ValueMappers.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0007H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\bH\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\tH\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\nH\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u000bH\u0000¨\u0006\f"}, d2 = {"defaultConfig", "Lcom/bbva/actionlauncher/ActionLauncherConfig;", "context", "Landroid/content/Context;", "toIntent", "Landroid/content/Intent;", "Lcom/bbva/actionlauncher/SharedValue$Email;", "Lcom/bbva/actionlauncher/SharedValue$Text;", "Lcom/bbva/actionlauncher/SharedValue$Uri;", "Lcom/bbva/actionlauncher/SharedValue$Url;", "Lcom/bbva/actionlauncher/ViewValue$Uri;", "Lcom/bbva/actionlauncher/ViewValue$Url;", "actionlauncher_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nValueMappers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueMappers.kt\ncom/bbva/actionlauncher/converter/ValueMappersKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,51:1\n37#2,2:52\n*S KotlinDebug\n*F\n+ 1 ValueMappers.kt\ncom/bbva/actionlauncher/converter/ValueMappersKt\n*L\n35#1:52,2\n*E\n"})
public final class ValueMappersKt {
    @NotNull
    public static final ActionLauncherConfig defaultConfig(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        String absolutePath = context.getFilesDir().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "context.filesDir.absolutePath");
        return new ActionLauncherConfig(packageName, absolutePath, 0, 0, 12, null);
    }

    @NotNull
    public static final Intent toIntent(@NotNull SharedValue.Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(uri.getUri()));
        intent.setType(uri.getMimetype());
        intent.setFlags(uri.getFlags());
        return intent;
    }

    @NotNull
    public static final Intent toIntent(@NotNull SharedValue.Text text) {
        Intrinsics.checkNotNullParameter(text, "<this>");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", text.getText());
        return intent;
    }

    @NotNull
    public static final Intent toIntent(@NotNull SharedValue.Email email) {
        Intrinsics.checkNotNullParameter(email, "<this>");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", email.getText());
        intent.putExtra("android.intent.extra.SUBJECT", email.getSubject());
        intent.putExtra("android.intent.extra.EMAIL", (String[]) email.getToEmails().toArray(new String[0]));
        return intent;
    }

    @NotNull
    public static final Intent toIntent(@NotNull SharedValue.Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setData(Uri.parse(url.getUrl()));
        return intent;
    }

    @NotNull
    public static final Intent toIntent(@NotNull ViewValue.Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse(uri.getUri()), uri.getMimetype());
        intent.setFlags(uri.getFlags());
        return intent;
    }

    @NotNull
    public static final Intent toIntent(@NotNull ViewValue.Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return new Intent("android.intent.action.VIEW", Uri.parse(url.getUrl()));
    }
}
