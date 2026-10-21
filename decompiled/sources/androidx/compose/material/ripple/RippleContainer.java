package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import bk.g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k0.d;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RippleContainer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0014J\n\u0010\u0010\u001a\u00020\u000f*\u00020\u000eJ\n\u0010\u0011\u001a\u00020\t*\u00020\u000e¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "", "changed", "", "l", "t", "r", "b", "", "onLayout", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleHostView;", "getRippleHostView", "disposeRippleIfNeeded", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleContainer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
public final class RippleContainer extends ViewGroup {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f8974p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ArrayList f8975q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ArrayList f8976r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final d f8977s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f8978t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleContainer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8974p0 = 5;
        ArrayList arrayList = new ArrayList();
        this.f8975q0 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f8976r0 = arrayList2;
        this.f8977s0 = new d();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.f8978t0 = 1;
        setTag(androidx.compose.ui.R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void disposeRippleIfNeeded(@NotNull AndroidRippleIndicationInstance indicationInstance) {
        Intrinsics.checkNotNullParameter(indicationInstance, "<this>");
        indicationInstance.resetHostView();
        d dVar = this.f8977s0;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        LinkedHashMap linkedHashMap = dVar.f79156a;
        RippleHostView rippleHostView = (RippleHostView) linkedHashMap.get(indicationInstance);
        if (rippleHostView != null) {
            rippleHostView.disposeRipple();
            Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
            RippleHostView rippleHostView2 = (RippleHostView) linkedHashMap.get(indicationInstance);
            if (rippleHostView2 != null) {
            }
            linkedHashMap.remove(indicationInstance);
            this.f8976r0.add(rippleHostView);
        }
    }

    @NotNull
    public final RippleHostView getRippleHostView(@NotNull AndroidRippleIndicationInstance indicationInstance) {
        Intrinsics.checkNotNullParameter(indicationInstance, "<this>");
        d dVar = this.f8977s0;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        LinkedHashMap linkedHashMap = dVar.f79156a;
        RippleHostView rippleHostView = (RippleHostView) linkedHashMap.get(indicationInstance);
        if (rippleHostView != null) {
            return rippleHostView;
        }
        RippleHostView rippleHostView2 = (RippleHostView) g.removeFirstOrNull(this.f8976r0);
        LinkedHashMap linkedHashMap2 = dVar.f79157b;
        if (rippleHostView2 == null) {
            int i10 = this.f8978t0;
            ArrayList arrayList = this.f8975q0;
            if (i10 > CollectionsKt__CollectionsKt.getLastIndex(arrayList)) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                rippleHostView2 = new RippleHostView(context);
                addView(rippleHostView2);
                arrayList.add(rippleHostView2);
            } else {
                rippleHostView2 = (RippleHostView) arrayList.get(this.f8978t0);
                Intrinsics.checkNotNullParameter(rippleHostView2, "rippleHostView");
                AndroidRippleIndicationInstance indicationInstance2 = (AndroidRippleIndicationInstance) linkedHashMap2.get(rippleHostView2);
                if (indicationInstance2 != null) {
                    indicationInstance2.resetHostView();
                    Intrinsics.checkNotNullParameter(indicationInstance2, "indicationInstance");
                    RippleHostView rippleHostView3 = (RippleHostView) linkedHashMap.get(indicationInstance2);
                    if (rippleHostView3 != null) {
                    }
                    linkedHashMap.remove(indicationInstance2);
                    rippleHostView2.disposeRipple();
                }
            }
            int i11 = this.f8978t0;
            if (i11 < this.f8974p0 - 1) {
                this.f8978t0 = i11 + 1;
            } else {
                this.f8978t0 = 0;
            }
        }
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        Intrinsics.checkNotNullParameter(rippleHostView2, "rippleHostView");
        linkedHashMap.put(indicationInstance, rippleHostView2);
        linkedHashMap2.put(rippleHostView2, indicationInstance);
        return rippleHostView2;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l6, int t10, int r3, int b10) {
    }
}
