package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001að\u0001\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u001123\b\u0002\u0010!\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0001¢\u0006\u0004\b\"\u0010#\u001a7\u0010*\u001a\u00020\u0003*\u00020$2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H\u0080@ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010.\u001a\u00020\u00032\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061²\u0006\f\u00100\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "enabled", "readOnly", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "decorationBox", "CoreTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "textLayoutResult", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "bringSelectionEndIntoView", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "writeable", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 13 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1143:1\n25#2:1144\n36#2:1156\n50#2:1163\n49#2:1164\n25#2:1171\n25#2:1178\n25#2:1185\n25#2:1199\n25#2:1210\n456#2,8:1234\n464#2,3:1248\n467#2,3:1254\n36#2:1260\n36#2:1268\n1097#3,6:1145\n1097#3,6:1157\n1097#3,6:1165\n1097#3,6:1172\n1097#3,6:1179\n1097#3,6:1186\n1097#3,3:1200\n1100#3,3:1206\n1097#3,6:1211\n1097#3,6:1261\n1097#3,6:1269\n76#4:1151\n76#4:1152\n76#4:1153\n76#4:1154\n76#4:1155\n76#4:1192\n76#4:1193\n76#4:1194\n76#4:1267\n486#5,4:1195\n490#5,2:1203\n494#5:1209\n486#6:1205\n66#7,6:1217\n72#7:1251\n76#7:1258\n78#8,11:1223\n91#8:1257\n4144#9,6:1242\n30#10,2:1252\n1#11:1259\n495#12,4:1275\n500#12:1284\n129#13,5:1279\n81#14:1285\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n*L\n206#1:1144\n222#1:1156\n225#1:1163\n225#1:1164\n238#1:1171\n266#1:1178\n269#1:1185\n281#1:1199\n282#1:1210\n729#1:1234,8\n729#1:1248,3\n729#1:1254,3\n1093#1:1260\n1101#1:1268\n206#1:1145,6\n222#1:1157,6\n225#1:1165,6\n238#1:1172,6\n266#1:1179,6\n269#1:1186,6\n281#1:1200,3\n281#1:1206,3\n282#1:1211,6\n1093#1:1261,6\n1101#1:1269,6\n210#1:1151\n211#1:1152\n212#1:1153\n213#1:1154\n214#1:1155\n275#1:1192\n276#1:1193\n277#1:1194\n1094#1:1267\n281#1:1195,4\n281#1:1203,2\n281#1:1209\n281#1:1205\n729#1:1217,6\n729#1:1251\n729#1:1258\n729#1:1223,11\n729#1:1257\n729#1:1242,6\n730#1:1252,2\n1129#1:1275,4\n1129#1:1284\n1129#1:1279,5\n333#1:1285\n*E\n"})
public final class CoreTextFieldKt {

