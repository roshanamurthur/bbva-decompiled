package c6;

import android.view.View;
import com.bbva.component.ui.welcome.pager.PageIndicator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: PageIndicator.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Lambda implements Function2<Integer, View, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ PageIndicator f25371p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PageIndicator pageIndicator) {
        super(2);
        this.f25371p0 = pageIndicator;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, View view) {
        int iIntValue = num.intValue();
        View view2 = view;
        Intrinsics.checkNotNullParameter(view2, "view");
        view2.setEnabled(this.f25371p0.getSelectedPage() == iIntValue);
        return Unit.INSTANCE;
    }
}
