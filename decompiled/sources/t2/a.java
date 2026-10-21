package t2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: DocumentsContractApi19.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(19)
public final class a {
    public static boolean a(Context context, Uri uri) throws Throwable {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String strE = e(context, uri, "mime_type");
        int iD = (int) d(context, uri, "flags", 0);
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        if ((iD & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(strE) || (iD & 8) == 0) {
            return (TextUtils.isEmpty(strE) || (iD & 2) == 0) ? false : true;
        }
        return true;
    }

    public static void b(@Nullable Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (RuntimeException e5) {
                throw e5;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean c(Context context, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursorQuery.getCount() > 0;
        } catch (Exception e5) {
            Log.w("DocumentFile", "Failed query: " + e5);
            return false;
        } finally {
            b(cursorQuery);
        }
    }

    public static long d(Context context, Uri uri, String str, long j10) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? j10 : cursorQuery.getLong(0);
        } catch (Exception e5) {
            Log.w("DocumentFile", "Failed query: " + e5);
            return j10;
        } finally {
            b(cursorQuery);
        }
        b(cursorQuery);
    }

    @Nullable
    public static String e(Context context, Uri uri, String str) throws Throwable {
        Cursor cursorQuery;
        Throwable th2;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                        b(cursorQuery);
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    b(cursorQuery);
                    return string;
                } catch (Exception e5) {
                    e = e5;
                    Log.w("DocumentFile", "Failed query: " + e);
                    b(cursorQuery);
                    return null;
                }
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Exception e7) {
            e = e7;
            cursorQuery = null;
        } catch (Throwable th4) {
            cursorQuery = null;
            th2 = th4;
        }
        th2 = th3;
        b(cursorQuery);
        throw th2;
    }
}
