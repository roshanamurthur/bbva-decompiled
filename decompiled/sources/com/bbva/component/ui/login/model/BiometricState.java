package com.bbva.component.ui.login.model;

import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.cells.componentkit.model.dsl.TextSettings$$serializer;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RememberedUserState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B+\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b#\u0010$B9\b\u0017\u0012\u0006\u0010%\u001a\u00020\u0014\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b#\u0010(J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006+"}, d2 = {"Lcom/bbva/component/ui/login/model/BiometricState;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/bbva/component/ui/login/model/Button;", "component1", "component2", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "component3", "primaryButton", "secondaryButton", "accessingBiometricsMessage", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/component/ui/login/model/Button;", "getPrimaryButton", "()Lcom/bbva/component/ui/login/model/Button;", "b", "getSecondaryButton", "c", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "getAccessingBiometricsMessage", "()Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "<init>", "(Lcom/bbva/component/ui/login/model/Button;Lcom/bbva/component/ui/login/model/Button;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/component/ui/login/model/Button;Lcom/bbva/component/ui/login/model/Button;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class BiometricState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Button primaryButton;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Button secondaryButton;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final TextSettings accessingBiometricsMessage;

    /* JADX INFO: compiled from: RememberedUserState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/login/model/BiometricState$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/login/model/BiometricState;", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<BiometricState> serializer() {
            return BiometricState$$serializer.INSTANCE;
        }
    }

    public BiometricState() {
        this((Button) null, (Button) null, (TextSettings) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BiometricState copy$default(BiometricState biometricState, Button button, Button button2, TextSettings textSettings, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            button = biometricState.primaryButton;
        }
        if ((i10 & 2) != 0) {
            button2 = biometricState.secondaryButton;
        }
        if ((i10 & 4) != 0) {
            textSettings = biometricState.accessingBiometricsMessage;
        }
        return biometricState.copy(button, button2, textSettings);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(BiometricState self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.primaryButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, Button$$serializer.INSTANCE, self.primaryButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.secondaryButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, Button$$serializer.INSTANCE, self.secondaryButton);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.accessingBiometricsMessage == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, TextSettings$$serializer.INSTANCE, self.accessingBiometricsMessage);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Button getPrimaryButton() {
        return this.primaryButton;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Button getSecondaryButton() {
        return this.secondaryButton;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextSettings getAccessingBiometricsMessage() {
        return this.accessingBiometricsMessage;
    }

    @NotNull
    public final BiometricState copy(@Nullable Button primaryButton, @Nullable Button secondaryButton, @Nullable TextSettings accessingBiometricsMessage) {
        return new BiometricState(primaryButton, secondaryButton, accessingBiometricsMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricState)) {
            return false;
        }
        BiometricState biometricState = (BiometricState) other;
        return Intrinsics.areEqual(this.primaryButton, biometricState.primaryButton) && Intrinsics.areEqual(this.secondaryButton, biometricState.secondaryButton) && Intrinsics.areEqual(this.accessingBiometricsMessage, biometricState.accessingBiometricsMessage);
    }

    @Nullable
    public final TextSettings getAccessingBiometricsMessage() {
        return this.accessingBiometricsMessage;
    }

    @Nullable
    public final Button getPrimaryButton() {
        return this.primaryButton;
    }

    @Nullable
    public final Button getSecondaryButton() {
        return this.secondaryButton;
    }

    public int hashCode() {
        Button button = this.primaryButton;
        int iHashCode = (button == null ? 0 : button.hashCode()) * 31;
        Button button2 = this.secondaryButton;
        int iHashCode2 = (iHashCode + (button2 == null ? 0 : button2.hashCode())) * 31;
        TextSettings textSettings = this.accessingBiometricsMessage;
        return iHashCode2 + (textSettings != null ? textSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BiometricState(primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ", accessingBiometricsMessage=" + this.accessingBiometricsMessage + ")";
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ BiometricState(int i10, Button button, Button button2, TextSettings textSettings, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.primaryButton = null;
        } else {
            this.primaryButton = button;
        }
        if ((i10 & 2) == 0) {
            this.secondaryButton = null;
        } else {
            this.secondaryButton = button2;
        }
        if ((i10 & 4) == 0) {
            this.accessingBiometricsMessage = null;
        } else {
            this.accessingBiometricsMessage = textSettings;
        }
    }

    public BiometricState(@Nullable Button button, @Nullable Button button2, @Nullable TextSettings textSettings) {
        this.primaryButton = button;
        this.secondaryButton = button2;
        this.accessingBiometricsMessage = textSettings;
    }

    public /* synthetic */ BiometricState(Button button, Button button2, TextSettings textSettings, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : button, (i10 & 2) != 0 ? null : button2, (i10 & 4) != 0 ? null : textSettings);
    }
}
