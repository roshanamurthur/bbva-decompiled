package a9;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.bbva.glomohybrid.infoscreen.networkerror.NetworkErrorFragment;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NetworkErrorFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NetworkErrorFragment f212p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NetworkErrorFragment networkErrorFragment) {
        super(1);
        this.f212p0 = networkErrorFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        Intrinsics.checkNotNull(bool2);
        if (bool2.booleanValue()) {
            Bundle bundleBundleOf = BundleKt.bundleOf(TuplesKt.to(NetworkErrorFragment.IS_SUCCESS, Boolean.TRUE));
            NetworkErrorFragment networkErrorFragment = this.f212p0;
            FragmentKt.setFragmentResult(networkErrorFragment, NetworkErrorFragment.KEY_NETWORK_ERROR_FRAGMENT, bundleBundleOf);
            networkErrorFragment.dismiss();
        }
        return Unit.INSTANCE;
    }
}
