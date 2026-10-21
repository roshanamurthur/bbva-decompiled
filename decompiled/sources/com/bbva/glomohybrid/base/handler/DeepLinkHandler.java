package com.bbva.glomohybrid.base.handler;

import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeepLinkHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/base/handler/DeepLinkHandler;", "", "Lkotlin/Function1;", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "", "block", "consume", "a", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "getDeepLink", "()Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "setDeepLink", "(Lcom/bbva/glomohybrid/base/models/DeepLinkModel;)V", DeepLinkListenerAdapter.Constants.DEEP_LINK, "<init>", "()V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDeepLinkHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeepLinkHandler.kt\ncom/bbva/glomohybrid/base/handler/DeepLinkHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
public final class DeepLinkHandler {

    @NotNull
    public static final String ID = "notification-storage-manager";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public DeepLinkModel deepLink;

    /* JADX INFO: compiled from: DeepLinkHandler.kt */
    public static final class a extends Lambda implements Function1<DeepLinkModel, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f31393p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DeepLinkModel deepLinkModel) {
            DeepLinkModel it = deepLinkModel;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void consume$default(DeepLinkHandler deepLinkHandler, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = a.f31393p0;
        }
        deepLinkHandler.consume(function1);
    }

    public final void consume(@NotNull Function1<? super DeepLinkModel, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DeepLinkModel deepLinkModel = this.deepLink;
        if (deepLinkModel != null) {
            block.invoke(deepLinkModel);
        }
        this.deepLink = null;
    }

    @Nullable
    public final DeepLinkModel getDeepLink() {
        return this.deepLink;
    }

    public final void setDeepLink(@Nullable DeepLinkModel deepLinkModel) {
        this.deepLink = deepLinkModel;
    }
}
