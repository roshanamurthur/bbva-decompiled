package com.bbva.plugin.media.capture.command.param;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.plugin.media.capture.util.Constants;
import com.cells.validator.ValidatorChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetPictureParamsValidator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/plugin/media/capture/command/param/GetPictureParamsValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/plugin/media/capture/command/param/GetPictureParams;", "params", "", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "<init>", "()V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class GetPictureParamsValidator implements ValidatorChecker<GetPictureParams> {
    public static boolean a(String str, List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (l.equals((String) it.next(), str, true)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@NotNull GetPictureParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Constants constants = Constants.INSTANCE;
        if (a(params.getSource(), constants.getSupportedSources())) {
            return a(params.getScaleType(), constants.getSupportedScaleTypes());
        }
        return false;
    }
}
