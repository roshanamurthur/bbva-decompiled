package com.bbva.ethermobilesdk.sharedstorage;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.bbva.ethermobilesdk.sharedstorage.extension.ContentItem;
import com.bbva.ethermobilesdk.sharedstorage.extension.ContentResolverKt;
import com.bbva.ethermobilesdk.sharedstorage.extension.ContextKt;
import com.bbva.ethermobilesdk.sharedstorage.extension.CustomCursor;
import com.bbva.ethermobilesdk.sharedstorage.extension.PackageManagerKt;
import com.bbva.ethermobilesdk.sharedstorage.model.AppSignatureContainer;
import com.bbva.ethermobilesdk.sharedstorage.model.SharedStorageResult;
import com.bbva.ethermobilesdk.sharedstorage.model.StorageEntry;
import com.google.android.gms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Bus.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b&\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016JQ\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J'\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/Bus;", "Landroid/content/ContentProvider;", "", "onCreate", "Landroid/net/Uri;", "uri", "", "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "Landroid/content/ContentValues;", "values", "insert", "", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "bulkInsert", "(Landroid/net/Uri;[Landroid/content/ContentValues;)I", "q0", "Ljava/lang/String;", "getGroup", "()Ljava/lang/String;", "setGroup", "(Ljava/lang/String;)V", "group", "<init>", "()V", "Companion", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bus.kt\ncom/bbva/ethermobilesdk/sharedstorage/Bus\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,172:1\n766#2:173\n857#2,2:174\n766#2:176\n857#2,2:177\n1855#2,2:179\n766#2:181\n857#2,2:182\n766#2:184\n857#2,2:185\n1855#2,2:188\n215#3:187\n216#3:190\n*S KotlinDebug\n*F\n+ 1 Bus.kt\ncom/bbva/ethermobilesdk/sharedstorage/Bus\n*L\n74#1:173\n74#1:174,2\n75#1:176\n75#1:177,2\n76#1:179,2\n125#1:181\n125#1:182,2\n126#1:184\n126#1:185,2\n131#1:188,2\n130#1:187\n130#1:190\n*E\n"})
public abstract class Bus extends ContentProvider {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Object f29986p0 = new Object();

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String group;

