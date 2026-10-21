package e;

import android.content.Context;
import com.visa.SensoryBrandingView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f68209a = new a();

    public a() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context ctx = (Context) obj;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return new SensoryBrandingView(ctx, null);
    }
}
