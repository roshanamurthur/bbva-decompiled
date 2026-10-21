package com.bbva.glomohybrid.featureflags;

import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.glomohybrid.featureflags.domain.model.MenuDataModel;
import com.bbva.glomohybrid.featureflags.domain.model.MenuItemDataModel;
import com.bbva.glomohybrid.featureflags.domain.observer.FeatureFlagsObserver;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.slidemenuview.domain.model.MenuItemSpec;
import com.bbva.slidemenuview.domain.model.MenuItems;
import com.bbva.slidemenuview.domain.usecase.SyncMenuItemsUseCase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FeatureFlagsMenuObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/featureflags/FeatureFlagsMenuObserver;", "Lcom/bbva/glomohybrid/featureflags/domain/observer/FeatureFlagsObserver;", "Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;", "featureFlags", "", "onReceive", "(Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/slidemenuview/domain/usecase/SyncMenuItemsUseCase;", "syncMenuItemsUseCase", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatcher", "<init>", "(Lcom/bbva/slidemenuview/domain/usecase/SyncMenuItemsUseCase;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFeatureFlagsMenuObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureFlagsMenuObserver.kt\ncom/bbva/glomohybrid/featureflags/FeatureFlagsMenuObserver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1549#2:37\n1620#2,2:38\n1549#2:40\n1620#2,3:41\n1622#2:44\n*S KotlinDebug\n*F\n+ 1 FeatureFlagsMenuObserver.kt\ncom/bbva/glomohybrid/featureflags/FeatureFlagsMenuObserver\n*L\n26#1:37\n26#1:38,2\n29#1:40\n29#1:41,3\n26#1:44\n*E\n"})
public final class FeatureFlagsMenuObserver implements FeatureFlagsObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SyncMenuItemsUseCase f32125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f32126b;

    /* JADX INFO: compiled from: FeatureFlagsMenuObserver.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.featureflags.FeatureFlagsMenuObserver$onReceive$2", f = "FeatureFlagsMenuObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FeatureFlags f32127p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FeatureFlagsMenuObserver f32128q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FeatureFlags featureFlags, FeatureFlagsMenuObserver featureFlagsMenuObserver, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f32127p0 = featureFlags;
            this.f32128q0 = featureFlagsMenuObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f32127p0, this.f32128q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            FeatureFlags featureFlags = this.f32127p0;
            if (featureFlags != null) {
                FeatureFlagsMenuObserver featureFlagsMenuObserver = this.f32128q0;
                featureFlagsMenuObserver.f32125a.execute2(FeatureFlagsMenuObserver.access$mapMenus(featureFlagsMenuObserver, featureFlags.getMenuItems()));
            }
            return Unit.INSTANCE;
        }
    }

    public FeatureFlagsMenuObserver(@NotNull SyncMenuItemsUseCase syncMenuItemsUseCase, @NotNull ThreadDispatchers dispatcher) {
        Intrinsics.checkNotNullParameter(syncMenuItemsUseCase, "syncMenuItemsUseCase");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f32125a = syncMenuItemsUseCase;
        this.f32126b = dispatcher;
    }

    public static final List access$mapMenus(FeatureFlagsMenuObserver featureFlagsMenuObserver, List list) {
        featureFlagsMenuObserver.getClass();
        List<MenuDataModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (MenuDataModel menuDataModel : list2) {
            List<String> android2 = menuDataModel.getAndroid();
            List<MenuItemDataModel> items = menuDataModel.getItems();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
            for (MenuItemDataModel menuItemDataModel : items) {
                arrayList2.add(new MenuItemSpec(menuItemDataModel.getId(), menuItemDataModel.isEnabled(), menuItemDataModel.isFeatured(), menuItemDataModel.isHidden(), false, 16, null));
            }
            arrayList.add(new MenuItems(android2, arrayList2));
        }
        return arrayList;
    }

    @Override // com.bbva.glomohybrid.featureflags.domain.observer.FeatureFlagsObserver
    @Nullable
    public Object onReceive(@Nullable FeatureFlags featureFlags, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.f32126b.io(), new a(featureFlags, this, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public /* synthetic */ FeatureFlagsMenuObserver(SyncMenuItemsUseCase syncMenuItemsUseCase, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(syncMenuItemsUseCase, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
