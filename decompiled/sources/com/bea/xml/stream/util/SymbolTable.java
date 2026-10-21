package com.bea.xml.stream.util;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import oc.b;

/* JADX INFO: loaded from: classes9.dex */
public class SymbolTable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37912a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Stack f37913b = new Stack();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f37914c = new HashMap();

    public static void main(String[] strArr) throws Exception {
        SymbolTable symbolTable = new SymbolTable();
        symbolTable.openScope();
        symbolTable.put("x", "foo");
        symbolTable.put("y", "bar");
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer("1 x:");
        stringBuffer.append(symbolTable.get("x"));
        printStream.println(stringBuffer.toString());
        StringBuffer stringBuffer2 = new StringBuffer("1 y:");
        stringBuffer2.append(symbolTable.get("y"));
        printStream.println(stringBuffer2.toString());
        symbolTable.openScope();
        symbolTable.put("x", "bar");
        symbolTable.put("y", "foo");
        symbolTable.openScope();
        symbolTable.put("x", "barbie");
        symbolTable.openScope();
        symbolTable.closeScope();
        StringBuffer stringBuffer3 = new StringBuffer("3 x:");
        stringBuffer3.append(symbolTable.get("x"));
        printStream.println(stringBuffer3.toString());
        symbolTable.closeScope();
        StringBuffer stringBuffer4 = new StringBuffer("2 x:");
        stringBuffer4.append(symbolTable.get("x"));
        printStream.println(stringBuffer4.toString());
        StringBuffer stringBuffer5 = new StringBuffer("2 y:");
        stringBuffer5.append(symbolTable.get("y"));
        printStream.println(stringBuffer5.toString());
        printStream.print(symbolTable);
        symbolTable.closeScope();
        StringBuffer stringBuffer6 = new StringBuffer("1 x:");
        stringBuffer6.append(symbolTable.get("x"));
        printStream.println(stringBuffer6.toString());
        StringBuffer stringBuffer7 = new StringBuffer("1 y:");
        stringBuffer7.append(symbolTable.get("y"));
        printStream.println(stringBuffer7.toString());
        symbolTable.closeScope();
        printStream.print(symbolTable);
    }

    public void clear() {
        this.f37912a = 0;
        this.f37913b.clear();
        this.f37914c.clear();
    }

    public void closeScope() {
        Stack stack = this.f37913b;
        for (int i10 = ((b) stack.peek()).f85393c; i10 == this.f37912a && !stack.isEmpty(); i10 = ((b) stack.peek()).f85393c) {
            ((Stack) this.f37914c.get(((b) stack.pop()).f85391a)).pop();
            if (stack.isEmpty()) {
                break;
            }
        }
        this.f37912a--;
    }

    public String get(String str) {
        Stack stack = (Stack) this.f37914c.get(str);
        if (stack == null || stack.isEmpty()) {
            return null;
        }
        return (String) stack.peek();
    }

    public Set getAll(String str) {
        HashSet hashSet = new HashSet();
        for (b bVar : this.f37913b) {
            if (str.equals(bVar.f85391a)) {
                hashSet.add(bVar.f85392b);
            }
        }
        return hashSet;
    }

    public int getDepth() {
        return this.f37912a;
    }

    public void openScope() {
        this.f37912a++;
    }

    public void put(String str, String str2) {
        int i10 = this.f37912a;
        b bVar = new b();
        bVar.f85391a = str;
        bVar.f85392b = str2;
        bVar.f85393c = i10;
        this.f37913b.push(bVar);
        HashMap map = this.f37914c;
        if (map.containsKey(str)) {
            ((Stack) map.get(str)).push(str2);
            return;
        }
        Stack stack = new Stack();
        stack.push(str2);
        map.put(str, stack);
    }

    public String toString() {
        String string = "";
        for (b bVar : this.f37913b) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(string);
            stringBuffer.append(bVar);
            stringBuffer.append(RootService.LINE_BREAK);
            string = stringBuffer.toString();
        }
        return string;
    }

    public boolean withinElement() {
        return this.f37912a > 0;
    }
}
