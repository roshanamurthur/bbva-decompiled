package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u0.e;
import u0.f;

/* JADX INFO: compiled from: PointerInteropFilter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b!\u0010\"R.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR.\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "onTouchEvent", "Lkotlin/jvm/functions/Function1;", "getOnTouchEvent", "()Lkotlin/jvm/functions/Function1;", "setOnTouchEvent", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "value", "a", "Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "getRequestDisallowInterceptTouchEvent", "()Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "setRequestDisallowInterceptTouchEvent", "(Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;)V", "requestDisallowInterceptTouchEvent", "b", "Z", "getDisallowIntercept$ui_release", "()Z", "setDisallowIntercept$ui_release", "(Z)V", "disallowIntercept", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "c", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "pointerInputFilter", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class PointerInteropFilter implements PointerInputModifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean disallowIntercept;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PointerInteropFilter$pointerInputFilter$1 f16437c = new PointerInputFilter() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public PointerInteropFilter.a f16438c = PointerInteropFilter.a.Unknown;

        /* JADX INFO: compiled from: PointerInteropFilter.android.kt */
        public static final class a extends Lambda implements Function1<MotionEvent, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ PointerInteropFilter f16440p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PointerInteropFilter pointerInteropFilter) {
                super(1);
                this.f16440p0 = pointerInteropFilter;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                Intrinsics.checkNotNullParameter(motionEvent2, "motionEvent");
                this.f16440p0.getOnTouchEvent().invoke(motionEvent2);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: PointerInteropFilter.android.kt */
        public static final class b extends Lambda implements Function1<MotionEvent, Unit> {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ PointerInteropFilter f16442q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(PointerInteropFilter pointerInteropFilter) {
                super(1);
                this.f16442q0 = pointerInteropFilter;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                Intrinsics.checkNotNullParameter(motionEvent2, "motionEvent");
                int actionMasked = motionEvent2.getActionMasked();
                PointerInteropFilter pointerInteropFilter = this.f16442q0;
                if (actionMasked == 0) {
                    PointerInteropFilter$pointerInputFilter$1.this.f16438c = pointerInteropFilter.getOnTouchEvent().invoke(motionEvent2).booleanValue() ? PointerInteropFilter.a.Dispatching : PointerInteropFilter.a.NotDispatching;
                } else {
                    pointerInteropFilter.getOnTouchEvent().invoke(motionEvent2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: PointerInteropFilter.android.kt */
        public static final class c extends Lambda implements Function1<MotionEvent, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ PointerInteropFilter f16443p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(PointerInteropFilter pointerInteropFilter) {
                super(1);
                this.f16443p0 = pointerInteropFilter;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                Intrinsics.checkNotNullParameter(motionEvent2, "motionEvent");
                this.f16443p0.getOnTouchEvent().invoke(motionEvent2);
                return Unit.INSTANCE;
            }
        }

        public final void a(PointerEvent pointerEvent) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i10 = 0;
            while (true) {
                PointerInteropFilter pointerInteropFilter = this.f16439d;
                if (i10 >= size) {
                    LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        throw new IllegalStateException("layoutCoordinates not set".toString());
                    }
                    PointerInteropUtils_androidKt.m3522toMotionEventScoped4ec7I(pointerEvent, layoutCoordinates.mo3583localToRootMKHz9U(Offset.INSTANCE.m2291getZeroF1C5BW0()), new b(pointerInteropFilter));
                    if (this.f16438c == PointerInteropFilter.a.Dispatching) {
                        int size2 = changes.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            changes.get(i11).consume();
                        }
                        InternalPointerEvent internalPointerEvent = pointerEvent.getInternalPointerEvent();
                        if (internalPointerEvent == null) {
                            return;
                        }
                        internalPointerEvent.setSuppressMovementConsumption(!pointerInteropFilter.getDisallowIntercept());
                        return;
                    }
                    return;
                }
                if (changes.get(i10).isConsumed()) {
                    if (this.f16438c == PointerInteropFilter.a.Dispatching) {
                        LayoutCoordinates layoutCoordinates2 = getLayoutCoordinates();
                        if (layoutCoordinates2 == null) {
                            throw new IllegalStateException("layoutCoordinates not set".toString());
                        }
                        PointerInteropUtils_androidKt.m3521toCancelMotionEventScoped4ec7I(pointerEvent, layoutCoordinates2.mo3583localToRootMKHz9U(Offset.INSTANCE.m2291getZeroF1C5BW0()), new a(pointerInteropFilter));
                    }
                    this.f16438c = PointerInteropFilter.a.NotDispatching;
                    return;
                }
                i10++;
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputFilter
        public boolean getShareWithSiblings() {
            return true;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputFilter
        public void onCancel() {
            if (this.f16438c == PointerInteropFilter.a.Dispatching) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                PointerInteropFilter pointerInteropFilter = this.f16439d;
                PointerInteropUtils_androidKt.emptyCancelMotionEventScope(jUptimeMillis, new c(pointerInteropFilter));
                this.f16438c = PointerInteropFilter.a.Unknown;
                pointerInteropFilter.setDisallowIntercept$ui_release(false);
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputFilter
        /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
        public void mo3497onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
            boolean z10;
            Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
            Intrinsics.checkNotNullParameter(pass, "pass");
            List<PointerInputChange> changes = pointerEvent.getChanges();
            PointerInteropFilter pointerInteropFilter = this.f16439d;
            if (pointerInteropFilter.getDisallowIntercept()) {
                z10 = true;
                break;
            }
            int size = changes.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = false;
                    break;
                }
                PointerInputChange pointerInputChange = changes.get(i10);
                if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange) || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (this.f16438c != PointerInteropFilter.a.NotDispatching) {
                if (pass == PointerEventPass.Initial && z10) {
                    a(pointerEvent);
                }
                if (pass == PointerEventPass.Final && !z10) {
                    a(pointerEvent);
                }
            }
            if (pass == PointerEventPass.Final) {
                int size2 = changes.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i11))) {
                        return;
                    }
                }
                this.f16438c = PointerInteropFilter.a.Unknown;
                pointerInteropFilter.setDisallowIntercept$ui_release(false);
            }
        }
    };
    public Function1<? super MotionEvent, Boolean> onTouchEvent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: PointerInteropFilter.android.kt */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a Dispatching;
        public static final a NotDispatching;
        public static final a Unknown;

        static {
            a aVar = new a("Unknown", 0);
            Unknown = aVar;
            a aVar2 = new a("Dispatching", 1);
            Dispatching = aVar2;
            a aVar3 = new a("NotDispatching", 2);
            NotDispatching = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
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

    /* JADX INFO: renamed from: getDisallowIntercept$ui_release, reason: from getter */
    public final boolean getDisallowIntercept() {
        return this.disallowIntercept;
    }

    @NotNull
    public final Function1<MotionEvent, Boolean> getOnTouchEvent() {
        Function1 function1 = this.onTouchEvent;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onTouchEvent");
        return null;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputModifier
    @NotNull
    public PointerInputFilter getPointerInputFilter() {
        return this.f16437c;
    }

    @Nullable
    public final RequestDisallowInterceptTouchEvent getRequestDisallowInterceptTouchEvent() {
        return this.requestDisallowInterceptTouchEvent;
    }

    public final void setDisallowIntercept$ui_release(boolean z10) {
        this.disallowIntercept = z10;
    }

    public final void setOnTouchEvent(@NotNull Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onTouchEvent = function1;
    }

    public final void setRequestDisallowInterceptTouchEvent(@Nullable RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent) {
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent2 = this.requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent2 != null) {
            requestDisallowInterceptTouchEvent2.setPointerInteropFilter$ui_release(null);
        }
        this.requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent == null) {
            return;
        }
        requestDisallowInterceptTouchEvent.setPointerInteropFilter$ui_release(this);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return e.a(this, modifier);
    }
}
