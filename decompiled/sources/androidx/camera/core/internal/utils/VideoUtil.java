package androidx.camera.core.internal.utils;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class VideoUtil {
    private static final String TAG = "VideoUtil";

    private VideoUtil() {
    }

    @Nullable
    public static String getAbsolutePathFromUri(@NonNull ContentResolver contentResolver, @NonNull Uri uri) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{"_data"}, null, null, null);
                Cursor cursor = (Cursor) Preconditions.checkNotNull(cursorQuery);
                try {
                    int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
                    cursor.moveToFirst();
                    String string = cursor.getString(columnIndexOrThrow);
                    cursor.close();
                    return string;
                } catch (RuntimeException e5) {
                    e = e5;
                    cursorQuery = cursor;
                    Logger.e(TAG, String.format("Failed in getting absolute path for Uri %s with Exception %s", uri.toString(), e.toString()));
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return "";
                } catch (Throwable th2) {
                    th = th2;
                    cursorQuery = cursor;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (RuntimeException e7) {
                e = e7;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
