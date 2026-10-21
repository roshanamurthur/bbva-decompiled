package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectableModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.s;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\f\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u001e\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "focusable", "focusGroup", "focusableInNonTouchMode", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,372:1\n146#2:373\n135#2:374\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n125#1:373\n113#1:374\n*E\n"})
public final class FocusableKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final InspectableModifier f3368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final FocusableKt$FocusableInNonTouchModeElement$1 f3369b;

    /* JADX INFO: compiled from: Focusable.kt */
    public static final class a extends Lambda implements Function1<FocusProperties, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f3370p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FocusProperties focusProperties) {
            FocusProperties focusProperties2 = focusProperties;
            Intrinsics.checkNotNullParameter(focusProperties2, "$this$focusProperties");
            focusProperties2.setCanFocus(false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Focusable.kt */
    public static final class b extends Lambda implements Function1<InspectorInfo, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f3371p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f3372q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, MutableInteractionSource mutableInteractionSource) {
            super(1);
            this.f3371p0 = z10;
            this.f3372q0 = mutableInteractionSource;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InspectorInfo inspectorInfo) {
            InspectorInfo inspectorInfo2 = inspectorInfo;
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(this.f3371p0, androidx.activity.a.c(inspectorInfo2, "$this$inspectable", "focusableInNonTouchMode"), "enabled", inspectorInfo2).set("interactionSource", this.f3372q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        f3368a = new InspectableModifier(InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.FocusableKt$special$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("focusGroup");
            }
        } : InspectableValueKt.getNoInspectorInfo());
        f3369b = new ModifierNodeElement<s>() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public boolean equals(@Nullable Object other) {
                return this == other;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
                inspectorInfo.setName("focusableInNonTouchMode");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void update(@NotNull s node) {
                Intrinsics.checkNotNullParameter(node, "node");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            @NotNull
            public s create() {
                return new s();
            }
        };
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier focusGroup(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return FocusModifierKt.focusTarget(FocusPropertiesKt.focusProperties(modifier.then(f3368a), a.f3370p0));
    }

    @NotNull
    public static final Modifier focusable(@NotNull Modifier modifier, boolean z10, @Nullable MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(z10 ? FocusModifierKt.focusTarget(new FocusableElement(mutableInteractionSource)) : Modifier.INSTANCE);
    }

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z10, mutableInteractionSource);
    }

    @NotNull
    public static final Modifier focusableInNonTouchMode(@NotNull Modifier modifier, boolean z10, @Nullable MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return InspectableValueKt.inspectableWrapper(modifier, new b(z10, mutableInteractionSource), focusable(Modifier.INSTANCE.then(f3369b), z10, mutableInteractionSource));
    }
}
