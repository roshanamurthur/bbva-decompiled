package com.wutka.dtd;

import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes7.dex */
public class DTDParser implements EntityExpansion {
    protected Object defaultLocation;
    protected DTD dtd;
    protected Scanner scanner;

    public DTDParser(Reader reader) {
        this.scanner = new Scanner(reader, false, this);
        this.dtd = new DTD();
    }

    @Override // com.wutka.dtd.EntityExpansion
    public DTDEntity expandEntity(String str) {
        return (DTDEntity) this.dtd.entities.get(str);
    }

    public a expect(b bVar) throws IOException {
        a aVarA = this.scanner.a();
        if (aVarA.f68076a == bVar) {
            return aVarA;
        }
        b bVar2 = aVarA.f68076a;
        String str = aVarA.f68077b;
        if (str == null) {
            String str2 = this.scanner.f68062a.f68072a;
            StringBuffer stringBuffer = new StringBuffer("Expected ");
            stringBuffer.append(bVar.f68079b);
            stringBuffer.append(" instead of ");
            stringBuffer.append(bVar2.f68079b);
            String string = stringBuffer.toString();
            Scanner.StreamInfo streamInfo = this.scanner.f68062a;
            throw new DTDParseException(str2, string, streamInfo.f68074c, streamInfo.f68075d);
        }
        String str3 = this.scanner.f68062a.f68072a;
        StringBuffer stringBuffer2 = new StringBuffer("Expected ");
        stringBuffer2.append(bVar.f68079b);
        stringBuffer2.append(" instead of ");
        stringBuffer2.append(bVar2.f68079b);
        stringBuffer2.append("(");
        stringBuffer2.append(str);
        stringBuffer2.append(")");
        String string2 = stringBuffer2.toString();
        Scanner.StreamInfo streamInfo2 = this.scanner.f68062a;
        throw new DTDParseException(str3, string2, streamInfo2.f68074c, streamInfo2.f68075d);
    }

    public DTD parse() throws IOException {
        return parse(false);
    }

    public void parseAttdef(Scanner scanner, DTDElement dTDElement, DTDAttlist dTDAttlist) throws IOException {
        b bVar = Scanner.f68048l;
        a aVarExpect = expect(bVar);
        DTDAttribute dTDAttribute = new DTDAttribute(aVarExpect.f68077b);
        dTDAttlist.attributes.addElement(dTDAttribute);
        dTDElement.attributes.put(aVarExpect.f68077b, dTDAttribute);
        a aVarA = scanner.a();
        b bVar2 = aVarA.f68076a;
        if (bVar2 == bVar) {
            String str = aVarA.f68077b;
            if (str.equals("NOTATION")) {
                dTDAttribute.type = parseNotationList();
            } else {
                dTDAttribute.type = str;
            }
        } else if (bVar2 == Scanner.f68049n) {
            dTDAttribute.type = parseEnumeration();
        }
        a aVarE = scanner.e();
        b bVar3 = aVarE.f68076a;
        String str2 = aVarE.f68077b;
        if (bVar3 != bVar) {
            if (bVar3 == Scanner.f68052q) {
                scanner.a();
                dTDAttribute.decl = DTDDecl.VALUE;
                dTDAttribute.defaultValue = str2;
                return;
            }
            return;
        }
        scanner.a();
        if (str2.equals("#FIXED")) {
            dTDAttribute.decl = DTDDecl.FIXED;
            dTDAttribute.defaultValue = scanner.a().f68077b;
            return;
        }
        if (str2.equals("#REQUIRED")) {
            dTDAttribute.decl = DTDDecl.REQUIRED;
            return;
        }
        if (str2.equals("#IMPLIED")) {
            dTDAttribute.decl = DTDDecl.IMPLIED;
            return;
        }
        String str3 = scanner.f68062a.f68072a;
        StringBuffer stringBuffer = new StringBuffer("Invalid token in attribute declaration: ");
        stringBuffer.append(str2);
        String string = stringBuffer.toString();
        Scanner.StreamInfo streamInfo = scanner.f68062a;
        throw new DTDParseException(str3, string, streamInfo.f68074c, streamInfo.f68075d);
    }

