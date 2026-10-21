package a;

import com.visa.SensoryBrandingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class mast2 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SensoryBrandingView f116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f117b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mast2(SensoryBrandingView sensoryBrandingView, Function1 function1) {
        super(0);
        this.f116a = sensoryBrandingView;
        this.f117b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f116a.f68007p.set(false);
        this.f117b.invoke(null);
        return Unit.INSTANCE;
    }
}
