package com.bbva.component.ui.shortcuts.model;

import androidx.camera.core.imagecapture.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShortcutsConfiguration.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u001b\u0010\u001cB+\b\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u0012\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0019\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcom/bbva/component/ui/shortcuts/model/ShortcutsConfiguration;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$component_ui_shortcuts_release", "(Lcom/bbva/component/ui/shortcuts/model/ShortcutsConfiguration;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "Lcom/bbva/component/ui/shortcuts/model/ShortcutItem;", "component1", FirebaseAnalytics.Param.ITEMS, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-shortcuts_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class ShortcutsConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<ShortcutItem> items;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final KSerializer<Object>[] f28754b = {new ArrayListSerializer(ShortcutItem$$serializer.INSTANCE)};

    /* JADX INFO: compiled from: ShortcutsConfiguration.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/shortcuts/model/ShortcutsConfiguration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/shortcuts/model/ShortcutsConfiguration;", "component-ui-shortcuts_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<ShortcutsConfiguration> serializer() {
            return ShortcutsConfiguration$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ShortcutsConfiguration(int i10, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, ShortcutsConfiguration$$serializer.INSTANCE.getDescriptor());
        }
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShortcutsConfiguration copy$default(ShortcutsConfiguration shortcutsConfiguration, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = shortcutsConfiguration.items;
        }
        return shortcutsConfiguration.copy(list);
    }

    @NotNull
    public final List<ShortcutItem> component1() {
        return this.items;
    }

    @NotNull
    public final ShortcutsConfiguration copy(@NotNull List<ShortcutItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new ShortcutsConfiguration(items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ShortcutsConfiguration) && Intrinsics.areEqual(this.items, ((ShortcutsConfiguration) other).items);
    }

    @NotNull
    public final List<ShortcutItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return a.c(new StringBuilder("ShortcutsConfiguration(items="), this.items, ")");
    }

    public ShortcutsConfiguration(@NotNull List<ShortcutItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }
}