    public void parseAttlist() throws IOException {
        a aVarExpect = expect(Scanner.f68048l);
        DTDElement dTDElement = (DTDElement) this.dtd.elements.get(aVarExpect.f68077b);
        String str = aVarExpect.f68077b;
        DTDAttlist dTDAttlist = new DTDAttlist(str);
        this.dtd.items.addElement(dTDAttlist);
        if (dTDElement == null) {
            dTDElement = new DTDElement(str);
            this.dtd.elements.put(str, dTDElement);
        }
        a aVarE = this.scanner.e();
        while (true) {
            b bVar = aVarE.f68076a;
            b bVar2 = Scanner.f68054s;
            if (bVar == bVar2) {
                expect(bVar2);
                return;
            } else {
                parseAttdef(this.scanner, dTDElement, dTDAttlist);
                aVarE = this.scanner.e();
            }
        }
    }

    public DTDItem parseCP() throws IOException {
        DTDItem choiceSequence;
        a aVarA = this.scanner.a();
        b bVar = aVarA.f68076a;
        if (bVar == Scanner.f68048l) {
            choiceSequence = new DTDName(aVarA.f68077b);
        } else {
            if (bVar != Scanner.f68049n) {
                String str = this.scanner.f68062a.f68072a;
                StringBuffer stringBuffer = new StringBuffer("Found invalid token in sequence: ");
                stringBuffer.append(aVarA.f68076a.f68079b);
                String string = stringBuffer.toString();
                Scanner.StreamInfo streamInfo = this.scanner.f68062a;
                throw new DTDParseException(str, string, streamInfo.f68074c, streamInfo.f68075d);
            }
            choiceSequence = parseChoiceSequence();
        }
        choiceSequence.cardinal = parseCardinality();
        return choiceSequence;
    }

    public DTDCardinal parseCardinality() throws IOException {
        b bVar = this.scanner.e().f68076a;
        if (bVar == Scanner.f68056u) {
            this.scanner.a();
            return DTDCardinal.OPTIONAL;
        }
        if (bVar == Scanner.f68058w) {
            this.scanner.a();
            return DTDCardinal.ZEROMANY;
        }
        if (bVar != Scanner.f68057v) {
            return DTDCardinal.NONE;
        }
        this.scanner.a();
        return DTDCardinal.ONEMANY;
    }

    public void parseChildren(DTDElement dTDElement) throws IOException {
        DTDContainer choiceSequence = parseChoiceSequence();
        a aVarE = this.scanner.e();
        choiceSequence.cardinal = parseCardinality();
        b bVar = aVarE.f68076a;
        if (bVar == Scanner.f68056u) {
            choiceSequence.cardinal = DTDCardinal.OPTIONAL;
        } else if (bVar == Scanner.f68058w) {
            choiceSequence.cardinal = DTDCardinal.ZEROMANY;
        } else if (bVar == Scanner.f68057v) {
            choiceSequence.cardinal = DTDCardinal.ONEMANY;
        } else {
            choiceSequence.cardinal = DTDCardinal.NONE;
        }
        dTDElement.content = choiceSequence;
    }

    public DTDContainer parseChoiceSequence() throws IOException {
        b bVar = null;
        DTDContainer dTDChoice = null;
        while (true) {
            DTDItem cp = parseCP();
            a aVarA = this.scanner.a();
            b bVar2 = aVarA.f68076a;
            b bVar3 = Scanner.f68055t;
            if (bVar2 != bVar3 && bVar2 != Scanner.f68051p) {
                if (bVar2 == Scanner.f68050o) {
                    if (dTDChoice == null) {
                        dTDChoice = new DTDSequence();
                    }
                    dTDChoice.add(cp);
                    return dTDChoice;
                }
                String str = this.scanner.f68062a.f68072a;
                StringBuffer stringBuffer = new StringBuffer("Found invalid token in sequence: ");
                stringBuffer.append(aVarA.f68076a.f68079b);
                String string = stringBuffer.toString();
                Scanner.StreamInfo streamInfo = this.scanner.f68062a;
                throw new DTDParseException(str, string, streamInfo.f68074c, streamInfo.f68075d);
            }
            if (bVar != null && bVar != bVar2) {
                Scanner.StreamInfo streamInfo2 = this.scanner.f68062a;
                throw new DTDParseException(streamInfo2.f68072a, "Can't mix separators in a choice/sequence", streamInfo2.f68074c, streamInfo2.f68075d);
            }
            if (dTDChoice == null) {
                dTDChoice = bVar2 == bVar3 ? new DTDChoice() : new DTDSequence();
            }
            dTDChoice.add(cp);
            bVar = bVar2;
        }
    }

