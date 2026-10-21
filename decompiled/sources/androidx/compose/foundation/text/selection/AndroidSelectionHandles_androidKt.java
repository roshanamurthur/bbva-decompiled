package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aR\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u0010\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a$\u0010\u0012\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u001a8\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0002H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "position", "", "isStartHandle", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "handlesCrossed", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "SelectionHandle-8fL75-g", "(JZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionHandle", "DefaultSelectionHandle", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLandroidx/compose/runtime/Composer;I)V", "drawSelectionHandle", "Landroidx/compose/ui/draw/CacheDrawScope;", "", "radius", "Landroidx/compose/ui/graphics/ImageBitmap;", "createHandleImage", "Landroidx/compose/foundation/text/selection/HandleReferencePoint;", "handleReferencePoint", "HandlePopup-ULxng0E", "(JLandroidx/compose/foundation/text/selection/HandleReferencePoint;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "HandlePopup", "areHandlesCrossed", "isHandleLtrDirection", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,330:1\n558#2,17:331\n50#3:348\n49#3:349\n1097#4,6:350\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n*L\n193#1:331,17\n231#1:348\n231#1:349\n231#1:350,6\n*E\n"})
public final class AndroidSelectionHandles_androidKt {

    /* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6271p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f6272q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ResolvedTextDirection f6273r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f6274s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f6275t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Modifier modifier, boolean z10, ResolvedTextDirection resolvedTextDirection, boolean z11, int i10) {
            super(2);
            this.f6271p0 = modifier;
            this.f6272q0 = z10;
            this.f6273r0 = resolvedTextDirection;
            this.f6274s0 = z11;
            this.f6275t0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidSelectionHandles_androidKt.DefaultSelectionHandle(this.f6271p0, this.f6272q0, this.f6273r0, this.f6274s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6275t0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f6276p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ HandleReferencePoint f6277q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6278r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f6279s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j10, HandleReferencePoint handleReferencePoint, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f6276p0 = j10;
            this.f6277q0 = handleReferencePoint;
            this.f6278r0 = function2;
            this.f6279s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidSelectionHandles_androidKt.m596HandlePopupULxng0E(this.f6276p0, this.f6277q0, this.f6278r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6279s0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
    @SourceDebugExtension({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$SelectionHandle$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,330:1\n50#2:331\n49#2:332\n1097#3,6:333\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$SelectionHandle$1\n*L\n74#1:331\n74#1:332\n74#1:333,6\n*E\n"})
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6280p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6281q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f6282r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f6283s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f6284t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ ResolvedTextDirection f6285u0;
        public final /* synthetic */ boolean v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, long j10, Modifier modifier, ResolvedTextDirection resolvedTextDirection, Function2 function2, boolean z10, boolean z11) {
            super(2);
            this.f6280p0 = function2;
            this.f6281q0 = modifier;
            this.f6282r0 = z10;
            this.f6283s0 = j10;
            this.f6284t0 = i10;
            this.f6285u0 = resolvedTextDirection;
            this.v0 = z11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(732099485, iIntValue, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:69)");
                }
                int i10 = this.f6284t0;
                Function2<Composer, Integer, Unit> function2 = this.f6280p0;
                if (function2 == null) {
                    composer2.startReplaceableGroup(386443790);
                    boolean z10 = this.f6282r0;
                    Boolean boolValueOf = Boolean.valueOf(z10);
                    long j10 = this.f6283s0;
                    Offset offsetM2264boximpl = Offset.m2264boximpl(j10);
                    composer2.startReplaceableGroup(511388516);
                    boolean zChanged = composer2.changed(boolValueOf) | composer2.changed(offsetM2264boximpl);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new androidx.compose.foundation.text.selection.a(j10, z10);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    AndroidSelectionHandles_androidKt.DefaultSelectionHandle(SemanticsModifierKt.semantics$default(this.f6281q0, false, (Function1) objRememberedValue, 1, null), this.f6282r0, this.f6285u0, this.v0, composer2, (i10 & 112) | (i10 & 896) | (i10 & 7168));
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(386444465);
                    function2.invoke(composer2, Integer.valueOf((i10 >> 15) & 14));
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f6286p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f6287q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ResolvedTextDirection f6288r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f6289s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6290t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6291u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, long j10, Modifier modifier, ResolvedTextDirection resolvedTextDirection, Function2 function2, boolean z10, boolean z11) {
            super(2);
            this.f6286p0 = j10;
            this.f6287q0 = z10;
            this.f6288r0 = resolvedTextDirection;
            this.f6289s0 = z11;
            this.f6290t0 = modifier;
            this.f6291u0 = function2;
            this.v0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidSelectionHandles_androidKt.m597SelectionHandle8fL75g(this.f6286p0, this.f6287q0, this.f6288r0, this.f6289s0, this.f6290t0, this.f6291u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
    @SourceDebugExtension({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,330:1\n76#2:331\n83#3,3:332\n1097#4,6:335\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1\n*L\n113#1:331\n115#1:332,3\n115#1:335,6\n*E\n"})
    public static final class e extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f6292p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ResolvedTextDirection f6293q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f6294r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, ResolvedTextDirection resolvedTextDirection, boolean z11) {
            super(3);
            this.f6292p0 = z10;
            this.f6293q0 = resolvedTextDirection;
            this.f6294r0 = z11;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 ??, still in use, count: 1, list:
              (r8v3 ?? I:java.lang.Object) from 0x007c: INVOKE (r12v1 ?? I:androidx.compose.runtime.Composer), (r8v3 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:125)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        @Override // kotlin.jvm.functions.Function3
        public final androidx.compose.ui.Modifier invoke(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 ??, still in use, count: 1, list:
              (r8v3 ?? I:java.lang.Object) from 0x007c: INVOKE (r12v1 ?? I:androidx.compose.runtime.Composer), (r8v3 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:125)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DefaultSelectionHandle(@NotNull Modifier modifier, boolean z10, @NotNull ResolvedTextDirection direction, boolean z11, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Composer composerStartRestartGroup = composer.startRestartGroup(47957398);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(direction) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(47957398, i10, -1, "androidx.compose.foundation.text.selection.DefaultSelectionHandle (AndroidSelectionHandles.android.kt:95)");
            }
            SpacerKt.Spacer(drawSelectionHandle(SizeKt.m337sizeVpY3zN4(modifier, SelectionHandlesKt.getHandleWidth(), SelectionHandlesKt.getHandleHeight()), z10, direction, z11), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier, z10, direction, z11, i10));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: HandlePopup-ULxng0E, reason: not valid java name */
    public static final void m596HandlePopupULxng0E(long j10, @NotNull HandleReferencePoint handleReferencePoint, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(handleReferencePoint, "handleReferencePoint");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1409050158);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(handleReferencePoint) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1409050158, i11, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:223)");
            }
            long jIntOffset = IntOffsetKt.IntOffset(mk.c.roundToInt(Offset.m2275getXimpl(j10)), mk.c.roundToInt(Offset.m2276getYimpl(j10)));
            IntOffset intOffsetM4498boximpl = IntOffset.m4498boximpl(jIntOffset);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(intOffsetM4498boximpl) | composerStartRestartGroup.changed(handleReferencePoint);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new HandlePositionProvider(handleReferencePoint, jIntOffset, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidPopup_androidKt.Popup((HandlePositionProvider) objRememberedValue, null, new PopupProperties(false, false, false, null, true, false, 15, null), content, composerStartRestartGroup, ((i11 << 3) & 7168) | BluetoothState.REQUEST_CONNECT_DEVICE, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(j10, handleReferencePoint, content, i10));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: SelectionHandle-8fL75-g, reason: not valid java name */
    public static final void m597SelectionHandle8fL75g(long j10, boolean z10, @NotNull ResolvedTextDirection direction, boolean z11, @NotNull Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-616295642);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(direction) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((374491 & i12) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-616295642, i12, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:53)");
            }
            m596HandlePopupULxng0E(j10, (!z10 ? !isHandleLtrDirection(direction, z11) : isHandleLtrDirection(direction, z11)) ? HandleReferencePoint.TopLeft : HandleReferencePoint.TopRight, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 732099485, true, new c(i12, j10, modifier, direction, function2, z10, z11)), composerStartRestartGroup, (i12 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(i10, j10, modifier, direction, function2, z10, z11));
    }

    public static final boolean access$isLeft(boolean z10, ResolvedTextDirection resolvedTextDirection, boolean z11) {
        if (z10) {
            return isHandleLtrDirection(resolvedTextDirection, z11);
        }
        return !isHandleLtrDirection(resolvedTextDirection, z11);
    }

    @NotNull
    public static final ImageBitmap createHandleImage(@NotNull CacheDrawScope cacheDrawScope, float f6) {
        Intrinsics.checkNotNullParameter(cacheDrawScope, "<this>");
        int iCeil = ((int) Math.ceil(f6)) * 2;
        ImageBitmap imageBitmapM2697ImageBitmapx__hDU$default = g0.b.f68552a;
        Canvas Canvas = g0.b.f68553b;
        CanvasDrawScope canvasDrawScope = g0.b.f68554c;
        if (imageBitmapM2697ImageBitmapx__hDU$default == null || Canvas == null || iCeil > imageBitmapM2697ImageBitmapx__hDU$default.getWidth() || iCeil > imageBitmapM2697ImageBitmapx__hDU$default.getHeight()) {
            imageBitmapM2697ImageBitmapx__hDU$default = ImageBitmapKt.m2697ImageBitmapx__hDU$default(iCeil, iCeil, ImageBitmapConfig.INSTANCE.m2691getAlpha8_sVssgQ(), false, null, 24, null);
            g0.b.f68552a = imageBitmapM2697ImageBitmapx__hDU$default;
            Canvas = CanvasKt.Canvas(imageBitmapM2697ImageBitmapx__hDU$default);
            g0.b.f68553b = Canvas;
        }
        ImageBitmap imageBitmap = imageBitmapM2697ImageBitmapx__hDU$default;
        Canvas canvas = Canvas;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            g0.b.f68554c = canvasDrawScope;
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        long jSize = androidx.compose.ui.geometry.SizeKt.Size(imageBitmap.getWidth(), imageBitmap.getHeight());
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas2 = drawParams.getCanvas();
        long size = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m2914setSizeuvyYCjk(jSize);
        canvas.save();
        a1.b.K(canvasDrawScope2, Color.INSTANCE.m2534getBlack0d7_KjU(), 0L, canvasDrawScope2.mo2909getSizeNHjbRc(), 0.0f, null, null, BlendMode.INSTANCE.m2432getClear0nO6VwU(), 58, null);
        a1.b.K(canvasDrawScope2, ColorKt.Color(4278190080L), Offset.INSTANCE.m2291getZeroF1C5BW0(), androidx.compose.ui.geometry.SizeKt.Size(f6, f6), 0.0f, null, null, 0, 120, null);
        a1.b.x(canvasDrawScope2, ColorKt.Color(4278190080L), f6, OffsetKt.Offset(f6, f6), 0.0f, null, null, 0, 120, null);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(density);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas2);
        drawParams3.m2914setSizeuvyYCjk(size);
        return imageBitmap;
    }

    @NotNull
    public static final Modifier drawSelectionHandle(@NotNull Modifier modifier, boolean z10, @NotNull ResolvedTextDirection direction, boolean z11) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return ComposedModifierKt.composed$default(modifier, null, new e(z10, direction, z11), 1, null);
    }

    public static final boolean isHandleLtrDirection(@NotNull ResolvedTextDirection direction, boolean z10) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        return (direction == ResolvedTextDirection.Ltr && !z10) || (direction == ResolvedTextDirection.Rtl && z10);
    }
}
