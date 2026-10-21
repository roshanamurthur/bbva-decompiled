package com.bbva.glomohybrid.interceptors;

import bk.q;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.constants.NativeClickConstants;
import com.bbva.slidemenuview.cells.components.dm.infraestructure.DefaultMenuIdentifierMapper;
import com.bbva.slidemenuview.cells.components.dm.infraestructure.MenuIdentifierMapper;
import com.bbva.slidemenuview.domain.model.MenuClickAction;
import com.bbva.slidemenuview.presentation.interceptor.ClickInterceptor;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MenuItemClickInterceptor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/interceptors/MenuItemClickInterceptor;", "Lcom/bbva/slidemenuview/presentation/interceptor/ClickInterceptor;", "Lcom/bbva/slidemenuview/domain/model/MenuClickAction;", "menuClickAction", "", "interceptClick", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "webDispatcher", "Lcom/bbva/slidemenuview/cells/components/dm/infraestructure/MenuIdentifierMapper;", "identifierMapper", "<init>", "(Lcom/bbva/bridge/dispatcher/MessageDispatcher;Lcom/bbva/slidemenuview/cells/components/dm/infraestructure/MenuIdentifierMapper;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMenuItemClickInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuItemClickInterceptor.kt\ncom/bbva/glomohybrid/interceptors/MenuItemClickInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class MenuItemClickInterceptor implements ClickInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final MessageDispatcher f32515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MenuIdentifierMapper f32516b;

    public MenuItemClickInterceptor(@Nullable MessageDispatcher messageDispatcher, @NotNull MenuIdentifierMapper identifierMapper) {
        Intrinsics.checkNotNullParameter(identifierMapper, "identifierMapper");
        this.f32515a = messageDispatcher;
        this.f32516b = identifierMapper;
    }

    @Override // com.bbva.slidemenuview.presentation.interceptor.ClickInterceptor
    public void interceptClick(@NotNull MenuClickAction menuClickAction) {
        MessageDispatcher messageDispatcher;
        Intrinsics.checkNotNullParameter(menuClickAction, "menuClickAction");
        ClickInterceptor.DefaultImpls.interceptClick(this, menuClickAction);
        String strStringIdentifier = this.f32516b.stringIdentifier(menuClickAction.getId());
        if (strStringIdentifier.length() <= 0) {
            strStringIdentifier = null;
        }
        if (strStringIdentifier == null || (messageDispatcher = this.f32515a) == null) {
            return;
        }
        messageDispatcher.sendMessage(CellsChannels.NATIVE_CLICK_EVENT, q.mapOf(TuplesKt.to("id", strStringIdentifier), TuplesKt.to("page", NativeClickConstants.SIDEBAR_PRIVATE)));
    }

    public /* synthetic */ MenuItemClickInterceptor(MessageDispatcher messageDispatcher, MenuIdentifierMapper menuIdentifierMapper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageDispatcher, (i10 & 2) != 0 ? new DefaultMenuIdentifierMapper() : menuIdentifierMapper);
    }
}
