package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.room.RoomDatabase;
import java.io.PrintStream;
import java.util.Arrays;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public class KeyFrameArray {

    public static class CustomArray {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f18869a = new int[101];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CustomAttribute[] f18870b = new CustomAttribute[101];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18871c;

        public CustomArray() {
            clear();
        }

        public void append(int i10, CustomAttribute customAttribute) {
            CustomAttribute[] customAttributeArr = this.f18870b;
            if (customAttributeArr[i10] != null) {
                remove(i10);
            }
            customAttributeArr[i10] = customAttribute;
            int i11 = this.f18871c;
            this.f18871c = i11 + 1;
            int[] iArr = this.f18869a;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.f18869a, RoomDatabase.MAX_BIND_PARAMETER_CNT);
            Arrays.fill(this.f18870b, (Object) null);
            this.f18871c = 0;
        }

        public void dump() {
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f18869a, this.f18871c)));
            printStream.print("K: [");
            int i10 = 0;
            while (i10 < this.f18871c) {
                PrintStream printStream2 = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "" : ", ");
                sb2.append(valueAt(i10));
                printStream2.print(sb2.toString());
                i10++;
            }
            System.out.println(Constant.BRACKET_CLOSE);
        }

        public int keyAt(int i10) {
            return this.f18869a[i10];
        }

        public void remove(int i10) {
            this.f18870b[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f18871c;
                if (i11 >= i13) {
                    this.f18871c = i13 - 1;
                    return;
                }
                int[] iArr = this.f18869a;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            }
        }

        public int size() {
            return this.f18871c;
        }

        public CustomAttribute valueAt(int i10) {
            return this.f18870b[this.f18869a[i10]];
        }
    }

    public static class CustomVar {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f18872a = new int[101];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CustomVariable[] f18873b = new CustomVariable[101];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18874c;

        public CustomVar() {
            clear();
        }

        public void append(int i10, CustomVariable customVariable) {
            CustomVariable[] customVariableArr = this.f18873b;
            if (customVariableArr[i10] != null) {
                remove(i10);
            }
            customVariableArr[i10] = customVariable;
            int i11 = this.f18874c;
            this.f18874c = i11 + 1;
            int[] iArr = this.f18872a;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.f18872a, RoomDatabase.MAX_BIND_PARAMETER_CNT);
            Arrays.fill(this.f18873b, (Object) null);
            this.f18874c = 0;
        }

        public void dump() {
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f18872a, this.f18874c)));
            printStream.print("K: [");
            int i10 = 0;
            while (i10 < this.f18874c) {
                PrintStream printStream2 = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "" : ", ");
                sb2.append(valueAt(i10));
                printStream2.print(sb2.toString());
                i10++;
            }
            System.out.println(Constant.BRACKET_CLOSE);
        }

        public int keyAt(int i10) {
            return this.f18872a[i10];
        }

        public void remove(int i10) {
            this.f18873b[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f18874c;
                if (i11 >= i13) {
                    this.f18874c = i13 - 1;
                    return;
                }
                int[] iArr = this.f18872a;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            }
        }

        public int size() {
            return this.f18874c;
        }

        public CustomVariable valueAt(int i10) {
            return this.f18873b[this.f18872a[i10]];
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f18875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[][] f18876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18877c;

        public a() {
            int[] iArr = new int[101];
            this.f18875a = iArr;
            float[][] fArr = new float[101][];
            this.f18876b = fArr;
            Arrays.fill(iArr, RoomDatabase.MAX_BIND_PARAMETER_CNT);
            Arrays.fill(fArr, (Object) null);
            this.f18877c = 0;
        }

        public final void a(int i10, float[] fArr) {
            int i11;
            float[][] fArr2 = this.f18876b;
            float[] fArr3 = fArr2[i10];
            int[] iArr = this.f18875a;
            if (fArr3 != null) {
                fArr2[i10] = null;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    i11 = this.f18877c;
                    if (i12 >= i11) {
                        break;
                    }
                    if (i10 == iArr[i12]) {
                        iArr[i12] = 999;
                        i13++;
                    }
                    if (i12 != i13) {
                        iArr[i12] = iArr[i13];
                    }
                    i13++;
                    i12++;
                }
                this.f18877c = i11 - 1;
            }
            fArr2[i10] = fArr;
            int i14 = this.f18877c;
            this.f18877c = i14 + 1;
            iArr[i14] = i10;
            Arrays.sort(iArr);
        }
    }
}
