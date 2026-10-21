package com.bbva.glomohybrid.base.rate;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bbva.glomohybrid.base.R;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.base.cells.constants.ActionConstants;
import com.bbva.glomohybrid.base.datasource.RateYourAppDataSource;
import com.bbva.glomohybrid.base.rate.RateYourAppDialogFragment;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RateYourAppDialogFragment.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/base/rate/RateYourAppDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", LogKeysKt.TAG, "", "createDialog", "Lcom/bbva/glomohybrid/base/datasource/RateYourAppDataSource;", "rateYourAppDataSource", "<init>", "(Lcom/bbva/glomohybrid/base/datasource/RateYourAppDataSource;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class RateYourAppDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "rate-dialog-fragment";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final RateYourAppDataSource f31473p0;

    /* JADX INFO: compiled from: RateYourAppDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/base/rate/RateYourAppDialogFragment$Companion;", "", "()V", "ID", "", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RateYourAppDialogFragment(@NotNull RateYourAppDataSource rateYourAppDataSource) {
        Intrinsics.checkNotNullParameter(rateYourAppDataSource, "rateYourAppDataSource");
        this.f31473p0 = rateYourAppDataSource;
    }

    public final void createDialog(@NotNull FragmentManager fragmentManager, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(tag, "tag");
        show(fragmentManager, tag);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle(R.string.rate_your_app_title).setMessage(R.string.rate_your_app_message).setPositiveButton(R.string.rate_your_app_positive_button, new DialogInterface.OnClickListener() { // from class: f8.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                RateYourAppDialogFragment.Companion companion = RateYourAppDialogFragment.INSTANCE;
                RateYourAppDialogFragment this$0 = this.f68388p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                CellsReactor.fire$default(RateYourAppDialogFragment.ID, ActionConstants.INSTANCE.getACTION_RATE_APP(), null, 4, null);
                this$0.dismiss();
            }
        }).setNeutralButton(R.string.rate_your_app_neutral_button, new DialogInterface.OnClickListener() { // from class: f8.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                RateYourAppDialogFragment.Companion companion = RateYourAppDialogFragment.INSTANCE;
                RateYourAppDialogFragment this$0 = this.f68389p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f31473p0.incrementNeverTimesClicked$Base_release();
                this$0.dismiss();
            }
        }).setNegativeButton(R.string.rate_your_app_negative_button, new DialogInterface.OnClickListener() { // from class: f8.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                RateYourAppDialogFragment.Companion companion = RateYourAppDialogFragment.INSTANCE;
                RateYourAppDialogFragment this$0 = this.f68390p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.dismiss();
            }
        }).create();
        Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "create(...)");
        return alertDialogCreate;
    }
}