    public void parseContentSpec(Scanner scanner, DTDElement dTDElement) throws IOException {
        a aVarA = scanner.a();
        b bVar = aVarA.f68076a;
        b bVar2 = Scanner.f68048l;
        if (bVar == bVar2) {
            String str = aVarA.f68077b;
            if (str.equals("EMPTY")) {
                dTDElement.content = new DTDEmpty();
                return;
            }
            if (str.equals("ANY")) {
                dTDElement.content = new DTDAny();
                return;
            }
            String str2 = scanner.f68062a.f68072a;
            StringBuffer stringBuffer = new StringBuffer("Invalid token in entity content spec ");
            stringBuffer.append(str);
            String string = stringBuffer.toString();
            Scanner.StreamInfo streamInfo = scanner.f68062a;
            throw new DTDParseException(str2, string, streamInfo.f68074c, streamInfo.f68075d);
        }
        b bVar3 = Scanner.f68049n;
        if (bVar == bVar3) {
            a aVarE = scanner.e();
            b bVar4 = aVarE.f68076a;
            if (bVar4 != bVar2) {
                if (bVar4 == bVar3) {
                    parseChildren(dTDElement);
                }
            } else if (aVarE.f68077b.equals("#PCDATA")) {
                parseMixed(dTDElement);
            } else {
                parseChildren(dTDElement);
            }
        }
    }

    public void parseElement() throws IOException {
        a aVarExpect = expect(Scanner.f68048l);
        DTDElement dTDElement = (DTDElement) this.dtd.elements.get(aVarExpect.f68077b);
        String str = aVarExpect.f68077b;
        if (dTDElement == null) {
            dTDElement = new DTDElement(str);
            this.dtd.elements.put(dTDElement.name, dTDElement);
        } else if (dTDElement.content != null) {
            String str2 = this.scanner.f68062a.f68072a;
            StringBuffer stringBuffer = new StringBuffer("Found second definition of element: ");
            stringBuffer.append(str);
            String string = stringBuffer.toString();
            Scanner.StreamInfo streamInfo = this.scanner.f68062a;
            throw new DTDParseException(str2, string, streamInfo.f68074c, streamInfo.f68075d);
        }
        this.dtd.items.addElement(dTDElement);
        parseContentSpec(this.scanner, dTDElement);
        expect(Scanner.f68054s);
    }

    public void parseEntity() throws IOException {
        boolean z10;
        DTDEntity dTDEntity;
        String str;
        a aVarA = this.scanner.a();
        b bVar = aVarA.f68076a;
        b bVar2 = Scanner.A;
        b bVar3 = Scanner.f68048l;
        boolean z11 = true;
        if (bVar == bVar2) {
            aVarA = expect(bVar3);
            z10 = true;
        } else {
            if (bVar != bVar3) {
                Scanner.StreamInfo streamInfo = this.scanner.f68062a;
                throw new DTDParseException(streamInfo.f68072a, "Invalid entity declaration", streamInfo.f68074c, streamInfo.f68075d);
            }
            z10 = false;
        }
        DTDEntity dTDEntity2 = (DTDEntity) this.dtd.entities.get(aVarA.f68077b);
        String str2 = aVarA.f68077b;
        if (dTDEntity2 == null) {
            dTDEntity = new DTDEntity(str2, this.defaultLocation);
            this.dtd.entities.put(dTDEntity.name, dTDEntity);
            z11 = false;
        } else {
            dTDEntity = new DTDEntity(str2, this.defaultLocation);
        }
        this.dtd.items.addElement(dTDEntity);
        dTDEntity.isParsed = z10;
        parseEntityDef(dTDEntity);
        if (!dTDEntity.isParsed || (str = dTDEntity.value) == null || z11) {
            return;
        }
        Scanner scanner = this.scanner;
        String str3 = dTDEntity.name;
        Hashtable hashtable = scanner.f68070i;
        StringBuffer stringBuffer = new StringBuffer("%");
        stringBuffer.append(str3);
        stringBuffer.append(ReplenishLogic.ID_SEPARATOR);
        hashtable.put(stringBuffer.toString(), str);
    }

