package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowInsetsPadding.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\r\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0002\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u000b\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\f\u001a\u00020\u0000*\u00020\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "safeDrawingPadding", "safeGesturesPadding", "safeContentPadding", "systemBarsPadding", "displayCutoutPadding", "statusBarsPadding", "imePadding", "navigationBarsPadding", "captionBarPadding", "waterfallPadding", "systemGesturesPadding", "mandatorySystemGesturesPadding", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,255:1\n249#1,7:257\n249#1,7:265\n249#1,7:273\n249#1,7:281\n249#1,7:289\n249#1,7:297\n249#1,7:305\n249#1,7:313\n249#1,7:321\n249#1,7:329\n249#1,7:337\n249#1,7:345\n135#2:256\n135#2:264\n135#2:272\n135#2:280\n135#2:288\n135#2:296\n135#2:304\n135#2:312\n135#2:320\n135#2:328\n135#2:336\n135#2:344\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n41#1:257,7\n59#1:265,7\n77#1:273,7\n95#1:281,7\n113#1:289,7\n131#1:297,7\n149#1:305,7\n167#1:313,7\n185#1:321,7\n203#1:329,7\n221#1:337,7\n240#1:345,7\n41#1:256\n59#1:264\n77#1:272\n95#1:280\n113#1:288\n131#1:296\n149#1:304\n167#1:312\n185#1:320\n203#1:328\n221#1:336\n240#1:344\n*E\n"})
public final class WindowInsetsPadding_androidKt {
    @NotNull
    public static final Modifier captionBarPadding(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$captionBarPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("captionBarPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$captionBarPadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.INSTANCE.current(composer, 8);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getCaptionBar(), null, 2, 0 == true ? 1 : 0);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @NotNull
    public static final Modifier displayCutoutPadding(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("displayCutoutPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.INSTANCE.current(composer, 8);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getDisplayCutout(), null, 2, 0 == true ? 1 : 0);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @NotNull
    public static final Modifier imePadding(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$imePadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("imePadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.INSTANCE.current(composer, 8);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getIme(), null, 2, 0 == true ? 1 : 0);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @NotNull
    public static final Modifier mandatorySystemGesturesPadding(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("mandatorySystemGesturesPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.INSTANCE.current(composer, 8);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getMandatorySystemGestures(), null, 2, 0 == true ? 1 : 0);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @NotNull
    public static final Modifier navigationBarsPadding(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("navigationBarsPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.INSTANCE.current(composer, 8);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getNavigationBars(), null, 2, 0 == true ? 1 : 0);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @NotNull
    public static final Modifier safeContentPadding(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeContentPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("safeContentPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeContentPadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.INSTANCE.current(composer, 8);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getSafeContent(), null, 2, 0 == true ? 1 : 0);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @NotNull
    public static final Modifier safeDrawingPadding(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("safeDrawingPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.INSTANCE.current(composer, 8);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getSafeDrawing(), null, 2, 0 == true ? 1 : 0);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @NotNull
    public static final Modifier safeGesturesPadding(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeGesturesPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("safeGesturesPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeGesturesPadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.INSTANCE.current(composer, 8);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getSafeGestures(), null, 2, 0 == true ? 1 : 0);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @NotNull
    public static final Modifier statusBarsPadding(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("statusBarsPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.INSTANCE.current(composer, 8);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getStatusBars(), null, 2, 0 == true ? 1 : 0);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @NotNull
    public static final Modifier systemBarsPadding(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("systemBarsPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.INSTANCE.current(composer, 8);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getSystemBars(), null, 2, 0 == true ? 1 : 0);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @NotNull
    public static final Modifier systemGesturesPadding(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemGesturesPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("systemGesturesPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemGesturesPadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.INSTANCE.current(composer, 8);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getSystemGestures(), null, 2, 0 == true ? 1 : 0);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @NotNull
    public static final Modifier waterfallPadding(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$waterfallPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("waterfallPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$waterfallPadding$$inlined$windowInsetsPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i10, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
                }
                WindowInsetsHolder windowInsetsHolderCurrent = WindowInsetsHolder.INSTANCE.current(composer, 8);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(windowInsetsHolderCurrent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InsetsPaddingModifier(windowInsetsHolderCurrent.getWaterfall(), null, 2, 0 == true ? 1 : 0);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objRememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return insetsPaddingModifier;
            }
        });
    }
}
