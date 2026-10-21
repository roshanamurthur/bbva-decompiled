package com.bbva.ethermobilesdk.passchecker.model.api.input;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Allow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Allow;", "", "letters", "", "numbers", "special", "ignoreCase", "extraValidChars", "", "(ZZZZLjava/lang/String;)V", "getExtraValidChars", "()Ljava/lang/String;", "getIgnoreCase", "()Z", "getLetters", "getNumbers", "getSpecial", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Allow {

    @NotNull
    private final String extraValidChars;
    private final boolean ignoreCase;
    private final boolean letters;
    private final boolean numbers;
    private final boolean special;

    public Allow(boolean z10, boolean z11, boolean z12, boolean z13, @NotNull String extraValidChars) {
        Intrinsics.checkNotNullParameter(extraValidChars, "extraValidChars");
        this.letters = z10;
        this.numbers = z11;
        this.special = z12;
        this.ignoreCase = z13;
        this.extraValidChars = extraValidChars;
    }

    public static /* synthetic */ Allow copy$default(Allow allow, boolean z10, boolean z11, boolean z12, boolean z13, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = allow.letters;
        }
        if ((i10 & 2) != 0) {
            z11 = allow.numbers;
        }
        boolean z14 = z11;
        if ((i10 & 4) != 0) {
            z12 = allow.special;
        }
        boolean z15 = z12;
        if ((i10 & 8) != 0) {
            z13 = allow.ignoreCase;
        }
        boolean z16 = z13;
        if ((i10 & 16) != 0) {
            str = allow.extraValidChars;
        }
        return allow.copy(z10, z14, z15, z16, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getLetters() {
        return this.letters;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getNumbers() {
        return this.numbers;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSpecial() {
        return this.special;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExtraValidChars() {
        return this.extraValidChars;
    }

    @NotNull
    public final Allow copy(boolean letters, boolean numbers, boolean special, boolean ignoreCase, @NotNull String extraValidChars) {
        Intrinsics.checkNotNullParameter(extraValidChars, "extraValidChars");
        return new Allow(letters, numbers, special, ignoreCase, extraValidChars);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Allow)) {
            return false;
        }
        Allow allow = (Allow) other;
        return this.letters == allow.letters && this.numbers == allow.numbers && this.special == allow.special && this.ignoreCase == allow.ignoreCase && Intrinsics.areEqual(this.extraValidChars, allow.extraValidChars);
    }

    @NotNull
    public final String getExtraValidChars() {
        return this.extraValidChars;
    }

    public final boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    public final boolean getLetters() {
        return this.letters;
    }

    public final boolean getNumbers() {
        return this.numbers;
    }

    public final boolean getSpecial() {
        return this.special;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public int hashCode() {
        boolean z10 = this.letters;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = r1 * 31;
        boolean z11 = this.numbers;
        ?? r3 = z11;
        if (z11) {
            r3 = 1;
        }
        int i11 = (i10 + r3) * 31;
        boolean z12 = this.special;
        ?? r4 = z12;
        if (z12) {
            r4 = 1;
        }
        int i12 = (i11 + r4) * 31;
        boolean z13 = this.ignoreCase;
        return this.extraValidChars.hashCode() + ((i12 + (z13 ? 1 : z13)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Allow(letters=");
        sb2.append(this.letters);
        sb2.append(", numbers=");
        sb2.append(this.numbers);
        sb2.append(", special=");
        sb2.append(this.special);
        sb2.append(", ignoreCase=");
        sb2.append(this.ignoreCase);
        sb2.append(", extraValidChars=");
        return y2.b(sb2, this.extraValidChars, RootService.CLOSE_BRACKET);
    }
}
