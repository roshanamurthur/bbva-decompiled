package com.bbva.ethermobilesdk.passchecker.model.api.input;

import androidx.activity.a;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Limit;", "", "length", "", "identicalChar", "consecutiveNumber", "reverseConsecutiveNumber", "consecutiveChar", "reverseConsecutiveChar", ValidatePasswordQualityUseCase.KEY_PASSWORD_COMPROMISED, "(IIIIIII)V", "getCompromised", "()I", "getConsecutiveChar", "getConsecutiveNumber", "getIdenticalChar", "getLength", "getReverseConsecutiveChar", "getReverseConsecutiveNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Limit {
    private final int compromised;
    private final int consecutiveChar;
    private final int consecutiveNumber;
    private final int identicalChar;
    private final int length;
    private final int reverseConsecutiveChar;
    private final int reverseConsecutiveNumber;

    public Limit(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.length = i10;
        this.identicalChar = i11;
        this.consecutiveNumber = i12;
        this.reverseConsecutiveNumber = i13;
        this.consecutiveChar = i14;
        this.reverseConsecutiveChar = i15;
        this.compromised = i16;
    }

    public static /* synthetic */ Limit copy$default(Limit limit, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i10 = limit.length;
        }
        if ((i17 & 2) != 0) {
            i11 = limit.identicalChar;
        }
        int i18 = i11;
        if ((i17 & 4) != 0) {
            i12 = limit.consecutiveNumber;
        }
        int i19 = i12;
        if ((i17 & 8) != 0) {
            i13 = limit.reverseConsecutiveNumber;
        }
        int i20 = i13;
        if ((i17 & 16) != 0) {
            i14 = limit.consecutiveChar;
        }
        int i21 = i14;
        if ((i17 & 32) != 0) {
            i15 = limit.reverseConsecutiveChar;
        }
        int i22 = i15;
        if ((i17 & 64) != 0) {
            i16 = limit.compromised;
        }
        return limit.copy(i10, i18, i19, i20, i21, i22, i16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIdenticalChar() {
        return this.identicalChar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getConsecutiveNumber() {
        return this.consecutiveNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getReverseConsecutiveNumber() {
        return this.reverseConsecutiveNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getConsecutiveChar() {
        return this.consecutiveChar;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getReverseConsecutiveChar() {
        return this.reverseConsecutiveChar;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getCompromised() {
        return this.compromised;
    }

    @NotNull
    public final Limit copy(int length, int identicalChar, int consecutiveNumber, int reverseConsecutiveNumber, int consecutiveChar, int reverseConsecutiveChar, int compromised) {
        return new Limit(length, identicalChar, consecutiveNumber, reverseConsecutiveNumber, consecutiveChar, reverseConsecutiveChar, compromised);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Limit)) {
            return false;
        }
        Limit limit = (Limit) other;
        return this.length == limit.length && this.identicalChar == limit.identicalChar && this.consecutiveNumber == limit.consecutiveNumber && this.reverseConsecutiveNumber == limit.reverseConsecutiveNumber && this.consecutiveChar == limit.consecutiveChar && this.reverseConsecutiveChar == limit.reverseConsecutiveChar && this.compromised == limit.compromised;
    }

    public final int getCompromised() {
        return this.compromised;
    }

    public final int getConsecutiveChar() {
        return this.consecutiveChar;
    }

    public final int getConsecutiveNumber() {
        return this.consecutiveNumber;
    }

    public final int getIdenticalChar() {
        return this.identicalChar;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getReverseConsecutiveChar() {
        return this.reverseConsecutiveChar;
    }

    public final int getReverseConsecutiveNumber() {
        return this.reverseConsecutiveNumber;
    }

    public int hashCode() {
        return (((((((((((this.length * 31) + this.identicalChar) * 31) + this.consecutiveNumber) * 31) + this.reverseConsecutiveNumber) * 31) + this.consecutiveChar) * 31) + this.reverseConsecutiveChar) * 31) + this.compromised;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Limit(length=");
        sb2.append(this.length);
        sb2.append(", identicalChar=");
        sb2.append(this.identicalChar);
        sb2.append(", consecutiveNumber=");
        sb2.append(this.consecutiveNumber);
        sb2.append(", reverseConsecutiveNumber=");
        sb2.append(this.reverseConsecutiveNumber);
        sb2.append(", consecutiveChar=");
        sb2.append(this.consecutiveChar);
        sb2.append(", reverseConsecutiveChar=");
        sb2.append(this.reverseConsecutiveChar);
        sb2.append(", compromised=");
        return a.d(sb2, this.compromised, RootService.CLOSE_BRACKET);
    }
}
