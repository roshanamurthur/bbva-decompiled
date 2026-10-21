package com.bbva.component.ui.login.model;

import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.cells.componentkit.model.dsl.TextSettings$$serializer;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
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

/* JADX INFO: compiled from: RememberedUserState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLB]\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\bF\u0010GBk\b\u0017\u0012\u0006\u0010H\u001a\u00020#\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bF\u0010KJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0016HÆ\u0003Je\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u0016HÆ\u0001J\t\u0010\"\u001a\u00020!HÖ\u0001J\t\u0010$\u001a\u00020#HÖ\u0001J\u0013\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0019\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u001f\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006N"}, d2 = {"Lcom/bbva/component/ui/login/model/RememberedUserState;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/bbva/component/ui/login/model/RememberedUserImage;", "component1", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "component2", "component3", "Lcom/bbva/component/ui/login/model/InputFieldConfig;", "component4", "Lcom/bbva/component/ui/login/model/ButtonLink;", "component5", "Lcom/bbva/component/ui/login/model/Button;", "component6", "Lcom/bbva/component/ui/login/model/BiometricState;", "component7", "Lcom/bbva/component/ui/login/model/RememberedUserType;", "component8", AuthConstants.IMAGE, "greeting", "userName", "passwordInputFieldConfig", "rememberPassword", "primaryButton", "biometricState", "rememberedUserType", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/component/ui/login/model/RememberedUserImage;", "getImage", "()Lcom/bbva/component/ui/login/model/RememberedUserImage;", "b", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "getGreeting", "()Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "c", "getUserName", "d", "Lcom/bbva/component/ui/login/model/InputFieldConfig;", "getPasswordInputFieldConfig", "()Lcom/bbva/component/ui/login/model/InputFieldConfig;", "e", "Lcom/bbva/component/ui/login/model/ButtonLink;", "getRememberPassword", "()Lcom/bbva/component/ui/login/model/ButtonLink;", "f", "Lcom/bbva/component/ui/login/model/Button;", "getPrimaryButton", "()Lcom/bbva/component/ui/login/model/Button;", "g", "Lcom/bbva/component/ui/login/model/BiometricState;", "getBiometricState", "()Lcom/bbva/component/ui/login/model/BiometricState;", "h", "Lcom/bbva/component/ui/login/model/RememberedUserType;", "getRememberedUserType", "()Lcom/bbva/component/ui/login/model/RememberedUserType;", "<init>", "(Lcom/bbva/component/ui/login/model/RememberedUserImage;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;Lcom/bbva/component/ui/login/model/InputFieldConfig;Lcom/bbva/component/ui/login/model/ButtonLink;Lcom/bbva/component/ui/login/model/Button;Lcom/bbva/component/ui/login/model/BiometricState;Lcom/bbva/component/ui/login/model/RememberedUserType;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/component/ui/login/model/RememberedUserImage;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;Lcom/bbva/component/ui/login/model/InputFieldConfig;Lcom/bbva/component/ui/login/model/ButtonLink;Lcom/bbva/component/ui/login/model/Button;Lcom/bbva/component/ui/login/model/BiometricState;Lcom/bbva/component/ui/login/model/RememberedUserType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class RememberedUserState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final KSerializer<Object>[] f28573i = {null, null, null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.bbva.component.ui.login.model.RememberedUserType", RememberedUserType.values())};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final RememberedUserImage image;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextSettings greeting;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final TextSettings userName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final InputFieldConfig passwordInputFieldConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ButtonLink rememberPassword;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Button primaryButton;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final BiometricState biometricState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RememberedUserType rememberedUserType;

    /* JADX INFO: compiled from: RememberedUserState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/login/model/RememberedUserState$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/login/model/RememberedUserState;", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<RememberedUserState> serializer() {
            return RememberedUserState$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ RememberedUserState(int i10, RememberedUserImage rememberedUserImage, TextSettings textSettings, TextSettings textSettings2, InputFieldConfig inputFieldConfig, ButtonLink buttonLink, Button button, BiometricState biometricState, RememberedUserType rememberedUserType, SerializationConstructorMarker serializationConstructorMarker) {
        if (131 != (i10 & 131)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 131, RememberedUserState$$serializer.INSTANCE.getDescriptor());
        }
        this.image = rememberedUserImage;
        this.greeting = textSettings;
        if ((i10 & 4) == 0) {
            this.userName = null;
        } else {
            this.userName = textSettings2;
        }
        if ((i10 & 8) == 0) {
            this.passwordInputFieldConfig = null;
        } else {
            this.passwordInputFieldConfig = inputFieldConfig;
        }
        if ((i10 & 16) == 0) {
            this.rememberPassword = null;
        } else {
            this.rememberPassword = buttonLink;
        }
        if ((i10 & 32) == 0) {
            this.primaryButton = null;
        } else {
            this.primaryButton = button;
        }
        if ((i10 & 64) == 0) {
            this.biometricState = null;
        } else {
            this.biometricState = biometricState;
        }
        this.rememberedUserType = rememberedUserType;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(RememberedUserState self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, RememberedUserImage$$serializer.INSTANCE, self.image);
        TextSettings$$serializer textSettings$$serializer = TextSettings$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 1, textSettings$$serializer, self.greeting);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 2);
        TextSettings textSettings = self.userName;
        if (zShouldEncodeElementDefault || textSettings != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, textSettings$$serializer, textSettings);
        }
        boolean zShouldEncodeElementDefault2 = output.shouldEncodeElementDefault(serialDesc, 3);
        InputFieldConfig inputFieldConfig = self.passwordInputFieldConfig;
        if (zShouldEncodeElementDefault2 || inputFieldConfig != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, InputFieldConfig$$serializer.INSTANCE, inputFieldConfig);
        }
        boolean zShouldEncodeElementDefault3 = output.shouldEncodeElementDefault(serialDesc, 4);
        ButtonLink buttonLink = self.rememberPassword;
        if (zShouldEncodeElementDefault3 || buttonLink != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, ButtonLink$$serializer.INSTANCE, buttonLink);
        }
        boolean zShouldEncodeElementDefault4 = output.shouldEncodeElementDefault(serialDesc, 5);
        Button button = self.primaryButton;
        if (zShouldEncodeElementDefault4 || button != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, Button$$serializer.INSTANCE, button);
        }
        boolean zShouldEncodeElementDefault5 = output.shouldEncodeElementDefault(serialDesc, 6);
        BiometricState biometricState = self.biometricState;
        if (zShouldEncodeElementDefault5 || biometricState != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, BiometricState$$serializer.INSTANCE, biometricState);
        }
        output.encodeSerializableElement(serialDesc, 7, f28573i[7], self.rememberedUserType);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RememberedUserImage getImage() {
        return this.image;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextSettings getGreeting() {
        return this.greeting;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextSettings getUserName() {
        return this.userName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final InputFieldConfig getPasswordInputFieldConfig() {
        return this.passwordInputFieldConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ButtonLink getRememberPassword() {
        return this.rememberPassword;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Button getPrimaryButton() {
        return this.primaryButton;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BiometricState getBiometricState() {
        return this.biometricState;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final RememberedUserType getRememberedUserType() {
        return this.rememberedUserType;
    }

    @NotNull
    public final RememberedUserState copy(@Nullable RememberedUserImage image, @NotNull TextSettings greeting, @Nullable TextSettings userName, @Nullable InputFieldConfig passwordInputFieldConfig, @Nullable ButtonLink rememberPassword, @Nullable Button primaryButton, @Nullable BiometricState biometricState, @NotNull RememberedUserType rememberedUserType) {
        Intrinsics.checkNotNullParameter(greeting, "greeting");
        Intrinsics.checkNotNullParameter(rememberedUserType, "rememberedUserType");
        return new RememberedUserState(image, greeting, userName, passwordInputFieldConfig, rememberPassword, primaryButton, biometricState, rememberedUserType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RememberedUserState)) {
            return false;
        }
        RememberedUserState rememberedUserState = (RememberedUserState) other;
        return Intrinsics.areEqual(this.image, rememberedUserState.image) && Intrinsics.areEqual(this.greeting, rememberedUserState.greeting) && Intrinsics.areEqual(this.userName, rememberedUserState.userName) && Intrinsics.areEqual(this.passwordInputFieldConfig, rememberedUserState.passwordInputFieldConfig) && Intrinsics.areEqual(this.rememberPassword, rememberedUserState.rememberPassword) && Intrinsics.areEqual(this.primaryButton, rememberedUserState.primaryButton) && Intrinsics.areEqual(this.biometricState, rememberedUserState.biometricState) && this.rememberedUserType == rememberedUserState.rememberedUserType;
    }

    @Nullable
    public final BiometricState getBiometricState() {
        return this.biometricState;
    }

    @NotNull
    public final TextSettings getGreeting() {
        return this.greeting;
    }

    @Nullable
    public final RememberedUserImage getImage() {
        return this.image;
    }

    @Nullable
    public final InputFieldConfig getPasswordInputFieldConfig() {
        return this.passwordInputFieldConfig;
    }

    @Nullable
    public final Button getPrimaryButton() {
        return this.primaryButton;
    }

    @Nullable
    public final ButtonLink getRememberPassword() {
        return this.rememberPassword;
    }

    @NotNull
    public final RememberedUserType getRememberedUserType() {
        return this.rememberedUserType;
    }

    @Nullable
    public final TextSettings getUserName() {
        return this.userName;
    }

    public int hashCode() {
        RememberedUserImage rememberedUserImage = this.image;
        int iHashCode = (this.greeting.hashCode() + ((rememberedUserImage == null ? 0 : rememberedUserImage.hashCode()) * 31)) * 31;
        TextSettings textSettings = this.userName;
        int iHashCode2 = (iHashCode + (textSettings == null ? 0 : textSettings.hashCode())) * 31;
        InputFieldConfig inputFieldConfig = this.passwordInputFieldConfig;
        int iHashCode3 = (iHashCode2 + (inputFieldConfig == null ? 0 : inputFieldConfig.hashCode())) * 31;
        ButtonLink buttonLink = this.rememberPassword;
        int iHashCode4 = (iHashCode3 + (buttonLink == null ? 0 : buttonLink.hashCode())) * 31;
        Button button = this.primaryButton;
        int iHashCode5 = (iHashCode4 + (button == null ? 0 : button.hashCode())) * 31;
        BiometricState biometricState = this.biometricState;
        return this.rememberedUserType.hashCode() + ((iHashCode5 + (biometricState != null ? biometricState.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "RememberedUserState(image=" + this.image + ", greeting=" + this.greeting + ", userName=" + this.userName + ", passwordInputFieldConfig=" + this.passwordInputFieldConfig + ", rememberPassword=" + this.rememberPassword + ", primaryButton=" + this.primaryButton + ", biometricState=" + this.biometricState + ", rememberedUserType=" + this.rememberedUserType + ")";
    }

    public RememberedUserState(@Nullable RememberedUserImage rememberedUserImage, @NotNull TextSettings greeting, @Nullable TextSettings textSettings, @Nullable InputFieldConfig inputFieldConfig, @Nullable ButtonLink buttonLink, @Nullable Button button, @Nullable BiometricState biometricState, @NotNull RememberedUserType rememberedUserType) {
        Intrinsics.checkNotNullParameter(greeting, "greeting");
        Intrinsics.checkNotNullParameter(rememberedUserType, "rememberedUserType");
        this.image = rememberedUserImage;
        this.greeting = greeting;
        this.userName = textSettings;
        this.passwordInputFieldConfig = inputFieldConfig;
        this.rememberPassword = buttonLink;
        this.primaryButton = button;
        this.biometricState = biometricState;
        this.rememberedUserType = rememberedUserType;
    }

    public /* synthetic */ RememberedUserState(RememberedUserImage rememberedUserImage, TextSettings textSettings, TextSettings textSettings2, InputFieldConfig inputFieldConfig, ButtonLink buttonLink, Button button, BiometricState biometricState, RememberedUserType rememberedUserType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(rememberedUserImage, textSettings, (i10 & 4) != 0 ? null : textSettings2, (i10 & 8) != 0 ? null : inputFieldConfig, (i10 & 16) != 0 ? null : buttonLink, (i10 & 32) != 0 ? null : button, (i10 & 64) != 0 ? null : biometricState, rememberedUserType);
    }
}
