package com.bbva.ethermobilesdk.sharedstorage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import com.bbva.ethermobilesdk.sharedstorage.extension.ContentResolverKt;
import com.bbva.ethermobilesdk.sharedstorage.extension.ContextKt;
import com.bbva.ethermobilesdk.sharedstorage.provider.ExternalContentProvider;
import com.bbva.ethermobilesdk.sharedstorage.provider.Provider;
import com.bbva.nativesettings.common.Constants;
import com.bbva.networkplugin.command.impl.HeadCommand;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StoreChain.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/UnboundedStoreChain;", "Lcom/bbva/ethermobilesdk/sharedstorage/StoreChain;", "Landroid/content/Context;", "context", "", Constants.SYNC, "Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;", "d", "Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;", "getHead", "()Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;", HeadCommand.ID, "", "group", "scope", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStoreChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreChain.kt\ncom/bbva/ethermobilesdk/sharedstorage/UnboundedStoreChain\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n288#2,2:101\n*S KotlinDebug\n*F\n+ 1 StoreChain.kt\ncom/bbva/ethermobilesdk/sharedstorage/UnboundedStoreChain\n*L\n73#1:101,2\n*E\n"})
public final class UnboundedStoreChain extends StoreChain {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f29995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f29996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Provider head;

    public /* synthetic */ UnboundedStoreChain(Context context, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? ConstantsKt.SCOPE_DEFAULT : str2);
    }

    @NotNull
    public final Provider getHead() {
        return this.head;
    }

    public final void sync(@NotNull Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        Iterator<T> it = ContextKt.queryContentProvider(context, this.f29995b, getSignatures().getApps()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!Intrinsics.areEqual(context.getPackageName(), ((ProviderInfo) next).applicationInfo.packageName)));
        ProviderInfo providerInfo = (ProviderInfo) next;
        if (providerInfo != null) {
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            String authority = providerInfo.authority;
            Intrinsics.checkNotNullExpressionValue(authority, "authority");
            ContentResolverKt.syncWithOtherProviders(contentResolver, authority, this.f29996c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnboundedStoreChain(@NotNull Context context, @NotNull String group, @NotNull String scope) {
        super(context, group);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f29995b = group;
        this.f29996c = scope;
        ExternalContentProvider externalContentProvider = new ExternalContentProvider(context, group, scope, getSignatures().getApps());
        Provider providerAccess$createInternalProvider = StoreChainKt.access$createInternalProvider(context, group, scope);
        providerAccess$createInternalProvider.addToTail(externalContentProvider);
        externalContentProvider.setPrevious(providerAccess$createInternalProvider);
        this.head = providerAccess$createInternalProvider;
    }
}
