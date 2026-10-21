package androidx.sqlite.db;

import androidx.camera.core.processing.f;
import androidx.fragment.app.a;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SupportSQLiteQueryBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0006\u0010\u0002\u001a\u00020\u0000J\u001f\u0010\u0005\u001a\u00020\u00002\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u000e¨\u0006\u0011"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "", "distinct", "", "", "columns", "([Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "selection", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "groupBy", "having", "orderBy", "limit", "Landroidx/sqlite/db/SupportSQLiteQuery;", "create", "Companion", "sqlite_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSupportSQLiteQueryBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteQueryBuilder.kt\nandroidx/sqlite/db/SupportSQLiteQueryBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
public final class SupportSQLiteQueryBuilder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f23487j = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f23488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String[] f23490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f23491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Object[] f23492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f23493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f23494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public String f23495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f23496i;

    /* JADX INFO: compiled from: SupportSQLiteQueryBuilder.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteQueryBuilder$Companion;", "", "()V", "limitPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "builder", "Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "tableName", "", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SupportSQLiteQueryBuilder builder(@NotNull String tableName) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return new SupportSQLiteQueryBuilder(tableName, null);
        }
    }

    public SupportSQLiteQueryBuilder(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f23488a = str;
    }

    public static void a(StringBuilder sb2, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        sb2.append(str);
        sb2.append(str2);
    }

    @JvmStatic
    @NotNull
    public static final SupportSQLiteQueryBuilder builder(@NotNull String str) {
        return INSTANCE.builder(str);
    }

    @NotNull
    public final SupportSQLiteQueryBuilder columns(@Nullable String[] columns) {
        this.f23490c = columns;
        return this;
    }

    @NotNull
    public final SupportSQLiteQuery create() {
        String str;
        String str2 = this.f23493f;
        if ((str2 == null || str2.length() == 0) && (str = this.f23494g) != null && str.length() != 0) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause".toString());
        }
        StringBuilder sbA = a.a(120, "SELECT ");
        if (this.f23489b) {
            sbA.append("DISTINCT ");
        }
        String[] strArr = this.f23490c;
        if (strArr == null || strArr.length == 0) {
            sbA.append("* ");
        } else {
            Intrinsics.checkNotNull(strArr);
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                String str3 = strArr[i10];
                if (i10 > 0) {
                    sbA.append(", ");
                }
                sbA.append(str3);
            }
            sbA.append(' ');
        }
        sbA.append("FROM ");
        sbA.append(this.f23488a);
        a(sbA, " WHERE ", this.f23491d);
        a(sbA, " GROUP BY ", this.f23493f);
        a(sbA, " HAVING ", this.f23494g);
        a(sbA, " ORDER BY ", this.f23495h);
        a(sbA, " LIMIT ", this.f23496i);
        String string = sbA.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return new SimpleSQLiteQuery(string, this.f23492e);
    }

    @NotNull
    public final SupportSQLiteQueryBuilder distinct() {
        this.f23489b = true;
        return this;
    }

    @NotNull
    public final SupportSQLiteQueryBuilder groupBy(@Nullable String groupBy) {
        this.f23493f = groupBy;
        return this;
    }

    @NotNull
    public final SupportSQLiteQueryBuilder having(@Nullable String having) {
        this.f23494g = having;
        return this;
    }

    @NotNull
    public final SupportSQLiteQueryBuilder limit(@NotNull String limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        boolean zMatches = f23487j.matcher(limit).matches();
        if (limit.length() != 0 && !zMatches) {
            throw new IllegalArgumentException(f.d("invalid LIMIT clauses:", limit).toString());
        }
        this.f23496i = limit;
        return this;
    }

    @NotNull
    public final SupportSQLiteQueryBuilder orderBy(@Nullable String orderBy) {
        this.f23495h = orderBy;
        return this;
    }

    @NotNull
    public final SupportSQLiteQueryBuilder selection(@Nullable String selection, @Nullable Object[] bindArgs) {
        this.f23491d = selection;
        this.f23492e = bindArgs;
        return this;
    }
}
