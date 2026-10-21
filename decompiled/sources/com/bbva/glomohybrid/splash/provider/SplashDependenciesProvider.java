package com.bbva.glomohybrid.splash.provider;

import androidx.lifecycle.LifecycleObserver;
import com.bbva.glomohybrid.base.provider.ActivityDependenciesProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;

/* JADX INFO: compiled from: SplashDependenciesProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/splash/provider/SplashDependenciesProvider;", "Lcom/bbva/glomohybrid/base/provider/ActivityDependenciesProvider;", "", "p0", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "<init>", "(Ljava/lang/String;)V", "Companion", "Splash_mexicoProdRelease"}, k = 1, mv = {1, 9, 0})
public final class SplashDependenciesProvider implements ActivityDependenciesProvider {

    @NotNull
    public static final String ID = "splash-dependencies-provider";

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX WARN: Multi-variable type inference failed */
    public SplashDependenciesProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.bbva.glomohybrid.base.provider.ActivityDependenciesProvider
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return ActivityDependenciesProvider.DefaultImpls.getKoin(this);
    }

    @Override // com.bbva.glomohybrid.base.provider.ActivityDependenciesProvider
    @NotNull
    public List<LifecycleObserver> observers() {
        return ActivityDependenciesProvider.DefaultImpls.observers(this);
    }

    public SplashDependenciesProvider(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
    }

    public /* synthetic */ SplashDependenciesProvider(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ID : str);
    }
}
