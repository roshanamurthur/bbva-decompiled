package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.n1;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013J\b\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H'R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Ljava/io/Closeable;", "databaseName", "", "getDatabaseName", "()Ljava/lang/String;", "readableDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getReadableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getWritableDatabase", HearingDisabilitiesConstants.CLOSE_MODAL, "", "setWriteAheadLoggingEnabled", "enabled", "", "Callback", "Configuration", "Factory", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SupportSQLiteOpenHelper extends Closeable {

    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b&\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "onConfigure", "onCreate", "", "oldVersion", "newVersion", "onUpgrade", "onDowngrade", "onOpen", "onCorruption", "version", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "<init>", "(I)V", "Companion", "sqlite_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSupportSQLiteOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteOpenHelper.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,426:1\n1#2:427\n1855#3,2:428\n107#4:430\n79#4,22:431\n*S KotlinDebug\n*F\n+ 1 SupportSQLiteOpenHelper.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n*L\n243#1:428,2\n251#1:430\n251#1:431,22\n*E\n"})
    public static abstract class Callback {

        @JvmField
        public final int version;

        public Callback(int i10) {
            this.version = i10;
        }

        public static void a(String str) {
            if (l.equals(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = Intrinsics.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                SupportSQLiteCompat.Api16Impl.deleteDatabase(new File(str));
            } catch (Exception e5) {
                Log.w("SupportSQLite", "delete failed: ", e5);
            }
        }

        public void onConfigure(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void onCorruption(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            Objects.toString(db2);
            if (!db2.isOpen()) {
                String path = db2.getPath();
                if (path != null) {
                    a(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> attachedDbs = null;
            try {
                try {
                    attachedDbs = db2.getAttachedDbs();
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                            a((String) obj);
                        }
                    } else {
                        String path2 = db2.getPath();
                        if (path2 != null) {
                            a(path2);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                db2.close();
            } catch (IOException unused2) {
            }
            if (attachedDbs != null) {
                return;
            }
        }

        public abstract void onCreate(@NotNull SupportSQLiteDatabase db2);

        public void onDowngrade(@NotNull SupportSQLiteDatabase db2, int oldVersion, int newVersion) {
            Intrinsics.checkNotNullParameter(db2, "db");
            throw new SQLiteException(n1.e("Can't downgrade database from version ", oldVersion, " to ", newVersion));
        }

        public void onOpen(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public abstract void onUpgrade(@NotNull SupportSQLiteDatabase db2, int oldVersion, int newVersion);
    }

    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "", "create", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "configuration", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {
        @NotNull
        SupportSQLiteOpenHelper create(@NotNull Configuration configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Nullable
    String getDatabaseName();

    @NotNull
    SupportSQLiteDatabase getReadableDatabase();

    @NotNull
    SupportSQLiteDatabase getWritableDatabase();

    @RequiresApi(api = 16)
    void setWriteAheadLoggingEnabled(boolean enabled);

    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0002\f\rB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bR\u0010\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "", "context", "Landroid/content/Context;", "name", "", "callback", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "useNoBackupDirectory", "", "allowDataLossOnRecovery", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;ZZ)V", "Builder", "Companion", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Configuration {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        public final boolean allowDataLossOnRecovery;

        @JvmField
        @NotNull
        public final Callback callback;

        @JvmField
        @NotNull
        public final Context context;

        @JvmField
        @Nullable
        public final String name;

        @JvmField
        public final boolean useNoBackupDirectory;

        /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", "", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "name", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "callback", "", "useNoBackupDirectory", "noBackupDirectory", "allowDataLossOnRecovery", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "sqlite_release"}, k = 1, mv = {1, 8, 0})
        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final Context f23482a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public String f23483b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public Callback f23484c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f23485d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f23486e;

            public Builder(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                this.f23482a = context;
            }

            @NotNull
            public Builder allowDataLossOnRecovery(boolean allowDataLossOnRecovery) {
                this.f23486e = allowDataLossOnRecovery;
                return this;
            }

            @NotNull
            public Configuration build() {
                String str;
                Callback callback = this.f23484c;
                if (callback == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
                }
                if (this.f23485d && ((str = this.f23483b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
                return new Configuration(this.f23482a, this.f23483b, callback, this.f23485d, this.f23486e);
            }

            @NotNull
            public Builder callback(@NotNull Callback callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.f23484c = callback;
                return this;
            }

            @NotNull
            public Builder name(@Nullable String name) {
                this.f23483b = name;
                return this;
            }

            @NotNull
            public Builder noBackupDirectory(boolean useNoBackupDirectory) {
                this.f23485d = useNoBackupDirectory;
                return this;
            }
        }

        /* JADX INFO: compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Companion;", "", "()V", "builder", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", "context", "Landroid/content/Context;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final Builder builder(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new Builder(context);
            }
        }

        public Configuration(@NotNull Context context, @Nullable String str, @NotNull Callback callback, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.context = context;
            this.name = str;
            this.callback = callback;
            this.useNoBackupDirectory = z10;
            this.allowDataLossOnRecovery = z11;
        }

        @JvmStatic
        @NotNull
        public static final Builder builder(@NotNull Context context) {
            return INSTANCE.builder(context);
        }

        public /* synthetic */ Configuration(Context context, String str, Callback callback, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, str, callback, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
        }
    }
}