    public void parseEntityDef(DTDEntity dTDEntity) throws IOException {
        a aVarA = this.scanner.a();
        b bVar = aVarA.f68076a;
        b bVar2 = Scanner.f68052q;
        String str = aVarA.f68077b;
        if (bVar != bVar2) {
            b bVar3 = Scanner.f68048l;
            if (bVar != bVar3) {
                Scanner.StreamInfo streamInfo = this.scanner.f68062a;
                throw new DTDParseException(streamInfo.f68072a, "Invalid entity definition", streamInfo.f68074c, streamInfo.f68075d);
            }
            if (str.equals("SYSTEM")) {
                DTDSystem dTDSystem = new DTDSystem();
                dTDSystem.system = expect(bVar2).f68077b;
                dTDEntity.externalID = dTDSystem;
            } else {
                if (!str.equals("PUBLIC")) {
                    Scanner.StreamInfo streamInfo2 = this.scanner.f68062a;
                    throw new DTDParseException(streamInfo2.f68072a, "Invalid External ID specification", streamInfo2.f68074c, streamInfo2.f68075d);
                }
                DTDPublic dTDPublic = new DTDPublic();
                dTDPublic.pub = expect(bVar2).f68077b;
                dTDPublic.system = expect(bVar2).f68077b;
                dTDEntity.externalID = dTDPublic;
            }
            if (!dTDEntity.isParsed) {
                a aVarE = this.scanner.e();
                if (aVarE.f68076a == bVar3) {
                    if (!aVarE.f68077b.equals("NDATA")) {
                        Scanner.StreamInfo streamInfo3 = this.scanner.f68062a;
                        throw new DTDParseException(streamInfo3.f68072a, "Invalid NData declaration", streamInfo3.f68074c, streamInfo3.f68075d);
                    }
                    this.scanner.a();
                    dTDEntity.ndata = expect(bVar3).f68077b;
                }
            }
        } else if (dTDEntity.value == null) {
            dTDEntity.value = str;
        }
        expect(Scanner.f68054s);
    }

    public DTDEnumeration parseEnumeration() throws IOException {
        DTDEnumeration dTDEnumeration = new DTDEnumeration();
        while (true) {
            a aVarA = this.scanner.a();
            b bVar = aVarA.f68076a;
            if (bVar != Scanner.f68048l && bVar != Scanner.D) {
                String str = this.scanner.f68062a.f68072a;
                StringBuffer stringBuffer = new StringBuffer("Invalid token in enumeration: ");
                stringBuffer.append(aVarA.f68076a.f68079b);
                String string = stringBuffer.toString();
                Scanner.StreamInfo streamInfo = this.scanner.f68062a;
                throw new DTDParseException(str, string, streamInfo.f68074c, streamInfo.f68075d);
            }
            dTDEnumeration.add(aVarA.f68077b);
            a aVarE = this.scanner.e();
            b bVar2 = aVarE.f68076a;
            if (bVar2 == Scanner.f68050o) {
                this.scanner.a();
                return dTDEnumeration;
            }
            if (bVar2 != Scanner.f68055t) {
                String str2 = this.scanner.f68062a.f68072a;
                StringBuffer stringBuffer2 = new StringBuffer("Invalid token in enumeration: ");
                stringBuffer2.append(aVarE.f68076a.f68079b);
                String string2 = stringBuffer2.toString();
                Scanner.StreamInfo streamInfo2 = this.scanner.f68062a;
                throw new DTDParseException(str2, string2, streamInfo2.f68074c, streamInfo2.f68075d);
            }
            this.scanner.a();
        }
    }

