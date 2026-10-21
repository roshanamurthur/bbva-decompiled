package com.bbva.cells.pluginkit.command.model;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ErrorMessage.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/bbva/cells/pluginkit/command/model/ErrorMessage;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/cells/pluginkit/command/model/Serializer;", "code", "", "getCode", "()I", "message", "", "getMessage", "()Ljava/lang/String;", "toResult", "Lcom/bbva/cells/pluginkit/command/model/CommandResult;", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public interface ErrorMessage<T> extends Serializer<T> {

    /* JADX INFO: compiled from: ErrorMessage.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    public static final class DefaultImpls {
        @NotNull
        public static <T> CommandResult toResult(@NotNull ErrorMessage<T> errorMessage) {
            return new CommandResult.Error(errorMessage);
        }
    }

    int getCode();

    @NotNull
    String getMessage();

    @NotNull
    CommandResult toResult();
}
