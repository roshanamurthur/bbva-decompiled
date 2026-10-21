package com.afollestad.materialdialogs.internal.list;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.utils.DialogsKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DialogRecyclerView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014J(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0014¨\u0006\u0015"}, d2 = {"Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "dialog", "", "attach", "invalidateDividers", "onAttachedToWindow", "onDetachedFromWindow", "", Parameters.DIRECTION.LEFT, "top", "oldl", "oldt", "onScrollChanged", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public a f25493b2;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public final DialogRecyclerView$scrollListeners$1 f25494c2;

    /* JADX INFO: compiled from: DialogRecyclerView.kt */
    public static final /* synthetic */ class a extends FunctionReference implements Function2<Boolean, Boolean, Unit> {
        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "invalidateDividers";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinPackage(DialogsKt.class, "com.afollestad.material-dialogs.core");
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "invalidateDividers(Lcom/afollestad/materialdialogs/MaterialDialog;ZZ)V";
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Boolean bool, Boolean bool2) {
            DialogsKt.invalidateDividers((MaterialDialog) this.receiver, bool.booleanValue(), bool2.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DialogRecyclerView.kt */
    public static final class b extends Lambda implements Function1<DialogRecyclerView, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f25495p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogRecyclerView dialogRecyclerView) {
            DialogRecyclerView dialogRecyclerView2 = dialogRecyclerView;
            dialogRecyclerView2.invalidateDividers();
            DialogRecyclerView.access$invalidateOverScroll(dialogRecyclerView2);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DialogRecyclerView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public static final void access$invalidateOverScroll(DialogRecyclerView dialogRecyclerView) {
        int i10 = 2;
        if (dialogRecyclerView.getChildCount() != 0 && dialogRecyclerView.getMeasuredHeight() != 0 && (!dialogRecyclerView.c0() || !dialogRecyclerView.d0())) {
            i10 = 1;
        }
        dialogRecyclerView.setOverScrollMode(i10);
    }

    public final void attach(@NotNull MaterialDialog dialog) {
        this.f25493b2 = new a(2, dialog);
    }

    public final boolean c0() {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(adapter, "adapter!!");
        int itemCount = adapter.getItemCount() - 1;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() == itemCount) {
                return true;
            }
        } else if ((layoutManager instanceof GridLayoutManager) && ((GridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() == itemCount) {
            return true;
        }
        return false;
    }

    public final boolean d0() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0) {
                return true;
            }
        } else if ((layoutManager instanceof GridLayoutManager) && ((GridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0) {
            return true;
        }
        return false;
    }

    public final void invalidateDividers() {
        a aVar;
        if (getChildCount() == 0 || getMeasuredHeight() == 0 || (aVar = this.f25493b2) == null) {
            return;
        }
        aVar.invoke(Boolean.valueOf(!d0()), Boolean.valueOf(!c0()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MDUtil.INSTANCE.waitForWidth(this, b.f25495p0);
        addOnScrollListener(this.f25494c2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeOnScrollListener(this.f25494c2);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onScrollChanged(int left, int top, int oldl, int oldt) {
        super.onScrollChanged(left, top, oldl, oldt);
        invalidateDividers();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.afollestad.materialdialogs.internal.list.DialogRecyclerView$scrollListeners$1] */
    public DialogRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25494c2 = new RecyclerView.OnScrollListener() { // from class: com.afollestad.materialdialogs.internal.list.DialogRecyclerView$scrollListeners$1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                this.f25496a.invalidateDividers();
            }
        };
    }
}
