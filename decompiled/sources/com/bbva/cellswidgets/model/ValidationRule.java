package com.bbva.cellswidgets.model;

import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsEditTextConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 B\u001f\b\u0016\u0012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010!¢\u0006\u0004\b\u001f\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lcom/bbva/cellswidgets/model/ValidationRule;", "", "", "value", "", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "component1", "component2", "Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "component3", "pattern", "validateOnType", "errorMessage", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "b", "Z", "getValidateOnType", "()Z", "c", "Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "getErrorMessage", "()Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "<init>", "(Ljava/lang/String;ZLcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;)V", "", "map", "(Ljava/util/Map;)V", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class ValidationRule {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String pattern;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean validateOnType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PropertiesHelper.Property errorMessage;

    public ValidationRule(@NotNull String pattern, boolean z10, @NotNull PropertiesHelper.Property errorMessage) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.pattern = pattern;
        this.validateOnType = z10;
        this.errorMessage = errorMessage;
    }

    public static /* synthetic */ ValidationRule copy$default(ValidationRule validationRule, String str, boolean z10, PropertiesHelper.Property property, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = validationRule.pattern;
        }
        if ((i10 & 2) != 0) {
            z10 = validationRule.validateOnType;
        }
        if ((i10 & 4) != 0) {
            property = validationRule.errorMessage;
        }
        return validationRule.copy(str, z10, property);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPattern() {
        return this.pattern;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getValidateOnType() {
        return this.validateOnType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PropertiesHelper.Property getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final ValidationRule copy(@NotNull String pattern, boolean validateOnType, @NotNull PropertiesHelper.Property errorMessage) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new ValidationRule(pattern, validateOnType, errorMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidationRule)) {
            return false;
        }
        ValidationRule validationRule = (ValidationRule) other;
        return Intrinsics.areEqual(this.pattern, validationRule.pattern) && this.validateOnType == validationRule.validateOnType && Intrinsics.areEqual(this.errorMessage, validationRule.errorMessage);
    }

    @NotNull
    public final PropertiesHelper.Property getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final String getPattern() {
        return this.pattern;
    }

    public final boolean getValidateOnType() {
        return this.validateOnType;
    }

    public int hashCode() {
        return this.errorMessage.hashCode() + (((this.pattern.hashCode() * 31) + (this.validateOnType ? 1231 : 1237)) * 31);
    }

    public final boolean isValid(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new Regex(this.pattern).matches(value);
    }

    @NotNull
    public String toString() {
        return "ValidationRule(pattern=" + this.pattern + ", validateOnType=" + this.validateOnType + ", errorMessage=" + this.errorMessage + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ValidationRule(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        Object obj = map.get("regex");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = map.get("validateOnType");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Object obj3 = map.get("errorMessage");
        PropertiesHelper.Property propertyAccess$toProperty = obj3 != null ? CellsEditTextConfigKt.access$toProperty(obj3) : null;
        Intrinsics.checkNotNull(propertyAccess$toProperty);
        this(str, zBooleanValue, propertyAccess$toProperty);
    }
}
