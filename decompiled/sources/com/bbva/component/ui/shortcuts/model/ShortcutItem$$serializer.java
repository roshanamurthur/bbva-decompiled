package com.bbva.component.ui.shortcuts.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.cells.componentkit.model.dsl.ImageSettings;
import com.bbva.cells.componentkit.model.dsl.ImageSettings$$serializer;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.cells.componentkit.model.dsl.TextSettings$$serializer;
import com.bbva.cells.componentkit.model.dsl.ViewSettings;
import com.bbva.cells.componentkit.model.dsl.ViewSettings$$serializer;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ShortcutsConfiguration.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/bbva/component/ui/shortcuts/model/ShortcutItem.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/bbva/component/ui/shortcuts/model/ShortcutItem;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "component-ui-shortcuts_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class ShortcutItem$$serializer implements GeneratedSerializer<ShortcutItem> {
    public static final int $stable = 0;

    @NotNull
    public static final ShortcutItem$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f28753a;

    static {
        ShortcutItem$$serializer shortcutItem$$serializer = new ShortcutItem$$serializer();
        INSTANCE = shortcutItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.component.ui.shortcuts.model.ShortcutItem", shortcutItem$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("label", false);
        pluginGeneratedSerialDescriptor.addElement("view", true);
        f28753a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, ImageSettings$$serializer.INSTANCE, TextSettings$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(ViewSettings$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public ShortcutItem deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        ImageSettings imageSettings;
        TextSettings textSettings;
        ViewSettings viewSettings;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
            ImageSettings imageSettings2 = (ImageSettings) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, ImageSettings$$serializer.INSTANCE, null);
            TextSettings textSettings2 = (TextSettings) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, TextSettings$$serializer.INSTANCE, null);
            str = strDecodeStringElement2;
            viewSettings = (ViewSettings) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, ViewSettings$$serializer.INSTANCE, null);
            textSettings = textSettings2;
            imageSettings = imageSettings2;
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            ImageSettings imageSettings3 = null;
            TextSettings textSettings3 = null;
            ViewSettings viewSettings2 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    imageSettings3 = (ImageSettings) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, ImageSettings$$serializer.INSTANCE, imageSettings3);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    textSettings3 = (TextSettings) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, TextSettings$$serializer.INSTANCE, textSettings3);
                    i11 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    viewSettings2 = (ViewSettings) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, ViewSettings$$serializer.INSTANCE, viewSettings2);
                    i11 |= 8;
                }
            }
            i10 = i11;
            str = strDecodeStringElement;
            imageSettings = imageSettings3;
            textSettings = textSettings3;
            viewSettings = viewSettings2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new ShortcutItem(i10, str, imageSettings, textSettings, viewSettings, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f28753a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull ShortcutItem value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        ShortcutItem.write$Self$component_ui_shortcuts_release(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
