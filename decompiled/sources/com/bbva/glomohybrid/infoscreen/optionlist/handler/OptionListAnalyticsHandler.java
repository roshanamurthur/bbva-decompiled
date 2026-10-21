package com.bbva.glomohybrid.infoscreen.optionlist.handler;

import androidx.camera.core.imagecapture.a;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.infoscreen.optionlist.model.OptionData;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: OptionListAnalyticsHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/handler/OptionListAnalyticsHandler;", "", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "option", "", "trackEvent", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "Companion", "ItemsRoute", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nOptionListAnalyticsHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OptionListAnalyticsHandler.kt\ncom/bbva/glomohybrid/infoscreen/optionlist/handler/OptionListAnalyticsHandler\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,65:1\n56#2,6:66\n*S KotlinDebug\n*F\n+ 1 OptionListAnalyticsHandler.kt\ncom/bbva/glomohybrid/infoscreen/optionlist/handler/OptionListAnalyticsHandler\n*L\n12#1:66,6\n*E\n"})
public final class OptionListAnalyticsHandler {

    @NotNull
    public static final String AFFILIATE = "affiliate";

    @NotNull
    public static final String CALL_US = "callUs";

    @NotNull
    public static final String DIGITAL_ACTIVATION = "digitalActivation";

    @NotNull
    public static final String ID = "invalid-credentials";

    @NotNull
    public static final String KEY_RECOVERY = "keyRecovery";

    @NotNull
    public static final String RETRY = "retry";

    @NotNull
    public static final String WEB_VIEW = "webview";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f32427a;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 com.bbva.glomohybrid.infoscreen.optionlist.handler.OptionListAnalyticsHandler$ItemsRoute[], still in use, count: 1, list:
      (r12v3 com.bbva.glomohybrid.infoscreen.optionlist.handler.OptionListAnalyticsHandler$ItemsRoute[]) from 0x0067: INVOKE (r12v3 com.bbva.glomohybrid.infoscreen.optionlist.handler.OptionListAnalyticsHandler$ItemsRoute[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:104)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: OptionListAnalyticsHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/handler/OptionListAnalyticsHandler$ItemsRoute;", "", "", "actionName", "Ljava/lang/String;", "getActionName", "()Ljava/lang/String;", "KEY_RECOVERY", "DIGITAL_ACTIVATION", "AFFILIATE", "CALL_US", "WEB_VIEW", "RETRY", ExpectedUserActionOnPoiTypes.NONE, "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final class ItemsRoute {
        KEY_RECOVERY("keyRecovery"),
        DIGITAL_ACTIVATION("digitalActivation"),
        AFFILIATE(OptionListAnalyticsHandler.AFFILIATE),
        CALL_US(OptionListAnalyticsHandler.CALL_US),
        WEB_VIEW("webview"),
        RETRY(OptionListAnalyticsHandler.RETRY),
        NONE("none");

        private static final /* synthetic */ EnumEntries $ENTRIES;

        @NotNull
        private final String actionName;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(itemsRouteArr);
        }

        public ItemsRoute(String str) {
            super(str, i);
            this.actionName = str;
        }

        @NotNull
        public static EnumEntries<ItemsRoute> getEntries() {
            return $ENTRIES;
        }

        public static ItemsRoute valueOf(String str) {
            return (ItemsRoute) Enum.valueOf(ItemsRoute.class, str);
        }

        public static ItemsRoute[] values() {
            return (ItemsRoute[]) $VALUES.clone();
        }

        @NotNull
        public final String getActionName() {
            return this.actionName;
        }
    }

    /* JADX INFO: compiled from: OptionListAnalyticsHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionData.Type.values().length];
            try {
                iArr[OptionData.Type.NAVIGATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionData.Type.NAVIGATION_BUNDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionData.Type.APP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionData.Type.CLOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionData.Type.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionListAnalyticsHandler(@NotNull final ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f32427a = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<AnalyticsManager>() { // from class: com.bbva.glomohybrid.infoscreen.optionlist.handler.OptionListAnalyticsHandler$special$$inlined$inject$default$1
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
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    public final void trackEvent(@NotNull OptionData option) {
        ItemsRoute itemsRoute;
        String actionName;
        Intrinsics.checkNotNullParameter(option, "option");
        AnalyticsEvent analyticsEvent = AnalyticsEvent.LOGIN_CREDENTIALS_MULTIOPTION_ERROR;
        int i10 = WhenMappings.$EnumSwitchMapping$0[option.getType().ordinal()];
        if (i10 == 1 || i10 == 2) {
            String route = option.getRoute();
            if (route != null) {
                switch (route) {
                    case "keyRecovery":
                        itemsRoute = ItemsRoute.KEY_RECOVERY;
                        break;
                    case "digitalActivation":
                        itemsRoute = ItemsRoute.DIGITAL_ACTIVATION;
                        break;
                    case "retry":
                        itemsRoute = ItemsRoute.RETRY;
                        break;
                    case "webview":
                        itemsRoute = ItemsRoute.AFFILIATE;
                        break;
                    default:
                        itemsRoute = ItemsRoute.NONE;
                        break;
                }
            } else {
                itemsRoute = ItemsRoute.NONE;
            }
            actionName = itemsRoute.getActionName();
        } else if (i10 == 3) {
            actionName = ItemsRoute.CALL_US.getActionName();
        } else if (i10 == 4) {
            actionName = ItemsRoute.RETRY.getActionName();
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            actionName = ItemsRoute.NONE.getActionName();
        }
        analyticsEvent.putData(AnalyticsConstants.Key.ITEM, actionName);
        ((AnalyticsManager) this.f32427a.getValue()).trackEvent(analyticsEvent);
    }
}
