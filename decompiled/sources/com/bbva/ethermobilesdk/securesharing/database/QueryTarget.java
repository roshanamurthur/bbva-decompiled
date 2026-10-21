package com.bbva.ethermobilesdk.securesharing.database;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: QueryTarget.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/database/QueryTarget;", "", "Companion", "ENTRY", "INFO", "UNKNOWN", "securesharing_release"}, k = 1, mv = {1, 5, 1})
public final class QueryTarget {
    private static final /* synthetic */ QueryTarget[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final QueryTarget ENTRY;
    public static final QueryTarget INFO;
    public static final QueryTarget UNKNOWN;

    /* JADX INFO: compiled from: QueryTarget.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/database/QueryTarget$Companion;", "", "()V", "from", "Lcom/bbva/ethermobilesdk/securesharing/database/QueryTarget;", "uri", "Landroid/net/Uri;", "securesharing_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        
            if (r2.equals(com.bbva.ethermobilesdk.securesharing.database.EntryTable.CONTENT_TYPE) == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        
            if (r2.equals(com.bbva.ethermobilesdk.securesharing.database.InfoTable.CONTENT_ITEM_TYPE) == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
        
            if (r2.equals(com.bbva.ethermobilesdk.securesharing.database.InfoTable.CONTENT_TYPE) == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
        
            if (r2.equals(com.bbva.ethermobilesdk.securesharing.database.EntryTable.CONTENT_ITEM_TYPE) == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        
            return com.bbva.ethermobilesdk.securesharing.database.QueryTarget.INFO;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
        
            return com.bbva.ethermobilesdk.securesharing.database.QueryTarget.ENTRY;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.bbva.ethermobilesdk.securesharing.database.QueryTarget from(@org.jetbrains.annotations.NotNull android.net.Uri r2) {
            /*
                r1 = this;
                java.lang.String r0 = "uri"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L10
                java.lang.String r2 = com.bbva.ethermobilesdk.securesharing.extension.UriKt.contentType(r2)     // Catch: java.lang.Throwable -> L10
                java.lang.Object r2 = kotlin.Result.m5535constructorimpl(r2)     // Catch: java.lang.Throwable -> L10
                goto L1b
            L10:
                r2 = move-exception
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
                java.lang.Object r2 = kotlin.Result.m5535constructorimpl(r2)
            L1b:
                boolean r0 = kotlin.Result.m5540isFailureimpl(r2)
                if (r0 == 0) goto L22
                r2 = 0
            L22:
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L58
                int r0 = r2.hashCode()
                switch(r0) {
                    case 679092155: goto L4c;
                    case 900347032: goto L40;
                    case 1053808132: goto L37;
                    case 1304630095: goto L2e;
                    default: goto L2d;
                }
            L2d:
                goto L58
            L2e:
                java.lang.String r0 = "vnd.android.cursor.dir/vnd.com.bbva.sl.ar.entry"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L55
                goto L58
            L37:
                java.lang.String r0 = "vnd.android.cursor.item/vnd.com.bbva.sl.ar.proInfo"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L49
                goto L58
            L40:
                java.lang.String r0 = "vnd.android.cursor.dir/vnd.com.bbva.sl.ar.proInfo"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L49
                goto L58
            L49:
                com.bbva.ethermobilesdk.securesharing.database.QueryTarget r2 = com.bbva.ethermobilesdk.securesharing.database.QueryTarget.INFO
                goto L5a
            L4c:
                java.lang.String r0 = "vnd.android.cursor.item/vnd.com.bbva.sl.ar.entry"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L55
                goto L58
            L55:
                com.bbva.ethermobilesdk.securesharing.database.QueryTarget r2 = com.bbva.ethermobilesdk.securesharing.database.QueryTarget.ENTRY
                goto L5a
            L58:
                com.bbva.ethermobilesdk.securesharing.database.QueryTarget r2 = com.bbva.ethermobilesdk.securesharing.database.QueryTarget.UNKNOWN
            L5a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbva.ethermobilesdk.securesharing.database.QueryTarget.Companion.from(android.net.Uri):com.bbva.ethermobilesdk.securesharing.database.QueryTarget");
        }
    }

    static {
        QueryTarget queryTarget = new QueryTarget("ENTRY", 0);
        ENTRY = queryTarget;
        QueryTarget queryTarget2 = new QueryTarget("INFO", 1);
        INFO = queryTarget2;
        QueryTarget queryTarget3 = new QueryTarget("UNKNOWN", 2);
        UNKNOWN = queryTarget3;
        $VALUES = new QueryTarget[]{queryTarget, queryTarget2, queryTarget3};
        INSTANCE = new Companion(null);
    }

    public QueryTarget() {
        throw null;
    }

    public static QueryTarget valueOf(String str) {
        return (QueryTarget) Enum.valueOf(QueryTarget.class, str);
    }

    public static QueryTarget[] values() {
        return (QueryTarget[]) $VALUES.clone();
    }
}
