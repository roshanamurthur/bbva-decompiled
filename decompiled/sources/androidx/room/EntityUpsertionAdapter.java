package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EntityUpsertionAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0014\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u000f\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J%\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0015\u0010\u0017¨\u0006\u001e"}, d2 = {"Landroidx/room/EntityUpsertionAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "", "entity", "", "upsert", "(Ljava/lang/Object;)V", "", "entities", "([Ljava/lang/Object;)V", "", "", "upsertAndReturnId", "(Ljava/lang/Object;)J", "", "upsertAndReturnIdsArray", "([Ljava/lang/Object;)[J", "", "", "upsertAndReturnIdsList", "([Ljava/lang/Object;)Ljava/util/List;", "upsertAndReturnIdsArrayBox", "([Ljava/lang/Object;)[Ljava/lang/Long;", "(Ljava/util/Collection;)[Ljava/lang/Long;", "Landroidx/room/EntityInsertionAdapter;", "insertionAdapter", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "updateAdapter", "<init>", "(Landroidx/room/EntityInsertionAdapter;Landroidx/room/EntityDeletionOrUpdateAdapter;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension({"SMAP\nEntityUpsertionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityUpsertionAdapter.kt\nandroidx/room/EntityUpsertionAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n13579#2,2:225\n13579#2,2:229\n1855#3,2:227\n1855#3,2:231\n*S KotlinDebug\n*F\n+ 1 EntityUpsertionAdapter.kt\nandroidx/room/EntityUpsertionAdapter\n*L\n78#1:225,2\n151#1:229,2\n89#1:227,2\n165#1:231,2\n*E\n"})
public final class EntityUpsertionAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final EntityInsertionAdapter<T> f23197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final EntityDeletionOrUpdateAdapter<T> f23198b;

    public EntityUpsertionAdapter(@NotNull EntityInsertionAdapter<T> insertionAdapter, @NotNull EntityDeletionOrUpdateAdapter<T> updateAdapter) {
        Intrinsics.checkNotNullParameter(insertionAdapter, "insertionAdapter");
        Intrinsics.checkNotNullParameter(updateAdapter, "updateAdapter");
        this.f23197a = insertionAdapter;
        this.f23198b = updateAdapter;
    }

    public static void a(SQLiteConstraintException sQLiteConstraintException) {
        String message = sQLiteConstraintException.getMessage();
        if (message == null) {
            throw sQLiteConstraintException;
        }
        if (!StringsKt__StringsKt.contains((CharSequence) message, (CharSequence) "unique", true) && !StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "2067", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "1555", false, 2, (Object) null)) {
            throw sQLiteConstraintException;
        }
    }

    public final void upsert(T entity) {
        try {
            this.f23197a.insert(entity);
        } catch (SQLiteConstraintException e5) {
            a(e5);
            this.f23198b.handle(entity);
        }
    }

    public final long upsertAndReturnId(T entity) {
        try {
            return this.f23197a.insertAndReturnId(entity);
        } catch (SQLiteConstraintException e5) {
            a(e5);
            this.f23198b.handle(entity);
            return -1L;
        }
    }

    @NotNull
    public final long[] upsertAndReturnIdsArray(@NotNull T[] entities) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(entities, "entities");
        int length = entities.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jInsertAndReturnId = this.f23197a.insertAndReturnId(entities[i10]);
            } catch (SQLiteConstraintException e5) {
                a(e5);
                this.f23198b.handle(entities[i10]);
                jInsertAndReturnId = -1;
            }
            jArr[i10] = jInsertAndReturnId;
        }
        return jArr;
    }

    @NotNull
    public final Long[] upsertAndReturnIdsArrayBox(@NotNull T[] entities) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(entities, "entities");
        int length = entities.length;
        Long[] lArr = new Long[length];
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jInsertAndReturnId = this.f23197a.insertAndReturnId(entities[i10]);
            } catch (SQLiteConstraintException e5) {
                a(e5);
                this.f23198b.handle(entities[i10]);
                jInsertAndReturnId = -1;
            }
            lArr[i10] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    @NotNull
    public final List<Long> upsertAndReturnIdsList(@NotNull T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        List listCreateListBuilder = bk.d.createListBuilder();
        for (T t10 : entities) {
            try {
                listCreateListBuilder.add(Long.valueOf(this.f23197a.insertAndReturnId(t10)));
            } catch (SQLiteConstraintException e5) {
                a(e5);
                this.f23198b.handle(t10);
                listCreateListBuilder.add(-1L);
            }
        }
        return bk.d.build(listCreateListBuilder);
    }

    public final void upsert(@NotNull T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        for (T t10 : entities) {
            try {
                this.f23197a.insert(t10);
            } catch (SQLiteConstraintException e5) {
                a(e5);
                this.f23198b.handle(t10);
            }
        }
    }

    @NotNull
    public final long[] upsertAndReturnIdsArray(@NotNull Collection<? extends T> entities) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.f23197a.insertAndReturnId(next);
            } catch (SQLiteConstraintException e5) {
                a(e5);
                this.f23198b.handle(next);
                jInsertAndReturnId = -1;
            }
            jArr[i10] = jInsertAndReturnId;
        }
        return jArr;
    }

    @NotNull
    public final Long[] upsertAndReturnIdsArrayBox(@NotNull Collection<? extends T> entities) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        Long[] lArr = new Long[size];
        for (int i10 = 0; i10 < size; i10++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.f23197a.insertAndReturnId(next);
            } catch (SQLiteConstraintException e5) {
                a(e5);
                this.f23198b.handle(next);
                jInsertAndReturnId = -1;
            }
            lArr[i10] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final void upsert(@NotNull Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        for (T t10 : entities) {
            try {
                this.f23197a.insert(t10);
            } catch (SQLiteConstraintException e5) {
                a(e5);
                this.f23198b.handle(t10);
            }
        }
    }

    @NotNull
    public final List<Long> upsertAndReturnIdsList(@NotNull Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        List listCreateListBuilder = bk.d.createListBuilder();
        for (T t10 : entities) {
            try {
                listCreateListBuilder.add(Long.valueOf(this.f23197a.insertAndReturnId(t10)));
            } catch (SQLiteConstraintException e5) {
                a(e5);
                this.f23198b.handle(t10);
                listCreateListBuilder.add(-1L);
            }
        }
        return bk.d.build(listCreateListBuilder);
    }
}
