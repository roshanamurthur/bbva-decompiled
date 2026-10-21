package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PointerInteropFilter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a-\u0010\u0000\u001a\u00020\u0001*\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u001a,\u0010\t\u001a\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0003H\u0007\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¨\u0006\u0010"}, d2 = {"motionEventSpy", "Landroidx/compose/ui/Modifier;", "watcher", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Lkotlin/ParameterName;", "name", "motionEvent", "", "pointerInteropFilter", "requestDisallowInterceptTouchEvent", "Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "onTouchEvent", "", "view", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,349:1\n135#2:350\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n*L\n73#1:350\n*E\n"})
public final class PointerInteropFilter_androidKt {

    /* JADX INFO: compiled from: PointerInteropFilter.android.kt */
    @DebugMetadata(c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1", f = "PointerInteropFilter.android.kt", i = {}, l = {342}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f16444p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f16445q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<MotionEvent, Unit> f16446r0;

        /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PointerInteropFilter.android.kt */
        @DebugMetadata(c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1", f = "PointerInteropFilter.android.kt", i = {0}, l = {344}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
        public static final class C0061a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f16447p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public /* synthetic */ Object f16448q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Function1<MotionEvent, Unit> f16449r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0061a(Function1<? super MotionEvent, Unit> function1, Continuation<? super C0061a> continuation) {
                super(2, continuation);
                this.f16449r0 = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0061a c0061a = new C0061a(this.f16449r0, continuation);
                c0061a.f16448q0 = obj;
                return c0061a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((C0061a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0033 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:12:0x0034  */
            /* JADX WARN: Code duplicated, block: B:15:0x0041  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:13:0x0039). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0034
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
                    int r1 = r6.f16447p0
                    r2 = 1
                    if (r1 == 0) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r1 = r6.f16448q0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                    kotlin.ResultKt.throwOnFailure(r7)
                    r3 = r1
                    r1 = r0
                    r0 = r6
                    goto L39
                L16:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1e:
                    kotlin.ResultKt.throwOnFailure(r7)
                    java.lang.Object r7 = r6.f16448q0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
                    r1 = r7
                    r7 = r6
                L27:
                    androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                    r7.f16448q0 = r1
                    r7.f16447p0 = r2
                    java.lang.Object r3 = r1.awaitPointerEvent(r3, r7)
                    if (r3 != r0) goto L34
                    return r0
                L34:
                    r5 = r0
                    r0 = r7
                    r7 = r3
                    r3 = r1
                    r1 = r5
                L39:
                    androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.ui.input.pointer.PointerEvent) r7
                    android.view.MotionEvent r7 = r7.getMotionEvent$ui_release()
                    if (r7 == 0) goto L46
                    kotlin.jvm.functions.Function1<android.view.MotionEvent, kotlin.Unit> r4 = r0.f16449r0
                    r4.invoke(r7)
                L46:
                    r7 = r0
                    r0 = r1
                    r1 = r3
                    goto L27
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.a.C0061a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super MotionEvent, Unit> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f16446r0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f16446r0, continuation);
            aVar.f16445q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((a) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f16444p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f16445q0;
                pointerInputScope.setInterceptOutOfBoundsChildEvents(true);
                C0061a c0061a = new C0061a(this.f16446r0, null);
                this.f16444p0 = 1;
                if (pointerInputScope.awaitPointerEventScope(c0061a, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: PointerInteropFilter.android.kt */
    @SourceDebugExtension({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt$pointerInteropFilter$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,349:1\n25#2:350\n1097#3,6:351\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt$pointerInteropFilter$2\n*L\n79#1:350\n79#1:351,6\n*E\n"})
    public static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<MotionEvent, Boolean> f16450p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ RequestDisallowInterceptTouchEvent f16451q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, Function1 function1) {
            super(3);
            this.f16450p0 = function1;
            this.f16451q0 = requestDisallowInterceptTouchEvent;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, 374375707);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(374375707, iA, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:77)");
            }
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new PointerInteropFilter();
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) objRememberedValue;
            pointerInteropFilter.setOnTouchEvent(this.f16450p0);
            pointerInteropFilter.setRequestDisallowInterceptTouchEvent(this.f16451q0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return pointerInteropFilter;
        }
    }

    /* JADX INFO: compiled from: PointerInteropFilter.android.kt */
    public static final class c extends Lambda implements Function1<MotionEvent, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AndroidViewHolder f16452p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AndroidViewHolder androidViewHolder) {
            super(1);
            this.f16452p0 = androidViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean zDispatchTouchEvent;
            MotionEvent motionEvent2 = motionEvent;
            Intrinsics.checkNotNullParameter(motionEvent2, "motionEvent");
            int actionMasked = motionEvent2.getActionMasked();
            AndroidViewHolder androidViewHolder = this.f16452p0;
            switch (actionMasked) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zDispatchTouchEvent = androidViewHolder.dispatchTouchEvent(motionEvent2);
                    break;
                default:
                    zDispatchTouchEvent = androidViewHolder.dispatchGenericMotionEvent(motionEvent2);
                    break;
            }
            return Boolean.valueOf(zDispatchTouchEvent);
        }
    }

    @NotNull
    public static final Modifier motionEventSpy(@NotNull Modifier modifier, @NotNull Function1<? super MotionEvent, Unit> watcher) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        return SuspendingPointerInputFilterKt.pointerInput(modifier, watcher, new a(watcher, null));
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier pointerInteropFilter(@NotNull Modifier modifier, @NotNull AndroidViewHolder view) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.setOnTouchEvent(new c(view));
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent = new RequestDisallowInterceptTouchEvent();
        pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
        view.setOnRequestDisallowInterceptTouchEvent$ui_release(requestDisallowInterceptTouchEvent);
        return modifier.then(pointerInteropFilter);
    }

    public static /* synthetic */ Modifier pointerInteropFilter$default(Modifier modifier, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            requestDisallowInterceptTouchEvent = null;
        }
        return pointerInteropFilter(modifier, requestDisallowInterceptTouchEvent, function1);
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier pointerInteropFilter(@NotNull Modifier modifier, @Nullable final RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, @NotNull final Function1<? super MotionEvent, Boolean> onTouchEvent) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onTouchEvent, "onTouchEvent");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "pointerInteropFilter").set("requestDisallowInterceptTouchEvent", requestDisallowInterceptTouchEvent);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onTouchEvent", onTouchEvent);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new b(requestDisallowInterceptTouchEvent, onTouchEvent));
    }
}
