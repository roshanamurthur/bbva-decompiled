package com.bbva.glomohybrid.analytics;

import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.slidemenuview.cells.components.dm.infraestructure.DefaultMenuIdentifierMapper;
import com.bbva.slidemenuview.cells.components.dm.infraestructure.MenuIdentifierMapper;
import com.bbva.slidemenuview.domain.model.MenuClickAction;
import com.bbva.slidemenuview.presentation.interceptor.ClickInterceptor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnalyticsClickInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB)\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/analytics/AnalyticsClickInterceptor;", "Lcom/bbva/slidemenuview/presentation/interceptor/ClickInterceptor;", "Lcom/bbva/slidemenuview/domain/model/MenuClickAction;", "menuClickAction", "", "interceptClick", "Lcom/bbva/component/dm/analytics/AnalyticsManager;", "analyticsManager", "", "", "menuIds", "Lcom/bbva/slidemenuview/cells/components/dm/infraestructure/MenuIdentifierMapper;", "identifierMapper", "<init>", "(Lcom/bbva/component/dm/analytics/AnalyticsManager;Ljava/util/List;Lcom/bbva/slidemenuview/cells/components/dm/infraestructure/MenuIdentifierMapper;)V", "Companion", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAnalyticsClickInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsClickInterceptor.kt\ncom/bbva/glomohybrid/analytics/AnalyticsClickInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
public final class AnalyticsClickInterceptor implements ClickInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AnalyticsManager f31011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<Integer> f31012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MenuIdentifierMapper f31013c;

    public AnalyticsClickInterceptor(@NotNull AnalyticsManager analyticsManager, @NotNull List<Integer> menuIds, @NotNull MenuIdentifierMapper identifierMapper) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(menuIds, "menuIds");
        Intrinsics.checkNotNullParameter(identifierMapper, "identifierMapper");
        this.f31011a = analyticsManager;
        this.f31012b = menuIds;
        this.f31013c = identifierMapper;
    }

    @Override // com.bbva.slidemenuview.presentation.interceptor.ClickInterceptor
    public void interceptClick(@NotNull MenuClickAction menuClickAction) {
        Intrinsics.checkNotNullParameter(menuClickAction, "menuClickAction");
        ClickInterceptor.DefaultImpls.interceptClick(this, menuClickAction);
        if (this.f31012b.contains(Integer.valueOf(menuClickAction.getId()))) {
            String strStringIdentifier = this.f31013c.stringIdentifier(menuClickAction.getId());
            if (strStringIdentifier.length() <= 0) {
                strStringIdentifier = null;
            }
            if (strStringIdentifier != null) {
                AnalyticsEvent analyticsEvent = AnalyticsEvent.MENU_ITEM_CLICKED;
                analyticsEvent.putData(AnalyticsConstants.Key.ITEM, strStringIdentifier);
                this.f31011a.trackEvent(analyticsEvent);
            }
        }
    }

    public /* synthetic */ AnalyticsClickInterceptor(AnalyticsManager analyticsManager, List list, MenuIdentifierMapper menuIdentifierMapper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(analyticsManager, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? new DefaultMenuIdentifierMapper() : menuIdentifierMapper);
    }
}
