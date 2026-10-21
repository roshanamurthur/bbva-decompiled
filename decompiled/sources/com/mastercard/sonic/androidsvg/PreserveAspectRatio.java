package com.mastercard.sonic.androidsvg;

import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PreserveAspectRatio.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0003\u0016\u0015\u0017B\u001d\b\u0000\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio;", "", "obj", "", "equals", "", "toString", "Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio$Alignment;", "a", "Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio$Alignment;", "getAlignment", "()Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio$Alignment;", "alignment", "Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio$Scale;", "b", "Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio$Scale;", "getScale", "()Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio$Scale;", ImageScaleTypeHandler.ID, "<init>", "(Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio$Alignment;Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio$Scale;)V", "Companion", "Alignment", "Scale", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class PreserveAspectRatio {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final PreserveAspectRatio f51161c = new PreserveAspectRatio(null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final PreserveAspectRatio f51162d = new PreserveAspectRatio(Alignment.none, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final PreserveAspectRatio f51163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final PreserveAspectRatio f51164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final PreserveAspectRatio f51165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final PreserveAspectRatio f51166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final PreserveAspectRatio f51167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final PreserveAspectRatio f51168j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final PreserveAspectRatio f51169k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Alignment alignment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Scale scale;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: PreserveAspectRatio.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio$Alignment;", "", "none", "xMinYMin", "xMidYMin", "xMaxYMin", "xMinYMid", "xMidYMid", "xMaxYMid", "xMinYMax", "xMidYMax", "xMaxYMax", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Alignment {
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment none;
        public static final Alignment xMaxYMax;
        public static final Alignment xMaxYMid;
        public static final Alignment xMaxYMin;
        public static final Alignment xMidYMax;
        public static final Alignment xMidYMid;
        public static final Alignment xMidYMin;
        public static final Alignment xMinYMax;
        public static final Alignment xMinYMid;
        public static final Alignment xMinYMin;

        static {
            Alignment alignment = new Alignment("none", 0);
            none = alignment;
            Alignment alignment2 = new Alignment("xMinYMin", 1);
            xMinYMin = alignment2;
            Alignment alignment3 = new Alignment("xMidYMin", 2);
            xMidYMin = alignment3;
            Alignment alignment4 = new Alignment("xMaxYMin", 3);
            xMaxYMin = alignment4;
            Alignment alignment5 = new Alignment("xMinYMid", 4);
            xMinYMid = alignment5;
            Alignment alignment6 = new Alignment("xMidYMid", 5);
            xMidYMid = alignment6;
            Alignment alignment7 = new Alignment("xMaxYMid", 6);
            xMaxYMid = alignment7;
            Alignment alignment8 = new Alignment("xMinYMax", 7);
            xMinYMax = alignment8;
            Alignment alignment9 = new Alignment("xMidYMax", 8);
            xMidYMax = alignment9;
            Alignment alignment10 = new Alignment("xMaxYMax", 9);
            xMaxYMax = alignment10;
            $VALUES = new Alignment[]{alignment, alignment2, alignment3, alignment4, alignment5, alignment6, alignment7, alignment8, alignment9, alignment10};
        }

        public Alignment() {
            throw null;
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: PreserveAspectRatio.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio$Companion;", "", "()V", "BOTTOM", "Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio;", "getBOTTOM", "()Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio;", "END", "getEND", "FULLSCREEN", "getFULLSCREEN", "FULLSCREEN_START", "getFULLSCREEN_START", "LETTERBOX", "getLETTERBOX", "START", "getSTART", "STRETCH", "getSTRETCH", "TOP", "getTOP", "UNSCALED", "getUNSCALED", "of", "value", "", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PreserveAspectRatio getBOTTOM() {
            return PreserveAspectRatio.f51167i;
        }

        @NotNull
        public final PreserveAspectRatio getEND() {
            return PreserveAspectRatio.f51165g;
        }

        @NotNull
        public final PreserveAspectRatio getFULLSCREEN() {
            return PreserveAspectRatio.f51168j;
        }

        @NotNull
        public final PreserveAspectRatio getFULLSCREEN_START() {
            return PreserveAspectRatio.f51169k;
        }

        @NotNull
        public final PreserveAspectRatio getLETTERBOX() {
            return PreserveAspectRatio.f51163e;
        }

        @NotNull
        public final PreserveAspectRatio getSTART() {
            return PreserveAspectRatio.f51164f;
        }

        @NotNull
        public final PreserveAspectRatio getSTRETCH() {
            return PreserveAspectRatio.f51162d;
        }

        @NotNull
        public final PreserveAspectRatio getTOP() {
            return PreserveAspectRatio.f51166h;
        }

        @NotNull
        public final PreserveAspectRatio getUNSCALED() {
            return PreserveAspectRatio.f51161c;
        }

        @NotNull
        public final PreserveAspectRatio of(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return SVGParser.INSTANCE.parsePreserveAspectRatio(value);
            } catch (SVGParseException e5) {
                throw new IllegalArgumentException(e5.getMessage());
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: PreserveAspectRatio.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio$Scale;", "", "meet", "slice", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Scale {
        private static final /* synthetic */ Scale[] $VALUES;
        public static final Scale meet;
        public static final Scale slice;

        static {
            Scale scale = new Scale("meet", 0);
            meet = scale;
            Scale scale2 = new Scale("slice", 1);
            slice = scale2;
            $VALUES = new Scale[]{scale, scale2};
        }

        public Scale() {
            throw null;
        }

        public static Scale valueOf(String str) {
            return (Scale) Enum.valueOf(Scale.class, str);
        }

        public static Scale[] values() {
            return (Scale[]) $VALUES.clone();
        }
    }

    static {
        Alignment alignment = Alignment.xMidYMid;
        Scale scale = Scale.meet;
        f51163e = new PreserveAspectRatio(alignment, scale);
        Alignment alignment2 = Alignment.xMinYMin;
        f51164f = new PreserveAspectRatio(alignment2, scale);
        f51165g = new PreserveAspectRatio(Alignment.xMaxYMax, scale);
        f51166h = new PreserveAspectRatio(Alignment.xMidYMin, scale);
        f51167i = new PreserveAspectRatio(Alignment.xMidYMax, scale);
        Scale scale2 = Scale.slice;
        f51168j = new PreserveAspectRatio(alignment, scale2);
        f51169k = new PreserveAspectRatio(alignment2, scale2);
    }

    public PreserveAspectRatio(@Nullable Alignment alignment, @Nullable Scale scale) {
        this.alignment = alignment;
        this.scale = scale;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(PreserveAspectRatio.class, obj.getClass())) {
            return false;
        }
        PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) obj;
        return this.alignment == preserveAspectRatio.alignment && this.scale == preserveAspectRatio.scale;
    }

    @Nullable
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @Nullable
    public final Scale getScale() {
        return this.scale;
    }

    @NotNull
    public String toString() {
        return this.alignment + " " + this.scale;
    }
}
