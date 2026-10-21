package androidx.compose.foundation.text;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ClickableText.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u001ay\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u008f\u0001\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000e0\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "style", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "maxLines", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "onClick", "ClickableText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ClickableText", "onHover", "ClickableText-03UYbkw", "(Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nClickableText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n25#2:193\n50#2:200\n49#2:201\n50#2:208\n49#2:209\n25#2:216\n25#2:227\n50#2:238\n49#2:239\n1097#3,6:194\n1097#3,6:202\n1097#3,6:210\n1097#3,6:217\n1097#3,3:228\n1100#3,3:234\n1097#3,6:240\n486#4,4:223\n490#4,2:231\n494#4:237\n486#5:233\n1#6:246\n*S KotlinDebug\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n*L\n80#1:193\n81#1:200\n81#1:201\n96#1:208\n96#1:209\n154#1:216\n155#1:227\n184#1:238\n184#1:239\n80#1:194,6\n81#1:202,6\n96#1:210,6\n154#1:217,6\n155#1:228,3\n155#1:234,3\n184#1:240,6\n155#1:223,4\n155#1:231,2\n155#1:237\n155#1:233\n*E\n"})
public final class ClickableTextKt {

    /* JADX INFO: compiled from: ClickableText.kt */
    public static final class a extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f5758p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextLayoutResult textLayoutResult) {
            TextLayoutResult it = textLayoutResult;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ClickableText.kt */
    public static final class b extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextLayoutResult> f5759p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<TextLayoutResult, Unit> f5760q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(MutableState<TextLayoutResult> mutableState, Function1<? super TextLayoutResult, Unit> function1) {
            super(1);
            this.f5759p0 = mutableState;
            this.f5760q0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextLayoutResult textLayoutResult) {
            TextLayoutResult it = textLayoutResult;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f5759p0.setValue(it);
            this.f5760q0.invoke(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ClickableText.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AnnotatedString f5761p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f5762q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TextStyle f5763r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f5764s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f5765t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f5766u0;
        public final /* synthetic */ Function1<TextLayoutResult, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f5767w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f5768x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f5769y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, boolean z10, int i10, int i11, Function1<? super TextLayoutResult, Unit> function1, Function1<? super Integer, Unit> function2, int i12, int i13) {
            super(2);
            this.f5761p0 = annotatedString;
            this.f5762q0 = modifier;
            this.f5763r0 = textStyle;
            this.f5764s0 = z10;
            this.f5765t0 = i10;
            this.f5766u0 = i11;
            this.v0 = function1;
            this.f5767w0 = function2;
            this.f5768x0 = i12;
            this.f5769y0 = i13;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ClickableTextKt.m493ClickableText4YKlhWE(this.f5761p0, this.f5762q0, this.f5763r0, this.f5764s0, this.f5765t0, this.f5766u0, this.v0, this.f5767w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5768x0 | 1), this.f5769y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ClickableText.kt */
    public static final class d extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f5770p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextLayoutResult textLayoutResult) {
            TextLayoutResult it = textLayoutResult;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ClickableText.kt */
    public static final class e extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextLayoutResult> f5771p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<TextLayoutResult, Unit> f5772q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(MutableState<TextLayoutResult> mutableState, Function1<? super TextLayoutResult, Unit> function1) {
            super(1);
            this.f5771p0 = mutableState;
            this.f5772q0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextLayoutResult textLayoutResult) {
            TextLayoutResult it = textLayoutResult;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f5771p0.setValue(it);
            this.f5772q0.invoke(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ClickableText.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AnnotatedString f5773p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f5774q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f5775r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TextStyle f5776s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f5777t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f5778u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function1<TextLayoutResult, Unit> f5779w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f5780x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f5781y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(AnnotatedString annotatedString, Function1<? super Integer, Unit> function1, Modifier modifier, TextStyle textStyle, boolean z10, int i10, int i11, Function1<? super TextLayoutResult, Unit> function2, Function1<? super Integer, Unit> function3, int i12, int i13) {
            super(2);
            this.f5773p0 = annotatedString;
            this.f5774q0 = function1;
            this.f5775r0 = modifier;
            this.f5776s0 = textStyle;
            this.f5777t0 = z10;
            this.f5778u0 = i10;
            this.v0 = i11;
            this.f5779w0 = function2;
            this.f5780x0 = function3;
            this.f5781y0 = i12;
            this.E0 = i13;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ClickableTextKt.m492ClickableText03UYbkw(this.f5773p0, this.f5774q0, this.f5775r0, this.f5776s0, this.f5777t0, this.f5778u0, this.v0, this.f5779w0, this.f5780x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5781y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ClickableText.kt */
    @DebugMetadata(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1", f = "ClickableText.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f5782p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f5783q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f5784r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f5785s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextLayoutResult> f5786t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f5787u0;

        /* JADX INFO: compiled from: ClickableText.kt */
        @DebugMetadata(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1", f = "ClickableText.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f5788p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ PointerInputScope f5789q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Function1<Integer, Unit> f5790r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ MutableState<TextLayoutResult> f5791s0;

            /* JADX INFO: renamed from: androidx.compose.foundation.text.ClickableTextKt$g$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: ClickableText.kt */
            public static final class C0036a extends Lambda implements Function1<Offset, Unit> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ Ref.ObjectRef<Integer> f5792p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ Function1<Integer, Unit> f5793q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ MutableState<TextLayoutResult> f5794r0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0036a(Ref.ObjectRef<Integer> objectRef, Function1<? super Integer, Unit> function1, MutableState<TextLayoutResult> mutableState) {
                    super(1);
                    this.f5792p0 = objectRef;
                    this.f5793q0 = function1;
                    this.f5794r0 = mutableState;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Integer, java.lang.Object] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Offset offset) {
                    ?? Access$ClickableText_03UYbkw$getOffset = ClickableTextKt.access$ClickableText_03UYbkw$getOffset(this.f5794r0, offset.getF15533a());
                    Ref.ObjectRef<Integer> objectRef = this.f5792p0;
                    if (!Intrinsics.areEqual(objectRef.element, (Object) Access$ClickableText_03UYbkw$getOffset)) {
                        objectRef.element = Access$ClickableText_03UYbkw$getOffset;
                        this.f5793q0.invoke(Access$ClickableText_03UYbkw$getOffset);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(PointerInputScope pointerInputScope, Function1<? super Integer, Unit> function1, MutableState<TextLayoutResult> mutableState, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f5789q0 = pointerInputScope;
                this.f5790r0 = function1;
                this.f5791s0 = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f5789q0, this.f5790r0, this.f5791s0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f5788p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    PointerEventPass pointerEventPass = PointerEventPass.Main;
                    C0036a c0036a = new C0036a(objectRef, this.f5790r0, this.f5791s0);
                    this.f5788p0 = 1;
                    if (PointerMoveDetectorKt.detectMoves(this.f5789q0, pointerEventPass, c0036a, this) == coroutine_suspended) {
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

        /* JADX INFO: compiled from: ClickableText.kt */
        public static final class b extends Lambda implements Function1<Offset, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function1<Integer, Unit> f5795p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ MutableState<TextLayoutResult> f5796q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MutableState mutableState, Function1 function1) {
                super(1);
                this.f5795p0 = function1;
                this.f5796q0 = mutableState;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Offset offset) {
                Integer numAccess$ClickableText_03UYbkw$getOffset = ClickableTextKt.access$ClickableText_03UYbkw$getOffset(this.f5796q0, offset.getF15533a());
                if (numAccess$ClickableText_03UYbkw$getOffset != null) {
                    this.f5795p0.invoke(numAccess$ClickableText_03UYbkw$getOffset);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(CoroutineScope coroutineScope, Function1<? super Integer, Unit> function1, MutableState<TextLayoutResult> mutableState, Function1<? super Integer, Unit> function2, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f5784r0 = coroutineScope;
            this.f5785s0 = function1;
            this.f5786t0 = mutableState;
            this.f5787u0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            g gVar = new g(this.f5784r0, this.f5785s0, this.f5786t0, this.f5787u0, continuation);
            gVar.f5783q0 = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((g) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f5782p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f5783q0;
                CoroutineScope coroutineScope = this.f5784r0;
                Function1<Integer, Unit> function1 = this.f5785s0;
                MutableState<TextLayoutResult> mutableState = this.f5786t0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(pointerInputScope, function1, mutableState, null), 3, null);
                b bVar = new b(mutableState, this.f5787u0);
                this.f5782p0 = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, bVar, this, 7, null) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: ClickableText.kt */
    @DebugMetadata(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1", f = "ClickableText.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f5797p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f5798q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextLayoutResult> f5799r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f5800s0;

        /* JADX INFO: compiled from: ClickableText.kt */
        public static final class a extends Lambda implements Function1<Offset, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ MutableState<TextLayoutResult> f5801p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Function1<Integer, Unit> f5802q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(MutableState<TextLayoutResult> mutableState, Function1<? super Integer, Unit> function1) {
                super(1);
                this.f5801p0 = mutableState;
                this.f5802q0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Offset offset) {
                long f15533a = offset.getF15533a();
                TextLayoutResult value = this.f5801p0.getValue();
                if (value != null) {
                    this.f5802q0.invoke(Integer.valueOf(value.m3940getOffsetForPositionk4lQ0M(f15533a)));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(MutableState<TextLayoutResult> mutableState, Function1<? super Integer, Unit> function1, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f5799r0 = mutableState;
            this.f5800s0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            h hVar = new h(this.f5799r0, this.f5800s0, continuation);
            hVar.f5798q0 = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((h) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f5797p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f5798q0;
                a aVar = new a(this.f5799r0, this.f5800s0);
                this.f5797p0 = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, aVar, this, 7, null) == coroutine_suspended) {
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

    /* JADX WARN: Code duplicated, block: B:102:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0141  */
    /* JADX WARN: Code duplicated, block: B:104:0x0145  */
    /* JADX WARN: Code duplicated, block: B:106:0x0149  */
    /* JADX WARN: Code duplicated, block: B:107:0x0152  */
    /* JADX WARN: Code duplicated, block: B:109:0x0156  */
    /* JADX WARN: Code duplicated, block: B:110:0x015a  */
    /* JADX WARN: Code duplicated, block: B:112:0x015e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0167  */
    /* JADX WARN: Code duplicated, block: B:115:0x016b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0171  */
    /* JADX WARN: Code duplicated, block: B:118:0x0175  */
    /* JADX WARN: Code duplicated, block: B:119:0x0179  */
    /* JADX WARN: Code duplicated, block: B:122:0x0181  */
    /* JADX WARN: Code duplicated, block: B:125:0x019c  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0204  */
    /* JADX WARN: Code duplicated, block: B:136:0x024d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0263  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00df  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:88:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x010e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0113  */
    /* JADX WARN: Code duplicated, block: B:94:0x0119  */
    /* JADX WARN: Code duplicated, block: B:95:0x011c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0128  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalFoundationApi
    /* JADX INFO: renamed from: ClickableText-03UYbkw, reason: not valid java name */
    public static final void m492ClickableText03UYbkw(@NotNull AnnotatedString text, @NotNull Function1<? super Integer, Unit> onHover, @Nullable Modifier modifier, @Nullable TextStyle textStyle, boolean z10, int i10, int i11, @Nullable Function1<? super TextLayoutResult, Unit> function1, @NotNull Function1<? super Integer, Unit> onClick, @Nullable Composer composer, int i12, int i13) {
        int i14;
        int i15;
        TextStyle textStyle2;
        int i16;
        int i17;
        boolean z11;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Modifier modifier2;
        TextStyle textStyle3;
        boolean z12;
        int iM4343getClipgIe3tQ8;
        int i27;
        Function1<? super TextLayoutResult, Unit> function2;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        Object objB;
        boolean zChanged;
        Object objRememberedValue2;
        int i28;
        int i29;
        Modifier modifier3;
        TextStyle textStyle4;
        boolean z13;
        Function1<? super TextLayoutResult, Unit> function3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onHover, "onHover");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1020774372);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 112) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(onHover) ? 32 : 16;
        }
        int i30 = i13 & 4;
        if (i30 == 0) {
            if ((i12 & 896) == 0) {
                i14 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i15 = i13 & 8;
            if (i15 != 0) {
                if ((i12 & 7168) == 0) {
                    textStyle2 = textStyle;
                    if (composerStartRestartGroup.changed(textStyle2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 16;
                if (i17 != 0) {
                    if ((i12 & 57344) == 0) {
                        z11 = z10;
                        if (composerStartRestartGroup.changed(z11)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 32;
                    if (i19 != 0) {
                        i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i20 = i10;
                    } else {
                        i20 = i10;
                        if ((i12 & 458752) == 0) {
                            if (composerStartRestartGroup.changed(i20)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i14 |= i21;
                        }
                    }
                    i22 = i13 & 64;
                    if (i22 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(i11)) {
                            i23 = 1048576;
                        } else {
                            i23 = 524288;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 128;
                    if (i24 != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i14 |= i25;
                    }
                    if ((i13 & 256) != 0) {
                        if ((234881024 & i12) == 0) {
                            if (composerStartRestartGroup.changedInstance(onClick)) {
                                i26 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i26 = 33554432;
                            }
                        }
                        if ((191739611 & i14) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                            if (i30 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i15 != 0) {
                                textStyle3 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle3 = textStyle2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i19 != 0) {
                                iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                            } else {
                                iM4343getClipgIe3tQ8 = i20;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i24 != 0) {
                                function2 = d.f5770p0;
                            } else {
                                function2 = function1;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                            if (objB == companion.getEmpty()) {
                                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierThen = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope, onHover, mutableState, onClick, null)));
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new e(mutableState, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i31 = i14 >> 3;
                            Modifier modifier4 = modifier2;
                            Function1<? super TextLayoutResult, Unit> function4 = function2;
                            BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i31 & 896) | (i31 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i28 = iM4343getClipgIe3tQ8;
                            i29 = i27;
                            modifier3 = modifier4;
                            textStyle4 = textStyle3;
                            z13 = z12;
                            function3 = function4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            i29 = i11;
                            textStyle4 = textStyle2;
                            i28 = i20;
                            z13 = z11;
                            function3 = function1;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new f(text, onHover, modifier3, textStyle4, z13, i28, i29, function3, onClick, i12, i13));
                    }
                    i26 = 100663296;
                    i14 |= i26;
                    if ((191739611 & i14) == 38347922) {
                        if (i30 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i15 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                        } else {
                            iM4343getClipgIe3tQ8 = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            function2 = d.f5770p0;
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        if (objB == companion.getEmpty()) {
                            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen2 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope2, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new e(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new e(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i32 = i14 >> 3;
                        Modifier modifier5 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function5 = function2;
                        BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen2, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i32 & 896) | (i32 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i28 = iM4343getClipgIe3tQ8;
                        i29 = i27;
                        modifier3 = modifier5;
                        textStyle4 = textStyle3;
                        z13 = z12;
                        function3 = function5;
                    } else {
                        if (i30 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i15 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                        } else {
                            iM4343getClipgIe3tQ8 = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            function2 = d.f5770p0;
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        if (objB == companion.getEmpty()) {
                            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope3 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen3 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope3, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new e(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new e(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i33 = i14 >> 3;
                        Modifier modifier6 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function6 = function2;
                        BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen3, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i33 & 896) | (i33 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i28 = iM4343getClipgIe3tQ8;
                        i29 = i27;
                        modifier3 = modifier6;
                        textStyle4 = textStyle3;
                        z13 = z12;
                        function3 = function6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(text, onHover, modifier3, textStyle4, z13, i28, i29, function3, onClick, i12, i13));
                }
                i14 |= 24576;
                z11 = z10;
                i19 = i13 & 32;
                if (i19 != 0) {
                    i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i20 = i10;
                } else {
                    i20 = i10;
                    if ((i12 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(i20)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i14 |= i21;
                    }
                }
                i22 = i13 & 64;
                if (i22 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(i11)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 128;
                if (i24 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((i13 & 256) != 0) {
                    if ((234881024 & i12) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i26 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i26 = 33554432;
                        }
                    }
                    if ((191739611 & i14) == 38347922) {
                        if (i30 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i15 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                        } else {
                            iM4343getClipgIe3tQ8 = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            function2 = d.f5770p0;
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        if (objB == companion.getEmpty()) {
                            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope4 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen4 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope4, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new e(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new e(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i34 = i14 >> 3;
                        Modifier modifier7 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function7 = function2;
                        BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen4, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i34 & 896) | (i34 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i28 = iM4343getClipgIe3tQ8;
                        i29 = i27;
                        modifier3 = modifier7;
                        textStyle4 = textStyle3;
                        z13 = z12;
                        function3 = function7;
                    } else {
                        if (i30 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i15 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                        } else {
                            iM4343getClipgIe3tQ8 = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            function2 = d.f5770p0;
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        if (objB == companion.getEmpty()) {
                            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope5 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen5 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope5, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new e(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new e(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i35 = i14 >> 3;
                        Modifier modifier8 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function8 = function2;
                        BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen5, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i35 & 896) | (i35 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i28 = iM4343getClipgIe3tQ8;
                        i29 = i27;
                        modifier3 = modifier8;
                        textStyle4 = textStyle3;
                        z13 = z12;
                        function3 = function8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(text, onHover, modifier3, textStyle4, z13, i28, i29, function3, onClick, i12, i13));
                }
                i26 = 100663296;
                i14 |= i26;
                if ((191739611 & i14) == 38347922) {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = d.f5770p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope6 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen6 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope6, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i36 = i14 >> 3;
                    Modifier modifier9 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function9 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen6, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i36 & 896) | (i36 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = iM4343getClipgIe3tQ8;
                    i29 = i27;
                    modifier3 = modifier9;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    function3 = function9;
                } else {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = d.f5770p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope7 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen7 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope7, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i37 = i14 >> 3;
                    Modifier modifier10 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function10 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen7, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i37 & 896) | (i37 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = iM4343getClipgIe3tQ8;
                    i29 = i27;
                    modifier3 = modifier10;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    function3 = function10;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(text, onHover, modifier3, textStyle4, z13, i28, i29, function3, onClick, i12, i13));
            }
            i14 |= 3072;
            textStyle2 = textStyle;
            i17 = i13 & 16;
            if (i17 != 0) {
                if ((i12 & 57344) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 32;
                if (i19 != 0) {
                    i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i20 = i10;
                } else {
                    i20 = i10;
                    if ((i12 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(i20)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i14 |= i21;
                    }
                }
                i22 = i13 & 64;
                if (i22 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(i11)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 128;
                if (i24 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((i13 & 256) != 0) {
                    if ((234881024 & i12) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i26 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i26 = 33554432;
                        }
                    }
                    if ((191739611 & i14) == 38347922) {
                        if (i30 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i15 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                        } else {
                            iM4343getClipgIe3tQ8 = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            function2 = d.f5770p0;
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        if (objB == companion.getEmpty()) {
                            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope8 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen8 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope8, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new e(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new e(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i38 = i14 >> 3;
                        Modifier modifier11 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function11 = function2;
                        BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen8, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i38 & 896) | (i38 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i28 = iM4343getClipgIe3tQ8;
                        i29 = i27;
                        modifier3 = modifier11;
                        textStyle4 = textStyle3;
                        z13 = z12;
                        function3 = function11;
                    } else {
                        if (i30 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i15 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                        } else {
                            iM4343getClipgIe3tQ8 = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            function2 = d.f5770p0;
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        if (objB == companion.getEmpty()) {
                            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope9 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen9 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope9, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new e(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new e(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i39 = i14 >> 3;
                        Modifier modifier12 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function12 = function2;
                        BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen9, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i39 & 896) | (i39 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i28 = iM4343getClipgIe3tQ8;
                        i29 = i27;
                        modifier3 = modifier12;
                        textStyle4 = textStyle3;
                        z13 = z12;
                        function3 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(text, onHover, modifier3, textStyle4, z13, i28, i29, function3, onClick, i12, i13));
                }
                i26 = 100663296;
                i14 |= i26;
                if ((191739611 & i14) == 38347922) {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = d.f5770p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope10 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen10 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope10, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i310 = i14 >> 3;
                    Modifier modifier13 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function13 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen10, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i310 & 896) | (i310 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = iM4343getClipgIe3tQ8;
                    i29 = i27;
                    modifier3 = modifier13;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    function3 = function13;
                } else {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = d.f5770p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope11 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen11 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope11, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i311 = i14 >> 3;
                    Modifier modifier14 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function14 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen11, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i311 & 896) | (i311 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = iM4343getClipgIe3tQ8;
                    i29 = i27;
                    modifier3 = modifier14;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    function3 = function14;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(text, onHover, modifier3, textStyle4, z13, i28, i29, function3, onClick, i12, i13));
            }
            i14 |= 24576;
            z11 = z10;
            i19 = i13 & 32;
            if (i19 != 0) {
                i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i20 = i10;
            } else {
                i20 = i10;
                if ((i12 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i20)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i14 |= i21;
                }
            }
            i22 = i13 & 64;
            if (i22 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(i11)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i14 |= i23;
            }
            i24 = i13 & 128;
            if (i24 != 0) {
                i14 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
            if ((i13 & 256) != 0) {
                if ((234881024 & i12) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i26 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i26 = 33554432;
                    }
                }
                if ((191739611 & i14) == 38347922) {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = d.f5770p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope12 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen12 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope12, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i312 = i14 >> 3;
                    Modifier modifier15 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function15 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen12, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i312 & 896) | (i312 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = iM4343getClipgIe3tQ8;
                    i29 = i27;
                    modifier3 = modifier15;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    function3 = function15;
                } else {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = d.f5770p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope13 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen13 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope13, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i313 = i14 >> 3;
                    Modifier modifier16 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function16 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen13, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i313 & 896) | (i313 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = iM4343getClipgIe3tQ8;
                    i29 = i27;
                    modifier3 = modifier16;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    function3 = function16;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(text, onHover, modifier3, textStyle4, z13, i28, i29, function3, onClick, i12, i13));
            }
            i26 = 100663296;
            i14 |= i26;
            if ((191739611 & i14) == 38347922) {
                if (i30 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i15 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                } else {
                    iM4343getClipgIe3tQ8 = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    function2 = d.f5770p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope14 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen14 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope14, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new e(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new e(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i314 = i14 >> 3;
                Modifier modifier17 = modifier2;
                Function1<? super TextLayoutResult, Unit> function17 = function2;
                BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen14, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i314 & 896) | (i314 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i28 = iM4343getClipgIe3tQ8;
                i29 = i27;
                modifier3 = modifier17;
                textStyle4 = textStyle3;
                z13 = z12;
                function3 = function17;
            } else {
                if (i30 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i15 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                } else {
                    iM4343getClipgIe3tQ8 = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    function2 = d.f5770p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope15 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen15 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope15, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new e(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new e(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i315 = i14 >> 3;
                Modifier modifier18 = modifier2;
                Function1<? super TextLayoutResult, Unit> function18 = function2;
                BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen15, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i315 & 896) | (i315 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i28 = iM4343getClipgIe3tQ8;
                i29 = i27;
                modifier3 = modifier18;
                textStyle4 = textStyle3;
                z13 = z12;
                function3 = function18;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(text, onHover, modifier3, textStyle4, z13, i28, i29, function3, onClick, i12, i13));
        }
        i14 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        i15 = i13 & 8;
        if (i15 != 0) {
            if ((i12 & 7168) == 0) {
                textStyle2 = textStyle;
                if (composerStartRestartGroup.changed(textStyle2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i14 |= i16;
            }
            i17 = i13 & 16;
            if (i17 != 0) {
                if ((i12 & 57344) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 32;
                if (i19 != 0) {
                    i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i20 = i10;
                } else {
                    i20 = i10;
                    if ((i12 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(i20)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i14 |= i21;
                    }
                }
                i22 = i13 & 64;
                if (i22 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(i11)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 128;
                if (i24 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((i13 & 256) != 0) {
                    if ((234881024 & i12) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i26 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i26 = 33554432;
                        }
                    }
                    if ((191739611 & i14) == 38347922) {
                        if (i30 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i15 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                        } else {
                            iM4343getClipgIe3tQ8 = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            function2 = d.f5770p0;
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        if (objB == companion.getEmpty()) {
                            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope16 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen16 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope16, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new e(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new e(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i316 = i14 >> 3;
                        Modifier modifier19 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function19 = function2;
                        BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen16, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i316 & 896) | (i316 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i28 = iM4343getClipgIe3tQ8;
                        i29 = i27;
                        modifier3 = modifier19;
                        textStyle4 = textStyle3;
                        z13 = z12;
                        function3 = function19;
                    } else {
                        if (i30 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i15 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                        } else {
                            iM4343getClipgIe3tQ8 = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            function2 = d.f5770p0;
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        if (objB == companion.getEmpty()) {
                            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope17 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen17 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope17, onHover, mutableState, onClick, null)));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new e(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new e(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i317 = i14 >> 3;
                        Modifier modifier110 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function110 = function2;
                        BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen17, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i317 & 896) | (i317 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i28 = iM4343getClipgIe3tQ8;
                        i29 = i27;
                        modifier3 = modifier110;
                        textStyle4 = textStyle3;
                        z13 = z12;
                        function3 = function110;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(text, onHover, modifier3, textStyle4, z13, i28, i29, function3, onClick, i12, i13));
                }
                i26 = 100663296;
                i14 |= i26;
                if ((191739611 & i14) == 38347922) {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = d.f5770p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope18 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen18 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope18, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i318 = i14 >> 3;
                    Modifier modifier111 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function111 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen18, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i318 & 896) | (i318 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = iM4343getClipgIe3tQ8;
                    i29 = i27;
                    modifier3 = modifier111;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    function3 = function111;
                } else {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = d.f5770p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope19 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen19 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope19, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i319 = i14 >> 3;
                    Modifier modifier112 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function112 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen19, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i319 & 896) | (i319 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = iM4343getClipgIe3tQ8;
                    i29 = i27;
                    modifier3 = modifier112;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    function3 = function112;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(text, onHover, modifier3, textStyle4, z13, i28, i29, function3, onClick, i12, i13));
            }
            i14 |= 24576;
            z11 = z10;
            i19 = i13 & 32;
            if (i19 != 0) {
                i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i20 = i10;
            } else {
                i20 = i10;
                if ((i12 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i20)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i14 |= i21;
                }
            }
            i22 = i13 & 64;
            if (i22 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(i11)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i14 |= i23;
            }
            i24 = i13 & 128;
            if (i24 != 0) {
                i14 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
            if ((i13 & 256) != 0) {
                if ((234881024 & i12) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i26 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i26 = 33554432;
                    }
                }
                if ((191739611 & i14) == 38347922) {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = d.f5770p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope110 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen110 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope110, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i3110 = i14 >> 3;
                    Modifier modifier113 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function113 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen110, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i3110 & 896) | (i3110 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = iM4343getClipgIe3tQ8;
                    i29 = i27;
                    modifier3 = modifier113;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    function3 = function113;
                } else {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = d.f5770p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope111 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen111 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope111, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i3111 = i14 >> 3;
                    Modifier modifier114 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function114 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen111, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i3111 & 896) | (i3111 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = iM4343getClipgIe3tQ8;
                    i29 = i27;
                    modifier3 = modifier114;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    function3 = function114;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(text, onHover, modifier3, textStyle4, z13, i28, i29, function3, onClick, i12, i13));
            }
            i26 = 100663296;
            i14 |= i26;
            if ((191739611 & i14) == 38347922) {
                if (i30 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i15 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                } else {
                    iM4343getClipgIe3tQ8 = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    function2 = d.f5770p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope112 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen112 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope112, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new e(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new e(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i3112 = i14 >> 3;
                Modifier modifier115 = modifier2;
                Function1<? super TextLayoutResult, Unit> function115 = function2;
                BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen112, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i3112 & 896) | (i3112 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i28 = iM4343getClipgIe3tQ8;
                i29 = i27;
                modifier3 = modifier115;
                textStyle4 = textStyle3;
                z13 = z12;
                function3 = function115;
            } else {
                if (i30 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i15 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                } else {
                    iM4343getClipgIe3tQ8 = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    function2 = d.f5770p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope113 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen113 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope113, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new e(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new e(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i3113 = i14 >> 3;
                Modifier modifier116 = modifier2;
                Function1<? super TextLayoutResult, Unit> function116 = function2;
                BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen113, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i3113 & 896) | (i3113 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i28 = iM4343getClipgIe3tQ8;
                i29 = i27;
                modifier3 = modifier116;
                textStyle4 = textStyle3;
                z13 = z12;
                function3 = function116;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(text, onHover, modifier3, textStyle4, z13, i28, i29, function3, onClick, i12, i13));
        }
        i14 |= 3072;
        textStyle2 = textStyle;
        i17 = i13 & 16;
        if (i17 != 0) {
            if ((i12 & 57344) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i14 |= i18;
            }
            i19 = i13 & 32;
            if (i19 != 0) {
                i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i20 = i10;
            } else {
                i20 = i10;
                if ((i12 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i20)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i14 |= i21;
                }
            }
            i22 = i13 & 64;
            if (i22 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(i11)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i14 |= i23;
            }
            i24 = i13 & 128;
            if (i24 != 0) {
                i14 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
            if ((i13 & 256) != 0) {
                if ((234881024 & i12) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i26 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i26 = 33554432;
                    }
                }
                if ((191739611 & i14) == 38347922) {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = d.f5770p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope114 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen114 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope114, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i3114 = i14 >> 3;
                    Modifier modifier117 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function117 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen114, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i3114 & 896) | (i3114 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = iM4343getClipgIe3tQ8;
                    i29 = i27;
                    modifier3 = modifier117;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    function3 = function117;
                } else {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = d.f5770p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope115 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen115 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope115, onHover, mutableState, onClick, null)));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new e(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i3115 = i14 >> 3;
                    Modifier modifier118 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function118 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen115, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i3115 & 896) | (i3115 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = iM4343getClipgIe3tQ8;
                    i29 = i27;
                    modifier3 = modifier118;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    function3 = function118;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(text, onHover, modifier3, textStyle4, z13, i28, i29, function3, onClick, i12, i13));
            }
            i26 = 100663296;
            i14 |= i26;
            if ((191739611 & i14) == 38347922) {
                if (i30 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i15 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                } else {
                    iM4343getClipgIe3tQ8 = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    function2 = d.f5770p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope116 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen116 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope116, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new e(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new e(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i3116 = i14 >> 3;
                Modifier modifier119 = modifier2;
                Function1<? super TextLayoutResult, Unit> function119 = function2;
                BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen116, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i3116 & 896) | (i3116 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i28 = iM4343getClipgIe3tQ8;
                i29 = i27;
                modifier3 = modifier119;
                textStyle4 = textStyle3;
                z13 = z12;
                function3 = function119;
            } else {
                if (i30 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i15 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                } else {
                    iM4343getClipgIe3tQ8 = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    function2 = d.f5770p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope117 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen117 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope117, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new e(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new e(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i3117 = i14 >> 3;
                Modifier modifier1110 = modifier2;
                Function1<? super TextLayoutResult, Unit> function1110 = function2;
                BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen117, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i3117 & 896) | (i3117 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i28 = iM4343getClipgIe3tQ8;
                i29 = i27;
                modifier3 = modifier1110;
                textStyle4 = textStyle3;
                z13 = z12;
                function3 = function1110;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(text, onHover, modifier3, textStyle4, z13, i28, i29, function3, onClick, i12, i13));
        }
        i14 |= 24576;
        z11 = z10;
        i19 = i13 & 32;
        if (i19 != 0) {
            i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i20 = i10;
        } else {
            i20 = i10;
            if ((i12 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i20)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i14 |= i21;
            }
        }
        i22 = i13 & 64;
        if (i22 != 0) {
            i14 |= 1572864;
        } else if ((i12 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(i11)) {
                i23 = 1048576;
            } else {
                i23 = 524288;
            }
            i14 |= i23;
        }
        i24 = i13 & 128;
        if (i24 != 0) {
            i14 |= 12582912;
        } else if ((i12 & 29360128) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i25 = 8388608;
            } else {
                i25 = 4194304;
            }
            i14 |= i25;
        }
        if ((i13 & 256) != 0) {
            if ((234881024 & i12) == 0) {
                if (composerStartRestartGroup.changedInstance(onClick)) {
                    i26 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i26 = 33554432;
                }
            }
            if ((191739611 & i14) == 38347922) {
                if (i30 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i15 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                } else {
                    iM4343getClipgIe3tQ8 = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    function2 = d.f5770p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope118 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen118 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope118, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new e(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new e(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i3118 = i14 >> 3;
                Modifier modifier1111 = modifier2;
                Function1<? super TextLayoutResult, Unit> function1111 = function2;
                BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen118, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i3118 & 896) | (i3118 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i28 = iM4343getClipgIe3tQ8;
                i29 = i27;
                modifier3 = modifier1111;
                textStyle4 = textStyle3;
                z13 = z12;
                function3 = function1111;
            } else {
                if (i30 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i15 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                } else {
                    iM4343getClipgIe3tQ8 = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    function2 = d.f5770p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope119 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen119 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope119, onHover, mutableState, onClick, null)));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new e(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new e(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i3119 = i14 >> 3;
                Modifier modifier1112 = modifier2;
                Function1<? super TextLayoutResult, Unit> function1112 = function2;
                BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen119, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i3119 & 896) | (i3119 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i28 = iM4343getClipgIe3tQ8;
                i29 = i27;
                modifier3 = modifier1112;
                textStyle4 = textStyle3;
                z13 = z12;
                function3 = function1112;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(text, onHover, modifier3, textStyle4, z13, i28, i29, function3, onClick, i12, i13));
        }
        i26 = 100663296;
        i14 |= i26;
        if ((191739611 & i14) == 38347922) {
            if (i30 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i15 != 0) {
                textStyle3 = TextStyle.INSTANCE.getDefault();
            } else {
                textStyle3 = textStyle2;
            }
            if (i17 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i19 != 0) {
                iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
            } else {
                iM4343getClipgIe3tQ8 = i20;
            }
            if (i22 != 0) {
                i27 = Integer.MAX_VALUE;
            } else {
                i27 = i11;
            }
            if (i24 != 0) {
                function2 = d.f5770p0;
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
            if (objB == companion.getEmpty()) {
                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope1110 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen1110 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope1110, onHover, mutableState, onClick, null)));
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new e(mutableState, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new e(mutableState, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i31110 = i14 >> 3;
            Modifier modifier1113 = modifier2;
            Function1<? super TextLayoutResult, Unit> function1113 = function2;
            BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen1110, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i31110 & 896) | (i31110 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i28 = iM4343getClipgIe3tQ8;
            i29 = i27;
            modifier3 = modifier1113;
            textStyle4 = textStyle3;
            z13 = z12;
            function3 = function1113;
        } else {
            if (i30 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i15 != 0) {
                textStyle3 = TextStyle.INSTANCE.getDefault();
            } else {
                textStyle3 = textStyle2;
            }
            if (i17 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i19 != 0) {
                iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
            } else {
                iM4343getClipgIe3tQ8 = i20;
            }
            if (i22 != 0) {
                i27 = Integer.MAX_VALUE;
            } else {
                i27 = i11;
            }
            if (i24 != 0) {
                function2 = d.f5770p0;
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1020774372, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
            if (objB == companion.getEmpty()) {
                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope1111 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen1111 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, onClick, onHover, new g(coroutineScope1111, onHover, mutableState, onClick, null)));
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new e(mutableState, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new e(mutableState, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i31111 = i14 >> 3;
            Modifier modifier1114 = modifier2;
            Function1<? super TextLayoutResult, Unit> function1114 = function2;
            BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen1111, textStyle3, (Function1) objRememberedValue2, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i31111 & 896) | (i31111 & 57344) | ((i14 << 3) & 458752) | (i14 & 3670016), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i28 = iM4343getClipgIe3tQ8;
            i29 = i27;
            modifier3 = modifier1114;
            textStyle4 = textStyle3;
            z13 = z12;
            function3 = function1114;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(text, onHover, modifier3, textStyle4, z13, i28, i29, function3, onClick, i12, i13));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0137  */
    /* JADX WARN: Code duplicated, block: B:102:0x0140  */
    /* JADX WARN: Code duplicated, block: B:104:0x0144  */
    /* JADX WARN: Code duplicated, block: B:105:0x014a  */
    /* JADX WARN: Code duplicated, block: B:107:0x014e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0152  */
    /* JADX WARN: Code duplicated, block: B:111:0x015a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0176  */
    /* JADX WARN: Code duplicated, block: B:117:0x019a  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:124:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:127:0x0215  */
    /* JADX WARN: Code duplicated, block: B:132:0x022b  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x011d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    /* JADX WARN: Code duplicated, block: B:96:0x012b  */
    /* JADX WARN: Code duplicated, block: B:98:0x012f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0133  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: ClickableText-4YKlhWE, reason: not valid java name */
    public static final void m493ClickableText4YKlhWE(@NotNull AnnotatedString text, @Nullable Modifier modifier, @Nullable TextStyle textStyle, boolean z10, int i10, int i11, @Nullable Function1<? super TextLayoutResult, Unit> function1, @NotNull Function1<? super Integer, Unit> onClick, @Nullable Composer composer, int i12, int i13) {
        int i14;
        Modifier modifier2;
        int i15;
        TextStyle textStyle2;
        int i16;
        int i17;
        boolean z11;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        TextStyle textStyle3;
        boolean z12;
        int iM4343getClipgIe3tQ8;
        int i27;
        Function1<? super TextLayoutResult, Unit> function2;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue2;
        boolean zChanged2;
        Object objRememberedValue3;
        int i28;
        Modifier modifier3;
        Function1<? super TextLayoutResult, Unit> function3;
        TextStyle textStyle4;
        boolean z13;
        int i29;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-246609449);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i30 = i13 & 2;
        if (i30 == 0) {
            if ((i12 & 112) == 0) {
                modifier2 = modifier;
                i14 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & 896) == 0) {
                    textStyle2 = textStyle;
                    if (composerStartRestartGroup.changed(textStyle2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 8;
                if (i17 != 0) {
                    if ((i12 & 7168) == 0) {
                        z11 = z10;
                        if (composerStartRestartGroup.changed(z11)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 16;
                    if (i19 != 0) {
                        i14 |= 24576;
                        i20 = i10;
                    } else {
                        i20 = i10;
                        if ((i12 & 57344) == 0) {
                            if (composerStartRestartGroup.changed(i20)) {
                                i21 = 16384;
                            } else {
                                i21 = 8192;
                            }
                            i14 |= i21;
                        }
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i12 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i13 & 128) != 0) {
                        if ((29360128 & i12) == 0) {
                            if (composerStartRestartGroup.changedInstance(onClick)) {
                                i26 = 8388608;
                            } else {
                                i26 = 4194304;
                            }
                        }
                        if ((23967451 & i14) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                            if (i30 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i15 != 0) {
                                textStyle3 = TextStyle.INSTANCE.getDefault();
                            } else {
                                textStyle3 = textStyle2;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i19 != 0) {
                                iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                            } else {
                                iM4343getClipgIe3tQ8 = i20;
                            }
                            if (i22 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i11;
                            }
                            if (i24 != 0) {
                                function2 = a.f5758p0;
                            } else {
                                function2 = function1;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new h(mutableState, onClick, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierThen = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion2, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new b(mutableState, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifier4 = modifier2;
                            Function1<? super TextLayoutResult, Unit> function4 = function2;
                            BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i28 = i27;
                            modifier3 = modifier4;
                            function3 = function4;
                            textStyle4 = textStyle3;
                            z13 = z12;
                            i29 = iM4343getClipgIe3tQ8;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function3 = function1;
                            modifier3 = modifier2;
                            textStyle4 = textStyle2;
                            z13 = z11;
                            i29 = i20;
                            i28 = i11;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(text, modifier3, textStyle4, z13, i29, i28, function3, onClick, i12, i13));
                    }
                    i26 = 12582912;
                    i14 |= i26;
                    if ((23967451 & i14) == 4793490) {
                        if (i30 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                        } else {
                            iM4343getClipgIe3tQ8 = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            function2 = a.f5758p0;
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new h(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new h(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen2 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion3, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new b(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new b(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier5 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function5 = function2;
                        BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen2, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i28 = i27;
                        modifier3 = modifier5;
                        function3 = function5;
                        textStyle4 = textStyle3;
                        z13 = z12;
                        i29 = iM4343getClipgIe3tQ8;
                    } else {
                        if (i30 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                        } else {
                            iM4343getClipgIe3tQ8 = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            function2 = a.f5758p0;
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new h(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new h(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen3 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion4, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new b(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new b(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier6 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function6 = function2;
                        BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen3, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i28 = i27;
                        modifier3 = modifier6;
                        function3 = function6;
                        textStyle4 = textStyle3;
                        z13 = z12;
                        i29 = iM4343getClipgIe3tQ8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(text, modifier3, textStyle4, z13, i29, i28, function3, onClick, i12, i13));
                }
                i14 |= 3072;
                z11 = z10;
                i19 = i13 & 16;
                if (i19 != 0) {
                    i14 |= 24576;
                    i20 = i10;
                } else {
                    i20 = i10;
                    if ((i12 & 57344) == 0) {
                        if (composerStartRestartGroup.changed(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i12 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                    }
                    if ((23967451 & i14) == 4793490) {
                        if (i30 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                        } else {
                            iM4343getClipgIe3tQ8 = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            function2 = a.f5758p0;
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new h(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new h(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen4 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion5, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new b(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new b(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier7 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function7 = function2;
                        BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen4, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i28 = i27;
                        modifier3 = modifier7;
                        function3 = function7;
                        textStyle4 = textStyle3;
                        z13 = z12;
                        i29 = iM4343getClipgIe3tQ8;
                    } else {
                        if (i30 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                        } else {
                            iM4343getClipgIe3tQ8 = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            function2 = a.f5758p0;
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion6 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new h(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new h(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen5 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion6, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new b(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new b(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier8 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function8 = function2;
                        BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen5, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i28 = i27;
                        modifier3 = modifier8;
                        function3 = function8;
                        textStyle4 = textStyle3;
                        z13 = z12;
                        i29 = iM4343getClipgIe3tQ8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(text, modifier3, textStyle4, z13, i29, i28, function3, onClick, i12, i13));
                }
                i26 = 12582912;
                i14 |= i26;
                if ((23967451 & i14) == 4793490) {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = a.f5758p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen6 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion7, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier9 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function9 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen6, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = i27;
                    modifier3 = modifier9;
                    function3 = function9;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    i29 = iM4343getClipgIe3tQ8;
                } else {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = a.f5758p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen7 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion8, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier10 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function10 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen7, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = i27;
                    modifier3 = modifier10;
                    function3 = function10;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    i29 = iM4343getClipgIe3tQ8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(text, modifier3, textStyle4, z13, i29, i28, function3, onClick, i12, i13));
            }
            i14 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            textStyle2 = textStyle;
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 7168) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    i14 |= 24576;
                    i20 = i10;
                } else {
                    i20 = i10;
                    if ((i12 & 57344) == 0) {
                        if (composerStartRestartGroup.changed(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i12 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                    }
                    if ((23967451 & i14) == 4793490) {
                        if (i30 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                        } else {
                            iM4343getClipgIe3tQ8 = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            function2 = a.f5758p0;
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion9 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new h(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new h(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen8 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion9, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new b(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new b(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier11 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function11 = function2;
                        BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen8, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i28 = i27;
                        modifier3 = modifier11;
                        function3 = function11;
                        textStyle4 = textStyle3;
                        z13 = z12;
                        i29 = iM4343getClipgIe3tQ8;
                    } else {
                        if (i30 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                        } else {
                            iM4343getClipgIe3tQ8 = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            function2 = a.f5758p0;
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion10 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new h(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new h(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen9 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion10, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new b(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new b(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier12 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function12 = function2;
                        BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen9, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i28 = i27;
                        modifier3 = modifier12;
                        function3 = function12;
                        textStyle4 = textStyle3;
                        z13 = z12;
                        i29 = iM4343getClipgIe3tQ8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(text, modifier3, textStyle4, z13, i29, i28, function3, onClick, i12, i13));
                }
                i26 = 12582912;
                i14 |= i26;
                if ((23967451 & i14) == 4793490) {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = a.f5758p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion11 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen10 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion11, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier13 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function13 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen10, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = i27;
                    modifier3 = modifier13;
                    function3 = function13;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    i29 = iM4343getClipgIe3tQ8;
                } else {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = a.f5758p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion12 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen11 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion12, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier14 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function14 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen11, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = i27;
                    modifier3 = modifier14;
                    function3 = function14;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    i29 = iM4343getClipgIe3tQ8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(text, modifier3, textStyle4, z13, i29, i28, function3, onClick, i12, i13));
            }
            i14 |= 3072;
            z11 = z10;
            i19 = i13 & 16;
            if (i19 != 0) {
                i14 |= 24576;
                i20 = i10;
            } else {
                i20 = i10;
                if ((i12 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
            }
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i12 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i13 & 128) != 0) {
                if ((29360128 & i12) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                }
                if ((23967451 & i14) == 4793490) {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = a.f5758p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion13 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen12 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion13, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier15 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function15 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen12, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = i27;
                    modifier3 = modifier15;
                    function3 = function15;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    i29 = iM4343getClipgIe3tQ8;
                } else {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = a.f5758p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion14 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen13 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion14, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier16 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function16 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen13, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = i27;
                    modifier3 = modifier16;
                    function3 = function16;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    i29 = iM4343getClipgIe3tQ8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(text, modifier3, textStyle4, z13, i29, i28, function3, onClick, i12, i13));
            }
            i26 = 12582912;
            i14 |= i26;
            if ((23967451 & i14) == 4793490) {
                if (i30 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i15 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                } else {
                    iM4343getClipgIe3tQ8 = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    function2 = a.f5758p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion15 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new h(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new h(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen14 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion15, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new b(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new b(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier17 = modifier2;
                Function1<? super TextLayoutResult, Unit> function17 = function2;
                BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen14, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i28 = i27;
                modifier3 = modifier17;
                function3 = function17;
                textStyle4 = textStyle3;
                z13 = z12;
                i29 = iM4343getClipgIe3tQ8;
            } else {
                if (i30 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i15 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                } else {
                    iM4343getClipgIe3tQ8 = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    function2 = a.f5758p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion16 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new h(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new h(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen15 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion16, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new b(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new b(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier18 = modifier2;
                Function1<? super TextLayoutResult, Unit> function18 = function2;
                BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen15, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i28 = i27;
                modifier3 = modifier18;
                function3 = function18;
                textStyle4 = textStyle3;
                z13 = z12;
                i29 = iM4343getClipgIe3tQ8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(text, modifier3, textStyle4, z13, i29, i28, function3, onClick, i12, i13));
        }
        i14 |= 48;
        modifier2 = modifier;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & 896) == 0) {
                textStyle2 = textStyle;
                if (composerStartRestartGroup.changed(textStyle2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i14 |= i16;
            }
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 7168) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    i14 |= 24576;
                    i20 = i10;
                } else {
                    i20 = i10;
                    if ((i12 & 57344) == 0) {
                        if (composerStartRestartGroup.changed(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i12 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClick)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                    }
                    if ((23967451 & i14) == 4793490) {
                        if (i30 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                        } else {
                            iM4343getClipgIe3tQ8 = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            function2 = a.f5758p0;
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion17 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new h(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new h(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen16 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion17, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new b(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new b(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier19 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function19 = function2;
                        BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen16, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i28 = i27;
                        modifier3 = modifier19;
                        function3 = function19;
                        textStyle4 = textStyle3;
                        z13 = z12;
                        i29 = iM4343getClipgIe3tQ8;
                    } else {
                        if (i30 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyle3 = TextStyle.INSTANCE.getDefault();
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                        } else {
                            iM4343getClipgIe3tQ8 = i20;
                        }
                        if (i22 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i24 != 0) {
                            function2 = a.f5758p0;
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion18 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new h(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new h(mutableState, onClick, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen17 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion18, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new b(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new b(mutableState, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifier110 = modifier2;
                        Function1<? super TextLayoutResult, Unit> function110 = function2;
                        BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen17, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i28 = i27;
                        modifier3 = modifier110;
                        function3 = function110;
                        textStyle4 = textStyle3;
                        z13 = z12;
                        i29 = iM4343getClipgIe3tQ8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(text, modifier3, textStyle4, z13, i29, i28, function3, onClick, i12, i13));
                }
                i26 = 12582912;
                i14 |= i26;
                if ((23967451 & i14) == 4793490) {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = a.f5758p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion19 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen18 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion19, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier111 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function111 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen18, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = i27;
                    modifier3 = modifier111;
                    function3 = function111;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    i29 = iM4343getClipgIe3tQ8;
                } else {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = a.f5758p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion110 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen19 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion110, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier112 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function112 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen19, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = i27;
                    modifier3 = modifier112;
                    function3 = function112;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    i29 = iM4343getClipgIe3tQ8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(text, modifier3, textStyle4, z13, i29, i28, function3, onClick, i12, i13));
            }
            i14 |= 3072;
            z11 = z10;
            i19 = i13 & 16;
            if (i19 != 0) {
                i14 |= 24576;
                i20 = i10;
            } else {
                i20 = i10;
                if ((i12 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
            }
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i12 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i13 & 128) != 0) {
                if ((29360128 & i12) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                }
                if ((23967451 & i14) == 4793490) {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = a.f5758p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion111 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen110 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion111, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier113 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function113 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen110, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = i27;
                    modifier3 = modifier113;
                    function3 = function113;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    i29 = iM4343getClipgIe3tQ8;
                } else {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = a.f5758p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion112 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen111 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion112, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier114 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function114 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen111, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = i27;
                    modifier3 = modifier114;
                    function3 = function114;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    i29 = iM4343getClipgIe3tQ8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(text, modifier3, textStyle4, z13, i29, i28, function3, onClick, i12, i13));
            }
            i26 = 12582912;
            i14 |= i26;
            if ((23967451 & i14) == 4793490) {
                if (i30 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i15 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                } else {
                    iM4343getClipgIe3tQ8 = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    function2 = a.f5758p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion113 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new h(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new h(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen112 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion113, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new b(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new b(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier115 = modifier2;
                Function1<? super TextLayoutResult, Unit> function115 = function2;
                BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen112, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i28 = i27;
                modifier3 = modifier115;
                function3 = function115;
                textStyle4 = textStyle3;
                z13 = z12;
                i29 = iM4343getClipgIe3tQ8;
            } else {
                if (i30 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i15 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                } else {
                    iM4343getClipgIe3tQ8 = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    function2 = a.f5758p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion114 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new h(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new h(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen113 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion114, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new b(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new b(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier116 = modifier2;
                Function1<? super TextLayoutResult, Unit> function116 = function2;
                BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen113, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i28 = i27;
                modifier3 = modifier116;
                function3 = function116;
                textStyle4 = textStyle3;
                z13 = z12;
                i29 = iM4343getClipgIe3tQ8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(text, modifier3, textStyle4, z13, i29, i28, function3, onClick, i12, i13));
        }
        i14 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        textStyle2 = textStyle;
        i17 = i13 & 8;
        if (i17 != 0) {
            if ((i12 & 7168) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i14 |= i18;
            }
            i19 = i13 & 16;
            if (i19 != 0) {
                i14 |= 24576;
                i20 = i10;
            } else {
                i20 = i10;
                if ((i12 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
            }
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i12 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i13 & 128) != 0) {
                if ((29360128 & i12) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                }
                if ((23967451 & i14) == 4793490) {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = a.f5758p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion115 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen114 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion115, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier117 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function117 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen114, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = i27;
                    modifier3 = modifier117;
                    function3 = function117;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    i29 = iM4343getClipgIe3tQ8;
                } else {
                    if (i30 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyle3 = TextStyle.INSTANCE.getDefault();
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                    } else {
                        iM4343getClipgIe3tQ8 = i20;
                    }
                    if (i22 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i24 != 0) {
                        function2 = a.f5758p0;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion116 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new h(mutableState, onClick, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen115 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion116, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new b(mutableState, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifier118 = modifier2;
                    Function1<? super TextLayoutResult, Unit> function118 = function2;
                    BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen115, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i28 = i27;
                    modifier3 = modifier118;
                    function3 = function118;
                    textStyle4 = textStyle3;
                    z13 = z12;
                    i29 = iM4343getClipgIe3tQ8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(text, modifier3, textStyle4, z13, i29, i28, function3, onClick, i12, i13));
            }
            i26 = 12582912;
            i14 |= i26;
            if ((23967451 & i14) == 4793490) {
                if (i30 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i15 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                } else {
                    iM4343getClipgIe3tQ8 = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    function2 = a.f5758p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion117 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new h(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new h(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen116 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion117, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new b(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new b(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier119 = modifier2;
                Function1<? super TextLayoutResult, Unit> function119 = function2;
                BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen116, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i28 = i27;
                modifier3 = modifier119;
                function3 = function119;
                textStyle4 = textStyle3;
                z13 = z12;
                i29 = iM4343getClipgIe3tQ8;
            } else {
                if (i30 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i15 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                } else {
                    iM4343getClipgIe3tQ8 = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    function2 = a.f5758p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion118 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new h(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new h(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen117 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion118, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new b(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new b(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier1110 = modifier2;
                Function1<? super TextLayoutResult, Unit> function1110 = function2;
                BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen117, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i28 = i27;
                modifier3 = modifier1110;
                function3 = function1110;
                textStyle4 = textStyle3;
                z13 = z12;
                i29 = iM4343getClipgIe3tQ8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(text, modifier3, textStyle4, z13, i29, i28, function3, onClick, i12, i13));
        }
        i14 |= 3072;
        z11 = z10;
        i19 = i13 & 16;
        if (i19 != 0) {
            i14 |= 24576;
            i20 = i10;
        } else {
            i20 = i10;
            if ((i12 & 57344) == 0) {
                if (composerStartRestartGroup.changed(i20)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i14 |= i21;
            }
        }
        i22 = i13 & 32;
        if (i22 != 0) {
            i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i12 & 458752) == 0) {
            if (composerStartRestartGroup.changed(i11)) {
                i23 = 131072;
            } else {
                i23 = 65536;
            }
            i14 |= i23;
        }
        i24 = i13 & 64;
        if (i24 != 0) {
            i14 |= 1572864;
        } else if ((i12 & 3670016) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i14 |= i25;
        }
        if ((i13 & 128) != 0) {
            if ((29360128 & i12) == 0) {
                if (composerStartRestartGroup.changedInstance(onClick)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
            }
            if ((23967451 & i14) == 4793490) {
                if (i30 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i15 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                } else {
                    iM4343getClipgIe3tQ8 = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    function2 = a.f5758p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion119 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new h(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new h(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen118 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion119, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new b(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new b(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier1111 = modifier2;
                Function1<? super TextLayoutResult, Unit> function1111 = function2;
                BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen118, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i28 = i27;
                modifier3 = modifier1111;
                function3 = function1111;
                textStyle4 = textStyle3;
                z13 = z12;
                i29 = iM4343getClipgIe3tQ8;
            } else {
                if (i30 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i15 != 0) {
                    textStyle3 = TextStyle.INSTANCE.getDefault();
                } else {
                    textStyle3 = textStyle2;
                }
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
                } else {
                    iM4343getClipgIe3tQ8 = i20;
                }
                if (i22 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i24 != 0) {
                    function2 = a.f5758p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                Modifier.Companion companion1110 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new h(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new h(mutableState, onClick, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen119 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion1110, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new b(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new b(mutableState, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier1112 = modifier2;
                Function1<? super TextLayoutResult, Unit> function1112 = function2;
                BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen119, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i28 = i27;
                modifier3 = modifier1112;
                function3 = function1112;
                textStyle4 = textStyle3;
                z13 = z12;
                i29 = iM4343getClipgIe3tQ8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(text, modifier3, textStyle4, z13, i29, i28, function3, onClick, i12, i13));
        }
        i26 = 12582912;
        i14 |= i26;
        if ((23967451 & i14) == 4793490) {
            if (i30 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i15 != 0) {
                textStyle3 = TextStyle.INSTANCE.getDefault();
            } else {
                textStyle3 = textStyle2;
            }
            if (i17 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i19 != 0) {
                iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
            } else {
                iM4343getClipgIe3tQ8 = i20;
            }
            if (i22 != 0) {
                i27 = Integer.MAX_VALUE;
            } else {
                i27 = i11;
            }
            if (i24 != 0) {
                function2 = a.f5758p0;
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion1111 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new h(mutableState, onClick, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new h(mutableState, onClick, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen1110 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion1111, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue3 = new b(mutableState, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new b(mutableState, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifier1113 = modifier2;
            Function1<? super TextLayoutResult, Unit> function1113 = function2;
            BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen1110, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i28 = i27;
            modifier3 = modifier1113;
            function3 = function1113;
            textStyle4 = textStyle3;
            z13 = z12;
            i29 = iM4343getClipgIe3tQ8;
        } else {
            if (i30 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i15 != 0) {
                textStyle3 = TextStyle.INSTANCE.getDefault();
            } else {
                textStyle3 = textStyle2;
            }
            if (i17 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i19 != 0) {
                iM4343getClipgIe3tQ8 = TextOverflow.INSTANCE.m4343getClipgIe3tQ8();
            } else {
                iM4343getClipgIe3tQ8 = i20;
            }
            if (i22 != 0) {
                i27 = Integer.MAX_VALUE;
            } else {
                i27 = i11;
            }
            if (i24 != 0) {
                function2 = a.f5758p0;
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-246609449, i14, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion1112 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(onClick);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new h(mutableState, onClick, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new h(mutableState, onClick, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen1111 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion1112, onClick, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2));
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue3 = new b(mutableState, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new b(mutableState, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifier1114 = modifier2;
            Function1<? super TextLayoutResult, Unit> function1114 = function2;
            BasicTextKt.m489BasicTextRWo7tUw(text, modifierThen1111, textStyle3, (Function1) objRememberedValue3, iM4343getClipgIe3tQ8, z12, i27, 0, null, null, composerStartRestartGroup, (i14 & 14) | (i14 & 896) | (57344 & i14) | ((i14 << 6) & 458752) | ((i14 << 3) & 3670016), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i28 = i27;
            modifier3 = modifier1114;
            function3 = function1114;
            textStyle4 = textStyle3;
            z13 = z12;
            i29 = iM4343getClipgIe3tQ8;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(text, modifier3, textStyle4, z13, i29, i28, function3, onClick, i12, i13));
    }

    public static final Integer access$ClickableText_03UYbkw$getOffset(MutableState mutableState, long j10) {
        MultiParagraph multiParagraph;
        TextLayoutResult textLayoutResult = (TextLayoutResult) mutableState.getValue();
        if (textLayoutResult == null || (multiParagraph = textLayoutResult.getMultiParagraph()) == null) {
            return null;
        }
        float fM2265component1impl = Offset.m2265component1impl(j10);
        float fM2266component2impl = Offset.m2266component2impl(j10);
        if (fM2265component1impl <= 0.0f || fM2266component2impl < 0.0f || fM2265component1impl > multiParagraph.getWidth() || fM2266component2impl > multiParagraph.getHeight()) {
            multiParagraph = null;
        }
        if (multiParagraph != null) {
            return Integer.valueOf(multiParagraph.m3869getOffsetForPositionk4lQ0M(j10));
        }
        return null;
    }
}
