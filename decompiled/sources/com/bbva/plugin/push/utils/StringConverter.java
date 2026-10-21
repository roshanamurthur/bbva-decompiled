package com.bbva.plugin.push.utils;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.j;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StringConverter.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/plugin/push/utils/StringConverter;", "Lcom/bbva/plugin/push/utils/Converter;", "", "", "from", "convert", "<init>", "()V", "push-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class StringConverter implements Converter<String, Object> {

    @NotNull
    public static final StringConverter INSTANCE = new StringConverter();

    @Override // com.bbva.plugin.push.utils.Converter
    @NotNull
    public Object convert(@NotNull String from) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(from, "from");
        String lowerCase2 = null;
        if ((from != null ? k.toIntOrNull(from) : null) != null) {
            return Integer.valueOf(Integer.parseInt(from));
        }
        if ((from != null ? k.toLongOrNull(from) : null) != null) {
            return Long.valueOf(Long.parseLong(from));
        }
        if ((from != null ? j.toFloatOrNull(from) : null) != null) {
            return Float.valueOf(Float.parseFloat(from));
        }
        if ((from != null ? j.toDoubleOrNull(from) : null) != null) {
            return Double.valueOf(Double.parseDouble(from));
        }
        if (from != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            lowerCase = from.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        } else {
            lowerCase = null;
        }
        if (!Intrinsics.areEqual(lowerCase, "true")) {
            if (from != null) {
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
                lowerCase2 = from.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            }
            if (!Intrinsics.areEqual(lowerCase2, "false")) {
                return from;
            }
        }
        return Boolean.valueOf(Boolean.parseBoolean(from));
    }
}
