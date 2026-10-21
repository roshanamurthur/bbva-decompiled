package com.bbva.cells.pluginkit.command;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import kotlin.Metadata;

/* JADX INFO: compiled from: Command.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/cells/pluginkit/command/ParamsValidator;", ExifInterface.GPS_DIRECTION_TRUE, "", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "(Ljava/lang/Object;)Z", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public interface ParamsValidator<T> {
    boolean isValid(T params);
}
