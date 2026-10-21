package com.bbva.networkplugin.utils;

import android.content.Context;
import android.util.Base64;
import com.bbva.androidtoolkit.plugin.filesystem.WebFile;
import com.bbva.cellscore.helper.WebHelperKt;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.multipart.Part;
import com.bbva.network.model.multipart.PartBody;
import com.bbva.network.model.request.NetworkRequestBody;
import ik.e;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileActions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/networkplugin/utils/FileActions;", "", "Landroid/content/Context;", "context", "", "content", "Ljava/io/File;", "save", "Lcom/bbva/network/model/NetworkRequest;", "request", "", "delete$network_plugin_release", "(Lcom/bbva/network/model/NetworkRequest;)V", "delete", "<init>", "()V", "network-plugin_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFileActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileActions.kt\ncom/bbva/networkplugin/utils/FileActions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,44:1\n1#2:45\n32#3,2:46\n*S KotlinDebug\n*F\n+ 1 FileActions.kt\ncom/bbva/networkplugin/utils/FileActions\n*L\n35#1:46,2\n*E\n"})
public final class FileActions {
    public final void delete$network_plugin_release(@NotNull NetworkRequest request) {
        List<Part> parts;
        Intrinsics.checkNotNullParameter(request, "request");
        NetworkRequestBody body = request.getBody();
        NetworkRequestBody.MultipartBody multipartBody = body instanceof NetworkRequestBody.MultipartBody ? (NetworkRequestBody.MultipartBody) body : null;
        if (multipartBody == null || (parts = multipartBody.getParts()) == null || (r3 = parts.iterator()) == null) {
            return;
        }
        for (Part part : parts) {
            if (part.getBody() instanceof PartBody.FileBody) {
                PartBody body2 = part.getBody();
                Intrinsics.checkNotNull(body2, "null cannot be cast to non-null type com.bbva.network.model.multipart.PartBody.FileBody");
                ((PartBody.FileBody) body2).getFile().delete();
            }
        }
    }

    @NotNull
    public final File save(@NotNull Context context, @NotNull String content) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(content, "content");
        if (l.startsWith$default(content, WebHelperKt.HTTPS_PROTOCOL, false, 2, null)) {
            WebFile webFileFrom = WebFile.INSTANCE.from(context, content);
            File file = webFileFrom != null ? webFileFrom.getFile() : null;
            File tempFile = File.createTempFile(UUID.randomUUID().toString(), ".tmp");
            if (file != null) {
                Intrinsics.checkNotNullExpressionValue(tempFile, "tempFile");
                File fileCopyTo$default = e.copyTo$default(file, tempFile, true, 0, 4, null);
                if (fileCopyTo$default != null) {
                    return fileCopyTo$default;
                }
            }
            throw new Exception("Cannot create a file from a url");
        }
        File fileCreateTempFile = File.createTempFile(UUID.randomUUID().toString(), ".tmp");
        byte[] bArrDecode = Base64.decode(content, 0);
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            fileOutputStream.write(bArrDecode);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            Intrinsics.checkNotNullExpressionValue(fileCreateTempFile, "createTempFile(UUID.rand…m.write(data) }\n        }");
            return fileCreateTempFile;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(fileOutputStream, th2);
                throw th3;
            }
        }
    }
}