    public void parseMixed(DTDElement dTDElement) throws IOException {
        DTDMixed dTDMixed = new DTDMixed();
        dTDMixed.add(new DTDPCData());
        this.scanner.a();
        dTDElement.content = dTDMixed;
        boolean z10 = true;
        while (true) {
            a aVarA = this.scanner.a();
            b bVar = aVarA.f68076a;
            if (bVar == Scanner.f68050o) {
                a aVarE = this.scanner.e();
                if (aVarE.f68076a == Scanner.f68058w) {
                    this.scanner.a();
                    dTDMixed.cardinal = DTDCardinal.ZEROMANY;
                    return;
                } else {
                    if (z10) {
                        dTDMixed.cardinal = DTDCardinal.NONE;
                        return;
                    }
                    String str = this.scanner.f68062a.f68072a;
                    StringBuffer stringBuffer = new StringBuffer("Invalid token in Mixed content type, '*' required after (#PCDATA|xx ...): ");
                    stringBuffer.append(aVarE.f68076a.f68079b);
                    String string = stringBuffer.toString();
                    Scanner.StreamInfo streamInfo = this.scanner.f68062a;
                    throw new DTDParseException(str, string, streamInfo.f68074c, streamInfo.f68075d);
                }
            }
            if (bVar != Scanner.f68055t) {
                String str2 = this.scanner.f68062a.f68072a;
                StringBuffer stringBuffer2 = new StringBuffer("Invalid token in Mixed content type: ");
                stringBuffer2.append(aVarA.f68076a.f68079b);
                String string2 = stringBuffer2.toString();
                Scanner.StreamInfo streamInfo2 = this.scanner.f68062a;
                throw new DTDParseException(str2, string2, streamInfo2.f68074c, streamInfo2.f68075d);
            }
            dTDMixed.add(new DTDName(this.scanner.a().f68077b));
            z10 = false;
        }
    }

    public void parseNotation() throws IOException {
        DTDNotation dTDNotation = new DTDNotation();
        b bVar = Scanner.f68048l;
        String str = expect(bVar).f68077b;
        dTDNotation.name = str;
        this.dtd.notations.put(str, dTDNotation);
        this.dtd.items.addElement(dTDNotation);
        a aVarExpect = expect(bVar);
        boolean zEquals = aVarExpect.f68077b.equals("SYSTEM");
        b bVar2 = Scanner.f68052q;
        if (zEquals) {
            DTDSystem dTDSystem = new DTDSystem();
            dTDSystem.system = expect(bVar2).f68077b;
            dTDNotation.externalID = dTDSystem;
        } else if (aVarExpect.f68077b.equals("PUBLIC")) {
            DTDPublic dTDPublic = new DTDPublic();
            dTDPublic.pub = expect(bVar2).f68077b;
            dTDPublic.system = null;
            if (this.scanner.e().f68076a == bVar2) {
                dTDPublic.system = this.scanner.a().f68077b;
            }
            dTDNotation.externalID = dTDPublic;
        }
        expect(Scanner.f68054s);
    }

    public DTDNotationList parseNotationList() throws IOException {
        DTDNotationList dTDNotationList = new DTDNotationList();
        a aVarA = this.scanner.a();
        if (aVarA.f68076a != Scanner.f68049n) {
            String str = this.scanner.f68062a.f68072a;
            StringBuffer stringBuffer = new StringBuffer("Invalid token in notation: ");
            stringBuffer.append(aVarA.f68076a.f68079b);
            String string = stringBuffer.toString();
            Scanner.StreamInfo streamInfo = this.scanner.f68062a;
            throw new DTDParseException(str, string, streamInfo.f68074c, streamInfo.f68075d);
        }
        while (true) {
            a aVarA2 = this.scanner.a();
            if (aVarA2.f68076a != Scanner.f68048l) {
                String str2 = this.scanner.f68062a.f68072a;
                StringBuffer stringBuffer2 = new StringBuffer("Invalid token in notation: ");
                stringBuffer2.append(aVarA2.f68076a.f68079b);
                String string2 = stringBuffer2.toString();
                Scanner.StreamInfo streamInfo2 = this.scanner.f68062a;
                throw new DTDParseException(str2, string2, streamInfo2.f68074c, streamInfo2.f68075d);
            }
            dTDNotationList.add(aVarA2.f68077b);
            a aVarE = this.scanner.e();
            b bVar = aVarE.f68076a;
            if (bVar == Scanner.f68050o) {
                this.scanner.a();
                return dTDNotationList;
            }
            if (bVar != Scanner.f68055t) {
                String str3 = this.scanner.f68062a.f68072a;
                StringBuffer stringBuffer3 = new StringBuffer("Invalid token in notation: ");
                stringBuffer3.append(aVarE.f68076a.f68079b);
                String string3 = stringBuffer3.toString();
                Scanner.StreamInfo streamInfo3 = this.scanner.f68062a;
                throw new DTDParseException(str3, string3, streamInfo3.f68074c, streamInfo3.f68075d);
            }
            this.scanner.a();
        }
    }

