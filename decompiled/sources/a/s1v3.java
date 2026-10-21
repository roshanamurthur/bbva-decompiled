package a;

import android.content.Context;
import com.visa.SensoryBrandingView;
import com.visa.internal.CheckmarkElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class s1v3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SensoryBrandingView f137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f138b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1v3(SensoryBrandingView sensoryBrandingView, Function1 function1) {
        super(0);
        this.f137a = sensoryBrandingView;
        this.f138b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CheckmarkElement checkmarkElement = this.f137a.f68004l;
        Context context = this.f137a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        checkmarkElement.a(context, new mast2(this.f137a, this.f138b));
        return Unit.INSTANCE;
    }
}
