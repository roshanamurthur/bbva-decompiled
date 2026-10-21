package androidx.compose.ui.modifier;

import androidx.activity.a;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import u0.e;
import u0.f;

/* JADX INFO: compiled from: ModifierLocalProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"modifierLocalProvider", "Landroidx/compose/ui/Modifier;", ExifInterface.GPS_DIRECTION_TRUE, "key", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "value", "Lkotlin/Function0;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModifierLocalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,69:1\n135#2:70\n*S KotlinDebug\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n*L\n59#1:70\n*E\n"})
public final class ModifierLocalProviderKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.ui.modifier.ModifierLocalProviderKt$modifierLocalProvider$1, reason: invalid class name */
    /* JADX INFO: compiled from: ModifierLocalProvider.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00028\u00008VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/compose/ui/modifier/ModifierLocalProviderKt$modifierLocalProvider$1", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "c", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "d", "Landroidx/compose/runtime/State;", "getValue", "()Ljava/lang/Object;", "value", "ui_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nModifierLocalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt$modifierLocalProvider$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,69:1\n81#2:70\n*S KotlinDebug\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt$modifierLocalProvider$1\n*L\n66#1:70\n*E\n"})
    public static final class AnonymousClass1<T> extends InspectorValueInfo implements ModifierLocalProvider<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ProvidableModifierLocal<T> key;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final State value;

        public AnonymousClass1(ProvidableModifierLocal<T> providableModifierLocal, Function0<? extends T> function0, Function1<? super InspectorInfo, Unit> function1) {
            super(function1);
            this.key = providableModifierLocal;
            this.value = SnapshotStateKt.derivedStateOf(function0);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ boolean all(Function1 function1) {
            return f.a(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ boolean any(Function1 function1) {
            return f.b(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
            return f.c(this, obj, function2);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
            return f.d(this, obj, function2);
        }

        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        @NotNull
        public ProvidableModifierLocal<T> getKey() {
            return this.key;
        }

        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        public T getValue() {
            return (T) this.value.getValue();
        }

        @Override // androidx.compose.ui.Modifier
        public final /* synthetic */ Modifier then(Modifier modifier) {
            return e.a(this, modifier);
        }
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final <T> Modifier modifierLocalProvider(@NotNull Modifier modifier, @NotNull final ProvidableModifierLocal<T> key, @NotNull final Function0<? extends T> value) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return modifier.then(new AnonymousClass1(key, value, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.modifier.ModifierLocalProviderKt$modifierLocalProvider$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                a.c(inspectorInfo, "$this$null", "modifierLocalProvider").set("key", key);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("value", value);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