    /* JADX INFO: compiled from: CoreTextField.kt */
    public static final class a extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f5816p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextLayoutResult textLayoutResult) {
            TextLayoutResult it = textLayoutResult;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2", f = "CoreTextField.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f5817p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TextFieldState f5818q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f5819r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TextInputService f5820s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ TextFieldValue f5821t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ ImeOptions f5822u0;
        public final /* synthetic */ OffsetMapping v0;

        /* JADX INFO: compiled from: CoreTextField.kt */
        public static final class a extends Lambda implements Function0<Boolean> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ State<Boolean> f5823p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(State<Boolean> state) {
                super(0);
                this.f5823p0 = state;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(CoreTextFieldKt.access$CoreTextField$lambda$8(this.f5823p0));
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.CoreTextFieldKt$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CoreTextField.kt */
        public static final class C0037b implements FlowCollector<Boolean> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ TextFieldState f5824p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ TextInputService f5825q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ TextFieldValue f5826r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ ImeOptions f5827s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ OffsetMapping f5828t0;

            public C0037b(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
                this.f5824p0 = textFieldState;
                this.f5825q0 = textInputService;
                this.f5826r0 = textFieldValue;
                this.f5827s0 = imeOptions;
                this.f5828t0 = offsetMapping;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Boolean bool, Continuation continuation) {
                boolean zBooleanValue = bool.booleanValue();
                TextFieldState textFieldState = this.f5824p0;
                if (zBooleanValue && textFieldState.getHasFocus()) {
                    CoreTextFieldKt.access$startInputSession(this.f5825q0, textFieldState, this.f5826r0, this.f5827s0, this.f5828t0);
                } else {
                    CoreTextFieldKt.access$endInputSession(textFieldState);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TextFieldState textFieldState, State<Boolean> state, TextInputService textInputService, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f5818q0 = textFieldState;
            this.f5819r0 = state;
            this.f5820s0 = textInputService;
            this.f5821t0 = textFieldValue;
            this.f5822u0 = imeOptions;
            this.v0 = offsetMapping;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f5818q0, this.f5819r0, this.f5820s0, this.f5821t0, this.f5822u0, this.v0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f5817p0;
            TextFieldState textFieldState = this.f5818q0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new a(this.f5819r0));
                    C0037b c0037b = new C0037b(this.f5820s0, this.f5818q0, this.f5821t0, this.f5822u0, this.v0);
                    this.f5817p0 = 1;
                    if (flowSnapshotFlow.collect(c0037b, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CoreTextFieldKt.access$endInputSession(textFieldState);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                CoreTextFieldKt.access$endInputSession(textFieldState);
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    @SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$3\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1143:1\n63#2,5:1144\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$3\n*L\n573#1:1144,5\n*E\n"})
    public static final class c extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionManager f5829p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextFieldSelectionManager textFieldSelectionManager) {
            super(1);
            this.f5829p0 = textFieldSelectionManager;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final TextFieldSelectionManager textFieldSelectionManager = this.f5829p0;
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                }
            };
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    @SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1143:1\n63#2,5:1144\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4\n*L\n587#1:1144,5\n*E\n"})
    public static final class d extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextInputService f5830p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TextFieldState f5831q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TextFieldValue f5832r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ ImeOptions f5833s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions) {
            super(1);
            this.f5830p0 = textInputService;
            this.f5831q0 = textFieldState;
            this.f5832r0 = textFieldValue;
            this.f5833s0 = imeOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            if (this.f5830p0 != null) {
                TextFieldState textFieldState = this.f5831q0;
                if (textFieldState.getHasFocus()) {
                    textFieldState.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(this.f5830p0, this.f5832r0, textFieldState.getProcessor(), this.f5833s0, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
                }
            }
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                }
            };
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Modifier E0;
        public final /* synthetic */ Modifier F0;
        public final /* synthetic */ Modifier G0;
        public final /* synthetic */ BringIntoViewRequester H0;
        public final /* synthetic */ TextFieldSelectionManager I0;
        public final /* synthetic */ boolean J0;
        public final /* synthetic */ boolean K0;
        public final /* synthetic */ Function1<TextLayoutResult, Unit> L0;
        public final /* synthetic */ OffsetMapping M0;
        public final /* synthetic */ Density N0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f5834p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f5835q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TextFieldState f5836r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TextStyle f5837s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f5838t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f5839u0;
        public final /* synthetic */ TextFieldScrollerPosition v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ TextFieldValue f5840w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ VisualTransformation f5841x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Modifier f5842y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, int i10, TextFieldState textFieldState, TextStyle textStyle, int i11, int i12, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, BringIntoViewRequester bringIntoViewRequester, TextFieldSelectionManager textFieldSelectionManager, boolean z10, boolean z11, Function1<? super TextLayoutResult, Unit> function1, OffsetMapping offsetMapping, Density density) {
            super(2);
            this.f5834p0 = function3;
            this.f5835q0 = i10;
            this.f5836r0 = textFieldState;
            this.f5837s0 = textStyle;
            this.f5838t0 = i11;
            this.f5839u0 = i12;
            this.v0 = textFieldScrollerPosition;
            this.f5840w0 = textFieldValue;
            this.f5841x0 = visualTransformation;
            this.f5842y0 = modifier;
            this.E0 = modifier2;
            this.F0 = modifier3;
            this.G0 = modifier4;
            this.H0 = bringIntoViewRequester;
            this.I0 = textFieldSelectionManager;
            this.J0 = z10;
            this.K0 = z11;
            this.L0 = function1;
            this.M0 = offsetMapping;
            this.N0 = density;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-374338080, iIntValue, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:623)");
                }
                this.f5834p0.invoke(ComposableLambdaKt.composableLambda(composer2, 2032502107, true, new androidx.compose.foundation.text.e(this.f5836r0, this.f5837s0, this.f5838t0, this.f5839u0, this.v0, this.f5840w0, this.f5841x0, this.f5842y0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, this.N0)), composer2, Integer.valueOf(((this.f5835q0 >> 12) & 112) | 6));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ ImeOptions F0;
        public final /* synthetic */ KeyboardActions G0;
        public final /* synthetic */ boolean H0;
        public final /* synthetic */ boolean I0;
        public final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> J0;
        public final /* synthetic */ int K0;
        public final /* synthetic */ int L0;
        public final /* synthetic */ int M0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextFieldValue f5843p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<TextFieldValue, Unit> f5844q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f5845r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TextStyle f5846s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ VisualTransformation f5847t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function1<TextLayoutResult, Unit> f5848u0;
        public final /* synthetic */ MutableInteractionSource v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Brush f5849w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ boolean f5850x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f5851y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> function1, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function2, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z10, int i10, int i11, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z11, boolean z12, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, int i12, int i13, int i14) {
            super(2);
            this.f5843p0 = textFieldValue;
            this.f5844q0 = function1;
            this.f5845r0 = modifier;
            this.f5846s0 = textStyle;
            this.f5847t0 = visualTransformation;
            this.f5848u0 = function2;
            this.v0 = mutableInteractionSource;
            this.f5849w0 = brush;
            this.f5850x0 = z10;
            this.f5851y0 = i10;
            this.E0 = i11;
            this.F0 = imeOptions;
            this.G0 = keyboardActions;
            this.H0 = z11;
            this.I0 = z12;
            this.J0 = function3;
            this.K0 = i12;
            this.L0 = i13;
            this.M0 = i14;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CoreTextFieldKt.CoreTextField(this.f5843p0, this.f5844q0, this.f5845r0, this.f5846s0, this.f5847t0, this.f5848u0, this.v0, this.f5849w0, this.f5850x0, this.f5851y0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, composer, RecomposeScopeImplKt.updateChangedFlags(this.K0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.L0), this.M0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    public static final class g extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextFieldState f5852p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(TextFieldState textFieldState) {
            super(1);
            this.f5852p0 = textFieldState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            TextLayoutResultProxy layoutResult = this.f5852p0.getLayoutResult();
            if (layoutResult != null) {
                layoutResult.setDecorationBoxCoordinates(it);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    @SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawModifier$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1143:1\n245#2:1144\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawModifier$1\n*L\n398#1:1144\n*E\n"})
    public static final class h extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextFieldState f5853p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TextFieldValue f5854q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ OffsetMapping f5855r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
            super(1);
            this.f5853p0 = textFieldState;
            this.f5854q0 = textFieldValue;
            this.f5855r0 = offsetMapping;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope drawBehind = drawScope;
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            TextFieldState textFieldState = this.f5853p0;
            TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
            if (layoutResult != null) {
                TextFieldValue textFieldValue = this.f5854q0;
                OffsetMapping offsetMapping = this.f5855r0;
                TextFieldDelegate.INSTANCE.draw$foundation_release(drawBehind.getDrawContext().getCanvas(), textFieldValue, offsetMapping, layoutResult.getValue(), textFieldState.getSelectionPaint());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    public static final class i extends Lambda implements Function1<FocusState, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextFieldState f5856p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TextInputService f5857q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f5858r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f5859s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ TextFieldValue f5860t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ ImeOptions f5861u0;
        public final /* synthetic */ OffsetMapping v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionManager f5862w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f5863x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ BringIntoViewRequester f5864y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(TextFieldState textFieldState, TextInputService textInputService, boolean z10, boolean z11, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, CoroutineScope coroutineScope, BringIntoViewRequester bringIntoViewRequester) {
            super(1);
            this.f5856p0 = textFieldState;
            this.f5857q0 = textInputService;
            this.f5858r0 = z10;
            this.f5859s0 = z11;
            this.f5860t0 = textFieldValue;
            this.f5861u0 = imeOptions;
            this.v0 = offsetMapping;
            this.f5862w0 = textFieldSelectionManager;
            this.f5863x0 = coroutineScope;
            this.f5864y0 = bringIntoViewRequester;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FocusState focusState) {
            TextLayoutResultProxy layoutResult;
            FocusState it = focusState;
            Intrinsics.checkNotNullParameter(it, "it");
            TextFieldState textFieldState = this.f5856p0;
            if (textFieldState.getHasFocus() != it.isFocused()) {
                textFieldState.setHasFocus(it.isFocused());
                TextInputService textInputService = this.f5857q0;
                if (textInputService != null) {
                    if (textFieldState.getHasFocus() && this.f5858r0 && !this.f5859s0) {
                        CoreTextFieldKt.access$startInputSession(textInputService, textFieldState, this.f5860t0, this.f5861u0, this.v0);
                    } else {
                        CoreTextFieldKt.access$endInputSession(textFieldState);
                    }
                    if (it.isFocused() && (layoutResult = textFieldState.getLayoutResult()) != null) {
                        BuildersKt__Builders_commonKt.launch$default(this.f5863x0, null, null, new androidx.compose.foundation.text.f(this.f5864y0, this.f5860t0, this.f5856p0, layoutResult, this.v0, null), 3, null);
                    }
                }
                if (!it.isFocused()) {
                    TextFieldSelectionManager.m642deselect_kEHs6E$foundation_release$default(this.f5862w0, null, 1, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    public static final class j extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextFieldState f5865p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f5866q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionManager f5867r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TextFieldValue f5868s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ OffsetMapping f5869t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping, TextFieldValue textFieldValue, boolean z10) {
            super(1);
            this.f5865p0 = textFieldState;
            this.f5866q0 = z10;
            this.f5867r0 = textFieldSelectionManager;
            this.f5868s0 = textFieldValue;
            this.f5869t0 = offsetMapping;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            TextFieldState textFieldState = this.f5865p0;
            textFieldState.setLayoutCoordinates(it);
            if (this.f5866q0) {
                HandleState handleState = textFieldState.getHandleState();
                HandleState handleState2 = HandleState.Selection;
                TextFieldSelectionManager textFieldSelectionManager = this.f5867r0;
                if (handleState == handleState2) {
                    if (textFieldState.getShowFloatingToolbar()) {
                        textFieldSelectionManager.showSelectionToolbar$foundation_release();
                    } else {
                        textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                    }
                    textFieldState.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                    textFieldState.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, false));
                } else if (textFieldState.getHandleState() == HandleState.Cursor) {
                    textFieldState.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                }
                CoreTextFieldKt.b(textFieldState, this.f5868s0, this.f5869t0);
            }
            TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
            if (layoutResult != null) {
                layoutResult.setInnerTextFieldCoordinates(it);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    public static final class k extends Lambda implements Function1<Offset, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextFieldState f5870p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FocusRequester f5871q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f5872r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionManager f5873s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ OffsetMapping f5874t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(TextFieldState textFieldState, FocusRequester focusRequester, boolean z10, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping) {
            super(1);
            this.f5870p0 = textFieldState;
            this.f5871q0 = focusRequester;
            this.f5872r0 = z10;
            this.f5873s0 = textFieldSelectionManager;
            this.f5874t0 = offsetMapping;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Offset offset) {
            long f15533a = offset.getF15533a();
            boolean z10 = !this.f5872r0;
            FocusRequester focusRequester = this.f5871q0;
            TextFieldState textFieldState = this.f5870p0;
            CoreTextFieldKt.access$tapToFocus(textFieldState, focusRequester, z10);
            if (textFieldState.getHasFocus()) {
                if (textFieldState.getHandleState() != HandleState.Selection) {
                    TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                    if (layoutResult != null) {
                        TextFieldDelegate.INSTANCE.m546setCursorOffsetULxng0E$foundation_release(f15533a, layoutResult, textFieldState.getProcessor(), this.f5874t0, textFieldState.getOnValueChange());
                        if (textFieldState.getTextDelegate().getText().length() > 0) {
                            textFieldState.setHandleState(HandleState.Cursor);
                        }
                    }
                } else {
                    this.f5873s0.m644deselect_kEHs6E$foundation_release(Offset.m2264boximpl(f15533a));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    public static final class l extends Lambda implements Function0<TextFieldScrollerPosition> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Orientation f5875p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Orientation orientation) {
            super(0);
            this.f5875p0 = orientation;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextFieldScrollerPosition invoke() {
            return new TextFieldScrollerPosition(this.f5875p0, 0.0f, 2, null);
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    public static final class m extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ImeOptions f5876p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TransformedText f5877q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TextFieldValue f5878r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f5879s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f5880t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f5881u0;
        public final /* synthetic */ TextFieldState v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ OffsetMapping f5882w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionManager f5883x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ FocusRequester f5884y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ImeOptions imeOptions, TransformedText transformedText, TextFieldValue textFieldValue, boolean z10, boolean z11, boolean z12, TextFieldState textFieldState, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, FocusRequester focusRequester) {
            super(1);
            this.f5876p0 = imeOptions;
            this.f5877q0 = transformedText;
            this.f5878r0 = textFieldValue;
            this.f5879s0 = z10;
            this.f5880t0 = z11;
            this.f5881u0 = z12;
            this.v0 = textFieldState;
            this.f5882w0 = offsetMapping;
            this.f5883x0 = textFieldSelectionManager;
            this.f5884y0 = focusRequester;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            ImeOptions imeOptions = this.f5876p0;
            SemanticsPropertiesKt.m3841setImeAction4L7nppU(semantics, imeOptions.getImeAction());
            SemanticsPropertiesKt.setEditableText(semantics, this.f5877q0.getText());
            TextFieldValue textFieldValue = this.f5878r0;
            SemanticsPropertiesKt.m3844setTextSelectionRangeFDrldGo(semantics, textFieldValue.getSelection());
            boolean z10 = this.f5879s0;
            if (!z10) {
                SemanticsPropertiesKt.disabled(semantics);
            }
            boolean z11 = this.f5880t0;
            if (z11) {
                SemanticsPropertiesKt.password(semantics);
            }
            TextFieldState textFieldState = this.v0;
            SemanticsPropertiesKt.getTextLayoutResult$default(semantics, null, new androidx.compose.foundation.text.h(textFieldState), 1, null);
            boolean z12 = this.f5881u0;
            SemanticsPropertiesKt.setText$default(semantics, null, new androidx.compose.foundation.text.i(z12, z10, textFieldState, semantics), 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semantics, null, new androidx.compose.foundation.text.j(this.f5881u0, this.f5879s0, this.v0, semantics, this.f5878r0), 1, null);
            OffsetMapping offsetMapping = this.f5882w0;
            boolean z13 = this.f5879s0;
            TextFieldValue textFieldValue2 = this.f5878r0;
            SemanticsPropertiesKt.setSelection$default(semantics, null, new androidx.compose.foundation.text.k(this.v0, this.f5883x0, offsetMapping, textFieldValue2, z13), 1, null);
            SemanticsPropertiesKt.performImeAction$default(semantics, null, new androidx.compose.foundation.text.l(textFieldState, imeOptions), 1, null);
            SemanticsPropertiesKt.onClick$default(semantics, null, new androidx.compose.foundation.text.m(textFieldState, this.f5884y0, z12), 1, null);
            TextFieldSelectionManager textFieldSelectionManager = this.f5883x0;
            SemanticsPropertiesKt.onLongClick$default(semantics, null, new androidx.compose.foundation.text.n(textFieldSelectionManager), 1, null);
            if (!TextRange.m3961getCollapsedimpl(textFieldValue.getSelection()) && !z11) {
                SemanticsPropertiesKt.copyText$default(semantics, null, new androidx.compose.foundation.text.o(textFieldSelectionManager), 1, null);
                if (z10 && !z12) {
                    SemanticsPropertiesKt.cutText$default(semantics, null, new androidx.compose.foundation.text.p(textFieldSelectionManager), 1, null);
                }
            }
            if (z10 && !z12) {
                SemanticsPropertiesKt.pasteText$default(semantics, null, new androidx.compose.foundation.text.g(textFieldSelectionManager), 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    public static final class n extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f5885p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionManager f5886q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f5887r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f5888s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f5885p0 = modifier;
            this.f5886q0 = textFieldSelectionManager;
            this.f5887r0 = function2;
            this.f5888s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f5888s0 | 1);
            TextFieldSelectionManager textFieldSelectionManager = this.f5886q0;
            Function2<Composer, Integer, Unit> function2 = this.f5887r0;
            CoreTextFieldKt.a(this.f5885p0, textFieldSelectionManager, function2, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1", f = "CoreTextField.kt", i = {}, l = {1099}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f5889p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f5890q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TextDragObserver f5891r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(TextDragObserver textDragObserver, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f5891r0 = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o oVar = new o(this.f5891r0, continuation);
            oVar.f5890q0 = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((o) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f5889p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f5890q0;
                this.f5889p0 = 1;
                if (LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, this.f5891r0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    public static final class p extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f5892p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(long j10) {
            super(1);
            this.f5892p0 = j10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            semantics.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, this.f5892p0, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoreTextField.kt */
    public static final class q extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionManager f5893p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f5894q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(TextFieldSelectionManager textFieldSelectionManager, int i10) {
            super(2);
            this.f5893p0 = textFieldSelectionManager;
            this.f5894q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f5894q0 | 1);
            CoreTextFieldKt.TextFieldCursorHandle(this.f5893p0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0144  */
    /* JADX WARN: Code duplicated, block: B:103:0x0147  */
    /* JADX WARN: Code duplicated, block: B:107:0x014f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0154  */
    /* JADX WARN: Code duplicated, block: B:110:0x015a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0160  */
    /* JADX WARN: Code duplicated, block: B:113:0x0163  */
    /* JADX WARN: Code duplicated, block: B:115:0x0168  */
    /* JADX WARN: Code duplicated, block: B:118:0x016e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0172  */
    /* JADX WARN: Code duplicated, block: B:123:0x017d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x0186  */
    /* JADX WARN: Code duplicated, block: B:130:0x018d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0192  */
    /* JADX WARN: Code duplicated, block: B:134:0x0196  */
    /* JADX WARN: Code duplicated, block: B:136:0x019e  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:170:0x0207  */
    /* JADX WARN: Code duplicated, block: B:176:0x0239  */
    /* JADX WARN: Code duplicated, block: B:178:0x0240  */
    /* JADX WARN: Code duplicated, block: B:186:0x028e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x0290  */
    /* JADX WARN: Code duplicated, block: B:188:0x0293  */
    /* JADX WARN: Code duplicated, block: B:190:0x0297  */
    /* JADX WARN: Code duplicated, block: B:191:0x029e  */
    /* JADX WARN: Code duplicated, block: B:193:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:194:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:196:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:197:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:199:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:200:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:202:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:203:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:205:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:206:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:208:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:209:0x02da  */
    /* JADX WARN: Code duplicated, block: B:211:0x02de  */
    /* JADX WARN: Code duplicated, block: B:212:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:215:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:216:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:218:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:219:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:221:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:222:0x0300  */
    /* JADX WARN: Code duplicated, block: B:224:0x0304  */
    /* JADX WARN: Code duplicated, block: B:225:0x0306  */
    /* JADX WARN: Code duplicated, block: B:227:0x030a  */
    /* JADX WARN: Code duplicated, block: B:229:0x032a  */
    /* JADX WARN: Code duplicated, block: B:232:0x0344  */
    /* JADX WARN: Code duplicated, block: B:235:0x035e  */
    /* JADX WARN: Code duplicated, block: B:238:0x03a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:243:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:246:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:248:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:251:0x0419  */
    /* JADX WARN: Code duplicated, block: B:255:0x0423  */
    /* JADX WARN: Code duplicated, block: B:257:0x0431  */
    /* JADX WARN: Code duplicated, block: B:260:0x0441  */
    /* JADX WARN: Code duplicated, block: B:265:0x046e  */
    /* JADX WARN: Code duplicated, block: B:268:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:271:0x050f  */
    /* JADX WARN: Code duplicated, block: B:274:0x0575  */
    /* JADX WARN: Code duplicated, block: B:277:0x059b  */
    /* JADX WARN: Code duplicated, block: B:280:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:281:0x05d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:283:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:285:0x0609  */
    /* JADX WARN: Code duplicated, block: B:288:0x0616  */
    /* JADX WARN: Code duplicated, block: B:289:0x0647  */
    /* JADX WARN: Code duplicated, block: B:292:0x06a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:294:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:297:0x06da  */
    /* JADX WARN: Code duplicated, block: B:298:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:301:0x0731  */
    /* JADX WARN: Code duplicated, block: B:306:0x0740  */
    /* JADX WARN: Code duplicated, block: B:308:0x0744  */
    /* JADX WARN: Code duplicated, block: B:309:0x074b  */
    /* JADX WARN: Code duplicated, block: B:312:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:317:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00be  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00de  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x0104  */
    /* JADX WARN: Code duplicated, block: B:83:0x0107  */
    /* JADX WARN: Code duplicated, block: B:87:0x010f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    /* JADX WARN: Code duplicated, block: B:90:0x011e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0124  */
    /* JADX WARN: Code duplicated, block: B:93:0x0127  */
    /* JADX WARN: Code duplicated, block: B:97:0x012f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0136  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    public static final void CoreTextField(@NotNull TextFieldValue value, @NotNull Function1<? super TextFieldValue, Unit> onValueChange, @Nullable Modifier modifier, @Nullable TextStyle textStyle, @Nullable VisualTransformation visualTransformation, @Nullable Function1<? super TextLayoutResult, Unit> function1, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Brush brush, boolean z10, int i10, int i11, @Nullable ImeOptions imeOptions, @Nullable KeyboardActions keyboardActions, boolean z11, boolean z12, @Nullable Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        Modifier modifier2;
        TextStyle textStyle2;
        VisualTransformation none;
        Function1<? super TextLayoutResult, Unit> function2;
        MutableInteractionSource mutableInteractionSource2;
        Brush solidColor;
        boolean z13;
        int i40;
        int i41;
        ImeOptions imeOptions2;
        KeyboardActions keyboardActions2;
        boolean z14;
        boolean z15;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3M498getLambda1$foundation_release;
        VisualTransformation visualTransformation2;
        Function1<? super TextLayoutResult, Unit> function4;
        MutableInteractionSource mutableInteractionSource3;
        int i42;
        ImeOptions imeOptions3;
        int i43;
        Object objRememberedValue;
        Composer.Companion companion;
        FocusRequester focusRequester;
        TextInputService textInputService;
        Density density;
        FontFamily.Resolver resolver;
        Orientation orientation;
        Orientation orientation2;
        boolean zChanged;
        int i44;
        Object objRememberedValue2;
        boolean zChanged2;
        Object objRememberedValue3;
        TransformedText transformedTextFilterWithValidation;
        TextRange composition;
        MutableInteractionSource mutableInteractionSource4;
        AnnotatedString text;
        OffsetMapping offsetMapping;
        RecomposeScope currentRecomposeScope;
        Object objRememberedValue4;
        TextFieldState textFieldState;
        Object objRememberedValue5;
        UndoManager undoManager;
        Object objRememberedValue6;
        TextFieldSelectionManager textFieldSelectionManager;
        Object objRememberedValue7;
        Object objRememberedValue8;
        Modifier.Companion companion2;
        MutableInteractionSource mutableInteractionSource5;
        boolean z16;
        Modifier modifierPointerHoverIcon$default;
        boolean z17;
        boolean z18;
        boolean z19;
        Modifier modifierTextFieldMagnifier;
        Composer composer2;
        TextStyle textStyle3;
        VisualTransformation visualTransformation3;
        Function1<? super TextLayoutResult, Unit> function5;
        Brush brush2;
        boolean z20;
        int i45;
        KeyboardActions keyboardActions3;
        MutableInteractionSource mutableInteractionSource6;
        boolean z21;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function6;
        Modifier modifier3;
        boolean z22;
        ImeOptions imeOptions4;
        int i46;
        boolean z23;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-958708118);
        if ((i14 & 1) != 0) {
            i15 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i15 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i12 & 112) == 0) {
            i15 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i47 = i14 & 4;
        if (i47 == 0) {
            if ((i12 & 896) == 0) {
                i15 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i12 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(textStyle)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    i15 |= 24576;
                } else if ((i12 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(visualTransformation)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i15 |= i19;
                }
                i20 = i14 & 32;
                if (i20 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i12 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i15 |= i21;
                }
                i22 = i14 & 64;
                if (i22 != 0) {
                    i15 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i15 |= i23;
                }
                i24 = i14 & 128;
                if (i24 != 0) {
                    i15 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(brush)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 256;
                if (i26 != 0) {
                    i15 |= 100663296;
                } else if ((i12 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i27 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i27 = 33554432;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 512;
                if (i28 != 0) {
                    i15 |= 805306368;
                } else if ((i12 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(i10)) {
                        i29 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i29 = 268435456;
                    }
                    i15 |= i29;
                }
                i30 = i14 & 1024;
                if (i30 != 0) {
                    i31 = i13 | 6;
                } else if ((i13 & 14) == 0) {
                    if (composerStartRestartGroup.changed(i11)) {
                        i32 = 4;
                    } else {
                        i32 = 2;
                    }
                    i31 = i13 | i32;
                } else {
                    i31 = i13;
                }
                if ((i13 & 112) != 0) {
                    i31 |= ((i14 & 2048) == 0 || !composerStartRestartGroup.changed(imeOptions)) ? 16 : 32;
                }
                i33 = i31;
                i34 = i14 & 4096;
                if (i34 != 0) {
                    if ((i13 & 896) == 0) {
                        if (composerStartRestartGroup.changed(keyboardActions)) {
                            i35 = 256;
                        } else {
                            i35 = 128;
                        }
                        i33 |= i35;
                    }
                    i36 = i14 & 8192;
                    if (i36 != 0) {
                        if ((i13 & 7168) == 0) {
                            i33 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
                        }
                        i37 = i14 & 16384;
                        if (i37 != 0) {
                            i33 |= 24576;
                        } else if ((i13 & 57344) == 0) {
                            i33 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
                        }
                        i38 = i14 & 32768;
                        if (i38 != 0) {
                            i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i13 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(function3)) {
                                i39 = 131072;
                            } else {
                                i39 = 65536;
                            }
                            i33 |= i39;
                        }
                        if ((i15 & 1533916891) != 306783378 && (374491 & i33) == 74898 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            textStyle3 = textStyle;
                            visualTransformation3 = visualTransformation;
                            function5 = function1;
                            mutableInteractionSource6 = mutableInteractionSource;
                            brush2 = brush;
                            z20 = z10;
                            i45 = i11;
                            imeOptions4 = imeOptions;
                            keyboardActions3 = keyboardActions;
                            z22 = z11;
                            z21 = z12;
                            function6 = function3;
                            composer2 = composerStartRestartGroup;
                            i46 = i10;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i12 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i47 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i16 != 0) {
                                    textStyle2 = TextStyle.INSTANCE.getDefault();
                                } else {
                                    textStyle2 = textStyle;
                                }
                                if (i18 != 0) {
                                    none = VisualTransformation.INSTANCE.getNone();
                                } else {
                                    none = visualTransformation;
                                }
                                if (i20 != 0) {
                                    function2 = a.f5816p0;
                                } else {
                                    function2 = function1;
                                }
                                if (i22 != 0) {
                                    mutableInteractionSource2 = null;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if (i24 != 0) {
                                    solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                                } else {
                                    solidColor = brush;
                                }
                                if (i26 != 0) {
                                    z13 = true;
                                } else {
                                    z13 = z10;
                                }
                                if (i28 != 0) {
                                    i40 = Integer.MAX_VALUE;
                                } else {
                                    i40 = i10;
                                }
                                if (i30 != 0) {
                                    i41 = 1;
                                } else {
                                    i41 = i11;
                                }
                                if ((i14 & 2048) != 0) {
                                    imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                    i33 &= -113;
                                } else {
                                    imeOptions2 = imeOptions;
                                }
                                if (i34 != 0) {
                                    keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                                } else {
                                    keyboardActions2 = keyboardActions;
                                }
                                if (i36 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = z11;
                                }
                                if (i37 != 0) {
                                    z15 = false;
                                } else {
                                    z15 = z12;
                                }
                                if (i38 != 0) {
                                    function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                                } else {
                                    function3M498getLambda1$foundation_release = function3;
                                }
                                visualTransformation2 = none;
                                function4 = function2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                i42 = i40;
                                imeOptions3 = imeOptions2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i14 & 2048) != 0) {
                                    modifier2 = modifier;
                                    textStyle2 = textStyle;
                                    visualTransformation2 = visualTransformation;
                                    function4 = function1;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    solidColor = brush;
                                    z13 = z10;
                                    i42 = i10;
                                    i41 = i11;
                                    imeOptions3 = imeOptions;
                                    keyboardActions2 = keyboardActions;
                                    z14 = z11;
                                    z15 = z12;
                                    function3M498getLambda1$foundation_release = function3;
                                    i43 = i33 & (-113);
                                } else {
                                    modifier2 = modifier;
                                    textStyle2 = textStyle;
                                    visualTransformation2 = visualTransformation;
                                    function4 = function1;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    solidColor = brush;
                                    z13 = z10;
                                    i42 = i10;
                                    i41 = i11;
                                    imeOptions3 = imeOptions;
                                    keyboardActions2 = keyboardActions;
                                    z14 = z11;
                                    z15 = z12;
                                    function3M498getLambda1$foundation_release = function3;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                                }
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = new FocusRequester();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                focusRequester = (FocusRequester) objRememberedValue;
                                textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                                long backgroundColor = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                                FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                                if (i42 == 1 || z13 || !imeOptions3.getSingleLine()) {
                                    orientation = Orientation.Vertical;
                                } else {
                                    orientation = Orientation.Horizontal;
                                }
                                orientation2 = orientation;
                                Object[] objArr = {orientation2};
                                Saver<TextFieldScrollerPosition, Object> saver = TextFieldScrollerPosition.INSTANCE.getSaver();
                                Modifier modifier4 = modifier2;
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(orientation2);
                                i44 = i42;
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new l(orientation2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                TextFieldScrollerPosition textFieldScrollerPosition = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                                composerStartRestartGroup.startReplaceableGroup(511388516);
                                zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                                    transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                                    composition = value.getComposition();
                                    if (composition != null) {
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                        if (objRememberedValue3 == null) {
                                        }
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    } else {
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    }
                                    objRememberedValue3 = transformedTextFilterWithValidation;
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                } else {
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                TransformedText transformedText = (TransformedText) objRememberedValue3;
                                text = transformedText.getText();
                                offsetMapping = transformedText.getOffsetMapping();
                                currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                int i48 = i43;
                                if (objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                textFieldState = (TextFieldState) objRememberedValue4;
                                textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager, backgroundColor);
                                textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = new UndoManager(0, 1, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                undoManager = (UndoManager) objRememberedValue5;
                                UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue6 == companion.getEmpty()) {
                                    objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                                textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                                textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                                textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                                textFieldSelectionManager.setState$foundation_release(textFieldState);
                                textFieldSelectionManager.setValue$foundation_release(value);
                                textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                                textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                                textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                                textFieldSelectionManager.setFocusRequester(focusRequester);
                                textFieldSelectionManager.setEditable(!z15);
                                composerStartRestartGroup.startReplaceableGroup(773894976);
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue7 == companion.getEmpty()) {
                                    objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue8 == companion.getEmpty()) {
                                    objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) objRememberedValue8;
                                companion2 = Modifier.INSTANCE;
                                i iVar = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope, bringIntoViewRequester);
                                mutableInteractionSource5 = mutableInteractionSource4;
                                Modifier modifierTextFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar);
                                composerStartRestartGroup.startReplaceableGroup(-55008004);
                                if (textInputService == null) {
                                    if (z14 || z15) {
                                        z23 = false;
                                    } else {
                                        z23 = true;
                                    }
                                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                if (TouchMode_androidKt.isInTouchMode()) {
                                    z16 = false;
                                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                                } else {
                                    z16 = false;
                                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                                }
                                Modifier modifierDrawBehind = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                                Modifier modifierSemantics = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                                if (z14 || z15) {
                                    z17 = z16;
                                } else {
                                    z17 = true;
                                }
                                Modifier modifierCursor = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                                EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                                EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i48 >> 3) & 14);
                                Function1<TextFieldValue, Unit> onValueChange2 = textFieldState.getOnValueChange();
                                boolean z24 = !z15;
                                if (i44 == 1) {
                                    z18 = true;
                                } else {
                                    z18 = z16;
                                }
                                Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier4.then(modifierTextFieldFocusModifier), textFieldState, focusManager), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange2, z24, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics), new g(textFieldState));
                                if (!z14 && textFieldState.getHasFocus() && TouchMode_androidKt.isInTouchMode()) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                if (z19) {
                                    modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                                } else {
                                    modifierTextFieldMagnifier = companion2;
                                }
                                boolean z25 = z14;
                                ImeOptions imeOptions5 = imeOptions3;
                                VisualTransformation visualTransformation4 = visualTransformation2;
                                composer2 = composerStartRestartGroup;
                                a(modifierOnGloballyPositioned2, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i48, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition, value, visualTransformation2, modifierCursor, modifierDrawBehind, modifierOnGloballyPositioned, modifierTextFieldMagnifier, bringIntoViewRequester, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                textStyle3 = textStyle2;
                                visualTransformation3 = visualTransformation4;
                                function5 = function4;
                                brush2 = solidColor;
                                z20 = z13;
                                i45 = i41;
                                keyboardActions3 = keyboardActions2;
                                mutableInteractionSource6 = mutableInteractionSource5;
                                z21 = z15;
                                function6 = function3M498getLambda1$foundation_release;
                                modifier3 = modifier4;
                                z22 = z25;
                                imeOptions4 = imeOptions5;
                                i46 = i44;
                            }
                            i43 = i33;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new FocusRequester();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            focusRequester = (FocusRequester) objRememberedValue;
                            textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                            long backgroundColor2 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                            FocusManager focusManager2 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                            if (i42 == 1) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Vertical;
                            }
                            orientation2 = orientation;
                            Object[] objArr2 = {orientation2};
                            Saver<TextFieldScrollerPosition, Object> saver2 = TextFieldScrollerPosition.INSTANCE.getSaver();
                            Modifier modifier5 = modifier2;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(orientation2);
                            i44 = i42;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = new l(orientation2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new l(orientation2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            TextFieldScrollerPosition textFieldScrollerPosition2 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr2, (Saver) saver2, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                                composition = value.getComposition();
                                if (composition != null) {
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                    if (objRememberedValue3 == null) {
                                    }
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                } else {
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                                objRememberedValue3 = transformedTextFilterWithValidation;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                                composition = value.getComposition();
                                if (composition != null) {
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                    if (objRememberedValue3 == null) {
                                    }
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                } else {
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                                objRememberedValue3 = transformedTextFilterWithValidation;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            TransformedText transformedText2 = (TransformedText) objRememberedValue3;
                            text = transformedText2.getText();
                            offsetMapping = transformedText2.getOffsetMapping();
                            currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            int i49 = i43;
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            textFieldState = (TextFieldState) objRememberedValue4;
                            textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager2, backgroundColor2);
                            textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = new UndoManager(0, 1, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            undoManager = (UndoManager) objRememberedValue5;
                            UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == companion.getEmpty()) {
                                objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                            textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                            textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                            textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                            textFieldSelectionManager.setState$foundation_release(textFieldState);
                            textFieldSelectionManager.setValue$foundation_release(value);
                            textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                            textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                            textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                            textFieldSelectionManager.setFocusRequester(focusRequester);
                            textFieldSelectionManager.setEditable(!z15);
                            composerStartRestartGroup.startReplaceableGroup(773894976);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == companion.getEmpty()) {
                                objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue8 == companion.getEmpty()) {
                                objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            BringIntoViewRequester bringIntoViewRequester2 = (BringIntoViewRequester) objRememberedValue8;
                            companion2 = Modifier.INSTANCE;
                            i iVar2 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope2, bringIntoViewRequester2);
                            mutableInteractionSource5 = mutableInteractionSource4;
                            Modifier modifierTextFieldFocusModifier2 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar2);
                            composerStartRestartGroup.startReplaceableGroup(-55008004);
                            if (textInputService == null) {
                                if (z14) {
                                    z23 = false;
                                } else {
                                    z23 = false;
                                }
                                EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (TouchMode_androidKt.isInTouchMode()) {
                                z16 = false;
                                modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                            } else {
                                z16 = false;
                                modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                            }
                            Modifier modifierDrawBehind2 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                            Modifier modifierOnGloballyPositioned3 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                            Modifier modifierSemantics2 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText2, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                            if (z14) {
                                z17 = z16;
                            } else {
                                z17 = z16;
                            }
                            Modifier modifierCursor2 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                            EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                            EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i49 >> 3) & 14);
                            Function1<TextFieldValue, Unit> onValueChange3 = textFieldState.getOnValueChange();
                            boolean z26 = !z15;
                            if (i44 == 1) {
                                z18 = true;
                            } else {
                                z18 = z16;
                            }
                            Modifier modifierOnGloballyPositioned4 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier5.then(modifierTextFieldFocusModifier2), textFieldState, focusManager2), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange3, z26, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition2, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics2), new g(textFieldState));
                            if (!z14) {
                                z19 = false;
                            } else {
                                z19 = false;
                            }
                            if (z19) {
                                modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                            } else {
                                modifierTextFieldMagnifier = companion2;
                            }
                            boolean z27 = z14;
                            ImeOptions imeOptions6 = imeOptions3;
                            VisualTransformation visualTransformation5 = visualTransformation2;
                            composer2 = composerStartRestartGroup;
                            a(modifierOnGloballyPositioned4, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i49, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition2, value, visualTransformation2, modifierCursor2, modifierDrawBehind2, modifierOnGloballyPositioned3, modifierTextFieldMagnifier, bringIntoViewRequester2, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            textStyle3 = textStyle2;
                            visualTransformation3 = visualTransformation5;
                            function5 = function4;
                            brush2 = solidColor;
                            z20 = z13;
                            i45 = i41;
                            keyboardActions3 = keyboardActions2;
                            mutableInteractionSource6 = mutableInteractionSource5;
                            z21 = z15;
                            function6 = function3M498getLambda1$foundation_release;
                            modifier3 = modifier5;
                            z22 = z27;
                            imeOptions4 = imeOptions6;
                            i46 = i44;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new f(value, onValueChange, modifier3, textStyle3, visualTransformation3, function5, mutableInteractionSource6, brush2, z20, i46, i45, imeOptions4, keyboardActions3, z22, z21, function6, i12, i13, i14));
                    }
                    i33 |= 3072;
                    i37 = i14 & 16384;
                    if (i37 != 0) {
                        i33 |= 24576;
                    } else if ((i13 & 57344) == 0) {
                        i33 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
                    }
                    i38 = i14 & 32768;
                    if (i38 != 0) {
                        i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i13 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i39 = 131072;
                        } else {
                            i39 = 65536;
                        }
                        i33 |= i39;
                    }
                    if ((i15 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i12 & 1) != 0) {
                            if (i47 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i16 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i18 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i20 != 0) {
                                function2 = a.f5816p0;
                            } else {
                                function2 = function1;
                            }
                            if (i22 != 0) {
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if (i24 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                            } else {
                                solidColor = brush;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i28 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i10;
                            }
                            if (i30 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i11;
                            }
                            if ((i14 & 2048) != 0) {
                                imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                i33 &= -113;
                            } else {
                                imeOptions2 = imeOptions;
                            }
                            if (i34 != 0) {
                                keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            } else {
                                keyboardActions2 = keyboardActions;
                            }
                            if (i36 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i37 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i38 != 0) {
                                function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                            } else {
                                function3M498getLambda1$foundation_release = function3;
                            }
                            visualTransformation2 = none;
                            function4 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i42 = i40;
                            imeOptions3 = imeOptions2;
                            i43 = i33;
                        } else {
                            if (i47 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i16 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i18 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i20 != 0) {
                                function2 = a.f5816p0;
                            } else {
                                function2 = function1;
                            }
                            if (i22 != 0) {
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if (i24 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                            } else {
                                solidColor = brush;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i28 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i10;
                            }
                            if (i30 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i11;
                            }
                            if ((i14 & 2048) != 0) {
                                imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                i33 &= -113;
                            } else {
                                imeOptions2 = imeOptions;
                            }
                            if (i34 != 0) {
                                keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            } else {
                                keyboardActions2 = keyboardActions;
                            }
                            if (i36 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i37 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i38 != 0) {
                                function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                            } else {
                                function3M498getLambda1$foundation_release = function3;
                            }
                            visualTransformation2 = none;
                            function4 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i42 = i40;
                            imeOptions3 = imeOptions2;
                            i43 = i33;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new FocusRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        focusRequester = (FocusRequester) objRememberedValue;
                        textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                        long backgroundColor3 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                        FocusManager focusManager3 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                        if (i42 == 1) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Vertical;
                        }
                        orientation2 = orientation;
                        Object[] objArr3 = {orientation2};
                        Saver<TextFieldScrollerPosition, Object> saver3 = TextFieldScrollerPosition.INSTANCE.getSaver();
                        Modifier modifier6 = modifier2;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(orientation2);
                        i44 = i42;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new l(orientation2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new l(orientation2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TextFieldScrollerPosition textFieldScrollerPosition3 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr3, (Saver) saver3, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                            composition = value.getComposition();
                            if (composition != null) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                if (objRememberedValue3 == null) {
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            objRememberedValue3 = transformedTextFilterWithValidation;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                            composition = value.getComposition();
                            if (composition != null) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                if (objRememberedValue3 == null) {
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            objRememberedValue3 = transformedTextFilterWithValidation;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TransformedText transformedText3 = (TransformedText) objRememberedValue3;
                        text = transformedText3.getText();
                        offsetMapping = transformedText3.getOffsetMapping();
                        currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        int i410 = i43;
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        textFieldState = (TextFieldState) objRememberedValue4;
                        textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager3, backgroundColor3);
                        textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new UndoManager(0, 1, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        undoManager = (UndoManager) objRememberedValue5;
                        UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                        textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                        textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                        textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                        textFieldSelectionManager.setState$foundation_release(textFieldState);
                        textFieldSelectionManager.setValue$foundation_release(value);
                        textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                        textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                        textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                        textFieldSelectionManager.setFocusRequester(focusRequester);
                        textFieldSelectionManager.setEditable(!z15);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope3 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                            objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BringIntoViewRequester bringIntoViewRequester3 = (BringIntoViewRequester) objRememberedValue8;
                        companion2 = Modifier.INSTANCE;
                        i iVar3 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope3, bringIntoViewRequester3);
                        mutableInteractionSource5 = mutableInteractionSource4;
                        Modifier modifierTextFieldFocusModifier3 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar3);
                        composerStartRestartGroup.startReplaceableGroup(-55008004);
                        if (textInputService == null) {
                            if (z14) {
                                z23 = false;
                            } else {
                                z23 = false;
                            }
                            EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (TouchMode_androidKt.isInTouchMode()) {
                            z16 = false;
                            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        } else {
                            z16 = false;
                            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        }
                        Modifier modifierDrawBehind3 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                        Modifier modifierOnGloballyPositioned5 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                        Modifier modifierSemantics3 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText3, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                        if (z14) {
                            z17 = z16;
                        } else {
                            z17 = z16;
                        }
                        Modifier modifierCursor3 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                        EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                        EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i410 >> 3) & 14);
                        Function1<TextFieldValue, Unit> onValueChange4 = textFieldState.getOnValueChange();
                        boolean z28 = !z15;
                        if (i44 == 1) {
                            z18 = true;
                        } else {
                            z18 = z16;
                        }
                        Modifier modifierOnGloballyPositioned6 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier6.then(modifierTextFieldFocusModifier3), textFieldState, focusManager3), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange4, z28, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition3, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics3), new g(textFieldState));
                        if (!z14) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                        } else {
                            modifierTextFieldMagnifier = companion2;
                        }
                        boolean z29 = z14;
                        ImeOptions imeOptions7 = imeOptions3;
                        VisualTransformation visualTransformation6 = visualTransformation2;
                        composer2 = composerStartRestartGroup;
                        a(modifierOnGloballyPositioned6, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i410, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition3, value, visualTransformation2, modifierCursor3, modifierDrawBehind3, modifierOnGloballyPositioned5, modifierTextFieldMagnifier, bringIntoViewRequester3, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        textStyle3 = textStyle2;
                        visualTransformation3 = visualTransformation6;
                        function5 = function4;
                        brush2 = solidColor;
                        z20 = z13;
                        i45 = i41;
                        keyboardActions3 = keyboardActions2;
                        mutableInteractionSource6 = mutableInteractionSource5;
                        z21 = z15;
                        function6 = function3M498getLambda1$foundation_release;
                        modifier3 = modifier6;
                        z22 = z29;
                        imeOptions4 = imeOptions7;
                        i46 = i44;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i12 & 1) != 0) {
                            if (i47 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i16 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i18 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i20 != 0) {
                                function2 = a.f5816p0;
                            } else {
                                function2 = function1;
                            }
                            if (i22 != 0) {
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if (i24 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                            } else {
                                solidColor = brush;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i28 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i10;
                            }
                            if (i30 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i11;
                            }
                            if ((i14 & 2048) != 0) {
                                imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                i33 &= -113;
                            } else {
                                imeOptions2 = imeOptions;
                            }
                            if (i34 != 0) {
                                keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            } else {
                                keyboardActions2 = keyboardActions;
                            }
                            if (i36 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i37 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i38 != 0) {
                                function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                            } else {
                                function3M498getLambda1$foundation_release = function3;
                            }
                            visualTransformation2 = none;
                            function4 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i42 = i40;
                            imeOptions3 = imeOptions2;
                            i43 = i33;
                        } else {
                            if (i47 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i16 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i18 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i20 != 0) {
                                function2 = a.f5816p0;
                            } else {
                                function2 = function1;
                            }
                            if (i22 != 0) {
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if (i24 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                            } else {
                                solidColor = brush;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i28 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i10;
                            }
                            if (i30 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i11;
                            }
                            if ((i14 & 2048) != 0) {
                                imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                i33 &= -113;
                            } else {
                                imeOptions2 = imeOptions;
                            }
                            if (i34 != 0) {
                                keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            } else {
                                keyboardActions2 = keyboardActions;
                            }
                            if (i36 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i37 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i38 != 0) {
                                function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                            } else {
                                function3M498getLambda1$foundation_release = function3;
                            }
                            visualTransformation2 = none;
                            function4 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i42 = i40;
                            imeOptions3 = imeOptions2;
                            i43 = i33;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new FocusRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        focusRequester = (FocusRequester) objRememberedValue;
                        textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                        long backgroundColor4 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                        FocusManager focusManager4 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                        if (i42 == 1) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Vertical;
                        }
                        orientation2 = orientation;
                        Object[] objArr4 = {orientation2};
                        Saver<TextFieldScrollerPosition, Object> saver4 = TextFieldScrollerPosition.INSTANCE.getSaver();
                        Modifier modifier7 = modifier2;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(orientation2);
                        i44 = i42;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new l(orientation2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new l(orientation2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TextFieldScrollerPosition textFieldScrollerPosition4 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr4, (Saver) saver4, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                            composition = value.getComposition();
                            if (composition != null) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                if (objRememberedValue3 == null) {
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            objRememberedValue3 = transformedTextFilterWithValidation;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                            composition = value.getComposition();
                            if (composition != null) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                if (objRememberedValue3 == null) {
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            objRememberedValue3 = transformedTextFilterWithValidation;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TransformedText transformedText4 = (TransformedText) objRememberedValue3;
                        text = transformedText4.getText();
                        offsetMapping = transformedText4.getOffsetMapping();
                        currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        int i411 = i43;
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        textFieldState = (TextFieldState) objRememberedValue4;
                        textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager4, backgroundColor4);
                        textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new UndoManager(0, 1, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        undoManager = (UndoManager) objRememberedValue5;
                        UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                        textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                        textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                        textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                        textFieldSelectionManager.setState$foundation_release(textFieldState);
                        textFieldSelectionManager.setValue$foundation_release(value);
                        textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                        textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                        textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                        textFieldSelectionManager.setFocusRequester(focusRequester);
                        textFieldSelectionManager.setEditable(!z15);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope4 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                            objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BringIntoViewRequester bringIntoViewRequester4 = (BringIntoViewRequester) objRememberedValue8;
                        companion2 = Modifier.INSTANCE;
                        i iVar4 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope4, bringIntoViewRequester4);
                        mutableInteractionSource5 = mutableInteractionSource4;
                        Modifier modifierTextFieldFocusModifier4 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar4);
                        composerStartRestartGroup.startReplaceableGroup(-55008004);
                        if (textInputService == null) {
                            if (z14) {
                                z23 = false;
                            } else {
                                z23 = false;
                            }
                            EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (TouchMode_androidKt.isInTouchMode()) {
                            z16 = false;
                            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        } else {
                            z16 = false;
                            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        }
                        Modifier modifierDrawBehind4 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                        Modifier modifierOnGloballyPositioned7 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                        Modifier modifierSemantics4 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText4, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                        if (z14) {
                            z17 = z16;
                        } else {
                            z17 = z16;
                        }
                        Modifier modifierCursor4 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                        EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                        EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i411 >> 3) & 14);
                        Function1<TextFieldValue, Unit> onValueChange5 = textFieldState.getOnValueChange();
                        boolean z210 = !z15;
                        if (i44 == 1) {
                            z18 = true;
                        } else {
                            z18 = z16;
                        }
                        Modifier modifierOnGloballyPositioned8 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier7.then(modifierTextFieldFocusModifier4), textFieldState, focusManager4), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange5, z210, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition4, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics4), new g(textFieldState));
                        if (!z14) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                        } else {
                            modifierTextFieldMagnifier = companion2;
                        }
                        boolean z211 = z14;
                        ImeOptions imeOptions8 = imeOptions3;
                        VisualTransformation visualTransformation7 = visualTransformation2;
                        composer2 = composerStartRestartGroup;
                        a(modifierOnGloballyPositioned8, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i411, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition4, value, visualTransformation2, modifierCursor4, modifierDrawBehind4, modifierOnGloballyPositioned7, modifierTextFieldMagnifier, bringIntoViewRequester4, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        textStyle3 = textStyle2;
                        visualTransformation3 = visualTransformation7;
                        function5 = function4;
                        brush2 = solidColor;
                        z20 = z13;
                        i45 = i41;
                        keyboardActions3 = keyboardActions2;
                        mutableInteractionSource6 = mutableInteractionSource5;
                        z21 = z15;
                        function6 = function3M498getLambda1$foundation_release;
                        modifier3 = modifier7;
                        z22 = z211;
                        imeOptions4 = imeOptions8;
                        i46 = i44;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(value, onValueChange, modifier3, textStyle3, visualTransformation3, function5, mutableInteractionSource6, brush2, z20, i46, i45, imeOptions4, keyboardActions3, z22, z21, function6, i12, i13, i14));
                }
                i33 |= BluetoothState.REQUEST_CONNECT_DEVICE;
                i36 = i14 & 8192;
                if (i36 != 0) {
                    if ((i13 & 7168) == 0) {
                        i33 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
                    }
                    i37 = i14 & 16384;
                    if (i37 != 0) {
                        i33 |= 24576;
                    } else if ((i13 & 57344) == 0) {
                        i33 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
                    }
                    i38 = i14 & 32768;
                    if (i38 != 0) {
                        i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i13 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i39 = 131072;
                        } else {
                            i39 = 65536;
                        }
                        i33 |= i39;
                    }
                    if ((i15 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i12 & 1) != 0) {
                            if (i47 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i16 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i18 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i20 != 0) {
                                function2 = a.f5816p0;
                            } else {
                                function2 = function1;
                            }
                            if (i22 != 0) {
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if (i24 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                            } else {
                                solidColor = brush;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i28 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i10;
                            }
                            if (i30 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i11;
                            }
                            if ((i14 & 2048) != 0) {
                                imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                i33 &= -113;
                            } else {
                                imeOptions2 = imeOptions;
                            }
                            if (i34 != 0) {
                                keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            } else {
                                keyboardActions2 = keyboardActions;
                            }
                            if (i36 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i37 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i38 != 0) {
                                function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                            } else {
                                function3M498getLambda1$foundation_release = function3;
                            }
                            visualTransformation2 = none;
                            function4 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i42 = i40;
                            imeOptions3 = imeOptions2;
                            i43 = i33;
                        } else {
                            if (i47 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i16 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i18 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i20 != 0) {
                                function2 = a.f5816p0;
                            } else {
                                function2 = function1;
                            }
                            if (i22 != 0) {
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if (i24 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                            } else {
                                solidColor = brush;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i28 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i10;
                            }
                            if (i30 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i11;
                            }
                            if ((i14 & 2048) != 0) {
                                imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                i33 &= -113;
                            } else {
                                imeOptions2 = imeOptions;
                            }
                            if (i34 != 0) {
                                keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            } else {
                                keyboardActions2 = keyboardActions;
                            }
                            if (i36 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i37 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i38 != 0) {
                                function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                            } else {
                                function3M498getLambda1$foundation_release = function3;
                            }
                            visualTransformation2 = none;
                            function4 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i42 = i40;
                            imeOptions3 = imeOptions2;
                            i43 = i33;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new FocusRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        focusRequester = (FocusRequester) objRememberedValue;
                        textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                        long backgroundColor5 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                        FocusManager focusManager5 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                        if (i42 == 1) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Vertical;
                        }
                        orientation2 = orientation;
                        Object[] objArr5 = {orientation2};
                        Saver<TextFieldScrollerPosition, Object> saver5 = TextFieldScrollerPosition.INSTANCE.getSaver();
                        Modifier modifier8 = modifier2;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(orientation2);
                        i44 = i42;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new l(orientation2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new l(orientation2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TextFieldScrollerPosition textFieldScrollerPosition5 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr5, (Saver) saver5, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                            composition = value.getComposition();
                            if (composition != null) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                if (objRememberedValue3 == null) {
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            objRememberedValue3 = transformedTextFilterWithValidation;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                            composition = value.getComposition();
                            if (composition != null) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                if (objRememberedValue3 == null) {
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            objRememberedValue3 = transformedTextFilterWithValidation;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TransformedText transformedText5 = (TransformedText) objRememberedValue3;
                        text = transformedText5.getText();
                        offsetMapping = transformedText5.getOffsetMapping();
                        currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        int i412 = i43;
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        textFieldState = (TextFieldState) objRememberedValue4;
                        textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager5, backgroundColor5);
                        textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new UndoManager(0, 1, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        undoManager = (UndoManager) objRememberedValue5;
                        UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                        textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                        textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                        textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                        textFieldSelectionManager.setState$foundation_release(textFieldState);
                        textFieldSelectionManager.setValue$foundation_release(value);
                        textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                        textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                        textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                        textFieldSelectionManager.setFocusRequester(focusRequester);
                        textFieldSelectionManager.setEditable(!z15);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope5 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                            objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BringIntoViewRequester bringIntoViewRequester5 = (BringIntoViewRequester) objRememberedValue8;
                        companion2 = Modifier.INSTANCE;
                        i iVar5 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope5, bringIntoViewRequester5);
                        mutableInteractionSource5 = mutableInteractionSource4;
                        Modifier modifierTextFieldFocusModifier5 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar5);
                        composerStartRestartGroup.startReplaceableGroup(-55008004);
                        if (textInputService == null) {
                            if (z14) {
                                z23 = false;
                            } else {
                                z23 = false;
                            }
                            EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (TouchMode_androidKt.isInTouchMode()) {
                            z16 = false;
                            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        } else {
                            z16 = false;
                            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        }
                        Modifier modifierDrawBehind5 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                        Modifier modifierOnGloballyPositioned9 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                        Modifier modifierSemantics5 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText5, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                        if (z14) {
                            z17 = z16;
                        } else {
                            z17 = z16;
                        }
                        Modifier modifierCursor5 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                        EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                        EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i412 >> 3) & 14);
                        Function1<TextFieldValue, Unit> onValueChange6 = textFieldState.getOnValueChange();
                        boolean z212 = !z15;
                        if (i44 == 1) {
                            z18 = true;
                        } else {
                            z18 = z16;
                        }
                        Modifier modifierOnGloballyPositioned10 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier8.then(modifierTextFieldFocusModifier5), textFieldState, focusManager5), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange6, z212, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition5, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics5), new g(textFieldState));
                        if (!z14) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                        } else {
                            modifierTextFieldMagnifier = companion2;
                        }
                        boolean z213 = z14;
                        ImeOptions imeOptions9 = imeOptions3;
                        VisualTransformation visualTransformation8 = visualTransformation2;
                        composer2 = composerStartRestartGroup;
                        a(modifierOnGloballyPositioned10, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i412, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition5, value, visualTransformation2, modifierCursor5, modifierDrawBehind5, modifierOnGloballyPositioned9, modifierTextFieldMagnifier, bringIntoViewRequester5, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        textStyle3 = textStyle2;
                        visualTransformation3 = visualTransformation8;
                        function5 = function4;
                        brush2 = solidColor;
                        z20 = z13;
                        i45 = i41;
                        keyboardActions3 = keyboardActions2;
                        mutableInteractionSource6 = mutableInteractionSource5;
                        z21 = z15;
                        function6 = function3M498getLambda1$foundation_release;
                        modifier3 = modifier8;
                        z22 = z213;
                        imeOptions4 = imeOptions9;
                        i46 = i44;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i12 & 1) != 0) {
                            if (i47 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i16 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i18 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i20 != 0) {
                                function2 = a.f5816p0;
                            } else {
                                function2 = function1;
                            }
                            if (i22 != 0) {
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if (i24 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                            } else {
                                solidColor = brush;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i28 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i10;
                            }
                            if (i30 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i11;
                            }
                            if ((i14 & 2048) != 0) {
                                imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                i33 &= -113;
                            } else {
                                imeOptions2 = imeOptions;
                            }
                            if (i34 != 0) {
                                keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            } else {
                                keyboardActions2 = keyboardActions;
                            }
                            if (i36 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i37 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i38 != 0) {
                                function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                            } else {
                                function3M498getLambda1$foundation_release = function3;
                            }
                            visualTransformation2 = none;
                            function4 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i42 = i40;
                            imeOptions3 = imeOptions2;
                            i43 = i33;
                        } else {
                            if (i47 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i16 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i18 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i20 != 0) {
                                function2 = a.f5816p0;
                            } else {
                                function2 = function1;
                            }
                            if (i22 != 0) {
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if (i24 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                            } else {
                                solidColor = brush;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i28 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i10;
                            }
                            if (i30 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i11;
                            }
                            if ((i14 & 2048) != 0) {
                                imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                i33 &= -113;
                            } else {
                                imeOptions2 = imeOptions;
                            }
                            if (i34 != 0) {
                                keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            } else {
                                keyboardActions2 = keyboardActions;
                            }
                            if (i36 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i37 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i38 != 0) {
                                function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                            } else {
                                function3M498getLambda1$foundation_release = function3;
                            }
                            visualTransformation2 = none;
                            function4 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i42 = i40;
                            imeOptions3 = imeOptions2;
                            i43 = i33;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new FocusRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        focusRequester = (FocusRequester) objRememberedValue;
                        textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                        long backgroundColor6 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                        FocusManager focusManager6 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                        if (i42 == 1) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Vertical;
                        }
                        orientation2 = orientation;
                        Object[] objArr6 = {orientation2};
                        Saver<TextFieldScrollerPosition, Object> saver6 = TextFieldScrollerPosition.INSTANCE.getSaver();
                        Modifier modifier9 = modifier2;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(orientation2);
                        i44 = i42;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new l(orientation2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new l(orientation2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TextFieldScrollerPosition textFieldScrollerPosition6 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr6, (Saver) saver6, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                            composition = value.getComposition();
                            if (composition != null) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                if (objRememberedValue3 == null) {
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            objRememberedValue3 = transformedTextFilterWithValidation;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                            composition = value.getComposition();
                            if (composition != null) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                if (objRememberedValue3 == null) {
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            objRememberedValue3 = transformedTextFilterWithValidation;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TransformedText transformedText6 = (TransformedText) objRememberedValue3;
                        text = transformedText6.getText();
                        offsetMapping = transformedText6.getOffsetMapping();
                        currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        int i413 = i43;
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        textFieldState = (TextFieldState) objRememberedValue4;
                        textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager6, backgroundColor6);
                        textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new UndoManager(0, 1, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        undoManager = (UndoManager) objRememberedValue5;
                        UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                        textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                        textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                        textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                        textFieldSelectionManager.setState$foundation_release(textFieldState);
                        textFieldSelectionManager.setValue$foundation_release(value);
                        textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                        textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                        textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                        textFieldSelectionManager.setFocusRequester(focusRequester);
                        textFieldSelectionManager.setEditable(!z15);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope6 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                            objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BringIntoViewRequester bringIntoViewRequester6 = (BringIntoViewRequester) objRememberedValue8;
                        companion2 = Modifier.INSTANCE;
                        i iVar6 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope6, bringIntoViewRequester6);
                        mutableInteractionSource5 = mutableInteractionSource4;
                        Modifier modifierTextFieldFocusModifier6 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar6);
                        composerStartRestartGroup.startReplaceableGroup(-55008004);
                        if (textInputService == null) {
                            if (z14) {
                                z23 = false;
                            } else {
                                z23 = false;
                            }
                            EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (TouchMode_androidKt.isInTouchMode()) {
                            z16 = false;
                            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        } else {
                            z16 = false;
                            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        }
                        Modifier modifierDrawBehind6 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                        Modifier modifierOnGloballyPositioned11 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                        Modifier modifierSemantics6 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText6, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                        if (z14) {
                            z17 = z16;
                        } else {
                            z17 = z16;
                        }
                        Modifier modifierCursor6 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                        EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                        EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i413 >> 3) & 14);
                        Function1<TextFieldValue, Unit> onValueChange7 = textFieldState.getOnValueChange();
                        boolean z214 = !z15;
                        if (i44 == 1) {
                            z18 = true;
                        } else {
                            z18 = z16;
                        }
                        Modifier modifierOnGloballyPositioned12 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier9.then(modifierTextFieldFocusModifier6), textFieldState, focusManager6), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange7, z214, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition6, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics6), new g(textFieldState));
                        if (!z14) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                        } else {
                            modifierTextFieldMagnifier = companion2;
                        }
                        boolean z215 = z14;
                        ImeOptions imeOptions10 = imeOptions3;
                        VisualTransformation visualTransformation9 = visualTransformation2;
                        composer2 = composerStartRestartGroup;
                        a(modifierOnGloballyPositioned12, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i413, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition6, value, visualTransformation2, modifierCursor6, modifierDrawBehind6, modifierOnGloballyPositioned11, modifierTextFieldMagnifier, bringIntoViewRequester6, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        textStyle3 = textStyle2;
                        visualTransformation3 = visualTransformation9;
                        function5 = function4;
                        brush2 = solidColor;
                        z20 = z13;
                        i45 = i41;
                        keyboardActions3 = keyboardActions2;
                        mutableInteractionSource6 = mutableInteractionSource5;
                        z21 = z15;
                        function6 = function3M498getLambda1$foundation_release;
                        modifier3 = modifier9;
                        z22 = z215;
                        imeOptions4 = imeOptions10;
                        i46 = i44;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(value, onValueChange, modifier3, textStyle3, visualTransformation3, function5, mutableInteractionSource6, brush2, z20, i46, i45, imeOptions4, keyboardActions3, z22, z21, function6, i12, i13, i14));
                }
                i33 |= 3072;
                i37 = i14 & 16384;
                if (i37 != 0) {
                    i33 |= 24576;
                } else if ((i13 & 57344) == 0) {
                    i33 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
                }
                i38 = i14 & 32768;
                if (i38 != 0) {
                    i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i13 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i39 = 131072;
                    } else {
                        i39 = 65536;
                    }
                    i33 |= i39;
                }
                if ((i15 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    } else {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new FocusRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    focusRequester = (FocusRequester) objRememberedValue;
                    textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                    long backgroundColor7 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                    FocusManager focusManager7 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    if (i42 == 1) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Vertical;
                    }
                    orientation2 = orientation;
                    Object[] objArr7 = {orientation2};
                    Saver<TextFieldScrollerPosition, Object> saver7 = TextFieldScrollerPosition.INSTANCE.getSaver();
                    Modifier modifier10 = modifier2;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(orientation2);
                    i44 = i42;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldScrollerPosition textFieldScrollerPosition7 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr7, (Saver) saver7, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TransformedText transformedText7 = (TransformedText) objRememberedValue3;
                    text = transformedText7.getText();
                    offsetMapping = transformedText7.getOffsetMapping();
                    currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    int i414 = i43;
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldState = (TextFieldState) objRememberedValue4;
                    textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager7, backgroundColor7);
                    textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new UndoManager(0, 1, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    undoManager = (UndoManager) objRememberedValue5;
                    UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                    textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                    textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                    textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                    textFieldSelectionManager.setState$foundation_release(textFieldState);
                    textFieldSelectionManager.setValue$foundation_release(value);
                    textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                    textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                    textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                    textFieldSelectionManager.setFocusRequester(focusRequester);
                    textFieldSelectionManager.setEditable(!z15);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope7 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BringIntoViewRequester bringIntoViewRequester7 = (BringIntoViewRequester) objRememberedValue8;
                    companion2 = Modifier.INSTANCE;
                    i iVar7 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope7, bringIntoViewRequester7);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    Modifier modifierTextFieldFocusModifier7 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar7);
                    composerStartRestartGroup.startReplaceableGroup(-55008004);
                    if (textInputService == null) {
                        if (z14) {
                            z23 = false;
                        } else {
                            z23 = false;
                        }
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (TouchMode_androidKt.isInTouchMode()) {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    } else {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    }
                    Modifier modifierDrawBehind7 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                    Modifier modifierOnGloballyPositioned13 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                    Modifier modifierSemantics7 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText7, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                    if (z14) {
                        z17 = z16;
                    } else {
                        z17 = z16;
                    }
                    Modifier modifierCursor7 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                    EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                    EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i414 >> 3) & 14);
                    Function1<TextFieldValue, Unit> onValueChange8 = textFieldState.getOnValueChange();
                    boolean z216 = !z15;
                    if (i44 == 1) {
                        z18 = true;
                    } else {
                        z18 = z16;
                    }
                    Modifier modifierOnGloballyPositioned14 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier10.then(modifierTextFieldFocusModifier7), textFieldState, focusManager7), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange8, z216, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition7, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics7), new g(textFieldState));
                    if (!z14) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                    } else {
                        modifierTextFieldMagnifier = companion2;
                    }
                    boolean z217 = z14;
                    ImeOptions imeOptions11 = imeOptions3;
                    VisualTransformation visualTransformation10 = visualTransformation2;
                    composer2 = composerStartRestartGroup;
                    a(modifierOnGloballyPositioned14, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i414, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition7, value, visualTransformation2, modifierCursor7, modifierDrawBehind7, modifierOnGloballyPositioned13, modifierTextFieldMagnifier, bringIntoViewRequester7, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textStyle3 = textStyle2;
                    visualTransformation3 = visualTransformation10;
                    function5 = function4;
                    brush2 = solidColor;
                    z20 = z13;
                    i45 = i41;
                    keyboardActions3 = keyboardActions2;
                    mutableInteractionSource6 = mutableInteractionSource5;
                    z21 = z15;
                    function6 = function3M498getLambda1$foundation_release;
                    modifier3 = modifier10;
                    z22 = z217;
                    imeOptions4 = imeOptions11;
                    i46 = i44;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    } else {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new FocusRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    focusRequester = (FocusRequester) objRememberedValue;
                    textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                    long backgroundColor8 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                    FocusManager focusManager8 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    if (i42 == 1) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Vertical;
                    }
                    orientation2 = orientation;
                    Object[] objArr8 = {orientation2};
                    Saver<TextFieldScrollerPosition, Object> saver8 = TextFieldScrollerPosition.INSTANCE.getSaver();
                    Modifier modifier11 = modifier2;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(orientation2);
                    i44 = i42;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldScrollerPosition textFieldScrollerPosition8 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr8, (Saver) saver8, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TransformedText transformedText8 = (TransformedText) objRememberedValue3;
                    text = transformedText8.getText();
                    offsetMapping = transformedText8.getOffsetMapping();
                    currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    int i415 = i43;
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldState = (TextFieldState) objRememberedValue4;
                    textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager8, backgroundColor8);
                    textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new UndoManager(0, 1, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    undoManager = (UndoManager) objRememberedValue5;
                    UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                    textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                    textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                    textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                    textFieldSelectionManager.setState$foundation_release(textFieldState);
                    textFieldSelectionManager.setValue$foundation_release(value);
                    textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                    textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                    textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                    textFieldSelectionManager.setFocusRequester(focusRequester);
                    textFieldSelectionManager.setEditable(!z15);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope8 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BringIntoViewRequester bringIntoViewRequester8 = (BringIntoViewRequester) objRememberedValue8;
                    companion2 = Modifier.INSTANCE;
                    i iVar8 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope8, bringIntoViewRequester8);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    Modifier modifierTextFieldFocusModifier8 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar8);
                    composerStartRestartGroup.startReplaceableGroup(-55008004);
                    if (textInputService == null) {
                        if (z14) {
                            z23 = false;
                        } else {
                            z23 = false;
                        }
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (TouchMode_androidKt.isInTouchMode()) {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    } else {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    }
                    Modifier modifierDrawBehind8 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                    Modifier modifierOnGloballyPositioned15 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                    Modifier modifierSemantics8 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText8, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                    if (z14) {
                        z17 = z16;
                    } else {
                        z17 = z16;
                    }
                    Modifier modifierCursor8 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                    EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                    EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i415 >> 3) & 14);
                    Function1<TextFieldValue, Unit> onValueChange9 = textFieldState.getOnValueChange();
                    boolean z218 = !z15;
                    if (i44 == 1) {
                        z18 = true;
                    } else {
                        z18 = z16;
                    }
                    Modifier modifierOnGloballyPositioned16 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier11.then(modifierTextFieldFocusModifier8), textFieldState, focusManager8), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange9, z218, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition8, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics8), new g(textFieldState));
                    if (!z14) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                    } else {
                        modifierTextFieldMagnifier = companion2;
                    }
                    boolean z219 = z14;
                    ImeOptions imeOptions12 = imeOptions3;
                    VisualTransformation visualTransformation11 = visualTransformation2;
                    composer2 = composerStartRestartGroup;
                    a(modifierOnGloballyPositioned16, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i415, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition8, value, visualTransformation2, modifierCursor8, modifierDrawBehind8, modifierOnGloballyPositioned15, modifierTextFieldMagnifier, bringIntoViewRequester8, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textStyle3 = textStyle2;
                    visualTransformation3 = visualTransformation11;
                    function5 = function4;
                    brush2 = solidColor;
                    z20 = z13;
                    i45 = i41;
                    keyboardActions3 = keyboardActions2;
                    mutableInteractionSource6 = mutableInteractionSource5;
                    z21 = z15;
                    function6 = function3M498getLambda1$foundation_release;
                    modifier3 = modifier11;
                    z22 = z219;
                    imeOptions4 = imeOptions12;
                    i46 = i44;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(value, onValueChange, modifier3, textStyle3, visualTransformation3, function5, mutableInteractionSource6, brush2, z20, i46, i45, imeOptions4, keyboardActions3, z22, z21, function6, i12, i13, i14));
            }
            i15 |= 3072;
            i18 = i14 & 16;
            if (i18 != 0) {
                i15 |= 24576;
            } else if ((i12 & 57344) == 0) {
                if (composerStartRestartGroup.changed(visualTransformation)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i15 |= i19;
            }
            i20 = i14 & 32;
            if (i20 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i12 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i15 |= i21;
            }
            i22 = i14 & 64;
            if (i22 != 0) {
                i15 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i15 |= i23;
            }
            i24 = i14 & 128;
            if (i24 != 0) {
                i15 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(brush)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i15 |= i25;
            }
            i26 = i14 & 256;
            if (i26 != 0) {
                i15 |= 100663296;
            } else if ((i12 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i27 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i27 = 33554432;
                }
                i15 |= i27;
            }
            i28 = i14 & 512;
            if (i28 != 0) {
                i15 |= 805306368;
            } else if ((i12 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(i10)) {
                    i29 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i29 = 268435456;
                }
                i15 |= i29;
            }
            i30 = i14 & 1024;
            if (i30 != 0) {
                i31 = i13 | 6;
            } else if ((i13 & 14) == 0) {
                if (composerStartRestartGroup.changed(i11)) {
                    i32 = 4;
                } else {
                    i32 = 2;
                }
                i31 = i13 | i32;
            } else {
                i31 = i13;
            }
            if ((i13 & 112) != 0) {
                i31 |= ((i14 & 2048) == 0 || !composerStartRestartGroup.changed(imeOptions)) ? 16 : 32;
            }
            i33 = i31;
            i34 = i14 & 4096;
            if (i34 != 0) {
                if ((i13 & 896) == 0) {
                    if (composerStartRestartGroup.changed(keyboardActions)) {
                        i35 = 256;
                    } else {
                        i35 = 128;
                    }
                    i33 |= i35;
                }
                i36 = i14 & 8192;
                if (i36 != 0) {
                    if ((i13 & 7168) == 0) {
                        i33 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
                    }
                    i37 = i14 & 16384;
                    if (i37 != 0) {
                        i33 |= 24576;
                    } else if ((i13 & 57344) == 0) {
                        i33 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
                    }
                    i38 = i14 & 32768;
                    if (i38 != 0) {
                        i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i13 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i39 = 131072;
                        } else {
                            i39 = 65536;
                        }
                        i33 |= i39;
                    }
                    if ((i15 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i12 & 1) != 0) {
                            if (i47 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i16 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i18 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i20 != 0) {
                                function2 = a.f5816p0;
                            } else {
                                function2 = function1;
                            }
                            if (i22 != 0) {
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if (i24 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                            } else {
                                solidColor = brush;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i28 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i10;
                            }
                            if (i30 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i11;
                            }
                            if ((i14 & 2048) != 0) {
                                imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                i33 &= -113;
                            } else {
                                imeOptions2 = imeOptions;
                            }
                            if (i34 != 0) {
                                keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            } else {
                                keyboardActions2 = keyboardActions;
                            }
                            if (i36 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i37 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i38 != 0) {
                                function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                            } else {
                                function3M498getLambda1$foundation_release = function3;
                            }
                            visualTransformation2 = none;
                            function4 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i42 = i40;
                            imeOptions3 = imeOptions2;
                            i43 = i33;
                        } else {
                            if (i47 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i16 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i18 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i20 != 0) {
                                function2 = a.f5816p0;
                            } else {
                                function2 = function1;
                            }
                            if (i22 != 0) {
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if (i24 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                            } else {
                                solidColor = brush;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i28 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i10;
                            }
                            if (i30 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i11;
                            }
                            if ((i14 & 2048) != 0) {
                                imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                i33 &= -113;
                            } else {
                                imeOptions2 = imeOptions;
                            }
                            if (i34 != 0) {
                                keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            } else {
                                keyboardActions2 = keyboardActions;
                            }
                            if (i36 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i37 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i38 != 0) {
                                function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                            } else {
                                function3M498getLambda1$foundation_release = function3;
                            }
                            visualTransformation2 = none;
                            function4 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i42 = i40;
                            imeOptions3 = imeOptions2;
                            i43 = i33;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new FocusRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        focusRequester = (FocusRequester) objRememberedValue;
                        textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                        long backgroundColor9 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                        FocusManager focusManager9 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                        if (i42 == 1) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Vertical;
                        }
                        orientation2 = orientation;
                        Object[] objArr9 = {orientation2};
                        Saver<TextFieldScrollerPosition, Object> saver9 = TextFieldScrollerPosition.INSTANCE.getSaver();
                        Modifier modifier12 = modifier2;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(orientation2);
                        i44 = i42;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new l(orientation2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new l(orientation2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TextFieldScrollerPosition textFieldScrollerPosition9 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr9, (Saver) saver9, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                            composition = value.getComposition();
                            if (composition != null) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                if (objRememberedValue3 == null) {
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            objRememberedValue3 = transformedTextFilterWithValidation;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                            composition = value.getComposition();
                            if (composition != null) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                if (objRememberedValue3 == null) {
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            objRememberedValue3 = transformedTextFilterWithValidation;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TransformedText transformedText9 = (TransformedText) objRememberedValue3;
                        text = transformedText9.getText();
                        offsetMapping = transformedText9.getOffsetMapping();
                        currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        int i416 = i43;
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        textFieldState = (TextFieldState) objRememberedValue4;
                        textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager9, backgroundColor9);
                        textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new UndoManager(0, 1, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        undoManager = (UndoManager) objRememberedValue5;
                        UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                        textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                        textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                        textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                        textFieldSelectionManager.setState$foundation_release(textFieldState);
                        textFieldSelectionManager.setValue$foundation_release(value);
                        textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                        textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                        textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                        textFieldSelectionManager.setFocusRequester(focusRequester);
                        textFieldSelectionManager.setEditable(!z15);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope9 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                            objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BringIntoViewRequester bringIntoViewRequester9 = (BringIntoViewRequester) objRememberedValue8;
                        companion2 = Modifier.INSTANCE;
                        i iVar9 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope9, bringIntoViewRequester9);
                        mutableInteractionSource5 = mutableInteractionSource4;
                        Modifier modifierTextFieldFocusModifier9 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar9);
                        composerStartRestartGroup.startReplaceableGroup(-55008004);
                        if (textInputService == null) {
                            if (z14) {
                                z23 = false;
                            } else {
                                z23 = false;
                            }
                            EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (TouchMode_androidKt.isInTouchMode()) {
                            z16 = false;
                            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        } else {
                            z16 = false;
                            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        }
                        Modifier modifierDrawBehind9 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                        Modifier modifierOnGloballyPositioned17 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                        Modifier modifierSemantics9 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText9, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                        if (z14) {
                            z17 = z16;
                        } else {
                            z17 = z16;
                        }
                        Modifier modifierCursor9 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                        EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                        EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i416 >> 3) & 14);
                        Function1<TextFieldValue, Unit> onValueChange10 = textFieldState.getOnValueChange();
                        boolean z2110 = !z15;
                        if (i44 == 1) {
                            z18 = true;
                        } else {
                            z18 = z16;
                        }
                        Modifier modifierOnGloballyPositioned18 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier12.then(modifierTextFieldFocusModifier9), textFieldState, focusManager9), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange10, z2110, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition9, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics9), new g(textFieldState));
                        if (!z14) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                        } else {
                            modifierTextFieldMagnifier = companion2;
                        }
                        boolean z2111 = z14;
                        ImeOptions imeOptions13 = imeOptions3;
                        VisualTransformation visualTransformation12 = visualTransformation2;
                        composer2 = composerStartRestartGroup;
                        a(modifierOnGloballyPositioned18, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i416, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition9, value, visualTransformation2, modifierCursor9, modifierDrawBehind9, modifierOnGloballyPositioned17, modifierTextFieldMagnifier, bringIntoViewRequester9, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        textStyle3 = textStyle2;
                        visualTransformation3 = visualTransformation12;
                        function5 = function4;
                        brush2 = solidColor;
                        z20 = z13;
                        i45 = i41;
                        keyboardActions3 = keyboardActions2;
                        mutableInteractionSource6 = mutableInteractionSource5;
                        z21 = z15;
                        function6 = function3M498getLambda1$foundation_release;
                        modifier3 = modifier12;
                        z22 = z2111;
                        imeOptions4 = imeOptions13;
                        i46 = i44;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i12 & 1) != 0) {
                            if (i47 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i16 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i18 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i20 != 0) {
                                function2 = a.f5816p0;
                            } else {
                                function2 = function1;
                            }
                            if (i22 != 0) {
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if (i24 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                            } else {
                                solidColor = brush;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i28 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i10;
                            }
                            if (i30 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i11;
                            }
                            if ((i14 & 2048) != 0) {
                                imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                i33 &= -113;
                            } else {
                                imeOptions2 = imeOptions;
                            }
                            if (i34 != 0) {
                                keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            } else {
                                keyboardActions2 = keyboardActions;
                            }
                            if (i36 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i37 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i38 != 0) {
                                function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                            } else {
                                function3M498getLambda1$foundation_release = function3;
                            }
                            visualTransformation2 = none;
                            function4 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i42 = i40;
                            imeOptions3 = imeOptions2;
                            i43 = i33;
                        } else {
                            if (i47 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i16 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i18 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i20 != 0) {
                                function2 = a.f5816p0;
                            } else {
                                function2 = function1;
                            }
                            if (i22 != 0) {
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if (i24 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                            } else {
                                solidColor = brush;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i28 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i10;
                            }
                            if (i30 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i11;
                            }
                            if ((i14 & 2048) != 0) {
                                imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                i33 &= -113;
                            } else {
                                imeOptions2 = imeOptions;
                            }
                            if (i34 != 0) {
                                keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            } else {
                                keyboardActions2 = keyboardActions;
                            }
                            if (i36 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i37 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i38 != 0) {
                                function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                            } else {
                                function3M498getLambda1$foundation_release = function3;
                            }
                            visualTransformation2 = none;
                            function4 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i42 = i40;
                            imeOptions3 = imeOptions2;
                            i43 = i33;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new FocusRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        focusRequester = (FocusRequester) objRememberedValue;
                        textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                        long backgroundColor10 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                        FocusManager focusManager10 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                        if (i42 == 1) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Vertical;
                        }
                        orientation2 = orientation;
                        Object[] objArr10 = {orientation2};
                        Saver<TextFieldScrollerPosition, Object> saver10 = TextFieldScrollerPosition.INSTANCE.getSaver();
                        Modifier modifier13 = modifier2;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(orientation2);
                        i44 = i42;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new l(orientation2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new l(orientation2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TextFieldScrollerPosition textFieldScrollerPosition10 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr10, (Saver) saver10, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                            composition = value.getComposition();
                            if (composition != null) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                if (objRememberedValue3 == null) {
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            objRememberedValue3 = transformedTextFilterWithValidation;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                            composition = value.getComposition();
                            if (composition != null) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                if (objRememberedValue3 == null) {
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            objRememberedValue3 = transformedTextFilterWithValidation;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TransformedText transformedText10 = (TransformedText) objRememberedValue3;
                        text = transformedText10.getText();
                        offsetMapping = transformedText10.getOffsetMapping();
                        currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        int i417 = i43;
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        textFieldState = (TextFieldState) objRememberedValue4;
                        textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager10, backgroundColor10);
                        textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new UndoManager(0, 1, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        undoManager = (UndoManager) objRememberedValue5;
                        UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                        textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                        textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                        textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                        textFieldSelectionManager.setState$foundation_release(textFieldState);
                        textFieldSelectionManager.setValue$foundation_release(value);
                        textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                        textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                        textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                        textFieldSelectionManager.setFocusRequester(focusRequester);
                        textFieldSelectionManager.setEditable(!z15);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope10 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                            objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BringIntoViewRequester bringIntoViewRequester10 = (BringIntoViewRequester) objRememberedValue8;
                        companion2 = Modifier.INSTANCE;
                        i iVar10 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope10, bringIntoViewRequester10);
                        mutableInteractionSource5 = mutableInteractionSource4;
                        Modifier modifierTextFieldFocusModifier10 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar10);
                        composerStartRestartGroup.startReplaceableGroup(-55008004);
                        if (textInputService == null) {
                            if (z14) {
                                z23 = false;
                            } else {
                                z23 = false;
                            }
                            EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (TouchMode_androidKt.isInTouchMode()) {
                            z16 = false;
                            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        } else {
                            z16 = false;
                            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        }
                        Modifier modifierDrawBehind10 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                        Modifier modifierOnGloballyPositioned19 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                        Modifier modifierSemantics10 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText10, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                        if (z14) {
                            z17 = z16;
                        } else {
                            z17 = z16;
                        }
                        Modifier modifierCursor10 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                        EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                        EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i417 >> 3) & 14);
                        Function1<TextFieldValue, Unit> onValueChange11 = textFieldState.getOnValueChange();
                        boolean z2112 = !z15;
                        if (i44 == 1) {
                            z18 = true;
                        } else {
                            z18 = z16;
                        }
                        Modifier modifierOnGloballyPositioned110 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier13.then(modifierTextFieldFocusModifier10), textFieldState, focusManager10), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange11, z2112, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition10, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics10), new g(textFieldState));
                        if (!z14) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                        } else {
                            modifierTextFieldMagnifier = companion2;
                        }
                        boolean z2113 = z14;
                        ImeOptions imeOptions14 = imeOptions3;
                        VisualTransformation visualTransformation13 = visualTransformation2;
                        composer2 = composerStartRestartGroup;
                        a(modifierOnGloballyPositioned110, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i417, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition10, value, visualTransformation2, modifierCursor10, modifierDrawBehind10, modifierOnGloballyPositioned19, modifierTextFieldMagnifier, bringIntoViewRequester10, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        textStyle3 = textStyle2;
                        visualTransformation3 = visualTransformation13;
                        function5 = function4;
                        brush2 = solidColor;
                        z20 = z13;
                        i45 = i41;
                        keyboardActions3 = keyboardActions2;
                        mutableInteractionSource6 = mutableInteractionSource5;
                        z21 = z15;
                        function6 = function3M498getLambda1$foundation_release;
                        modifier3 = modifier13;
                        z22 = z2113;
                        imeOptions4 = imeOptions14;
                        i46 = i44;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(value, onValueChange, modifier3, textStyle3, visualTransformation3, function5, mutableInteractionSource6, brush2, z20, i46, i45, imeOptions4, keyboardActions3, z22, z21, function6, i12, i13, i14));
                }
                i33 |= 3072;
                i37 = i14 & 16384;
                if (i37 != 0) {
                    i33 |= 24576;
                } else if ((i13 & 57344) == 0) {
                    i33 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
                }
                i38 = i14 & 32768;
                if (i38 != 0) {
                    i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i13 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i39 = 131072;
                    } else {
                        i39 = 65536;
                    }
                    i33 |= i39;
                }
                if ((i15 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    } else {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new FocusRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    focusRequester = (FocusRequester) objRememberedValue;
                    textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                    long backgroundColor11 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                    FocusManager focusManager11 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    if (i42 == 1) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Vertical;
                    }
                    orientation2 = orientation;
                    Object[] objArr11 = {orientation2};
                    Saver<TextFieldScrollerPosition, Object> saver11 = TextFieldScrollerPosition.INSTANCE.getSaver();
                    Modifier modifier14 = modifier2;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(orientation2);
                    i44 = i42;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldScrollerPosition textFieldScrollerPosition11 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr11, (Saver) saver11, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TransformedText transformedText11 = (TransformedText) objRememberedValue3;
                    text = transformedText11.getText();
                    offsetMapping = transformedText11.getOffsetMapping();
                    currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    int i418 = i43;
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldState = (TextFieldState) objRememberedValue4;
                    textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager11, backgroundColor11);
                    textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new UndoManager(0, 1, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    undoManager = (UndoManager) objRememberedValue5;
                    UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                    textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                    textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                    textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                    textFieldSelectionManager.setState$foundation_release(textFieldState);
                    textFieldSelectionManager.setValue$foundation_release(value);
                    textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                    textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                    textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                    textFieldSelectionManager.setFocusRequester(focusRequester);
                    textFieldSelectionManager.setEditable(!z15);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope11 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BringIntoViewRequester bringIntoViewRequester11 = (BringIntoViewRequester) objRememberedValue8;
                    companion2 = Modifier.INSTANCE;
                    i iVar11 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope11, bringIntoViewRequester11);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    Modifier modifierTextFieldFocusModifier11 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar11);
                    composerStartRestartGroup.startReplaceableGroup(-55008004);
                    if (textInputService == null) {
                        if (z14) {
                            z23 = false;
                        } else {
                            z23 = false;
                        }
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (TouchMode_androidKt.isInTouchMode()) {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    } else {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    }
                    Modifier modifierDrawBehind11 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                    Modifier modifierOnGloballyPositioned111 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                    Modifier modifierSemantics11 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText11, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                    if (z14) {
                        z17 = z16;
                    } else {
                        z17 = z16;
                    }
                    Modifier modifierCursor11 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                    EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                    EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i418 >> 3) & 14);
                    Function1<TextFieldValue, Unit> onValueChange12 = textFieldState.getOnValueChange();
                    boolean z2114 = !z15;
                    if (i44 == 1) {
                        z18 = true;
                    } else {
                        z18 = z16;
                    }
                    Modifier modifierOnGloballyPositioned112 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier14.then(modifierTextFieldFocusModifier11), textFieldState, focusManager11), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange12, z2114, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition11, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics11), new g(textFieldState));
                    if (!z14) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                    } else {
                        modifierTextFieldMagnifier = companion2;
                    }
                    boolean z2115 = z14;
                    ImeOptions imeOptions15 = imeOptions3;
                    VisualTransformation visualTransformation14 = visualTransformation2;
                    composer2 = composerStartRestartGroup;
                    a(modifierOnGloballyPositioned112, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i418, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition11, value, visualTransformation2, modifierCursor11, modifierDrawBehind11, modifierOnGloballyPositioned111, modifierTextFieldMagnifier, bringIntoViewRequester11, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textStyle3 = textStyle2;
                    visualTransformation3 = visualTransformation14;
                    function5 = function4;
                    brush2 = solidColor;
                    z20 = z13;
                    i45 = i41;
                    keyboardActions3 = keyboardActions2;
                    mutableInteractionSource6 = mutableInteractionSource5;
                    z21 = z15;
                    function6 = function3M498getLambda1$foundation_release;
                    modifier3 = modifier14;
                    z22 = z2115;
                    imeOptions4 = imeOptions15;
                    i46 = i44;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    } else {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new FocusRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    focusRequester = (FocusRequester) objRememberedValue;
                    textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                    long backgroundColor12 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                    FocusManager focusManager12 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    if (i42 == 1) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Vertical;
                    }
                    orientation2 = orientation;
                    Object[] objArr12 = {orientation2};
                    Saver<TextFieldScrollerPosition, Object> saver12 = TextFieldScrollerPosition.INSTANCE.getSaver();
                    Modifier modifier15 = modifier2;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(orientation2);
                    i44 = i42;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldScrollerPosition textFieldScrollerPosition12 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr12, (Saver) saver12, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TransformedText transformedText12 = (TransformedText) objRememberedValue3;
                    text = transformedText12.getText();
                    offsetMapping = transformedText12.getOffsetMapping();
                    currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    int i419 = i43;
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldState = (TextFieldState) objRememberedValue4;
                    textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager12, backgroundColor12);
                    textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new UndoManager(0, 1, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    undoManager = (UndoManager) objRememberedValue5;
                    UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                    textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                    textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                    textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                    textFieldSelectionManager.setState$foundation_release(textFieldState);
                    textFieldSelectionManager.setValue$foundation_release(value);
                    textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                    textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                    textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                    textFieldSelectionManager.setFocusRequester(focusRequester);
                    textFieldSelectionManager.setEditable(!z15);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope12 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BringIntoViewRequester bringIntoViewRequester12 = (BringIntoViewRequester) objRememberedValue8;
                    companion2 = Modifier.INSTANCE;
                    i iVar12 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope12, bringIntoViewRequester12);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    Modifier modifierTextFieldFocusModifier12 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar12);
                    composerStartRestartGroup.startReplaceableGroup(-55008004);
                    if (textInputService == null) {
                        if (z14) {
                            z23 = false;
                        } else {
                            z23 = false;
                        }
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (TouchMode_androidKt.isInTouchMode()) {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    } else {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    }
                    Modifier modifierDrawBehind12 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                    Modifier modifierOnGloballyPositioned113 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                    Modifier modifierSemantics12 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText12, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                    if (z14) {
                        z17 = z16;
                    } else {
                        z17 = z16;
                    }
                    Modifier modifierCursor12 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                    EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                    EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i419 >> 3) & 14);
                    Function1<TextFieldValue, Unit> onValueChange13 = textFieldState.getOnValueChange();
                    boolean z2116 = !z15;
                    if (i44 == 1) {
                        z18 = true;
                    } else {
                        z18 = z16;
                    }
                    Modifier modifierOnGloballyPositioned114 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier15.then(modifierTextFieldFocusModifier12), textFieldState, focusManager12), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange13, z2116, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition12, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics12), new g(textFieldState));
                    if (!z14) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                    } else {
                        modifierTextFieldMagnifier = companion2;
                    }
                    boolean z2117 = z14;
                    ImeOptions imeOptions16 = imeOptions3;
                    VisualTransformation visualTransformation15 = visualTransformation2;
                    composer2 = composerStartRestartGroup;
                    a(modifierOnGloballyPositioned114, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i419, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition12, value, visualTransformation2, modifierCursor12, modifierDrawBehind12, modifierOnGloballyPositioned113, modifierTextFieldMagnifier, bringIntoViewRequester12, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textStyle3 = textStyle2;
                    visualTransformation3 = visualTransformation15;
                    function5 = function4;
                    brush2 = solidColor;
                    z20 = z13;
                    i45 = i41;
                    keyboardActions3 = keyboardActions2;
                    mutableInteractionSource6 = mutableInteractionSource5;
                    z21 = z15;
                    function6 = function3M498getLambda1$foundation_release;
                    modifier3 = modifier15;
                    z22 = z2117;
                    imeOptions4 = imeOptions16;
                    i46 = i44;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(value, onValueChange, modifier3, textStyle3, visualTransformation3, function5, mutableInteractionSource6, brush2, z20, i46, i45, imeOptions4, keyboardActions3, z22, z21, function6, i12, i13, i14));
            }
            i33 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            i36 = i14 & 8192;
            if (i36 != 0) {
                if ((i13 & 7168) == 0) {
                    i33 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
                }
                i37 = i14 & 16384;
                if (i37 != 0) {
                    i33 |= 24576;
                } else if ((i13 & 57344) == 0) {
                    i33 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
                }
                i38 = i14 & 32768;
                if (i38 != 0) {
                    i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i13 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i39 = 131072;
                    } else {
                        i39 = 65536;
                    }
                    i33 |= i39;
                }
                if ((i15 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    } else {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new FocusRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    focusRequester = (FocusRequester) objRememberedValue;
                    textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                    long backgroundColor13 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                    FocusManager focusManager13 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    if (i42 == 1) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Vertical;
                    }
                    orientation2 = orientation;
                    Object[] objArr13 = {orientation2};
                    Saver<TextFieldScrollerPosition, Object> saver13 = TextFieldScrollerPosition.INSTANCE.getSaver();
                    Modifier modifier16 = modifier2;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(orientation2);
                    i44 = i42;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldScrollerPosition textFieldScrollerPosition13 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr13, (Saver) saver13, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TransformedText transformedText13 = (TransformedText) objRememberedValue3;
                    text = transformedText13.getText();
                    offsetMapping = transformedText13.getOffsetMapping();
                    currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    int i4110 = i43;
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldState = (TextFieldState) objRememberedValue4;
                    textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager13, backgroundColor13);
                    textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new UndoManager(0, 1, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    undoManager = (UndoManager) objRememberedValue5;
                    UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                    textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                    textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                    textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                    textFieldSelectionManager.setState$foundation_release(textFieldState);
                    textFieldSelectionManager.setValue$foundation_release(value);
                    textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                    textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                    textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                    textFieldSelectionManager.setFocusRequester(focusRequester);
                    textFieldSelectionManager.setEditable(!z15);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope13 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BringIntoViewRequester bringIntoViewRequester13 = (BringIntoViewRequester) objRememberedValue8;
                    companion2 = Modifier.INSTANCE;
                    i iVar13 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope13, bringIntoViewRequester13);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    Modifier modifierTextFieldFocusModifier13 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar13);
                    composerStartRestartGroup.startReplaceableGroup(-55008004);
                    if (textInputService == null) {
                        if (z14) {
                            z23 = false;
                        } else {
                            z23 = false;
                        }
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (TouchMode_androidKt.isInTouchMode()) {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    } else {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    }
                    Modifier modifierDrawBehind13 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                    Modifier modifierOnGloballyPositioned115 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                    Modifier modifierSemantics13 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText13, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                    if (z14) {
                        z17 = z16;
                    } else {
                        z17 = z16;
                    }
                    Modifier modifierCursor13 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                    EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                    EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i4110 >> 3) & 14);
                    Function1<TextFieldValue, Unit> onValueChange14 = textFieldState.getOnValueChange();
                    boolean z2118 = !z15;
                    if (i44 == 1) {
                        z18 = true;
                    } else {
                        z18 = z16;
                    }
                    Modifier modifierOnGloballyPositioned116 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier16.then(modifierTextFieldFocusModifier13), textFieldState, focusManager13), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange14, z2118, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition13, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics13), new g(textFieldState));
                    if (!z14) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                    } else {
                        modifierTextFieldMagnifier = companion2;
                    }
                    boolean z2119 = z14;
                    ImeOptions imeOptions17 = imeOptions3;
                    VisualTransformation visualTransformation16 = visualTransformation2;
                    composer2 = composerStartRestartGroup;
                    a(modifierOnGloballyPositioned116, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i4110, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition13, value, visualTransformation2, modifierCursor13, modifierDrawBehind13, modifierOnGloballyPositioned115, modifierTextFieldMagnifier, bringIntoViewRequester13, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textStyle3 = textStyle2;
                    visualTransformation3 = visualTransformation16;
                    function5 = function4;
                    brush2 = solidColor;
                    z20 = z13;
                    i45 = i41;
                    keyboardActions3 = keyboardActions2;
                    mutableInteractionSource6 = mutableInteractionSource5;
                    z21 = z15;
                    function6 = function3M498getLambda1$foundation_release;
                    modifier3 = modifier16;
                    z22 = z2119;
                    imeOptions4 = imeOptions17;
                    i46 = i44;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    } else {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new FocusRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    focusRequester = (FocusRequester) objRememberedValue;
                    textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                    long backgroundColor14 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                    FocusManager focusManager14 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    if (i42 == 1) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Vertical;
                    }
                    orientation2 = orientation;
                    Object[] objArr14 = {orientation2};
                    Saver<TextFieldScrollerPosition, Object> saver14 = TextFieldScrollerPosition.INSTANCE.getSaver();
                    Modifier modifier17 = modifier2;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(orientation2);
                    i44 = i42;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldScrollerPosition textFieldScrollerPosition14 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr14, (Saver) saver14, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TransformedText transformedText14 = (TransformedText) objRememberedValue3;
                    text = transformedText14.getText();
                    offsetMapping = transformedText14.getOffsetMapping();
                    currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    int i4111 = i43;
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldState = (TextFieldState) objRememberedValue4;
                    textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager14, backgroundColor14);
                    textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new UndoManager(0, 1, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    undoManager = (UndoManager) objRememberedValue5;
                    UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                    textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                    textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                    textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                    textFieldSelectionManager.setState$foundation_release(textFieldState);
                    textFieldSelectionManager.setValue$foundation_release(value);
                    textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                    textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                    textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                    textFieldSelectionManager.setFocusRequester(focusRequester);
                    textFieldSelectionManager.setEditable(!z15);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope14 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BringIntoViewRequester bringIntoViewRequester14 = (BringIntoViewRequester) objRememberedValue8;
                    companion2 = Modifier.INSTANCE;
                    i iVar14 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope14, bringIntoViewRequester14);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    Modifier modifierTextFieldFocusModifier14 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar14);
                    composerStartRestartGroup.startReplaceableGroup(-55008004);
                    if (textInputService == null) {
                        if (z14) {
                            z23 = false;
                        } else {
                            z23 = false;
                        }
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (TouchMode_androidKt.isInTouchMode()) {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    } else {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    }
                    Modifier modifierDrawBehind14 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                    Modifier modifierOnGloballyPositioned117 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                    Modifier modifierSemantics14 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText14, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                    if (z14) {
                        z17 = z16;
                    } else {
                        z17 = z16;
                    }
                    Modifier modifierCursor14 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                    EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                    EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i4111 >> 3) & 14);
                    Function1<TextFieldValue, Unit> onValueChange15 = textFieldState.getOnValueChange();
                    boolean z21110 = !z15;
                    if (i44 == 1) {
                        z18 = true;
                    } else {
                        z18 = z16;
                    }
                    Modifier modifierOnGloballyPositioned118 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier17.then(modifierTextFieldFocusModifier14), textFieldState, focusManager14), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange15, z21110, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition14, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics14), new g(textFieldState));
                    if (!z14) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                    } else {
                        modifierTextFieldMagnifier = companion2;
                    }
                    boolean z21111 = z14;
                    ImeOptions imeOptions18 = imeOptions3;
                    VisualTransformation visualTransformation17 = visualTransformation2;
                    composer2 = composerStartRestartGroup;
                    a(modifierOnGloballyPositioned118, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i4111, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition14, value, visualTransformation2, modifierCursor14, modifierDrawBehind14, modifierOnGloballyPositioned117, modifierTextFieldMagnifier, bringIntoViewRequester14, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textStyle3 = textStyle2;
                    visualTransformation3 = visualTransformation17;
                    function5 = function4;
                    brush2 = solidColor;
                    z20 = z13;
                    i45 = i41;
                    keyboardActions3 = keyboardActions2;
                    mutableInteractionSource6 = mutableInteractionSource5;
                    z21 = z15;
                    function6 = function3M498getLambda1$foundation_release;
                    modifier3 = modifier17;
                    z22 = z21111;
                    imeOptions4 = imeOptions18;
                    i46 = i44;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(value, onValueChange, modifier3, textStyle3, visualTransformation3, function5, mutableInteractionSource6, brush2, z20, i46, i45, imeOptions4, keyboardActions3, z22, z21, function6, i12, i13, i14));
            }
            i33 |= 3072;
            i37 = i14 & 16384;
            if (i37 != 0) {
                i33 |= 24576;
            } else if ((i13 & 57344) == 0) {
                i33 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
            }
            i38 = i14 & 32768;
            if (i38 != 0) {
                i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i13 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i39 = 131072;
                } else {
                    i39 = 65536;
                }
                i33 |= i39;
            }
            if ((i15 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i12 & 1) != 0) {
                    if (i47 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i18 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i20 != 0) {
                        function2 = a.f5816p0;
                    } else {
                        function2 = function1;
                    }
                    if (i22 != 0) {
                        mutableInteractionSource2 = null;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i24 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                    } else {
                        solidColor = brush;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i28 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i10;
                    }
                    if (i30 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i11;
                    }
                    if ((i14 & 2048) != 0) {
                        imeOptions2 = ImeOptions.INSTANCE.getDefault();
                        i33 &= -113;
                    } else {
                        imeOptions2 = imeOptions;
                    }
                    if (i34 != 0) {
                        keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    if (i36 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i38 != 0) {
                        function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                    } else {
                        function3M498getLambda1$foundation_release = function3;
                    }
                    visualTransformation2 = none;
                    function4 = function2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i42 = i40;
                    imeOptions3 = imeOptions2;
                    i43 = i33;
                } else {
                    if (i47 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i18 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i20 != 0) {
                        function2 = a.f5816p0;
                    } else {
                        function2 = function1;
                    }
                    if (i22 != 0) {
                        mutableInteractionSource2 = null;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i24 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                    } else {
                        solidColor = brush;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i28 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i10;
                    }
                    if (i30 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i11;
                    }
                    if ((i14 & 2048) != 0) {
                        imeOptions2 = ImeOptions.INSTANCE.getDefault();
                        i33 &= -113;
                    } else {
                        imeOptions2 = imeOptions;
                    }
                    if (i34 != 0) {
                        keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    if (i36 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i38 != 0) {
                        function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                    } else {
                        function3M498getLambda1$foundation_release = function3;
                    }
                    visualTransformation2 = none;
                    function4 = function2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i42 = i40;
                    imeOptions3 = imeOptions2;
                    i43 = i33;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                focusRequester = (FocusRequester) objRememberedValue;
                textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                long backgroundColor15 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                FocusManager focusManager15 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                if (i42 == 1) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Vertical;
                }
                orientation2 = orientation;
                Object[] objArr15 = {orientation2};
                Saver<TextFieldScrollerPosition, Object> saver15 = TextFieldScrollerPosition.INSTANCE.getSaver();
                Modifier modifier18 = modifier2;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(orientation2);
                i44 = i42;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new l(orientation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new l(orientation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldScrollerPosition textFieldScrollerPosition15 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr15, (Saver) saver15, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                    composition = value.getComposition();
                    if (composition != null) {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                        if (objRememberedValue3 == null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    objRememberedValue3 = transformedTextFilterWithValidation;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                    composition = value.getComposition();
                    if (composition != null) {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                        if (objRememberedValue3 == null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    objRememberedValue3 = transformedTextFilterWithValidation;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TransformedText transformedText15 = (TransformedText) objRememberedValue3;
                text = transformedText15.getText();
                offsetMapping = transformedText15.getOffsetMapping();
                currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                int i4112 = i43;
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                textFieldState = (TextFieldState) objRememberedValue4;
                textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager15, backgroundColor15);
                textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new UndoManager(0, 1, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                undoManager = (UndoManager) objRememberedValue5;
                UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                textFieldSelectionManager.setState$foundation_release(textFieldState);
                textFieldSelectionManager.setValue$foundation_release(value);
                textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                textFieldSelectionManager.setFocusRequester(focusRequester);
                textFieldSelectionManager.setEditable(!z15);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope15 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BringIntoViewRequester bringIntoViewRequester15 = (BringIntoViewRequester) objRememberedValue8;
                companion2 = Modifier.INSTANCE;
                i iVar15 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope15, bringIntoViewRequester15);
                mutableInteractionSource5 = mutableInteractionSource4;
                Modifier modifierTextFieldFocusModifier15 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar15);
                composerStartRestartGroup.startReplaceableGroup(-55008004);
                if (textInputService == null) {
                    if (z14) {
                        z23 = false;
                    } else {
                        z23 = false;
                    }
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (TouchMode_androidKt.isInTouchMode()) {
                    z16 = false;
                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                } else {
                    z16 = false;
                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                }
                Modifier modifierDrawBehind15 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                Modifier modifierOnGloballyPositioned119 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                Modifier modifierSemantics15 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText15, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                if (z14) {
                    z17 = z16;
                } else {
                    z17 = z16;
                }
                Modifier modifierCursor15 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i4112 >> 3) & 14);
                Function1<TextFieldValue, Unit> onValueChange16 = textFieldState.getOnValueChange();
                boolean z21112 = !z15;
                if (i44 == 1) {
                    z18 = true;
                } else {
                    z18 = z16;
                }
                Modifier modifierOnGloballyPositioned1110 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier18.then(modifierTextFieldFocusModifier15), textFieldState, focusManager15), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange16, z21112, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition15, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics15), new g(textFieldState));
                if (!z14) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (z19) {
                    modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                } else {
                    modifierTextFieldMagnifier = companion2;
                }
                boolean z21113 = z14;
                ImeOptions imeOptions19 = imeOptions3;
                VisualTransformation visualTransformation18 = visualTransformation2;
                composer2 = composerStartRestartGroup;
                a(modifierOnGloballyPositioned1110, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i4112, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition15, value, visualTransformation2, modifierCursor15, modifierDrawBehind15, modifierOnGloballyPositioned119, modifierTextFieldMagnifier, bringIntoViewRequester15, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle3 = textStyle2;
                visualTransformation3 = visualTransformation18;
                function5 = function4;
                brush2 = solidColor;
                z20 = z13;
                i45 = i41;
                keyboardActions3 = keyboardActions2;
                mutableInteractionSource6 = mutableInteractionSource5;
                z21 = z15;
                function6 = function3M498getLambda1$foundation_release;
                modifier3 = modifier18;
                z22 = z21113;
                imeOptions4 = imeOptions19;
                i46 = i44;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i12 & 1) != 0) {
                    if (i47 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i18 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i20 != 0) {
                        function2 = a.f5816p0;
                    } else {
                        function2 = function1;
                    }
                    if (i22 != 0) {
                        mutableInteractionSource2 = null;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i24 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                    } else {
                        solidColor = brush;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i28 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i10;
                    }
                    if (i30 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i11;
                    }
                    if ((i14 & 2048) != 0) {
                        imeOptions2 = ImeOptions.INSTANCE.getDefault();
                        i33 &= -113;
                    } else {
                        imeOptions2 = imeOptions;
                    }
                    if (i34 != 0) {
                        keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    if (i36 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i38 != 0) {
                        function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                    } else {
                        function3M498getLambda1$foundation_release = function3;
                    }
                    visualTransformation2 = none;
                    function4 = function2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i42 = i40;
                    imeOptions3 = imeOptions2;
                    i43 = i33;
                } else {
                    if (i47 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i18 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i20 != 0) {
                        function2 = a.f5816p0;
                    } else {
                        function2 = function1;
                    }
                    if (i22 != 0) {
                        mutableInteractionSource2 = null;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i24 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                    } else {
                        solidColor = brush;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i28 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i10;
                    }
                    if (i30 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i11;
                    }
                    if ((i14 & 2048) != 0) {
                        imeOptions2 = ImeOptions.INSTANCE.getDefault();
                        i33 &= -113;
                    } else {
                        imeOptions2 = imeOptions;
                    }
                    if (i34 != 0) {
                        keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    if (i36 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i38 != 0) {
                        function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                    } else {
                        function3M498getLambda1$foundation_release = function3;
                    }
                    visualTransformation2 = none;
                    function4 = function2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i42 = i40;
                    imeOptions3 = imeOptions2;
                    i43 = i33;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                focusRequester = (FocusRequester) objRememberedValue;
                textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                long backgroundColor16 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                FocusManager focusManager16 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                if (i42 == 1) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Vertical;
                }
                orientation2 = orientation;
                Object[] objArr16 = {orientation2};
                Saver<TextFieldScrollerPosition, Object> saver16 = TextFieldScrollerPosition.INSTANCE.getSaver();
                Modifier modifier19 = modifier2;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(orientation2);
                i44 = i42;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new l(orientation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new l(orientation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldScrollerPosition textFieldScrollerPosition16 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr16, (Saver) saver16, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                    composition = value.getComposition();
                    if (composition != null) {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                        if (objRememberedValue3 == null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    objRememberedValue3 = transformedTextFilterWithValidation;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                    composition = value.getComposition();
                    if (composition != null) {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                        if (objRememberedValue3 == null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    objRememberedValue3 = transformedTextFilterWithValidation;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TransformedText transformedText16 = (TransformedText) objRememberedValue3;
                text = transformedText16.getText();
                offsetMapping = transformedText16.getOffsetMapping();
                currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                int i4113 = i43;
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                textFieldState = (TextFieldState) objRememberedValue4;
                textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager16, backgroundColor16);
                textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new UndoManager(0, 1, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                undoManager = (UndoManager) objRememberedValue5;
                UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                textFieldSelectionManager.setState$foundation_release(textFieldState);
                textFieldSelectionManager.setValue$foundation_release(value);
                textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                textFieldSelectionManager.setFocusRequester(focusRequester);
                textFieldSelectionManager.setEditable(!z15);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope16 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BringIntoViewRequester bringIntoViewRequester16 = (BringIntoViewRequester) objRememberedValue8;
                companion2 = Modifier.INSTANCE;
                i iVar16 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope16, bringIntoViewRequester16);
                mutableInteractionSource5 = mutableInteractionSource4;
                Modifier modifierTextFieldFocusModifier16 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar16);
                composerStartRestartGroup.startReplaceableGroup(-55008004);
                if (textInputService == null) {
                    if (z14) {
                        z23 = false;
                    } else {
                        z23 = false;
                    }
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (TouchMode_androidKt.isInTouchMode()) {
                    z16 = false;
                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                } else {
                    z16 = false;
                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                }
                Modifier modifierDrawBehind16 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                Modifier modifierOnGloballyPositioned1111 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                Modifier modifierSemantics16 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText16, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                if (z14) {
                    z17 = z16;
                } else {
                    z17 = z16;
                }
                Modifier modifierCursor16 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i4113 >> 3) & 14);
                Function1<TextFieldValue, Unit> onValueChange17 = textFieldState.getOnValueChange();
                boolean z21114 = !z15;
                if (i44 == 1) {
                    z18 = true;
                } else {
                    z18 = z16;
                }
                Modifier modifierOnGloballyPositioned1112 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier19.then(modifierTextFieldFocusModifier16), textFieldState, focusManager16), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange17, z21114, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition16, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics16), new g(textFieldState));
                if (!z14) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (z19) {
                    modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                } else {
                    modifierTextFieldMagnifier = companion2;
                }
                boolean z21115 = z14;
                ImeOptions imeOptions110 = imeOptions3;
                VisualTransformation visualTransformation19 = visualTransformation2;
                composer2 = composerStartRestartGroup;
                a(modifierOnGloballyPositioned1112, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i4113, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition16, value, visualTransformation2, modifierCursor16, modifierDrawBehind16, modifierOnGloballyPositioned1111, modifierTextFieldMagnifier, bringIntoViewRequester16, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle3 = textStyle2;
                visualTransformation3 = visualTransformation19;
                function5 = function4;
                brush2 = solidColor;
                z20 = z13;
                i45 = i41;
                keyboardActions3 = keyboardActions2;
                mutableInteractionSource6 = mutableInteractionSource5;
                z21 = z15;
                function6 = function3M498getLambda1$foundation_release;
                modifier3 = modifier19;
                z22 = z21115;
                imeOptions4 = imeOptions110;
                i46 = i44;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(value, onValueChange, modifier3, textStyle3, visualTransformation3, function5, mutableInteractionSource6, brush2, z20, i46, i45, imeOptions4, keyboardActions3, z22, z21, function6, i12, i13, i14));
        }
        i15 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i12 & 7168) == 0) {
                if (composerStartRestartGroup.changed(textStyle)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                i15 |= 24576;
            } else if ((i12 & 57344) == 0) {
                if (composerStartRestartGroup.changed(visualTransformation)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i15 |= i19;
            }
            i20 = i14 & 32;
            if (i20 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i12 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i15 |= i21;
            }
            i22 = i14 & 64;
            if (i22 != 0) {
                i15 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i15 |= i23;
            }
            i24 = i14 & 128;
            if (i24 != 0) {
                i15 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(brush)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i15 |= i25;
            }
            i26 = i14 & 256;
            if (i26 != 0) {
                i15 |= 100663296;
            } else if ((i12 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i27 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i27 = 33554432;
                }
                i15 |= i27;
            }
            i28 = i14 & 512;
            if (i28 != 0) {
                i15 |= 805306368;
            } else if ((i12 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(i10)) {
                    i29 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i29 = 268435456;
                }
                i15 |= i29;
            }
            i30 = i14 & 1024;
            if (i30 != 0) {
                i31 = i13 | 6;
            } else if ((i13 & 14) == 0) {
                if (composerStartRestartGroup.changed(i11)) {
                    i32 = 4;
                } else {
                    i32 = 2;
                }
                i31 = i13 | i32;
            } else {
                i31 = i13;
            }
            if ((i13 & 112) != 0) {
                i31 |= ((i14 & 2048) == 0 || !composerStartRestartGroup.changed(imeOptions)) ? 16 : 32;
            }
            i33 = i31;
            i34 = i14 & 4096;
            if (i34 != 0) {
                if ((i13 & 896) == 0) {
                    if (composerStartRestartGroup.changed(keyboardActions)) {
                        i35 = 256;
                    } else {
                        i35 = 128;
                    }
                    i33 |= i35;
                }
                i36 = i14 & 8192;
                if (i36 != 0) {
                    if ((i13 & 7168) == 0) {
                        i33 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
                    }
                    i37 = i14 & 16384;
                    if (i37 != 0) {
                        i33 |= 24576;
                    } else if ((i13 & 57344) == 0) {
                        i33 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
                    }
                    i38 = i14 & 32768;
                    if (i38 != 0) {
                        i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i13 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i39 = 131072;
                        } else {
                            i39 = 65536;
                        }
                        i33 |= i39;
                    }
                    if ((i15 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i12 & 1) != 0) {
                            if (i47 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i16 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i18 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i20 != 0) {
                                function2 = a.f5816p0;
                            } else {
                                function2 = function1;
                            }
                            if (i22 != 0) {
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if (i24 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                            } else {
                                solidColor = brush;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i28 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i10;
                            }
                            if (i30 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i11;
                            }
                            if ((i14 & 2048) != 0) {
                                imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                i33 &= -113;
                            } else {
                                imeOptions2 = imeOptions;
                            }
                            if (i34 != 0) {
                                keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            } else {
                                keyboardActions2 = keyboardActions;
                            }
                            if (i36 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i37 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i38 != 0) {
                                function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                            } else {
                                function3M498getLambda1$foundation_release = function3;
                            }
                            visualTransformation2 = none;
                            function4 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i42 = i40;
                            imeOptions3 = imeOptions2;
                            i43 = i33;
                        } else {
                            if (i47 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i16 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i18 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i20 != 0) {
                                function2 = a.f5816p0;
                            } else {
                                function2 = function1;
                            }
                            if (i22 != 0) {
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if (i24 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                            } else {
                                solidColor = brush;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i28 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i10;
                            }
                            if (i30 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i11;
                            }
                            if ((i14 & 2048) != 0) {
                                imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                i33 &= -113;
                            } else {
                                imeOptions2 = imeOptions;
                            }
                            if (i34 != 0) {
                                keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            } else {
                                keyboardActions2 = keyboardActions;
                            }
                            if (i36 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i37 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i38 != 0) {
                                function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                            } else {
                                function3M498getLambda1$foundation_release = function3;
                            }
                            visualTransformation2 = none;
                            function4 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i42 = i40;
                            imeOptions3 = imeOptions2;
                            i43 = i33;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new FocusRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        focusRequester = (FocusRequester) objRememberedValue;
                        textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                        long backgroundColor17 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                        FocusManager focusManager17 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                        if (i42 == 1) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Vertical;
                        }
                        orientation2 = orientation;
                        Object[] objArr17 = {orientation2};
                        Saver<TextFieldScrollerPosition, Object> saver17 = TextFieldScrollerPosition.INSTANCE.getSaver();
                        Modifier modifier110 = modifier2;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(orientation2);
                        i44 = i42;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new l(orientation2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new l(orientation2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TextFieldScrollerPosition textFieldScrollerPosition17 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr17, (Saver) saver17, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                            composition = value.getComposition();
                            if (composition != null) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                if (objRememberedValue3 == null) {
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            objRememberedValue3 = transformedTextFilterWithValidation;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                            composition = value.getComposition();
                            if (composition != null) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                if (objRememberedValue3 == null) {
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            objRememberedValue3 = transformedTextFilterWithValidation;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TransformedText transformedText17 = (TransformedText) objRememberedValue3;
                        text = transformedText17.getText();
                        offsetMapping = transformedText17.getOffsetMapping();
                        currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        int i4114 = i43;
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        textFieldState = (TextFieldState) objRememberedValue4;
                        textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager17, backgroundColor17);
                        textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new UndoManager(0, 1, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        undoManager = (UndoManager) objRememberedValue5;
                        UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                        textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                        textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                        textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                        textFieldSelectionManager.setState$foundation_release(textFieldState);
                        textFieldSelectionManager.setValue$foundation_release(value);
                        textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                        textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                        textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                        textFieldSelectionManager.setFocusRequester(focusRequester);
                        textFieldSelectionManager.setEditable(!z15);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope17 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                            objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BringIntoViewRequester bringIntoViewRequester17 = (BringIntoViewRequester) objRememberedValue8;
                        companion2 = Modifier.INSTANCE;
                        i iVar17 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope17, bringIntoViewRequester17);
                        mutableInteractionSource5 = mutableInteractionSource4;
                        Modifier modifierTextFieldFocusModifier17 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar17);
                        composerStartRestartGroup.startReplaceableGroup(-55008004);
                        if (textInputService == null) {
                            if (z14) {
                                z23 = false;
                            } else {
                                z23 = false;
                            }
                            EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (TouchMode_androidKt.isInTouchMode()) {
                            z16 = false;
                            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        } else {
                            z16 = false;
                            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        }
                        Modifier modifierDrawBehind17 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                        Modifier modifierOnGloballyPositioned1113 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                        Modifier modifierSemantics17 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText17, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                        if (z14) {
                            z17 = z16;
                        } else {
                            z17 = z16;
                        }
                        Modifier modifierCursor17 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                        EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                        EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i4114 >> 3) & 14);
                        Function1<TextFieldValue, Unit> onValueChange18 = textFieldState.getOnValueChange();
                        boolean z21116 = !z15;
                        if (i44 == 1) {
                            z18 = true;
                        } else {
                            z18 = z16;
                        }
                        Modifier modifierOnGloballyPositioned1114 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier110.then(modifierTextFieldFocusModifier17), textFieldState, focusManager17), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange18, z21116, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition17, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics17), new g(textFieldState));
                        if (!z14) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                        } else {
                            modifierTextFieldMagnifier = companion2;
                        }
                        boolean z21117 = z14;
                        ImeOptions imeOptions111 = imeOptions3;
                        VisualTransformation visualTransformation110 = visualTransformation2;
                        composer2 = composerStartRestartGroup;
                        a(modifierOnGloballyPositioned1114, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i4114, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition17, value, visualTransformation2, modifierCursor17, modifierDrawBehind17, modifierOnGloballyPositioned1113, modifierTextFieldMagnifier, bringIntoViewRequester17, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        textStyle3 = textStyle2;
                        visualTransformation3 = visualTransformation110;
                        function5 = function4;
                        brush2 = solidColor;
                        z20 = z13;
                        i45 = i41;
                        keyboardActions3 = keyboardActions2;
                        mutableInteractionSource6 = mutableInteractionSource5;
                        z21 = z15;
                        function6 = function3M498getLambda1$foundation_release;
                        modifier3 = modifier110;
                        z22 = z21117;
                        imeOptions4 = imeOptions111;
                        i46 = i44;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i12 & 1) != 0) {
                            if (i47 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i16 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i18 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i20 != 0) {
                                function2 = a.f5816p0;
                            } else {
                                function2 = function1;
                            }
                            if (i22 != 0) {
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if (i24 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                            } else {
                                solidColor = brush;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i28 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i10;
                            }
                            if (i30 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i11;
                            }
                            if ((i14 & 2048) != 0) {
                                imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                i33 &= -113;
                            } else {
                                imeOptions2 = imeOptions;
                            }
                            if (i34 != 0) {
                                keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            } else {
                                keyboardActions2 = keyboardActions;
                            }
                            if (i36 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i37 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i38 != 0) {
                                function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                            } else {
                                function3M498getLambda1$foundation_release = function3;
                            }
                            visualTransformation2 = none;
                            function4 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i42 = i40;
                            imeOptions3 = imeOptions2;
                            i43 = i33;
                        } else {
                            if (i47 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i16 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle2 = textStyle;
                            }
                            if (i18 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation;
                            }
                            if (i20 != 0) {
                                function2 = a.f5816p0;
                            } else {
                                function2 = function1;
                            }
                            if (i22 != 0) {
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if (i24 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                            } else {
                                solidColor = brush;
                            }
                            if (i26 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i28 != 0) {
                                i40 = Integer.MAX_VALUE;
                            } else {
                                i40 = i10;
                            }
                            if (i30 != 0) {
                                i41 = 1;
                            } else {
                                i41 = i11;
                            }
                            if ((i14 & 2048) != 0) {
                                imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                i33 &= -113;
                            } else {
                                imeOptions2 = imeOptions;
                            }
                            if (i34 != 0) {
                                keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                            } else {
                                keyboardActions2 = keyboardActions;
                            }
                            if (i36 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i37 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i38 != 0) {
                                function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                            } else {
                                function3M498getLambda1$foundation_release = function3;
                            }
                            visualTransformation2 = none;
                            function4 = function2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i42 = i40;
                            imeOptions3 = imeOptions2;
                            i43 = i33;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new FocusRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        focusRequester = (FocusRequester) objRememberedValue;
                        textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                        long backgroundColor18 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                        FocusManager focusManager18 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                        if (i42 == 1) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Vertical;
                        }
                        orientation2 = orientation;
                        Object[] objArr18 = {orientation2};
                        Saver<TextFieldScrollerPosition, Object> saver18 = TextFieldScrollerPosition.INSTANCE.getSaver();
                        Modifier modifier111 = modifier2;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(orientation2);
                        i44 = i42;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new l(orientation2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new l(orientation2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TextFieldScrollerPosition textFieldScrollerPosition18 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr18, (Saver) saver18, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                            composition = value.getComposition();
                            if (composition != null) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                if (objRememberedValue3 == null) {
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            objRememberedValue3 = transformedTextFilterWithValidation;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                            composition = value.getComposition();
                            if (composition != null) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                                if (objRememberedValue3 == null) {
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                            objRememberedValue3 = transformedTextFilterWithValidation;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TransformedText transformedText18 = (TransformedText) objRememberedValue3;
                        text = transformedText18.getText();
                        offsetMapping = transformedText18.getOffsetMapping();
                        currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        int i4115 = i43;
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        textFieldState = (TextFieldState) objRememberedValue4;
                        textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager18, backgroundColor18);
                        textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new UndoManager(0, 1, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        undoManager = (UndoManager) objRememberedValue5;
                        UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                        textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                        textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                        textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                        textFieldSelectionManager.setState$foundation_release(textFieldState);
                        textFieldSelectionManager.setValue$foundation_release(value);
                        textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                        textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                        textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                        textFieldSelectionManager.setFocusRequester(focusRequester);
                        textFieldSelectionManager.setEditable(!z15);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope18 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                            objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BringIntoViewRequester bringIntoViewRequester18 = (BringIntoViewRequester) objRememberedValue8;
                        companion2 = Modifier.INSTANCE;
                        i iVar18 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope18, bringIntoViewRequester18);
                        mutableInteractionSource5 = mutableInteractionSource4;
                        Modifier modifierTextFieldFocusModifier18 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar18);
                        composerStartRestartGroup.startReplaceableGroup(-55008004);
                        if (textInputService == null) {
                            if (z14) {
                                z23 = false;
                            } else {
                                z23 = false;
                            }
                            EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (TouchMode_androidKt.isInTouchMode()) {
                            z16 = false;
                            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        } else {
                            z16 = false;
                            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        }
                        Modifier modifierDrawBehind18 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                        Modifier modifierOnGloballyPositioned1115 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                        Modifier modifierSemantics18 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText18, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                        if (z14) {
                            z17 = z16;
                        } else {
                            z17 = z16;
                        }
                        Modifier modifierCursor18 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                        EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                        EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i4115 >> 3) & 14);
                        Function1<TextFieldValue, Unit> onValueChange19 = textFieldState.getOnValueChange();
                        boolean z21118 = !z15;
                        if (i44 == 1) {
                            z18 = true;
                        } else {
                            z18 = z16;
                        }
                        Modifier modifierOnGloballyPositioned1116 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier111.then(modifierTextFieldFocusModifier18), textFieldState, focusManager18), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange19, z21118, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition18, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics18), new g(textFieldState));
                        if (!z14) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                        } else {
                            modifierTextFieldMagnifier = companion2;
                        }
                        boolean z21119 = z14;
                        ImeOptions imeOptions112 = imeOptions3;
                        VisualTransformation visualTransformation111 = visualTransformation2;
                        composer2 = composerStartRestartGroup;
                        a(modifierOnGloballyPositioned1116, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i4115, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition18, value, visualTransformation2, modifierCursor18, modifierDrawBehind18, modifierOnGloballyPositioned1115, modifierTextFieldMagnifier, bringIntoViewRequester18, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        textStyle3 = textStyle2;
                        visualTransformation3 = visualTransformation111;
                        function5 = function4;
                        brush2 = solidColor;
                        z20 = z13;
                        i45 = i41;
                        keyboardActions3 = keyboardActions2;
                        mutableInteractionSource6 = mutableInteractionSource5;
                        z21 = z15;
                        function6 = function3M498getLambda1$foundation_release;
                        modifier3 = modifier111;
                        z22 = z21119;
                        imeOptions4 = imeOptions112;
                        i46 = i44;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(value, onValueChange, modifier3, textStyle3, visualTransformation3, function5, mutableInteractionSource6, brush2, z20, i46, i45, imeOptions4, keyboardActions3, z22, z21, function6, i12, i13, i14));
                }
                i33 |= 3072;
                i37 = i14 & 16384;
                if (i37 != 0) {
                    i33 |= 24576;
                } else if ((i13 & 57344) == 0) {
                    i33 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
                }
                i38 = i14 & 32768;
                if (i38 != 0) {
                    i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i13 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i39 = 131072;
                    } else {
                        i39 = 65536;
                    }
                    i33 |= i39;
                }
                if ((i15 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    } else {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new FocusRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    focusRequester = (FocusRequester) objRememberedValue;
                    textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                    long backgroundColor19 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                    FocusManager focusManager19 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    if (i42 == 1) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Vertical;
                    }
                    orientation2 = orientation;
                    Object[] objArr19 = {orientation2};
                    Saver<TextFieldScrollerPosition, Object> saver19 = TextFieldScrollerPosition.INSTANCE.getSaver();
                    Modifier modifier112 = modifier2;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(orientation2);
                    i44 = i42;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldScrollerPosition textFieldScrollerPosition19 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr19, (Saver) saver19, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TransformedText transformedText19 = (TransformedText) objRememberedValue3;
                    text = transformedText19.getText();
                    offsetMapping = transformedText19.getOffsetMapping();
                    currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    int i4116 = i43;
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldState = (TextFieldState) objRememberedValue4;
                    textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager19, backgroundColor19);
                    textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new UndoManager(0, 1, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    undoManager = (UndoManager) objRememberedValue5;
                    UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                    textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                    textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                    textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                    textFieldSelectionManager.setState$foundation_release(textFieldState);
                    textFieldSelectionManager.setValue$foundation_release(value);
                    textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                    textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                    textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                    textFieldSelectionManager.setFocusRequester(focusRequester);
                    textFieldSelectionManager.setEditable(!z15);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope19 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BringIntoViewRequester bringIntoViewRequester19 = (BringIntoViewRequester) objRememberedValue8;
                    companion2 = Modifier.INSTANCE;
                    i iVar19 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope19, bringIntoViewRequester19);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    Modifier modifierTextFieldFocusModifier19 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar19);
                    composerStartRestartGroup.startReplaceableGroup(-55008004);
                    if (textInputService == null) {
                        if (z14) {
                            z23 = false;
                        } else {
                            z23 = false;
                        }
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (TouchMode_androidKt.isInTouchMode()) {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    } else {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    }
                    Modifier modifierDrawBehind19 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                    Modifier modifierOnGloballyPositioned1117 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                    Modifier modifierSemantics19 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText19, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                    if (z14) {
                        z17 = z16;
                    } else {
                        z17 = z16;
                    }
                    Modifier modifierCursor19 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                    EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                    EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i4116 >> 3) & 14);
                    Function1<TextFieldValue, Unit> onValueChange110 = textFieldState.getOnValueChange();
                    boolean z211110 = !z15;
                    if (i44 == 1) {
                        z18 = true;
                    } else {
                        z18 = z16;
                    }
                    Modifier modifierOnGloballyPositioned1118 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier112.then(modifierTextFieldFocusModifier19), textFieldState, focusManager19), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange110, z211110, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition19, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics19), new g(textFieldState));
                    if (!z14) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                    } else {
                        modifierTextFieldMagnifier = companion2;
                    }
                    boolean z211111 = z14;
                    ImeOptions imeOptions113 = imeOptions3;
                    VisualTransformation visualTransformation112 = visualTransformation2;
                    composer2 = composerStartRestartGroup;
                    a(modifierOnGloballyPositioned1118, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i4116, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition19, value, visualTransformation2, modifierCursor19, modifierDrawBehind19, modifierOnGloballyPositioned1117, modifierTextFieldMagnifier, bringIntoViewRequester19, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textStyle3 = textStyle2;
                    visualTransformation3 = visualTransformation112;
                    function5 = function4;
                    brush2 = solidColor;
                    z20 = z13;
                    i45 = i41;
                    keyboardActions3 = keyboardActions2;
                    mutableInteractionSource6 = mutableInteractionSource5;
                    z21 = z15;
                    function6 = function3M498getLambda1$foundation_release;
                    modifier3 = modifier112;
                    z22 = z211111;
                    imeOptions4 = imeOptions113;
                    i46 = i44;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    } else {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new FocusRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    focusRequester = (FocusRequester) objRememberedValue;
                    textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                    long backgroundColor110 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                    FocusManager focusManager110 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    if (i42 == 1) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Vertical;
                    }
                    orientation2 = orientation;
                    Object[] objArr110 = {orientation2};
                    Saver<TextFieldScrollerPosition, Object> saver110 = TextFieldScrollerPosition.INSTANCE.getSaver();
                    Modifier modifier113 = modifier2;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(orientation2);
                    i44 = i42;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldScrollerPosition textFieldScrollerPosition110 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr110, (Saver) saver110, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TransformedText transformedText110 = (TransformedText) objRememberedValue3;
                    text = transformedText110.getText();
                    offsetMapping = transformedText110.getOffsetMapping();
                    currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    int i4117 = i43;
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldState = (TextFieldState) objRememberedValue4;
                    textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager110, backgroundColor110);
                    textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new UndoManager(0, 1, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    undoManager = (UndoManager) objRememberedValue5;
                    UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                    textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                    textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                    textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                    textFieldSelectionManager.setState$foundation_release(textFieldState);
                    textFieldSelectionManager.setValue$foundation_release(value);
                    textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                    textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                    textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                    textFieldSelectionManager.setFocusRequester(focusRequester);
                    textFieldSelectionManager.setEditable(!z15);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope110 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BringIntoViewRequester bringIntoViewRequester110 = (BringIntoViewRequester) objRememberedValue8;
                    companion2 = Modifier.INSTANCE;
                    i iVar110 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope110, bringIntoViewRequester110);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    Modifier modifierTextFieldFocusModifier110 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar110);
                    composerStartRestartGroup.startReplaceableGroup(-55008004);
                    if (textInputService == null) {
                        if (z14) {
                            z23 = false;
                        } else {
                            z23 = false;
                        }
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (TouchMode_androidKt.isInTouchMode()) {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    } else {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    }
                    Modifier modifierDrawBehind110 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                    Modifier modifierOnGloballyPositioned1119 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                    Modifier modifierSemantics110 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText110, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                    if (z14) {
                        z17 = z16;
                    } else {
                        z17 = z16;
                    }
                    Modifier modifierCursor110 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                    EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                    EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i4117 >> 3) & 14);
                    Function1<TextFieldValue, Unit> onValueChange111 = textFieldState.getOnValueChange();
                    boolean z211112 = !z15;
                    if (i44 == 1) {
                        z18 = true;
                    } else {
                        z18 = z16;
                    }
                    Modifier modifierOnGloballyPositioned11110 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier113.then(modifierTextFieldFocusModifier110), textFieldState, focusManager110), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange111, z211112, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition110, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics110), new g(textFieldState));
                    if (!z14) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                    } else {
                        modifierTextFieldMagnifier = companion2;
                    }
                    boolean z211113 = z14;
                    ImeOptions imeOptions114 = imeOptions3;
                    VisualTransformation visualTransformation113 = visualTransformation2;
                    composer2 = composerStartRestartGroup;
                    a(modifierOnGloballyPositioned11110, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i4117, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition110, value, visualTransformation2, modifierCursor110, modifierDrawBehind110, modifierOnGloballyPositioned1119, modifierTextFieldMagnifier, bringIntoViewRequester110, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textStyle3 = textStyle2;
                    visualTransformation3 = visualTransformation113;
                    function5 = function4;
                    brush2 = solidColor;
                    z20 = z13;
                    i45 = i41;
                    keyboardActions3 = keyboardActions2;
                    mutableInteractionSource6 = mutableInteractionSource5;
                    z21 = z15;
                    function6 = function3M498getLambda1$foundation_release;
                    modifier3 = modifier113;
                    z22 = z211113;
                    imeOptions4 = imeOptions114;
                    i46 = i44;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(value, onValueChange, modifier3, textStyle3, visualTransformation3, function5, mutableInteractionSource6, brush2, z20, i46, i45, imeOptions4, keyboardActions3, z22, z21, function6, i12, i13, i14));
            }
            i33 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            i36 = i14 & 8192;
            if (i36 != 0) {
                if ((i13 & 7168) == 0) {
                    i33 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
                }
                i37 = i14 & 16384;
                if (i37 != 0) {
                    i33 |= 24576;
                } else if ((i13 & 57344) == 0) {
                    i33 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
                }
                i38 = i14 & 32768;
                if (i38 != 0) {
                    i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i13 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i39 = 131072;
                    } else {
                        i39 = 65536;
                    }
                    i33 |= i39;
                }
                if ((i15 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    } else {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new FocusRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    focusRequester = (FocusRequester) objRememberedValue;
                    textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                    long backgroundColor111 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                    FocusManager focusManager111 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    if (i42 == 1) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Vertical;
                    }
                    orientation2 = orientation;
                    Object[] objArr111 = {orientation2};
                    Saver<TextFieldScrollerPosition, Object> saver111 = TextFieldScrollerPosition.INSTANCE.getSaver();
                    Modifier modifier114 = modifier2;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(orientation2);
                    i44 = i42;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldScrollerPosition textFieldScrollerPosition111 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr111, (Saver) saver111, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TransformedText transformedText111 = (TransformedText) objRememberedValue3;
                    text = transformedText111.getText();
                    offsetMapping = transformedText111.getOffsetMapping();
                    currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    int i4118 = i43;
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldState = (TextFieldState) objRememberedValue4;
                    textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager111, backgroundColor111);
                    textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new UndoManager(0, 1, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    undoManager = (UndoManager) objRememberedValue5;
                    UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                    textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                    textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                    textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                    textFieldSelectionManager.setState$foundation_release(textFieldState);
                    textFieldSelectionManager.setValue$foundation_release(value);
                    textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                    textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                    textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                    textFieldSelectionManager.setFocusRequester(focusRequester);
                    textFieldSelectionManager.setEditable(!z15);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope111 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BringIntoViewRequester bringIntoViewRequester111 = (BringIntoViewRequester) objRememberedValue8;
                    companion2 = Modifier.INSTANCE;
                    i iVar111 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope111, bringIntoViewRequester111);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    Modifier modifierTextFieldFocusModifier111 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar111);
                    composerStartRestartGroup.startReplaceableGroup(-55008004);
                    if (textInputService == null) {
                        if (z14) {
                            z23 = false;
                        } else {
                            z23 = false;
                        }
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (TouchMode_androidKt.isInTouchMode()) {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    } else {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    }
                    Modifier modifierDrawBehind111 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                    Modifier modifierOnGloballyPositioned11111 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                    Modifier modifierSemantics111 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText111, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                    if (z14) {
                        z17 = z16;
                    } else {
                        z17 = z16;
                    }
                    Modifier modifierCursor111 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                    EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                    EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i4118 >> 3) & 14);
                    Function1<TextFieldValue, Unit> onValueChange112 = textFieldState.getOnValueChange();
                    boolean z211114 = !z15;
                    if (i44 == 1) {
                        z18 = true;
                    } else {
                        z18 = z16;
                    }
                    Modifier modifierOnGloballyPositioned11112 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier114.then(modifierTextFieldFocusModifier111), textFieldState, focusManager111), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange112, z211114, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition111, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics111), new g(textFieldState));
                    if (!z14) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                    } else {
                        modifierTextFieldMagnifier = companion2;
                    }
                    boolean z211115 = z14;
                    ImeOptions imeOptions115 = imeOptions3;
                    VisualTransformation visualTransformation114 = visualTransformation2;
                    composer2 = composerStartRestartGroup;
                    a(modifierOnGloballyPositioned11112, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i4118, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition111, value, visualTransformation2, modifierCursor111, modifierDrawBehind111, modifierOnGloballyPositioned11111, modifierTextFieldMagnifier, bringIntoViewRequester111, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textStyle3 = textStyle2;
                    visualTransformation3 = visualTransformation114;
                    function5 = function4;
                    brush2 = solidColor;
                    z20 = z13;
                    i45 = i41;
                    keyboardActions3 = keyboardActions2;
                    mutableInteractionSource6 = mutableInteractionSource5;
                    z21 = z15;
                    function6 = function3M498getLambda1$foundation_release;
                    modifier3 = modifier114;
                    z22 = z211115;
                    imeOptions4 = imeOptions115;
                    i46 = i44;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    } else {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new FocusRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    focusRequester = (FocusRequester) objRememberedValue;
                    textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                    long backgroundColor112 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                    FocusManager focusManager112 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    if (i42 == 1) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Vertical;
                    }
                    orientation2 = orientation;
                    Object[] objArr112 = {orientation2};
                    Saver<TextFieldScrollerPosition, Object> saver112 = TextFieldScrollerPosition.INSTANCE.getSaver();
                    Modifier modifier115 = modifier2;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(orientation2);
                    i44 = i42;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldScrollerPosition textFieldScrollerPosition112 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr112, (Saver) saver112, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TransformedText transformedText112 = (TransformedText) objRememberedValue3;
                    text = transformedText112.getText();
                    offsetMapping = transformedText112.getOffsetMapping();
                    currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    int i4119 = i43;
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldState = (TextFieldState) objRememberedValue4;
                    textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager112, backgroundColor112);
                    textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new UndoManager(0, 1, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    undoManager = (UndoManager) objRememberedValue5;
                    UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                    textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                    textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                    textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                    textFieldSelectionManager.setState$foundation_release(textFieldState);
                    textFieldSelectionManager.setValue$foundation_release(value);
                    textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                    textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                    textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                    textFieldSelectionManager.setFocusRequester(focusRequester);
                    textFieldSelectionManager.setEditable(!z15);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope112 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BringIntoViewRequester bringIntoViewRequester112 = (BringIntoViewRequester) objRememberedValue8;
                    companion2 = Modifier.INSTANCE;
                    i iVar112 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope112, bringIntoViewRequester112);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    Modifier modifierTextFieldFocusModifier112 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar112);
                    composerStartRestartGroup.startReplaceableGroup(-55008004);
                    if (textInputService == null) {
                        if (z14) {
                            z23 = false;
                        } else {
                            z23 = false;
                        }
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (TouchMode_androidKt.isInTouchMode()) {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    } else {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    }
                    Modifier modifierDrawBehind112 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                    Modifier modifierOnGloballyPositioned11113 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                    Modifier modifierSemantics112 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText112, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                    if (z14) {
                        z17 = z16;
                    } else {
                        z17 = z16;
                    }
                    Modifier modifierCursor112 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                    EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                    EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i4119 >> 3) & 14);
                    Function1<TextFieldValue, Unit> onValueChange113 = textFieldState.getOnValueChange();
                    boolean z211116 = !z15;
                    if (i44 == 1) {
                        z18 = true;
                    } else {
                        z18 = z16;
                    }
                    Modifier modifierOnGloballyPositioned11114 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier115.then(modifierTextFieldFocusModifier112), textFieldState, focusManager112), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange113, z211116, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition112, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics112), new g(textFieldState));
                    if (!z14) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                    } else {
                        modifierTextFieldMagnifier = companion2;
                    }
                    boolean z211117 = z14;
                    ImeOptions imeOptions116 = imeOptions3;
                    VisualTransformation visualTransformation115 = visualTransformation2;
                    composer2 = composerStartRestartGroup;
                    a(modifierOnGloballyPositioned11114, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i4119, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition112, value, visualTransformation2, modifierCursor112, modifierDrawBehind112, modifierOnGloballyPositioned11113, modifierTextFieldMagnifier, bringIntoViewRequester112, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textStyle3 = textStyle2;
                    visualTransformation3 = visualTransformation115;
                    function5 = function4;
                    brush2 = solidColor;
                    z20 = z13;
                    i45 = i41;
                    keyboardActions3 = keyboardActions2;
                    mutableInteractionSource6 = mutableInteractionSource5;
                    z21 = z15;
                    function6 = function3M498getLambda1$foundation_release;
                    modifier3 = modifier115;
                    z22 = z211117;
                    imeOptions4 = imeOptions116;
                    i46 = i44;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(value, onValueChange, modifier3, textStyle3, visualTransformation3, function5, mutableInteractionSource6, brush2, z20, i46, i45, imeOptions4, keyboardActions3, z22, z21, function6, i12, i13, i14));
            }
            i33 |= 3072;
            i37 = i14 & 16384;
            if (i37 != 0) {
                i33 |= 24576;
            } else if ((i13 & 57344) == 0) {
                i33 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
            }
            i38 = i14 & 32768;
            if (i38 != 0) {
                i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i13 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i39 = 131072;
                } else {
                    i39 = 65536;
                }
                i33 |= i39;
            }
            if ((i15 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i12 & 1) != 0) {
                    if (i47 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i18 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i20 != 0) {
                        function2 = a.f5816p0;
                    } else {
                        function2 = function1;
                    }
                    if (i22 != 0) {
                        mutableInteractionSource2 = null;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i24 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                    } else {
                        solidColor = brush;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i28 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i10;
                    }
                    if (i30 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i11;
                    }
                    if ((i14 & 2048) != 0) {
                        imeOptions2 = ImeOptions.INSTANCE.getDefault();
                        i33 &= -113;
                    } else {
                        imeOptions2 = imeOptions;
                    }
                    if (i34 != 0) {
                        keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    if (i36 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i38 != 0) {
                        function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                    } else {
                        function3M498getLambda1$foundation_release = function3;
                    }
                    visualTransformation2 = none;
                    function4 = function2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i42 = i40;
                    imeOptions3 = imeOptions2;
                    i43 = i33;
                } else {
                    if (i47 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i18 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i20 != 0) {
                        function2 = a.f5816p0;
                    } else {
                        function2 = function1;
                    }
                    if (i22 != 0) {
                        mutableInteractionSource2 = null;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i24 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                    } else {
                        solidColor = brush;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i28 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i10;
                    }
                    if (i30 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i11;
                    }
                    if ((i14 & 2048) != 0) {
                        imeOptions2 = ImeOptions.INSTANCE.getDefault();
                        i33 &= -113;
                    } else {
                        imeOptions2 = imeOptions;
                    }
                    if (i34 != 0) {
                        keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    if (i36 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i38 != 0) {
                        function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                    } else {
                        function3M498getLambda1$foundation_release = function3;
                    }
                    visualTransformation2 = none;
                    function4 = function2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i42 = i40;
                    imeOptions3 = imeOptions2;
                    i43 = i33;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                focusRequester = (FocusRequester) objRememberedValue;
                textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                long backgroundColor113 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                FocusManager focusManager113 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                if (i42 == 1) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Vertical;
                }
                orientation2 = orientation;
                Object[] objArr113 = {orientation2};
                Saver<TextFieldScrollerPosition, Object> saver113 = TextFieldScrollerPosition.INSTANCE.getSaver();
                Modifier modifier116 = modifier2;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(orientation2);
                i44 = i42;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new l(orientation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new l(orientation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldScrollerPosition textFieldScrollerPosition113 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr113, (Saver) saver113, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                    composition = value.getComposition();
                    if (composition != null) {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                        if (objRememberedValue3 == null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    objRememberedValue3 = transformedTextFilterWithValidation;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                    composition = value.getComposition();
                    if (composition != null) {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                        if (objRememberedValue3 == null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    objRememberedValue3 = transformedTextFilterWithValidation;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TransformedText transformedText113 = (TransformedText) objRememberedValue3;
                text = transformedText113.getText();
                offsetMapping = transformedText113.getOffsetMapping();
                currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                int i41110 = i43;
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                textFieldState = (TextFieldState) objRememberedValue4;
                textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager113, backgroundColor113);
                textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new UndoManager(0, 1, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                undoManager = (UndoManager) objRememberedValue5;
                UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                textFieldSelectionManager.setState$foundation_release(textFieldState);
                textFieldSelectionManager.setValue$foundation_release(value);
                textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                textFieldSelectionManager.setFocusRequester(focusRequester);
                textFieldSelectionManager.setEditable(!z15);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope113 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BringIntoViewRequester bringIntoViewRequester113 = (BringIntoViewRequester) objRememberedValue8;
                companion2 = Modifier.INSTANCE;
                i iVar113 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope113, bringIntoViewRequester113);
                mutableInteractionSource5 = mutableInteractionSource4;
                Modifier modifierTextFieldFocusModifier113 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar113);
                composerStartRestartGroup.startReplaceableGroup(-55008004);
                if (textInputService == null) {
                    if (z14) {
                        z23 = false;
                    } else {
                        z23 = false;
                    }
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (TouchMode_androidKt.isInTouchMode()) {
                    z16 = false;
                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                } else {
                    z16 = false;
                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                }
                Modifier modifierDrawBehind113 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                Modifier modifierOnGloballyPositioned11115 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                Modifier modifierSemantics113 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText113, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                if (z14) {
                    z17 = z16;
                } else {
                    z17 = z16;
                }
                Modifier modifierCursor113 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i41110 >> 3) & 14);
                Function1<TextFieldValue, Unit> onValueChange114 = textFieldState.getOnValueChange();
                boolean z211118 = !z15;
                if (i44 == 1) {
                    z18 = true;
                } else {
                    z18 = z16;
                }
                Modifier modifierOnGloballyPositioned11116 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier116.then(modifierTextFieldFocusModifier113), textFieldState, focusManager113), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange114, z211118, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition113, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics113), new g(textFieldState));
                if (!z14) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (z19) {
                    modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                } else {
                    modifierTextFieldMagnifier = companion2;
                }
                boolean z211119 = z14;
                ImeOptions imeOptions117 = imeOptions3;
                VisualTransformation visualTransformation116 = visualTransformation2;
                composer2 = composerStartRestartGroup;
                a(modifierOnGloballyPositioned11116, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i41110, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition113, value, visualTransformation2, modifierCursor113, modifierDrawBehind113, modifierOnGloballyPositioned11115, modifierTextFieldMagnifier, bringIntoViewRequester113, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle3 = textStyle2;
                visualTransformation3 = visualTransformation116;
                function5 = function4;
                brush2 = solidColor;
                z20 = z13;
                i45 = i41;
                keyboardActions3 = keyboardActions2;
                mutableInteractionSource6 = mutableInteractionSource5;
                z21 = z15;
                function6 = function3M498getLambda1$foundation_release;
                modifier3 = modifier116;
                z22 = z211119;
                imeOptions4 = imeOptions117;
                i46 = i44;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i12 & 1) != 0) {
                    if (i47 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i18 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i20 != 0) {
                        function2 = a.f5816p0;
                    } else {
                        function2 = function1;
                    }
                    if (i22 != 0) {
                        mutableInteractionSource2 = null;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i24 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                    } else {
                        solidColor = brush;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i28 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i10;
                    }
                    if (i30 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i11;
                    }
                    if ((i14 & 2048) != 0) {
                        imeOptions2 = ImeOptions.INSTANCE.getDefault();
                        i33 &= -113;
                    } else {
                        imeOptions2 = imeOptions;
                    }
                    if (i34 != 0) {
                        keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    if (i36 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i38 != 0) {
                        function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                    } else {
                        function3M498getLambda1$foundation_release = function3;
                    }
                    visualTransformation2 = none;
                    function4 = function2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i42 = i40;
                    imeOptions3 = imeOptions2;
                    i43 = i33;
                } else {
                    if (i47 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i18 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i20 != 0) {
                        function2 = a.f5816p0;
                    } else {
                        function2 = function1;
                    }
                    if (i22 != 0) {
                        mutableInteractionSource2 = null;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i24 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                    } else {
                        solidColor = brush;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i28 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i10;
                    }
                    if (i30 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i11;
                    }
                    if ((i14 & 2048) != 0) {
                        imeOptions2 = ImeOptions.INSTANCE.getDefault();
                        i33 &= -113;
                    } else {
                        imeOptions2 = imeOptions;
                    }
                    if (i34 != 0) {
                        keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    if (i36 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i38 != 0) {
                        function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                    } else {
                        function3M498getLambda1$foundation_release = function3;
                    }
                    visualTransformation2 = none;
                    function4 = function2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i42 = i40;
                    imeOptions3 = imeOptions2;
                    i43 = i33;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                focusRequester = (FocusRequester) objRememberedValue;
                textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                long backgroundColor114 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                FocusManager focusManager114 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                if (i42 == 1) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Vertical;
                }
                orientation2 = orientation;
                Object[] objArr114 = {orientation2};
                Saver<TextFieldScrollerPosition, Object> saver114 = TextFieldScrollerPosition.INSTANCE.getSaver();
                Modifier modifier117 = modifier2;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(orientation2);
                i44 = i42;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new l(orientation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new l(orientation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldScrollerPosition textFieldScrollerPosition114 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr114, (Saver) saver114, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                    composition = value.getComposition();
                    if (composition != null) {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                        if (objRememberedValue3 == null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    objRememberedValue3 = transformedTextFilterWithValidation;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                    composition = value.getComposition();
                    if (composition != null) {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                        if (objRememberedValue3 == null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    objRememberedValue3 = transformedTextFilterWithValidation;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TransformedText transformedText114 = (TransformedText) objRememberedValue3;
                text = transformedText114.getText();
                offsetMapping = transformedText114.getOffsetMapping();
                currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                int i41111 = i43;
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                textFieldState = (TextFieldState) objRememberedValue4;
                textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager114, backgroundColor114);
                textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new UndoManager(0, 1, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                undoManager = (UndoManager) objRememberedValue5;
                UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                textFieldSelectionManager.setState$foundation_release(textFieldState);
                textFieldSelectionManager.setValue$foundation_release(value);
                textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                textFieldSelectionManager.setFocusRequester(focusRequester);
                textFieldSelectionManager.setEditable(!z15);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope114 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BringIntoViewRequester bringIntoViewRequester114 = (BringIntoViewRequester) objRememberedValue8;
                companion2 = Modifier.INSTANCE;
                i iVar114 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope114, bringIntoViewRequester114);
                mutableInteractionSource5 = mutableInteractionSource4;
                Modifier modifierTextFieldFocusModifier114 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar114);
                composerStartRestartGroup.startReplaceableGroup(-55008004);
                if (textInputService == null) {
                    if (z14) {
                        z23 = false;
                    } else {
                        z23 = false;
                    }
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (TouchMode_androidKt.isInTouchMode()) {
                    z16 = false;
                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                } else {
                    z16 = false;
                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                }
                Modifier modifierDrawBehind114 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                Modifier modifierOnGloballyPositioned11117 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                Modifier modifierSemantics114 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText114, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                if (z14) {
                    z17 = z16;
                } else {
                    z17 = z16;
                }
                Modifier modifierCursor114 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i41111 >> 3) & 14);
                Function1<TextFieldValue, Unit> onValueChange115 = textFieldState.getOnValueChange();
                boolean z2111110 = !z15;
                if (i44 == 1) {
                    z18 = true;
                } else {
                    z18 = z16;
                }
                Modifier modifierOnGloballyPositioned11118 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier117.then(modifierTextFieldFocusModifier114), textFieldState, focusManager114), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange115, z2111110, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition114, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics114), new g(textFieldState));
                if (!z14) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (z19) {
                    modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                } else {
                    modifierTextFieldMagnifier = companion2;
                }
                boolean z2111111 = z14;
                ImeOptions imeOptions118 = imeOptions3;
                VisualTransformation visualTransformation117 = visualTransformation2;
                composer2 = composerStartRestartGroup;
                a(modifierOnGloballyPositioned11118, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i41111, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition114, value, visualTransformation2, modifierCursor114, modifierDrawBehind114, modifierOnGloballyPositioned11117, modifierTextFieldMagnifier, bringIntoViewRequester114, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle3 = textStyle2;
                visualTransformation3 = visualTransformation117;
                function5 = function4;
                brush2 = solidColor;
                z20 = z13;
                i45 = i41;
                keyboardActions3 = keyboardActions2;
                mutableInteractionSource6 = mutableInteractionSource5;
                z21 = z15;
                function6 = function3M498getLambda1$foundation_release;
                modifier3 = modifier117;
                z22 = z2111111;
                imeOptions4 = imeOptions118;
                i46 = i44;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(value, onValueChange, modifier3, textStyle3, visualTransformation3, function5, mutableInteractionSource6, brush2, z20, i46, i45, imeOptions4, keyboardActions3, z22, z21, function6, i12, i13, i14));
        }
        i15 |= 3072;
        i18 = i14 & 16;
        if (i18 != 0) {
            i15 |= 24576;
        } else if ((i12 & 57344) == 0) {
            if (composerStartRestartGroup.changed(visualTransformation)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i15 |= i19;
        }
        i20 = i14 & 32;
        if (i20 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i12 & 458752) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i21 = 131072;
            } else {
                i21 = 65536;
            }
            i15 |= i21;
        }
        i22 = i14 & 64;
        if (i22 != 0) {
            i15 |= 1572864;
        } else if ((i12 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i23 = 1048576;
            } else {
                i23 = 524288;
            }
            i15 |= i23;
        }
        i24 = i14 & 128;
        if (i24 != 0) {
            i15 |= 12582912;
        } else if ((i12 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(brush)) {
                i25 = 8388608;
            } else {
                i25 = 4194304;
            }
            i15 |= i25;
        }
        i26 = i14 & 256;
        if (i26 != 0) {
            i15 |= 100663296;
        } else if ((i12 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(z10)) {
                i27 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i27 = 33554432;
            }
            i15 |= i27;
        }
        i28 = i14 & 512;
        if (i28 != 0) {
            i15 |= 805306368;
        } else if ((i12 & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(i10)) {
                i29 = PKIFailureInfo.duplicateCertReq;
            } else {
                i29 = 268435456;
            }
            i15 |= i29;
        }
        i30 = i14 & 1024;
        if (i30 != 0) {
            i31 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            if (composerStartRestartGroup.changed(i11)) {
                i32 = 4;
            } else {
                i32 = 2;
            }
            i31 = i13 | i32;
        } else {
            i31 = i13;
        }
        if ((i13 & 112) != 0) {
            i31 |= ((i14 & 2048) == 0 || !composerStartRestartGroup.changed(imeOptions)) ? 16 : 32;
        }
        i33 = i31;
        i34 = i14 & 4096;
        if (i34 != 0) {
            if ((i13 & 896) == 0) {
                if (composerStartRestartGroup.changed(keyboardActions)) {
                    i35 = 256;
                } else {
                    i35 = 128;
                }
                i33 |= i35;
            }
            i36 = i14 & 8192;
            if (i36 != 0) {
                if ((i13 & 7168) == 0) {
                    i33 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
                }
                i37 = i14 & 16384;
                if (i37 != 0) {
                    i33 |= 24576;
                } else if ((i13 & 57344) == 0) {
                    i33 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
                }
                i38 = i14 & 32768;
                if (i38 != 0) {
                    i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i13 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i39 = 131072;
                    } else {
                        i39 = 65536;
                    }
                    i33 |= i39;
                }
                if ((i15 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    } else {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new FocusRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    focusRequester = (FocusRequester) objRememberedValue;
                    textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                    long backgroundColor115 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                    FocusManager focusManager115 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    if (i42 == 1) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Vertical;
                    }
                    orientation2 = orientation;
                    Object[] objArr115 = {orientation2};
                    Saver<TextFieldScrollerPosition, Object> saver115 = TextFieldScrollerPosition.INSTANCE.getSaver();
                    Modifier modifier118 = modifier2;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(orientation2);
                    i44 = i42;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldScrollerPosition textFieldScrollerPosition115 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr115, (Saver) saver115, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TransformedText transformedText115 = (TransformedText) objRememberedValue3;
                    text = transformedText115.getText();
                    offsetMapping = transformedText115.getOffsetMapping();
                    currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    int i41112 = i43;
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldState = (TextFieldState) objRememberedValue4;
                    textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager115, backgroundColor115);
                    textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new UndoManager(0, 1, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    undoManager = (UndoManager) objRememberedValue5;
                    UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                    textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                    textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                    textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                    textFieldSelectionManager.setState$foundation_release(textFieldState);
                    textFieldSelectionManager.setValue$foundation_release(value);
                    textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                    textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                    textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                    textFieldSelectionManager.setFocusRequester(focusRequester);
                    textFieldSelectionManager.setEditable(!z15);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope115 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BringIntoViewRequester bringIntoViewRequester115 = (BringIntoViewRequester) objRememberedValue8;
                    companion2 = Modifier.INSTANCE;
                    i iVar115 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope115, bringIntoViewRequester115);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    Modifier modifierTextFieldFocusModifier115 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar115);
                    composerStartRestartGroup.startReplaceableGroup(-55008004);
                    if (textInputService == null) {
                        if (z14) {
                            z23 = false;
                        } else {
                            z23 = false;
                        }
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (TouchMode_androidKt.isInTouchMode()) {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    } else {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    }
                    Modifier modifierDrawBehind115 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                    Modifier modifierOnGloballyPositioned11119 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                    Modifier modifierSemantics115 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText115, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                    if (z14) {
                        z17 = z16;
                    } else {
                        z17 = z16;
                    }
                    Modifier modifierCursor115 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                    EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                    EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i41112 >> 3) & 14);
                    Function1<TextFieldValue, Unit> onValueChange116 = textFieldState.getOnValueChange();
                    boolean z2111112 = !z15;
                    if (i44 == 1) {
                        z18 = true;
                    } else {
                        z18 = z16;
                    }
                    Modifier modifierOnGloballyPositioned111110 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier118.then(modifierTextFieldFocusModifier115), textFieldState, focusManager115), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange116, z2111112, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition115, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics115), new g(textFieldState));
                    if (!z14) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                    } else {
                        modifierTextFieldMagnifier = companion2;
                    }
                    boolean z2111113 = z14;
                    ImeOptions imeOptions119 = imeOptions3;
                    VisualTransformation visualTransformation118 = visualTransformation2;
                    composer2 = composerStartRestartGroup;
                    a(modifierOnGloballyPositioned111110, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i41112, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition115, value, visualTransformation2, modifierCursor115, modifierDrawBehind115, modifierOnGloballyPositioned11119, modifierTextFieldMagnifier, bringIntoViewRequester115, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textStyle3 = textStyle2;
                    visualTransformation3 = visualTransformation118;
                    function5 = function4;
                    brush2 = solidColor;
                    z20 = z13;
                    i45 = i41;
                    keyboardActions3 = keyboardActions2;
                    mutableInteractionSource6 = mutableInteractionSource5;
                    z21 = z15;
                    function6 = function3M498getLambda1$foundation_release;
                    modifier3 = modifier118;
                    z22 = z2111113;
                    imeOptions4 = imeOptions119;
                    i46 = i44;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    } else {
                        if (i47 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            textStyle2 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle2 = textStyle;
                        }
                        if (i18 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation;
                        }
                        if (i20 != 0) {
                            function2 = a.f5816p0;
                        } else {
                            function2 = function1;
                        }
                        if (i22 != 0) {
                            mutableInteractionSource2 = null;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if (i24 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                        } else {
                            solidColor = brush;
                        }
                        if (i26 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i28 != 0) {
                            i40 = Integer.MAX_VALUE;
                        } else {
                            i40 = i10;
                        }
                        if (i30 != 0) {
                            i41 = 1;
                        } else {
                            i41 = i11;
                        }
                        if ((i14 & 2048) != 0) {
                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                            i33 &= -113;
                        } else {
                            imeOptions2 = imeOptions;
                        }
                        if (i34 != 0) {
                            keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                        } else {
                            keyboardActions2 = keyboardActions;
                        }
                        if (i36 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i37 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i38 != 0) {
                            function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                        } else {
                            function3M498getLambda1$foundation_release = function3;
                        }
                        visualTransformation2 = none;
                        function4 = function2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i42 = i40;
                        imeOptions3 = imeOptions2;
                        i43 = i33;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new FocusRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    focusRequester = (FocusRequester) objRememberedValue;
                    textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                    long backgroundColor116 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                    FocusManager focusManager116 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    if (i42 == 1) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Vertical;
                    }
                    orientation2 = orientation;
                    Object[] objArr116 = {orientation2};
                    Saver<TextFieldScrollerPosition, Object> saver116 = TextFieldScrollerPosition.INSTANCE.getSaver();
                    Modifier modifier119 = modifier2;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(orientation2);
                    i44 = i42;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(orientation2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldScrollerPosition textFieldScrollerPosition116 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr116, (Saver) saver116, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                        composition = value.getComposition();
                        if (composition != null) {
                            mutableInteractionSource4 = mutableInteractionSource3;
                            objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                            if (objRememberedValue3 == null) {
                            }
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        objRememberedValue3 = transformedTextFilterWithValidation;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TransformedText transformedText116 = (TransformedText) objRememberedValue3;
                    text = transformedText116.getText();
                    offsetMapping = transformedText116.getOffsetMapping();
                    currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    int i41113 = i43;
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldState = (TextFieldState) objRememberedValue4;
                    textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager116, backgroundColor116);
                    textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new UndoManager(0, 1, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    undoManager = (UndoManager) objRememberedValue5;
                    UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                    textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                    textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                    textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                    textFieldSelectionManager.setState$foundation_release(textFieldState);
                    textFieldSelectionManager.setValue$foundation_release(value);
                    textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                    textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                    textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                    textFieldSelectionManager.setFocusRequester(focusRequester);
                    textFieldSelectionManager.setEditable(!z15);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope116 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BringIntoViewRequester bringIntoViewRequester116 = (BringIntoViewRequester) objRememberedValue8;
                    companion2 = Modifier.INSTANCE;
                    i iVar116 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope116, bringIntoViewRequester116);
                    mutableInteractionSource5 = mutableInteractionSource4;
                    Modifier modifierTextFieldFocusModifier116 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar116);
                    composerStartRestartGroup.startReplaceableGroup(-55008004);
                    if (textInputService == null) {
                        if (z14) {
                            z23 = false;
                        } else {
                            z23 = false;
                        }
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (TouchMode_androidKt.isInTouchMode()) {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    } else {
                        z16 = false;
                        modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    }
                    Modifier modifierDrawBehind116 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                    Modifier modifierOnGloballyPositioned111111 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                    Modifier modifierSemantics116 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText116, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                    if (z14) {
                        z17 = z16;
                    } else {
                        z17 = z16;
                    }
                    Modifier modifierCursor116 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                    EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                    EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i41113 >> 3) & 14);
                    Function1<TextFieldValue, Unit> onValueChange117 = textFieldState.getOnValueChange();
                    boolean z2111114 = !z15;
                    if (i44 == 1) {
                        z18 = true;
                    } else {
                        z18 = z16;
                    }
                    Modifier modifierOnGloballyPositioned111112 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier119.then(modifierTextFieldFocusModifier116), textFieldState, focusManager116), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange117, z2111114, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition116, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics116), new g(textFieldState));
                    if (!z14) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                    } else {
                        modifierTextFieldMagnifier = companion2;
                    }
                    boolean z2111115 = z14;
                    ImeOptions imeOptions1110 = imeOptions3;
                    VisualTransformation visualTransformation119 = visualTransformation2;
                    composer2 = composerStartRestartGroup;
                    a(modifierOnGloballyPositioned111112, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i41113, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition116, value, visualTransformation2, modifierCursor116, modifierDrawBehind116, modifierOnGloballyPositioned111111, modifierTextFieldMagnifier, bringIntoViewRequester116, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textStyle3 = textStyle2;
                    visualTransformation3 = visualTransformation119;
                    function5 = function4;
                    brush2 = solidColor;
                    z20 = z13;
                    i45 = i41;
                    keyboardActions3 = keyboardActions2;
                    mutableInteractionSource6 = mutableInteractionSource5;
                    z21 = z15;
                    function6 = function3M498getLambda1$foundation_release;
                    modifier3 = modifier119;
                    z22 = z2111115;
                    imeOptions4 = imeOptions1110;
                    i46 = i44;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(value, onValueChange, modifier3, textStyle3, visualTransformation3, function5, mutableInteractionSource6, brush2, z20, i46, i45, imeOptions4, keyboardActions3, z22, z21, function6, i12, i13, i14));
            }
            i33 |= 3072;
            i37 = i14 & 16384;
            if (i37 != 0) {
                i33 |= 24576;
            } else if ((i13 & 57344) == 0) {
                i33 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
            }
            i38 = i14 & 32768;
            if (i38 != 0) {
                i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i13 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i39 = 131072;
                } else {
                    i39 = 65536;
                }
                i33 |= i39;
            }
            if ((i15 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i12 & 1) != 0) {
                    if (i47 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i18 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i20 != 0) {
                        function2 = a.f5816p0;
                    } else {
                        function2 = function1;
                    }
                    if (i22 != 0) {
                        mutableInteractionSource2 = null;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i24 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                    } else {
                        solidColor = brush;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i28 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i10;
                    }
                    if (i30 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i11;
                    }
                    if ((i14 & 2048) != 0) {
                        imeOptions2 = ImeOptions.INSTANCE.getDefault();
                        i33 &= -113;
                    } else {
                        imeOptions2 = imeOptions;
                    }
                    if (i34 != 0) {
                        keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    if (i36 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i38 != 0) {
                        function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                    } else {
                        function3M498getLambda1$foundation_release = function3;
                    }
                    visualTransformation2 = none;
                    function4 = function2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i42 = i40;
                    imeOptions3 = imeOptions2;
                    i43 = i33;
                } else {
                    if (i47 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i18 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i20 != 0) {
                        function2 = a.f5816p0;
                    } else {
                        function2 = function1;
                    }
                    if (i22 != 0) {
                        mutableInteractionSource2 = null;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i24 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                    } else {
                        solidColor = brush;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i28 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i10;
                    }
                    if (i30 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i11;
                    }
                    if ((i14 & 2048) != 0) {
                        imeOptions2 = ImeOptions.INSTANCE.getDefault();
                        i33 &= -113;
                    } else {
                        imeOptions2 = imeOptions;
                    }
                    if (i34 != 0) {
                        keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    if (i36 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i38 != 0) {
                        function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                    } else {
                        function3M498getLambda1$foundation_release = function3;
                    }
                    visualTransformation2 = none;
                    function4 = function2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i42 = i40;
                    imeOptions3 = imeOptions2;
                    i43 = i33;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                focusRequester = (FocusRequester) objRememberedValue;
                textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                long backgroundColor117 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                FocusManager focusManager117 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                if (i42 == 1) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Vertical;
                }
                orientation2 = orientation;
                Object[] objArr117 = {orientation2};
                Saver<TextFieldScrollerPosition, Object> saver117 = TextFieldScrollerPosition.INSTANCE.getSaver();
                Modifier modifier1110 = modifier2;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(orientation2);
                i44 = i42;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new l(orientation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new l(orientation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldScrollerPosition textFieldScrollerPosition117 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr117, (Saver) saver117, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                    composition = value.getComposition();
                    if (composition != null) {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                        if (objRememberedValue3 == null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    objRememberedValue3 = transformedTextFilterWithValidation;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                    composition = value.getComposition();
                    if (composition != null) {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                        if (objRememberedValue3 == null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    objRememberedValue3 = transformedTextFilterWithValidation;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TransformedText transformedText117 = (TransformedText) objRememberedValue3;
                text = transformedText117.getText();
                offsetMapping = transformedText117.getOffsetMapping();
                currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                int i41114 = i43;
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                textFieldState = (TextFieldState) objRememberedValue4;
                textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager117, backgroundColor117);
                textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new UndoManager(0, 1, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                undoManager = (UndoManager) objRememberedValue5;
                UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                textFieldSelectionManager.setState$foundation_release(textFieldState);
                textFieldSelectionManager.setValue$foundation_release(value);
                textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                textFieldSelectionManager.setFocusRequester(focusRequester);
                textFieldSelectionManager.setEditable(!z15);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope117 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BringIntoViewRequester bringIntoViewRequester117 = (BringIntoViewRequester) objRememberedValue8;
                companion2 = Modifier.INSTANCE;
                i iVar117 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope117, bringIntoViewRequester117);
                mutableInteractionSource5 = mutableInteractionSource4;
                Modifier modifierTextFieldFocusModifier117 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar117);
                composerStartRestartGroup.startReplaceableGroup(-55008004);
                if (textInputService == null) {
                    if (z14) {
                        z23 = false;
                    } else {
                        z23 = false;
                    }
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (TouchMode_androidKt.isInTouchMode()) {
                    z16 = false;
                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                } else {
                    z16 = false;
                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                }
                Modifier modifierDrawBehind117 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                Modifier modifierOnGloballyPositioned111113 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                Modifier modifierSemantics117 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText117, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                if (z14) {
                    z17 = z16;
                } else {
                    z17 = z16;
                }
                Modifier modifierCursor117 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i41114 >> 3) & 14);
                Function1<TextFieldValue, Unit> onValueChange118 = textFieldState.getOnValueChange();
                boolean z2111116 = !z15;
                if (i44 == 1) {
                    z18 = true;
                } else {
                    z18 = z16;
                }
                Modifier modifierOnGloballyPositioned111114 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier1110.then(modifierTextFieldFocusModifier117), textFieldState, focusManager117), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange118, z2111116, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition117, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics117), new g(textFieldState));
                if (!z14) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (z19) {
                    modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                } else {
                    modifierTextFieldMagnifier = companion2;
                }
                boolean z2111117 = z14;
                ImeOptions imeOptions1111 = imeOptions3;
                VisualTransformation visualTransformation1110 = visualTransformation2;
                composer2 = composerStartRestartGroup;
                a(modifierOnGloballyPositioned111114, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i41114, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition117, value, visualTransformation2, modifierCursor117, modifierDrawBehind117, modifierOnGloballyPositioned111113, modifierTextFieldMagnifier, bringIntoViewRequester117, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle3 = textStyle2;
                visualTransformation3 = visualTransformation1110;
                function5 = function4;
                brush2 = solidColor;
                z20 = z13;
                i45 = i41;
                keyboardActions3 = keyboardActions2;
                mutableInteractionSource6 = mutableInteractionSource5;
                z21 = z15;
                function6 = function3M498getLambda1$foundation_release;
                modifier3 = modifier1110;
                z22 = z2111117;
                imeOptions4 = imeOptions1111;
                i46 = i44;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i12 & 1) != 0) {
                    if (i47 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i18 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i20 != 0) {
                        function2 = a.f5816p0;
                    } else {
                        function2 = function1;
                    }
                    if (i22 != 0) {
                        mutableInteractionSource2 = null;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i24 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                    } else {
                        solidColor = brush;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i28 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i10;
                    }
                    if (i30 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i11;
                    }
                    if ((i14 & 2048) != 0) {
                        imeOptions2 = ImeOptions.INSTANCE.getDefault();
                        i33 &= -113;
                    } else {
                        imeOptions2 = imeOptions;
                    }
                    if (i34 != 0) {
                        keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    if (i36 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i38 != 0) {
                        function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                    } else {
                        function3M498getLambda1$foundation_release = function3;
                    }
                    visualTransformation2 = none;
                    function4 = function2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i42 = i40;
                    imeOptions3 = imeOptions2;
                    i43 = i33;
                } else {
                    if (i47 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i18 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i20 != 0) {
                        function2 = a.f5816p0;
                    } else {
                        function2 = function1;
                    }
                    if (i22 != 0) {
                        mutableInteractionSource2 = null;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i24 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                    } else {
                        solidColor = brush;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i28 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i10;
                    }
                    if (i30 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i11;
                    }
                    if ((i14 & 2048) != 0) {
                        imeOptions2 = ImeOptions.INSTANCE.getDefault();
                        i33 &= -113;
                    } else {
                        imeOptions2 = imeOptions;
                    }
                    if (i34 != 0) {
                        keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    if (i36 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i38 != 0) {
                        function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                    } else {
                        function3M498getLambda1$foundation_release = function3;
                    }
                    visualTransformation2 = none;
                    function4 = function2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i42 = i40;
                    imeOptions3 = imeOptions2;
                    i43 = i33;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                focusRequester = (FocusRequester) objRememberedValue;
                textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                long backgroundColor118 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                FocusManager focusManager118 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                if (i42 == 1) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Vertical;
                }
                orientation2 = orientation;
                Object[] objArr118 = {orientation2};
                Saver<TextFieldScrollerPosition, Object> saver118 = TextFieldScrollerPosition.INSTANCE.getSaver();
                Modifier modifier1111 = modifier2;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(orientation2);
                i44 = i42;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new l(orientation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new l(orientation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldScrollerPosition textFieldScrollerPosition118 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr118, (Saver) saver118, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                    composition = value.getComposition();
                    if (composition != null) {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                        if (objRememberedValue3 == null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    objRememberedValue3 = transformedTextFilterWithValidation;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                    composition = value.getComposition();
                    if (composition != null) {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                        if (objRememberedValue3 == null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    objRememberedValue3 = transformedTextFilterWithValidation;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TransformedText transformedText118 = (TransformedText) objRememberedValue3;
                text = transformedText118.getText();
                offsetMapping = transformedText118.getOffsetMapping();
                currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                int i41115 = i43;
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                textFieldState = (TextFieldState) objRememberedValue4;
                textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager118, backgroundColor118);
                textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new UndoManager(0, 1, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                undoManager = (UndoManager) objRememberedValue5;
                UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                textFieldSelectionManager.setState$foundation_release(textFieldState);
                textFieldSelectionManager.setValue$foundation_release(value);
                textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                textFieldSelectionManager.setFocusRequester(focusRequester);
                textFieldSelectionManager.setEditable(!z15);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope118 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BringIntoViewRequester bringIntoViewRequester118 = (BringIntoViewRequester) objRememberedValue8;
                companion2 = Modifier.INSTANCE;
                i iVar118 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope118, bringIntoViewRequester118);
                mutableInteractionSource5 = mutableInteractionSource4;
                Modifier modifierTextFieldFocusModifier118 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar118);
                composerStartRestartGroup.startReplaceableGroup(-55008004);
                if (textInputService == null) {
                    if (z14) {
                        z23 = false;
                    } else {
                        z23 = false;
                    }
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (TouchMode_androidKt.isInTouchMode()) {
                    z16 = false;
                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                } else {
                    z16 = false;
                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                }
                Modifier modifierDrawBehind118 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                Modifier modifierOnGloballyPositioned111115 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                Modifier modifierSemantics118 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText118, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                if (z14) {
                    z17 = z16;
                } else {
                    z17 = z16;
                }
                Modifier modifierCursor118 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i41115 >> 3) & 14);
                Function1<TextFieldValue, Unit> onValueChange119 = textFieldState.getOnValueChange();
                boolean z2111118 = !z15;
                if (i44 == 1) {
                    z18 = true;
                } else {
                    z18 = z16;
                }
                Modifier modifierOnGloballyPositioned111116 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier1111.then(modifierTextFieldFocusModifier118), textFieldState, focusManager118), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange119, z2111118, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition118, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics118), new g(textFieldState));
                if (!z14) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (z19) {
                    modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                } else {
                    modifierTextFieldMagnifier = companion2;
                }
                boolean z2111119 = z14;
                ImeOptions imeOptions1112 = imeOptions3;
                VisualTransformation visualTransformation1111 = visualTransformation2;
                composer2 = composerStartRestartGroup;
                a(modifierOnGloballyPositioned111116, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i41115, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition118, value, visualTransformation2, modifierCursor118, modifierDrawBehind118, modifierOnGloballyPositioned111115, modifierTextFieldMagnifier, bringIntoViewRequester118, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle3 = textStyle2;
                visualTransformation3 = visualTransformation1111;
                function5 = function4;
                brush2 = solidColor;
                z20 = z13;
                i45 = i41;
                keyboardActions3 = keyboardActions2;
                mutableInteractionSource6 = mutableInteractionSource5;
                z21 = z15;
                function6 = function3M498getLambda1$foundation_release;
                modifier3 = modifier1111;
                z22 = z2111119;
                imeOptions4 = imeOptions1112;
                i46 = i44;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(value, onValueChange, modifier3, textStyle3, visualTransformation3, function5, mutableInteractionSource6, brush2, z20, i46, i45, imeOptions4, keyboardActions3, z22, z21, function6, i12, i13, i14));
        }
        i33 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        i36 = i14 & 8192;
        if (i36 != 0) {
            if ((i13 & 7168) == 0) {
                i33 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
            }
            i37 = i14 & 16384;
            if (i37 != 0) {
                i33 |= 24576;
            } else if ((i13 & 57344) == 0) {
                i33 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
            }
            i38 = i14 & 32768;
            if (i38 != 0) {
                i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i13 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i39 = 131072;
                } else {
                    i39 = 65536;
                }
                i33 |= i39;
            }
            if ((i15 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i12 & 1) != 0) {
                    if (i47 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i18 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i20 != 0) {
                        function2 = a.f5816p0;
                    } else {
                        function2 = function1;
                    }
                    if (i22 != 0) {
                        mutableInteractionSource2 = null;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i24 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                    } else {
                        solidColor = brush;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i28 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i10;
                    }
                    if (i30 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i11;
                    }
                    if ((i14 & 2048) != 0) {
                        imeOptions2 = ImeOptions.INSTANCE.getDefault();
                        i33 &= -113;
                    } else {
                        imeOptions2 = imeOptions;
                    }
                    if (i34 != 0) {
                        keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    if (i36 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i38 != 0) {
                        function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                    } else {
                        function3M498getLambda1$foundation_release = function3;
                    }
                    visualTransformation2 = none;
                    function4 = function2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i42 = i40;
                    imeOptions3 = imeOptions2;
                    i43 = i33;
                } else {
                    if (i47 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i18 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i20 != 0) {
                        function2 = a.f5816p0;
                    } else {
                        function2 = function1;
                    }
                    if (i22 != 0) {
                        mutableInteractionSource2 = null;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i24 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                    } else {
                        solidColor = brush;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i28 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i10;
                    }
                    if (i30 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i11;
                    }
                    if ((i14 & 2048) != 0) {
                        imeOptions2 = ImeOptions.INSTANCE.getDefault();
                        i33 &= -113;
                    } else {
                        imeOptions2 = imeOptions;
                    }
                    if (i34 != 0) {
                        keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    if (i36 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i38 != 0) {
                        function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                    } else {
                        function3M498getLambda1$foundation_release = function3;
                    }
                    visualTransformation2 = none;
                    function4 = function2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i42 = i40;
                    imeOptions3 = imeOptions2;
                    i43 = i33;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                focusRequester = (FocusRequester) objRememberedValue;
                textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                long backgroundColor119 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                FocusManager focusManager119 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                if (i42 == 1) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Vertical;
                }
                orientation2 = orientation;
                Object[] objArr119 = {orientation2};
                Saver<TextFieldScrollerPosition, Object> saver119 = TextFieldScrollerPosition.INSTANCE.getSaver();
                Modifier modifier1112 = modifier2;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(orientation2);
                i44 = i42;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new l(orientation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new l(orientation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldScrollerPosition textFieldScrollerPosition119 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr119, (Saver) saver119, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                    composition = value.getComposition();
                    if (composition != null) {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                        if (objRememberedValue3 == null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    objRememberedValue3 = transformedTextFilterWithValidation;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                    composition = value.getComposition();
                    if (composition != null) {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                        if (objRememberedValue3 == null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    objRememberedValue3 = transformedTextFilterWithValidation;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TransformedText transformedText119 = (TransformedText) objRememberedValue3;
                text = transformedText119.getText();
                offsetMapping = transformedText119.getOffsetMapping();
                currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                int i41116 = i43;
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                textFieldState = (TextFieldState) objRememberedValue4;
                textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager119, backgroundColor119);
                textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new UndoManager(0, 1, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                undoManager = (UndoManager) objRememberedValue5;
                UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                textFieldSelectionManager.setState$foundation_release(textFieldState);
                textFieldSelectionManager.setValue$foundation_release(value);
                textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                textFieldSelectionManager.setFocusRequester(focusRequester);
                textFieldSelectionManager.setEditable(!z15);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope119 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BringIntoViewRequester bringIntoViewRequester119 = (BringIntoViewRequester) objRememberedValue8;
                companion2 = Modifier.INSTANCE;
                i iVar119 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope119, bringIntoViewRequester119);
                mutableInteractionSource5 = mutableInteractionSource4;
                Modifier modifierTextFieldFocusModifier119 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar119);
                composerStartRestartGroup.startReplaceableGroup(-55008004);
                if (textInputService == null) {
                    if (z14) {
                        z23 = false;
                    } else {
                        z23 = false;
                    }
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (TouchMode_androidKt.isInTouchMode()) {
                    z16 = false;
                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                } else {
                    z16 = false;
                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                }
                Modifier modifierDrawBehind119 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                Modifier modifierOnGloballyPositioned111117 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                Modifier modifierSemantics119 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText119, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                if (z14) {
                    z17 = z16;
                } else {
                    z17 = z16;
                }
                Modifier modifierCursor119 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i41116 >> 3) & 14);
                Function1<TextFieldValue, Unit> onValueChange1110 = textFieldState.getOnValueChange();
                boolean z21111110 = !z15;
                if (i44 == 1) {
                    z18 = true;
                } else {
                    z18 = z16;
                }
                Modifier modifierOnGloballyPositioned111118 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier1112.then(modifierTextFieldFocusModifier119), textFieldState, focusManager119), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange1110, z21111110, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition119, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics119), new g(textFieldState));
                if (!z14) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (z19) {
                    modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                } else {
                    modifierTextFieldMagnifier = companion2;
                }
                boolean z21111111 = z14;
                ImeOptions imeOptions1113 = imeOptions3;
                VisualTransformation visualTransformation1112 = visualTransformation2;
                composer2 = composerStartRestartGroup;
                a(modifierOnGloballyPositioned111118, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i41116, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition119, value, visualTransformation2, modifierCursor119, modifierDrawBehind119, modifierOnGloballyPositioned111117, modifierTextFieldMagnifier, bringIntoViewRequester119, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle3 = textStyle2;
                visualTransformation3 = visualTransformation1112;
                function5 = function4;
                brush2 = solidColor;
                z20 = z13;
                i45 = i41;
                keyboardActions3 = keyboardActions2;
                mutableInteractionSource6 = mutableInteractionSource5;
                z21 = z15;
                function6 = function3M498getLambda1$foundation_release;
                modifier3 = modifier1112;
                z22 = z21111111;
                imeOptions4 = imeOptions1113;
                i46 = i44;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i12 & 1) != 0) {
                    if (i47 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i18 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i20 != 0) {
                        function2 = a.f5816p0;
                    } else {
                        function2 = function1;
                    }
                    if (i22 != 0) {
                        mutableInteractionSource2 = null;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i24 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                    } else {
                        solidColor = brush;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i28 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i10;
                    }
                    if (i30 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i11;
                    }
                    if ((i14 & 2048) != 0) {
                        imeOptions2 = ImeOptions.INSTANCE.getDefault();
                        i33 &= -113;
                    } else {
                        imeOptions2 = imeOptions;
                    }
                    if (i34 != 0) {
                        keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    if (i36 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i38 != 0) {
                        function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                    } else {
                        function3M498getLambda1$foundation_release = function3;
                    }
                    visualTransformation2 = none;
                    function4 = function2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i42 = i40;
                    imeOptions3 = imeOptions2;
                    i43 = i33;
                } else {
                    if (i47 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        textStyle2 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle2 = textStyle;
                    }
                    if (i18 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i20 != 0) {
                        function2 = a.f5816p0;
                    } else {
                        function2 = function1;
                    }
                    if (i22 != 0) {
                        mutableInteractionSource2 = null;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if (i24 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                    } else {
                        solidColor = brush;
                    }
                    if (i26 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i28 != 0) {
                        i40 = Integer.MAX_VALUE;
                    } else {
                        i40 = i10;
                    }
                    if (i30 != 0) {
                        i41 = 1;
                    } else {
                        i41 = i11;
                    }
                    if ((i14 & 2048) != 0) {
                        imeOptions2 = ImeOptions.INSTANCE.getDefault();
                        i33 &= -113;
                    } else {
                        imeOptions2 = imeOptions;
                    }
                    if (i34 != 0) {
                        keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        keyboardActions2 = keyboardActions;
                    }
                    if (i36 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i37 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i38 != 0) {
                        function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                    } else {
                        function3M498getLambda1$foundation_release = function3;
                    }
                    visualTransformation2 = none;
                    function4 = function2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i42 = i40;
                    imeOptions3 = imeOptions2;
                    i43 = i33;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                focusRequester = (FocusRequester) objRememberedValue;
                textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                long backgroundColor1110 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
                FocusManager focusManager1110 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                if (i42 == 1) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Vertical;
                }
                orientation2 = orientation;
                Object[] objArr1110 = {orientation2};
                Saver<TextFieldScrollerPosition, Object> saver1110 = TextFieldScrollerPosition.INSTANCE.getSaver();
                Modifier modifier1113 = modifier2;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(orientation2);
                i44 = i42;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new l(orientation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new l(orientation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldScrollerPosition textFieldScrollerPosition1110 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr1110, (Saver) saver1110, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                    composition = value.getComposition();
                    if (composition != null) {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                        if (objRememberedValue3 == null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    objRememberedValue3 = transformedTextFilterWithValidation;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                    composition = value.getComposition();
                    if (composition != null) {
                        mutableInteractionSource4 = mutableInteractionSource3;
                        objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                        if (objRememberedValue3 == null) {
                        }
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    objRememberedValue3 = transformedTextFilterWithValidation;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TransformedText transformedText1110 = (TransformedText) objRememberedValue3;
                text = transformedText1110.getText();
                offsetMapping = transformedText1110.getOffsetMapping();
                currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                int i41117 = i43;
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                textFieldState = (TextFieldState) objRememberedValue4;
                textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager1110, backgroundColor1110);
                textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new UndoManager(0, 1, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                undoManager = (UndoManager) objRememberedValue5;
                UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
                textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                textFieldSelectionManager.setState$foundation_release(textFieldState);
                textFieldSelectionManager.setValue$foundation_release(value);
                textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                textFieldSelectionManager.setFocusRequester(focusRequester);
                textFieldSelectionManager.setEditable(!z15);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope1110 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BringIntoViewRequester bringIntoViewRequester1110 = (BringIntoViewRequester) objRememberedValue8;
                companion2 = Modifier.INSTANCE;
                i iVar1110 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope1110, bringIntoViewRequester1110);
                mutableInteractionSource5 = mutableInteractionSource4;
                Modifier modifierTextFieldFocusModifier1110 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar1110);
                composerStartRestartGroup.startReplaceableGroup(-55008004);
                if (textInputService == null) {
                    if (z14) {
                        z23 = false;
                    } else {
                        z23 = false;
                    }
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (TouchMode_androidKt.isInTouchMode()) {
                    z16 = false;
                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                } else {
                    z16 = false;
                    modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                }
                Modifier modifierDrawBehind1110 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
                Modifier modifierOnGloballyPositioned111119 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
                Modifier modifierSemantics1110 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText1110, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                if (z14) {
                    z17 = z16;
                } else {
                    z17 = z16;
                }
                Modifier modifierCursor1110 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
                EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
                EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i41117 >> 3) & 14);
                Function1<TextFieldValue, Unit> onValueChange1111 = textFieldState.getOnValueChange();
                boolean z21111112 = !z15;
                if (i44 == 1) {
                    z18 = true;
                } else {
                    z18 = z16;
                }
                Modifier modifierOnGloballyPositioned1111110 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier1113.then(modifierTextFieldFocusModifier1110), textFieldState, focusManager1110), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange1111, z21111112, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition1110, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics1110), new g(textFieldState));
                if (!z14) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (z19) {
                    modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
                } else {
                    modifierTextFieldMagnifier = companion2;
                }
                boolean z21111113 = z14;
                ImeOptions imeOptions1114 = imeOptions3;
                VisualTransformation visualTransformation1113 = visualTransformation2;
                composer2 = composerStartRestartGroup;
                a(modifierOnGloballyPositioned1111110, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i41117, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition1110, value, visualTransformation2, modifierCursor1110, modifierDrawBehind1110, modifierOnGloballyPositioned111119, modifierTextFieldMagnifier, bringIntoViewRequester1110, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle3 = textStyle2;
                visualTransformation3 = visualTransformation1113;
                function5 = function4;
                brush2 = solidColor;
                z20 = z13;
                i45 = i41;
                keyboardActions3 = keyboardActions2;
                mutableInteractionSource6 = mutableInteractionSource5;
                z21 = z15;
                function6 = function3M498getLambda1$foundation_release;
                modifier3 = modifier1113;
                z22 = z21111113;
                imeOptions4 = imeOptions1114;
                i46 = i44;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(value, onValueChange, modifier3, textStyle3, visualTransformation3, function5, mutableInteractionSource6, brush2, z20, i46, i45, imeOptions4, keyboardActions3, z22, z21, function6, i12, i13, i14));
        }
        i33 |= 3072;
        i37 = i14 & 16384;
        if (i37 != 0) {
            i33 |= 24576;
        } else if ((i13 & 57344) == 0) {
            i33 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
        }
        i38 = i14 & 32768;
        if (i38 != 0) {
            i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i13 & 458752) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i39 = 131072;
            } else {
                i39 = 65536;
            }
            i33 |= i39;
        }
        if ((i15 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i12 & 1) != 0) {
                if (i47 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i16 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i18 != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                } else {
                    none = visualTransformation;
                }
                if (i20 != 0) {
                    function2 = a.f5816p0;
                } else {
                    function2 = function1;
                }
                if (i22 != 0) {
                    mutableInteractionSource2 = null;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if (i24 != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                } else {
                    solidColor = brush;
                }
                if (i26 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i28 != 0) {
                    i40 = Integer.MAX_VALUE;
                } else {
                    i40 = i10;
                }
                if (i30 != 0) {
                    i41 = 1;
                } else {
                    i41 = i11;
                }
                if ((i14 & 2048) != 0) {
                    imeOptions2 = ImeOptions.INSTANCE.getDefault();
                    i33 &= -113;
                } else {
                    imeOptions2 = imeOptions;
                }
                if (i34 != 0) {
                    keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                } else {
                    keyboardActions2 = keyboardActions;
                }
                if (i36 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i37 != 0) {
                    z15 = false;
                } else {
                    z15 = z12;
                }
                if (i38 != 0) {
                    function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                } else {
                    function3M498getLambda1$foundation_release = function3;
                }
                visualTransformation2 = none;
                function4 = function2;
                mutableInteractionSource3 = mutableInteractionSource2;
                i42 = i40;
                imeOptions3 = imeOptions2;
                i43 = i33;
            } else {
                if (i47 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i16 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i18 != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                } else {
                    none = visualTransformation;
                }
                if (i20 != 0) {
                    function2 = a.f5816p0;
                } else {
                    function2 = function1;
                }
                if (i22 != 0) {
                    mutableInteractionSource2 = null;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if (i24 != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                } else {
                    solidColor = brush;
                }
                if (i26 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i28 != 0) {
                    i40 = Integer.MAX_VALUE;
                } else {
                    i40 = i10;
                }
                if (i30 != 0) {
                    i41 = 1;
                } else {
                    i41 = i11;
                }
                if ((i14 & 2048) != 0) {
                    imeOptions2 = ImeOptions.INSTANCE.getDefault();
                    i33 &= -113;
                } else {
                    imeOptions2 = imeOptions;
                }
                if (i34 != 0) {
                    keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                } else {
                    keyboardActions2 = keyboardActions;
                }
                if (i36 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i37 != 0) {
                    z15 = false;
                } else {
                    z15 = z12;
                }
                if (i38 != 0) {
                    function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                } else {
                    function3M498getLambda1$foundation_release = function3;
                }
                visualTransformation2 = none;
                function4 = function2;
                mutableInteractionSource3 = mutableInteractionSource2;
                i42 = i40;
                imeOptions3 = imeOptions2;
                i43 = i33;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            focusRequester = (FocusRequester) objRememberedValue;
            textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
            long backgroundColor1111 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
            FocusManager focusManager1111 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            if (i42 == 1) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Vertical;
            }
            orientation2 = orientation;
            Object[] objArr1111 = {orientation2};
            Saver<TextFieldScrollerPosition, Object> saver1111 = TextFieldScrollerPosition.INSTANCE.getSaver();
            Modifier modifier1114 = modifier2;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(orientation2);
            i44 = i42;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new l(orientation2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new l(orientation2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextFieldScrollerPosition textFieldScrollerPosition1111 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr1111, (Saver) saver1111, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                composition = value.getComposition();
                if (composition != null) {
                    mutableInteractionSource4 = mutableInteractionSource3;
                    objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                    if (objRememberedValue3 == null) {
                    }
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                objRememberedValue3 = transformedTextFilterWithValidation;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                composition = value.getComposition();
                if (composition != null) {
                    mutableInteractionSource4 = mutableInteractionSource3;
                    objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                    if (objRememberedValue3 == null) {
                    }
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                objRememberedValue3 = transformedTextFilterWithValidation;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TransformedText transformedText1111 = (TransformedText) objRememberedValue3;
            text = transformedText1111.getText();
            offsetMapping = transformedText1111.getOffsetMapping();
            currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            int i41118 = i43;
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            textFieldState = (TextFieldState) objRememberedValue4;
            textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager1111, backgroundColor1111);
            textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new UndoManager(0, 1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            undoManager = (UndoManager) objRememberedValue5;
            UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
            textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
            textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
            textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
            textFieldSelectionManager.setState$foundation_release(textFieldState);
            textFieldSelectionManager.setValue$foundation_release(value);
            textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
            textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
            textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
            textFieldSelectionManager.setFocusRequester(focusRequester);
            textFieldSelectionManager.setEditable(!z15);
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope1111 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BringIntoViewRequester bringIntoViewRequester1111 = (BringIntoViewRequester) objRememberedValue8;
            companion2 = Modifier.INSTANCE;
            i iVar1111 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope1111, bringIntoViewRequester1111);
            mutableInteractionSource5 = mutableInteractionSource4;
            Modifier modifierTextFieldFocusModifier1111 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar1111);
            composerStartRestartGroup.startReplaceableGroup(-55008004);
            if (textInputService == null) {
                if (z14) {
                    z23 = false;
                } else {
                    z23 = false;
                }
                EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (TouchMode_androidKt.isInTouchMode()) {
                z16 = false;
                modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
            } else {
                z16 = false;
                modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
            }
            Modifier modifierDrawBehind1111 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
            Modifier modifierOnGloballyPositioned1111111 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
            Modifier modifierSemantics1111 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText1111, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
            if (z14) {
                z17 = z16;
            } else {
                z17 = z16;
            }
            Modifier modifierCursor1111 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
            EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
            EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i41118 >> 3) & 14);
            Function1<TextFieldValue, Unit> onValueChange1112 = textFieldState.getOnValueChange();
            boolean z21111114 = !z15;
            if (i44 == 1) {
                z18 = true;
            } else {
                z18 = z16;
            }
            Modifier modifierOnGloballyPositioned1111112 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier1114.then(modifierTextFieldFocusModifier1111), textFieldState, focusManager1111), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange1112, z21111114, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition1111, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics1111), new g(textFieldState));
            if (!z14) {
                z19 = false;
            } else {
                z19 = false;
            }
            if (z19) {
                modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
            } else {
                modifierTextFieldMagnifier = companion2;
            }
            boolean z21111115 = z14;
            ImeOptions imeOptions1115 = imeOptions3;
            VisualTransformation visualTransformation1114 = visualTransformation2;
            composer2 = composerStartRestartGroup;
            a(modifierOnGloballyPositioned1111112, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i41118, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition1111, value, visualTransformation2, modifierCursor1111, modifierDrawBehind1111, modifierOnGloballyPositioned1111111, modifierTextFieldMagnifier, bringIntoViewRequester1111, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle3 = textStyle2;
            visualTransformation3 = visualTransformation1114;
            function5 = function4;
            brush2 = solidColor;
            z20 = z13;
            i45 = i41;
            keyboardActions3 = keyboardActions2;
            mutableInteractionSource6 = mutableInteractionSource5;
            z21 = z15;
            function6 = function3M498getLambda1$foundation_release;
            modifier3 = modifier1114;
            z22 = z21111115;
            imeOptions4 = imeOptions1115;
            i46 = i44;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i12 & 1) != 0) {
                if (i47 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i16 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i18 != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                } else {
                    none = visualTransformation;
                }
                if (i20 != 0) {
                    function2 = a.f5816p0;
                } else {
                    function2 = function1;
                }
                if (i22 != 0) {
                    mutableInteractionSource2 = null;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if (i24 != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                } else {
                    solidColor = brush;
                }
                if (i26 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i28 != 0) {
                    i40 = Integer.MAX_VALUE;
                } else {
                    i40 = i10;
                }
                if (i30 != 0) {
                    i41 = 1;
                } else {
                    i41 = i11;
                }
                if ((i14 & 2048) != 0) {
                    imeOptions2 = ImeOptions.INSTANCE.getDefault();
                    i33 &= -113;
                } else {
                    imeOptions2 = imeOptions;
                }
                if (i34 != 0) {
                    keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                } else {
                    keyboardActions2 = keyboardActions;
                }
                if (i36 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i37 != 0) {
                    z15 = false;
                } else {
                    z15 = z12;
                }
                if (i38 != 0) {
                    function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                } else {
                    function3M498getLambda1$foundation_release = function3;
                }
                visualTransformation2 = none;
                function4 = function2;
                mutableInteractionSource3 = mutableInteractionSource2;
                i42 = i40;
                imeOptions3 = imeOptions2;
                i43 = i33;
            } else {
                if (i47 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i16 != 0) {
                    textStyle2 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle2 = textStyle;
                }
                if (i18 != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                } else {
                    none = visualTransformation;
                }
                if (i20 != 0) {
                    function2 = a.f5816p0;
                } else {
                    function2 = function1;
                }
                if (i22 != 0) {
                    mutableInteractionSource2 = null;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if (i24 != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.m2544getUnspecified0d7_KjU(), null);
                } else {
                    solidColor = brush;
                }
                if (i26 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i28 != 0) {
                    i40 = Integer.MAX_VALUE;
                } else {
                    i40 = i10;
                }
                if (i30 != 0) {
                    i41 = 1;
                } else {
                    i41 = i11;
                }
                if ((i14 & 2048) != 0) {
                    imeOptions2 = ImeOptions.INSTANCE.getDefault();
                    i33 &= -113;
                } else {
                    imeOptions2 = imeOptions;
                }
                if (i34 != 0) {
                    keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                } else {
                    keyboardActions2 = keyboardActions;
                }
                if (i36 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i37 != 0) {
                    z15 = false;
                } else {
                    z15 = z12;
                }
                if (i38 != 0) {
                    function3M498getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m498getLambda1$foundation_release();
                } else {
                    function3M498getLambda1$foundation_release = function3;
                }
                visualTransformation2 = none;
                function4 = function2;
                mutableInteractionSource3 = mutableInteractionSource2;
                i42 = i40;
                imeOptions3 = imeOptions2;
                i43 = i33;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-958708118, i15, i43, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:186)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            focusRequester = (FocusRequester) objRememberedValue;
            textInputService = (TextInputService) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            resolver = (FontFamily.Resolver) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
            long backgroundColor1112 = ((TextSelectionColors) composerStartRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor();
            FocusManager focusManager1112 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            if (i42 == 1) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Vertical;
            }
            orientation2 = orientation;
            Object[] objArr1112 = {orientation2};
            Saver<TextFieldScrollerPosition, Object> saver1112 = TextFieldScrollerPosition.INSTANCE.getSaver();
            Modifier modifier1115 = modifier2;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(orientation2);
            i44 = i42;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new l(orientation2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new l(orientation2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextFieldScrollerPosition textFieldScrollerPosition1112 = (TextFieldScrollerPosition) RememberSaveableKt.m2165rememberSaveable(objArr1112, (Saver) saver1112, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                composition = value.getComposition();
                if (composition != null) {
                    mutableInteractionSource4 = mutableInteractionSource3;
                    objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                    if (objRememberedValue3 == null) {
                    }
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                objRememberedValue3 = transformedTextFilterWithValidation;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                composition = value.getComposition();
                if (composition != null) {
                    mutableInteractionSource4 = mutableInteractionSource3;
                    objRememberedValue3 = TextFieldDelegate.INSTANCE.m544applyCompositionDecoration72CqOWE(composition.getF17768a(), transformedTextFilterWithValidation);
                    if (objRememberedValue3 == null) {
                    }
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                objRememberedValue3 = transformedTextFilterWithValidation;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TransformedText transformedText1112 = (TransformedText) objRememberedValue3;
            text = transformedText1112.getText();
            offsetMapping = transformedText1112.getOffsetMapping();
            currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            int i41119 = i43;
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z13, 0, density, resolver, null, 300, null), currentRecomposeScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            textFieldState = (TextFieldState) objRememberedValue4;
            textFieldState.m557updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z13, density, resolver, onValueChange, keyboardActions2, focusManager1112, backgroundColor1112);
            textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new UndoManager(0, 1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            undoManager = (UndoManager) objRememberedValue5;
            UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            textFieldSelectionManager = (TextFieldSelectionManager) objRememberedValue6;
            textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
            textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
            textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
            textFieldSelectionManager.setState$foundation_release(textFieldState);
            textFieldSelectionManager.setValue$foundation_release(value);
            textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
            textFieldSelectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
            textFieldSelectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
            textFieldSelectionManager.setFocusRequester(focusRequester);
            textFieldSelectionManager.setEditable(!z15);
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope1112 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BringIntoViewRequester bringIntoViewRequester1112 = (BringIntoViewRequester) objRememberedValue8;
            companion2 = Modifier.INSTANCE;
            i iVar1112 = new i(textFieldState, textInputService, z14, z15, value, imeOptions3, offsetMapping, textFieldSelectionManager, coroutineScope1112, bringIntoViewRequester1112);
            mutableInteractionSource5 = mutableInteractionSource4;
            Modifier modifierTextFieldFocusModifier1112 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource5, iVar1112);
            composerStartRestartGroup.startReplaceableGroup(-55008004);
            if (textInputService == null) {
                if (z14) {
                    z23 = false;
                } else {
                    z23 = false;
                }
                EffectsKt.LaunchedEffect(Unit.INSTANCE, new b(textFieldState, SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z23), composerStartRestartGroup, 0), textInputService, value, imeOptions3, offsetMapping, null), composerStartRestartGroup, 70);
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (TouchMode_androidKt.isInTouchMode()) {
                z16 = false;
                modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource5, z14, new k(textFieldState, focusRequester, z15, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z14)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
            } else {
                z16 = false;
                modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
            }
            Modifier modifierDrawBehind1112 = DrawModifierKt.drawBehind(companion2, new h(textFieldState, value, offsetMapping));
            Modifier modifierOnGloballyPositioned1111113 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new j(textFieldState, textFieldSelectionManager, offsetMapping, value, z14));
            Modifier modifierSemantics1112 = SemanticsModifierKt.semantics(companion2, true, new m(imeOptions3, transformedText1112, value, z14, visualTransformation2 instanceof PasswordVisualTransformation, z15, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
            if (z14) {
                z17 = z16;
            } else {
                z17 = z16;
            }
            Modifier modifierCursor1112 = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, solidColor, z17);
            EffectsKt.DisposableEffect(textFieldSelectionManager, new c(textFieldSelectionManager), composerStartRestartGroup, 8);
            EffectsKt.DisposableEffect(imeOptions3, new d(textInputService, textFieldState, value, imeOptions3), composerStartRestartGroup, (i41119 >> 3) & 14);
            Function1<TextFieldValue, Unit> onValueChange1113 = textFieldState.getOnValueChange();
            boolean z21111116 = !z15;
            if (i44 == 1) {
                z18 = true;
            } else {
                z18 = z16;
            }
            Modifier modifierOnGloballyPositioned1111114 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier1115.then(modifierTextFieldFocusModifier1112), textFieldState, focusManager1112), new e0.b(textFieldState, textFieldSelectionManager)).then(TextFieldKeyInputKt.m549textFieldKeyInput2WJ9YEU(companion2, textFieldState, textFieldSelectionManager, value, onValueChange1113, z21111116, z18, offsetMapping, undoManager, imeOptions3.getImeAction())), textFieldScrollerPosition1112, mutableInteractionSource5, z14).then(modifierPointerHoverIcon$default).then(modifierSemantics1112), new g(textFieldState));
            if (!z14) {
                z19 = false;
            } else {
                z19 = false;
            }
            if (z19) {
                modifierTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager);
            } else {
                modifierTextFieldMagnifier = companion2;
            }
            boolean z21111117 = z14;
            ImeOptions imeOptions1116 = imeOptions3;
            VisualTransformation visualTransformation1115 = visualTransformation2;
            composer2 = composerStartRestartGroup;
            a(modifierOnGloballyPositioned1111114, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new e(function3M498getLambda1$foundation_release, i41119, textFieldState, textStyle2, i41, i44, textFieldScrollerPosition1112, value, visualTransformation2, modifierCursor1112, modifierDrawBehind1112, modifierOnGloballyPositioned1111113, modifierTextFieldMagnifier, bringIntoViewRequester1112, textFieldSelectionManager, z19, z15, function4, offsetMapping, density)), composer2, 448);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle3 = textStyle2;
            visualTransformation3 = visualTransformation1115;
            function5 = function4;
            brush2 = solidColor;
            z20 = z13;
            i45 = i41;
            keyboardActions3 = keyboardActions2;
            mutableInteractionSource6 = mutableInteractionSource5;
            z21 = z15;
            function6 = function3M498getLambda1$foundation_release;
            modifier3 = modifier1115;
            z22 = z21111117;
            imeOptions4 = imeOptions1116;
            i46 = i44;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(value, onValueChange, modifier3, textStyle3, visualTransformation3, function5, mutableInteractionSource6, brush2, z20, i46, i45, imeOptions4, keyboardActions3, z22, z21, function6, i12, i13, i14));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldCursorHandle(@NotNull TextFieldSelectionManager manager, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1436003720);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1436003720, i10, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1090)");
        }
        TextFieldState state = manager.getState();
        if (state != null && state.getShowCursorHandle()) {
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(manager);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = manager.cursorDragObserver$foundation_release();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextDragObserver textDragObserver = (TextDragObserver) objRememberedValue;
            long jM646getCursorPositiontuRUvjQ$foundation_release = manager.m646getCursorPositiontuRUvjQ$foundation_release((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, textDragObserver, new o(textDragObserver, null));
            Offset offsetM2264boximpl = Offset.m2264boximpl(jM646getCursorPositiontuRUvjQ$foundation_release);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(offsetM2264boximpl);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new p(jM646getCursorPositiontuRUvjQ$foundation_release);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidCursorHandle_androidKt.m485CursorHandleULxng0E(jM646getCursorPositiontuRUvjQ$foundation_release, SemanticsModifierKt.semantics$default(modifierPointerInput, false, (Function1) objRememberedValue2, 1, null), null, composerStartRestartGroup, BluetoothState.REQUEST_CONNECT_DEVICE);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new q(manager, i10));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-20551815);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20551815, i10, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:723)");
        }
        int i11 = (i10 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE;
        composerStartRestartGroup.startReplaceableGroup(733328855);
        int i12 = i11 >> 3;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composerStartRestartGroup, (i12 & 112) | (i12 & 14));
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
        Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
        }
        ai.a.j((i13 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-1985516685);
        function2.invoke(composerStartRestartGroup, Integer.valueOf(((((i10 >> 3) & 112) | 8) >> 3) & 14));
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new n(modifier, textFieldSelectionManager, function2, i10));
    }

    public static final boolean access$CoreTextField$lambda$8(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final void access$SelectionToolbarAndHandles(TextFieldSelectionManager textFieldSelectionManager, boolean z10, Composer composer, int i10) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        Composer composerStartRestartGroup = composer.startRestartGroup(626339208);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(626339208, i10, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1047)");
        }
        if (z10) {
            TextFieldState state = textFieldSelectionManager.getState();
            TextLayoutResult textLayoutResult = null;
            if (state != null && (layoutResult = state.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                TextFieldState state2 = textFieldSelectionManager.getState();
                if (!(state2 != null ? state2.getIsLayoutResultStale() : true)) {
                    textLayoutResult = value;
                }
            }
            if (textLayoutResult != null) {
                if (!TextRange.m3961getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())) {
                    int iOriginalToTransformed = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m3967getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                    int iOriginalToTransformed2 = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m3962getEndimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                    ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(iOriginalToTransformed);
                    ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(iOriginalToTransformed2 - 1, 0));
                    composerStartRestartGroup.startReplaceableGroup(-498388703);
                    TextFieldState state3 = textFieldSelectionManager.getState();
                    if (state3 != null && state3.getShowSelectionHandleStart()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, composerStartRestartGroup, 518);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextFieldState state4 = textFieldSelectionManager.getState();
                    if (state4 != null && state4.getShowSelectionHandleEnd()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, composerStartRestartGroup, 518);
                    }
                }
                TextFieldState state5 = textFieldSelectionManager.getState();
                if (state5 != null) {
                    if (textFieldSelectionManager.isTextChanged$foundation_release()) {
                        state5.setShowFloatingToolbar(false);
                    }
                    if (state5.getHasFocus()) {
                        if (state5.getShowFloatingToolbar()) {
                            textFieldSelectionManager.showSelectionToolbar$foundation_release();
                        } else {
                            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                        }
                    }
                }
            }
        } else {
            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e0.a(textFieldSelectionManager, z10, i10));
    }

    public static final void access$endInputSession(TextFieldState textFieldState) {
        TextInputSession inputSession = textFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.onBlur$foundation_release(inputSession, textFieldState.getProcessor(), textFieldState.getOnValueChange());
        }
        textFieldState.setInputSession(null);
    }

    public static final void access$startInputSession(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        textFieldState.setInputSession(TextFieldDelegate.INSTANCE.onFocus$foundation_release(textInputService, textFieldValue, textFieldState.getProcessor(), imeOptions, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
        b(textFieldState, textFieldValue, offsetMapping);
    }

    public static final void access$tapToFocus(TextFieldState textFieldState, FocusRequester focusRequester, boolean z10) {
        TextInputSession inputSession;
        if (!textFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else {
            if (!z10 || (inputSession = textFieldState.getInputSession()) == null) {
                return;
            }
            inputSession.showSoftwareKeyboard();
        }
    }

    public static final void b(TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                if (layoutResult == null) {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    snapshotCreateNonObservableSnapshot.dispose();
                    return;
                }
                TextInputSession inputSession = textFieldState.getInputSession();
                if (inputSession == null) {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    snapshotCreateNonObservableSnapshot.dispose();
                    return;
                }
                LayoutCoordinates layoutCoordinates = textFieldState.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    snapshotCreateNonObservableSnapshot.dispose();
                } else {
                    TextFieldDelegate.INSTANCE.notifyFocusedRect$foundation_release(textFieldValue, textFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, textFieldState.getHasFocus(), offsetMapping);
                    Unit unit = Unit.INSTANCE;
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    snapshotCreateNonObservableSnapshot.dispose();
                }
            } catch (Throwable th2) {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                throw th2;
            }
        } catch (Throwable th3) {
            snapshotCreateNonObservableSnapshot.dispose();
            throw th3;
        }
    }

    @Nullable
    public static final Object bringSelectionEndIntoView(@NotNull BringIntoViewRequester bringIntoViewRequester, @NotNull TextFieldValue textFieldValue, @NotNull TextDelegate textDelegate, @NotNull TextLayoutResult textLayoutResult, @NotNull OffsetMapping offsetMapping, @NotNull Continuation<? super Unit> continuation) {
        Rect boundingBox;
        int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m3964getMaximpl(textFieldValue.getSelection()));
        if (iOriginalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
            boundingBox = textLayoutResult.getBoundingBox(iOriginalToTransformed);
        } else {
            boundingBox = iOriginalToTransformed != 0 ? textLayoutResult.getBoundingBox(iOriginalToTransformed - 1) : new Rect(0.0f, 0.0f, 1.0f, IntSize.m4548getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
        }
        Object objBringIntoView = bringIntoViewRequester.bringIntoView(boundingBox, continuation);
        return objBringIntoView == ek.a.getCOROUTINE_SUSPENDED() ? objBringIntoView : Unit.INSTANCE;
    }
}
