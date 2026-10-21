package com.salesforce.marketingcloud.events.predicates;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public class d extends h<Integer> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64210a;

        static {
            int[] iArr = new int[com.salesforce.marketingcloud.events.g.a.values().length];
            f64210a = iArr;
            try {
                iArr[com.salesforce.marketingcloud.events.g.a.EQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64210a[com.salesforce.marketingcloud.events.g.a.NEQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64210a[com.salesforce.marketingcloud.events.g.a.LT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64210a[com.salesforce.marketingcloud.events.g.a.GT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64210a[com.salesforce.marketingcloud.events.g.a.LTEQ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64210a[com.salesforce.marketingcloud.events.g.a.GTEQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public d(@Nullable Object obj, @NonNull com.salesforce.marketingcloud.events.g.a aVar, @Nullable Object obj2) {
        super(obj, aVar, obj2);
    }

    @Override // com.salesforce.marketingcloud.events.predicates.h
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @Override // com.salesforce.marketingcloud.events.predicates.h
    public boolean a(@Nullable Integer num, @NonNull com.salesforce.marketingcloud.events.g.a aVar, @Nullable Integer num2) throws UnsupportedOperationException {
        if (num == null || num2 == null) {
            return false;
        }
        switch (a.f64210a[aVar.ordinal()]) {
            case 1:
                return num.equals(num2);
            case 2:
                return !num.equals(num2);
            case 3:
                if (num.intValue() >= num2.intValue()) {
                    return false;
                }
                break;
            case 4:
                if (num.intValue() <= num2.intValue()) {
                    return false;
                }
                break;
            case 5:
                if (num.intValue() > num2.intValue()) {
                    return false;
                }
                break;
            case 6:
                if (num.intValue() < num2.intValue()) {
                    return false;
                }
                break;
            default:
                throw new UnsupportedOperationException(String.format(Locale.ENGLISH, "Operator %s not supported for Integer data types.", aVar));
        }
        return true;
    }
}
