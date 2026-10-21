package com.bbva.component.ui.shortcuts.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShortcutsState.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0003\u000f\u0010\u0011B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eHÇ\u0001\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/bbva/component/ui/shortcuts/model/ShortcutsState;", "", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Loading", "Ready", "Lcom/bbva/component/ui/shortcuts/model/ShortcutsState$Loading;", "Lcom/bbva/component/ui/shortcuts/model/ShortcutsState$Ready;", "component-ui-shortcuts_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
public abstract class ShortcutsState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy<KSerializer<Object>> f28757a = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.f28762p0);

    /* JADX INFO: compiled from: ShortcutsState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/shortcuts/model/ShortcutsState$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/shortcuts/model/ShortcutsState;", "component-ui-shortcuts_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<ShortcutsState> serializer() {
            return (KSerializer) ShortcutsState.f28757a.getValue();
        }
    }

    /* JADX INFO: compiled from: ShortcutsState.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ui/shortcuts/model/ShortcutsState$Loading;", "Lcom/bbva/component/ui/shortcuts/model/ShortcutsState;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "component-ui-shortcuts_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final class Loading extends ShortcutsState {
        public static final int $stable = 0;

        @NotNull
        public static final Loading INSTANCE = new Loading();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Lazy<KSerializer<Object>> f28758b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.f28759p0);

        /* JADX INFO: compiled from: ShortcutsState.kt */
        public static final class a extends Lambda implements Function0<KSerializer<Object>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f28759p0 = new a(0);

            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return new ObjectSerializer("com.bbva.component.ui.shortcuts.model.ShortcutsState.Loading", Loading.INSTANCE, new Annotation[0]);
            }
        }

        public Loading() {
            super(null);
        }

        @NotNull
        public final KSerializer<Loading> serializer() {
            return (KSerializer) f28758b.getValue();
        }
    }

    /* JADX INFO: compiled from: ShortcutsState.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cB%\b\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcom/bbva/component/ui/shortcuts/model/ShortcutsState$Ready;", "Lcom/bbva/component/ui/shortcuts/model/ShortcutsState;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$component_ui_shortcuts_release", "(Lcom/bbva/component/ui/shortcuts/model/ShortcutsState$Ready;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/bbva/component/ui/shortcuts/model/ShortcutsConfiguration;", "component1", "shortcutsConfiguration", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Lcom/bbva/component/ui/shortcuts/model/ShortcutsConfiguration;", "getShortcutsConfiguration", "()Lcom/bbva/component/ui/shortcuts/model/ShortcutsConfiguration;", "<init>", "(Lcom/bbva/component/ui/shortcuts/model/ShortcutsConfiguration;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/component/ui/shortcuts/model/ShortcutsConfiguration;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-shortcuts_release"}, k = 1, mv = {1, 9, 0})
    @Serializable
    public static final /* data */ class Ready extends ShortcutsState {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ShortcutsConfiguration shortcutsConfiguration;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        /* JADX INFO: compiled from: ShortcutsState.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/shortcuts/model/ShortcutsState$Ready$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/shortcuts/model/ShortcutsState$Ready;", "component-ui-shortcuts_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer<Ready> serializer() {
                return ShortcutsState$Ready$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ Ready(int i10, ShortcutsConfiguration shortcutsConfiguration, SerializationConstructorMarker serializationConstructorMarker) {
            super(i10, serializationConstructorMarker);
            if (1 != (i10 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i10, 1, ShortcutsState$Ready$$serializer.INSTANCE.getDescriptor());
            }
            this.shortcutsConfiguration = shortcutsConfiguration;
        }

        public static /* synthetic */ Ready copy$default(Ready ready, ShortcutsConfiguration shortcutsConfiguration, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                shortcutsConfiguration = ready.shortcutsConfiguration;
            }
            return ready.copy(shortcutsConfiguration);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$component_ui_shortcuts_release(Ready self, CompositeEncoder output, SerialDescriptor serialDesc) {
            ShortcutsState.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, ShortcutsConfiguration$$serializer.INSTANCE, self.shortcutsConfiguration);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ShortcutsConfiguration getShortcutsConfiguration() {
            return this.shortcutsConfiguration;
        }

        @NotNull
        public final Ready copy(@NotNull ShortcutsConfiguration shortcutsConfiguration) {
            Intrinsics.checkNotNullParameter(shortcutsConfiguration, "shortcutsConfiguration");
            return new Ready(shortcutsConfiguration);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ready) && Intrinsics.areEqual(this.shortcutsConfiguration, ((Ready) other).shortcutsConfiguration);
        }

        @NotNull
        public final ShortcutsConfiguration getShortcutsConfiguration() {
            return this.shortcutsConfiguration;
        }

        public int hashCode() {
            return this.shortcutsConfiguration.hashCode();
        }

        @NotNull
        public String toString() {
            return "Ready(shortcutsConfiguration=" + this.shortcutsConfiguration + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(@NotNull ShortcutsConfiguration shortcutsConfiguration) {
            super(null);
            Intrinsics.checkNotNullParameter(shortcutsConfiguration, "shortcutsConfiguration");
            this.shortcutsConfiguration = shortcutsConfiguration;
        }
    }

    /* JADX INFO: compiled from: ShortcutsState.kt */
    public static final class a extends Lambda implements Function0<KSerializer<Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f28762p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedClassSerializer("com.bbva.component.ui.shortcuts.model.ShortcutsState", Reflection.getOrCreateKotlinClass(ShortcutsState.class), new KClass[]{Reflection.getOrCreateKotlinClass(Loading.class), Reflection.getOrCreateKotlinClass(Ready.class)}, new KSerializer[]{new ObjectSerializer("com.bbva.component.ui.shortcuts.model.ShortcutsState.Loading", Loading.INSTANCE, new Annotation[0]), ShortcutsState$Ready$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ShortcutsState(int i10, SerializationConstructorMarker serializationConstructorMarker) {
    }

    public /* synthetic */ ShortcutsState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public ShortcutsState() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(ShortcutsState self, CompositeEncoder output, SerialDescriptor serialDesc) {
    }
}
