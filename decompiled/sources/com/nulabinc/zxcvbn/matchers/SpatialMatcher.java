package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.WipeableString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class SpatialMatcher extends BaseMatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f63721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f63722c;

    public SpatialMatcher(Context context, Map<String, Keyboard> map) {
        super(context);
        this.f63721b = Pattern.compile("[~!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:\"ZXCVBNM<>?]");
        this.f63722c = new LinkedHashMap(map);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    @Override // com.nulabinc.zxcvbn.Matcher
    public List<Match> execute(CharSequence charSequence) {
        int i10;
        int i11;
        Iterator it;
        Map<Character, List<String>> map;
        int i12;
        boolean z10;
        List<Match> arrayList = new ArrayList<>();
        Iterator it2 = this.f63722c.values().iterator();
        while (it2.hasNext()) {
            Keyboard keyboard = (Keyboard) it2.next();
            ArrayList arrayList2 = new ArrayList();
            int i13 = 0;
            while (i13 < charSequence.length() - 1) {
                int i14 = i13 + 1;
                if (keyboard.isSlanted()) {
                    if (this.f63721b.matcher(String.valueOf(charSequence.charAt(i13))).find()) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                } else {
                    i10 = 0;
                }
                Map<Character, List<String>> adjacencyGraph = keyboard.getAdjacencyGraph();
                int i15 = i14;
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    i11 = i15 - 1;
                    Character chValueOf = Character.valueOf(charSequence.charAt(i11));
                    List<String> listEmptyList = adjacencyGraph.containsKey(chValueOf) ? adjacencyGraph.get(chValueOf) : Collections.emptyList();
                    if (i15 >= charSequence.length()) {
                        it = it2;
                        map = adjacencyGraph;
                        i12 = i10;
                        z10 = false;
                        break;
                    }
                    Character chValueOf2 = Character.valueOf(charSequence.charAt(i15));
                    Iterator<String> it3 = listEmptyList.iterator();
                    int i18 = -1;
                    while (true) {
                        if (!it3.hasNext()) {
                            it = it2;
                            map = adjacencyGraph;
                            i12 = i10;
                            z10 = false;
                            break;
                        }
                        it = it2;
                        String next = it3.next();
                        map = adjacencyGraph;
                        int i19 = i18 + 1;
                        if (next != null && next.contains(String.valueOf(chValueOf2))) {
                            if (next.indexOf(String.valueOf(chValueOf2)) == 1) {
                                i10++;
                            }
                            if (i16 == i19) {
                                z10 = true;
                                i12 = i10;
                                break;
                            }
                            i17++;
                            z10 = true;
                            i12 = i10;
                            i16 = i19;
                            break;
                        }
                        i18 = i19;
                        adjacencyGraph = map;
                        it2 = it;
                    }
                    if (!z10) {
                        break;
                    }
                    i15++;
                    i10 = i12;
                    adjacencyGraph = map;
                    it2 = it;
                }
                if (i15 - i13 > 2) {
                    arrayList2.add(MatchFactory.createSpatialMatch(i13, i11, WipeableString.copy(charSequence, i13, i15), keyboard.getName(), i17, i12));
                }
                i13 = i15;
                it2 = it;
            }
            extend(arrayList, arrayList2);
        }
        return sorted(arrayList);
    }

    public SpatialMatcher(Context context) {
        this(context, context.getKeyboardMap());
    }
}
