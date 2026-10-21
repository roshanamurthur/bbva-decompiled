package androidx.room;

import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FtsOptions.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/room/FtsOptions;", "", "()V", "TOKENIZER_ICU", "", "TOKENIZER_PORTER", "TOKENIZER_SIMPLE", "TOKENIZER_UNICODE61", "MatchInfo", "Order", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FtsOptions {

    @NotNull
    public static final FtsOptions INSTANCE = new FtsOptions();

    @NotNull
    public static final String TOKENIZER_ICU = "icu";

    @NotNull
    public static final String TOKENIZER_PORTER = "porter";

    @NotNull
    public static final String TOKENIZER_SIMPLE = "simple";

    @RequiresApi(21)
    @NotNull
    public static final String TOKENIZER_UNICODE61 = "unicode61";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: FtsOptions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/FtsOptions$MatchInfo;", "", "FTS3", "FTS4", "room-common"}, k = 1, mv = {1, 8, 0})
    public static final class MatchInfo {
        private static final /* synthetic */ MatchInfo[] $VALUES;
        public static final MatchInfo FTS3;
        public static final MatchInfo FTS4;

        static {
            MatchInfo matchInfo = new MatchInfo("FTS3", 0);
            FTS3 = matchInfo;
            MatchInfo matchInfo2 = new MatchInfo("FTS4", 1);
            FTS4 = matchInfo2;
            $VALUES = new MatchInfo[]{matchInfo, matchInfo2};
        }

        public MatchInfo() {
            throw null;
        }

        public static MatchInfo valueOf(String str) {
            return (MatchInfo) Enum.valueOf(MatchInfo.class, str);
        }

        public static MatchInfo[] values() {
            return (MatchInfo[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: FtsOptions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/FtsOptions$Order;", "", "ASC", "DESC", "room-common"}, k = 1, mv = {1, 8, 0})
    public static final class Order {
        private static final /* synthetic */ Order[] $VALUES;
        public static final Order ASC;
        public static final Order DESC;

        static {
            Order order = new Order("ASC", 0);
            ASC = order;
            Order order2 = new Order("DESC", 1);
            DESC = order2;
            $VALUES = new Order[]{order, order2};
        }

        public Order() {
            throw null;
        }

        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        public static Order[] values() {
            return (Order[]) $VALUES.clone();
        }
    }
}
