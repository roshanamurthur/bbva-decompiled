package com.bbva.glomohybrid.infoscreen.scratchCard.models;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScratchcardEvents.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/scratchCard/models/ScratchcardEvents;", "", "()V", "OnCloseTapped", "OnContinueTapped", "OnRevealedTapped", "Lcom/bbva/glomohybrid/infoscreen/scratchCard/models/ScratchcardEvents$OnCloseTapped;", "Lcom/bbva/glomohybrid/infoscreen/scratchCard/models/ScratchcardEvents$OnContinueTapped;", "Lcom/bbva/glomohybrid/infoscreen/scratchCard/models/ScratchcardEvents$OnRevealedTapped;", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ScratchcardEvents {

    /* JADX INFO: compiled from: ScratchcardEvents.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/scratchCard/models/ScratchcardEvents$OnCloseTapped;", "Lcom/bbva/glomohybrid/infoscreen/scratchCard/models/ScratchcardEvents;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnCloseTapped extends ScratchcardEvents {

        @NotNull
        public static final OnCloseTapped INSTANCE = new OnCloseTapped();

        public OnCloseTapped() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnCloseTapped)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1583879762;
        }

        @NotNull
        public String toString() {
            return "OnCloseTapped";
        }
    }

    /* JADX INFO: compiled from: ScratchcardEvents.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/scratchCard/models/ScratchcardEvents$OnContinueTapped;", "Lcom/bbva/glomohybrid/infoscreen/scratchCard/models/ScratchcardEvents;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnContinueTapped extends ScratchcardEvents {

        @NotNull
        public static final OnContinueTapped INSTANCE = new OnContinueTapped();

        public OnContinueTapped() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnContinueTapped)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 323790757;
        }

        @NotNull
        public String toString() {
            return "OnContinueTapped";
        }
    }

    /* JADX INFO: compiled from: ScratchcardEvents.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/scratchCard/models/ScratchcardEvents$OnRevealedTapped;", "Lcom/bbva/glomohybrid/infoscreen/scratchCard/models/ScratchcardEvents;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnRevealedTapped extends ScratchcardEvents {

        @NotNull
        public static final OnRevealedTapped INSTANCE = new OnRevealedTapped();

        public OnRevealedTapped() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnRevealedTapped)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 75921514;
        }

        @NotNull
        public String toString() {
            return "OnRevealedTapped";
        }
    }

    public ScratchcardEvents() {
    }

    public /* synthetic */ ScratchcardEvents(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
