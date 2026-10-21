package com.bbva.document.scanner.presentation;

import android.content.Context;
import android.net.Uri;
import com.bbva.documentscanner.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Constants.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"ACTION_PREVIEW_DOCUMENT", "", "ACTION_SCAN_DOCUMENT", "PARAMETERS", "RESULT_DATA", "ROUTE_PREVIEW", "ROUTE_SCAN", "createUri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "path", "document-scanner_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ConstantsKt {

    @NotNull
    public static final String ACTION_PREVIEW_DOCUMENT = "action.PREVIEW_DOCUMENT";

    @NotNull
    public static final String ACTION_SCAN_DOCUMENT = "action.SCAN_DOCUMENT";

    @NotNull
    public static final String PARAMETERS = "parameters";

    @NotNull
    public static final String RESULT_DATA = "result";

    @NotNull
    public static final String ROUTE_PREVIEW = "preview-document";

    @NotNull
    public static final String ROUTE_SCAN = "scan-document";

    @NotNull
    public static final Uri createUri(@NotNull Context context, @NotNull String path) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        String string = context.getString(R.string.document_scanner_host);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.document_scanner_host)");
        String string2 = context.getString(R.string.document_scanner_scheme);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri….document_scanner_scheme)");
        Uri uriBuild = new Uri.Builder().scheme(string2).authority(string).path(path).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "Builder()\n        .schem…th(path)\n        .build()");
        return uriBuild;
    }
}
