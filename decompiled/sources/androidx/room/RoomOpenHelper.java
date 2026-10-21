package androidx.room;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.collection.k;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RoomOpenHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0003\u0017\u0018\u0019B'\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015B!\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u001a"}, d2 = {"Landroidx/room/RoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "onConfigure", "onCreate", "", "oldVersion", "newVersion", "onUpgrade", "onDowngrade", "onOpen", "Landroidx/room/DatabaseConfiguration;", "configuration", "Landroidx/room/RoomOpenHelper$Delegate;", "delegate", "", "identityHash", "legacyHash", "<init>", "(Landroidx/room/DatabaseConfiguration;Landroidx/room/RoomOpenHelper$Delegate;Ljava/lang/String;Ljava/lang/String;)V", "(Landroidx/room/DatabaseConfiguration;Landroidx/room/RoomOpenHelper$Delegate;Ljava/lang/String;)V", "Companion", "Delegate", "ValidationResult", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension({"SMAP\nRoomOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,245:1\n1855#2,2:246\n145#3,7:248\n*S KotlinDebug\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper\n*L\n90#1:246,2\n137#1:248,7\n*E\n"})
public class RoomOpenHelper extends SupportSQLiteOpenHelper.Callback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public DatabaseConfiguration f23322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Delegate f23323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f23324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f23325d;

    /* JADX INFO: compiled from: RoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/room/RoomOpenHelper$Companion;", "", "()V", "hasEmptySchema", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "hasEmptySchema$room_runtime_release", "hasRoomMasterTable", "hasRoomMasterTable$room_runtime_release", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRoomOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper$Companion\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,245:1\n145#2,7:246\n145#2,7:253\n*S KotlinDebug\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper$Companion\n*L\n231#1:246,7\n239#1:253,7\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean hasEmptySchema$room_runtime_release(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            Cursor cursorQuery = db2.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z10 = false;
                if (cursorQuery.moveToFirst() && cursorQuery.getInt(0) == 0) {
                    z10 = true;
                }
                CloseableKt.closeFinally(cursorQuery, null);
                return z10;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(cursorQuery, th2);
                    throw th3;
                }
            }
        }

        public final boolean hasRoomMasterTable$room_runtime_release(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            Cursor cursorQuery = db2.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z10 = false;
                if (cursorQuery.moveToFirst() && cursorQuery.getInt(0) != 0) {
                    z10 = true;
                }
                CloseableKt.closeFinally(cursorQuery, null);
                return z10;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(cursorQuery, th2);
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: compiled from: RoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0015R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/room/RoomOpenHelper$Delegate;", "", "version", "", "(I)V", "createAllTables", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "dropAllTables", "onCreate", "onOpen", "onPostMigrate", "onPreMigrate", "onValidateSchema", "Landroidx/room/RoomOpenHelper$ValidationResult;", "validateMigration", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class Delegate {

        @JvmField
        public final int version;

        public Delegate(int i10) {
            this.version = i10;
        }

        public abstract void createAllTables(@NotNull SupportSQLiteDatabase db2);

        public abstract void dropAllTables(@NotNull SupportSQLiteDatabase db2);

        public abstract void onCreate(@NotNull SupportSQLiteDatabase db2);

        public abstract void onOpen(@NotNull SupportSQLiteDatabase db2);

        public void onPostMigrate(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void onPreMigrate(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        @NotNull
        public ValidationResult onValidateSchema(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            validateMigration(db2);
            return new ValidationResult(true, null);
        }

        @Deprecated(message = "Use [onValidateSchema(SupportSQLiteDatabase)]")
        public void validateMigration(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* JADX INFO: compiled from: RoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/room/RoomOpenHelper$ValidationResult;", "", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "expectedFoundMsg", "", "(ZLjava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class ValidationResult {

        @JvmField
        @Nullable
        public final String expectedFoundMsg;

        @JvmField
        public final boolean isValid;

        public ValidationResult(boolean z10, @Nullable String str) {
            this.isValid = z10;
            this.expectedFoundMsg = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(@NotNull DatabaseConfiguration configuration, @NotNull Delegate delegate, @NotNull String identityHash, @NotNull String legacyHash) {
        super(delegate.version);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
        this.f23322a = configuration;
        this.f23323b = delegate;
        this.f23324c = identityHash;
        this.f23325d = legacyHash;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onConfigure(@NotNull SupportSQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        super.onConfigure(db2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onCreate(@NotNull SupportSQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        boolean zHasEmptySchema$room_runtime_release = INSTANCE.hasEmptySchema$room_runtime_release(db2);
        Delegate delegate = this.f23323b;
        delegate.createAllTables(db2);
        if (!zHasEmptySchema$room_runtime_release) {
            ValidationResult validationResultOnValidateSchema = delegate.onValidateSchema(db2);
            if (!validationResultOnValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg);
            }
        }
        db2.execSQL(RoomMasterTable.CREATE_QUERY);
        db2.execSQL(RoomMasterTable.createInsertQuery(this.f23324c));
        delegate.onCreate(db2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onDowngrade(@NotNull SupportSQLiteDatabase db2, int oldVersion, int newVersion) {
        Intrinsics.checkNotNullParameter(db2, "db");
        onUpgrade(db2, oldVersion, newVersion);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onOpen(@NotNull SupportSQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        super.onOpen(db2);
        boolean zHasRoomMasterTable$room_runtime_release = INSTANCE.hasRoomMasterTable$room_runtime_release(db2);
        String str = this.f23324c;
        Delegate delegate = this.f23323b;
        if (zHasRoomMasterTable$room_runtime_release) {
            Cursor cursorQuery = db2.query(new SimpleSQLiteQuery(RoomMasterTable.READ_QUERY));
            try {
                String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
                CloseableKt.closeFinally(cursorQuery, null);
                if (!Intrinsics.areEqual(str, string) && !Intrinsics.areEqual(this.f23325d, string)) {
                    throw new IllegalStateException(androidx.camera.core.impl.utils.c.a("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ", str, ", found: ", string));
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
            ValidationResult validationResultOnValidateSchema = delegate.onValidateSchema(db2);
            if (!validationResultOnValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg);
            }
            delegate.onPostMigrate(db2);
            db2.execSQL(RoomMasterTable.CREATE_QUERY);
            db2.execSQL(RoomMasterTable.createInsertQuery(str));
        }
        delegate.onOpen(db2);
        this.f23322a = null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onUpgrade(@NotNull SupportSQLiteDatabase db2, int oldVersion, int newVersion) {
        List<Migration> listFindMigrationPath;
        Intrinsics.checkNotNullParameter(db2, "db");
        DatabaseConfiguration databaseConfiguration = this.f23322a;
        Delegate delegate = this.f23323b;
        if (databaseConfiguration == null || (listFindMigrationPath = databaseConfiguration.migrationContainer.findMigrationPath(oldVersion, newVersion)) == null) {
            DatabaseConfiguration databaseConfiguration2 = this.f23322a;
            if (databaseConfiguration2 == null || databaseConfiguration2.isMigrationRequired(oldVersion, newVersion)) {
                throw new IllegalStateException(k.c("A migration from ", oldVersion, " to ", newVersion, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
            }
            delegate.dropAllTables(db2);
            delegate.createAllTables(db2);
            return;
        }
        delegate.onPreMigrate(db2);
        Iterator<T> it = listFindMigrationPath.iterator();
        while (it.hasNext()) {
            ((Migration) it.next()).migrate(db2);
        }
        ValidationResult validationResultOnValidateSchema = delegate.onValidateSchema(db2);
        if (!validationResultOnValidateSchema.isValid) {
            throw new IllegalStateException("Migration didn't properly handle: " + validationResultOnValidateSchema.expectedFoundMsg);
        }
        delegate.onPostMigrate(db2);
        db2.execSQL(RoomMasterTable.CREATE_QUERY);
        db2.execSQL(RoomMasterTable.createInsertQuery(this.f23324c));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(@NotNull DatabaseConfiguration configuration, @NotNull Delegate delegate, @NotNull String legacyHash) {
        this(configuration, delegate, "", legacyHash);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
    }
}
