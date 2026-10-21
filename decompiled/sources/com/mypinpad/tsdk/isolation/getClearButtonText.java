package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/mypinpad/tsdk/i/getClearButtonText;", "", "<init>", "()V", "setCompoundDrawableTintBlendMode", "setY", "setX", "Lcom/mypinpad/tsdk/i/getClearButtonText$setCompoundDrawableTintBlendMode;", "Lcom/mypinpad/tsdk/i/getClearButtonText$setX;", "Lcom/mypinpad/tsdk/i/getClearButtonText$setY;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class getClearButtonText {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/getClearButtonText$setCompoundDrawableTintBlendMode;", "Lcom/mypinpad/tsdk/i/getClearButtonText;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class setCompoundDrawableTintBlendMode extends getClearButtonText {

        @NotNull
        public static final setCompoundDrawableTintBlendMode INSTANCE = new setCompoundDrawableTintBlendMode();

        static {
            int i10 = (~0) & 33;
            int i11 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public setCompoundDrawableTintBlendMode() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/getClearButtonText$setX;", "Lcom/mypinpad/tsdk/i/getClearButtonText;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class setX extends getClearButtonText {

        @NotNull
        public static final setX INSTANCE = new setX();

        static {
            int i10 = ((121 << 1) - (~(-((~0) & 121)))) - 1;
            int i11 = i10 % 128;
            if (i10 % 2 == 0) {
                int i12 = 20 / 0;
            }
        }

        public setX() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/getClearButtonText$setY;", "Lcom/mypinpad/tsdk/i/getClearButtonText;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class setY extends getClearButtonText {

        @NotNull
        public static final setY INSTANCE = new setY();

        static {
            int i10 = (1 & (-58)) | ((~1) & 57);
            int i11 = -(-((1 & 57) << 1));
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            int i13 = i12 % 128;
            int i14 = i12 % 2;
        }

        public setY() {
            super(null);
        }
    }

    public getClearButtonText() {
    }

    public /* synthetic */ getClearButtonText(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
