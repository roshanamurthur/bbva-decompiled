package com.bbva.glomohybrid.behaviours;

import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomo.user.domain.usecase.GetRememberedUserUseCase;
import com.bbva.glomohybrid.base.behaviors.ChangeUserBehavior;
import com.bbva.glomohybrid.base.delegates.glomo.features.ActiveUserFeaturesDelegate;
import com.bbva.glomohybrid.base.delegates.glomo.features.GlomoFeature;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.Iterator;
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

/* JADX INFO: compiled from: CountryChangeUserBehavior.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/behaviours/CountryChangeUserBehavior;", "Lcom/bbva/glomohybrid/base/behaviors/ChangeUserBehavior;", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", Scopes.PROFILE, "Lcom/bbva/glomohybrid/base/models/ModalType;", "compute", "(Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/base/delegates/glomo/features/ActiveUserFeaturesDelegate;", "activeUserFeaturesDelegate", "Lcom/bbva/glomo/user/domain/usecase/GetRememberedUserUseCase;", "getRememberedUserUseCase", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/glomohybrid/base/delegates/glomo/features/ActiveUserFeaturesDelegate;Lcom/bbva/glomo/user/domain/usecase/GetRememberedUserUseCase;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class CountryChangeUserBehavior implements ChangeUserBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ActiveUserFeaturesDelegate f31620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final GetRememberedUserUseCase f31621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f31622c;

    /* JADX INFO: compiled from: CountryChangeUserBehavior.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.behaviours.CountryChangeUserBehavior$compute$2", f = "CountryChangeUserBehavior.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCountryChangeUserBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryChangeUserBehavior.kt\ncom/bbva/glomohybrid/behaviours/CountryChangeUserBehavior$compute$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1549#2:33\n1620#2,3:34\n*S KotlinDebug\n*F\n+ 1 CountryChangeUserBehavior.kt\ncom/bbva/glomohybrid/behaviours/CountryChangeUserBehavior$compute$2\n*L\n24#1:33\n24#1:34,3\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ModalType>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ UserProfileConfiguration f31624q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UserProfileConfiguration userProfileConfiguration, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f31624q0 = userProfileConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CountryChangeUserBehavior.this.new a(this.f31624q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ModalType> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CountryChangeUserBehavior countryChangeUserBehavior = CountryChangeUserBehavior.this;
            ActiveUserFeaturesDelegate activeUserFeaturesDelegate = countryChangeUserBehavior.f31620a;
            UserProfileConfiguration userProfileConfiguration = this.f31624q0;
            if (!activeUserFeaturesDelegate.isAnyFeatureActive(userProfileConfiguration)) {
                return new ModalType.ChangeUser(userProfileConfiguration.getName(), false, 2, null);
            }
            String name = userProfileConfiguration.getName();
            if (name != null) {
                str = name;
            } else {
                RememberedUser rememberedUserExecute = countryChangeUserBehavior.f31621b.execute();
                String username = rememberedUserExecute != null ? rememberedUserExecute.getUsername() : null;
                if (username == null) {
                    name = "";
                    str = name;
                } else {
                    str = username;
                }
            }
            List<GlomoFeature> activeFeatures = countryChangeUserBehavior.f31620a.getActiveFeatures(userProfileConfiguration);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(activeFeatures, 10));
            Iterator<T> it = activeFeatures.iterator();
            while (it.hasNext()) {
                arrayList.add(((GlomoFeature) it.next()).getShortDescription());
            }
            return new ModalType.ChangeUserWithFeaturesList(str, arrayList, false, 4, null);
        }
    }

    public CountryChangeUserBehavior(@NotNull ActiveUserFeaturesDelegate activeUserFeaturesDelegate, @NotNull GetRememberedUserUseCase getRememberedUserUseCase, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(activeUserFeaturesDelegate, "activeUserFeaturesDelegate");
        Intrinsics.checkNotNullParameter(getRememberedUserUseCase, "getRememberedUserUseCase");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f31620a = activeUserFeaturesDelegate;
        this.f31621b = getRememberedUserUseCase;
        this.f31622c = dispatchers;
    }

    @Override // com.bbva.glomohybrid.base.behaviors.ChangeUserBehavior
    @Nullable
    public Object compute(@NotNull UserProfileConfiguration userProfileConfiguration, @NotNull Continuation<? super ModalType> continuation) {
        return BuildersKt.withContext(this.f31622c.io(), new a(userProfileConfiguration, null), continuation);
    }

    public /* synthetic */ CountryChangeUserBehavior(ActiveUserFeaturesDelegate activeUserFeaturesDelegate, GetRememberedUserUseCase getRememberedUserUseCase, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(activeUserFeaturesDelegate, getRememberedUserUseCase, (i10 & 4) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
