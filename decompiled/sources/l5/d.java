package l5;

import com.bbva.component.ui.loader.LoaderView;
import com.bbva.component.ui.loader.behavior.ViewBehavior;
import com.bbva.component.ui.loader.config.ViewConfiguration;
import com.bbva.component.ui.loader.databinding.LayoutLoaderviewBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LoaderView.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LoaderView f83096p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LoaderView loaderView) {
        super(1);
        this.f83096p0 = loaderView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        LoaderView loaderView = this.f83096p0;
        ViewBehavior behavior = loaderView.getBehavior();
        LayoutLoaderviewBinding layoutLoaderviewBinding = loaderView.f28433q0;
        ViewConfiguration viewConfiguration = loaderView.f28436t0;
        Intrinsics.checkNotNull(str2);
        behavior.nextStep(layoutLoaderviewBinding, viewConfiguration, str2);
        return Unit.INSTANCE;
    }
}
