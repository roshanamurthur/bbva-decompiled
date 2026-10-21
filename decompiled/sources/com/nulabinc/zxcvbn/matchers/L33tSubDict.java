package com.nulabinc.zxcvbn.matchers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class L33tSubDict implements Iterable<Map<Character, Character>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ArrayList f63690p0;

    public L33tSubDict(Map<Character, List<Character>> map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new ArrayList());
        Set<List> setA = a(map, map.keySet().iterator(), linkedHashSet);
        ArrayList arrayList = new ArrayList();
        for (List<CharSequence> list : setA) {
            HashMap map2 = new HashMap();
            for (CharSequence charSequence : list) {
                map2.put(Character.valueOf(charSequence.charAt(0)), Character.valueOf(charSequence.charAt(1)));
            }
            arrayList.add(map2);
        }
        this.f63690p0 = arrayList;
    }

    public static Set a(Map map, Iterator it, LinkedHashSet linkedHashSet) {
        if (!it.hasNext()) {
            return linkedHashSet;
        }
        Character ch2 = (Character) it.next();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Character ch3 : (List) map.get(ch2)) {
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                List list = (List) it2.next();
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        ArrayList arrayList = new ArrayList(list);
                        arrayList.add(String.valueOf(new char[]{ch3.charValue(), ch2.charValue()}));
                        linkedHashSet2.add(arrayList);
                        break;
                    }
                    if (((String) list.get(i10)).charAt(0) == ch3.charValue()) {
                        ArrayList arrayList2 = new ArrayList(list);
                        arrayList2.remove(i10);
                        arrayList2.add(String.valueOf(new char[]{ch3.charValue(), ch2.charValue()}));
                        linkedHashSet2.add(list);
                        linkedHashSet2.add(arrayList2);
                        break;
                    }
                    i10++;
                }
            }
        }
        return a(map, it, linkedHashSet2);
    }

    @Override // java.lang.Iterable
    public Iterator<Map<Character, Character>> iterator() {
        return this.f63690p0.iterator();
    }
}
