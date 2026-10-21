package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.google.android.gms.actions.SearchIntents;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001c\u001d\u001eB\u0017\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\b\u0010\u0007\u001a\u00020\u0005H\u0016R\u001a\u0010\f\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001f"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "", "enabled", "", "setWriteAheadLoggingEnabled", HearingDisabilitiesConstants.CLOSE_MODAL, "p0", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "delegate", "Landroidx/room/AutoCloser;", "autoCloser", "Landroidx/room/AutoCloser;", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getReadableDatabase", "readableDatabase", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;Landroidx/room/AutoCloser;)V", "AutoClosingSupportSQLiteDatabase", "a", "b", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
public final class AutoClosingRoomOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    @JvmField
    @NotNull
    public final AutoCloser autoCloser;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SupportSQLiteOpenHelper delegate;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final AutoClosingSupportSQLiteDatabase f23121q0;

    /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010U\u001a\u00020T¢\u0006\u0004\bV\u0010WJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J)\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00042\u0010\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001cJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001dH\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017J \u0010%\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016J5\u0010(\u001a\u00020!2\u0006\u0010 \u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u00042\u0012\u0010'\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0019H\u0016¢\u0006\u0004\b(\u0010)JE\u0010*\u001a\u00020!2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010\u00042\u0012\u0010'\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0019H\u0016¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J)\u0010,\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0019H\u0016¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020!H\u0016J\u0010\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0010\u00104\u001a\u00020\u00022\u0006\u00103\u001a\u00020!H\u0016J\u0010\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0010H\u0017J\b\u00107\u001a\u00020\u0010H\u0016J\b\u00108\u001a\u00020\u0002H\u0016J\b\u00109\u001a\u00020\u0002H\u0016R\u0014\u0010:\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R$\u0010<\u001a\u00020!2\u0006\u0010<\u001a\u00020!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR$\u0010G\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bD\u0010B\"\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010;R\u0014\u0010I\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010;R\u0016\u0010L\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010;R(\u0010R\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040O\u0018\u00010N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010;¨\u0006X"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "pokeOpen", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "beginTransaction", "beginTransactionNonExclusive", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "beginTransactionWithListener", "beginTransactionWithListenerNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "yieldIfContendedSafely", "", "sleepAfterYieldDelayMillis", "numBytes", "setMaximumSize", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "", "", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroid/os/CancellationSignal;", "cancellationSignal", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "insert", "whereClause", "whereArgs", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "(Ljava/lang/String;[Ljava/lang/Object;)V", "newVersion", "needUpgrade", "Ljava/util/Locale;", "locale", "setLocale", "cacheSize", "setMaxSqlCacheSize", "enabled", "setForeignKeyConstraintsEnabled", "enableWriteAheadLogging", "disableWriteAheadLogging", HearingDisabilitiesConstants.CLOSE_MODAL, "isDbLockedByCurrentThread", "()Z", "version", "getVersion", "()I", "setVersion", "(I)V", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "Landroidx/room/AutoCloser;", "autoCloser", "<init>", "(Landroidx/room/AutoCloser;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final AutoCloser f23122p0;

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class a extends Lambda implements Function1<SupportSQLiteDatabase, List<? extends Pair<String, String>>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f23123p0 = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final List<? extends Pair<String, String>> invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase obj = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.getAttachedDbs();
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class b extends Lambda implements Function1<SupportSQLiteDatabase, Integer> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ String f23124p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ String f23125q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Object[] f23126r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, String str2, Object[] objArr) {
                super(1);
                this.f23124p0 = str;
                this.f23125q0 = str2;
                this.f23126r0 = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase db2 = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(db2, "db");
                return Integer.valueOf(db2.delete(this.f23124p0, this.f23125q0, this.f23126r0));
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class c extends Lambda implements Function1<SupportSQLiteDatabase, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ String f23127p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super(1);
                this.f23127p0 = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase db2 = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.execSQL(this.f23127p0);
                return null;
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class d extends Lambda implements Function1<SupportSQLiteDatabase, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ String f23128p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Object[] f23129q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, Object[] objArr) {
                super(1);
                this.f23128p0 = str;
                this.f23129q0 = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase db2 = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.execSQL(this.f23128p0, this.f23129q0);
                return null;
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public /* synthetic */ class e extends FunctionReferenceImpl implements Function1<SupportSQLiteDatabase, Boolean> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final e f23130p0 = new e();

            public e() {
                super(1, SupportSQLiteDatabase.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase p4 = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(p4, "p0");
                return Boolean.valueOf(p4.inTransaction());
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class f extends Lambda implements Function1<SupportSQLiteDatabase, Long> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ String f23131p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ int f23132q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ ContentValues f23133r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String str, int i10, ContentValues contentValues) {
                super(1);
                this.f23131p0 = str;
                this.f23132q0 = i10;
                this.f23133r0 = contentValues;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Long invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase db2 = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(db2, "db");
                return Long.valueOf(db2.insert(this.f23131p0, this.f23132q0, this.f23133r0));
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class g extends Lambda implements Function1<SupportSQLiteDatabase, Boolean> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final g f23134p0 = new g(1);

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase obj = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Boolean.valueOf(obj.isDatabaseIntegrityOk());
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class i extends Lambda implements Function1<SupportSQLiteDatabase, Boolean> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final i f23136p0 = new i(1);

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase obj = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Boolean.valueOf(obj.isReadOnly());
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class j extends Lambda implements Function1<SupportSQLiteDatabase, Boolean> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final j f23137p0 = new j(1);

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase db2 = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(db2, "db");
                return Boolean.valueOf(db2.isWriteAheadLoggingEnabled());
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class l extends Lambda implements Function1<SupportSQLiteDatabase, Boolean> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ int f23139p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(int i10) {
                super(1);
                this.f23139p0 = i10;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase db2 = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(db2, "db");
                return Boolean.valueOf(db2.needUpgrade(this.f23139p0));
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class n extends Lambda implements Function1<SupportSQLiteDatabase, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ long f23141p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(long j10) {
                super(1);
                this.f23141p0 = j10;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase db2 = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.setPageSize(this.f23141p0);
                return null;
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class o extends Lambda implements Function1<SupportSQLiteDatabase, String> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final o f23142p0 = new o(1);

            @Override // kotlin.jvm.functions.Function1
            public final String invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase obj = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.getPath();
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class p extends Lambda implements Function1<SupportSQLiteDatabase, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final p f23143p0 = new p(1);

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase it = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(it, "it");
                return null;
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class q extends Lambda implements Function1<SupportSQLiteDatabase, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ boolean f23144p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public q(boolean z10) {
                super(1);
                this.f23144p0 = z10;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase db2 = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.setForeignKeyConstraintsEnabled(this.f23144p0);
                return null;
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class r extends Lambda implements Function1<SupportSQLiteDatabase, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Locale f23145p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public r(Locale locale) {
                super(1);
                this.f23145p0 = locale;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase db2 = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.setLocale(this.f23145p0);
                return null;
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class s extends Lambda implements Function1<SupportSQLiteDatabase, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ int f23146p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public s(int i10) {
                super(1);
                this.f23146p0 = i10;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase db2 = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.setMaxSqlCacheSize(this.f23146p0);
                return null;
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class t extends Lambda implements Function1<SupportSQLiteDatabase, Long> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ long f23147p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public t(long j10) {
                super(1);
                this.f23147p0 = j10;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Long invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase db2 = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(db2, "db");
                return Long.valueOf(db2.setMaximumSize(this.f23147p0));
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class u extends Lambda implements Function1<SupportSQLiteDatabase, Integer> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ String f23148p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ int f23149q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ ContentValues f23150r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ String f23151s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ Object[] f23152t0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public u(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f23148p0 = str;
                this.f23149q0 = i10;
                this.f23150r0 = contentValues;
                this.f23151s0 = str2;
                this.f23152t0 = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase db2 = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(db2, "db");
                return Integer.valueOf(db2.update(this.f23148p0, this.f23149q0, this.f23150r0, this.f23151s0, this.f23152t0));
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class w extends Lambda implements Function1<SupportSQLiteDatabase, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ int f23154p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public w(int i10) {
                super(1);
                this.f23154p0 = i10;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase db2 = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.setVersion(this.f23154p0);
                return null;
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public /* synthetic */ class x extends FunctionReferenceImpl implements Function1<SupportSQLiteDatabase, Boolean> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final x f23155p0 = new x();

            public x() {
                super(1, SupportSQLiteDatabase.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase p4 = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(p4, "p0");
                return Boolean.valueOf(p4.yieldIfContendedSafely());
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public /* synthetic */ class y extends FunctionReferenceImpl implements Function1<SupportSQLiteDatabase, Boolean> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final y f23156p0 = new y();

            public y() {
                super(1, SupportSQLiteDatabase.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase p4 = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(p4, "p0");
                return Boolean.valueOf(p4.yieldIfContendedSafely());
            }
        }

        public AutoClosingSupportSQLiteDatabase(@NotNull AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f23122p0 = autoCloser;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransaction() {
            AutoCloser autoCloser = this.f23122p0;
            try {
                autoCloser.incrementCountAndEnsureDbIsOpen().beginTransaction();
            } catch (Throwable th2) {
                autoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionNonExclusive() {
            AutoCloser autoCloser = this.f23122p0;
            try {
                autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionNonExclusive();
            } catch (Throwable th2) {
                autoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionWithListener(@NotNull SQLiteTransactionListener transactionListener) {
            Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
            AutoCloser autoCloser = this.f23122p0;
            try {
                autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListener(transactionListener);
            } catch (Throwable th2) {
                autoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionWithListenerNonExclusive(@NotNull SQLiteTransactionListener transactionListener) {
            Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
            AutoCloser autoCloser = this.f23122p0;
            try {
                autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListenerNonExclusive(transactionListener);
            } catch (Throwable th2) {
                autoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f23122p0.closeDatabaseIfOpen();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @NotNull
        public SupportSQLiteStatement compileStatement(@NotNull String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            return new a(sql, this.f23122p0);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int delete(@NotNull String table, @Nullable String whereClause, @Nullable Object[] whereArgs) {
            Intrinsics.checkNotNullParameter(table, "table");
            return ((Number) this.f23122p0.executeRefCountingFunction(new b(table, whereClause, whereArgs))).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void disableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean enableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void endTransaction() {
            AutoCloser autoCloser = this.f23122p0;
            if (autoCloser.getDelegateDatabase() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null".toString());
            }
            try {
                SupportSQLiteDatabase delegateDatabase = autoCloser.getDelegateDatabase();
                Intrinsics.checkNotNull(delegateDatabase);
                delegateDatabase.endTransaction();
            } finally {
                autoCloser.decrementCountAndScheduleClose();
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final /* synthetic */ void execPerConnectionSQL(String str, Object[] objArr) {
            e3.a.a(this, str, objArr);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(@NotNull String sql) throws SQLException {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.f23122p0.executeRefCountingFunction(new c(sql));
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @Nullable
        public List<Pair<String, String>> getAttachedDbs() {
            return (List) this.f23122p0.executeRefCountingFunction(a.f23123p0);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long getMaximumSize() {
            return ((Number) this.f23122p0.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.k
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                @Nullable
                public final Object get(@Nullable Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).getMaximumSize());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long getPageSize() {
            return ((Number) this.f23122p0.executeRefCountingFunction(new MutablePropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.m
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                @Nullable
                public final Object get(@Nullable Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).getPageSize());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                public final void set(@Nullable Object obj, @Nullable Object obj2) {
                    ((SupportSQLiteDatabase) obj).setPageSize(((Number) obj2).longValue());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @Nullable
        public String getPath() {
            return (String) this.f23122p0.executeRefCountingFunction(o.f23142p0);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int getVersion() {
            return ((Number) this.f23122p0.executeRefCountingFunction(new MutablePropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.v
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                @Nullable
                public final Object get(@Nullable Object obj) {
                    return Integer.valueOf(((SupportSQLiteDatabase) obj).getVersion());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                public final void set(@Nullable Object obj, @Nullable Object obj2) {
                    ((SupportSQLiteDatabase) obj).setVersion(((Number) obj2).intValue());
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean inTransaction() {
            AutoCloser autoCloser = this.f23122p0;
            if (autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) autoCloser.executeRefCountingFunction(e.f23130p0)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long insert(@NotNull String table, int conflictAlgorithm, @NotNull ContentValues values) throws SQLException {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.f23122p0.executeRefCountingFunction(new f(table, conflictAlgorithm, values))).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDatabaseIntegrityOk() {
            return ((Boolean) this.f23122p0.executeRefCountingFunction(g.f23134p0)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDbLockedByCurrentThread() {
            AutoCloser autoCloser = this.f23122p0;
            if (autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.h
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                @Nullable
                public final Object get(@Nullable Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDbLockedByCurrentThread());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final /* synthetic */ boolean isExecPerConnectionSQLSupported() {
            return e3.a.b(this);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isOpen() {
            SupportSQLiteDatabase delegateDatabase = this.f23122p0.getDelegateDatabase();
            if (delegateDatabase == null) {
                return false;
            }
            return delegateDatabase.isOpen();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isReadOnly() {
            return ((Boolean) this.f23122p0.executeRefCountingFunction(i.f23136p0)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @RequiresApi(api = 16)
        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.f23122p0.executeRefCountingFunction(j.f23137p0)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean needUpgrade(int newVersion) {
            return ((Boolean) this.f23122p0.executeRefCountingFunction(new l(newVersion))).booleanValue();
        }

        public final void pokeOpen() {
            this.f23122p0.executeRefCountingFunction(p.f23143p0);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @NotNull
        public Cursor query(@NotNull String query) {
            AutoCloser autoCloser = this.f23122p0;
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new b(autoCloser.incrementCountAndEnsureDbIsOpen().query(query), autoCloser);
            } catch (Throwable th2) {
                autoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @RequiresApi(api = 16)
        public void setForeignKeyConstraintsEnabled(boolean enabled) {
            this.f23122p0.executeRefCountingFunction(new q(enabled));
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setLocale(@NotNull Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            this.f23122p0.executeRefCountingFunction(new r(locale));
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setMaxSqlCacheSize(int cacheSize) {
            this.f23122p0.executeRefCountingFunction(new s(cacheSize));
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long setMaximumSize(long numBytes) {
            return ((Number) this.f23122p0.executeRefCountingFunction(new t(numBytes))).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setPageSize(long j10) {
            this.f23122p0.executeRefCountingFunction(new n(j10));
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setTransactionSuccessful() {
            Unit unit;
            SupportSQLiteDatabase delegateDatabase = this.f23122p0.getDelegateDatabase();
            if (delegateDatabase != null) {
                delegateDatabase.setTransactionSuccessful();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setVersion(int i10) {
            this.f23122p0.executeRefCountingFunction(new w(i10));
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int update(@NotNull String table, int conflictAlgorithm, @NotNull ContentValues values, @Nullable String whereClause, @Nullable Object[] whereArgs) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.f23122p0.executeRefCountingFunction(new u(table, conflictAlgorithm, values, whereClause, whereArgs))).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely() {
            return ((Boolean) this.f23122p0.executeRefCountingFunction(x.f23155p0)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(@NotNull String sql, @NotNull Object[] bindArgs) throws SQLException {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.f23122p0.executeRefCountingFunction(new d(sql, bindArgs));
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely(long sleepAfterYieldDelayMillis) {
            return ((Boolean) this.f23122p0.executeRefCountingFunction(y.f23156p0)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @NotNull
        public Cursor query(@NotNull String query, @NotNull Object[] bindArgs) {
            AutoCloser autoCloser = this.f23122p0;
            Intrinsics.checkNotNullParameter(query, "query");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            try {
                return new b(autoCloser.incrementCountAndEnsureDbIsOpen().query(query, bindArgs), autoCloser);
            } catch (Throwable th2) {
                autoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @NotNull
        public Cursor query(@NotNull SupportSQLiteQuery query) {
            AutoCloser autoCloser = this.f23122p0;
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new b(autoCloser.incrementCountAndEnsureDbIsOpen().query(query), autoCloser);
            } catch (Throwable th2) {
                autoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @RequiresApi(api = 24)
        @NotNull
        public Cursor query(@NotNull SupportSQLiteQuery query, @Nullable CancellationSignal cancellationSignal) {
            AutoCloser autoCloser = this.f23122p0;
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new b(autoCloser.incrementCountAndEnsureDbIsOpen().query(query, cancellationSignal), autoCloser);
            } catch (Throwable th2) {
                autoCloser.decrementCountAndScheduleClose();
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
    public static final class b implements Cursor {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final Cursor f23167p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final AutoCloser f23168q0;

        public b(@NotNull Cursor delegate, @NotNull AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f23167p0 = delegate;
            this.f23168q0 = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f23167p0.close();
            this.f23168q0.decrementCountAndScheduleClose();
        }

        @Override // android.database.Cursor
        public final void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f23167p0.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @Deprecated(message = "Deprecated in Java")
        public final void deactivate() {
            this.f23167p0.deactivate();
        }

        @Override // android.database.Cursor
        public final byte[] getBlob(int i10) {
            return this.f23167p0.getBlob(i10);
        }

        @Override // android.database.Cursor
        public final int getColumnCount() {
            return this.f23167p0.getColumnCount();
        }

        @Override // android.database.Cursor
        public final int getColumnIndex(String str) {
            return this.f23167p0.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public final int getColumnIndexOrThrow(String str) {
            return this.f23167p0.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public final String getColumnName(int i10) {
            return this.f23167p0.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public final String[] getColumnNames() {
            return this.f23167p0.getColumnNames();
        }

        @Override // android.database.Cursor
        public final int getCount() {
            return this.f23167p0.getCount();
        }

        @Override // android.database.Cursor
        public final double getDouble(int i10) {
            return this.f23167p0.getDouble(i10);
        }

        @Override // android.database.Cursor
        public final Bundle getExtras() {
            return this.f23167p0.getExtras();
        }

        @Override // android.database.Cursor
        public final float getFloat(int i10) {
            return this.f23167p0.getFloat(i10);
        }

        @Override // android.database.Cursor
        public final int getInt(int i10) {
            return this.f23167p0.getInt(i10);
        }

        @Override // android.database.Cursor
        public final long getLong(int i10) {
            return this.f23167p0.getLong(i10);
        }

        @Override // android.database.Cursor
        @RequiresApi(api = 19)
        @NotNull
        public final Uri getNotificationUri() {
            return SupportSQLiteCompat.Api19Impl.getNotificationUri(this.f23167p0);
        }

        @Override // android.database.Cursor
        @RequiresApi(api = 29)
        @NotNull
        public final List<Uri> getNotificationUris() {
            return SupportSQLiteCompat.Api29Impl.getNotificationUris(this.f23167p0);
        }

        @Override // android.database.Cursor
        public final int getPosition() {
            return this.f23167p0.getPosition();
        }

        @Override // android.database.Cursor
        public final short getShort(int i10) {
            return this.f23167p0.getShort(i10);
        }

        @Override // android.database.Cursor
        public final String getString(int i10) {
            return this.f23167p0.getString(i10);
        }

        @Override // android.database.Cursor
        public final int getType(int i10) {
            return this.f23167p0.getType(i10);
        }

        @Override // android.database.Cursor
        public final boolean getWantsAllOnMoveCalls() {
            return this.f23167p0.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public final boolean isAfterLast() {
            return this.f23167p0.isAfterLast();
        }

        @Override // android.database.Cursor
        public final boolean isBeforeFirst() {
            return this.f23167p0.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public final boolean isClosed() {
            return this.f23167p0.isClosed();
        }

        @Override // android.database.Cursor
        public final boolean isFirst() {
            return this.f23167p0.isFirst();
        }

        @Override // android.database.Cursor
        public final boolean isLast() {
            return this.f23167p0.isLast();
        }

        @Override // android.database.Cursor
        public final boolean isNull(int i10) {
            return this.f23167p0.isNull(i10);
        }

        @Override // android.database.Cursor
        public final boolean move(int i10) {
            return this.f23167p0.move(i10);
        }

        @Override // android.database.Cursor
        public final boolean moveToFirst() {
            return this.f23167p0.moveToFirst();
        }

        @Override // android.database.Cursor
        public final boolean moveToLast() {
            return this.f23167p0.moveToLast();
        }

        @Override // android.database.Cursor
        public final boolean moveToNext() {
            return this.f23167p0.moveToNext();
        }

        @Override // android.database.Cursor
        public final boolean moveToPosition(int i10) {
            return this.f23167p0.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public final boolean moveToPrevious() {
            return this.f23167p0.moveToPrevious();
        }

        @Override // android.database.Cursor
        public final void registerContentObserver(ContentObserver contentObserver) {
            this.f23167p0.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f23167p0.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @Deprecated(message = "Deprecated in Java")
        public final boolean requery() {
            return this.f23167p0.requery();
        }

        @Override // android.database.Cursor
        public final Bundle respond(Bundle bundle) {
            return this.f23167p0.respond(bundle);
        }

        @Override // android.database.Cursor
        @RequiresApi(api = 23)
        public final void setExtras(@NotNull Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            SupportSQLiteCompat.Api23Impl.setExtras(this.f23167p0, extras);
        }

        @Override // android.database.Cursor
        public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f23167p0.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        @RequiresApi(api = 29)
        public final void setNotificationUris(@NotNull ContentResolver cr, @NotNull List<? extends Uri> uris) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            SupportSQLiteCompat.Api29Impl.setNotificationUris(this.f23167p0, cr, uris);
        }

        @Override // android.database.Cursor
        public final void unregisterContentObserver(ContentObserver contentObserver) {
            this.f23167p0.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f23167p0.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public AutoClosingRoomOpenHelper(@NotNull SupportSQLiteOpenHelper delegate, @NotNull AutoCloser autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
        autoCloser.init(getDelegate());
        this.f23121q0 = new AutoClosingSupportSQLiteDatabase(autoCloser);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23121q0.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @Nullable
    /* JADX INFO: renamed from: getDatabaseName */
    public String getF23502q0() {
        return this.delegate.getF23502q0();
    }

    @Override // androidx.room.DelegatingOpenHelper
    @NotNull
    public SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 24)
    @NotNull
    public SupportSQLiteDatabase getReadableDatabase() {
        AutoClosingSupportSQLiteDatabase autoClosingSupportSQLiteDatabase = this.f23121q0;
        autoClosingSupportSQLiteDatabase.pokeOpen();
        return autoClosingSupportSQLiteDatabase;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 24)
    @NotNull
    public SupportSQLiteDatabase getWritableDatabase() {
        AutoClosingSupportSQLiteDatabase autoClosingSupportSQLiteDatabase = this.f23121q0;
        autoClosingSupportSQLiteDatabase.pokeOpen();
        return autoClosingSupportSQLiteDatabase;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }

    /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
    @SourceDebugExtension({"SMAP\nAutoClosingRoomOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoClosingRoomOpenHelper.kt\nandroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,571:1\n1864#2,3:572\n*S KotlinDebug\n*F\n+ 1 AutoClosingRoomOpenHelper.kt\nandroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement\n*L\n478#1:572,3\n*E\n"})
    public static final class a implements SupportSQLiteStatement {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final String f23157p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final AutoCloser f23158q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @NotNull
        public final ArrayList<Object> f23159r0;

        /* JADX INFO: renamed from: androidx.room.AutoClosingRoomOpenHelper$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class C0102a extends Lambda implements Function1<SupportSQLiteStatement, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final C0102a f23160p0 = new C0102a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(SupportSQLiteStatement supportSQLiteStatement) {
                SupportSQLiteStatement statement = supportSQLiteStatement;
                Intrinsics.checkNotNullParameter(statement, "statement");
                statement.execute();
                return null;
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class b extends Lambda implements Function1<SupportSQLiteStatement, Long> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final b f23161p0 = new b(1);

            @Override // kotlin.jvm.functions.Function1
            public final Long invoke(SupportSQLiteStatement supportSQLiteStatement) {
                SupportSQLiteStatement obj = supportSQLiteStatement;
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Long.valueOf(obj.executeInsert());
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class c<T> extends Lambda implements Function1<SupportSQLiteDatabase, T> {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Function1<SupportSQLiteStatement, T> f23163q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(Function1<? super SupportSQLiteStatement, ? extends T> function1) {
                super(1);
                this.f23163q0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase db2 = supportSQLiteDatabase;
                Intrinsics.checkNotNullParameter(db2, "db");
                a aVar = a.this;
                SupportSQLiteStatement supportSQLiteStatementCompileStatement = db2.compileStatement(aVar.f23157p0);
                ArrayList<Object> arrayList = aVar.f23159r0;
                Iterator<Object> it = arrayList.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    it.next();
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    Object obj = arrayList.get(i10);
                    if (obj == null) {
                        supportSQLiteStatementCompileStatement.bindNull(i11);
                    } else if (obj instanceof Long) {
                        supportSQLiteStatementCompileStatement.bindLong(i11, ((Number) obj).longValue());
                    } else if (obj instanceof Double) {
                        supportSQLiteStatementCompileStatement.bindDouble(i11, ((Number) obj).doubleValue());
                    } else if (obj instanceof String) {
                        supportSQLiteStatementCompileStatement.bindString(i11, (String) obj);
                    } else if (obj instanceof byte[]) {
                        supportSQLiteStatementCompileStatement.bindBlob(i11, (byte[]) obj);
                    }
                    i10 = i11;
                }
                return this.f23163q0.invoke(supportSQLiteStatementCompileStatement);
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class d extends Lambda implements Function1<SupportSQLiteStatement, Integer> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final d f23164p0 = new d(1);

            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(SupportSQLiteStatement supportSQLiteStatement) {
                SupportSQLiteStatement obj = supportSQLiteStatement;
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Integer.valueOf(obj.executeUpdateDelete());
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class e extends Lambda implements Function1<SupportSQLiteStatement, Long> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final e f23165p0 = new e(1);

            @Override // kotlin.jvm.functions.Function1
            public final Long invoke(SupportSQLiteStatement supportSQLiteStatement) {
                SupportSQLiteStatement obj = supportSQLiteStatement;
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Long.valueOf(obj.simpleQueryForLong());
            }
        }

        /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.kt */
        public static final class f extends Lambda implements Function1<SupportSQLiteStatement, String> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final f f23166p0 = new f(1);

            @Override // kotlin.jvm.functions.Function1
            public final String invoke(SupportSQLiteStatement supportSQLiteStatement) {
                SupportSQLiteStatement obj = supportSQLiteStatement;
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.simpleQueryForString();
            }
        }

        public a(@NotNull String sql, @NotNull AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f23157p0 = sql;
            this.f23158q0 = autoCloser;
            this.f23159r0 = new ArrayList<>();
        }

        public final <T> T a(Function1<? super SupportSQLiteStatement, ? extends T> function1) {
            return (T) this.f23158q0.executeRefCountingFunction(new c(function1));
        }

        public final void b(int i10, Object obj) {
            int size;
            int i11 = i10 - 1;
            ArrayList<Object> arrayList = this.f23159r0;
            if (i11 >= arrayList.size() && (size = arrayList.size()) <= i11) {
                while (true) {
                    arrayList.add(null);
                    if (size == i11) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            arrayList.set(i11, obj);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void bindBlob(int i10, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            b(i10, value);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void bindDouble(int i10, double d2) {
            b(i10, Double.valueOf(d2));
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void bindLong(int i10, long j10) {
            b(i10, Long.valueOf(j10));
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void bindNull(int i10) {
            b(i10, null);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void bindString(int i10, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            b(i10, value);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void clearBindings() {
            this.f23159r0.clear();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final void execute() {
            a(C0102a.f23160p0);
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final long executeInsert() {
            return ((Number) a(b.f23161p0)).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final int executeUpdateDelete() {
            return ((Number) a(d.f23164p0)).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final long simpleQueryForLong() {
            return ((Number) a(e.f23165p0)).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        @Nullable
        public final String simpleQueryForString() {
            return (String) a(f.f23166p0);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }
    }
}
