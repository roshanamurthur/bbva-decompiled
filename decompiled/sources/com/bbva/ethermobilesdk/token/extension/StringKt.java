package com.bbva.ethermobilesdk.token.extension;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0003"}, d2 = {"splitAndLast", "", "separator", "ethertoken_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StringKt {
    @NotNull
    public static final String splitAndLast(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String[] strArr = new String[1];
        if (str2 == null) {
            str2 = "#";
        }
        strArr[0] = str2;
        return (String) CollectionsKt___CollectionsKt.last(StringsKt__StringsKt.split$default((CharSequence) str, strArr, false, 0, 6, (Object) null));
    }

    public static /* synthetic */ String splitAndLast$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "#";
        }
        return splitAndLast(str, str2);
    }
}
