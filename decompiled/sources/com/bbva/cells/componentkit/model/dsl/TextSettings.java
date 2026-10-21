package com.bbva.cells.componentkit.model.dsl;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
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

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0002^]B\u007f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bW\u0010XB\u007f\b\u0017\u0012\u0006\u0010Y\u001a\u00020\u001e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010[\u001a\u0004\u0018\u00010Z¢\u0006\u0004\bW\u0010\\J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0081\u0001\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J!\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&HÇ\u0001R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105R$\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00101\u001a\u0004\b@\u00103\"\u0004\bA\u00105R$\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010C\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR$\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u00101\u001a\u0004\bL\u00103\"\u0004\bM\u00105R$\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010C\u001a\u0004\bO\u0010E\"\u0004\bP\u0010GR$\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010V¨\u0006_"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "", "Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;", "component1", "Lcom/bbva/cells/componentkit/model/dsl/Resource;", "component2", "component3", "Lcom/bbva/cells/componentkit/model/dsl/InputType;", "component4", "component5", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "component6", "component7", "component8", "component9", "Lcom/bbva/cells/componentkit/model/dsl/Dimension;", "component10", "view", "text", "hint", "input", "color", "colorState", "font", "hintColor", "hintColorState", "size", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "a", "Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;", "getView", "()Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;", "setView", "(Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;)V", "b", "Lcom/bbva/cells/componentkit/model/dsl/Resource;", "getText", "()Lcom/bbva/cells/componentkit/model/dsl/Resource;", "setText", "(Lcom/bbva/cells/componentkit/model/dsl/Resource;)V", "c", "getHint", "setHint", "d", "Lcom/bbva/cells/componentkit/model/dsl/InputType;", "getInput", "()Lcom/bbva/cells/componentkit/model/dsl/InputType;", "setInput", "(Lcom/bbva/cells/componentkit/model/dsl/InputType;)V", "e", "getColor", "setColor", "f", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "getColorState", "()Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "setColorState", "(Lcom/bbva/cells/componentkit/model/dsl/ResourceId;)V", "g", "getFont", "setFont", "h", "getHintColor", "setHintColor", "i", "getHintColorState", "setHintColorState", "j", "Lcom/bbva/cells/componentkit/model/dsl/Dimension;", "getSize", "()Lcom/bbva/cells/componentkit/model/dsl/Dimension;", "setSize", "(Lcom/bbva/cells/componentkit/model/dsl/Dimension;)V", "<init>", "(Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;Lcom/bbva/cells/componentkit/model/dsl/Resource;Lcom/bbva/cells/componentkit/model/dsl/Resource;Lcom/bbva/cells/componentkit/model/dsl/InputType;Lcom/bbva/cells/componentkit/model/dsl/Resource;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Lcom/bbva/cells/componentkit/model/dsl/Resource;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Lcom/bbva/cells/componentkit/model/dsl/Dimension;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/cells/componentkit/model/dsl/ViewSettings;Lcom/bbva/cells/componentkit/model/dsl/Resource;Lcom/bbva/cells/componentkit/model/dsl/Resource;Lcom/bbva/cells/componentkit/model/dsl/InputType;Lcom/bbva/cells/componentkit/model/dsl/Resource;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Lcom/bbva/cells/componentkit/model/dsl/Resource;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Lcom/bbva/cells/componentkit/model/dsl/Dimension;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "componentkit_release"}, k = 1, mv = {1, 6, 0})
@Serializable
public final /* data */ class TextSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ViewSettings view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Resource text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Resource hint;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public InputType input;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Resource color;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ResourceId colorState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ResourceId font;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Resource hintColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ResourceId hintColorState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Dimension size;

    /* JADX INFO: compiled from: Settings.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/TextSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "componentkit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<TextSettings> serializer() {
            return TextSettings$$serializer.INSTANCE;
        }
    }

    public TextSettings() {
        this((ViewSettings) null, (Resource) null, (Resource) null, (InputType) null, (Resource) null, (ResourceId) null, (ResourceId) null, (Resource) null, (ResourceId) null, (Dimension) null, 1023, (DefaultConstructorMarker) null);
    }

    @JvmStatic
    public static final void write$Self(@NotNull TextSettings self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.view != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, ViewSettings$$serializer.INSTANCE, self.view);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.text != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, Resource$$serializer.INSTANCE, self.text);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.hint != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, Resource$$serializer.INSTANCE, self.hint);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.input != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, InputType$$serializer.INSTANCE, self.input);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.color != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, Resource$$serializer.INSTANCE, self.color);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.colorState != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, ResourceId$$serializer.INSTANCE, self.colorState);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.font != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, ResourceId$$serializer.INSTANCE, self.font);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.hintColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, Resource$$serializer.INSTANCE, self.hintColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.hintColorState != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, ResourceId$$serializer.INSTANCE, self.hintColorState);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.size == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, Dimension$$serializer.INSTANCE, self.size);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ViewSettings getView() {
        return this.view;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Dimension getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Resource getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Resource getHint() {
        return this.hint;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final InputType getInput() {
        return this.input;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Resource getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ResourceId getColorState() {
        return this.colorState;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ResourceId getFont() {
        return this.font;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Resource getHintColor() {
        return this.hintColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ResourceId getHintColorState() {
        return this.hintColorState;
    }

    @NotNull
    public final TextSettings copy(@Nullable ViewSettings view, @Nullable Resource text, @Nullable Resource hint, @Nullable InputType input, @Nullable Resource color, @Nullable ResourceId colorState, @Nullable ResourceId font, @Nullable Resource hintColor, @Nullable ResourceId hintColorState, @Nullable Dimension size) {
        return new TextSettings(view, text, hint, input, color, colorState, font, hintColor, hintColorState, size);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextSettings)) {
            return false;
        }
        TextSettings textSettings = (TextSettings) other;
        return Intrinsics.areEqual(this.view, textSettings.view) && Intrinsics.areEqual(this.text, textSettings.text) && Intrinsics.areEqual(this.hint, textSettings.hint) && this.input == textSettings.input && Intrinsics.areEqual(this.color, textSettings.color) && Intrinsics.areEqual(this.colorState, textSettings.colorState) && Intrinsics.areEqual(this.font, textSettings.font) && Intrinsics.areEqual(this.hintColor, textSettings.hintColor) && Intrinsics.areEqual(this.hintColorState, textSettings.hintColorState) && Intrinsics.areEqual(this.size, textSettings.size);
    }

    @Nullable
    public final Resource getColor() {
        return this.color;
    }

    @Nullable
    public final ResourceId getColorState() {
        return this.colorState;
    }

    @Nullable
    public final ResourceId getFont() {
        return this.font;
    }

    @Nullable
    public final Resource getHint() {
        return this.hint;
    }

    @Nullable
    public final Resource getHintColor() {
        return this.hintColor;
    }

    @Nullable
    public final ResourceId getHintColorState() {
        return this.hintColorState;
    }

    @Nullable
    public final InputType getInput() {
        return this.input;
    }

    @Nullable
    public final Dimension getSize() {
        return this.size;
    }

    @Nullable
    public final Resource getText() {
        return this.text;
    }

    @Nullable
    public final ViewSettings getView() {
        return this.view;
    }

    public int hashCode() {
        ViewSettings viewSettings = this.view;
        int iHashCode = (viewSettings == null ? 0 : viewSettings.hashCode()) * 31;
        Resource resource = this.text;
        int iHashCode2 = (iHashCode + (resource == null ? 0 : resource.hashCode())) * 31;
        Resource resource2 = this.hint;
        int iHashCode3 = (iHashCode2 + (resource2 == null ? 0 : resource2.hashCode())) * 31;
        InputType inputType = this.input;
        int iHashCode4 = (iHashCode3 + (inputType == null ? 0 : inputType.hashCode())) * 31;
        Resource resource3 = this.color;
        int iHashCode5 = (iHashCode4 + (resource3 == null ? 0 : resource3.hashCode())) * 31;
        ResourceId resourceId = this.colorState;
        int iHashCode6 = (iHashCode5 + (resourceId == null ? 0 : resourceId.hashCode())) * 31;
        ResourceId resourceId2 = this.font;
        int iHashCode7 = (iHashCode6 + (resourceId2 == null ? 0 : resourceId2.hashCode())) * 31;
        Resource resource4 = this.hintColor;
        int iHashCode8 = (iHashCode7 + (resource4 == null ? 0 : resource4.hashCode())) * 31;
        ResourceId resourceId3 = this.hintColorState;
        int iHashCode9 = (iHashCode8 + (resourceId3 == null ? 0 : resourceId3.hashCode())) * 31;
        Dimension dimension = this.size;
        return iHashCode9 + (dimension != null ? dimension.hashCode() : 0);
    }

    public final void setColor(@Nullable Resource resource) {
        this.color = resource;
    }

    public final void setColorState(@Nullable ResourceId resourceId) {
        this.colorState = resourceId;
    }

    public final void setFont(@Nullable ResourceId resourceId) {
        this.font = resourceId;
    }

    public final void setHint(@Nullable Resource resource) {
        this.hint = resource;
    }

    public final void setHintColor(@Nullable Resource resource) {
        this.hintColor = resource;
    }

    public final void setHintColorState(@Nullable ResourceId resourceId) {
        this.hintColorState = resourceId;
    }

    public final void setInput(@Nullable InputType inputType) {
        this.input = inputType;
    }

    public final void setSize(@Nullable Dimension dimension) {
        this.size = dimension;
    }

    public final void setText(@Nullable Resource resource) {
        this.text = resource;
    }

    public final void setView(@Nullable ViewSettings viewSettings) {
        this.view = viewSettings;
    }

    @NotNull
    public String toString() {
        return "TextSettings(view=" + this.view + ", text=" + this.text + ", hint=" + this.hint + ", input=" + this.input + ", color=" + this.color + ", colorState=" + this.colorState + ", font=" + this.font + ", hintColor=" + this.hintColor + ", hintColorState=" + this.hintColorState + ", size=" + this.size + RootService.CLOSE_BRACKET;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ TextSettings(int i10, ViewSettings viewSettings, Resource resource, Resource resource2, InputType inputType, Resource resource3, ResourceId resourceId, ResourceId resourceId2, Resource resource4, ResourceId resourceId3, Dimension dimension, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.view = null;
        } else {
            this.view = viewSettings;
        }
        if ((i10 & 2) == 0) {
            this.text = null;
        } else {
            this.text = resource;
        }
        if ((i10 & 4) == 0) {
            this.hint = null;
        } else {
            this.hint = resource2;
        }
        if ((i10 & 8) == 0) {
            this.input = null;
        } else {
            this.input = inputType;
        }
        if ((i10 & 16) == 0) {
            this.color = null;
        } else {
            this.color = resource3;
        }
        if ((i10 & 32) == 0) {
            this.colorState = null;
        } else {
            this.colorState = resourceId;
        }
        if ((i10 & 64) == 0) {
            this.font = null;
        } else {
            this.font = resourceId2;
        }
        if ((i10 & 128) == 0) {
            this.hintColor = null;
        } else {
            this.hintColor = resource4;
        }
        if ((i10 & 256) == 0) {
            this.hintColorState = null;
        } else {
            this.hintColorState = resourceId3;
        }
        if ((i10 & 512) == 0) {
            this.size = null;
        } else {
            this.size = dimension;
        }
    }

    public TextSettings(@Nullable ViewSettings viewSettings, @Nullable Resource resource, @Nullable Resource resource2, @Nullable InputType inputType, @Nullable Resource resource3, @Nullable ResourceId resourceId, @Nullable ResourceId resourceId2, @Nullable Resource resource4, @Nullable ResourceId resourceId3, @Nullable Dimension dimension) {
        this.view = viewSettings;
        this.text = resource;
        this.hint = resource2;
        this.input = inputType;
        this.color = resource3;
        this.colorState = resourceId;
        this.font = resourceId2;
        this.hintColor = resource4;
        this.hintColorState = resourceId3;
        this.size = dimension;
    }

    public /* synthetic */ TextSettings(ViewSettings viewSettings, Resource resource, Resource resource2, InputType inputType, Resource resource3, ResourceId resourceId, ResourceId resourceId2, Resource resource4, ResourceId resourceId3, Dimension dimension, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : viewSettings, (i10 & 2) != 0 ? null : resource, (i10 & 4) != 0 ? null : resource2, (i10 & 8) != 0 ? null : inputType, (i10 & 16) != 0 ? null : resource3, (i10 & 32) != 0 ? null : resourceId, (i10 & 64) != 0 ? null : resourceId2, (i10 & 128) != 0 ? null : resource4, (i10 & 256) != 0 ? null : resourceId3, (i10 & 512) == 0 ? dimension : null);
    }
}
