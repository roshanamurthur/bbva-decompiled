package com.bbva.glomohybrid.base.file.infrastructure.extensions;

import android.util.Base64;
import ik.c;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toBase64", "", "Ljava/io/File;", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FileExtensionsKt {
    @NotNull
    public static final String toBase64(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String strEncodeToString = Base64.encodeToString(c.readBytes(file), 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}
