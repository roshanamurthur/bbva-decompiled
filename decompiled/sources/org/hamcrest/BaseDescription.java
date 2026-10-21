package org.hamcrest;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import org.hamcrest.internal.ArrayIterator;
import org.hamcrest.internal.SelfDescribingValueIterator;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseDescription implements Description {
    public static String b(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception unused) {
            return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
        }
    }

    public final void a(String str, String str2, String str3, Iterator it) {
        append(str);
        boolean z10 = false;
        while (it.hasNext()) {
            if (z10) {
                append(str2);
            }
            appendDescriptionOf((SelfDescribing) it.next());
            z10 = true;
        }
        append(str3);
    }

    public abstract void append(char c10);

    public void append(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            append(str.charAt(i10));
        }
    }

    @Override // org.hamcrest.Description
    public Description appendDescriptionOf(SelfDescribing selfDescribing) {
        selfDescribing.describeTo(this);
        return this;
    }

    @Override // org.hamcrest.Description
    public Description appendList(String str, String str2, String str3, Iterable<? extends SelfDescribing> iterable) {
        a(str, str2, str3, iterable.iterator());
        return this;
    }

    @Override // org.hamcrest.Description
    public Description appendText(String str) {
        append(str);
        return this;
    }

    @Override // org.hamcrest.Description
    public Description appendValue(Object obj) {
        if (obj == null) {
            append(AbstractJsonLexerKt.NULL);
        } else if (obj instanceof String) {
            String str = (String) obj;
            append('\"');
            for (int i10 = 0; i10 < str.length(); i10++) {
                c(str.charAt(i10));
            }
            append('\"');
        } else if (obj instanceof Character) {
            append('\"');
            c(((Character) obj).charValue());
            append('\"');
        } else if (obj instanceof Short) {
            append(Typography.less);
            append(b(obj));
            append("s>");
        } else if (obj instanceof Long) {
            append(Typography.less);
            append(b(obj));
            append("L>");
        } else if (obj instanceof Float) {
            append(Typography.less);
            append(b(obj));
            append("F>");
        } else if (obj.getClass().isArray()) {
            a(Constant.BRACKET_OPEN, ", ", Constant.BRACKET_CLOSE, new SelfDescribingValueIterator(new ArrayIterator(obj)));
        } else {
            append(Typography.less);
            append(b(obj));
            append(Typography.greater);
        }
        return this;
    }

    @Override // org.hamcrest.Description
    public <T> Description appendValueList(String str, String str2, String str3, T... tArr) {
        return appendValueList(str, str2, str3, Arrays.asList(tArr));
    }

    public final void c(char c10) {
        if (c10 == '\t') {
            append("\\t");
            return;
        }
        if (c10 == '\n') {
            append("\\n");
            return;
        }
        if (c10 == '\r') {
            append("\\r");
        } else if (c10 != '\"') {
            append(c10);
        } else {
            append("\\\"");
        }
    }

    @Override // org.hamcrest.Description
    public <T> Description appendValueList(String str, String str2, String str3, Iterable<T> iterable) {
        a(str, str2, str3, new SelfDescribingValueIterator(iterable.iterator()));
        return this;
    }
}
