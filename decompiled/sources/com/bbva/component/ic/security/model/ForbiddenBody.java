package com.bbva.component.ic.security.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ForbiddenBodyModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/ic/security/model/ForbiddenBody;", "", "messages", "", "Lcom/bbva/component/ic/security/model/ForbiddenMessage;", "<init>", "(Ljava/util/List;)V", "getMessages", "()Ljava/util/List;", "hasForbiddenCode", "", "component1", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nForbiddenBodyModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForbiddenBodyModel.kt\ncom/bbva/component/ic/security/model/ForbiddenBody\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
public final /* data */ class ForbiddenBody {

    @NotNull
    private final List<ForbiddenMessage> messages;

    public ForbiddenBody(@NotNull List<ForbiddenMessage> messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.messages = messages;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ForbiddenBody copy$default(ForbiddenBody forbiddenBody, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = forbiddenBody.messages;
        }
        return forbiddenBody.copy(list);
    }

    @NotNull
    public final List<ForbiddenMessage> component1() {
        return this.messages;
    }

    @NotNull
    public final ForbiddenBody copy(@NotNull List<ForbiddenMessage> messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new ForbiddenBody(messages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ForbiddenBody) && Intrinsics.areEqual(this.messages, ((ForbiddenBody) other).messages);
    }

    @NotNull
    public final List<ForbiddenMessage> getMessages() {
        return this.messages;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[ORIG_RETURN, RETURN] */
    public final boolean hasForbiddenCode() {
        for (Object obj : this.messages) {
            if (((ForbiddenMessage) obj).isForbidden()) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.messages.hashCode();
    }

    @NotNull
    public String toString() {
        return "ForbiddenBody(messages=" + this.messages + ")";
    }
}
