package com.bbva.cellswidgets.circle;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DefaultUsernameInitialsExtractor.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bbva/cellswidgets/circle/DefaultUsernameInitialsExtractor;", "Lcom/bbva/cellswidgets/circle/UsernameInitialsExtractor;", "()V", "extract", "", HintConstants.AUTOFILL_HINT_USERNAME, "cells-widgets_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultUsernameInitialsExtractor implements UsernameInitialsExtractor {

    /* JADX INFO: compiled from: DefaultUsernameInitialsExtractor.kt */
    public static final class a extends Lambda implements Function1<String, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f27276p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            return String.valueOf(StringsKt___StringsKt.first(it));
        }
    }

    @Override // com.bbva.cellswidgets.circle.UsernameInitialsExtractor
    @NotNull
    public String extract(@Nullable String username) {
        if (username == null || username.length() == 0) {
            return "";
        }
        if (!StringsKt__StringsKt.contains$default((CharSequence) username, (CharSequence) " ", false, 2, (Object) null)) {
            return String.valueOf(StringsKt___StringsKt.first(username));
        }
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.take(new Regex("\\s+").split(StringsKt__StringsKt.trim((CharSequence) username).toString(), 0), 2), "", null, null, 0, null, a.f27276p0, 30, null);
    }
}
