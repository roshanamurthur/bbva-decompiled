package com.bbva.component.ui.login.model;

import com.bbva.cells.componentkit.model.dsl.Resource;
import com.bbva.cells.componentkit.model.dsl.Resource$$serializer;
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

/* JADX INFO: compiled from: LoginCredentialsState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0019\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fB-\b\u0017\u0012\u0006\u0010 \u001a\u00020\u0012\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006&"}, d2 = {"Lcom/bbva/component/ui/login/model/ButtonLink;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/bbva/cells/componentkit/model/dsl/Resource;", "component1", "", "component2", "text", "visibility", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Lcom/bbva/cells/componentkit/model/dsl/Resource;", "getText", "()Lcom/bbva/cells/componentkit/model/dsl/Resource;", "b", "Z", "getVisibility", "()Z", "<init>", "(Lcom/bbva/cells/componentkit/model/dsl/Resource;Z)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/cells/componentkit/model/dsl/Resource;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class ButtonLink {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Resource text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean visibility;

    /* JADX INFO: compiled from: LoginCredentialsState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/login/model/ButtonLink$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/login/model/ButtonLink;", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<ButtonLink> serializer() {
            return ButtonLink$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ButtonLink(int i10, Resource resource, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, ButtonLink$$serializer.INSTANCE.getDescriptor());
        }
        this.text = resource;
        if ((i10 & 2) == 0) {
            this.visibility = true;
        } else {
            this.visibility = z10;
        }
    }

    public static /* synthetic */ ButtonLink copy$default(ButtonLink buttonLink, Resource resource, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            resource = buttonLink.text;
        }
        if ((i10 & 2) != 0) {
            z10 = buttonLink.visibility;
        }
        return buttonLink.copy(resource, z10);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(ButtonLink self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, Resource$$serializer.INSTANCE, self.text);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 1);
        boolean z10 = self.visibility;
        if (!zShouldEncodeElementDefault && z10) {
            return;
        }
        output.encodeBooleanElement(serialDesc, 1, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Resource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getVisibility() {
        return this.visibility;
    }

    @NotNull
    public final ButtonLink copy(@NotNull Resource text, boolean visibility) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new ButtonLink(text, visibility);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonLink)) {
            return false;
        }
        ButtonLink buttonLink = (ButtonLink) other;
        return Intrinsics.areEqual(this.text, buttonLink.text) && this.visibility == buttonLink.visibility;
    }

    @NotNull
    public final Resource getText() {
        return this.text;
    }

    public final boolean getVisibility() {
        return this.visibility;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        boolean z10 = this.visibility;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "ButtonLink(text=" + this.text + ", visibility=" + this.visibility + ")";
    }

    public ButtonLink(@NotNull Resource text, boolean z10) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.visibility = z10;
    }

    public /* synthetic */ ButtonLink(Resource resource, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(resource, (i10 & 2) != 0 ? true : z10);
    }
}
