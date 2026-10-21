package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.o1;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0015\u0010\u0010\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a0\u0010\u0013\u001a\u00020\u0014*\u00020\u00032!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00140\u0016H\u0086\b\u001aE\u0010\u0019\u001a\u00020\u0014*\u00020\u000326\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00140\u001aH\u0086\b\u001a\u0015\u0010\u001c\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u001b\u001a\u00020\rH\u0086\u0002\u001a\r\u0010\u001d\u001a\u00020\u0011*\u00020\u0003H\u0086\b\u001a\r\u0010\u001e\u001a\u00020\u0011*\u00020\u0003H\u0086\b\u001a\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 *\u00020\u0003H\u0086\u0002\u001a\u0015\u0010!\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\"\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a\u0017\u0010#\u001a\u00020\u0014*\u00020$2\b\b\u0001\u0010\f\u001a\u00020\rH\u0086\b\u001a5\u0010%\u001a\u00020\u0014*\u00020$2\b\b\u0003\u0010&\u001a\u00020\r2\b\b\u0003\u0010'\u001a\u00020\r2\b\b\u0003\u0010(\u001a\u00020\r2\b\b\u0003\u0010)\u001a\u00020\rH\u0086\b\u001a5\u0010*\u001a\u00020\u0014*\u00020$2\b\b\u0003\u0010+\u001a\u00020\r2\b\b\u0003\u0010'\u001a\u00020\r2\b\b\u0003\u0010,\u001a\u00020\r2\b\b\u0003\u0010)\u001a\u00020\rH\u0087\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\"\u0016\u0010\b\u001a\u00020\t*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\r*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006-"}, d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "Landroid/view/ViewGroup;", "getChildren", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "descendants", "getDescendants", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "(Landroid/view/ViewGroup;)Lkotlin/ranges/IntRange;", "size", "", "getSize", "(Landroid/view/ViewGroup;)I", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "view", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function2;", FirebaseAnalytics.Param.INDEX, "get", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "plusAssign", "setMargins", "Landroid/view/ViewGroup$MarginLayoutParams;", "updateMargins", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "updateMarginsRelative", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewGroupKt {

    /* JADX INFO: compiled from: ViewGroup.kt */
    @DebugMetadata(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {119, 121}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "child", "index$iv", "$this$sequence", "$this$forEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
    @SourceDebugExtension({"SMAP\nViewGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewGroup.kt\nandroidx/core/view/ViewGroupKt$descendants$1\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,175:1\n55#2,4:176\n*S KotlinDebug\n*F\n+ 1 ViewGroup.kt\nandroidx/core/view/ViewGroupKt$descendants$1\n*L\n118#1:176,4\n*E\n"})
    public static final class a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super View>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ViewGroup f20255p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public View f20256q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f20257r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f20258s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f20259t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public /* synthetic */ Object f20260u0;
        final /* synthetic */ ViewGroup v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewGroup viewGroup, Continuation<? super a> continuation) {
            super(2, continuation);
            this.v0 = viewGroup;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.v0, continuation);
            aVar.f20260u0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super View> sequenceScope, Continuation<? super Unit> continuation) {
            return ((a) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0048  */
        /* JADX WARN: Code duplicated, block: B:14:0x005e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:15:0x005f  */
        /* JADX WARN: Code duplicated, block: B:18:0x006a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0083 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0084  */
        /* JADX WARN: Code duplicated, block: B:23:0x008d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0084 -> B:22:0x0086). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008d -> B:24:0x0091). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
                int r1 = r11.f20259t0
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L37
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                int r1 = r11.f20258s0
                int r4 = r11.f20257r0
                android.view.ViewGroup r5 = r11.f20255p0
                java.lang.Object r6 = r11.f20260u0
                kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
                kotlin.ResultKt.throwOnFailure(r12)
                r12 = r11
                goto L86
            L1e:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L26:
                int r1 = r11.f20258s0
                int r4 = r11.f20257r0
                android.view.View r5 = r11.f20256q0
                android.view.ViewGroup r6 = r11.f20255p0
                java.lang.Object r7 = r11.f20260u0
                kotlin.sequences.SequenceScope r7 = (kotlin.sequences.SequenceScope) r7
                kotlin.ResultKt.throwOnFailure(r12)
                r12 = r11
                goto L66
            L37:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r12 = r11.f20260u0
                kotlin.sequences.SequenceScope r12 = (kotlin.sequences.SequenceScope) r12
                android.view.ViewGroup r1 = r11.v0
                int r4 = r1.getChildCount()
                r5 = 0
                r6 = r11
            L46:
                if (r5 >= r4) goto L96
                android.view.View r7 = r1.getChildAt(r5)
                r6.f20260u0 = r12
                r6.f20255p0 = r1
                r6.f20256q0 = r7
                r6.f20257r0 = r5
                r6.f20258s0 = r4
                r6.f20259t0 = r3
                java.lang.Object r8 = r12.yield(r7, r6)
                if (r8 != r0) goto L5f
                return r0
            L5f:
                r9 = r7
                r7 = r12
                r12 = r6
                r6 = r1
                r1 = r4
                r4 = r5
                r5 = r9
            L66:
                boolean r8 = r5 instanceof android.view.ViewGroup
                if (r8 == 0) goto L8d
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                kotlin.sequences.Sequence r5 = androidx.core.view.ViewGroupKt.getDescendants(r5)
                r12.f20260u0 = r7
                r12.f20255p0 = r6
                r8 = 0
                r12.f20256q0 = r8
                r12.f20257r0 = r4
                r12.f20258s0 = r1
                r12.f20259t0 = r2
                java.lang.Object r5 = r7.yieldAll(r5, r12)
                if (r5 != r0) goto L84
                return r0
            L84:
                r5 = r6
                r6 = r7
            L86:
                r9 = r6
                r6 = r12
                r12 = r9
                r10 = r5
                r5 = r1
                r1 = r10
                goto L91
            L8d:
                r5 = r1
                r1 = r6
                r6 = r12
                r12 = r7
            L91:
                int r4 = r4 + r3
                r9 = r5
                r5 = r4
                r4 = r9
                goto L46
            L96:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewGroupKt.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewGroupKt$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ViewGroup.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"androidx/core/view/ViewGroupKt$iterator$1", "", "Landroid/view/View;", "", "hasNext", "next", "", RemoveCommand.ID, "core-ktx_release"}, k = 1, mv = {1, 8, 0})
    public static final class AnonymousClass1 implements Iterator<View>, KMutableIterator {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f20262p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        final /* synthetic */ ViewGroup f20263q0;

        public AnonymousClass1(ViewGroup viewGroup) {
            this.f20263q0 = viewGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20262p0 < this.f20263q0.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f20263q0;
            int i10 = this.f20262p0 - 1;
            this.f20262p0 = i10;
            viewGroup.removeViewAt(i10);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        @NotNull
        public View next() {
            ViewGroup viewGroup = this.f20263q0;
            int i10 = this.f20262p0;
            this.f20262p0 = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public static final boolean contains(@NotNull ViewGroup viewGroup, @NotNull View view) {
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void forEach(@NotNull ViewGroup viewGroup, @NotNull Function1<? super View, Unit> function1) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            function1.invoke(viewGroup.getChildAt(i10));
        }
    }

    public static final void forEachIndexed(@NotNull ViewGroup viewGroup, @NotNull Function2<? super Integer, ? super View, Unit> function2) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            function2.invoke(Integer.valueOf(i10), viewGroup.getChildAt(i10));
        }
    }

    @NotNull
    public static final View get(@NotNull ViewGroup viewGroup, int i10) {
        View childAt = viewGroup.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder sbC = o1.c("Index: ", i10, ", Size: ");
        sbC.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    @NotNull
    public static final Sequence<View> getChildren(@NotNull final ViewGroup viewGroup) {
        return new Sequence<View>() { // from class: androidx.core.view.ViewGroupKt$children$1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<View> iterator() {
                return ViewGroupKt.iterator(viewGroup);
            }
        };
    }

    @NotNull
    public static final Sequence<View> getDescendants(@NotNull ViewGroup viewGroup) {
        return SequencesKt__SequenceBuilderKt.sequence(new a(viewGroup, null));
    }

    @NotNull
    public static final IntRange getIndices(@NotNull ViewGroup viewGroup) {
        return kotlin.ranges.c.until(0, viewGroup.getChildCount());
    }

    public static final int getSize(@NotNull ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    public static final boolean isEmpty(@NotNull ViewGroup viewGroup) {
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean isNotEmpty(@NotNull ViewGroup viewGroup) {
        return viewGroup.getChildCount() != 0;
    }

    @NotNull
    public static final Iterator<View> iterator(@NotNull ViewGroup viewGroup) {
        return new AnonymousClass1(viewGroup);
    }

    public static final void minusAssign(@NotNull ViewGroup viewGroup, @NotNull View view) {
        viewGroup.removeView(view);
    }

    public static final void plusAssign(@NotNull ViewGroup viewGroup, @NotNull View view) {
        viewGroup.addView(view);
    }

    public static final void setMargins(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i10) {
        marginLayoutParams.setMargins(i10, i10, i10, i10);
    }

    public static final void updateMargins(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i10, @Px int i11, @Px int i12, @Px int i13) {
        marginLayoutParams.setMargins(i10, i11, i12, i13);
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = marginLayoutParams.leftMargin;
        }
        if ((i14 & 2) != 0) {
            i11 = marginLayoutParams.topMargin;
        }
        if ((i14 & 4) != 0) {
            i12 = marginLayoutParams.rightMargin;
        }
        if ((i14 & 8) != 0) {
            i13 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i10, i11, i12, i13);
    }

    @RequiresApi(17)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void updateMarginsRelative(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i10, @Px int i11, @Px int i12, @Px int i13) {
        marginLayoutParams.setMarginStart(i10);
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.setMarginEnd(i12);
        marginLayoutParams.bottomMargin = i13;
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = marginLayoutParams.getMarginStart();
        }
        if ((i14 & 2) != 0) {
            i11 = marginLayoutParams.topMargin;
        }
        if ((i14 & 4) != 0) {
            i12 = marginLayoutParams.getMarginEnd();
        }
        if ((i14 & 8) != 0) {
            i13 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMarginStart(i10);
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.setMarginEnd(i12);
        marginLayoutParams.bottomMargin = i13;
    }
}