    public void parseTopLevelElement() throws IOException {
        int iG;
        String string;
        a aVarA = this.scanner.a();
        b bVar = aVarA.f68076a;
        b bVar2 = Scanner.f68047k;
        b bVar3 = Scanner.f68054s;
        if (bVar == bVar2) {
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                Scanner scanner = this.scanner;
                StringBuffer stringBuffer2 = new StringBuffer();
                while (true) {
                    int iG2 = scanner.g();
                    if (iG2 < 0) {
                        string = stringBuffer2.toString();
                        break;
                    } else {
                        if (iG2 == 63) {
                            string = stringBuffer2.toString();
                            break;
                        }
                        stringBuffer2.append((char) iG2);
                    }
                }
                stringBuffer.append(string);
                if (this.scanner.e().f68076a == bVar3) {
                    this.scanner.a();
                    this.dtd.items.addElement(new DTDProcessingInstruction(stringBuffer.toString()));
                    return;
                }
                stringBuffer.append('?');
            }
        } else {
            b bVar4 = Scanner.B;
            b bVar5 = Scanner.f68048l;
            if (bVar != bVar4) {
                if (bVar == Scanner.C) {
                    return;
                }
                b bVar6 = Scanner.f68061z;
                String str = aVarA.f68077b;
                if (bVar == bVar6) {
                    this.dtd.items.addElement(new DTDComment(str));
                    return;
                }
                if (bVar != Scanner.f68053r) {
                    String str2 = this.scanner.f68062a.f68072a;
                    StringBuffer stringBuffer3 = new StringBuffer("Unexpected token: ");
                    stringBuffer3.append(aVarA.f68076a.f68079b);
                    stringBuffer3.append("(");
                    stringBuffer3.append(str);
                    stringBuffer3.append(")");
                    String string2 = stringBuffer3.toString();
                    Scanner.StreamInfo streamInfo = this.scanner.f68062a;
                    throw new DTDParseException(str2, string2, streamInfo.f68074c, streamInfo.f68075d);
                }
                a aVarExpect = expect(bVar5);
                if (aVarExpect.f68077b.equals("ELEMENT")) {
                    parseElement();
                    return;
                }
                String str3 = aVarExpect.f68077b;
                if (str3.equals("ATTLIST")) {
                    parseAttlist();
                    return;
                }
                if (str3.equals("ENTITY")) {
                    parseEntity();
                    return;
                } else if (str3.equals("NOTATION")) {
                    parseNotation();
                    return;
                } else {
                    skipUntil(bVar3);
                    return;
                }
            }
            a aVarExpect2 = expect(bVar5);
            if (!aVarExpect2.f68077b.equals("IGNORE")) {
                String str4 = aVarExpect2.f68077b;
                if (str4.equals("INCLUDE")) {
                    Scanner scanner2 = this.scanner;
                    do {
                        iG = scanner2.g();
                        if (iG < 0) {
                            return;
                        }
                    } while (iG != 91);
                    return;
                }
                String str5 = this.scanner.f68062a.f68072a;
                StringBuffer stringBuffer4 = new StringBuffer("Invalid token in conditional: ");
                stringBuffer4.append(str4);
                String string3 = stringBuffer4.toString();
                Scanner.StreamInfo streamInfo2 = this.scanner.f68062a;
                throw new DTDParseException(str5, string3, streamInfo2.f68074c, streamInfo2.f68075d);
            }
            Scanner scanner3 = this.scanner;
            scanner3.getClass();
            int iG3 = 0;
            int i10 = 0;
            while (true) {
                if (iG3 != 93) {
                    iG3 = scanner3.g();
                }
                if (iG3 == 93 && (iG3 = scanner3.g()) == 93 && (iG3 = scanner3.g()) == 62) {
                    if (i10 == 0) {
                        return;
                    } else {
                        i10--;
                    }
                }
                if (iG3 == 60 && (iG3 = scanner3.g()) == 33 && (iG3 = scanner3.g()) == 91) {
                    i10++;
                }
            }
        }
    }

    public void removeElements(Hashtable hashtable, DTD dtd, DTDItem dTDItem) {
        if (dTDItem instanceof DTDName) {
            hashtable.remove(((DTDName) dTDItem).value);
        } else if (dTDItem instanceof DTDContainer) {
            Enumeration enumerationElements = ((DTDContainer) dTDItem).getItemsVec().elements();
            while (enumerationElements.hasMoreElements()) {
                removeElements(hashtable, dtd, (DTDItem) enumerationElements.nextElement());
            }
        }
    }

    public void skipUntil(b bVar) throws IOException {
        a aVarA = this.scanner.a();
        while (aVarA.f68076a != bVar) {
            aVarA = this.scanner.a();
        }
    }

    public DTD parse(boolean z10) throws IOException {
        while (this.scanner.e().f68076a != Scanner.f68060y) {
            parseTopLevelElement();
        }
        if (z10) {
            Hashtable hashtable = new Hashtable();
            Enumeration enumerationElements = this.dtd.elements.elements();
            while (enumerationElements.hasMoreElements()) {
                DTDElement dTDElement = (DTDElement) enumerationElements.nextElement();
                hashtable.put(dTDElement.name, dTDElement);
            }
            Enumeration enumerationElements2 = this.dtd.elements.elements();
            while (enumerationElements2.hasMoreElements()) {
                DTDItem dTDItem = ((DTDElement) enumerationElements2.nextElement()).content;
                if (dTDItem instanceof DTDContainer) {
                    Enumeration enumerationElements3 = ((DTDContainer) dTDItem).getItemsVec().elements();
                    while (enumerationElements3.hasMoreElements()) {
                        removeElements(hashtable, this.dtd, (DTDItem) enumerationElements3.nextElement());
                    }
                }
            }
            if (hashtable.size() == 1) {
                Enumeration enumerationElements4 = hashtable.elements();
                this.dtd.rootElement = (DTDElement) enumerationElements4.nextElement();
            } else {
                this.dtd.rootElement = null;
            }
        } else {
            this.dtd.rootElement = null;
        }
        return this.dtd;
    }

    public DTDParser(Reader reader, boolean z10) {
        this.scanner = new Scanner(reader, z10, this);
        this.dtd = new DTD();
    }

    public DTDParser(File file) throws IOException {
        this.defaultLocation = file.getParentFile();
        this.scanner = new Scanner(new BufferedReader(new FileReader(file)), false, this);
        this.dtd = new DTD();
    }

    public DTDParser(File file, boolean z10) throws IOException {
        this.defaultLocation = file.getParentFile();
        this.scanner = new Scanner(new BufferedReader(new FileReader(file)), z10, this);
        this.dtd = new DTD();
    }

    public DTDParser(URL url) throws IOException {
        String file = url.getFile();
        this.defaultLocation = new URL(url.getProtocol(), url.getHost(), url.getPort(), file.substring(0, file.lastIndexOf(47) + 1));
        this.scanner = new Scanner(new BufferedReader(new InputStreamReader(url.openStream())), false, this);
        this.dtd = new DTD();
    }

    public DTDParser(URL url, boolean z10) throws IOException {
        String file = url.getFile();
        this.defaultLocation = new URL(url.getProtocol(), url.getHost(), url.getPort(), file.substring(0, file.lastIndexOf(47) + 1));
        this.scanner = new Scanner(new BufferedReader(new InputStreamReader(url.openStream())), z10, this);
        this.dtd = new DTD();
    }
}
