package l5;

import com.bbva.component.ui.loader.LoaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LoaderView.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LoaderView f83100p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LoaderView loaderView) {
        super(1);
        this.f83100p0 = loaderView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        LoaderView loaderView = this.f83100p0;
        loaderView.getBehavior().hideSecondaryMessage(loaderView.f28433q0);
        return Unit.INSTANCE;
    }
}
