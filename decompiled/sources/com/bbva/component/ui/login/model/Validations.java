package com.bbva.component.ui.login.model;

import bk.q;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginCredentialsState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'B7\b\u0017\u0012\u0006\u0010(\u001a\u00020\u0016\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tJ\t\u0010\f\u001a\u00020\nHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001J\t\u0010\u0015\u001a\u00020\nHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006."}, d2 = {"Lcom/bbva/component/ui/login/model/Validations;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "", "toMap", "component1", "", "component2", "Lcom/bbva/component/ui/login/model/ResourceType;", "component3", "regex", "validateOnType", "errorMessage", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getRegex", "()Ljava/lang/String;", "b", "Z", "getValidateOnType", "()Z", "c", "Lcom/bbva/component/ui/login/model/ResourceType;", "getErrorMessage", "()Lcom/bbva/component/ui/login/model/ResourceType;", "<init>", "(Ljava/lang/String;ZLcom/bbva/component/ui/login/model/ResourceType;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLcom/bbva/component/ui/login/model/ResourceType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class Validations {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String regex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean validateOnType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ResourceType errorMessage;

    /* JADX INFO: compiled from: LoginCredentialsState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/login/model/Validations$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/login/model/Validations;", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Validations> serializer() {
            return Validations$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Validations(int i10, String str, boolean z10, ResourceType resourceType, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 7, Validations$$serializer.INSTANCE.getDescriptor());
        }
        this.regex = str;
        this.validateOnType = z10;
        this.errorMessage = resourceType;
    }

    public static /* synthetic */ Validations copy$default(Validations validations, String str, boolean z10, ResourceType resourceType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = validations.regex;
        }
        if ((i10 & 2) != 0) {
            z10 = validations.validateOnType;
        }
        if ((i10 & 4) != 0) {
            resourceType = validations.errorMessage;
        }
        return validations.copy(str, z10, resourceType);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(Validations self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.regex);
        output.encodeBooleanElement(serialDesc, 1, self.validateOnType);
        output.encodeSerializableElement(serialDesc, 2, ResourceType$$serializer.INSTANCE, self.errorMessage);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRegex() {
        return this.regex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getValidateOnType() {
        return this.validateOnType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ResourceType getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final Validations copy(@NotNull String regex, boolean validateOnType, @NotNull ResourceType errorMessage) {
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new Validations(regex, validateOnType, errorMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Validations)) {
            return false;
        }
        Validations validations = (Validations) other;
        return Intrinsics.areEqual(this.regex, validations.regex) && this.validateOnType == validations.validateOnType && Intrinsics.areEqual(this.errorMessage, validations.errorMessage);
    }

    @NotNull
    public final ResourceType getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final String getRegex() {
        return this.regex;
    }

    public final boolean getValidateOnType() {
        return this.validateOnType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        int iHashCode = this.regex.hashCode() * 31;
        boolean z10 = this.validateOnType;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return this.errorMessage.hashCode() + ((iHashCode + r1) * 31);
    }

    @NotNull
    public final Map<String, Object> toMap() {
        return q.mapOf(TuplesKt.to("regex", this.regex), TuplesKt.to("validateOnType", Boolean.valueOf(this.validateOnType)), TuplesKt.to("errorMessage", this.errorMessage.toMap()));
    }

    @NotNull
    public String toString() {
        return "Validations(regex=" + this.regex + ", validateOnType=" + this.validateOnType + ", errorMessage=" + this.errorMessage + ")";
    }

    public Validations(@NotNull String regex, boolean z10, @NotNull ResourceType errorMessage) {
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.regex = regex;
        this.validateOnType = z10;
        this.errorMessage = errorMessage;
    }
}
