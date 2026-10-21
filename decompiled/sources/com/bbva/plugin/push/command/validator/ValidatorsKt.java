package com.bbva.plugin.push.command.validator;

import kotlin.Metadata;
import kotlin.text.l;

/* JADX INFO: compiled from: Validators.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"push-plugin_release"}, k = 2, mv = {1, 8, 0})
public final class ValidatorsKt {
    public static final boolean access$norNullNorEmptyNorBlank(String str) {
        return str != null && str.length() > 0 && (l.isBlank(str) ^ true);
    }
}
