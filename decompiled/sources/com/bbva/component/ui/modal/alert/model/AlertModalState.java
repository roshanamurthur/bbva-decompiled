package com.bbva.component.ui.modal.alert.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.component.ui.modal.halfmodal.model.ButtonConfig;
import com.bbva.component.ui.modal.halfmodal.model.ButtonConfig$$serializer;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AlertModalState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B)\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)BA\b\u0017\u0012\u0006\u0010*\u001a\u00020\u0016\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b(\u0010-J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000eHÆ\u0001J\t\u0010\u0015\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u00060"}, d2 = {"Lcom/bbva/component/ui/modal/alert/model/AlertModalState;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", "Lcom/bbva/component/ui/modal/halfmodal/model/ButtonConfig;", "component4", "cancelable", "title", "message", "button", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "getCancelable", "()Z", "b", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "c", "getMessage", "d", "Lcom/bbva/component/ui/modal/halfmodal/model/ButtonConfig;", "getButton", "()Lcom/bbva/component/ui/modal/halfmodal/model/ButtonConfig;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/bbva/component/ui/modal/halfmodal/model/ButtonConfig;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/String;Lcom/bbva/component/ui/modal/halfmodal/model/ButtonConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class AlertModalState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean cancelable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ButtonConfig button;

    /* JADX INFO: compiled from: AlertModalState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/modal/alert/model/AlertModalState$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/modal/alert/model/AlertModalState;", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<AlertModalState> serializer() {
            return AlertModalState$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ AlertModalState(int i10, boolean z10, String str, String str2, ButtonConfig buttonConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i10 & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 14, AlertModalState$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.cancelable = true;
        } else {
            this.cancelable = z10;
        }
        this.title = str;
        this.message = str2;
        this.button = buttonConfig;
    }

    public static /* synthetic */ AlertModalState copy$default(AlertModalState alertModalState, boolean z10, String str, String str2, ButtonConfig buttonConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = alertModalState.cancelable;
        }
        if ((i10 & 2) != 0) {
            str = alertModalState.title;
        }
        if ((i10 & 4) != 0) {
            str2 = alertModalState.message;
        }
        if ((i10 & 8) != 0) {
            buttonConfig = alertModalState.button;
        }
        return alertModalState.copy(z10, str, str2, buttonConfig);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(AlertModalState self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !self.cancelable) {
            output.encodeBooleanElement(serialDesc, 0, self.cancelable);
        }
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.message);
        output.encodeSerializableElement(serialDesc, 3, ButtonConfig$$serializer.INSTANCE, self.button);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCancelable() {
        return this.cancelable;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ButtonConfig getButton() {
        return this.button;
    }

    @NotNull
    public final AlertModalState copy(boolean cancelable, @NotNull String title, @NotNull String message, @NotNull ButtonConfig button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(button, "button");
        return new AlertModalState(cancelable, title, message, button);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertModalState)) {
            return false;
        }
        AlertModalState alertModalState = (AlertModalState) other;
        return this.cancelable == alertModalState.cancelable && Intrinsics.areEqual(this.title, alertModalState.title) && Intrinsics.areEqual(this.message, alertModalState.message) && Intrinsics.areEqual(this.button, alertModalState.button);
    }

    @NotNull
    public final ButtonConfig getButton() {
        return this.button;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public int hashCode() {
        boolean z10 = this.cancelable;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return this.button.hashCode() + n1.c(this.message, n1.c(this.title, r1 * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "AlertModalState(cancelable=" + this.cancelable + ", title=" + this.title + ", message=" + this.message + ", button=" + this.button + ")";
    }

    public AlertModalState(boolean z10, @NotNull String title, @NotNull String message, @NotNull ButtonConfig button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(button, "button");
        this.cancelable = z10;
        this.title = title;
        this.message = message;
        this.button = button;
    }

    public /* synthetic */ AlertModalState(boolean z10, String str, String str2, ButtonConfig buttonConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, str, str2, buttonConfig);
    }
}
