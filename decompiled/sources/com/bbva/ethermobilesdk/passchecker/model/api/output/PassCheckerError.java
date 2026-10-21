package com.bbva.ethermobilesdk.passchecker.model.api.output;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PassCheckerError.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0013\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(¨\u0006)"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "", "()V", "AllowLetters", "AllowNumbers", "AllowOnlyValid", "AllowSpecial", "LimitCompromised", "LimitConsecutiveChar", "LimitConsecutiveNumber", "LimitIdenticalChar", "LimitLength", "LimitReverseConsecutiveChar", "LimitReverseConsecutiveNumber", "RequireDistance", "RequireLength", "RequireLetters", "RequireLowercaseLetters", "RequireNumbers", "RequireQuality", "RequireSpecial", "RequireUppercaseLetters", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$AllowLetters;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$AllowNumbers;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$AllowOnlyValid;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$AllowSpecial;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$LimitCompromised;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$LimitConsecutiveChar;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$LimitConsecutiveNumber;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$LimitIdenticalChar;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$LimitLength;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$LimitReverseConsecutiveChar;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$LimitReverseConsecutiveNumber;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$RequireDistance;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$RequireLength;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$RequireLetters;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$RequireLowercaseLetters;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$RequireNumbers;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$RequireQuality;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$RequireSpecial;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$RequireUppercaseLetters;", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PassCheckerError {

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$AllowLetters;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AllowLetters extends PassCheckerError {

        @NotNull
        public static final AllowLetters INSTANCE = new AllowLetters();

        public AllowLetters() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$AllowNumbers;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AllowNumbers extends PassCheckerError {

        @NotNull
        public static final AllowNumbers INSTANCE = new AllowNumbers();

        public AllowNumbers() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$AllowOnlyValid;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AllowOnlyValid extends PassCheckerError {

        @NotNull
        public static final AllowOnlyValid INSTANCE = new AllowOnlyValid();

        public AllowOnlyValid() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$AllowSpecial;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AllowSpecial extends PassCheckerError {

        @NotNull
        public static final AllowSpecial INSTANCE = new AllowSpecial();

        public AllowSpecial() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$LimitCompromised;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LimitCompromised extends PassCheckerError {

        @NotNull
        public static final LimitCompromised INSTANCE = new LimitCompromised();

        public LimitCompromised() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$LimitConsecutiveChar;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LimitConsecutiveChar extends PassCheckerError {

        @NotNull
        public static final LimitConsecutiveChar INSTANCE = new LimitConsecutiveChar();

        public LimitConsecutiveChar() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$LimitConsecutiveNumber;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LimitConsecutiveNumber extends PassCheckerError {

        @NotNull
        public static final LimitConsecutiveNumber INSTANCE = new LimitConsecutiveNumber();

        public LimitConsecutiveNumber() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$LimitIdenticalChar;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LimitIdenticalChar extends PassCheckerError {

        @NotNull
        public static final LimitIdenticalChar INSTANCE = new LimitIdenticalChar();

        public LimitIdenticalChar() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$LimitLength;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LimitLength extends PassCheckerError {

        @NotNull
        public static final LimitLength INSTANCE = new LimitLength();

        public LimitLength() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$LimitReverseConsecutiveChar;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LimitReverseConsecutiveChar extends PassCheckerError {

        @NotNull
        public static final LimitReverseConsecutiveChar INSTANCE = new LimitReverseConsecutiveChar();

        public LimitReverseConsecutiveChar() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$LimitReverseConsecutiveNumber;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LimitReverseConsecutiveNumber extends PassCheckerError {

        @NotNull
        public static final LimitReverseConsecutiveNumber INSTANCE = new LimitReverseConsecutiveNumber();

        public LimitReverseConsecutiveNumber() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$RequireDistance;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequireDistance extends PassCheckerError {

        @NotNull
        public static final RequireDistance INSTANCE = new RequireDistance();

        public RequireDistance() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$RequireLength;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequireLength extends PassCheckerError {

        @NotNull
        public static final RequireLength INSTANCE = new RequireLength();

        public RequireLength() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$RequireLetters;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequireLetters extends PassCheckerError {

        @NotNull
        public static final RequireLetters INSTANCE = new RequireLetters();

        public RequireLetters() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$RequireLowercaseLetters;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequireLowercaseLetters extends PassCheckerError {

        @NotNull
        public static final RequireLowercaseLetters INSTANCE = new RequireLowercaseLetters();

        public RequireLowercaseLetters() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$RequireNumbers;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequireNumbers extends PassCheckerError {

        @NotNull
        public static final RequireNumbers INSTANCE = new RequireNumbers();

        public RequireNumbers() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$RequireQuality;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequireQuality extends PassCheckerError {

        @NotNull
        public static final RequireQuality INSTANCE = new RequireQuality();

        public RequireQuality() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$RequireSpecial;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequireSpecial extends PassCheckerError {

        @NotNull
        public static final RequireSpecial INSTANCE = new RequireSpecial();

        public RequireSpecial() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: PassCheckerError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError$RequireUppercaseLetters;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequireUppercaseLetters extends PassCheckerError {

        @NotNull
        public static final RequireUppercaseLetters INSTANCE = new RequireUppercaseLetters();

        public RequireUppercaseLetters() {
            super(null);
        }
    }

    public /* synthetic */ PassCheckerError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PassCheckerError() {
    }
}
