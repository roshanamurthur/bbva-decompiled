package com.vierge.pinpadsdk.message.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class SeparatorLengthValueDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<Short, Integer> f67539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<Short> f67540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<SeparatorLengthValue> f67541c = new ArrayList<>();

    public SeparatorLengthValueDecoder(ArrayList<Short> arrayList) {
        this.f67540b = arrayList;
        HashMap<Short, Integer> map = new HashMap<>();
        this.f67539a = map;
        map.put((short) 193, 1);
        map.put((short) 225, 1);
        map.put((short) 226, 1);
    }

    public static Integer a(ArrayList arrayList) {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                stringBuffer.append(String.format("%02x", (Short) it.next()));
            }
            return Integer.valueOf(Integer.parseInt(stringBuffer.toString(), 16));
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public ArrayList<Short> getRecoveredOjects() {
        return this.f67540b;
    }

    public ArrayList<SeparatorLengthValue> getSLV() {
        ArrayList<Short> arrayList = this.f67540b;
        int size = arrayList.size();
        ArrayList<SeparatorLengthValue> arrayList2 = this.f67541c;
        if (size == 0) {
            return arrayList2;
        }
        Short sh2 = arrayList.get(0);
        HashMap<Short, Integer> map = this.f67539a;
        if (map.containsKey(sh2)) {
            Integer num = map.get(arrayList.remove(0));
            Integer numA = a(new ArrayList(arrayList.subList(0, num.intValue())));
            if (numA.intValue() == 130 && sh2.shortValue() == 193) {
                arrayList.remove(0);
                num = 2;
                numA = a(new ArrayList(arrayList.subList(0, num.intValue())));
            }
            for (int i10 = 0; i10 < num.intValue(); i10++) {
                arrayList.remove(0);
            }
            if (numA.intValue() > arrayList.size()) {
                return arrayList2;
            }
            SeparatorLengthValue separatorLengthValue = new SeparatorLengthValue(new ArrayList(arrayList.subList(0, numA.intValue())));
            for (int i11 = 0; i11 < numA.intValue(); i11++) {
                arrayList.remove(0);
            }
            arrayList2.add(separatorLengthValue);
            getSLV();
        }
        return arrayList2;
    }
}
