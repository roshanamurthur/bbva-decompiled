package com.bbva.glomohybrid.infoscreen.notification;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.KeyEventDispatcher;
import b9.a;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.glomohybrid.infoscreen.data.model.InfoScreenStyle;
import com.bbva.glomohybrid.infoscreen.databinding.FragmentInfoFuturaScreenBinding;
import com.bbva.glomohybrid.infoscreen.databinding.ViewTimerBinding;
import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment;
import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationTimerExpiredRunningErrorFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0014J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0014J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u001d"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/notification/NotificationTimerExpiredRunningErrorFragment;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenDialogFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "", "bindViews", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenStyle;", "style", "setStyle", "", "getTheme", "configureToolbar", "Landroid/view/MenuItem;", AnalyticsConstants.Key.ITEM, "", "onOptionsItemSelected", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;", "type", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class NotificationTimerExpiredRunningErrorFragment extends InfoScreenDialogFragment {
    public static final /* synthetic */ int K0 = 0;

    @Nullable
    public FragmentInfoFuturaScreenBinding J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationTimerExpiredRunningErrorFragment(@NotNull InfoScreenType type) {
        super(type, null, 2, null);
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment
    public void bindViews() {
        AppCompatImageButton appCompatImageButton;
        ViewTimerBinding viewTimerBinding;
        FragmentInfoFuturaScreenBinding fragmentInfoFuturaScreenBinding = this.J0;
        LinearLayout linearLayout = null;
        setTitleLabel(fragmentInfoFuturaScreenBinding != null ? fragmentInfoFuturaScreenBinding.titleLabel : null);
        FragmentInfoFuturaScreenBinding fragmentInfoFuturaScreenBinding2 = this.J0;
        setToolbarTitleLabel(fragmentInfoFuturaScreenBinding2 != null ? fragmentInfoFuturaScreenBinding2.toolbarTitleLabel : null);
        FragmentInfoFuturaScreenBinding fragmentInfoFuturaScreenBinding3 = this.J0;
        setHeaderImage(fragmentInfoFuturaScreenBinding3 != null ? fragmentInfoFuturaScreenBinding3.headerImage : null);
        FragmentInfoFuturaScreenBinding fragmentInfoFuturaScreenBinding4 = this.J0;
        setDescriptionLabel(fragmentInfoFuturaScreenBinding4 != null ? fragmentInfoFuturaScreenBinding4.descriptionLabel : null);
        FragmentInfoFuturaScreenBinding fragmentInfoFuturaScreenBinding5 = this.J0;
        setPositiveButton(fragmentInfoFuturaScreenBinding5 != null ? fragmentInfoFuturaScreenBinding5.positiveButton : null);
        FragmentInfoFuturaScreenBinding fragmentInfoFuturaScreenBinding6 = this.J0;
        setInfoScreenToolbar(fragmentInfoFuturaScreenBinding6 != null ? fragmentInfoFuturaScreenBinding6.infoScreenToolbar : null);
        AppCompatButton positiveButton = getPositiveButton();
        if (positiveButton != null) {
            positiveButton.setVisibility(8);
        }
        FragmentInfoFuturaScreenBinding fragmentInfoFuturaScreenBinding7 = this.J0;
        if (fragmentInfoFuturaScreenBinding7 != null && (viewTimerBinding = fragmentInfoFuturaScreenBinding7.timerProgressInclude) != null) {
            linearLayout = viewTimerBinding.timerProgressLayout;
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        FragmentInfoFuturaScreenBinding fragmentInfoFuturaScreenBinding8 = this.J0;
        if (fragmentInfoFuturaScreenBinding8 == null || (appCompatImageButton = fragmentInfoFuturaScreenBinding8.closeMenuButton) == null) {
            return;
        }
        appCompatImageButton.setOnClickListener(new a(this, 0));
    }

    @Override // com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment, androidx.fragment.app.DialogFragment
    public int getTheme() {
        return R.style.ModalFuturaDialogTheme;
    }

    @Override // com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        setCancelable(false);
        FragmentInfoFuturaScreenBinding fragmentInfoFuturaScreenBindingInflate = FragmentInfoFuturaScreenBinding.inflate(inflater, container, false);
        this.J0 = fragmentInfoFuturaScreenBindingInflate;
        if (fragmentInfoFuturaScreenBindingInflate != null) {
            return fragmentInfoFuturaScreenBindingInflate.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        KeyEventDispatcher.Component activity = getActivity();
        DialogInterface.OnDismissListener onDismissListener = activity instanceof DialogInterface.OnDismissListener ? (DialogInterface.OnDismissListener) activity : null;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialog);
        }
    }

    @Override // com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment, androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return false;
    }

    @Override // com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment
    public void setStyle(@NotNull InfoScreenStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
    }

    @Override // com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment
    public void configureToolbar() {
    }
}
