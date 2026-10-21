package com.bbva.glomohybrid.landing.presentation.viewmodel.handler;

import androidx.appcompat.widget.g0;
import androidx.camera.core.imagecapture.a;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomoconfig.constants.GlobalAnalyticsConstants;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardButtonModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingShortcutItemModel;
import com.bbva.glomohybrid.landing.domain.model.LandingAppAccess;
import com.bbva.glomohybrid.landing.domain.model.LandingUserSegment;
import com.bbva.glomohybrid.landing.presentation.extensions.LandingMessageCardButtonModelExtensionsKt;
import com.bbva.glomohybrid.landing.presentation.extensions.LandingShortcutItemModelExtensionsKt;
import com.bbva.glomohybrid.landing.presentation.extensions.UserProfileExtensionsKt;
import com.bbva.glomohybrid.landing.presentation.model.LandingAnalyticLinkType;
import com.bbva.glomoutils.StringExtensionsKt;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.slidemenuview.cells.components.dm.infraestructure.MenuIdentifierMapper;
import com.bbva.ui.component.menu.model.MenuItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: LandingAnalyticsHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(JI\u0010\u000e\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00172\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010 \u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAnalyticsHandler;", "", "", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingShortcutItemModel;", "shortcuts", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardModel;", "sections", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "user", "Lcom/bbva/glomohybrid/landing/domain/model/LandingUserSegment;", "segment", "Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess;", "accessState", "", "trackPage", "(Ljava/util/List;Ljava/util/List;Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;Lcom/bbva/glomohybrid/landing/domain/model/LandingUserSegment;Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "flow", "trackFlow", "(Ljava/lang/String;Lcom/bbva/glomohybrid/landing/domain/model/LandingUserSegment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", AnalyticsConstants.Key.ITEM, "trackShortcutLink", "(Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingShortcutItemModel;Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;Lcom/bbva/glomohybrid/landing/domain/model/LandingUserSegment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ui/component/menu/model/MenuItem;", "trackMenuItemTap", "(Lcom/bbva/ui/component/menu/model/MenuItem;Lcom/bbva/glomohybrid/landing/domain/model/LandingUserSegment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackChangeUser", "(Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;Lcom/bbva/glomohybrid/landing/domain/model/LandingUserSegment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "action", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardButtonModel;", "button", "section", "trackSection", "(Ljava/lang/String;Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardButtonModel;Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardModel;Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;Lcom/bbva/glomohybrid/landing/domain/model/LandingUserSegment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackEcommerceLink", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingAnalyticsHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingAnalyticsHandler.kt\ncom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAnalyticsHandler\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,287:1\n56#2,6:288\n56#2,6:294\n1603#3,9:300\n1855#3:309\n1856#3:311\n1612#3:312\n1603#3,9:313\n1855#3:322\n1856#3:324\n1612#3:325\n766#3:326\n857#3,2:327\n1559#3:329\n1590#3,4:330\n1855#3,2:334\n1#4:310\n1#4:323\n1#4:350\n187#5,3:336\n125#5:346\n152#5,3:347\n215#5,2:351\n215#5,2:353\n526#6:339\n511#6,6:340\n*S KotlinDebug\n*F\n+ 1 LandingAnalyticsHandler.kt\ncom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAnalyticsHandler\n*L\n44#1:288,6\n45#1:294,6\n69#1:300,9\n69#1:309\n69#1:311\n69#1:312\n70#1:313,9\n70#1:322\n70#1:324\n70#1:325\n73#1:326\n73#1:327,2\n74#1:329\n74#1:330,4\n76#1:334,2\n69#1:310\n70#1:323\n80#1:336,3\n86#1:346\n86#1:347,3\n173#1:351,2\n222#1:353,2\n85#1:339\n85#1:340,6\n*E\n"})
public final class LandingAnalyticsHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f33245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f33246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f33247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f33248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f33249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f33250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f33251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f33252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f33253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f33254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f33255k;

    /* JADX INFO: compiled from: LandingAnalyticsHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LandingAnalyticLinkType.values().length];
            try {
                iArr[LandingAnalyticLinkType.EXTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LandingAnalyticLinkType.PUBLIC_INTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LandingAnalyticLinkType.PUBLIC_EXTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LandingAnalyticLinkType.INTERACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LandingAnalyticLinkType.PUBLIC_INTERACTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: LandingAnalyticsHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler", f = "LandingAnalyticsHandler.kt", i = {0, 0}, l = {188}, m = "trackChangeUser", n = {"this", "segment"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LandingAnalyticsHandler f33256p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public LandingUserSegment f33257q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f33258r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f33260t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33258r0 = obj;
            this.f33260t0 |= Integer.MIN_VALUE;
            return LandingAnalyticsHandler.this.trackChangeUser(null, null, this);
        }
    }

    /* JADX INFO: compiled from: LandingAnalyticsHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler$trackChangeUser$event$1", f = "LandingAnalyticsHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AnalyticsEvent>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ UserProfileConfiguration f33262q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UserProfileConfiguration userProfileConfiguration, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f33262q0 = userProfileConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LandingAnalyticsHandler.this.new b(this.f33262q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AnalyticsEvent> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LandingAnalyticsHandler landingAnalyticsHandler = LandingAnalyticsHandler.this;
            String str = landingAnalyticsHandler.f33251g;
            landingAnalyticsHandler.getClass();
            return LandingAnalyticsHandler.a(str, this.f33262q0, null);
        }
    }

    /* JADX INFO: compiled from: LandingAnalyticsHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler", f = "LandingAnalyticsHandler.kt", i = {0, 0}, l = {111}, m = "trackFlow", n = {"this", "segment"}, s = {"L$0", "L$1"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LandingAnalyticsHandler f33263p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public LandingUserSegment f33264q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f33265r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f33267t0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33265r0 = obj;
            this.f33267t0 |= Integer.MIN_VALUE;
            return LandingAnalyticsHandler.this.trackFlow(null, null, this);
        }
    }

    /* JADX INFO: compiled from: LandingAnalyticsHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler$trackFlow$event$1", f = "LandingAnalyticsHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AnalyticsEvent>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f33268p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LandingAnalyticsHandler f33269q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, LandingAnalyticsHandler landingAnalyticsHandler, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f33268p0 = str;
            this.f33269q0 = landingAnalyticsHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.f33268p0, this.f33269q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AnalyticsEvent> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String str = this.f33268p0;
            if (Intrinsics.areEqual(str, AnalyticsConstants.REGISTER_USER_CLICKED)) {
                return AnalyticsEvent.REGISTER_USER_CLICKED;
            }
            if (Intrinsics.areEqual(str, AnalyticsConstants.LANDING_ECOMMERCE_SETTINGS)) {
                return LandingAnalyticsHandler.access$createEcommerceSettingsEvent(this.f33269q0);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: LandingAnalyticsHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler", f = "LandingAnalyticsHandler.kt", i = {0, 0}, l = {178}, m = "trackMenuItemTap", n = {"this", "segment"}, s = {"L$0", "L$1"})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LandingAnalyticsHandler f33270p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public LandingUserSegment f33271q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f33272r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f33274t0;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33272r0 = obj;
            this.f33274t0 |= Integer.MIN_VALUE;
            return LandingAnalyticsHandler.this.trackMenuItemTap(null, null, this);
        }
    }

    /* JADX INFO: compiled from: LandingAnalyticsHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler$trackMenuItemTap$event$1", f = "LandingAnalyticsHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AnalyticsEvent>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MenuItem f33276q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MenuItem menuItem, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f33276q0 = menuItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LandingAnalyticsHandler.this.new f(this.f33276q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AnalyticsEvent> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String strStringIdentifier = LandingAnalyticsHandler.access$getMenuItemMapper(LandingAnalyticsHandler.this).stringIdentifier(this.f33276q0.getId());
            AnalyticsEvent analyticsEvent = AnalyticsEvent.MENU_ITEM_CLICKED;
            analyticsEvent.putData(AnalyticsConstants.Key.ITEM, strStringIdentifier);
            return analyticsEvent;
        }
    }

    /* JADX INFO: compiled from: LandingAnalyticsHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler", f = "LandingAnalyticsHandler.kt", i = {0, 0, 0, 0, 0}, l = {54}, m = "trackPage", n = {"this", "shortcuts", "sections", "segment", "accessState"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LandingAnalyticsHandler f33277p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public List f33278q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public List f33279r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public LandingUserSegment f33280s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public LandingAppAccess f33281t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public /* synthetic */ Object f33282u0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f33283w0;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33282u0 = obj;
            this.f33283w0 |= Integer.MIN_VALUE;
            return LandingAnalyticsHandler.this.trackPage(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: LandingAnalyticsHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler$trackPage$event$1", f = "LandingAnalyticsHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLandingAnalyticsHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingAnalyticsHandler.kt\ncom/bbva/glomohybrid/landing/presentation/viewmodel/handler/LandingAnalyticsHandler$trackPage$event$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,287:1\n1#2:288\n*E\n"})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AnalyticsEvent>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LandingAppAccess f33285q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ UserProfileConfiguration f33286r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LandingAppAccess landingAppAccess, UserProfileConfiguration userProfileConfiguration, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f33285q0 = landingAppAccess;
            this.f33286r0 = userProfileConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LandingAnalyticsHandler.this.new h(this.f33285q0, this.f33286r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AnalyticsEvent> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LandingAnalyticsHandler landingAnalyticsHandler = LandingAnalyticsHandler.this;
            LandingAppAccess landingAppAccess = this.f33285q0;
            AnalyticsEvent analyticsEventAccess$getCachedPageEvent = LandingAnalyticsHandler.access$getCachedPageEvent(landingAnalyticsHandler, landingAppAccess);
            if (this.f33286r0.getRememberedUser() == null) {
                analyticsEventAccess$getCachedPageEvent = null;
            }
            return analyticsEventAccess$getCachedPageEvent == null ? LandingAnalyticsHandler.access$getPublicPageEvent(landingAnalyticsHandler, landingAppAccess) : analyticsEventAccess$getCachedPageEvent;
        }
    }

    /* JADX INFO: compiled from: LandingAnalyticsHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler", f = "LandingAnalyticsHandler.kt", i = {0, 0}, l = {201}, m = "trackSection", n = {"this", "segment"}, s = {"L$0", "L$1"})
    public static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LandingAnalyticsHandler f33287p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public LandingUserSegment f33288q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f33289r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f33291t0;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33289r0 = obj;
            this.f33291t0 |= Integer.MIN_VALUE;
            return LandingAnalyticsHandler.this.trackSection(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: LandingAnalyticsHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler$trackSection$event$1", f = "LandingAnalyticsHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AnalyticsEvent>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LandingMessageCardButtonModel f33292p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f33293q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LandingMessageCardModel f33294r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ LandingAnalyticsHandler f33295s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ UserProfileConfiguration f33296t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(LandingMessageCardButtonModel landingMessageCardButtonModel, String str, LandingMessageCardModel landingMessageCardModel, LandingAnalyticsHandler landingAnalyticsHandler, UserProfileConfiguration userProfileConfiguration, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f33292p0 = landingMessageCardButtonModel;
            this.f33293q0 = str;
            this.f33294r0 = landingMessageCardModel;
            this.f33295s0 = landingAnalyticsHandler;
            this.f33296t0 = userProfileConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new j(this.f33292p0, this.f33293q0, this.f33294r0, this.f33295s0, this.f33296t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AnalyticsEvent> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LandingMessageCardButtonModel landingMessageCardButtonModelOrCloseAnalyticButton = LandingMessageCardButtonModelExtensionsKt.orCloseAnalyticButton(this.f33292p0, this.f33293q0);
            LandingMessageCardModel landingMessageCardModel = this.f33294r0;
            Map<String, String> analytics = landingMessageCardModel != null ? landingMessageCardModel.getAnalytics() : null;
            UserProfileConfiguration userProfileConfiguration = this.f33296t0;
            LandingAnalyticsHandler landingAnalyticsHandler = this.f33295s0;
            if (analytics != null) {
                return LandingAnalyticsHandler.access$getSectionCampaignEvent(landingAnalyticsHandler, landingMessageCardButtonModelOrCloseAnalyticButton, analytics, landingMessageCardModel.getCom.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper.EPI_CAMPAIGN_NAME java.lang.String() != null, userProfileConfiguration);
            }
            return LandingAnalyticsHandler.access$getSectionLinkEvent(landingAnalyticsHandler, landingMessageCardButtonModelOrCloseAnalyticButton, landingMessageCardModel, userProfileConfiguration);
        }
    }

    /* JADX INFO: compiled from: LandingAnalyticsHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler", f = "LandingAnalyticsHandler.kt", i = {0, 0}, l = {132}, m = "trackShortcutLink", n = {"this", "segment"}, s = {"L$0", "L$1"})
    public static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LandingAnalyticsHandler f33297p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public LandingUserSegment f33298q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f33299r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f33301t0;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33299r0 = obj;
            this.f33301t0 |= Integer.MIN_VALUE;
            return LandingAnalyticsHandler.this.trackShortcutLink(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: LandingAnalyticsHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler$trackShortcutLink$event$1", f = "LandingAnalyticsHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AnalyticsEvent>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LandingShortcutItemModel f33302p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LandingAnalyticsHandler f33303q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ UserProfileConfiguration f33304r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(LandingShortcutItemModel landingShortcutItemModel, LandingAnalyticsHandler landingAnalyticsHandler, UserProfileConfiguration userProfileConfiguration, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f33302p0 = landingShortcutItemModel;
            this.f33303q0 = landingAnalyticsHandler;
            this.f33304r0 = userProfileConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new l(this.f33302p0, this.f33303q0, this.f33304r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AnalyticsEvent> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LandingShortcutItemModel landingShortcutItemModel = this.f33302p0;
            if (landingShortcutItemModel == null) {
                return null;
            }
            Map<String, String> analytics = landingShortcutItemModel.getAnalytics();
            UserProfileConfiguration userProfileConfiguration = this.f33304r0;
            LandingAnalyticsHandler landingAnalyticsHandler = this.f33303q0;
            return analytics != null ? LandingAnalyticsHandler.access$getShortcutCampaignEvent(landingAnalyticsHandler, landingShortcutItemModel, userProfileConfiguration) : LandingAnalyticsHandler.access$getShortcutLinkEvent(landingAnalyticsHandler, landingShortcutItemModel, userProfileConfiguration);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LandingAnalyticsHandler(@NotNull final ViewModelComponentsProviders provider, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f33245a = dispatchers;
        this.f33246b = "_0";
        this.f33247c = "internalCampaign";
        this.f33248d = "landing";
        this.f33249e = "mensajes";
        this.f33250f = "ventas";
        this.f33251g = "click cambiar usuario";
        this.f33252h = "tarjetas ver datos y cvv";
        this.f33253i = "tarjetas configurar";
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f33254j = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<AnalyticsManager>() { // from class: com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.analytics.AnalyticsManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AnalyticsManager invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(AnalyticsManager.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f33255k = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<MenuIdentifierMapper>() { // from class: com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.slidemenuview.cells.components.dm.infraestructure.MenuIdentifierMapper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MenuIdentifierMapper invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(MenuIdentifierMapper.class), objArr2, objArr3);
            }
        });
    }

    public static AnalyticsEvent a(String str, UserProfileConfiguration userProfileConfiguration, LandingMessageCardButtonModel landingMessageCardButtonModel) {
        AnalyticsEvent analyticsEvent;
        int i10 = WhenMappings.$EnumSwitchMapping$0[LandingMessageCardButtonModelExtensionsKt.getAnalyticLinkType(landingMessageCardButtonModel, userProfileConfiguration).ordinal()];
        if (i10 == 1) {
            analyticsEvent = AnalyticsEvent.LANDING_EXTERNAL_LINK;
        } else if (i10 == 2) {
            analyticsEvent = AnalyticsEvent.LANDING_PUBLIC_LINK;
        } else if (i10 == 3) {
            analyticsEvent = AnalyticsEvent.LANDING_PUBLIC_EXTERNAL_LINK;
        } else if (i10 != 4) {
            analyticsEvent = i10 != 5 ? AnalyticsEvent.LANDING_LINK : AnalyticsEvent.LANDING_PUBLIC_INTERACTION_LINK;
        } else {
            analyticsEvent = AnalyticsEvent.LANDING_INTERACTION_LINK;
        }
        GlobalAnalyticsConstants globalAnalyticsConstants = GlobalAnalyticsConstants.INSTANCE;
        analyticsEvent.putData(AnalyticsConstants.Key.PROJECT_NAME, globalAnalyticsConstants.getPROJECT_NAME());
        analyticsEvent.putData(AnalyticsConstants.Key.SITE_APP_NAME, globalAnalyticsConstants.getSITE_APP());
        analyticsEvent.putData(AnalyticsConstants.Key.LINK_NAME, str);
        return analyticsEvent;
    }

    public static final AnalyticsEvent access$createEcommerceSettingsEvent(LandingAnalyticsHandler landingAnalyticsHandler) {
        landingAnalyticsHandler.getClass();
        AnalyticsEvent analyticsEvent = AnalyticsEvent.LANDING_ECOMMERCE_LINK;
        analyticsEvent.putData(AnalyticsConstants.Key.LINK_NAME, landingAnalyticsHandler.f33253i);
        return analyticsEvent;
    }

    public static final AnalyticsEvent access$getCachedPageEvent(LandingAnalyticsHandler landingAnalyticsHandler, LandingAppAccess landingAppAccess) {
        landingAnalyticsHandler.getClass();
        if (Intrinsics.areEqual(landingAppAccess, LandingAppAccess.Available.INSTANCE)) {
            return AnalyticsEvent.LANDING_SCREEN;
        }
        if (landingAppAccess instanceof LandingAppAccess.NotAvailable) {
            return AnalyticsEvent.LANDING_BLOCKED_SCREEN;
        }
        if (landingAppAccess instanceof LandingAppAccess.NotAvailableForUpdate) {
            return AnalyticsEvent.LANDING_FORCE_UPDATE_SCREEN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final MenuIdentifierMapper access$getMenuItemMapper(LandingAnalyticsHandler landingAnalyticsHandler) {
        return (MenuIdentifierMapper) landingAnalyticsHandler.f33255k.getValue();
    }

    public static final AnalyticsEvent access$getPublicPageEvent(LandingAnalyticsHandler landingAnalyticsHandler, LandingAppAccess landingAppAccess) {
        landingAnalyticsHandler.getClass();
        if (Intrinsics.areEqual(landingAppAccess, LandingAppAccess.Available.INSTANCE)) {
            return AnalyticsEvent.LANDING_PUBLIC_SCREEN;
        }
        if (landingAppAccess instanceof LandingAppAccess.NotAvailable) {
            return AnalyticsEvent.LANDING_PUBLIC_BLOCKED_SCREEN;
        }
        if (landingAppAccess instanceof LandingAppAccess.NotAvailableForUpdate) {
            return AnalyticsEvent.LANDING_PUBLIC_FORCE_UPDATE_SCREEN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AnalyticsEvent access$getSectionCampaignEvent(LandingAnalyticsHandler landingAnalyticsHandler, LandingMessageCardButtonModel landingMessageCardButtonModel, Map map, boolean z10, UserProfileConfiguration userProfileConfiguration) {
        landingAnalyticsHandler.getClass();
        AnalyticsEvent analyticsCampaignEvent = LandingMessageCardButtonModelExtensionsKt.getAnalyticsCampaignEvent(landingMessageCardButtonModel, z10, userProfileConfiguration);
        for (Map.Entry entry : map.entrySet()) {
            analyticsCampaignEvent.putData((String) entry.getKey(), (String) entry.getValue());
        }
        return analyticsCampaignEvent;
    }

    public static final AnalyticsEvent access$getSectionLinkEvent(LandingAnalyticsHandler landingAnalyticsHandler, LandingMessageCardButtonModel landingMessageCardButtonModel, LandingMessageCardModel landingMessageCardModel, UserProfileConfiguration userProfileConfiguration) {
        String title;
        String text;
        landingAnalyticsHandler.getClass();
        if (landingMessageCardModel == null || (title = landingMessageCardModel.getTitle()) == null || landingMessageCardButtonModel == null || (text = landingMessageCardButtonModel.getText()) == null) {
            return null;
        }
        String str = Intrinsics.areEqual(landingMessageCardModel.getType(), "MESSAGE") ? landingAnalyticsHandler.f33250f : null;
        if (str == null) {
            str = landingAnalyticsHandler.f33249e;
        }
        String lowerCase = StringExtensionsKt.normalize(StringsKt__StringsKt.trim((CharSequence) (str + " " + text + " " + title)).toString()).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return a(StringExtensionsKt.removeExtraBlankChars(StringExtensionsKt.removeSpecialCharacters(lowerCase)), userProfileConfiguration, landingMessageCardButtonModel);
    }

    public static final AnalyticsEvent access$getShortcutCampaignEvent(LandingAnalyticsHandler landingAnalyticsHandler, LandingShortcutItemModel landingShortcutItemModel, UserProfileConfiguration userProfileConfiguration) {
        AnalyticsEvent landingCampaignEvent;
        landingAnalyticsHandler.getClass();
        boolean z10 = landingShortcutItemModel.getCom.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper.EPI_CAMPAIGN_NAME java.lang.String() != null;
        if (z10) {
            landingCampaignEvent = UserProfileExtensionsKt.getLandingStartCampaignEvent(userProfileConfiguration);
        } else {
            if (z10) {
                throw new NoWhenBranchMatchedException();
            }
            landingCampaignEvent = UserProfileExtensionsKt.getLandingCampaignEvent(userProfileConfiguration);
        }
        Map<String, String> analytics = landingShortcutItemModel.getAnalytics();
        if (analytics != null) {
            for (Map.Entry<String, String> entry : analytics.entrySet()) {
                landingCampaignEvent.putData(entry.getKey(), entry.getValue());
            }
        }
        return landingCampaignEvent;
    }

    public static final AnalyticsEvent access$getShortcutLinkEvent(LandingAnalyticsHandler landingAnalyticsHandler, LandingShortcutItemModel landingShortcutItemModel, UserProfileConfiguration userProfileConfiguration) {
        AnalyticsEvent analyticsEvent;
        landingAnalyticsHandler.getClass();
        String lowerCase = StringExtensionsKt.normalize(StringsKt__StringsKt.trim((CharSequence) landingShortcutItemModel.getText()).toString()).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String strC = androidx.collection.f.c(new StringBuilder(), landingAnalyticsHandler.f33248d, " ", StringExtensionsKt.removeExtraBlankChars(StringExtensionsKt.removeSpecialCharacters(lowerCase)));
        int i10 = WhenMappings.$EnumSwitchMapping$0[LandingShortcutItemModelExtensionsKt.getAnalyticLinkType(landingShortcutItemModel, userProfileConfiguration).ordinal()];
        if (i10 == 1) {
            analyticsEvent = AnalyticsEvent.LANDING_EXTERNAL_SHORTCUT_LINK;
        } else if (i10 != 2) {
            analyticsEvent = i10 != 3 ? AnalyticsEvent.LANDING_SHORTCUT_LINK : AnalyticsEvent.LANDING_PUBLIC_EXTERNAL_SHORTCUT_LINK;
        } else {
            analyticsEvent = AnalyticsEvent.LANDING_PUBLIC_SHORTCUT_LINK;
        }
        analyticsEvent.putData(AnalyticsConstants.Key.LINK_NAME, strC);
        return analyticsEvent;
    }

    public final void b(AnalyticsEvent analyticsEvent, LandingUserSegment landingUserSegment) {
        String description;
        if (analyticsEvent == null) {
            return;
        }
        if (landingUserSegment != null && (description = landingUserSegment.getDescription()) != null) {
            analyticsEvent.putData(AnalyticsConstants.Key.SEGMENT_DESCRIPTION, description);
        }
        ((AnalyticsManager) this.f33254j.getValue()).trackEvent(analyticsEvent);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object trackChangeUser(@NotNull UserProfileConfiguration userProfileConfiguration, @Nullable LandingUserSegment landingUserSegment, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        LandingAnalyticsHandler landingAnalyticsHandler;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f33260t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f33260t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.f33258r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f33260t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher coroutineDispatcherMo4923default = this.f33245a.mo4923default();
            b bVar = new b(userProfileConfiguration, null);
            aVar.f33256p0 = this;
            aVar.f33257q0 = landingUserSegment;
            aVar.f33260t0 = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherMo4923default, bVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            landingAnalyticsHandler = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            landingUserSegment = aVar.f33257q0;
            landingAnalyticsHandler = aVar.f33256p0;
            ResultKt.throwOnFailure(objWithContext);
        }
        landingAnalyticsHandler.b((AnalyticsEvent) objWithContext, landingUserSegment);
        return Unit.INSTANCE;
    }

    public final void trackEcommerceLink(@Nullable LandingUserSegment segment) {
        AnalyticsEvent analyticsEvent = AnalyticsEvent.LANDING_ECOMMERCE_LINK;
        analyticsEvent.putData(AnalyticsConstants.Key.LINK_NAME, this.f33252h);
        b(analyticsEvent, segment);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object trackFlow(@NotNull String str, @Nullable LandingUserSegment landingUserSegment, @NotNull Continuation<? super Unit> continuation) {
        c cVar;
        LandingAnalyticsHandler landingAnalyticsHandler;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f33267t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f33267t0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objWithContext = cVar.f33265r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f33267t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher coroutineDispatcherMo4923default = this.f33245a.mo4923default();
            d dVar = new d(str, this, null);
            cVar.f33263p0 = this;
            cVar.f33264q0 = landingUserSegment;
            cVar.f33267t0 = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherMo4923default, dVar, cVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            landingAnalyticsHandler = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            landingUserSegment = cVar.f33264q0;
            landingAnalyticsHandler = cVar.f33263p0;
            ResultKt.throwOnFailure(objWithContext);
        }
        landingAnalyticsHandler.b((AnalyticsEvent) objWithContext, landingUserSegment);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object trackMenuItemTap(@NotNull MenuItem menuItem, @Nullable LandingUserSegment landingUserSegment, @NotNull Continuation<? super Unit> continuation) {
        e eVar;
        LandingAnalyticsHandler landingAnalyticsHandler;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f33274t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f33274t0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objWithContext = eVar.f33272r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f33274t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher coroutineDispatcherMo4923default = this.f33245a.mo4923default();
            f fVar = new f(menuItem, null);
            eVar.f33270p0 = this;
            eVar.f33271q0 = landingUserSegment;
            eVar.f33274t0 = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherMo4923default, fVar, eVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            landingAnalyticsHandler = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            landingUserSegment = eVar.f33271q0;
            landingAnalyticsHandler = eVar.f33270p0;
            ResultKt.throwOnFailure(objWithContext);
        }
        landingAnalyticsHandler.b((AnalyticsEvent) objWithContext, landingUserSegment);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object trackPage(@NotNull List<LandingShortcutItemModel> list, @NotNull List<LandingMessageCardModel> list2, @NotNull UserProfileConfiguration userProfileConfiguration, @Nullable LandingUserSegment landingUserSegment, @NotNull LandingAppAccess landingAppAccess, @NotNull Continuation<? super Unit> continuation) {
        g gVar;
        List<LandingMessageCardModel> list3;
        LandingAnalyticsHandler landingAnalyticsHandler;
        LandingUserSegment landingUserSegment2;
        List<LandingShortcutItemModel> list4;
        String str;
        LandingAppAccess landingAppAccess2 = landingAppAccess;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i10 = gVar.f33283w0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f33283w0 = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objWithContext = gVar.f33282u0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = gVar.f33283w0;
        Object obj = null;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher coroutineDispatcherMo4923default = this.f33245a.mo4923default();
            h hVar = new h(landingAppAccess2, userProfileConfiguration, null);
            gVar.f33277p0 = this;
            gVar.f33278q0 = list;
            gVar.f33279r0 = list2;
            gVar.f33280s0 = landingUserSegment;
            gVar.f33281t0 = landingAppAccess2;
            gVar.f33283w0 = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherMo4923default, hVar, gVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            list3 = list2;
            landingAnalyticsHandler = this;
            landingUserSegment2 = landingUserSegment;
            list4 = list;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            landingAppAccess2 = gVar.f33281t0;
            landingUserSegment2 = gVar.f33280s0;
            list3 = gVar.f33279r0;
            list4 = gVar.f33278q0;
            landingAnalyticsHandler = gVar.f33277p0;
            ResultKt.throwOnFailure(objWithContext);
        }
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) objWithContext;
        landingAnalyticsHandler.getClass();
        if (Intrinsics.areEqual(landingAppAccess2, LandingAppAccess.Available.INSTANCE)) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                Map<String, String> analytics = ((LandingShortcutItemModel) it.next()).getAnalytics();
                if (analytics != null) {
                    arrayList.add(analytics);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                Map<String, String> analytics2 = ((LandingMessageCardModel) it2.next()).getAnalytics();
                if (analytics2 != null) {
                    arrayList2.add(analytics2);
                }
            }
            int i12 = 2;
            List listFlatten = CollectionsKt__IterablesKt.flatten(CollectionsKt__CollectionsKt.listOf((Object[]) new List[]{arrayList, arrayList2}));
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = listFlatten.iterator();
            while (true) {
                boolean zHasNext = it3.hasNext();
                str = landingAnalyticsHandler.f33247c;
                if (!zHasNext) {
                    break;
                }
                Object next = it3.next();
                Map map = (Map) next;
                if (!map.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (StringsKt__StringsKt.contains$default((CharSequence) entry.getKey(), (CharSequence) str, false, 2, (Object) null) && (!kotlin.text.l.isBlank((CharSequence) entry.getValue()))) {
                            arrayList3.add(next);
                            break;
                        }
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            int i13 = 0;
            for (Object obj2 : arrayList3) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry2 : ((Map) obj2).entrySet()) {
                    if (StringsKt__StringsKt.contains$default((CharSequence) entry2.getKey(), (CharSequence) str, false, i12, obj)) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                    arrayList5.add(new Pair(kotlin.text.l.replace$default((String) entry3.getKey(), landingAnalyticsHandler.f33246b, g0.c(PushConstants.GE_PARAMS_SEPARATOR, i13), false, 4, (Object) null), entry3.getValue()));
                }
                arrayList4.add(arrayList5);
                i13 = i14;
                i12 = 2;
                obj = null;
            }
            for (Pair pair : CollectionsKt__IterablesKt.flatten(arrayList4)) {
                analyticsEvent.putData((String) pair.getFirst(), (String) pair.getSecond());
            }
        }
        landingAnalyticsHandler.b(analyticsEvent, landingUserSegment2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object trackSection(@NotNull String str, @Nullable LandingMessageCardButtonModel landingMessageCardButtonModel, @Nullable LandingMessageCardModel landingMessageCardModel, @NotNull UserProfileConfiguration userProfileConfiguration, @Nullable LandingUserSegment landingUserSegment, @NotNull Continuation<? super Unit> continuation) {
        i iVar;
        LandingUserSegment landingUserSegment2;
        Object objWithContext;
        LandingAnalyticsHandler landingAnalyticsHandler;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i10 = iVar.f33291t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f33291t0 = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        i iVar2 = iVar;
        Object obj = iVar2.f33289r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = iVar2.f33291t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher coroutineDispatcherMo4923default = this.f33245a.mo4923default();
            j jVar = new j(landingMessageCardButtonModel, str, landingMessageCardModel, this, userProfileConfiguration, null);
            iVar2.f33287p0 = this;
            landingUserSegment2 = landingUserSegment;
            iVar2.f33288q0 = landingUserSegment2;
            iVar2.f33291t0 = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherMo4923default, jVar, iVar2);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            landingAnalyticsHandler = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LandingUserSegment landingUserSegment3 = iVar2.f33288q0;
            landingAnalyticsHandler = iVar2.f33287p0;
            ResultKt.throwOnFailure(obj);
            objWithContext = obj;
            landingUserSegment2 = landingUserSegment3;
        }
        landingAnalyticsHandler.b((AnalyticsEvent) objWithContext, landingUserSegment2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object trackShortcutLink(@Nullable LandingShortcutItemModel landingShortcutItemModel, @NotNull UserProfileConfiguration userProfileConfiguration, @Nullable LandingUserSegment landingUserSegment, @NotNull Continuation<? super Unit> continuation) {
        k kVar;
        LandingAnalyticsHandler landingAnalyticsHandler;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i10 = kVar.f33301t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f33301t0 = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object objWithContext = kVar.f33299r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = kVar.f33301t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher coroutineDispatcherMo4923default = this.f33245a.mo4923default();
            l lVar = new l(landingShortcutItemModel, this, userProfileConfiguration, null);
            kVar.f33297p0 = this;
            kVar.f33298q0 = landingUserSegment;
            kVar.f33301t0 = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherMo4923default, lVar, kVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            landingAnalyticsHandler = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            landingUserSegment = kVar.f33298q0;
            landingAnalyticsHandler = kVar.f33297p0;
            ResultKt.throwOnFailure(objWithContext);
        }
        landingAnalyticsHandler.b((AnalyticsEvent) objWithContext, landingUserSegment);
        return Unit.INSTANCE;
    }

    public /* synthetic */ LandingAnalyticsHandler(ViewModelComponentsProviders viewModelComponentsProviders, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelComponentsProviders, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
