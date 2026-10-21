package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public final class copydefault<T> implements Iterable<T>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final JSONArray f55003p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Function2<JSONArray, Integer, T> f55004q0;

    public static final class setX<T> implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f55005s0 = 0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f55006t0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final JSONArray f55007p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final Function2<JSONArray, Integer, T> f55008q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f55009r0;

        /* JADX WARN: Multi-variable type inference failed */
        public setX(@NotNull JSONArray jSONArray, @NotNull Function2<? super JSONArray, ? super Integer, ? extends T> function2) {
            Intrinsics.checkNotNullParameter(jSONArray, "");
            Intrinsics.checkNotNullParameter(function2, "");
            this.f55007p0 = jSONArray;
            this.f55008q0 = function2;
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = (((~((~i10) | i12)) | i13) * (-318)) + (i11 * (-317)) + (i10 * 319);
            int i15 = ~(i13 | i12);
            int i16 = ~i12;
            int i17 = (((~(i10 | i11 | i12)) | (~(i13 | i16 | i10))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + ((i15 | (~(i16 | i10 | i11))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + i14;
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
                setX setx = (setX) objArr[0];
                int i18 = f55006t0;
                int i19 = i18 ^ 35;
                int i20 = (i18 & 35) << 1;
                int i21 = (i19 & i20) + (i20 | i19);
                f55005s0 = i21 % 128;
                int i22 = i21 % 2;
                int i23 = setx.f55009r0;
                JSONArray jSONArray = setx.f55007p0;
                if (i22 != 0) {
                    jSONArray.length();
                    throw null;
                }
                if (i23 < jSONArray.length()) {
                    int i24 = f55005s0;
                    int i25 = (i24 ^ 99) + ((i24 & 99) << 1);
                    f55006t0 = i25 % 128;
                    int i26 = i25 % 2;
                    return Boolean.TRUE;
                }
                int i27 = f55005s0;
                int i28 = i27 & 125;
                int i29 = ((i27 ^ 125) | i28) << 1;
                int i30 = -((i27 | 125) & (~i28));
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                f55006t0 = i31 % 128;
                if (i31 % 2 != 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
            setX setx2 = (setX) objArr[0];
            int i32 = f55005s0;
            int i33 = (i32 & 97) + (i32 | 97);
            f55006t0 = i33 % 128;
            int i34 = i33 % 2;
            Function2<JSONArray, Integer, T> function2 = setx2.f55008q0;
            int i35 = setx2.f55009r0;
            int iIdentityHashCode = System.identityHashCode(setx2);
            int i36 = -(-(i35 * (-613)));
            int i37 = ((615 | i36) << 1) - (i36 ^ 615);
            int i38 = ~((-2) | i35);
            int i39 = (~i38) & iIdentityHashCode;
            int i40 = ~iIdentityHashCode;
            int i41 = i39 | (i38 & i40);
            int i42 = i38 & iIdentityHashCode;
            int i43 = (i42 & i41) | (i41 ^ i42);
            int i44 = ~i35;
            int i45 = ~i35;
            int i46 = i44 & (i45 | i35);
            int i47 = i46 ^ 1;
            int i48 = i46 & 1;
            int i49 = ~((i48 & i47) | (i47 ^ i48));
            int i50 = ((i43 & i49) | (i43 ^ i49)) * 614;
            int i51 = (((~i50) & i37) | ((~i37) & i50)) + ((i50 & i37) << 1);
            int i52 = ((~i40) & (-2)) | (i40 & 1);
            int i53 = (-2) & i40;
            int i54 = ~((i52 & i53) | (i52 ^ i53));
            int i55 = (-2) & i35;
            int i56 = (~i55) & ((-2) | i35);
            int i57 = ~((i55 & i56) | (i56 ^ i55));
            int i58 = (i54 & i57) | (i54 ^ i57);
            int i59 = (iIdentityHashCode | i40) & (~iIdentityHashCode);
            int i60 = ~((i59 & i35) | (i59 ^ i35));
            int i61 = i58 ^ i60;
            int i62 = i60 & i58;
            int i63 = ((i62 & i61) | (i61 ^ i62)) * (-1228);
            int i64 = i51 & i63;
            int i65 = i64 + ((i63 ^ i51) | i64);
            int i66 = (-2) ^ i45;
            int i67 = (-2) & i45;
            int i68 = (i66 & i67) | (i66 ^ i67);
            int i69 = ~((i68 & i40) | (i68 ^ i40));
            int i70 = i40 & 1;
            int i71 = (~i70) & (i40 | 1);
            int i72 = (i70 & i71) | (i71 ^ i70);
            int i73 = (i72 & i45) | ((~i72) & i35);
            int i74 = i72 & i35;
            int i75 = ~((i74 & i73) | (i73 ^ i74));
            int i76 = i69 & i75;
            int i77 = -(-((((i69 | i75) & (~i76)) | i76) * 614));
            int i78 = ((~i77) & i65) | ((~i65) & i77);
            int i79 = -(-((i77 & i65) << 1));
            setx2.f55009r0 = ((i78 | i79) << 1) - (i79 ^ i78);
            T tInvoke = function2.invoke(setx2.f55007p0, Integer.valueOf(i35));
            int i80 = f55006t0;
            int i81 = ((i80 | 49) << 1) - (i80 ^ 49);
            f55005s0 = i81 % 128;
            int i82 = i81 % 2;
            return tInvoke;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return ((Boolean) setX(new Object[]{this}, 325297876, -325297874, System.identityHashCode(this))).booleanValue();
        }

        @Override // java.util.Iterator
        public final T next() {
            return (T) setX(new Object[]{this}, 1288992880, -1288992879, System.identityHashCode(this));
        }

        @Override // java.util.Iterator
        public final void remove() {
            setX(new Object[]{this}, 65526568, -65526568, System.identityHashCode(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public copydefault(@NotNull JSONArray jSONArray, @NotNull Function2<? super JSONArray, ? super Integer, ? extends T> function2) {
        Intrinsics.checkNotNullParameter(jSONArray, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.f55003p0 = jSONArray;
        this.f55004q0 = function2;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        copydefault copydefaultVar = (copydefault) objArr[0];
        return new setX(copydefaultVar.f55003p0, copydefaultVar.f55004q0);
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<T> iterator() {
        return (Iterator) setY(new Object[]{this}, -1480141747, 1480141747, System.identityHashCode(this));
    }
}
