package o1;

import android.os.Build;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StaticLayoutFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class f implements p {
    @Override // o1.p
    @DoNotInline
    @NotNull
    public StaticLayout a(@NotNull q params) {
        Intrinsics.checkNotNullParameter(params, "params");
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(params.f85245a, params.f85246b, params.f85247c, params.f85248d, params.f85249e);
        builderObtain.setTextDirection(params.f85250f);
        builderObtain.setAlignment(params.f85251g);
        builderObtain.setMaxLines(params.f85252h);
        builderObtain.setEllipsize(params.f85253i);
        builderObtain.setEllipsizedWidth(params.f85254j);
        builderObtain.setLineSpacing(params.f85256l, params.f85255k);
        builderObtain.setIncludePad(params.f85257n);
        builderObtain.setBreakStrategy(params.f85259p);
        builderObtain.setHyphenationFrequency(params.f85262s);
        builderObtain.setIndents(params.f85263t, params.f85264u);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            Intrinsics.checkNotNullExpressionValue(builderObtain, "this");
            g.a(builderObtain, params.m);
        }
        if (i10 >= 28) {
            Intrinsics.checkNotNullExpressionValue(builderObtain, "this");
            h.a(builderObtain, params.f85258o);
        }
        if (i10 >= 33) {
            Intrinsics.checkNotNullExpressionValue(builderObtain, "this");
            o.b(builderObtain, params.f85260q, params.f85261r);
        }
        StaticLayout staticLayoutBuild = builderObtain.build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "obtain(params.text, para…  }\n            }.build()");
        return staticLayoutBuild;
    }
}
