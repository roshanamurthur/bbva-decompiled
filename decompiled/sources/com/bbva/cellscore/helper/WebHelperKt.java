package com.bbva.cellscore.helper;

import com.bbva.cellscore.web.data.configutation.WebConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u001a\u001c\u0010\u0004\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0000\"\u0014\u0010\u0007\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/bbva/cellscore/web/data/configutation/WebConfiguration;", "webConfiguration", "", "runtimeIndex", "getHtmlIndex", "url", "createPostMessageFunction", "INDEX", "Ljava/lang/String;", "HTTPS_PROTOCOL", "cells-core_release"}, k = 2, mv = {1, 5, 1})
public final class WebHelperKt {

    @NotNull
    public static final String HTTPS_PROTOCOL = "https://";

    @NotNull
    public static final String INDEX = "https://appassets.androidplatform.net/assets/www/index.html";

    @NotNull
    public static final String createPostMessageFunction(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return "javascript:window.postMessage('%s','" + url + "cellsNativePlugin')";
    }

    @NotNull
    public static final String getHtmlIndex(@Nullable WebConfiguration webConfiguration, @Nullable String str) {
        if (str == null) {
            str = webConfiguration == null ? null : webConfiguration.getUrl();
        }
        if (str == null || str.length() == 0 || l.isBlank(str)) {
            return "https://appassets.androidplatform.net/assets/www/index.html";
        }
        if (l.startsWith(str, HTTPS_PROTOCOL, true)) {
            return str;
        }
        throw new IllegalArgumentException(" FORBIDDEN: File or Http protocols are not supported anymore to be used in asset loading.\n            Html Index must be specified using HTTPS protocol, use https://appassets.androidplatform.net/assets/www/index.html instead.\n            If no index is specified, Cells-Native-Core will use https://appassets.androidplatform.net/assets/www/index.html protocol by default".toString());
    }
}