    public final boolean a(AppSignatureContainer appSignatureContainer) {
        String callingPackage;
        Context context = getContext();
        if (context == null || (callingPackage = getCallingPackage()) == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager != null ? packageManager.getApplicationInfo(callingPackage, 128) : null;
            if (applicationInfo != null) {
                return ContextKt.hasAValidSignature(context, applicationInfo, appSignatureContainer.getApps());
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(@NotNull Uri uri, @NotNull ContentValues[] values) {
        String str;
        String lastPathSegment;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(values, "values");
        Context context = getContext();
        if (context != null && (str = this.group) != null && (lastPathSegment = uri.getLastPathSegment()) != null) {
            InternalStoreChain internalStoreChain = new InternalStoreChain(context, str, lastPathSegment);
            List<ProviderInfo> listQueryContentProvider = ContextKt.queryContentProvider(context, str, internalStoreChain.getSignatures().getApps());
            ArrayList arrayList = new ArrayList();
            for (Object obj : listQueryContentProvider) {
                if (!Intrinsics.areEqual(context.getPackageName(), ((ProviderInfo) obj).applicationInfo.packageName)) {
                    arrayList.add(obj);
                }
            }
            ArrayList<ProviderInfo> arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (Intrinsics.areEqual(getCallingPackage(), ((ProviderInfo) obj2).applicationInfo.packageName)) {
                    arrayList2.add(obj2);
                }
            }
            Map<String, StorageEntry> all = internalStoreChain.getCom.bbva.networkplugin.command.impl.HeadCommand.ID java.lang.String().getAll();
            if (!all.isEmpty()) {
                for (Map.Entry<String, StorageEntry> entry : all.entrySet()) {
                    String key = entry.getKey();
                    StorageEntry value = entry.getValue();
                    for (ProviderInfo providerInfo : arrayList2) {
                        synchronized (this.f29986p0) {
                            try {
                                ContentResolver contentResolver = context.getContentResolver();
                                if (contentResolver != null) {
                                    Intrinsics.checkNotNull(contentResolver);
                                    String authority = providerInfo.authority;
                                    Intrinsics.checkNotNullExpressionValue(authority, "authority");
                                    ContentResolverKt.put(contentResolver, authority, value.toContentValues(key, lastPathSegment));
                                }
                                Unit unit = Unit.INSTANCE;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @Nullable
    public final String getGroup() {
        return this.group;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return "vnd.android.cursor.item/vnd.com.bbva.ethermobilesdk.sharedstorage.entry";
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues values) {
        Context context;
        String str;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (values == null || (context = getContext()) == null || (str = this.group) == null) {
            return null;
        }
        ContentItem contentItem = new ContentItem(values);
        InternalStoreChain internalStoreChain = new InternalStoreChain(context, str, contentItem.getScope());
        if (!a(internalStoreChain.getSignatures())) {
            return null;
        }
        synchronized (this.f29986p0) {
            try {
                List<ProviderInfo> listQueryContentProvider = ContextKt.queryContentProvider(context, str, internalStoreChain.getSignatures().getApps());
                ArrayList arrayList = new ArrayList();
                for (Object obj : listQueryContentProvider) {
                    if (!Intrinsics.areEqual(getCallingPackage(), ((ProviderInfo) obj).applicationInfo.packageName)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList<ProviderInfo> arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (!Intrinsics.areEqual(context.getPackageName(), ((ProviderInfo) obj2).applicationInfo.packageName)) {
                        arrayList2.add(obj2);
                    }
                }
                for (ProviderInfo providerInfo : arrayList2) {
                    ContentResolver contentResolver = context.getContentResolver();
                    if (contentResolver != null) {
                        Intrinsics.checkNotNull(contentResolver);
                        String authority = providerInfo.authority;
                        Intrinsics.checkNotNullExpressionValue(authority, "authority");
                        ContentResolverKt.put(contentResolver, authority, values);
                    }
                }
                internalStoreChain.getCom.bbva.networkplugin.command.impl.HeadCommand.ID java.lang.String().put(contentItem.getKey(), contentItem.getValue());
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        String providerMetadata;
        Context context = getContext();
        if (context == null) {
            providerMetadata = null;
        } else {
            ComponentName componentName = new ComponentName(context, getClass());
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            providerMetadata = PackageManagerKt.getProviderMetadata(packageManager, componentName, ConstantsKt.METADATA_GROUP);
        }
        this.group = providerMetadata;
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        String str;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Context context = getContext();
        if (context != null && (str = this.group) != null && selectionArgs != null && selectionArgs.length == 2) {
            String str2 = selectionArgs[0];
            String str3 = selectionArgs[1];
            InternalStoreChain internalStoreChain = new InternalStoreChain(context, str, str2);
            if (a(internalStoreChain.getSignatures())) {
                SharedStorageResult<StorageEntry> sharedStorageResult = internalStoreChain.getCom.bbva.networkplugin.command.impl.HeadCommand.ID java.lang.String().get(str3);
                if (sharedStorageResult instanceof SharedStorageResult.Success) {
                    return new CustomCursor(str3, (StorageEntry) ((SharedStorageResult.Success) sharedStorageResult).getValue());
                }
                if (sharedStorageResult instanceof SharedStorageResult.Empty) {
                    return new CustomCursor(str3, null);
                }
                if (sharedStorageResult instanceof SharedStorageResult.Error) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    public final void setGroup(@Nullable String str) {
        this.group = str;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        Context context;
        String str;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (values == null || (context = getContext()) == null || (str = this.group) == null) {
            return 0;
        }
        ContentItem contentItem = new ContentItem(values);
        InternalStoreChain internalStoreChain = new InternalStoreChain(context, str, contentItem.getScope());
        if (!a(internalStoreChain.getSignatures())) {
            return 1;
        }
        internalStoreChain.getCom.bbva.networkplugin.command.impl.HeadCommand.ID java.lang.String().put(contentItem.getKey(), contentItem.getValue());
        return 1;
    }
}
