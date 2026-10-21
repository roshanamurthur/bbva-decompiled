package com.bbva.ethermobilesdk.tokencompat.storage.provider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import bk.p;
import com.bbva.ethermobilesdk.sharedstorage.Bus;
import com.bbva.ethermobilesdk.sharedstorage.model.StorageEntry;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatConfig;
import com.bbva.ethermobilesdk.tokencompat.extension.ContentValuesKt;
import com.bbva.ethermobilesdk.tokencompat.extension.ContextKt;
import com.bbva.ethermobilesdk.tokencompat.extension.LoggerKt;
import com.bbva.ethermobilesdk.tokencompat.extension.PairKt;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RelayedBus.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJO\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J;\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/storage/provider/RelayedBus;", "Lcom/bbva/ethermobilesdk/sharedstorage/Bus;", "Landroid/net/Uri;", "uri", "", "Landroid/content/ContentValues;", "values", "", "bulkInsert", "(Landroid/net/Uri;[Landroid/content/ContentValues;)I", "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "insert", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "<init>", "()V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public abstract class RelayedBus extends Bus {

    /* JADX INFO: compiled from: RelayedBus.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TokenCompatConfig.StorageMode.values().length];
            try {
                iArr[TokenCompatConfig.StorageMode.PRIVATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TokenCompatConfig.StorageMode.SHARED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void b(Context context, ContentValues contentValues) throws InterruptedException {
        Pair<String, StorageEntry> storageEntry = ContentValuesKt.toStorageEntry(contentValues);
        String strEtherTokenKeyOrNull = PairKt.etherTokenKeyOrNull(storageEntry);
        if (strEtherTokenKeyOrNull == null) {
            return;
        }
        String value = storageEntry.getSecond().getValue();
        TokenCompatConfig.StorageMode storageMode = ContextKt.readStorageMode(context);
        if (storageMode == null) {
            return;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[storageMode.ordinal()];
        if (i10 == 1) {
            ContextKt.relay(context, p.mapOf(TuplesKt.to(strEtherTokenKeyOrNull, value)), storageMode);
        } else {
            if (i10 != 2) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            Pair pair = TuplesKt.to(strEtherTokenKeyOrNull, value);
            Intrinsics.checkNotNullExpressionValue(applicationContext, "this");
            applicationContext.startService(PairKt.toIntent$default(pair, applicationContext, null, 2, null));
        }
    }

    @Override // com.bbva.ethermobilesdk.sharedstorage.Bus, android.content.ContentProvider
    public final int bulkInsert(@NotNull Uri uri, @NotNull ContentValues[] values) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(values, "values");
        return super.bulkInsert(uri, values);
    }

    @Override // com.bbva.ethermobilesdk.sharedstorage.Bus, android.content.ContentProvider
    @Nullable
    public final Uri insert(@NotNull Uri uri, @Nullable ContentValues values) {
        Context context;
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Uri uriInsert = super.insert(uri, values);
        if (values == null || (context = getContext()) == null) {
            return uriInsert;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            b(context, values);
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            LoggerKt.logError("failed to insert " + uri + " to relayed storage", thM5538exceptionOrNullimpl);
        }
        return uriInsert;
    }

    @Override // com.bbva.ethermobilesdk.sharedstorage.Bus, android.content.ContentProvider
    @Nullable
    public final Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return super.query(uri, projection, selection, selectionArgs, sortOrder);
    }

    @Override // com.bbva.ethermobilesdk.sharedstorage.Bus, android.content.ContentProvider
    public final int update(@NotNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        Context context;
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(uri, "uri");
        int iUpdate = super.update(uri, values, selection, selectionArgs);
        if (values == null || (context = getContext()) == null) {
            return iUpdate;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            b(context, values);
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            LoggerKt.logError("failed to update " + uri + " to relayed storage", thM5538exceptionOrNullimpl);
        }
        return iUpdate;
    }
}
