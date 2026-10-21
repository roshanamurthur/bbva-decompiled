package com.bbva.ethermobilesdk.passchecker.model.api.input;

import androidx.activity.a;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Require.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Require;", "", "length", "", "uppercaseLetters", "lowercaseLetters", "letters", "numbers", "special", ValidatePasswordQualityUseCase.KEY_PASSWORD_QUALITY, "distance", "(IIIIIIII)V", "getDistance", "()I", "getLength", "getLetters", "getLowercaseLetters", "getNumbers", "getQuality", "getSpecial", "getUppercaseLetters", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Require {
    private final int distance;
    private final int length;
    private final int letters;
    private final int lowercaseLetters;
    private final int numbers;
    private final int quality;
    private final int special;
    private final int uppercaseLetters;

    public Require(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.length = i10;
        this.uppercaseLetters = i11;
        this.lowercaseLetters = i12;
        this.letters = i13;
        this.numbers = i14;
        this.special = i15;
        this.quality = i16;
        this.distance = i17;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUppercaseLetters() {
        return this.uppercaseLetters;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLowercaseLetters() {
        return this.lowercaseLetters;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLetters() {
        return this.letters;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getNumbers() {
        return this.numbers;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSpecial() {
        return this.special;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getQuality() {
        return this.quality;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    @NotNull
    public final Require copy(int length, int uppercaseLetters, int lowercaseLetters, int letters, int numbers, int special, int quality, int distance) {
        return new Require(length, uppercaseLetters, lowercaseLetters, letters, numbers, special, quality, distance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Require)) {
            return false;
        }
        Require require = (Require) other;
        return this.length == require.length && this.uppercaseLetters == require.uppercaseLetters && this.lowercaseLetters == require.lowercaseLetters && this.letters == require.letters && this.numbers == require.numbers && this.special == require.special && this.quality == require.quality && this.distance == require.distance;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getLetters() {
        return this.letters;
    }

    public final int getLowercaseLetters() {
        return this.lowercaseLetters;
    }

    public final int getNumbers() {
        return this.numbers;
    }

    public final int getQuality() {
        return this.quality;
    }

    public final int getSpecial() {
        return this.special;
    }

    public final int getUppercaseLetters() {
        return this.uppercaseLetters;
    }

    public int hashCode() {
        return (((((((((((((this.length * 31) + this.uppercaseLetters) * 31) + this.lowercaseLetters) * 31) + this.letters) * 31) + this.numbers) * 31) + this.special) * 31) + this.quality) * 31) + this.distance;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Require(length=");
        sb2.append(this.length);
        sb2.append(", uppercaseLetters=");
        sb2.append(this.uppercaseLetters);
        sb2.append(", lowercaseLetters=");
        sb2.append(this.lowercaseLetters);
        sb2.append(", letters=");
        sb2.append(this.letters);
        sb2.append(", numbers=");
        sb2.append(this.numbers);
        sb2.append(", special=");
        sb2.append(this.special);
        sb2.append(", quality=");
        sb2.append(this.quality);
        sb2.append(", distance=");
        return a.d(sb2, this.distance, RootService.CLOSE_BRACKET);
    }
}
