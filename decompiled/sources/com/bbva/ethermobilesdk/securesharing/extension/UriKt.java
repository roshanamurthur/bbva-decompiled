package com.bbva.ethermobilesdk.securesharing.extension;

import android.net.Uri;
import androidx.datastore.preferences.protobuf.q;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.securesharing.database.EntryTable;
import com.bbva.ethermobilesdk.securesharing.database.InfoTable;
import com.bbva.sl.ar.android.storage.pss.provider.SharedProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Uri.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u001a \u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u001a\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\n"}, d2 = {"Landroid/net/Uri;", "", "column", "selection", "selectionCriteria", "contentType", "authority", "toRequest", "path", "contentUri", "securesharing_release"}, k = 2, mv = {1, 5, 1})
public final class UriKt {
    @NotNull
    public static final String contentType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String string = uri.toString();
        Regex regex = new Regex(EntryTable.URI_TYPE_FORMAT);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Intrinsics.checkNotNullParameter(regex, "<this>");
        if (regex.matches(string)) {
            return EntryTable.CONTENT_TYPE;
        }
        Regex regex2 = new Regex(EntryTable.URI_ITEM_TYPE_FORMAT);
        Intrinsics.checkNotNullParameter(regex2, "<this>");
        if (regex2.matches(string)) {
            return EntryTable.CONTENT_ITEM_TYPE;
        }
        Regex regex3 = new Regex(InfoTable.URI_TYPE_FORMAT);
        Intrinsics.checkNotNullParameter(regex3, "<this>");
        if (!regex3.matches(string)) {
            Regex regex4 = new Regex(InfoTable.URI_ITEM_TYPE_FORMAT);
            Intrinsics.checkNotNullParameter(regex4, "<this>");
            if (!regex4.matches(string)) {
                throw q.d("Content Provider was called with a invalid uri: [" + uri + AbstractJsonLexerKt.END_LIST, null, 2, null);
            }
        }
        return InfoTable.CONTENT_ITEM_TYPE;
    }

    @NotNull
    public static final Uri contentUri(@NotNull String authority, @Nullable String str) {
        Intrinsics.checkNotNullParameter(authority, "authority");
        Uri base = Uri.parse(Intrinsics.stringPlus("content://", authority));
        Uri uriWithAppendedPath = str == null ? null : Uri.withAppendedPath(base, StringsKt__StringsKt.removePrefix(str, (CharSequence) "/"));
        if (uriWithAppendedPath != null) {
            return uriWithAppendedPath;
        }
        Intrinsics.checkNotNullExpressionValue(base, "base");
        return base;
    }

    @Nullable
    public static final String selectionCriteria(@NotNull Uri uri, @NotNull String column, @Nullable String str) {
        String str2;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(column, "column");
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        if (!new Regex(SharedProvider.URI_CONTENT_ITEM_TYPE_REGEX).matches(string)) {
            return str;
        }
        if (str == null || str.length() == 0) {
            str2 = "";
        } else {
            str2 = " AND (" + ((Object) str) + RootService.CLOSE_BRACKET;
        }
        return column + '=' + ((Object) uri.getPathSegments().get(1)) + ' ' + str2;
    }

    @NotNull
    public static final Uri toRequest(@NotNull Uri uri, @NotNull String authority) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(authority, "authority");
        return contentUri(authority, uri.getPath());
    }
}
