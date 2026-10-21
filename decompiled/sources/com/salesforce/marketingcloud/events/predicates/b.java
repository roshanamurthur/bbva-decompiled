package com.salesforce.marketingcloud.events.predicates;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public class b extends h<Boolean> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64208a;

        static {
            int[] iArr = new int[com.salesforce.marketingcloud.events.g.a.values().length];
            f64208a = iArr;
            try {
                iArr[com.salesforce.marketingcloud.events.g.a.EQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64208a[com.salesforce.marketingcloud.events.g.a.NEQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(Object obj, com.salesforce.marketingcloud.events.g.a aVar, Object obj2) {
        super(obj, aVar, obj2);
    }

    @Override // com.salesforce.marketingcloud.events.predicates.h
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if ("true".equalsIgnoreCase(str)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(str)) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    @Override // com.salesforce.marketingcloud.events.predicates.h
    public boolean a(@Nullable Boolean bool, @NonNull com.salesforce.marketingcloud.events.g.a aVar, @Nullable Boolean bool2) throws UnsupportedOperationException {
        if (bool == null || bool2 == null) {
            return false;
        }
        int i10 = a.f64208a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new UnsupportedOperationException(String.format(Locale.ENGLISH, "Operator %s not supported for Boolean data types.", aVar));
            }
            if (bool == bool2) {
                return false;
            }
        } else if (bool != bool2) {
            return false;
        }
        return true;
    }
}
