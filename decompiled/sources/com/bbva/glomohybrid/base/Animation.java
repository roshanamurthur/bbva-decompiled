package com.bbva.glomohybrid.base;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Animation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/bbva/glomohybrid/base/Animation;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getEnterAnim", "()I", "enterAnim", "b", "getExitAnim", "exitAnim", "Fade", "None", "SlideLeft", "SlideRight", "SlideUp", "Lcom/bbva/glomohybrid/base/Animation$Fade;", "Lcom/bbva/glomohybrid/base/Animation$None;", "Lcom/bbva/glomohybrid/base/Animation$SlideLeft;", "Lcom/bbva/glomohybrid/base/Animation$SlideRight;", "Lcom/bbva/glomohybrid/base/Animation$SlideUp;", "Base_release"}, k = 1, mv = {1, 9, 0})
public abstract class Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int enterAnim;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int exitAnim;

    /* JADX INFO: compiled from: Animation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/base/Animation$Fade;", "Lcom/bbva/glomohybrid/base/Animation;", "()V", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Fade extends Animation {

        @NotNull
        public static final Fade INSTANCE = new Fade();

        public Fade() {
            super(R.anim.fade_in, R.anim.none, null);
        }
    }

    /* JADX INFO: compiled from: Animation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/base/Animation$None;", "Lcom/bbva/glomohybrid/base/Animation;", "()V", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class None extends Animation {

        @NotNull
        public static final None INSTANCE = new None();

        /* JADX WARN: Illegal instructions before constructor call */
        public None() {
            int i10 = R.anim.none;
            super(i10, i10, null);
        }
    }

    /* JADX INFO: compiled from: Animation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/base/Animation$SlideLeft;", "Lcom/bbva/glomohybrid/base/Animation;", "()V", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SlideLeft extends Animation {

        @NotNull
        public static final SlideLeft INSTANCE = new SlideLeft();

        public SlideLeft() {
            super(R.anim.slide_right_in, R.anim.slide_right_out, null);
        }
    }

    /* JADX INFO: compiled from: Animation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/base/Animation$SlideRight;", "Lcom/bbva/glomohybrid/base/Animation;", "()V", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SlideRight extends Animation {

        @NotNull
        public static final SlideRight INSTANCE = new SlideRight();

        public SlideRight() {
            super(R.anim.slide_left_in, R.anim.slide_left_out, null);
        }
    }

    /* JADX INFO: compiled from: Animation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/base/Animation$SlideUp;", "Lcom/bbva/glomohybrid/base/Animation;", "()V", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SlideUp extends Animation {

        @NotNull
        public static final SlideUp INSTANCE = new SlideUp();

        public SlideUp() {
            super(R.anim.slide_from_bottom, R.anim.none, null);
        }
    }

    public Animation(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this.enterAnim = i10;
        this.exitAnim = i11;
    }

    public final int getEnterAnim() {
        return this.enterAnim;
    }

    public final int getExitAnim() {
        return this.exitAnim;
    }
}
