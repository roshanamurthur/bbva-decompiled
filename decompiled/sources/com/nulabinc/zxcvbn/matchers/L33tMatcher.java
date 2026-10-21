package com.nulabinc.zxcvbn.matchers;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.WipeableString;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class L33tMatcher extends BaseMatcher {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f63688c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Map<String, Integer>> f63689b;

    static {
        HashMap map = new HashMap();
        map.put('a', Arrays.asList('4', '@'));
        map.put('b', Arrays.asList('8'));
        map.put('c', Arrays.asList(Character.valueOf(RootService.OPEN_BRACKET), Character.valueOf(AbstractJsonLexerKt.BEGIN_OBJ), Character.valueOf(AbstractJsonLexerKt.BEGIN_LIST), Character.valueOf(Typography.less)));
        map.put('e', Arrays.asList('3'));
        map.put('g', Arrays.asList('6', '9'));
        map.put('i', Arrays.asList('1', '!', '|'));
        map.put('l', Arrays.asList('1', '|', '7'));
        map.put('o', Arrays.asList('0'));
        map.put('s', Arrays.asList(Character.valueOf(Typography.dollar), '5'));
        map.put('t', Arrays.asList('+', '7'));
        map.put('x', Arrays.asList('%'));
        map.put('z', Arrays.asList('2'));
        f63688c = map;
    }

    public L33tMatcher(Context context, Map<String, Map<String, Integer>> map) {
        super(context);
        this.f63689b = map;
    }

    @Override // com.nulabinc.zxcvbn.Matcher
    public List<Match> execute(CharSequence charSequence) {
        ArrayList<Match> arrayList = new ArrayList();
        Iterator<Map<Character, Character>> it = new L33tSubDict(relevantL33tSubTable(charSequence)).iterator();
        while (true) {
            int i10 = 1;
            if (!it.hasNext()) {
                break;
            }
            Map<Character, Character> next = it.next();
            if (next.isEmpty()) {
                break;
            }
            for (Match match : new DictionaryMatcher(getContext(), this.f63689b).execute(translate(charSequence, next))) {
                WipeableString wipeableStringCopy = WipeableString.copy(charSequence, match.f63691i, match.f63692j + i10);
                WipeableString wipeableStringLowerCase = WipeableString.lowerCase(wipeableStringCopy);
                if (wipeableStringLowerCase.equals(match.matchedWord)) {
                    wipeableStringCopy.wipe();
                    wipeableStringLowerCase.wipe();
                } else {
                    HashMap map = new HashMap();
                    for (Map.Entry<Character, Character> entry : next.entrySet()) {
                        Character key = entry.getKey();
                        Character value = entry.getValue();
                        if (wipeableStringCopy.indexOf(key.charValue()) != -1) {
                            map.put(key, value);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry2 : map.entrySet()) {
                        arrayList2.add(String.format("%s -> %s", (Character) entry2.getKey(), (Character) entry2.getValue()));
                    }
                    arrayList.add(MatchFactory.createDictionaryL33tMatch(match.f63691i, match.f63692j, wipeableStringCopy, match.matchedWord, match.rank, match.dictionaryName, match.reversed, map, Arrays.toString(arrayList2.toArray(new String[0]))));
                    wipeableStringLowerCase.wipe();
                    i10 = 1;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Match match2 : arrayList) {
            if (match2.tokenLength() > 1) {
                arrayList3.add(match2);
            }
        }
        return sorted(arrayList3);
    }

    public Map<Character, List<Character>> relevantL33tSubTable(CharSequence charSequence) {
        return relevantL33tSubTable(charSequence, f63688c);
    }

    public Map<Character, List<Character>> relevantL33tSubTable(CharSequence charSequence, Map<Character, List<Character>> map) {
        HashMap map2 = new HashMap();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            map2.put(Character.valueOf(charSequence.charAt(i10)), Boolean.TRUE);
        }
        HashMap map3 = new HashMap();
        for (Map.Entry<Character, List<Character>> entry : map.entrySet()) {
            Character key = entry.getKey();
            List<Character> value = entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Character ch2 : value) {
                if (map2.containsKey(ch2)) {
                    arrayList.add(ch2);
                }
            }
            if (arrayList.size() > 0) {
                map3.put(key, arrayList);
            }
        }
        return map3;
    }
}
