package com.bbva.glomohybrid.base.rate;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.datasource.RateYourAppDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RateYourAppComponent.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/rate/RateYourAppComponent;", "", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "showDialog", "Lcom/bbva/glomohybrid/base/datasource/RateYourAppDataSource;", "rateYourAppDataSource", "<init>", "(Lcom/bbva/glomohybrid/base/datasource/RateYourAppDataSource;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class RateYourAppComponent {

    @NotNull
    public static final String ID = "rate-your-app-component";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RateYourAppDataSource f31472a;

    public RateYourAppComponent(@NotNull RateYourAppDataSource rateYourAppDataSource) {
        Intrinsics.checkNotNullParameter(rateYourAppDataSource, "rateYourAppDataSource");
        this.f31472a = rateYourAppDataSource;
    }

    public final void showDialog(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if ((activity instanceof FragmentActivity ? (FragmentActivity) activity : null) != null) {
            RateYourAppDataSource rateYourAppDataSource = this.f31472a;
            if (rateYourAppDataSource.getNeverTimesClicked() < 3) {
                RateYourAppDialogFragment rateYourAppDialogFragment = new RateYourAppDialogFragment(rateYourAppDataSource);
                FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                rateYourAppDialogFragment.createDialog(supportFragmentManager, ID);
            }
        }
    }
}
