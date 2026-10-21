package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ParsedResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsedResultType f49757a;

    public ParsedResult(ParsedResultType parsedResultType) {
        this.f49757a = parsedResultType;
    }

    public static void maybeAppend(String str, StringBuilder sb2) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (sb2.length() > 0) {
            sb2.append('\n');
        }
        sb2.append(str);
    }

    public abstract String getDisplayResult();

    public final ParsedResultType getType() {
        return this.f49757a;
    }

    public final String toString() {
        return getDisplayResult();
    }

    public static void maybeAppend(String[] strArr, StringBuilder sb2) {
        if (strArr != null) {
            for (String str : strArr) {
                maybeAppend(str, sb2);
            }
        }
    }
}
