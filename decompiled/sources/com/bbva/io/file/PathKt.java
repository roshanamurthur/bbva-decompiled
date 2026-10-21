package com.bbva.io.file;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\u000b\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\f\u001a\u00020\u0005*\u00020\u0000\u001a\f\u0010\r\u001a\u0004\u0018\u00010\u0003*\u00020\u0000\u001a\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0012\u001a\u0004\u0018\u00010\u0003*\u00020\u0000¨\u0006\u0013"}, d2 = {"Landroid/net/Uri;", "Landroid/content/Context;", "context", "", "getPath", "", "isExternalStorageDocument", "isDownloadsDocument", "isMediaDocument", "isGooglePhotosUri", "isGoogleDriveUri", "isContent", "isFile", "toExternalPath", "toDownloadedPath", "toMediaPath", "toGoogleDrivePath", "toContentPath", "toFilePath", "io_release"}, k = 2, mv = {1, 6, 0})
public final class PathKt {
    public static final String a(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            cursorQuery.moveToFirst();
            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
            CloseableKt.closeFinally(cursorQuery, null);
            return string;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(cursorQuery, th2);
                throw th3;
            }
        }
    }

    public static final String b(Context context, Uri uri) {
        Cursor cursorQuery;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null || (cursorQuery = contentResolver.query(uri, null, null, null, null)) == null) {
            return null;
        }
        try {
            int columnIndex = cursorQuery.getColumnIndex("_display_name");
            cursorQuery.moveToFirst();
            File file = new File(context.getCacheDir(), cursorQuery.getString(columnIndex));
            InputStream from = context.getContentResolver().openInputStream(uri);
            if (from != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        Intrinsics.checkNotNullExpressionValue(from, "from");
                        ByteStreamsKt.copyTo$default(from, fileOutputStream, 0, 2, null);
                        CloseableKt.closeFinally(fileOutputStream, null);
                        CloseableKt.closeFinally(from, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        CloseableKt.closeFinally(from, th4);
                        throw th5;
                    }
                }
            }
            String path = file.getPath();
            CloseableKt.closeFinally(cursorQuery, null);
            return path;
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                CloseableKt.closeFinally(cursorQuery, th6);
                throw th7;
            }
        }
    }

    public static final String c(Context context, Uri uri) {
        Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            int columnIndex = cursorQuery.getColumnIndex("_display_name");
            cursorQuery.moveToFirst();
            File file = new File(context.getFilesDir(), cursorQuery.getString(columnIndex));
            InputStream from = context.getContentResolver().openInputStream(uri);
            if (from != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        Intrinsics.checkNotNullExpressionValue(from, "from");
                        ByteStreamsKt.copyTo$default(from, fileOutputStream, 0, 2, null);
                        CloseableKt.closeFinally(fileOutputStream, null);
                        CloseableKt.closeFinally(from, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        CloseableKt.closeFinally(from, th4);
                        throw th5;
                    }
                }
            }
            String path = file.getPath();
            CloseableKt.closeFinally(cursorQuery, null);
            return path;
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                CloseableKt.closeFinally(cursorQuery, th6);
                throw th7;
            }
        }
    }

    @Nullable
    public static final String getPath(@NotNull Uri uri, @NotNull Context context) {
        Object objM5535constructorimpl;
        String filePath;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (isExternalStorageDocument(uri)) {
                filePath = toExternalPath(uri);
            } else if (isDownloadsDocument(uri)) {
                filePath = toDownloadedPath(uri, context);
            } else if (isMediaDocument(uri)) {
                filePath = toMediaPath(uri, context);
            } else if (isGoogleDriveUri(uri)) {
                filePath = toGoogleDrivePath(uri, context);
            } else if (isContent(uri)) {
                filePath = toContentPath(uri, context);
            } else {
                filePath = isFile(uri) ? toFilePath(uri) : null;
            }
            objM5535constructorimpl = Result.m5535constructorimpl(filePath);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return (String) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
    }

    public static final boolean isContent(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return l.equals("content", uri.getScheme(), true);
    }

    public static final boolean isDownloadsDocument(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.areEqual("com.android.providers.downloads.documents", uri.getAuthority());
    }

    public static final boolean isExternalStorageDocument(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.areEqual("com.android.externalstorage.documents", uri.getAuthority());
    }

    public static final boolean isFile(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return l.equals("file", uri.getScheme(), true);
    }

    public static final boolean isGoogleDriveUri(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.areEqual("com.google.android.apps.docs.storage", uri.getAuthority()) || Intrinsics.areEqual("com.google.android.apps.docs.storage.legacy", uri.getAuthority());
    }

    public static final boolean isGooglePhotosUri(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.areEqual("com.google.android.apps.photos.content", uri.getAuthority());
    }

    public static final boolean isMediaDocument(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.areEqual("com.android.providers.media.documents", uri.getAuthority());
    }

    @Nullable
    public static final String toContentPath(@NotNull Uri uri, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (isGooglePhotosUri(uri)) {
            return uri.getLastPathSegment();
        }
        if (isGoogleDriveUri(uri)) {
            return b(context, uri);
        }
        return Build.VERSION.SDK_INT >= 24 ? c(context, uri) : a(context, uri, null, null);
    }

    @Nullable
    public static final String toDownloadedPath(@NotNull Uri uri, @NotNull Context context) {
        String strReplaceFirst;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        String strReplaceFirst2 = null;
        if (cursorQuery != null) {
            try {
                cursorQuery.moveToFirst();
                String str = Environment.getExternalStorageDirectory().toString() + "/Download/" + cursorQuery.getString(0);
                if (str.length() > 0) {
                    CloseableKt.closeFinally(cursorQuery, null);
                    return str;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursorQuery, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(cursorQuery, th2);
                    throw th3;
                }
            }
        }
        String documentId = DocumentsContract.getDocumentId(uri);
        Intrinsics.checkNotNullExpressionValue(documentId, "getDocumentId(this)");
        if (documentId.length() <= 0) {
            return null;
        }
        if (l.startsWith$default(documentId, "raw:", false, 2, null)) {
            return new Regex("raw:").replaceFirst(documentId, "");
        }
        try {
            Uri uri2 = Uri.parse(new String[]{"content://downloads/public_downloads", "content://downloads/my_downloads"}[0]);
            Long lValueOf = Long.valueOf(documentId);
            Intrinsics.checkNotNullExpressionValue(lValueOf, "valueOf(id)");
            Uri uriWithAppendedId = ContentUris.withAppendedId(uri2, lValueOf.longValue());
            Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(\n        …eOf(id)\n                )");
            return a(context, uriWithAppendedId, null, null);
        } catch (NumberFormatException unused) {
            String path = uri.getPath();
            if (path != null && (strReplaceFirst = new Regex("^/document/raw:").replaceFirst(path, "")) != null) {
                strReplaceFirst2 = new Regex("^raw:").replaceFirst(strReplaceFirst, "");
            }
            return strReplaceFirst2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    @Nullable
    public static final String toExternalPath(@NotNull Uri uri) {
        String strF;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String docId = DocumentsContract.getDocumentId(uri);
        Intrinsics.checkNotNullExpressionValue(docId, "docId");
        Object[] array = StringsKt__StringsKt.split$default((CharSequence) docId, new String[]{DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER}, false, 0, 6, (Object) null).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        String[] strArr = (String[]) array;
        String str = strArr[0];
        String str2 = "/" + strArr[1];
        if (l.equals("primary", str, true)) {
            strF = Environment.getExternalStorageDirectory().toString() + str2;
            if (!new File(strF).exists()) {
            }
            if (strF.length() > 0) {
                return strF;
            }
            return null;
        }
        strF = "";
        String str3 = System.getenv("SECONDARY_STORAGE");
        if (str3 != null) {
            strF = u.f(str3, str2);
        }
        if (!new File(strF).exists()) {
            String str4 = System.getenv("EXTERNAL_STORAGE");
            if (str4 != null) {
                strF = u.f(str4, str2);
            }
            new File(strF).exists();
        }
        if (strF.length() > 0) {
            return strF;
        }
        return null;
    }

    @Nullable
    public static final String toFilePath(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return uri.getPath();
    }

    @Nullable
    public static final String toGoogleDrivePath(@NotNull Uri uri, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return b(context, uri);
    }

    @Nullable
    public static final String toMediaPath(@NotNull Uri uri, @NotNull Context context) {
        Uri contentUri;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String docId = DocumentsContract.getDocumentId(uri);
        Intrinsics.checkNotNullExpressionValue(docId, "docId");
        Object[] array = StringsKt__StringsKt.split$default((CharSequence) docId, new String[]{DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER}, false, 0, 6, (Object) null).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        String[] strArr = (String[]) array;
        String str = strArr[0];
        int iHashCode = str.hashCode();
        if (iHashCode != 93166550) {
            if (iHashCode != 100313435) {
                if (iHashCode != 112202875 || !str.equals("video")) {
                    return "";
                }
                contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else {
                if (!str.equals(AuthConstants.IMAGE)) {
                    return "";
                }
                contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            }
        } else {
            if (!str.equals("audio")) {
                return "";
            }
            contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        }
        String[] strArr2 = {strArr[1]};
        if (Build.VERSION.SDK_INT >= 24) {
            return c(context, uri);
        }
        Intrinsics.checkNotNullExpressionValue(contentUri, "contentUri");
        return a(context, contentUri, "_id=?", strArr2);
    }
}
