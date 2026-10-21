package c6;

import com.bbva.component.ui.welcome.pager.WelcomePager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WelcomePager.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function0 f25376p0;

    public d(WelcomePager.b bVar) {
        this.f25376p0 = bVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        Intrinsics.checkNotNullExpressionValue(this.f25376p0.invoke(), "invoke(...)");
    }
}
