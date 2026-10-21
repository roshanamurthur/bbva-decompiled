package com.afollestad.materialdialogs.customview;

import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.LayoutRes;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.utils.MDUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DialogCustomViewExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aO\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\r\u001a\f\u0010\u000e\u001a\u00020\u0007*\u00020\u0003H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"CUSTOM_VIEW_NO_VERTICAL_PADDING", "", "customView", "Lcom/afollestad/materialdialogs/MaterialDialog;", "viewRes", "", "view", "Landroid/view/View;", "scrollable", "", "noVerticalPadding", "horizontalPadding", "dialogWrapContent", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Landroid/view/View;ZZZZ)Lcom/afollestad/materialdialogs/MaterialDialog;", "getCustomView", "com.afollestad.material-dialogs.core"}, k = 2, mv = {1, 1, 15})
public final class DialogCustomViewExtKt {

    @NotNull
    public static final String CUSTOM_VIEW_NO_VERTICAL_PADDING = "md.custom_view_no_vertical_padding";

    /* JADX INFO: compiled from: DialogCustomViewExt.kt */
    public static final class a extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MaterialDialog f25469p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MaterialDialog materialDialog) {
            super(1);
            this.f25469p0 = materialDialog;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            MaterialDialog.maxWidth$default(this.f25469p0, null, Integer.valueOf(view.getMeasuredWidth()), 1, null);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final MaterialDialog customView(@NotNull MaterialDialog materialDialog, @LayoutRes @Nullable Integer num, @Nullable View view, boolean z10, boolean z11, boolean z12, boolean z13) {
        MDUtil mDUtil = MDUtil.INSTANCE;
        mDUtil.assertOneSet("customView", view, num);
        materialDialog.getConfig().put(CUSTOM_VIEW_NO_VERTICAL_PADDING, Boolean.valueOf(z11));
        if (z13) {
            MaterialDialog.maxWidth$default(materialDialog, null, 0, 1, null);
        }
        View viewAddCustomView = materialDialog.getView().getContentLayout().addCustomView(num, view, z10, z12);
        if (z13) {
            mDUtil.waitForWidth(viewAddCustomView, new a(materialDialog));
        }
        return materialDialog;
    }

    public static /* synthetic */ MaterialDialog customView$default(MaterialDialog materialDialog, Integer num, View view, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            view = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        if ((i10 & 32) != 0) {
            z13 = false;
        }
        return customView(materialDialog, num, view, z10, z11, z12, z13);
    }

    @CheckResult
    @NotNull
    public static final View getCustomView(@NotNull MaterialDialog materialDialog) {
        View customView = materialDialog.getView().getContentLayout().getCustomView();
        if (customView != null) {
            return customView;
        }
        throw new IllegalStateException("You have not setup this dialog as a customView dialog.");
    }
}
