package com.bbva.plugin.media.capture.util;

import ai.a;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import androidx.core.content.FileProvider;
import com.bbva.androidtoolkit.utils.Tracer;
import com.bbva.plugin.media.capture.model.MediaSource;
import com.bbva.plugin.media.capture.model.TempFile;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FileUtils.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/plugin/media/capture/util/FileUtils;", "", "Ljava/io/File;", "path", "", "convertFileToBase64", "Landroid/content/Context;", "context", "Lcom/bbva/plugin/media/capture/model/MediaSource;", "mediaSource", "Lcom/bbva/plugin/media/capture/model/TempFile;", "createTempFile$media_capture_plugin_release", "(Landroid/content/Context;Lcom/bbva/plugin/media/capture/model/MediaSource;)Lcom/bbva/plugin/media/capture/model/TempFile;", "createTempFile", "<init>", "()V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class FileUtils {

    @NotNull
    public static final FileUtils INSTANCE = new FileUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f35859a = "FileUtils";

    @Nullable
    public final String convertFileToBase64(@Nullable File path) {
        Object objM5535constructorimpl;
        Object objM5535constructorimpl2;
        if (path == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            FileInputStream fileInputStream = new FileInputStream(path);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    ByteStreamsKt.copyTo$default(fileInputStream, byteArrayOutputStream, 0, 2, null);
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    CloseableKt.closeFinally(fileInputStream, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                    objM5535constructorimpl = Result.m5535constructorimpl(byteArray);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(byteArrayOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    CloseableKt.closeFinally(fileInputStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th6));
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            try {
                objM5535constructorimpl2 = Result.m5535constructorimpl(Base64.encodeToString((byte[]) objM5535constructorimpl, 2));
            } catch (Throwable th7) {
                Result.Companion companion3 = Result.INSTANCE;
                objM5535constructorimpl = ResultKt.createFailure(th7);
                objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
            }
        } else {
            objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl2);
        if (thM5538exceptionOrNullimpl != null) {
            Tracer.e(f35859a, thM5538exceptionOrNullimpl, thM5538exceptionOrNullimpl.getMessage());
        }
        return (String) (Result.m5540isFailureimpl(objM5535constructorimpl2) ? null : objM5535constructorimpl2);
    }

    @NotNull
    public final TempFile createTempFile$media_capture_plugin_release(@NotNull Context context, @NotNull MediaSource mediaSource) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaSource, "mediaSource");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strI = a.i(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1, mediaSource.getFileName(), "java.lang.String.format(format, *args)");
        String directory = mediaSource.getDirectory();
        File externalFilesDir = context.getExternalFilesDir(directory);
        if (externalFilesDir == null) {
            externalFilesDir = new File(context.getCacheDir(), directory);
            externalFilesDir.mkdir();
        }
        File file = new File(externalFilesDir, strI);
        INSTANCE.getClass();
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".mediacapture.fileprovider", file);
        Intrinsics.checkNotNullExpressionValue(uriForFile, "FileProvider.getUriForFi… provider(context), file)");
        return new TempFile(file, uriForFile);
    }
}
