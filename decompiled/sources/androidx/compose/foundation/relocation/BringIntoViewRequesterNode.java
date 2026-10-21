package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import c0.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u001d\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "Landroidx/compose/foundation/relocation/BringIntoViewChildNode;", "", "onAttach", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "requester", "updateRequester", "onDetach", "Landroidx/compose/ui/geometry/Rect;", "rect", "bringIntoView", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,187:1\n728#2,2:188\n735#2,2:190\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterNode\n*L\n159#1:188,2\n166#1:190,2\n*E\n"})
public final class BringIntoViewRequesterNode extends BringIntoViewChildNode {

    @NotNull
    public BringIntoViewRequester J0;

    /* JADX INFO: compiled from: BringIntoViewRequester.kt */
    public static final class a extends Lambda implements Function0<Rect> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Rect f5578p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ BringIntoViewRequesterNode f5579q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Rect rect, BringIntoViewRequesterNode bringIntoViewRequesterNode) {
            super(0);
            this.f5578p0 = rect;
            this.f5579q0 = bringIntoViewRequesterNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Rect invoke() {
            Rect rect = this.f5578p0;
            if (rect != null) {
                return rect;
            }
            LayoutCoordinates layoutCoordinates = this.f5579q0.getLayoutCoordinates();
            if (layoutCoordinates != null) {
                return SizeKt.m2365toRectuvyYCjk(IntSizeKt.m4559toSizeozmzZPI(layoutCoordinates.mo3581getSizeYbymL2g()));
            }
            return null;
        }
    }

    public BringIntoViewRequesterNode(@NotNull BringIntoViewRequester requester) {
        Intrinsics.checkNotNullParameter(requester, "requester");
        this.J0 = requester;
    }

    @Nullable
    public final Object bringIntoView(@Nullable Rect rect, @NotNull Continuation<? super Unit> continuation) {
        BringIntoViewParent parent = getParent();
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return Unit.INSTANCE;
        }
        Object objBringChildIntoView = parent.bringChildIntoView(layoutCoordinates, new a(rect, this), continuation);
        return objBringChildIntoView == ek.a.getCOROUTINE_SUSPENDED() ? objBringChildIntoView : Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateRequester(this.J0);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        BringIntoViewRequester bringIntoViewRequester = this.J0;
        if (bringIntoViewRequester instanceof b) {
            Intrinsics.checkNotNull(bringIntoViewRequester, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((b) bringIntoViewRequester).f25319a.remove(this);
        }
    }

    public final void updateRequester(@NotNull BringIntoViewRequester requester) {
        Intrinsics.checkNotNullParameter(requester, "requester");
        BringIntoViewRequester bringIntoViewRequester = this.J0;
        if (bringIntoViewRequester instanceof b) {
            Intrinsics.checkNotNull(bringIntoViewRequester, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((b) bringIntoViewRequester).f25319a.remove(this);
        }
        if (requester instanceof b) {
            ((b) requester).f25319a.add(this);
        }
        this.J0 = requester;
    }
}
