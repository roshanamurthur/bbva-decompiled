package com.afollestad.materialdialogs;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WhichButton.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/afollestad/materialdialogs/WhichButton;", "", "", FirebaseAnalytics.Param.INDEX, TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIndex", "()I", "Companion", "POSITIVE", "NEGATIVE", "NEUTRAL", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
public enum WhichButton {
    POSITIVE(0),
    NEGATIVE(1),
    NEUTRAL(2);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int index;

    /* JADX INFO: compiled from: WhichButton.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/afollestad/materialdialogs/WhichButton$Companion;", "", "()V", "fromIndex", "Lcom/afollestad/materialdialogs/WhichButton;", FirebaseAnalytics.Param.INDEX, "", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WhichButton fromIndex(int index) {
            if (index == 0) {
                return WhichButton.POSITIVE;
            }
            if (index == 1) {
                return WhichButton.NEGATIVE;
            }
            if (index == 2) {
                return WhichButton.NEUTRAL;
            }
            throw new IndexOutOfBoundsException(index + " is not an action button index.");
        }
    }

    WhichButton(int i10) {
        this.index = i10;
    }

    public final int getIndex() {
        return this.index;
    }
}
