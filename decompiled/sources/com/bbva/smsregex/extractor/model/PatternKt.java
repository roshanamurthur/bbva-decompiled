package com.bbva.smsregex.extractor.model;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Pattern.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"smsregex_release"}, k = 2, mv = {1, 9, 0})
public final class PatternKt {
    public static final String access$toSeparator(String str) {
        if (Intrinsics.areEqual(str, "space")) {
            return " ";
        }
        return Intrinsics.areEqual(str, "newLine") ? RootService.LINE_BREAK : "";
    }
}
