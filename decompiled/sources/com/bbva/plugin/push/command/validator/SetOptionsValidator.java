package com.bbva.plugin.push.command.validator;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.plugin.push.command.params.SetOptionsParams;
import com.cells.validator.ValidatorChecker;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Validators.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/plugin/push/command/validator/SetOptionsValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/plugin/push/command/params/SetOptionsParams;", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "push-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nValidators.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Validators.kt\ncom/bbva/plugin/push/command/validator/SetOptionsValidator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
public final class SetOptionsValidator implements ValidatorChecker<SetOptionsParams> {

    @NotNull
    public static final SetOptionsValidator INSTANCE = new SetOptionsValidator();

    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@Nullable SetOptionsParams params) {
        Map<String, Object> options;
        Intrinsics.checkNotNull(params);
        return (!ValidatorsKt.access$norNullNorEmptyNorBlank(params.getServiceId()) || (options = params.getOptions()) == null || options.isEmpty()) ? false : true;
    }
}
