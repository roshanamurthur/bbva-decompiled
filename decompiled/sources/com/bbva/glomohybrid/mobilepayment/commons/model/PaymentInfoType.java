package com.bbva.glomohybrid.mobilepayment.commons.model;

import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 com.bbva.glomohybrid.mobilepayment.commons.model.PaymentInfoType[], still in use, count: 1, list:
  (r12v3 com.bbva.glomohybrid.mobilepayment.commons.model.PaymentInfoType[]) from 0x0067: INVOKE (r12v3 com.bbva.glomohybrid.mobilepayment.commons.model.PaymentInfoType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:104)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: PaymentInfoType.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/mobilepayment/commons/model/PaymentInfoType;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", NotifyProvisionResult.SUCCESS_RESULT, "ERROR", "TOKENS_NOT_PRESENT", "NOT_DEFAULT_CARD", "INSECURE_DEVICE", "AUTHENTICATION_REQUIRED", "AUTHENTICATED", "commons_release"}, k = 1, mv = {1, 9, 0})
public final class PaymentInfoType {
    SUCCESS("success"),
    ERROR("error"),
    TOKENS_NOT_PRESENT("tokens_not_present"),
    NOT_DEFAULT_CARD("not_default_card"),
    INSECURE_DEVICE("insecure_device"),
    AUTHENTICATION_REQUIRED("auth_required"),
    AUTHENTICATED("authenticated");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    private final String type;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(paymentInfoTypeArr);
    }

    public PaymentInfoType(String str) {
        super(str, i);
        this.type = str;
    }

    @NotNull
    public static EnumEntries<PaymentInfoType> getEntries() {
        return $ENTRIES;
    }

    public static PaymentInfoType valueOf(String str) {
        return (PaymentInfoType) Enum.valueOf(PaymentInfoType.class, str);
    }

    public static PaymentInfoType[] values() {
        return (PaymentInfoType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
