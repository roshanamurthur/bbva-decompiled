package com.mypinpad.tsdk.isolation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import com.esotericsoftware.asm.Opcodes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000fX\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/mypinpad/tsdk/i/setIndicatorBoundsRelative;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/mypinpad/tsdk/i/setIndicatorBoundsRelative$setCompoundDrawableTintBlendMode;", "padViewListener", "", "setPadViewListener", "(Lcom/mypinpad/tsdk/i/setIndicatorBoundsRelative$setCompoundDrawableTintBlendMode;)V", "Landroid/view/MotionEvent;", "p0", "", "onFilterTouchEventForSecurity", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "onDetachedFromWindow", "()V", "Lcom/mypinpad/tsdk/i/setLongClickable;", "setY", "Lcom/mypinpad/tsdk/i/setLongClickable;", "setCompoundDrawableTintBlendMode", "Landroid/content/Context;", "p1", "<init>", "(Landroid/content/Context;Lcom/mypinpad/tsdk/i/setLongClickable;)V"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
public final class setIndicatorBoundsRelative extends AppCompatImageView {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f59903w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f59904x0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f59905s0;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @Nullable
    public setLongClickable setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public setCompoundDrawableTintBlendMode f59906t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f59907u0;
    public float v0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&¢\u0006\u0004\b\u0005\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/setIndicatorBoundsRelative$setCompoundDrawableTintBlendMode;", "", "", "setCompoundDrawableTintBlendMode", "()V", "setOnFocusChangeListener", "", "p0", "p1", "(FF)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface setCompoundDrawableTintBlendMode {
        void setCompoundDrawableTintBlendMode();

        void setOnFocusChangeListener();

        void setOnFocusChangeListener(float p4, float p10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setIndicatorBoundsRelative(@NotNull Context context, @Nullable setLongClickable setlongclickable) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.setCompoundDrawableTintBlendMode = setlongclickable;
        setAdjustViewBounds(true);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:30:0x010e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0146  */
    /* JADX WARN: Code duplicated, block: B:39:0x014e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0152  */
    /* JADX WARN: Code duplicated, block: B:43:0x0177  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:62:0x0207  */
    /* JADX WARN: Code duplicated, block: B:66:0x0225  */
    /* JADX WARN: Code duplicated, block: B:68:0x022c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0249  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        Boolean boolValueOf;
        setLongClickable setlongclickable;
        int action;
        int i15;
        int i16;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2;
        int i17 = ~i10;
        int i18 = (((~(i11 | (~i12))) | (~(i17 | i11))) * Opcodes.ATHROW) + ((i10 | (~(i11 | i12))) * Opcodes.ATHROW) + (i17 * (-191)) + (i11 * 192) + (i10 * (-381));
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = null;
        boolean z10 = false;
        if (i18 == 1) {
            setIndicatorBoundsRelative setindicatorboundsrelative = (setIndicatorBoundsRelative) objArr[0];
            int i19 = f59904x0;
            int i20 = i19 & 17;
            int i21 = -(-((i19 ^ 17) | i20));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            int i23 = i22 % 128;
            f59903w0 = i23;
            int i24 = i22 % 2;
            setindicatorboundsrelative.f59905s0 = true;
            int i25 = i23 + 35;
            f59904x0 = i25 % 128;
            if (i25 % 2 != 0) {
                return null;
            }
            int i26 = 76 / 0;
            return null;
        }
        if (i18 == 2) {
            setIndicatorBoundsRelative setindicatorboundsrelative2 = (setIndicatorBoundsRelative) objArr[0];
            MotionEvent motionEvent = (MotionEvent) objArr[1];
            int i27 = f59903w0;
            int i28 = ((i27 ^ 98) + ((i27 & 98) << 1)) - 1;
            f59904x0 = i28 % 128;
            if (i28 % 2 == 0) {
                Intrinsics.checkNotNullParameter(motionEvent, "");
                if (Build.VERSION.SDK_INT >= 84) {
                    if ((motionEvent.getFlags() & 1) == 0) {
                        int i29 = f59903w0;
                        int i30 = ((i29 & (-56)) | ((~i29) & 55)) + ((i29 & 55) << 1);
                        f59904x0 = i30 % 128;
                        int i31 = i30 % 2;
                        if ((motionEvent.getFlags() & 2) == 0) {
                            int i32 = f59903w0;
                            int i33 = i32 ^ 73;
                            i14 = (((i32 & 73) | i33) << 1) - i33;
                            f59904x0 = i14 % 128;
                            int i34 = i14 % 2;
                        }
                    }
                    int i35 = f59903w0 + 98;
                    i13 = (i35 ^ (-1)) + (i35 << 1);
                    f59904x0 = i13 % 128;
                    int i36 = i13 % 2;
                    z10 = true;
                } else if ((motionEvent.getFlags() & 1) != 0) {
                    int i37 = f59903w0;
                    int i38 = i37 & 121;
                    int i39 = (i37 ^ 121) | i38;
                    int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                    int i41 = i40 % 128;
                    f59904x0 = i41;
                    int i42 = i40 % 2;
                    i13 = ((-1) << 1) - ((i41 + 40) ^ (-1));
                    f59903w0 = i13 % 128;
                    int i310 = i13 % 2;
                    z10 = true;
                } else {
                    i14 = f59903w0 + 75;
                    f59904x0 = i14 % 128;
                    int i311 = i14 % 2;
                }
            } else {
                Intrinsics.checkNotNullParameter(motionEvent, "");
                if (Build.VERSION.SDK_INT >= 29) {
                    if ((motionEvent.getFlags() & 1) == 0) {
                        int i210 = f59903w0;
                        int i312 = ((i210 & (-56)) | ((~i210) & 55)) + ((i210 & 55) << 1);
                        f59904x0 = i312 % 128;
                        int i313 = i312 % 2;
                        if ((motionEvent.getFlags() & 2) == 0) {
                            int i314 = f59903w0;
                            int i315 = i314 ^ 73;
                            i14 = (((i314 & 73) | i315) << 1) - i315;
                            f59904x0 = i14 % 128;
                            int i316 = i14 % 2;
                        }
                    }
                    int i317 = f59903w0 + 98;
                    i13 = (i317 ^ (-1)) + (i317 << 1);
                    f59904x0 = i13 % 128;
                    int i318 = i13 % 2;
                    z10 = true;
                } else if ((motionEvent.getFlags() & 1) != 0) {
                    int i319 = f59903w0;
                    int i320 = i319 & 121;
                    int i321 = (i319 ^ 121) | i320;
                    int i43 = ((i320 | i321) << 1) - (i321 ^ i320);
                    int i44 = i43 % 128;
                    f59904x0 = i44;
                    int i45 = i43 % 2;
                    i13 = ((-1) << 1) - ((i44 + 40) ^ (-1));
                    f59903w0 = i13 % 128;
                    int i3110 = i13 % 2;
                    z10 = true;
                } else {
                    i14 = f59903w0 + 75;
                    f59904x0 = i14 % 128;
                    int i3111 = i14 % 2;
                }
            }
            if (!z10) {
                boolean zOnFilterTouchEventForSecurity = super.onFilterTouchEventForSecurity(motionEvent);
                int i46 = f59904x0;
                int i47 = i46 & 71;
                int i48 = ((i46 ^ 71) | i47) << 1;
                int i49 = -((i46 | 71) & (~i47));
                int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                f59903w0 = i50 % 128;
                int i51 = i50 % 2;
                boolValueOf = Boolean.valueOf(zOnFilterTouchEventForSecurity);
            } else {
                int i52 = f59904x0;
                int i53 = i52 & 11;
                int i54 = (i53 - (~(-(-((i52 ^ 11) | i53))))) - 1;
                int i55 = i54 % 128;
                f59903w0 = i55;
                int i56 = i54 % 2;
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = setindicatorboundsrelative2.f59906t0;
                if (setcompounddrawabletintblendmode4 == null) {
                    int i57 = (i55 & 45) + (i55 | 45);
                    f59904x0 = i57 % 128;
                    int i58 = i57 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i59 = f59903w0;
                    int i60 = i59 & 101;
                    int i61 = -(-((i59 ^ 101) | i60));
                    int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                    f59904x0 = i62 % 128;
                    int i63 = i62 % 2;
                } else {
                    setcompounddrawabletintblendmode3 = setcompounddrawabletintblendmode4;
                }
                setcompounddrawabletintblendmode3.setOnFocusChangeListener();
                int i64 = f59904x0;
                int i65 = i64 & 49;
                int i66 = -(-((i64 ^ 49) | i65));
                int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
                f59903w0 = i67 % 128;
                int i68 = i67 % 2;
                boolValueOf = Boolean.FALSE;
            }
        } else {
            if (i18 != 3) {
                setIndicatorBoundsRelative setindicatorboundsrelative3 = (setIndicatorBoundsRelative) objArr[0];
                int i69 = f59903w0;
                int i70 = i69 & 91;
                int i71 = (i70 - (~(-(-((i69 ^ 91) | i70))))) - 1;
                int i72 = i71 % 128;
                f59904x0 = i72;
                if (i71 % 2 == 0) {
                    setcompounddrawabletintblendmode2 = setindicatorboundsrelative3.f59906t0;
                    int i73 = 44 / 0;
                    if (setcompounddrawabletintblendmode2 == null) {
                        int i74 = i72 + 63;
                        f59903w0 = i74 % 128;
                        int i75 = i74 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i76 = f59903w0;
                        int i77 = ((i76 & 34) + (i76 | 34)) - 1;
                        f59904x0 = i77 % 128;
                        int i78 = i77 % 2;
                        setcompounddrawabletintblendmode2 = null;
                    }
                } else {
                    setcompounddrawabletintblendmode2 = setindicatorboundsrelative3.f59906t0;
                    if (setcompounddrawabletintblendmode2 == null) {
                        int i79 = i72 + 63;
                        f59903w0 = i79 % 128;
                        int i710 = i79 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i711 = f59903w0;
                        int i712 = ((i711 & 34) + (i711 | 34)) - 1;
                        f59904x0 = i712 % 128;
                        int i713 = i712 % 2;
                        setcompounddrawabletintblendmode2 = null;
                    }
                }
                setcompounddrawabletintblendmode2.setCompoundDrawableTintBlendMode();
                super.onDetachedFromWindow();
                setCompoundDrawableTintBlendMode(new Object[]{setindicatorboundsrelative3}, -1586316133, 1586316134, System.identityHashCode(setindicatorboundsrelative3));
                int i80 = f59903w0;
                int i81 = i80 & 107;
                int i82 = ((i80 ^ 107) | i81) << 1;
                int i83 = -((i80 | 107) & (~i81));
                int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                f59904x0 = i84 % 128;
                int i85 = i84 % 2;
                return null;
            }
            setIndicatorBoundsRelative setindicatorboundsrelative4 = (setIndicatorBoundsRelative) objArr[0];
            MotionEvent motionEvent2 = (MotionEvent) objArr[1];
            int i86 = f59904x0;
            int i87 = (i86 & 119) + (i86 | 119);
            f59903w0 = i87 % 128;
            if (i87 % 2 != 0) {
                Intrinsics.checkNotNullParameter(motionEvent2, "");
                int i88 = 46 / 0;
                if (!(!setindicatorboundsrelative4.f59905s0)) {
                    int i89 = f59903w0;
                    int i90 = (((i89 & (-86)) | ((~i89) & 85)) - (~(-(-((i89 & 85) << 1))))) - 1;
                    f59904x0 = i90 % 128;
                    int i91 = i90 % 2;
                } else {
                    setlongclickable = setindicatorboundsrelative4.setCompoundDrawableTintBlendMode;
                    if (setlongclickable != null) {
                        int i92 = f59904x0 + 37;
                        f59903w0 = i92 % 128;
                        int i93 = i92 % 2;
                        ((Boolean) setLongClickable.setY(new Object[]{setlongclickable, setindicatorboundsrelative4, motionEvent2}, 999235707, -999235706, System.identityHashCode(setlongclickable))).booleanValue();
                        int i94 = f59904x0;
                        int i95 = ((i94 | 89) << 1) - (((~i94) & 89) | (i94 & (-90)));
                        f59903w0 = i95 % 128;
                        int i96 = i95 % 2;
                    } else {
                        int i97 = f59903w0;
                        int i98 = i97 & 115;
                        int i99 = (i97 ^ 115) | i98;
                        int i100 = (i98 ^ i99) + ((i99 & i98) << 1);
                        f59904x0 = i100 % 128;
                        int i101 = i100 % 2;
                    }
                    action = motionEvent2.getAction();
                    if (action != 0) {
                        setindicatorboundsrelative4.f59907u0 = motionEvent2.getX();
                        setindicatorboundsrelative4.v0 = motionEvent2.getY();
                        int i102 = f59903w0;
                        int i103 = (((i102 | 42) << 1) - (i102 ^ 42)) - 1;
                        f59904x0 = i103 % 128;
                        int i104 = i103 % 2;
                    } else if (action == 1 && ((float) Math.sqrt(((float) Math.pow(motionEvent2.getX() - setindicatorboundsrelative4.f59907u0, 2.0d)) + ((float) Math.pow(motionEvent2.getY() - setindicatorboundsrelative4.v0, 2.0d)))) < 100.0f) {
                        i16 = f59903w0 + 39;
                        f59904x0 = i16 % 128;
                        if (i16 % 2 == 0) {
                            setcompounddrawabletintblendmode = setindicatorboundsrelative4.f59906t0;
                            int i105 = 16 / 0;
                            if (setcompounddrawabletintblendmode == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                int i106 = f59904x0;
                                int i107 = (i106 & 47) + (i106 | 47);
                                f59903w0 = i107 % 128;
                                int i108 = i107 % 2;
                                setcompounddrawabletintblendmode = null;
                            }
                        } else {
                            setcompounddrawabletintblendmode = setindicatorboundsrelative4.f59906t0;
                            if (setcompounddrawabletintblendmode == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                int i109 = f59904x0;
                                int i1010 = (i109 & 47) + (i109 | 47);
                                f59903w0 = i1010 % 128;
                                int i1011 = i1010 % 2;
                                setcompounddrawabletintblendmode = null;
                            }
                        }
                        setcompounddrawabletintblendmode.setOnFocusChangeListener(motionEvent2.getX(), motionEvent2.getY());
                        int i110 = f59904x0 + 1;
                        f59903w0 = i110 % 128;
                        int i111 = i110 % 2;
                    }
                    int i112 = f59903w0 + 88;
                    i15 = (i112 ^ (-1)) + (i112 << 1);
                    f59904x0 = i15 % 128;
                    if (i15 % 2 == 0) {
                        throw null;
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(motionEvent2, "");
                if (!setindicatorboundsrelative4.f59905s0) {
                    setlongclickable = setindicatorboundsrelative4.setCompoundDrawableTintBlendMode;
                    if (setlongclickable != null) {
                        int i910 = f59904x0 + 37;
                        f59903w0 = i910 % 128;
                        int i911 = i910 % 2;
                        ((Boolean) setLongClickable.setY(new Object[]{setlongclickable, setindicatorboundsrelative4, motionEvent2}, 999235707, -999235706, System.identityHashCode(setlongclickable))).booleanValue();
                        int i912 = f59904x0;
                        int i913 = ((i912 | 89) << 1) - (((~i912) & 89) | (i912 & (-90)));
                        f59903w0 = i913 % 128;
                        int i914 = i913 % 2;
                    } else {
                        int i915 = f59903w0;
                        int i916 = i915 & 115;
                        int i917 = (i915 ^ 115) | i916;
                        int i1012 = (i916 ^ i917) + ((i917 & i916) << 1);
                        f59904x0 = i1012 % 128;
                        int i1013 = i1012 % 2;
                    }
                    action = motionEvent2.getAction();
                    if (action != 0) {
                        setindicatorboundsrelative4.f59907u0 = motionEvent2.getX();
                        setindicatorboundsrelative4.v0 = motionEvent2.getY();
                        int i1014 = f59903w0;
                        int i1015 = (((i1014 | 42) << 1) - (i1014 ^ 42)) - 1;
                        f59904x0 = i1015 % 128;
                        int i1016 = i1015 % 2;
                    } else if (action == 1) {
                        i16 = f59903w0 + 39;
                        f59904x0 = i16 % 128;
                        if (i16 % 2 == 0) {
                            setcompounddrawabletintblendmode = setindicatorboundsrelative4.f59906t0;
                            int i1017 = 16 / 0;
                            if (setcompounddrawabletintblendmode == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                int i1018 = f59904x0;
                                int i1019 = (i1018 & 47) + (i1018 | 47);
                                f59903w0 = i1019 % 128;
                                int i10110 = i1019 % 2;
                                setcompounddrawabletintblendmode = null;
                            }
                        } else {
                            setcompounddrawabletintblendmode = setindicatorboundsrelative4.f59906t0;
                            if (setcompounddrawabletintblendmode == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                int i10111 = f59904x0;
                                int i10112 = (i10111 & 47) + (i10111 | 47);
                                f59903w0 = i10112 % 128;
                                int i10113 = i10112 % 2;
                                setcompounddrawabletintblendmode = null;
                            }
                        }
                        setcompounddrawabletintblendmode.setOnFocusChangeListener(motionEvent2.getX(), motionEvent2.getY());
                        int i113 = f59904x0 + 1;
                        f59903w0 = i113 % 128;
                        int i114 = i113 % 2;
                    }
                    int i115 = f59903w0 + 88;
                    i15 = (i115 ^ (-1)) + (i115 << 1);
                    f59904x0 = i15 % 128;
                    if (i15 % 2 == 0) {
                        throw null;
                    }
                } else {
                    int i810 = f59903w0;
                    int i918 = (((i810 & (-86)) | ((~i810) & 85)) - (~(-(-((i810 & 85) << 1))))) - 1;
                    f59904x0 = i918 % 128;
                    int i919 = i918 % 2;
                }
            }
            boolValueOf = Boolean.TRUE;
        }
        return boolValueOf;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, 1422049756, -1422049756, System.identityHashCode(this));
    }

    @Override // android.view.View
    public final boolean onFilterTouchEventForSecurity(@NotNull MotionEvent p4) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, -853131139, 853131141, System.identityHashCode(this))).booleanValue();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@NotNull MotionEvent p4) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, -1941115458, 1941115461, System.identityHashCode(this))).booleanValue();
    }

    public final void setPadViewListener(@NotNull setCompoundDrawableTintBlendMode padViewListener) {
        int i10 = f59903w0;
        int i11 = ((i10 ^ 108) + ((i10 & 108) << 1)) - 1;
        f59904x0 = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(padViewListener, "");
            this.f59906t0 = padViewListener;
        } else {
            Intrinsics.checkNotNullParameter(padViewListener, "");
            this.f59906t0 = padViewListener;
            throw null;
        }
    }
}
