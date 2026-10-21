package com.nulabinc.zxcvbn;

import com.nulabinc.zxcvbn.io.ClasspathResource;
import com.nulabinc.zxcvbn.matchers.AlignedKeyboardLoader;
import com.nulabinc.zxcvbn.matchers.Keyboard;
import com.nulabinc.zxcvbn.matchers.KeyboardLoader;
import com.nulabinc.zxcvbn.matchers.SlantedKeyboardLoader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class StandardKeyboards {
    public static final String DVORAK = "dvorak";
    public static final KeyboardLoader DVORAK_LOADER;
    public static final String JIS = "jis";
    public static final KeyboardLoader JIS_LOADER;
    public static final String KEYPAD = "keypad";
    public static final KeyboardLoader KEYPAD_LOADER;
    public static final String MAC_KEYPAD = "mac_keypad";
    public static final KeyboardLoader MAC_KEYPAD_LOADER;
    public static final String QWERTY = "qwerty";
    public static final KeyboardLoader QWERTY_LOADER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final KeyboardLoader[] f63639a;

    static {
        SlantedKeyboardLoader slantedKeyboardLoader = new SlantedKeyboardLoader(QWERTY, new ClasspathResource("/com/nulabinc/zxcvbn/matchers/keyboards/qwerty.txt"));
        QWERTY_LOADER = slantedKeyboardLoader;
        SlantedKeyboardLoader slantedKeyboardLoader2 = new SlantedKeyboardLoader(DVORAK, new ClasspathResource("/com/nulabinc/zxcvbn/matchers/keyboards/dvorak.txt"));
        DVORAK_LOADER = slantedKeyboardLoader2;
        SlantedKeyboardLoader slantedKeyboardLoader3 = new SlantedKeyboardLoader(JIS, new ClasspathResource("/com/nulabinc/zxcvbn/matchers/keyboards/jis.txt"));
        JIS_LOADER = slantedKeyboardLoader3;
        AlignedKeyboardLoader alignedKeyboardLoader = new AlignedKeyboardLoader(KEYPAD, new ClasspathResource("/com/nulabinc/zxcvbn/matchers/keyboards/keypad.txt"));
        KEYPAD_LOADER = alignedKeyboardLoader;
        AlignedKeyboardLoader alignedKeyboardLoader2 = new AlignedKeyboardLoader(MAC_KEYPAD, new ClasspathResource("/com/nulabinc/zxcvbn/matchers/keyboards/mac_keypad.txt"));
        MAC_KEYPAD_LOADER = alignedKeyboardLoader2;
        f63639a = new KeyboardLoader[]{slantedKeyboardLoader, slantedKeyboardLoader2, slantedKeyboardLoader3, alignedKeyboardLoader, alignedKeyboardLoader2};
    }

    public static List<Keyboard> loadAllKeyboards() throws IOException {
        ArrayList arrayList = new ArrayList();
        for (KeyboardLoader keyboardLoader : f63639a) {
            arrayList.add(keyboardLoader.load());
        }
        return arrayList;
    }
}
