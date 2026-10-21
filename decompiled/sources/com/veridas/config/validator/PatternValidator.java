package com.veridas.config.validator;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PatternValidator.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/veridas/config/validator/PatternValidator;", "Lcom/veridas/config/validator/Validator;", "", "value", "", "validate", "Ljava/util/regex/Pattern;", "pattern", "<init>", "(Ljava/util/regex/Pattern;)V", "common-core_release"}, k = 1, mv = {1, 9, 0})
public abstract class PatternValidator implements Validator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Pattern f66677a;

    public PatternValidator(@NotNull Pattern pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        this.f66677a = pattern;
    }

    @Override // com.veridas.config.validator.Validator
    public boolean validate(@Nullable String value) {
        if (value == null) {
            return false;
        }
        return this.f66677a.matcher(value).matches();
    }
}
