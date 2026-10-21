package m7;

import android.content.Context;
import android.content.pm.ProviderInfo;
import com.bbva.ethermobilesdk.securesharing.extension.LoggerKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Provider.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final c f83364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f83365b;

    public c(@Nullable c cVar) {
        this.f83364a = cVar;
    }

    @Nullable
    public final List<ProviderInfo> a(@NotNull Context context) {
        c cVar = this.f83364a;
        Intrinsics.checkNotNullParameter(context, "context");
        List<ProviderInfo> listA = null;
        try {
            if (!this.f83365b) {
                listA = b(context);
            } else if (cVar != null) {
                listA = cVar.a(context);
            }
            return listA;
        } catch (Exception e5) {
            LoggerKt.logError("Could not list content providers", e5);
            this.f83365b = true;
            return cVar == null ? listA : cVar.b(context);
        }
    }

    @NotNull
    public abstract List<ProviderInfo> b(@NotNull Context context);
}
