package com.sun.mail.imap.protocol;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.util.ArrayList;
import java.util.StringTokenizer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class UIDSet {
    public long end;
    public long start;

    public UIDSet() {
    }

    public UIDSet(long j10, long j11) {
        this.start = j10;
        this.end = j11;
    }

    public static UIDSet[] createUIDSets(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < jArr.length) {
            UIDSet uIDSet = new UIDSet();
            uIDSet.start = jArr[i10];
            do {
                i10++;
                if (i10 >= jArr.length) {
                    break;
                }
            } while (jArr[i10] == jArr[i10 - 1] + 1);
            uIDSet.end = jArr[i10 - 1];
            arrayList.add(uIDSet);
        }
        return (UIDSet[]) arrayList.toArray(new UIDSet[arrayList.size()]);
    }

    public static UIDSet[] parseUIDSets(String str) {
        UIDSet uIDSet;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",:", true);
        loop0: while (true) {
            uIDSet = null;
            while (true) {
                try {
                    if (!stringTokenizer.hasMoreTokens()) {
                        break loop0;
                    }
                    String strNextToken = stringTokenizer.nextToken();
                    if (strNextToken.equals(",")) {
                        break;
                    }
                    if (!strNextToken.equals(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER)) {
                        long j10 = Long.parseLong(strNextToken);
                        if (uIDSet != null) {
                            uIDSet.end = j10;
                        } else {
                            uIDSet = new UIDSet(j10, j10);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
            if (uIDSet != null) {
                arrayList.add(uIDSet);
            }
        }
        if (uIDSet != null) {
            arrayList.add(uIDSet);
        }
        return (UIDSet[]) arrayList.toArray(new UIDSet[arrayList.size()]);
    }

    public static long[] toArray(UIDSet[] uIDSetArr) {
        if (uIDSetArr == null) {
            return null;
        }
        long[] jArr = new long[(int) size(uIDSetArr)];
        int i10 = 0;
        for (UIDSet uIDSet : uIDSetArr) {
            long j10 = uIDSet.start;
            while (j10 <= uIDSet.end) {
                jArr[i10] = j10;
                j10++;
                i10++;
            }
        }
        return jArr;
    }

    public static String toString(UIDSet[] uIDSetArr) {
        if (uIDSetArr == null) {
            return null;
        }
        if (uIDSetArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = uIDSetArr.length;
        int i10 = 0;
        while (true) {
            UIDSet uIDSet = uIDSetArr[i10];
            long j10 = uIDSet.start;
            long j11 = uIDSet.end;
            if (j11 > j10) {
                sb2.append(j10);
                sb2.append(AbstractJsonLexerKt.COLON);
                sb2.append(j11);
            } else {
                sb2.append(j10);
            }
            i10++;
            if (i10 >= length) {
                return sb2.toString();
            }
            sb2.append(AbstractJsonLexerKt.COMMA);
        }
    }

    public long size() {
        return (this.end - this.start) + 1;
    }

    public static long size(UIDSet[] uIDSetArr) {
        long size = 0;
        if (uIDSetArr != null) {
            for (UIDSet uIDSet : uIDSetArr) {
                size += uIDSet.size();
            }
        }
        return size;
    }

    public static long[] toArray(UIDSet[] uIDSetArr, long j10) {
        if (uIDSetArr == null) {
            return null;
        }
        long size = 0;
        for (UIDSet uIDSet : uIDSetArr) {
            if (j10 < 0) {
                size += uIDSet.size();
            } else {
                long j11 = uIDSet.start;
                if (j11 <= j10) {
                    long j12 = uIDSet.end;
                    size = j12 < j10 ? size + (j12 - j11) + 1 : size + (j10 - j11) + 1;
                }
            }
        }
        long[] jArr = new long[(int) size];
        int i10 = 0;
        for (UIDSet uIDSet2 : uIDSetArr) {
            long j13 = uIDSet2.start;
            while (j13 <= uIDSet2.end && (j10 < 0 || j13 <= j10)) {
                jArr[i10] = j13;
                j13++;
                i10++;
            }
        }
        return jArr;
    }
}
