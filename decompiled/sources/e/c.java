package e;

import android.graphics.Color;
import com.visa.CheckmarkMode;
import com.visa.SensoryBrandingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f68211a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Function1 function1) {
        super(1);
        this.f68211a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SensoryBrandingView view = (SensoryBrandingView) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLanguageCode("en");
        view.setBackdropColor(Color.parseColor("#1434CB"));
        view.setSoundEnabled(true);
        view.setHapticEnabled(true);
        view.setCheckmarkMode(CheckmarkMode.CHECKMARK);
        view.animate(new b(this.f68211a));
        return Unit.INSTANCE;
    }
}
