package com.bbva.ethermobilesdk.sharedstorage.provider;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Provider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shared-storage_release"}, k = 2, mv = {1, 9, 0})
public final class ProviderKt {
    public static final String access$now(ThreadLocal threadLocal) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) threadLocal.get();
        String str = simpleDateFormat != null ? simpleDateFormat.format(new Date()) : null;
        if (str != null) {
            return str;
        }
        String str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.ROOT).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }
}
