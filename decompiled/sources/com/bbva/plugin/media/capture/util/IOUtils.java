package com.bbva.plugin.media.capture.util;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.bbva.androidtoolkit.utils.Tracer;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IOUtils.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/media/capture/util/IOUtils;", "", "Landroid/content/Intent;", "intent", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "getBase64StringFromIntent", "<init>", "()V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class IOUtils {

    @NotNull
    public static final IOUtils INSTANCE = new IOUtils();

    @JvmStatic
    @Nullable
    public static final String getBase64StringFromIntent(@NotNull Intent intent, @NotNull Activity activity) {
        String string;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(data, "intent.data ?: return null");
        try {
            INSTANCE.getClass();
            Cursor cursorQuery = activity.getContentResolver().query(data, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    cursorQuery.moveToFirst();
                    string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                    CloseableKt.closeFinally(cursorQuery, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(cursorQuery, th2);
                        throw th3;
                    }
                }
            } else {
                string = null;
            }
            if (string == null) {
                string = "";
            }
            File file = new File(string);
            String strConvertFileToBase64 = FileUtils.INSTANCE.convertFileToBase64(file);
            file.delete();
            return strConvertFileToBase64;
        } catch (Exception e5) {
            Tracer.e(e5.getMessage());
            return null;
        }
    }
}
