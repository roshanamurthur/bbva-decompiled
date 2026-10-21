package com.bbva.glomohybrid.base.provider;

import androidx.lifecycle.LifecycleObserver;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: compiled from: ActivityDependenciesProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/base/provider/ActivityDependenciesProvider;", "Lorg/koin/core/component/KoinComponent;", "id", "", "getId", "()Ljava/lang/String;", "observers", "", "Landroidx/lifecycle/LifecycleObserver;", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ActivityDependenciesProvider extends KoinComponent {

    /* JADX INFO: compiled from: ActivityDependenciesProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static Koin getKoin(@NotNull ActivityDependenciesProvider activityDependenciesProvider) {
            return KoinComponent.DefaultImpls.getKoin(activityDependenciesProvider);
        }

        @NotNull
        public static List<LifecycleObserver> observers(@NotNull ActivityDependenciesProvider activityDependenciesProvider) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    String getId();

    @NotNull
    List<LifecycleObserver> observers();
}
