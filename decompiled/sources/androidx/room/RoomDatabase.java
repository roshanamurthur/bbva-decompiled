package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.appcompat.widget.g0;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.collection.j;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import bk.q;
import bk.w;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.actions.SearchIntents;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RoomDatabase.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 q2\u00020\u0001:\u0007opqrstuB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010;\u001a\u00020<H\u0017J\b\u0010=\u001a\u00020<H\u0017J\b\u0010>\u001a\u00020<H\u0017J\b\u0010?\u001a\u00020<H'J\b\u0010@\u001a\u00020<H\u0016J\u0010\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0011H\u0016J\b\u0010D\u001a\u00020\u0019H$J\u0010\u0010E\u001a\u00020\u00142\u0006\u0010F\u001a\u00020GH$J\b\u0010H\u001a\u00020<H\u0017J*\u0010I\u001a\b\u0012\u0004\u0012\u00020J0$2\u001a\u0010\u000b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\n0KH\u0017J\r\u0010L\u001a\u00020MH\u0000¢\u0006\u0002\bNJ\u0016\u0010O\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t0PH\u0017J\"\u0010Q\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0$0KH\u0015J#\u0010R\u001a\u0004\u0018\u0001HS\"\u0004\b\u0000\u0010S2\f\u0010T\u001a\b\u0012\u0004\u0012\u0002HS0\tH\u0016¢\u0006\u0002\u0010UJ\b\u0010V\u001a\u00020\u0004H\u0016J\u0010\u0010W\u001a\u00020<2\u0006\u0010X\u001a\u00020GH\u0017J\b\u0010Y\u001a\u00020<H\u0002J\b\u0010Z\u001a\u00020<H\u0002J\u0010\u0010[\u001a\u00020<2\u0006\u0010\\\u001a\u00020(H\u0014J\u001c\u0010]\u001a\u00020^2\u0006\u0010]\u001a\u00020_2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010aH\u0017J)\u0010]\u001a\u00020^2\u0006\u0010]\u001a\u00020\u00112\u0012\u0010b\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010cH\u0016¢\u0006\u0002\u0010dJ\u0010\u0010e\u001a\u00020<2\u0006\u0010f\u001a\u00020gH\u0016J!\u0010e\u001a\u0002Hh\"\u0004\b\u0000\u0010h2\f\u0010f\u001a\b\u0012\u0004\u0012\u0002Hh0iH\u0016¢\u0006\u0002\u0010jJ\b\u0010k\u001a\u00020<H\u0017J+\u0010l\u001a\u0004\u0018\u0001HS\"\u0004\b\u0000\u0010S2\f\u0010m\u001a\b\u0012\u0004\u0012\u0002HS0\t2\u0006\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0002\u0010nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000RN\u0010\u000b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\n0\b2\u001a\u0010\u0007\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\n0\b8E@EX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\b8G¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\f\u0012\u0004\b \u0010\u0002\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010!\u001a\u00020\u00048G¢\u0006\f\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b!\u0010\u001eR \u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0004@\u0004X\u0085\u000e¢\u0006\b\n\u0000\u0012\u0004\b&\u0010\u0002R\u001a\u0010'\u001a\u0004\u0018\u00010(8\u0004@\u0004X\u0085\u000e¢\u0006\b\n\u0000\u0012\u0004\b)\u0010\u0002R\u0014\u0010*\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00102\u001a\b\u0012\u0004\u0012\u000204038G¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010/R\u001e\u00109\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006v"}, d2 = {"Landroidx/room/RoomDatabase;", "", "()V", "allowMainThreadQueries", "", "autoCloser", "Landroidx/room/AutoCloser;", "<set-?>", "", "Ljava/lang/Class;", "Landroidx/room/migration/AutoMigrationSpec;", "autoMigrationSpecs", "getAutoMigrationSpecs", "()Ljava/util/Map;", "setAutoMigrationSpecs", "(Ljava/util/Map;)V", "backingFieldMap", "", "getBackingFieldMap", "internalOpenHelper", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "internalQueryExecutor", "Ljava/util/concurrent/Executor;", "internalTransactionExecutor", "invalidationTracker", "Landroidx/room/InvalidationTracker;", "getInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "isMainThread", "isMainThread$room_runtime_release", "()Z", "isOpen", "isOpen$annotations", "isOpenInternal", "isOpenInternal$annotations", "mCallbacks", "", "Landroidx/room/RoomDatabase$Callback;", "getMCallbacks$annotations", "mDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getMDatabase$annotations", "openHelper", "getOpenHelper", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "queryExecutor", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "readWriteLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "suspendingTransactionId", "Ljava/lang/ThreadLocal;", "", "getSuspendingTransactionId", "()Ljava/lang/ThreadLocal;", "transactionExecutor", "getTransactionExecutor", "typeConverters", "writeAheadLoggingEnabled", "assertNotMainThread", "", "assertNotSuspendingTransaction", "beginTransaction", "clearAllTables", HearingDisabilitiesConstants.CLOSE_MODAL, "compileStatement", "Landroidx/sqlite/db/SupportSQLiteStatement;", "sql", "createInvalidationTracker", "createOpenHelper", "config", "Landroidx/room/DatabaseConfiguration;", "endTransaction", "getAutoMigrations", "Landroidx/room/migration/Migration;", "", "getCloseLock", "Ljava/util/concurrent/locks/Lock;", "getCloseLock$room_runtime_release", "getRequiredAutoMigrationSpecs", "", "getRequiredTypeConverters", "getTypeConverter", ExifInterface.GPS_DIRECTION_TRUE, "klass", "(Ljava/lang/Class;)Ljava/lang/Object;", "inTransaction", "init", "configuration", "internalBeginTransaction", "internalEndTransaction", "internalInitInvalidationTracker", "db", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "signal", "Landroid/os/CancellationSignal;", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "runInTransaction", "body", "Ljava/lang/Runnable;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/concurrent/Callable;", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "setTransactionSuccessful", "unwrapOpenHelper", "clazz", "(Ljava/lang/Class;Landroidx/sqlite/db/SupportSQLiteOpenHelper;)Ljava/lang/Object;", "Builder", "Callback", "Companion", "JournalMode", "MigrationContainer", "PrepackagedDatabaseCallback", "QueryCallback", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1548:1\n215#2,2:1549\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase\n*L\n261#1:1549,2\n*E\n"})
public abstract class RoomDatabase {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;

