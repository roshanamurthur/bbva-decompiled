package com.google.firebase.crashlytics.internal.stacktrace;

import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class RemoveRepeatsStrategy implements StackTraceTrimmingStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48315a;

    public RemoveRepeatsStrategy() {
        this(1);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
        int i10;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i12];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                i13++;
                i11 = 1;
                i10 = i12;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i14 = i12 - iIntValue;
            if (i12 + i14 <= stackTraceElementArr.length) {
                int i15 = 0;
                while (true) {
                    if (i15 >= i14) {
                        int iIntValue2 = i12 - num.intValue();
                        if (i11 < this.f48315a) {
                            System.arraycopy(stackTraceElementArr, i12, stackTraceElementArr2, i13, iIntValue2);
                            i13 += iIntValue2;
                            i11++;
                        }
                        i10 = (iIntValue2 - 1) + i12;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i15].equals(stackTraceElementArr[i12 + i15])) {
                        stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                        i13++;
                        i11 = 1;
                        i10 = i12;
                        break;
                        break;
                    }
                    i15++;
                }
            } else {
                stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                i13++;
                i11 = 1;
                i10 = i12;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i12));
            i12 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i13];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i13);
        return i13 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    public RemoveRepeatsStrategy(int i10) {
        this.f48315a = i10;
    }
}
