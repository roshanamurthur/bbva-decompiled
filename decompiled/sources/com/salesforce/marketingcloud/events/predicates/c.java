package com.salesforce.marketingcloud.events.predicates;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public class c extends h<Double> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64209a;

        static {
            int[] iArr = new int[com.salesforce.marketingcloud.events.g.a.values().length];
            f64209a = iArr;
            try {
                iArr[com.salesforce.marketingcloud.events.g.a.EQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64209a[com.salesforce.marketingcloud.events.g.a.NEQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64209a[com.salesforce.marketingcloud.events.g.a.LT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64209a[com.salesforce.marketingcloud.events.g.a.GT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64209a[com.salesforce.marketingcloud.events.g.a.LTEQ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64209a[com.salesforce.marketingcloud.events.g.a.GTEQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(@Nullable Object obj, @NonNull com.salesforce.marketingcloud.events.g.a aVar, @Nullable Object obj2) {
        super(obj, aVar, obj2);
    }

    @Override // com.salesforce.marketingcloud.events.predicates.h
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Double a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @Override // com.salesforce.marketingcloud.events.predicates.h
    public boolean a(@Nullable Double d2, @NonNull com.salesforce.marketingcloud.events.g.a aVar, @Nullable Double d3) throws UnsupportedOperationException {
        if (d2 == null || d3 == null) {
            return false;
        }
        double dDoubleValue = d2.doubleValue();
        double dDoubleValue2 = d3.doubleValue();
        switch (a.f64209a[aVar.ordinal()]) {
            case 1:
                if (dDoubleValue != dDoubleValue2) {
                    return false;
                }
                break;
            case 2:
                if (dDoubleValue == dDoubleValue2) {
                    return false;
                }
                break;
            case 3:
                if (dDoubleValue >= dDoubleValue2) {
                    return false;
                }
                break;
            case 4:
                if (dDoubleValue <= dDoubleValue2) {
                    return false;
                }
                break;
            case 5:
                if (dDoubleValue > dDoubleValue2) {
                    return false;
                }
                break;
            case 6:
                if (dDoubleValue < dDoubleValue2) {
                    return false;
                }
                break;
            default:
                throw new UnsupportedOperationException(String.format(Locale.ENGLISH, "Operator %s not supported for Double data types.", aVar));
        }
        return true;
    }
}
