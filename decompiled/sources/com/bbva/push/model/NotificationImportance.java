package com.bbva.push.model;

import androidx.annotation.Keep;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationManagerCompat;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: NotificationModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/push/model/NotificationImportance;", "", "(Ljava/lang/String;I)V", "toInt", "", ExpectedUserActionOnPoiTypes.NONE, "MIN", "LOW", "DEFAULT", "HIGH", "MAX", "UNSPECIFIED", "push_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum NotificationImportance {
    NONE,
    MIN,
    LOW,
    DEFAULT,
    HIGH,
    MAX,
    UNSPECIFIED;

    /* JADX INFO: compiled from: NotificationModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationImportance.values().length];
            try {
                iArr[NotificationImportance.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationImportance.MIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NotificationImportance.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NotificationImportance.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NotificationImportance.HIGH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NotificationImportance.MAX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NotificationImportance.UNSPECIFIED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @RequiresApi(24)
    public final int toInt() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
