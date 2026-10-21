package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import bk.d;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.android.gms.actions.SearchIntents;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DBUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b\u001a\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\n\u001a\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r\u001a\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u001a\b\u0010\u0014\u001a\u0004\u0018\u00010\b¨\u0006\u0015"}, d2 = {"Landroidx/room/RoomDatabase;", "db", "Landroidx/sqlite/db/SupportSQLiteQuery;", "sqLiteQuery", "", "maybeCopy", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "Landroid/os/CancellationSignal;", "signal", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "dropFtsSyncTriggers", "", "tableName", "foreignKeyCheck", "Ljava/io/File;", "databaseFile", "", "readVersion", "createCancellationSignal", "room-runtime_release"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "DBUtil")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n145#2,7:215\n145#2,7:224\n1855#3,2:222\n*S KotlinDebug\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil\n*L\n100#1:215,7\n121#1:224,7\n107#1:222,2\n*E\n"})
public final class DBUtil {
    @Nullable
    public static final CancellationSignal createCancellationSignal() {
        return SupportSQLiteCompat.Api16Impl.createCancellationSignal();
    }

    public static final void dropFtsSyncTriggers(@NotNull SupportSQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        List listCreateListBuilder = d.createListBuilder();
        Cursor cursorQuery = db2.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorQuery.moveToNext()) {
            try {
                listCreateListBuilder.add(cursorQuery.getString(0));
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
        for (String triggerName : d.build(listCreateListBuilder)) {
            Intrinsics.checkNotNullExpressionValue(triggerName, "triggerName");
            if (l.startsWith$default(triggerName, "room_fts_content_sync_", false, 2, null)) {
                db2.execSQL("DROP TRIGGER IF EXISTS " + triggerName);
            }
        }
    }

    public static final void foreignKeyCheck(@NotNull SupportSQLiteDatabase db2, @NotNull String tableName) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Cursor cursorQuery = db2.query("PRAGMA foreign_key_check(`" + tableName + "`)");
        try {
            if (cursorQuery.getCount() <= 0) {
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursorQuery, null);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int count = cursorQuery.getCount();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (cursorQuery.moveToNext()) {
                if (cursorQuery.isFirst()) {
                    sb2.append("Foreign key violation(s) detected in '");
                    sb2.append(cursorQuery.getString(0));
                    sb2.append("'.\n");
                }
                String constraintIndex = cursorQuery.getString(3);
                if (!linkedHashMap.containsKey(constraintIndex)) {
                    Intrinsics.checkNotNullExpressionValue(constraintIndex, "constraintIndex");
                    String string = cursorQuery.getString(2);
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(2)");
                    linkedHashMap.put(constraintIndex, string);
                }
            }
            sb2.append("Number of different violations discovered: ");
            sb2.append(linkedHashMap.keySet().size());
            sb2.append("\nNumber of rows in violation: ");
            sb2.append(count);
            sb2.append("\nViolation(s) detected in the following constraint(s):\n");
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                sb2.append("\tParent Table = ");
                sb2.append(str2);
                sb2.append(", Foreign Key Constraint Index = ");
                sb2.append(str);
                sb2.append(RootService.LINE_BREAK);
            }
            String string2 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
            throw new SQLiteConstraintException(string2);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(cursorQuery, th2);
                throw th3;
            }
        }
    }

    @Deprecated(message = "This is only used in the generated code and shouldn't be called directly.")
    @NotNull
    public static final Cursor query(@NotNull RoomDatabase db2, @NotNull SupportSQLiteQuery sqLiteQuery, boolean z10) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        return query(db2, sqLiteQuery, z10, null);
    }

    public static final int readVersion(@NotNull File databaseFile) throws IOException {
        Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            CloseableKt.closeFinally(channel, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(channel, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public static final Cursor query(@NotNull RoomDatabase db2, @NotNull SupportSQLiteQuery sqLiteQuery, boolean z10, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        Cursor cursorQuery = db2.query(sqLiteQuery, cancellationSignal);
        if (!z10 || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? CursorUtil.copyAndClose(cursorQuery) : cursorQuery;
    }
}
