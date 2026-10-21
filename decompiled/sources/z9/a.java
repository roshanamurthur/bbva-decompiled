package z9;

import android.content.Context;
import com.bbva.glomohybrid.provider.AppDependenciesProvider;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends Lambda implements Function0<File> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Context f95013p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(0);
        this.f95013p0 = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        return AppDependenciesProvider.access$getFile(AppDependenciesProvider.INSTANCE, this.f95013p0);
    }
}
