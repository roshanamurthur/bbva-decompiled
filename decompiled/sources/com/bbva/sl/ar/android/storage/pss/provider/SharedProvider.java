package com.bbva.sl.ar.android.storage.pss.provider;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import androidx.datastore.preferences.protobuf.q;
import androidx.exifinterface.media.ExifInterface;
import bk.d;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.securesharing.config.Configuration;
import com.bbva.ethermobilesdk.securesharing.database.EntryDatabase;
import com.bbva.ethermobilesdk.securesharing.database.EntryTable;
import com.bbva.ethermobilesdk.securesharing.database.InfoTable;
import com.bbva.ethermobilesdk.securesharing.database.QueryTarget;
import com.bbva.ethermobilesdk.securesharing.database.Table;
import com.bbva.ethermobilesdk.securesharing.extension.ContextKt;
import com.bbva.ethermobilesdk.securesharing.extension.CursorKt;
import com.bbva.ethermobilesdk.securesharing.extension.ExceptionKt;
import com.bbva.ethermobilesdk.securesharing.extension.ListKt;
import com.bbva.ethermobilesdk.securesharing.extension.LoggerKt;
import com.bbva.ethermobilesdk.securesharing.extension.UriKt;
import com.bbva.ethermobilesdk.securesharing.model.Entry;
import com.bbva.ethermobilesdk.securesharing.model.ProviderInfo;
import com.bbva.ethermobilesdk.securesharing.model.ProviderStatus;
import com.google.android.gms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SharedProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 F2\u00020\u0001:\u0001FB\u0005¢\u0006\u0002\u0010\u0002J0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000eH\u0002J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0002\u0010\u0016J5\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00142\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0004H\u0002J$\u0010\u001b\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001dH\u0002J\u0016\u0010 \u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001dH\u0002J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001dH\u0002J\u0016\u0010\"\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001dH\u0002JA\u0010$\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\u00042\u0010\u0010&\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010'J1\u0010$\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u00042\u0010\u0010&\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001dH\u0002J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001dH\u0002J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001dH\u0002J\u0010\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020\u0004H\u0002J\u001a\u00102\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0015H\u0016J*\u00102\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u00103\u001a\u00020.H\u0016JF\u00104\u001a\u0002H5\"\u0004\b\u0000\u001052\u0006\u00106\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u0002H507H\u0002¢\u0006\u0002\u0010:JO\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010\u000b\u001a\u00020\f2\u0010\u0010=\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u00142\b\u0010%\u001a\u0004\u0018\u00010\u00042\u0010\u0010&\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u00142\b\u0010>\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010?J\b\u0010@\u001a\u00020\nH\u0002J\u0010\u0010A\u001a\u00020B2\u0006\u0010\u000b\u001a\u00020\fH\u0002J;\u0010C\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00152\b\u0010%\u001a\u0004\u0018\u00010\u00042\u0010\u0010&\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010DJK\u0010C\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00152\b\u0010%\u001a\u0004\u0018\u00010\u00042\u0010\u0010&\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010ER\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/bbva/sl/ar/android/storage/pss/provider/SharedProvider;", "Landroid/content/ContentProvider;", "()V", "authority", "", "database", "Lcom/bbva/ethermobilesdk/securesharing/database/EntryDatabase;", "lock", "", "broadcast", "", "uri", "Landroid/net/Uri;", "block", "Lkotlin/Function3;", "Lcom/bbva/ethermobilesdk/securesharing/model/ProviderInfo;", "Landroid/content/ContentResolver;", "bulkInsert", "", "values", "", "Landroid/content/ContentValues;", "(Landroid/net/Uri;[Landroid/content/ContentValues;)I", "provider", "resolver", "(Landroid/net/Uri;[Landroid/content/ContentValues;Lcom/bbva/ethermobilesdk/securesharing/model/ProviderInfo;Landroid/content/ContentResolver;)V", "checkMasterProviderAuthority", "createExternalEntryTable", "providers", "", "entries", "Lcom/bbva/ethermobilesdk/securesharing/model/Entry;", "createExternalProviderInfoTable", "createInfoPriorities", "createProviderInfoTable", "infoPriorities", "delete", "selection", "selectionArgs", "(Landroid/net/Uri;Lcom/bbva/ethermobilesdk/securesharing/model/ProviderInfo;Landroid/content/ContentResolver;Ljava/lang/String;[Ljava/lang/String;)V", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "deleteProviderInfoEntry", "getEntries", "getProviderInfos", "getType", "hasInvalidProviderInfoData", "", "patners", "hasPermissions", "masterAuthority", "insert", "onCreate", "onValidCaller", ExifInterface.GPS_DIRECTION_TRUE, "operation", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Ljava/lang/String;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "systemRecovery", "targetTable", "Lcom/bbva/ethermobilesdk/securesharing/database/Table;", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "(Landroid/net/Uri;Lcom/bbva/ethermobilesdk/securesharing/model/ProviderInfo;Landroid/content/ContentResolver;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)V", "Companion", "securesharing_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SharedProvider extends ContentProvider {

    @NotNull
    public static final String URI_CONTENT_ITEM_TYPE_REGEX = "^content://.+/.+/\\d+$";
    private String authority;
    private EntryDatabase database;

    @NotNull
    private final Object lock = new Object();

    /* JADX INFO: compiled from: SharedProvider.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QueryTarget.values().length];
            iArr[QueryTarget.ENTRY.ordinal()] = 1;
            iArr[QueryTarget.INFO.ordinal()] = 2;
            iArr[QueryTarget.UNKNOWN.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void broadcast(Uri uri, Function3<? super ProviderInfo, ? super ContentResolver, ? super Uri, Unit> block) {
        List<ProviderInfo> listPartnerProviders;
        Context context = getContext();
        if (context == null) {
            listPartnerProviders = null;
        } else {
            String str = this.authority;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("authority");
                throw null;
            }
            listPartnerProviders = ContextKt.partnerProviders(context, str);
        }
        if (listPartnerProviders == null) {
            listPartnerProviders = CollectionsKt__CollectionsKt.emptyList();
        }
        LoggerKt.log("Detected '" + listPartnerProviders.size() + "' authority/ies to publish: " + listPartnerProviders);
        Context context2 = getContext();
        ContentResolver contentResolver = context2 != null ? context2.getContentResolver() : null;
        if (contentResolver == null) {
            return;
        }
        for (ProviderInfo providerInfo : listPartnerProviders) {
            block.invoke(providerInfo, contentResolver, UriKt.toRequest(uri, providerInfo.getAuthority()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String checkMasterProviderAuthority() throws Exception {
        List<ProviderInfo> providerInfos = getProviderInfos();
        if (providerInfos.isEmpty()) {
            throw q.d("Could not found Masteider Info", null, 2, null);
        }
        for (ProviderInfo providerInfo : providerInfos) {
            String authority = providerInfo.getAuthority();
            String str = this.authority;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("authority");
                throw null;
            }
            if (Intrinsics.areEqual(authority, str)) {
                LoggerKt.log("Caller provider is the master");
                String str2 = this.authority;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("authority");
                    throw null;
                }
                if (!hasPermissions(str2)) {
                    systemRecovery();
                }
                String str3 = this.authority;
                if (str3 != null) {
                    return str3;
                }
                Intrinsics.throwUninitializedPropertyAccessException("authority");
                throw null;
            }
            Context context = getContext();
            ProviderStatus providerStatus = context == null ? null : ContextKt.providerStatus(context, providerInfo.getAuthority());
            if (providerStatus == ProviderStatus.OK) {
                LoggerKt.log(Intrinsics.stringPlus("Master Provider: ", providerStatus));
                if (!hasPermissions(providerInfo.getAuthority())) {
                    systemRecovery();
                }
                return providerInfo.getAuthority();
            }
            LoggerKt.log(e.trimMargin$default("Removing existing Provider [" + providerInfo.getAuthority() + "] with \n                |invalid status [" + providerStatus + AbstractJsonLexerKt.END_LIST, null, 1, null));
            String str4 = this.authority;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("authority");
                throw null;
            }
            deleteProviderInfoEntry(str4);
        }
        throw q.d("Could not found Master Provider Info", null, 2, null);
    }

    private final void createExternalEntryTable(List<ProviderInfo> providers, List<Entry> entries) {
        ContentValues[] contentValue = ListKt.toContentValue(entries);
        for (ProviderInfo providerInfo : providers) {
            String authority = providerInfo.getAuthority();
            String str = this.authority;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("authority");
                throw null;
            }
            if (!Intrinsics.areEqual(authority, str)) {
                Uri uriContentUri = UriKt.contentUri(providerInfo.getAuthority(), EntryTable.INSTANCE.getPath());
                EntryDatabase entryDatabase = this.database;
                if (entryDatabase == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    throw null;
                }
                entryDatabase.replace(uriContentUri, providerInfo, contentValue);
            }
        }
    }

    private final void createExternalProviderInfoTable(List<ProviderInfo> providers) {
        ContentValues[] contentValues = ListKt.toContentValues(providers);
        for (ProviderInfo providerInfo : providers) {
            String authority = providerInfo.getAuthority();
            String str = this.authority;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("authority");
                throw null;
            }
            if (!Intrinsics.areEqual(authority, str)) {
                Uri uriContentUri = UriKt.contentUri(providerInfo.getAuthority(), InfoTable.INSTANCE.getPath());
                EntryDatabase entryDatabase = this.database;
                if (entryDatabase == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    throw null;
                }
                entryDatabase.replace(uriContentUri, providerInfo, contentValues);
            }
        }
    }

    private final List<ProviderInfo> createInfoPriorities() {
        List<android.content.pm.ProviderInfo> listProviders;
        ProviderStatus providerStatus;
        Context context = getContext();
        if (context == null) {
            listProviders = null;
        } else {
            String str = this.authority;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("authority");
                throw null;
            }
            listProviders = ContextKt.providers(context, str);
        }
        if (listProviders == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        LoggerKt.log("Found [" + listProviders.size() + "] external providers");
        String str2 = this.authority;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authority");
            throw null;
        }
        List listListOf = d.listOf(new ProviderInfo(str2, 0L));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listProviders) {
            android.content.pm.ProviderInfo providerInfo = (android.content.pm.ProviderInfo) obj;
            Context context2 = getContext();
            if (context2 == null) {
                providerStatus = null;
            } else {
                String str3 = providerInfo.authority;
                Intrinsics.checkNotNullExpressionValue(str3, "it.authority");
                providerStatus = ContextKt.providerStatus(context2, str3);
            }
            if (providerStatus == ProviderStatus.OK) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        int i10 = 0;
        for (Object obj2 : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str4 = ((android.content.pm.ProviderInfo) obj2).authority;
            Intrinsics.checkNotNullExpressionValue(str4, "providerInfo.authority");
            arrayList2.add(new ProviderInfo(str4, ((long) i10) + 1));
            i10 = i11;
        }
        return CollectionsKt___CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList2);
    }

    private final void createProviderInfoTable(List<ProviderInfo> infoPriorities) {
        String str = this.authority;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authority");
            throw null;
        }
        InfoTable infoTable = InfoTable.INSTANCE;
        Uri uriContentUri = UriKt.contentUri(str, infoTable.getPath());
        EntryDatabase entryDatabase = this.database;
        if (entryDatabase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("database");
            throw null;
        }
        Cursor cursorQuery = entryDatabase.query(uriContentUri, infoTable, (64 & 4) != 0 ? null : null, (64 & 8) != 0 ? null : null, (64 & 16) != 0 ? null : null, (64 & 32) != 0 ? null : InfoTable.AUTHORITY, (64 & 64) != 0 ? null : null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.getCount() > 0) {
                    EntryDatabase entryDatabase2 = this.database;
                    if (entryDatabase2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("database");
                        throw null;
                    }
                    if (entryDatabase2.delete(uriContentUri, infoTable, null, null) <= 0) {
                        StringBuilder sb2 = new StringBuilder("Cannot delete [");
                        String str2 = this.authority;
                        if (str2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("authority");
                            throw null;
                        }
                        sb2.append(str2);
                        sb2.append("] provider info table content");
                        ExceptionKt.throwError$default(sb2.toString(), null, 2, null);
                        throw new KotlinNothingValueException();
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(cursorQuery, th2);
                    throw th3;
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(cursorQuery, null);
        ContentValues[] contentValues = ListKt.toContentValues(infoPriorities);
        EntryDatabase entryDatabase3 = this.database;
        if (entryDatabase3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("database");
            throw null;
        }
        if (entryDatabase3.bulkInsert(uriContentUri, infoTable, contentValues) == 0) {
            StringBuilder sb3 = new StringBuilder("Cannot insert [");
            String str3 = this.authority;
            if (str3 != null) {
                throw q.d(ad.d.f(sb3, str3, "] provider info table content"), null, 2, null);
            }
            Intrinsics.throwUninitializedPropertyAccessException("authority");
            throw null;
        }
    }

    private final void deleteProviderInfoEntry(String authority) {
        try {
            InfoTable infoTable = InfoTable.INSTANCE;
            Uri uriContentUri = UriKt.contentUri(authority, infoTable.getName());
            EntryDatabase entryDatabase = this.database;
            if (entryDatabase == null) {
                Intrinsics.throwUninitializedPropertyAccessException("database");
                throw null;
            }
            if (entryDatabase.delete(uriContentUri, infoTable, "providerName=?", new String[]{authority}) == 0) {
                LoggerKt.log("Could not remove useless Provider Info entry [" + authority + AbstractJsonLexerKt.END_LIST);
            }
        } catch (Exception unused) {
            LoggerKt.log("Could not remove useless Provider Info entry [" + authority + AbstractJsonLexerKt.END_LIST);
        }
    }

    private final List<Entry> getEntries() {
        List<Entry> entryList;
        String str = this.authority;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authority");
            throw null;
        }
        try {
            Cursor cursorQuery = query(UriKt.contentUri(str, EntryTable.INSTANCE.getPath()), null, null, null, null);
            if (cursorQuery == null) {
                entryList = null;
            } else {
                try {
                    entryList = CursorKt.toEntryList(cursorQuery);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(cursorQuery, th2);
                        throw th3;
                    }
                }
            }
            if (entryList == null) {
                entryList = CollectionsKt__CollectionsKt.emptyList();
            }
            CloseableKt.closeFinally(cursorQuery, null);
            return entryList;
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder("Error parsing [");
            String str2 = this.authority;
            if (str2 != null) {
                throw q.d(ad.d.f(sb2, str2, "] key-value data form cursor"), null, 2, null);
            }
            Intrinsics.throwUninitializedPropertyAccessException("authority");
            throw null;
        }
    }

    private final List<ProviderInfo> getProviderInfos() {
        List<ProviderInfo> providerInfoList;
        try {
            String str = this.authority;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("authority");
                throw null;
            }
            InfoTable infoTable = InfoTable.INSTANCE;
            Uri uriContentUri = UriKt.contentUri(str, infoTable.getPath());
            EntryDatabase entryDatabase = this.database;
            if (entryDatabase == null) {
                Intrinsics.throwUninitializedPropertyAccessException("database");
                throw null;
            }
            Cursor cursorQuery = entryDatabase.query(uriContentUri, infoTable, (64 & 4) != 0 ? null : null, (64 & 8) != 0 ? null : null, (64 & 16) != 0 ? null : null, (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? null : null);
            if (cursorQuery == null) {
                providerInfoList = null;
            } else {
                try {
                    providerInfoList = CursorKt.toProviderInfoList(cursorQuery);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(cursorQuery, th2);
                        throw th3;
                    }
                }
            }
            if (providerInfoList != null) {
                CloseableKt.closeFinally(cursorQuery, null);
                return providerInfoList;
            }
            ExceptionKt.throwError$default("Could not found authorities info", null, 2, null);
            throw new KotlinNothingValueException();
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder("Error parsing [");
            String str2 = this.authority;
            if (str2 != null) {
                throw q.d(ad.d.f(sb2, str2, "] provider info data form cursor"), null, 2, null);
            }
            Intrinsics.throwUninitializedPropertyAccessException("authority");
            throw null;
        }
    }

    private final boolean hasInvalidProviderInfoData(List<ProviderInfo> patners) {
        if (patners.isEmpty()) {
            return true;
        }
        return patners.size() > 1 && ((ProviderInfo) CollectionsKt___CollectionsKt.first((List) patners)).getPriority() == patners.get(1).getPriority();
    }

    private final boolean hasPermissions(String masterAuthority) throws Exception {
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNullExpressionValue(context, "context!!");
        String strAuthorityFromPackageName = ContextKt.authorityFromPackageName(context, getCallingPackage());
        String str = this.authority;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authority");
            throw null;
        }
        if (Intrinsics.areEqual(masterAuthority, str)) {
            try {
                Intrinsics.checkNotNull(strAuthorityFromPackageName);
                Uri uriContentUri = UriKt.contentUri(strAuthorityFromPackageName, InfoTable.PATH);
                Context context2 = getContext();
                Intrinsics.checkNotNull(context2);
                Cursor cursor = context2.getContentResolver().query(uriContentUri, null, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            Intrinsics.checkNotNullExpressionValue(cursor, "cursor");
                            List<ProviderInfo> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(CursorKt.toProviderInfoList(cursor), new Comparator<T>() { // from class: com.bbva.sl.ar.android.storage.pss.provider.SharedProvider$hasPermissions$lambda-13$$inlined$sortedBy$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t10, T t11) {
                                    return dk.e.compareValues(Long.valueOf(((ProviderInfo) t10).getPriority()), Long.valueOf(((ProviderInfo) t11).getPriority()));
                                }
                            });
                            String authority = ((ProviderInfo) CollectionsKt___CollectionsKt.first((List) listSortedWith)).getAuthority();
                            String str2 = this.authority;
                            if (str2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("authority");
                                throw null;
                            }
                            if (!Intrinsics.areEqual(authority, str2)) {
                                LoggerKt.log("Caller authority [" + ((Object) strAuthorityFromPackageName) + "] is not allowed to perform operations as a Master");
                                CloseableKt.closeFinally(cursor, null);
                                return false;
                            }
                            if (hasInvalidProviderInfoData(listSortedWith)) {
                                LoggerKt.log("Caller authority [" + ((Object) strAuthorityFromPackageName) + "] has invalid Provider Info Data");
                                CloseableKt.closeFinally(cursor, null);
                                return false;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(cursor, th2);
                            throw th3;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursor, null);
            } catch (Exception e5) {
                ExceptionKt.throwError("Error getting Provider Info in Content Provider with authority [" + ((Object) strAuthorityFromPackageName) + AbstractJsonLexerKt.END_LIST, e5);
                throw new KotlinNothingValueException();
            }
        } else {
            Context context3 = getContext();
            if (!Intrinsics.areEqual(context3 != null ? context3.getPackageName() : null, getCallingPackage()) && !Intrinsics.areEqual(masterAuthority, strAuthorityFromPackageName)) {
                LoggerKt.log("Caller authority [" + ((Object) strAuthorityFromPackageName) + "] is not allowed to perform operations as a Master");
                return false;
            }
        }
        return true;
    }

    private final <T> T onValidCaller(String operation, Uri uri, Function1<? super Uri, ? extends T> block) {
        T tInvoke;
        StringBuilder sb2 = new StringBuilder("Received [");
        sb2.append(operation);
        sb2.append("] [");
        sb2.append(uri);
        sb2.append("] at ");
        String str = this.authority;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authority");
            throw null;
        }
        sb2.append(str);
        sb2.append(" from UID: ");
        sb2.append(Binder.getCallingUid());
        sb2.append("\n            | [TID: ");
        sb2.append(Process.myTid());
        sb2.append(", PID: ");
        sb2.append(Process.myPid());
        sb2.append(AbstractJsonLexerKt.END_LIST);
        LoggerKt.log(e.trimMargin$default(sb2.toString(), null, 1, null));
        if (getCallingPackage() == null) {
            throw q.d("Caller package name is null", null, 2, null);
        }
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNullExpressionValue(context, "context!!");
        String callingPackage = getCallingPackage();
        Intrinsics.checkNotNull(callingPackage);
        Intrinsics.checkNotNullExpressionValue(callingPackage, "callingPackage!!");
        ContextKt.verifyApp(context, callingPackage, Configuration.INSTANCE.getSharedConfiguration().getFingerprints());
        synchronized (this.lock) {
            tInvoke = block.invoke(uri);
        }
        return tInvoke;
    }

    private final void systemRecovery() throws Exception {
        LoggerKt.log("System Recovery starting...");
        List<ProviderInfo> listCreateInfoPriorities = createInfoPriorities();
        LoggerKt.log("New Provider Info table was built [" + listCreateInfoPriorities + AbstractJsonLexerKt.END_LIST);
        try {
            createProviderInfoTable(listCreateInfoPriorities);
            StringBuilder sb2 = new StringBuilder("Provider Info table was stored in master authority [");
            String str = this.authority;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("authority");
                throw null;
            }
            sb2.append(str);
            sb2.append(AbstractJsonLexerKt.END_LIST);
            LoggerKt.log(sb2.toString());
            createExternalProviderInfoTable(listCreateInfoPriorities);
            LoggerKt.log("Provider Info table was stored in external providers");
            List<Entry> entries = getEntries();
            StringBuilder sb3 = new StringBuilder("Master Authority [");
            String str2 = this.authority;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("authority");
                throw null;
            }
            sb3.append(str2);
            sb3.append("] has ");
            sb3.append(entries.size());
            sb3.append(" key-value entry/ies");
            LoggerKt.log(sb3.toString());
            createExternalEntryTable(listCreateInfoPriorities, entries);
            LoggerKt.log("Key-Value table was stored in external providers");
            LoggerKt.log("System Recovery was finished successfully");
        } catch (Exception e5) {
            ExceptionKt.throwError("System Recovery finish with errors", e5);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Table targetTable(Uri uri) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[QueryTarget.INSTANCE.from(uri).ordinal()];
        if (i10 == 1) {
            return EntryTable.INSTANCE;
        }
        if (i10 == 2) {
            return InfoTable.INSTANCE;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw q.d("Unknown uri", null, 2, null);
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(@NotNull final Uri uri, @NotNull final ContentValues[] values) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(values, "values");
        return ((Number) onValidCaller("bulkInsert", uri, new Function1<Uri, Integer>() { // from class: com.bbva.sl.ar.android.storage.pss.provider.SharedProvider.bulkInsert.1

            /* JADX INFO: renamed from: com.bbva.sl.ar.android.storage.pss.provider.SharedProvider$bulkInsert$1$WhenMappings */
            /* JADX INFO: compiled from: SharedProvider.kt */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[QueryTarget.values().length];
                    iArr[QueryTarget.ENTRY.ordinal()] = 1;
                    iArr[QueryTarget.INFO.ordinal()] = 2;
                    iArr[QueryTarget.UNKNOWN.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Uri uri2) {
                return Integer.valueOf(invoke2(uri2));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2(@NotNull Uri it) throws Exception {
                Intrinsics.checkNotNullParameter(it, "it");
                int i10 = WhenMappings.$EnumSwitchMapping$0[QueryTarget.INSTANCE.from(uri).ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        EntryDatabase entryDatabase = this.database;
                        if (entryDatabase != null) {
                            return entryDatabase.bulkInsert(uri, InfoTable.INSTANCE, values);
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("database");
                        throw null;
                    }
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw q.d("Content Provider was called with a invalid uri: [" + uri + AbstractJsonLexerKt.END_LIST, null, 2, null);
                }
                String strCheckMasterProviderAuthority = this.checkMasterProviderAuthority();
                EntryDatabase entryDatabase2 = this.database;
                if (entryDatabase2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    throw null;
                }
                int iBulkInsert = entryDatabase2.bulkInsert(uri, EntryTable.INSTANCE, values);
                final SharedProvider sharedProvider = this;
                Uri uri2 = uri;
                final ContentValues[] contentValuesArr = values;
                String str = sharedProvider.authority;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("authority");
                    throw null;
                }
                if (Intrinsics.areEqual(str, strCheckMasterProviderAuthority)) {
                    sharedProvider.broadcast(uri2, new Function3<ProviderInfo, ContentResolver, Uri, Unit>() { // from class: com.bbva.sl.ar.android.storage.pss.provider.SharedProvider$bulkInsert$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ProviderInfo providerInfo, ContentResolver contentResolver, Uri uri3) throws Exception {
                            invoke2(providerInfo, contentResolver, uri3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ProviderInfo provider, @NotNull ContentResolver resolver, @NotNull Uri request) throws Exception {
                            Intrinsics.checkNotNullParameter(provider, "provider");
                            Intrinsics.checkNotNullParameter(resolver, "resolver");
                            Intrinsics.checkNotNullParameter(request, "request");
                            sharedProvider.bulkInsert(request, contentValuesArr, provider, resolver);
                        }
                    });
                }
                return iBulkInsert;
            }
        })).intValue();
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull final Uri uri, @Nullable final String selection, @Nullable final String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return ((Number) onValidCaller("delete", uri, new Function1<Uri, Integer>() { // from class: com.bbva.sl.ar.android.storage.pss.provider.SharedProvider.delete.1

            /* JADX INFO: renamed from: com.bbva.sl.ar.android.storage.pss.provider.SharedProvider$delete$1$WhenMappings */
            /* JADX INFO: compiled from: SharedProvider.kt */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[QueryTarget.values().length];
                    iArr[QueryTarget.ENTRY.ordinal()] = 1;
                    iArr[QueryTarget.INFO.ordinal()] = 2;
                    iArr[QueryTarget.UNKNOWN.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Uri uri2) {
                return Integer.valueOf(invoke2(uri2));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2(@NotNull Uri it) throws Exception {
                Intrinsics.checkNotNullParameter(it, "it");
                int i10 = WhenMappings.$EnumSwitchMapping$0[QueryTarget.INSTANCE.from(uri).ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        EntryDatabase entryDatabase = this.database;
                        if (entryDatabase != null) {
                            return entryDatabase.delete(uri, InfoTable.INSTANCE, selection, selectionArgs);
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("database");
                        throw null;
                    }
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw q.d("Content Provider was called with a invalid uri: [" + uri + AbstractJsonLexerKt.END_LIST, null, 2, null);
                }
                String strCheckMasterProviderAuthority = this.checkMasterProviderAuthority();
                EntryDatabase entryDatabase2 = this.database;
                if (entryDatabase2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    throw null;
                }
                int iDelete = entryDatabase2.delete(uri, EntryTable.INSTANCE, selection, selectionArgs);
                final SharedProvider sharedProvider = this;
                Uri uri2 = uri;
                final String str = selection;
                final String[] strArr = selectionArgs;
                String str2 = sharedProvider.authority;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("authority");
                    throw null;
                }
                if (Intrinsics.areEqual(str2, strCheckMasterProviderAuthority)) {
                    sharedProvider.broadcast(uri2, new Function3<ProviderInfo, ContentResolver, Uri, Unit>() { // from class: com.bbva.sl.ar.android.storage.pss.provider.SharedProvider$delete$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ProviderInfo providerInfo, ContentResolver contentResolver, Uri uri3) {
                            invoke2(providerInfo, contentResolver, uri3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ProviderInfo provider, @NotNull ContentResolver resolver, @NotNull Uri request) {
                            Intrinsics.checkNotNullParameter(provider, "provider");
                            Intrinsics.checkNotNullParameter(resolver, "resolver");
                            Intrinsics.checkNotNullParameter(request, "request");
                            sharedProvider.delete(request, provider, resolver, str, strArr);
                        }
                    });
                }
                return iDelete;
            }
        })).intValue();
    }

    @Override // android.content.ContentProvider
    @NotNull
    public String getType(@NotNull Uri uri) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(UriKt.contentType(uri));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) == null) {
            return (String) objM5535constructorimpl;
        }
        throw q.d("Content Provider was called with a invalid uri: [" + uri + AbstractJsonLexerKt.END_LIST, null, 2, null);
    }

    @Override // android.content.ContentProvider
    @NotNull
    public Uri insert(@NotNull final Uri uri, @Nullable final ContentValues values) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return (Uri) onValidCaller("insert", uri, new Function1<Uri, Uri>() { // from class: com.bbva.sl.ar.android.storage.pss.provider.SharedProvider.insert.1

            /* JADX INFO: renamed from: com.bbva.sl.ar.android.storage.pss.provider.SharedProvider$insert$1$WhenMappings */
            /* JADX INFO: compiled from: SharedProvider.kt */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[QueryTarget.values().length];
                    iArr[QueryTarget.ENTRY.ordinal()] = 1;
                    iArr[QueryTarget.INFO.ordinal()] = 2;
                    iArr[QueryTarget.UNKNOWN.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Uri invoke(@NotNull Uri it) throws Exception {
                Intrinsics.checkNotNullParameter(it, "it");
                int i10 = WhenMappings.$EnumSwitchMapping$0[QueryTarget.INSTANCE.from(uri).ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        EntryDatabase entryDatabase = this.database;
                        if (entryDatabase != null) {
                            return entryDatabase.insert(uri, InfoTable.INSTANCE, values);
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("database");
                        throw null;
                    }
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw q.d("Content Provider was called with a invalid uri: [" + uri + AbstractJsonLexerKt.END_LIST, null, 2, null);
                }
                String strCheckMasterProviderAuthority = this.checkMasterProviderAuthority();
                EntryDatabase entryDatabase2 = this.database;
                if (entryDatabase2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    throw null;
                }
                Uri uriInsert = entryDatabase2.insert(uri, EntryTable.INSTANCE, values);
                final SharedProvider sharedProvider = this;
                Uri uri2 = uri;
                final ContentValues contentValues = values;
                String str = sharedProvider.authority;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("authority");
                    throw null;
                }
                if (Intrinsics.areEqual(str, strCheckMasterProviderAuthority)) {
                    sharedProvider.broadcast(uri2, new Function3<ProviderInfo, ContentResolver, Uri, Unit>() { // from class: com.bbva.sl.ar.android.storage.pss.provider.SharedProvider$insert$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ProviderInfo providerInfo, ContentResolver contentResolver, Uri uri3) {
                            invoke2(providerInfo, contentResolver, uri3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ProviderInfo provider, @NotNull ContentResolver resolver, @NotNull Uri request) {
                            Intrinsics.checkNotNullParameter(provider, "provider");
                            Intrinsics.checkNotNullParameter(resolver, "resolver");
                            Intrinsics.checkNotNullParameter(request, "request");
                            sharedProvider.insert(request, contentValues, provider, resolver);
                        }
                    });
                }
                return uriInsert;
            }
        });
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        StringBuilder sb2 = new StringBuilder("Loading Shared ContentProvider [");
        Context context = getContext();
        sb2.append((Object) (context == null ? null : context.getPackageName()));
        sb2.append("]\n            | version[5.0.0] code [50000]");
        LoggerKt.log(e.trimMargin$default(sb2.toString(), null, 1, null));
        Context context2 = getContext();
        Intrinsics.checkNotNull(context2);
        Intrinsics.checkNotNullExpressionValue(context2, "context!!");
        this.database = new EntryDatabase(context2);
        Context context3 = getContext();
        String strAuthority = context3 == null ? null : ContextKt.authority(context3);
        if (strAuthority == null) {
            LoggerKt.logError$default("Provider does not find caller authority", null, 2, null);
            return false;
        }
        this.authority = strAuthority;
        Configuration configuration = Configuration.INSTANCE;
        Context context4 = getContext();
        Intrinsics.checkNotNull(context4);
        Intrinsics.checkNotNullExpressionValue(context4, "context!!");
        String name = SharedProvider.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "javaClass.name");
        if (!configuration.init(context4, name)) {
            LoggerKt.logError$default("Invalid configuration", null, 2, null);
            return false;
        }
        StringBuilder sb3 = new StringBuilder("Shared ContentProvider [");
        Context context5 = getContext();
        sb3.append((Object) (context5 != null ? context5.getPackageName() : null));
        sb3.append("] was initialized successfully");
        LoggerKt.log(sb3.toString());
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull final Uri uri, @Nullable final String[] projection, @Nullable final String selection, @Nullable final String[] selectionArgs, @Nullable final String sortOrder) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return (Cursor) onValidCaller(SearchIntents.EXTRA_QUERY, uri, new Function1<Uri, Cursor>() { // from class: com.bbva.sl.ar.android.storage.pss.provider.SharedProvider.query.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Cursor invoke(@NotNull Uri it) {
                Intrinsics.checkNotNullParameter(it, "it");
                EntryDatabase entryDatabase = SharedProvider.this.database;
                if (entryDatabase != null) {
                    Uri uri2 = uri;
                    return entryDatabase.query(uri2, SharedProvider.this.targetTable(uri2), (64 & 4) != 0 ? null : projection, (64 & 8) != 0 ? null : selection, (64 & 16) != 0 ? null : selectionArgs, (64 & 32) != 0 ? null : sortOrder, (64 & 64) != 0 ? null : null);
                }
                Intrinsics.throwUninitializedPropertyAccessException("database");
                throw null;
            }
        });
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull final Uri uri, @Nullable final ContentValues values, @Nullable final String selection, @Nullable final String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return ((Number) onValidCaller("update", uri, new Function1<Uri, Integer>() { // from class: com.bbva.sl.ar.android.storage.pss.provider.SharedProvider.update.1

            /* JADX INFO: renamed from: com.bbva.sl.ar.android.storage.pss.provider.SharedProvider$update$1$WhenMappings */
            /* JADX INFO: compiled from: SharedProvider.kt */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[QueryTarget.values().length];
                    iArr[QueryTarget.ENTRY.ordinal()] = 1;
                    iArr[QueryTarget.INFO.ordinal()] = 2;
                    iArr[QueryTarget.UNKNOWN.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Uri uri2) {
                return Integer.valueOf(invoke2(uri2));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2(@NotNull Uri it) throws Exception {
                Intrinsics.checkNotNullParameter(it, "it");
                int i10 = WhenMappings.$EnumSwitchMapping$0[QueryTarget.INSTANCE.from(uri).ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        EntryDatabase entryDatabase = this.database;
                        if (entryDatabase != null) {
                            return entryDatabase.update(uri, InfoTable.INSTANCE, values, selection, selectionArgs);
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("database");
                        throw null;
                    }
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw q.d("Content Provider was called with a invalid uri: [" + uri + AbstractJsonLexerKt.END_LIST, null, 2, null);
                }
                String strCheckMasterProviderAuthority = this.checkMasterProviderAuthority();
                EntryDatabase entryDatabase2 = this.database;
                if (entryDatabase2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("database");
                    throw null;
                }
                int iUpdate = entryDatabase2.update(uri, EntryTable.INSTANCE, values, selection, selectionArgs);
                final SharedProvider sharedProvider = this;
                Uri uri2 = uri;
                final ContentValues contentValues = values;
                final String str = selection;
                final String[] strArr = selectionArgs;
                String str2 = sharedProvider.authority;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("authority");
                    throw null;
                }
                if (Intrinsics.areEqual(str2, strCheckMasterProviderAuthority)) {
                    sharedProvider.broadcast(uri2, new Function3<ProviderInfo, ContentResolver, Uri, Unit>() { // from class: com.bbva.sl.ar.android.storage.pss.provider.SharedProvider$update$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ProviderInfo providerInfo, ContentResolver contentResolver, Uri uri3) {
                            invoke2(providerInfo, contentResolver, uri3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ProviderInfo provider, @NotNull ContentResolver resolver, @NotNull Uri request) {
                            Intrinsics.checkNotNullParameter(provider, "provider");
                            Intrinsics.checkNotNullParameter(resolver, "resolver");
                            Intrinsics.checkNotNullParameter(request, "request");
                            sharedProvider.update(request, provider, resolver, contentValues, str, strArr);
                        }
                    });
                }
                return iUpdate;
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bulkInsert(Uri uri, ContentValues[] values, ProviderInfo provider, ContentResolver resolver) throws Exception {
        List<ProviderInfo> listPartnerProviders;
        LoggerKt.log("Publishing BULK INSERT operation to slave providers");
        Context context = getContext();
        if (context == null) {
            listPartnerProviders = null;
        } else {
            String str = this.authority;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("authority");
                throw null;
            }
            listPartnerProviders = ContextKt.partnerProviders(context, str);
        }
        if (listPartnerProviders == null) {
            listPartnerProviders = CollectionsKt__CollectionsKt.emptyList();
        }
        LoggerKt.log("Detected '" + listPartnerProviders.size() + "' authority/ies to publish: " + listPartnerProviders);
        if (values.length == 0) {
            return;
        }
        try {
            if (resolver.bulkInsert(uri, values) != 0) {
                return;
            }
            ExceptionKt.throwError$default(Intrinsics.stringPlus("Could not insert entries of authority: ", provider.getAuthority()), null, 2, null);
            throw new KotlinNothingValueException();
        } catch (Exception e5) {
            ExceptionKt.throwError("Runtime error publishing operation [BULK INSERT] to Uri [" + uri + AbstractJsonLexerKt.END_LIST, e5);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x002c A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:4:0x000f, B:6:0x0015, B:8:0x001b, B:16:0x005b, B:11:0x002c, B:15:0x003b, B:14:0x0035), top: B:25:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:4:0x000f, B:6:0x0015, B:8:0x001b, B:16:0x005b, B:11:0x002c, B:15:0x003b, B:14:0x0035), top: B:25:0x000f }] */
    public final void delete(Uri uri, ProviderInfo provider, ContentResolver resolver, String selection, String[] selectionArgs) {
        String str;
        Cursor cursorQuery = resolver.query(uri, null, selection, selectionArgs, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.getCount() <= 0) {
                    StringBuilder sb2 = new StringBuilder("Entry with key [");
                    if (selectionArgs == null) {
                        str = null;
                    } else {
                        str = (String) ArraysKt___ArraysKt.firstOrNull(selectionArgs);
                    }
                    sb2.append((Object) str);
                    sb2.append("] does not exist in provider \n                    |[");
                    sb2.append(provider.getAuthority());
                    sb2.append("]. Is not necessary to DELETE element");
                    LoggerKt.log(e.trimMargin$default(sb2.toString(), null, 1, null));
                } else if (resolver.delete(uri, selection, selectionArgs) == 0) {
                    LoggerKt.logError$default(Intrinsics.stringPlus("Could not deleteReg entry of authority: ", provider.getAuthority()), null, 2, null);
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(cursorQuery, th2);
                    throw th3;
                }
            }
        } else {
            StringBuilder sb3 = new StringBuilder("Entry with key [");
            if (selectionArgs == null) {
                str = null;
            } else {
                str = (String) ArraysKt___ArraysKt.firstOrNull(selectionArgs);
            }
            sb3.append((Object) str);
            sb3.append("] does not exist in provider \n                    |[");
            sb3.append(provider.getAuthority());
            sb3.append("]. Is not necessary to DELETE element");
            LoggerKt.log(e.trimMargin$default(sb3.toString(), null, 1, null));
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(cursorQuery, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0093 A[Catch: all -> 0x0069, TRY_ENTER, TryCatch #1 {all -> 0x0069, blocks: (B:7:0x0021, B:10:0x0028, B:12:0x0066, B:15:0x006b, B:16:0x0088, B:17:0x0089, B:21:0x0093, B:22:0x00a5), top: B:29:0x0021 }] */
    public final void insert(Uri uri, ContentValues values, ProviderInfo provider, ContentResolver resolver) {
        if (values == null) {
            return;
        }
        String[] strArr = {values.getAsString("key")};
        Cursor cursorQuery = resolver.query(uri, null, "key=?", strArr, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.getCount() != 0) {
                    LoggerKt.log(e.trimMargin$default("Entry with key [" + ((Object) values.getAsString("key")) + "] exists in \n                        |provider [" + provider.getAuthority() + "]. Changing operation to UPDATE...", null, 1, null));
                    cursorQuery.moveToFirst();
                    if (resolver.update(uri, CursorKt.toEntry(cursorQuery).copy(values).toContentValues(), "key=?", strArr) == 0) {
                        ExceptionKt.throwError$default("Could not update entry of authority: " + provider.getAuthority() + RootService.CLOSE_BRACKET, null, 2, null);
                        throw new KotlinNothingValueException();
                    }
                    Unit unit = Unit.INSTANCE;
                } else if (resolver.insert(uri, values) == null) {
                    ExceptionKt.throwError$default(Intrinsics.stringPlus("Could not insert entry of authority: ", provider.getAuthority()), null, 2, null);
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(cursorQuery, th2);
                    throw th3;
                }
            }
        } else if (resolver.insert(uri, values) == null) {
            ExceptionKt.throwError$default(Intrinsics.stringPlus("Could not insert entry of authority: ", provider.getAuthority()), null, 2, null);
            throw new KotlinNothingValueException();
        }
        CloseableKt.closeFinally(cursorQuery, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:4:0x001c, B:7:0x0023, B:9:0x002b, B:12:0x0033, B:13:0x0045, B:14:0x0046, B:18:0x0055, B:26:0x007a, B:30:0x008b, B:34:0x00a1, B:35:0x00b3, B:29:0x0084, B:21:0x006d, B:17:0x004f), top: B:42:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    /* JADX WARN: Code duplicated, block: B:21:0x006d A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #1 {all -> 0x002f, blocks: (B:4:0x001c, B:7:0x0023, B:9:0x002b, B:12:0x0033, B:13:0x0045, B:14:0x0046, B:18:0x0055, B:26:0x007a, B:30:0x008b, B:34:0x00a1, B:35:0x00b3, B:29:0x0084, B:21:0x006d, B:17:0x004f), top: B:42:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a A[Catch: all -> 0x002f, TRY_ENTER, TryCatch #1 {all -> 0x002f, blocks: (B:4:0x001c, B:7:0x0023, B:9:0x002b, B:12:0x0033, B:13:0x0045, B:14:0x0046, B:18:0x0055, B:26:0x007a, B:30:0x008b, B:34:0x00a1, B:35:0x00b3, B:29:0x0084, B:21:0x006d, B:17:0x004f), top: B:42:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:4:0x001c, B:7:0x0023, B:9:0x002b, B:12:0x0033, B:13:0x0045, B:14:0x0046, B:18:0x0055, B:26:0x007a, B:30:0x008b, B:34:0x00a1, B:35:0x00b3, B:29:0x0084, B:21:0x006d, B:17:0x004f), top: B:42:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1 A[Catch: all -> 0x002f, TRY_ENTER, TryCatch #1 {all -> 0x002f, blocks: (B:4:0x001c, B:7:0x0023, B:9:0x002b, B:12:0x0033, B:13:0x0045, B:14:0x0046, B:18:0x0055, B:26:0x007a, B:30:0x008b, B:34:0x00a1, B:35:0x00b3, B:29:0x0084, B:21:0x006d, B:17:0x004f), top: B:42:0x001c }] */
    public final void update(Uri uri, ProviderInfo provider, ContentResolver resolver, ContentValues values, String selection, String[] selectionArgs) {
        String str;
        String str2;
        long jCurrentTimeMillis;
        String asString;
        Cursor cursorQuery = resolver.query(uri, null, selection, selectionArgs, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.getCount() == 0) {
                    StringBuilder sb2 = new StringBuilder("Entry with key [");
                    if (selectionArgs == null) {
                        str = null;
                    } else {
                        str = (String) ArraysKt___ArraysKt.firstOrNull(selectionArgs);
                    }
                    sb2.append((Object) str);
                    sb2.append("] does not exist in provider \n                    |[providerInfo.getAuthority()+\"]. Changing operation to INSERT...");
                    LoggerKt.log(e.trimMargin$default(sb2.toString(), null, 1, null));
                    if (selectionArgs == null) {
                        str2 = null;
                    } else {
                        str2 = (String) ArraysKt___ArraysKt.first(selectionArgs);
                    }
                    if (str2 == null) {
                        CloseableKt.closeFinally(cursorQuery, null);
                        return;
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (values == null) {
                        asString = null;
                    } else {
                        asString = values.getAsString("value");
                    }
                    Intrinsics.checkNotNull(asString);
                    if (resolver.insert(uri, new Entry(str2, asString, jCurrentTimeMillis, jCurrentTimeMillis).toContentValues()) == null) {
                        ExceptionKt.throwError$default(Intrinsics.stringPlus("Could not insert entry of authority: ", provider.getAuthority()), null, 2, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    if (resolver.update(uri, values, selection, selectionArgs) == 0) {
                        ExceptionKt.throwError$default(Intrinsics.stringPlus("Could not update entry of authority: ", provider.getAuthority()), null, 2, null);
                        throw new KotlinNothingValueException();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(cursorQuery, th2);
                    throw th3;
                }
            }
        } else {
            StringBuilder sb3 = new StringBuilder("Entry with key [");
            if (selectionArgs == null) {
                str = null;
            } else {
                str = (String) ArraysKt___ArraysKt.firstOrNull(selectionArgs);
            }
            sb3.append((Object) str);
            sb3.append("] does not exist in provider \n                    |[providerInfo.getAuthority()+\"]. Changing operation to INSERT...");
            LoggerKt.log(e.trimMargin$default(sb3.toString(), null, 1, null));
            if (selectionArgs == null) {
                str2 = null;
            } else {
                str2 = (String) ArraysKt___ArraysKt.first(selectionArgs);
            }
            if (str2 == null) {
                CloseableKt.closeFinally(cursorQuery, null);
                return;
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            if (values == null) {
                asString = null;
            } else {
                asString = values.getAsString("value");
            }
            Intrinsics.checkNotNull(asString);
            if (resolver.insert(uri, new Entry(str2, asString, jCurrentTimeMillis, jCurrentTimeMillis).toContentValues()) == null) {
                ExceptionKt.throwError$default(Intrinsics.stringPlus("Could not insert entry of authority: ", provider.getAuthority()), null, 2, null);
                throw new KotlinNothingValueException();
            }
        }
        CloseableKt.closeFinally(cursorQuery, null);
    }
}