    @Nullable
    private AutoCloser autoCloser;

    @NotNull
    private final Map<String, Object> backingFieldMap;
    private SupportSQLiteOpenHelper internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Nullable
    protected List<? extends Callback> mCallbacks;

    @JvmField
    @Nullable
    protected volatile SupportSQLiteDatabase mDatabase;

    @NotNull
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;

    @NotNull
    private final InvalidationTracker invalidationTracker = createInvalidationTracker();

    @NotNull
    private Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs = new LinkedHashMap();

    @NotNull
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    @NotNull
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\b\u0000\u0012\u0006\u0010<\u001a\u00020;\u0012\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b@\u0010AJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\tH\u0016J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0017J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010%\u001a\u00020$H\u0017J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010+\u001a\u00020)\"\u00020*H\u0016J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\b\u001a\u00020-H\u0016J\u001e\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00100\u001a\u00020/2\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00102\u001a\u00020\u0003H\u0016J \u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0001\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0017J\u000f\u00109\u001a\u00028\u0000H\u0016¢\u0006\u0004\b9\u0010:¨\u0006B"}, d2 = {"Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/RoomDatabase;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "databaseFilePath", "createFromAsset", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "callback", "Ljava/io/File;", "databaseFile", "createFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "inputStreamCallable", "createFromInputStream", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "factory", "openHelperFactory", "", "Landroidx/room/migration/Migration;", "migrations", "addMigrations", "([Landroidx/room/migration/Migration;)Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/migration/AutoMigrationSpec;", "autoMigrationSpec", "addAutoMigrationSpec", "allowMainThreadQueries", "Landroidx/room/RoomDatabase$JournalMode;", "journalMode", "setJournalMode", "Ljava/util/concurrent/Executor;", "executor", "setQueryExecutor", "setTransactionExecutor", "enableMultiInstanceInvalidation", "Landroid/content/Intent;", "invalidationServiceIntent", "setMultiInstanceInvalidationServiceIntent", "fallbackToDestructiveMigration", "fallbackToDestructiveMigrationOnDowngrade", "", "", "startVersions", "fallbackToDestructiveMigrationFrom", "Landroidx/room/RoomDatabase$Callback;", "addCallback", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "setQueryCallback", "typeConverter", "addTypeConverter", "", "autoCloseTimeout", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "setAutoCloseTimeout", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Landroidx/room/RoomDatabase;", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "klass", "name", "<init>", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1548:1\n1#2:1549\n*E\n"})
    public static class Builder<T extends RoomDatabase> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Context f23268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Class<T> f23269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f23270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final ArrayList f23271d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public PrepackagedDatabaseCallback f23272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public QueryCallback f23273f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public Executor f23274g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final ArrayList f23275h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final ArrayList f23276i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public Executor f23277j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public Executor f23278k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public SupportSQLiteOpenHelper.Factory f23279l;
        public boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public JournalMode f23280n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        public Intent f23281o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f23282p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f23283q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f23284r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public TimeUnit f23285s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NotNull
        public final MigrationContainer f23286t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @NotNull
        public final LinkedHashSet f23287u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public HashSet f23288v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @Nullable
        public String f23289w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @Nullable
        public File f23290x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @Nullable
        public Callable<InputStream> f23291y;

        public Builder(@NotNull Context context, @NotNull Class<T> klass, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.f23268a = context;
            this.f23269b = klass;
            this.f23270c = str;
            this.f23271d = new ArrayList();
            this.f23275h = new ArrayList();
            this.f23276i = new ArrayList();
            this.f23280n = JournalMode.AUTOMATIC;
            this.f23282p = true;
            this.f23284r = -1L;
            this.f23286t = new MigrationContainer();
            this.f23287u = new LinkedHashSet();
        }

        @NotNull
        public Builder<T> addAutoMigrationSpec(@NotNull AutoMigrationSpec autoMigrationSpec) {
            Intrinsics.checkNotNullParameter(autoMigrationSpec, "autoMigrationSpec");
            this.f23276i.add(autoMigrationSpec);
            return this;
        }

        @NotNull
        public Builder<T> addCallback(@NotNull Callback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f23271d.add(callback);
            return this;
        }

        @NotNull
        public Builder<T> addMigrations(@NotNull Migration... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            if (this.f23288v == null) {
                this.f23288v = new HashSet();
            }
            for (Migration migration : migrations) {
                HashSet hashSet = this.f23288v;
                Intrinsics.checkNotNull(hashSet);
                hashSet.add(Integer.valueOf(migration.startVersion));
                HashSet hashSet2 = this.f23288v;
                Intrinsics.checkNotNull(hashSet2);
                hashSet2.add(Integer.valueOf(migration.endVersion));
            }
            this.f23286t.addMigrations((Migration[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        @NotNull
        public Builder<T> addTypeConverter(@NotNull Object typeConverter) {
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            this.f23275h.add(typeConverter);
            return this;
        }

        @NotNull
        public Builder<T> allowMainThreadQueries() {
            this.m = true;
            return this;
        }

        @NotNull
        public T build() {
            SupportSQLiteOpenHelper.Factory queryInterceptorOpenHelperFactory;
            Executor executor = this.f23277j;
            if (executor == null && this.f23278k == null) {
                Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
                this.f23278k = iOThreadExecutor;
                this.f23277j = iOThreadExecutor;
            } else if (executor != null && this.f23278k == null) {
                this.f23278k = executor;
            } else if (executor == null) {
                this.f23277j = this.f23278k;
            }
            HashSet hashSet = this.f23288v;
            LinkedHashSet linkedHashSet = this.f23287u;
            if (hashSet != null) {
                Intrinsics.checkNotNull(hashSet);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!(!linkedHashSet.contains(Integer.valueOf(iIntValue)))) {
                        throw new IllegalArgumentException(g0.c("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", iIntValue).toString());
                    }
                }
            }
            SupportSQLiteOpenHelper.Factory sQLiteCopyOpenHelperFactory = this.f23279l;
            if (sQLiteCopyOpenHelperFactory == null) {
                sQLiteCopyOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            }
            long j10 = this.f23284r;
            String str = this.f23270c;
            if (j10 > 0) {
                if (str == null) {
                    throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                }
                long j11 = this.f23284r;
                TimeUnit timeUnit = this.f23285s;
                if (timeUnit == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                Executor executor2 = this.f23277j;
                if (executor2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                sQLiteCopyOpenHelperFactory = new AutoClosingRoomOpenHelperFactory(sQLiteCopyOpenHelperFactory, new AutoCloser(j11, timeUnit, executor2));
            }
            String str2 = this.f23289w;
            if (str2 != null || this.f23290x != null || this.f23291y != null) {
                if (str == null) {
                    throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                }
                int i10 = str2 == null ? 0 : 1;
                File file = this.f23290x;
                int i11 = file == null ? 0 : 1;
                Callable<InputStream> callable = this.f23291y;
                if (i10 + i11 + (callable != null ? 1 : 0) != 1) {
                    throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                }
                sQLiteCopyOpenHelperFactory = new SQLiteCopyOpenHelperFactory(str2, file, callable, sQLiteCopyOpenHelperFactory);
            }
            QueryCallback queryCallback = this.f23273f;
            if (queryCallback != null) {
                Executor executor3 = this.f23274g;
                if (executor3 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                queryInterceptorOpenHelperFactory = new QueryInterceptorOpenHelperFactory(sQLiteCopyOpenHelperFactory, executor3, queryCallback);
            } else {
                queryInterceptorOpenHelperFactory = sQLiteCopyOpenHelperFactory;
            }
            Context context = this.f23268a;
            String str3 = this.f23270c;
            MigrationContainer migrationContainer = this.f23286t;
            ArrayList arrayList = this.f23271d;
            boolean z10 = this.m;
            JournalMode journalModeResolve$room_runtime_release = this.f23280n.resolve$room_runtime_release(context);
            Executor executor4 = this.f23277j;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Executor executor5 = this.f23278k;
            if (executor5 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, str3, queryInterceptorOpenHelperFactory, migrationContainer, arrayList, z10, journalModeResolve$room_runtime_release, executor4, executor5, this.f23281o, this.f23282p, this.f23283q, linkedHashSet, this.f23289w, this.f23290x, this.f23291y, this.f23272e, this.f23275h, this.f23276i);
            T t10 = (T) Room.getGeneratedImplementation(this.f23269b, "_Impl");
            t10.init(databaseConfiguration);
            return t10;
        }

        @NotNull
        public Builder<T> createFromAsset(@NotNull String databaseFilePath) {
            Intrinsics.checkNotNullParameter(databaseFilePath, "databaseFilePath");
            this.f23289w = databaseFilePath;
            return this;
        }

        @NotNull
        public Builder<T> createFromFile(@NotNull File databaseFile) {
            Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
            this.f23290x = databaseFile;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NotNull
        public Builder<T> createFromInputStream(@NotNull Callable<InputStream> inputStreamCallable) {
            Intrinsics.checkNotNullParameter(inputStreamCallable, "inputStreamCallable");
            this.f23291y = inputStreamCallable;
            return this;
        }

        @NotNull
        public Builder<T> enableMultiInstanceInvalidation() {
            this.f23281o = this.f23270c != null ? new Intent(this.f23268a, (Class<?>) MultiInstanceInvalidationService.class) : null;
            return this;
        }

        @NotNull
        public Builder<T> fallbackToDestructiveMigration() {
            this.f23282p = false;
            this.f23283q = true;
            return this;
        }

        @NotNull
        public Builder<T> fallbackToDestructiveMigrationFrom(@NotNull int... startVersions) {
            Intrinsics.checkNotNullParameter(startVersions, "startVersions");
            for (int i10 : startVersions) {
                this.f23287u.add(Integer.valueOf(i10));
            }
            return this;
        }

        @NotNull
        public Builder<T> fallbackToDestructiveMigrationOnDowngrade() {
            this.f23282p = true;
            this.f23283q = true;
            return this;
        }

        @NotNull
        public Builder<T> openHelperFactory(@Nullable SupportSQLiteOpenHelper.Factory factory) {
            this.f23279l = factory;
            return this;
        }

        @ExperimentalRoomApi
        @NotNull
        public Builder<T> setAutoCloseTimeout(@IntRange(from = 0) long autoCloseTimeout, @NotNull TimeUnit autoCloseTimeUnit) {
            Intrinsics.checkNotNullParameter(autoCloseTimeUnit, "autoCloseTimeUnit");
            if (autoCloseTimeout < 0) {
                throw new IllegalArgumentException("autoCloseTimeout must be >= 0".toString());
            }
            this.f23284r = autoCloseTimeout;
            this.f23285s = autoCloseTimeUnit;
            return this;
        }

        @NotNull
        public Builder<T> setJournalMode(@NotNull JournalMode journalMode) {
            Intrinsics.checkNotNullParameter(journalMode, "journalMode");
            this.f23280n = journalMode;
            return this;
        }

        @ExperimentalRoomApi
        @NotNull
        public Builder<T> setMultiInstanceInvalidationServiceIntent(@NotNull Intent invalidationServiceIntent) {
            Intrinsics.checkNotNullParameter(invalidationServiceIntent, "invalidationServiceIntent");
            if (this.f23270c == null) {
                invalidationServiceIntent = null;
            }
            this.f23281o = invalidationServiceIntent;
            return this;
        }

        @NotNull
        public Builder<T> setQueryCallback(@NotNull QueryCallback queryCallback, @NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f23273f = queryCallback;
            this.f23274g = executor;
            return this;
        }

        @NotNull
        public Builder<T> setQueryExecutor(@NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f23277j = executor;
            return this;
        }

        @NotNull
        public Builder<T> setTransactionExecutor(@NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f23278k = executor;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NotNull
        public Builder<T> createFromAsset(@NotNull String databaseFilePath, @NotNull PrepackagedDatabaseCallback callback) {
            Intrinsics.checkNotNullParameter(databaseFilePath, "databaseFilePath");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f23272e = callback;
            this.f23289w = databaseFilePath;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "StreamFiles"})
        @NotNull
        public Builder<T> createFromFile(@NotNull File databaseFile, @NotNull PrepackagedDatabaseCallback callback) {
            Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f23272e = callback;
            this.f23290x = databaseFile;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "LambdaLast"})
        @NotNull
        public Builder<T> createFromInputStream(@NotNull Callable<InputStream> inputStreamCallable, @NotNull PrepackagedDatabaseCallback callback) {
            Intrinsics.checkNotNullParameter(inputStreamCallable, "inputStreamCallable");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f23272e = callback;
            this.f23291y = inputStreamCallable;
            return this;
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Landroidx/room/RoomDatabase$Callback;", "", "()V", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "onDestructiveMigration", "onOpen", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Callback {
        public void onCreate(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void onDestructiveMigration(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void onOpen(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "Landroid/content/Context;", "context", "resolve$room_runtime_release", "(Landroid/content/Context;)Landroidx/room/RoomDatabase$JournalMode;", "resolve", "AUTOMATIC", "TRUNCATE", "WRITE_AHEAD_LOGGING", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class JournalMode {
        private static final /* synthetic */ JournalMode[] $VALUES;
        public static final JournalMode AUTOMATIC;
        public static final JournalMode TRUNCATE;
        public static final JournalMode WRITE_AHEAD_LOGGING;

        static {
            JournalMode journalMode = new JournalMode("AUTOMATIC", 0);
            AUTOMATIC = journalMode;
            JournalMode journalMode2 = new JournalMode("TRUNCATE", 1);
            TRUNCATE = journalMode2;
            JournalMode journalMode3 = new JournalMode("WRITE_AHEAD_LOGGING", 2);
            WRITE_AHEAD_LOGGING = journalMode3;
            $VALUES = new JournalMode[]{journalMode, journalMode2, journalMode3};
        }

        public JournalMode() {
            throw null;
        }

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) $VALUES.clone();
        }

        @NotNull
        public final JournalMode resolve$room_runtime_release(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID);
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || SupportSQLiteCompat.Api19Impl.isLowRamDevice(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "", "()V", "onOpenPrepackagedDatabase", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class PrepackagedDatabaseCallback {
        public void onOpenPrepackagedDatabase(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/room/RoomDatabase$QueryCallback;", "", "onQuery", "", "sqlQuery", "", "bindArgs", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface QueryCallback {
        void onQuery(@NotNull String sqlQuery, @NotNull List<? extends Object> bindArgs);
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    public static final class a extends Lambda implements Function1<SupportSQLiteDatabase, Object> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteDatabase it = supportSQLiteDatabase;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomDatabase.this.internalBeginTransaction();
            return null;
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    public static final class b extends Lambda implements Function1<SupportSQLiteDatabase, Object> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteDatabase it = supportSQLiteDatabase;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomDatabase.this.internalEndTransaction();
            return null;
        }
    }

    public RoomDatabase() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = mapSynchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalBeginTransaction() {
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = getOpenHelper().getWritableDatabase();
        getInvalidationTracker().syncTriggers$room_runtime_release(writableDatabase);
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().endTransaction();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().refreshVersionsAsync();
    }

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return roomDatabase.query(supportSQLiteQuery, cancellationSignal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T unwrapOpenHelper(Class<T> clazz, SupportSQLiteOpenHelper openHelper) {
        if (clazz.isInstance(openHelper)) {
            return openHelper;
        }
        if (openHelper instanceof DelegatingOpenHelper) {
            return (T) unwrapOpenHelper(clazz, ((DelegatingOpenHelper) openHelper).getDelegate());
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && !(!isMainThread$room_runtime_release())) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    @Deprecated(message = "beginTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void beginTransaction() {
        assertNotMainThread();
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalBeginTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new a());
        }
    }

    @WorkerThread
    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            Intrinsics.checkNotNullExpressionValue(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().stopMultiInstanceInvalidation$room_runtime_release();
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    @NotNull
    public SupportSQLiteStatement compileStatement(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().compileStatement(sql);
    }

    @NotNull
    public abstract InvalidationTracker createInvalidationTracker();

    @NotNull
    public abstract SupportSQLiteOpenHelper createOpenHelper(@NotNull DatabaseConfiguration config);

    @Deprecated(message = "endTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void endTransaction() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalEndTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new b());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @JvmSuppressWildcards
    @NotNull
    public List<Migration> getAutoMigrations(@NotNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    @NotNull
    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock lock = this.readWriteLock.readLock();
        Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
        return lock;
    }

    @NotNull
    public InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @NotNull
    public SupportSQLiteOpenHelper getOpenHelper() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.internalOpenHelper;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalOpenHelper");
        return null;
    }

    @NotNull
    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return w.emptySet();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return q.emptyMap();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    @NotNull
    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
        return null;
    }

    @Nullable
    public <T> T getTypeConverter(@NotNull Class<T> klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (T) this.typeConverters.get(klass);
    }

    public boolean inTransaction() {
        return getOpenHelper().getWritableDatabase().inTransaction();
    }

    @CallSuper
    public void init(@NotNull DatabaseConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.internalOpenHelper = createOpenHelper(configuration);
        Set<Class<? extends AutoMigrationSpec>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends AutoMigrationSpec>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class<? extends AutoMigrationSpec> next = it.next();
                int size = configuration.autoMigrationSpecs.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (next.isAssignableFrom(configuration.autoMigrationSpecs.get(size).getClass())) {
                            bitSet.set(size);
                            i10 = size;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                if (i10 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, configuration.autoMigrationSpecs.get(i10));
            } else {
                int size2 = configuration.autoMigrationSpecs.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        }
                        if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                Iterator<Migration> it2 = getAutoMigrations(this.autoMigrationSpecs).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Migration next2 = it2.next();
                    if (!configuration.migrationContainer.contains(next2.startVersion, next2.endVersion)) {
                        configuration.migrationContainer.addMigrations(next2);
                    }
                }
                SQLiteCopyOpenHelper sQLiteCopyOpenHelper = (SQLiteCopyOpenHelper) unwrapOpenHelper(SQLiteCopyOpenHelper.class, getOpenHelper());
                if (sQLiteCopyOpenHelper != null) {
                    sQLiteCopyOpenHelper.setDatabaseConfiguration(configuration);
                }
                AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) unwrapOpenHelper(AutoClosingRoomOpenHelper.class, getOpenHelper());
                if (autoClosingRoomOpenHelper != null) {
                    this.autoCloser = autoClosingRoomOpenHelper.autoCloser;
                    getInvalidationTracker().setAutoCloser$room_runtime_release(autoClosingRoomOpenHelper.autoCloser);
                }
                boolean z10 = configuration.journalMode == JournalMode.WRITE_AHEAD_LOGGING;
                getOpenHelper().setWriteAheadLoggingEnabled(z10);
                this.mCallbacks = configuration.callbacks;
                this.internalQueryExecutor = configuration.queryExecutor;
                this.internalTransactionExecutor = new TransactionExecutor(configuration.transactionExecutor);
                this.allowMainThreadQueries = configuration.allowMainThreadQueries;
                this.writeAheadLoggingEnabled = z10;
                if (configuration.multiInstanceInvalidationServiceIntent != null) {
                    if (configuration.name == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    getInvalidationTracker().startMultiInstanceInvalidation$room_runtime_release(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = configuration.typeConverters.size() - 1;
                        if (size3 < 0) {
                            size3 = -1;
                            break;
                        }
                        while (true) {
                            int i13 = size3 - 1;
                            if (cls.isAssignableFrom(configuration.typeConverters.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else {
                                if (i13 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i13;
                            }
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.typeConverters.put(cls, configuration.typeConverters.get(size3));
                    }
                }
                int size4 = configuration.typeConverters.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i14 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException(j.b("Unexpected type converter ", configuration.typeConverters.get(size4), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."));
                    }
                    if (i14 < 0) {
                        return;
                    } else {
                        size4 = i14;
                    }
                }
            }
        }
    }

    public void internalInitInvalidationTracker(@NotNull SupportSQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        getInvalidationTracker().internalInit$room_runtime_release(db2);
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        Boolean boolValueOf;
        boolean zIsOpen;
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
            if (supportSQLiteDatabase != null) {
                zIsOpen = supportSQLiteDatabase.isOpen();
            } else {
                boolValueOf = null;
            }
            return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
        }
        zIsOpen = autoCloser.isActive();
        boolValueOf = Boolean.valueOf(zIsOpen);
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isOpenInternal() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    @JvmOverloads
    @NotNull
    public final Cursor query(@NotNull SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(@NotNull Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setAutoMigrationSpecs(@NotNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    @Deprecated(message = "setTransactionSuccessful() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }

    @NotNull
    public Cursor query(@NotNull String query, @Nullable Object[] args) {
        Intrinsics.checkNotNullParameter(query, "query");
        return getOpenHelper().getWritableDatabase().query(new SimpleSQLiteQuery(query, args));
    }

    /* JADX INFO: compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016J \u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t0\tH\u0016J \u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0016\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n¨\u0006\u0015"}, d2 = {"Landroidx/room/RoomDatabase$MigrationContainer;", "", "", "Landroidx/room/migration/Migration;", "migrations", "", "addMigrations", "([Landroidx/room/migration/Migration;)V", "", "", "", "getMigrations", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "findMigrationPath", "startVersion", "endVersion", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$MigrationContainer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1548:1\n13579#2,2:1549\n1855#3,2:1551\n361#4,7:1553\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$MigrationContainer\n*L\n1371#1:1549,2\n1381#1:1551,2\n1387#1:1553,7\n*E\n"})
    public static class MigrationContainer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final LinkedHashMap f23292a = new LinkedHashMap();

        public final void a(Migration migration) {
            int i10 = migration.startVersion;
            int i11 = migration.endVersion;
            LinkedHashMap linkedHashMap = this.f23292a;
            Integer numValueOf = Integer.valueOf(i10);
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w(Room.LOG_TAG, "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i11), migration);
        }

        public void addMigrations(@NotNull List<? extends Migration> migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            Iterator<T> it = migrations.iterator();
            while (it.hasNext()) {
                a((Migration) it.next());
            }
        }

        public final boolean contains(int startVersion, int endVersion) {
            Map<Integer, Map<Integer, Migration>> migrations = getMigrations();
            if (!migrations.containsKey(Integer.valueOf(startVersion))) {
                return false;
            }
            Map<Integer, Migration> mapEmptyMap = migrations.get(Integer.valueOf(startVersion));
            if (mapEmptyMap == null) {
                mapEmptyMap = q.emptyMap();
            }
            return mapEmptyMap.containsKey(Integer.valueOf(endVersion));
        }

        @Nullable
        public List<Migration> findMigrationPath(int start, int end) {
            boolean z10;
            if (start == end) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            boolean z11 = end > start;
            ArrayList arrayList = new ArrayList();
            do {
                if (z11) {
                    if (start >= end) {
                        return arrayList;
                    }
                } else if (start <= end) {
                    return arrayList;
                }
                TreeMap treeMap = (TreeMap) this.f23292a.get(Integer.valueOf(start));
                if (treeMap == null) {
                    break;
                }
                Iterator it = (z11 ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    Integer targetVersion = (Integer) it.next();
                    if (!z11) {
                        Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                        int iIntValue = targetVersion.intValue();
                        if (end <= iIntValue && iIntValue < start) {
                            Object obj = treeMap.get(targetVersion);
                            Intrinsics.checkNotNull(obj);
                            arrayList.add(obj);
                            start = targetVersion.intValue();
                            z10 = true;
                            break;
                            break;
                        }
                    } else {
                        int i10 = start + 1;
                        Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                        int iIntValue2 = targetVersion.intValue();
                        if (i10 <= iIntValue2 && iIntValue2 <= end) {
                            Object obj2 = treeMap.get(targetVersion);
                            Intrinsics.checkNotNull(obj2);
                            arrayList.add(obj2);
                            start = targetVersion.intValue();
                            z10 = true;
                            break;
                        }
                    }
                }
            } while (z10);
            return null;
        }

        @NotNull
        public Map<Integer, Map<Integer, Migration>> getMigrations() {
            return this.f23292a;
        }

        public void addMigrations(@NotNull Migration... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (Migration migration : migrations) {
                a(migration);
            }
        }
    }

    @JvmOverloads
    @NotNull
    public Cursor query(@NotNull SupportSQLiteQuery query, @Nullable CancellationSignal signal) {
        Intrinsics.checkNotNullParameter(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (signal != null) {
            return getOpenHelper().getWritableDatabase().query(query, signal);
        }
        return getOpenHelper().getWritableDatabase().query(query);
    }

    public <V> V runInTransaction(@NotNull Callable<V> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            V vCall = body.call();
            setTransactionSuccessful();
            return vCall;
        } finally {
            endTransaction();
        }
    }

    @Deprecated(message = "Will be hidden in a future release.")
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @Deprecated(message = "Will be hidden in the next release.")
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }
}
