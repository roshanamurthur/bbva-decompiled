package com.bbva.component.dm.headers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WhitelistedUrl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/headers/WhitelistedUrl;", "", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "Lkotlin/text/Regex;", "b", "Lkotlin/text/Regex;", "getRegex", "()Lkotlin/text/Regex;", "regex", "<init>", "(Ljava/lang/String;Lkotlin/text/Regex;)V", "component-dm-cacheheaders_release"}, k = 1, mv = {1, 9, 0})
public final class WhitelistedUrl {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Regex regex;

    public WhitelistedUrl(@NotNull String key, @NotNull Regex regex) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(regex, "regex");
        this.key = key;
        this.regex = regex;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final Regex getRegex() {
        return this.regex;
    }
}
