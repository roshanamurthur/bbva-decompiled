package com.bbva.ethermobilesdk.passchecker.validation;

import com.bbva.ethermobilesdk.passchecker.model.api.output.PassCheckerError;
import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationConfig;
import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationEvaluation;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Validation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/validation/Validation;", "", "()V", "validate", "", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "validationConfig", "Lcom/bbva/ethermobilesdk/passchecker/model/internal/ValidationConfig;", "validationEvaluation", "Lcom/bbva/ethermobilesdk/passchecker/model/internal/ValidationEvaluation;", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Validation {
    @NotNull
    public abstract List<PassCheckerError> validate(@NotNull ValidationConfig validationConfig, @NotNull ValidationEvaluation validationEvaluation);
}
