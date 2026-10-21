package com.bbva.component.ui.login.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginCredentialsState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b'\u0010(B9\b\u0017\u0012\u0006\u0010)\u001a\u00020\u0015\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b'\u0010,J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\rHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006/"}, d2 = {"Lcom/bbva/component/ui/login/model/DocumentSelector;", "Lcom/bbva/component/ui/login/model/InputForm;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/bbva/component/ui/login/model/ResourceType;", "component1", "Lcom/bbva/component/ui/login/model/InputFieldIdentifier;", "component2", "Lcom/bbva/component/ui/login/model/DocumentListConfig;", "component3", "title", "inputFieldIdentifier", "documentListConfig", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/component/ui/login/model/ResourceType;", "getTitle", "()Lcom/bbva/component/ui/login/model/ResourceType;", "b", "Lcom/bbva/component/ui/login/model/InputFieldIdentifier;", "getInputFieldIdentifier", "()Lcom/bbva/component/ui/login/model/InputFieldIdentifier;", "c", "Lcom/bbva/component/ui/login/model/DocumentListConfig;", "getDocumentListConfig", "()Lcom/bbva/component/ui/login/model/DocumentListConfig;", "<init>", "(Lcom/bbva/component/ui/login/model/ResourceType;Lcom/bbva/component/ui/login/model/InputFieldIdentifier;Lcom/bbva/component/ui/login/model/DocumentListConfig;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/component/ui/login/model/ResourceType;Lcom/bbva/component/ui/login/model/InputFieldIdentifier;Lcom/bbva/component/ui/login/model/DocumentListConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class DocumentSelector implements InputForm {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final KSerializer<Object>[] f28531d = {null, EnumsKt.createSimpleEnumSerializer("com.bbva.component.ui.login.model.InputFieldIdentifier", InputFieldIdentifier.values()), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ResourceType title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InputFieldIdentifier inputFieldIdentifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DocumentListConfig documentListConfig;

    /* JADX INFO: compiled from: LoginCredentialsState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/login/model/DocumentSelector$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/login/model/DocumentSelector;", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<DocumentSelector> serializer() {
            return DocumentSelector$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DocumentSelector(int i10, ResourceType resourceType, InputFieldIdentifier inputFieldIdentifier, DocumentListConfig documentListConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 7, DocumentSelector$$serializer.INSTANCE.getDescriptor());
        }
        this.title = resourceType;
        this.inputFieldIdentifier = inputFieldIdentifier;
        this.documentListConfig = documentListConfig;
    }

    public static /* synthetic */ DocumentSelector copy$default(DocumentSelector documentSelector, ResourceType resourceType, InputFieldIdentifier inputFieldIdentifier, DocumentListConfig documentListConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            resourceType = documentSelector.title;
        }
        if ((i10 & 2) != 0) {
            inputFieldIdentifier = documentSelector.inputFieldIdentifier;
        }
        if ((i10 & 4) != 0) {
            documentListConfig = documentSelector.documentListConfig;
        }
        return documentSelector.copy(resourceType, inputFieldIdentifier, documentListConfig);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(DocumentSelector self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, ResourceType$$serializer.INSTANCE, self.title);
        output.encodeSerializableElement(serialDesc, 1, f28531d[1], self.getInputFieldIdentifier());
        output.encodeSerializableElement(serialDesc, 2, DocumentListConfig$$serializer.INSTANCE, self.documentListConfig);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ResourceType getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InputFieldIdentifier getInputFieldIdentifier() {
        return this.inputFieldIdentifier;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DocumentListConfig getDocumentListConfig() {
        return this.documentListConfig;
    }

    @NotNull
    public final DocumentSelector copy(@NotNull ResourceType title, @NotNull InputFieldIdentifier inputFieldIdentifier, @NotNull DocumentListConfig documentListConfig) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inputFieldIdentifier, "inputFieldIdentifier");
        Intrinsics.checkNotNullParameter(documentListConfig, "documentListConfig");
        return new DocumentSelector(title, inputFieldIdentifier, documentListConfig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentSelector)) {
            return false;
        }
        DocumentSelector documentSelector = (DocumentSelector) other;
        return Intrinsics.areEqual(this.title, documentSelector.title) && this.inputFieldIdentifier == documentSelector.inputFieldIdentifier && Intrinsics.areEqual(this.documentListConfig, documentSelector.documentListConfig);
    }

    @NotNull
    public final DocumentListConfig getDocumentListConfig() {
        return this.documentListConfig;
    }

    @Override // com.bbva.component.ui.login.model.InputForm
    @NotNull
    public InputFieldIdentifier getInputFieldIdentifier() {
        return this.inputFieldIdentifier;
    }

    @NotNull
    public final ResourceType getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.documentListConfig.hashCode() + ((this.inputFieldIdentifier.hashCode() + (this.title.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "DocumentSelector(title=" + this.title + ", inputFieldIdentifier=" + this.inputFieldIdentifier + ", documentListConfig=" + this.documentListConfig + ")";
    }

    public DocumentSelector(@NotNull ResourceType title, @NotNull InputFieldIdentifier inputFieldIdentifier, @NotNull DocumentListConfig documentListConfig) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inputFieldIdentifier, "inputFieldIdentifier");
        Intrinsics.checkNotNullParameter(documentListConfig, "documentListConfig");
        this.title = title;
        this.inputFieldIdentifier = inputFieldIdentifier;
        this.documentListConfig = documentListConfig;
    }
}
