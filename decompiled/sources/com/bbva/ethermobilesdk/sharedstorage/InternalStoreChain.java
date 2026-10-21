package com.bbva.ethermobilesdk.sharedstorage;

import android.content.Context;
import com.bbva.ethermobilesdk.sharedstorage.provider.Provider;
import com.bbva.networkplugin.command.impl.HeadCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StoreChain.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/InternalStoreChain;", "Lcom/bbva/ethermobilesdk/sharedstorage/StoreChain;", "Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;", "b", "Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;", "getHead", "()Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;", HeadCommand.ID, "Landroid/content/Context;", "context", "", "group", "scope", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
public final class InternalStoreChain extends StoreChain {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Provider head;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalStoreChain(@NotNull Context context, @NotNull String group, @NotNull String scope) {
        super(context, group);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.head = StoreChainKt.access$createInternalProvider(context, group, scope);
    }

    @NotNull
    public final Provider getHead() {
        return this.head;
    }
}
