package com.bbva.component.ui.login.model;

import androidx.appcompat.app.i;
import androidx.camera.camera2.internal.n1;
import bk.q;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.nativesettings.common.Constants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginCredentialsState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0002VUBo\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\n\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010 \u001a\u00020\n¢\u0006\u0004\bO\u0010PB\u007f\b\u0017\u0012\u0006\u0010Q\u001a\u00020\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0019\u001a\u00020\n\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010 \u001a\u00020\n\u0012\b\u0010S\u001a\u0004\u0018\u00010R¢\u0006\u0004\bO\u0010TJ\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010\u0016\u001a\u00020\nHÆ\u0003J{\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\r2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010 \u001a\u00020\nHÆ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\rHÖ\u0001J\u0013\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0004HÖ\u0003J!\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)HÇ\u0001R\u001a\u0010\u0017\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0019\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u001a\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u001b\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bA\u0010:\u001a\u0004\bB\u0010<R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bC\u0010:\u001a\u0004\bD\u0010<R\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010 \u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bM\u00106\u001a\u0004\bN\u00108¨\u0006W"}, d2 = {"Lcom/bbva/component/ui/login/model/InputFieldConfig;", "Lcom/bbva/component/ui/login/model/InputForm;", "", "", "", "toMap", "Lcom/bbva/component/ui/login/model/InputFieldIdentifier;", "component1", "Lcom/bbva/component/ui/login/model/ResourceType;", "component2", "", "component3", "component4", "", "component5", "component6", "component7", "", "Lcom/bbva/component/ui/login/model/Validations;", "component8", "Lcom/bbva/component/ui/login/model/Accessibility;", "component9", "component10", "inputFieldIdentifier", "hint", "showLeftIcon", "inputType", "maxLength", "mask", "customCharactersRegex", "validations", Constants.ACCESSIBILITY, "hasFocus", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "a", "Lcom/bbva/component/ui/login/model/InputFieldIdentifier;", "getInputFieldIdentifier", "()Lcom/bbva/component/ui/login/model/InputFieldIdentifier;", "b", "Lcom/bbva/component/ui/login/model/ResourceType;", "getHint", "()Lcom/bbva/component/ui/login/model/ResourceType;", "c", "Z", "getShowLeftIcon", "()Z", "d", "Ljava/lang/String;", "getInputType", "()Ljava/lang/String;", "e", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMaxLength", "()I", "f", "getMask", "g", "getCustomCharactersRegex", "h", "Ljava/util/List;", "getValidations", "()Ljava/util/List;", "i", "Lcom/bbva/component/ui/login/model/Accessibility;", "getAccessibility", "()Lcom/bbva/component/ui/login/model/Accessibility;", "j", "getHasFocus", "<init>", "(Lcom/bbva/component/ui/login/model/InputFieldIdentifier;Lcom/bbva/component/ui/login/model/ResourceType;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/bbva/component/ui/login/model/Accessibility;Z)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/component/ui/login/model/InputFieldIdentifier;Lcom/bbva/component/ui/login/model/ResourceType;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/bbva/component/ui/login/model/Accessibility;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@Serializable
@SourceDebugExtension({"SMAP\nLoginCredentialsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginCredentialsState.kt\ncom/bbva/component/ui/login/model/InputFieldConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,119:1\n1549#2:120\n1620#2,3:121\n*S KotlinDebug\n*F\n+ 1 LoginCredentialsState.kt\ncom/bbva/component/ui/login/model/InputFieldConfig\n*L\n76#1:120\n76#1:121,3\n*E\n"})
public final /* data */ class InputFieldConfig implements InputForm {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final KSerializer<Object>[] f28536k = {EnumsKt.createSimpleEnumSerializer("com.bbva.component.ui.login.model.InputFieldIdentifier", InputFieldIdentifier.values()), null, null, null, null, null, null, new ArrayListSerializer(Validations$$serializer.INSTANCE), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InputFieldIdentifier inputFieldIdentifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ResourceType hint;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean showLeftIcon;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String inputType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int maxLength;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String mask;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String customCharactersRegex;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<Validations> validations;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Accessibility accessibility;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final boolean hasFocus;

    /* JADX INFO: compiled from: LoginCredentialsState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/login/model/InputFieldConfig$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/login/model/InputFieldConfig;", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<InputFieldConfig> serializer() {
            return InputFieldConfig$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ InputFieldConfig(int i10, InputFieldIdentifier inputFieldIdentifier, ResourceType resourceType, boolean z10, String str, int i11, String str2, String str3, List list, Accessibility accessibility, boolean z11, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i10 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 31, InputFieldConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.inputFieldIdentifier = inputFieldIdentifier;
        this.hint = resourceType;
        this.showLeftIcon = z10;
        this.inputType = str;
        this.maxLength = i11;
        if ((i10 & 32) == 0) {
            this.mask = null;
        } else {
            this.mask = str2;
        }
        if ((i10 & 64) == 0) {
            this.customCharactersRegex = null;
        } else {
            this.customCharactersRegex = str3;
        }
        if ((i10 & 128) == 0) {
            this.validations = CollectionsKt__CollectionsKt.emptyList();
        } else {
            this.validations = list;
        }
        if ((i10 & 256) == 0) {
            this.accessibility = null;
        } else {
            this.accessibility = accessibility;
        }
        if ((i10 & 512) == 0) {
            this.hasFocus = false;
        } else {
            this.hasFocus = z11;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(InputFieldConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = f28536k;
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.getInputFieldIdentifier());
        output.encodeSerializableElement(serialDesc, 1, ResourceType$$serializer.INSTANCE, self.hint);
        output.encodeBooleanElement(serialDesc, 2, self.showLeftIcon);
        output.encodeStringElement(serialDesc, 3, self.inputType);
        output.encodeIntElement(serialDesc, 4, self.maxLength);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 5);
        String str = self.mask;
        if (zShouldEncodeElementDefault || str != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str);
        }
        boolean zShouldEncodeElementDefault2 = output.shouldEncodeElementDefault(serialDesc, 6);
        String str2 = self.customCharactersRegex;
        if (zShouldEncodeElementDefault2 || str2 != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str2);
        }
        boolean zShouldEncodeElementDefault3 = output.shouldEncodeElementDefault(serialDesc, 7);
        List<Validations> list = self.validations;
        if (zShouldEncodeElementDefault3 || !Intrinsics.areEqual(list, CollectionsKt__CollectionsKt.emptyList())) {
            output.encodeNullableSerializableElement(serialDesc, 7, kSerializerArr[7], list);
        }
        boolean zShouldEncodeElementDefault4 = output.shouldEncodeElementDefault(serialDesc, 8);
        Accessibility accessibility = self.accessibility;
        if (zShouldEncodeElementDefault4 || accessibility != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, Accessibility$$serializer.INSTANCE, accessibility);
        }
        boolean zShouldEncodeElementDefault5 = output.shouldEncodeElementDefault(serialDesc, 9);
        boolean z10 = self.hasFocus;
        if (zShouldEncodeElementDefault5 || z10) {
            output.encodeBooleanElement(serialDesc, 9, z10);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final InputFieldIdentifier getInputFieldIdentifier() {
        return this.inputFieldIdentifier;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getHasFocus() {
        return this.hasFocus;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ResourceType getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowLeftIcon() {
        return this.showLeftIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInputType() {
        return this.inputType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaxLength() {
        return this.maxLength;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMask() {
        return this.mask;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCustomCharactersRegex() {
        return this.customCharactersRegex;
    }

    @Nullable
    public final List<Validations> component8() {
        return this.validations;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Accessibility getAccessibility() {
        return this.accessibility;
    }

    @NotNull
    public final InputFieldConfig copy(@NotNull InputFieldIdentifier inputFieldIdentifier, @NotNull ResourceType hint, boolean showLeftIcon, @NotNull String inputType, int maxLength, @Nullable String mask, @Nullable String customCharactersRegex, @Nullable List<Validations> validations, @Nullable Accessibility accessibility, boolean hasFocus) {
        Intrinsics.checkNotNullParameter(inputFieldIdentifier, "inputFieldIdentifier");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        return new InputFieldConfig(inputFieldIdentifier, hint, showLeftIcon, inputType, maxLength, mask, customCharactersRegex, validations, accessibility, hasFocus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputFieldConfig)) {
            return false;
        }
        InputFieldConfig inputFieldConfig = (InputFieldConfig) other;
        return this.inputFieldIdentifier == inputFieldConfig.inputFieldIdentifier && Intrinsics.areEqual(this.hint, inputFieldConfig.hint) && this.showLeftIcon == inputFieldConfig.showLeftIcon && Intrinsics.areEqual(this.inputType, inputFieldConfig.inputType) && this.maxLength == inputFieldConfig.maxLength && Intrinsics.areEqual(this.mask, inputFieldConfig.mask) && Intrinsics.areEqual(this.customCharactersRegex, inputFieldConfig.customCharactersRegex) && Intrinsics.areEqual(this.validations, inputFieldConfig.validations) && Intrinsics.areEqual(this.accessibility, inputFieldConfig.accessibility) && this.hasFocus == inputFieldConfig.hasFocus;
    }

    @Nullable
    public final Accessibility getAccessibility() {
        return this.accessibility;
    }

    @Nullable
    public final String getCustomCharactersRegex() {
        return this.customCharactersRegex;
    }

    public final boolean getHasFocus() {
        return this.hasFocus;
    }

    @NotNull
    public final ResourceType getHint() {
        return this.hint;
    }

    @Override // com.bbva.component.ui.login.model.InputForm
    @NotNull
    public InputFieldIdentifier getInputFieldIdentifier() {
        return this.inputFieldIdentifier;
    }

    @NotNull
    public final String getInputType() {
        return this.inputType;
    }

    @Nullable
    public final String getMask() {
        return this.mask;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final boolean getShowLeftIcon() {
        return this.showLeftIcon;
    }

    @Nullable
    public final List<Validations> getValidations() {
        return this.validations;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public int hashCode() {
        int iHashCode = (this.hint.hashCode() + (this.inputFieldIdentifier.hashCode() * 31)) * 31;
        boolean z10 = this.showLeftIcon;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int iC = (n1.c(this.inputType, (iHashCode + r3) * 31, 31) + this.maxLength) * 31;
        String str = this.mask;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customCharactersRegex;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Validations> list = this.validations;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Accessibility accessibility = this.accessibility;
        int iHashCode5 = (iHashCode4 + (accessibility != null ? accessibility.hashCode() : 0)) * 31;
        boolean z11 = this.hasFocus;
        return iHashCode5 + (z11 ? 1 : z11);
    }

    @NotNull
    public final Map<String, Object> toMap() {
        ArrayList arrayList;
        Pair[] pairArr = new Pair[8];
        pairArr[0] = TuplesKt.to("hint", this.hint.toMap());
        pairArr[1] = TuplesKt.to("showLeftIcon", Boolean.valueOf(this.showLeftIcon));
        pairArr[2] = TuplesKt.to("inputType", this.inputType);
        pairArr[3] = TuplesKt.to("maxLength", Integer.valueOf(this.maxLength));
        pairArr[4] = TuplesKt.to("mask", this.mask);
        pairArr[5] = TuplesKt.to("customCharactersRegex", this.customCharactersRegex);
        List<Validations> list = this.validations;
        if (list != null) {
            List<Validations> list2 = list;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Validations) it.next()).toMap());
            }
        } else {
            arrayList = null;
        }
        pairArr[6] = TuplesKt.to("validations", arrayList);
        Accessibility accessibility = this.accessibility;
        pairArr[7] = TuplesKt.to(Constants.ACCESSIBILITY, accessibility != null ? accessibility.toMap() : null);
        return q.mapOf(pairArr);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InputFieldConfig(inputFieldIdentifier=");
        sb2.append(this.inputFieldIdentifier);
        sb2.append(", hint=");
        sb2.append(this.hint);
        sb2.append(", showLeftIcon=");
        sb2.append(this.showLeftIcon);
        sb2.append(", inputType=");
        sb2.append(this.inputType);
        sb2.append(", maxLength=");
        sb2.append(this.maxLength);
        sb2.append(", mask=");
        sb2.append(this.mask);
        sb2.append(", customCharactersRegex=");
        sb2.append(this.customCharactersRegex);
        sb2.append(", validations=");
        sb2.append(this.validations);
        sb2.append(", accessibility=");
        sb2.append(this.accessibility);
        sb2.append(", hasFocus=");
        return i.c(sb2, this.hasFocus, ")");
    }

    public InputFieldConfig(@NotNull InputFieldIdentifier inputFieldIdentifier, @NotNull ResourceType hint, boolean z10, @NotNull String inputType, int i10, @Nullable String str, @Nullable String str2, @Nullable List<Validations> list, @Nullable Accessibility accessibility, boolean z11) {
        Intrinsics.checkNotNullParameter(inputFieldIdentifier, "inputFieldIdentifier");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        this.inputFieldIdentifier = inputFieldIdentifier;
        this.hint = hint;
        this.showLeftIcon = z10;
        this.inputType = inputType;
        this.maxLength = i10;
        this.mask = str;
        this.customCharactersRegex = str2;
        this.validations = list;
        this.accessibility = accessibility;
        this.hasFocus = z11;
    }

    public /* synthetic */ InputFieldConfig(InputFieldIdentifier inputFieldIdentifier, ResourceType resourceType, boolean z10, String str, int i10, String str2, String str3, List list, Accessibility accessibility, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(inputFieldIdentifier, resourceType, z10, str, i10, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i11 & 256) != 0 ? null : accessibility, (i11 & 512) != 0 ? false : z11);
    }
}
